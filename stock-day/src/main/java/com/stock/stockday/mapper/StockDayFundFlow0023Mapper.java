package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayFundFlow0023;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockDayFundFlow0023Mapper extends BaseMapper<StockDayFundFlow0023> {

    int insertSelective(StockDayFundFlow0023 record);

    int updateByPrimaryKeySelective(StockDayFundFlow0023 record);

}