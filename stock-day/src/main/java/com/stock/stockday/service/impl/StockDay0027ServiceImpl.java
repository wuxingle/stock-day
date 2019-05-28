package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay001;
import com.stock.stockday.entity.StockDay0027;
import com.stock.stockday.mapper.StockDay0027Mapper;
import com.stock.stockday.service.StockDay0027Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDay0027ServiceImpl extends ServiceImpl<StockDay0027Mapper, StockDay0027> implements StockDay0027Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public List<StockDay0027> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }
    @Override
    public List<StockDay0027> selectByCodeAndExPage(Page<StockDay0027> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDay0027> stockDay0027List = (List<StockDay0027>) redisTemplate.opsForValue().get(codeEx+codeId);
        if (stockDay0027List==null||stockDay0027List.size()==0){
            stockDay0027List=baseMapper.selectByCodeAndExPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(codeEx+codeId, stockDay0027List);
        }
        return stockDay0027List;
    }
}
