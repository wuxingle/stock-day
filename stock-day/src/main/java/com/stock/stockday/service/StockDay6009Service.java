package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDay0002;
import com.stock.stockday.entity.StockDay6009;

import java.util.List;

public interface StockDay6009Service extends IService<StockDay6009> {
    List<StockDay6009> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDay6009> selectByCodeAndExPage(Page<StockDay6009> page, String codeId, String codeEx);
}
