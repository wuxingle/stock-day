package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.apicommon.Constants;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience0020;
import com.stock.stockday.entity.StockDayScience3002;
import com.stock.stockday.mapper.StockDayScience3002Mapper;
import com.stock.stockday.service.StockDayScience3002Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDayScience3002Impl extends ServiceImpl<StockDayScience3002Mapper, StockDayScience3002> implements StockDayScience3002Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public List<StockDayScience3002> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }
    public List<StockDayScience3002> selectByPage(Page<StockDayScience3002> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDayScience3002> stockDayScience3002List = (List<StockDayScience3002>) redisTemplate.opsForValue().get(Constants.SCIENCE+codeEx+codeId);
        if (stockDayScience3002List==null||stockDayScience3002List.size()==0){
            stockDayScience3002List=baseMapper.selectByPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(Constants.SCIENCE+codeEx+codeId, stockDayScience3002List);
        }
        return stockDayScience3002List;
    }
}
