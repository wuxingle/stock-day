package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience6010;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StockDayScience6010Service extends IService<StockDayScience6010> {
    List<StockDayScience6010> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDayScience6010> selectByPage(Page<StockDayScience6010> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);
}
