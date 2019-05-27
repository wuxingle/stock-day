package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayFundFlow6015;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockDayFundFlow6015Mapper extends BaseMapper<StockDayFundFlow6015> {

    int insertSelective(StockDayFundFlow6015 record);

    int updateByPrimaryKeySelective(StockDayFundFlow6015 record);

}