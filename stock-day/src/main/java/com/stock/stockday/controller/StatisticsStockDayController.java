package com.stock.stockday.controller;

import com.stock.apicommon.exception.CustomThrow;
import com.stock.apicommon.model.ResultData;
import com.stock.stockday.service.StockDayFundFlowService;
import com.stock.stockday.service.StockDayScienceService;
import com.stock.stockday.service.StockDayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.text.ParseException;

@RestController
@RequestMapping(value = "/day/v1", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class StatisticsStockDayController {
    @Autowired
    private StockDayService stockDayService;
    @Autowired
    private StockDayFundFlowService stockDayFundFlowService;
    @Autowired
    private StockDayScienceService stockDayScienceService;



    //统计基础标签
    @GetMapping("/getStatisticsBasics")
    public ResultData getStatisticsBasics(){
        boolean falg;
        try {
            falg=stockDayService.getAllDate();
        } catch (IOException e) {
            return CustomThrow.throwCustom("获取数据出错");
        } catch (ParseException e) {
            return CustomThrow.throwCustom("获取数据出错");
        }
        return  CustomThrow.throwCustom("获取数据成功");
    }

}
