package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayFundFlow0027;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockDayFundFlow0027Mapper extends BaseMapper<StockDayFundFlow0027> {

    int insertSelective(StockDayFundFlow0027 record);

    int updateByPrimaryKeySelective(StockDayFundFlow0027 record);

}