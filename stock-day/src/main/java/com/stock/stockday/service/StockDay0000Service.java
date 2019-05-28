package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay0001;

import javax.xml.crypto.Data;
import java.util.List;

public interface StockDay0000Service extends IService<StockDay0000> {
    List<StockDay0000> selectByCodeAndEx(String codeId,String codeEx);

    List<StockDay0000> selectByCodeAndExPage(Page<StockDay0000> page, String codeId, String codeEx);
}
