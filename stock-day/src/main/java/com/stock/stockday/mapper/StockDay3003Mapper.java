package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay3003;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StockDay3003Mapper extends BaseMapper<StockDay3003> {
    List<StockDay3003> selectByCodeAndEx(@Param("codeId")String codeId, @Param("codeEx")String codeEx);
    List<StockDay3003> selectByCodeAndExPage(Page<StockDay3003> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);

    int insertSelective(StockDay3003 record);

    int updateByPrimaryKeySelective(StockDay3003 record);

}