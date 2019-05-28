package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDayYanPan24;
import com.stock.stockday.entity.StockDayYanPanRw;
import com.stock.stockday.mapper.StockDayYanPan24Mapper;
import com.stock.stockday.mapper.StockDayYanPanRwMapper;
import com.stock.stockday.service.StockDayYanPan24Service;
import com.stock.stockday.service.StockDayYanPanRwService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDayYanPanRwServiceImpl extends ServiceImpl<StockDayYanPanRwMapper, StockDayYanPanRw> implements StockDayYanPanRwService {
    @Override
    public List<StockDayYanPanRw> selectBySelective(StockDayYanPanRw stockDayYanPanRw) {
        return baseMapper.selectBySelective(stockDayYanPanRw);
    }

    @Override
    public int insertSelective(StockDayYanPanRw record) {
        return baseMapper.insertSelective(record);
    }

    @Override
    public int updateBySelective(StockDayYanPanRw record) {
        return baseMapper.updateBySelective(record);
    }
}
