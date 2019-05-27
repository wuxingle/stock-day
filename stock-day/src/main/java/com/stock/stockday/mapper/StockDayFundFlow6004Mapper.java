package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayFundFlow6004;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockDayFundFlow6004Mapper extends BaseMapper<StockDayFundFlow6004> {

    int insertSelective(StockDayFundFlow6004 record);

    int updateByPrimaryKeySelective(StockDayFundFlow6004 record);

}