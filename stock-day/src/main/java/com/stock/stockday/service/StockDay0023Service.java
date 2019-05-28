package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDay0002;
import com.stock.stockday.entity.StockDay0023;

import java.util.List;

public interface StockDay0023Service extends IService<StockDay0023> {
    List<StockDay0023> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDay0023> selectByCodeAndExPage(Page<StockDay0023> page, String codeId, String codeEx);
}
