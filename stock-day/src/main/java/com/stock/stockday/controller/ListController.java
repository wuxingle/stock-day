//package com.stock.stockday.controller;
//
//import com.stock.apicommon.model.ResultData;
//import com.stock.stockday.newService.list1.ZhuHeListService;
//import com.stock.stockday.service.list.ListStockService;
//import com.stock.stockday.vo.StockDayVo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.io.IOException;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//
//@RestController
//@CrossOrigin(allowCredentials = "true",allowedHeaders = "*")
//@RequestMapping(value = "/day/v1", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
//public class ListController {
//    @Autowired
//    private ListStockService listStockService;
//    @Autowired
//    private ZhuHeListService zhuHeListService;
//
//
//    @GetMapping("/listStock")
//    public ResultData<List<StockDayVo>> getListStock() throws IOException {
//        List<StockDayVo> stockDayVoList=listStockService.getListStock();
////        if (stockDayVoList!=null&&stockDayVoList.size()!=0) {
////            Collections.sort(stockDayVoList, new Comparator<StockDayVo>() {
////                @Override
////                public int compare(StockDayVo o1, StockDayVo o2) {
////                    return (int) (Double.parseDouble(o2.getShangZhangRate2()) - Double.parseDouble(o1.getShangZhangRate2()));
////                }
////            });
////        }
//        return new ResultData(stockDayVoList);
//    }
//
//    @GetMapping("/getZhuYanJiShuList")
//    public ResultData<List<StockDayVo>> getZhuYanJiShuList() throws IOException {
//        List<StockDayVo> stockDayVoList=listStockService.getZhuYanJiShuList();
////        Collections.sort(stockDayVoList, new Comparator<StockDayVo>() {
////            @Override
////            public int compare(StockDayVo o1, StockDayVo o2) {
////                return (int)(Double.parseDouble(o2.getShangZhangRate2())-Double.parseDouble(o1.getShangZhangRate2()));
////            }
////        });
//        return new ResultData(stockDayVoList);
//    }
//
//    @GetMapping("/getChunTuXingList")
//    public ResultData<List<StockDayVo>> getChunTuXingList() throws IOException {
//        List<StockDayVo> stockDayVoList=listStockService.getChunTuXingList();
////        Collections.sort(stockDayVoList, new Comparator<StockDayVo>() {
////            @Override
////            public int compare(StockDayVo o1, StockDayVo o2) {
////                return (int)(Double.parseDouble(o2.getShangZhangRate2())-Double.parseDouble(o1.getShangZhangRate2()));
////            }
////        });
//        return new ResultData(stockDayVoList);
//    }
//
//    @GetMapping("/getChunJiShuList")
//    public ResultData<List<StockDayVo>> getChunJiShuList() throws IOException {
//        List<StockDayVo> stockDayVoList=listStockService.getChunJiShuList();
////        Collections.sort(stockDayVoList, new Comparator<StockDayVo>() {
////            @Override
////            public int compare(StockDayVo o1, StockDayVo o2) {
////                return (int)(Double.parseDouble(o2.getShangZhangRate2())-Double.parseDouble(o1.getShangZhangRate2()));
////            }
////        });
//        return new ResultData(stockDayVoList);
//    }
//
//    @GetMapping("/getAllCommonList")
//    public ResultData<List<StockDayVo>> getAllCommonList() throws IOException {
//        List<StockDayVo> stockDayVoList=listStockService.getAllCommonList();
////        Collections.sort(stockDayVoList, new Comparator<StockDayVo>() {
////            @Override
////            public int compare(StockDayVo o1, StockDayVo o2) {
////                return (int)(Double.parseDouble(o2.getShangZhangRate2())-Double.parseDouble(o1.getShangZhangRate2()));
////            }
////        });
//        return new ResultData(stockDayVoList);
//    }
//
//    @GetMapping("/getBenPanList")
//    public ResultData<List<StockDayVo>> getBenPanList() throws IOException {
//        List<StockDayVo> stockDayVoList=zhuHeListService.getListDayStockBenPan();
////        Collections.sort(stockDayVoList, new Comparator<StockDayVo>() {
////            @Override
////            public int compare(StockDayVo o1, StockDayVo o2) {
////                return (int)(Double.parseDouble(o2.getShangZhangRate2())-Double.parseDouble(o1.getShangZhangRate2()));
////            }
////        });
//        return new ResultData(stockDayVoList);
//    }
//
//    @GetMapping("/get24List")
//    public ResultData<List<StockDayVo>> get24List() throws IOException {
//        List<StockDayVo> stockDayVoList=zhuHeListService.getListDayStock24();
////        Collections.sort(stockDayVoList, new Comparator<StockDayVo>() {
////            @Override
////            public int compare(StockDayVo o1, StockDayVo o2) {
////                return (int)(Double.parseDouble(o2.getShangZhangRate2())-Double.parseDouble(o1.getShangZhangRate2()));
////            }
////        });
//        return new ResultData(stockDayVoList);
//    }
//
//    @GetMapping("/get33List")
//    public ResultData<List<StockDayVo>> get33List() throws IOException {
//        List<StockDayVo> stockDayVoList=zhuHeListService.getListDayStock33();
////        Collections.sort(stockDayVoList, new Comparator<StockDayVo>() {
////            @Override
////            public int compare(StockDayVo o1, StockDayVo o2) {
////                return (int)(Double.parseDouble(o2.getShangZhangRate2())-Double.parseDouble(o1.getShangZhangRate2()));
////            }
////        });
//        return new ResultData(stockDayVoList);
//    }
//
//    @GetMapping("/get42List")
//    public ResultData<List<StockDayVo>> get42List() throws IOException {
//        List<StockDayVo> stockDayVoList=zhuHeListService.getListDayStock42();
////        Collections.sort(stockDayVoList, new Comparator<StockDayVo>() {
////            @Override
////            public int compare(StockDayVo o1, StockDayVo o2) {
////                return (int)(Double.parseDouble(o2.getShangZhangRate2())-Double.parseDouble(o1.getShangZhangRate2()));
////            }
////        });
//        return new ResultData(stockDayVoList);
//    }
//
//}
