package com.stock.stockday.service.find;

import com.stock.stockday.entity.StockCode;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay399;
import com.stock.stockday.service.StockCodeService;
import com.stock.stockday.vo.StockDayVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class findServiceImpl implements findService {
    @Autowired
    private StockCodeService stockCodeService;
    @Autowired
    private FindListStock0000 findListStock0000;
    @Autowired
    private FindListStock0001 findListStock0001;
    @Autowired
    private FindListStock0002 findListStock0002;
    @Autowired
    private FindListStock0003 findListStock0003;
    @Autowired
    private FindListStock0004 findListStock0004;
    @Autowired
    private FindListStock0005 findListStock0005;
    @Autowired
    private FindListStock0006 findListStock0006;
    @Autowired
    private FindListStock0007 findListStock0007;
    @Autowired
    private FindListStock0008 findListStock0008;
    @Autowired
    private FindListStock0009 findListStock0009;
    @Autowired
    private FindListStock0020 findListStock0020;
    @Autowired
    private FindListStock0021 findListStock0021;
    @Autowired
    private FindListStock0022 findListStock0022;
    @Autowired
    private FindListStock0023 findListStock0023;
    @Autowired
    private FindListStock0024 findListStock0024;
    @Autowired
    private FindListStock0025 findListStock0025;
    @Autowired
    private FindListStock0026 findListStock0026;
    @Autowired
    private FindListStock0027 findListStock0027;
    @Autowired
    private FindListStock0028 findListStock0028;
    @Autowired
    private FindListStock3000 findListStock3000;
    @Autowired
    private FindListStock3001 findListStock3001;
    @Autowired
    private FindListStock3002 findListStock3002;
    @Autowired
    private FindListStock3003 findListStock3003;
    @Autowired
    private FindListStock3004 findListStock3004;
    @Autowired
    private FindListStock3005 findListStock3005;
    @Autowired
    private FindListStock6000 findListStock6000;
    @Autowired
    private FindListStock6001 findListStock6001;
    @Autowired
    private FindListStock6002 findListStock6002;
    @Autowired
    private FindListStock6003 findListStock6003;
    @Autowired
    private FindListStock6004 findListStock6004;
    @Autowired
    private FindListStock6005 findListStock6005;
    @Autowired
    private FindListStock6006 findListStock6006;
    @Autowired
    private FindListStock6007 findListStock6007;
    @Autowired
    private FindListStock6008 findListStock6008;
    @Autowired
    private FindListStock6009 findListStock6009;
    @Autowired
    private FindListStock6010 findListStock6010;
    @Autowired
    private FindListStock6011 findListStock6011;
    @Autowired
    private FindListStock6012 findListStock6012;
    @Autowired
    private FindListStock6013 findListStock6013;
    @Autowired
    private FindListStock6014 findListStock6014;
    @Autowired
    private FindListStock6015 findListStock6015;
    @Autowired
    private FindListStock6016 findListStock6016;
    @Autowired
    private FindListStock6017 findListStock6017;
    @Autowired
    private FindListStock6018 findListStock6018;
    @Autowired
    private FindListStock6019 findListStock6019;
    @Autowired
    private FindListStock001 findListStock001;
    @Autowired
    private FindListStock603 findListStock603;


    @Override
    public List<StockDayVo> duoTuXiangShang() {
        //获取所有编码
        List<StockCode> stockCodeList = stockCodeService.getStockCodeList();
        if (stockCodeList == null || stockCodeList.isEmpty()) {
            return null;
        }
        List<StockDayVo> stockDayVoList = new ArrayList<>();
        //遍历
        for (StockCode stockCode : stockCodeList) {
            switch (stockCode.getId().substring(0, 4)) {
                case "0000":
                    findListStock0000.duoTuXiangShang(stockCode, stockDayVoList);
                    continue;
                case "0001":
                    findListStock0001.duoTuXiangShang(stockCode, stockDayVoList);
                    continue;
                case "0002":
                    findListStock0002.duoTuXiangShang(stockCode, stockDayVoList);
                    continue;
                case "0003":
                    findListStock0003.duoTuXiangShang(stockCode, stockDayVoList);
                    continue;
                case "0004":
                    findListStock0004.duoTuXiangShang(stockCode, stockDayVoList);
                    continue;
                case "0005":
                    findListStock0005.duoTuXiangShang(stockCode, stockDayVoList);
                    continue;
                case "0006":
                    findListStock0006.duoTuXiangShang(stockCode, stockDayVoList);
                    continue;
                case "0007":
                    findListStock0007.duoTuXiangShang(stockCode, stockDayVoList);
                    continue;
                case "0008":
                    findListStock0008.duoTuXiangShang(stockCode, stockDayVoList);
                    continue;
                case "0009":
                    findListStock0009.duoTuXiangShang(stockCode, stockDayVoList);
                    continue;
                case "0020":
                    findListStock0020.duoTuXiangShang(stockCode, stockDayVoList);
                    continue;
                case "0021":
                    findListStock0021.duoTuXiangShang(stockCode, stockDayVoList);
                    continue;
                case "0022":
                    findListStock0022.duoTuXiangShang(stockCode, stockDayVoList);
                    continue;
                case "0023":
                    findListStock0023.duoTuXiangShang(stockCode, stockDayVoList);
                    continue;
                case "0024":
                    findListStock0024.duoTuXiangShang(stockCode, stockDayVoList);
                    continue;
                case "0025":
                    findListStock0025.duoTuXiangShang(stockCode, stockDayVoList);
                    continue;
                case "0026":
                    findListStock0026.duoTuXiangShang(stockCode, stockDayVoList);
                    continue;
                case "0027":
                    findListStock0027.duoTuXiangShang(stockCode, stockDayVoList);
                    continue;
                case "0028":
                    findListStock0028.duoTuXiangShang(stockCode, stockDayVoList);
                    continue;
                case "3000":
                    findListStock3000.duoTuXiangShang(stockCode, stockDayVoList);
                    continue;
                case "3001":
                    findListStock3001.duoTuXiangShang(stockCode, stockDayVoList);
                    continue;
                case "3002":
                    findListStock3002.duoTuXiangShang(stockCode, stockDayVoList);
                    continue;
                case "3003":
                    findListStock3003.duoTuXiangShang(stockCode, stockDayVoList);
                    continue;
                case "3004":
                    findListStock3004.duoTuXiangShang(stockCode, stockDayVoList);
                    continue;
                case "3005":
                    findListStock3005.duoTuXiangShang(stockCode, stockDayVoList);
                    continue;
                case "6000":
                    findListStock6000.duoTuXiangShang(stockCode, stockDayVoList);
                    continue;
                case "6001":
                    findListStock6001.duoTuXiangShang(stockCode, stockDayVoList);
                    continue;
                case "6002":
                    findListStock6002.duoTuXiangShang(stockCode, stockDayVoList);
                    continue;
                case "6003":
                    findListStock6003.duoTuXiangShang(stockCode, stockDayVoList);
                    continue;
                case "6004":
                    findListStock6004.duoTuXiangShang(stockCode, stockDayVoList);
                    continue;
                case "6005":
                    findListStock6005.duoTuXiangShang(stockCode, stockDayVoList);
                    continue;
                case "6006":
                    findListStock6006.duoTuXiangShang(stockCode, stockDayVoList);
                    continue;
                case "6007":
                    findListStock6007.duoTuXiangShang(stockCode, stockDayVoList);
                    continue;
                case "6008":
                    findListStock6008.duoTuXiangShang(stockCode, stockDayVoList);
                    continue;
                case "6009":
                    findListStock6009.duoTuXiangShang(stockCode, stockDayVoList);
                    continue;
                case "6010":
                    findListStock6010.duoTuXiangShang(stockCode, stockDayVoList);
                    continue;
                case "6011":
                    findListStock6011.duoTuXiangShang(stockCode, stockDayVoList);
                    continue;
                case "6012":
                    findListStock6012.duoTuXiangShang(stockCode, stockDayVoList);
                    continue;
                case "6013":
                    findListStock6013.duoTuXiangShang(stockCode, stockDayVoList);
                    continue;
                case "6014":
                    findListStock6014.duoTuXiangShang(stockCode, stockDayVoList);
                    continue;
                case "6015":
                    findListStock6015.duoTuXiangShang(stockCode, stockDayVoList);
                    continue;
                case "6016":
                    findListStock6016.duoTuXiangShang(stockCode, stockDayVoList);
                    continue;
                case "6017":
                    findListStock6017.duoTuXiangShang(stockCode, stockDayVoList);
                    continue;
                case "6018":
                    findListStock6018.duoTuXiangShang(stockCode, stockDayVoList);
                    continue;
                case "6019":
                    findListStock6019.duoTuXiangShang(stockCode, stockDayVoList);
                    continue;
                default:
                    switch (stockCode.getId().substring(0, 3)) {
                        case "001":
                            findListStock001.duoTuXiangShang(stockCode, stockDayVoList);
                            continue;
                        case "603":
                            findListStock603.duoTuXiangShang(stockCode, stockDayVoList);
                            continue;
                        default:
                            continue;
                    }
            }
        }
        return stockDayVoList;
    }

    @Override
    public List<StockDayVo> shengV() {
        //获取所有编码
        List<StockCode> stockCodeList = stockCodeService.getStockCodeList();
        if (stockCodeList == null || stockCodeList.isEmpty()) {
            return null;
        }
        List<StockDayVo> stockDayVoList = new ArrayList<>();
        //遍历
        for (StockCode stockCode : stockCodeList) {
            switch (stockCode.getId().substring(0, 4)) {
                case "0000":
                    findListStock0000.shengV(stockCode, stockDayVoList);
                    continue;
                case "0001":
                    findListStock0001.shengV(stockCode, stockDayVoList);
                    continue;
                case "0002":
                    findListStock0002.shengV(stockCode, stockDayVoList);
                    continue;
                case "0003":
                    findListStock0003.shengV(stockCode, stockDayVoList);
                    continue;
                case "0004":
                    findListStock0004.shengV(stockCode, stockDayVoList);
                    continue;
                case "0005":
                    findListStock0005.shengV(stockCode, stockDayVoList);
                    continue;
                case "0006":
                    findListStock0006.shengV(stockCode, stockDayVoList);
                    continue;
                case "0007":
                    findListStock0007.shengV(stockCode, stockDayVoList);
                    continue;
                case "0008":
                    findListStock0008.shengV(stockCode, stockDayVoList);
                    continue;
                case "0009":
                    findListStock0009.shengV(stockCode, stockDayVoList);
                    continue;
                case "0020":
                    findListStock0020.shengV(stockCode, stockDayVoList);
                    continue;
                case "0021":
                    findListStock0021.shengV(stockCode, stockDayVoList);
                    continue;
                case "0022":
                    findListStock0022.shengV(stockCode, stockDayVoList);
                    continue;
                case "0023":
                    findListStock0023.shengV(stockCode, stockDayVoList);
                    continue;
                case "0024":
                    findListStock0024.shengV(stockCode, stockDayVoList);
                    continue;
                case "0025":
                    findListStock0025.shengV(stockCode, stockDayVoList);
                    continue;
                case "0026":
                    findListStock0026.shengV(stockCode, stockDayVoList);
                    continue;
                case "0027":
                    findListStock0027.shengV(stockCode, stockDayVoList);
                    continue;
                case "0028":
                    findListStock0028.shengV(stockCode, stockDayVoList);
                    continue;
                case "3000":
                    findListStock3000.shengV(stockCode, stockDayVoList);
                    continue;
                case "3001":
                    findListStock3001.shengV(stockCode, stockDayVoList);
                    continue;
                case "3002":
                    findListStock3002.shengV(stockCode, stockDayVoList);
                    continue;
                case "3003":
                    findListStock3003.shengV(stockCode, stockDayVoList);
                    continue;
                case "3004":
                    findListStock3004.shengV(stockCode, stockDayVoList);
                    continue;
                case "3005":
                    findListStock3005.shengV(stockCode, stockDayVoList);
                    continue;
                case "6000":
                    findListStock6000.shengV(stockCode, stockDayVoList);
                    continue;
                case "6001":
                    findListStock6001.shengV(stockCode, stockDayVoList);
                    continue;
                case "6002":
                    findListStock6002.shengV(stockCode, stockDayVoList);
                    continue;
                case "6003":
                    findListStock6003.shengV(stockCode, stockDayVoList);
                    continue;
                case "6004":
                    findListStock6004.shengV(stockCode, stockDayVoList);
                    continue;
                case "6005":
                    findListStock6005.shengV(stockCode, stockDayVoList);
                    continue;
                case "6006":
                    findListStock6006.shengV(stockCode, stockDayVoList);
                    continue;
                case "6007":
                    findListStock6007.shengV(stockCode, stockDayVoList);
                    continue;
                case "6008":
                    findListStock6008.shengV(stockCode, stockDayVoList);
                    continue;
                case "6009":
                    findListStock6009.shengV(stockCode, stockDayVoList);
                    continue;
                case "6010":
                    findListStock6010.shengV(stockCode, stockDayVoList);
                    continue;
                case "6011":
                    findListStock6011.shengV(stockCode, stockDayVoList);
                    continue;
                case "6012":
                    findListStock6012.shengV(stockCode, stockDayVoList);
                    continue;
                case "6013":
                    findListStock6013.shengV(stockCode, stockDayVoList);
                    continue;
                case "6014":
                    findListStock6014.shengV(stockCode, stockDayVoList);
                    continue;
                case "6015":
                    findListStock6015.shengV(stockCode, stockDayVoList);
                    continue;
                case "6016":
                    findListStock6016.shengV(stockCode, stockDayVoList);
                    continue;
                case "6017":
                    findListStock6017.shengV(stockCode, stockDayVoList);
                    continue;
                case "6018":
                    findListStock6018.shengV(stockCode, stockDayVoList);
                    continue;
                case "6019":
                    findListStock6019.shengV(stockCode, stockDayVoList);
                    continue;
                default:
                    switch (stockCode.getId().substring(0, 3)) {
                        case "001":
                            findListStock001.shengV(stockCode, stockDayVoList);
                            continue;
                        case "603":
                            findListStock603.shengV(stockCode, stockDayVoList);
                            continue;
                        default:
                            continue;
                    }
            }
        }
        return stockDayVoList;
    }

    @Override
    public List<StockDayVo> reset20() {
        //获取所有编码
        List<StockCode> stockCodeList = stockCodeService.getStockCodeList();
        if (stockCodeList == null || stockCodeList.isEmpty()) {
            return null;
        }
        List<StockDayVo> stockDayVoList = new ArrayList<>();
        //遍历
        for (StockCode stockCode : stockCodeList) {
            switch (stockCode.getId().substring(0, 4)) {
                case "0000":
                    findListStock0000.reset20(stockCode, stockDayVoList);
                    continue;
                case "0001":
                    findListStock0001.reset20(stockCode, stockDayVoList);
                    continue;
                case "0002":
                    findListStock0002.reset20(stockCode, stockDayVoList);
                    continue;
                case "0003":
                    findListStock0003.reset20(stockCode, stockDayVoList);
                    continue;
                case "0004":
                    findListStock0004.reset20(stockCode, stockDayVoList);
                    continue;
                case "0005":
                    findListStock0005.reset20(stockCode, stockDayVoList);
                    continue;
                case "0006":
                    findListStock0006.reset20(stockCode, stockDayVoList);
                    continue;
                case "0007":
                    findListStock0007.reset20(stockCode, stockDayVoList);
                    continue;
                case "0008":
                    findListStock0008.reset20(stockCode, stockDayVoList);
                    continue;
                case "0009":
                    findListStock0009.reset20(stockCode, stockDayVoList);
                    continue;
                case "0020":
                    findListStock0020.reset20(stockCode, stockDayVoList);
                    continue;
                case "0021":
                    findListStock0021.reset20(stockCode, stockDayVoList);
                    continue;
                case "0022":
                    findListStock0022.reset20(stockCode, stockDayVoList);
                    continue;
                case "0023":
                    findListStock0023.reset20(stockCode, stockDayVoList);
                    continue;
                case "0024":
                    findListStock0024.reset20(stockCode, stockDayVoList);
                    continue;
                case "0025":
                    findListStock0025.reset20(stockCode, stockDayVoList);
                    continue;
                case "0026":
                    findListStock0026.reset20(stockCode, stockDayVoList);
                    continue;
                case "0027":
                    findListStock0027.reset20(stockCode, stockDayVoList);
                    continue;
                case "0028":
                    findListStock0028.reset20(stockCode, stockDayVoList);
                    continue;
                case "3000":
                    findListStock3000.reset20(stockCode, stockDayVoList);
                    continue;
                case "3001":
                    findListStock3001.reset20(stockCode, stockDayVoList);
                    continue;
                case "3002":
                    findListStock3002.reset20(stockCode, stockDayVoList);
                    continue;
                case "3003":
                    findListStock3003.reset20(stockCode, stockDayVoList);
                    continue;
                case "3004":
                    findListStock3004.reset20(stockCode, stockDayVoList);
                    continue;
                case "3005":
                    findListStock3005.reset20(stockCode, stockDayVoList);
                    continue;
                case "6000":
                    findListStock6000.reset20(stockCode, stockDayVoList);
                    continue;
                case "6001":
                    findListStock6001.reset20(stockCode, stockDayVoList);
                    continue;
                case "6002":
                    findListStock6002.reset20(stockCode, stockDayVoList);
                    continue;
                case "6003":
                    findListStock6003.reset20(stockCode, stockDayVoList);
                    continue;
                case "6004":
                    findListStock6004.reset20(stockCode, stockDayVoList);
                    continue;
                case "6005":
                    findListStock6005.reset20(stockCode, stockDayVoList);
                    continue;
                case "6006":
                    findListStock6006.reset20(stockCode, stockDayVoList);
                    continue;
                case "6007":
                    findListStock6007.reset20(stockCode, stockDayVoList);
                    continue;
                case "6008":
                    findListStock6008.reset20(stockCode, stockDayVoList);
                    continue;
                case "6009":
                    findListStock6009.reset20(stockCode, stockDayVoList);
                    continue;
                case "6010":
                    findListStock6010.reset20(stockCode, stockDayVoList);
                    continue;
                case "6011":
                    findListStock6011.reset20(stockCode, stockDayVoList);
                    continue;
                case "6012":
                    findListStock6012.reset20(stockCode, stockDayVoList);
                    continue;
                case "6013":
                    findListStock6013.reset20(stockCode, stockDayVoList);
                    continue;
                case "6014":
                    findListStock6014.reset20(stockCode, stockDayVoList);
                    continue;
                case "6015":
                    findListStock6015.reset20(stockCode, stockDayVoList);
                    continue;
                case "6016":
                    findListStock6016.reset20(stockCode, stockDayVoList);
                    continue;
                case "6017":
                    findListStock6017.reset20(stockCode, stockDayVoList);
                    continue;
                case "6018":
                    findListStock6018.reset20(stockCode, stockDayVoList);
                    continue;
                case "6019":
                    findListStock6019.reset20(stockCode, stockDayVoList);
                    continue;
                default:
                    switch (stockCode.getId().substring(0, 3)) {
                        case "001":
                            findListStock001.reset20(stockCode, stockDayVoList);
                            continue;
                        case "603":
                            findListStock603.reset20(stockCode, stockDayVoList);
                            continue;
                        default:
                            continue;
                    }
            }
        }
        return stockDayVoList;
    }

    @Override
    public List<StockDayVo> jieQi() {
        //获取所有编码
        List<StockCode> stockCodeList = stockCodeService.getStockCodeList();
        if (stockCodeList == null || stockCodeList.isEmpty()) {
            return null;
        }
        List<StockDayVo> stockDayVoList = new ArrayList<>();
        //遍历
        for (StockCode stockCode : stockCodeList) {
            switch (stockCode.getId().substring(0, 4)) {
                case "0000":
                    findListStock0000.jieQi(stockCode, stockDayVoList);
                    continue;
                case "0001":
                    findListStock0001.jieQi(stockCode, stockDayVoList);
                    continue;
                case "0002":
                    findListStock0002.jieQi(stockCode, stockDayVoList);
                    continue;
                case "0003":
                    findListStock0003.jieQi(stockCode, stockDayVoList);
                    continue;
                case "0004":
                    findListStock0004.jieQi(stockCode, stockDayVoList);
                    continue;
                case "0005":
                    findListStock0005.jieQi(stockCode, stockDayVoList);
                    continue;
                case "0006":
                    findListStock0006.jieQi(stockCode, stockDayVoList);
                    continue;
                case "0007":
                    findListStock0007.jieQi(stockCode, stockDayVoList);
                    continue;
                case "0008":
                    findListStock0008.jieQi(stockCode, stockDayVoList);
                    continue;
                case "0009":
                    findListStock0009.jieQi(stockCode, stockDayVoList);
                    continue;
                case "0020":
                    findListStock0020.jieQi(stockCode, stockDayVoList);
                    continue;
                case "0021":
                    findListStock0021.jieQi(stockCode, stockDayVoList);
                    continue;
                case "0022":
                    findListStock0022.jieQi(stockCode, stockDayVoList);
                    continue;
                case "0023":
                    findListStock0023.jieQi(stockCode, stockDayVoList);
                    continue;
                case "0024":
                    findListStock0024.jieQi(stockCode, stockDayVoList);
                    continue;
                case "0025":
                    findListStock0025.jieQi(stockCode, stockDayVoList);
                    continue;
                case "0026":
                    findListStock0026.jieQi(stockCode, stockDayVoList);
                    continue;
                case "0027":
                    findListStock0027.jieQi(stockCode, stockDayVoList);
                    continue;
                case "0028":
                    findListStock0028.jieQi(stockCode, stockDayVoList);
                    continue;
                case "3000":
                    findListStock3000.jieQi(stockCode, stockDayVoList);
                    continue;
                case "3001":
                    findListStock3001.jieQi(stockCode, stockDayVoList);
                    continue;
                case "3002":
                    findListStock3002.jieQi(stockCode, stockDayVoList);
                    continue;
                case "3003":
                    findListStock3003.jieQi(stockCode, stockDayVoList);
                    continue;
                case "3004":
                    findListStock3004.jieQi(stockCode, stockDayVoList);
                    continue;
                case "3005":
                    findListStock3005.jieQi(stockCode, stockDayVoList);
                    continue;
                case "6000":
                    findListStock6000.jieQi(stockCode, stockDayVoList);
                    continue;
                case "6001":
                    findListStock6001.jieQi(stockCode, stockDayVoList);
                    continue;
                case "6002":
                    findListStock6002.jieQi(stockCode, stockDayVoList);
                    continue;
                case "6003":
                    findListStock6003.jieQi(stockCode, stockDayVoList);
                    continue;
                case "6004":
                    findListStock6004.jieQi(stockCode, stockDayVoList);
                    continue;
                case "6005":
                    findListStock6005.jieQi(stockCode, stockDayVoList);
                    continue;
                case "6006":
                    findListStock6006.jieQi(stockCode, stockDayVoList);
                    continue;
                case "6007":
                    findListStock6007.jieQi(stockCode, stockDayVoList);
                    continue;
                case "6008":
                    findListStock6008.jieQi(stockCode, stockDayVoList);
                    continue;
                case "6009":
                    findListStock6009.jieQi(stockCode, stockDayVoList);
                    continue;
                case "6010":
                    findListStock6010.jieQi(stockCode, stockDayVoList);
                    continue;
                case "6011":
                    findListStock6011.jieQi(stockCode, stockDayVoList);
                    continue;
                case "6012":
                    findListStock6012.jieQi(stockCode, stockDayVoList);
                    continue;
                case "6013":
                    findListStock6013.jieQi(stockCode, stockDayVoList);
                    continue;
                case "6014":
                    findListStock6014.jieQi(stockCode, stockDayVoList);
                    continue;
                case "6015":
                    findListStock6015.jieQi(stockCode, stockDayVoList);
                    continue;
                case "6016":
                    findListStock6016.jieQi(stockCode, stockDayVoList);
                    continue;
                case "6017":
                    findListStock6017.jieQi(stockCode, stockDayVoList);
                    continue;
                case "6018":
                    findListStock6018.jieQi(stockCode, stockDayVoList);
                    continue;
                case "6019":
                    findListStock6019.jieQi(stockCode, stockDayVoList);
                    continue;
                default:
                    switch (stockCode.getId().substring(0, 3)) {
                        case "001":
                            findListStock001.jieQi(stockCode, stockDayVoList);
                            continue;
                        case "603":
                            findListStock603.jieQi(stockCode, stockDayVoList);
                            continue;
                        default:
                            continue;
                    }
            }
        }
        return stockDayVoList;
    }

    @Override
    public List<StockDayVo> jishujieqi() {
        //获取所有编码
        List<StockCode> stockCodeList = stockCodeService.getStockCodeList();
        if (stockCodeList == null || stockCodeList.isEmpty()) {
            return null;
        }
        List<StockDayVo> stockDayVoList = new ArrayList<>();
        //遍历
        for (StockCode stockCode : stockCodeList) {
            switch (stockCode.getId().substring(0, 4)) {
                case "0000":
                    findListStock0000.jishujieqi(stockCode, stockDayVoList);
                    continue;
                case "0001":
                    findListStock0001.jishujieqi(stockCode, stockDayVoList);
                    continue;
                case "0002":
                    findListStock0002.jishujieqi(stockCode, stockDayVoList);
                    continue;
                case "0003":
                    findListStock0003.jishujieqi(stockCode, stockDayVoList);
                    continue;
                case "0004":
                    findListStock0004.jishujieqi(stockCode, stockDayVoList);
                    continue;
                case "0005":
                    findListStock0005.jishujieqi(stockCode, stockDayVoList);
                    continue;
                case "0006":
                    findListStock0006.jishujieqi(stockCode, stockDayVoList);
                    continue;
                case "0007":
                    findListStock0007.jishujieqi(stockCode, stockDayVoList);
                    continue;
                case "0008":
                    findListStock0008.jishujieqi(stockCode, stockDayVoList);
                    continue;
                case "0009":
                    findListStock0009.jishujieqi(stockCode, stockDayVoList);
                    continue;
                case "0020":
                    findListStock0020.jishujieqi(stockCode, stockDayVoList);
                    continue;
                case "0021":
                    findListStock0021.jishujieqi(stockCode, stockDayVoList);
                    continue;
                case "0022":
                    findListStock0022.jishujieqi(stockCode, stockDayVoList);
                    continue;
                case "0023":
                    findListStock0023.jishujieqi(stockCode, stockDayVoList);
                    continue;
                case "0024":
                    findListStock0024.jishujieqi(stockCode, stockDayVoList);
                    continue;
                case "0025":
                    findListStock0025.jishujieqi(stockCode, stockDayVoList);
                    continue;
                case "0026":
                    findListStock0026.jishujieqi(stockCode, stockDayVoList);
                    continue;
                case "0027":
                    findListStock0027.jishujieqi(stockCode, stockDayVoList);
                    continue;
                case "0028":
                    findListStock0028.jishujieqi(stockCode, stockDayVoList);
                    continue;
                case "3000":
                    findListStock3000.jishujieqi(stockCode, stockDayVoList);
                    continue;
                case "3001":
                    findListStock3001.jishujieqi(stockCode, stockDayVoList);
                    continue;
                case "3002":
                    findListStock3002.jishujieqi(stockCode, stockDayVoList);
                    continue;
                case "3003":
                    findListStock3003.jishujieqi(stockCode, stockDayVoList);
                    continue;
                case "3004":
                    findListStock3004.jishujieqi(stockCode, stockDayVoList);
                    continue;
                case "3005":
                    findListStock3005.jishujieqi(stockCode, stockDayVoList);
                    continue;
                case "6000":
                    findListStock6000.jishujieqi(stockCode, stockDayVoList);
                    continue;
                case "6001":
                    findListStock6001.jishujieqi(stockCode, stockDayVoList);
                    continue;
                case "6002":
                    findListStock6002.jishujieqi(stockCode, stockDayVoList);
                    continue;
                case "6003":
                    findListStock6003.jishujieqi(stockCode, stockDayVoList);
                    continue;
                case "6004":
                    findListStock6004.jishujieqi(stockCode, stockDayVoList);
                    continue;
                case "6005":
                    findListStock6005.jishujieqi(stockCode, stockDayVoList);
                    continue;
                case "6006":
                    findListStock6006.jishujieqi(stockCode, stockDayVoList);
                    continue;
                case "6007":
                    findListStock6007.jishujieqi(stockCode, stockDayVoList);
                    continue;
                case "6008":
                    findListStock6008.jishujieqi(stockCode, stockDayVoList);
                    continue;
                case "6009":
                    findListStock6009.jishujieqi(stockCode, stockDayVoList);
                    continue;
                case "6010":
                    findListStock6010.jishujieqi(stockCode, stockDayVoList);
                    continue;
                case "6011":
                    findListStock6011.jishujieqi(stockCode, stockDayVoList);
                    continue;
                case "6012":
                    findListStock6012.jishujieqi(stockCode, stockDayVoList);
                    continue;
                case "6013":
                    findListStock6013.jishujieqi(stockCode, stockDayVoList);
                    continue;
                case "6014":
                    findListStock6014.jishujieqi(stockCode, stockDayVoList);
                    continue;
                case "6015":
                    findListStock6015.jishujieqi(stockCode, stockDayVoList);
                    continue;
                case "6016":
                    findListStock6016.jishujieqi(stockCode, stockDayVoList);
                    continue;
                case "6017":
                    findListStock6017.jishujieqi(stockCode, stockDayVoList);
                    continue;
                case "6018":
                    findListStock6018.jishujieqi(stockCode, stockDayVoList);
                    continue;
                case "6019":
                    findListStock6019.jishujieqi(stockCode, stockDayVoList);
                    continue;
                default:
                    switch (stockCode.getId().substring(0, 3)) {
                        case "001":
                            findListStock001.jishujieqi(stockCode, stockDayVoList);
                            continue;
                        case "603":
                            findListStock603.jishujieqi(stockCode, stockDayVoList);
                            continue;
                        default:
                            continue;
                    }
            }
        }
        return stockDayVoList;
    }

    @Override
    public List<StockDayVo> jishujieqi1() {
        //获取所有编码
        List<StockCode> stockCodeList = stockCodeService.getStockCodeList();
        if (stockCodeList == null || stockCodeList.isEmpty()) {
            return null;
        }
        List<StockDayVo> stockDayVoList = new ArrayList<>();
        //遍历
        for (StockCode stockCode : stockCodeList) {
            switch (stockCode.getId().substring(0, 4)) {
                case "0000":
                    findListStock0000.jishujieqi1(stockCode, stockDayVoList);
                    continue;
                case "0001":
                    findListStock0001.jishujieqi1(stockCode, stockDayVoList);
                    continue;
                case "0002":
                    findListStock0002.jishujieqi1(stockCode, stockDayVoList);
                    continue;
                case "0003":
                    findListStock0003.jishujieqi1(stockCode, stockDayVoList);
                    continue;
                case "0004":
                    findListStock0004.jishujieqi1(stockCode, stockDayVoList);
                    continue;
                case "0005":
                    findListStock0005.jishujieqi1(stockCode, stockDayVoList);
                    continue;
                case "0006":
                    findListStock0006.jishujieqi1(stockCode, stockDayVoList);
                    continue;
                case "0007":
                    findListStock0007.jishujieqi1(stockCode, stockDayVoList);
                    continue;
                case "0008":
                    findListStock0008.jishujieqi1(stockCode, stockDayVoList);
                    continue;
                case "0009":
                    findListStock0009.jishujieqi1(stockCode, stockDayVoList);
                    continue;
                case "0020":
                    findListStock0020.jishujieqi1(stockCode, stockDayVoList);
                    continue;
                case "0021":
                    findListStock0021.jishujieqi1(stockCode, stockDayVoList);
                    continue;
                case "0022":
                    findListStock0022.jishujieqi1(stockCode, stockDayVoList);
                    continue;
                case "0023":
                    findListStock0023.jishujieqi1(stockCode, stockDayVoList);
                    continue;
                case "0024":
                    findListStock0024.jishujieqi1(stockCode, stockDayVoList);
                    continue;
                case "0025":
                    findListStock0025.jishujieqi1(stockCode, stockDayVoList);
                    continue;
                case "0026":
                    findListStock0026.jishujieqi1(stockCode, stockDayVoList);
                    continue;
                case "0027":
                    findListStock0027.jishujieqi1(stockCode, stockDayVoList);
                    continue;
                case "0028":
                    findListStock0028.jishujieqi1(stockCode, stockDayVoList);
                    continue;
                case "3000":
                    findListStock3000.jishujieqi1(stockCode, stockDayVoList);
                    continue;
                case "3001":
                    findListStock3001.jishujieqi1(stockCode, stockDayVoList);
                    continue;
                case "3002":
                    findListStock3002.jishujieqi1(stockCode, stockDayVoList);
                    continue;
                case "3003":
                    findListStock3003.jishujieqi1(stockCode, stockDayVoList);
                    continue;
                case "3004":
                    findListStock3004.jishujieqi1(stockCode, stockDayVoList);
                    continue;
                case "3005":
                    findListStock3005.jishujieqi1(stockCode, stockDayVoList);
                    continue;
                case "6000":
                    findListStock6000.jishujieqi1(stockCode, stockDayVoList);
                    continue;
                case "6001":
                    findListStock6001.jishujieqi1(stockCode, stockDayVoList);
                    continue;
                case "6002":
                    findListStock6002.jishujieqi1(stockCode, stockDayVoList);
                    continue;
                case "6003":
                    findListStock6003.jishujieqi1(stockCode, stockDayVoList);
                    continue;
                case "6004":
                    findListStock6004.jishujieqi1(stockCode, stockDayVoList);
                    continue;
                case "6005":
                    findListStock6005.jishujieqi1(stockCode, stockDayVoList);
                    continue;
                case "6006":
                    findListStock6006.jishujieqi1(stockCode, stockDayVoList);
                    continue;
                case "6007":
                    findListStock6007.jishujieqi1(stockCode, stockDayVoList);
                    continue;
                case "6008":
                    findListStock6008.jishujieqi1(stockCode, stockDayVoList);
                    continue;
                case "6009":
                    findListStock6009.jishujieqi1(stockCode, stockDayVoList);
                    continue;
                case "6010":
                    findListStock6010.jishujieqi1(stockCode, stockDayVoList);
                    continue;
                case "6011":
                    findListStock6011.jishujieqi1(stockCode, stockDayVoList);
                    continue;
                case "6012":
                    findListStock6012.jishujieqi1(stockCode, stockDayVoList);
                    continue;
                case "6013":
                    findListStock6013.jishujieqi1(stockCode, stockDayVoList);
                    continue;
                case "6014":
                    findListStock6014.jishujieqi1(stockCode, stockDayVoList);
                    continue;
                case "6015":
                    findListStock6015.jishujieqi1(stockCode, stockDayVoList);
                    continue;
                case "6016":
                    findListStock6016.jishujieqi1(stockCode, stockDayVoList);
                    continue;
                case "6017":
                    findListStock6017.jishujieqi1(stockCode, stockDayVoList);
                    continue;
                case "6018":
                    findListStock6018.jishujieqi1(stockCode, stockDayVoList);
                    continue;
                case "6019":
                    findListStock6019.jishujieqi1(stockCode, stockDayVoList);
                    continue;
                default:
                    switch (stockCode.getId().substring(0, 3)) {
                        case "001":
                            findListStock001.jishujieqi1(stockCode, stockDayVoList);
                            continue;
                        case "603":
                            findListStock603.jishujieqi1(stockCode, stockDayVoList);
                            continue;
                        default:
                            continue;
                    }
            }
        }
        return stockDayVoList;
    }

}
