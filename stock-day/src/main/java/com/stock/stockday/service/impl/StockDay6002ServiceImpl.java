package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay001;
import com.stock.stockday.entity.StockDay6002;
import com.stock.stockday.mapper.StockDay6002Mapper;
import com.stock.stockday.service.StockDay6002Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDay6002ServiceImpl extends ServiceImpl<StockDay6002Mapper, StockDay6002> implements StockDay6002Service {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public List<StockDay6002> selectByCodeAndEx(String codeId, String codeEx) {
        return baseMapper.selectByCodeAndEx(codeId,codeEx);
    }
    @Override
    public List<StockDay6002> selectByCodeAndExPage(Page<StockDay6002> page, String codeId, String codeEx) {
        //查询Redis，有直接返回，没有查询
        List<StockDay6002> stockDay6002List = (List<StockDay6002>) redisTemplate.opsForValue().get(codeEx+codeId);
        if (stockDay6002List==null||stockDay6002List.size()==0){
            stockDay6002List=baseMapper.selectByCodeAndExPage(page,codeId,codeEx);
            redisTemplate.opsForValue().set(codeEx+codeId, stockDay6002List);
        }
        return stockDay6002List;
    }
}
