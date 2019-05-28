package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience6002;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StockDayScience6002Service extends IService<StockDayScience6002> {
    List<StockDayScience6002> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDayScience6002> selectByPage(Page<StockDayScience6002> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);
}
