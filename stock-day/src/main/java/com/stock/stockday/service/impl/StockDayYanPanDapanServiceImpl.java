package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDayYanPan24;
import com.stock.stockday.entity.StockDayYanPanDapan;
import com.stock.stockday.mapper.StockDayYanPan24Mapper;
import com.stock.stockday.mapper.StockDayYanPanDapanMapper;
import com.stock.stockday.service.StockDayYanPan24Service;
import com.stock.stockday.service.StockDayYanPanDapanService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDayYanPanDapanServiceImpl extends ServiceImpl<StockDayYanPanDapanMapper, StockDayYanPanDapan> implements StockDayYanPanDapanService {
    @Override
    public List<StockDayYanPanDapan> selectBySelective(StockDayYanPanDapan stockDayYanPanDapan) {
        return baseMapper.selectBySelective(stockDayYanPanDapan);
    }

    @Override
    public int insertSelective(StockDayYanPanDapan record) {
        return baseMapper.insertSelective(record);
    }

    @Override
    public int updateBySelective(StockDayYanPanDapan record) {
        return baseMapper.updateBySelective(record);
    }
}
