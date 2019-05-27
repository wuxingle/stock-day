package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay6017;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StockDay6017Mapper extends BaseMapper<StockDay6017> {
    List<StockDay6017> selectByCodeAndEx(@Param("codeId")String codeId, @Param("codeEx")String codeEx);
    List<StockDay6017> selectByCodeAndExPage(Page<StockDay6017> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);

    int insertSelective(StockDay6017 record);

    int updateByPrimaryKeySelective(StockDay6017 record);

}