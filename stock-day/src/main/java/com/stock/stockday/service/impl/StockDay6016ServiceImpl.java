package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay001;
import com.stock.stockday.entity.StockDay6016;
import com.stock.stockday.mapper.StockDay6016Mapper;
import com.stock.stockday.service.StockDay6016Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDay6016ServiceImpl extends ServiceImpl<StockDay6016Mapper, StockDay6016> implements StockDay6016Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public List<StockDay6016> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }
    @Override
    public List<StockDay6016> selectByCodeAndExPage(Page<StockDay6016> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDay6016> stockDay6016List = (List<StockDay6016>) redisTemplate.opsForValue().get(codeEx+codeId);
        if (stockDay6016List==null||stockDay6016List.size()==0){
            stockDay6016List=baseMapper.selectByCodeAndExPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(codeEx+codeId, stockDay6016List);
        }
        return stockDay6016List;
    }
}
