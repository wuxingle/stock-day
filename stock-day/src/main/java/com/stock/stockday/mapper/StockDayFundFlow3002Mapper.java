package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayFundFlow3002;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockDayFundFlow3002Mapper extends BaseMapper<StockDayFundFlow3002> {

    int insertSelective(StockDayFundFlow3002 record);

    int updateByPrimaryKeySelective(StockDayFundFlow3002 record);

}