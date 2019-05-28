package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDay0002;
import com.stock.stockday.entity.StockDay6014;

import java.util.List;

public interface StockDay6014Service extends IService<StockDay6014> {
    List<StockDay6014> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDay6014> selectByCodeAndExPage(Page<StockDay6014> page, String codeId, String codeEx);
}
