package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayFundFlow0021;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockDayFundFlow0021Mapper extends BaseMapper<StockDayFundFlow0021> {

    int insertSelective(StockDayFundFlow0021 record);

    int updateByPrimaryKeySelective(StockDayFundFlow0021 record);

}