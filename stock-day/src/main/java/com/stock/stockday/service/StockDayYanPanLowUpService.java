package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayYanPanLowLow;
import com.stock.stockday.entity.StockDayYanPanLowUp;

import java.util.List;

public interface StockDayYanPanLowUpService extends IService<StockDayYanPanLowUp> {
    List<StockDayYanPanLowUp> selectBySelective(StockDayYanPanLowUp stockDayYanPanLowUp);

    int insertSelective(StockDayYanPanLowUp record);

    int updateBySelective(StockDayYanPanLowUp record);
}
