package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayYanPan;
import com.stock.stockday.entity.StockDayYanPanTuxing;
import com.stock.stockday.entity.StockDayYanPanZhuyao;

import java.util.List;

public interface StockDayYanPanZhuyaoService extends IService<StockDayYanPanZhuyao> {
    List<StockDayYanPanZhuyao> selectBySelective(StockDayYanPanZhuyao stockDayYanPanZhuyao);

    int insertSelective(StockDayYanPanZhuyao record);

    int updateBySelective(StockDayYanPanZhuyao record);
}
