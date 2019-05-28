package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay001;
import com.stock.stockday.entity.StockDay6001;
import com.stock.stockday.mapper.StockDay6001Mapper;
import com.stock.stockday.service.StockDay6001Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDay6001ServiceImpl extends ServiceImpl<StockDay6001Mapper, StockDay6001> implements StockDay6001Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public List<StockDay6001> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }
    @Override
    public List<StockDay6001> selectByCodeAndExPage(Page<StockDay6001> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDay6001> stockDay6001List = (List<StockDay6001>) redisTemplate.opsForValue().get(codeEx+codeId);
        if (stockDay6001List==null||stockDay6001List.size()==0){
            stockDay6001List=baseMapper.selectByCodeAndExPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(codeEx+codeId, stockDay6001List);
        }
        return stockDay6001List;
    }
}
