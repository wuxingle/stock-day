package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDay0002;
import com.stock.stockday.entity.StockDay0022;

import java.util.List;

public interface StockDay0022Service extends IService<StockDay0022> {
    List<StockDay0022> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDay0022> selectByCodeAndExPage(Page<StockDay0022> page, String codeId, String codeEx);
}
