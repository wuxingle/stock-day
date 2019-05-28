package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay001;
import com.stock.stockday.entity.StockDay0020;
import com.stock.stockday.mapper.StockDay0020Mapper;
import com.stock.stockday.service.StockDay0020Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDay0020ServiceImpl extends ServiceImpl<StockDay0020Mapper, StockDay0020> implements StockDay0020Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public List<StockDay0020> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }
    @Override
    public List<StockDay0020> selectByCodeAndExPage(Page<StockDay0020> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDay0020> stockDay0020List = (List<StockDay0020>) redisTemplate.opsForValue().get(codeEx+codeId);
        if (stockDay0020List==null||stockDay0020List.size()==0){
            stockDay0020List=baseMapper.selectByCodeAndExPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(codeEx+codeId, stockDay0020List);
        }
        return stockDay0020List;
    }
}
