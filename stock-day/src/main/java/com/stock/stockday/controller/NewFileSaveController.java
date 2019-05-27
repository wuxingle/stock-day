package com.stock.stockday.controller;


import com.stock.apicommon.model.ResultData;
import com.stock.stockday.newService.NewListStockDayService;
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
public class NewFileSaveController {
    @Autowired
    private NewListStockDayService newListStockDayService;


    @GetMapping("/getKmpqdList")
    public ResultData<List<StockDayVo>> getKmpqdList() throws IOException {
        List<StockDayVo> stockDayVoList=newListStockDayService.getListDayStockKmqd();
//        if (stockDayVoList!=null&&stockDayVoList.size()!=0) {
//            Collections.sort(stockDayVoList, new Comparator<StockDayVo>() {
//                @Override
//                public int compare(StockDayVo o1, StockDayVo o2) {
//                    return (int) (Double.parseDouble(o2.getShangZhangRate2()) - Double.parseDouble(o1.getShangZhangRate2()));
//                }
//            });
//        }
        return new ResultData(stockDayVoList);
    }

    @GetMapping("/getKmQRList")
    public ResultData<List<StockDayVo>> getKmQRList() throws IOException {
        List<StockDayVo> stockDayVoList=newListStockDayService.getListDayStockKmQr();
//        if (stockDayVoList!=null&&stockDayVoList.size()!=0) {
//            Collections.sort(stockDayVoList, new Comparator<StockDayVo>() {
//                @Override
//                public int compare(StockDayVo o1, StockDayVo o2) {
//                    return (int) (Double.parseDouble(o2.getShangZhangRate2()) - Double.parseDouble(o1.getShangZhangRate2()));
//                }
//            });
//        }
        return new ResultData(stockDayVoList);
    }

    @GetMapping("/getQTuXingList")
    public ResultData<List<StockDayVo>> getQTuXingList() throws IOException {
        List<StockDayVo> stockDayVoList=newListStockDayService.getListDayStockQtuXing();
//        if (stockDayVoList!=null&&stockDayVoList.size()!=0) {
//            Collections.sort(stockDayVoList, new Comparator<StockDayVo>() {
//                @Override
//                public int compare(StockDayVo o1, StockDayVo o2) {
//                    return (int) (Double.parseDouble(o2.getShangZhangRate2()) - Double.parseDouble(o1.getShangZhangRate2()));
//                }
//            });
//        }
        return new ResultData(stockDayVoList);
    }

    @GetMapping("/getKTu20LSList")
    public ResultData<List<StockDayVo>> getKTu20LSList() throws IOException {
        List<StockDayVo> stockDayVoList=newListStockDayService.getListDayStockKTu20LS();
//        if (stockDayVoList!=null&&stockDayVoList.size()!=0) {
//            Collections.sort(stockDayVoList, new Comparator<StockDayVo>() {
//                @Override
//                public int compare(StockDayVo o1, StockDayVo o2) {
//                    return (int) (Double.parseDouble(o2.getShangZhangRate2()) - Double.parseDouble(o1.getShangZhangRate2()));
//                }
//            });
//        }
        return new ResultData(stockDayVoList);
    }
}
