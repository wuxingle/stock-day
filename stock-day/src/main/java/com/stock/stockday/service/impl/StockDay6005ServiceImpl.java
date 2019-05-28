package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay001;
import com.stock.stockday.entity.StockDay6005;
import com.stock.stockday.mapper.StockDay6005Mapper;
import com.stock.stockday.service.StockDay6005Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDay6005ServiceImpl extends ServiceImpl<StockDay6005Mapper, StockDay6005> implements StockDay6005Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public List<StockDay6005> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }
    @Override
    public List<StockDay6005> selectByCodeAndExPage(Page<StockDay6005> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDay6005> stockDay6005List = (List<StockDay6005>) redisTemplate.opsForValue().get(codeEx+codeId);
        if (stockDay6005List==null||stockDay6005List.size()==0){
            stockDay6005List=baseMapper.selectByCodeAndExPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(codeEx+codeId, stockDay6005List);
        }
        return stockDay6005List;
    }
}
