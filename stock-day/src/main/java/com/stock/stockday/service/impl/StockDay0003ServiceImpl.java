package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay0003;
import com.stock.stockday.entity.StockDay001;
import com.stock.stockday.mapper.StockDay0003Mapper;
import com.stock.stockday.service.StockDay0003Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDay0003ServiceImpl extends ServiceImpl<StockDay0003Mapper, StockDay0003> implements StockDay0003Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public List<StockDay0003> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }
    @Override
    public List<StockDay0003> selectByCodeAndExPage(Page<StockDay0003> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDay0003> stockDay0003List = (List<StockDay0003>) redisTemplate.opsForValue().get(codeEx+codeId);
        if (stockDay0003List==null||stockDay0003List.size()==0){
            stockDay0003List=baseMapper.selectByCodeAndExPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(codeEx+codeId, stockDay0003List);
        }
        return stockDay0003List;
    }
}
