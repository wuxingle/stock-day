package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayFundFlow0020;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockDayFundFlow0020Mapper extends BaseMapper<StockDayFundFlow0020> {

    int insertSelective(StockDayFundFlow0020 record);

    int updateByPrimaryKeySelective(StockDayFundFlow0020 record);

}