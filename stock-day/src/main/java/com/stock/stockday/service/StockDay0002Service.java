package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay0002;

import java.util.List;

public interface StockDay0002Service extends IService<StockDay0002> {
    List<StockDay0002> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDay0002> selectByCodeAndExPage(Page<StockDay0002> page, String codeId, String codeEx);
}
