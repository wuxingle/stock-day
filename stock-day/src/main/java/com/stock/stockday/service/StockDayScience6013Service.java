package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience6013;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StockDayScience6013Service extends IService<StockDayScience6013> {
    List<StockDayScience6013> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDayScience6013> selectByPage(Page<StockDayScience6013> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);
}
