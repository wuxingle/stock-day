package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.apicommon.Constants;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience0020;
import com.stock.stockday.entity.StockDayScience6007;
import com.stock.stockday.entity.StockDayScience6015;
import com.stock.stockday.mapper.StockDayScience6015Mapper;
import com.stock.stockday.service.StockDayScience6015Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDayScience6015Impl extends ServiceImpl<StockDayScience6015Mapper, StockDayScience6015> implements StockDayScience6015Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public List<StockDayScience6015> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }
    public List<StockDayScience6015> selectByPage(Page<StockDayScience6015> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDayScience6015> stockDayScience6015List = (List<StockDayScience6015>) redisTemplate.opsForValue().get(Constants.SCIENCE+codeEx+codeId);
        if (stockDayScience6015List==null||stockDayScience6015List.size()==0){
            stockDayScience6015List=baseMapper.selectByPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(Constants.SCIENCE+codeEx+codeId, stockDayScience6015List);
        }
        return stockDayScience6015List;
    }
}
