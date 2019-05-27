package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayFundFlow0002;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockDayFundFlow0002Mapper extends BaseMapper<StockDayFundFlow0002> {

    int insertSelective(StockDayFundFlow0002 record);

    int updateByPrimaryKeySelective(StockDayFundFlow0002 record);

}