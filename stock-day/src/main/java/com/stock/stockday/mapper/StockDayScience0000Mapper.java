package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDayScience0000;
import com.stock.stockday.entity.StockDayScience0001;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StockDayScience0000Mapper extends BaseMapper<StockDayScience0000> {
    List<StockDayScience0000> selectByCodeAndEx(@Param("codeId")String codeId, @Param("codeEx")String codeEx);

    List<StockDayScience0000> selectByPage(Page<StockDayScience0000> page,@Param("codeId")String codeId, @Param("codeEx")String codeEx);

    int insertSelective(StockDayScience0000 record);

    int updateByPrimaryKeySelective(StockDayScience0000 record);

}