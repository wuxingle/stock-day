package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay0001;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import javax.xml.crypto.Data;
import java.util.List;

@Mapper
public interface StockDay0000Mapper extends BaseMapper<StockDay0000> {
    List<StockDay0000> selectByCodeAndEx(@Param("codeId")String codeId,@Param("codeEx")String codeEx);

    List<StockDay0000> selectByCodeAndExPage(Page<StockDay0000> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);

    int insertList(List<StockDay0000> stockDay0000List);

    int insertSelective(StockDay0000 record);

    int updateByPrimaryKeySelective(StockDay0000 record);

}