package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDay0002;
import com.stock.stockday.entity.StockDay3001;

import java.util.List;

public interface StockDay3001Service extends IService<StockDay3001> {
    List<StockDay3001> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDay3001> selectByCodeAndExPage(Page<StockDay3001> page, String codeId, String codeEx);
}
