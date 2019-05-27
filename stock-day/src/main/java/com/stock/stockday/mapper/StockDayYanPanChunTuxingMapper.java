package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayYanPan;
import com.stock.stockday.entity.StockDayYanPanChunTuxing;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StockDayYanPanChunTuxingMapper extends BaseMapper<StockDayYanPanChunTuxing> {
    List<StockDayYanPanChunTuxing> selectBySelective(StockDayYanPanChunTuxing stockDayYanPanChunTuxing);

    int insertSelective(StockDayYanPanChunTuxing record);

    int updateBySelective(StockDayYanPanChunTuxing record);


}