package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayYanPan;
import com.stock.stockday.entity.StockDayYanPanTuxing;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StockDayYanPanTuxingMapper extends BaseMapper<StockDayYanPanTuxing> {
    List<StockDayYanPanTuxing> selectBySelective(StockDayYanPanTuxing stockDayYanPanTuxing);

    int insertSelective(StockDayYanPanTuxing record);

    int updateBySelective(StockDayYanPanTuxing record);


}