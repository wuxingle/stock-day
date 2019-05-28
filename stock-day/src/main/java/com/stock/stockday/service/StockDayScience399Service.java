package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience399;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StockDayScience399Service extends IService<StockDayScience399> {
    List<StockDayScience399> selectByPage(Page<StockDayScience399> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);
}
