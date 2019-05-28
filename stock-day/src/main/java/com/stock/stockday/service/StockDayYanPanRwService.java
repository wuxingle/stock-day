package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayYanPan24;
import com.stock.stockday.entity.StockDayYanPanQp;
import com.stock.stockday.entity.StockDayYanPanRw;

import java.util.List;

public interface StockDayYanPanRwService extends IService<StockDayYanPanRw> {
    List<StockDayYanPanRw> selectBySelective(StockDayYanPanRw stockDayYanPanRw);

    int insertSelective(StockDayYanPanRw record);

    int updateBySelective(StockDayYanPanRw record);
}
