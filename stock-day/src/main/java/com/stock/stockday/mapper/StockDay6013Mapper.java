package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay6013;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StockDay6013Mapper extends BaseMapper<StockDay6013> {
    List<StockDay6013> selectByCodeAndEx(@Param("codeId")String codeId, @Param("codeEx")String codeEx);
    List<StockDay6013> selectByCodeAndExPage(Page<StockDay6013> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);

    int insertSelective(StockDay6013 record);

    int updateByPrimaryKeySelective(StockDay6013 record);

}