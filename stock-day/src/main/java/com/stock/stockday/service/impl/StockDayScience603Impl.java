package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.apicommon.Constants;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience0020;
import com.stock.stockday.entity.StockDayScience603;
import com.stock.stockday.mapper.StockDayScience603Mapper;
import com.stock.stockday.service.StockDayScience603Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDayScience603Impl extends ServiceImpl<StockDayScience603Mapper,StockDayScience603> implements StockDayScience603Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public List<StockDayScience603> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }
    public List<StockDayScience603> selectByPage(Page<StockDayScience603> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDayScience603> stockDayScience603List = (List<StockDayScience603>) redisTemplate.opsForValue().get(Constants.SCIENCE+codeEx+codeId);
        if (stockDayScience603List==null||stockDayScience603List.size()==0){
            stockDayScience603List=baseMapper.selectByPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(Constants.SCIENCE+codeEx+codeId, stockDayScience603List);
        }
        return stockDayScience603List;
    }
}
