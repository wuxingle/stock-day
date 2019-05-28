package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayYanPan;
import com.stock.stockday.entity.StockDayYanPanLowUp;
import com.stock.stockday.entity.StockDayYanPanUpLow;

import java.util.List;

public interface StockDayYanPanUpLowService extends IService<StockDayYanPanUpLow> {
    List<StockDayYanPanUpLow> selectBySelective(StockDayYanPanUpLow stockDayYanPanUpLow);

    int insertSelective(StockDayYanPanUpLow record);

    int updateBySelective(StockDayYanPanUpLow record);
}
