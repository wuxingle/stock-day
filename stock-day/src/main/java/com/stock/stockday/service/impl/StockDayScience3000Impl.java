package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.apicommon.Constants;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience0020;
import com.stock.stockday.entity.StockDayScience3000;
import com.stock.stockday.mapper.StockDayScience3000Mapper;
import com.stock.stockday.service.StockDayScience3000Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDayScience3000Impl extends ServiceImpl<StockDayScience3000Mapper, StockDayScience3000> implements StockDayScience3000Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public List<StockDayScience3000> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }
    public List<StockDayScience3000> selectByPage(Page<StockDayScience3000> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDayScience3000> stockDayScience3000List = (List<StockDayScience3000>) redisTemplate.opsForValue().get(Constants.SCIENCE+codeEx+codeId);
        if (stockDayScience3000List==null||stockDayScience3000List.size()==0){
            stockDayScience3000List=baseMapper.selectByPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(Constants.SCIENCE+codeEx+codeId, stockDayScience3000List);
        }
        return stockDayScience3000List;
    }
}
