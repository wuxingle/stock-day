package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDay0002;
import com.stock.stockday.entity.StockDay3004;
import com.stock.stockday.entity.StockDay399;

import java.util.List;

public interface StockDay3004Service extends IService<StockDay3004> {
    List<StockDay3004> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDay3004> selectByCodeAndExPage(Page<StockDay3004> page, String codeId, String codeEx);
}
