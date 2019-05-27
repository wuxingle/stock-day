package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience6005;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StockDayScience6005Mapper extends BaseMapper<StockDayScience6005> {
    List<StockDayScience6005> selectByCodeAndEx(@Param("codeId")String codeId, @Param("codeEx")String codeEx);
    List<StockDayScience6005> selectByPage(Page<StockDayScience6005> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);

    int insertSelective(StockDayScience6005 record);

    int updateByPrimaryKeySelective(StockDayScience6005 record);

}