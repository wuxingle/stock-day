package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayFundFlow6017;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockDayFundFlow6017Mapper extends BaseMapper<StockDayFundFlow6017> {

    int insertSelective(StockDayFundFlow6017 record);

    int updateByPrimaryKeySelective(StockDayFundFlow6017 record);

}