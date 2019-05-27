package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayFundFlow6000;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockDayFundFlow6000Mapper extends BaseMapper<StockDayFundFlow6000> {

    int insertSelective(StockDayFundFlow6000 record);

    int updateByPrimaryKeySelective(StockDayFundFlow6000 record);

}