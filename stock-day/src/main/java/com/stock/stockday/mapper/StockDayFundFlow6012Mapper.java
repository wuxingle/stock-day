package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayFundFlow6012;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockDayFundFlow6012Mapper extends BaseMapper<StockDayFundFlow6012> {

    int insertSelective(StockDayFundFlow6012 record);

    int updateByPrimaryKeySelective(StockDayFundFlow6012 record);

}