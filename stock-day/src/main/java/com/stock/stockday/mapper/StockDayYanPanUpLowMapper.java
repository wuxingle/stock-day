package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayYanPan;
import com.stock.stockday.entity.StockDayYanPanLowUp;
import com.stock.stockday.entity.StockDayYanPanUpLow;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StockDayYanPanUpLowMapper extends BaseMapper<StockDayYanPanUpLow> {
    List<StockDayYanPanUpLow> selectBySelective(StockDayYanPanUpLow stockDayYanPanUpLow);
    int insertSelective(StockDayYanPanUpLow record);

    int updateBySelective(StockDayYanPanUpLow record);

}