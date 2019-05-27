package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayYanPan;
import com.stock.stockday.entity.StockDayYanPanJishu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StockDayYanPanJishuMapper extends BaseMapper<StockDayYanPanJishu> {
    List<StockDayYanPanJishu> selectBySelective(StockDayYanPanJishu stockDayYanPanJishu);

    int insertSelective(StockDayYanPanJishu record);

    int updateBySelective(StockDayYanPanJishu record);

}