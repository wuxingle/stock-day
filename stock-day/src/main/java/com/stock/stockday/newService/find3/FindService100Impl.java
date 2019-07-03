package com.stock.stockday.newService.find3;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.stock.stockday.entity.*;
import com.stock.stockday.service.StockCodeService;
import com.stock.stockday.service.StockDay0000Service;
import com.stock.stockday.service.StockDay0001Service;
import com.stock.stockday.service.StockDay0002Service;
import com.stock.stockday.service.StockDay0003Service;
import com.stock.stockday.service.StockDay0004Service;
import com.stock.stockday.service.StockDay0005Service;
import com.stock.stockday.service.StockDay0006Service;
import com.stock.stockday.service.StockDay0007Service;
import com.stock.stockday.service.StockDay0008Service;
import com.stock.stockday.service.StockDay0009Service;
import com.stock.stockday.service.StockDay001Service;
import com.stock.stockday.service.StockDay0020Service;
import com.stock.stockday.service.StockDay0021Service;
import com.stock.stockday.service.StockDay0022Service;
import com.stock.stockday.service.StockDay0023Service;
import com.stock.stockday.service.StockDay0024Service;
import com.stock.stockday.service.StockDay0025Service;
import com.stock.stockday.service.StockDay0026Service;
import com.stock.stockday.service.StockDay0027Service;
import com.stock.stockday.service.StockDay0028Service;
import com.stock.stockday.service.StockDay3000Service;
import com.stock.stockday.service.StockDay3001Service;
import com.stock.stockday.service.StockDay3002Service;
import com.stock.stockday.service.StockDay3003Service;
import com.stock.stockday.service.StockDay3004Service;
import com.stock.stockday.service.StockDay3005Service;
import com.stock.stockday.service.StockDay399Service;
import com.stock.stockday.service.StockDay6000Service;
import com.stock.stockday.service.StockDay6001Service;
import com.stock.stockday.service.StockDay6002Service;
import com.stock.stockday.service.StockDay6003Service;
import com.stock.stockday.service.StockDay6004Service;
import com.stock.stockday.service.StockDay6005Service;
import com.stock.stockday.service.StockDay6006Service;
import com.stock.stockday.service.StockDay6007Service;
import com.stock.stockday.service.StockDay6008Service;
import com.stock.stockday.service.StockDay6009Service;
import com.stock.stockday.service.StockDay6010Service;
import com.stock.stockday.service.StockDay6011Service;
import com.stock.stockday.service.StockDay6012Service;
import com.stock.stockday.service.StockDay6013Service;
import com.stock.stockday.service.StockDay6014Service;
import com.stock.stockday.service.StockDay6015Service;
import com.stock.stockday.service.StockDay6016Service;
import com.stock.stockday.service.StockDay6017Service;
import com.stock.stockday.service.StockDay6018Service;
import com.stock.stockday.service.StockDay6019Service;
import com.stock.stockday.service.StockDay603Service;
import com.stock.stockday.service.StockDayScience0000Service;
import com.stock.stockday.service.StockDayScience0001Service;
import com.stock.stockday.service.StockDayScience0002Service;
import com.stock.stockday.service.StockDayScience0003Service;
import com.stock.stockday.service.StockDayScience0004Service;
import com.stock.stockday.service.StockDayScience0005Service;
import com.stock.stockday.service.StockDayScience0006Service;
import com.stock.stockday.service.StockDayScience0007Service;
import com.stock.stockday.service.StockDayScience0008Service;
import com.stock.stockday.service.StockDayScience0009Service;
import com.stock.stockday.service.StockDayScience001Service;
import com.stock.stockday.service.StockDayScience0020Service;
import com.stock.stockday.service.StockDayScience0021Service;
import com.stock.stockday.service.StockDayScience0022Service;
import com.stock.stockday.service.StockDayScience0023Service;
import com.stock.stockday.service.StockDayScience0024Service;
import com.stock.stockday.service.StockDayScience0025Service;
import com.stock.stockday.service.StockDayScience0026Service;
import com.stock.stockday.service.StockDayScience0027Service;
import com.stock.stockday.service.StockDayScience0028Service;
import com.stock.stockday.service.StockDayScience3000Service;
import com.stock.stockday.service.StockDayScience3001Service;
import com.stock.stockday.service.StockDayScience3002Service;
import com.stock.stockday.service.StockDayScience3003Service;
import com.stock.stockday.service.StockDayScience3004Service;
import com.stock.stockday.service.StockDayScience3005Service;
import com.stock.stockday.service.StockDayScience399Service;
import com.stock.stockday.service.StockDayScience6000Service;
import com.stock.stockday.service.StockDayScience6001Service;
import com.stock.stockday.service.StockDayScience6002Service;
import com.stock.stockday.service.StockDayScience6003Service;
import com.stock.stockday.service.StockDayScience6004Service;
import com.stock.stockday.service.StockDayScience6005Service;
import com.stock.stockday.service.StockDayScience6006Service;
import com.stock.stockday.service.StockDayScience6007Service;
import com.stock.stockday.service.StockDayScience6008Service;
import com.stock.stockday.service.StockDayScience6009Service;
import com.stock.stockday.service.StockDayScience6010Service;
import com.stock.stockday.service.StockDayScience6011Service;
import com.stock.stockday.service.StockDayScience6012Service;
import com.stock.stockday.service.StockDayScience6013Service;
import com.stock.stockday.service.StockDayScience6014Service;
import com.stock.stockday.service.StockDayScience6015Service;
import com.stock.stockday.service.StockDayScience6016Service;
import com.stock.stockday.service.StockDayScience6017Service;
import com.stock.stockday.service.StockDayScience6018Service;
import com.stock.stockday.service.StockDayScience6019Service;
import com.stock.stockday.service.StockDayScience603Service;
import com.stock.stockday.vo.StockDayVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class FindService100Impl implements findService100 {
    @Autowired
    private StockCodeService stockCodeService;
    @Autowired
    private StockDay0000Service stockDay0000Service;
    @Autowired
    private StockDayScience0000Service stockDayScience0000Service;
    @Autowired
    private YanPanDayServiceListImpl yanPanDayService;
    @Autowired
    private StockDay399Service stockDay399Service;
    @Autowired
    private StockDayScience399Service stockDayScience399Service;
    @Autowired
    private StockDay0001Service stockDay0001Service;
    @Autowired
    private StockDayScience0001Service stockDayScience0001Service;
    @Autowired
    private StockDay0002Service stockDay0002Service;
    @Autowired
    private StockDayScience0002Service stockDayScience0002Service;
    @Autowired
    private StockDay0003Service stockDay0003Service;
    @Autowired
    private StockDayScience0003Service stockDayScience0003Service;
    @Autowired
    private StockDay0004Service stockDay0004Service;
    @Autowired
    private StockDayScience0004Service stockDayScience0004Service;
    @Autowired
    private StockDay0005Service stockDay0005Service;
    @Autowired
    private StockDayScience0005Service stockDayScience0005Service;
    @Autowired
    private StockDay0006Service stockDay0006Service;
    @Autowired
    private StockDayScience0006Service stockDayScience0006Service;
    @Autowired
    private StockDay0007Service stockDay0007Service;
    @Autowired
    private StockDayScience0007Service stockDayScience0007Service;
    @Autowired
    private StockDay0008Service stockDay0008Service;
    @Autowired
    private StockDayScience0008Service stockDayScience0008Service;
    @Autowired
    private StockDay0009Service stockDay0009Service;
    @Autowired
    private StockDayScience0009Service stockDayScience0009Service;
    @Autowired
    private StockDay0020Service stockDay0020Service;
    @Autowired
    private StockDayScience0020Service stockDayScience0020Service;
    @Autowired
    private StockDay0021Service stockDay0021Service;
    @Autowired
    private StockDayScience0021Service stockDayScience0021Service;
    @Autowired
    private StockDay0022Service stockDay0022Service;
    @Autowired
    private StockDayScience0022Service stockDayScience0022Service;
    @Autowired
    private StockDay0023Service stockDay0023Service;
    @Autowired
    private StockDayScience0023Service stockDayScience0023Service;
    @Autowired
    private StockDay0024Service stockDay0024Service;
    @Autowired
    private StockDayScience0024Service stockDayScience0024Service;
    @Autowired
    private StockDay0025Service stockDay0025Service;
    @Autowired
    private StockDayScience0025Service stockDayScience0025Service;
    @Autowired
    private StockDay0026Service stockDay0026Service;
    @Autowired
    private StockDayScience0026Service stockDayScience0026Service;
    @Autowired
    private StockDay0027Service stockDay0027Service;
    @Autowired
    private StockDayScience0027Service stockDayScience0027Service;
    @Autowired
    private StockDay0028Service stockDay0028Service;
    @Autowired
    private StockDayScience0028Service stockDayScience0028Service;
    @Autowired
    private StockDay3000Service stockDay3000Service;
    @Autowired
    private StockDayScience3000Service stockDayScience3000Service;
    @Autowired
    private StockDay3001Service stockDay3001Service;
    @Autowired
    private StockDayScience3001Service stockDayScience3001Service;
    @Autowired
    private StockDay3002Service stockDay3002Service;
    @Autowired
    private StockDayScience3002Service stockDayScience3002Service;
    @Autowired
    private StockDay3003Service stockDay3003Service;
    @Autowired
    private StockDayScience3003Service stockDayScience3003Service;
    @Autowired
    private StockDay3004Service stockDay3004Service;
    @Autowired
    private StockDayScience3004Service stockDayScience3004Service;
    @Autowired
    private StockDay3005Service stockDay3005Service;
    @Autowired
    private StockDayScience3005Service stockDayScience3005Service;
    @Autowired
    private StockDay6000Service stockDay6000Service;
    @Autowired
    private StockDayScience6000Service stockDayScience6000Service;
    @Autowired
    private StockDay6001Service stockDay6001Service;
    @Autowired
    private StockDayScience6001Service stockDayScience6001Service;
    @Autowired
    private StockDay6002Service stockDay6002Service;
    @Autowired
    private StockDayScience6002Service stockDayScience6002Service;
    @Autowired
    private StockDay6003Service stockDay6003Service;
    @Autowired
    private StockDayScience6003Service stockDayScience6003Service;
    @Autowired
    private StockDay6004Service stockDay6004Service;
    @Autowired
    private StockDayScience6004Service stockDayScience6004Service;
    @Autowired
    private StockDay6005Service stockDay6005Service;
    @Autowired
    private StockDayScience6005Service stockDayScience6005Service;
    @Autowired
    private StockDay6006Service stockDay6006Service;
    @Autowired
    private StockDayScience6006Service stockDayScience6006Service;
    @Autowired
    private StockDay6007Service stockDay6007Service;
    @Autowired
    private StockDayScience6007Service stockDayScience6007Service;
    @Autowired
    private StockDay6008Service stockDay6008Service;
    @Autowired
    private StockDayScience6008Service stockDayScience6008Service;
    @Autowired
    private StockDay6009Service stockDay6009Service;
    @Autowired
    private StockDayScience6009Service stockDayScience6009Service;
    @Autowired
    private StockDay6010Service stockDay6010Service;
    @Autowired
    private StockDayScience6010Service stockDayScience6010Service;
    @Autowired
    private StockDay6011Service stockDay6011Service;
    @Autowired
    private StockDayScience6011Service stockDayScience6011Service;
    @Autowired
    private StockDay6012Service stockDay6012Service;
    @Autowired
    private StockDayScience6012Service stockDayScience6012Service;
    @Autowired
    private StockDay6013Service stockDay6013Service;
    @Autowired
    private StockDayScience6013Service stockDayScience6013Service;
    @Autowired
    private StockDay6014Service stockDay6014Service;
    @Autowired
    private StockDayScience6014Service stockDayScience6014Service;
    @Autowired
    private StockDay6015Service stockDay6015Service;
    @Autowired
    private StockDayScience6015Service stockDayScience6015Service;
    @Autowired
    private StockDay6016Service stockDay6016Service;
    @Autowired
    private StockDayScience6016Service stockDayScience6016Service;
    @Autowired
    private StockDay6017Service stockDay6017Service;
    @Autowired
    private StockDayScience6017Service stockDayScience6017Service;
    @Autowired
    private StockDay6018Service stockDay6018Service;
    @Autowired
    private StockDayScience6018Service stockDayScience6018Service;
    @Autowired
    private StockDay6019Service stockDay6019Service;
    @Autowired
    private StockDayScience6019Service stockDayScience6019Service;
    @Autowired
    private StockDay001Service stockDay001Service;
    @Autowired
    private StockDayScience001Service stockDayScience001Service;
    @Autowired
    private StockDay603Service stockDay603Service;
    @Autowired
    private StockDayScience603Service stockDayScience603Service;


    @Override
    public List<StockDayVo> dayYanPanFunction85() throws IOException {
        //获取所以编码
        List<StockCode> stockCodeList = stockCodeService.getStockCodeList();
        if (stockCodeList == null || stockCodeList.isEmpty()) {
            return null;
        }
        List<StockDayVo> stockDayVoList=new ArrayList<>();
        Page<StockDay0000> page = new Page<>(1, 60);
        //获取上证
        List<StockDay0000> stockDay000001List = stockDay0000Service.selectByCodeAndExPage(page,"000001", "SH");
        Page<StockDay399> page2 = new Page<>(1, 60);
        //获取sz
        List<StockDay399> stockDay399001List = stockDay399Service.selectByCodeAndExPage(page2,"399001", "SZ");
        Page<StockDay399> page3 = new Page<>(1, 60);
        //获取中小
        List<StockDay399> stockDay399005List = stockDay399Service.selectByCodeAndExPage(page3,"399005", "SZ");
        Page<StockDay399> page4 = new Page<>(1, 60);
        //获取创业
        List<StockDay399> stockDay399006List = stockDay399Service.selectByCodeAndExPage(page4,"399006", "SZ");

        Page<StockDayScience0000> page5=new Page<>(1,60);
        List<StockDayScience0000> stockDayScience000001List = stockDayScience0000Service.selectByPage(page5,"000001", "SH");
        Page<StockDayScience399> page6=new Page<>(1,60);
        List<StockDayScience399> stockDayScience399001List = stockDayScience399Service.selectByPage(page6,"399001", "SZ");
        Page<StockDayScience399> page7=new Page<>(1,60);
        List<StockDayScience399> stockDayScience399005List = stockDayScience399Service.selectByPage(page7,"399001", "SZ");
        Page<StockDayScience399> page8=new Page<>(1,60);
        List<StockDayScience399> stockDayScience399006List = stockDayScience399Service.selectByPage(page8,"399001", "SZ");
        //遍历
        for (StockCode stockCode : stockCodeList) {
            List<StockDayAll> stockDayAllList0001=new ArrayList<>();
            List<StockDayAll> stockDayAllList399001=new ArrayList<>();
            List<StockDayAll> stockDayAllList399005=new ArrayList<>();
            List<StockDayAll> stockDayAllList399006=new ArrayList<>();
            List<StockDayScience> stockDayScienceList0001=new ArrayList<>();
            List<StockDayScience> stockDayScienceList399001=new ArrayList<>();
            List<StockDayScience> stockDayScienceList399005=new ArrayList<>();
            List<StockDayScience> stockDayScienceList399006=new ArrayList<>();
            switch (stockCode.getId().substring(0, 4)) {
                case "0000":
                    if (stockCode.getId().equals("000001") && stockCode.getEx().equals("SH")) {
                        continue;
                    } else {
                        Page<StockDay0000> page9 = new Page<>(1, 60);
                        Page<StockDayScience0000> page1=new Page<>(1,60);
                        List<StockDay0000> stockDay0000List = stockDay0000Service.selectByCodeAndExPage(page9,stockCode.getId(), stockCode.getEx());//日线
                        List<StockDayScience0000> stockDayScience0000List = stockDayScience0000Service.selectByPage(page1,stockCode.getId(), stockCode.getEx());//技术先
                        List<StockDayAll> stockDayAllList=new ArrayList<>();
                        List<StockDayScience> stockDayScienceList=new ArrayList<>();
                        for (StockDay0000 stockDay0000:stockDay0000List){
                            StockDayAll stockDayAll=new StockDayAll();
                            BeanUtils.copyProperties(stockDay0000,stockDayAll);
                            stockDayAllList.add(stockDayAll);
                        }
                        for (StockDayScience0000 stockDayScience0000:stockDayScience0000List){
                            StockDayScience stockDayScience=new StockDayScience();
                            BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                            stockDayScienceList.add(stockDayScience);
                        }
                        for (StockDay399 stockDay399:stockDay399001List){
                            StockDayAll stockDayAll=new StockDayAll();
                            BeanUtils.copyProperties(stockDay399,stockDayAll);
                            stockDayAllList399001.add(stockDayAll);
                        }
                        for (StockDayScience399 stockDayScience399:stockDayScience399001List){
                            StockDayScience stockDayScience=new StockDayScience();
                            BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                            stockDayScienceList399001.add(stockDayScience);
                        }
                        yanPanDayService.dayYanPanFunction85(stockDayAllList,stockDayScienceList,stockDayAllList399001,stockDayScienceList399001,stockDayVoList);
                    }
                    continue;
                case "0001":
                    Page<StockDay0001> page9 = new Page<>(1, 60);
                    Page<StockDayScience0001> page1=new Page<>(1,60);
                    List<StockDay0001> stockDay0001List = stockDay0001Service.selectByCodeAndExPage(page9,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0001> stockDayScience0001List = stockDayScience0001Service.selectByPage(page1,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList=new ArrayList<>();
                    for (StockDay0001 stockDay0001:stockDay0001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0001,stockDayAll);
                        stockDayAllList.add(stockDayAll);
                    }
                    for (StockDayScience0001 stockDayScience0001:stockDayScience0001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0001,stockDayScience);
                        stockDayScienceList.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399001.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction85(stockDayAllList,stockDayScienceList,stockDayAllList399001,stockDayScienceList399001,stockDayVoList);
                    continue;
                case "0002":
                    Page<StockDay0002> page02 = new Page<>(1, 60);
                    Page<StockDayScience0002> page02c=new Page<>(1,60);
                    List<StockDay0002> stockDay0002List = stockDay0002Service.selectByCodeAndExPage(page02,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0002> stockDayScience0002List = stockDayScience0002Service.selectByPage(page02c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList1=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList1=new ArrayList<>();
                    for (StockDay0002 stockDay0002:stockDay0002List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0002,stockDayAll);
                        stockDayAllList1.add(stockDayAll);
                    }
                    for (StockDayScience0002 stockDayScience0002:stockDayScience0002List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0002,stockDayScience);
                        stockDayScienceList1.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399001.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction85(stockDayAllList1,stockDayScienceList1,stockDayAllList399001,stockDayScienceList399001,stockDayVoList);
                    continue;
                case "0003":
                    Page<StockDay0003> page03 = new Page<>(1, 60);
                    Page<StockDayScience0003> page03c=new Page<>(1,60);
                    List<StockDay0003> stockDay0003List = stockDay0003Service.selectByCodeAndExPage(page03,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0003> stockDayScience0003List = stockDayScience0003Service.selectByPage(page03c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList3=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList3=new ArrayList<>();
                    for (StockDay0003 stockDay0003:stockDay0003List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0003,stockDayAll);
                        stockDayAllList3.add(stockDayAll);
                    }
                    for (StockDayScience0003 stockDayScience0003:stockDayScience0003List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0003,stockDayScience);
                        stockDayScienceList3.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399001.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction85(stockDayAllList3,stockDayScienceList3,stockDayAllList399001,stockDayScienceList399001,stockDayVoList);
                    continue;
                case "0004":
                    Page<StockDay0004> page04 = new Page<>(1, 60);
                    Page<StockDayScience0004> page04c=new Page<>(1,60);
                    List<StockDay0004> stockDay0004List = stockDay0004Service.selectByCodeAndExPage(page04,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0004> stockDayScience0004List = stockDayScience0004Service.selectByPage(page04c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList4=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList4=new ArrayList<>();
                    for (StockDay0004 stockDay0004:stockDay0004List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0004,stockDayAll);
                        stockDayAllList4.add(stockDayAll);
                    }
                    for (StockDayScience0004 stockDayScience0004:stockDayScience0004List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0004,stockDayScience);
                        stockDayScienceList4.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399001.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction85(stockDayAllList4,stockDayScienceList4,stockDayAllList399001,stockDayScienceList399001,stockDayVoList);
                    continue;
                case "0005":
                    Page<StockDay0005> page05 = new Page<>(1, 60);
                    Page<StockDayScience0005> page05c=new Page<>(1,60);
                    List<StockDay0005> stockDay0005List = stockDay0005Service.selectByCodeAndExPage(page05,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0005> stockDayScience0005List = stockDayScience0005Service.selectByPage(page05c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList5=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList5=new ArrayList<>();
                    for (StockDay0005 stockDay0005:stockDay0005List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0005,stockDayAll);
                        stockDayAllList5.add(stockDayAll);
                    }
                    for (StockDayScience0005 stockDayScience0005:stockDayScience0005List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0005,stockDayScience);
                        stockDayScienceList5.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399001.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction85(stockDayAllList5,stockDayScienceList5,stockDayAllList399001,stockDayScienceList399001,stockDayVoList);
                    continue;
                case "0006":
                    Page<StockDay0006> page06 = new Page<>(1, 60);
                    Page<StockDayScience0006> page06c=new Page<>(1,60);
                    List<StockDay0006> stockDay0006List = stockDay0006Service.selectByCodeAndExPage(page06,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0006> stockDayScience0006List = stockDayScience0006Service.selectByPage(page06c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList6=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList6=new ArrayList<>();
                    for (StockDay0006 stockDay0006:stockDay0006List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0006,stockDayAll);
                        stockDayAllList6.add(stockDayAll);
                    }
                    for (StockDayScience0006 stockDayScience0006:stockDayScience0006List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0006,stockDayScience);
                        stockDayScienceList6.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399001.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction85(stockDayAllList6,stockDayScienceList6,stockDayAllList399001,stockDayScienceList399001,stockDayVoList);
                    continue;
                case "0007":
                    Page<StockDay0007> page07 = new Page<>(1, 60);
                    Page<StockDayScience0007> page07c=new Page<>(1,60);
                    List<StockDay0007> stockDay0007List = stockDay0007Service.selectByCodeAndExPage(page07,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0007> stockDayScience0007List = stockDayScience0007Service.selectByPage(page07c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList7=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList7=new ArrayList<>();
                    for (StockDay0007 stockDay0007:stockDay0007List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0007,stockDayAll);
                        stockDayAllList7.add(stockDayAll);
                    }
                    for (StockDayScience0007 stockDayScience0007:stockDayScience0007List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0007,stockDayScience);
                        stockDayScienceList7.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399001.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction85(stockDayAllList7,stockDayScienceList7,stockDayAllList399001,stockDayScienceList399001,stockDayVoList);
                    continue;
                case "0008":
                    Page<StockDay0008> page08 = new Page<>(1, 60);
                    Page<StockDayScience0008> page08c=new Page<>(1,60);
                    List<StockDay0008> stockDay0008List = stockDay0008Service.selectByCodeAndExPage(page08,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0008> stockDayScience0008List = stockDayScience0008Service.selectByPage(page08c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList8=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList8=new ArrayList<>();
                    for (StockDay0008 stockDay0008:stockDay0008List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0008,stockDayAll);
                        stockDayAllList8.add(stockDayAll);
                    }
                    for (StockDayScience0008 stockDayScience0008:stockDayScience0008List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0008,stockDayScience);
                        stockDayScienceList8.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399001.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction85(stockDayAllList8,stockDayScienceList8,stockDayAllList399001,stockDayScienceList399001,stockDayVoList);
                    continue;
                case "0009":
                    Page<StockDay0009> page09 = new Page<>(1, 60);
                    Page<StockDayScience0009> page09c=new Page<>(1,60);
                    List<StockDay0009> stockDay0009List = stockDay0009Service.selectByCodeAndExPage(page09,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0009> stockDayScience0009List = stockDayScience0009Service.selectByPage(page09c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList9=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList9=new ArrayList<>();
                    for (StockDay0009 stockDay0009:stockDay0009List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0009,stockDayAll);
                        stockDayAllList9.add(stockDayAll);
                    }
                    for (StockDayScience0009 stockDayScience0009:stockDayScience0009List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0009,stockDayScience);
                        stockDayScienceList9.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399001.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction85(stockDayAllList9,stockDayScienceList9,stockDayAllList399001,stockDayScienceList399001,stockDayVoList);
                    continue;
                case "0020":
                    Page<StockDay0020> page20 = new Page<>(1, 60);
                    Page<StockDayScience0020> page20c=new Page<>(1,60);
                    List<StockDay0020> stockDay0020List = stockDay0020Service.selectByCodeAndExPage(page20,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0020> stockDayScience0020List = stockDayScience0020Service.selectByPage(page20c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList20=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList20=new ArrayList<>();
                    for (StockDay0020 stockDay0020:stockDay0020List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0020,stockDayAll);
                        stockDayAllList20.add(stockDayAll);
                    }
                    for (StockDayScience0020 stockDayScience0020:stockDayScience0020List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0020,stockDayScience);
                        stockDayScienceList20.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399005List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399005.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399005List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399005.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction85(stockDayAllList20,stockDayScienceList20,stockDayAllList399005,stockDayScienceList399005,stockDayVoList);
                    continue;
                case "0021":
                    Page<StockDay0021> page21 = new Page<>(1, 60);
                    Page<StockDayScience0021> page21c=new Page<>(1,60);
                    List<StockDay0021> stockDay0021List = stockDay0021Service.selectByCodeAndExPage(page21,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0021> stockDayScience0021List = stockDayScience0021Service.selectByPage(page21c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList21=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList21=new ArrayList<>();
                    for (StockDay0021 stockDay0021:stockDay0021List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0021,stockDayAll);
                        stockDayAllList21.add(stockDayAll);
                    }
                    for (StockDayScience0021 stockDayScience0021:stockDayScience0021List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0021,stockDayScience);
                        stockDayScienceList21.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399005List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399005.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399005List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399005.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction85(stockDayAllList21,stockDayScienceList21,stockDayAllList399005,stockDayScienceList399005,stockDayVoList);
                    continue;
                case "0022":
                    Page<StockDay0022> page22 = new Page<>(1, 60);
                    Page<StockDayScience0022> page22c=new Page<>(1,60);
                    List<StockDay0022> stockDay0022List = stockDay0022Service.selectByCodeAndExPage(page22,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0022> stockDayScience0022List = stockDayScience0022Service.selectByPage(page22c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList22=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList22=new ArrayList<>();
                    for (StockDay0022 stockDay0022:stockDay0022List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0022,stockDayAll);
                        stockDayAllList22.add(stockDayAll);
                    }
                    for (StockDayScience0022 stockDayScience0022:stockDayScience0022List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0022,stockDayScience);
                        stockDayScienceList22.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399005List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399005.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399005List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399005.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction85(stockDayAllList22,stockDayScienceList22,stockDayAllList399005,stockDayScienceList399005,stockDayVoList);
                    continue;
                case "0023":
                    Page<StockDay0023> page23 = new Page<>(1, 60);
                    Page<StockDayScience0023> page23c=new Page<>(1,60);
                    List<StockDay0023> stockDay0023List = stockDay0023Service.selectByCodeAndExPage(page23,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0023> stockDayScience0023List = stockDayScience0023Service.selectByPage(page23c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList23=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList23=new ArrayList<>();
                    for (StockDay0023 stockDay0023:stockDay0023List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0023,stockDayAll);
                        stockDayAllList23.add(stockDayAll);
                    }
                    for (StockDayScience0023 stockDayScience0023:stockDayScience0023List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0023,stockDayScience);
                        stockDayScienceList23.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399005List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399005.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399005List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399005.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction85(stockDayAllList23,stockDayScienceList23,stockDayAllList399005,stockDayScienceList399005,stockDayVoList);
                    continue;
                case "0024":
                    Page<StockDay0024> page24 = new Page<>(1, 60);
                    Page<StockDayScience0024> page24c=new Page<>(1,60);
                    List<StockDay0024> stockDay0024List = stockDay0024Service.selectByCodeAndExPage(page24,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0024> stockDayScience0024List = stockDayScience0024Service.selectByPage(page24c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList24=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList24=new ArrayList<>();
                    for (StockDay0024 stockDay0024:stockDay0024List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0024,stockDayAll);
                        stockDayAllList24.add(stockDayAll);
                    }
                    for (StockDayScience0024 stockDayScience0024:stockDayScience0024List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0024,stockDayScience);
                        stockDayScienceList24.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399005List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399005.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399005List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399005.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction85(stockDayAllList24,stockDayScienceList24,stockDayAllList399005,stockDayScienceList399005,stockDayVoList);
                    continue;
                case "0025":
                    Page<StockDay0025> page25 = new Page<>(1, 60);
                    Page<StockDayScience0025> page25c=new Page<>(1,60);
                    List<StockDay0025> stockDay0025List = stockDay0025Service.selectByCodeAndExPage(page25,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0025> stockDayScience0025List = stockDayScience0025Service.selectByPage(page25c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList25=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList25=new ArrayList<>();
                    for (StockDay0025 stockDay0025:stockDay0025List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0025,stockDayAll);
                        stockDayAllList25.add(stockDayAll);
                    }
                    for (StockDayScience0025 stockDayScience0025:stockDayScience0025List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0025,stockDayScience);
                        stockDayScienceList25.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399005List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399005.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399005List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399005.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction85(stockDayAllList25,stockDayScienceList25,stockDayAllList399005,stockDayScienceList399005,stockDayVoList);
                    continue;
                case "0026":
                    Page<StockDay0026> page26 = new Page<>(1, 60);
                    Page<StockDayScience0026> page26c=new Page<>(1,60);
                    List<StockDay0026> stockDay0026List = stockDay0026Service.selectByCodeAndExPage(page26,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0026> stockDayScience0026List = stockDayScience0026Service.selectByPage(page26c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList26=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList26=new ArrayList<>();
                    for (StockDay0026 stockDay0026:stockDay0026List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0026,stockDayAll);
                        stockDayAllList26.add(stockDayAll);
                    }
                    for (StockDayScience0026 stockDayScience0026:stockDayScience0026List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0026,stockDayScience);
                        stockDayScienceList26.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399005List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399005.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399005List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399005.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction85(stockDayAllList26,stockDayScienceList26,stockDayAllList399005,stockDayScienceList399005,stockDayVoList);
                    continue;
                case "0027":
                    Page<StockDay0027> page27 = new Page<>(1, 60);
                    Page<StockDayScience0027> page27c=new Page<>(1,60);
                    List<StockDay0027> stockDay0027List = stockDay0027Service.selectByCodeAndExPage(page27,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0027> stockDayScience0027List = stockDayScience0027Service.selectByPage(page27c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList27=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList27=new ArrayList<>();
                    for (StockDay0027 stockDay0027:stockDay0027List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0027,stockDayAll);
                        stockDayAllList27.add(stockDayAll);
                    }
                    for (StockDayScience0027 stockDayScience0027:stockDayScience0027List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0027,stockDayScience);
                        stockDayScienceList27.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399005List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399005.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399005List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399005.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction85(stockDayAllList27,stockDayScienceList27,stockDayAllList399005,stockDayScienceList399005,stockDayVoList);
                    continue;
                case "0028":
                    Page<StockDay0028> page28 = new Page<>(1, 60);
                    Page<StockDayScience0028> page28c=new Page<>(1,60);
                    List<StockDay0028> stockDay0028List = stockDay0028Service.selectByCodeAndExPage(page28,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0028> stockDayScience0028List = stockDayScience0028Service.selectByPage(page28c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList28=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList28=new ArrayList<>();
                    for (StockDay0028 stockDay0028:stockDay0028List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0028,stockDayAll);
                        stockDayAllList28.add(stockDayAll);
                    }
                    for (StockDayScience0028 stockDayScience0028:stockDayScience0028List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0028,stockDayScience);
                        stockDayScienceList28.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399005List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399005.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399005List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399005.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction85(stockDayAllList28,stockDayScienceList28,stockDayAllList399005,stockDayScienceList399005,stockDayVoList);
                    continue;
                case "3000":
                    Page<StockDay3000> page30 = new Page<>(1, 60);
                    Page<StockDayScience3000> page30c=new Page<>(1,60);
                    List<StockDay3000> stockDay3000List = stockDay3000Service.selectByCodeAndExPage(page30,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience3000> stockDayScience3000List = stockDayScience3000Service.selectByPage(page30c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList30=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList30=new ArrayList<>();
                    for (StockDay3000 stockDay3000:stockDay3000List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay3000,stockDayAll);
                        stockDayAllList30.add(stockDayAll);
                    }
                    for (StockDayScience3000 stockDayScience3000:stockDayScience3000List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience3000,stockDayScience);
                        stockDayScienceList30.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399006List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399006.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399006List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399006.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction85(stockDayAllList30,stockDayScienceList30,stockDayAllList399006,stockDayScienceList399006,stockDayVoList);
                    continue;
                case "3001":
                    Page<StockDay3001> page31 = new Page<>(1, 60);
                    Page<StockDayScience3001> page31c=new Page<>(1,60);
                    List<StockDay3001> stockDay3001List = stockDay3001Service.selectByCodeAndExPage(page31,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience3001> stockDayScience3001List = stockDayScience3001Service.selectByPage(page31c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList31=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList31=new ArrayList<>();
                    for (StockDay3001 stockDay3001:stockDay3001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay3001,stockDayAll);
                        stockDayAllList31.add(stockDayAll);
                    }
                    for (StockDayScience3001 stockDayScience3001:stockDayScience3001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience3001,stockDayScience);
                        stockDayScienceList31.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399006List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399006.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399006List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399006.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction85(stockDayAllList31,stockDayScienceList31,stockDayAllList399006,stockDayScienceList399006,stockDayVoList);
                    continue;
                case "3002":
                    Page<StockDay3002> page32 = new Page<>(1, 60);
                    Page<StockDayScience3002> page32c=new Page<>(1,60);
                    List<StockDay3002> stockDay3002List = stockDay3002Service.selectByCodeAndExPage(page32,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience3002> stockDayScience3002List = stockDayScience3002Service.selectByPage(page32c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList32=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList32=new ArrayList<>();
                    for (StockDay3002 stockDay3002:stockDay3002List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay3002,stockDayAll);
                        stockDayAllList32.add(stockDayAll);
                    }
                    for (StockDayScience3002 stockDayScience3002:stockDayScience3002List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience3002,stockDayScience);
                        stockDayScienceList32.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399006List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399006.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399006List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399006.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction85(stockDayAllList32,stockDayScienceList32,stockDayAllList399006,stockDayScienceList399006,stockDayVoList);
                    continue;
                case "3003":
                    Page<StockDay3003> page33 = new Page<>(1, 60);
                    Page<StockDayScience3003> page33c=new Page<>(1,60);
                    List<StockDay3003> stockDay3003List = stockDay3003Service.selectByCodeAndExPage(page33,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience3003> stockDayScience3003List = stockDayScience3003Service.selectByPage(page33c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList33=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList33=new ArrayList<>();
                    for (StockDay3003 stockDay3003:stockDay3003List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay3003,stockDayAll);
                        stockDayAllList33.add(stockDayAll);
                    }
                    for (StockDayScience3003 stockDayScience3003:stockDayScience3003List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience3003,stockDayScience);
                        stockDayScienceList33.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399006List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399006.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399006List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399006.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction85(stockDayAllList33,stockDayScienceList33,stockDayAllList399006,stockDayScienceList399006,stockDayVoList);
                    continue;
                case "3004":
                    Page<StockDay3004> page34 = new Page<>(1, 60);
                    Page<StockDayScience3004> page34c=new Page<>(1,60);
                    List<StockDay3004> stockDay3004List = stockDay3004Service.selectByCodeAndExPage(page34,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience3004> stockDayScience3004List = stockDayScience3004Service.selectByPage(page34c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList34=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList34=new ArrayList<>();
                    for (StockDay3004 stockDay3004:stockDay3004List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay3004,stockDayAll);
                        stockDayAllList34.add(stockDayAll);
                    }
                    for (StockDayScience3004 stockDayScience3004:stockDayScience3004List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience3004,stockDayScience);
                        stockDayScienceList34.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399006List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399006.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399006List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399006.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction85(stockDayAllList34,stockDayScienceList34,stockDayAllList399006,stockDayScienceList399006,stockDayVoList);
                    continue;
                case "3005":
                    Page<StockDay3005> page35 = new Page<>(1, 60);
                    Page<StockDayScience3005> page35c=new Page<>(1,60);
                    List<StockDay3005> stockDay3005List = stockDay3005Service.selectByCodeAndExPage(page35,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience3005> stockDayScience3005List = stockDayScience3005Service.selectByPage(page35c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList35=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList35=new ArrayList<>();
                    for (StockDay3005 stockDay3005:stockDay3005List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay3005,stockDayAll);
                        stockDayAllList35.add(stockDayAll);
                    }
                    for (StockDayScience3005 stockDayScience3005:stockDayScience3005List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience3005,stockDayScience);
                        stockDayScienceList35.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399006List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399006.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399006List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399006.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction85(stockDayAllList35,stockDayScienceList35,stockDayAllList399006,stockDayScienceList399006,stockDayVoList);
                    continue;
                case "6000":
                    Page<StockDay6000> page60 = new Page<>(1, 60);
                    Page<StockDayScience6000> page60c=new Page<>(1,60);
                    List<StockDay6000> stockDay6000List = stockDay6000Service.selectByCodeAndExPage(page60,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6000> stockDayScience6000List = stockDayScience6000Service.selectByPage(page60c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList60=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList60=new ArrayList<>();
                    for (StockDay6000 stockDay6000:stockDay6000List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay6000,stockDayAll);
                        stockDayAllList60.add(stockDayAll);
                    }
                    for (StockDayScience6000 stockDayScience6000:stockDayScience6000List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience6000,stockDayScience);
                        stockDayScienceList60.add(stockDayScience);
                    }
                    for (StockDay0000 stockDay0000:stockDay000001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0000,stockDayAll);
                        stockDayAllList0001.add(stockDayAll);
                    }
                    for (StockDayScience0000 stockDayScience0000:stockDayScience000001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                        stockDayScienceList0001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction85(stockDayAllList60,stockDayScienceList60,stockDayAllList0001,stockDayScienceList0001,stockDayVoList);
                    continue;
                case "6001":
                    Page<StockDay6001> page61 = new Page<>(1, 60);
                    Page<StockDayScience6001> page61c=new Page<>(1,60);
                    List<StockDay6001> stockDay6001List = stockDay6001Service.selectByCodeAndExPage(page61,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6001> stockDayScience6001List = stockDayScience6001Service.selectByPage(page61c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList61=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList61=new ArrayList<>();
                    for (StockDay6001 stockDay6001:stockDay6001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay6001,stockDayAll);
                        stockDayAllList61.add(stockDayAll);
                    }
                    for (StockDayScience6001 stockDayScience6001:stockDayScience6001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience6001,stockDayScience);
                        stockDayScienceList61.add(stockDayScience);
                    }
                    for (StockDay0000 stockDay0000:stockDay000001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0000,stockDayAll);
                        stockDayAllList0001.add(stockDayAll);
                    }
                    for (StockDayScience0000 stockDayScience0000:stockDayScience000001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                        stockDayScienceList0001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction85(stockDayAllList61,stockDayScienceList61,stockDayAllList0001,stockDayScienceList0001,stockDayVoList);
                    continue;
                case "6002":
                    Page<StockDay6002> page62 = new Page<>(1, 60);
                    Page<StockDayScience6002> page62c=new Page<>(1,60);
                    List<StockDay6002> stockDay6002List = stockDay6002Service.selectByCodeAndExPage(page62,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6002> stockDayScience6002List = stockDayScience6002Service.selectByPage(page62c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList62=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList62=new ArrayList<>();
                    for (StockDay6002 stockDay6002:stockDay6002List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay6002,stockDayAll);
                        stockDayAllList62.add(stockDayAll);
                    }
                    for (StockDayScience6002 stockDayScience6002:stockDayScience6002List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience6002,stockDayScience);
                        stockDayScienceList62.add(stockDayScience);
                    }
                    for (StockDay0000 stockDay0000:stockDay000001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0000,stockDayAll);
                        stockDayAllList0001.add(stockDayAll);
                    }
                    for (StockDayScience0000 stockDayScience0000:stockDayScience000001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                        stockDayScienceList0001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction85(stockDayAllList62,stockDayScienceList62,stockDayAllList0001,stockDayScienceList0001,stockDayVoList);
                    continue;
                case "6003":
                    Page<StockDay6003> page63 = new Page<>(1, 60);
                    Page<StockDayScience6003> page63c=new Page<>(1,60);
                    List<StockDay6003> stockDay6003List = stockDay6003Service.selectByCodeAndExPage(page63,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6003> stockDayScience6003List = stockDayScience6003Service.selectByPage(page63c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList63=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList63=new ArrayList<>();
                    for (StockDay6003 stockDay6003:stockDay6003List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay6003,stockDayAll);
                        stockDayAllList63.add(stockDayAll);
                    }
                    for (StockDayScience6003 stockDayScience6003:stockDayScience6003List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience6003,stockDayScience);
                        stockDayScienceList63.add(stockDayScience);
                    }
                    for (StockDay0000 stockDay0000:stockDay000001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0000,stockDayAll);
                        stockDayAllList0001.add(stockDayAll);
                    }
                    for (StockDayScience0000 stockDayScience0000:stockDayScience000001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                        stockDayScienceList0001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction85(stockDayAllList63,stockDayScienceList63,stockDayAllList0001,stockDayScienceList0001,stockDayVoList);
                    continue;
                case "6004":
                    Page<StockDay6004> page64 = new Page<>(1, 60);
                    Page<StockDayScience6004> page64c=new Page<>(1,60);
                    List<StockDay6004> stockDay6004List = stockDay6004Service.selectByCodeAndExPage(page64,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6004> stockDayScience6004List = stockDayScience6004Service.selectByPage(page64c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList64=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList64=new ArrayList<>();
                    for (StockDay6004 stockDay6004:stockDay6004List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay6004,stockDayAll);
                        stockDayAllList64.add(stockDayAll);
                    }
                    for (StockDayScience6004 stockDayScience6004:stockDayScience6004List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience6004,stockDayScience);
                        stockDayScienceList64.add(stockDayScience);
                    }
                    for (StockDay0000 stockDay0000:stockDay000001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0000,stockDayAll);
                        stockDayAllList0001.add(stockDayAll);
                    }
                    for (StockDayScience0000 stockDayScience0000:stockDayScience000001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                        stockDayScienceList0001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction85(stockDayAllList64,stockDayScienceList64,stockDayAllList0001,stockDayScienceList0001,stockDayVoList);
                    continue;
                case "6005":
                    Page<StockDay6005> page65 = new Page<>(1, 60);
                    Page<StockDayScience6005> page65c=new Page<>(1,60);
                    List<StockDay6005> stockDay6005List = stockDay6005Service.selectByCodeAndExPage(page65,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6005> stockDayScience6005List = stockDayScience6005Service.selectByPage(page65c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList65=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList65=new ArrayList<>();
                    for (StockDay6005 stockDay6005:stockDay6005List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay6005,stockDayAll);
                        stockDayAllList65.add(stockDayAll);
                    }
                    for (StockDayScience6005 stockDayScience6005:stockDayScience6005List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience6005,stockDayScience);
                        stockDayScienceList65.add(stockDayScience);
                    }
                    for (StockDay0000 stockDay0000:stockDay000001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0000,stockDayAll);
                        stockDayAllList0001.add(stockDayAll);
                    }
                    for (StockDayScience0000 stockDayScience0000:stockDayScience000001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                        stockDayScienceList0001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction85(stockDayAllList65,stockDayScienceList65,stockDayAllList0001,stockDayScienceList0001,stockDayVoList);
                    continue;
                case "6006":
                    Page<StockDay6006> page66 = new Page<>(1, 60);
                    Page<StockDayScience6006> page66c=new Page<>(1,60);
                    List<StockDay6006> stockDay6006List = stockDay6006Service.selectByCodeAndExPage(page66,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6006> stockDayScience6006List = stockDayScience6006Service.selectByPage(page66c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList66=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList66=new ArrayList<>();
                    for (StockDay6006 stockDay6006:stockDay6006List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay6006,stockDayAll);
                        stockDayAllList66.add(stockDayAll);
                    }
                    for (StockDayScience6006 stockDayScience6006:stockDayScience6006List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience6006,stockDayScience);
                        stockDayScienceList66.add(stockDayScience);
                    }
                    for (StockDay0000 stockDay0000:stockDay000001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0000,stockDayAll);
                        stockDayAllList0001.add(stockDayAll);
                    }
                    for (StockDayScience0000 stockDayScience0000:stockDayScience000001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                        stockDayScienceList0001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction85(stockDayAllList66,stockDayScienceList66,stockDayAllList0001,stockDayScienceList0001,stockDayVoList);
                    continue;
                case "6007":
                    Page<StockDay6007> page67 = new Page<>(1, 60);
                    Page<StockDayScience6007> page67c=new Page<>(1,60);
                    List<StockDay6007> stockDay6007List = stockDay6007Service.selectByCodeAndExPage(page67,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6007> stockDayScience6007List = stockDayScience6007Service.selectByPage(page67c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList67=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList67=new ArrayList<>();
                    for (StockDay6007 stockDay6007:stockDay6007List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay6007,stockDayAll);
                        stockDayAllList67.add(stockDayAll);
                    }
                    for (StockDayScience6007 stockDayScience6007:stockDayScience6007List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience6007,stockDayScience);
                        stockDayScienceList67.add(stockDayScience);
                    }
                    for (StockDay0000 stockDay0000:stockDay000001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0000,stockDayAll);
                        stockDayAllList0001.add(stockDayAll);
                    }
                    for (StockDayScience0000 stockDayScience0000:stockDayScience000001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                        stockDayScienceList0001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction85(stockDayAllList67,stockDayScienceList67,stockDayAllList0001,stockDayScienceList0001,stockDayVoList);
                    continue;
                case "6008":
                    Page<StockDay6008> page68 = new Page<>(1, 60);
                    Page<StockDayScience6008> page68c=new Page<>(1,60);
                    List<StockDay6008> stockDay6008List = stockDay6008Service.selectByCodeAndExPage(page68,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6008> stockDayScience6008List = stockDayScience6008Service.selectByPage(page68c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList68=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList68=new ArrayList<>();
                    for (StockDay6008 stockDay6008:stockDay6008List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay6008,stockDayAll);
                        stockDayAllList68.add(stockDayAll);
                    }
                    for (StockDayScience6008 stockDayScience6008:stockDayScience6008List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience6008,stockDayScience);
                        stockDayScienceList68.add(stockDayScience);
                    }
                    for (StockDay0000 stockDay0000:stockDay000001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0000,stockDayAll);
                        stockDayAllList0001.add(stockDayAll);
                    }
                    for (StockDayScience0000 stockDayScience0000:stockDayScience000001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                        stockDayScienceList0001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction85(stockDayAllList68,stockDayScienceList68,stockDayAllList0001,stockDayScienceList0001,stockDayVoList);
                    continue;
                case "6009":
                    Page<StockDay6009> page69 = new Page<>(1, 60);
                    Page<StockDayScience6009> page69c=new Page<>(1,60);
                    List<StockDay6009> stockDay6009List = stockDay6009Service.selectByCodeAndExPage(page69,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6009> stockDayScience6009List = stockDayScience6009Service.selectByPage(page69c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList69=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList69=new ArrayList<>();
                    for (StockDay6009 stockDay6009:stockDay6009List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay6009,stockDayAll);
                        stockDayAllList69.add(stockDayAll);
                    }
                    for (StockDayScience6009 stockDayScience6009:stockDayScience6009List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience6009,stockDayScience);
                        stockDayScienceList69.add(stockDayScience);
                    }
                    for (StockDay0000 stockDay0000:stockDay000001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0000,stockDayAll);
                        stockDayAllList0001.add(stockDayAll);
                    }
                    for (StockDayScience0000 stockDayScience0000:stockDayScience000001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                        stockDayScienceList0001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction85(stockDayAllList69,stockDayScienceList69,stockDayAllList0001,stockDayScienceList0001,stockDayVoList);
                    continue;
                case "6010":
                    Page<StockDay6010> page610 = new Page<>(1, 60);
                    Page<StockDayScience6010> page610c=new Page<>(1,60);
                    List<StockDay6010> stockDay6010List = stockDay6010Service.selectByCodeAndExPage(page610,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6010> stockDayScience6010List = stockDayScience6010Service.selectByPage(page610c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList610=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList610=new ArrayList<>();
                    for (StockDay6010 stockDay6010:stockDay6010List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay6010,stockDayAll);
                        stockDayAllList610.add(stockDayAll);
                    }
                    for (StockDayScience6010 stockDayScience6010:stockDayScience6010List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience6010,stockDayScience);
                        stockDayScienceList610.add(stockDayScience);
                    }
                    for (StockDay0000 stockDay0000:stockDay000001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0000,stockDayAll);
                        stockDayAllList0001.add(stockDayAll);
                    }
                    for (StockDayScience0000 stockDayScience0000:stockDayScience000001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                        stockDayScienceList0001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction85(stockDayAllList610,stockDayScienceList610,stockDayAllList0001,stockDayScienceList0001,stockDayVoList);
                    continue;
                case "6011":
                    Page<StockDay6011> page611 = new Page<>(1, 60);
                    Page<StockDayScience6011> page611c=new Page<>(1,60);
                    List<StockDay6011> stockDay6011List = stockDay6011Service.selectByCodeAndExPage(page611,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6011> stockDayScience6011List = stockDayScience6011Service.selectByPage(page611c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList611=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList611=new ArrayList<>();
                    for (StockDay6011 stockDay6011:stockDay6011List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay6011,stockDayAll);
                        stockDayAllList611.add(stockDayAll);
                    }
                    for (StockDayScience6011 stockDayScience6011:stockDayScience6011List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience6011,stockDayScience);
                        stockDayScienceList611.add(stockDayScience);
                    }
                    for (StockDay0000 stockDay0000:stockDay000001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0000,stockDayAll);
                        stockDayAllList0001.add(stockDayAll);
                    }
                    for (StockDayScience0000 stockDayScience0000:stockDayScience000001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                        stockDayScienceList0001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction85(stockDayAllList611,stockDayScienceList611,stockDayAllList0001,stockDayScienceList0001,stockDayVoList);
                    continue;
                case "6012":
                    Page<StockDay6012> page612 = new Page<>(1, 60);
                    Page<StockDayScience6012> page612c=new Page<>(1,60);
                    List<StockDay6012> stockDay6012List = stockDay6012Service.selectByCodeAndExPage(page612,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6012> stockDayScience6012List = stockDayScience6012Service.selectByPage(page612c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList612=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList612=new ArrayList<>();
                    for (StockDay6012 stockDay6012:stockDay6012List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay6012,stockDayAll);
                        stockDayAllList612.add(stockDayAll);
                    }
                    for (StockDayScience6012 stockDayScience6012:stockDayScience6012List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience6012,stockDayScience);
                        stockDayScienceList612.add(stockDayScience);
                    }
                    for (StockDay0000 stockDay0000:stockDay000001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0000,stockDayAll);
                        stockDayAllList0001.add(stockDayAll);
                    }
                    for (StockDayScience0000 stockDayScience0000:stockDayScience000001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                        stockDayScienceList0001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction85(stockDayAllList612,stockDayScienceList612,stockDayAllList0001,stockDayScienceList0001,stockDayVoList);
                    continue;
                case "6013":
                    Page<StockDay6013> page613 = new Page<>(1, 60);
                    Page<StockDayScience6013> page613c=new Page<>(1,60);
                    List<StockDay6013> stockDay6013List = stockDay6013Service.selectByCodeAndExPage(page613,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6013> stockDayScience6013List = stockDayScience6013Service.selectByPage(page613c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList613=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList613=new ArrayList<>();
                    for (StockDay6013 stockDay6013:stockDay6013List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay6013,stockDayAll);
                        stockDayAllList613.add(stockDayAll);
                    }
                    for (StockDayScience6013 stockDayScience6013:stockDayScience6013List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience6013,stockDayScience);
                        stockDayScienceList613.add(stockDayScience);
                    }
                    for (StockDay0000 stockDay0000:stockDay000001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0000,stockDayAll);
                        stockDayAllList0001.add(stockDayAll);
                    }
                    for (StockDayScience0000 stockDayScience0000:stockDayScience000001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                        stockDayScienceList0001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction85(stockDayAllList613,stockDayScienceList613,stockDayAllList0001,stockDayScienceList0001,stockDayVoList);
                    continue;
                case "6014":
                    Page<StockDay6014> page614 = new Page<>(1, 60);
                    Page<StockDayScience6014> page614c=new Page<>(1,60);
                    List<StockDay6014> stockDay6014List = stockDay6014Service.selectByCodeAndExPage(page614,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6014> stockDayScience6014List = stockDayScience6014Service.selectByPage(page614c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList614=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList614=new ArrayList<>();
                    for (StockDay6014 stockDay6014:stockDay6014List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay6014,stockDayAll);
                        stockDayAllList614.add(stockDayAll);
                    }
                    for (StockDayScience6014 stockDayScience6014:stockDayScience6014List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience6014,stockDayScience);
                        stockDayScienceList614.add(stockDayScience);
                    }
                    for (StockDay0000 stockDay0000:stockDay000001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0000,stockDayAll);
                        stockDayAllList0001.add(stockDayAll);
                    }
                    for (StockDayScience0000 stockDayScience0000:stockDayScience000001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                        stockDayScienceList0001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction85(stockDayAllList614,stockDayScienceList614,stockDayAllList0001,stockDayScienceList0001,stockDayVoList);
                    continue;
                case "6015":
                    Page<StockDay6015> page615 = new Page<>(1, 60);
                    Page<StockDayScience6015> page615c=new Page<>(1,60);
                    List<StockDay6015> stockDay6015List = stockDay6015Service.selectByCodeAndExPage(page615,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6015> stockDayScience6015List = stockDayScience6015Service.selectByPage(page615c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList615=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList615=new ArrayList<>();
                    for (StockDay6015 stockDay6015:stockDay6015List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay6015,stockDayAll);
                        stockDayAllList615.add(stockDayAll);
                    }
                    for (StockDayScience6015 stockDayScience6015:stockDayScience6015List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience6015,stockDayScience);
                        stockDayScienceList615.add(stockDayScience);
                    }
                    for (StockDay0000 stockDay0000:stockDay000001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0000,stockDayAll);
                        stockDayAllList0001.add(stockDayAll);
                    }
                    for (StockDayScience0000 stockDayScience0000:stockDayScience000001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                        stockDayScienceList0001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction85(stockDayAllList615,stockDayScienceList615,stockDayAllList0001,stockDayScienceList0001,stockDayVoList);
                    continue;
                case "6016":
                    Page<StockDay6016> page616 = new Page<>(1, 60);
                    Page<StockDayScience6016> page616c=new Page<>(1,60);
                    List<StockDay6016> stockDay6016List = stockDay6016Service.selectByCodeAndExPage(page616,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6016> stockDayScience6016List = stockDayScience6016Service.selectByPage(page616c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList616=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList616=new ArrayList<>();
                    for (StockDay6016 stockDay6016:stockDay6016List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay6016,stockDayAll);
                        stockDayAllList616.add(stockDayAll);
                    }
                    for (StockDayScience6016 stockDayScience6016:stockDayScience6016List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience6016,stockDayScience);
                        stockDayScienceList616.add(stockDayScience);
                    }
                    for (StockDay0000 stockDay0000:stockDay000001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0000,stockDayAll);
                        stockDayAllList0001.add(stockDayAll);
                    }
                    for (StockDayScience0000 stockDayScience0000:stockDayScience000001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                        stockDayScienceList0001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction85(stockDayAllList616,stockDayScienceList616,stockDayAllList0001,stockDayScienceList0001,stockDayVoList);
                    continue;
                case "6017":
                    Page<StockDay6017> page617 = new Page<>(1, 60);
                    Page<StockDayScience6017> page617c=new Page<>(1,60);
                    List<StockDay6017> stockDay6017List = stockDay6017Service.selectByCodeAndExPage(page617,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6017> stockDayScience6017List = stockDayScience6017Service.selectByPage(page617c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList617=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList617=new ArrayList<>();
                    for (StockDay6017 stockDay6017:stockDay6017List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay6017,stockDayAll);
                        stockDayAllList617.add(stockDayAll);
                    }
                    for (StockDayScience6017 stockDayScience6017:stockDayScience6017List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience6017,stockDayScience);
                        stockDayScienceList617.add(stockDayScience);
                    }
                    for (StockDay0000 stockDay0000:stockDay000001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0000,stockDayAll);
                        stockDayAllList0001.add(stockDayAll);
                    }
                    for (StockDayScience0000 stockDayScience0000:stockDayScience000001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                        stockDayScienceList0001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction85(stockDayAllList617,stockDayScienceList617,stockDayAllList0001,stockDayScienceList0001,stockDayVoList);
                    continue;
                case "6018":
                    Page<StockDay6018> page618 = new Page<>(1, 60);
                    Page<StockDayScience6018> page618c=new Page<>(1,60);
                    List<StockDay6018> stockDay6018List = stockDay6018Service.selectByCodeAndExPage(page618,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6018> stockDayScience6018List = stockDayScience6018Service.selectByPage(page618c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList618=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList618=new ArrayList<>();
                    for (StockDay6018 stockDay6018:stockDay6018List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay6018,stockDayAll);
                        stockDayAllList618.add(stockDayAll);
                    }
                    for (StockDayScience6018 stockDayScience6018:stockDayScience6018List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience6018,stockDayScience);
                        stockDayScienceList618.add(stockDayScience);
                    }
                    for (StockDay0000 stockDay0000:stockDay000001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0000,stockDayAll);
                        stockDayAllList0001.add(stockDayAll);
                    }
                    for (StockDayScience0000 stockDayScience0000:stockDayScience000001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                        stockDayScienceList0001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction85(stockDayAllList618,stockDayScienceList618,stockDayAllList0001,stockDayScienceList0001,stockDayVoList);
                    continue;
                case "6019":
                    Page<StockDay6019> page619 = new Page<>(1, 60);
                    Page<StockDayScience6019> page619c=new Page<>(1,60);
                    List<StockDay6019> stockDay6019List = stockDay6019Service.selectByCodeAndExPage(page619,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6019> stockDayScience6019List = stockDayScience6019Service.selectByPage(page619c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList619=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList619=new ArrayList<>();
                    for (StockDay6019 stockDay6019:stockDay6019List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay6019,stockDayAll);
                        stockDayAllList619.add(stockDayAll);
                    }
                    for (StockDayScience6019 stockDayScience6019:stockDayScience6019List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience6019,stockDayScience);
                        stockDayScienceList619.add(stockDayScience);
                    }
                    for (StockDay0000 stockDay0000:stockDay000001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0000,stockDayAll);
                        stockDayAllList0001.add(stockDayAll);
                    }
                    for (StockDayScience0000 stockDayScience0000:stockDayScience000001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                        stockDayScienceList0001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction85(stockDayAllList619,stockDayScienceList619,stockDayAllList0001,stockDayScienceList0001,stockDayVoList);
                    continue;
                default:
                    switch (stockCode.getId().substring(0, 3)) {
                        case "001":
                            Page<StockDay001> page001 = new Page<>(1, 60);
                            Page<StockDayScience001> page001c=new Page<>(1,60);
                            List<StockDay001> stockDay001List = stockDay001Service.selectByCodeAndExPage(page001,stockCode.getId(), stockCode.getEx());//日线
                            List<StockDayScience001> stockDayScience001List = stockDayScience001Service.selectByPage(page001c,stockCode.getId(), stockCode.getEx());//技术先
                            List<StockDayAll> stockDayAllList001=new ArrayList<>();
                            List<StockDayScience> stockDayScienceList001=new ArrayList<>();
                            for (StockDay001 stockDay001:stockDay001List){
                                StockDayAll stockDayAll=new StockDayAll();
                                BeanUtils.copyProperties(stockDay001,stockDayAll);
                                stockDayAllList001.add(stockDayAll);
                            }
                            for (StockDayScience001 stockDayScience001:stockDayScience001List){
                                StockDayScience stockDayScience=new StockDayScience();
                                BeanUtils.copyProperties(stockDayScience001,stockDayScience);
                                stockDayScienceList001.add(stockDayScience);
                            }
                            for (StockDay399 stockDay399:stockDay399001List){
                                StockDayAll stockDayAll=new StockDayAll();
                                BeanUtils.copyProperties(stockDay399,stockDayAll);
                                stockDayAllList399001.add(stockDayAll);
                            }
                            for (StockDayScience399 stockDayScience399:stockDayScience399001List){
                                StockDayScience stockDayScience=new StockDayScience();
                                BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                                stockDayScienceList399001.add(stockDayScience);
                            }
                            yanPanDayService.dayYanPanFunction85(stockDayAllList001,stockDayScienceList001,stockDayAllList399001,stockDayScienceList399001,stockDayVoList);
                            continue;
                        case "603":
                            Page<StockDay603> page603 = new Page<>(1, 60);
                            Page<StockDayScience603> page603c=new Page<>(1,60);
                            List<StockDay603> stockDay603List = stockDay603Service.selectByCodeAndExPage(page603,stockCode.getId(), stockCode.getEx());//日线
                            List<StockDayScience603> stockDayScience603List = stockDayScience603Service.selectByPage(page603c,stockCode.getId(), stockCode.getEx());//技术先
                            List<StockDayAll> stockDayAllList603=new ArrayList<>();
                            List<StockDayScience> stockDayScienceList603=new ArrayList<>();
                            for (StockDay603 stockDay603:stockDay603List){
                                StockDayAll stockDayAll=new StockDayAll();
                                BeanUtils.copyProperties(stockDay603,stockDayAll);
                                stockDayAllList603.add(stockDayAll);
                            }
                            for (StockDayScience603 stockDayScience603:stockDayScience603List){
                                StockDayScience stockDayScience=new StockDayScience();
                                BeanUtils.copyProperties(stockDayScience603,stockDayScience);
                                stockDayScienceList603.add(stockDayScience);
                            }
                            for (StockDay0000 stockDay0000:stockDay000001List){
                                StockDayAll stockDayAll=new StockDayAll();
                                BeanUtils.copyProperties(stockDay0000,stockDayAll);
                                stockDayAllList0001.add(stockDayAll);
                            }
                            for (StockDayScience0000 stockDayScience0000:stockDayScience000001List){
                                StockDayScience stockDayScience=new StockDayScience();
                                BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                                stockDayScienceList0001.add(stockDayScience);
                            }
                            yanPanDayService.dayYanPanFunction85(stockDayAllList603,stockDayScienceList603,stockDayAllList0001,stockDayScienceList0001,stockDayVoList);
                            continue;
                        default:
                            continue;
                    }
            }
        }
        return stockDayVoList;
    }

    @Override
    public List<StockDayVo> dayYanPanFunction90() throws IOException {
        //获取所以编码
        List<StockCode> stockCodeList = stockCodeService.getStockCodeList();
        if (stockCodeList == null || stockCodeList.isEmpty()) {
            return null;
        }
        List<StockDayVo> stockDayVoList=new ArrayList<>();
        Page<StockDay0000> page = new Page<>(1, 60);
        //获取上证
        List<StockDay0000> stockDay000001List = stockDay0000Service.selectByCodeAndExPage(page,"000001", "SH");
        Page<StockDay399> page2 = new Page<>(1, 60);
        //获取sz
        List<StockDay399> stockDay399001List = stockDay399Service.selectByCodeAndExPage(page2,"399001", "SZ");
        Page<StockDay399> page3 = new Page<>(1, 60);
        //获取中小
        List<StockDay399> stockDay399005List = stockDay399Service.selectByCodeAndExPage(page3,"399005", "SZ");
        Page<StockDay399> page4 = new Page<>(1, 60);
        //获取创业
        List<StockDay399> stockDay399006List = stockDay399Service.selectByCodeAndExPage(page4,"399006", "SZ");

        Page<StockDayScience0000> page5=new Page<>(1,60);
        List<StockDayScience0000> stockDayScience000001List = stockDayScience0000Service.selectByPage(page5,"000001", "SH");
        Page<StockDayScience399> page6=new Page<>(1,60);
        List<StockDayScience399> stockDayScience399001List = stockDayScience399Service.selectByPage(page6,"399001", "SZ");
        Page<StockDayScience399> page7=new Page<>(1,60);
        List<StockDayScience399> stockDayScience399005List = stockDayScience399Service.selectByPage(page7,"399001", "SZ");
        Page<StockDayScience399> page8=new Page<>(1,60);
        List<StockDayScience399> stockDayScience399006List = stockDayScience399Service.selectByPage(page8,"399001", "SZ");
        //遍历
        for (StockCode stockCode : stockCodeList) {
            List<StockDayAll> stockDayAllList0001=new ArrayList<>();
            List<StockDayAll> stockDayAllList399001=new ArrayList<>();
            List<StockDayAll> stockDayAllList399005=new ArrayList<>();
            List<StockDayAll> stockDayAllList399006=new ArrayList<>();
            List<StockDayScience> stockDayScienceList0001=new ArrayList<>();
            List<StockDayScience> stockDayScienceList399001=new ArrayList<>();
            List<StockDayScience> stockDayScienceList399005=new ArrayList<>();
            List<StockDayScience> stockDayScienceList399006=new ArrayList<>();
            switch (stockCode.getId().substring(0, 4)) {
                case "0000":
                    if (stockCode.getId().equals("000001") && stockCode.getEx().equals("SH")) {
                        continue;
                    } else {
                        Page<StockDay0000> page9 = new Page<>(1, 60);
                        Page<StockDayScience0000> page1=new Page<>(1,60);
                        List<StockDay0000> stockDay0000List = stockDay0000Service.selectByCodeAndExPage(page9,stockCode.getId(), stockCode.getEx());//日线
                        List<StockDayScience0000> stockDayScience0000List = stockDayScience0000Service.selectByPage(page1,stockCode.getId(), stockCode.getEx());//技术先
                        List<StockDayAll> stockDayAllList=new ArrayList<>();
                        List<StockDayScience> stockDayScienceList=new ArrayList<>();
                        for (StockDay0000 stockDay0000:stockDay0000List){
                            StockDayAll stockDayAll=new StockDayAll();
                            BeanUtils.copyProperties(stockDay0000,stockDayAll);
                            stockDayAllList.add(stockDayAll);
                        }
                        for (StockDayScience0000 stockDayScience0000:stockDayScience0000List){
                            StockDayScience stockDayScience=new StockDayScience();
                            BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                            stockDayScienceList.add(stockDayScience);
                        }
                        for (StockDay399 stockDay399:stockDay399001List){
                            StockDayAll stockDayAll=new StockDayAll();
                            BeanUtils.copyProperties(stockDay399,stockDayAll);
                            stockDayAllList399001.add(stockDayAll);
                        }
                        for (StockDayScience399 stockDayScience399:stockDayScience399001List){
                            StockDayScience stockDayScience=new StockDayScience();
                            BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                            stockDayScienceList399001.add(stockDayScience);
                        }
                        yanPanDayService.dayYanPanFunction90(stockDayAllList,stockDayScienceList,stockDayAllList399001,stockDayScienceList399001,stockDayVoList);
                    }
                    continue;
                case "0001":
                    Page<StockDay0001> page9 = new Page<>(1, 60);
                    Page<StockDayScience0001> page1=new Page<>(1,60);
                    List<StockDay0001> stockDay0001List = stockDay0001Service.selectByCodeAndExPage(page9,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0001> stockDayScience0001List = stockDayScience0001Service.selectByPage(page1,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList=new ArrayList<>();
                    for (StockDay0001 stockDay0001:stockDay0001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0001,stockDayAll);
                        stockDayAllList.add(stockDayAll);
                    }
                    for (StockDayScience0001 stockDayScience0001:stockDayScience0001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0001,stockDayScience);
                        stockDayScienceList.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399001.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction90(stockDayAllList,stockDayScienceList,stockDayAllList399001,stockDayScienceList399001,stockDayVoList);
                    continue;
                case "0002":
                    Page<StockDay0002> page02 = new Page<>(1, 60);
                    Page<StockDayScience0002> page02c=new Page<>(1,60);
                    List<StockDay0002> stockDay0002List = stockDay0002Service.selectByCodeAndExPage(page02,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0002> stockDayScience0002List = stockDayScience0002Service.selectByPage(page02c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList1=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList1=new ArrayList<>();
                    for (StockDay0002 stockDay0002:stockDay0002List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0002,stockDayAll);
                        stockDayAllList1.add(stockDayAll);
                    }
                    for (StockDayScience0002 stockDayScience0002:stockDayScience0002List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0002,stockDayScience);
                        stockDayScienceList1.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399001.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction90(stockDayAllList1,stockDayScienceList1,stockDayAllList399001,stockDayScienceList399001,stockDayVoList);
                    continue;
                case "0003":
                    Page<StockDay0003> page03 = new Page<>(1, 60);
                    Page<StockDayScience0003> page03c=new Page<>(1,60);
                    List<StockDay0003> stockDay0003List = stockDay0003Service.selectByCodeAndExPage(page03,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0003> stockDayScience0003List = stockDayScience0003Service.selectByPage(page03c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList3=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList3=new ArrayList<>();
                    for (StockDay0003 stockDay0003:stockDay0003List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0003,stockDayAll);
                        stockDayAllList3.add(stockDayAll);
                    }
                    for (StockDayScience0003 stockDayScience0003:stockDayScience0003List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0003,stockDayScience);
                        stockDayScienceList3.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399001.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction90(stockDayAllList3,stockDayScienceList3,stockDayAllList399001,stockDayScienceList399001,stockDayVoList);
                    continue;
                case "0004":
                    Page<StockDay0004> page04 = new Page<>(1, 60);
                    Page<StockDayScience0004> page04c=new Page<>(1,60);
                    List<StockDay0004> stockDay0004List = stockDay0004Service.selectByCodeAndExPage(page04,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0004> stockDayScience0004List = stockDayScience0004Service.selectByPage(page04c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList4=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList4=new ArrayList<>();
                    for (StockDay0004 stockDay0004:stockDay0004List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0004,stockDayAll);
                        stockDayAllList4.add(stockDayAll);
                    }
                    for (StockDayScience0004 stockDayScience0004:stockDayScience0004List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0004,stockDayScience);
                        stockDayScienceList4.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399001.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction90(stockDayAllList4,stockDayScienceList4,stockDayAllList399001,stockDayScienceList399001,stockDayVoList);
                    continue;
                case "0005":
                    Page<StockDay0005> page05 = new Page<>(1, 60);
                    Page<StockDayScience0005> page05c=new Page<>(1,60);
                    List<StockDay0005> stockDay0005List = stockDay0005Service.selectByCodeAndExPage(page05,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0005> stockDayScience0005List = stockDayScience0005Service.selectByPage(page05c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList5=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList5=new ArrayList<>();
                    for (StockDay0005 stockDay0005:stockDay0005List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0005,stockDayAll);
                        stockDayAllList5.add(stockDayAll);
                    }
                    for (StockDayScience0005 stockDayScience0005:stockDayScience0005List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0005,stockDayScience);
                        stockDayScienceList5.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399001.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction90(stockDayAllList5,stockDayScienceList5,stockDayAllList399001,stockDayScienceList399001,stockDayVoList);
                    continue;
                case "0006":
                    Page<StockDay0006> page06 = new Page<>(1, 60);
                    Page<StockDayScience0006> page06c=new Page<>(1,60);
                    List<StockDay0006> stockDay0006List = stockDay0006Service.selectByCodeAndExPage(page06,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0006> stockDayScience0006List = stockDayScience0006Service.selectByPage(page06c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList6=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList6=new ArrayList<>();
                    for (StockDay0006 stockDay0006:stockDay0006List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0006,stockDayAll);
                        stockDayAllList6.add(stockDayAll);
                    }
                    for (StockDayScience0006 stockDayScience0006:stockDayScience0006List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0006,stockDayScience);
                        stockDayScienceList6.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399001.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction90(stockDayAllList6,stockDayScienceList6,stockDayAllList399001,stockDayScienceList399001,stockDayVoList);
                    continue;
                case "0007":
                    Page<StockDay0007> page07 = new Page<>(1, 60);
                    Page<StockDayScience0007> page07c=new Page<>(1,60);
                    List<StockDay0007> stockDay0007List = stockDay0007Service.selectByCodeAndExPage(page07,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0007> stockDayScience0007List = stockDayScience0007Service.selectByPage(page07c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList7=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList7=new ArrayList<>();
                    for (StockDay0007 stockDay0007:stockDay0007List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0007,stockDayAll);
                        stockDayAllList7.add(stockDayAll);
                    }
                    for (StockDayScience0007 stockDayScience0007:stockDayScience0007List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0007,stockDayScience);
                        stockDayScienceList7.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399001.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction90(stockDayAllList7,stockDayScienceList7,stockDayAllList399001,stockDayScienceList399001,stockDayVoList);
                    continue;
                case "0008":
                    Page<StockDay0008> page08 = new Page<>(1, 60);
                    Page<StockDayScience0008> page08c=new Page<>(1,60);
                    List<StockDay0008> stockDay0008List = stockDay0008Service.selectByCodeAndExPage(page08,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0008> stockDayScience0008List = stockDayScience0008Service.selectByPage(page08c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList8=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList8=new ArrayList<>();
                    for (StockDay0008 stockDay0008:stockDay0008List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0008,stockDayAll);
                        stockDayAllList8.add(stockDayAll);
                    }
                    for (StockDayScience0008 stockDayScience0008:stockDayScience0008List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0008,stockDayScience);
                        stockDayScienceList8.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399001.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction90(stockDayAllList8,stockDayScienceList8,stockDayAllList399001,stockDayScienceList399001,stockDayVoList);
                    continue;
                case "0009":
                    Page<StockDay0009> page09 = new Page<>(1, 60);
                    Page<StockDayScience0009> page09c=new Page<>(1,60);
                    List<StockDay0009> stockDay0009List = stockDay0009Service.selectByCodeAndExPage(page09,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0009> stockDayScience0009List = stockDayScience0009Service.selectByPage(page09c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList9=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList9=new ArrayList<>();
                    for (StockDay0009 stockDay0009:stockDay0009List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0009,stockDayAll);
                        stockDayAllList9.add(stockDayAll);
                    }
                    for (StockDayScience0009 stockDayScience0009:stockDayScience0009List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0009,stockDayScience);
                        stockDayScienceList9.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399001.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction90(stockDayAllList9,stockDayScienceList9,stockDayAllList399001,stockDayScienceList399001,stockDayVoList);
                    continue;
                case "0020":
                    Page<StockDay0020> page20 = new Page<>(1, 60);
                    Page<StockDayScience0020> page20c=new Page<>(1,60);
                    List<StockDay0020> stockDay0020List = stockDay0020Service.selectByCodeAndExPage(page20,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0020> stockDayScience0020List = stockDayScience0020Service.selectByPage(page20c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList20=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList20=new ArrayList<>();
                    for (StockDay0020 stockDay0020:stockDay0020List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0020,stockDayAll);
                        stockDayAllList20.add(stockDayAll);
                    }
                    for (StockDayScience0020 stockDayScience0020:stockDayScience0020List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0020,stockDayScience);
                        stockDayScienceList20.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399005List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399005.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399005List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399005.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction90(stockDayAllList20,stockDayScienceList20,stockDayAllList399005,stockDayScienceList399005,stockDayVoList);
                    continue;
                case "0021":
                    Page<StockDay0021> page21 = new Page<>(1, 60);
                    Page<StockDayScience0021> page21c=new Page<>(1,60);
                    List<StockDay0021> stockDay0021List = stockDay0021Service.selectByCodeAndExPage(page21,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0021> stockDayScience0021List = stockDayScience0021Service.selectByPage(page21c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList21=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList21=new ArrayList<>();
                    for (StockDay0021 stockDay0021:stockDay0021List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0021,stockDayAll);
                        stockDayAllList21.add(stockDayAll);
                    }
                    for (StockDayScience0021 stockDayScience0021:stockDayScience0021List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0021,stockDayScience);
                        stockDayScienceList21.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399005List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399005.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399005List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399005.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction90(stockDayAllList21,stockDayScienceList21,stockDayAllList399005,stockDayScienceList399005,stockDayVoList);
                    continue;
                case "0022":
                    Page<StockDay0022> page22 = new Page<>(1, 60);
                    Page<StockDayScience0022> page22c=new Page<>(1,60);
                    List<StockDay0022> stockDay0022List = stockDay0022Service.selectByCodeAndExPage(page22,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0022> stockDayScience0022List = stockDayScience0022Service.selectByPage(page22c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList22=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList22=new ArrayList<>();
                    for (StockDay0022 stockDay0022:stockDay0022List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0022,stockDayAll);
                        stockDayAllList22.add(stockDayAll);
                    }
                    for (StockDayScience0022 stockDayScience0022:stockDayScience0022List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0022,stockDayScience);
                        stockDayScienceList22.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399005List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399005.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399005List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399005.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction90(stockDayAllList22,stockDayScienceList22,stockDayAllList399005,stockDayScienceList399005,stockDayVoList);
                    continue;
                case "0023":
                    Page<StockDay0023> page23 = new Page<>(1, 60);
                    Page<StockDayScience0023> page23c=new Page<>(1,60);
                    List<StockDay0023> stockDay0023List = stockDay0023Service.selectByCodeAndExPage(page23,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0023> stockDayScience0023List = stockDayScience0023Service.selectByPage(page23c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList23=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList23=new ArrayList<>();
                    for (StockDay0023 stockDay0023:stockDay0023List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0023,stockDayAll);
                        stockDayAllList23.add(stockDayAll);
                    }
                    for (StockDayScience0023 stockDayScience0023:stockDayScience0023List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0023,stockDayScience);
                        stockDayScienceList23.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399005List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399005.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399005List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399005.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction90(stockDayAllList23,stockDayScienceList23,stockDayAllList399005,stockDayScienceList399005,stockDayVoList);
                    continue;
                case "0024":
                    Page<StockDay0024> page24 = new Page<>(1, 60);
                    Page<StockDayScience0024> page24c=new Page<>(1,60);
                    List<StockDay0024> stockDay0024List = stockDay0024Service.selectByCodeAndExPage(page24,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0024> stockDayScience0024List = stockDayScience0024Service.selectByPage(page24c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList24=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList24=new ArrayList<>();
                    for (StockDay0024 stockDay0024:stockDay0024List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0024,stockDayAll);
                        stockDayAllList24.add(stockDayAll);
                    }
                    for (StockDayScience0024 stockDayScience0024:stockDayScience0024List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0024,stockDayScience);
                        stockDayScienceList24.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399005List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399005.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399005List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399005.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction90(stockDayAllList24,stockDayScienceList24,stockDayAllList399005,stockDayScienceList399005,stockDayVoList);
                    continue;
                case "0025":
                    Page<StockDay0025> page25 = new Page<>(1, 60);
                    Page<StockDayScience0025> page25c=new Page<>(1,60);
                    List<StockDay0025> stockDay0025List = stockDay0025Service.selectByCodeAndExPage(page25,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0025> stockDayScience0025List = stockDayScience0025Service.selectByPage(page25c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList25=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList25=new ArrayList<>();
                    for (StockDay0025 stockDay0025:stockDay0025List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0025,stockDayAll);
                        stockDayAllList25.add(stockDayAll);
                    }
                    for (StockDayScience0025 stockDayScience0025:stockDayScience0025List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0025,stockDayScience);
                        stockDayScienceList25.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399005List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399005.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399005List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399005.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction90(stockDayAllList25,stockDayScienceList25,stockDayAllList399005,stockDayScienceList399005,stockDayVoList);
                    continue;
                case "0026":
                    Page<StockDay0026> page26 = new Page<>(1, 60);
                    Page<StockDayScience0026> page26c=new Page<>(1,60);
                    List<StockDay0026> stockDay0026List = stockDay0026Service.selectByCodeAndExPage(page26,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0026> stockDayScience0026List = stockDayScience0026Service.selectByPage(page26c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList26=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList26=new ArrayList<>();
                    for (StockDay0026 stockDay0026:stockDay0026List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0026,stockDayAll);
                        stockDayAllList26.add(stockDayAll);
                    }
                    for (StockDayScience0026 stockDayScience0026:stockDayScience0026List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0026,stockDayScience);
                        stockDayScienceList26.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399005List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399005.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399005List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399005.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction90(stockDayAllList26,stockDayScienceList26,stockDayAllList399005,stockDayScienceList399005,stockDayVoList);
                    continue;
                case "0027":
                    Page<StockDay0027> page27 = new Page<>(1, 60);
                    Page<StockDayScience0027> page27c=new Page<>(1,60);
                    List<StockDay0027> stockDay0027List = stockDay0027Service.selectByCodeAndExPage(page27,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0027> stockDayScience0027List = stockDayScience0027Service.selectByPage(page27c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList27=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList27=new ArrayList<>();
                    for (StockDay0027 stockDay0027:stockDay0027List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0027,stockDayAll);
                        stockDayAllList27.add(stockDayAll);
                    }
                    for (StockDayScience0027 stockDayScience0027:stockDayScience0027List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0027,stockDayScience);
                        stockDayScienceList27.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399005List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399005.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399005List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399005.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction90(stockDayAllList27,stockDayScienceList27,stockDayAllList399005,stockDayScienceList399005,stockDayVoList);
                    continue;
                case "0028":
                    Page<StockDay0028> page28 = new Page<>(1, 60);
                    Page<StockDayScience0028> page28c=new Page<>(1,60);
                    List<StockDay0028> stockDay0028List = stockDay0028Service.selectByCodeAndExPage(page28,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0028> stockDayScience0028List = stockDayScience0028Service.selectByPage(page28c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList28=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList28=new ArrayList<>();
                    for (StockDay0028 stockDay0028:stockDay0028List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0028,stockDayAll);
                        stockDayAllList28.add(stockDayAll);
                    }
                    for (StockDayScience0028 stockDayScience0028:stockDayScience0028List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0028,stockDayScience);
                        stockDayScienceList28.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399005List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399005.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399005List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399005.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction90(stockDayAllList28,stockDayScienceList28,stockDayAllList399005,stockDayScienceList399005,stockDayVoList);
                    continue;
                case "3000":
                    Page<StockDay3000> page30 = new Page<>(1, 60);
                    Page<StockDayScience3000> page30c=new Page<>(1,60);
                    List<StockDay3000> stockDay3000List = stockDay3000Service.selectByCodeAndExPage(page30,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience3000> stockDayScience3000List = stockDayScience3000Service.selectByPage(page30c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList30=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList30=new ArrayList<>();
                    for (StockDay3000 stockDay3000:stockDay3000List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay3000,stockDayAll);
                        stockDayAllList30.add(stockDayAll);
                    }
                    for (StockDayScience3000 stockDayScience3000:stockDayScience3000List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience3000,stockDayScience);
                        stockDayScienceList30.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399006List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399006.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399006List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399006.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction90(stockDayAllList30,stockDayScienceList30,stockDayAllList399006,stockDayScienceList399006,stockDayVoList);
                    continue;
                case "3001":
                    Page<StockDay3001> page31 = new Page<>(1, 60);
                    Page<StockDayScience3001> page31c=new Page<>(1,60);
                    List<StockDay3001> stockDay3001List = stockDay3001Service.selectByCodeAndExPage(page31,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience3001> stockDayScience3001List = stockDayScience3001Service.selectByPage(page31c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList31=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList31=new ArrayList<>();
                    for (StockDay3001 stockDay3001:stockDay3001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay3001,stockDayAll);
                        stockDayAllList31.add(stockDayAll);
                    }
                    for (StockDayScience3001 stockDayScience3001:stockDayScience3001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience3001,stockDayScience);
                        stockDayScienceList31.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399006List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399006.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399006List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399006.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction90(stockDayAllList31,stockDayScienceList31,stockDayAllList399006,stockDayScienceList399006,stockDayVoList);
                    continue;
                case "3002":
                    Page<StockDay3002> page32 = new Page<>(1, 60);
                    Page<StockDayScience3002> page32c=new Page<>(1,60);
                    List<StockDay3002> stockDay3002List = stockDay3002Service.selectByCodeAndExPage(page32,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience3002> stockDayScience3002List = stockDayScience3002Service.selectByPage(page32c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList32=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList32=new ArrayList<>();
                    for (StockDay3002 stockDay3002:stockDay3002List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay3002,stockDayAll);
                        stockDayAllList32.add(stockDayAll);
                    }
                    for (StockDayScience3002 stockDayScience3002:stockDayScience3002List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience3002,stockDayScience);
                        stockDayScienceList32.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399006List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399006.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399006List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399006.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction90(stockDayAllList32,stockDayScienceList32,stockDayAllList399006,stockDayScienceList399006,stockDayVoList);
                    continue;
                case "3003":
                    Page<StockDay3003> page33 = new Page<>(1, 60);
                    Page<StockDayScience3003> page33c=new Page<>(1,60);
                    List<StockDay3003> stockDay3003List = stockDay3003Service.selectByCodeAndExPage(page33,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience3003> stockDayScience3003List = stockDayScience3003Service.selectByPage(page33c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList33=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList33=new ArrayList<>();
                    for (StockDay3003 stockDay3003:stockDay3003List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay3003,stockDayAll);
                        stockDayAllList33.add(stockDayAll);
                    }
                    for (StockDayScience3003 stockDayScience3003:stockDayScience3003List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience3003,stockDayScience);
                        stockDayScienceList33.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399006List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399006.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399006List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399006.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction90(stockDayAllList33,stockDayScienceList33,stockDayAllList399006,stockDayScienceList399006,stockDayVoList);
                    continue;
                case "3004":
                    Page<StockDay3004> page34 = new Page<>(1, 60);
                    Page<StockDayScience3004> page34c=new Page<>(1,60);
                    List<StockDay3004> stockDay3004List = stockDay3004Service.selectByCodeAndExPage(page34,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience3004> stockDayScience3004List = stockDayScience3004Service.selectByPage(page34c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList34=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList34=new ArrayList<>();
                    for (StockDay3004 stockDay3004:stockDay3004List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay3004,stockDayAll);
                        stockDayAllList34.add(stockDayAll);
                    }
                    for (StockDayScience3004 stockDayScience3004:stockDayScience3004List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience3004,stockDayScience);
                        stockDayScienceList34.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399006List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399006.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399006List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399006.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction90(stockDayAllList34,stockDayScienceList34,stockDayAllList399006,stockDayScienceList399006,stockDayVoList);
                    continue;
                case "3005":
                    Page<StockDay3005> page35 = new Page<>(1, 60);
                    Page<StockDayScience3005> page35c=new Page<>(1,60);
                    List<StockDay3005> stockDay3005List = stockDay3005Service.selectByCodeAndExPage(page35,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience3005> stockDayScience3005List = stockDayScience3005Service.selectByPage(page35c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList35=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList35=new ArrayList<>();
                    for (StockDay3005 stockDay3005:stockDay3005List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay3005,stockDayAll);
                        stockDayAllList35.add(stockDayAll);
                    }
                    for (StockDayScience3005 stockDayScience3005:stockDayScience3005List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience3005,stockDayScience);
                        stockDayScienceList35.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399006List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399006.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399006List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399006.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction90(stockDayAllList35,stockDayScienceList35,stockDayAllList399006,stockDayScienceList399006,stockDayVoList);
                    continue;
                case "6000":
                    Page<StockDay6000> page60 = new Page<>(1, 60);
                    Page<StockDayScience6000> page60c=new Page<>(1,60);
                    List<StockDay6000> stockDay6000List = stockDay6000Service.selectByCodeAndExPage(page60,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6000> stockDayScience6000List = stockDayScience6000Service.selectByPage(page60c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList60=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList60=new ArrayList<>();
                    for (StockDay6000 stockDay6000:stockDay6000List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay6000,stockDayAll);
                        stockDayAllList60.add(stockDayAll);
                    }
                    for (StockDayScience6000 stockDayScience6000:stockDayScience6000List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience6000,stockDayScience);
                        stockDayScienceList60.add(stockDayScience);
                    }
                    for (StockDay0000 stockDay0000:stockDay000001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0000,stockDayAll);
                        stockDayAllList0001.add(stockDayAll);
                    }
                    for (StockDayScience0000 stockDayScience0000:stockDayScience000001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                        stockDayScienceList0001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction90(stockDayAllList60,stockDayScienceList60,stockDayAllList0001,stockDayScienceList0001,stockDayVoList);
                    continue;
                case "6001":
                    Page<StockDay6001> page61 = new Page<>(1, 60);
                    Page<StockDayScience6001> page61c=new Page<>(1,60);
                    List<StockDay6001> stockDay6001List = stockDay6001Service.selectByCodeAndExPage(page61,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6001> stockDayScience6001List = stockDayScience6001Service.selectByPage(page61c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList61=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList61=new ArrayList<>();
                    for (StockDay6001 stockDay6001:stockDay6001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay6001,stockDayAll);
                        stockDayAllList61.add(stockDayAll);
                    }
                    for (StockDayScience6001 stockDayScience6001:stockDayScience6001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience6001,stockDayScience);
                        stockDayScienceList61.add(stockDayScience);
                    }
                    for (StockDay0000 stockDay0000:stockDay000001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0000,stockDayAll);
                        stockDayAllList0001.add(stockDayAll);
                    }
                    for (StockDayScience0000 stockDayScience0000:stockDayScience000001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                        stockDayScienceList0001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction90(stockDayAllList61,stockDayScienceList61,stockDayAllList0001,stockDayScienceList0001,stockDayVoList);
                    continue;
                case "6002":
                    Page<StockDay6002> page62 = new Page<>(1, 60);
                    Page<StockDayScience6002> page62c=new Page<>(1,60);
                    List<StockDay6002> stockDay6002List = stockDay6002Service.selectByCodeAndExPage(page62,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6002> stockDayScience6002List = stockDayScience6002Service.selectByPage(page62c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList62=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList62=new ArrayList<>();
                    for (StockDay6002 stockDay6002:stockDay6002List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay6002,stockDayAll);
                        stockDayAllList62.add(stockDayAll);
                    }
                    for (StockDayScience6002 stockDayScience6002:stockDayScience6002List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience6002,stockDayScience);
                        stockDayScienceList62.add(stockDayScience);
                    }
                    for (StockDay0000 stockDay0000:stockDay000001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0000,stockDayAll);
                        stockDayAllList0001.add(stockDayAll);
                    }
                    for (StockDayScience0000 stockDayScience0000:stockDayScience000001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                        stockDayScienceList0001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction90(stockDayAllList62,stockDayScienceList62,stockDayAllList0001,stockDayScienceList0001,stockDayVoList);
                    continue;
                case "6003":
                    Page<StockDay6003> page63 = new Page<>(1, 60);
                    Page<StockDayScience6003> page63c=new Page<>(1,60);
                    List<StockDay6003> stockDay6003List = stockDay6003Service.selectByCodeAndExPage(page63,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6003> stockDayScience6003List = stockDayScience6003Service.selectByPage(page63c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList63=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList63=new ArrayList<>();
                    for (StockDay6003 stockDay6003:stockDay6003List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay6003,stockDayAll);
                        stockDayAllList63.add(stockDayAll);
                    }
                    for (StockDayScience6003 stockDayScience6003:stockDayScience6003List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience6003,stockDayScience);
                        stockDayScienceList63.add(stockDayScience);
                    }
                    for (StockDay0000 stockDay0000:stockDay000001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0000,stockDayAll);
                        stockDayAllList0001.add(stockDayAll);
                    }
                    for (StockDayScience0000 stockDayScience0000:stockDayScience000001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                        stockDayScienceList0001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction90(stockDayAllList63,stockDayScienceList63,stockDayAllList0001,stockDayScienceList0001,stockDayVoList);
                    continue;
                case "6004":
                    Page<StockDay6004> page64 = new Page<>(1, 60);
                    Page<StockDayScience6004> page64c=new Page<>(1,60);
                    List<StockDay6004> stockDay6004List = stockDay6004Service.selectByCodeAndExPage(page64,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6004> stockDayScience6004List = stockDayScience6004Service.selectByPage(page64c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList64=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList64=new ArrayList<>();
                    for (StockDay6004 stockDay6004:stockDay6004List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay6004,stockDayAll);
                        stockDayAllList64.add(stockDayAll);
                    }
                    for (StockDayScience6004 stockDayScience6004:stockDayScience6004List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience6004,stockDayScience);
                        stockDayScienceList64.add(stockDayScience);
                    }
                    for (StockDay0000 stockDay0000:stockDay000001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0000,stockDayAll);
                        stockDayAllList0001.add(stockDayAll);
                    }
                    for (StockDayScience0000 stockDayScience0000:stockDayScience000001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                        stockDayScienceList0001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction90(stockDayAllList64,stockDayScienceList64,stockDayAllList0001,stockDayScienceList0001,stockDayVoList);
                    continue;
                case "6005":
                    Page<StockDay6005> page65 = new Page<>(1, 60);
                    Page<StockDayScience6005> page65c=new Page<>(1,60);
                    List<StockDay6005> stockDay6005List = stockDay6005Service.selectByCodeAndExPage(page65,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6005> stockDayScience6005List = stockDayScience6005Service.selectByPage(page65c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList65=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList65=new ArrayList<>();
                    for (StockDay6005 stockDay6005:stockDay6005List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay6005,stockDayAll);
                        stockDayAllList65.add(stockDayAll);
                    }
                    for (StockDayScience6005 stockDayScience6005:stockDayScience6005List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience6005,stockDayScience);
                        stockDayScienceList65.add(stockDayScience);
                    }
                    for (StockDay0000 stockDay0000:stockDay000001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0000,stockDayAll);
                        stockDayAllList0001.add(stockDayAll);
                    }
                    for (StockDayScience0000 stockDayScience0000:stockDayScience000001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                        stockDayScienceList0001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction90(stockDayAllList65,stockDayScienceList65,stockDayAllList0001,stockDayScienceList0001,stockDayVoList);
                    continue;
                case "6006":
                    Page<StockDay6006> page66 = new Page<>(1, 60);
                    Page<StockDayScience6006> page66c=new Page<>(1,60);
                    List<StockDay6006> stockDay6006List = stockDay6006Service.selectByCodeAndExPage(page66,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6006> stockDayScience6006List = stockDayScience6006Service.selectByPage(page66c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList66=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList66=new ArrayList<>();
                    for (StockDay6006 stockDay6006:stockDay6006List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay6006,stockDayAll);
                        stockDayAllList66.add(stockDayAll);
                    }
                    for (StockDayScience6006 stockDayScience6006:stockDayScience6006List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience6006,stockDayScience);
                        stockDayScienceList66.add(stockDayScience);
                    }
                    for (StockDay0000 stockDay0000:stockDay000001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0000,stockDayAll);
                        stockDayAllList0001.add(stockDayAll);
                    }
                    for (StockDayScience0000 stockDayScience0000:stockDayScience000001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                        stockDayScienceList0001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction90(stockDayAllList66,stockDayScienceList66,stockDayAllList0001,stockDayScienceList0001,stockDayVoList);
                    continue;
                case "6007":
                    Page<StockDay6007> page67 = new Page<>(1, 60);
                    Page<StockDayScience6007> page67c=new Page<>(1,60);
                    List<StockDay6007> stockDay6007List = stockDay6007Service.selectByCodeAndExPage(page67,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6007> stockDayScience6007List = stockDayScience6007Service.selectByPage(page67c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList67=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList67=new ArrayList<>();
                    for (StockDay6007 stockDay6007:stockDay6007List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay6007,stockDayAll);
                        stockDayAllList67.add(stockDayAll);
                    }
                    for (StockDayScience6007 stockDayScience6007:stockDayScience6007List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience6007,stockDayScience);
                        stockDayScienceList67.add(stockDayScience);
                    }
                    for (StockDay0000 stockDay0000:stockDay000001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0000,stockDayAll);
                        stockDayAllList0001.add(stockDayAll);
                    }
                    for (StockDayScience0000 stockDayScience0000:stockDayScience000001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                        stockDayScienceList0001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction90(stockDayAllList67,stockDayScienceList67,stockDayAllList0001,stockDayScienceList0001,stockDayVoList);
                    continue;
                case "6008":
                    Page<StockDay6008> page68 = new Page<>(1, 60);
                    Page<StockDayScience6008> page68c=new Page<>(1,60);
                    List<StockDay6008> stockDay6008List = stockDay6008Service.selectByCodeAndExPage(page68,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6008> stockDayScience6008List = stockDayScience6008Service.selectByPage(page68c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList68=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList68=new ArrayList<>();
                    for (StockDay6008 stockDay6008:stockDay6008List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay6008,stockDayAll);
                        stockDayAllList68.add(stockDayAll);
                    }
                    for (StockDayScience6008 stockDayScience6008:stockDayScience6008List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience6008,stockDayScience);
                        stockDayScienceList68.add(stockDayScience);
                    }
                    for (StockDay0000 stockDay0000:stockDay000001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0000,stockDayAll);
                        stockDayAllList0001.add(stockDayAll);
                    }
                    for (StockDayScience0000 stockDayScience0000:stockDayScience000001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                        stockDayScienceList0001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction90(stockDayAllList68,stockDayScienceList68,stockDayAllList0001,stockDayScienceList0001,stockDayVoList);
                    continue;
                case "6009":
                    Page<StockDay6009> page69 = new Page<>(1, 60);
                    Page<StockDayScience6009> page69c=new Page<>(1,60);
                    List<StockDay6009> stockDay6009List = stockDay6009Service.selectByCodeAndExPage(page69,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6009> stockDayScience6009List = stockDayScience6009Service.selectByPage(page69c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList69=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList69=new ArrayList<>();
                    for (StockDay6009 stockDay6009:stockDay6009List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay6009,stockDayAll);
                        stockDayAllList69.add(stockDayAll);
                    }
                    for (StockDayScience6009 stockDayScience6009:stockDayScience6009List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience6009,stockDayScience);
                        stockDayScienceList69.add(stockDayScience);
                    }
                    for (StockDay0000 stockDay0000:stockDay000001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0000,stockDayAll);
                        stockDayAllList0001.add(stockDayAll);
                    }
                    for (StockDayScience0000 stockDayScience0000:stockDayScience000001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                        stockDayScienceList0001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction90(stockDayAllList69,stockDayScienceList69,stockDayAllList0001,stockDayScienceList0001,stockDayVoList);
                    continue;
                case "6010":
                    Page<StockDay6010> page610 = new Page<>(1, 60);
                    Page<StockDayScience6010> page610c=new Page<>(1,60);
                    List<StockDay6010> stockDay6010List = stockDay6010Service.selectByCodeAndExPage(page610,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6010> stockDayScience6010List = stockDayScience6010Service.selectByPage(page610c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList610=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList610=new ArrayList<>();
                    for (StockDay6010 stockDay6010:stockDay6010List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay6010,stockDayAll);
                        stockDayAllList610.add(stockDayAll);
                    }
                    for (StockDayScience6010 stockDayScience6010:stockDayScience6010List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience6010,stockDayScience);
                        stockDayScienceList610.add(stockDayScience);
                    }
                    for (StockDay0000 stockDay0000:stockDay000001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0000,stockDayAll);
                        stockDayAllList0001.add(stockDayAll);
                    }
                    for (StockDayScience0000 stockDayScience0000:stockDayScience000001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                        stockDayScienceList0001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction90(stockDayAllList610,stockDayScienceList610,stockDayAllList0001,stockDayScienceList0001,stockDayVoList);
                    continue;
                case "6011":
                    Page<StockDay6011> page611 = new Page<>(1, 60);
                    Page<StockDayScience6011> page611c=new Page<>(1,60);
                    List<StockDay6011> stockDay6011List = stockDay6011Service.selectByCodeAndExPage(page611,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6011> stockDayScience6011List = stockDayScience6011Service.selectByPage(page611c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList611=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList611=new ArrayList<>();
                    for (StockDay6011 stockDay6011:stockDay6011List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay6011,stockDayAll);
                        stockDayAllList611.add(stockDayAll);
                    }
                    for (StockDayScience6011 stockDayScience6011:stockDayScience6011List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience6011,stockDayScience);
                        stockDayScienceList611.add(stockDayScience);
                    }
                    for (StockDay0000 stockDay0000:stockDay000001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0000,stockDayAll);
                        stockDayAllList0001.add(stockDayAll);
                    }
                    for (StockDayScience0000 stockDayScience0000:stockDayScience000001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                        stockDayScienceList0001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction90(stockDayAllList611,stockDayScienceList611,stockDayAllList0001,stockDayScienceList0001,stockDayVoList);
                    continue;
                case "6012":
                    Page<StockDay6012> page612 = new Page<>(1, 60);
                    Page<StockDayScience6012> page612c=new Page<>(1,60);
                    List<StockDay6012> stockDay6012List = stockDay6012Service.selectByCodeAndExPage(page612,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6012> stockDayScience6012List = stockDayScience6012Service.selectByPage(page612c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList612=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList612=new ArrayList<>();
                    for (StockDay6012 stockDay6012:stockDay6012List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay6012,stockDayAll);
                        stockDayAllList612.add(stockDayAll);
                    }
                    for (StockDayScience6012 stockDayScience6012:stockDayScience6012List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience6012,stockDayScience);
                        stockDayScienceList612.add(stockDayScience);
                    }
                    for (StockDay0000 stockDay0000:stockDay000001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0000,stockDayAll);
                        stockDayAllList0001.add(stockDayAll);
                    }
                    for (StockDayScience0000 stockDayScience0000:stockDayScience000001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                        stockDayScienceList0001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction90(stockDayAllList612,stockDayScienceList612,stockDayAllList0001,stockDayScienceList0001,stockDayVoList);
                    continue;
                case "6013":
                    Page<StockDay6013> page613 = new Page<>(1, 60);
                    Page<StockDayScience6013> page613c=new Page<>(1,60);
                    List<StockDay6013> stockDay6013List = stockDay6013Service.selectByCodeAndExPage(page613,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6013> stockDayScience6013List = stockDayScience6013Service.selectByPage(page613c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList613=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList613=new ArrayList<>();
                    for (StockDay6013 stockDay6013:stockDay6013List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay6013,stockDayAll);
                        stockDayAllList613.add(stockDayAll);
                    }
                    for (StockDayScience6013 stockDayScience6013:stockDayScience6013List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience6013,stockDayScience);
                        stockDayScienceList613.add(stockDayScience);
                    }
                    for (StockDay0000 stockDay0000:stockDay000001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0000,stockDayAll);
                        stockDayAllList0001.add(stockDayAll);
                    }
                    for (StockDayScience0000 stockDayScience0000:stockDayScience000001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                        stockDayScienceList0001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction90(stockDayAllList613,stockDayScienceList613,stockDayAllList0001,stockDayScienceList0001,stockDayVoList);
                    continue;
                case "6014":
                    Page<StockDay6014> page614 = new Page<>(1, 60);
                    Page<StockDayScience6014> page614c=new Page<>(1,60);
                    List<StockDay6014> stockDay6014List = stockDay6014Service.selectByCodeAndExPage(page614,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6014> stockDayScience6014List = stockDayScience6014Service.selectByPage(page614c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList614=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList614=new ArrayList<>();
                    for (StockDay6014 stockDay6014:stockDay6014List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay6014,stockDayAll);
                        stockDayAllList614.add(stockDayAll);
                    }
                    for (StockDayScience6014 stockDayScience6014:stockDayScience6014List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience6014,stockDayScience);
                        stockDayScienceList614.add(stockDayScience);
                    }
                    for (StockDay0000 stockDay0000:stockDay000001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0000,stockDayAll);
                        stockDayAllList0001.add(stockDayAll);
                    }
                    for (StockDayScience0000 stockDayScience0000:stockDayScience000001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                        stockDayScienceList0001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction90(stockDayAllList614,stockDayScienceList614,stockDayAllList0001,stockDayScienceList0001,stockDayVoList);
                    continue;
                case "6015":
                    Page<StockDay6015> page615 = new Page<>(1, 60);
                    Page<StockDayScience6015> page615c=new Page<>(1,60);
                    List<StockDay6015> stockDay6015List = stockDay6015Service.selectByCodeAndExPage(page615,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6015> stockDayScience6015List = stockDayScience6015Service.selectByPage(page615c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList615=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList615=new ArrayList<>();
                    for (StockDay6015 stockDay6015:stockDay6015List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay6015,stockDayAll);
                        stockDayAllList615.add(stockDayAll);
                    }
                    for (StockDayScience6015 stockDayScience6015:stockDayScience6015List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience6015,stockDayScience);
                        stockDayScienceList615.add(stockDayScience);
                    }
                    for (StockDay0000 stockDay0000:stockDay000001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0000,stockDayAll);
                        stockDayAllList0001.add(stockDayAll);
                    }
                    for (StockDayScience0000 stockDayScience0000:stockDayScience000001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                        stockDayScienceList0001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction90(stockDayAllList615,stockDayScienceList615,stockDayAllList0001,stockDayScienceList0001,stockDayVoList);
                    continue;
                case "6016":
                    Page<StockDay6016> page616 = new Page<>(1, 60);
                    Page<StockDayScience6016> page616c=new Page<>(1,60);
                    List<StockDay6016> stockDay6016List = stockDay6016Service.selectByCodeAndExPage(page616,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6016> stockDayScience6016List = stockDayScience6016Service.selectByPage(page616c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList616=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList616=new ArrayList<>();
                    for (StockDay6016 stockDay6016:stockDay6016List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay6016,stockDayAll);
                        stockDayAllList616.add(stockDayAll);
                    }
                    for (StockDayScience6016 stockDayScience6016:stockDayScience6016List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience6016,stockDayScience);
                        stockDayScienceList616.add(stockDayScience);
                    }
                    for (StockDay0000 stockDay0000:stockDay000001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0000,stockDayAll);
                        stockDayAllList0001.add(stockDayAll);
                    }
                    for (StockDayScience0000 stockDayScience0000:stockDayScience000001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                        stockDayScienceList0001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction90(stockDayAllList616,stockDayScienceList616,stockDayAllList0001,stockDayScienceList0001,stockDayVoList);
                    continue;
                case "6017":
                    Page<StockDay6017> page617 = new Page<>(1, 60);
                    Page<StockDayScience6017> page617c=new Page<>(1,60);
                    List<StockDay6017> stockDay6017List = stockDay6017Service.selectByCodeAndExPage(page617,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6017> stockDayScience6017List = stockDayScience6017Service.selectByPage(page617c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList617=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList617=new ArrayList<>();
                    for (StockDay6017 stockDay6017:stockDay6017List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay6017,stockDayAll);
                        stockDayAllList617.add(stockDayAll);
                    }
                    for (StockDayScience6017 stockDayScience6017:stockDayScience6017List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience6017,stockDayScience);
                        stockDayScienceList617.add(stockDayScience);
                    }
                    for (StockDay0000 stockDay0000:stockDay000001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0000,stockDayAll);
                        stockDayAllList0001.add(stockDayAll);
                    }
                    for (StockDayScience0000 stockDayScience0000:stockDayScience000001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                        stockDayScienceList0001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction90(stockDayAllList617,stockDayScienceList617,stockDayAllList0001,stockDayScienceList0001,stockDayVoList);
                    continue;
                case "6018":
                    Page<StockDay6018> page618 = new Page<>(1, 60);
                    Page<StockDayScience6018> page618c=new Page<>(1,60);
                    List<StockDay6018> stockDay6018List = stockDay6018Service.selectByCodeAndExPage(page618,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6018> stockDayScience6018List = stockDayScience6018Service.selectByPage(page618c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList618=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList618=new ArrayList<>();
                    for (StockDay6018 stockDay6018:stockDay6018List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay6018,stockDayAll);
                        stockDayAllList618.add(stockDayAll);
                    }
                    for (StockDayScience6018 stockDayScience6018:stockDayScience6018List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience6018,stockDayScience);
                        stockDayScienceList618.add(stockDayScience);
                    }
                    for (StockDay0000 stockDay0000:stockDay000001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0000,stockDayAll);
                        stockDayAllList0001.add(stockDayAll);
                    }
                    for (StockDayScience0000 stockDayScience0000:stockDayScience000001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                        stockDayScienceList0001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction90(stockDayAllList618,stockDayScienceList618,stockDayAllList0001,stockDayScienceList0001,stockDayVoList);
                    continue;
                case "6019":
                    Page<StockDay6019> page619 = new Page<>(1, 60);
                    Page<StockDayScience6019> page619c=new Page<>(1,60);
                    List<StockDay6019> stockDay6019List = stockDay6019Service.selectByCodeAndExPage(page619,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6019> stockDayScience6019List = stockDayScience6019Service.selectByPage(page619c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList619=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList619=new ArrayList<>();
                    for (StockDay6019 stockDay6019:stockDay6019List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay6019,stockDayAll);
                        stockDayAllList619.add(stockDayAll);
                    }
                    for (StockDayScience6019 stockDayScience6019:stockDayScience6019List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience6019,stockDayScience);
                        stockDayScienceList619.add(stockDayScience);
                    }
                    for (StockDay0000 stockDay0000:stockDay000001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0000,stockDayAll);
                        stockDayAllList0001.add(stockDayAll);
                    }
                    for (StockDayScience0000 stockDayScience0000:stockDayScience000001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                        stockDayScienceList0001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction90(stockDayAllList619,stockDayScienceList619,stockDayAllList0001,stockDayScienceList0001,stockDayVoList);
                    continue;
                default:
                    switch (stockCode.getId().substring(0, 3)) {
                        case "001":
                            Page<StockDay001> page001 = new Page<>(1, 60);
                            Page<StockDayScience001> page001c=new Page<>(1,60);
                            List<StockDay001> stockDay001List = stockDay001Service.selectByCodeAndExPage(page001,stockCode.getId(), stockCode.getEx());//日线
                            List<StockDayScience001> stockDayScience001List = stockDayScience001Service.selectByPage(page001c,stockCode.getId(), stockCode.getEx());//技术先
                            List<StockDayAll> stockDayAllList001=new ArrayList<>();
                            List<StockDayScience> stockDayScienceList001=new ArrayList<>();
                            for (StockDay001 stockDay001:stockDay001List){
                                StockDayAll stockDayAll=new StockDayAll();
                                BeanUtils.copyProperties(stockDay001,stockDayAll);
                                stockDayAllList001.add(stockDayAll);
                            }
                            for (StockDayScience001 stockDayScience001:stockDayScience001List){
                                StockDayScience stockDayScience=new StockDayScience();
                                BeanUtils.copyProperties(stockDayScience001,stockDayScience);
                                stockDayScienceList001.add(stockDayScience);
                            }
                            for (StockDay399 stockDay399:stockDay399001List){
                                StockDayAll stockDayAll=new StockDayAll();
                                BeanUtils.copyProperties(stockDay399,stockDayAll);
                                stockDayAllList399001.add(stockDayAll);
                            }
                            for (StockDayScience399 stockDayScience399:stockDayScience399001List){
                                StockDayScience stockDayScience=new StockDayScience();
                                BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                                stockDayScienceList399001.add(stockDayScience);
                            }
                            yanPanDayService.dayYanPanFunction90(stockDayAllList001,stockDayScienceList001,stockDayAllList399001,stockDayScienceList399001,stockDayVoList);
                            continue;
                        case "603":
                            Page<StockDay603> page603 = new Page<>(1, 60);
                            Page<StockDayScience603> page603c=new Page<>(1,60);
                            List<StockDay603> stockDay603List = stockDay603Service.selectByCodeAndExPage(page603,stockCode.getId(), stockCode.getEx());//日线
                            List<StockDayScience603> stockDayScience603List = stockDayScience603Service.selectByPage(page603c,stockCode.getId(), stockCode.getEx());//技术先
                            List<StockDayAll> stockDayAllList603=new ArrayList<>();
                            List<StockDayScience> stockDayScienceList603=new ArrayList<>();
                            for (StockDay603 stockDay603:stockDay603List){
                                StockDayAll stockDayAll=new StockDayAll();
                                BeanUtils.copyProperties(stockDay603,stockDayAll);
                                stockDayAllList603.add(stockDayAll);
                            }
                            for (StockDayScience603 stockDayScience603:stockDayScience603List){
                                StockDayScience stockDayScience=new StockDayScience();
                                BeanUtils.copyProperties(stockDayScience603,stockDayScience);
                                stockDayScienceList603.add(stockDayScience);
                            }
                            for (StockDay0000 stockDay0000:stockDay000001List){
                                StockDayAll stockDayAll=new StockDayAll();
                                BeanUtils.copyProperties(stockDay0000,stockDayAll);
                                stockDayAllList0001.add(stockDayAll);
                            }
                            for (StockDayScience0000 stockDayScience0000:stockDayScience000001List){
                                StockDayScience stockDayScience=new StockDayScience();
                                BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                                stockDayScienceList0001.add(stockDayScience);
                            }
                            yanPanDayService.dayYanPanFunction90(stockDayAllList603,stockDayScienceList603,stockDayAllList0001,stockDayScienceList0001,stockDayVoList);
                            continue;
                        default:
                            continue;
                    }
            }
        }
        return stockDayVoList;
    }

    @Override
    public List<StockDayVo> dayYanPanFunction100() throws IOException {
        //获取所以编码
        List<StockCode> stockCodeList = stockCodeService.getStockCodeList();
        if (stockCodeList == null || stockCodeList.isEmpty()) {
            return null;
        }
        List<StockDayVo> stockDayVoList=new ArrayList<>();
        Page<StockDay0000> page = new Page<>(1, 60);
        //获取上证
        List<StockDay0000> stockDay000001List = stockDay0000Service.selectByCodeAndExPage(page,"000001", "SH");
        Page<StockDay399> page2 = new Page<>(1, 60);
        //获取sz
        List<StockDay399> stockDay399001List = stockDay399Service.selectByCodeAndExPage(page2,"399001", "SZ");
        Page<StockDay399> page3 = new Page<>(1, 60);
        //获取中小
        List<StockDay399> stockDay399005List = stockDay399Service.selectByCodeAndExPage(page3,"399005", "SZ");
        Page<StockDay399> page4 = new Page<>(1, 60);
        //获取创业
        List<StockDay399> stockDay399006List = stockDay399Service.selectByCodeAndExPage(page4,"399006", "SZ");

        Page<StockDayScience0000> page5=new Page<>(1,60);
        List<StockDayScience0000> stockDayScience000001List = stockDayScience0000Service.selectByPage(page5,"000001", "SH");
        Page<StockDayScience399> page6=new Page<>(1,60);
        List<StockDayScience399> stockDayScience399001List = stockDayScience399Service.selectByPage(page6,"399001", "SZ");
        Page<StockDayScience399> page7=new Page<>(1,60);
        List<StockDayScience399> stockDayScience399005List = stockDayScience399Service.selectByPage(page7,"399001", "SZ");
        Page<StockDayScience399> page8=new Page<>(1,60);
        List<StockDayScience399> stockDayScience399006List = stockDayScience399Service.selectByPage(page8,"399001", "SZ");
        //遍历
        for (StockCode stockCode : stockCodeList) {
            List<StockDayAll> stockDayAllList0001=new ArrayList<>();
            List<StockDayAll> stockDayAllList399001=new ArrayList<>();
            List<StockDayAll> stockDayAllList399005=new ArrayList<>();
            List<StockDayAll> stockDayAllList399006=new ArrayList<>();
            List<StockDayScience> stockDayScienceList0001=new ArrayList<>();
            List<StockDayScience> stockDayScienceList399001=new ArrayList<>();
            List<StockDayScience> stockDayScienceList399005=new ArrayList<>();
            List<StockDayScience> stockDayScienceList399006=new ArrayList<>();
            switch (stockCode.getId().substring(0, 4)) {
                case "0000":
                    if (stockCode.getId().equals("000001") && stockCode.getEx().equals("SH")) {
                        continue;
                    } else {
                        Page<StockDay0000> page9 = new Page<>(1, 60);
                        Page<StockDayScience0000> page1=new Page<>(1,60);
                        List<StockDay0000> stockDay0000List = stockDay0000Service.selectByCodeAndExPage(page9,stockCode.getId(), stockCode.getEx());//日线
                        List<StockDayScience0000> stockDayScience0000List = stockDayScience0000Service.selectByPage(page1,stockCode.getId(), stockCode.getEx());//技术先
                        List<StockDayAll> stockDayAllList=new ArrayList<>();
                        List<StockDayScience> stockDayScienceList=new ArrayList<>();
                        for (StockDay0000 stockDay0000:stockDay0000List){
                            StockDayAll stockDayAll=new StockDayAll();
                            BeanUtils.copyProperties(stockDay0000,stockDayAll);
                            stockDayAllList.add(stockDayAll);
                        }
                        for (StockDayScience0000 stockDayScience0000:stockDayScience0000List){
                            StockDayScience stockDayScience=new StockDayScience();
                            BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                            stockDayScienceList.add(stockDayScience);
                        }
                        for (StockDay399 stockDay399:stockDay399001List){
                            StockDayAll stockDayAll=new StockDayAll();
                            BeanUtils.copyProperties(stockDay399,stockDayAll);
                            stockDayAllList399001.add(stockDayAll);
                        }
                        for (StockDayScience399 stockDayScience399:stockDayScience399001List){
                            StockDayScience stockDayScience=new StockDayScience();
                            BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                            stockDayScienceList399001.add(stockDayScience);
                        }
                        yanPanDayService.dayYanPanFunction100(stockDayAllList,stockDayScienceList,stockDayAllList399001,stockDayScienceList399001,stockDayVoList);
                    }
                    continue;
                case "0001":
                    Page<StockDay0001> page9 = new Page<>(1, 60);
                    Page<StockDayScience0001> page1=new Page<>(1,60);
                    List<StockDay0001> stockDay0001List = stockDay0001Service.selectByCodeAndExPage(page9,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0001> stockDayScience0001List = stockDayScience0001Service.selectByPage(page1,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList=new ArrayList<>();
                    for (StockDay0001 stockDay0001:stockDay0001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0001,stockDayAll);
                        stockDayAllList.add(stockDayAll);
                    }
                    for (StockDayScience0001 stockDayScience0001:stockDayScience0001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0001,stockDayScience);
                        stockDayScienceList.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399001.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction100(stockDayAllList,stockDayScienceList,stockDayAllList399001,stockDayScienceList399001,stockDayVoList);
                    continue;
                case "0002":
                    Page<StockDay0002> page02 = new Page<>(1, 60);
                    Page<StockDayScience0002> page02c=new Page<>(1,60);
                    List<StockDay0002> stockDay0002List = stockDay0002Service.selectByCodeAndExPage(page02,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0002> stockDayScience0002List = stockDayScience0002Service.selectByPage(page02c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList1=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList1=new ArrayList<>();
                    for (StockDay0002 stockDay0002:stockDay0002List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0002,stockDayAll);
                        stockDayAllList1.add(stockDayAll);
                    }
                    for (StockDayScience0002 stockDayScience0002:stockDayScience0002List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0002,stockDayScience);
                        stockDayScienceList1.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399001.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction100(stockDayAllList1,stockDayScienceList1,stockDayAllList399001,stockDayScienceList399001,stockDayVoList);
                    continue;
                case "0003":
                    Page<StockDay0003> page03 = new Page<>(1, 60);
                    Page<StockDayScience0003> page03c=new Page<>(1,60);
                    List<StockDay0003> stockDay0003List = stockDay0003Service.selectByCodeAndExPage(page03,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0003> stockDayScience0003List = stockDayScience0003Service.selectByPage(page03c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList3=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList3=new ArrayList<>();
                    for (StockDay0003 stockDay0003:stockDay0003List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0003,stockDayAll);
                        stockDayAllList3.add(stockDayAll);
                    }
                    for (StockDayScience0003 stockDayScience0003:stockDayScience0003List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0003,stockDayScience);
                        stockDayScienceList3.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399001.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction100(stockDayAllList3,stockDayScienceList3,stockDayAllList399001,stockDayScienceList399001,stockDayVoList);
                    continue;
                case "0004":
                    Page<StockDay0004> page04 = new Page<>(1, 60);
                    Page<StockDayScience0004> page04c=new Page<>(1,60);
                    List<StockDay0004> stockDay0004List = stockDay0004Service.selectByCodeAndExPage(page04,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0004> stockDayScience0004List = stockDayScience0004Service.selectByPage(page04c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList4=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList4=new ArrayList<>();
                    for (StockDay0004 stockDay0004:stockDay0004List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0004,stockDayAll);
                        stockDayAllList4.add(stockDayAll);
                    }
                    for (StockDayScience0004 stockDayScience0004:stockDayScience0004List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0004,stockDayScience);
                        stockDayScienceList4.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399001.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction100(stockDayAllList4,stockDayScienceList4,stockDayAllList399001,stockDayScienceList399001,stockDayVoList);
                    continue;
                case "0005":
                    Page<StockDay0005> page05 = new Page<>(1, 60);
                    Page<StockDayScience0005> page05c=new Page<>(1,60);
                    List<StockDay0005> stockDay0005List = stockDay0005Service.selectByCodeAndExPage(page05,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0005> stockDayScience0005List = stockDayScience0005Service.selectByPage(page05c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList5=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList5=new ArrayList<>();
                    for (StockDay0005 stockDay0005:stockDay0005List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0005,stockDayAll);
                        stockDayAllList5.add(stockDayAll);
                    }
                    for (StockDayScience0005 stockDayScience0005:stockDayScience0005List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0005,stockDayScience);
                        stockDayScienceList5.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399001.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction100(stockDayAllList5,stockDayScienceList5,stockDayAllList399001,stockDayScienceList399001,stockDayVoList);
                    continue;
                case "0006":
                    Page<StockDay0006> page06 = new Page<>(1, 60);
                    Page<StockDayScience0006> page06c=new Page<>(1,60);
                    List<StockDay0006> stockDay0006List = stockDay0006Service.selectByCodeAndExPage(page06,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0006> stockDayScience0006List = stockDayScience0006Service.selectByPage(page06c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList6=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList6=new ArrayList<>();
                    for (StockDay0006 stockDay0006:stockDay0006List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0006,stockDayAll);
                        stockDayAllList6.add(stockDayAll);
                    }
                    for (StockDayScience0006 stockDayScience0006:stockDayScience0006List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0006,stockDayScience);
                        stockDayScienceList6.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399001.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction100(stockDayAllList6,stockDayScienceList6,stockDayAllList399001,stockDayScienceList399001,stockDayVoList);
                    continue;
                case "0007":
                    Page<StockDay0007> page07 = new Page<>(1, 60);
                    Page<StockDayScience0007> page07c=new Page<>(1,60);
                    List<StockDay0007> stockDay0007List = stockDay0007Service.selectByCodeAndExPage(page07,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0007> stockDayScience0007List = stockDayScience0007Service.selectByPage(page07c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList7=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList7=new ArrayList<>();
                    for (StockDay0007 stockDay0007:stockDay0007List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0007,stockDayAll);
                        stockDayAllList7.add(stockDayAll);
                    }
                    for (StockDayScience0007 stockDayScience0007:stockDayScience0007List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0007,stockDayScience);
                        stockDayScienceList7.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399001.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction100(stockDayAllList7,stockDayScienceList7,stockDayAllList399001,stockDayScienceList399001,stockDayVoList);
                    continue;
                case "0008":
                    Page<StockDay0008> page08 = new Page<>(1, 60);
                    Page<StockDayScience0008> page08c=new Page<>(1,60);
                    List<StockDay0008> stockDay0008List = stockDay0008Service.selectByCodeAndExPage(page08,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0008> stockDayScience0008List = stockDayScience0008Service.selectByPage(page08c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList8=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList8=new ArrayList<>();
                    for (StockDay0008 stockDay0008:stockDay0008List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0008,stockDayAll);
                        stockDayAllList8.add(stockDayAll);
                    }
                    for (StockDayScience0008 stockDayScience0008:stockDayScience0008List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0008,stockDayScience);
                        stockDayScienceList8.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399001.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction100(stockDayAllList8,stockDayScienceList8,stockDayAllList399001,stockDayScienceList399001,stockDayVoList);
                    continue;
                case "0009":
                    Page<StockDay0009> page09 = new Page<>(1, 60);
                    Page<StockDayScience0009> page09c=new Page<>(1,60);
                    List<StockDay0009> stockDay0009List = stockDay0009Service.selectByCodeAndExPage(page09,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0009> stockDayScience0009List = stockDayScience0009Service.selectByPage(page09c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList9=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList9=new ArrayList<>();
                    for (StockDay0009 stockDay0009:stockDay0009List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0009,stockDayAll);
                        stockDayAllList9.add(stockDayAll);
                    }
                    for (StockDayScience0009 stockDayScience0009:stockDayScience0009List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0009,stockDayScience);
                        stockDayScienceList9.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399001.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction100(stockDayAllList9,stockDayScienceList9,stockDayAllList399001,stockDayScienceList399001,stockDayVoList);
                    continue;
                case "0020":
                    Page<StockDay0020> page20 = new Page<>(1, 60);
                    Page<StockDayScience0020> page20c=new Page<>(1,60);
                    List<StockDay0020> stockDay0020List = stockDay0020Service.selectByCodeAndExPage(page20,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0020> stockDayScience0020List = stockDayScience0020Service.selectByPage(page20c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList20=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList20=new ArrayList<>();
                    for (StockDay0020 stockDay0020:stockDay0020List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0020,stockDayAll);
                        stockDayAllList20.add(stockDayAll);
                    }
                    for (StockDayScience0020 stockDayScience0020:stockDayScience0020List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0020,stockDayScience);
                        stockDayScienceList20.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399005List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399005.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399005List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399005.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction100(stockDayAllList20,stockDayScienceList20,stockDayAllList399005,stockDayScienceList399005,stockDayVoList);
                    continue;
                case "0021":
                    Page<StockDay0021> page21 = new Page<>(1, 60);
                    Page<StockDayScience0021> page21c=new Page<>(1,60);
                    List<StockDay0021> stockDay0021List = stockDay0021Service.selectByCodeAndExPage(page21,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0021> stockDayScience0021List = stockDayScience0021Service.selectByPage(page21c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList21=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList21=new ArrayList<>();
                    for (StockDay0021 stockDay0021:stockDay0021List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0021,stockDayAll);
                        stockDayAllList21.add(stockDayAll);
                    }
                    for (StockDayScience0021 stockDayScience0021:stockDayScience0021List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0021,stockDayScience);
                        stockDayScienceList21.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399005List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399005.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399005List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399005.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction100(stockDayAllList21,stockDayScienceList21,stockDayAllList399005,stockDayScienceList399005,stockDayVoList);
                    continue;
                case "0022":
                    Page<StockDay0022> page22 = new Page<>(1, 60);
                    Page<StockDayScience0022> page22c=new Page<>(1,60);
                    List<StockDay0022> stockDay0022List = stockDay0022Service.selectByCodeAndExPage(page22,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0022> stockDayScience0022List = stockDayScience0022Service.selectByPage(page22c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList22=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList22=new ArrayList<>();
                    for (StockDay0022 stockDay0022:stockDay0022List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0022,stockDayAll);
                        stockDayAllList22.add(stockDayAll);
                    }
                    for (StockDayScience0022 stockDayScience0022:stockDayScience0022List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0022,stockDayScience);
                        stockDayScienceList22.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399005List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399005.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399005List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399005.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction100(stockDayAllList22,stockDayScienceList22,stockDayAllList399005,stockDayScienceList399005,stockDayVoList);
                    continue;
                case "0023":
                    Page<StockDay0023> page23 = new Page<>(1, 60);
                    Page<StockDayScience0023> page23c=new Page<>(1,60);
                    List<StockDay0023> stockDay0023List = stockDay0023Service.selectByCodeAndExPage(page23,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0023> stockDayScience0023List = stockDayScience0023Service.selectByPage(page23c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList23=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList23=new ArrayList<>();
                    for (StockDay0023 stockDay0023:stockDay0023List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0023,stockDayAll);
                        stockDayAllList23.add(stockDayAll);
                    }
                    for (StockDayScience0023 stockDayScience0023:stockDayScience0023List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0023,stockDayScience);
                        stockDayScienceList23.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399005List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399005.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399005List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399005.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction100(stockDayAllList23,stockDayScienceList23,stockDayAllList399005,stockDayScienceList399005,stockDayVoList);
                    continue;
                case "0024":
                    Page<StockDay0024> page24 = new Page<>(1, 60);
                    Page<StockDayScience0024> page24c=new Page<>(1,60);
                    List<StockDay0024> stockDay0024List = stockDay0024Service.selectByCodeAndExPage(page24,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0024> stockDayScience0024List = stockDayScience0024Service.selectByPage(page24c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList24=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList24=new ArrayList<>();
                    for (StockDay0024 stockDay0024:stockDay0024List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0024,stockDayAll);
                        stockDayAllList24.add(stockDayAll);
                    }
                    for (StockDayScience0024 stockDayScience0024:stockDayScience0024List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0024,stockDayScience);
                        stockDayScienceList24.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399005List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399005.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399005List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399005.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction100(stockDayAllList24,stockDayScienceList24,stockDayAllList399005,stockDayScienceList399005,stockDayVoList);
                    continue;
                case "0025":
                    Page<StockDay0025> page25 = new Page<>(1, 60);
                    Page<StockDayScience0025> page25c=new Page<>(1,60);
                    List<StockDay0025> stockDay0025List = stockDay0025Service.selectByCodeAndExPage(page25,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0025> stockDayScience0025List = stockDayScience0025Service.selectByPage(page25c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList25=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList25=new ArrayList<>();
                    for (StockDay0025 stockDay0025:stockDay0025List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0025,stockDayAll);
                        stockDayAllList25.add(stockDayAll);
                    }
                    for (StockDayScience0025 stockDayScience0025:stockDayScience0025List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0025,stockDayScience);
                        stockDayScienceList25.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399005List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399005.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399005List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399005.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction100(stockDayAllList25,stockDayScienceList25,stockDayAllList399005,stockDayScienceList399005,stockDayVoList);
                    continue;
                case "0026":
                    Page<StockDay0026> page26 = new Page<>(1, 60);
                    Page<StockDayScience0026> page26c=new Page<>(1,60);
                    List<StockDay0026> stockDay0026List = stockDay0026Service.selectByCodeAndExPage(page26,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0026> stockDayScience0026List = stockDayScience0026Service.selectByPage(page26c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList26=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList26=new ArrayList<>();
                    for (StockDay0026 stockDay0026:stockDay0026List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0026,stockDayAll);
                        stockDayAllList26.add(stockDayAll);
                    }
                    for (StockDayScience0026 stockDayScience0026:stockDayScience0026List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0026,stockDayScience);
                        stockDayScienceList26.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399005List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399005.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399005List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399005.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction100(stockDayAllList26,stockDayScienceList26,stockDayAllList399005,stockDayScienceList399005,stockDayVoList);
                    continue;
                case "0027":
                    Page<StockDay0027> page27 = new Page<>(1, 60);
                    Page<StockDayScience0027> page27c=new Page<>(1,60);
                    List<StockDay0027> stockDay0027List = stockDay0027Service.selectByCodeAndExPage(page27,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0027> stockDayScience0027List = stockDayScience0027Service.selectByPage(page27c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList27=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList27=new ArrayList<>();
                    for (StockDay0027 stockDay0027:stockDay0027List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0027,stockDayAll);
                        stockDayAllList27.add(stockDayAll);
                    }
                    for (StockDayScience0027 stockDayScience0027:stockDayScience0027List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0027,stockDayScience);
                        stockDayScienceList27.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399005List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399005.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399005List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399005.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction100(stockDayAllList27,stockDayScienceList27,stockDayAllList399005,stockDayScienceList399005,stockDayVoList);
                    continue;
                case "0028":
                    Page<StockDay0028> page28 = new Page<>(1, 60);
                    Page<StockDayScience0028> page28c=new Page<>(1,60);
                    List<StockDay0028> stockDay0028List = stockDay0028Service.selectByCodeAndExPage(page28,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0028> stockDayScience0028List = stockDayScience0028Service.selectByPage(page28c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList28=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList28=new ArrayList<>();
                    for (StockDay0028 stockDay0028:stockDay0028List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0028,stockDayAll);
                        stockDayAllList28.add(stockDayAll);
                    }
                    for (StockDayScience0028 stockDayScience0028:stockDayScience0028List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0028,stockDayScience);
                        stockDayScienceList28.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399005List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399005.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399005List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399005.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction100(stockDayAllList28,stockDayScienceList28,stockDayAllList399005,stockDayScienceList399005,stockDayVoList);
                    continue;
                case "3000":
                    Page<StockDay3000> page30 = new Page<>(1, 60);
                    Page<StockDayScience3000> page30c=new Page<>(1,60);
                    List<StockDay3000> stockDay3000List = stockDay3000Service.selectByCodeAndExPage(page30,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience3000> stockDayScience3000List = stockDayScience3000Service.selectByPage(page30c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList30=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList30=new ArrayList<>();
                    for (StockDay3000 stockDay3000:stockDay3000List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay3000,stockDayAll);
                        stockDayAllList30.add(stockDayAll);
                    }
                    for (StockDayScience3000 stockDayScience3000:stockDayScience3000List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience3000,stockDayScience);
                        stockDayScienceList30.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399006List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399006.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399006List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399006.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction100(stockDayAllList30,stockDayScienceList30,stockDayAllList399006,stockDayScienceList399006,stockDayVoList);
                    continue;
                case "3001":
                    Page<StockDay3001> page31 = new Page<>(1, 60);
                    Page<StockDayScience3001> page31c=new Page<>(1,60);
                    List<StockDay3001> stockDay3001List = stockDay3001Service.selectByCodeAndExPage(page31,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience3001> stockDayScience3001List = stockDayScience3001Service.selectByPage(page31c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList31=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList31=new ArrayList<>();
                    for (StockDay3001 stockDay3001:stockDay3001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay3001,stockDayAll);
                        stockDayAllList31.add(stockDayAll);
                    }
                    for (StockDayScience3001 stockDayScience3001:stockDayScience3001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience3001,stockDayScience);
                        stockDayScienceList31.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399006List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399006.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399006List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399006.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction100(stockDayAllList31,stockDayScienceList31,stockDayAllList399006,stockDayScienceList399006,stockDayVoList);
                    continue;
                case "3002":
                    Page<StockDay3002> page32 = new Page<>(1, 60);
                    Page<StockDayScience3002> page32c=new Page<>(1,60);
                    List<StockDay3002> stockDay3002List = stockDay3002Service.selectByCodeAndExPage(page32,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience3002> stockDayScience3002List = stockDayScience3002Service.selectByPage(page32c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList32=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList32=new ArrayList<>();
                    for (StockDay3002 stockDay3002:stockDay3002List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay3002,stockDayAll);
                        stockDayAllList32.add(stockDayAll);
                    }
                    for (StockDayScience3002 stockDayScience3002:stockDayScience3002List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience3002,stockDayScience);
                        stockDayScienceList32.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399006List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399006.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399006List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399006.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction100(stockDayAllList32,stockDayScienceList32,stockDayAllList399006,stockDayScienceList399006,stockDayVoList);
                    continue;
                case "3003":
                    Page<StockDay3003> page33 = new Page<>(1, 60);
                    Page<StockDayScience3003> page33c=new Page<>(1,60);
                    List<StockDay3003> stockDay3003List = stockDay3003Service.selectByCodeAndExPage(page33,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience3003> stockDayScience3003List = stockDayScience3003Service.selectByPage(page33c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList33=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList33=new ArrayList<>();
                    for (StockDay3003 stockDay3003:stockDay3003List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay3003,stockDayAll);
                        stockDayAllList33.add(stockDayAll);
                    }
                    for (StockDayScience3003 stockDayScience3003:stockDayScience3003List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience3003,stockDayScience);
                        stockDayScienceList33.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399006List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399006.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399006List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399006.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction100(stockDayAllList33,stockDayScienceList33,stockDayAllList399006,stockDayScienceList399006,stockDayVoList);
                    continue;
                case "3004":
                    Page<StockDay3004> page34 = new Page<>(1, 60);
                    Page<StockDayScience3004> page34c=new Page<>(1,60);
                    List<StockDay3004> stockDay3004List = stockDay3004Service.selectByCodeAndExPage(page34,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience3004> stockDayScience3004List = stockDayScience3004Service.selectByPage(page34c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList34=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList34=new ArrayList<>();
                    for (StockDay3004 stockDay3004:stockDay3004List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay3004,stockDayAll);
                        stockDayAllList34.add(stockDayAll);
                    }
                    for (StockDayScience3004 stockDayScience3004:stockDayScience3004List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience3004,stockDayScience);
                        stockDayScienceList34.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399006List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399006.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399006List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399006.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction100(stockDayAllList34,stockDayScienceList34,stockDayAllList399006,stockDayScienceList399006,stockDayVoList);
                    continue;
                case "3005":
                    Page<StockDay3005> page35 = new Page<>(1, 60);
                    Page<StockDayScience3005> page35c=new Page<>(1,60);
                    List<StockDay3005> stockDay3005List = stockDay3005Service.selectByCodeAndExPage(page35,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience3005> stockDayScience3005List = stockDayScience3005Service.selectByPage(page35c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList35=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList35=new ArrayList<>();
                    for (StockDay3005 stockDay3005:stockDay3005List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay3005,stockDayAll);
                        stockDayAllList35.add(stockDayAll);
                    }
                    for (StockDayScience3005 stockDayScience3005:stockDayScience3005List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience3005,stockDayScience);
                        stockDayScienceList35.add(stockDayScience);
                    }
                    for (StockDay399 stockDay399:stockDay399006List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay399,stockDayAll);
                        stockDayAllList399006.add(stockDayAll);
                    }
                    for (StockDayScience399 stockDayScience399:stockDayScience399006List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                        stockDayScienceList399006.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction100(stockDayAllList35,stockDayScienceList35,stockDayAllList399006,stockDayScienceList399006,stockDayVoList);
                    continue;
                case "6000":
                    Page<StockDay6000> page60 = new Page<>(1, 60);
                    Page<StockDayScience6000> page60c=new Page<>(1,60);
                    List<StockDay6000> stockDay6000List = stockDay6000Service.selectByCodeAndExPage(page60,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6000> stockDayScience6000List = stockDayScience6000Service.selectByPage(page60c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList60=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList60=new ArrayList<>();
                    for (StockDay6000 stockDay6000:stockDay6000List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay6000,stockDayAll);
                        stockDayAllList60.add(stockDayAll);
                    }
                    for (StockDayScience6000 stockDayScience6000:stockDayScience6000List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience6000,stockDayScience);
                        stockDayScienceList60.add(stockDayScience);
                    }
                    for (StockDay0000 stockDay0000:stockDay000001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0000,stockDayAll);
                        stockDayAllList0001.add(stockDayAll);
                    }
                    for (StockDayScience0000 stockDayScience0000:stockDayScience000001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                        stockDayScienceList0001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction100(stockDayAllList60,stockDayScienceList60,stockDayAllList0001,stockDayScienceList0001,stockDayVoList);
                    continue;
                case "6001":
                    Page<StockDay6001> page61 = new Page<>(1, 60);
                    Page<StockDayScience6001> page61c=new Page<>(1,60);
                    List<StockDay6001> stockDay6001List = stockDay6001Service.selectByCodeAndExPage(page61,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6001> stockDayScience6001List = stockDayScience6001Service.selectByPage(page61c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList61=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList61=new ArrayList<>();
                    for (StockDay6001 stockDay6001:stockDay6001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay6001,stockDayAll);
                        stockDayAllList61.add(stockDayAll);
                    }
                    for (StockDayScience6001 stockDayScience6001:stockDayScience6001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience6001,stockDayScience);
                        stockDayScienceList61.add(stockDayScience);
                    }
                    for (StockDay0000 stockDay0000:stockDay000001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0000,stockDayAll);
                        stockDayAllList0001.add(stockDayAll);
                    }
                    for (StockDayScience0000 stockDayScience0000:stockDayScience000001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                        stockDayScienceList0001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction100(stockDayAllList61,stockDayScienceList61,stockDayAllList0001,stockDayScienceList0001,stockDayVoList);
                    continue;
                case "6002":
                    Page<StockDay6002> page62 = new Page<>(1, 60);
                    Page<StockDayScience6002> page62c=new Page<>(1,60);
                    List<StockDay6002> stockDay6002List = stockDay6002Service.selectByCodeAndExPage(page62,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6002> stockDayScience6002List = stockDayScience6002Service.selectByPage(page62c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList62=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList62=new ArrayList<>();
                    for (StockDay6002 stockDay6002:stockDay6002List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay6002,stockDayAll);
                        stockDayAllList62.add(stockDayAll);
                    }
                    for (StockDayScience6002 stockDayScience6002:stockDayScience6002List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience6002,stockDayScience);
                        stockDayScienceList62.add(stockDayScience);
                    }
                    for (StockDay0000 stockDay0000:stockDay000001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0000,stockDayAll);
                        stockDayAllList0001.add(stockDayAll);
                    }
                    for (StockDayScience0000 stockDayScience0000:stockDayScience000001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                        stockDayScienceList0001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction100(stockDayAllList62,stockDayScienceList62,stockDayAllList0001,stockDayScienceList0001,stockDayVoList);
                    continue;
                case "6003":
                    Page<StockDay6003> page63 = new Page<>(1, 60);
                    Page<StockDayScience6003> page63c=new Page<>(1,60);
                    List<StockDay6003> stockDay6003List = stockDay6003Service.selectByCodeAndExPage(page63,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6003> stockDayScience6003List = stockDayScience6003Service.selectByPage(page63c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList63=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList63=new ArrayList<>();
                    for (StockDay6003 stockDay6003:stockDay6003List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay6003,stockDayAll);
                        stockDayAllList63.add(stockDayAll);
                    }
                    for (StockDayScience6003 stockDayScience6003:stockDayScience6003List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience6003,stockDayScience);
                        stockDayScienceList63.add(stockDayScience);
                    }
                    for (StockDay0000 stockDay0000:stockDay000001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0000,stockDayAll);
                        stockDayAllList0001.add(stockDayAll);
                    }
                    for (StockDayScience0000 stockDayScience0000:stockDayScience000001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                        stockDayScienceList0001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction100(stockDayAllList63,stockDayScienceList63,stockDayAllList0001,stockDayScienceList0001,stockDayVoList);
                    continue;
                case "6004":
                    Page<StockDay6004> page64 = new Page<>(1, 60);
                    Page<StockDayScience6004> page64c=new Page<>(1,60);
                    List<StockDay6004> stockDay6004List = stockDay6004Service.selectByCodeAndExPage(page64,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6004> stockDayScience6004List = stockDayScience6004Service.selectByPage(page64c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList64=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList64=new ArrayList<>();
                    for (StockDay6004 stockDay6004:stockDay6004List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay6004,stockDayAll);
                        stockDayAllList64.add(stockDayAll);
                    }
                    for (StockDayScience6004 stockDayScience6004:stockDayScience6004List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience6004,stockDayScience);
                        stockDayScienceList64.add(stockDayScience);
                    }
                    for (StockDay0000 stockDay0000:stockDay000001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0000,stockDayAll);
                        stockDayAllList0001.add(stockDayAll);
                    }
                    for (StockDayScience0000 stockDayScience0000:stockDayScience000001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                        stockDayScienceList0001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction100(stockDayAllList64,stockDayScienceList64,stockDayAllList0001,stockDayScienceList0001,stockDayVoList);
                    continue;
                case "6005":
                    Page<StockDay6005> page65 = new Page<>(1, 60);
                    Page<StockDayScience6005> page65c=new Page<>(1,60);
                    List<StockDay6005> stockDay6005List = stockDay6005Service.selectByCodeAndExPage(page65,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6005> stockDayScience6005List = stockDayScience6005Service.selectByPage(page65c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList65=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList65=new ArrayList<>();
                    for (StockDay6005 stockDay6005:stockDay6005List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay6005,stockDayAll);
                        stockDayAllList65.add(stockDayAll);
                    }
                    for (StockDayScience6005 stockDayScience6005:stockDayScience6005List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience6005,stockDayScience);
                        stockDayScienceList65.add(stockDayScience);
                    }
                    for (StockDay0000 stockDay0000:stockDay000001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0000,stockDayAll);
                        stockDayAllList0001.add(stockDayAll);
                    }
                    for (StockDayScience0000 stockDayScience0000:stockDayScience000001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                        stockDayScienceList0001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction100(stockDayAllList65,stockDayScienceList65,stockDayAllList0001,stockDayScienceList0001,stockDayVoList);
                    continue;
                case "6006":
                    Page<StockDay6006> page66 = new Page<>(1, 60);
                    Page<StockDayScience6006> page66c=new Page<>(1,60);
                    List<StockDay6006> stockDay6006List = stockDay6006Service.selectByCodeAndExPage(page66,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6006> stockDayScience6006List = stockDayScience6006Service.selectByPage(page66c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList66=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList66=new ArrayList<>();
                    for (StockDay6006 stockDay6006:stockDay6006List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay6006,stockDayAll);
                        stockDayAllList66.add(stockDayAll);
                    }
                    for (StockDayScience6006 stockDayScience6006:stockDayScience6006List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience6006,stockDayScience);
                        stockDayScienceList66.add(stockDayScience);
                    }
                    for (StockDay0000 stockDay0000:stockDay000001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0000,stockDayAll);
                        stockDayAllList0001.add(stockDayAll);
                    }
                    for (StockDayScience0000 stockDayScience0000:stockDayScience000001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                        stockDayScienceList0001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction100(stockDayAllList66,stockDayScienceList66,stockDayAllList0001,stockDayScienceList0001,stockDayVoList);
                    continue;
                case "6007":
                    Page<StockDay6007> page67 = new Page<>(1, 60);
                    Page<StockDayScience6007> page67c=new Page<>(1,60);
                    List<StockDay6007> stockDay6007List = stockDay6007Service.selectByCodeAndExPage(page67,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6007> stockDayScience6007List = stockDayScience6007Service.selectByPage(page67c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList67=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList67=new ArrayList<>();
                    for (StockDay6007 stockDay6007:stockDay6007List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay6007,stockDayAll);
                        stockDayAllList67.add(stockDayAll);
                    }
                    for (StockDayScience6007 stockDayScience6007:stockDayScience6007List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience6007,stockDayScience);
                        stockDayScienceList67.add(stockDayScience);
                    }
                    for (StockDay0000 stockDay0000:stockDay000001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0000,stockDayAll);
                        stockDayAllList0001.add(stockDayAll);
                    }
                    for (StockDayScience0000 stockDayScience0000:stockDayScience000001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                        stockDayScienceList0001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction100(stockDayAllList67,stockDayScienceList67,stockDayAllList0001,stockDayScienceList0001,stockDayVoList);
                    continue;
                case "6008":
                    Page<StockDay6008> page68 = new Page<>(1, 60);
                    Page<StockDayScience6008> page68c=new Page<>(1,60);
                    List<StockDay6008> stockDay6008List = stockDay6008Service.selectByCodeAndExPage(page68,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6008> stockDayScience6008List = stockDayScience6008Service.selectByPage(page68c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList68=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList68=new ArrayList<>();
                    for (StockDay6008 stockDay6008:stockDay6008List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay6008,stockDayAll);
                        stockDayAllList68.add(stockDayAll);
                    }
                    for (StockDayScience6008 stockDayScience6008:stockDayScience6008List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience6008,stockDayScience);
                        stockDayScienceList68.add(stockDayScience);
                    }
                    for (StockDay0000 stockDay0000:stockDay000001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0000,stockDayAll);
                        stockDayAllList0001.add(stockDayAll);
                    }
                    for (StockDayScience0000 stockDayScience0000:stockDayScience000001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                        stockDayScienceList0001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction100(stockDayAllList68,stockDayScienceList68,stockDayAllList0001,stockDayScienceList0001,stockDayVoList);
                    continue;
                case "6009":
                    Page<StockDay6009> page69 = new Page<>(1, 60);
                    Page<StockDayScience6009> page69c=new Page<>(1,60);
                    List<StockDay6009> stockDay6009List = stockDay6009Service.selectByCodeAndExPage(page69,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6009> stockDayScience6009List = stockDayScience6009Service.selectByPage(page69c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList69=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList69=new ArrayList<>();
                    for (StockDay6009 stockDay6009:stockDay6009List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay6009,stockDayAll);
                        stockDayAllList69.add(stockDayAll);
                    }
                    for (StockDayScience6009 stockDayScience6009:stockDayScience6009List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience6009,stockDayScience);
                        stockDayScienceList69.add(stockDayScience);
                    }
                    for (StockDay0000 stockDay0000:stockDay000001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0000,stockDayAll);
                        stockDayAllList0001.add(stockDayAll);
                    }
                    for (StockDayScience0000 stockDayScience0000:stockDayScience000001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                        stockDayScienceList0001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction100(stockDayAllList69,stockDayScienceList69,stockDayAllList0001,stockDayScienceList0001,stockDayVoList);
                    continue;
                case "6010":
                    Page<StockDay6010> page610 = new Page<>(1, 60);
                    Page<StockDayScience6010> page610c=new Page<>(1,60);
                    List<StockDay6010> stockDay6010List = stockDay6010Service.selectByCodeAndExPage(page610,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6010> stockDayScience6010List = stockDayScience6010Service.selectByPage(page610c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList610=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList610=new ArrayList<>();
                    for (StockDay6010 stockDay6010:stockDay6010List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay6010,stockDayAll);
                        stockDayAllList610.add(stockDayAll);
                    }
                    for (StockDayScience6010 stockDayScience6010:stockDayScience6010List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience6010,stockDayScience);
                        stockDayScienceList610.add(stockDayScience);
                    }
                    for (StockDay0000 stockDay0000:stockDay000001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0000,stockDayAll);
                        stockDayAllList0001.add(stockDayAll);
                    }
                    for (StockDayScience0000 stockDayScience0000:stockDayScience000001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                        stockDayScienceList0001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction100(stockDayAllList610,stockDayScienceList610,stockDayAllList0001,stockDayScienceList0001,stockDayVoList);
                    continue;
                case "6011":
                    Page<StockDay6011> page611 = new Page<>(1, 60);
                    Page<StockDayScience6011> page611c=new Page<>(1,60);
                    List<StockDay6011> stockDay6011List = stockDay6011Service.selectByCodeAndExPage(page611,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6011> stockDayScience6011List = stockDayScience6011Service.selectByPage(page611c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList611=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList611=new ArrayList<>();
                    for (StockDay6011 stockDay6011:stockDay6011List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay6011,stockDayAll);
                        stockDayAllList611.add(stockDayAll);
                    }
                    for (StockDayScience6011 stockDayScience6011:stockDayScience6011List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience6011,stockDayScience);
                        stockDayScienceList611.add(stockDayScience);
                    }
                    for (StockDay0000 stockDay0000:stockDay000001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0000,stockDayAll);
                        stockDayAllList0001.add(stockDayAll);
                    }
                    for (StockDayScience0000 stockDayScience0000:stockDayScience000001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                        stockDayScienceList0001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction100(stockDayAllList611,stockDayScienceList611,stockDayAllList0001,stockDayScienceList0001,stockDayVoList);
                    continue;
                case "6012":
                    Page<StockDay6012> page612 = new Page<>(1, 60);
                    Page<StockDayScience6012> page612c=new Page<>(1,60);
                    List<StockDay6012> stockDay6012List = stockDay6012Service.selectByCodeAndExPage(page612,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6012> stockDayScience6012List = stockDayScience6012Service.selectByPage(page612c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList612=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList612=new ArrayList<>();
                    for (StockDay6012 stockDay6012:stockDay6012List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay6012,stockDayAll);
                        stockDayAllList612.add(stockDayAll);
                    }
                    for (StockDayScience6012 stockDayScience6012:stockDayScience6012List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience6012,stockDayScience);
                        stockDayScienceList612.add(stockDayScience);
                    }
                    for (StockDay0000 stockDay0000:stockDay000001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0000,stockDayAll);
                        stockDayAllList0001.add(stockDayAll);
                    }
                    for (StockDayScience0000 stockDayScience0000:stockDayScience000001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                        stockDayScienceList0001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction100(stockDayAllList612,stockDayScienceList612,stockDayAllList0001,stockDayScienceList0001,stockDayVoList);
                    continue;
                case "6013":
                    Page<StockDay6013> page613 = new Page<>(1, 60);
                    Page<StockDayScience6013> page613c=new Page<>(1,60);
                    List<StockDay6013> stockDay6013List = stockDay6013Service.selectByCodeAndExPage(page613,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6013> stockDayScience6013List = stockDayScience6013Service.selectByPage(page613c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList613=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList613=new ArrayList<>();
                    for (StockDay6013 stockDay6013:stockDay6013List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay6013,stockDayAll);
                        stockDayAllList613.add(stockDayAll);
                    }
                    for (StockDayScience6013 stockDayScience6013:stockDayScience6013List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience6013,stockDayScience);
                        stockDayScienceList613.add(stockDayScience);
                    }
                    for (StockDay0000 stockDay0000:stockDay000001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0000,stockDayAll);
                        stockDayAllList0001.add(stockDayAll);
                    }
                    for (StockDayScience0000 stockDayScience0000:stockDayScience000001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                        stockDayScienceList0001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction100(stockDayAllList613,stockDayScienceList613,stockDayAllList0001,stockDayScienceList0001,stockDayVoList);
                    continue;
                case "6014":
                    Page<StockDay6014> page614 = new Page<>(1, 60);
                    Page<StockDayScience6014> page614c=new Page<>(1,60);
                    List<StockDay6014> stockDay6014List = stockDay6014Service.selectByCodeAndExPage(page614,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6014> stockDayScience6014List = stockDayScience6014Service.selectByPage(page614c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList614=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList614=new ArrayList<>();
                    for (StockDay6014 stockDay6014:stockDay6014List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay6014,stockDayAll);
                        stockDayAllList614.add(stockDayAll);
                    }
                    for (StockDayScience6014 stockDayScience6014:stockDayScience6014List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience6014,stockDayScience);
                        stockDayScienceList614.add(stockDayScience);
                    }
                    for (StockDay0000 stockDay0000:stockDay000001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0000,stockDayAll);
                        stockDayAllList0001.add(stockDayAll);
                    }
                    for (StockDayScience0000 stockDayScience0000:stockDayScience000001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                        stockDayScienceList0001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction100(stockDayAllList614,stockDayScienceList614,stockDayAllList0001,stockDayScienceList0001,stockDayVoList);
                    continue;
                case "6015":
                    Page<StockDay6015> page615 = new Page<>(1, 60);
                    Page<StockDayScience6015> page615c=new Page<>(1,60);
                    List<StockDay6015> stockDay6015List = stockDay6015Service.selectByCodeAndExPage(page615,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6015> stockDayScience6015List = stockDayScience6015Service.selectByPage(page615c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList615=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList615=new ArrayList<>();
                    for (StockDay6015 stockDay6015:stockDay6015List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay6015,stockDayAll);
                        stockDayAllList615.add(stockDayAll);
                    }
                    for (StockDayScience6015 stockDayScience6015:stockDayScience6015List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience6015,stockDayScience);
                        stockDayScienceList615.add(stockDayScience);
                    }
                    for (StockDay0000 stockDay0000:stockDay000001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0000,stockDayAll);
                        stockDayAllList0001.add(stockDayAll);
                    }
                    for (StockDayScience0000 stockDayScience0000:stockDayScience000001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                        stockDayScienceList0001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction100(stockDayAllList615,stockDayScienceList615,stockDayAllList0001,stockDayScienceList0001,stockDayVoList);
                    continue;
                case "6016":
                    Page<StockDay6016> page616 = new Page<>(1, 60);
                    Page<StockDayScience6016> page616c=new Page<>(1,60);
                    List<StockDay6016> stockDay6016List = stockDay6016Service.selectByCodeAndExPage(page616,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6016> stockDayScience6016List = stockDayScience6016Service.selectByPage(page616c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList616=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList616=new ArrayList<>();
                    for (StockDay6016 stockDay6016:stockDay6016List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay6016,stockDayAll);
                        stockDayAllList616.add(stockDayAll);
                    }
                    for (StockDayScience6016 stockDayScience6016:stockDayScience6016List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience6016,stockDayScience);
                        stockDayScienceList616.add(stockDayScience);
                    }
                    for (StockDay0000 stockDay0000:stockDay000001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0000,stockDayAll);
                        stockDayAllList0001.add(stockDayAll);
                    }
                    for (StockDayScience0000 stockDayScience0000:stockDayScience000001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                        stockDayScienceList0001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction100(stockDayAllList616,stockDayScienceList616,stockDayAllList0001,stockDayScienceList0001,stockDayVoList);
                    continue;
                case "6017":
                    Page<StockDay6017> page617 = new Page<>(1, 60);
                    Page<StockDayScience6017> page617c=new Page<>(1,60);
                    List<StockDay6017> stockDay6017List = stockDay6017Service.selectByCodeAndExPage(page617,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6017> stockDayScience6017List = stockDayScience6017Service.selectByPage(page617c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList617=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList617=new ArrayList<>();
                    for (StockDay6017 stockDay6017:stockDay6017List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay6017,stockDayAll);
                        stockDayAllList617.add(stockDayAll);
                    }
                    for (StockDayScience6017 stockDayScience6017:stockDayScience6017List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience6017,stockDayScience);
                        stockDayScienceList617.add(stockDayScience);
                    }
                    for (StockDay0000 stockDay0000:stockDay000001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0000,stockDayAll);
                        stockDayAllList0001.add(stockDayAll);
                    }
                    for (StockDayScience0000 stockDayScience0000:stockDayScience000001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                        stockDayScienceList0001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction100(stockDayAllList617,stockDayScienceList617,stockDayAllList0001,stockDayScienceList0001,stockDayVoList);
                    continue;
                case "6018":
                    Page<StockDay6018> page618 = new Page<>(1, 60);
                    Page<StockDayScience6018> page618c=new Page<>(1,60);
                    List<StockDay6018> stockDay6018List = stockDay6018Service.selectByCodeAndExPage(page618,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6018> stockDayScience6018List = stockDayScience6018Service.selectByPage(page618c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList618=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList618=new ArrayList<>();
                    for (StockDay6018 stockDay6018:stockDay6018List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay6018,stockDayAll);
                        stockDayAllList618.add(stockDayAll);
                    }
                    for (StockDayScience6018 stockDayScience6018:stockDayScience6018List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience6018,stockDayScience);
                        stockDayScienceList618.add(stockDayScience);
                    }
                    for (StockDay0000 stockDay0000:stockDay000001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0000,stockDayAll);
                        stockDayAllList0001.add(stockDayAll);
                    }
                    for (StockDayScience0000 stockDayScience0000:stockDayScience000001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                        stockDayScienceList0001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction100(stockDayAllList618,stockDayScienceList618,stockDayAllList0001,stockDayScienceList0001,stockDayVoList);
                    continue;
                case "6019":
                    Page<StockDay6019> page619 = new Page<>(1, 60);
                    Page<StockDayScience6019> page619c=new Page<>(1,60);
                    List<StockDay6019> stockDay6019List = stockDay6019Service.selectByCodeAndExPage(page619,stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6019> stockDayScience6019List = stockDayScience6019Service.selectByPage(page619c,stockCode.getId(), stockCode.getEx());//技术先
                    List<StockDayAll> stockDayAllList619=new ArrayList<>();
                    List<StockDayScience> stockDayScienceList619=new ArrayList<>();
                    for (StockDay6019 stockDay6019:stockDay6019List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay6019,stockDayAll);
                        stockDayAllList619.add(stockDayAll);
                    }
                    for (StockDayScience6019 stockDayScience6019:stockDayScience6019List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience6019,stockDayScience);
                        stockDayScienceList619.add(stockDayScience);
                    }
                    for (StockDay0000 stockDay0000:stockDay000001List){
                        StockDayAll stockDayAll=new StockDayAll();
                        BeanUtils.copyProperties(stockDay0000,stockDayAll);
                        stockDayAllList0001.add(stockDayAll);
                    }
                    for (StockDayScience0000 stockDayScience0000:stockDayScience000001List){
                        StockDayScience stockDayScience=new StockDayScience();
                        BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                        stockDayScienceList0001.add(stockDayScience);
                    }
                    yanPanDayService.dayYanPanFunction100(stockDayAllList619,stockDayScienceList619,stockDayAllList0001,stockDayScienceList0001,stockDayVoList);
                    continue;
                default:
                    switch (stockCode.getId().substring(0, 3)) {
                        case "001":
                            Page<StockDay001> page001 = new Page<>(1, 60);
                            Page<StockDayScience001> page001c=new Page<>(1,60);
                            List<StockDay001> stockDay001List = stockDay001Service.selectByCodeAndExPage(page001,stockCode.getId(), stockCode.getEx());//日线
                            List<StockDayScience001> stockDayScience001List = stockDayScience001Service.selectByPage(page001c,stockCode.getId(), stockCode.getEx());//技术先
                            List<StockDayAll> stockDayAllList001=new ArrayList<>();
                            List<StockDayScience> stockDayScienceList001=new ArrayList<>();
                            for (StockDay001 stockDay001:stockDay001List){
                                StockDayAll stockDayAll=new StockDayAll();
                                BeanUtils.copyProperties(stockDay001,stockDayAll);
                                stockDayAllList001.add(stockDayAll);
                            }
                            for (StockDayScience001 stockDayScience001:stockDayScience001List){
                                StockDayScience stockDayScience=new StockDayScience();
                                BeanUtils.copyProperties(stockDayScience001,stockDayScience);
                                stockDayScienceList001.add(stockDayScience);
                            }
                            for (StockDay399 stockDay399:stockDay399001List){
                                StockDayAll stockDayAll=new StockDayAll();
                                BeanUtils.copyProperties(stockDay399,stockDayAll);
                                stockDayAllList399001.add(stockDayAll);
                            }
                            for (StockDayScience399 stockDayScience399:stockDayScience399001List){
                                StockDayScience stockDayScience=new StockDayScience();
                                BeanUtils.copyProperties(stockDayScience399,stockDayScience);
                                stockDayScienceList399001.add(stockDayScience);
                            }
                            yanPanDayService.dayYanPanFunction100(stockDayAllList001,stockDayScienceList001,stockDayAllList399001,stockDayScienceList399001,stockDayVoList);
                            continue;
                        case "603":
                            Page<StockDay603> page603 = new Page<>(1, 60);
                            Page<StockDayScience603> page603c=new Page<>(1,60);
                            List<StockDay603> stockDay603List = stockDay603Service.selectByCodeAndExPage(page603,stockCode.getId(), stockCode.getEx());//日线
                            List<StockDayScience603> stockDayScience603List = stockDayScience603Service.selectByPage(page603c,stockCode.getId(), stockCode.getEx());//技术先
                            List<StockDayAll> stockDayAllList603=new ArrayList<>();
                            List<StockDayScience> stockDayScienceList603=new ArrayList<>();
                            for (StockDay603 stockDay603:stockDay603List){
                                StockDayAll stockDayAll=new StockDayAll();
                                BeanUtils.copyProperties(stockDay603,stockDayAll);
                                stockDayAllList603.add(stockDayAll);
                            }
                            for (StockDayScience603 stockDayScience603:stockDayScience603List){
                                StockDayScience stockDayScience=new StockDayScience();
                                BeanUtils.copyProperties(stockDayScience603,stockDayScience);
                                stockDayScienceList603.add(stockDayScience);
                            }
                            for (StockDay0000 stockDay0000:stockDay000001List){
                                StockDayAll stockDayAll=new StockDayAll();
                                BeanUtils.copyProperties(stockDay0000,stockDayAll);
                                stockDayAllList0001.add(stockDayAll);
                            }
                            for (StockDayScience0000 stockDayScience0000:stockDayScience000001List){
                                StockDayScience stockDayScience=new StockDayScience();
                                BeanUtils.copyProperties(stockDayScience0000,stockDayScience);
                                stockDayScienceList0001.add(stockDayScience);
                            }
                            yanPanDayService.dayYanPanFunction100(stockDayAllList603,stockDayScienceList603,stockDayAllList0001,stockDayScienceList0001,stockDayVoList);
                            continue;
                        default:
                            continue;
                    }
            }
        }
        return stockDayVoList;
    }
}
