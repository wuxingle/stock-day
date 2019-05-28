package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay001;
import com.stock.stockday.entity.StockDay0024;
import com.stock.stockday.mapper.StockDay0024Mapper;
import com.stock.stockday.service.StockDay0024Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDay0024ServiceImpl extends ServiceImpl<StockDay0024Mapper, StockDay0024> implements StockDay0024Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public List<StockDay0024> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }
    @Override
    public List<StockDay0024> selectByCodeAndExPage(Page<StockDay0024> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDay0024> stockDay0024List = (List<StockDay0024>) redisTemplate.opsForValue().get(codeEx+codeId);
        if (stockDay0024List==null||stockDay0024List.size()==0){
            stockDay0024List=baseMapper.selectByCodeAndExPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(codeEx+codeId, stockDay0024List);
        }
        return stockDay0024List;
    }
}
