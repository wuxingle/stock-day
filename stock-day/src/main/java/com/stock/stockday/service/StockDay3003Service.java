package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDay0002;
import com.stock.stockday.entity.StockDay3003;

import java.util.List;

public interface StockDay3003Service extends IService<StockDay3003> {
    List<StockDay3003> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDay3003> selectByCodeAndExPage(Page<StockDay3003> page, String codeId, String codeEx);
}
