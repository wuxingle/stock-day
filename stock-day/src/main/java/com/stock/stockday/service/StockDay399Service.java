package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDay0002;
import com.stock.stockday.entity.StockDay399;

import java.util.List;

public interface StockDay399Service extends IService<StockDay399> {
    List<StockDay399> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDay399> selectByCodeAndExPage(Page<StockDay399> page, String codeId, String codeEx);
}
