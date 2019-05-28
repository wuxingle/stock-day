package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.apicommon.Constants;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience0020;
import com.stock.stockday.entity.StockDayScience6007;
import com.stock.stockday.entity.StockDayScience6009;
import com.stock.stockday.mapper.StockDayScience6009Mapper;
import com.stock.stockday.service.StockDayScience6009Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDayScience6009Impl extends ServiceImpl<StockDayScience6009Mapper, StockDayScience6009> implements StockDayScience6009Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public List<StockDayScience6009> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }
    public List<StockDayScience6009> selectByPage(Page<StockDayScience6009> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDayScience6009> stockDayScience6009List = (List<StockDayScience6009>) redisTemplate.opsForValue().get(Constants.SCIENCE+codeEx+codeId);
        if (stockDayScience6009List==null||stockDayScience6009List.size()==0){
            stockDayScience6009List=baseMapper.selectByPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(Constants.SCIENCE+codeEx+codeId, stockDayScience6009List);
        }
        return stockDayScience6009List;
    }
}
