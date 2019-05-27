package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayFundFlow0007;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockDayFundFlow0007Mapper extends BaseMapper<StockDayFundFlow0007> {

    int insertSelective(StockDayFundFlow0007 record);

    int updateByPrimaryKeySelective(StockDayFundFlow0007 record);

}