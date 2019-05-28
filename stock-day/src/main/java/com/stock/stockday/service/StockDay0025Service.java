package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDay0002;
import com.stock.stockday.entity.StockDay0025;

import java.util.List;

public interface StockDay0025Service extends IService<StockDay0025> {
    List<StockDay0025> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDay0025> selectByCodeAndExPage(Page<StockDay0025> page, String codeId, String codeEx);
}
