package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay3004;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StockDay3004Mapper extends BaseMapper<StockDay3004> {
    List<StockDay3004> selectByCodeAndEx(@Param("codeId")String codeId, @Param("codeEx")String codeEx);
    List<StockDay3004> selectByCodeAndExPage(Page<StockDay3004> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);

    int insertSelective(StockDay3004 record);

    int updateByPrimaryKeySelective(StockDay3004 record);

}