package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDay0002;
import com.stock.stockday.entity.StockDay0024;

import java.util.List;

public interface StockDay0024Service extends IService<StockDay0024> {
    List<StockDay0024> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDay0024> selectByCodeAndExPage(Page<StockDay0024> page, String codeId, String codeEx);
}
