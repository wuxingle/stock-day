package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience6014;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StockDayScience6014Service extends IService<StockDayScience6014> {
    List<StockDayScience6014> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDayScience6014> selectByPage(Page<StockDayScience6014> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);
}
