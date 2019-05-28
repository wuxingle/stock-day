package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay001;
import com.stock.stockday.entity.StockDay6004;
import com.stock.stockday.mapper.StockDay6004Mapper;
import com.stock.stockday.service.StockDay6004Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDay6004ServiceImpl extends ServiceImpl<StockDay6004Mapper, StockDay6004> implements StockDay6004Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public List<StockDay6004> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }
    @Override
    public List<StockDay6004> selectByCodeAndExPage(Page<StockDay6004> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDay6004> stockDay6004List = (List<StockDay6004>) redisTemplate.opsForValue().get(codeEx+codeId);
        if (stockDay6004List==null||stockDay6004List.size()==0){
            stockDay6004List=baseMapper.selectByCodeAndExPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(codeEx+codeId, stockDay6004List);
        }
        return stockDay6004List;
    }
}
