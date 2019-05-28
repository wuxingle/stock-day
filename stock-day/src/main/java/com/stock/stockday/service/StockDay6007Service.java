package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDay0002;
import com.stock.stockday.entity.StockDay399;
import com.stock.stockday.entity.StockDay6007;

import java.util.List;

public interface StockDay6007Service extends IService<StockDay6007> {
    List<StockDay6007> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDay6007> selectByCodeAndExPage(Page<StockDay6007> page, String codeId, String codeEx);
}
