package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay001;
import com.stock.stockday.entity.StockDay6009;
import com.stock.stockday.mapper.StockDay6009Mapper;
import com.stock.stockday.service.StockDay6009Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDay6009ServiceImpl extends ServiceImpl<StockDay6009Mapper, StockDay6009> implements StockDay6009Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public List<StockDay6009> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }
    @Override
    public List<StockDay6009> selectByCodeAndExPage(Page<StockDay6009> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDay6009> stockDay6009List = (List<StockDay6009>) redisTemplate.opsForValue().get(codeEx+codeId);
        if (stockDay6009List==null||stockDay6009List.size()==0){
            stockDay6009List=baseMapper.selectByCodeAndExPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(codeEx+codeId, stockDay6009List);
        }
        return stockDay6009List;
    }
}
