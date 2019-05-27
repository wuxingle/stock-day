package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay3001;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StockDay3001Mapper extends BaseMapper<StockDay3001> {
    List<StockDay3001> selectByCodeAndEx(@Param("codeId")String codeId, @Param("codeEx")String codeEx);
    List<StockDay3001> selectByCodeAndExPage(Page<StockDay3001> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);

    int insertSelective(StockDay3001 record);

    int updateByPrimaryKeySelective(StockDay3001 record);

}