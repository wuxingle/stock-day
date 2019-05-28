package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay0001;
import com.stock.stockday.entity.StockDay001;
import com.stock.stockday.entity.StockDay3000;
import com.stock.stockday.mapper.StockDay0001Mapper;
import com.stock.stockday.mapper.StockDay3000Mapper;
import com.stock.stockday.service.StockDay0001Service;
import com.stock.stockday.service.StockDay3000Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDay3000ServiceImpl extends ServiceImpl<StockDay3000Mapper, StockDay3000> implements StockDay3000Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public List<StockDay3000> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }
    @Override
    public List<StockDay3000> selectByCodeAndExPage(Page<StockDay3000> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDay3000> stockDay3000List = (List<StockDay3000>) redisTemplate.opsForValue().get(codeEx+codeId);
        if (stockDay3000List==null||stockDay3000List.size()==0){
            stockDay3000List=baseMapper.selectByCodeAndExPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(codeEx+codeId, stockDay3000List);
        }
        return stockDay3000List;
    }
}
