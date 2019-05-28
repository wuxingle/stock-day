package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience6008;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StockDayScience6008Service extends IService<StockDayScience6008> {
    List<StockDayScience6008> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDayScience6008> selectByPage(Page<StockDayScience6008> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);
}
