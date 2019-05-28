package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay001;

import java.util.List;

public interface StockDay001Service extends IService<StockDay001> {
    List<StockDay001> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDay001> selectByCodeAndExPage(Page<StockDay001> page, String codeId, String codeEx);
}
