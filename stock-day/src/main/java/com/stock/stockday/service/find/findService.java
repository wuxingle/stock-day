package com.stock.stockday.service.find;

import com.stock.stockday.vo.StockDayVo;

import java.util.List;

public interface findService {
    List<StockDayVo> duoTuXiangShang();

    List<StockDayVo> shengV();

    List<StockDayVo> reset20();

    List<StockDayVo> jieQi();

    List<StockDayVo> jishujieqi();

    List<StockDayVo> jishujieqi1();

    List<StockDayVo> jieQi2();
}
