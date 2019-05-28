package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay0001;
import com.stock.stockday.mapper.StockDay0001Mapper;
import com.stock.stockday.service.StockDay0001Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDay0001ServiceImpl extends ServiceImpl<StockDay0001Mapper, StockDay0001> implements StockDay0001Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public List<StockDay0001> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }
    @Override
    public List<StockDay0001> selectByCodeAndExPage(Page<StockDay0001> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDay0001> stockDay0001List = (List<StockDay0001>) redisTemplate.opsForValue().get(codeEx+codeId);
        if (stockDay0001List==null||stockDay0001List.size()==0){
            stockDay0001List=baseMapper.selectByCodeAndExPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(codeEx+codeId, stockDay0001List);
        }
        return stockDay0001List;
    }
}
