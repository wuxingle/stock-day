package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay6018;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StockDay6018Mapper extends BaseMapper<StockDay6018> {
    List<StockDay6018> selectByCodeAndEx(@Param("codeId")String codeId, @Param("codeEx")String codeEx);
    List<StockDay6018> selectByCodeAndExPage(Page<StockDay6018> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);

    int insertSelective(StockDay6018 record);

    int updateByPrimaryKeySelective(StockDay6018 record);

}