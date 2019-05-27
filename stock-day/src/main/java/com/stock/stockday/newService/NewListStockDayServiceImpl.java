package com.stock.stockday.newService;

import com.stock.stockday.entity.StockCode;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay399;
import com.stock.stockday.newService.list.*;
import com.stock.stockday.service.StockCodeService;
import com.stock.stockday.service.StockDay0000Service;
import com.stock.stockday.service.StockDay399Service;
import com.stock.stockday.vo.StockDayVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class NewListStockDayServiceImpl implements NewListStockDayService{
    @Autowired
    private StockCodeService stockCodeService;
    @Autowired
    private StockDay399Service stockDay399Service;
    @Autowired
    private StockDay0000Service stockDay0000Service;
    @Autowired
    private NewGetListStock0000 newGetListStock0000;
    @Autowired
    private NewGetListStock0001 newGetListStock0001;
    @Autowired
    private NewGetListStock0002 newGetListStock0002;
    @Autowired
    private NewGetListStock0003 newGetListStock0003;
    @Autowired
    private NewGetListStock0004 newGetListStock0004;
    @Autowired
    private NewGetListStock0005 newGetListStock0005;
    @Autowired
    private NewGetListStock0006 newGetListStock0006;
    @Autowired
    private NewGetListStock0007 newGetListStock0007;
    @Autowired
    private NewGetListStock0008 newGetListStock0008;
    @Autowired
    private NewGetListStock0009 newGetListStock0009;
    @Autowired
    private NewGetListStock0020 newGetListStock0020;
    @Autowired
    private NewGetListStock0021 newGetListStock0021;
    @Autowired
    private NewGetListStock0022 newGetListStock0022;
    @Autowired
    private NewGetListStock0023 newGetListStock0023;
    @Autowired
    private NewGetListStock0024 newGetListStock0024;
    @Autowired
    private NewGetListStock0025 newGetListStock0025;
    @Autowired
    private NewGetListStock0026 newGetListStock0026;
    @Autowired
    private NewGetListStock0027 newGetListStock0027;
    @Autowired
    private NewGetListStock0028 newGetListStock0028;
    @Autowired
    private NewGetListStock3000 newGetListStock3000;
    @Autowired
    private NewGetListStock3001 newGetListStock3001;
    @Autowired
    private NewGetListStock3002 newGetListStock3002;
    @Autowired
    private NewGetListStock3003 newGetListStock3003;
    @Autowired
    private NewGetListStock3004 newGetListStock3004;
    @Autowired
    private NewGetListStock3005 newGetListStock3005;
    @Autowired
    private NewGetListStock6000 newGetListStock6000;
    @Autowired
    private NewGetListStock6001 newGetListStock6001;
    @Autowired
    private NewGetListStock6002 newGetListStock6002;
    @Autowired
    private NewGetListStock6003 newGetListStock6003;
    @Autowired
    private NewGetListStock6004 newGetListStock6004;
    @Autowired
    private NewGetListStock6005 newGetListStock6005;
    @Autowired
    private NewGetListStock6006 newGetListStock6006;
    @Autowired
    private NewGetListStock6007 newGetListStock6007;
    @Autowired
    private NewGetListStock6008 newGetListStock6008;
    @Autowired
    private NewGetListStock6009 newGetListStock6009;
    @Autowired
    private NewGetListStock6010 newGetListStock6010;
    @Autowired
    private NewGetListStock6011 newGetListStock6011;
    @Autowired
    private NewGetListStock6012 newGetListStock6012;
    @Autowired
    private NewGetListStock6013 newGetListStock6013;
    @Autowired
    private NewGetListStock6014 newGetListStock6014;
    @Autowired
    private NewGetListStock6015 newGetListStock6015;
    @Autowired
    private NewGetListStock6016 newGetListStock6016;
    @Autowired
    private NewGetListStock6017 newGetListStock6017;
    @Autowired
    private NewGetListStock6018 newGetListStock6018;
    @Autowired
    private NewGetListStock6019 newGetListStock6019;
    @Autowired
    private NewGetListStock001 newGetListStock001;
    @Autowired
    private NewGetListStock603 newGetListStock603;



    @Override
    public List<StockDayVo> getListDayStockKmqd() throws IOException {
        //获取所以编码
        List<StockCode> stockCodeList = stockCodeService.getStockCodeList();
        if (stockCodeList == null || stockCodeList.isEmpty()) {
            return null;
        }
        List<StockDayVo> stockDayVoList = new ArrayList<>();
        //获取上证
        List<StockDay0000> stockDay000001List = stockDay0000Service.selectByCodeAndEx("000001", "SH");
        //获取sz
        List<StockDay399> stockDay399001List = stockDay399Service.selectByCodeAndEx("399001", "SZ");
        //获取中小
        List<StockDay399> stockDay399005List = stockDay399Service.selectByCodeAndEx("399005", "SZ");
        //获取创业
        List<StockDay399> stockDay399006List = stockDay399Service.selectByCodeAndEx("399006", "SZ");
        //遍历
        for (StockCode stockCode : stockCodeList) {
            switch (stockCode.getId().substring(0, 4)) {
                case "0000":
                    if (stockCode.getId().equals("000001") && stockCode.getEx().equals("SH")) {
                        continue;
                    } else {
                        newGetListStock0000.getKMPTDListStock(stockCode, stockDayVoList, stockDay399001List);
                    }
                    continue;
                case "0001":
                    newGetListStock0001.getKMPTDListStock(stockCode, stockDayVoList, stockDay399001List);
                    continue;
                case "0002":
                    newGetListStock0002.getKMPTDListStock(stockCode, stockDayVoList, stockDay399001List);
                    continue;
                case "0003":
                    newGetListStock0003.getKMPTDListStock(stockCode, stockDayVoList, stockDay399001List);
                    continue;
                case "0004":
                    newGetListStock0004.getKMPTDListStock(stockCode, stockDayVoList, stockDay399001List);
                    continue;
                case "0005":
                    newGetListStock0005.getKMPTDListStock(stockCode, stockDayVoList, stockDay399001List);
                    continue;
                case "0006":
                    newGetListStock0006.getKMPTDListStock(stockCode, stockDayVoList, stockDay399001List);
                    continue;
                case "0007":
                    newGetListStock0007.getKMPTDListStock(stockCode, stockDayVoList, stockDay399001List);
                    continue;
                case "0008":
                    newGetListStock0008.getKMPTDListStock(stockCode, stockDayVoList, stockDay399001List);
                    continue;
                case "0009":
                    newGetListStock0009.getKMPTDListStock(stockCode, stockDayVoList, stockDay399001List);
                    continue;
                case "0020":
                    newGetListStock0020.getKMPTDListStock(stockCode, stockDayVoList, stockDay399005List);
                    continue;
                case "0021":
                    newGetListStock0021.getKMPTDListStock(stockCode, stockDayVoList, stockDay399005List);
                    continue;
                case "0022":
                    newGetListStock0022.getKMPTDListStock(stockCode, stockDayVoList, stockDay399005List);
                    continue;
                case "0023":
                    newGetListStock0023.getKMPTDListStock(stockCode, stockDayVoList, stockDay399005List);
                    continue;
                case "0024":
                    newGetListStock0024.getKMPTDListStock(stockCode, stockDayVoList, stockDay399005List);
                    continue;
                case "0025":
                    newGetListStock0025.getKMPTDListStock(stockCode, stockDayVoList, stockDay399005List);
                    continue;
                case "0026":
                    newGetListStock0026.getKMPTDListStock(stockCode, stockDayVoList, stockDay399005List);
                    continue;
                case "0027":
                    newGetListStock0027.getKMPTDListStock(stockCode, stockDayVoList, stockDay399005List);
                    continue;
                case "0028":
                    newGetListStock0028.getKMPTDListStock(stockCode, stockDayVoList, stockDay399005List);
                    continue;
                case "3000":
                    newGetListStock3000.getKMPTDListStock(stockCode, stockDayVoList, stockDay399006List);
                    continue;
                case "3001":
                    newGetListStock3001.getKMPTDListStock(stockCode, stockDayVoList, stockDay399006List);
                    continue;
                case "3002":
                    newGetListStock3002.getKMPTDListStock(stockCode, stockDayVoList, stockDay399006List);
                    continue;
                case "3003":
                    newGetListStock3003.getKMPTDListStock(stockCode, stockDayVoList, stockDay399006List);
                    continue;
                case "3004":
                    newGetListStock3004.getKMPTDListStock(stockCode, stockDayVoList, stockDay399006List);
                    continue;
                case "3005":
                    newGetListStock3005.getKMPTDListStock(stockCode, stockDayVoList, stockDay399006List);
                    continue;
                case "6000":
                    newGetListStock6000.getKMPTDListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6001":
                    newGetListStock6001.getKMPTDListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6002":
                    newGetListStock6002.getKMPTDListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6003":
                    newGetListStock6003.getKMPTDListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6004":
                    newGetListStock6004.getKMPTDListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6005":
                    newGetListStock6005.getKMPTDListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6006":
                    newGetListStock6006.getKMPTDListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6007":
                    newGetListStock6007.getKMPTDListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6008":
                    newGetListStock6008.getKMPTDListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6009":
                    newGetListStock6009.getKMPTDListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6010":
                    newGetListStock6010.getKMPTDListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6011":
                    newGetListStock6011.getKMPTDListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6012":
                    newGetListStock6012.getKMPTDListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6013":
                    newGetListStock6013.getKMPTDListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6014":
                    newGetListStock6014.getKMPTDListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6015":
                    newGetListStock6015.getKMPTDListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6016":
                    newGetListStock6016.getKMPTDListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6017":
                    newGetListStock6017.getKMPTDListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6018":
                    newGetListStock6018.getKMPTDListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6019":
                    newGetListStock6019.getKMPTDListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                default:
                    switch (stockCode.getId().substring(0, 3)) {
                        case "001":
                            newGetListStock001.getKMPTDListStock(stockCode, stockDayVoList, stockDay399001List);
                            continue;
                        case "603":
                            newGetListStock603.getKMPTDListStock(stockCode, stockDayVoList, stockDay000001List);
                            continue;
                        default:
                            continue;
                    }
            }
        }
        return stockDayVoList;
    }

    public List<StockDayVo> getListDayStockKmQr() throws IOException {
        //获取所以编码
        List<StockCode> stockCodeList = stockCodeService.getStockCodeList();
        if (stockCodeList == null || stockCodeList.isEmpty()) {
            return null;
        }
        List<StockDayVo> stockDayVoList = new ArrayList<>();
        //获取上证
        List<StockDay0000> stockDay000001List = stockDay0000Service.selectByCodeAndEx("000001", "SH");
        //获取sz
        List<StockDay399> stockDay399001List = stockDay399Service.selectByCodeAndEx("399001", "SZ");
        //获取中小
        List<StockDay399> stockDay399005List = stockDay399Service.selectByCodeAndEx("399005", "SZ");
        //获取创业
        List<StockDay399> stockDay399006List = stockDay399Service.selectByCodeAndEx("399006", "SZ");
        //遍历
        for (StockCode stockCode : stockCodeList) {
            switch (stockCode.getId().substring(0, 4)) {
                case "0000":
                    if (stockCode.getId().equals("000001") && stockCode.getEx().equals("SH")) {
                        continue;
                    } else {
                        newGetListStock0000.getKmQRListStock(stockCode, stockDayVoList, stockDay399001List);
                    }
                    continue;
                case "0001":
                    newGetListStock0001.getKmQRListStock(stockCode, stockDayVoList, stockDay399001List);
                    continue;
                case "0002":
                    newGetListStock0002.getKmQRListStock(stockCode, stockDayVoList, stockDay399001List);
                    continue;
                case "0003":
                    newGetListStock0003.getKmQRListStock(stockCode, stockDayVoList, stockDay399001List);
                    continue;
                case "0004":
                    newGetListStock0004.getKmQRListStock(stockCode, stockDayVoList, stockDay399001List);
                    continue;
                case "0005":
                    newGetListStock0005.getKmQRListStock(stockCode, stockDayVoList, stockDay399001List);
                    continue;
                case "0006":
                    newGetListStock0006.getKmQRListStock(stockCode, stockDayVoList, stockDay399001List);
                    continue;
                case "0007":
                    newGetListStock0007.getKmQRListStock(stockCode, stockDayVoList, stockDay399001List);
                    continue;
                case "0008":
                    newGetListStock0008.getKmQRListStock(stockCode, stockDayVoList, stockDay399001List);
                    continue;
                case "0009":
                    newGetListStock0009.getKmQRListStock(stockCode, stockDayVoList, stockDay399001List);
                    continue;
                case "0020":
                    newGetListStock0020.getKmQRListStock(stockCode, stockDayVoList, stockDay399005List);
                    continue;
                case "0021":
                    newGetListStock0021.getKmQRListStock(stockCode, stockDayVoList, stockDay399005List);
                    continue;
                case "0022":
                    newGetListStock0022.getKmQRListStock(stockCode, stockDayVoList, stockDay399005List);
                    continue;
                case "0023":
                    newGetListStock0023.getKmQRListStock(stockCode, stockDayVoList, stockDay399005List);
                    continue;
                case "0024":
                    newGetListStock0024.getKmQRListStock(stockCode, stockDayVoList, stockDay399005List);
                    continue;
                case "0025":
                    newGetListStock0025.getKmQRListStock(stockCode, stockDayVoList, stockDay399005List);
                    continue;
                case "0026":
                    newGetListStock0026.getKmQRListStock(stockCode, stockDayVoList, stockDay399005List);
                    continue;
                case "0027":
                    newGetListStock0027.getKmQRListStock(stockCode, stockDayVoList, stockDay399005List);
                    continue;
                case "0028":
                    newGetListStock0028.getKmQRListStock(stockCode, stockDayVoList, stockDay399005List);
                    continue;
                case "3000":
                    newGetListStock3000.getKmQRListStock(stockCode, stockDayVoList, stockDay399006List);
                    continue;
                case "3001":
                    newGetListStock3001.getKmQRListStock(stockCode, stockDayVoList, stockDay399006List);
                    continue;
                case "3002":
                    newGetListStock3002.getKmQRListStock(stockCode, stockDayVoList, stockDay399006List);
                    continue;
                case "3003":
                    newGetListStock3003.getKmQRListStock(stockCode, stockDayVoList, stockDay399006List);
                    continue;
                case "3004":
                    newGetListStock3004.getKmQRListStock(stockCode, stockDayVoList, stockDay399006List);
                    continue;
                case "3005":
                    newGetListStock3005.getKmQRListStock(stockCode, stockDayVoList, stockDay399006List);
                    continue;
                case "6000":
                    newGetListStock6000.getKmQRListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6001":
                    newGetListStock6001.getKmQRListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6002":
                    newGetListStock6002.getKmQRListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6003":
                    newGetListStock6003.getKmQRListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6004":
                    newGetListStock6004.getKmQRListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6005":
                    newGetListStock6005.getKmQRListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6006":
                    newGetListStock6006.getKmQRListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6007":
                    newGetListStock6007.getKmQRListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6008":
                    newGetListStock6008.getKmQRListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6009":
                    newGetListStock6009.getKmQRListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6010":
                    newGetListStock6010.getKmQRListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6011":
                    newGetListStock6011.getKmQRListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6012":
                    newGetListStock6012.getKmQRListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6013":
                    newGetListStock6013.getKmQRListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6014":
                    newGetListStock6014.getKmQRListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6015":
                    newGetListStock6015.getKmQRListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6016":
                    newGetListStock6016.getKmQRListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6017":
                    newGetListStock6017.getKmQRListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6018":
                    newGetListStock6018.getKmQRListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6019":
                    newGetListStock6019.getKmQRListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                default:
                    switch (stockCode.getId().substring(0, 3)) {
                        case "001":
                            newGetListStock001.getKmQRListStock(stockCode, stockDayVoList, stockDay399001List);
                            continue;
                        case "603":
                            newGetListStock603.getKmQRListStock(stockCode, stockDayVoList, stockDay000001List);
                            continue;
                        default:
                            continue;
                    }
            }
        }
        return stockDayVoList;
    }

    public List<StockDayVo> getListDayStockQtuXing() throws IOException {
        //获取所以编码
        List<StockCode> stockCodeList = stockCodeService.getStockCodeList();
        if (stockCodeList == null || stockCodeList.isEmpty()) {
            return null;
        }
        List<StockDayVo> stockDayVoList = new ArrayList<>();
        //获取上证
        List<StockDay0000> stockDay000001List = stockDay0000Service.selectByCodeAndEx("000001", "SH");
        //获取sz
        List<StockDay399> stockDay399001List = stockDay399Service.selectByCodeAndEx("399001", "SZ");
        //获取中小
        List<StockDay399> stockDay399005List = stockDay399Service.selectByCodeAndEx("399005", "SZ");
        //获取创业
        List<StockDay399> stockDay399006List = stockDay399Service.selectByCodeAndEx("399006", "SZ");
        //遍历
        for (StockCode stockCode : stockCodeList) {
            switch (stockCode.getId().substring(0, 4)) {
                case "0000":
                    if (stockCode.getId().equals("000001") && stockCode.getEx().equals("SH")) {
                        continue;
                    } else {
                        newGetListStock0000.getQTuXingListStock(stockCode, stockDayVoList, stockDay399001List);
                    }
                    continue;
                case "0001":
                    newGetListStock0001.getQTuXingListStock(stockCode, stockDayVoList, stockDay399001List);
                    continue;
                case "0002":
                    newGetListStock0002.getQTuXingListStock(stockCode, stockDayVoList, stockDay399001List);
                    continue;
                case "0003":
                    newGetListStock0003.getQTuXingListStock(stockCode, stockDayVoList, stockDay399001List);
                    continue;
                case "0004":
                    newGetListStock0004.getQTuXingListStock(stockCode, stockDayVoList, stockDay399001List);
                    continue;
                case "0005":
                    newGetListStock0005.getQTuXingListStock(stockCode, stockDayVoList, stockDay399001List);
                    continue;
                case "0006":
                    newGetListStock0006.getQTuXingListStock(stockCode, stockDayVoList, stockDay399001List);
                    continue;
                case "0007":
                    newGetListStock0007.getQTuXingListStock(stockCode, stockDayVoList, stockDay399001List);
                    continue;
                case "0008":
                    newGetListStock0008.getQTuXingListStock(stockCode, stockDayVoList, stockDay399001List);
                    continue;
                case "0009":
                    newGetListStock0009.getQTuXingListStock(stockCode, stockDayVoList, stockDay399001List);
                    continue;
                case "0020":
                    newGetListStock0020.getQTuXingListStock(stockCode, stockDayVoList, stockDay399005List);
                    continue;
                case "0021":
                    newGetListStock0021.getQTuXingListStock(stockCode, stockDayVoList, stockDay399005List);
                    continue;
                case "0022":
                    newGetListStock0022.getQTuXingListStock(stockCode, stockDayVoList, stockDay399005List);
                    continue;
                case "0023":
                    newGetListStock0023.getQTuXingListStock(stockCode, stockDayVoList, stockDay399005List);
                    continue;
                case "0024":
                    newGetListStock0024.getQTuXingListStock(stockCode, stockDayVoList, stockDay399005List);
                    continue;
                case "0025":
                    newGetListStock0025.getQTuXingListStock(stockCode, stockDayVoList, stockDay399005List);
                    continue;
                case "0026":
                    newGetListStock0026.getQTuXingListStock(stockCode, stockDayVoList, stockDay399005List);
                    continue;
                case "0027":
                    newGetListStock0027.getQTuXingListStock(stockCode, stockDayVoList, stockDay399005List);
                    continue;
                case "0028":
                    newGetListStock0028.getQTuXingListStock(stockCode, stockDayVoList, stockDay399005List);
                    continue;
                case "3000":
                    newGetListStock3000.getQTuXingListStock(stockCode, stockDayVoList, stockDay399006List);
                    continue;
                case "3001":
                    newGetListStock3001.getQTuXingListStock(stockCode, stockDayVoList, stockDay399006List);
                    continue;
                case "3002":
                    newGetListStock3002.getQTuXingListStock(stockCode, stockDayVoList, stockDay399006List);
                    continue;
                case "3003":
                    newGetListStock3003.getQTuXingListStock(stockCode, stockDayVoList, stockDay399006List);
                    continue;
                case "3004":
                    newGetListStock3004.getQTuXingListStock(stockCode, stockDayVoList, stockDay399006List);
                    continue;
                case "3005":
                    newGetListStock3005.getQTuXingListStock(stockCode, stockDayVoList, stockDay399006List);
                    continue;
                case "6000":
                    newGetListStock6000.getQTuXingListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6001":
                    newGetListStock6001.getQTuXingListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6002":
                    newGetListStock6002.getQTuXingListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6003":
                    newGetListStock6003.getQTuXingListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6004":
                    newGetListStock6004.getQTuXingListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6005":
                    newGetListStock6005.getQTuXingListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6006":
                    newGetListStock6006.getQTuXingListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6007":
                    newGetListStock6007.getQTuXingListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6008":
                    newGetListStock6008.getQTuXingListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6009":
                    newGetListStock6009.getQTuXingListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6010":
                    newGetListStock6010.getQTuXingListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6011":
                    newGetListStock6011.getQTuXingListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6012":
                    newGetListStock6012.getQTuXingListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6013":
                    newGetListStock6013.getQTuXingListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6014":
                    newGetListStock6014.getQTuXingListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6015":
                    newGetListStock6015.getQTuXingListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6016":
                    newGetListStock6016.getQTuXingListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6017":
                    newGetListStock6017.getQTuXingListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6018":
                    newGetListStock6018.getQTuXingListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6019":
                    newGetListStock6019.getQTuXingListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                default:
                    switch (stockCode.getId().substring(0, 3)) {
                        case "001":
                            newGetListStock001.getQTuXingListStock(stockCode, stockDayVoList, stockDay399001List);
                            continue;
                        case "603":
                            newGetListStock603.getQTuXingListStock(stockCode, stockDayVoList, stockDay000001List);
                            continue;
                        default:
                            continue;
                    }
            }
        }
        return stockDayVoList;
    }

    @Override
    public List<StockDayVo> getListDayStockKTu20LS() throws IOException {
        //获取所以编码
        List<StockCode> stockCodeList = stockCodeService.getStockCodeList();
        if (stockCodeList == null || stockCodeList.isEmpty()) {
            return null;
        }
        List<StockDayVo> stockDayVoList = new ArrayList<>();
        //获取上证
        List<StockDay0000> stockDay000001List = stockDay0000Service.selectByCodeAndEx("000001", "SH");
        //获取sz
        List<StockDay399> stockDay399001List = stockDay399Service.selectByCodeAndEx("399001", "SZ");
        //获取中小
        List<StockDay399> stockDay399005List = stockDay399Service.selectByCodeAndEx("399005", "SZ");
        //获取创业
        List<StockDay399> stockDay399006List = stockDay399Service.selectByCodeAndEx("399006", "SZ");
        //遍历
        for (StockCode stockCode : stockCodeList) {
            switch (stockCode.getId().substring(0, 4)) {
                case "0000":
                    if (stockCode.getId().equals("000001") && stockCode.getEx().equals("SH")) {
                        continue;
                    } else {
                        newGetListStock0000.getKTu20LSListStock(stockCode, stockDayVoList, stockDay399001List);
                    }
                    continue;
                case "0001":
                    newGetListStock0001.getKTu20LSListStock(stockCode, stockDayVoList, stockDay399001List);
                    continue;
                case "0002":
                    newGetListStock0002.getKTu20LSListStock(stockCode, stockDayVoList, stockDay399001List);
                    continue;
                case "0003":
                    newGetListStock0003.getKTu20LSListStock(stockCode, stockDayVoList, stockDay399001List);
                    continue;
                case "0004":
                    newGetListStock0004.getKTu20LSListStock(stockCode, stockDayVoList, stockDay399001List);
                    continue;
                case "0005":
                    newGetListStock0005.getKTu20LSListStock(stockCode, stockDayVoList, stockDay399001List);
                    continue;
                case "0006":
                    newGetListStock0006.getKTu20LSListStock(stockCode, stockDayVoList, stockDay399001List);
                    continue;
                case "0007":
                    newGetListStock0007.getKTu20LSListStock(stockCode, stockDayVoList, stockDay399001List);
                    continue;
                case "0008":
                    newGetListStock0008.getKTu20LSListStock(stockCode, stockDayVoList, stockDay399001List);
                    continue;
                case "0009":
                    newGetListStock0009.getKTu20LSListStock(stockCode, stockDayVoList, stockDay399001List);
                    continue;
                case "0020":
                    newGetListStock0020.getKTu20LSListStock(stockCode, stockDayVoList, stockDay399005List);
                    continue;
                case "0021":
                    newGetListStock0021.getKTu20LSListStock(stockCode, stockDayVoList, stockDay399005List);
                    continue;
                case "0022":
                    newGetListStock0022.getKTu20LSListStock(stockCode, stockDayVoList, stockDay399005List);
                    continue;
                case "0023":
                    newGetListStock0023.getKTu20LSListStock(stockCode, stockDayVoList, stockDay399005List);
                    continue;
                case "0024":
                    newGetListStock0024.getKTu20LSListStock(stockCode, stockDayVoList, stockDay399005List);
                    continue;
                case "0025":
                    newGetListStock0025.getKTu20LSListStock(stockCode, stockDayVoList, stockDay399005List);
                    continue;
                case "0026":
                    newGetListStock0026.getKTu20LSListStock(stockCode, stockDayVoList, stockDay399005List);
                    continue;
                case "0027":
                    newGetListStock0027.getKTu20LSListStock(stockCode, stockDayVoList, stockDay399005List);
                    continue;
                case "0028":
                    newGetListStock0028.getKTu20LSListStock(stockCode, stockDayVoList, stockDay399005List);
                    continue;
                case "3000":
                    newGetListStock3000.getKTu20LSListStock(stockCode, stockDayVoList, stockDay399006List);
                    continue;
                case "3001":
                    newGetListStock3001.getKTu20LSListStock(stockCode, stockDayVoList, stockDay399006List);
                    continue;
                case "3002":
                    newGetListStock3002.getKTu20LSListStock(stockCode, stockDayVoList, stockDay399006List);
                    continue;
                case "3003":
                    newGetListStock3003.getKTu20LSListStock(stockCode, stockDayVoList, stockDay399006List);
                    continue;
                case "3004":
                    newGetListStock3004.getKTu20LSListStock(stockCode, stockDayVoList, stockDay399006List);
                    continue;
                case "3005":
                    newGetListStock3005.getKTu20LSListStock(stockCode, stockDayVoList, stockDay399006List);
                    continue;
                case "6000":
                    newGetListStock6000.getKTu20LSListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6001":
                    newGetListStock6001.getKTu20LSListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6002":
                    newGetListStock6002.getKTu20LSListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6003":
                    newGetListStock6003.getKTu20LSListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6004":
                    newGetListStock6004.getKTu20LSListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6005":
                    newGetListStock6005.getKTu20LSListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6006":
                    newGetListStock6006.getKTu20LSListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6007":
                    newGetListStock6007.getKTu20LSListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6008":
                    newGetListStock6008.getKTu20LSListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6009":
                    newGetListStock6009.getKTu20LSListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6010":
                    newGetListStock6010.getKTu20LSListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6011":
                    newGetListStock6011.getKTu20LSListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6012":
                    newGetListStock6012.getKTu20LSListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6013":
                    newGetListStock6013.getKTu20LSListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6014":
                    newGetListStock6014.getKTu20LSListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6015":
                    newGetListStock6015.getKTu20LSListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6016":
                    newGetListStock6016.getKTu20LSListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6017":
                    newGetListStock6017.getKTu20LSListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6018":
                    newGetListStock6018.getKTu20LSListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6019":
                    newGetListStock6019.getKTu20LSListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                default:
                    switch (stockCode.getId().substring(0, 3)) {
                        case "001":
                            newGetListStock001.getKTu20LSListStock(stockCode, stockDayVoList, stockDay399001List);
                            continue;
                        case "603":
                            newGetListStock603.getKTu20LSListStock(stockCode, stockDayVoList, stockDay000001List);
                            continue;
                        default:
                            continue;
                    }
            }
        }
        return stockDayVoList;
    }
}
