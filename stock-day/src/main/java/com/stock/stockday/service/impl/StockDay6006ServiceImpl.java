package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay001;
import com.stock.stockday.entity.StockDay6006;
import com.stock.stockday.mapper.StockDay6006Mapper;
import com.stock.stockday.service.StockDay6006Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDay6006ServiceImpl extends ServiceImpl<StockDay6006Mapper, StockDay6006> implements StockDay6006Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public List<StockDay6006> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }
    @Override
    public List<StockDay6006> selectByCodeAndExPage(Page<StockDay6006> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDay6006> stockDay6006List = (List<StockDay6006>) redisTemplate.opsForValue().get(codeEx+codeId);
        if (stockDay6006List==null||stockDay6006List.size()==0){
            stockDay6006List=baseMapper.selectByCodeAndExPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(codeEx+codeId, stockDay6006List);
        }
        return stockDay6006List;
    }
}
