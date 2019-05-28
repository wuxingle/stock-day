package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDay0002;
import com.stock.stockday.entity.StockDay0004;

import java.util.List;

public interface StockDay0004Service extends IService<StockDay0004> {
    List<StockDay0004> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDay0004> selectByCodeAndExPage(Page<StockDay0004> page, String codeId, String codeEx);
}
