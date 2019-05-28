package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.apicommon.Constants;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience0020;
import com.stock.stockday.entity.StockDayScience6004;
import com.stock.stockday.mapper.StockDayScience6004Mapper;
import com.stock.stockday.service.StockDayScience6004Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDayScience6004Impl extends ServiceImpl<StockDayScience6004Mapper, StockDayScience6004> implements StockDayScience6004Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public List<StockDayScience6004> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }
    public List<StockDayScience6004> selectByPage(Page<StockDayScience6004> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDayScience6004> stockDayScience6004List = (List<StockDayScience6004>) redisTemplate.opsForValue().get(Constants.SCIENCE+codeEx+codeId);
        if (stockDayScience6004List==null||stockDayScience6004List.size()==0){
            stockDayScience6004List=baseMapper.selectByPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(Constants.SCIENCE+codeEx+codeId, stockDayScience6004List);
        }
        return stockDayScience6004List;
    }
}
