package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayYanPan;
import com.stock.stockday.entity.StockDayYanPanZhuyao;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StockDayYanPanZhuyaoMapper extends BaseMapper<StockDayYanPanZhuyao> {
    List<StockDayYanPanZhuyao> selectBySelective(StockDayYanPanZhuyao stockDayYanPanZhuyao);

    int insertSelective(StockDayYanPanZhuyao record);

    int updateBySelective(StockDayYanPanZhuyao record);


}