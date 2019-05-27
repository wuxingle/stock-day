package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience6016;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StockDayScience6016Mapper extends BaseMapper<StockDayScience6016> {
    List<StockDayScience6016> selectByCodeAndEx(@Param("codeId")String codeId, @Param("codeEx")String codeEx);
    List<StockDayScience6016> selectByPage(Page<StockDayScience6016> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);

    int insertSelective(StockDayScience6016 record);

    int updateByPrimaryKeySelective(StockDayScience6016 record);

}