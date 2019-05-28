package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayYanPan24;
import com.stock.stockday.entity.StockDayYanPan42;
import com.stock.stockday.entity.StockDayYanPanBenpan;

import java.util.List;

public interface StockDayYanPanBenpanService extends IService<StockDayYanPanBenpan> {
    List<StockDayYanPanBenpan> selectBySelective(StockDayYanPanBenpan stockDayYanPanBenpan);

    int insertSelective(StockDayYanPanBenpan record);

    int updateBySelective(StockDayYanPanBenpan record);
}
