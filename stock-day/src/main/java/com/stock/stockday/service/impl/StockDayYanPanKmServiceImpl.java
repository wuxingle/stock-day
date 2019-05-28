package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDayYanPan24;
import com.stock.stockday.entity.StockDayYanPanKm;
import com.stock.stockday.mapper.StockDayYanPan24Mapper;
import com.stock.stockday.mapper.StockDayYanPanKmMapper;
import com.stock.stockday.service.StockDayYanPan24Service;
import com.stock.stockday.service.StockDayYanPanKmService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDayYanPanKmServiceImpl extends ServiceImpl<StockDayYanPanKmMapper, StockDayYanPanKm> implements StockDayYanPanKmService {
    @Override
    public List<StockDayYanPanKm> selectBySelective(StockDayYanPanKm stockDayYanPanKm) {
        return baseMapper.selectBySelective(stockDayYanPanKm);
    }

    @Override
    public int insertSelective(StockDayYanPanKm record) {
        return baseMapper.insertSelective(record);
    }

    @Override
    public int updateBySelective(StockDayYanPanKm record) {
        return baseMapper.updateBySelective(record);
    }
}
