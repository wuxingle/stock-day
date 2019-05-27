package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayFundFlow0025;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockDayFundFlow0025Mapper extends BaseMapper<StockDayFundFlow0025> {

    int insertSelective(StockDayFundFlow0025 record);

    int updateByPrimaryKeySelective(StockDayFundFlow0025 record);

}