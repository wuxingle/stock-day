package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience6009;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StockDayScience6009Service extends IService<StockDayScience6009> {
    List<StockDayScience6009> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDayScience6009> selectByPage(Page<StockDayScience6009> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);
}
