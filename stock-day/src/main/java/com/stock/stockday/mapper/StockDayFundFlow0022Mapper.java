package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayFundFlow0022;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockDayFundFlow0022Mapper extends BaseMapper<StockDayFundFlow0022> {

    int insertSelective(StockDayFundFlow0022 record);

    int updateByPrimaryKeySelective(StockDayFundFlow0022 record);

}