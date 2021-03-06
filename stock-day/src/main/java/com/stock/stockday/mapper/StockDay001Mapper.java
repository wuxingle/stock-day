package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay001;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StockDay001Mapper extends BaseMapper<StockDay001> {
    List<StockDay001> selectByCodeAndEx(@Param("codeId")String codeId, @Param("codeEx")String codeEx);
    List<StockDay001> selectByCodeAndExPage(Page<StockDay001> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);

    int insertSelective(StockDay001 record);

    int updateByPrimaryKeySelective(StockDay001 record);

}