package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDay0002;
import com.stock.stockday.entity.StockDay3002;

import java.util.List;

public interface StockDay3002Service extends IService<StockDay3002> {
    List<StockDay3002> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDay3002> selectByCodeAndExPage(Page<StockDay3002> page, String codeId, String codeEx);
}
