package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay001;
import com.stock.stockday.entity.StockDay6007;
import com.stock.stockday.mapper.StockDay6007Mapper;
import com.stock.stockday.service.StockDay6007Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDay6007ServiceImpl extends ServiceImpl<StockDay6007Mapper, StockDay6007> implements StockDay6007Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public List<StockDay6007> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }
    @Override
    public List<StockDay6007> selectByCodeAndExPage(Page<StockDay6007> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDay6007> stockDay6007List = (List<StockDay6007>) redisTemplate.opsForValue().get(codeEx+codeId);
        if (stockDay6007List==null||stockDay6007List.size()==0){
            stockDay6007List=baseMapper.selectByCodeAndExPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(codeEx+codeId, stockDay6007List);
        }
        return stockDay6007List;
    }
}
