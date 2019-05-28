package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience603;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StockDayScience603Service extends IService<StockDayScience603> {
    List<StockDayScience603> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDayScience603> selectByPage(Page<StockDayScience603> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);
}
