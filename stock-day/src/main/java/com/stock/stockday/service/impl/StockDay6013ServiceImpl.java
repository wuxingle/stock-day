package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay001;
import com.stock.stockday.entity.StockDay6013;
import com.stock.stockday.mapper.StockDay6013Mapper;
import com.stock.stockday.service.StockDay6013Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDay6013ServiceImpl extends ServiceImpl<StockDay6013Mapper, StockDay6013> implements StockDay6013Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public List<StockDay6013> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }
    @Override
    public List<StockDay6013> selectByCodeAndExPage(Page<StockDay6013> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDay6013> stockDay6013List = (List<StockDay6013>) redisTemplate.opsForValue().get(codeEx+codeId);
        if (stockDay6013List==null||stockDay6013List.size()==0){
            stockDay6013List=baseMapper.selectByCodeAndExPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(codeEx+codeId, stockDay6013List);
        }
        return stockDay6013List;
    }
}
