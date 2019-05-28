package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience001;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StockDayScience001Service extends IService<StockDayScience001> {
    List<StockDayScience001> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDayScience001> selectByPage(Page<StockDayScience001> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);
}
