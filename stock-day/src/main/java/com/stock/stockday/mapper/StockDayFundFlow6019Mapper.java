package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayFundFlow6019;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockDayFundFlow6019Mapper extends BaseMapper<StockDayFundFlow6019> {

    int insertSelective(StockDayFundFlow6019 record);

    int updateByPrimaryKeySelective(StockDayFundFlow6019 record);

}