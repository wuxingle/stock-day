package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDay0002;
import com.stock.stockday.entity.StockDay0003;

import java.util.List;

public interface StockDay0003Service extends IService<StockDay0003> {
    List<StockDay0003> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDay0003> selectByCodeAndExPage(Page<StockDay0003> page, String codeId, String codeEx);
}
