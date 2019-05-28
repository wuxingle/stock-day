package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience6006;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StockDayScience6006Service extends IService<StockDayScience6006> {
    List<StockDayScience6006> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDayScience6006> selectByPage(Page<StockDayScience6006> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);
}
