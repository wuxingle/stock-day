package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayFundFlow0024;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockDayFundFlow0024Mapper extends BaseMapper<StockDayFundFlow0024> {

    int insertSelective(StockDayFundFlow0024 record);

    int updateByPrimaryKeySelective(StockDayFundFlow0024 record);

}