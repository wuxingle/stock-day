package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay0006;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StockDay0006Mapper extends BaseMapper<StockDay0006> {
    List<StockDay0006> selectByCodeAndEx(@Param("codeId")String codeId, @Param("codeEx")String codeEx);
    List<StockDay0006> selectByCodeAndExPage(Page<StockDay0006> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);

    int insertSelective(StockDay0006 record);

    int updateByPrimaryKeySelective(StockDay0006 record);

}