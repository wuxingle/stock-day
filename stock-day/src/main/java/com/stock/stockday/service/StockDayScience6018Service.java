package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience6016;
import com.stock.stockday.entity.StockDayScience6018;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StockDayScience6018Service extends IService<StockDayScience6018> {
    List<StockDayScience6018> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDayScience6018> selectByPage(Page<StockDayScience6018> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);
}
