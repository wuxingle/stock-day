package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDayYanPanChunJishu;
import com.stock.stockday.mapper.StockDayYanPanChunJishuMapper;
import com.stock.stockday.service.StockDayYanPanChunJishuService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDayYanPanChunJishuServiceImpl extends ServiceImpl<StockDayYanPanChunJishuMapper, StockDayYanPanChunJishu> implements StockDayYanPanChunJishuService {
    @Override
    public List<StockDayYanPanChunJishu> selectBySelective(StockDayYanPanChunJishu stockDayYanPanChunJishu) {
        return baseMapper.selectBySelective(stockDayYanPanChunJishu);
    }

    @Override
    public int insertSelective(StockDayYanPanChunJishu record) {
        return baseMapper.insertSelective(record);
    }

    @Override
    public int updateBySelective(StockDayYanPanChunJishu record) {
        return baseMapper.updateBySelective(record);
    }
}
