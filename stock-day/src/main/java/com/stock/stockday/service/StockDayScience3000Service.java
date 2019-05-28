package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience0001;
import com.stock.stockday.entity.StockDayScience3000;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StockDayScience3000Service extends IService<StockDayScience3000> {
    List<StockDayScience3000> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDayScience3000> selectByPage(Page<StockDayScience3000> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);
}
