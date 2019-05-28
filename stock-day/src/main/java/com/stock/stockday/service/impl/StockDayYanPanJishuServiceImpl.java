package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDayYanPanJishu;
import com.stock.stockday.mapper.StockDayYanPanJishuMapper;
import com.stock.stockday.service.StockDayYanPanJishuService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDayYanPanJishuServiceImpl extends ServiceImpl<StockDayYanPanJishuMapper, StockDayYanPanJishu> implements StockDayYanPanJishuService {
    @Override
    public List<StockDayYanPanJishu> selectBySelective(StockDayYanPanJishu stockDayYanPanJishu) {
        return baseMapper.selectBySelective(stockDayYanPanJishu);
    }

    @Override
    public int insertSelective(StockDayYanPanJishu record) {
        return baseMapper.insertSelective(record);
    }

    @Override
    public int updateBySelective(StockDayYanPanJishu record) {
        return baseMapper.updateBySelective(record);
    }
}
