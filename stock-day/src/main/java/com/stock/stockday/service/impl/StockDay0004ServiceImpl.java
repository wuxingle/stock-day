package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay0004;
import com.stock.stockday.entity.StockDay001;
import com.stock.stockday.mapper.StockDay0004Mapper;
import com.stock.stockday.service.StockDay0004Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDay0004ServiceImpl extends ServiceImpl<StockDay0004Mapper,StockDay0004> implements StockDay0004Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public List<StockDay0004> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }
    @Override
    public List<StockDay0004> selectByCodeAndExPage(Page<StockDay0004> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDay0004> stockDay0004List = (List<StockDay0004>) redisTemplate.opsForValue().get(codeEx+codeId);
        if (stockDay0004List==null||stockDay0004List.size()==0){
            stockDay0004List=baseMapper.selectByCodeAndExPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(codeEx+codeId, stockDay0004List);
        }
        return stockDay0004List;
    }
}
