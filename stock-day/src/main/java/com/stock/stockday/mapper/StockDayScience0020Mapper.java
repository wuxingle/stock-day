package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience0020;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StockDayScience0020Mapper extends BaseMapper<StockDayScience0020> {
    List<StockDayScience0020> selectByCodeAndEx(@Param("codeId")String codeId, @Param("codeEx")String codeEx);
    List<StockDayScience0020> selectByPage(Page<StockDayScience0020> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);

    int insertSelective(StockDayScience0020 record);

    int updateByPrimaryKeySelective(StockDayScience0020 record);

}