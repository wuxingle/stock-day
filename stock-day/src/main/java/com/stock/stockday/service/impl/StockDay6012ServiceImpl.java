package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay001;
import com.stock.stockday.entity.StockDay6012;
import com.stock.stockday.mapper.StockDay6012Mapper;
import com.stock.stockday.service.StockDay6012Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDay6012ServiceImpl extends ServiceImpl<StockDay6012Mapper, StockDay6012> implements StockDay6012Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public List<StockDay6012> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }
    @Override
    public List<StockDay6012> selectByCodeAndExPage(Page<StockDay6012> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDay6012> stockDay6012List = (List<StockDay6012>) redisTemplate.opsForValue().get(codeEx+codeId);
        if (stockDay6012List==null||stockDay6012List.size()==0){
            stockDay6012List=baseMapper.selectByCodeAndExPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(codeEx+codeId, stockDay6012List);
        }
        return stockDay6012List;
    }
}
