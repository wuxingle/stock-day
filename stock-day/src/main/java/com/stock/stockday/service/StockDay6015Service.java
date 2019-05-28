package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDay0002;
import com.stock.stockday.entity.StockDay399;
import com.stock.stockday.entity.StockDay6015;

import java.util.List;

public interface StockDay6015Service extends IService<StockDay6015> {
    List<StockDay6015> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDay6015> selectByCodeAndExPage(Page<StockDay6015> page, String codeId, String codeEx);
}
