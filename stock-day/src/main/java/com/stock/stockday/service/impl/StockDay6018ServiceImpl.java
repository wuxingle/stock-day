package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay001;
import com.stock.stockday.entity.StockDay6018;
import com.stock.stockday.mapper.StockDay6018Mapper;
import com.stock.stockday.service.StockDay6018Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDay6018ServiceImpl extends ServiceImpl<StockDay6018Mapper, StockDay6018> implements StockDay6018Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public List<StockDay6018> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }
    @Override
    public List<StockDay6018> selectByCodeAndExPage(Page<StockDay6018> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDay6018> stockDay6018List = (List<StockDay6018>) redisTemplate.opsForValue().get(codeEx+codeId);
        if (stockDay6018List==null||stockDay6018List.size()==0){
            stockDay6018List=baseMapper.selectByCodeAndExPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(codeEx+codeId, stockDay6018List);
        }
        return stockDay6018List;
    }
}
