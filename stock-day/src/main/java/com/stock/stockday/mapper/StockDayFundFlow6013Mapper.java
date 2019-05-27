package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayFundFlow6013;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockDayFundFlow6013Mapper extends BaseMapper<StockDayFundFlow6013> {

    int insertSelective(StockDayFundFlow6013 record);

    int updateByPrimaryKeySelective(StockDayFundFlow6013 record);

}