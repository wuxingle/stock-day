package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayYanPan;
import com.stock.stockday.entity.StockDayYanPan24;

import java.util.List;

public interface StockDayYanPan24Service extends IService<StockDayYanPan24> {
    List<StockDayYanPan24> selectBySelective(StockDayYanPan24 stockDayYanPan24);

    int insertSelective(StockDayYanPan24 record);

    int updateBySelective(StockDayYanPan24 record);
}
