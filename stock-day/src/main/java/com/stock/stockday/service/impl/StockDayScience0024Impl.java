package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.apicommon.Constants;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience0020;
import com.stock.stockday.entity.StockDayScience0024;
import com.stock.stockday.mapper.StockDayScience0024Mapper;
import com.stock.stockday.service.StockDayScience0024Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDayScience0024Impl extends ServiceImpl<StockDayScience0024Mapper, StockDayScience0024> implements StockDayScience0024Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public List<StockDayScience0024> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }
    public List<StockDayScience0024> selectByPage(Page<StockDayScience0024> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDayScience0024> stockDayScience0024List = (List<StockDayScience0024>) redisTemplate.opsForValue().get(Constants.SCIENCE+codeEx+codeId);
        if (stockDayScience0024List==null||stockDayScience0024List.size()==0){
            stockDayScience0024List=baseMapper.selectByPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(Constants.SCIENCE+codeEx+codeId, stockDayScience0024List);
        }
        return stockDayScience0024List;
    }
}
