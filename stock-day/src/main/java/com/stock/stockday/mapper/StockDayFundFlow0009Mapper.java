package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayFundFlow0009;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockDayFundFlow0009Mapper extends BaseMapper<StockDayFundFlow0009> {

    int insertSelective(StockDayFundFlow0009 record);

    int updateByPrimaryKeySelective(StockDayFundFlow0009 record);

}