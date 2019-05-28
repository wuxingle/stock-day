package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDay0002;
import com.stock.stockday.entity.StockDay399;
import com.stock.stockday.entity.StockDay6008;

import java.util.List;

public interface StockDay6008Service extends IService<StockDay6008> {
    List<StockDay6008> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDay6008> selectByCodeAndExPage(Page<StockDay6008> page, String codeId, String codeEx);
}
