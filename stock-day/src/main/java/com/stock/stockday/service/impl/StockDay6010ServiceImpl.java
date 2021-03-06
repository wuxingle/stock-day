package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay001;
import com.stock.stockday.entity.StockDay6010;
import com.stock.stockday.mapper.StockDay6010Mapper;
import com.stock.stockday.service.StockDay6010Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDay6010ServiceImpl extends ServiceImpl<StockDay6010Mapper, StockDay6010> implements StockDay6010Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public List<StockDay6010> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }
    @Override
    public List<StockDay6010> selectByCodeAndExPage(Page<StockDay6010> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDay6010> stockDay6010List = (List<StockDay6010>) redisTemplate.opsForValue().get(codeEx+codeId);
        if (stockDay6010List==null||stockDay6010List.size()==0){
            stockDay6010List=baseMapper.selectByCodeAndExPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(codeEx+codeId, stockDay6010List);
        }
        return stockDay6010List;
    }
}
