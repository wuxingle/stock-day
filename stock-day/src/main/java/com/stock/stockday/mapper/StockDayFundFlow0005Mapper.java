package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayFundFlow0005;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockDayFundFlow0005Mapper extends BaseMapper<StockDayFundFlow0005> {

    int insertSelective(StockDayFundFlow0005 record);

    int updateByPrimaryKeySelective(StockDayFundFlow0005 record);

}