package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayYanPan24;
import com.stock.stockday.entity.StockDayYanPan33;

import java.util.List;

public interface StockDayYanPan33Service extends IService<StockDayYanPan33> {
    List<StockDayYanPan33> selectBySelective(StockDayYanPan33 stockDayYanPan33);

    int insertSelective(StockDayYanPan33 record);

    int updateBySelective(StockDayYanPan33 record);
}
