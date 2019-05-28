package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience0026;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StockDayScience0026Service extends IService<StockDayScience0026> {
    List<StockDayScience0026> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDayScience0026> selectByPage(Page<StockDayScience0026> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);
}
