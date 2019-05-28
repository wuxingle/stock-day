package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience0022;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StockDayScience0022Service extends IService<StockDayScience0022> {
    List<StockDayScience0022> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDayScience0022> selectByPage(Page<StockDayScience0022> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);
}
