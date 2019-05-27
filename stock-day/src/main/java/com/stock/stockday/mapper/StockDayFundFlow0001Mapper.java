package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayFundFlow0001;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockDayFundFlow0001Mapper extends BaseMapper<StockDayFundFlow0001> {

    int insertSelective(StockDayFundFlow0001 record);

    int updateByPrimaryKeySelective(StockDayFundFlow0001 record);

}