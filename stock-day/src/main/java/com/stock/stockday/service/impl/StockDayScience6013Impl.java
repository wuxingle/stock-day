package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.apicommon.Constants;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience0020;
import com.stock.stockday.entity.StockDayScience6007;
import com.stock.stockday.entity.StockDayScience6013;
import com.stock.stockday.mapper.StockDayScience6013Mapper;
import com.stock.stockday.service.StockDayScience6013Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDayScience6013Impl extends ServiceImpl<StockDayScience6013Mapper, StockDayScience6013> implements StockDayScience6013Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public List<StockDayScience6013> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }
    public List<StockDayScience6013> selectByPage(Page<StockDayScience6013> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDayScience6013> stockDayScience6013List = (List<StockDayScience6013>) redisTemplate.opsForValue().get(Constants.SCIENCE+codeEx+codeId);
        if (stockDayScience6013List==null||stockDayScience6013List.size()==0){
            stockDayScience6013List=baseMapper.selectByPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(Constants.SCIENCE+codeEx+codeId, stockDayScience6013List);
        }
        return stockDayScience6013List;
    }
}
