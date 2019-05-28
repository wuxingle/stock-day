package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayYanPan;
import com.stock.stockday.entity.StockDayYanPanJishu;
import com.stock.stockday.entity.StockDayYanPanTuxing;

import java.util.List;

public interface StockDayYanPanTuxingService extends IService<StockDayYanPanTuxing> {
    List<StockDayYanPanTuxing> selectBySelective(StockDayYanPanTuxing stockDayYanPanTuxing);

    int insertSelective(StockDayYanPanTuxing record);

    int updateBySelective(StockDayYanPanTuxing record);
}
