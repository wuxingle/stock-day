package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay0001;
import com.stock.stockday.entity.StockDay001;
import com.stock.stockday.entity.StockDay0021;
import com.stock.stockday.mapper.StockDay0001Mapper;
import com.stock.stockday.mapper.StockDay0021Mapper;
import com.stock.stockday.service.StockDay0001Service;
import com.stock.stockday.service.StockDay0021Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDay0021ServiceImpl extends ServiceImpl<StockDay0021Mapper, StockDay0021> implements StockDay0021Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public List<StockDay0021> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }
    @Override
    public List<StockDay0021> selectByCodeAndExPage(Page<StockDay0021> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDay0021> stockDay0021List = (List<StockDay0021>) redisTemplate.opsForValue().get(codeEx+codeId);
        if (stockDay0021List==null||stockDay0021List.size()==0){
            stockDay0021List=baseMapper.selectByCodeAndExPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(codeEx+codeId, stockDay0021List);
        }
        return stockDay0021List;
    }
}
