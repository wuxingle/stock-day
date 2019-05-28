package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.stockday.entity.StockCode;
import com.stock.stockday.mapper.StockCodeMapper;
import com.stock.stockday.service.StockCodeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockCodeServiceImpl extends ServiceImpl<StockCodeMapper, StockCode> implements StockCodeService {

    @Override
    public List<StockCode> getStockCodeList() {
        return baseMapper.getStockCodeList();
    }
}
