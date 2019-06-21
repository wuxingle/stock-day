package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience399;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StockDayScience399Mapper extends BaseMapper<StockDayScience399> {
    List<StockDayScience399> selectByPage(Page<StockDayScience399> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);

    List<StockDayScience399> selectByCodeAndEx(@Param("codeId")String codeId, @Param("codeEx")String codeEx);

    int insertSelective(StockDayScience399 record);

    int updateByPrimaryKeySelective(StockDayScience399 record);

}