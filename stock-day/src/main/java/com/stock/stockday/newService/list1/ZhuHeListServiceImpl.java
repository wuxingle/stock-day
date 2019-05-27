package com.stock.stockday.newService.list1;

import com.stock.stockday.entity.StockCode;
import com.stock.stockday.service.StockCodeService;
import com.stock.stockday.vo.StockDayVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class ZhuHeListServiceImpl implements ZhuHeListService {
    @Autowired
    private StockCodeService stockCodeService;
    @Autowired
    private GetZhuHeListStock0000 getZhuHeListStock0000;
    @Autowired
    private GetZhuHeListStock0001 getZhuHeListStock0001;
    @Autowired
    private GetZhuHeListStock0002 getZhuHeListStock0002;
    @Autowired
    private GetZhuHeListStock0003 getZhuHeListStock0003;
    @Autowired
    private GetZhuHeListStock0004 getZhuHeListStock0004;
    @Autowired
    private GetZhuHeListStock0005 getZhuHeListStock0005;
    @Autowired
    private GetZhuHeListStock0006 getZhuHeListStock0006;
    @Autowired
    private GetZhuHeListStock0007 getZhuHeListStock0007;
    @Autowired
    private GetZhuHeListStock0008 getZhuHeListStock0008;
    @Autowired
    private GetZhuHeListStock0009 getZhuHeListStock0009;
    @Autowired
    private GetZhuHeListStock0020 getZhuHeListStock0020;
    @Autowired
    private GetZhuHeListStock0021 getZhuHeListStock0021;
    @Autowired
    private GetZhuHeListStock0022 getZhuHeListStock0022;
    @Autowired
    private GetZhuHeListStock0023 getZhuHeListStock0023;
    @Autowired
    private GetZhuHeListStock0024 getZhuHeListStock0024;
    @Autowired
    private GetZhuHeListStock0025 getZhuHeListStock0025;
    @Autowired
    private GetZhuHeListStock0026 getZhuHeListStock0026;
    @Autowired
    private GetZhuHeListStock0027 getZhuHeListStock0027;
    @Autowired
    private GetZhuHeListStock0028 getZhuHeListStock0028;
    @Autowired
    private GetZhuHeListStock3000 getZhuHeListStock3000;
    @Autowired
    private GetZhuHeListStock3001 getZhuHeListStock3001;
    @Autowired
    private GetZhuHeListStock3002 getZhuHeListStock3002;
    @Autowired
    private GetZhuHeListStock3003 getZhuHeListStock3003;
    @Autowired
    private GetZhuHeListStock3004 getZhuHeListStock3004;
    @Autowired
    private GetZhuHeListStock3005 getZhuHeListStock3005;
    @Autowired
    private GetZhuHeListStock6000 getZhuHeListStock6000;
    @Autowired
    private GetZhuHeListStock6001 getZhuHeListStock6001;
    @Autowired
    private GetZhuHeListStock6002 getZhuHeListStock6002;
    @Autowired
    private GetZhuHeListStock6003 getZhuHeListStock6003;
    @Autowired
    private GetZhuHeListStock6004 getZhuHeListStock6004;
    @Autowired
    private GetZhuHeListStock6005 getZhuHeListStock6005;
    @Autowired
    private GetZhuHeListStock6006 getZhuHeListStock6006;
    @Autowired
    private GetZhuHeListStock6007 getZhuHeListStock6007;
    @Autowired
    private GetZhuHeListStock6008 getZhuHeListStock6008;
    @Autowired
    private GetZhuHeListStock6009 getZhuHeListStock6009;
    @Autowired
    private GetZhuHeListStock6010 getZhuHeListStock6010;
    @Autowired
    private GetZhuHeListStock6011 getZhuHeListStock6011;
    @Autowired
    private GetZhuHeListStock6012 getZhuHeListStock6012;
    @Autowired
    private GetZhuHeListStock6013 getZhuHeListStock6013;
    @Autowired
    private GetZhuHeListStock6014 getZhuHeListStock6014;
    @Autowired
    private GetZhuHeListStock6015 getZhuHeListStock6015;
    @Autowired
    private GetZhuHeListStock6016 getZhuHeListStock6016;
    @Autowired
    private GetZhuHeListStock6017 getZhuHeListStock6017;
    @Autowired
    private GetZhuHeListStock6018 getZhuHeListStock6018;
    @Autowired
    private GetZhuHeListStock6019 getZhuHeListStock6019;
    @Autowired
    private GetZhuHeListStock001 getZhuHeListStock001;
    @Autowired
    private GetZhuHeListStock603 getZhuHeListStock603;



    @Override
    public List<StockDayVo> getListDayStock24() throws IOException {
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
                        getZhuHeListStock0000.get24ListStock(stockCode, stockDayVoList);
                    }
                    continue;
                case "0001":
                    getZhuHeListStock0001.get24ListStock(stockCode, stockDayVoList);
                    continue;
                case "0002":
                    getZhuHeListStock0002.get24ListStock(stockCode, stockDayVoList);
                    continue;
                case "0003":
                    getZhuHeListStock0003.get24ListStock(stockCode, stockDayVoList);
                    continue;
                case "0004":
                    getZhuHeListStock0004.get24ListStock(stockCode, stockDayVoList);
                    continue;
                case "0005":
                    getZhuHeListStock0005.get24ListStock(stockCode, stockDayVoList);
                    continue;
                case "0006":
                    getZhuHeListStock0006.get24ListStock(stockCode, stockDayVoList);
                    continue;
                case "0007":
                    getZhuHeListStock0007.get24ListStock(stockCode, stockDayVoList);
                    continue;
                case "0008":
                    getZhuHeListStock0008.get24ListStock(stockCode, stockDayVoList);
                    continue;
                case "0009":
                    getZhuHeListStock0009.get24ListStock(stockCode, stockDayVoList);
                    continue;
                case "0020":
                    getZhuHeListStock0020.get24ListStock(stockCode, stockDayVoList);
                    continue;
                case "0021":
                    getZhuHeListStock0021.get24ListStock(stockCode, stockDayVoList);
                    continue;
                case "0022":
                    getZhuHeListStock0022.get24ListStock(stockCode, stockDayVoList);
                    continue;
                case "0023":
                    getZhuHeListStock0023.get24ListStock(stockCode, stockDayVoList);
                    continue;
                case "0024":
                    getZhuHeListStock0024.get24ListStock(stockCode, stockDayVoList);
                    continue;
                case "0025":
                    getZhuHeListStock0025.get24ListStock(stockCode, stockDayVoList);
                    continue;
                case "0026":
                    getZhuHeListStock0026.get24ListStock(stockCode, stockDayVoList);
                    continue;
                case "0027":
                    getZhuHeListStock0027.get24ListStock(stockCode, stockDayVoList);
                    continue;
                case "0028":
                    getZhuHeListStock0028.get24ListStock(stockCode, stockDayVoList);
                    continue;
                case "3000":
                    getZhuHeListStock3000.get24ListStock(stockCode, stockDayVoList);
                    continue;
                case "3001":
                    getZhuHeListStock3001.get24ListStock(stockCode, stockDayVoList);
                    continue;
                case "3002":
                    getZhuHeListStock3002.get24ListStock(stockCode, stockDayVoList);
                    continue;
                case "3003":
                    getZhuHeListStock3003.get24ListStock(stockCode, stockDayVoList);
                    continue;
                case "3004":
                    getZhuHeListStock3004.get24ListStock(stockCode, stockDayVoList);
                    continue;
                case "3005":
                    getZhuHeListStock3005.get24ListStock(stockCode, stockDayVoList);
                    continue;
                case "6000":
                    getZhuHeListStock6000.get24ListStock(stockCode, stockDayVoList);
                    continue;
                case "6001":
                    getZhuHeListStock6001.get24ListStock(stockCode, stockDayVoList);
                    continue;
                case "6002":
                    getZhuHeListStock6002.get24ListStock(stockCode, stockDayVoList);
                    continue;
                case "6003":
                    getZhuHeListStock6003.get24ListStock(stockCode, stockDayVoList);
                    continue;
                case "6004":
                    getZhuHeListStock6004.get24ListStock(stockCode, stockDayVoList);
                    continue;
                case "6005":
                    getZhuHeListStock6005.get24ListStock(stockCode, stockDayVoList);
                    continue;
                case "6006":
                    getZhuHeListStock6006.get24ListStock(stockCode, stockDayVoList);
                    continue;
                case "6007":
                    getZhuHeListStock6007.get24ListStock(stockCode, stockDayVoList);
                    continue;
                case "6008":
                    getZhuHeListStock6008.get24ListStock(stockCode, stockDayVoList);
                    continue;
                case "6009":
                    getZhuHeListStock6009.get24ListStock(stockCode, stockDayVoList);
                    continue;
                case "6010":
                    getZhuHeListStock6010.get24ListStock(stockCode, stockDayVoList);
                    continue;
                case "6011":
                    getZhuHeListStock6011.get24ListStock(stockCode, stockDayVoList);
                    continue;
                case "6012":
                    getZhuHeListStock6012.get24ListStock(stockCode, stockDayVoList);
                    continue;
                case "6013":
                    getZhuHeListStock6013.get24ListStock(stockCode, stockDayVoList);
                    continue;
                case "6014":
                    getZhuHeListStock6014.get24ListStock(stockCode, stockDayVoList);
                    continue;
                case "6015":
                    getZhuHeListStock6015.get24ListStock(stockCode, stockDayVoList);
                    continue;
                case "6016":
                    getZhuHeListStock6016.get24ListStock(stockCode, stockDayVoList);
                    continue;
                case "6017":
                    getZhuHeListStock6017.get24ListStock(stockCode, stockDayVoList);
                    continue;
                case "6018":
                    getZhuHeListStock6018.get24ListStock(stockCode, stockDayVoList);
                    continue;
                case "6019":
                    getZhuHeListStock6019.get24ListStock(stockCode, stockDayVoList);
                    continue;
                default:
                    switch (stockCode.getId().substring(0, 3)) {
                        case "001":
                            getZhuHeListStock001.get24ListStock(stockCode, stockDayVoList);
                            continue;
                        case "603":
                            getZhuHeListStock603.get24ListStock(stockCode, stockDayVoList);
                            continue;
                        default:
                            continue;
                    }
            }
        }
        return stockDayVoList;
    }

    @Override
    public List<StockDayVo> getListDayStock33() throws IOException {
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
                        getZhuHeListStock0000.get33ListStock(stockCode, stockDayVoList);
                    }
                    continue;
                case "0001":
                    getZhuHeListStock0001.get33ListStock(stockCode, stockDayVoList);
                    continue;
                case "0002":
                    getZhuHeListStock0002.get33ListStock(stockCode, stockDayVoList);
                    continue;
                case "0003":
                    getZhuHeListStock0003.get33ListStock(stockCode, stockDayVoList);
                    continue;
                case "0004":
                    getZhuHeListStock0004.get33ListStock(stockCode, stockDayVoList);
                    continue;
                case "0005":
                    getZhuHeListStock0005.get33ListStock(stockCode, stockDayVoList);
                    continue;
                case "0006":
                    getZhuHeListStock0006.get33ListStock(stockCode, stockDayVoList);
                    continue;
                case "0007":
                    getZhuHeListStock0007.get33ListStock(stockCode, stockDayVoList);
                    continue;
                case "0008":
                    getZhuHeListStock0008.get33ListStock(stockCode, stockDayVoList);
                    continue;
                case "0009":
                    getZhuHeListStock0009.get33ListStock(stockCode, stockDayVoList);
                    continue;
                case "0020":
                    getZhuHeListStock0020.get33ListStock(stockCode, stockDayVoList);
                    continue;
                case "0021":
                    getZhuHeListStock0021.get33ListStock(stockCode, stockDayVoList);
                    continue;
                case "0022":
                    getZhuHeListStock0022.get33ListStock(stockCode, stockDayVoList);
                    continue;
                case "0023":
                    getZhuHeListStock0023.get33ListStock(stockCode, stockDayVoList);
                    continue;
                case "0024":
                    getZhuHeListStock0024.get33ListStock(stockCode, stockDayVoList);
                    continue;
                case "0025":
                    getZhuHeListStock0025.get33ListStock(stockCode, stockDayVoList);
                    continue;
                case "0026":
                    getZhuHeListStock0026.get33ListStock(stockCode, stockDayVoList);
                    continue;
                case "0027":
                    getZhuHeListStock0027.get33ListStock(stockCode, stockDayVoList);
                    continue;
                case "0028":
                    getZhuHeListStock0028.get33ListStock(stockCode, stockDayVoList);
                    continue;
                case "3000":
                    getZhuHeListStock3000.get33ListStock(stockCode, stockDayVoList);
                    continue;
                case "3001":
                    getZhuHeListStock3001.get33ListStock(stockCode, stockDayVoList);
                    continue;
                case "3002":
                    getZhuHeListStock3002.get33ListStock(stockCode, stockDayVoList);
                    continue;
                case "3003":
                    getZhuHeListStock3003.get33ListStock(stockCode, stockDayVoList);
                    continue;
                case "3004":
                    getZhuHeListStock3004.get33ListStock(stockCode, stockDayVoList);
                    continue;
                case "3005":
                    getZhuHeListStock3005.get33ListStock(stockCode, stockDayVoList);
                    continue;
                case "6000":
                    getZhuHeListStock6000.get33ListStock(stockCode, stockDayVoList);
                    continue;
                case "6001":
                    getZhuHeListStock6001.get33ListStock(stockCode, stockDayVoList);
                    continue;
                case "6002":
                    getZhuHeListStock6002.get33ListStock(stockCode, stockDayVoList);
                    continue;
                case "6003":
                    getZhuHeListStock6003.get33ListStock(stockCode, stockDayVoList);
                    continue;
                case "6004":
                    getZhuHeListStock6004.get33ListStock(stockCode, stockDayVoList);
                    continue;
                case "6005":
                    getZhuHeListStock6005.get33ListStock(stockCode, stockDayVoList);
                    continue;
                case "6006":
                    getZhuHeListStock6006.get33ListStock(stockCode, stockDayVoList);
                    continue;
                case "6007":
                    getZhuHeListStock6007.get33ListStock(stockCode, stockDayVoList);
                    continue;
                case "6008":
                    getZhuHeListStock6008.get33ListStock(stockCode, stockDayVoList);
                    continue;
                case "6009":
                    getZhuHeListStock6009.get33ListStock(stockCode, stockDayVoList);
                    continue;
                case "6010":
                    getZhuHeListStock6010.get33ListStock(stockCode, stockDayVoList);
                    continue;
                case "6011":
                    getZhuHeListStock6011.get33ListStock(stockCode, stockDayVoList);
                    continue;
                case "6012":
                    getZhuHeListStock6012.get33ListStock(stockCode, stockDayVoList);
                    continue;
                case "6013":
                    getZhuHeListStock6013.get33ListStock(stockCode, stockDayVoList);
                    continue;
                case "6014":
                    getZhuHeListStock6014.get33ListStock(stockCode, stockDayVoList);
                    continue;
                case "6015":
                    getZhuHeListStock6015.get33ListStock(stockCode, stockDayVoList);
                    continue;
                case "6016":
                    getZhuHeListStock6016.get33ListStock(stockCode, stockDayVoList);
                    continue;
                case "6017":
                    getZhuHeListStock6017.get33ListStock(stockCode, stockDayVoList);
                    continue;
                case "6018":
                    getZhuHeListStock6018.get33ListStock(stockCode, stockDayVoList);
                    continue;
                case "6019":
                    getZhuHeListStock6019.get33ListStock(stockCode, stockDayVoList);
                    continue;
                default:
                    switch (stockCode.getId().substring(0, 3)) {
                        case "001":
                            getZhuHeListStock001.get33ListStock(stockCode, stockDayVoList);
                            continue;
                        case "603":
                            getZhuHeListStock603.get33ListStock(stockCode, stockDayVoList);
                            continue;
                        default:
                            continue;
                    }
            }
        }
        return stockDayVoList;
    }

    @Override
    public List<StockDayVo> getListDayStock42() throws IOException {
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
                        getZhuHeListStock0000.get42ListStock(stockCode, stockDayVoList);
                    }
                    continue;
                case "0001":
                    getZhuHeListStock0001.get42ListStock(stockCode, stockDayVoList);
                    continue;
                case "0002":
                    getZhuHeListStock0002.get42ListStock(stockCode, stockDayVoList);
                    continue;
                case "0003":
                    getZhuHeListStock0003.get42ListStock(stockCode, stockDayVoList);
                    continue;
                case "0004":
                    getZhuHeListStock0004.get42ListStock(stockCode, stockDayVoList);
                    continue;
                case "0005":
                    getZhuHeListStock0005.get42ListStock(stockCode, stockDayVoList);
                    continue;
                case "0006":
                    getZhuHeListStock0006.get42ListStock(stockCode, stockDayVoList);
                    continue;
                case "0007":
                    getZhuHeListStock0007.get42ListStock(stockCode, stockDayVoList);
                    continue;
                case "0008":
                    getZhuHeListStock0008.get42ListStock(stockCode, stockDayVoList);
                    continue;
                case "0009":
                    getZhuHeListStock0009.get42ListStock(stockCode, stockDayVoList);
                    continue;
                case "0020":
                    getZhuHeListStock0020.get42ListStock(stockCode, stockDayVoList);
                    continue;
                case "0021":
                    getZhuHeListStock0021.get42ListStock(stockCode, stockDayVoList);
                    continue;
                case "0022":
                    getZhuHeListStock0022.get42ListStock(stockCode, stockDayVoList);
                    continue;
                case "0023":
                    getZhuHeListStock0023.get42ListStock(stockCode, stockDayVoList);
                    continue;
                case "0024":
                    getZhuHeListStock0024.get42ListStock(stockCode, stockDayVoList);
                    continue;
                case "0025":
                    getZhuHeListStock0025.get42ListStock(stockCode, stockDayVoList);
                    continue;
                case "0026":
                    getZhuHeListStock0026.get42ListStock(stockCode, stockDayVoList);
                    continue;
                case "0027":
                    getZhuHeListStock0027.get42ListStock(stockCode, stockDayVoList);
                    continue;
                case "0028":
                    getZhuHeListStock0028.get42ListStock(stockCode, stockDayVoList);
                    continue;
                case "3000":
                    getZhuHeListStock3000.get42ListStock(stockCode, stockDayVoList);
                    continue;
                case "3001":
                    getZhuHeListStock3001.get42ListStock(stockCode, stockDayVoList);
                    continue;
                case "3002":
                    getZhuHeListStock3002.get42ListStock(stockCode, stockDayVoList);
                    continue;
                case "3003":
                    getZhuHeListStock3003.get42ListStock(stockCode, stockDayVoList);
                    continue;
                case "3004":
                    getZhuHeListStock3004.get42ListStock(stockCode, stockDayVoList);
                    continue;
                case "3005":
                    getZhuHeListStock3005.get42ListStock(stockCode, stockDayVoList);
                    continue;
                case "6000":
                    getZhuHeListStock6000.get42ListStock(stockCode, stockDayVoList);
                    continue;
                case "6001":
                    getZhuHeListStock6001.get42ListStock(stockCode, stockDayVoList);
                    continue;
                case "6002":
                    getZhuHeListStock6002.get42ListStock(stockCode, stockDayVoList);
                    continue;
                case "6003":
                    getZhuHeListStock6003.get42ListStock(stockCode, stockDayVoList);
                    continue;
                case "6004":
                    getZhuHeListStock6004.get42ListStock(stockCode, stockDayVoList);
                    continue;
                case "6005":
                    getZhuHeListStock6005.get42ListStock(stockCode, stockDayVoList);
                    continue;
                case "6006":
                    getZhuHeListStock6006.get42ListStock(stockCode, stockDayVoList);
                    continue;
                case "6007":
                    getZhuHeListStock6007.get42ListStock(stockCode, stockDayVoList);
                    continue;
                case "6008":
                    getZhuHeListStock6008.get42ListStock(stockCode, stockDayVoList);
                    continue;
                case "6009":
                    getZhuHeListStock6009.get42ListStock(stockCode, stockDayVoList);
                    continue;
                case "6010":
                    getZhuHeListStock6010.get42ListStock(stockCode, stockDayVoList);
                    continue;
                case "6011":
                    getZhuHeListStock6011.get42ListStock(stockCode, stockDayVoList);
                    continue;
                case "6012":
                    getZhuHeListStock6012.get42ListStock(stockCode, stockDayVoList);
                    continue;
                case "6013":
                    getZhuHeListStock6013.get42ListStock(stockCode, stockDayVoList);
                    continue;
                case "6014":
                    getZhuHeListStock6014.get42ListStock(stockCode, stockDayVoList);
                    continue;
                case "6015":
                    getZhuHeListStock6015.get42ListStock(stockCode, stockDayVoList);
                    continue;
                case "6016":
                    getZhuHeListStock6016.get42ListStock(stockCode, stockDayVoList);
                    continue;
                case "6017":
                    getZhuHeListStock6017.get42ListStock(stockCode, stockDayVoList);
                    continue;
                case "6018":
                    getZhuHeListStock6018.get42ListStock(stockCode, stockDayVoList);
                    continue;
                case "6019":
                    getZhuHeListStock6019.get42ListStock(stockCode, stockDayVoList);
                    continue;
                default:
                    switch (stockCode.getId().substring(0, 3)) {
                        case "001":
                            getZhuHeListStock001.get42ListStock(stockCode, stockDayVoList);
                            continue;
                        case "603":
                            getZhuHeListStock603.get42ListStock(stockCode, stockDayVoList);
                            continue;
                        default:
                            continue;
                    }
            }
        }
        return stockDayVoList;
    }

    @Override
    public List<StockDayVo> getListDayStockBenPan() throws IOException {
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
                        getZhuHeListStock0000.getBenPanListStock(stockCode, stockDayVoList);
                    }
                    continue;
                case "0001":
                    getZhuHeListStock0001.getBenPanListStock(stockCode, stockDayVoList);
                    continue;
                case "0002":
                    getZhuHeListStock0002.getBenPanListStock(stockCode, stockDayVoList);
                    continue;
                case "0003":
                    getZhuHeListStock0003.getBenPanListStock(stockCode, stockDayVoList);
                    continue;
                case "0004":
                    getZhuHeListStock0004.getBenPanListStock(stockCode, stockDayVoList);
                    continue;
                case "0005":
                    getZhuHeListStock0005.getBenPanListStock(stockCode, stockDayVoList);
                    continue;
                case "0006":
                    getZhuHeListStock0006.getBenPanListStock(stockCode, stockDayVoList);
                    continue;
                case "0007":
                    getZhuHeListStock0007.getBenPanListStock(stockCode, stockDayVoList);
                    continue;
                case "0008":
                    getZhuHeListStock0008.getBenPanListStock(stockCode, stockDayVoList);
                    continue;
                case "0009":
                    getZhuHeListStock0009.getBenPanListStock(stockCode, stockDayVoList);
                    continue;
                case "0020":
                    getZhuHeListStock0020.getBenPanListStock(stockCode, stockDayVoList);
                    continue;
                case "0021":
                    getZhuHeListStock0021.getBenPanListStock(stockCode, stockDayVoList);
                    continue;
                case "0022":
                    getZhuHeListStock0022.getBenPanListStock(stockCode, stockDayVoList);
                    continue;
                case "0023":
                    getZhuHeListStock0023.getBenPanListStock(stockCode, stockDayVoList);
                    continue;
                case "0024":
                    getZhuHeListStock0024.getBenPanListStock(stockCode, stockDayVoList);
                    continue;
                case "0025":
                    getZhuHeListStock0025.getBenPanListStock(stockCode, stockDayVoList);
                    continue;
                case "0026":
                    getZhuHeListStock0026.getBenPanListStock(stockCode, stockDayVoList);
                    continue;
                case "0027":
                    getZhuHeListStock0027.getBenPanListStock(stockCode, stockDayVoList);
                    continue;
                case "0028":
                    getZhuHeListStock0028.getBenPanListStock(stockCode, stockDayVoList);
                    continue;
                case "3000":
                    getZhuHeListStock3000.getBenPanListStock(stockCode, stockDayVoList);
                    continue;
                case "3001":
                    getZhuHeListStock3001.getBenPanListStock(stockCode, stockDayVoList);
                    continue;
                case "3002":
                    getZhuHeListStock3002.getBenPanListStock(stockCode, stockDayVoList);
                    continue;
                case "3003":
                    getZhuHeListStock3003.getBenPanListStock(stockCode, stockDayVoList);
                    continue;
                case "3004":
                    getZhuHeListStock3004.getBenPanListStock(stockCode, stockDayVoList);
                    continue;
                case "3005":
                    getZhuHeListStock3005.getBenPanListStock(stockCode, stockDayVoList);
                    continue;
                case "6000":
                    getZhuHeListStock6000.getBenPanListStock(stockCode, stockDayVoList);
                    continue;
                case "6001":
                    getZhuHeListStock6001.getBenPanListStock(stockCode, stockDayVoList);
                    continue;
                case "6002":
                    getZhuHeListStock6002.getBenPanListStock(stockCode, stockDayVoList);
                    continue;
                case "6003":
                    getZhuHeListStock6003.getBenPanListStock(stockCode, stockDayVoList);
                    continue;
                case "6004":
                    getZhuHeListStock6004.getBenPanListStock(stockCode, stockDayVoList);
                    continue;
                case "6005":
                    getZhuHeListStock6005.getBenPanListStock(stockCode, stockDayVoList);
                    continue;
                case "6006":
                    getZhuHeListStock6006.getBenPanListStock(stockCode, stockDayVoList);
                    continue;
                case "6007":
                    getZhuHeListStock6007.getBenPanListStock(stockCode, stockDayVoList);
                    continue;
                case "6008":
                    getZhuHeListStock6008.getBenPanListStock(stockCode, stockDayVoList);
                    continue;
                case "6009":
                    getZhuHeListStock6009.getBenPanListStock(stockCode, stockDayVoList);
                    continue;
                case "6010":
                    getZhuHeListStock6010.getBenPanListStock(stockCode, stockDayVoList);
                    continue;
                case "6011":
                    getZhuHeListStock6011.getBenPanListStock(stockCode, stockDayVoList);
                    continue;
                case "6012":
                    getZhuHeListStock6012.getBenPanListStock(stockCode, stockDayVoList);
                    continue;
                case "6013":
                    getZhuHeListStock6013.getBenPanListStock(stockCode, stockDayVoList);
                    continue;
                case "6014":
                    getZhuHeListStock6014.getBenPanListStock(stockCode, stockDayVoList);
                    continue;
                case "6015":
                    getZhuHeListStock6015.getBenPanListStock(stockCode, stockDayVoList);
                    continue;
                case "6016":
                    getZhuHeListStock6016.getBenPanListStock(stockCode, stockDayVoList);
                    continue;
                case "6017":
                    getZhuHeListStock6017.getBenPanListStock(stockCode, stockDayVoList);
                    continue;
                case "6018":
                    getZhuHeListStock6018.getBenPanListStock(stockCode, stockDayVoList);
                    continue;
                case "6019":
                    getZhuHeListStock6019.getBenPanListStock(stockCode, stockDayVoList);
                    continue;
                default:
                    switch (stockCode.getId().substring(0, 3)) {
                        case "001":
                            getZhuHeListStock001.getBenPanListStock(stockCode, stockDayVoList);
                            continue;
                        case "603":
                            getZhuHeListStock603.getBenPanListStock(stockCode, stockDayVoList);
                            continue;
                        default:
                            continue;
                    }
            }
        }
        return stockDayVoList;
    }
}
