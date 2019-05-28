package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDayYanPanUpLow;
import com.stock.stockday.entity.StockDayYanPanUpUp;
import com.stock.stockday.mapper.StockDayYanPanUpLowMapper;
import com.stock.stockday.mapper.StockDayYanPanUpUpMapper;
import com.stock.stockday.service.StockDayYanPanUpLowService;
import com.stock.stockday.service.StockDayYanPanUpUpService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDayYanPanUpLowServiceImpl extends ServiceImpl<StockDayYanPanUpLowMapper, StockDayYanPanUpLow> implements StockDayYanPanUpLowService {
    @Override
    public List<StockDayYanPanUpLow> selectBySelective(StockDayYanPanUpLow stockDayYanPanUpLow) {
        return baseMapper.selectBySelective(stockDayYanPanUpLow);
    }

    @Override
    public int insertSelective(StockDayYanPanUpLow record) {
        return baseMapper.insertSelective(record);
    }

    @Override
    public int updateBySelective(StockDayYanPanUpLow record) {
        return baseMapper.updateBySelective(record);
    }
}
