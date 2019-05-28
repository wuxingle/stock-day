package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience0001;
import com.stock.stockday.entity.StockDayScience6001;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StockDayScience6001Service extends IService<StockDayScience6001> {
    List<StockDayScience6001> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDayScience6001> selectByPage(Page<StockDayScience6001> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);
}
