package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay6002;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StockDay6002Mapper extends BaseMapper<StockDay6002> {
    List<StockDay6002> selectByCodeAndEx(@Param("codeId")String codeId, @Param("codeEx")String codeEx);
    List<StockDay6002> selectByCodeAndExPage(Page<StockDay6002> page, @Param("codeId")String codeId, @Param("codeEx")String codeEx);

    int insertSelective(StockDay6002 record);

    int updateByPrimaryKeySelective(StockDay6002 record);

}