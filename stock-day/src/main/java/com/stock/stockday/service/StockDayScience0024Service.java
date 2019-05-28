package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience0024;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StockDayScience0024Service extends IService<StockDayScience0024> {
    List<StockDayScience0024> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDayScience0024> selectByPage(Page<StockDayScience0024> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);
}
