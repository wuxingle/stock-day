package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDay0002;
import com.stock.stockday.entity.StockDay399;
import com.stock.stockday.entity.StockDay6001;

import java.util.List;

public interface StockDay6001Service extends IService<StockDay6001> {
    List<StockDay6001> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDay6001> selectByCodeAndExPage(Page<StockDay6001> page, String codeId, String codeEx);
}
