package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience6003;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StockDayScience6003Service extends IService<StockDayScience6003> {
    List<StockDayScience6003> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDayScience6003> selectByPage(Page<StockDayScience6003> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);
}
