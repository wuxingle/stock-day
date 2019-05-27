package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience0001;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StockDayScience0001Mapper extends BaseMapper<StockDayScience0001> {
    List<StockDayScience0001> selectByCodeAndEx(@Param("codeId")String codeId, @Param("codeEx")String codeEx);
    List<StockDayScience0001> selectByPage(Page<StockDayScience0001> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);

    int insertSelective(StockDayScience0001 record);

    int updateByPrimaryKeySelective(StockDayScience0001 record);

}