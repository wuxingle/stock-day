package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDay0002;
import com.stock.stockday.entity.StockDay399;
import com.stock.stockday.entity.StockDay6000;

import java.util.List;

public interface StockDay6000Service extends IService<StockDay6000> {
    List<StockDay6000> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDay6000> selectByCodeAndExPage(Page<StockDay6000> page, String codeId, String codeEx);
}
