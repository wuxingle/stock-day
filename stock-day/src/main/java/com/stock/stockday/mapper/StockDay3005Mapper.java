package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay3005;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StockDay3005Mapper extends BaseMapper<StockDay3005> {
    List<StockDay3005> selectByCodeAndEx(@Param("codeId")String codeId, @Param("codeEx")String codeEx);
    List<StockDay3005> selectByCodeAndExPage(Page<StockDay3005> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);

    int insertSelective(StockDay3005 record);

    int updateByPrimaryKeySelective(StockDay3005 record);

}