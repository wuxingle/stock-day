package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDay0002;
import com.stock.stockday.entity.StockDay0026;

import java.util.List;

public interface StockDay0026Service extends IService<StockDay0026> {
    List<StockDay0026> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDay0026> selectByCodeAndExPage(Page<StockDay0026> page, String codeId, String codeEx);
}
