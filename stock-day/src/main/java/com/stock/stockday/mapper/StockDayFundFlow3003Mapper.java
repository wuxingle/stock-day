package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayFundFlow3003;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockDayFundFlow3003Mapper extends BaseMapper<StockDayFundFlow3003> {

    int insertSelective(StockDayFundFlow3003 record);

    int updateByPrimaryKeySelective(StockDayFundFlow3003 record);

}