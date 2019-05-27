package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayFundFlow0008;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockDayFundFlow0008Mapper extends BaseMapper<StockDayFundFlow0008> {

    int insertSelective(StockDayFundFlow0008 record);

    int updateByPrimaryKeySelective(StockDayFundFlow0008 record);

}