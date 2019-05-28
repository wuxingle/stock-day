package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience0003;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StockDayScience0003Service extends IService<StockDayScience0003> {
    List<StockDayScience0003> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDayScience0003> selectByPage(Page<StockDayScience0003> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);
}
