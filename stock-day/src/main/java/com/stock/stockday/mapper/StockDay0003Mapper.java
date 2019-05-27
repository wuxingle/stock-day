package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay0003;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StockDay0003Mapper extends BaseMapper<StockDay0003> {
    List<StockDay0003> selectByCodeAndEx(@Param("codeId")String codeId, @Param("codeEx")String codeEx);
    List<StockDay0003> selectByCodeAndExPage(Page<StockDay0003> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);

    int insertSelective(StockDay0003 record);

    int updateByPrimaryKeySelective(StockDay0003 record);

}