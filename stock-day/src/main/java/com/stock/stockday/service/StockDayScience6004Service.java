package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience6004;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StockDayScience6004Service extends IService<StockDayScience6004> {
    List<StockDayScience6004> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDayScience6004> selectByPage(Page<StockDayScience6004> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);
}
