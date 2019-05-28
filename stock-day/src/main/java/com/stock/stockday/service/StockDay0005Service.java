package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDay0001;
import com.stock.stockday.entity.StockDay0002;
import com.stock.stockday.entity.StockDay0005;

import java.util.List;

public interface StockDay0005Service extends IService<StockDay0005> {
    List<StockDay0005> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDay0005> selectByCodeAndExPage(Page<StockDay0005> page, String codeId, String codeEx);
}
