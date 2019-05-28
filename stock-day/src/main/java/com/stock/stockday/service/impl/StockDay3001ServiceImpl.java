package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay0001;
import com.stock.stockday.entity.StockDay001;
import com.stock.stockday.entity.StockDay3001;
import com.stock.stockday.mapper.StockDay0001Mapper;
import com.stock.stockday.mapper.StockDay3001Mapper;
import com.stock.stockday.service.StockDay0001Service;
import com.stock.stockday.service.StockDay3001Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDay3001ServiceImpl extends ServiceImpl<StockDay3001Mapper, StockDay3001> implements StockDay3001Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public List<StockDay3001> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }
    @Override
    public List<StockDay3001> selectByCodeAndExPage(Page<StockDay3001> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDay3001> stockDay3001List = (List<StockDay3001>) redisTemplate.opsForValue().get(codeEx+codeId);
        if (stockDay3001List==null||stockDay3001List.size()==0){
            stockDay3001List=baseMapper.selectByCodeAndExPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(codeEx+codeId, stockDay3001List);
        }
        return stockDay3001List;
    }
}
