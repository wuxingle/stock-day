package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience0028;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StockDayScience0028Service extends IService<StockDayScience0028> {
    List<StockDayScience0028> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDayScience0028> selectByPage(Page<StockDayScience0028> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);
}
