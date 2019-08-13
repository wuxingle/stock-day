package com.stock.logcenter.rabbit;

import com.alibaba.fastjson.JSON;
import com.stock.logcenter.entity.StockLog;
import com.stock.logcenter.service.StockLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;

@Component
public class Receiver {
    private CountDownLatch latch = new CountDownLatch(1);

    @Autowired
    private  StockLogService stockLogService;

    public void receiveMessage(String message) {
        System.out.println("Received <" + message + ">");
        StockLog sysLog = JSON.parseObject(message,StockLog.class);
        stockLogService.saveStockLog(sysLog);
        latch.countDown();
    }

    public void receivePreMessage(String message) {
        System.out.println("Received Preprocess <" + message + ">");
        StockLog stockLog = JSON.parseObject(message, StockLog.class);
        stockLogService.saveStockLog(stockLog);
        latch.countDown();
    }
}
