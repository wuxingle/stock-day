package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDay0002;
import com.stock.stockday.entity.StockDay6003;

import java.util.List;

public interface StockDay6003Service extends IService<StockDay6003> {
    List<StockDay6003> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDay6003> selectByCodeAndExPage(Page<StockDay6003> page, String codeId, String codeEx);
}
