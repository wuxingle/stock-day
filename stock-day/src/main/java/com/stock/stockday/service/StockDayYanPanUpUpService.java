package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayYanPanUpLow;
import com.stock.stockday.entity.StockDayYanPanUpUp;

import java.util.List;

public interface StockDayYanPanUpUpService extends IService<StockDayYanPanUpUp> {
    List<StockDayYanPanUpUp> selectBySelective(StockDayYanPanUpUp stockDayYanPanUpUp);

    int insertSelective(StockDayYanPanUpUp record);

    int updateBySelective(StockDayYanPanUpUp record);
}
