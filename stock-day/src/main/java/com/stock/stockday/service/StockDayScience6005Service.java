package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience6005;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StockDayScience6005Service extends IService<StockDayScience6005> {
    List<StockDayScience6005> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDayScience6005> selectByPage(Page<StockDayScience6005> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);
}
