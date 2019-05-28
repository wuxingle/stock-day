package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay0001;
import com.stock.stockday.entity.StockDay001;
import com.stock.stockday.entity.StockDay3003;
import com.stock.stockday.mapper.StockDay0001Mapper;
import com.stock.stockday.mapper.StockDay3003Mapper;
import com.stock.stockday.service.StockDay0001Service;
import com.stock.stockday.service.StockDay3003Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDay3003ServiceImpl extends ServiceImpl<StockDay3003Mapper, StockDay3003> implements StockDay3003Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public List<StockDay3003> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }
    @Override
    public List<StockDay3003> selectByCodeAndExPage(Page<StockDay3003> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDay3003> stockDay3003List = (List<StockDay3003>) redisTemplate.opsForValue().get(codeEx+codeId);
        if (stockDay3003List==null||stockDay3003List.size()==0){
            stockDay3003List=baseMapper.selectByCodeAndExPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(codeEx+codeId, stockDay3003List);
        }
        return stockDay3003List;
    }
}
