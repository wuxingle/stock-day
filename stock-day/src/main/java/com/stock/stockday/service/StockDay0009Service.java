package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDay0002;
import com.stock.stockday.entity.StockDay0009;

import java.util.List;

public interface StockDay0009Service extends IService<StockDay0009> {
    List<StockDay0009> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDay0009> selectByCodeAndExPage(Page<StockDay0009> page, String codeId, String codeEx);
}
