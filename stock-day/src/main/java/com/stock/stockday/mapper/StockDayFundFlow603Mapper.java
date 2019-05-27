package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayFundFlow603;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockDayFundFlow603Mapper extends BaseMapper<StockDayFundFlow603> {

    int insertSelective(StockDayFundFlow603 record);

    int updateByPrimaryKeySelective(StockDayFundFlow603 record);

}