package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience0006;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StockDayScience0006Service extends IService<StockDayScience0006> {
    List<StockDayScience0006> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDayScience0006> selectByPage(Page<StockDayScience0006> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);
}
