package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay0001;
import com.stock.stockday.entity.StockDay001;
import com.stock.stockday.entity.StockDay0028;
import com.stock.stockday.mapper.StockDay0001Mapper;
import com.stock.stockday.mapper.StockDay0028Mapper;
import com.stock.stockday.service.StockDay0001Service;
import com.stock.stockday.service.StockDay0028Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDay0028ServiceImpl extends ServiceImpl<StockDay0028Mapper, StockDay0028> implements StockDay0028Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public List<StockDay0028> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }
    @Override
    public List<StockDay0028> selectByCodeAndExPage(Page<StockDay0028> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDay0028> stockDay0028List = (List<StockDay0028>) redisTemplate.opsForValue().get(codeEx+codeId);
        if (stockDay0028List==null||stockDay0028List.size()==0){
            stockDay0028List=baseMapper.selectByCodeAndExPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(codeEx+codeId, stockDay0028List);
        }
        return stockDay0028List;
    }
}
