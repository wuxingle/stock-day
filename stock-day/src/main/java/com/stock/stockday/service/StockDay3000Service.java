package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDay0002;
import com.stock.stockday.entity.StockDay3000;

import java.util.List;

public interface StockDay3000Service extends IService<StockDay3000> {
    List<StockDay3000> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDay3000> selectByCodeAndExPage(Page<StockDay3000> page, String codeId, String codeEx);
}
