package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDayScience0020;
import com.stock.stockday.entity.StockDayScience399;
import com.stock.stockday.mapper.StockDayScience399Mapper;
import com.stock.stockday.service.StockDayScience399Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDayScience399Impl extends ServiceImpl<StockDayScience399Mapper, StockDayScience399> implements StockDayScience399Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    public List<StockDayScience399> selectByPage(Page<StockDayScience399> page, String codeId, String codeEx) {
        return baseMapper.selectByPage(page,codeId,codeEx);
    }

    @Override
    public List<StockDayScience399> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }
}
