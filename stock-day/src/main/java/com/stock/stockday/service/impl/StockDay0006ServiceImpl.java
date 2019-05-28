package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay0006;
import com.stock.stockday.entity.StockDay001;
import com.stock.stockday.mapper.StockDay0006Mapper;
import com.stock.stockday.service.StockDay0006Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDay0006ServiceImpl extends ServiceImpl<StockDay0006Mapper, StockDay0006> implements StockDay0006Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public List<StockDay0006> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }
    @Override
    public List<StockDay0006> selectByCodeAndExPage(Page<StockDay0006> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDay0006> stockDay0006List = (List<StockDay0006>) redisTemplate.opsForValue().get(codeEx+codeId);
        if (stockDay0006List==null||stockDay0006List.size()==0){
            stockDay0006List=baseMapper.selectByCodeAndExPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(codeEx+codeId, stockDay0006List);
        }
        return stockDay0006List;
    }
}
