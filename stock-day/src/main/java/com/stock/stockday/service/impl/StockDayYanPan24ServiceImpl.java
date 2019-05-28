package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDayYanPan24;
import com.stock.stockday.mapper.StockDayYanPan24Mapper;
import com.stock.stockday.service.StockDayYanPan24Service;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDayYanPan24ServiceImpl extends ServiceImpl<StockDayYanPan24Mapper, StockDayYanPan24> implements StockDayYanPan24Service {
    @Override
    public List<StockDayYanPan24> selectBySelective(StockDayYanPan24 stockDayYanPan24) {
        return baseMapper.selectBySelective(stockDayYanPan24);
    }

    @Override
    public int insertSelective(StockDayYanPan24 record) {
        return baseMapper.insertSelective(record);
    }

    @Override
    public int updateBySelective(StockDayYanPan24 record) {
        return baseMapper.updateBySelective(record);
    }
}
