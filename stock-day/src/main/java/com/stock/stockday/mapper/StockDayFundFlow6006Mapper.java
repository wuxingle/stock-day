package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayFundFlow6006;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockDayFundFlow6006Mapper extends BaseMapper<StockDayFundFlow6006> {

    int insertSelective(StockDayFundFlow6006 record);

    int updateByPrimaryKeySelective(StockDayFundFlow6006 record);

}