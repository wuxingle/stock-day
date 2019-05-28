package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay0001;
import com.stock.stockday.entity.StockDay0007;
import com.stock.stockday.entity.StockDay0008;
import com.stock.stockday.entity.StockDay001;
import com.stock.stockday.mapper.StockDay0001Mapper;
import com.stock.stockday.mapper.StockDay0008Mapper;
import com.stock.stockday.service.StockDay0001Service;
import com.stock.stockday.service.StockDay0008Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDay0008ServiceImpl extends ServiceImpl<StockDay0008Mapper, StockDay0008> implements StockDay0008Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public List<StockDay0008> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }
    @Override
    public List<StockDay0008> selectByCodeAndExPage(Page<StockDay0008> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDay0008> stockDay0008List = (List<StockDay0008>) redisTemplate.opsForValue().get(codeEx+codeId);
        if (stockDay0008List==null||stockDay0008List.size()==0){
            stockDay0008List=baseMapper.selectByCodeAndExPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(codeEx+codeId, stockDay0008List);
        }
        return stockDay0008List;
    }
}
