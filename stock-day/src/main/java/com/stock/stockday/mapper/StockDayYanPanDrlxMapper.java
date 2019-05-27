package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayYanPanDapan;
import com.stock.stockday.entity.StockDayYanPanDrlx;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StockDayYanPanDrlxMapper extends BaseMapper<StockDayYanPanDrlx> {
    List<StockDayYanPanDrlx> selectBySelective(StockDayYanPanDrlx stockDayYanPanDrlx);

    int insertSelective(StockDayYanPanDrlx record);

    int updateBySelective(StockDayYanPanDrlx record);

}