package com.stock.stockday.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience0001;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StockDayScience0000Service extends IService<StockDayScience0000> {
    List<StockDayScience0000> selectByCodeAndEx(String codeId, String codeEx);
    List<StockDayScience0000> selectByPage(Page<StockDayScience0000> page,String codeId,String codeEx);
}
