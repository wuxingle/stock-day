package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience0009;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StockDayScience0009Service extends IService<StockDayScience0009> {
    List<StockDayScience0009> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDayScience0009> selectByPage(Page<StockDayScience0009> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);
}
