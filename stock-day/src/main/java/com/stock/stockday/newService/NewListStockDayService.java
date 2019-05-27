package com.stock.stockday.newService;

import com.stock.stockday.vo.StockDayVo;

import java.io.IOException;
import java.util.List;

public interface NewListStockDayService {
    List<StockDayVo> getListDayStockKmqd() throws IOException;

    List<StockDayVo> getListDayStockKmQr() throws IOException;

    List<StockDayVo> getListDayStockQtuXing() throws IOException;

    List<StockDayVo> getListDayStockKTu20LS() throws IOException;
}
