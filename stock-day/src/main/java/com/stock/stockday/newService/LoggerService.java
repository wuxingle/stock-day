package com.stock.stockday.newService;

import com.alibaba.fastjson.JSON;
import com.stock.stockday.config.RabbitConfig;
import com.stock.stockday.vo.StockLog;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoggerService {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void log(StockLog stockLog){
        rabbitTemplate.convertAndSend(RabbitConfig.queueNamePrepro, JSON.toJSONString(stockLog));
    }
}
