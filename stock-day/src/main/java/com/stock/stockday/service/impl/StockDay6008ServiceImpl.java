package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay001;
import com.stock.stockday.entity.StockDay6008;
import com.stock.stockday.mapper.StockDay6008Mapper;
import com.stock.stockday.service.StockDay6008Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDay6008ServiceImpl extends ServiceImpl<StockDay6008Mapper, StockDay6008> implements StockDay6008Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public List<StockDay6008> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }
    @Override
    public List<StockDay6008> selectByCodeAndExPage(Page<StockDay6008> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDay6008> stockDay6008List = (List<StockDay6008>) redisTemplate.opsForValue().get(codeEx+codeId);
        if (stockDay6008List==null||stockDay6008List.size()==0){
            stockDay6008List=baseMapper.selectByCodeAndExPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(codeEx+codeId, stockDay6008List);
        }
        return stockDay6008List;
    }
}
