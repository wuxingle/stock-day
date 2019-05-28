package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDay0002;
import com.stock.stockday.entity.StockDay3005;
import com.stock.stockday.entity.StockDay399;

import java.util.List;

public interface StockDay3005Service extends IService<StockDay3005> {
    List<StockDay3005> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDay3005> selectByCodeAndExPage(Page<StockDay3005> page, String codeId, String codeEx);
}
