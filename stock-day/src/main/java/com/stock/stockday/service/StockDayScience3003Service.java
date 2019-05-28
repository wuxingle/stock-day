package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience0001;
import com.stock.stockday.entity.StockDayScience3003;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StockDayScience3003Service extends IService<StockDayScience3003> {
    List<StockDayScience3003> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDayScience3003> selectByPage(Page<StockDayScience3003> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);
}
