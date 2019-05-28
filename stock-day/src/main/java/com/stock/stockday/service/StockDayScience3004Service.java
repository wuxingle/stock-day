package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience0001;
import com.stock.stockday.entity.StockDayScience3004;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StockDayScience3004Service extends IService<StockDayScience3004> {
    List<StockDayScience3004> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDayScience3004> selectByPage(Page<StockDayScience3004> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);
}
