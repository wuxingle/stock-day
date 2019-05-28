package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience6016;
import com.stock.stockday.entity.StockDayScience6017;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StockDayScience6017Service extends IService<StockDayScience6017> {
    List<StockDayScience6017> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDayScience6017> selectByPage(Page<StockDayScience6017> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);
}
