package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.apicommon.Constants;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience0020;
import com.stock.stockday.entity.StockDayScience0022;
import com.stock.stockday.mapper.StockDayScience0022Mapper;
import com.stock.stockday.service.StockDayScience0022Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDayScience0022Impl extends ServiceImpl<StockDayScience0022Mapper, StockDayScience0022> implements StockDayScience0022Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public List<StockDayScience0022> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }
    public List<StockDayScience0022> selectByPage(Page<StockDayScience0022> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDayScience0022> stockDayScience0022List = (List<StockDayScience0022>) redisTemplate.opsForValue().get(Constants.SCIENCE+codeEx+codeId);
        if (stockDayScience0022List==null||stockDayScience0022List.size()==0){
            stockDayScience0022List=baseMapper.selectByPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(Constants.SCIENCE+codeEx+codeId, stockDayScience0022List);
        }
        return stockDayScience0022List;
    }
}
