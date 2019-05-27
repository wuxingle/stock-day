package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayFundFlow6003;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockDayFundFlow6003Mapper extends BaseMapper<StockDayFundFlow6003> {

    int insertSelective(StockDayFundFlow6003 record);

    int updateByPrimaryKeySelective(StockDayFundFlow6003 record);

}