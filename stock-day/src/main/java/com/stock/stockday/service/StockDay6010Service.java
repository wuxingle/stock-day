package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDay0002;
import com.stock.stockday.entity.StockDay6010;

import java.util.List;

public interface StockDay6010Service extends IService<StockDay6010> {
    List<StockDay6010> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDay6010> selectByCodeAndExPage(Page<StockDay6010> page, String codeId, String codeEx);
}
