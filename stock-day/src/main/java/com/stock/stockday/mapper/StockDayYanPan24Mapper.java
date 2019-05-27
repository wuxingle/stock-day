package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayYanPan;
import com.stock.stockday.entity.StockDayYanPan24;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StockDayYanPan24Mapper extends BaseMapper<StockDayYanPan24> {
    List<StockDayYanPan24> selectBySelective(StockDayYanPan24 stockDayYanPan24);

    int insertSelective(StockDayYanPan24 record);

    int updateBySelective(StockDayYanPan24 record);
}