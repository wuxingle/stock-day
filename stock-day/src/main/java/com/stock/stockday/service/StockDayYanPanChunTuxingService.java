package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayYanPan;
import com.stock.stockday.entity.StockDayYanPanChunTuxing;

import java.util.List;

public interface StockDayYanPanChunTuxingService extends IService<StockDayYanPanChunTuxing> {
    List<StockDayYanPanChunTuxing> selectBySelective(StockDayYanPanChunTuxing stockDayYanPanChunTuxing);

    int insertSelective(StockDayYanPanChunTuxing record);

    int updateBySelective(StockDayYanPanChunTuxing record);
}
