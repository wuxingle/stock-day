package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDayYanPanLowUp;
import com.stock.stockday.entity.StockDayYanPanUpUp;
import com.stock.stockday.mapper.StockDayYanPanLowUpMapper;
import com.stock.stockday.mapper.StockDayYanPanUpUpMapper;
import com.stock.stockday.service.StockDayYanPanLowUpService;
import com.stock.stockday.service.StockDayYanPanUpUpService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDayYanPanLowUpServiceImpl extends ServiceImpl<StockDayYanPanLowUpMapper, StockDayYanPanLowUp> implements StockDayYanPanLowUpService {
    @Override
    public List<StockDayYanPanLowUp> selectBySelective(StockDayYanPanLowUp stockDayYanPanLowUp) {
        return baseMapper.selectBySelective(stockDayYanPanLowUp);
    }

    @Override
    public int insertSelective(StockDayYanPanLowUp record) {
        return baseMapper.insertSelective(record);
    }

    @Override
    public int updateBySelective(StockDayYanPanLowUp record) {
        return baseMapper.updateBySelective(record);
    }
}
