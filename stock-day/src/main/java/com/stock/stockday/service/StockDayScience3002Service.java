package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience0001;
import com.stock.stockday.entity.StockDayScience3002;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StockDayScience3002Service extends IService<StockDayScience3002> {
    List<StockDayScience3002> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDayScience3002> selectByPage(Page<StockDayScience3002> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);
}
