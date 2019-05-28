package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.apicommon.Constants;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience0020;
import com.stock.stockday.entity.StockDayScience3005;
import com.stock.stockday.mapper.StockDayScience3005Mapper;
import com.stock.stockday.service.StockDayScience3005Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDayScience3005Impl extends ServiceImpl<StockDayScience3005Mapper, StockDayScience3005> implements StockDayScience3005Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public List<StockDayScience3005> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }
    public List<StockDayScience3005> selectByPage(Page<StockDayScience3005> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDayScience3005> stockDayScience3005List = (List<StockDayScience3005>) redisTemplate.opsForValue().get(Constants.SCIENCE+codeEx+codeId);
        if (stockDayScience3005List==null||stockDayScience3005List.size()==0){
            stockDayScience3005List=baseMapper.selectByPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(Constants.SCIENCE+codeEx+codeId, stockDayScience3005List);
        }
        return stockDayScience3005List;
    }
}
