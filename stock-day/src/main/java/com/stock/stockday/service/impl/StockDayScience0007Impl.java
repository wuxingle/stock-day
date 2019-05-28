package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.apicommon.Constants;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience0007;
import com.stock.stockday.mapper.StockDayScience0007Mapper;
import com.stock.stockday.service.StockDayScience0007Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDayScience0007Impl extends ServiceImpl<StockDayScience0007Mapper, StockDayScience0007> implements StockDayScience0007Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public List<StockDayScience0007> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }
    public List<StockDayScience0007> selectByPage(Page<StockDayScience0007> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDayScience0007> stockDayScience0007List = (List<StockDayScience0007>) redisTemplate.opsForValue().get(Constants.SCIENCE+codeEx+codeId);
        if (stockDayScience0007List==null||stockDayScience0007List.size()==0){
            stockDayScience0007List=baseMapper.selectByPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(Constants.SCIENCE+codeEx+codeId, stockDayScience0007List);
        }
        return stockDayScience0007List;
    }
}
