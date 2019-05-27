package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay603;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StockDay603Mapper extends BaseMapper<StockDay603> {
    List<StockDay603> selectByCodeAndEx(@Param("codeId")String codeId, @Param("codeEx")String codeEx);
    List<StockDay603> selectByCodeAndExPage(Page<StockDay603> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);

    int insertSelective(StockDay603 record);

    int updateByPrimaryKeySelective(StockDay603 record);

}