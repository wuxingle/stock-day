package com.stock.stockday.controller;

import com.stock.apicommon.exception.CustomThrow;
import com.stock.apicommon.model.ResultData;
import com.stock.stockday.newService.NewStockDayService;
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
public class NewStockDayController {
//    @Autowired
//    private NewStockDayService newStockDayService;


    //获取所以的数据
    @GetMapping("/getnewFile")
    public ResultData getnewFile(){
//        boolean falg;
//        try {
////            newStockDayService.getNewFile();
//        } catch (IOException e) {
//            return CustomThrow.throwCustom("获取数据出错");
//        }
        return  CustomThrow.throwCustom("获取数据成功");
    }

    //获取所以的数据
    @GetMapping("/getKTu20LS")
    public ResultData getKTu20LS(){
//        boolean falg;
//        try {
//            newStockDayService.getKTu20LS();
//        } catch (IOException e) {
//            return CustomThrow.throwCustom("获取数据出错");
//        }
        return  CustomThrow.throwCustom("获取数据成功");
    }

    //获取所以的数据
    @GetMapping("/getKMAQ20")
    public ResultData getKMAQ20(){
//        boolean falg;
//        try {
//            newStockDayService.getKMAQ20();
//        } catch (IOException e) {
//            return CustomThrow.throwCustom("获取数据出错");
//        }
        return  CustomThrow.throwCustom("获取数据成功");
    }

    //获取所以的数据
    @GetMapping("/getKTu20S")
    public ResultData getKTu20S(){
//        boolean falg;
//        try {
//            newStockDayService.getKTu20S();
//        } catch (IOException e) {
//            return CustomThrow.throwCustom("获取数据出错");
//        }
        return  CustomThrow.throwCustom("获取数据成功");
    }

    //获取所以的数据
    @GetMapping("/getKTu20L")
    public ResultData getKTu20L(){
//        boolean falg;
//        try {
//            newStockDayService.getKTu20L();
//        } catch (IOException e) {
//            return CustomThrow.throwCustom("获取数据出错");
//        }
        return  CustomThrow.throwCustom("获取数据成功");
    }


}
