package com.stock.logcenter.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.logcenter.entity.StockLog;

public interface StockLogService extends IService<StockLog> {
    void saveStockLog(StockLog stockLog);
}
