package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockDayYanPan;
import com.stock.stockday.entity.StockDayYanPanZhuyao;
import com.stock.stockday.mapper.StockDayYanPanZhuyaoMapper;
import com.stock.stockday.service.StockDayYanPanZhuyaoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDayYanPanZhuyaoServiceImpl extends ServiceImpl<StockDayYanPanZhuyaoMapper, StockDayYanPanZhuyao> implements StockDayYanPanZhuyaoService {
    @Override
    public List<StockDayYanPanZhuyao> selectBySelective(StockDayYanPanZhuyao stockDayYanPanZhuyao) {
        return baseMapper.selectBySelective(stockDayYanPanZhuyao);
    }

    @Override
    public int insertSelective(StockDayYanPanZhuyao record) {
        return baseMapper.insertSelective(record);
    }

    @Override
    public int updateBySelective(StockDayYanPanZhuyao record) {
        return baseMapper.updateBySelective(record);
    }
}
