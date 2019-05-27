package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayYanPanDrlx;
import com.stock.stockday.entity.StockDayYanPanKm;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StockDayYanPanKmMapper extends BaseMapper<StockDayYanPanKm> {
    List<StockDayYanPanKm> selectBySelective(StockDayYanPanKm stockDayYanPanKm);

    int insertSelective(StockDayYanPanKm record);

    int updateBySelective(StockDayYanPanKm record);

}