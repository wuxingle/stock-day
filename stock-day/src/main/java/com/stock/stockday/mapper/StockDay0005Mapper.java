package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay0005;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StockDay0005Mapper extends BaseMapper<StockDay0005> {
    List<StockDay0005> selectByCodeAndEx(@Param("codeId")String codeId, @Param("codeEx")String codeEx);
    List<StockDay0005> selectByCodeAndExPage(Page<StockDay0005> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);

    int insertSelective(StockDay0005 record);

    int updateByPrimaryKeySelective(StockDay0005 record);

}