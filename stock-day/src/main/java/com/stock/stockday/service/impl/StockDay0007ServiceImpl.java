package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay0001;
import com.stock.stockday.entity.StockDay0007;
import com.stock.stockday.entity.StockDay001;
import com.stock.stockday.mapper.StockDay0001Mapper;
import com.stock.stockday.mapper.StockDay0007Mapper;
import com.stock.stockday.service.StockDay0001Service;
import com.stock.stockday.service.StockDay0007Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDay0007ServiceImpl extends ServiceImpl<StockDay0007Mapper, StockDay0007> implements StockDay0007Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public List<StockDay0007> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }
    @Override
    public List<StockDay0007> selectByCodeAndExPage(Page<StockDay0007> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDay0007> stockDay0007List = (List<StockDay0007>) redisTemplate.opsForValue().get(codeEx+codeId);
        if (stockDay0007List==null||stockDay0007List.size()==0){
            stockDay0007List=baseMapper.selectByCodeAndExPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(codeEx+codeId, stockDay0007List);
        }
        return stockDay0007List;
    }
}
