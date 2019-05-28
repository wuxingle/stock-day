package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDayYanPanUpUp;
import com.stock.stockday.mapper.StockDayYanPanUpUpMapper;
import com.stock.stockday.service.StockDayYanPanUpUpService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDayYanPanUpUpServiceImpl extends ServiceImpl<StockDayYanPanUpUpMapper, StockDayYanPanUpUp> implements StockDayYanPanUpUpService {
    @Override
    public List<StockDayYanPanUpUp> selectBySelective(StockDayYanPanUpUp stockDayYanPanUpUp) {
        return baseMapper.selectBySelective(stockDayYanPanUpUp);
    }

    @Override
    public int insertSelective(StockDayYanPanUpUp record) {
        return baseMapper.insertSelective(record);
    }

    @Override
    public int updateBySelective(StockDayYanPanUpUp record) {
        return baseMapper.updateBySelective(record);
    }
}
