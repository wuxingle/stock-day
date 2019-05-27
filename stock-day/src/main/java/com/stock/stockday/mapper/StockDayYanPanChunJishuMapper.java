package com.stock.stockday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.stockday.entity.StockDayYanPan;
import com.stock.stockday.entity.StockDayYanPanChunJishu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StockDayYanPanChunJishuMapper extends BaseMapper<StockDayYanPanChunJishu> {
    List<StockDayYanPanChunJishu> selectBySelective(StockDayYanPanChunJishu stockDayYanPanChunJishu);
    int insertSelective(StockDayYanPanChunJishu record);

    int updateBySelective(StockDayYanPanChunJishu record);

}