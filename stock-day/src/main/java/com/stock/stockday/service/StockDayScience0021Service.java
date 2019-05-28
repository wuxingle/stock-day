package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience0021;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StockDayScience0021Service extends IService<StockDayScience0021> {
    List<StockDayScience0021> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDayScience0021> selectByPage(Page<StockDayScience0021> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);
}
