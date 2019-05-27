package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayYanPan;
import com.stock.stockday.entity.StockDayYanPanUpLow;
import com.stock.stockday.entity.StockDayYanPanUpUp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StockDayYanPanUpUpMapper extends BaseMapper<StockDayYanPanUpUp> {
    List<StockDayYanPanUpUp> selectBySelective(StockDayYanPanUpUp stockDayYanPanUpUp);
    int insertSelective(StockDayYanPanUpUp record);

    int updateBySelective(StockDayYanPanUpUp record);

}