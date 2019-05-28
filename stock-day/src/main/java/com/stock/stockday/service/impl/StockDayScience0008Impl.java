package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.apicommon.Constants;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience0008;
import com.stock.stockday.mapper.StockDayScience0008Mapper;
import com.stock.stockday.service.StockDayScience0008Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDayScience0008Impl extends ServiceImpl<StockDayScience0008Mapper, StockDayScience0008> implements StockDayScience0008Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;


    @Override
    public List<StockDayScience0008> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }
    public List<StockDayScience0008> selectByPage(Page<StockDayScience0008> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDayScience0008> stockDayScience0008List = (List<StockDayScience0008>) redisTemplate.opsForValue().get(Constants.SCIENCE+codeEx+codeId);
        if (stockDayScience0008List==null||stockDayScience0008List.size()==0){
            stockDayScience0008List=baseMapper.selectByPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(Constants.SCIENCE+codeEx+codeId, stockDayScience0008List);
        }
        return stockDayScience0008List;
    }
}
