package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience0002;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StockDayScience0002Service extends IService<StockDayScience0002> {
    List<StockDayScience0002> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDayScience0002> selectByPage(Page<StockDayScience0002> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);
}
