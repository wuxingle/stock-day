package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayFundFlow;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockDayFundFlowMapper extends BaseMapper<StockDayFundFlow> {

    int insertSelective(StockDayFundFlow record);

    int updateByPrimaryKeySelective(StockDayFundFlow record);

}