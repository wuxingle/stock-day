package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayYanPan;
import com.stock.stockday.entity.StockDayYanPanChunJishu;
import com.stock.stockday.entity.StockDayYanPanChunTuxing;

import java.util.List;

public interface StockDayYanPanChunJishuService extends IService<StockDayYanPanChunJishu> {
    List<StockDayYanPanChunJishu> selectBySelective(StockDayYanPanChunJishu stockDayYanPanChunJishu);

    int insertSelective(StockDayYanPanChunJishu record);

    int updateBySelective(StockDayYanPanChunJishu record);
}
