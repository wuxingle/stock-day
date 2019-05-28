package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayYanPan24;
import com.stock.stockday.entity.StockDayYanPanDapan;
import com.stock.stockday.entity.StockDayYanPanDrlx;

import java.util.List;

public interface StockDayYanPanDrlxService extends IService<StockDayYanPanDrlx> {
    List<StockDayYanPanDrlx> selectBySelective(StockDayYanPanDrlx stockDayYanPanDrlx);

    int insertSelective(StockDayYanPanDrlx record);

    int updateBySelective(StockDayYanPanDrlx record);
}
