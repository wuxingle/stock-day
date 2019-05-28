package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDay0002;
import com.stock.stockday.entity.StockDay6018;

import java.util.List;

public interface StockDay6018Service extends IService<StockDay6018> {
    List<StockDay6018> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDay6018> selectByCodeAndExPage(Page<StockDay6018> page, String codeId, String codeEx);
}
