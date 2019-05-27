package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayYanPan24;
import com.stock.stockday.entity.StockDayYanPan33;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StockDayYanPan33Mapper extends BaseMapper<StockDayYanPan33> {
    List<StockDayYanPan33> selectBySelective(StockDayYanPan33 stockDayYanPan33);

    int insertSelective(StockDayYanPan33 record);

    int updateBySelective(StockDayYanPan33 record);

}