package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayYanPan24;
import com.stock.stockday.entity.StockDayYanPanBenpan;
import com.stock.stockday.entity.StockDayYanPanDapan;

import java.util.List;

public interface StockDayYanPanDapanService extends IService<StockDayYanPanDapan> {
    List<StockDayYanPanDapan> selectBySelective(StockDayYanPanDapan stockDayYanPanDapan);

    int insertSelective(StockDayYanPanDapan record);

    int updateBySelective(StockDayYanPanDapan record);
}
