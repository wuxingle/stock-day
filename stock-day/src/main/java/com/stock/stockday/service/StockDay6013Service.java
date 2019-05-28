package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDay0002;
import com.stock.stockday.entity.StockDay6013;

import java.util.List;

public interface StockDay6013Service extends IService<StockDay6013> {
    List<StockDay6013> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDay6013> selectByCodeAndExPage(Page<StockDay6013> page, String codeId, String codeEx);
}
