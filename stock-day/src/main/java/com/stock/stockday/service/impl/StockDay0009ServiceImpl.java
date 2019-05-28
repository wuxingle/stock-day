package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay0001;
import com.stock.stockday.entity.StockDay0009;
import com.stock.stockday.entity.StockDay001;
import com.stock.stockday.mapper.StockDay0001Mapper;
import com.stock.stockday.mapper.StockDay0009Mapper;
import com.stock.stockday.service.StockDay0001Service;
import com.stock.stockday.service.StockDay0009Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDay0009ServiceImpl extends ServiceImpl<StockDay0009Mapper, StockDay0009> implements StockDay0009Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public List<StockDay0009> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }
    @Override
    public List<StockDay0009> selectByCodeAndExPage(Page<StockDay0009> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDay0009> stockDay0009List = (List<StockDay0009>) redisTemplate.opsForValue().get(codeEx+codeId);
        if (stockDay0009List==null||stockDay0009List.size()==0){
            stockDay0009List=baseMapper.selectByCodeAndExPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(codeEx+codeId, stockDay0009List);
        }
        return stockDay0009List;
    }
}
