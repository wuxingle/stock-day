package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay0001;
import com.stock.stockday.entity.StockDay0005;
import com.stock.stockday.entity.StockDay001;
import com.stock.stockday.mapper.StockDay0001Mapper;
import com.stock.stockday.mapper.StockDay0005Mapper;
import com.stock.stockday.service.StockDay0001Service;
import com.stock.stockday.service.StockDay0005Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDay0005ServiceImpl extends ServiceImpl<StockDay0005Mapper, StockDay0005> implements StockDay0005Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public List<StockDay0005> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }
    @Override
    public List<StockDay0005> selectByCodeAndExPage(Page<StockDay0005> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDay0005> stockDay0005List = (List<StockDay0005>) redisTemplate.opsForValue().get(codeEx+codeId);
        if (stockDay0005List==null||stockDay0005List.size()==0){
            stockDay0005List=baseMapper.selectByCodeAndExPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(codeEx+codeId, stockDay0005List);
        }
        return stockDay0005List;
    }
}
