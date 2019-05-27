package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayFundFlow399;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockDayFundFlow399Mapper extends BaseMapper<StockDayFundFlow399> {

    int insertSelective(StockDayFundFlow399 record);

    int updateByPrimaryKeySelective(StockDayFundFlow399 record);

}