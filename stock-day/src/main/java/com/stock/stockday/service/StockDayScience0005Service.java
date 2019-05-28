package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience0005;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StockDayScience0005Service extends IService<StockDayScience0005> {
    List<StockDayScience0005> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDayScience0005> selectByPage(Page<StockDayScience0005> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);
}
