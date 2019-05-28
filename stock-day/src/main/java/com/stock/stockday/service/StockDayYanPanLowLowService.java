package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayYanPan;
import com.stock.stockday.entity.StockDayYanPanLowLow;

import java.util.List;

public interface StockDayYanPanLowLowService extends IService<StockDayYanPanLowLow> {
    List<StockDayYanPanLowLow> selectBySelective(StockDayYanPanLowLow stockDayYanPanLowLow);

    int insertSelective(StockDayYanPanLowLow record);

    int updateBySelective(StockDayYanPanLowLow record);
}
