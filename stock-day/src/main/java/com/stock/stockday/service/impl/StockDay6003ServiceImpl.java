package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay001;
import com.stock.stockday.entity.StockDay6003;
import com.stock.stockday.mapper.StockDay6003Mapper;
import com.stock.stockday.service.StockDay6003Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDay6003ServiceImpl extends ServiceImpl<StockDay6003Mapper, StockDay6003> implements StockDay6003Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public List<StockDay6003> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }
    @Override
    public List<StockDay6003> selectByCodeAndExPage(Page<StockDay6003> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDay6003> stockDay6003List = (List<StockDay6003>) redisTemplate.opsForValue().get(codeEx+codeId);
        if (stockDay6003List==null||stockDay6003List.size()==0){
            stockDay6003List=baseMapper.selectByCodeAndExPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(codeEx+codeId, stockDay6003List);
        }
        return stockDay6003List;
    }
}
