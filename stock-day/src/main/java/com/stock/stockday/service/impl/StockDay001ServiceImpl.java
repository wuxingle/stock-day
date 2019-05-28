package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay001;
import com.stock.stockday.mapper.StockDay001Mapper;
import com.stock.stockday.service.StockDay001Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDay001ServiceImpl extends ServiceImpl<StockDay001Mapper, StockDay001> implements StockDay001Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public List<StockDay001> selectByCodeAndEx(String codeId, String codeEx) {
         return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }
    @Override
    public List<StockDay001> selectByCodeAndExPage(Page<StockDay001> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDay001> stockDay001List = (List<StockDay001>) redisTemplate.opsForValue().get(codeEx+codeId);
        if (stockDay001List==null||stockDay001List.size()==0){
            stockDay001List=baseMapper.selectByCodeAndExPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(codeEx+codeId, stockDay001List);
        }
        return stockDay001List;
    }
}
