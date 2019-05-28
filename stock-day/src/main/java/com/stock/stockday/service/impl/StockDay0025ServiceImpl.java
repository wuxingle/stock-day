package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay001;
import com.stock.stockday.entity.StockDay0025;
import com.stock.stockday.mapper.StockDay0025Mapper;
import com.stock.stockday.service.StockDay0025Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDay0025ServiceImpl extends ServiceImpl<StockDay0025Mapper, StockDay0025> implements StockDay0025Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public List<StockDay0025> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }
    @Override
    public List<StockDay0025> selectByCodeAndExPage(Page<StockDay0025> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDay0025> stockDay0025List = (List<StockDay0025>) redisTemplate.opsForValue().get(codeEx+codeId);
        if (stockDay0025List==null||stockDay0025List.size()==0){
            stockDay0025List=baseMapper.selectByCodeAndExPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(codeEx+codeId, stockDay0025List);
        }
        return stockDay0025List;
    }
}
