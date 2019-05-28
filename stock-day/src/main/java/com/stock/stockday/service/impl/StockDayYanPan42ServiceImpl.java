package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDayYanPan24;
import com.stock.stockday.entity.StockDayYanPan42;
import com.stock.stockday.mapper.StockDayYanPan24Mapper;
import com.stock.stockday.mapper.StockDayYanPan42Mapper;
import com.stock.stockday.service.StockDayYanPan24Service;
import com.stock.stockday.service.StockDayYanPan42Service;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDayYanPan42ServiceImpl extends ServiceImpl<StockDayYanPan42Mapper, StockDayYanPan42> implements StockDayYanPan42Service {
    @Override
    public List<StockDayYanPan42> selectBySelective(StockDayYanPan42 stockDayYanPan42) {
        return baseMapper.selectBySelective(stockDayYanPan42);
    }

    @Override
    public int insertSelective(StockDayYanPan42 record) {
        return baseMapper.insertSelective(record);
    }

    @Override
    public int updateBySelective(StockDayYanPan42 record) {
        return baseMapper.updateBySelective(record);
    }
}
