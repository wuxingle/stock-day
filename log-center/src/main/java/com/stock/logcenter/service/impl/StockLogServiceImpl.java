package com.stock.logcenter.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.logcenter.entity.StockLog;
import com.stock.logcenter.mapper.StockLogMapper;
import com.stock.logcenter.service.StockLogService;
import org.springframework.stereotype.Service;

@Service
public class StockLogServiceImpl extends ServiceImpl<StockLogMapper, StockLog> implements StockLogService {
    public void saveStockLog(StockLog stockLog){
        baseMapper.insert(stockLog);
    }
}
