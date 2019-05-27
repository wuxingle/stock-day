package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayFundFlow6002;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockDayFundFlow6002Mapper extends BaseMapper<StockDayFundFlow6002> {

    int insertSelective(StockDayFundFlow6002 record);

    int updateByPrimaryKeySelective(StockDayFundFlow6002 record);

}