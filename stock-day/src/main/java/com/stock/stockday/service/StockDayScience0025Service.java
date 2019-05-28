package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience0025;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StockDayScience0025Service extends IService<StockDayScience0025> {
    List<StockDayScience0025> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDayScience0025> selectByPage(Page<StockDayScience0025> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);
}
