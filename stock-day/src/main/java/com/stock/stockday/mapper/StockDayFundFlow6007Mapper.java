package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayFundFlow6007;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockDayFundFlow6007Mapper extends BaseMapper<StockDayFundFlow6007> {

    int insertSelective(StockDayFundFlow6007 record);

    int updateByPrimaryKeySelective(StockDayFundFlow6007 record);

}