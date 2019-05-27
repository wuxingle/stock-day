package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayFundFlow6005;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockDayFundFlow6005Mapper extends BaseMapper<StockDayFundFlow6005> {

    int insertSelective(StockDayFundFlow6005 record);

    int updateByPrimaryKeySelective(StockDayFundFlow6005 record);

}