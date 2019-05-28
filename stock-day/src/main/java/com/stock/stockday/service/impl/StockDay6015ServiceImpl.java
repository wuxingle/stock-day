package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay001;
import com.stock.stockday.entity.StockDay6015;
import com.stock.stockday.mapper.StockDay6015Mapper;
import com.stock.stockday.service.StockDay6015Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDay6015ServiceImpl extends ServiceImpl<StockDay6015Mapper, StockDay6015> implements StockDay6015Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public List<StockDay6015> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }
    @Override
    public List<StockDay6015> selectByCodeAndExPage(Page<StockDay6015> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDay6015> stockDay6015List = (List<StockDay6015>) redisTemplate.opsForValue().get(codeEx+codeId);
        if (stockDay6015List==null||stockDay6015List.size()==0){
            stockDay6015List=baseMapper.selectByCodeAndExPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(codeEx+codeId, stockDay6015List);
        }
        return stockDay6015List;
    }
}
