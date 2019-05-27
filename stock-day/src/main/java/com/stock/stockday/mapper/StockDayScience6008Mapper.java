package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience6008;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StockDayScience6008Mapper extends BaseMapper<StockDayScience6008> {
    List<StockDayScience6008> selectByCodeAndEx(@Param("codeId")String codeId, @Param("codeEx")String codeEx);
    List<StockDayScience6008> selectByPage(Page<StockDayScience6008> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);

    int insertSelective(StockDayScience6008 record);

    int updateByPrimaryKeySelective(StockDayScience6008 record);

}