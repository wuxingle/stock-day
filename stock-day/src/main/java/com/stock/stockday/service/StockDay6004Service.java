package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDay0002;
import com.stock.stockday.entity.StockDay6004;

import java.util.List;

public interface StockDay6004Service extends IService<StockDay6004> {
    List<StockDay6004> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDay6004> selectByCodeAndExPage(Page<StockDay6004> page, String codeId, String codeEx);
}
