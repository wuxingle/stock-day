package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience6016;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StockDayScience6016Service extends IService<StockDayScience6016> {
    List<StockDayScience6016> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDayScience6016> selectByPage(Page<StockDayScience6016> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);
}
