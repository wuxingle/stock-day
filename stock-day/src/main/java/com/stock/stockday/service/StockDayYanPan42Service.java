package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayYanPan24;
import com.stock.stockday.entity.StockDayYanPan33;
import com.stock.stockday.entity.StockDayYanPan42;

import java.util.List;

public interface StockDayYanPan42Service extends IService<StockDayYanPan42> {
    List<StockDayYanPan42> selectBySelective(StockDayYanPan42 stockDayYanPan42);

    int insertSelective(StockDayYanPan42 record);

    int updateBySelective(StockDayYanPan42 record);
}
