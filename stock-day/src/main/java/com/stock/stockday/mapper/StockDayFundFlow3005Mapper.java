package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayFundFlow3005;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockDayFundFlow3005Mapper extends BaseMapper<StockDayFundFlow3005> {

    int insertSelective(StockDayFundFlow3005 record);

    int updateByPrimaryKeySelective(StockDayFundFlow3005 record);

}