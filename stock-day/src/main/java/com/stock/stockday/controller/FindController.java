package com.stock.stockday.controller;

import com.stock.apicommon.model.ResultData;
import com.stock.stockday.newService.find3.findService100;
import com.stock.stockday.newService.find3.findService2;
import com.stock.stockday.newService.find3.findService60;
import com.stock.stockday.newService.find3.findService70;
import com.stock.stockday.newService.find3.findService75;
import com.stock.stockday.newService.find3.findService80;
import com.stock.stockday.service.find2.daPanService;
import com.stock.stockday.service.find2.yanPanService;
import com.stock.stockday.service.find2.yanPanService2;
import com.stock.stockday.service.find2.yanPanService3;
import com.stock.stockday.service.find2.yanPanService4;
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
//    @Autowired
//    private findService findService;
    @Autowired
    private daPanService daPanService;
    @Autowired
    private yanPanService yanPanService;
    @Autowired
    private yanPanService2 yanPanService2;
    @Autowired
    private yanPanService3 yanPanService3;
    @Autowired
    private yanPanService4 yanPanService4;
    @Autowired
    private findService2 findService2;
    @Autowired
    private findService60 findService60;
    @Autowired
    private findService70 findService70;
    @Autowired
    private findService75 findService75;
    @Autowired
    private findService80 findService80;
    @Autowired
    private findService100 findService100;


//    @GetMapping("/duoTuXiangShang")
//    public ResultData<List<StockDayVo>> duoTuXiangShang(){
//        List<StockDayVo> stockDayVoList=findService.duoTuXiangShang();
//        return new ResultData(stockDayVoList);
//    }
//
//    @GetMapping("/shengV")
//    public ResultData<List<StockDayVo>> shengV(){
//        List<StockDayVo> stockDayVoList=findService.shengV();
//        return new ResultData(stockDayVoList);
//    }
//
//    @GetMapping("/reset20")
//    public ResultData<List<StockDayVo>> reset20(){
//        List<StockDayVo> stockDayVoList=findService.reset20();
//        return new ResultData(stockDayVoList);
//    }
//
//    @GetMapping("/jieQi")
//    public ResultData<List<StockDayVo>> jieQi(){
//        List<StockDayVo> stockDayVoList=findService.jieQi();
//        return new ResultData(stockDayVoList);
//    }
//
//    @GetMapping("/jishujieqi")
//    public ResultData<List<StockDayVo>> jishujieqi(){
//        List<StockDayVo> stockDayVoList=findService.jishujieqi();
//        return new ResultData(stockDayVoList);
//    }
//
//    @GetMapping("/jishujieqi1")
//    public ResultData<List<StockDayVo>> jishujieqi1(){
//        List<StockDayVo> stockDayVoList=findService.jishujieqi1();
//        return new ResultData(stockDayVoList);
//    }
//
//    @GetMapping("/jieQi2")
//    public ResultData<List<StockDayVo>> jieQi2(){
//        List<StockDayVo> stockDayVoList=findService.jieQi2();
//        return new ResultData(stockDayVoList);
//    }
    @GetMapping("/dayYanPanFunction57")
    public ResultData<List<StockDayVo>> dayYanPanFunction57() throws IOException {
        List<StockDayVo> stockDayVoList=findService60.dayYanPanFunction57();
        return new ResultData(stockDayVoList);
    }
    @GetMapping("/dayYanPanFunction60")
    public ResultData<List<StockDayVo>> dayYanPanFunction60() throws IOException {
        List<StockDayVo> stockDayVoList=findService60.dayYanPanFunction60();
        return new ResultData(stockDayVoList);
    }
    @GetMapping("/dayYanPanFunction62")
    public ResultData<List<StockDayVo>> dayYanPanFunction62() throws IOException {
        List<StockDayVo> stockDayVoList=findService2.dayYanPanFunction62();
        return new ResultData(stockDayVoList);
    }
    @GetMapping("/dayYanPanFunction65")
    public ResultData<List<StockDayVo>> dayYanPanFunction65() throws IOException {
        List<StockDayVo> stockDayVoList=findService2.dayYanPanFunction65();
        return new ResultData(stockDayVoList);
    }
    @GetMapping("/dayYanPanFunction67")
    public ResultData<List<StockDayVo>> dayYanPanFunction67() throws IOException {
        List<StockDayVo> stockDayVoList=findService70.dayYanPanFunction67();
        return new ResultData(stockDayVoList);
    }
    @GetMapping("/dayYanPanFunction70")
    public ResultData<List<StockDayVo>> dayYanPanFunction70() throws IOException {
        List<StockDayVo> stockDayVoList=findService70.dayYanPanFunction70();
        return new ResultData(stockDayVoList);
    }
    @GetMapping("/dayYanPanFunction72")
    public ResultData<List<StockDayVo>> dayYanPanFunction72() throws IOException {
        List<StockDayVo> stockDayVoList=findService75.dayYanPanFunction72();
        return new ResultData(stockDayVoList);
    }
    @GetMapping("/dayYanPanFunction75")
    public ResultData<List<StockDayVo>> dayYanPanFunction75() throws IOException {
        List<StockDayVo> stockDayVoList=findService75.dayYanPanFunction75();
        return new ResultData(stockDayVoList);
    }
    @GetMapping("/dayYanPanFunction77")
    public ResultData<List<StockDayVo>> dayYanPanFunction77() throws IOException {
        List<StockDayVo> stockDayVoList=findService80.dayYanPanFunction77();
        return new ResultData(stockDayVoList);
    }
    @GetMapping("/dayYanPanFunction80")
    public ResultData<List<StockDayVo>> dayYanPanFunction80() throws IOException {
        List<StockDayVo> stockDayVoList=findService80.dayYanPanFunction80();
        return new ResultData(stockDayVoList);
    }
    @GetMapping("/dayYanPanFunction85")
    public ResultData<List<StockDayVo>> dayYanPanFunction85() throws IOException {
        List<StockDayVo> stockDayVoList=findService100.dayYanPanFunction85();
        return new ResultData(stockDayVoList);
    }
    @GetMapping("/dayYanPanFunction90")
    public ResultData<List<StockDayVo>> dayYanPanFunction90() throws IOException {
        List<StockDayVo> stockDayVoList=findService100.dayYanPanFunction90();
        return new ResultData(stockDayVoList);
    }
    @GetMapping("/dayYanPanFunction100")
    public ResultData<List<StockDayVo>> dayYanPanFunction100() throws IOException {
        List<StockDayVo> stockDayVoList=findService100.dayYanPanFunction100();
        return new ResultData(stockDayVoList);
    }

    @GetMapping("/dayDaPanFunction")
    public ResultData<List<StockDayVo>> dayDaPanFunction() throws IOException {
        List<StockDayVo> stockDayVoList=findService100.dayDaPanFunction();
        return new ResultData(stockDayVoList);
    }


    @GetMapping("/getYanPan")
    public ResultData getYanPan() throws IOException {
        yanPanService.getYanPan();
        return new ResultData();
    }
    @GetMapping("/getYanPan2")
    public ResultData getYanPan2() throws IOException {
        yanPanService2.getYanPan();
        return new ResultData();
    }
    @GetMapping("/getYanPan3")
    public ResultData getYanPan3() throws IOException {
        yanPanService3.getYanPan();
        return new ResultData();
    }

    @GetMapping("/getYanPan4")
    public ResultData getYanPan4() throws IOException {
        yanPanService4.getYanPan();
        return new ResultData();
    }

    @GetMapping("/getDapan1")
    public ResultData getDapan1() throws IOException {
        daPanService.getDaPan();
        return new ResultData();
    }




}
