package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayFundFlow6001;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockDayFundFlow6001Mapper extends BaseMapper<StockDayFundFlow6001> {

    int insertSelective(StockDayFundFlow6001 record);

    int updateByPrimaryKeySelective(StockDayFundFlow6001 record);

}