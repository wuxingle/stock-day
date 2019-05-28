package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay0001;
import com.stock.stockday.entity.StockDay001;
import com.stock.stockday.entity.StockDay6000;
import com.stock.stockday.mapper.StockDay0001Mapper;
import com.stock.stockday.mapper.StockDay6000Mapper;
import com.stock.stockday.service.StockDay0001Service;
import com.stock.stockday.service.StockDay6000Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDay6000ServiceImpl extends ServiceImpl<StockDay6000Mapper, StockDay6000> implements StockDay6000Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public List<StockDay6000> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }
    @Override
    public List<StockDay6000> selectByCodeAndExPage(Page<StockDay6000> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDay6000> stockDay6000List = (List<StockDay6000>) redisTemplate.opsForValue().get(codeEx+codeId);
        if (stockDay6000List==null||stockDay6000List.size()==0){
            stockDay6000List=baseMapper.selectByCodeAndExPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(codeEx+codeId, stockDay6000List);
        }
        return stockDay6000List;
    }
}
