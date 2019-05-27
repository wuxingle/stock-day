package com.stock.stockday.newService.list1;

import com.stock.stockday.vo.StockDayVo;

import java.io.IOException;
import java.util.List;

public interface ZhuHeListService {
    List<StockDayVo> getListDayStock24() throws IOException;

    List<StockDayVo> getListDayStock33() throws IOException;

    List<StockDayVo> getListDayStock42() throws IOException;

    List<StockDayVo> getListDayStockBenPan() throws IOException;
}
