package com.stock.stockday.controller;

import com.stock.apicommon.model.ResultData;
import com.stock.stockday.newService.list1.ZhuHeListService;
import com.stock.stockday.service.find.findService;
import com.stock.stockday.service.list.ListStockService;
import com.stock.stockday.vo.StockDayVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin(allowCredentials = "true",allowedHeaders = "*")
@RequestMapping(value = "/day/v1", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class FindController {
    @Autowired
    private findService findService;


    @GetMapping("/duoTuXiangShang")
    public ResultData<List<StockDayVo>> duoTuXiangShang(){
        List<StockDayVo> stockDayVoList=findService.duoTuXiangShang();
        return new ResultData(stockDayVoList);
    }

    @GetMapping("/shengV")
    public ResultData<List<StockDayVo>> shengV(){
        List<StockDayVo> stockDayVoList=findService.shengV();
        return new ResultData(stockDayVoList);
    }

    @GetMapping("/reset20")
    public ResultData<List<StockDayVo>> reset20(){
        List<StockDayVo> stockDayVoList=findService.reset20();
        return new ResultData(stockDayVoList);
    }

    @GetMapping("/jieQi")
    public ResultData<List<StockDayVo>> jieQi(){
        List<StockDayVo> stockDayVoList=findService.jieQi();
        return new ResultData(stockDayVoList);
    }

    @GetMapping("/jishujieqi")
    public ResultData<List<StockDayVo>> jishujieqi(){
        List<StockDayVo> stockDayVoList=findService.jishujieqi();
        return new ResultData(stockDayVoList);
    }

    @GetMapping("/jishujieqi1")
    public ResultData<List<StockDayVo>> jishujieqi1(){
        List<StockDayVo> stockDayVoList=findService.jishujieqi1();
        return new ResultData(stockDayVoList);
    }







}
