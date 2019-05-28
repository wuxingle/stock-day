package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay001;
import com.stock.stockday.entity.StockDay6019;
import com.stock.stockday.mapper.StockDay6019Mapper;
import com.stock.stockday.service.StockDay6019Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDay6019ServiceImpl extends ServiceImpl<StockDay6019Mapper, StockDay6019> implements StockDay6019Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public List<StockDay6019> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }
    @Override
    public List<StockDay6019> selectByCodeAndExPage(Page<StockDay6019> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDay6019> stockDay6019List = (List<StockDay6019>) redisTemplate.opsForValue().get(codeEx+codeId);
        if (stockDay6019List==null||stockDay6019List.size()==0){
            stockDay6019List=baseMapper.selectByCodeAndExPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(codeEx+codeId, stockDay6019List);
        }
        return stockDay6019List;
    }
}
