package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay001;
import com.stock.stockday.entity.StockDay6014;
import com.stock.stockday.mapper.StockDay6014Mapper;
import com.stock.stockday.service.StockDay6014Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDay6014ServiceImpl extends ServiceImpl<StockDay6014Mapper, StockDay6014> implements StockDay6014Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public List<StockDay6014> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }
    @Override
    public List<StockDay6014> selectByCodeAndExPage(Page<StockDay6014> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDay6014> stockDay6014List = (List<StockDay6014>) redisTemplate.opsForValue().get(codeEx+codeId);
        if (stockDay6014List==null||stockDay6014List.size()==0){
            stockDay6014List=baseMapper.selectByCodeAndExPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(codeEx+codeId, stockDay6014List);
        }
        return stockDay6014List;
    }
}
