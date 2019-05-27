package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayYanPan;
import com.stock.stockday.entity.StockDayYanPanLowLow;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StockDayYanPanLowLowMapper extends BaseMapper<StockDayYanPanLowLow> {
    List<StockDayYanPanLowLow> selectBySelective(StockDayYanPanLowLow stockDayYanPanLowLow);
    int insertSelective(StockDayYanPanLowLow record);

    int updateBySelective(StockDayYanPanLowLow record);

}