package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayYanPan;

import java.util.List;

public interface StockDayYanPanService extends IService<StockDayYanPan> {
    List<StockDayYanPan> selectBySelective(StockDayYanPan stockDayYanPan);

    int insertSelective(StockDayYanPan record);

    int updateBySelective(StockDayYanPan record);
}
