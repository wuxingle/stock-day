package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay0001;
import com.stock.stockday.mapper.StockDay0000Mapper;
import com.stock.stockday.service.StockDay0000Service;
import com.stock.stockday.service.StockDay0001Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;
import java.util.List;

@Service
public class StockDay0000ServiceImpl extends ServiceImpl<StockDay0000Mapper, StockDay0000> implements StockDay0000Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;


    @Override
    public List<StockDay0000> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }

    @Override
    public List<StockDay0000> selectByCodeAndExPage(Page<StockDay0000> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDay0000> stockDay0000List = (List<StockDay0000>) redisTemplate.opsForValue().get(codeEx+codeId);
        if (stockDay0000List==null||stockDay0000List.size()==0){
            stockDay0000List=baseMapper.selectByCodeAndExPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(codeEx+codeId, stockDay0000List);
        }
        return stockDay0000List;
    }
}
