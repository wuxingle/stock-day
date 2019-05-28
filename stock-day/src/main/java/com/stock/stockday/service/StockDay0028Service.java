package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDay0002;
import com.stock.stockday.entity.StockDay0028;

import java.util.List;

public interface StockDay0028Service extends IService<StockDay0028> {
    List<StockDay0028> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDay0028> selectByCodeAndExPage(Page<StockDay0028> page, String codeId, String codeEx);
}
