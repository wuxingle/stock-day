package com.stock.stockday.controller;

import com.stock.apicommon.exception.CustomThrow;
import com.stock.apicommon.model.ResultData;
import com.stock.stockday.service.StockDayFundFlowService;
import com.stock.stockday.service.StockDayProphesyService;
import com.stock.stockday.service.StockDayScienceService;
import com.stock.stockday.service.StockDayService;
import com.stock.stockday.service.StockDayZhuHeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.text.ParseException;

@RestController
@RequestMapping(value = "/day/v1", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class StockDayController {
    @Autowired
    private StockDayService stockDayService;
    @Autowired
    private StockDayFundFlowService stockDayFundFlowService;
    @Autowired
    private StockDayScienceService stockDayScienceService;
//    @Autowired
//    private StockDayProphesyService stockDayProphesyService;
//    @Autowired
//    private StockDayZhuHeService stockDayZhuHeService;
//    @Autowired
//    private DaySaveZhuYanJiShuService daySaveZhuYanJiShuService;



    //获取所以的数据
    @GetMapping("/getAllDate")
    public ResultData getAllDate(){
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

    //获取资金流
    @GetMapping("/getAllFundFlow")
    public ResultData getAllFundFlow(){
        boolean falg;
        try {
            falg=stockDayFundFlowService.getAllFundFlow();
        } catch (IOException e) {
            return CustomThrow.throwCustom("获取数据出错");
        } catch (ParseException e) {
            return CustomThrow.throwCustom("获取数据出错");
        }
        return  CustomThrow.throwCustom("获取数据成功");
    }

    //获取技术
    @GetMapping("/getAllScience")
    public ResultData getAllScience(){
        boolean falg;
//        try {
            falg=stockDayScienceService.getAllScience();
//        } catch (IOException e) {
//            return CustomThrow.throwCustom("获取数据出错");
//        } catch (ParseException e) {
//            return CustomThrow.throwCustom("获取数据出错");
//        }
        return  CustomThrow.throwCustom("获取数据成功");
    }

    //统计技术获取概率
    @GetMapping("/getProphesyProbability")
    public ResultData getProphesyProbability() {
//        stockDayProphesyService.getProphesyProbability();
        return  CustomThrow.throwCustom("获取数据成功");
    }

//    //统计技术获取概率
//    @GetMapping("/getSaveFile")
//    public ResultData getSavaFile() throws IOException {
//        stockDayProphesyService.getProphesyProbability1();
//        return  CustomThrow.throwCustom("获取数据成功");
//    }
//
//    //统计技术获取概率
//    @GetMapping("/getChunJiShu")
//    public ResultData getChunJiShu() throws IOException {
//        boolean falg;
////        try {
//        falg=stockDayZhuHeService.getChunJiShu();
////        } catch (IOException e) {
////            return CustomThrow.throwCustom("获取数据出错");
////        } catch (ParseException e) {
////            return CustomThrow.throwCustom("获取数据出错");
////        }
//        return  CustomThrow.throwCustom("获取数据成功");
//    }
//
//    //统计技术获取概率
//    @GetMapping("/getChunTuXing")
//    public ResultData getChunTuXing() throws IOException {
//        boolean falg;
////        try {
//        falg=stockDayZhuHeService.getChunTuXing();
////        } catch (IOException e) {
////            return CustomThrow.throwCustom("获取数据出错");
////        } catch (ParseException e) {
////            return CustomThrow.throwCustom("获取数据出错");
////        }
//        return  CustomThrow.throwCustom("获取数据成功");
//    }

//    //统计技术获取概率
//    @GetMapping("/getZhuHe24")
//    public ResultData getZhuHe24() throws IOException {
//        boolean falg;
////        try {
//        falg=stockDayProphesyService.getZhuHe24();
////        } catch (IOException e) {
////            return CustomThrow.throwCustom("获取数据出错");
////        } catch (ParseException e) {
////            return CustomThrow.throwCustom("获取数据出错");
////        }
//        return  CustomThrow.throwCustom("获取数据成功");
//    }
//
//    //统计技术获取概率
//    @GetMapping("/getZhuHe33")
//    public ResultData getZhuHe33() throws IOException {
//        boolean falg;
////        try {
//        falg=stockDayProphesyService.getZhuHe33();
////        } catch (IOException e) {
////            return CustomThrow.throwCustom("获取数据出错");
////        } catch (ParseException e) {
////            return CustomThrow.throwCustom("获取数据出错");
////        }
//        return  CustomThrow.throwCustom("获取数据成功");
//    }
//
//    //统计技术获取概率
//    @GetMapping("/getZhuHe42")
//    public ResultData getZhuHe42() throws IOException {
//        boolean falg;
////        try {
//        falg=stockDayProphesyService.getZhuHe42();
////        } catch (IOException e) {
////            return CustomThrow.throwCustom("获取数据出错");
////        } catch (ParseException e) {
////            return CustomThrow.throwCustom("获取数据出错");
////        }
//        return  CustomThrow.throwCustom("获取数据成功");
//    }
//
//    //统计技术获取概率
//    @GetMapping("/getZhuHeBenpan")
//    public ResultData getZhuHeBenpan() throws IOException {
//        boolean falg;
////        try {
//        falg=stockDayZhuHeService.getZhuHeBenpan();
////        } catch (IOException e) {
////            return CustomThrow.throwCustom("获取数据出错");
////        } catch (ParseException e) {
////            return CustomThrow.throwCustom("获取数据出错");
////        }
//        return  CustomThrow.throwCustom("获取数据成功");
//    }
//
//    //统计技术获取概率
//    @GetMapping("/getZhuHeDapan")
//    public ResultData getZhuHeDapan() throws IOException {
//        boolean falg;
////        try {
//        falg=stockDayZhuHeService.getZhuHeDapan();
////        } catch (IOException e) {
////            return CustomThrow.throwCustom("获取数据出错");
////        } catch (ParseException e) {
////            return CustomThrow.throwCustom("获取数据出错");
////        }
//        return  CustomThrow.throwCustom("获取数据成功");
//    }
    //统计技术获取概率
    @GetMapping("/getZhuYanJiShu")
    public ResultData getZhuYanJiShu() throws IOException {
        boolean falg;
//        try {
//        falg=daySaveZhuYanJiShuService.getZhuHeZhuYanJiShu();
//        } catch (IOException e) {
//            return CustomThrow.throwCustom("获取数据出错");
//        } catch (ParseException e) {
//            return CustomThrow.throwCustom("获取数据出错");
//        }
        return  CustomThrow.throwCustom("获取数据成功");
    }
    //统计技术获取概率
    @GetMapping("/getZhuHeKm")
    public ResultData getZhuHeKm(){
        boolean falg;
//        try {
//        falg=stockDayProphesyService.getZhuHeKm();
//        } catch (IOException e) {
//            return CustomThrow.throwCustom("获取数据出错");
//        } catch (ParseException e) {
//            return CustomThrow.throwCustom("获取数据出错");
//        }
        return  CustomThrow.throwCustom("获取数据成功");
    }
    //统计技术获取概率
    @GetMapping("/getZhuHeQp")
    public ResultData getZhuHeQp(){
        boolean falg;
//        try {
//        falg=stockDayProphesyService.getZhuHeQp();
//        } catch (IOException e) {
//            return CustomThrow.throwCustom("获取数据出错");
//        } catch (ParseException e) {
//            return CustomThrow.throwCustom("获取数据出错");
//        }
        return  CustomThrow.throwCustom("获取数据成功");
    }
    //统计技术获取概率
    @GetMapping("/getZhuHeRw")
    public ResultData getZhuHeRw(){
        boolean falg;
//        try {
//        falg=stockDayProphesyService.getZhuHeRw();
//        } catch (IOException e) {
//            return CustomThrow.throwCustom("获取数据出错");
//        } catch (ParseException e) {
//            return CustomThrow.throwCustom("获取数据出错");
//        }
        return  CustomThrow.throwCustom("获取数据成功");
    }
}
