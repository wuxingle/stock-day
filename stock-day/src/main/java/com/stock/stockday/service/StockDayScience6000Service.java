package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience0001;
import com.stock.stockday.entity.StockDayScience6000;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StockDayScience6000Service extends IService<StockDayScience6000> {
    List<StockDayScience6000> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDayScience6000> selectByPage(Page<StockDayScience6000> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);
}
