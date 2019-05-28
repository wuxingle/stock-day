package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDay0002;
import com.stock.stockday.entity.StockDay399;
import com.stock.stockday.entity.StockDay6012;

import java.util.List;

public interface StockDay6012Service extends IService<StockDay6012> {
    List<StockDay6012> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDay6012> selectByCodeAndExPage(Page<StockDay6012> page, String codeId, String codeEx);
}
