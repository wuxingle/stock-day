package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay0002;
import com.stock.stockday.entity.StockDay001;
import com.stock.stockday.mapper.StockDay0002Mapper;
import com.stock.stockday.service.StockDay0002Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDay0002ServiceImpl extends ServiceImpl<StockDay0002Mapper, StockDay0002> implements StockDay0002Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public List<StockDay0002> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }
    @Override
    public List<StockDay0002> selectByCodeAndExPage(Page<StockDay0002> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDay0002> stockDay0002List = (List<StockDay0002>) redisTemplate.opsForValue().get(codeEx+codeId);
        if (stockDay0002List==null||stockDay0002List.size()==0){
            stockDay0002List=baseMapper.selectByCodeAndExPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(codeEx+codeId, stockDay0002List);
        }
        return stockDay0002List;
    }
}
