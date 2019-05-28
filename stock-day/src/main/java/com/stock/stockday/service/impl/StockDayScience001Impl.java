package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.apicommon.Constants;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience001;
import com.stock.stockday.mapper.StockDayScience001Mapper;
import com.stock.stockday.service.StockDayScience001Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDayScience001Impl extends ServiceImpl<StockDayScience001Mapper, StockDayScience001> implements StockDayScience001Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public List<StockDayScience001> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }

    public List<StockDayScience001> selectByPage(Page<StockDayScience001> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDayScience001> stockDayScience001List = (List<StockDayScience001>) redisTemplate.opsForValue().get(Constants.SCIENCE+codeEx+codeId);
        if (stockDayScience001List==null||stockDayScience001List.size()==0){
            stockDayScience001List=baseMapper.selectByPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(Constants.SCIENCE+codeEx+codeId, stockDayScience001List);
        }
        return stockDayScience001List;
    }
}
