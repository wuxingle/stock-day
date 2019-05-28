package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay0001;
import com.stock.stockday.entity.StockDay001;
import com.stock.stockday.entity.StockDay3004;
import com.stock.stockday.mapper.StockDay0001Mapper;
import com.stock.stockday.mapper.StockDay3004Mapper;
import com.stock.stockday.service.StockDay0001Service;
import com.stock.stockday.service.StockDay3004Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDay3004ServiceImpl extends ServiceImpl<StockDay3004Mapper, StockDay3004> implements StockDay3004Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public List<StockDay3004> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }
    @Override
    public List<StockDay3004> selectByCodeAndExPage(Page<StockDay3004> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDay3004> stockDay3004List = (List<StockDay3004>) redisTemplate.opsForValue().get(codeEx+codeId);
        if (stockDay3004List==null||stockDay3004List.size()==0){
            stockDay3004List=baseMapper.selectByCodeAndExPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(codeEx+codeId, stockDay3004List);
        }
        return stockDay3004List;
    }
}
