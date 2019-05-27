package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayFundFlow6018;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockDayFundFlow6018Mapper extends BaseMapper<StockDayFundFlow6018> {

    int insertSelective(StockDayFundFlow6018 record);

    int updateByPrimaryKeySelective(StockDayFundFlow6018 record);

}