package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDay0002;
import com.stock.stockday.entity.StockDay0006;

import java.util.List;

public interface StockDay0006Service extends IService<StockDay0006> {
    List<StockDay0006> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDay0006> selectByCodeAndExPage(Page<StockDay0006> page, String codeId, String codeEx);
}
