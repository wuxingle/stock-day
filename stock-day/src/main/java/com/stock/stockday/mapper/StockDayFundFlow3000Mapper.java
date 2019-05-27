package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayFundFlow3000;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockDayFundFlow3000Mapper extends BaseMapper<StockDayFundFlow3000> {

    int insertSelective(StockDayFundFlow3000 record);

    int updateByPrimaryKeySelective(StockDayFundFlow3000 record);

}