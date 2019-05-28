package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience0027;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StockDayScience0027Service extends IService<StockDayScience0027> {
    List<StockDayScience0027> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDayScience0027> selectByPage(Page<StockDayScience0027> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);
}
