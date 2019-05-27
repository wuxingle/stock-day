package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay0024;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StockDay0024Mapper extends BaseMapper<StockDay0024> {
    List<StockDay0024> selectByCodeAndEx(@Param("codeId")String codeId, @Param("codeEx")String codeEx);
    List<StockDay0024> selectByCodeAndExPage(Page<StockDay0024> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);

    int insertSelective(StockDay0024 record);

    int updateByPrimaryKeySelective(StockDay0024 record);

}