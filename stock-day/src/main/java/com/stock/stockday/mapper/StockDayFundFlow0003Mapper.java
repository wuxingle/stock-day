package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayFundFlow0003;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockDayFundFlow0003Mapper extends BaseMapper<StockDayFundFlow0003> {

    int insertSelective(StockDayFundFlow0003 record);

    int updateByPrimaryKeySelective(StockDayFundFlow0003 record);

}