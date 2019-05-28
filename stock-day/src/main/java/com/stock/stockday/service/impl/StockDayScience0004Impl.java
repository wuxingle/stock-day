package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.apicommon.Constants;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience0004;
import com.stock.stockday.mapper.StockDayScience0004Mapper;
import com.stock.stockday.service.StockDayScience0004Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDayScience0004Impl extends ServiceImpl<StockDayScience0004Mapper, StockDayScience0004> implements StockDayScience0004Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public List<StockDayScience0004> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }
    public List<StockDayScience0004> selectByPage(Page<StockDayScience0004> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDayScience0004> stockDayScience0004List = (List<StockDayScience0004>) redisTemplate.opsForValue().get(Constants.SCIENCE+codeEx+codeId);
        if (stockDayScience0004List==null||stockDayScience0004List.size()==0){
            stockDayScience0004List=baseMapper.selectByPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(Constants.SCIENCE+codeEx+codeId, stockDayScience0004List);
        }
        return stockDayScience0004List;
    }
}
