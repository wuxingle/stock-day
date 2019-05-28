package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience0008;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StockDayScience0008Service extends IService<StockDayScience0008> {
    List<StockDayScience0008> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDayScience0008> selectByPage(Page<StockDayScience0008> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);
}
