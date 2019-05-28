package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDay0002;
import com.stock.stockday.entity.StockDay399;
import com.stock.stockday.entity.StockDay6016;

import java.util.List;

public interface StockDay6016Service extends IService<StockDay6016> {
    List<StockDay6016> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDay6016> selectByCodeAndExPage(Page<StockDay6016> page, String codeId, String codeEx);
}
