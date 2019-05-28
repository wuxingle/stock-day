package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayYanPan;
import com.stock.stockday.entity.StockDayYanPanChunJishu;
import com.stock.stockday.entity.StockDayYanPanJishu;

import java.util.List;

public interface StockDayYanPanJishuService extends IService<StockDayYanPanJishu> {
    List<StockDayYanPanJishu> selectBySelective(StockDayYanPanJishu stockDayYanPanJishu);

    int insertSelective(StockDayYanPanJishu record);

    int updateBySelective(StockDayYanPanJishu record);
}
