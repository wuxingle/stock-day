package com.stock.stockday.service.list;

import com.stock.stockday.vo.StockDayVo;

import java.io.IOException;
import java.util.List;

public interface ListStockService {
    List<StockDayVo> getListStock() throws IOException;

    List<StockDayVo> getZhuYanJiShuList() throws IOException;

    List<StockDayVo> getChunTuXingList() throws IOException;

    List<StockDayVo> getChunJiShuList() throws IOException;

    List<StockDayVo> getAllCommonList() throws IOException;

}
