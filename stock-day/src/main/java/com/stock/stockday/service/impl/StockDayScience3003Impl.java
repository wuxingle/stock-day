package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.apicommon.Constants;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience0020;
import com.stock.stockday.entity.StockDayScience3003;
import com.stock.stockday.mapper.StockDayScience3003Mapper;
import com.stock.stockday.service.StockDayScience3003Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDayScience3003Impl extends ServiceImpl<StockDayScience3003Mapper, StockDayScience3003> implements StockDayScience3003Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public List<StockDayScience3003> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }
    public List<StockDayScience3003> selectByPage(Page<StockDayScience3003> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDayScience3003> stockDayScience3003List = (List<StockDayScience3003>) redisTemplate.opsForValue().get(Constants.SCIENCE+codeEx+codeId);
        if (stockDayScience3003List==null||stockDayScience3003List.size()==0){
            stockDayScience3003List=baseMapper.selectByPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(Constants.SCIENCE+codeEx+codeId, stockDayScience3003List);
        }
        return stockDayScience3003List;
    }
}
