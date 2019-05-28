package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience0023;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StockDayScience0023Service extends IService<StockDayScience0023> {
    List<StockDayScience0023> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDayScience0023> selectByPage(Page<StockDayScience0023> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);
}
