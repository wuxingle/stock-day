package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDay0002;
import com.stock.stockday.entity.StockDay0021;

import java.util.List;

public interface StockDay0021Service extends IService<StockDay0021> {
    List<StockDay0021> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDay0021> selectByCodeAndExPage(Page<StockDay0021> page, String codeId, String codeEx);
}
