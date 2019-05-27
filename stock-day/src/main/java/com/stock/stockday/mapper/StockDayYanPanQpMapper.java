package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayYanPanKm;
import com.stock.stockday.entity.StockDayYanPanQp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StockDayYanPanQpMapper extends BaseMapper<StockDayYanPanQp> {
    List<StockDayYanPanQp> selectBySelective(StockDayYanPanQp stockDayYanPanQp);

    int insertSelective(StockDayYanPanQp record);

    int updateBySelective(StockDayYanPanQp record);

}