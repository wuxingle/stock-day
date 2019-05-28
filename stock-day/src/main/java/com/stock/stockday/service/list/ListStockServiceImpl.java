package com.stock.stockday.service.list;

import com.stock.stockday.entity.StockCode;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay399;
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
public class ListStockServiceImpl implements ListStockService {
    @Autowired
    private StockCodeService stockCodeService;
    @Autowired
    private GetListStock0000 getListStock0000;
    @Autowired
    private GetListStock0001 getListStock0001;
    @Autowired
    private GetListStock0002 getListStock0002;
    @Autowired
    private GetListStock0003 getListStock0003;
    @Autowired
    private GetListStock0004 getListStock0004;
    @Autowired
    private GetListStock0005 getListStock0005;
    @Autowired
    private GetListStock0006 getListStock0006;
    @Autowired
    private GetListStock0007 getListStock0007;
    @Autowired
    private GetListStock0008 getListStock0008;
    @Autowired
    private GetListStock0009 getListStock0009;
    @Autowired
    private GetListStock0020 getListStock0020;
    @Autowired
    private GetListStock0021 getListStock0021;
    @Autowired
    private GetListStock0022 getListStock0022;
    @Autowired
    private GetListStock0023 getListStock0023;
    @Autowired
    private GetListStock0024 getListStock0024;
    @Autowired
    private GetListStock0025 getListStock0025;
    @Autowired
    private GetListStock0026 getListStock0026;
    @Autowired
    private GetListStock0027 getListStock0027;
    @Autowired
    private GetListStock0028 getListStock0028;
    @Autowired
    private GetListStock3000 getListStock3000;
    @Autowired
    private GetListStock3001 getListStock3001;
    @Autowired
    private GetListStock3002 getListStock3002;
    @Autowired
    private GetListStock3003 getListStock3003;
    @Autowired
    private GetListStock3004 getListStock3004;
    @Autowired
    private GetListStock3005 getListStock3005;
    @Autowired
    private GetListStock603 getListStock603;
    @Autowired
    private GetListStock6000 getListStock6000;
    @Autowired
    private GetListStock6001 getListStock6001;
    @Autowired
    private GetListStock6002 getListStock6002;
    @Autowired
    private GetListStock6003 getListStock6003;
    @Autowired
    private GetListStock6004 getListStock6004;
    @Autowired
    private GetListStock6005 getListStock6005;
    @Autowired
    private GetListStock6006 getListStock6006;
    @Autowired
    private GetListStock6007 getListStock6007;
    @Autowired
    private GetListStock6008 getListStock6008;
    @Autowired
    private GetListStock6009 getListStock6009;
    @Autowired
    private GetListStock6010 getListStock6010;
    @Autowired
    private GetListStock6011 getListStock6011;
    @Autowired
    private GetListStock6012 getListStock6012;
    @Autowired
    private GetListStock6013 getListStock6013;
    @Autowired
    private GetListStock6014 getListStock6014;
    @Autowired
    private GetListStock6015 getListStock6015;
    @Autowired
    private GetListStock6016 getListStock6016;
    @Autowired
    private GetListStock6017 getListStock6017;
    @Autowired
    private GetListStock6018 getListStock6018;
    @Autowired
    private GetListStock6019 getListStock6019;
    @Autowired
    private GetListStock001 getListStock001;
    @Autowired
    private StockDay399Service stockDay399Service;
    @Autowired
    private StockDay0000Service stockDay0000Service;

    @Override
    public List<StockDayVo> getListStock() throws IOException {
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
                        getListStock0000.getListStock(stockCode, stockDayVoList, stockDay399001List);
                    }
                    continue;
                case "0001":
                    getListStock0001.getListStock(stockCode, stockDayVoList, stockDay399001List);
                    continue;
                case "0002":
                    getListStock0002.getListStock(stockCode, stockDayVoList, stockDay399001List);
                    continue;
                case "0003":
                    getListStock0003.getListStock(stockCode, stockDayVoList, stockDay399001List);
                    continue;
                case "0004":
                    getListStock0004.getListStock(stockCode, stockDayVoList, stockDay399001List);
                    continue;
                case "0005":
                    getListStock0005.getListStock(stockCode, stockDayVoList, stockDay399001List);
                    continue;
                case "0006":
                    getListStock0006.getListStock(stockCode, stockDayVoList, stockDay399001List);
                    continue;
                case "0007":
                    getListStock0007.getListStock(stockCode, stockDayVoList, stockDay399001List);
                    continue;
                case "0008":
                    getListStock0008.getListStock(stockCode, stockDayVoList, stockDay399001List);
                    continue;
                case "0009":
                    getListStock0009.getListStock(stockCode, stockDayVoList, stockDay399001List);
                    continue;
                case "0020":
                    getListStock0020.getListStock(stockCode, stockDayVoList, stockDay399005List);
                    continue;
                case "0021":
                    getListStock0021.getListStock(stockCode, stockDayVoList, stockDay399005List);
                    continue;
                case "0022":
                    getListStock0022.getListStock(stockCode, stockDayVoList, stockDay399005List);
                    continue;
                case "0023":
                    getListStock0023.getListStock(stockCode, stockDayVoList, stockDay399005List);
                    continue;
                case "0024":
                    getListStock0024.getListStock(stockCode, stockDayVoList, stockDay399005List);
                    continue;
                case "0025":
                    getListStock0025.getListStock(stockCode, stockDayVoList, stockDay399005List);
                    continue;
                case "0026":
                    getListStock0026.getListStock(stockCode, stockDayVoList, stockDay399005List);
                    continue;
                case "0027":
                    getListStock0027.getListStock(stockCode, stockDayVoList, stockDay399005List);
                    continue;
                case "0028":
                    getListStock0028.getListStock(stockCode, stockDayVoList, stockDay399005List);
                    continue;
                case "3000":
                    getListStock3000.getListStock(stockCode, stockDayVoList, stockDay399006List);
                    continue;
                case "3001":
                    getListStock3001.getListStock(stockCode, stockDayVoList, stockDay399006List);
                    continue;
                case "3002":
                    getListStock3002.getListStock(stockCode, stockDayVoList, stockDay399006List);
                    continue;
                case "3003":
                    getListStock3003.getListStock(stockCode, stockDayVoList, stockDay399006List);
                    continue;
                case "3004":
                    getListStock3004.getListStock(stockCode, stockDayVoList, stockDay399006List);
                    continue;
                case "3005":
                    getListStock3005.getListStock(stockCode, stockDayVoList, stockDay399006List);
                    continue;
                case "6000":
                    getListStock6000.getListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6001":
                    getListStock6001.getListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6002":
                    getListStock6002.getListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6003":
                    getListStock6003.getListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6004":
                    getListStock6004.getListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6005":
                    getListStock6005.getListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6006":
                    getListStock6006.getListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6007":
                    getListStock6007.getListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6008":
                    getListStock6008.getListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6009":
                    getListStock6009.getListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6010":
                    getListStock6010.getListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6011":
                    getListStock6011.getListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6012":
                    getListStock6012.getListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6013":
                    getListStock6013.getListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6014":
                    getListStock6014.getListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6015":
                    getListStock6015.getListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6016":
                    getListStock6016.getListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6017":
                    getListStock6017.getListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6018":
                    getListStock6018.getListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                case "6019":
                    getListStock6019.getListStock(stockCode, stockDayVoList, stockDay000001List);
                    continue;
                default:
                    switch (stockCode.getId().substring(0, 3)) {
                        case "001":
                            getListStock001.getListStock(stockCode, stockDayVoList, stockDay399001List);
                            continue;
                        case "603":
                            getListStock603.getListStock(stockCode, stockDayVoList, stockDay000001List);
                            continue;
                        default:
                            continue;
                    }
            }
        }
        return stockDayVoList;
    }

    @Override
    public List<StockDayVo> getZhuYanJiShuList() throws IOException {
        //获取所以编码
        List<StockCode> stockCodeList = stockCodeService.getStockCodeList();
        if (stockCodeList == null || stockCodeList.isEmpty()) {
            return null;
        }
        List<StockDayVo> stockDayVoList = new ArrayList<>();
        //遍历
        for (StockCode stockCode : stockCodeList) {
            switch (stockCode.getId().substring(0, 4)) {
                case "0000":
                    if (stockCode.getId().equals("000001") && stockCode.getEx().equals("SH")) {
                        continue;
                    } else {
                        getListStock0000.getZhuYanJiShuList(stockCode, stockDayVoList);
                    }
                    continue;
                case "0001":
                    getListStock0001.getZhuYanJiShuList(stockCode, stockDayVoList);
                    continue;
                case "0002":
                    getListStock0002.getZhuYanJiShuList(stockCode, stockDayVoList);
                    continue;
                case "0003":
                    getListStock0003.getZhuYanJiShuList(stockCode, stockDayVoList);
                    continue;
                case "0004":
                    getListStock0004.getZhuYanJiShuList(stockCode, stockDayVoList);
                    continue;
                case "0005":
                    getListStock0005.getZhuYanJiShuList(stockCode, stockDayVoList);
                    continue;
                case "0006":
                    getListStock0006.getZhuYanJiShuList(stockCode, stockDayVoList);
                    continue;
                case "0007":
                    getListStock0007.getZhuYanJiShuList(stockCode, stockDayVoList);
                    continue;
                case "0008":
                    getListStock0008.getZhuYanJiShuList(stockCode, stockDayVoList);
                    continue;
                case "0009":
                    getListStock0009.getZhuYanJiShuList(stockCode, stockDayVoList);
                    continue;
                case "0020":
                    getListStock0020.getZhuYanJiShuList(stockCode, stockDayVoList);
                    continue;
                case "0021":
                    getListStock0021.getZhuYanJiShuList(stockCode, stockDayVoList);
                    continue;
                case "0022":
                    getListStock0022.getZhuYanJiShuList(stockCode, stockDayVoList);
                    continue;
                case "0023":
                    getListStock0023.getZhuYanJiShuList(stockCode, stockDayVoList);
                    continue;
                case "0024":
                    getListStock0024.getZhuYanJiShuList(stockCode, stockDayVoList);
                    continue;
                case "0025":
                    getListStock0025.getZhuYanJiShuList(stockCode, stockDayVoList);
                    continue;
                case "0026":
                    getListStock0026.getZhuYanJiShuList(stockCode, stockDayVoList);
                    continue;
                case "0027":
                    getListStock0027.getZhuYanJiShuList(stockCode, stockDayVoList);
                    continue;
                case "0028":
                    getListStock0028.getZhuYanJiShuList(stockCode, stockDayVoList);
                    continue;
                case "3000":
                    getListStock3000.getZhuYanJiShuList(stockCode, stockDayVoList);
                    continue;
                case "3001":
                    getListStock3001.getZhuYanJiShuList(stockCode, stockDayVoList);
                    continue;
                case "3002":
                    getListStock3002.getZhuYanJiShuList(stockCode, stockDayVoList);
                    continue;
                case "3003":
                    getListStock3003.getZhuYanJiShuList(stockCode, stockDayVoList);
                    continue;
                case "3004":
                    getListStock3004.getZhuYanJiShuList(stockCode, stockDayVoList);
                    continue;
                case "3005":
                    getListStock3005.getZhuYanJiShuList(stockCode, stockDayVoList);
                    continue;
                case "6000":
                    getListStock6000.getZhuYanJiShuList(stockCode, stockDayVoList);
                    continue;
                case "6001":
                    getListStock6001.getZhuYanJiShuList(stockCode, stockDayVoList);
                    continue;
                case "6002":
                    getListStock6002.getZhuYanJiShuList(stockCode, stockDayVoList);
                    continue;
                case "6003":
                    getListStock6003.getZhuYanJiShuList(stockCode, stockDayVoList);
                    continue;
                case "6004":
                    getListStock6004.getZhuYanJiShuList(stockCode, stockDayVoList);
                    continue;
                case "6005":
                    getListStock6005.getZhuYanJiShuList(stockCode, stockDayVoList);
                    continue;
                case "6006":
                    getListStock6006.getZhuYanJiShuList(stockCode, stockDayVoList);
                    continue;
                case "6007":
                    getListStock6007.getZhuYanJiShuList(stockCode, stockDayVoList);
                    continue;
                case "6008":
                    getListStock6008.getZhuYanJiShuList(stockCode, stockDayVoList);
                    continue;
                case "6009":
                    getListStock6009.getZhuYanJiShuList(stockCode, stockDayVoList);
                    continue;
                case "6010":
                    getListStock6010.getZhuYanJiShuList(stockCode, stockDayVoList);
                    continue;
                case "6011":
                    getListStock6011.getZhuYanJiShuList(stockCode, stockDayVoList);
                    continue;
                case "6012":
                    getListStock6012.getZhuYanJiShuList(stockCode, stockDayVoList);
                    continue;
                case "6013":
                    getListStock6013.getZhuYanJiShuList(stockCode, stockDayVoList);
                    continue;
                case "6014":
                    getListStock6014.getZhuYanJiShuList(stockCode, stockDayVoList);
                    continue;
                case "6015":
                    getListStock6015.getZhuYanJiShuList(stockCode, stockDayVoList);
                    continue;
                case "6016":
                    getListStock6016.getZhuYanJiShuList(stockCode, stockDayVoList);
                    continue;
                case "6017":
                    getListStock6017.getZhuYanJiShuList(stockCode, stockDayVoList);
                    continue;
                case "6018":
                    getListStock6018.getZhuYanJiShuList(stockCode, stockDayVoList);
                    continue;
                case "6019":
                    getListStock6019.getZhuYanJiShuList(stockCode, stockDayVoList);
                    continue;
                default:
                    switch (stockCode.getId().substring(0, 3)) {
                        case "001":
                            getListStock001.getZhuYanJiShuList(stockCode, stockDayVoList);
                            continue;
                        case "603":
                            getListStock603.getZhuYanJiShuList(stockCode, stockDayVoList);
                            continue;
                        default:
                            continue;
                    }
            }
        }
        return stockDayVoList;
    }

    @Override
    public List<StockDayVo> getChunTuXingList() throws IOException {
        //获取所以编码
        List<StockCode> stockCodeList = stockCodeService.getStockCodeList();
        if (stockCodeList == null || stockCodeList.isEmpty()) {
            return null;
        }
        List<StockDayVo> stockDayVoList = new ArrayList<>();
        //遍历
        for (StockCode stockCode : stockCodeList) {
            switch (stockCode.getId().substring(0, 4)) {
                case "0000":
                    if (stockCode.getId().equals("000001") && stockCode.getEx().equals("SH")) {
                        continue;
                    } else {
                        getListStock0000.getChunTuXingList(stockCode, stockDayVoList);
                    }
                    continue;
                case "0001":
                    getListStock0001.getChunTuXingList(stockCode, stockDayVoList);
                    continue;
                case "0002":
                    getListStock0002.getChunTuXingList(stockCode, stockDayVoList);
                    continue;
                case "0003":
                    getListStock0003.getChunTuXingList(stockCode, stockDayVoList);
                    continue;
                case "0004":
                    getListStock0004.getChunTuXingList(stockCode, stockDayVoList);
                    continue;
                case "0005":
                    getListStock0005.getChunTuXingList(stockCode, stockDayVoList);
                    continue;
                case "0006":
                    getListStock0006.getChunTuXingList(stockCode, stockDayVoList);
                    continue;
                case "0007":
                    getListStock0007.getChunTuXingList(stockCode, stockDayVoList);
                    continue;
                case "0008":
                    getListStock0008.getChunTuXingList(stockCode, stockDayVoList);
                    continue;
                case "0009":
                    getListStock0009.getChunTuXingList(stockCode, stockDayVoList);
                    continue;
                case "0020":
                    getListStock0020.getChunTuXingList(stockCode, stockDayVoList);
                    continue;
                case "0021":
                    getListStock0021.getChunTuXingList(stockCode, stockDayVoList);
                    continue;
                case "0022":
                    getListStock0022.getChunTuXingList(stockCode, stockDayVoList);
                    continue;
                case "0023":
                    getListStock0023.getChunTuXingList(stockCode, stockDayVoList);
                    continue;
                case "0024":
                    getListStock0024.getChunTuXingList(stockCode, stockDayVoList);
                    continue;
                case "0025":
                    getListStock0025.getChunTuXingList(stockCode, stockDayVoList);
                    continue;
                case "0026":
                    getListStock0026.getChunTuXingList(stockCode, stockDayVoList);
                    continue;
                case "0027":
                    getListStock0027.getChunTuXingList(stockCode, stockDayVoList);
                    continue;
                case "0028":
                    getListStock0028.getChunTuXingList(stockCode, stockDayVoList);
                    continue;
                case "3000":
                    getListStock3000.getChunTuXingList(stockCode, stockDayVoList);
                    continue;
                case "3001":
                    getListStock3001.getChunTuXingList(stockCode, stockDayVoList);
                    continue;
                case "3002":
                    getListStock3002.getChunTuXingList(stockCode, stockDayVoList);
                    continue;
                case "3003":
                    getListStock3003.getChunTuXingList(stockCode, stockDayVoList);
                    continue;
                case "3004":
                    getListStock3004.getChunTuXingList(stockCode, stockDayVoList);
                    continue;
                case "3005":
                    getListStock3005.getChunTuXingList(stockCode, stockDayVoList);
                    continue;
                case "6000":
                    getListStock6000.getChunTuXingList(stockCode, stockDayVoList);
                    continue;
                case "6001":
                    getListStock6001.getChunTuXingList(stockCode, stockDayVoList);
                    continue;
                case "6002":
                    getListStock6002.getChunTuXingList(stockCode, stockDayVoList);
                    continue;
                case "6003":
                    getListStock6003.getChunTuXingList(stockCode, stockDayVoList);
                    continue;
                case "6004":
                    getListStock6004.getChunTuXingList(stockCode, stockDayVoList);
                    continue;
                case "6005":
                    getListStock6005.getChunTuXingList(stockCode, stockDayVoList);
                    continue;
                case "6006":
                    getListStock6006.getChunTuXingList(stockCode, stockDayVoList);
                    continue;
                case "6007":
                    getListStock6007.getChunTuXingList(stockCode, stockDayVoList);
                    continue;
                case "6008":
                    getListStock6008.getChunTuXingList(stockCode, stockDayVoList);
                    continue;
                case "6009":
                    getListStock6009.getChunTuXingList(stockCode, stockDayVoList);
                    continue;
                case "6010":
                    getListStock6010.getChunTuXingList(stockCode, stockDayVoList);
                    continue;
                case "6011":
                    getListStock6011.getChunTuXingList(stockCode, stockDayVoList);
                    continue;
                case "6012":
                    getListStock6012.getChunTuXingList(stockCode, stockDayVoList);
                    continue;
                case "6013":
                    getListStock6013.getChunTuXingList(stockCode, stockDayVoList);
                    continue;
                case "6014":
                    getListStock6014.getChunTuXingList(stockCode, stockDayVoList);
                    continue;
                case "6015":
                    getListStock6015.getChunTuXingList(stockCode, stockDayVoList);
                    continue;
                case "6016":
                    getListStock6016.getChunTuXingList(stockCode, stockDayVoList);
                    continue;
                case "6017":
                    getListStock6017.getChunTuXingList(stockCode, stockDayVoList);
                    continue;
                case "6018":
                    getListStock6018.getChunTuXingList(stockCode, stockDayVoList);
                    continue;
                case "6019":
                    getListStock6019.getChunTuXingList(stockCode, stockDayVoList);
                    continue;
                default:
                    switch (stockCode.getId().substring(0, 3)) {
                        case "001":
                            getListStock001.getChunTuXingList(stockCode, stockDayVoList);
                            continue;
                        case "603":
                            getListStock603.getChunTuXingList(stockCode, stockDayVoList);
                            continue;
                        default:
                            continue;
                    }
            }
        }
        return stockDayVoList;
    }

    @Override
    public List<StockDayVo> getChunJiShuList() throws IOException {
        //获取所以编码
        List<StockCode> stockCodeList = stockCodeService.getStockCodeList();
        if (stockCodeList == null || stockCodeList.isEmpty()) {
            return null;
        }
        List<StockDayVo> stockDayVoList = new ArrayList<>();
        //遍历
        for (StockCode stockCode : stockCodeList) {
            switch (stockCode.getId().substring(0, 4)) {
                case "0000":
                    if (stockCode.getId().equals("000001") && stockCode.getEx().equals("SH")) {
                        continue;
                    } else {
                        getListStock0000.getChunJiShuList(stockCode, stockDayVoList);
                    }
                    continue;
                case "0001":
                    getListStock0001.getChunJiShuList(stockCode, stockDayVoList);
                    continue;
                case "0002":
                    getListStock0002.getChunJiShuList(stockCode, stockDayVoList);
                    continue;
                case "0003":
                    getListStock0003.getChunJiShuList(stockCode, stockDayVoList);
                    continue;
                case "0004":
                    getListStock0004.getChunJiShuList(stockCode, stockDayVoList);
                    continue;
                case "0005":
                    getListStock0005.getChunJiShuList(stockCode, stockDayVoList);
                    continue;
                case "0006":
                    getListStock0006.getChunJiShuList(stockCode, stockDayVoList);
                    continue;
                case "0007":
                    getListStock0007.getChunJiShuList(stockCode, stockDayVoList);
                    continue;
                case "0008":
                    getListStock0008.getChunJiShuList(stockCode, stockDayVoList);
                    continue;
                case "0009":
                    getListStock0009.getChunJiShuList(stockCode, stockDayVoList);
                    continue;
                case "0020":
                    getListStock0020.getChunJiShuList(stockCode, stockDayVoList);
                    continue;
                case "0021":
                    getListStock0021.getChunJiShuList(stockCode, stockDayVoList);
                    continue;
                case "0022":
                    getListStock0022.getChunJiShuList(stockCode, stockDayVoList);
                    continue;
                case "0023":
                    getListStock0023.getChunJiShuList(stockCode, stockDayVoList);
                    continue;
                case "0024":
                    getListStock0024.getChunJiShuList(stockCode, stockDayVoList);
                    continue;
                case "0025":
                    getListStock0025.getChunJiShuList(stockCode, stockDayVoList);
                    continue;
                case "0026":
                    getListStock0026.getChunJiShuList(stockCode, stockDayVoList);
                    continue;
                case "0027":
                    getListStock0027.getChunJiShuList(stockCode, stockDayVoList);
                    continue;
                case "0028":
                    getListStock0028.getChunJiShuList(stockCode, stockDayVoList);
                    continue;
                case "3000":
                    getListStock3000.getChunJiShuList(stockCode, stockDayVoList);
                    continue;
                case "3001":
                    getListStock3001.getChunJiShuList(stockCode, stockDayVoList);
                    continue;
                case "3002":
                    getListStock3002.getChunJiShuList(stockCode, stockDayVoList);
                    continue;
                case "3003":
                    getListStock3003.getChunJiShuList(stockCode, stockDayVoList);
                    continue;
                case "3004":
                    getListStock3004.getChunJiShuList(stockCode, stockDayVoList);
                    continue;
                case "3005":
                    getListStock3005.getChunJiShuList(stockCode, stockDayVoList);
                    continue;
                case "6000":
                    getListStock6000.getChunJiShuList(stockCode, stockDayVoList);
                    continue;
                case "6001":
                    getListStock6001.getChunJiShuList(stockCode, stockDayVoList);
                    continue;
                case "6002":
                    getListStock6002.getChunJiShuList(stockCode, stockDayVoList);
                    continue;
                case "6003":
                    getListStock6003.getChunJiShuList(stockCode, stockDayVoList);
                    continue;
                case "6004":
                    getListStock6004.getChunJiShuList(stockCode, stockDayVoList);
                    continue;
                case "6005":
                    getListStock6005.getChunJiShuList(stockCode, stockDayVoList);
                    continue;
                case "6006":
                    getListStock6006.getChunJiShuList(stockCode, stockDayVoList);
                    continue;
                case "6007":
                    getListStock6007.getChunJiShuList(stockCode, stockDayVoList);
                    continue;
                case "6008":
                    getListStock6008.getChunJiShuList(stockCode, stockDayVoList);
                    continue;
                case "6009":
                    getListStock6009.getChunJiShuList(stockCode, stockDayVoList);
                    continue;
                case "6010":
                    getListStock6010.getChunJiShuList(stockCode, stockDayVoList);
                    continue;
                case "6011":
                    getListStock6011.getChunJiShuList(stockCode, stockDayVoList);
                    continue;
                case "6012":
                    getListStock6012.getChunJiShuList(stockCode, stockDayVoList);
                    continue;
                case "6013":
                    getListStock6013.getChunJiShuList(stockCode, stockDayVoList);
                    continue;
                case "6014":
                    getListStock6014.getChunJiShuList(stockCode, stockDayVoList);
                    continue;
                case "6015":
                    getListStock6015.getChunJiShuList(stockCode, stockDayVoList);
                    continue;
                case "6016":
                    getListStock6016.getChunJiShuList(stockCode, stockDayVoList);
                    continue;
                case "6017":
                    getListStock6017.getChunJiShuList(stockCode, stockDayVoList);
                    continue;
                case "6018":
                    getListStock6018.getChunJiShuList(stockCode, stockDayVoList);
                    continue;
                case "6019":
                    getListStock6019.getChunJiShuList(stockCode, stockDayVoList);
                    continue;
                default:
                    switch (stockCode.getId().substring(0, 3)) {
                        case "001":
                            getListStock001.getChunJiShuList(stockCode, stockDayVoList);
                            continue;
                        case "603":
                            getListStock603.getChunJiShuList(stockCode, stockDayVoList);
                            continue;
                        default:
                            continue;
                    }
            }
        }
        return stockDayVoList;
    }

    @Override
    public List<StockDayVo> getAllCommonList() throws IOException {
        List<StockDayVo> stockDayVoList1 = new ArrayList<>();
        List<StockDayVo> stockDayVoList2 = new ArrayList<>();
        List<StockDayVo> stockDayVoList3 = new ArrayList<>();
        List<StockDayVo> stockDayVoList4 = new ArrayList<>();
        stockDayVoList1=getListStock();
        stockDayVoList2=getZhuYanJiShuList();
        stockDayVoList3=getChunTuXingList();
        if (stockDayVoList2!=null&&stockDayVoList2.size()!=0){
            for (StockDayVo stockDayVo2:stockDayVoList2){
                if (stockDayVoList1!=null&&stockDayVoList1.size()!=0) {
                    for (StockDayVo stockDayVo1 : stockDayVoList1) {
                       if (stockDayVo2.getCode().equals(stockDayVo1.getCode())){
                           stockDayVoList4.add(stockDayVo2);
                       }
                    }
                }
                if (stockDayVoList3!=null&&stockDayVoList3.size()!=0) {
                    for (StockDayVo stockDayVo3 : stockDayVoList3) {
                        if (stockDayVo2.getCode().equals(stockDayVo3.getCode())){
                            boolean fage=true;
                            if (stockDayVoList4!=null&&stockDayVoList4.size()!=0) {
                                for (StockDayVo stockDayVo4 : stockDayVoList4) {
                                    if (stockDayVo4.getCode().equals(stockDayVo2.getCode())){
                                        fage=false;
                                    }
                                }
                            }
                            if (fage){
                                stockDayVoList4.add(stockDayVo2);
                            }
                        }
                    }
                }
            }
        }

        if (stockDayVoList3!=null&&stockDayVoList3.size()!=0){
            for (StockDayVo stockDayVo3:stockDayVoList3){
                if (stockDayVoList1!=null&&stockDayVoList1.size()!=0) {
                    for (StockDayVo stockDayVo1 : stockDayVoList1) {
                        if (stockDayVo3.getCode().equals(stockDayVo1.getCode())){
                            boolean fage=true;
                            if (stockDayVoList4!=null&&stockDayVoList4.size()!=0) {
                                for (StockDayVo stockDayVo4 : stockDayVoList4) {
                                    if (stockDayVo4.getCode().equals(stockDayVo3.getCode())){
                                        fage=false;
                                    }
                                }
                            }
                            if (fage){
                                stockDayVoList4.add(stockDayVo3);
                            }
                        }
                    }
                }
            }
        }
        return stockDayVoList4;
    }


}
