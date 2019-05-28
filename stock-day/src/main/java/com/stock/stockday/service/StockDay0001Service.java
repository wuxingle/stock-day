package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay0001;

import java.util.List;

public interface StockDay0001Service extends IService<StockDay0001> {
    List<StockDay0001> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDay0001> selectByCodeAndExPage(Page<StockDay0001> page, String codeId, String codeEx);
}
