package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayFundFlow6014;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockDayFundFlow6014Mapper extends BaseMapper<StockDayFundFlow6014> {

    int insertSelective(StockDayFundFlow6014 record);

    int updateByPrimaryKeySelective(StockDayFundFlow6014 record);

}