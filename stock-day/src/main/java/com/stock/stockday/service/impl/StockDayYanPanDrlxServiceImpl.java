package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDayYanPan24;
import com.stock.stockday.entity.StockDayYanPanDrlx;
import com.stock.stockday.mapper.StockDayYanPan24Mapper;
import com.stock.stockday.mapper.StockDayYanPanDrlxMapper;
import com.stock.stockday.service.StockDayYanPan24Service;
import com.stock.stockday.service.StockDayYanPanDrlxService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDayYanPanDrlxServiceImpl extends ServiceImpl<StockDayYanPanDrlxMapper, StockDayYanPanDrlx> implements StockDayYanPanDrlxService {
    @Override
    public List<StockDayYanPanDrlx> selectBySelective(StockDayYanPanDrlx stockDayYanPanDrlx) {
        return baseMapper.selectBySelective(stockDayYanPanDrlx);
    }

    @Override
    public int insertSelective(StockDayYanPanDrlx record) {
        return baseMapper.insertSelective(record);
    }

    @Override
    public int updateBySelective(StockDayYanPanDrlx record) {
        return baseMapper.updateBySelective(record);
    }
}
