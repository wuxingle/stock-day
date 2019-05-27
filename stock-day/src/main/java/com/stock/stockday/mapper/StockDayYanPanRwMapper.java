package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayYanPanQp;
import com.stock.stockday.entity.StockDayYanPanRw;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StockDayYanPanRwMapper extends BaseMapper<StockDayYanPanRw> {
    List<StockDayYanPanRw> selectBySelective(StockDayYanPanRw stockDayYanPanRw);

    int insertSelective(StockDayYanPanRw record);

    int updateBySelective(StockDayYanPanRw record);

}