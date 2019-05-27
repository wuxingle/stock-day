package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayYanPan;
import com.stock.stockday.entity.StockDayYanPanLowLow;
import com.stock.stockday.entity.StockDayYanPanLowUp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StockDayYanPanLowUpMapper extends BaseMapper<StockDayYanPanLowUp> {
    List<StockDayYanPanLowUp> selectBySelective(StockDayYanPanLowUp stockDayYanPanLowUp);
    int insertSelective(StockDayYanPanLowUp record);


    int updateBySelective(StockDayYanPanLowUp record);

}