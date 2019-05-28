package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDayYanPan24;
import com.stock.stockday.entity.StockDayYanPanBenpan;
import com.stock.stockday.mapper.StockDayYanPan24Mapper;
import com.stock.stockday.mapper.StockDayYanPanBenpanMapper;
import com.stock.stockday.service.StockDayYanPan24Service;
import com.stock.stockday.service.StockDayYanPanBenpanService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDayYanPanBenpanServiceImpl extends ServiceImpl<StockDayYanPanBenpanMapper, StockDayYanPanBenpan> implements StockDayYanPanBenpanService {
    @Override
    public List<StockDayYanPanBenpan> selectBySelective(StockDayYanPanBenpan stockDayYanPanBenpan) {
        return baseMapper.selectBySelective(stockDayYanPanBenpan);
    }

    @Override
    public int insertSelective(StockDayYanPanBenpan record) {
        return baseMapper.insertSelective(record);
    }

    @Override
    public int updateBySelective(StockDayYanPanBenpan record) {
        return baseMapper.updateBySelective(record);
    }
}
