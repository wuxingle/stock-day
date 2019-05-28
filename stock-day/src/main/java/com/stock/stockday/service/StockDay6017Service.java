package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDay0002;
import com.stock.stockday.entity.StockDay6017;

import java.util.List;

public interface StockDay6017Service extends IService<StockDay6017> {
    List<StockDay6017> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDay6017> selectByCodeAndExPage(Page<StockDay6017> page, String codeId, String codeEx);
}
