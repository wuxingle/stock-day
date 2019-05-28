package com.stock.stockday.service.find;

import com.stock.stockday.vo.StockDayVo;

import java.util.List;

public interface findService {
    List<StockDayVo> duoTuXiangShang();

    List<StockDayVo> shengV();

    List<StockDayVo> reset20();
}
