package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDay0002;
import com.stock.stockday.entity.StockDay399;
import com.stock.stockday.entity.StockDay6002;

import java.util.List;

public interface StockDay6002Service extends IService<StockDay6002> {
    List<StockDay6002> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDay6002> selectByCodeAndExPage(Page<StockDay6002> page, String codeId, String codeEx);
}
