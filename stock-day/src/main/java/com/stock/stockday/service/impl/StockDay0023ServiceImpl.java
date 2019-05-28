package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay001;
import com.stock.stockday.entity.StockDay0023;
import com.stock.stockday.mapper.StockDay0023Mapper;
import com.stock.stockday.service.StockDay0023Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDay0023ServiceImpl extends ServiceImpl<StockDay0023Mapper, StockDay0023> implements StockDay0023Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public List<StockDay0023> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }
    @Override
    public List<StockDay0023> selectByCodeAndExPage(Page<StockDay0023> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDay0023> stockDay0023List = (List<StockDay0023>) redisTemplate.opsForValue().get(codeEx+codeId);
        if (stockDay0023List==null||stockDay0023List.size()==0){
            stockDay0023List=baseMapper.selectByCodeAndExPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(codeEx+codeId, stockDay0023List);
        }
        return stockDay0023List;
    }
}
