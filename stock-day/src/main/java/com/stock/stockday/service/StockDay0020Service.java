package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDay0002;
import com.stock.stockday.entity.StockDay0020;

import java.util.List;

public interface StockDay0020Service extends IService<StockDay0020> {
    List<StockDay0020> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDay0020> selectByCodeAndExPage(Page<StockDay0020> page, String codeId, String codeEx);
}
