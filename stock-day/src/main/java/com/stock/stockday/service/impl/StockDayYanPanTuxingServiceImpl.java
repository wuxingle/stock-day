package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDayYanPanTuxing;
import com.stock.stockday.mapper.StockDayYanPanTuxingMapper;
import com.stock.stockday.service.StockDayYanPanTuxingService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDayYanPanTuxingServiceImpl extends ServiceImpl<StockDayYanPanTuxingMapper, StockDayYanPanTuxing> implements StockDayYanPanTuxingService {
    @Override
    public List<StockDayYanPanTuxing> selectBySelective(StockDayYanPanTuxing stockDayYanPanTuxing) {
        return baseMapper.selectBySelective(stockDayYanPanTuxing);
    }

    @Override
    public int insertSelective(StockDayYanPanTuxing record) {
        return baseMapper.insertSelective(record);
    }

    @Override
    public int updateBySelective(StockDayYanPanTuxing record) {
        return baseMapper.updateBySelective(record);
    }
}
