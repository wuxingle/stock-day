package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay001;
import com.stock.stockday.entity.StockDay6011;
import com.stock.stockday.mapper.StockDay6011Mapper;
import com.stock.stockday.service.StockDay6011Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDay6011ServiceImpl extends ServiceImpl<StockDay6011Mapper, StockDay6011> implements StockDay6011Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public List<StockDay6011> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }
    @Override
    public List<StockDay6011> selectByCodeAndExPage(Page<StockDay6011> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDay6011> stockDay6011List = (List<StockDay6011>) redisTemplate.opsForValue().get(codeEx+codeId);
        if (stockDay6011List==null||stockDay6011List.size()==0){
            stockDay6011List=baseMapper.selectByCodeAndExPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(codeEx+codeId, stockDay6011List);
        }
        return stockDay6011List;
    }
}
