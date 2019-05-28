package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay0001;
import com.stock.stockday.entity.StockDay001;
import com.stock.stockday.entity.StockDay3005;
import com.stock.stockday.mapper.StockDay0001Mapper;
import com.stock.stockday.mapper.StockDay3005Mapper;
import com.stock.stockday.service.StockDay0001Service;
import com.stock.stockday.service.StockDay3005Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDay3005ServiceImpl extends ServiceImpl<StockDay3005Mapper, StockDay3005> implements StockDay3005Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public List<StockDay3005> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }
    @Override
    public List<StockDay3005> selectByCodeAndExPage(Page<StockDay3005> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDay3005> stockDay3005List = (List<StockDay3005>) redisTemplate.opsForValue().get(codeEx+codeId);
        if (stockDay3005List==null||stockDay3005List.size()==0){
            stockDay3005List=baseMapper.selectByCodeAndExPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(codeEx+codeId, stockDay3005List);
        }
        return stockDay3005List;
    }
}
