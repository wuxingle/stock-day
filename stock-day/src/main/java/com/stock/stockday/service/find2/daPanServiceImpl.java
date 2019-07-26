package com.stock.stockday.service.find2;

import com.stock.stockday.entity.*;
import com.stock.stockday.service.StockCodeService;
import com.stock.stockday.service.StockDay0000Service;
import com.stock.stockday.service.StockDay0020Service;
import com.stock.stockday.service.StockDay3000Service;
import com.stock.stockday.service.StockDay399Service;
import com.stock.stockday.service.StockDay6000Service;
import com.stock.stockday.service.StockDayScience0000Service;
import com.stock.stockday.service.StockDayScience0020Service;
import com.stock.stockday.service.StockDayScience3000Service;
import com.stock.stockday.service.StockDayScience399Service;
import com.stock.stockday.service.StockDayScience6000Service;
import com.stock.stockday.service.find2.yanpan.DaPanDayServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class daPanServiceImpl implements daPanService {
    @Autowired
    private StockCodeService stockCodeService;
    @Autowired
    private StockDay0000Service stockDay0000Service;
    @Autowired
    private StockDayScience0000Service stockDayScience0000Service;
    @Autowired
    private DaPanDayServiceImpl daPanDayService;
    @Autowired
    private StockDay0020Service stockDay0020Service;
    @Autowired
    private StockDayScience0020Service stockDayScience0020Service;
    @Autowired
    private StockDay3000Service stockDay3000Service;
    @Autowired
    private StockDayScience3000Service stockDayScience3000Service;
    @Autowired
    private StockDay6000Service stockDay6000Service;
    @Autowired
    private StockDayScience6000Service stockDayScience6000Service;
    @Autowired
    private StockDay399Service stockDay399Service;
    @Autowired
    private StockDayScience399Service stockDayScience399Service;


    @Override
    public String getDaPan() throws IOException {
        //获取所以编码
        List<StockCode> stockCodeList = stockCodeService.getStockCodeList();
        if (stockCodeList == null || stockCodeList.isEmpty()) {
            return null;
        }
        //获取上证
        List<StockDay0000> stockDay000001List = stockDay0000Service.selectByCodeAndEx("000001", "SH");
        //获取sz
        List<StockDay399> stockDay399001List = stockDay399Service.selectByCodeAndEx("399001", "SZ");
        //获取中小
        List<StockDay399> stockDay399005List = stockDay399Service.selectByCodeAndEx("399005", "SZ");
        //获取创业
        List<StockDay399> stockDay399006List = stockDay399Service.selectByCodeAndEx("399006", "SZ");

        List<StockDayScience0000> stockDayScience000001List = stockDayScience0000Service.selectByCodeAndEx("000001", "SH");
        List<StockDayScience399> stockDayScience399001List = stockDayScience399Service.selectByCodeAndEx("399001", "SZ");
        List<StockDayScience399> stockDayScience399005List = stockDayScience399Service.selectByCodeAndEx("399001", "SZ");
        List<StockDayScience399> stockDayScience399006List = stockDayScience399Service.selectByCodeAndEx("399001", "SZ");
        //遍历
        List<StockDayAll> stockDayAllList0001 = new ArrayList<>();
        List<StockDayAll> stockDayAllList399001 = new ArrayList<>();
        List<StockDayAll> stockDayAllList399005 = new ArrayList<>();
        List<StockDayAll> stockDayAllList399006 = new ArrayList<>();
        List<StockDayScience> stockDayScienceList0001 = new ArrayList<>();
        List<StockDayScience> stockDayScienceList399001 = new ArrayList<>();
        List<StockDayScience> stockDayScienceList399005 = new ArrayList<>();
        List<StockDayScience> stockDayScienceList399006 = new ArrayList<>();

        for (StockDay0000 stockDay0000 : stockDay000001List) {
            StockDayAll stockDayAll = new StockDayAll();
            BeanUtils.copyProperties(stockDay0000, stockDayAll);
            stockDayAllList0001.add(stockDayAll);
        }
        for (StockDayScience0000 stockDayScience0000 : stockDayScience000001List) {
            StockDayScience stockDayScience = new StockDayScience();
            BeanUtils.copyProperties(stockDayScience0000, stockDayScience);
            stockDayScienceList0001.add(stockDayScience);
        }
        daPanDayService.dayYanPanFunction(stockDayAllList0001, stockDayScienceList0001);

        for (StockDay399 stockDay399001 : stockDay399001List) {
            StockDayAll stockDayAll = new StockDayAll();
            BeanUtils.copyProperties(stockDay399001, stockDayAll);
            stockDayAllList399001.add(stockDayAll);
        }
        for (StockDayScience399 stockDayScience399 : stockDayScience399001List) {
            StockDayScience stockDayScience = new StockDayScience();
            BeanUtils.copyProperties(stockDayScience399, stockDayScience);
            stockDayScienceList399001.add(stockDayScience);
        }
        daPanDayService.dayYanPanFunction(stockDayAllList399001, stockDayScienceList399001);

        for (StockDay399 stockDay399 : stockDay399005List) {
            StockDayAll stockDayAll = new StockDayAll();
            BeanUtils.copyProperties(stockDay399, stockDayAll);
            stockDayAllList399005.add(stockDayAll);
        }
        for (StockDayScience399 stockDayScience399 : stockDayScience399005List) {
            StockDayScience stockDayScience = new StockDayScience();
            BeanUtils.copyProperties(stockDayScience399, stockDayScience);
            stockDayScienceList399005.add(stockDayScience);
        }
        daPanDayService.dayYanPanFunction(stockDayAllList399005, stockDayScienceList399005);

        for (StockDay399 stockDay399 : stockDay399006List) {
            StockDayAll stockDayAll = new StockDayAll();
            BeanUtils.copyProperties(stockDay399, stockDayAll);
            stockDayAllList399006.add(stockDayAll);
        }
        for (StockDayScience399 stockDayScience399 : stockDayScience399006List) {
            StockDayScience stockDayScience = new StockDayScience();
            BeanUtils.copyProperties(stockDayScience399, stockDayScience);
            stockDayScienceList399006.add(stockDayScience);
        }
        daPanDayService.dayYanPanFunction(stockDayAllList399006, stockDayScienceList399006);

        return null;
    }
}