package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience0004;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StockDayScience0004Service extends IService<StockDayScience0004> {
    List<StockDayScience0004> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDayScience0004> selectByPage(Page<StockDayScience0004> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);
}
