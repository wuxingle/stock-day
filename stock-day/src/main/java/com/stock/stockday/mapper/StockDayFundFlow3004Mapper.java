package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayFundFlow3004;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockDayFundFlow3004Mapper extends BaseMapper<StockDayFundFlow3004> {

    int insertSelective(StockDayFundFlow3004 record);

    int updateByPrimaryKeySelective(StockDayFundFlow3004 record);

}