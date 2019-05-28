package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience6011;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StockDayScience6011Service extends IService<StockDayScience6011> {
    List<StockDayScience6011> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDayScience6011> selectByPage(Page<StockDayScience6011> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);
}
