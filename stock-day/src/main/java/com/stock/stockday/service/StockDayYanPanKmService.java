package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayYanPan24;
import com.stock.stockday.entity.StockDayYanPanDrlx;
import com.stock.stockday.entity.StockDayYanPanKm;

import java.util.List;

public interface StockDayYanPanKmService extends IService<StockDayYanPanKm> {
    List<StockDayYanPanKm> selectBySelective(StockDayYanPanKm stockDayYanPanKm);

    int insertSelective(StockDayYanPanKm record);

    int updateBySelective(StockDayYanPanKm record);
}
