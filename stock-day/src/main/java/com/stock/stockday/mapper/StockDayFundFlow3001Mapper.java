package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayFundFlow3001;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockDayFundFlow3001Mapper extends BaseMapper<StockDayFundFlow3001> {

    int insertSelective(StockDayFundFlow3001 record);

    int updateByPrimaryKeySelective(StockDayFundFlow3001 record);

}