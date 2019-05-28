package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDay0002;
import com.stock.stockday.entity.StockDay0008;

import java.util.List;

public interface StockDay0008Service extends IService<StockDay0008> {
    List<StockDay0008> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDay0008> selectByCodeAndExPage(Page<StockDay0008> page, String codeId, String codeEx);
}
