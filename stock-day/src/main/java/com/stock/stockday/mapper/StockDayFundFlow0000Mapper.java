package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayFundFlow0000;
import com.stock.stockday.entity.StockDayFundFlow0001;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockDayFundFlow0000Mapper extends BaseMapper<StockDayFundFlow0000> {

    int insertSelective(StockDayFundFlow0000 record);

    int updateByPrimaryKeySelective(StockDayFundFlow0000 record);

}