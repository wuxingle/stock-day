package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay001;
import com.stock.stockday.entity.StockDay0022;
import com.stock.stockday.mapper.StockDay0022Mapper;
import com.stock.stockday.service.StockDay0022Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDay0022ServiceImpl extends ServiceImpl<StockDay0022Mapper, StockDay0022> implements StockDay0022Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public List<StockDay0022> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }
    @Override
    public List<StockDay0022> selectByCodeAndExPage(Page<StockDay0022> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDay0022> stockDay0022List = (List<StockDay0022>) redisTemplate.opsForValue().get(codeEx+codeId);
        if (stockDay0022List==null||stockDay0022List.size()==0){
            stockDay0022List=baseMapper.selectByCodeAndExPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(codeEx+codeId, stockDay0022List);
        }
        return stockDay0022List;
    }
}
