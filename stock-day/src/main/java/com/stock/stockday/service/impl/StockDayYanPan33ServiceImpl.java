package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDayYanPan24;
import com.stock.stockday.entity.StockDayYanPan33;
import com.stock.stockday.mapper.StockDayYanPan24Mapper;
import com.stock.stockday.mapper.StockDayYanPan33Mapper;
import com.stock.stockday.service.StockDayYanPan24Service;
import com.stock.stockday.service.StockDayYanPan33Service;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDayYanPan33ServiceImpl extends ServiceImpl<StockDayYanPan33Mapper, StockDayYanPan33> implements StockDayYanPan33Service {
    @Override
    public List<StockDayYanPan33> selectBySelective(StockDayYanPan33 stockDayYanPan33) {
        return baseMapper.selectBySelective(stockDayYanPan33);
    }

    @Override
    public int insertSelective(StockDayYanPan33 record) {
        return baseMapper.insertSelective(record);
    }

    @Override
    public int updateBySelective(StockDayYanPan33 record) {
        return baseMapper.updateBySelective(record);
    }
}
