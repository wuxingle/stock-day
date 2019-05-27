package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayFundFlow001;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockDayFundFlow001Mapper extends BaseMapper<StockDayFundFlow001> {

    int insertSelective(StockDayFundFlow001 record);

    int updateByPrimaryKeySelective(StockDayFundFlow001 record);

}