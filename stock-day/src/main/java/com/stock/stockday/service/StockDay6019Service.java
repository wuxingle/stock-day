package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDay0002;
import com.stock.stockday.entity.StockDay6019;

import java.util.List;

public interface StockDay6019Service extends IService<StockDay6019> {
    List<StockDay6019> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDay6019> selectByCodeAndExPage(Page<StockDay6019> page, String codeId, String codeEx);
}
