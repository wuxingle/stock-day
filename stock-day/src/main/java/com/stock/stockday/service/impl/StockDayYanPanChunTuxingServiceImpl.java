package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDayYanPanChunTuxing;
import com.stock.stockday.mapper.StockDayYanPanChunTuxingMapper;
import com.stock.stockday.service.StockDayYanPanChunTuxingService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDayYanPanChunTuxingServiceImpl extends ServiceImpl<StockDayYanPanChunTuxingMapper, StockDayYanPanChunTuxing> implements StockDayYanPanChunTuxingService {
    @Override
    public List<StockDayYanPanChunTuxing> selectBySelective(StockDayYanPanChunTuxing stockDayYanPanChunTuxing) {
        return baseMapper.selectBySelective(stockDayYanPanChunTuxing);
    }

    @Override
    public int insertSelective(StockDayYanPanChunTuxing record) {
        return baseMapper.insertSelective(record);
    }

    @Override
    public int updateBySelective(StockDayYanPanChunTuxing record) {
        return baseMapper.updateBySelective(record);
    }
}
