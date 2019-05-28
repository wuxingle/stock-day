package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDay0002;
import com.stock.stockday.entity.StockDay399;
import com.stock.stockday.entity.StockDay603;

import java.util.List;

public interface StockDay603Service extends IService<StockDay603> {
    List<StockDay603> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDay603> selectByCodeAndExPage(Page<StockDay603> page, String codeId, String codeEx);
}
