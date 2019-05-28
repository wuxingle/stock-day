package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience6016;
import com.stock.stockday.entity.StockDayScience6019;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StockDayScience6019Service extends IService<StockDayScience6019> {
    List<StockDayScience6019> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDayScience6019> selectByPage(Page<StockDayScience6019> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);
}
