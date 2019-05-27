package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayYanPan42;
import com.stock.stockday.entity.StockDayYanPanBenpan;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StockDayYanPanBenpanMapper extends BaseMapper<StockDayYanPanBenpan> {
    List<StockDayYanPanBenpan> selectBySelective(StockDayYanPanBenpan stockDayYanPanBenpan);

    int insertSelective(StockDayYanPanBenpan record);

    int updateBySelective(StockDayYanPanBenpan record);

}