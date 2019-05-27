package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay0022;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StockDay0022Mapper extends BaseMapper<StockDay0022> {
    List<StockDay0022> selectByCodeAndEx(@Param("codeId")String codeId, @Param("codeEx")String codeEx);
    List<StockDay0022> selectByCodeAndExPage(Page<StockDay0022> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);

    int insertSelective(StockDay0022 record);

    int updateByPrimaryKeySelective(StockDay0022 record);

}