package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDay0002;
import com.stock.stockday.entity.StockDay6011;

import java.util.List;

public interface StockDay6011Service extends IService<StockDay6011> {
    List<StockDay6011> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDay6011> selectByCodeAndExPage(Page<StockDay6011> page, String codeId, String codeEx);
}
