package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayFundFlow0004;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockDayFundFlow0004Mapper extends BaseMapper<StockDayFundFlow0004> {

    int insertSelective(StockDayFundFlow0004 record);

    int updateByPrimaryKeySelective(StockDayFundFlow0004 record);

}