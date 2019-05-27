package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay3000;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StockDay3000Mapper extends BaseMapper<StockDay3000> {
    List<StockDay3000> selectByCodeAndEx(@Param("codeId")String codeId, @Param("codeEx")String codeEx);
    List<StockDay3000> selectByCodeAndExPage(Page<StockDay3000> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);

    int insertSelective(StockDay3000 record);

    int updateByPrimaryKeySelective(StockDay3000 record);

}