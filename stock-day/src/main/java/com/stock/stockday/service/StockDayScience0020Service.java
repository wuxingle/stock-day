package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience0020;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StockDayScience0020Service extends IService<StockDayScience0020> {
    List<StockDayScience0020> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDayScience0020> selectByPage(Page<StockDayScience0020> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);
}
