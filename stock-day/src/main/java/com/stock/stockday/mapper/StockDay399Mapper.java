package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay399;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StockDay399Mapper extends BaseMapper<StockDay399> {
    List<StockDay399> selectByCodeAndEx(@Param("codeId")String codeId, @Param("codeEx")String codeEx);
    List<StockDay399> selectByCodeAndExPage(Page<StockDay399> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);

    int insertSelective(StockDay399 record);

    int updateByPrimaryKeySelective(StockDay399 record);

}