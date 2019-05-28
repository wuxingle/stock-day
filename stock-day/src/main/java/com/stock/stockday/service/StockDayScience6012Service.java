package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience6012;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StockDayScience6012Service extends IService<StockDayScience6012> {
    List<StockDayScience6012> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDayScience6012> selectByPage(Page<StockDayScience6012> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);
}
