package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayFundFlow6008;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockDayFundFlow6008Mapper extends BaseMapper<StockDayFundFlow6008> {

    int insertSelective(StockDayFundFlow6008 record);

    int updateByPrimaryKeySelective(StockDayFundFlow6008 record);

}