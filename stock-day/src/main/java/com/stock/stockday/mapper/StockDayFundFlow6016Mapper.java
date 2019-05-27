package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayFundFlow6016;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockDayFundFlow6016Mapper extends BaseMapper<StockDayFundFlow6016> {

    int insertSelective(StockDayFundFlow6016 record);

    int updateByPrimaryKeySelective(StockDayFundFlow6016 record);

}