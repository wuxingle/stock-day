package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayFundFlow6009;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockDayFundFlow6009Mapper extends BaseMapper<StockDayFundFlow6009> {

    int insertSelective(StockDayFundFlow6009 record);

    int updateByPrimaryKeySelective(StockDayFundFlow6009 record);

}