package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience0001;
import com.stock.stockday.entity.StockDayScience3001;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StockDayScience3001Service extends IService<StockDayScience3001> {
    List<StockDayScience3001> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDayScience3001> selectByPage(Page<StockDayScience3001> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);
}
