package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay001;
import com.stock.stockday.entity.StockDay603;
import com.stock.stockday.mapper.StockDay603Mapper;
import com.stock.stockday.service.StockDay603Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDay603ServiceImpl extends ServiceImpl<StockDay603Mapper, StockDay603> implements StockDay603Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public List<StockDay603> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }
    @Override
    public List<StockDay603> selectByCodeAndExPage(Page<StockDay603> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDay603> stockDay603List = (List<StockDay603>) redisTemplate.opsForValue().get(codeEx+codeId);
        if (stockDay603List==null||stockDay603List.size()==0){
            stockDay603List=baseMapper.selectByCodeAndExPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(codeEx+codeId, stockDay603List);
        }
        return stockDay603List;
    }
}
