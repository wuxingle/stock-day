package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayScience;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockDayScienceMapper extends BaseMapper<StockDayScience> {

    int insertSelective(StockDayScience record);

    int updateByPrimaryKeySelective(StockDayScience record);

}