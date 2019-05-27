package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayFundFlow0026;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockDayFundFlow0026Mapper extends BaseMapper<StockDayFundFlow0026> {

    int insertSelective(StockDayFundFlow0026 record);

    int updateByPrimaryKeySelective(StockDayFundFlow0026 record);

}