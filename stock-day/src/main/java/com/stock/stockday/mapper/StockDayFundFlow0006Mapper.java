package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayFundFlow0006;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockDayFundFlow0006Mapper extends BaseMapper<StockDayFundFlow0006> {

    int insertSelective(StockDayFundFlow0006 record);

    int updateByPrimaryKeySelective(StockDayFundFlow0006 record);

}