package com.stock.stockday.service.impl;

import com.stock.stockday.entity.StockCode;
import com.stock.stockday.service.StockCodeService;
import com.stock.stockday.service.StockDayScienceService;
import com.stock.stockday.service.function.DayScience0000Function;
import com.stock.stockday.service.function.DayScience0001Function;
import com.stock.stockday.service.function.DayScience0002Function;
import com.stock.stockday.service.function.DayScience0003Function;
import com.stock.stockday.service.function.DayScience0004Function;
import com.stock.stockday.service.function.DayScience0005Function;
import com.stock.stockday.service.function.DayScience0006Function;
import com.stock.stockday.service.function.DayScience0007Function;
import com.stock.stockday.service.function.DayScience0008Function;
import com.stock.stockday.service.function.DayScience0009Function;
import com.stock.stockday.service.function.DayScience001Function;
import com.stock.stockday.service.function.DayScience0020Function;
import com.stock.stockday.service.function.DayScience0021Function;
import com.stock.stockday.service.function.DayScience0022Function;
import com.stock.stockday.service.function.DayScience0023Function;
import com.stock.stockday.service.function.DayScience0024Function;
import com.stock.stockday.service.function.DayScience0025Function;
import com.stock.stockday.service.function.DayScience0026Function;
import com.stock.stockday.service.function.DayScience0027Function;
import com.stock.stockday.service.function.DayScience0028Function;
import com.stock.stockday.service.function.DayScience3000Function;
import com.stock.stockday.service.function.DayScience3001Function;
import com.stock.stockday.service.function.DayScience3002Function;
import com.stock.stockday.service.function.DayScience3003Function;
import com.stock.stockday.service.function.DayScience3004Function;
import com.stock.stockday.service.function.DayScience3005Function;
import com.stock.stockday.service.function.DayScience399Function;
import com.stock.stockday.service.function.DayScience6000Function;
import com.stock.stockday.service.function.DayScience6001Function;
import com.stock.stockday.service.function.DayScience6002Function;
import com.stock.stockday.service.function.DayScience6003Function;
import com.stock.stockday.service.function.DayScience6004Function;
import com.stock.stockday.service.function.DayScience6005Function;
import com.stock.stockday.service.function.DayScience6006Function;
import com.stock.stockday.service.function.DayScience6007Function;
import com.stock.stockday.service.function.DayScience6008Function;
import com.stock.stockday.service.function.DayScience6009Function;
import com.stock.stockday.service.function.DayScience6010Function;
import com.stock.stockday.service.function.DayScience6011Function;
import com.stock.stockday.service.function.DayScience6012Function;
import com.stock.stockday.service.function.DayScience6013Function;
import com.stock.stockday.service.function.DayScience6014Function;
import com.stock.stockday.service.function.DayScience6015Function;
import com.stock.stockday.service.function.DayScience6016Function;
import com.stock.stockday.service.function.DayScience6017Function;
import com.stock.stockday.service.function.DayScience6018Function;
import com.stock.stockday.service.function.DayScience6019Function;
import com.stock.stockday.service.function.DayScience603Function;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StockDayScienceServiceImpl implements StockDayScienceService {
    @Autowired
    private StockCodeService stockCodeService;
    @Autowired
    private DayScience0000Function dayScience0000Function;
    @Autowired
    private DayScience0001Function dayScience0001Function;
    @Autowired
    private DayScience0002Function dayScience0002Function;
    @Autowired
    private DayScience0003Function dayScience0003Function;
    @Autowired
    private DayScience0004Function dayScience0004Function;
    @Autowired
    private DayScience0005Function dayScience0005Function;
    @Autowired
    private DayScience0006Function dayScience0006Function;
    @Autowired
    private DayScience0007Function dayScience0007Function;
    @Autowired
    private DayScience0008Function dayScience0008Function;
    @Autowired
    private DayScience0009Function dayScience0009Function;
    @Autowired
    private DayScience0020Function dayScience0020Function;
    @Autowired
    private DayScience0021Function dayScience0021Function;
    @Autowired
    private DayScience0022Function dayScience0022Function;
    @Autowired
    private DayScience0023Function dayScience0023Function;
    @Autowired
    private DayScience0024Function dayScience0024Function;
    @Autowired
    private DayScience0025Function dayScience0025Function;
    @Autowired
    private DayScience0026Function dayScience0026Function;
    @Autowired
    private DayScience0027Function dayScience0027Function;
    @Autowired
    private DayScience0028Function dayScience0028Function;
    @Autowired
    private DayScience3000Function dayScience3000Function;
    @Autowired
    private DayScience3001Function dayScience3001Function;
    @Autowired
    private DayScience3002Function dayScience3002Function;
    @Autowired
    private DayScience3003Function dayScience3003Function;
    @Autowired
    private DayScience3004Function dayScience3004Function;
    @Autowired
    private DayScience3005Function dayScience3005Function;
    @Autowired
    private DayScience6000Function dayScience6000Function;
    @Autowired
    private DayScience6001Function dayScience6001Function;
    @Autowired
    private DayScience6002Function dayScience6002Function;
    @Autowired
    private DayScience6003Function dayScience6003Function;
    @Autowired
    private DayScience6004Function dayScience6004Function;
    @Autowired
    private DayScience6005Function dayScience6005Function;
    @Autowired
    private DayScience6006Function dayScience6006Function;
    @Autowired
    private DayScience6007Function dayScience6007Function;
    @Autowired
    private DayScience6008Function dayScience6008Function;
    @Autowired
    private DayScience6009Function dayScience6009Function;
    @Autowired
    private DayScience6010Function dayScience6010Function;
    @Autowired
    private DayScience6011Function dayScience6011Function;
    @Autowired
    private DayScience6012Function dayScience6012Function;
    @Autowired
    private DayScience6013Function dayScience6013Function;
    @Autowired
    private DayScience6014Function dayScience6014Function;
    @Autowired
    private DayScience6015Function dayScience6015Function;
    @Autowired
    private DayScience6016Function dayScience6016Function;
    @Autowired
    private DayScience6017Function dayScience6017Function;
    @Autowired
    private DayScience6018Function dayScience6018Function;
    @Autowired
    private DayScience6019Function dayScience6019Function;
    @Autowired
    private DayScience001Function dayScience001Function;
    @Autowired
    private DayScience399Function dayScience399Function;
    @Autowired
    private DayScience603Function dayScience603Function;

    @Override
    public boolean getAllScience() {
        List<StockCode> stockCodeList = stockCodeService.getStockCodeList();
        if (stockCodeList == null || stockCodeList.isEmpty()) {
            return false;
        }
        for (StockCode stockCode : stockCodeList) {
            boolean fage;
            switch (stockCode.getId().substring(0, 4)) {
//                case "0000":
//                    fage= dayScience0000Function.dayScience0000Function(stockCode);
//                    continue;
//                case "0001":
//                    fage= dayScience0001Function.dayScience0001Function(stockCode);
//                    continue;
//                case "0002":
//                    fage= dayScience0002Function.dayScience0002Function(stockCode);
//                    continue;
//                case "0003":
//                    fage= dayScience0003Function.dayScience0003Function(stockCode);
//                    continue;
//                case "0004":
//                    fage= dayScience0004Function.dayScience0004Function(stockCode);
//                    continue;
//                case "0005":
//                    fage= dayScience0005Function.dayScience0005Function(stockCode);
//                    continue;
//                case "0006":
//                    fage= dayScience0006Function.dayScience0006Function(stockCode);
//                    continue;
//                case "0007":
//                    fage= dayScience0007Function.dayScience0007Function(stockCode);
//                    continue;
//                case "0008":
//                    fage= dayScience0008Function.dayScience0008Function(stockCode);
//                    continue;
//                case "0009":
//                    fage= dayScience0009Function.dayScience0009Function(stockCode);
//                    continue;
//                case "0020":
//                    fage= dayScience0020Function.dayScience0020Function(stockCode);
//                    continue;
//                case "0021":
//                    fage= dayScience0021Function.dayScience0021Function(stockCode);
//                    continue;
//                case "0022":
//                    fage= dayScience0022Function.dayScience0022Function(stockCode);
//                    continue;
//                case "0023":
//                    fage= dayScience0023Function.dayScience0023Function(stockCode);
//                    continue;
//                case "0024":
//                    fage= dayScience0024Function.dayScience0024Function(stockCode);
//                    continue;
//                case "0025":
//                    fage= dayScience0025Function.dayScience0025Function(stockCode);
//                    continue;
//                case "0026":
//                    fage= dayScience0026Function.dayScience0026Function(stockCode);
//                    continue;
//                case "0027":
//                    fage= dayScience0027Function.dayScience0027Function(stockCode);
//                    continue;
//                case "0028":
//                    fage= dayScience0028Function.dayScience0028Function(stockCode);
//                    continue;
//                case "3000":
//                    fage= dayScience3000Function.dayScience3000Function(stockCode);
//                    continue;
//                case "3001":
//                    fage= dayScience3001Function.dayScience3001Function(stockCode);
//                    continue;
//                case "3002":
//                    fage= dayScience3002Function.dayScience3002Function(stockCode);
//                    continue;
//                case "3003":
//                    fage= dayScience3003Function.dayScience3003Function(stockCode);
//                    continue;
//                case "3004":
//                    fage= dayScience3004Function.dayScience3004Function(stockCode);
//                    continue;
//                case "3005":
//                    fage= dayScience3005Function.dayScience3005Function(stockCode);
//                    continue;
//                case "6000":
//                    fage= dayScience6000Function.dayScience6000Function(stockCode);
//                    continue;
//                case "6001":
//                    fage= dayScience6001Function.dayScience6001Function(stockCode);
//                    continue;
//                case "6002":
//                    fage= dayScience6002Function.dayScience6002Function(stockCode);
//                    continue;
//                case "6003":
//                    fage= dayScience6003Function.dayScience6003Function(stockCode);
//                    continue;
//                case "6004":
//                    fage= dayScience6004Function.dayScience6004Function(stockCode);
//                    continue;
//                case "6005":
//                    fage= dayScience6005Function.dayScience6005Function(stockCode);
//                    continue;
//                case "6006":
//                    fage= dayScience6006Function.dayScience6006Function(stockCode);
//                    continue;
//                case "6007":
//                    fage= dayScience6007Function.dayScience6007Function(stockCode);
//                    continue;
//                case "6008":
//                    fage= dayScience6008Function.dayScience6008Function(stockCode);
//                    continue;
//                case "6009":
//                    fage= dayScience6009Function.dayScience6009Function(stockCode);
//                    continue;
//                case "6010":
//                    fage= dayScience6010Function.dayScience6010Function(stockCode);
//                    continue;
//                case "6011":
//                    fage= dayScience6011Function.dayScience6011Function(stockCode);
//                    continue;
//                case "6012":
//                    fage= dayScience6012Function.dayScience6012Function(stockCode);
//                    continue;
//                case "6013":
//                    fage= dayScience6013Function.dayScience6013Function(stockCode);
//                    continue;
//                case "6014":
//                    fage= dayScience6014Function.dayScience6014Function(stockCode);
//                    continue;
//                case "6015":
//                    fage= dayScience6015Function.dayScience6015Function(stockCode);
//                    continue;
//                case "6016":
//                    fage= dayScience6016Function.dayScience6016Function(stockCode);
//                    continue;
//                case "6017":
//                    fage= dayScience6017Function.dayScience6017Function(stockCode);
//                    continue;
//                case "6018":
//                    fage= dayScience6018Function.dayScience6018Function(stockCode);
//                    continue;
//                case "6019":
//                    fage= dayScience6019Function.dayScience6019Function(stockCode);
//                    continue;
                default:
                    switch (stockCode.getId().substring(0, 3)) {
//                        case "001":
//                            fage= dayScience001Function.dayScience001Function(stockCode);
//                            continue;
                        case "399":
                            fage= dayScience399Function.dayScience399Function(stockCode);
                            continue;
//                        case "603":
//                            fage= dayScience603Function.dayScience603Function(stockCode);
//                            continue;
                        default:
                            continue;
                    }
            }
        }

        return false;
    }
}
