package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay001;
import com.stock.stockday.entity.StockDay6017;
import com.stock.stockday.mapper.StockDay6017Mapper;
import com.stock.stockday.service.StockDay6017Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDay6017ServiceImpl extends ServiceImpl<StockDay6017Mapper, StockDay6017> implements StockDay6017Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public List<StockDay6017> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }
    @Override
    public List<StockDay6017> selectByCodeAndExPage(Page<StockDay6017> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDay6017> stockDay6017List = (List<StockDay6017>) redisTemplate.opsForValue().get(codeEx+codeId);
        if (stockDay6017List==null||stockDay6017List.size()==0){
            stockDay6017List=baseMapper.selectByCodeAndExPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(codeEx+codeId, stockDay6017List);
        }
        return stockDay6017List;
    }
}
