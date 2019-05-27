package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayYanPan33;
import com.stock.stockday.entity.StockDayYanPan42;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StockDayYanPan42Mapper extends BaseMapper<StockDayYanPan42> {
    List<StockDayYanPan42> selectBySelective(StockDayYanPan42 stockDayYanPan42);

    int insertSelective(StockDayYanPan42 record);

    int updateBySelective(StockDayYanPan42 record);

}