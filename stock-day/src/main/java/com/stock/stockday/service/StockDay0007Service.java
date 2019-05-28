package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDay0002;
import com.stock.stockday.entity.StockDay0007;

import java.util.List;

public interface StockDay0007Service extends IService<StockDay0007> {
    List<StockDay0007> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDay0007> selectByCodeAndExPage(Page<StockDay0007> page, String codeId, String codeEx);
}
