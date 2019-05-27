package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayYanPanBenpan;
import com.stock.stockday.entity.StockDayYanPanDapan;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StockDayYanPanDapanMapper extends BaseMapper<StockDayYanPanDapan> {
    List<StockDayYanPanDapan> selectBySelective(StockDayYanPanDapan stockDayYanPanDapan);

    int insertSelective(StockDayYanPanDapan record);

    int updateBySelective(StockDayYanPanDapan record);

}