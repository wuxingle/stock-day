package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay0001;
import com.stock.stockday.entity.StockDay001;
import com.stock.stockday.entity.StockDay399;
import com.stock.stockday.mapper.StockDay0001Mapper;
import com.stock.stockday.mapper.StockDay399Mapper;
import com.stock.stockday.service.StockDay0001Service;
import com.stock.stockday.service.StockDay399Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDay399ServiceImpl extends ServiceImpl<StockDay399Mapper, StockDay399> implements StockDay399Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public List<StockDay399> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }
    @Override
    public List<StockDay399> selectByCodeAndExPage(Page<StockDay399> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDay399> stockDay399List = (List<StockDay399>) redisTemplate.opsForValue().get(codeEx+codeId);
        if (stockDay399List==null||stockDay399List.size()==0){
            stockDay399List=baseMapper.selectByCodeAndExPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(codeEx+codeId, stockDay399List);
        }
        return stockDay399List;
    }
}
