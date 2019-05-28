package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience6007;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StockDayScience6007Service extends IService<StockDayScience6007> {
    List<StockDayScience6007> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDayScience6007> selectByPage(Page<StockDayScience6007> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);
}
