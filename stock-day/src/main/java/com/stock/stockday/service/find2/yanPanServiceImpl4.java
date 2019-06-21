package com.stock.stockday.service.find2;

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
import com.stock.stockday.service.find2.yanpan.YanPanDayServiceImpl;
import com.stock.stockday.service.find2.yanpan.YanPanDayServiceImpl4;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class yanPanServiceImpl4 implements yanPanService4{
    @Autowired
    private StockCodeService stockCodeService;
    @Autowired
    private StockDay0000Service stockDay0000Service;
    @Autowired
    private StockDayScience0000Service stockDayScience0000Service;
    @Autowired
    private YanPanDayServiceImpl4 yanPanDayService4;
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
    @Autowired
    private StockDay399Service stockDay399Service;
    @Autowired
    private StockDayScience399Service stockDayScience399Service;




    @Override
    public String getYanPan() throws IOException {
        //获取所以编码
        List<StockCode> stockCodeList = stockCodeService.getStockCodeList();
        if (stockCodeList == null || stockCodeList.isEmpty()) {
            return null;
        }

        //遍历
        for (StockCode stockCode : stockCodeList) {
            switch (stockCode.getId().substring(0, 4)) {
                case "0000":
                    if (stockCode.getId().equals("000001") && stockCode.getEx().equals("SH")) {
                        continue;
                    } else {
                        List<StockDay0000> stockDay0000List = stockDay0000Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//日线
                        List<StockDayScience0000> stockDayScience0000List = stockDayScience0000Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//技术先
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
                        yanPanDayService4.dayYanPanFunction(stockDayAllList,stockDayScienceList);
                    }
                    continue;
                case "0001":
                    List<StockDay0001> stockDay0001List = stockDay0001Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0001> stockDayScience0001List = stockDayScience0001Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//技术先
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
                    yanPanDayService4.dayYanPanFunction(stockDayAllList,stockDayScienceList);
                    continue;
                case "0002":
                    List<StockDay0002> stockDay0002List = stockDay0002Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0002> stockDayScience0002List = stockDayScience0002Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//技术先
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
                    yanPanDayService4.dayYanPanFunction(stockDayAllList1,stockDayScienceList1);
                    continue;
                case "0003":
                    List<StockDay0003> stockDay0003List = stockDay0003Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0003> stockDayScience0003List = stockDayScience0003Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//技术先
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
                    yanPanDayService4.dayYanPanFunction(stockDayAllList3,stockDayScienceList3);
                    continue;
                case "0004":
                    List<StockDay0004> stockDay0004List = stockDay0004Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0004> stockDayScience0004List = stockDayScience0004Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//技术先
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
                    yanPanDayService4.dayYanPanFunction(stockDayAllList4,stockDayScienceList4);
                    continue;
                case "0005":
                    List<StockDay0005> stockDay0005List = stockDay0005Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0005> stockDayScience0005List = stockDayScience0005Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//技术先
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
                    yanPanDayService4.dayYanPanFunction(stockDayAllList5,stockDayScienceList5);
                    continue;
                case "0006":
                    List<StockDay0006> stockDay0006List = stockDay0006Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0006> stockDayScience0006List = stockDayScience0006Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//技术先
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
                    yanPanDayService4.dayYanPanFunction(stockDayAllList6,stockDayScienceList6);
                    continue;
                case "0007":
                    List<StockDay0007> stockDay0007List = stockDay0007Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0007> stockDayScience0007List = stockDayScience0007Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//技术先
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
                    yanPanDayService4.dayYanPanFunction(stockDayAllList7,stockDayScienceList7);
                    continue;
                case "0008":
                    List<StockDay0008> stockDay0008List = stockDay0008Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0008> stockDayScience0008List = stockDayScience0008Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//技术先
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
                    yanPanDayService4.dayYanPanFunction(stockDayAllList8,stockDayScienceList8);
                    continue;
                case "0009":
                    List<StockDay0009> stockDay0009List = stockDay0009Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0009> stockDayScience0009List = stockDayScience0009Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//技术先
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
                    yanPanDayService4.dayYanPanFunction(stockDayAllList9,stockDayScienceList9);
                    continue;
                case "0020":
                    List<StockDay0020> stockDay0020List = stockDay0020Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0020> stockDayScience0020List = stockDayScience0020Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//技术先
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
                    yanPanDayService4.dayYanPanFunction(stockDayAllList20,stockDayScienceList20);
                    continue;
                case "0021":
                    List<StockDay0021> stockDay0021List = stockDay0021Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0021> stockDayScience0021List = stockDayScience0021Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//技术先
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
                    yanPanDayService4.dayYanPanFunction(stockDayAllList21,stockDayScienceList21);
                    continue;
                case "0022":
                    List<StockDay0022> stockDay0022List = stockDay0022Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0022> stockDayScience0022List = stockDayScience0022Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//技术先
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
                    yanPanDayService4.dayYanPanFunction(stockDayAllList22,stockDayScienceList22);
                    continue;
                case "0023":
                    List<StockDay0023> stockDay0023List = stockDay0023Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0023> stockDayScience0023List = stockDayScience0023Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//技术先
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
                    yanPanDayService4.dayYanPanFunction(stockDayAllList23,stockDayScienceList23);
                    continue;
                case "0024":
                    List<StockDay0024> stockDay0024List = stockDay0024Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0024> stockDayScience0024List = stockDayScience0024Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//技术先
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
                    yanPanDayService4.dayYanPanFunction(stockDayAllList24,stockDayScienceList24);
                    continue;
                case "0025":
                    List<StockDay0025> stockDay0025List = stockDay0025Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0025> stockDayScience0025List = stockDayScience0025Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//技术先
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
                    yanPanDayService4.dayYanPanFunction(stockDayAllList25,stockDayScienceList25);
                    continue;
                case "0026":
                    List<StockDay0026> stockDay0026List = stockDay0026Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0026> stockDayScience0026List = stockDayScience0026Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//技术先
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
                    yanPanDayService4.dayYanPanFunction(stockDayAllList26,stockDayScienceList26);
                    continue;
                case "0027":
                    List<StockDay0027> stockDay0027List = stockDay0027Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0027> stockDayScience0027List = stockDayScience0027Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//技术先
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
                    yanPanDayService4.dayYanPanFunction(stockDayAllList27,stockDayScienceList27);
                    continue;
                case "0028":
                    List<StockDay0028> stockDay0028List = stockDay0028Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience0028> stockDayScience0028List = stockDayScience0028Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//技术先
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
                    yanPanDayService4.dayYanPanFunction(stockDayAllList28,stockDayScienceList28);
                    continue;
                case "3000":
                    List<StockDay3000> stockDay3000List = stockDay3000Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience3000> stockDayScience3000List = stockDayScience3000Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//技术先
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
                    yanPanDayService4.dayYanPanFunction(stockDayAllList30,stockDayScienceList30);
                    continue;
                case "3001":
                    List<StockDay3001> stockDay3001List = stockDay3001Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience3001> stockDayScience3001List = stockDayScience3001Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//技术先
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
                    yanPanDayService4.dayYanPanFunction(stockDayAllList31,stockDayScienceList31);
                    continue;
                case "3002":
                    List<StockDay3002> stockDay3002List = stockDay3002Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience3002> stockDayScience3002List = stockDayScience3002Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//技术先
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
                    yanPanDayService4.dayYanPanFunction(stockDayAllList32,stockDayScienceList32);
                    continue;
                case "3003":
                    List<StockDay3003> stockDay3003List = stockDay3003Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience3003> stockDayScience3003List = stockDayScience3003Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//技术先
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
                    yanPanDayService4.dayYanPanFunction(stockDayAllList33,stockDayScienceList33);
                    continue;
                case "3004":
                    List<StockDay3004> stockDay3004List = stockDay3004Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience3004> stockDayScience3004List = stockDayScience3004Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//技术先
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
                    yanPanDayService4.dayYanPanFunction(stockDayAllList34,stockDayScienceList34);
                    continue;
                case "3005":
                    List<StockDay3005> stockDay3005List = stockDay3005Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience3005> stockDayScience3005List = stockDayScience3005Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//技术先
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
                    yanPanDayService4.dayYanPanFunction(stockDayAllList35,stockDayScienceList35);
                    continue;
                case "6000":
                    List<StockDay6000> stockDay6000List = stockDay6000Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6000> stockDayScience6000List = stockDayScience6000Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//技术先
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
                    yanPanDayService4.dayYanPanFunction(stockDayAllList60,stockDayScienceList60);
                    continue;
                case "6001":
                    List<StockDay6001> stockDay6001List = stockDay6001Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6001> stockDayScience6001List = stockDayScience6001Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//技术先
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
                    yanPanDayService4.dayYanPanFunction(stockDayAllList61,stockDayScienceList61);
                    continue;
                case "6002":
                    List<StockDay6002> stockDay6002List = stockDay6002Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6002> stockDayScience6002List = stockDayScience6002Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//技术先
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
                    yanPanDayService4.dayYanPanFunction(stockDayAllList62,stockDayScienceList62);
                    continue;
                case "6003":
                    List<StockDay6003> stockDay6003List = stockDay6003Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6003> stockDayScience6003List = stockDayScience6003Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//技术先
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
                    yanPanDayService4.dayYanPanFunction(stockDayAllList63,stockDayScienceList63);
                    continue;
                case "6004":
                    List<StockDay6004> stockDay6004List = stockDay6004Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6004> stockDayScience6004List = stockDayScience6004Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//技术先
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
                    yanPanDayService4.dayYanPanFunction(stockDayAllList64,stockDayScienceList64);
                    continue;
                case "6005":
                    List<StockDay6005> stockDay6005List = stockDay6005Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6005> stockDayScience6005List = stockDayScience6005Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//技术先
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
                    yanPanDayService4.dayYanPanFunction(stockDayAllList65,stockDayScienceList65);
                    continue;
                case "6006":
                    List<StockDay6006> stockDay6006List = stockDay6006Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6006> stockDayScience6006List = stockDayScience6006Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//技术先
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
                    yanPanDayService4.dayYanPanFunction(stockDayAllList66,stockDayScienceList66);
                    continue;
                case "6007":
                    List<StockDay6007> stockDay6007List = stockDay6007Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6007> stockDayScience6007List = stockDayScience6007Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//技术先
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
                    yanPanDayService4.dayYanPanFunction(stockDayAllList67,stockDayScienceList67);
                    continue;
                case "6008":
                    List<StockDay6008> stockDay6008List = stockDay6008Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6008> stockDayScience6008List = stockDayScience6008Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//技术先
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
                    yanPanDayService4.dayYanPanFunction(stockDayAllList68,stockDayScienceList68);
                    continue;
                case "6009":
                    List<StockDay6009> stockDay6009List = stockDay6009Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6009> stockDayScience6009List = stockDayScience6009Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//技术先
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
                    yanPanDayService4.dayYanPanFunction(stockDayAllList69,stockDayScienceList69);
                    continue;
                case "6010":
                    List<StockDay6010> stockDay6010List = stockDay6010Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6010> stockDayScience6010List = stockDayScience6010Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//技术先
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
                    yanPanDayService4.dayYanPanFunction(stockDayAllList610,stockDayScienceList610);
                    continue;
                case "6011":
                    List<StockDay6011> stockDay6011List = stockDay6011Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6011> stockDayScience6011List = stockDayScience6011Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//技术先
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
                    yanPanDayService4.dayYanPanFunction(stockDayAllList611,stockDayScienceList611);
                    continue;
                case "6012":
                    List<StockDay6012> stockDay6012List = stockDay6012Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6012> stockDayScience6012List = stockDayScience6012Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//技术先
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
                    yanPanDayService4.dayYanPanFunction(stockDayAllList612,stockDayScienceList612);
                    continue;
                case "6013":
                    List<StockDay6013> stockDay6013List = stockDay6013Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6013> stockDayScience6013List = stockDayScience6013Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//技术先
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
                    yanPanDayService4.dayYanPanFunction(stockDayAllList613,stockDayScienceList613);
                    continue;
                case "6014":
                    List<StockDay6014> stockDay6014List = stockDay6014Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6014> stockDayScience6014List = stockDayScience6014Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//技术先
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
                    yanPanDayService4.dayYanPanFunction(stockDayAllList614,stockDayScienceList614);
                    continue;
                case "6015":
                    List<StockDay6015> stockDay6015List = stockDay6015Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6015> stockDayScience6015List = stockDayScience6015Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//技术先
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
                    yanPanDayService4.dayYanPanFunction(stockDayAllList615,stockDayScienceList615);
                    continue;
                case "6016":
                    List<StockDay6016> stockDay6016List = stockDay6016Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6016> stockDayScience6016List = stockDayScience6016Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//技术先
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
                    yanPanDayService4.dayYanPanFunction(stockDayAllList616,stockDayScienceList616);
                    continue;
                case "6017":
                    List<StockDay6017> stockDay6017List = stockDay6017Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6017> stockDayScience6017List = stockDayScience6017Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//技术先
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
                    yanPanDayService4.dayYanPanFunction(stockDayAllList617,stockDayScienceList617);
                    continue;
                case "6018":
                    List<StockDay6018> stockDay6018List = stockDay6018Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6018> stockDayScience6018List = stockDayScience6018Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//技术先
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
                    yanPanDayService4.dayYanPanFunction(stockDayAllList618,stockDayScienceList618);
                    continue;
                case "6019":
                    List<StockDay6019> stockDay6019List = stockDay6019Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//日线
                    List<StockDayScience6019> stockDayScience6019List = stockDayScience6019Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//技术先
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
                    yanPanDayService4.dayYanPanFunction(stockDayAllList619,stockDayScienceList619);
                    continue;
                default:
                    switch (stockCode.getId().substring(0, 3)) {
                        case "001":
                            List<StockDay001> stockDay001List = stockDay001Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//日线
                            List<StockDayScience001> stockDayScience001List = stockDayScience001Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//技术先
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
                            yanPanDayService4.dayYanPanFunction(stockDayAllList001,stockDayScienceList001);
                            continue;
                        case "603":
                            List<StockDay603> stockDay603List = stockDay603Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//日线
                            List<StockDayScience603> stockDayScience603List = stockDayScience603Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());//技术先
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
                            yanPanDayService4.dayYanPanFunction(stockDayAllList603,stockDayScienceList603);
                            continue;
                        default:
                            continue;
                    }
            }
        }
        return null;
    }
}
