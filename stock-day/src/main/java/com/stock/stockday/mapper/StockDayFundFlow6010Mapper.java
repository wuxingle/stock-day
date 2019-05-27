package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayFundFlow6010;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockDayFundFlow6010Mapper extends BaseMapper<StockDayFundFlow6010> {

    int insertSelective(StockDayFundFlow6010 record);

    int updateByPrimaryKeySelective(StockDayFundFlow6010 record);

}