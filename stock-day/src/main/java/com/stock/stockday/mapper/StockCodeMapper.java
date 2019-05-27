package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockCode;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StockCodeMapper extends BaseMapper<StockCode> {
    List<StockCode> getStockCodeList();

    int insert(StockCode record);

    int insertSelective(StockCode record);
}