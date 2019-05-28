package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDay0002;
import com.stock.stockday.entity.StockDay399;
import com.stock.stockday.entity.StockDay6005;

import java.util.List;

public interface StockDay6005Service extends IService<StockDay6005> {
    List<StockDay6005> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDay6005> selectByCodeAndExPage(Page<StockDay6005> page, String codeId, String codeEx);
}
