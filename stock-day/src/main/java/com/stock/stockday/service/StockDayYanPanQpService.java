package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayYanPan24;
import com.stock.stockday.entity.StockDayYanPanKm;
import com.stock.stockday.entity.StockDayYanPanQp;

import java.util.List;

public interface StockDayYanPanQpService extends IService<StockDayYanPanQp> {
    List<StockDayYanPanQp> selectBySelective(StockDayYanPanQp stockDayYanPanQp);

    int insertSelective(StockDayYanPanQp record);

    int updateBySelective(StockDayYanPanQp record);
}
