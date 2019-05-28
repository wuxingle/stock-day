package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience0001;
import com.stock.stockday.entity.StockDayScience3005;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StockDayScience3005Service extends IService<StockDayScience3005> {
    List<StockDayScience3005> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDayScience3005> selectByPage(Page<StockDayScience3005> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);
}
