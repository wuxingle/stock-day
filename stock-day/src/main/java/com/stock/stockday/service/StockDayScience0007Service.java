package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience0007;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StockDayScience0007Service extends IService<StockDayScience0007> {
    List<StockDayScience0007> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDayScience0007> selectByPage(Page<StockDayScience0007> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);
}
