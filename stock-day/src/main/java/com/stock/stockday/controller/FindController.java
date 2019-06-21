package com.stock.stockday.controller;

import com.stock.apicommon.model.ResultData;
import com.stock.stockday.newService.find3.findService2;
import com.stock.stockday.service.find.findService;
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
    @Autowired
    private findService findService;
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

    @GetMapping("/jieQi2")
    public ResultData<List<StockDayVo>> jieQi2(){
        List<StockDayVo> stockDayVoList=findService.jieQi2();
        return new ResultData(stockDayVoList);
    }
    @GetMapping("/u3ShengVDapan4")
    public ResultData<List<StockDayVo>> u3ShengVDapan4() throws IOException {
        List<StockDayVo> stockDayVoList=findService2.U3ShengVDapan4();
        return new ResultData(stockDayVoList);
    }
    @GetMapping("/u3ShengVDapan2")
    public ResultData<List<StockDayVo>> u3ShengVDapan2() throws IOException {
        List<StockDayVo> stockDayVoList=findService2.U3shengVDapan2();
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






}
