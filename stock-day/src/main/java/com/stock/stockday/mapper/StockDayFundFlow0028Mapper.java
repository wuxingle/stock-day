package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayFundFlow0028;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockDayFundFlow0028Mapper extends BaseMapper<StockDayFundFlow0028> {

    int insertSelective(StockDayFundFlow0028 record);

    int updateByPrimaryKeySelective(StockDayFundFlow0028 record);

}