package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDayYanPanLowLow;
import com.stock.stockday.entity.StockDayYanPanUpUp;
import com.stock.stockday.mapper.StockDayYanPanLowLowMapper;
import com.stock.stockday.mapper.StockDayYanPanUpUpMapper;
import com.stock.stockday.service.StockDayYanPanLowLowService;
import com.stock.stockday.service.StockDayYanPanUpUpService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDayYanPanLowLowServiceImpl extends ServiceImpl<StockDayYanPanLowLowMapper, StockDayYanPanLowLow> implements StockDayYanPanLowLowService {
    @Override
    public List<StockDayYanPanLowLow> selectBySelective(StockDayYanPanLowLow stockDayYanPanLowLow) {
        return baseMapper.selectBySelective(stockDayYanPanLowLow);
    }

    @Override
    public int insertSelective(StockDayYanPanLowLow record) {
        return baseMapper.insertSelective(record);
    }

    @Override
    public int updateBySelective(StockDayYanPanLowLow record) {
        return baseMapper.updateBySelective(record);
    }
}
