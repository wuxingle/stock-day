package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDayYanPan;
import com.stock.stockday.mapper.StockDayYanPanMapper;
import com.stock.stockday.service.StockDayYanPanService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDayYanPanServiceImpl extends ServiceImpl<StockDayYanPanMapper, StockDayYanPan> implements StockDayYanPanService {
    @Override
    public List<StockDayYanPan> selectBySelective(StockDayYanPan stockDayYanPan) {
        return baseMapper.selectBySelective(stockDayYanPan);
    }

    @Override
    public int insertSelective(StockDayYanPan record) {
        return baseMapper.insertSelective(record);
    }

    @Override
    public int updateBySelective(StockDayYanPan record) {
        return baseMapper.updateBySelective(record);
    }
}
