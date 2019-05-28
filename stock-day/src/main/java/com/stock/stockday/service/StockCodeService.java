package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockCode;

import java.util.List;

public interface StockCodeService extends IService<StockCode> {
    List<StockCode> getStockCodeList();
}
