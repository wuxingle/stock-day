package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.apicommon.Constants;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience0020;
import com.stock.stockday.entity.StockDayScience3001;
import com.stock.stockday.mapper.StockDayScience3001Mapper;
import com.stock.stockday.service.StockDayScience3001Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDayScience3001Impl extends ServiceImpl<StockDayScience3001Mapper, StockDayScience3001> implements StockDayScience3001Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public List<StockDayScience3001> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }
    public List<StockDayScience3001> selectByPage(Page<StockDayScience3001> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDayScience3001> stockDayScience3001List = (List<StockDayScience3001>) redisTemplate.opsForValue().get(Constants.SCIENCE+codeEx+codeId);
        if (stockDayScience3001List==null||stockDayScience3001List.size()==0){
            stockDayScience3001List=baseMapper.selectByPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(Constants.SCIENCE+codeEx+codeId, stockDayScience3001List);
        }
        return stockDayScience3001List;
    }
}
