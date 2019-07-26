//package com.stock.stockday.newService;
//
//import com.stock.stockday.entity.StockCode;
//import com.stock.stockday.entity.StockDay0000;
//import com.stock.stockday.entity.StockDay399;
//import com.stock.stockday.service.StockCodeService;
//import com.stock.stockday.service.StockDay0000Service;
//import com.stock.stockday.service.StockDay399Service;
//import com.stock.stockday.service.saveFileKMPTD.*;
//import com.stock.stockday.vo.StockDayVo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//
//@Service
//public class NewStockDayServiceImpl implements NewStockDayService {
//    @Autowired
//    private StockCodeService stockCodeService;
//    @Autowired
//    private StockDay399Service stockDay399Service;
//    @Autowired
//    private StockDay0000Service stockDay0000Service;
//    @Autowired
//    private DaySaveFileKmqtd0000Function daySaveFileKmqtd0000Function;
//    @Autowired
//    private DaySaveFileKmqtd0001Function daySaveFileKmqtd0001Function;
//    @Autowired
//    private DaySaveFileKmqtd0002Function daySaveFileKmqtd0002Function;
//    @Autowired
//    private DaySaveFileKmqtd0003Function daySaveFileKmqtd0003Function;
//    @Autowired
//    private DaySaveFileKmqtd0004Function daySaveFileKmqtd0004Function;
//    @Autowired
//    private DaySaveFileKmqtd0005Function daySaveFileKmqtd0005Function;
//    @Autowired
//    private DaySaveFileKmqtd0006Function daySaveFileKmqtd0006Function;
//    @Autowired
//    private DaySaveFileKmqtd0007Function daySaveFileKmqtd0007Function;
//    @Autowired
//    private DaySaveFileKmqtd0008Function daySaveFileKmqtd0008Function;
//    @Autowired
//    private DaySaveFileKmqtd0009Function daySaveFileKmqtd0009Function;
//    @Autowired
//    private DaySaveFileKmqtd0020Function daySaveFileKmqtd0020Function;
//    @Autowired
//    private DaySaveFileKmqtd0021Function daySaveFileKmqtd0021Function;
//    @Autowired
//    private DaySaveFileKmqtd0022Function daySaveFileKmqtd0022Function;
//    @Autowired
//    private DaySaveFileKmqtd0023Function daySaveFileKmqtd0023Function;
//    @Autowired
//    private DaySaveFileKmqtd0024Function daySaveFileKmqtd0024Function;
//    @Autowired
//    private DaySaveFileKmqtd0025Function daySaveFileKmqtd0025Function;
//    @Autowired
//    private DaySaveFileKmqtd0026Function daySaveFileKmqtd0026Function;
//    @Autowired
//    private DaySaveFileKmqtd0027Function daySaveFileKmqtd0027Function;
//    @Autowired
//    private DaySaveFileKmqtd0028Function daySaveFileKmqtd0028Function;
//    @Autowired
//    private DaySaveFileKmqtd3000Function daySaveFileKmqtd3000Function;
//    @Autowired
//    private DaySaveFileKmqtd3001Function daySaveFileKmqtd3001Function;
//    @Autowired
//    private DaySaveFileKmqtd3002Function daySaveFileKmqtd3002Function;
//    @Autowired
//    private DaySaveFileKmqtd3003Function daySaveFileKmqtd3003Function;
//    @Autowired
//    private DaySaveFileKmqtd3004Function daySaveFileKmqtd3004Function;
//    @Autowired
//    private DaySaveFileKmqtd3005Function daySaveFileKmqtd3005Function;
//    @Autowired
//    private DaySaveFileKmqtd6000Function daySaveFileKmqtd6000Function;
//    @Autowired
//    private DaySaveFileKmqtd6001Function daySaveFileKmqtd6001Function;
//    @Autowired
//    private DaySaveFileKmqtd6002Function daySaveFileKmqtd6002Function;
//    @Autowired
//    private DaySaveFileKmqtd6003Function daySaveFileKmqtd6003Function;
//    @Autowired
//    private DaySaveFileKmqtd6004Function daySaveFileKmqtd6004Function;
//    @Autowired
//    private DaySaveFileKmqtd6005Function daySaveFileKmqtd6005Function;
//    @Autowired
//    private DaySaveFileKmqtd6006Function daySaveFileKmqtd6006Function;
//    @Autowired
//    private DaySaveFileKmqtd6007Function daySaveFileKmqtd6007Function;
//    @Autowired
//    private DaySaveFileKmqtd6008Function daySaveFileKmqtd6008Function;
//    @Autowired
//    private DaySaveFileKmqtd6009Function daySaveFileKmqtd6009Function;
//    @Autowired
//    private DaySaveFileKmqtd6010Function daySaveFileKmqtd6010Function;
//    @Autowired
//    private DaySaveFileKmqtd6011Function daySaveFileKmqtd6011Function;
//    @Autowired
//    private DaySaveFileKmqtd6012Function daySaveFileKmqtd6012Function;
//    @Autowired
//    private DaySaveFileKmqtd6013Function daySaveFileKmqtd6013Function;
//    @Autowired
//    private DaySaveFileKmqtd6014Function daySaveFileKmqtd6014Function;
//    @Autowired
//    private DaySaveFileKmqtd6015Function daySaveFileKmqtd6015Function;
//    @Autowired
//    private DaySaveFileKmqtd6016Function daySaveFileKmqtd6016Function;
//    @Autowired
//    private DaySaveFileKmqtd6017Function daySaveFileKmqtd6017Function;
//    @Autowired
//    private DaySaveFileKmqtd6018Function daySaveFileKmqtd6018Function;
//    @Autowired
//    private DaySaveFileKmqtd6019Function daySaveFileKmqtd6019Function;
//    @Autowired
//    private DaySaveFileKmqtd001Function daySaveFileKmqtd001Function;
//    @Autowired
//    private DaySaveFileKmqtd603Function daySaveFileKmqtd603Function;
//
//
//    public String  getNewFile() throws IOException {
//
//        //获取所以编码
//        List<StockCode> stockCodeList = stockCodeService.getStockCodeList();
//        if (stockCodeList == null || stockCodeList.isEmpty()) {
//            return null;
//        }
//
//        List<StockDayVo> stockDayVoList = new ArrayList<>();
//        //获取上证
//        List<StockDay0000> stockDay000001List = stockDay0000Service.selectByCodeAndEx("000001", "SH");
//        //获取sz
//        List<StockDay399> stockDay399001List = stockDay399Service.selectByCodeAndEx("399001", "SZ");
//        //获取中小
//        List<StockDay399> stockDay399005List = stockDay399Service.selectByCodeAndEx("399005", "SZ");
//        //获取创业
//        List<StockDay399> stockDay399006List = stockDay399Service.selectByCodeAndEx("399006", "SZ");
//        //遍历
//        for (StockCode stockCode : stockCodeList) {
//            switch (stockCode.getId().substring(0, 4)) {
//                case "0000":
//                    if (stockCode.getId().equals("000001") && stockCode.getEx().equals("SH")) {
//                        continue;
//                    } else {
//                       daySaveFileKmqtd0000Function.dayZhuHeKmqtdFunction(stockCode, stockDay399001List);
//                    }
//                    continue;
//                case "0001":
//                    daySaveFileKmqtd0001Function.dayZhuHeKmqtdFunction(stockCode, stockDay399001List);
//                    continue;
//                case "0002":
//                    daySaveFileKmqtd0002Function.dayZhuHeKmqtdFunction(stockCode, stockDay399001List);
//                    continue;
//                case "0003":
//                    daySaveFileKmqtd0003Function.dayZhuHeKmqtdFunction(stockCode, stockDay399001List);
//                    continue;
//                case "0004":
//                    daySaveFileKmqtd0004Function.dayZhuHeKmqtdFunction(stockCode, stockDay399001List);
//                    continue;
//                case "0005":
//                    daySaveFileKmqtd0005Function.dayZhuHeKmqtdFunction(stockCode, stockDay399001List);
//                    continue;
//                case "0006":
//                    daySaveFileKmqtd0006Function.dayZhuHeKmqtdFunction(stockCode, stockDay399001List);
//                    continue;
//                case "0007":
//                    daySaveFileKmqtd0007Function.dayZhuHeKmqtdFunction(stockCode, stockDay399001List);
//                    continue;
//                case "0008":
//                    daySaveFileKmqtd0008Function.dayZhuHeKmqtdFunction(stockCode, stockDay399001List);
//                    continue;
//                case "0009":
//                    daySaveFileKmqtd0009Function.dayZhuHeKmqtdFunction(stockCode, stockDay399001List);
//                    continue;
//                case "0020":
//                    daySaveFileKmqtd0020Function.dayZhuHeKmqtdFunction(stockCode, stockDay399005List);
//                    continue;
//                case "0021":
//                    daySaveFileKmqtd0021Function.dayZhuHeKmqtdFunction(stockCode, stockDay399005List);
//                    continue;
//                case "0022":
//                    daySaveFileKmqtd0022Function.dayZhuHeKmqtdFunction(stockCode, stockDay399005List);
//                    continue;
//                case "0023":
//                    daySaveFileKmqtd0023Function.dayZhuHeKmqtdFunction(stockCode, stockDay399005List);
//                    continue;
//                case "0024":
//                    daySaveFileKmqtd0024Function.dayZhuHeKmqtdFunction(stockCode, stockDay399005List);
//                    continue;
//                case "0025":
//                    daySaveFileKmqtd0025Function.dayZhuHeKmqtdFunction(stockCode, stockDay399005List);
//                    continue;
//                case "0026":
//                    daySaveFileKmqtd0026Function.dayZhuHeKmqtdFunction(stockCode, stockDay399005List);
//                    continue;
//                case "0027":
//                    daySaveFileKmqtd0027Function.dayZhuHeKmqtdFunction(stockCode, stockDay399005List);
//                    continue;
//                case "0028":
//                    daySaveFileKmqtd0028Function.dayZhuHeKmqtdFunction(stockCode, stockDay399005List);
//                    continue;
//                case "3000":
//                    daySaveFileKmqtd3000Function.dayZhuHeKmqtdFunction(stockCode, stockDay399006List);
//                    continue;
//                case "3001":
//                    daySaveFileKmqtd3001Function.dayZhuHeKmqtdFunction(stockCode, stockDay399006List);
//                    continue;
//                case "3002":
//                    daySaveFileKmqtd3002Function.dayZhuHeKmqtdFunction(stockCode, stockDay399006List);
//                    continue;
//                case "3003":
//                    daySaveFileKmqtd3003Function.dayZhuHeKmqtdFunction(stockCode, stockDay399006List);
//                    continue;
//                case "3004":
//                    daySaveFileKmqtd3004Function.dayZhuHeKmqtdFunction(stockCode, stockDay399006List);
//                    continue;
//                case "3005":
//                    daySaveFileKmqtd3005Function.dayZhuHeKmqtdFunction(stockCode, stockDay399006List);
//                    continue;
//                case "6000":
//                    daySaveFileKmqtd6000Function.dayZhuHeKmqtdFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6001":
//                    daySaveFileKmqtd6001Function.dayZhuHeKmqtdFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6002":
//                    daySaveFileKmqtd6002Function.dayZhuHeKmqtdFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6003":
//                    daySaveFileKmqtd6003Function.dayZhuHeKmqtdFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6004":
//                    daySaveFileKmqtd6004Function.dayZhuHeKmqtdFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6005":
//                    daySaveFileKmqtd6005Function.dayZhuHeKmqtdFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6006":
//                    daySaveFileKmqtd6006Function.dayZhuHeKmqtdFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6007":
//                    daySaveFileKmqtd6007Function.dayZhuHeKmqtdFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6008":
//                    daySaveFileKmqtd6008Function.dayZhuHeKmqtdFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6009":
//                    daySaveFileKmqtd6009Function.dayZhuHeKmqtdFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6010":
//                    daySaveFileKmqtd6010Function.dayZhuHeKmqtdFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6011":
//                    daySaveFileKmqtd6011Function.dayZhuHeKmqtdFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6012":
//                    daySaveFileKmqtd6012Function.dayZhuHeKmqtdFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6013":
//                    daySaveFileKmqtd6013Function.dayZhuHeKmqtdFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6014":
//                    daySaveFileKmqtd6014Function.dayZhuHeKmqtdFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6015":
//                    daySaveFileKmqtd6015Function.dayZhuHeKmqtdFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6016":
//                    daySaveFileKmqtd6016Function.dayZhuHeKmqtdFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6017":
//                    daySaveFileKmqtd6017Function.dayZhuHeKmqtdFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6018":
//                    daySaveFileKmqtd6018Function.dayZhuHeKmqtdFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6019":
//                    daySaveFileKmqtd6019Function.dayZhuHeKmqtdFunction(stockCode, stockDay000001List);
//                    continue;
//                default:
//                    switch (stockCode.getId().substring(0, 3)) {
//                        case "001":
//                            daySaveFileKmqtd001Function.dayZhuHeKmqtdFunction(stockCode, stockDay399001List);
//                            continue;
//                        case "603":
//                            daySaveFileKmqtd603Function.dayZhuHeKmqtdFunction(stockCode, stockDay000001List);
//                            continue;
//                        default:
//                            continue;
//                    }
//            }
//        }
//        return null;
//    }
//
//    @Override
//    public String getKTu20LS() throws IOException {
//
//        //获取所以编码
//        List<StockCode> stockCodeList = stockCodeService.getStockCodeList();
//        if (stockCodeList == null || stockCodeList.isEmpty()) {
//            return null;
//        }
//
//        List<StockDayVo> stockDayVoList = new ArrayList<>();
//        //获取上证
//        List<StockDay0000> stockDay000001List = stockDay0000Service.selectByCodeAndEx("000001", "SH");
//        //获取sz
//        List<StockDay399> stockDay399001List = stockDay399Service.selectByCodeAndEx("399001", "SZ");
//        //获取中小
//        List<StockDay399> stockDay399005List = stockDay399Service.selectByCodeAndEx("399005", "SZ");
//        //获取创业
//        List<StockDay399> stockDay399006List = stockDay399Service.selectByCodeAndEx("399006", "SZ");
//        //遍历
//        for (StockCode stockCode : stockCodeList) {
//            switch (stockCode.getId().substring(0, 4)) {
////                case "0000":
////                    if (stockCode.getId().equals("000001") && stockCode.getEx().equals("SH")) {
////                        continue;
////                    } else {
////                       daySaveFileKmqtd0000Function.dayZhuHeKTu20LSFunction(stockCode, stockDay399001List);
////                    }
////                    continue;
////                case "0001":
////                    daySaveFileKmqtd0001Function.dayZhuHeKTu20LSFunction(stockCode, stockDay399001List);
////                    continue;
////                case "0002":
////                    daySaveFileKmqtd0002Function.dayZhuHeKTu20LSFunction(stockCode, stockDay399001List);
////                    continue;
////                case "0003":
////                    daySaveFileKmqtd0003Function.dayZhuHeKTu20LSFunction(stockCode, stockDay399001List);
////                    continue;
////                case "0004":
////                    daySaveFileKmqtd0004Function.dayZhuHeKTu20LSFunction(stockCode, stockDay399001List);
////                    continue;
////                case "0005":
////                    daySaveFileKmqtd0005Function.dayZhuHeKTu20LSFunction(stockCode, stockDay399001List);
////                    continue;
////                case "0006":
////                    daySaveFileKmqtd0006Function.dayZhuHeKTu20LSFunction(stockCode, stockDay399001List);
////                    continue;
////                case "0007":
////                    daySaveFileKmqtd0007Function.dayZhuHeKTu20LSFunction(stockCode, stockDay399001List);
////                    continue;
////                case "0008":
////                    daySaveFileKmqtd0008Function.dayZhuHeKTu20LSFunction(stockCode, stockDay399001List);
////                    continue;
////                case "0009":
////                    daySaveFileKmqtd0009Function.dayZhuHeKTu20LSFunction(stockCode, stockDay399001List);
////                    continue;
////                case "0020":
////                    daySaveFileKmqtd0020Function.dayZhuHeKTu20LSFunction(stockCode, stockDay399005List);
////                    continue;
////                case "0021":
////                    daySaveFileKmqtd0021Function.dayZhuHeKTu20LSFunction(stockCode, stockDay399005List);
////                    continue;
////                case "0022":
////                    daySaveFileKmqtd0022Function.dayZhuHeKTu20LSFunction(stockCode, stockDay399005List);
////                    continue;
////                case "0023":
////                    daySaveFileKmqtd0023Function.dayZhuHeKTu20LSFunction(stockCode, stockDay399005List);
////                    continue;
////                case "0024":
////                    daySaveFileKmqtd0024Function.dayZhuHeKTu20LSFunction(stockCode, stockDay399005List);
////                    continue;
////                case "0025":
////                    daySaveFileKmqtd0025Function.dayZhuHeKTu20LSFunction(stockCode, stockDay399005List);
////                    continue;
////                case "0026":
////                    daySaveFileKmqtd0026Function.dayZhuHeKTu20LSFunction(stockCode, stockDay399005List);
////                    continue;
////                case "0027":
////                    daySaveFileKmqtd0027Function.dayZhuHeKTu20LSFunction(stockCode, stockDay399005List);
////                    continue;
////                case "0028":
////                    daySaveFileKmqtd0028Function.dayZhuHeKTu20LSFunction(stockCode, stockDay399005List);
////                    continue;
////                case "3000":
////                    daySaveFileKmqtd3000Function.dayZhuHeKTu20LSFunction(stockCode, stockDay399006List);
////                    continue;
////                case "3001":
////                    daySaveFileKmqtd3001Function.dayZhuHeKTu20LSFunction(stockCode, stockDay399006List);
////                    continue;
////                case "3002":
////                    daySaveFileKmqtd3002Function.dayZhuHeKTu20LSFunction(stockCode, stockDay399006List);
////                    continue;
////                case "3003":
////                    daySaveFileKmqtd3003Function.dayZhuHeKTu20LSFunction(stockCode, stockDay399006List);
////                    continue;
////                case "3004":
////                    daySaveFileKmqtd3004Function.dayZhuHeKTu20LSFunction(stockCode, stockDay399006List);
////                    continue;
////                case "3005":
////                    daySaveFileKmqtd3005Function.dayZhuHeKTu20LSFunction(stockCode, stockDay399006List);
////                    continue;
////                case "6000":
////                    daySaveFileKmqtd6000Function.dayZhuHeKTu20LSFunction(stockCode, stockDay000001List);
////                    continue;
////                case "6001":
////                    daySaveFileKmqtd6001Function.dayZhuHeKTu20LSFunction(stockCode, stockDay000001List);
////                    continue;
////                case "6002":
////                    daySaveFileKmqtd6002Function.dayZhuHeKTu20LSFunction(stockCode, stockDay000001List);
////                    continue;
////                case "6003":
////                    daySaveFileKmqtd6003Function.dayZhuHeKTu20LSFunction(stockCode, stockDay000001List);
////                    continue;
////                case "6004":
////                    daySaveFileKmqtd6004Function.dayZhuHeKTu20LSFunction(stockCode, stockDay000001List);
////                    continue;
////                case "6005":
////                    daySaveFileKmqtd6005Function.dayZhuHeKTu20LSFunction(stockCode, stockDay000001List);
////                    continue;
////                case "6006":
////                    daySaveFileKmqtd6006Function.dayZhuHeKTu20LSFunction(stockCode, stockDay000001List);
////                    continue;
////                case "6007":
////                    daySaveFileKmqtd6007Function.dayZhuHeKTu20LSFunction(stockCode, stockDay000001List);
////                    continue;
////                case "6008":
////                    daySaveFileKmqtd6008Function.dayZhuHeKTu20LSFunction(stockCode, stockDay000001List);
////                    continue;
////                case "6009":
////                    daySaveFileKmqtd6009Function.dayZhuHeKTu20LSFunction(stockCode, stockDay000001List);
////                    continue;
////                case "6010":
////                    daySaveFileKmqtd6010Function.dayZhuHeKTu20LSFunction(stockCode, stockDay000001List);
////                    continue;
////                case "6011":
////                    daySaveFileKmqtd6011Function.dayZhuHeKTu20LSFunction(stockCode, stockDay000001List);
////                    continue;
////                case "6012":
////                    daySaveFileKmqtd6012Function.dayZhuHeKTu20LSFunction(stockCode, stockDay000001List);
////                    continue;
////                case "6013":
////                    daySaveFileKmqtd6013Function.dayZhuHeKTu20LSFunction(stockCode, stockDay000001List);
////                    continue;
////                case "6014":
////                    daySaveFileKmqtd6014Function.dayZhuHeKTu20LSFunction(stockCode, stockDay000001List);
////                    continue;
////                case "6015":
////                    daySaveFileKmqtd6015Function.dayZhuHeKTu20LSFunction(stockCode, stockDay000001List);
////                    continue;
////                case "6016":
////                    daySaveFileKmqtd6016Function.dayZhuHeKTu20LSFunction(stockCode, stockDay000001List);
////                    continue;
////                case "6017":
////                    daySaveFileKmqtd6017Function.dayZhuHeKTu20LSFunction(stockCode, stockDay000001List);
////                    continue;
////                case "6018":
////                    daySaveFileKmqtd6018Function.dayZhuHeKTu20LSFunction(stockCode, stockDay000001List);
////                    continue;
//                case "6019":
//                    daySaveFileKmqtd6019Function.dayZhuHeKTu20LSFunction(stockCode, stockDay000001List);
//                    continue;
//                default:
//                    switch (stockCode.getId().substring(0, 3)) {
////                        case "001":
////                            daySaveFileKmqtd001Function.dayZhuHeKTu20LSFunction(stockCode, stockDay399001List);
////                            continue;
//                        case "603":
//                            daySaveFileKmqtd603Function.dayZhuHeKTu20LSFunction(stockCode, stockDay000001List);
//                            continue;
//                        default:
//                            continue;
//                    }
//            }
//        }
//        return null;
//    }
//
//    @Override
//    public String getKTu20S() throws IOException {
//
//        //获取所以编码
//        List<StockCode> stockCodeList = stockCodeService.getStockCodeList();
//        if (stockCodeList == null || stockCodeList.isEmpty()) {
//            return null;
//        }
//        //获取上证
//        List<StockDay0000> stockDay000001List = stockDay0000Service.selectByCodeAndEx("000001", "SH");
//        //获取sz
//        List<StockDay399> stockDay399001List = stockDay399Service.selectByCodeAndEx("399001", "SZ");
//        //获取中小
//        List<StockDay399> stockDay399005List = stockDay399Service.selectByCodeAndEx("399005", "SZ");
//        //获取创业
//        List<StockDay399> stockDay399006List = stockDay399Service.selectByCodeAndEx("399006", "SZ");
//        //遍历
//        for (StockCode stockCode : stockCodeList) {
//            switch (stockCode.getId().substring(0, 4)) {
//                case "0000":
//                    if (stockCode.getId().equals("000001") && stockCode.getEx().equals("SH")) {
//                        continue;
//                    } else {
//                        daySaveFileKmqtd0000Function.dayZhuHeKTu20SFunction(stockCode, stockDay399001List);
//                    }
//                    continue;
//                case "0001":
//                    daySaveFileKmqtd0001Function.dayZhuHeKTu20SFunction(stockCode, stockDay399001List);
//                    continue;
//                case "0002":
//                    daySaveFileKmqtd0002Function.dayZhuHeKTu20SFunction(stockCode, stockDay399001List);
//                    continue;
//                case "0003":
//                    daySaveFileKmqtd0003Function.dayZhuHeKTu20SFunction(stockCode, stockDay399001List);
//                    continue;
//                case "0004":
//                    daySaveFileKmqtd0004Function.dayZhuHeKTu20SFunction(stockCode, stockDay399001List);
//                    continue;
//                case "0005":
//                    daySaveFileKmqtd0005Function.dayZhuHeKTu20SFunction(stockCode, stockDay399001List);
//                    continue;
//                case "0006":
//                    daySaveFileKmqtd0006Function.dayZhuHeKTu20SFunction(stockCode, stockDay399001List);
//                    continue;
//                case "0007":
//                    daySaveFileKmqtd0007Function.dayZhuHeKTu20SFunction(stockCode, stockDay399001List);
//                    continue;
//                case "0008":
//                    daySaveFileKmqtd0008Function.dayZhuHeKTu20SFunction(stockCode, stockDay399001List);
//                    continue;
//                case "0009":
//                    daySaveFileKmqtd0009Function.dayZhuHeKTu20SFunction(stockCode, stockDay399001List);
//                    continue;
//                case "0020":
//                    daySaveFileKmqtd0020Function.dayZhuHeKTu20SFunction(stockCode, stockDay399005List);
//                    continue;
//                case "0021":
//                    daySaveFileKmqtd0021Function.dayZhuHeKTu20SFunction(stockCode, stockDay399005List);
//                    continue;
//                case "0022":
//                    daySaveFileKmqtd0022Function.dayZhuHeKTu20SFunction(stockCode, stockDay399005List);
//                    continue;
//                case "0023":
//                    daySaveFileKmqtd0023Function.dayZhuHeKTu20SFunction(stockCode, stockDay399005List);
//                    continue;
//                case "0024":
//                    daySaveFileKmqtd0024Function.dayZhuHeKTu20SFunction(stockCode, stockDay399005List);
//                    continue;
//                case "0025":
//                    daySaveFileKmqtd0025Function.dayZhuHeKTu20SFunction(stockCode, stockDay399005List);
//                    continue;
//                case "0026":
//                    daySaveFileKmqtd0026Function.dayZhuHeKTu20SFunction(stockCode, stockDay399005List);
//                    continue;
//                case "0027":
//                    daySaveFileKmqtd0027Function.dayZhuHeKTu20SFunction(stockCode, stockDay399005List);
//                    continue;
//                case "0028":
//                    daySaveFileKmqtd0028Function.dayZhuHeKTu20SFunction(stockCode, stockDay399005List);
//                    continue;
//                case "3000":
//                    daySaveFileKmqtd3000Function.dayZhuHeKTu20SFunction(stockCode, stockDay399006List);
//                    continue;
//                case "3001":
//                    daySaveFileKmqtd3001Function.dayZhuHeKTu20SFunction(stockCode, stockDay399006List);
//                    continue;
//                case "3002":
//                    daySaveFileKmqtd3002Function.dayZhuHeKTu20SFunction(stockCode, stockDay399006List);
//                    continue;
//                case "3003":
//                    daySaveFileKmqtd3003Function.dayZhuHeKTu20SFunction(stockCode, stockDay399006List);
//                    continue;
//                case "3004":
//                    daySaveFileKmqtd3004Function.dayZhuHeKTu20SFunction(stockCode, stockDay399006List);
//                    continue;
//                case "3005":
//                    daySaveFileKmqtd3005Function.dayZhuHeKTu20SFunction(stockCode, stockDay399006List);
//                    continue;
//                case "6000":
//                    daySaveFileKmqtd6000Function.dayZhuHeKTu20SFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6001":
//                    daySaveFileKmqtd6001Function.dayZhuHeKTu20SFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6002":
//                    daySaveFileKmqtd6002Function.dayZhuHeKTu20SFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6003":
//                    daySaveFileKmqtd6003Function.dayZhuHeKTu20SFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6004":
//                    daySaveFileKmqtd6004Function.dayZhuHeKTu20SFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6005":
//                    daySaveFileKmqtd6005Function.dayZhuHeKTu20SFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6006":
//                    daySaveFileKmqtd6006Function.dayZhuHeKTu20SFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6007":
//                    daySaveFileKmqtd6007Function.dayZhuHeKTu20SFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6008":
//                    daySaveFileKmqtd6008Function.dayZhuHeKTu20SFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6009":
//                    daySaveFileKmqtd6009Function.dayZhuHeKTu20SFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6010":
//                    daySaveFileKmqtd6010Function.dayZhuHeKTu20SFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6011":
//                    daySaveFileKmqtd6011Function.dayZhuHeKTu20SFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6012":
//                    daySaveFileKmqtd6012Function.dayZhuHeKTu20SFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6013":
//                    daySaveFileKmqtd6013Function.dayZhuHeKTu20SFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6014":
//                    daySaveFileKmqtd6014Function.dayZhuHeKTu20SFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6015":
//                    daySaveFileKmqtd6015Function.dayZhuHeKTu20SFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6016":
//                    daySaveFileKmqtd6016Function.dayZhuHeKTu20SFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6017":
//                    daySaveFileKmqtd6017Function.dayZhuHeKTu20SFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6018":
//                    daySaveFileKmqtd6018Function.dayZhuHeKTu20SFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6019":
//                    daySaveFileKmqtd6019Function.dayZhuHeKTu20SFunction(stockCode, stockDay000001List);
//                    continue;
//                default:
//                    switch (stockCode.getId().substring(0, 3)) {
//                        case "001":
//                            daySaveFileKmqtd001Function.dayZhuHeKTu20SFunction(stockCode, stockDay399001List);
//                            continue;
//                        case "603":
//                            daySaveFileKmqtd603Function.dayZhuHeKTu20SFunction(stockCode, stockDay000001List);
//                            continue;
//                        default:
//                            continue;
//                    }
//            }
//        }
//        return null;
//    }
//
//    @Override
//    public String getKTu20L() throws IOException {
//
//        //获取所以编码
//        List<StockCode> stockCodeList = stockCodeService.getStockCodeList();
//        if (stockCodeList == null || stockCodeList.isEmpty()) {
//            return null;
//        }
//
//        List<StockDayVo> stockDayVoList = new ArrayList<>();
//        //获取上证
//        List<StockDay0000> stockDay000001List = stockDay0000Service.selectByCodeAndEx("000001", "SH");
//        //获取sz
//        List<StockDay399> stockDay399001List = stockDay399Service.selectByCodeAndEx("399001", "SZ");
//        //获取中小
//        List<StockDay399> stockDay399005List = stockDay399Service.selectByCodeAndEx("399005", "SZ");
//        //获取创业
//        List<StockDay399> stockDay399006List = stockDay399Service.selectByCodeAndEx("399006", "SZ");
//        //遍历
//        for (StockCode stockCode : stockCodeList) {
//            switch (stockCode.getId().substring(0, 4)) {
//                case "0000":
//                    if (stockCode.getId().equals("000001") && stockCode.getEx().equals("SH")) {
//                        continue;
//                    } else {
//                        daySaveFileKmqtd0000Function.dayZhuHeKTu20LFunction(stockCode, stockDay399001List);
//                    }
//                    continue;
//                case "0001":
//                    daySaveFileKmqtd0001Function.dayZhuHeKTu20LFunction(stockCode, stockDay399001List);
//                    continue;
//                case "0002":
//                    daySaveFileKmqtd0002Function.dayZhuHeKTu20LFunction(stockCode, stockDay399001List);
//                    continue;
//                case "0003":
//                    daySaveFileKmqtd0003Function.dayZhuHeKTu20LFunction(stockCode, stockDay399001List);
//                    continue;
//                case "0004":
//                    daySaveFileKmqtd0004Function.dayZhuHeKTu20LFunction(stockCode, stockDay399001List);
//                    continue;
//                case "0005":
//                    daySaveFileKmqtd0005Function.dayZhuHeKTu20LFunction(stockCode, stockDay399001List);
//                    continue;
//                case "0006":
//                    daySaveFileKmqtd0006Function.dayZhuHeKTu20LFunction(stockCode, stockDay399001List);
//                    continue;
//                case "0007":
//                    daySaveFileKmqtd0007Function.dayZhuHeKTu20LFunction(stockCode, stockDay399001List);
//                    continue;
//                case "0008":
//                    daySaveFileKmqtd0008Function.dayZhuHeKTu20LFunction(stockCode, stockDay399001List);
//                    continue;
//                case "0009":
//                    daySaveFileKmqtd0009Function.dayZhuHeKTu20LFunction(stockCode, stockDay399001List);
//                    continue;
//                case "0020":
//                    daySaveFileKmqtd0020Function.dayZhuHeKTu20LFunction(stockCode, stockDay399005List);
//                    continue;
//                case "0021":
//                    daySaveFileKmqtd0021Function.dayZhuHeKTu20LFunction(stockCode, stockDay399005List);
//                    continue;
//                case "0022":
//                    daySaveFileKmqtd0022Function.dayZhuHeKTu20LFunction(stockCode, stockDay399005List);
//                    continue;
//                case "0023":
//                    daySaveFileKmqtd0023Function.dayZhuHeKTu20LFunction(stockCode, stockDay399005List);
//                    continue;
//                case "0024":
//                    daySaveFileKmqtd0024Function.dayZhuHeKTu20LFunction(stockCode, stockDay399005List);
//                    continue;
//                case "0025":
//                    daySaveFileKmqtd0025Function.dayZhuHeKTu20LFunction(stockCode, stockDay399005List);
//                    continue;
//                case "0026":
//                    daySaveFileKmqtd0026Function.dayZhuHeKTu20LFunction(stockCode, stockDay399005List);
//                    continue;
//                case "0027":
//                    daySaveFileKmqtd0027Function.dayZhuHeKTu20LFunction(stockCode, stockDay399005List);
//                    continue;
//                case "0028":
//                    daySaveFileKmqtd0028Function.dayZhuHeKTu20LFunction(stockCode, stockDay399005List);
//                    continue;
//                case "3000":
//                    daySaveFileKmqtd3000Function.dayZhuHeKTu20LFunction(stockCode, stockDay399006List);
//                    continue;
//                case "3001":
//                    daySaveFileKmqtd3001Function.dayZhuHeKTu20LFunction(stockCode, stockDay399006List);
//                    continue;
//                case "3002":
//                    daySaveFileKmqtd3002Function.dayZhuHeKTu20LFunction(stockCode, stockDay399006List);
//                    continue;
//                case "3003":
//                    daySaveFileKmqtd3003Function.dayZhuHeKTu20LFunction(stockCode, stockDay399006List);
//                    continue;
//                case "3004":
//                    daySaveFileKmqtd3004Function.dayZhuHeKTu20LFunction(stockCode, stockDay399006List);
//                    continue;
//                case "3005":
//                    daySaveFileKmqtd3005Function.dayZhuHeKTu20LFunction(stockCode, stockDay399006List);
//                    continue;
//                case "6000":
//                    daySaveFileKmqtd6000Function.dayZhuHeKTu20LFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6001":
//                    daySaveFileKmqtd6001Function.dayZhuHeKTu20LFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6002":
//                    daySaveFileKmqtd6002Function.dayZhuHeKTu20LFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6003":
//                    daySaveFileKmqtd6003Function.dayZhuHeKTu20LFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6004":
//                    daySaveFileKmqtd6004Function.dayZhuHeKTu20LFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6005":
//                    daySaveFileKmqtd6005Function.dayZhuHeKTu20LFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6006":
//                    daySaveFileKmqtd6006Function.dayZhuHeKTu20LFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6007":
//                    daySaveFileKmqtd6007Function.dayZhuHeKTu20LFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6008":
//                    daySaveFileKmqtd6008Function.dayZhuHeKTu20LFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6009":
//                    daySaveFileKmqtd6009Function.dayZhuHeKTu20LFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6010":
//                    daySaveFileKmqtd6010Function.dayZhuHeKTu20LFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6011":
//                    daySaveFileKmqtd6011Function.dayZhuHeKTu20LFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6012":
//                    daySaveFileKmqtd6012Function.dayZhuHeKTu20LFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6013":
//                    daySaveFileKmqtd6013Function.dayZhuHeKTu20LFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6014":
//                    daySaveFileKmqtd6014Function.dayZhuHeKTu20LFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6015":
//                    daySaveFileKmqtd6015Function.dayZhuHeKTu20LFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6016":
//                    daySaveFileKmqtd6016Function.dayZhuHeKTu20LFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6017":
//                    daySaveFileKmqtd6017Function.dayZhuHeKTu20LFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6018":
//                    daySaveFileKmqtd6018Function.dayZhuHeKTu20LFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6019":
//                    daySaveFileKmqtd6019Function.dayZhuHeKTu20LFunction(stockCode, stockDay000001List);
//                    continue;
//                default:
//                    switch (stockCode.getId().substring(0, 3)) {
//                        case "001":
//                            daySaveFileKmqtd001Function.dayZhuHeKTu20LFunction(stockCode, stockDay399001List);
//                            continue;
//                        case "603":
//                            daySaveFileKmqtd603Function.dayZhuHeKTu20LFunction(stockCode, stockDay000001List);
//                            continue;
//                        default:
//                            continue;
//                    }
//            }
//        }
//        return null;
//    }
//
//    @Override
//    public String getKMAQ20() throws IOException {
//
//        //获取所以编码
//        List<StockCode> stockCodeList = stockCodeService.getStockCodeList();
//        if (stockCodeList == null || stockCodeList.isEmpty()) {
//            return null;
//        }
//
//        List<StockDayVo> stockDayVoList = new ArrayList<>();
//        //获取上证
//        List<StockDay0000> stockDay000001List = stockDay0000Service.selectByCodeAndEx("000001", "SH");
//        //获取sz
//        List<StockDay399> stockDay399001List = stockDay399Service.selectByCodeAndEx("399001", "SZ");
//        //获取中小
//        List<StockDay399> stockDay399005List = stockDay399Service.selectByCodeAndEx("399005", "SZ");
//        //获取创业
//        List<StockDay399> stockDay399006List = stockDay399Service.selectByCodeAndEx("399006", "SZ");
//        //遍历
//        for (StockCode stockCode : stockCodeList) {
//            switch (stockCode.getId().substring(0, 4)) {
//                case "0000":
//                    if (stockCode.getId().equals("000001") && stockCode.getEx().equals("SH")) {
//                        continue;
//                    } else {
//                        daySaveFileKmqtd0000Function.dayZhuHeKMAQ20Function(stockCode, stockDay399001List);
//                    }
//                    continue;
//                case "0001":
//                    daySaveFileKmqtd0001Function.dayZhuHeKMAQ20Function(stockCode, stockDay399001List);
//                    continue;
//                case "0002":
//                    daySaveFileKmqtd0002Function.dayZhuHeKMAQ20Function(stockCode, stockDay399001List);
//                    continue;
//                case "0003":
//                    daySaveFileKmqtd0003Function.dayZhuHeKMAQ20Function(stockCode, stockDay399001List);
//                    continue;
//                case "0004":
//                    daySaveFileKmqtd0004Function.dayZhuHeKMAQ20Function(stockCode, stockDay399001List);
//                    continue;
//                case "0005":
//                    daySaveFileKmqtd0005Function.dayZhuHeKMAQ20Function(stockCode, stockDay399001List);
//                    continue;
//                case "0006":
//                    daySaveFileKmqtd0006Function.dayZhuHeKMAQ20Function(stockCode, stockDay399001List);
//                    continue;
//                case "0007":
//                    daySaveFileKmqtd0007Function.dayZhuHeKMAQ20Function(stockCode, stockDay399001List);
//                    continue;
//                case "0008":
//                    daySaveFileKmqtd0008Function.dayZhuHeKMAQ20Function(stockCode, stockDay399001List);
//                    continue;
//                case "0009":
//                    daySaveFileKmqtd0009Function.dayZhuHeKMAQ20Function(stockCode, stockDay399001List);
//                    continue;
//                case "0020":
//                    daySaveFileKmqtd0020Function.dayZhuHeKMAQ20Function(stockCode, stockDay399005List);
//                    continue;
//                case "0021":
//                    daySaveFileKmqtd0021Function.dayZhuHeKMAQ20Function(stockCode, stockDay399005List);
//                    continue;
//                case "0022":
//                    daySaveFileKmqtd0022Function.dayZhuHeKMAQ20Function(stockCode, stockDay399005List);
//                    continue;
//                case "0023":
//                    daySaveFileKmqtd0023Function.dayZhuHeKMAQ20Function(stockCode, stockDay399005List);
//                    continue;
//                case "0024":
//                    daySaveFileKmqtd0024Function.dayZhuHeKMAQ20Function(stockCode, stockDay399005List);
//                    continue;
//                case "0025":
//                    daySaveFileKmqtd0025Function.dayZhuHeKMAQ20Function(stockCode, stockDay399005List);
//                    continue;
//                case "0026":
//                    daySaveFileKmqtd0026Function.dayZhuHeKMAQ20Function(stockCode, stockDay399005List);
//                    continue;
//                case "0027":
//                    daySaveFileKmqtd0027Function.dayZhuHeKMAQ20Function(stockCode, stockDay399005List);
//                    continue;
//                case "0028":
//                    daySaveFileKmqtd0028Function.dayZhuHeKMAQ20Function(stockCode, stockDay399005List);
//                    continue;
//                case "3000":
//                    daySaveFileKmqtd3000Function.dayZhuHeKMAQ20Function(stockCode, stockDay399006List);
//                    continue;
//                case "3001":
//                    daySaveFileKmqtd3001Function.dayZhuHeKMAQ20Function(stockCode, stockDay399006List);
//                    continue;
//                case "3002":
//                    daySaveFileKmqtd3002Function.dayZhuHeKMAQ20Function(stockCode, stockDay399006List);
//                    continue;
//                case "3003":
//                    daySaveFileKmqtd3003Function.dayZhuHeKMAQ20Function(stockCode, stockDay399006List);
//                    continue;
//                case "3004":
//                    daySaveFileKmqtd3004Function.dayZhuHeKMAQ20Function(stockCode, stockDay399006List);
//                    continue;
//                case "3005":
//                    daySaveFileKmqtd3005Function.dayZhuHeKMAQ20Function(stockCode, stockDay399006List);
//                    continue;
//                case "6000":
//                    daySaveFileKmqtd6000Function.dayZhuHeKMAQ20Function(stockCode, stockDay000001List);
//                    continue;
//                case "6001":
//                    daySaveFileKmqtd6001Function.dayZhuHeKMAQ20Function(stockCode, stockDay000001List);
//                    continue;
//                case "6002":
//                    daySaveFileKmqtd6002Function.dayZhuHeKMAQ20Function(stockCode, stockDay000001List);
//                    continue;
//                case "6003":
//                    daySaveFileKmqtd6003Function.dayZhuHeKMAQ20Function(stockCode, stockDay000001List);
//                    continue;
//                case "6004":
//                    daySaveFileKmqtd6004Function.dayZhuHeKMAQ20Function(stockCode, stockDay000001List);
//                    continue;
//                case "6005":
//                    daySaveFileKmqtd6005Function.dayZhuHeKMAQ20Function(stockCode, stockDay000001List);
//                    continue;
//                case "6006":
//                    daySaveFileKmqtd6006Function.dayZhuHeKMAQ20Function(stockCode, stockDay000001List);
//                    continue;
//                case "6007":
//                    daySaveFileKmqtd6007Function.dayZhuHeKMAQ20Function(stockCode, stockDay000001List);
//                    continue;
//                case "6008":
//                    daySaveFileKmqtd6008Function.dayZhuHeKMAQ20Function(stockCode, stockDay000001List);
//                    continue;
//                case "6009":
//                    daySaveFileKmqtd6009Function.dayZhuHeKMAQ20Function(stockCode, stockDay000001List);
//                    continue;
//                case "6010":
//                    daySaveFileKmqtd6010Function.dayZhuHeKMAQ20Function(stockCode, stockDay000001List);
//                    continue;
//                case "6011":
//                    daySaveFileKmqtd6011Function.dayZhuHeKMAQ20Function(stockCode, stockDay000001List);
//                    continue;
//                case "6012":
//                    daySaveFileKmqtd6012Function.dayZhuHeKMAQ20Function(stockCode, stockDay000001List);
//                    continue;
//                case "6013":
//                    daySaveFileKmqtd6013Function.dayZhuHeKMAQ20Function(stockCode, stockDay000001List);
//                    continue;
//                case "6014":
//                    daySaveFileKmqtd6014Function.dayZhuHeKMAQ20Function(stockCode, stockDay000001List);
//                    continue;
//                case "6015":
//                    daySaveFileKmqtd6015Function.dayZhuHeKMAQ20Function(stockCode, stockDay000001List);
//                    continue;
//                case "6016":
//                    daySaveFileKmqtd6016Function.dayZhuHeKMAQ20Function(stockCode, stockDay000001List);
//                    continue;
//                case "6017":
//                    daySaveFileKmqtd6017Function.dayZhuHeKMAQ20Function(stockCode, stockDay000001List);
//                    continue;
//                case "6018":
//                    daySaveFileKmqtd6018Function.dayZhuHeKMAQ20Function(stockCode, stockDay000001List);
//                    continue;
//                case "6019":
//                    daySaveFileKmqtd6019Function.dayZhuHeKMAQ20Function(stockCode, stockDay000001List);
//                    continue;
//                default:
//                    switch (stockCode.getId().substring(0, 3)) {
//                        case "001":
//                            daySaveFileKmqtd001Function.dayZhuHeKMAQ20Function(stockCode, stockDay399001List);
//                            continue;
//                        case "603":
//                            daySaveFileKmqtd603Function.dayZhuHeKMAQ20Function(stockCode, stockDay000001List);
//                            continue;
//                        default:
//                            continue;
//                    }
//            }
//        }
//        return null;
//    }
//
//}
