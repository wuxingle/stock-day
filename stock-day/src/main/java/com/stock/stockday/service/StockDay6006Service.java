package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDay0002;
import com.stock.stockday.entity.StockDay399;
import com.stock.stockday.entity.StockDay6006;

import java.util.List;

public interface StockDay6006Service extends IService<StockDay6006> {
    List<StockDay6006> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDay6006> selectByCodeAndExPage(Page<StockDay6006> page, String codeId, String codeEx);
}
