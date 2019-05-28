package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.apicommon.Constants;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience0020;
import com.stock.stockday.mapper.StockDayScience0020Mapper;
import com.stock.stockday.service.StockDayScience0020Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDayScience0020Impl extends ServiceImpl<StockDayScience0020Mapper, StockDayScience0020> implements StockDayScience0020Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public List<StockDayScience0020> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }
    public List<StockDayScience0020> selectByPage(Page<StockDayScience0020> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDayScience0020> stockDayScience0020List = (List<StockDayScience0020>) redisTemplate.opsForValue().get(Constants.SCIENCE+codeEx+codeId);
        if (stockDayScience0020List==null||stockDayScience0020List.size()==0){
            stockDayScience0020List=baseMapper.selectByPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(Constants.SCIENCE+codeEx+codeId, stockDayScience0020List);
        }
        return stockDayScience0020List;
    }
}
