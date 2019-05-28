package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience6015;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StockDayScience6015Service extends IService<StockDayScience6015> {
    List<StockDayScience6015> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDayScience6015> selectByPage(Page<StockDayScience6015> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);
}
