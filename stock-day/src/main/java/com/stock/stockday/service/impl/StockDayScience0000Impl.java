package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.apicommon.Constants;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience0001;
import com.stock.stockday.mapper.StockDayScience0000Mapper;
import com.stock.stockday.mapper.StockDayScience0001Mapper;
import com.stock.stockday.service.StockDayScience0000Service;
import com.stock.stockday.service.StockDayScience0001Service;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDayScience0000Impl extends ServiceImpl<StockDayScience0000Mapper,StockDayScience0000> implements StockDayScience0000Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public List<StockDayScience0000> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }

    @Override
    public List<StockDayScience0000> selectByPage(Page<StockDayScience0000> page, String codeId,String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDayScience0000> stockDayScience0000List = (List<StockDayScience0000>) redisTemplate.opsForValue().get(Constants.SCIENCE+codeEx+codeId);
        if (stockDayScience0000List==null||stockDayScience0000List.size()==0){
            stockDayScience0000List=baseMapper.selectByPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(Constants.SCIENCE+codeEx+codeId, stockDayScience0000List);
        }
        return stockDayScience0000List;
    }
}
