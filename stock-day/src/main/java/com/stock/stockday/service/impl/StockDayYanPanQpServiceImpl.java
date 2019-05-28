package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDayYanPan24;
import com.stock.stockday.entity.StockDayYanPanQp;
import com.stock.stockday.mapper.StockDayYanPan24Mapper;
import com.stock.stockday.mapper.StockDayYanPanQpMapper;
import com.stock.stockday.service.StockDayYanPan24Service;
import com.stock.stockday.service.StockDayYanPanQpService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDayYanPanQpServiceImpl extends ServiceImpl<StockDayYanPanQpMapper, StockDayYanPanQp> implements StockDayYanPanQpService {
    @Override
    public List<StockDayYanPanQp> selectBySelective(StockDayYanPanQp stockDayYanPanQp) {
        return baseMapper.selectBySelective(stockDayYanPanQp);
    }

    @Override
    public int insertSelective(StockDayYanPanQp record) {
        return baseMapper.insertSelective(record);
    }

    @Override
    public int updateBySelective(StockDayYanPanQp record) {
        return baseMapper.updateBySelective(record);
    }
}
