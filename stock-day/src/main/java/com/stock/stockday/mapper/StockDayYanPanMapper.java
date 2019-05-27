package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayYanPan;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StockDayYanPanMapper extends BaseMapper<StockDayYanPan> {
    List<StockDayYanPan> selectBySelective(StockDayYanPan stockDayYanPan);
    int insertSelective(StockDayYanPan record);
    int updateBySelective(StockDayYanPan record);
}