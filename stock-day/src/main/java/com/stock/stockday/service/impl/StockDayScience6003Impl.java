package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.apicommon.Constants;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience0020;
import com.stock.stockday.entity.StockDayScience6003;
import com.stock.stockday.mapper.StockDayScience6003Mapper;
import com.stock.stockday.service.StockDayScience6003Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDayScience6003Impl extends ServiceImpl<StockDayScience6003Mapper, StockDayScience6003> implements StockDayScience6003Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public List<StockDayScience6003> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }
    public List<StockDayScience6003> selectByPage(Page<StockDayScience6003> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDayScience6003> stockDayScience6003List = (List<StockDayScience6003>) redisTemplate.opsForValue().get(Constants.SCIENCE+codeEx+codeId);
        if (stockDayScience6003List==null||stockDayScience6003List.size()==0){
            stockDayScience6003List=baseMapper.selectByPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(Constants.SCIENCE+codeEx+codeId, stockDayScience6003List);
        }
        return stockDayScience6003List;
    }
}
