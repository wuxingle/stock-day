package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDay0002;
import com.stock.stockday.entity.StockDay0027;

import java.util.List;

public interface StockDay0027Service extends IService<StockDay0027> {
    List<StockDay0027> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDay0027> selectByCodeAndExPage(Page<StockDay0027> page, String codeId, String codeEx);
}
