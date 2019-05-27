package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayFundFlow6011;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockDayFundFlow6011Mapper extends BaseMapper<StockDayFundFlow6011> {

    int insertSelective(StockDayFundFlow6011 record);

    int updateByPrimaryKeySelective(StockDayFundFlow6011 record);

}