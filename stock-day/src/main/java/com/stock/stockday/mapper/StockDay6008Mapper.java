package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay0001;
import com.stock.stockday.entity.StockDay6008;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StockDay6008Mapper extends BaseMapper<StockDay6008> {
    List<StockDay6008> selectByCodeAndEx(@Param("codeId")String codeId, @Param("codeEx")String codeEx);
    List<StockDay6008> selectByCodeAndExPage(Page<StockDay6008> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);

    int insertSelective(StockDay6008 record);

    int updateByPrimaryKeySelective(StockDay6008 record);

}