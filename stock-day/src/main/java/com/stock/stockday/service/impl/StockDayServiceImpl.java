package com.stock.stockday.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.stock.stockday.config.UrlConfig;
import com.stock.stockday.entity.*;
import com.stock.stockday.service.*;
import com.stock.stockday.service.function.DayScience0000FunctionToday;
import com.stock.stockday.service.function.*;
import com.stock.stockday.service.jishuyupan.*;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class StockDayServiceImpl implements StockDayService {
    @Autowired
    private UrlConfig urlConfig;
    @Autowired
    private StockCodeService stockCodeService;
    @Autowired
    private StockDay0000Service stockDay0000Service;
    @Autowired
    private StockDay0001Service stockDay0001Service;
    @Autowired
    private StockDay0002Service stockDay0002Service;
    @Autowired
    private StockDay0003Service stockDay0003Service;
    @Autowired
    private StockDay0004Service stockDay0004Service;
    @Autowired
    private StockDay0005Service stockDay0005Service;
    @Autowired
    private StockDay0006Service stockDay0006Service;
    @Autowired
    private StockDay0007Service stockDay0007Service;
    @Autowired
    private StockDay0008Service stockDay0008Service;
    @Autowired
    private StockDay0009Service stockDay0009Service;
    @Autowired
    private StockDay0020Service stockDay0020Service;
    @Autowired
    private StockDay0021Service stockDay0021Service;
    @Autowired
    private StockDay0022Service stockDay0022Service;
    @Autowired
    private StockDay0023Service stockDay0023Service;
    @Autowired
    private StockDay0024Service stockDay0024Service;
    @Autowired
    private StockDay0025Service stockDay0025Service;
    @Autowired
    private StockDay0026Service stockDay0026Service;
    @Autowired
    private StockDay0027Service stockDay0027Service;
    @Autowired
    private StockDay0028Service stockDay0028Service;
    @Autowired
    private StockDay3000Service stockDay3000Service;
    @Autowired
    private StockDay3001Service stockDay3001Service;
    @Autowired
    private StockDay3002Service stockDay3002Service;
    @Autowired
    private StockDay3003Service stockDay3003Service;
    @Autowired
    private StockDay3004Service stockDay3004Service;
    @Autowired
    private StockDay3005Service stockDay3005Service;
    @Autowired
    private StockDay6000Service stockDay6000Service;
    @Autowired
    private StockDay6001Service stockDay6001Service;
    @Autowired
    private StockDay6002Service stockDay6002Service;
    @Autowired
    private StockDay6003Service stockDay6003Service;
    @Autowired
    private StockDay6004Service stockDay6004Service;
    @Autowired
    private StockDay6005Service stockDay6005Service;
    @Autowired
    private StockDay6006Service stockDay6006Service;
    @Autowired
    private StockDay6007Service stockDay6007Service;
    @Autowired
    private StockDay6008Service stockDay6008Service;
    @Autowired
    private StockDay6009Service stockDay6009Service;
    @Autowired
    private StockDay6010Service stockDay6010Service;
    @Autowired
    private StockDay6011Service stockDay6011Service;
    @Autowired
    private StockDay6012Service stockDay6012Service;
    @Autowired
    private StockDay6013Service stockDay6013Service;
    @Autowired
    private StockDay6014Service stockDay6014Service;
    @Autowired
    private StockDay6015Service stockDay6015Service;
    @Autowired
    private StockDay6016Service stockDay6016Service;
    @Autowired
    private StockDay6017Service stockDay6017Service;
    @Autowired
    private StockDay6018Service stockDay6018Service;
    @Autowired
    private StockDay6019Service stockDay6019Service;
    @Autowired
    private StockDay001Service stockDay001Service;
    @Autowired
    private StockDay399Service stockDay399Service;
    @Autowired
    private StockDay603Service stockDay603Service;
    @Autowired
    private DayScience0000FunctionToday dayScience0000FunctionToday;
    @Autowired
    private DayScience0001FunctionToday dayScience0001FunctionToday;
    @Autowired
    private DayScience0002FunctionToday dayScience0002FunctionToday;
    @Autowired
    private DayScience0003FunctionToday dayScience0003FunctionToday;
    @Autowired
    private DayScience0004FunctionToday dayScience0004FunctionToday;
    @Autowired
    private DayScience0005FunctionToday dayScience0005FunctionToday;
    @Autowired
    private DayScience0006FunctionToday dayScience0006FunctionToday;
    @Autowired
    private DayScience0007FunctionToday dayScience0007FunctionToday;
    @Autowired
    private DayScience0008FunctionToday dayScience0008FunctionToday;
    @Autowired
    private DayScience0009FunctionToday dayScience0009FunctionToday;
    @Autowired
    private DayScience0020FunctionToday dayScience0020FunctionToday;
    @Autowired
    private DayScience0021FunctionToday dayScience0021FunctionToday;
    @Autowired
    private DayScience0022FunctionToday dayScience0022FunctionToday;
    @Autowired
    private DayScience0023FunctionToday dayScience0023FunctionToday;
    @Autowired
    private DayScience0024FunctionToday dayScience0024FunctionToday;
    @Autowired
    private DayScience0025FunctionToday dayScience0025FunctionToday;
    @Autowired
    private DayScience0026FunctionToday dayScience0026FunctionToday;
    @Autowired
    private DayScience0027FunctionToday dayScience0027FunctionToday;
    @Autowired
    private DayScience0028FunctionToday dayScience0028FunctionToday;
    @Autowired
    private DayScience3000FunctionToday dayScience3000FunctionToday;
    @Autowired
    private DayScience3001FunctionToday dayScience3001FunctionToday;
    @Autowired
    private DayScience3002FunctionToday dayScience3002FunctionToday;
    @Autowired
    private DayScience3003FunctionToday dayScience3003FunctionToday;
    @Autowired
    private DayScience3004FunctionToday dayScience3004FunctionToday;
    @Autowired
    private DayScience3005FunctionToday dayScience3005FunctionToday;
    @Autowired
    private DayScience6000FunctionToday dayScience6000FunctionToday;
    @Autowired
    private DayScience6001FunctionToday dayScience6001FunctionToday;
    @Autowired
    private DayScience6002FunctionToday dayScience6002FunctionToday;
    @Autowired
    private DayScience6003FunctionToday dayScience6003FunctionToday;
    @Autowired
    private DayScience6004FunctionToday dayScience6004FunctionToday;
    @Autowired
    private DayScience6005FunctionToday dayScience6005FunctionToday;
    @Autowired
    private DayScience6006FunctionToday dayScience6006FunctionToday;
    @Autowired
    private DayScience6007FunctionToday dayScience6007FunctionToday;
    @Autowired
    private DayScience6008FunctionToday dayScience6008FunctionToday;
    @Autowired
    private DayScience6009FunctionToday dayScience6009FunctionToday;
    @Autowired
    private DayScience6010FunctionToday dayScience6010FunctionToday;
    @Autowired
    private DayScience6011FunctionToday dayScience6011FunctionToday;
    @Autowired
    private DayScience6012FunctionToday dayScience6012FunctionToday;
    @Autowired
    private DayScience6013FunctionToday dayScience6013FunctionToday;
    @Autowired
    private DayScience6014FunctionToday dayScience6014FunctionToday;
    @Autowired
    private DayScience6015FunctionToday dayScience6015FunctionToday;
    @Autowired
    private DayScience6016FunctionToday dayScience6016FunctionToday;
    @Autowired
    private DayScience6017FunctionToday dayScience6017FunctionToday;
    @Autowired
    private DayScience6018FunctionToday dayScience6018FunctionToday;
    @Autowired
    private DayScience6019FunctionToday dayScience6019FunctionToday;
    @Autowired
    private DayScience001FunctionToday dayScience001FunctionToday;
    @Autowired
    private DayScience399FunctionToday dayScience399FunctionToday;
    @Autowired
    private DayScience603FunctionToday dayScience603FunctionToday;
    @Autowired
    private DayYuPan0000Function dayYuPan0000Function;
    @Autowired
    private DayYuPan0001Function dayYuPan0001Function;
    @Autowired
    private DayYuPan0002Function dayYuPan0002Function;
    @Autowired
    private DayYuPan0003Function dayYuPan0003Function;
    @Autowired
    private DayYuPan0004Function dayYuPan0004Function;
    @Autowired
    private DayYuPan0005Function dayYuPan0005Function;
    @Autowired
    private DayYuPan0006Function dayYuPan0006Function;
    @Autowired
    private DayYuPan0007Function dayYuPan0007Function;
    @Autowired
    private DayYuPan0008Function dayYuPan0008Function;
    @Autowired
    private DayYuPan0009Function dayYuPan0009Function;
    @Autowired
    private DayYuPan0020Function dayYuPan0020Function;
    @Autowired
    private DayYuPan0021Function dayYuPan0021Function;
    @Autowired
    private DayYuPan0022Function dayYuPan0022Function;
    @Autowired
    private DayYuPan0023Function dayYuPan0023Function;
    @Autowired
    private DayYuPan0024Function dayYuPan0024Function;
    @Autowired
    private DayYuPan0025Function dayYuPan0025Function;
    @Autowired
    private DayYuPan0026Function dayYuPan0026Function;
    @Autowired
    private DayYuPan0027Function dayYuPan0027Function;
    @Autowired
    private DayYuPan0028Function dayYuPan0028Function;
    @Autowired
    private DayYuPan3000Function dayYuPan3000Function;
    @Autowired
    private DayYuPan3001Function dayYuPan3001Function;
    @Autowired
    private DayYuPan3002Function dayYuPan3002Function;
    @Autowired
    private DayYuPan3003Function dayYuPan3003Function;
    @Autowired
    private DayYuPan3004Function dayYuPan3004Function;
    @Autowired
    private DayYuPan3005Function dayYuPan3005Function;
    @Autowired
    private DayYuPan6000Function dayYuPan6000Function;
    @Autowired
    private DayYuPan6001Function dayYuPan6001Function;
    @Autowired
    private DayYuPan6002Function dayYuPan6002Function;
    @Autowired
    private DayYuPan6003Function dayYuPan6003Function;
    @Autowired
    private DayYuPan6004Function dayYuPan6004Function;
    @Autowired
    private DayYuPan6005Function dayYuPan6005Function;
    @Autowired
    private DayYuPan6006Function dayYuPan6006Function;
    @Autowired
    private DayYuPan6007Function dayYuPan6007Function;
    @Autowired
    private DayYuPan6008Function dayYuPan6008Function;
    @Autowired
    private DayYuPan6009Function dayYuPan6009Function;
    @Autowired
    private DayYuPan6010Function dayYuPan6010Function;
    @Autowired
    private DayYuPan6011Function dayYuPan6011Function;
    @Autowired
    private DayYuPan6012Function dayYuPan6012Function;
    @Autowired
    private DayYuPan6013Function dayYuPan6013Function;
    @Autowired
    private DayYuPan6014Function dayYuPan6014Function;
    @Autowired
    private DayYuPan6015Function dayYuPan6015Function;
    @Autowired
    private DayYuPan6016Function dayYuPan6016Function;
    @Autowired
    private DayYuPan6017Function dayYuPan6017Function;
    @Autowired
    private DayYuPan6018Function dayYuPan6018Function;
    @Autowired
    private DayYuPan6019Function dayYuPan6019Function;
    @Autowired
    private DayYuPan603Function dayYuPan603Function;
    @Autowired
    private DayYuPan001Function dayYuPan001Function;


    @Override
    public boolean getAllDate() throws IOException, ParseException {
        List<StockCode> stockCodeList = stockCodeService.getStockCodeList();
        if (stockCodeList == null || stockCodeList.isEmpty()) {
            return false;
        }
        for (StockCode stockCode : stockCodeList) {
            String url = urlConfig.getStockUrl();
            //获取时间和编码
            String code = getEncoding(stockCode);
            String beginTime = "20190528";
            String endTime;
//            try {
                endTime = "20190528";//parse(new Date());
//            } catch (ParseException e) {
//                return false;
//            }
            //替换
            url = url.replace("#code#", code);
            url = url.replace("#beginTime#", beginTime);
            url = url.replace("#endTime#", endTime);
            //请求和处理数据
            //生成URL的
            URL getUrl = new URL(url);
            //HTTP通讯连接打开
            HttpURLConnection connection = (HttpURLConnection) getUrl.openConnection();
            //建立连接
            connection.connect();
            //获取连接流
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            int count = 1;
            switch (stockCode.getId().substring(0, 4)) {
                case "0000":
                    count = 1;
                    while ((line = reader.readLine()) != null) {
                        if (count == 1) {
                            count++;
                            continue;
                        }
                        //获取每一行数据
                        String[] lines = line.split(",");
                        //存入到对于的对象中
                        StockDay0000 stockDay0000 = new StockDay0000();
                        stockDay0000.setDate(parseDate(lines[0]));
                        stockDay0000.setCodeId(stockCode.getId());
                        stockDay0000.setCodeEx(stockCode.getEx());
                        stockDay0000.setOpeningPrice(getBigDecimal(lines[6]));
                        stockDay0000.setClosingPrice(getBigDecimal(lines[3]));
                        stockDay0000.setFoot(getBigDecimal(lines[5]));
                        stockDay0000.setTopside(getBigDecimal(lines[4]));
                        stockDay0000.setChangePoints(getBigDecimal(lines[8]));
                        stockDay0000.setRateOfChange(getBigDecimal(lines[9]));
                        stockDay0000.setMakeQuantity(getBigDecimal(lines[11]));
                        stockDay0000.setMakePrice(getBigDecimal(lines[12]));
                        stockDay0000.setTurnoverRate(getBigDecimal(lines[10]));
                        stockDay0000.setLclosePrice(getBigDecimal(lines[7]));
                        if (stockCode.getEx().equals("SH") && stockCode.getId().equals("000001")) {

                        } else {
                            stockDay0000.setTcap(getBigDecimal(lines[13]));
                            stockDay0000.setMcap(getBigDecimal(lines[14]));
                        }
                        //调用技术解析
                        dayScience0000FunctionToday.dayScience0000Function(stockDay0000);
                        //保存
                        stockDay0000Service.save(stockDay0000);
//                        stockDay0000List.add(stockDay0000);

                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    //存入数据库
//                    stockDay0000Service.saveBatch(stockDay0000List);
                    continue;
                case "0001":
                    List<StockDay0001> stockDay0001List = new ArrayList<>();
                    count=1;
                    while ((line = reader.readLine()) != null) {
                        if (count==1){
                            count++;
                            continue;
                        }
                        //获取每一行数据
                        String[] lines = line.split(",");
                        //存入到对于的对象中
                        StockDay0001 stockDay0001 = new StockDay0001();
                        stockDay0001.setDate(parseDate(lines[0]));
                        stockDay0001.setCodeId(stockCode.getId());
                        stockDay0001.setCodeEx(stockCode.getEx());
                        stockDay0001.setOpeningPrice(getBigDecimal(lines[6]));
                        stockDay0001.setClosingPrice(getBigDecimal(lines[3]));
                        stockDay0001.setFoot(getBigDecimal(lines[5]));
                        stockDay0001.setTopside(getBigDecimal(lines[4]));
                        stockDay0001.setChangePoints(getBigDecimal(lines[8]));
                        stockDay0001.setRateOfChange(getBigDecimal(lines[9]));
                        stockDay0001.setMakeQuantity(getBigDecimal(lines[11]));
                        stockDay0001.setMakePrice(getBigDecimal(lines[12]));
                        stockDay0001.setTurnoverRate(getBigDecimal(lines[10]));
                        stockDay0001.setTcap(getBigDecimal(lines[13]));
                        stockDay0001.setMcap(getBigDecimal(lines[14]));
                        stockDay0001.setLclosePrice(getBigDecimal(lines[7]));
                        dayScience0001FunctionToday.dayScience0001Function(stockDay0001);
                        stockDay0001Service.save(stockDay0001);
//                        stockDay0001List.add(stockDay0001);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    //存入数据库
//                    stockDay0001Service.saveBatch(stockDay0001List);
                    continue;
                case "0002":
                    List<StockDay0002> stockDay0002List = new ArrayList<>();
                    count=1;
                    while ((line = reader.readLine()) != null) {
                        if (count==1){
                            count++;
                            continue;
                        }
                        //获取每一行数据
                        String[] lines = line.split(",");
                        //存入到对于的对象中
                        StockDay0002 stockDay0002 = new StockDay0002();
                        stockDay0002.setDate(parseDate(lines[0]));
                        stockDay0002.setCodeId(stockCode.getId());
                        stockDay0002.setCodeEx(stockCode.getEx());
                        stockDay0002.setOpeningPrice(getBigDecimal(lines[6]));
                        stockDay0002.setClosingPrice(getBigDecimal(lines[3]));
                        stockDay0002.setFoot(getBigDecimal(lines[5]));
                        stockDay0002.setTopside(getBigDecimal(lines[4]));
                        stockDay0002.setChangePoints(getBigDecimal(lines[8]));
                        stockDay0002.setRateOfChange(getBigDecimal(lines[9]));
                        stockDay0002.setMakeQuantity(getBigDecimal(lines[11]));
                        stockDay0002.setMakePrice(getBigDecimal(lines[12]));
                        stockDay0002.setTurnoverRate(getBigDecimal(lines[10]));
                        stockDay0002.setTcap(getBigDecimal(lines[13]));
                        stockDay0002.setMcap(getBigDecimal(lines[14]));
                        stockDay0002.setLclosePrice(getBigDecimal(lines[7]));
                        dayScience0002FunctionToday.dayScience0002Function(stockDay0002);
                        stockDay0002Service.save(stockDay0002);
//                        stockDay0002List.add(stockDay0002);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    //存入数据库
//                    stockDay0002Service.saveBatch(stockDay0002List);
                    continue;
                case "0003":
                    List<StockDay0003> stockDay0003List = new ArrayList<>();
                    count=1;
                    while ((line = reader.readLine()) != null) {
                        if (count==1){
                            count++;
                            continue;
                        }
                        //获取每一行数据
                        String[] lines = line.split(",");
                        //存入到对于的对象中
                        StockDay0003 stockDay0003 = new StockDay0003();
                        stockDay0003.setDate(parseDate(lines[0]));
                        stockDay0003.setCodeId(stockCode.getId());
                        stockDay0003.setCodeEx(stockCode.getEx());
                        stockDay0003.setOpeningPrice(getBigDecimal(lines[6]));
                        stockDay0003.setClosingPrice(getBigDecimal(lines[3]));
                        stockDay0003.setFoot(getBigDecimal(lines[5]));
                        stockDay0003.setTopside(getBigDecimal(lines[4]));
                        stockDay0003.setChangePoints(getBigDecimal(lines[8]));
                        stockDay0003.setRateOfChange(getBigDecimal(lines[9]));
                        stockDay0003.setMakeQuantity(getBigDecimal(lines[11]));
                        stockDay0003.setMakePrice(getBigDecimal(lines[12]));
                        stockDay0003.setTurnoverRate(getBigDecimal(lines[10]));
                        stockDay0003.setTcap(getBigDecimal(lines[13]));
                        stockDay0003.setMcap(getBigDecimal(lines[14]));
                        stockDay0003.setLclosePrice(getBigDecimal(lines[7]));
                        dayScience0003FunctionToday.dayScience0003Function(stockDay0003);
                        stockDay0003Service.save(stockDay0003);
//                        stockDay0003List.add(stockDay0003);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    //存入数据库
//                    stockDay0003Service.saveBatch(stockDay0003List);
                    continue;
                case "0004":
                    List<StockDay0004> stockDay0004List = new ArrayList<>();
                    count=1;
                    while ((line = reader.readLine()) != null) {
                        if (count==1){
                            count++;
                            continue;
                        }
                        //获取每一行数据
                        String[] lines = line.split(",");
                        //存入到对于的对象中
                        StockDay0004 stockDay0004 = new StockDay0004();
                        stockDay0004.setDate(parseDate(lines[0]));
                        stockDay0004.setCodeId(stockCode.getId());
                        stockDay0004.setCodeEx(stockCode.getEx());
                        stockDay0004.setOpeningPrice(getBigDecimal(lines[6]));
                        stockDay0004.setClosingPrice(getBigDecimal(lines[3]));
                        stockDay0004.setFoot(getBigDecimal(lines[5]));
                        stockDay0004.setTopside(getBigDecimal(lines[4]));
                        stockDay0004.setChangePoints(getBigDecimal(lines[8]));
                        stockDay0004.setRateOfChange(getBigDecimal(lines[9]));
                        stockDay0004.setMakeQuantity(getBigDecimal(lines[11]));
                        stockDay0004.setMakePrice(getBigDecimal(lines[12]));
                        stockDay0004.setTurnoverRate(getBigDecimal(lines[10]));
                        stockDay0004.setTcap(getBigDecimal(lines[13]));
                        stockDay0004.setMcap(getBigDecimal(lines[14]));
                        stockDay0004.setLclosePrice(getBigDecimal(lines[7]));
                        dayScience0004FunctionToday.dayScience0004Function(stockDay0004);
                        stockDay0004Service.save(stockDay0004);
//                        stockDay0004List.add(stockDay0004);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    //存入数据库
//                    stockDay0004Service.saveBatch(stockDay0004List);
                    continue;
                case "0005":
                    List<StockDay0005> stockDay0005List = new ArrayList<>();
                    count=1;
                    while ((line = reader.readLine()) != null) {
                        if (count==1){
                            count++;
                            continue;
                        }
                        //获取每一行数据
                        String[] lines = line.split(",");
                        //存入到对于的对象中
                        StockDay0005 stockDay0005 = new StockDay0005();
                        stockDay0005.setDate(parseDate(lines[0]));
                        stockDay0005.setCodeId(stockCode.getId());
                        stockDay0005.setCodeEx(stockCode.getEx());
                        stockDay0005.setOpeningPrice(getBigDecimal(lines[6]));
                        stockDay0005.setClosingPrice(getBigDecimal(lines[3]));
                        stockDay0005.setFoot(getBigDecimal(lines[5]));
                        stockDay0005.setTopside(getBigDecimal(lines[4]));
                        stockDay0005.setChangePoints(getBigDecimal(lines[8]));
                        stockDay0005.setRateOfChange(getBigDecimal(lines[9]));
                        stockDay0005.setMakeQuantity(getBigDecimal(lines[11]));
                        stockDay0005.setMakePrice(getBigDecimal(lines[12]));
                        stockDay0005.setTurnoverRate(getBigDecimal(lines[10]));
                        stockDay0005.setTcap(getBigDecimal(lines[13]));
                        stockDay0005.setMcap(getBigDecimal(lines[14]));
                        stockDay0005.setLclosePrice(getBigDecimal(lines[7]));
                        dayScience0005FunctionToday.dayScience0005Function(stockDay0005);
                        stockDay0005Service.save(stockDay0005);
//                        stockDay0005List.add(stockDay0005);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    //存入数据库
//                    stockDay0005Service.saveBatch(stockDay0005List);
                    continue;
                case "0006":
                    List<StockDay0006> stockDay0006List = new ArrayList<>();
                    count=1;
                    while ((line = reader.readLine()) != null) {
                        if (count==1){
                            count++;
                            continue;
                        }
                        //获取每一行数据
                        String[] lines = line.split(",");
                        //存入到对于的对象中
                        StockDay0006 stockDay0006 = new StockDay0006();
                        stockDay0006.setDate(parseDate(lines[0]));
                        stockDay0006.setCodeId(stockCode.getId());
                        stockDay0006.setCodeEx(stockCode.getEx());
                        stockDay0006.setOpeningPrice(getBigDecimal(lines[6]));
                        stockDay0006.setClosingPrice(getBigDecimal(lines[3]));
                        stockDay0006.setFoot(getBigDecimal(lines[5]));
                        stockDay0006.setTopside(getBigDecimal(lines[4]));
                        stockDay0006.setChangePoints(getBigDecimal(lines[8]));
                        stockDay0006.setRateOfChange(getBigDecimal(lines[9]));
                        stockDay0006.setMakeQuantity(getBigDecimal(lines[11]));
                        stockDay0006.setMakePrice(getBigDecimal(lines[12]));
                        stockDay0006.setTurnoverRate(getBigDecimal(lines[10]));
                        stockDay0006.setTcap(getBigDecimal(lines[13]));
                        stockDay0006.setMcap(getBigDecimal(lines[14]));
                        stockDay0006.setLclosePrice(getBigDecimal(lines[7]));
                        dayScience0006FunctionToday.dayScience0006Function(stockDay0006);
                        stockDay0006Service.save(stockDay0006);
//                        stockDay0006List.add(stockDay0006);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    //存入数据库
//                    stockDay0006Service.saveBatch(stockDay0006List);
                    continue;
                case "0007":
                    List<StockDay0007> stockDay0007List = new ArrayList<>();
                    count=1;
                    while ((line = reader.readLine()) != null) {
                        if (count==1){
                            count++;
                            continue;
                        }
                        //获取每一行数据
                        String[] lines = line.split(",");
                        //存入到对于的对象中
                        StockDay0007 stockDay0007 = new StockDay0007();
                        stockDay0007.setDate(parseDate(lines[0]));
                        stockDay0007.setCodeId(stockCode.getId());
                        stockDay0007.setCodeEx(stockCode.getEx());
                        stockDay0007.setOpeningPrice(getBigDecimal(lines[6]));
                        stockDay0007.setClosingPrice(getBigDecimal(lines[3]));
                        stockDay0007.setFoot(getBigDecimal(lines[5]));
                        stockDay0007.setTopside(getBigDecimal(lines[4]));
                        stockDay0007.setChangePoints(getBigDecimal(lines[8]));
                        stockDay0007.setRateOfChange(getBigDecimal(lines[9]));
                        stockDay0007.setMakeQuantity(getBigDecimal(lines[11]));
                        stockDay0007.setMakePrice(getBigDecimal(lines[12]));
                        stockDay0007.setTurnoverRate(getBigDecimal(lines[10]));
                        stockDay0007.setTcap(getBigDecimal(lines[13]));
                        stockDay0007.setMcap(getBigDecimal(lines[14]));
                        stockDay0007.setLclosePrice(getBigDecimal(lines[7]));
                        dayScience0007FunctionToday.dayScience0007Function(stockDay0007);
                        stockDay0007Service.save(stockDay0007);
//                        stockDay0007List.add(stockDay0007);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    //存入数据库
//                    stockDay0007Service.saveBatch(stockDay0007List);
                    continue;
                case "0008":
                    List<StockDay0008> stockDay0008List = new ArrayList<>();
                    count=1;
                    while ((line = reader.readLine()) != null) {
                        if (count==1){
                            count++;
                            continue;
                        }
                        //获取每一行数据
                        String[] lines = line.split(",");
                        //存入到对于的对象中
                        StockDay0008 stockDay0008 = new StockDay0008();
                        stockDay0008.setDate(parseDate(lines[0]));
                        stockDay0008.setCodeId(stockCode.getId());
                        stockDay0008.setCodeEx(stockCode.getEx());
                        stockDay0008.setOpeningPrice(getBigDecimal(lines[6]));
                        stockDay0008.setClosingPrice(getBigDecimal(lines[3]));
                        stockDay0008.setFoot(getBigDecimal(lines[5]));
                        stockDay0008.setTopside(getBigDecimal(lines[4]));
                        stockDay0008.setChangePoints(getBigDecimal(lines[8]));
                        stockDay0008.setRateOfChange(getBigDecimal(lines[9]));
                        stockDay0008.setMakeQuantity(getBigDecimal(lines[11]));
                        stockDay0008.setMakePrice(getBigDecimal(lines[12]));
                        stockDay0008.setTurnoverRate(getBigDecimal(lines[10]));
                        stockDay0008.setTcap(getBigDecimal(lines[13]));
                        stockDay0008.setMcap(getBigDecimal(lines[14]));
                        stockDay0008.setLclosePrice(getBigDecimal(lines[7]));
                        dayScience0008FunctionToday.dayScience0008Function(stockDay0008);
                        stockDay0008Service.save(stockDay0008);
//                        stockDay0008List.add(stockDay0008);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    //存入数据库
//                    stockDay0008Service.saveBatch(stockDay0008List);
                    continue;
                case "0009":
                    List<StockDay0009> stockDay0009List = new ArrayList<>();
                    count=1;
                    while ((line = reader.readLine()) != null) {
                        if (count==1){
                            count++;
                            continue;
                        }
                        //获取每一行数据
                        String[] lines = line.split(",");
                        //存入到对于的对象中
                        StockDay0009 stockDay0009 = new StockDay0009();
                        stockDay0009.setDate(parseDate(lines[0]));
                        stockDay0009.setCodeId(stockCode.getId());
                        stockDay0009.setCodeEx(stockCode.getEx());
                        stockDay0009.setOpeningPrice(getBigDecimal(lines[6]));
                        stockDay0009.setClosingPrice(getBigDecimal(lines[3]));
                        stockDay0009.setFoot(getBigDecimal(lines[5]));
                        stockDay0009.setTopside(getBigDecimal(lines[4]));
                        stockDay0009.setChangePoints(getBigDecimal(lines[8]));
                        stockDay0009.setRateOfChange(getBigDecimal(lines[9]));
                        stockDay0009.setMakeQuantity(getBigDecimal(lines[11]));
                        stockDay0009.setMakePrice(getBigDecimal(lines[12]));
                        stockDay0009.setTurnoverRate(getBigDecimal(lines[10]));
                        stockDay0009.setTcap(getBigDecimal(lines[13]));
                        stockDay0009.setMcap(getBigDecimal(lines[14]));
                        stockDay0009.setLclosePrice(getBigDecimal(lines[7]));
                        dayScience0009FunctionToday.dayScience0009Function(stockDay0009);
                        stockDay0009Service.save(stockDay0009);
//                        stockDay0009List.add(stockDay0009);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    //存入数据库
//                    stockDay0009Service.saveBatch(stockDay0009List);
                    continue;
                case "0020":
                    List<StockDay0020> stockDay0020List = new ArrayList<>();
                    count=1;
                    while ((line = reader.readLine()) != null) {
                        if (count==1){
                            count++;
                            continue;
                        }
                        //获取每一行数据
                        String[] lines = line.split(",");
                        //存入到对于的对象中
                        StockDay0020 stockDay0020 = new StockDay0020();
                        stockDay0020.setDate(parseDate(lines[0]));
                        stockDay0020.setCodeId(stockCode.getId());
                        stockDay0020.setCodeEx(stockCode.getEx());
                        stockDay0020.setOpeningPrice(getBigDecimal(lines[6]));
                        stockDay0020.setClosingPrice(getBigDecimal(lines[3]));
                        stockDay0020.setFoot(getBigDecimal(lines[5]));
                        stockDay0020.setTopside(getBigDecimal(lines[4]));
                        stockDay0020.setChangePoints(getBigDecimal(lines[8]));
                        stockDay0020.setRateOfChange(getBigDecimal(lines[9]));
                        stockDay0020.setMakeQuantity(getBigDecimal(lines[11]));
                        stockDay0020.setMakePrice(getBigDecimal(lines[12]));
                        stockDay0020.setTurnoverRate(getBigDecimal(lines[10]));
                        stockDay0020.setTcap(getBigDecimal(lines[13]));
                        stockDay0020.setMcap(getBigDecimal(lines[14]));
                        stockDay0020.setLclosePrice(getBigDecimal(lines[7]));
                        dayScience0020FunctionToday.dayScience0020Function(stockDay0020);
                        stockDay0020Service.save(stockDay0020);
//                        stockDay0020List.add(stockDay0020);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    //存入数据库
//                    stockDay0020Service.saveBatch(stockDay0020List);
                    continue;
                case "0021":
                    List<StockDay0021> stockDay0021List = new ArrayList<>();
                    count=1;
                    while ((line = reader.readLine()) != null) {
                        if (count==1){
                            count++;
                            continue;
                        }
                        //获取每一行数据
                        String[] lines = line.split(",");
                        //存入到对于的对象中
                        StockDay0021 stockDay0021 = new StockDay0021();
                        stockDay0021.setDate(parseDate(lines[0]));
                        stockDay0021.setCodeId(stockCode.getId());
                        stockDay0021.setCodeEx(stockCode.getEx());
                        stockDay0021.setOpeningPrice(getBigDecimal(lines[6]));
                        stockDay0021.setClosingPrice(getBigDecimal(lines[3]));
                        stockDay0021.setFoot(getBigDecimal(lines[5]));
                        stockDay0021.setTopside(getBigDecimal(lines[4]));
                        stockDay0021.setChangePoints(getBigDecimal(lines[8]));
                        stockDay0021.setRateOfChange(getBigDecimal(lines[9]));
                        stockDay0021.setMakeQuantity(getBigDecimal(lines[11]));
                        stockDay0021.setMakePrice(getBigDecimal(lines[12]));
                        stockDay0021.setTurnoverRate(getBigDecimal(lines[10]));
                        stockDay0021.setTcap(getBigDecimal(lines[13]));
                        stockDay0021.setMcap(getBigDecimal(lines[14]));
                        stockDay0021.setLclosePrice(getBigDecimal(lines[7]));
                        dayScience0021FunctionToday.dayScience0021Function(stockDay0021);
                        stockDay0021Service.save(stockDay0021);
//                        stockDay0021List.add(stockDay0021);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    //存入数据库
//                    stockDay0021Service.saveBatch(stockDay0021List);
                    continue;
                case "0022":
                    List<StockDay0022> stockDay0022List = new ArrayList<>();
                    count=1;
                    while ((line = reader.readLine()) != null) {
                        if (count==1){
                            count++;
                            continue;
                        }
                        //获取每一行数据
                        String[] lines = line.split(",");
                        //存入到对于的对象中
                        StockDay0022 stockDay0022 = new StockDay0022();
                        stockDay0022.setDate(parseDate(lines[0]));
                        stockDay0022.setCodeId(stockCode.getId());
                        stockDay0022.setCodeEx(stockCode.getEx());
                        stockDay0022.setOpeningPrice(getBigDecimal(lines[6]));
                        stockDay0022.setClosingPrice(getBigDecimal(lines[3]));
                        stockDay0022.setFoot(getBigDecimal(lines[5]));
                        stockDay0022.setTopside(getBigDecimal(lines[4]));
                        stockDay0022.setChangePoints(getBigDecimal(lines[8]));
                        stockDay0022.setRateOfChange(getBigDecimal(lines[9]));
                        stockDay0022.setMakeQuantity(getBigDecimal(lines[11]));
                        stockDay0022.setMakePrice(getBigDecimal(lines[12]));
                        stockDay0022.setTurnoverRate(getBigDecimal(lines[10]));
                        stockDay0022.setTcap(getBigDecimal(lines[13]));
                        stockDay0022.setMcap(getBigDecimal(lines[14]));
                        stockDay0022.setLclosePrice(getBigDecimal(lines[7]));
                        dayScience0022FunctionToday.dayScience0022Function(stockDay0022);
                        stockDay0022Service.save(stockDay0022);
//                        stockDay0022List.add(stockDay0022);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    //存入数据库
//                    stockDay0022Service.saveBatch(stockDay0022List);
                    continue;
                case "0023":
                    List<StockDay0023> stockDay0023List = new ArrayList<>();
                    count=1;
                    while ((line = reader.readLine()) != null) {
                        if (count==1){
                            count++;
                            continue;
                        }
                        //获取每一行数据
                        String[] lines = line.split(",");
                        //存入到对于的对象中
                        StockDay0023 stockDay0023 = new StockDay0023();
                        stockDay0023.setDate(parseDate(lines[0]));
                        stockDay0023.setCodeId(stockCode.getId());
                        stockDay0023.setCodeEx(stockCode.getEx());
                        stockDay0023.setOpeningPrice(getBigDecimal(lines[6]));
                        stockDay0023.setClosingPrice(getBigDecimal(lines[3]));
                        stockDay0023.setFoot(getBigDecimal(lines[5]));
                        stockDay0023.setTopside(getBigDecimal(lines[4]));
                        stockDay0023.setChangePoints(getBigDecimal(lines[8]));
                        stockDay0023.setRateOfChange(getBigDecimal(lines[9]));
                        stockDay0023.setMakeQuantity(getBigDecimal(lines[11]));
                        stockDay0023.setMakePrice(getBigDecimal(lines[12]));
                        stockDay0023.setTurnoverRate(getBigDecimal(lines[10]));
                        stockDay0023.setTcap(getBigDecimal(lines[13]));
                        stockDay0023.setMcap(getBigDecimal(lines[14]));
                        stockDay0023.setLclosePrice(getBigDecimal(lines[7]));
                        dayScience0023FunctionToday.dayScience0023Function(stockDay0023);
                        stockDay0023Service.save(stockDay0023);
//                        stockDay0023List.add(stockDay0023);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    //存入数据库
//                    stockDay0023Service.saveBatch(stockDay0023List);
                    continue;
                case "0024":
                    List<StockDay0024> stockDay0024List = new ArrayList<>();
                    count=1;
                    while ((line = reader.readLine()) != null) {
                        if (count==1){
                            count++;
                            continue;
                        }
                        //获取每一行数据
                        String[] lines = line.split(",");
                        //存入到对于的对象中
                        StockDay0024 stockDay0024 = new StockDay0024();
                        stockDay0024.setDate(parseDate(lines[0]));
                        stockDay0024.setCodeId(stockCode.getId());
                        stockDay0024.setCodeEx(stockCode.getEx());
                        stockDay0024.setOpeningPrice(getBigDecimal(lines[6]));
                        stockDay0024.setClosingPrice(getBigDecimal(lines[3]));
                        stockDay0024.setFoot(getBigDecimal(lines[5]));
                        stockDay0024.setTopside(getBigDecimal(lines[4]));
                        stockDay0024.setChangePoints(getBigDecimal(lines[8]));
                        stockDay0024.setRateOfChange(getBigDecimal(lines[9]));
                        stockDay0024.setMakeQuantity(getBigDecimal(lines[11]));
                        stockDay0024.setMakePrice(getBigDecimal(lines[12]));
                        stockDay0024.setTurnoverRate(getBigDecimal(lines[10]));
                        stockDay0024.setTcap(getBigDecimal(lines[13]));
                        stockDay0024.setMcap(getBigDecimal(lines[14]));
                        stockDay0024.setLclosePrice(getBigDecimal(lines[7]));
                        dayScience0024FunctionToday.dayScience0024Function(stockDay0024);
                        stockDay0024Service.save(stockDay0024);
//                        stockDay0024List.add(stockDay0024);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    //存入数据库
//                    stockDay0024Service.saveBatch(stockDay0024List);
                    continue;
                case "0025":
                    List<StockDay0025> stockDay0025List = new ArrayList<>();
                    count=1;
                    while ((line = reader.readLine()) != null) {
                        if (count==1){
                            count++;
                            continue;
                        }
                        //获取每一行数据
                        String[] lines = line.split(",");
                        //存入到对于的对象中
                        StockDay0025 stockDay0025 = new StockDay0025();
                        stockDay0025.setDate(parseDate(lines[0]));
                        stockDay0025.setCodeId(stockCode.getId());
                        stockDay0025.setCodeEx(stockCode.getEx());
                        stockDay0025.setOpeningPrice(getBigDecimal(lines[6]));
                        stockDay0025.setClosingPrice(getBigDecimal(lines[3]));
                        stockDay0025.setFoot(getBigDecimal(lines[5]));
                        stockDay0025.setTopside(getBigDecimal(lines[4]));
                        stockDay0025.setChangePoints(getBigDecimal(lines[8]));
                        stockDay0025.setRateOfChange(getBigDecimal(lines[9]));
                        stockDay0025.setMakeQuantity(getBigDecimal(lines[11]));
                        stockDay0025.setMakePrice(getBigDecimal(lines[12]));
                        stockDay0025.setTurnoverRate(getBigDecimal(lines[10]));
                        stockDay0025.setTcap(getBigDecimal(lines[13]));
                        stockDay0025.setMcap(getBigDecimal(lines[14]));
                        stockDay0025.setLclosePrice(getBigDecimal(lines[7]));
                        dayScience0025FunctionToday.dayScience0025Function(stockDay0025);
                        stockDay0025Service.save(stockDay0025);
//                        stockDay0025List.add(stockDay0025);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    //存入数据库
//                    stockDay0025Service.saveBatch(stockDay0025List);
                    continue;
                case "0026":
                    List<StockDay0026> stockDay0026List = new ArrayList<>();
                    count=1;
                    while ((line = reader.readLine()) != null) {
                        if (count==1){
                            count++;
                            continue;
                        }
                        //获取每一行数据
                        String[] lines = line.split(",");
                        //存入到对于的对象中
                        StockDay0026 stockDay0026 = new StockDay0026();
                        stockDay0026.setDate(parseDate(lines[0]));
                        stockDay0026.setCodeId(stockCode.getId());
                        stockDay0026.setCodeEx(stockCode.getEx());
                        stockDay0026.setOpeningPrice(getBigDecimal(lines[6]));
                        stockDay0026.setClosingPrice(getBigDecimal(lines[3]));
                        stockDay0026.setFoot(getBigDecimal(lines[5]));
                        stockDay0026.setTopside(getBigDecimal(lines[4]));
                        stockDay0026.setChangePoints(getBigDecimal(lines[8]));
                        stockDay0026.setRateOfChange(getBigDecimal(lines[9]));
                        stockDay0026.setMakeQuantity(getBigDecimal(lines[11]));
                        stockDay0026.setMakePrice(getBigDecimal(lines[12]));
                        stockDay0026.setTurnoverRate(getBigDecimal(lines[10]));
                        stockDay0026.setTcap(getBigDecimal(lines[13]));
                        stockDay0026.setMcap(getBigDecimal(lines[14]));
                        stockDay0026.setLclosePrice(getBigDecimal(lines[7]));
                        dayScience0026FunctionToday.dayScience0026Function(stockDay0026);
                        stockDay0026Service.save(stockDay0026);
//                        stockDay0026List.add(stockDay0026);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    //存入数据库
//                    stockDay0026Service.saveBatch(stockDay0026List);
                    continue;
                case "0027":
                    List<StockDay0027> stockDay0027List = new ArrayList<>();
                    count=1;
                    while ((line = reader.readLine()) != null) {
                        if (count==1){
                            count++;
                            continue;
                        }
                        //获取每一行数据
                        String[] lines = line.split(",");
                        //存入到对于的对象中
                        StockDay0027 stockDay0027 = new StockDay0027();
                        stockDay0027.setDate(parseDate(lines[0]));
                        stockDay0027.setCodeId(stockCode.getId());
                        stockDay0027.setCodeEx(stockCode.getEx());
                        stockDay0027.setOpeningPrice(getBigDecimal(lines[6]));
                        stockDay0027.setClosingPrice(getBigDecimal(lines[3]));
                        stockDay0027.setFoot(getBigDecimal(lines[5]));
                        stockDay0027.setTopside(getBigDecimal(lines[4]));
                        stockDay0027.setChangePoints(getBigDecimal(lines[8]));
                        stockDay0027.setRateOfChange(getBigDecimal(lines[9]));
                        stockDay0027.setMakeQuantity(getBigDecimal(lines[11]));
                        stockDay0027.setMakePrice(getBigDecimal(lines[12]));
                        stockDay0027.setTurnoverRate(getBigDecimal(lines[10]));
                        stockDay0027.setTcap(getBigDecimal(lines[13]));
                        stockDay0027.setMcap(getBigDecimal(lines[14]));
                        stockDay0027.setLclosePrice(getBigDecimal(lines[7]));
                        dayScience0027FunctionToday.dayScience0027Function(stockDay0027);
                        stockDay0027Service.save(stockDay0027);
//                        stockDay0027List.add(stockDay0027);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    //存入数据库
//                    stockDay0027Service.saveBatch(stockDay0027List);
                    continue;
                case "0028":
                    List<StockDay0028> stockDay0028List = new ArrayList<>();
                    count=1;
                    while ((line = reader.readLine()) != null) {
                        if (count==1){
                            count++;
                            continue;
                        }
                        //获取每一行数据
                        String[] lines = line.split(",");
                        //存入到对于的对象中
                        StockDay0028 stockDay0028 = new StockDay0028();
                        stockDay0028.setDate(parseDate(lines[0]));
                        stockDay0028.setCodeId(stockCode.getId());
                        stockDay0028.setCodeEx(stockCode.getEx());
                        stockDay0028.setOpeningPrice(getBigDecimal(lines[6]));
                        stockDay0028.setClosingPrice(getBigDecimal(lines[3]));
                        stockDay0028.setFoot(getBigDecimal(lines[5]));
                        stockDay0028.setTopside(getBigDecimal(lines[4]));
                        stockDay0028.setChangePoints(getBigDecimal(lines[8]));
                        stockDay0028.setRateOfChange(getBigDecimal(lines[9]));
                        stockDay0028.setMakeQuantity(getBigDecimal(lines[11]));
                        stockDay0028.setMakePrice(getBigDecimal(lines[12]));
                        stockDay0028.setTurnoverRate(getBigDecimal(lines[10]));
                        stockDay0028.setTcap(getBigDecimal(lines[13]));
                        stockDay0028.setMcap(getBigDecimal(lines[14]));
                        stockDay0028.setLclosePrice(getBigDecimal(lines[7]));
                        dayScience0028FunctionToday.dayScience0028Function(stockDay0028);
                        stockDay0028Service.save(stockDay0028);
//                        stockDay0028List.add(stockDay0028);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    //存入数据库
//                    stockDay0028Service.saveBatch(stockDay0028List);
                    continue;
                case "3000":
                    List<StockDay3000> stockDay3000List = new ArrayList<>();
                    count=1;
                    while ((line = reader.readLine()) != null) {
                        if (count==1){
                            count++;
                            continue;
                        }
                        //获取每一行数据
                        String[] lines = line.split(",");
                        //存入到对于的对象中
                        StockDay3000 stockDay3000 = new StockDay3000();
                        stockDay3000.setDate(parseDate(lines[0]));
                        stockDay3000.setCodeId(stockCode.getId());
                        stockDay3000.setCodeEx(stockCode.getEx());
                        stockDay3000.setOpeningPrice(getBigDecimal(lines[6]));
                        stockDay3000.setClosingPrice(getBigDecimal(lines[3]));
                        stockDay3000.setFoot(getBigDecimal(lines[5]));
                        stockDay3000.setTopside(getBigDecimal(lines[4]));
                        stockDay3000.setChangePoints(getBigDecimal(lines[8]));
                        stockDay3000.setRateOfChange(getBigDecimal(lines[9]));
                        stockDay3000.setMakeQuantity(getBigDecimal(lines[11]));
                        stockDay3000.setMakePrice(getBigDecimal(lines[12]));
                        stockDay3000.setTurnoverRate(getBigDecimal(lines[10]));
                        stockDay3000.setTcap(getBigDecimal(lines[13]));
                        stockDay3000.setMcap(getBigDecimal(lines[14]));
                        stockDay3000.setLclosePrice(getBigDecimal(lines[7]));
                        dayScience3000FunctionToday.dayScience3000Function(stockDay3000);
                        stockDay3000Service.save(stockDay3000);
//                        stockDay3000List.add(stockDay3000);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    //存入数据库
//                    stockDay3000Service.saveBatch(stockDay3000List);
                    continue;
                case "3001":
                    List<StockDay3001> stockDay3001List = new ArrayList<>();
                    count=1;
                    while ((line = reader.readLine()) != null) {
                        if (count==1){
                            count++;
                            continue;
                        }
                        //获取每一行数据
                        String[] lines = line.split(",");
                        //存入到对于的对象中
                        StockDay3001 stockDay3001 = new StockDay3001();
                        stockDay3001.setDate(parseDate(lines[0]));
                        stockDay3001.setCodeId(stockCode.getId());
                        stockDay3001.setCodeEx(stockCode.getEx());
                        stockDay3001.setOpeningPrice(getBigDecimal(lines[6]));
                        stockDay3001.setClosingPrice(getBigDecimal(lines[3]));
                        stockDay3001.setFoot(getBigDecimal(lines[5]));
                        stockDay3001.setTopside(getBigDecimal(lines[4]));
                        stockDay3001.setChangePoints(getBigDecimal(lines[8]));
                        stockDay3001.setRateOfChange(getBigDecimal(lines[9]));
                        stockDay3001.setMakeQuantity(getBigDecimal(lines[11]));
                        stockDay3001.setMakePrice(getBigDecimal(lines[12]));
                        stockDay3001.setTurnoverRate(getBigDecimal(lines[10]));
                        stockDay3001.setTcap(getBigDecimal(lines[13]));
                        stockDay3001.setMcap(getBigDecimal(lines[14]));
                        stockDay3001.setLclosePrice(getBigDecimal(lines[7]));
                        dayScience3001FunctionToday.dayScience3001Function(stockDay3001);
                        stockDay3001Service.save(stockDay3001);
//                        stockDay3001List.add(stockDay3001);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    //存入数据库
//                    stockDay3001Service.saveBatch(stockDay3001List);
                    continue;
                case "3002":
                    List<StockDay3002> stockDay3002List = new ArrayList<>();
                    count=1;
                    while ((line = reader.readLine()) != null) {
                        if (count==1){
                            count++;
                            continue;
                        }
                        //获取每一行数据
                        String[] lines = line.split(",");
                        //存入到对于的对象中
                        StockDay3002 stockDay3002 = new StockDay3002();
                        stockDay3002.setDate(parseDate(lines[0]));
                        stockDay3002.setCodeId(stockCode.getId());
                        stockDay3002.setCodeEx(stockCode.getEx());
                        stockDay3002.setOpeningPrice(getBigDecimal(lines[6]));
                        stockDay3002.setClosingPrice(getBigDecimal(lines[3]));
                        stockDay3002.setFoot(getBigDecimal(lines[5]));
                        stockDay3002.setTopside(getBigDecimal(lines[4]));
                        stockDay3002.setChangePoints(getBigDecimal(lines[8]));
                        stockDay3002.setRateOfChange(getBigDecimal(lines[9]));
                        stockDay3002.setMakeQuantity(getBigDecimal(lines[11]));
                        stockDay3002.setMakePrice(getBigDecimal(lines[12]));
                        stockDay3002.setTurnoverRate(getBigDecimal(lines[10]));
                        stockDay3002.setTcap(getBigDecimal(lines[13]));
                        stockDay3002.setMcap(getBigDecimal(lines[14]));
                        stockDay3002.setLclosePrice(getBigDecimal(lines[7]));
                        dayScience3002FunctionToday.dayScience3002Function(stockDay3002);
                        stockDay3002Service.save(stockDay3002);
//                        stockDay3002List.add(stockDay3002);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    //存入数据库
//                    stockDay3002Service.saveBatch(stockDay3002List);
                    continue;
                case "3003":
                    List<StockDay3003> stockDay3003List = new ArrayList<>();
                    count=1;
                    while ((line = reader.readLine()) != null) {
                        if (count==1){
                            count++;
                            continue;
                        }
                        //获取每一行数据
                        String[] lines = line.split(",");
                        //存入到对于的对象中
                        StockDay3003 stockDay3003 = new StockDay3003();
                        stockDay3003.setDate(parseDate(lines[0]));
                        stockDay3003.setCodeId(stockCode.getId());
                        stockDay3003.setCodeEx(stockCode.getEx());
                        stockDay3003.setOpeningPrice(getBigDecimal(lines[6]));
                        stockDay3003.setClosingPrice(getBigDecimal(lines[3]));
                        stockDay3003.setFoot(getBigDecimal(lines[5]));
                        stockDay3003.setTopside(getBigDecimal(lines[4]));
                        stockDay3003.setChangePoints(getBigDecimal(lines[8]));
                        stockDay3003.setRateOfChange(getBigDecimal(lines[9]));
                        stockDay3003.setMakeQuantity(getBigDecimal(lines[11]));
                        stockDay3003.setMakePrice(getBigDecimal(lines[12]));
                        stockDay3003.setTurnoverRate(getBigDecimal(lines[10]));
                        stockDay3003.setTcap(getBigDecimal(lines[13]));
                        stockDay3003.setMcap(getBigDecimal(lines[14]));
                        stockDay3003.setLclosePrice(getBigDecimal(lines[7]));
                        dayScience3003FunctionToday.dayScience3003Function(stockDay3003);
                        stockDay3003Service.save(stockDay3003);
//                        stockDay3003List.add(stockDay3003);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    //存入数据库
//                    stockDay3003Service.saveBatch(stockDay3003List);
                    continue;
                case "3004":
                    List<StockDay3004> stockDay3004List = new ArrayList<>();
                    count=1;
                    while ((line = reader.readLine()) != null) {
                        if (count==1){
                            count++;
                            continue;
                        }
                        //获取每一行数据
                        String[] lines = line.split(",");
                        //存入到对于的对象中
                        StockDay3004 stockDay3004 = new StockDay3004();
                        stockDay3004.setDate(parseDate(lines[0]));
                        stockDay3004.setCodeId(stockCode.getId());
                        stockDay3004.setCodeEx(stockCode.getEx());
                        stockDay3004.setOpeningPrice(getBigDecimal(lines[6]));
                        stockDay3004.setClosingPrice(getBigDecimal(lines[3]));
                        stockDay3004.setFoot(getBigDecimal(lines[5]));
                        stockDay3004.setTopside(getBigDecimal(lines[4]));
                        stockDay3004.setChangePoints(getBigDecimal(lines[8]));
                        stockDay3004.setRateOfChange(getBigDecimal(lines[9]));
                        stockDay3004.setMakeQuantity(getBigDecimal(lines[11]));
                        stockDay3004.setMakePrice(getBigDecimal(lines[12]));
                        stockDay3004.setTurnoverRate(getBigDecimal(lines[10]));
                        stockDay3004.setTcap(getBigDecimal(lines[13]));
                        stockDay3004.setMcap(getBigDecimal(lines[14]));
                        stockDay3004.setLclosePrice(getBigDecimal(lines[7]));
                        dayScience3004FunctionToday.dayScience3004Function(stockDay3004);
                        stockDay3004Service.save(stockDay3004);
//                        stockDay3004List.add(stockDay3004);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    //存入数据库
//                    stockDay3004Service.saveBatch(stockDay3004List);
                    continue;
                case "3005":
                    List<StockDay3005> stockDay3005List = new ArrayList<>();
                    count=1;
                    while ((line = reader.readLine()) != null) {
                        if (count==1){
                            count++;
                            continue;
                        }
                        //获取每一行数据
                        String[] lines = line.split(",");
                        //存入到对于的对象中
                        StockDay3005 stockDay3005 = new StockDay3005();
                        stockDay3005.setDate(parseDate(lines[0]));
                        stockDay3005.setCodeId(stockCode.getId());
                        stockDay3005.setCodeEx(stockCode.getEx());
                        stockDay3005.setOpeningPrice(getBigDecimal(lines[6]));
                        stockDay3005.setClosingPrice(getBigDecimal(lines[3]));
                        stockDay3005.setFoot(getBigDecimal(lines[5]));
                        stockDay3005.setTopside(getBigDecimal(lines[4]));
                        stockDay3005.setChangePoints(getBigDecimal(lines[8]));
                        stockDay3005.setRateOfChange(getBigDecimal(lines[9]));
                        stockDay3005.setMakeQuantity(getBigDecimal(lines[11]));
                        stockDay3005.setMakePrice(getBigDecimal(lines[12]));
                        stockDay3005.setTurnoverRate(getBigDecimal(lines[10]));
                        stockDay3005.setTcap(getBigDecimal(lines[13]));
                        stockDay3005.setMcap(getBigDecimal(lines[14]));
                        stockDay3005.setLclosePrice(getBigDecimal(lines[7]));
                        dayScience3005FunctionToday.dayScience3005Function(stockDay3005);
                        stockDay3005Service.save(stockDay3005);
//                        stockDay3005List.add(stockDay3005);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    //存入数据库
//                    stockDay3005Service.saveBatch(stockDay3005List);
                    continue;
                case "6000":
                    List<StockDay6000> stockDay6000List = new ArrayList<>();
                    count=1;
                    while ((line = reader.readLine()) != null) {
                        if (count==1){
                            count++;
                            continue;
                        }
                        //获取每一行数据
                        String[] lines = line.split(",");
                        //存入到对于的对象中
                        StockDay6000 stockDay6000 = new StockDay6000();
                        stockDay6000.setDate(parseDate(lines[0]));
                        stockDay6000.setCodeId(stockCode.getId());
                        stockDay6000.setCodeEx(stockCode.getEx());
                        stockDay6000.setOpeningPrice(getBigDecimal(lines[6]));
                        stockDay6000.setClosingPrice(getBigDecimal(lines[3]));
                        stockDay6000.setFoot(getBigDecimal(lines[5]));
                        stockDay6000.setTopside(getBigDecimal(lines[4]));
                        stockDay6000.setChangePoints(getBigDecimal(lines[8]));
                        stockDay6000.setRateOfChange(getBigDecimal(lines[9]));
                        stockDay6000.setMakeQuantity(getBigDecimal(lines[11]));
                        stockDay6000.setMakePrice(getBigDecimal(lines[12]));
                        stockDay6000.setTurnoverRate(getBigDecimal(lines[10]));
                        stockDay6000.setTcap(getBigDecimal(lines[13]));
                        stockDay6000.setMcap(getBigDecimal(lines[14]));
                        stockDay6000.setLclosePrice(getBigDecimal(lines[7]));
                        dayScience6000FunctionToday.dayScience6000Function(stockDay6000);
                        stockDay6000Service.save(stockDay6000);
//                        stockDay6000List.add(stockDay6000);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    //存入数据库
//                    stockDay6000Service.saveBatch(stockDay6000List);
                    continue;
                case "6001":
                    List<StockDay6001> stockDay6001List = new ArrayList<>();
                    count=1;
                    while ((line = reader.readLine()) != null) {
                        if (count==1){
                            count++;
                            continue;
                        }
                        //获取每一行数据
                        String[] lines = line.split(",");
                        //存入到对于的对象中
                        StockDay6001 stockDay6001 = new StockDay6001();
                        stockDay6001.setDate(parseDate(lines[0]));
                        stockDay6001.setCodeId(stockCode.getId());
                        stockDay6001.setCodeEx(stockCode.getEx());
                        stockDay6001.setOpeningPrice(getBigDecimal(lines[6]));
                        stockDay6001.setClosingPrice(getBigDecimal(lines[3]));
                        stockDay6001.setFoot(getBigDecimal(lines[5]));
                        stockDay6001.setTopside(getBigDecimal(lines[4]));
                        stockDay6001.setChangePoints(getBigDecimal(lines[8]));
                        stockDay6001.setRateOfChange(getBigDecimal(lines[9]));
                        stockDay6001.setMakeQuantity(getBigDecimal(lines[11]));
                        stockDay6001.setMakePrice(getBigDecimal(lines[12]));
                        stockDay6001.setTurnoverRate(getBigDecimal(lines[10]));
                        stockDay6001.setTcap(getBigDecimal(lines[13]));
                        stockDay6001.setMcap(getBigDecimal(lines[14]));
                        stockDay6001.setLclosePrice(getBigDecimal(lines[7]));
                        dayScience6001FunctionToday.dayScience6001Function(stockDay6001);
                        stockDay6001Service.save(stockDay6001);
//                        stockDay6001List.add(stockDay6001);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    //存入数据库
//                    stockDay6001Service.saveBatch(stockDay6001List);
                    continue;
                case "6002":
                    List<StockDay6002> stockDay6002List = new ArrayList<>();
                    count=1;
                    while ((line = reader.readLine()) != null) {
                        if (count==1){
                            count++;
                            continue;
                        }
                        //获取每一行数据
                        String[] lines = line.split(",");
                        //存入到对于的对象中
                        StockDay6002 stockDay6002 = new StockDay6002();
                        stockDay6002.setDate(parseDate(lines[0]));
                        stockDay6002.setCodeId(stockCode.getId());
                        stockDay6002.setCodeEx(stockCode.getEx());
                        stockDay6002.setOpeningPrice(getBigDecimal(lines[6]));
                        stockDay6002.setClosingPrice(getBigDecimal(lines[3]));
                        stockDay6002.setFoot(getBigDecimal(lines[5]));
                        stockDay6002.setTopside(getBigDecimal(lines[4]));
                        stockDay6002.setChangePoints(getBigDecimal(lines[8]));
                        stockDay6002.setRateOfChange(getBigDecimal(lines[9]));
                        stockDay6002.setMakeQuantity(getBigDecimal(lines[11]));
                        stockDay6002.setMakePrice(getBigDecimal(lines[12]));
                        stockDay6002.setTurnoverRate(getBigDecimal(lines[10]));
                        stockDay6002.setTcap(getBigDecimal(lines[13]));
                        stockDay6002.setMcap(getBigDecimal(lines[14]));
                        stockDay6002.setLclosePrice(getBigDecimal(lines[7]));
                        dayScience6002FunctionToday.dayScience6002Function(stockDay6002);
                        stockDay6002Service.save(stockDay6002);
//                        stockDay6002List.add(stockDay6002);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    //存入数据库
//                    stockDay6002Service.saveBatch(stockDay6002List);
                    continue;
                case "6003":
                    List<StockDay6003> stockDay6003List = new ArrayList<>();
                    count=1;
                    while ((line = reader.readLine()) != null) {
                        if (count==1){
                            count++;
                            continue;
                        }
                        //获取每一行数据
                        String[] lines = line.split(",");
                        //存入到对于的对象中
                        StockDay6003 stockDay6003 = new StockDay6003();
                        stockDay6003.setDate(parseDate(lines[0]));
                        stockDay6003.setCodeId(stockCode.getId());
                        stockDay6003.setCodeEx(stockCode.getEx());
                        stockDay6003.setOpeningPrice(getBigDecimal(lines[6]));
                        stockDay6003.setClosingPrice(getBigDecimal(lines[3]));
                        stockDay6003.setFoot(getBigDecimal(lines[5]));
                        stockDay6003.setTopside(getBigDecimal(lines[4]));
                        stockDay6003.setChangePoints(getBigDecimal(lines[8]));
                        stockDay6003.setRateOfChange(getBigDecimal(lines[9]));
                        stockDay6003.setMakeQuantity(getBigDecimal(lines[11]));
                        stockDay6003.setMakePrice(getBigDecimal(lines[12]));
                        stockDay6003.setTurnoverRate(getBigDecimal(lines[10]));
                        stockDay6003.setTcap(getBigDecimal(lines[13]));
                        stockDay6003.setMcap(getBigDecimal(lines[14]));
                        stockDay6003.setLclosePrice(getBigDecimal(lines[7]));
                        dayScience6003FunctionToday.dayScience6003Function(stockDay6003);
                        stockDay6003Service.save(stockDay6003);
//                        stockDay6003List.add(stockDay6003);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    //存入数据库
//                    stockDay6003Service.saveBatch(stockDay6003List);
                    continue;
                case "6004":
                    List<StockDay6004> stockDay6004List = new ArrayList<>();
                    count=1;
                    while ((line = reader.readLine()) != null) {
                        if (count==1){
                            count++;
                            continue;
                        }
                        //获取每一行数据
                        String[] lines = line.split(",");
                        //存入到对于的对象中
                        StockDay6004 stockDay6004 = new StockDay6004();
                        stockDay6004.setDate(parseDate(lines[0]));
                        stockDay6004.setCodeId(stockCode.getId());
                        stockDay6004.setCodeEx(stockCode.getEx());
                        stockDay6004.setOpeningPrice(getBigDecimal(lines[6]));
                        stockDay6004.setClosingPrice(getBigDecimal(lines[3]));
                        stockDay6004.setFoot(getBigDecimal(lines[5]));
                        stockDay6004.setTopside(getBigDecimal(lines[4]));
                        stockDay6004.setChangePoints(getBigDecimal(lines[8]));
                        stockDay6004.setRateOfChange(getBigDecimal(lines[9]));
                        stockDay6004.setMakeQuantity(getBigDecimal(lines[11]));
                        stockDay6004.setMakePrice(getBigDecimal(lines[12]));
                        stockDay6004.setTurnoverRate(getBigDecimal(lines[10]));
                        stockDay6004.setTcap(getBigDecimal(lines[13]));
                        stockDay6004.setMcap(getBigDecimal(lines[14]));
                        stockDay6004.setLclosePrice(getBigDecimal(lines[7]));
                        dayScience6004FunctionToday.dayScience6004Function(stockDay6004);
                        stockDay6004Service.save(stockDay6004);
//                        stockDay6004List.add(stockDay6004);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    //存入数据库
//                    stockDay6004Service.saveBatch(stockDay6004List);
                    continue;
                case "6005":
                    List<StockDay6005> stockDay6005List = new ArrayList<>();
                    count=1;
                    while ((line = reader.readLine()) != null) {
                        if (count==1){
                            count++;
                            continue;
                        }
                        //获取每一行数据
                        String[] lines = line.split(",");
                        //存入到对于的对象中
                        StockDay6005 stockDay6005 = new StockDay6005();
                        stockDay6005.setDate(parseDate(lines[0]));
                        stockDay6005.setCodeId(stockCode.getId());
                        stockDay6005.setCodeEx(stockCode.getEx());
                        stockDay6005.setOpeningPrice(getBigDecimal(lines[6]));
                        stockDay6005.setClosingPrice(getBigDecimal(lines[3]));
                        stockDay6005.setFoot(getBigDecimal(lines[5]));
                        stockDay6005.setTopside(getBigDecimal(lines[4]));
                        stockDay6005.setChangePoints(getBigDecimal(lines[8]));
                        stockDay6005.setRateOfChange(getBigDecimal(lines[9]));
                        stockDay6005.setMakeQuantity(getBigDecimal(lines[11]));
                        stockDay6005.setMakePrice(getBigDecimal(lines[12]));
                        stockDay6005.setTurnoverRate(getBigDecimal(lines[10]));
                        stockDay6005.setTcap(getBigDecimal(lines[13]));
                        stockDay6005.setMcap(getBigDecimal(lines[14]));
                        stockDay6005.setLclosePrice(getBigDecimal(lines[7]));
                        dayScience6005FunctionToday.dayScience6005Function(stockDay6005);
                        stockDay6005Service.save(stockDay6005);
//                        stockDay6005List.add(stockDay6005);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    //存入数据库
//                    stockDay6005Service.saveBatch(stockDay6005List);
                    continue;
                case "6006":
                    List<StockDay6006> stockDay6006List = new ArrayList<>();
                    count=1;
                    while ((line = reader.readLine()) != null) {
                        if (count==1){
                            count++;
                            continue;
                        }
                        //获取每一行数据
                        String[] lines = line.split(",");
                        //存入到对于的对象中
                        StockDay6006 stockDay6006 = new StockDay6006();
                        stockDay6006.setDate(parseDate(lines[0]));
                        stockDay6006.setCodeId(stockCode.getId());
                        stockDay6006.setCodeEx(stockCode.getEx());
                        stockDay6006.setOpeningPrice(getBigDecimal(lines[6]));
                        stockDay6006.setClosingPrice(getBigDecimal(lines[3]));
                        stockDay6006.setFoot(getBigDecimal(lines[5]));
                        stockDay6006.setTopside(getBigDecimal(lines[4]));
                        stockDay6006.setChangePoints(getBigDecimal(lines[8]));
                        stockDay6006.setRateOfChange(getBigDecimal(lines[9]));
                        stockDay6006.setMakeQuantity(getBigDecimal(lines[11]));
                        stockDay6006.setMakePrice(getBigDecimal(lines[12]));
                        stockDay6006.setTurnoverRate(getBigDecimal(lines[10]));
                        stockDay6006.setTcap(getBigDecimal(lines[13]));
                        stockDay6006.setMcap(getBigDecimal(lines[14]));
                        stockDay6006.setLclosePrice(getBigDecimal(lines[7]));
                        dayScience6006FunctionToday.dayScience6006Function(stockDay6006);
                        stockDay6006Service.save(stockDay6006);
//                        stockDay6006List.add(stockDay6006);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    //存入数据库
//                    stockDay6006Service.saveBatch(stockDay6006List);
                    continue;
                case "6007":
                    List<StockDay6007> stockDay6007List = new ArrayList<>();
                    count=1;
                    while ((line = reader.readLine()) != null) {
                        if (count==1){
                            count++;
                            continue;
                        }
                        //获取每一行数据
                        String[] lines = line.split(",");
                        //存入到对于的对象中
                        StockDay6007 stockDay6007 = new StockDay6007();
                        stockDay6007.setDate(parseDate(lines[0]));
                        stockDay6007.setCodeId(stockCode.getId());
                        stockDay6007.setCodeEx(stockCode.getEx());
                        stockDay6007.setOpeningPrice(getBigDecimal(lines[6]));
                        stockDay6007.setClosingPrice(getBigDecimal(lines[3]));
                        stockDay6007.setFoot(getBigDecimal(lines[5]));
                        stockDay6007.setTopside(getBigDecimal(lines[4]));
                        stockDay6007.setChangePoints(getBigDecimal(lines[8]));
                        stockDay6007.setRateOfChange(getBigDecimal(lines[9]));
                        stockDay6007.setMakeQuantity(getBigDecimal(lines[11]));
                        stockDay6007.setMakePrice(getBigDecimal(lines[12]));
                        stockDay6007.setTurnoverRate(getBigDecimal(lines[10]));
                        stockDay6007.setTcap(getBigDecimal(lines[13]));
                        stockDay6007.setMcap(getBigDecimal(lines[14]));
                        stockDay6007.setLclosePrice(getBigDecimal(lines[7]));
                        dayScience6007FunctionToday.dayScience6007Function(stockDay6007);
                        stockDay6007Service.save(stockDay6007);
//                        stockDay6007List.add(stockDay6007);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    //存入数据库
//                    stockDay6007Service.saveBatch(stockDay6007List);
                    continue;
                case "6008":
                    List<StockDay6008> stockDay6008List = new ArrayList<>();
                    count=1;
                    while ((line = reader.readLine()) != null) {
                        if (count==1){
                            count++;
                            continue;
                        }
                        //获取每一行数据
                        String[] lines = line.split(",");
                        //存入到对于的对象中
                        StockDay6008 stockDay6008 = new StockDay6008();
                        stockDay6008.setDate(parseDate(lines[0]));
                        stockDay6008.setCodeId(stockCode.getId());
                        stockDay6008.setCodeEx(stockCode.getEx());
                        stockDay6008.setOpeningPrice(getBigDecimal(lines[6]));
                        stockDay6008.setClosingPrice(getBigDecimal(lines[3]));
                        stockDay6008.setFoot(getBigDecimal(lines[5]));
                        stockDay6008.setTopside(getBigDecimal(lines[4]));
                        stockDay6008.setChangePoints(getBigDecimal(lines[8]));
                        stockDay6008.setRateOfChange(getBigDecimal(lines[9]));
                        stockDay6008.setMakeQuantity(getBigDecimal(lines[11]));
                        stockDay6008.setMakePrice(getBigDecimal(lines[12]));
                        stockDay6008.setTurnoverRate(getBigDecimal(lines[10]));
                        stockDay6008.setTcap(getBigDecimal(lines[13]));
                        stockDay6008.setMcap(getBigDecimal(lines[14]));
                        stockDay6008.setLclosePrice(getBigDecimal(lines[7]));
                        dayScience6008FunctionToday.dayScience6008Function(stockDay6008);
                        stockDay6008Service.save(stockDay6008);
//                        stockDay6008List.add(stockDay6008);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    //存入数据库
//                    stockDay6008Service.saveBatch(stockDay6008List);
                    continue;
                case "6009":
                    List<StockDay6009> stockDay6009List = new ArrayList<>();
                    count=1;
                    while ((line = reader.readLine()) != null) {
                        if (count==1){
                            count++;
                            continue;
                        }
                        //获取每一行数据
                        String[] lines = line.split(",");
                        //存入到对于的对象中
                        StockDay6009 stockDay6009 = new StockDay6009();
                        stockDay6009.setDate(parseDate(lines[0]));
                        stockDay6009.setCodeId(stockCode.getId());
                        stockDay6009.setCodeEx(stockCode.getEx());
                        stockDay6009.setOpeningPrice(getBigDecimal(lines[6]));
                        stockDay6009.setClosingPrice(getBigDecimal(lines[3]));
                        stockDay6009.setFoot(getBigDecimal(lines[5]));
                        stockDay6009.setTopside(getBigDecimal(lines[4]));
                        stockDay6009.setChangePoints(getBigDecimal(lines[8]));
                        stockDay6009.setRateOfChange(getBigDecimal(lines[9]));
                        stockDay6009.setMakeQuantity(getBigDecimal(lines[11]));
                        stockDay6009.setMakePrice(getBigDecimal(lines[12]));
                        stockDay6009.setTurnoverRate(getBigDecimal(lines[10]));
                        stockDay6009.setTcap(getBigDecimal(lines[13]));
                        stockDay6009.setMcap(getBigDecimal(lines[14]));
                        stockDay6009.setLclosePrice(getBigDecimal(lines[7]));
                        dayScience6009FunctionToday.dayScience6009Function(stockDay6009);
                        stockDay6009Service.save(stockDay6009);
//                        stockDay6009List.add(stockDay6009);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    //存入数据库
//                    stockDay6009Service.saveBatch(stockDay6009List);
                    continue;
                case "6010":
                    List<StockDay6010> stockDay6010List = new ArrayList<>();
                    count=1;
                    while ((line = reader.readLine()) != null) {
                        if (count==1){
                            count++;
                            continue;
                        }
                        //获取每一行数据
                        String[] lines = line.split(",");
                        //存入到对于的对象中
                        StockDay6010 stockDay6010 = new StockDay6010();
                        stockDay6010.setDate(parseDate(lines[0]));
                        stockDay6010.setCodeId(stockCode.getId());
                        stockDay6010.setCodeEx(stockCode.getEx());
                        stockDay6010.setOpeningPrice(getBigDecimal(lines[6]));
                        stockDay6010.setClosingPrice(getBigDecimal(lines[3]));
                        stockDay6010.setFoot(getBigDecimal(lines[5]));
                        stockDay6010.setTopside(getBigDecimal(lines[4]));
                        stockDay6010.setChangePoints(getBigDecimal(lines[8]));
                        stockDay6010.setRateOfChange(getBigDecimal(lines[9]));
                        stockDay6010.setMakeQuantity(getBigDecimal(lines[11]));
                        stockDay6010.setMakePrice(getBigDecimal(lines[12]));
                        stockDay6010.setTurnoverRate(getBigDecimal(lines[10]));
                        stockDay6010.setTcap(getBigDecimal(lines[13]));
                        stockDay6010.setMcap(getBigDecimal(lines[14]));
                        stockDay6010.setLclosePrice(getBigDecimal(lines[7]));
                        dayScience6010FunctionToday.dayScience6010Function(stockDay6010);
                        stockDay6010Service.save(stockDay6010);
//                        stockDay6010List.add(stockDay6010);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    //存入数据库
//                    stockDay6010Service.saveBatch(stockDay6010List);
                    continue;
                case "6011":
                    List<StockDay6011> stockDay6011List = new ArrayList<>();
                    count=1;
                    while ((line = reader.readLine()) != null) {
                        if (count==1){
                            count++;
                            continue;
                        }
                        //获取每一行数据
                        String[] lines = line.split(",");
                        //存入到对于的对象中
                        StockDay6011 stockDay6011 = new StockDay6011();
                        stockDay6011.setDate(parseDate(lines[0]));
                        stockDay6011.setCodeId(stockCode.getId());
                        stockDay6011.setCodeEx(stockCode.getEx());
                        stockDay6011.setOpeningPrice(getBigDecimal(lines[6]));
                        stockDay6011.setClosingPrice(getBigDecimal(lines[3]));
                        stockDay6011.setFoot(getBigDecimal(lines[5]));
                        stockDay6011.setTopside(getBigDecimal(lines[4]));
                        stockDay6011.setChangePoints(getBigDecimal(lines[8]));
                        stockDay6011.setRateOfChange(getBigDecimal(lines[9]));
                        stockDay6011.setMakeQuantity(getBigDecimal(lines[11]));
                        stockDay6011.setMakePrice(getBigDecimal(lines[12]));
                        stockDay6011.setTurnoverRate(getBigDecimal(lines[10]));
                        stockDay6011.setTcap(getBigDecimal(lines[13]));
                        stockDay6011.setMcap(getBigDecimal(lines[14]));
                        stockDay6011.setLclosePrice(getBigDecimal(lines[7]));
                        dayScience6011FunctionToday.dayScience6011Function(stockDay6011);
                        stockDay6011Service.save(stockDay6011);
//                        stockDay6011List.add(stockDay6011);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    //存入数据库
//                    stockDay6011Service.saveBatch(stockDay6011List);
                    continue;
                case "6012":
                    List<StockDay6012> stockDay6012List = new ArrayList<>();
                    count=1;
                    while ((line = reader.readLine()) != null) {
                        if (count==1){
                            count++;
                            continue;
                        }
                        //获取每一行数据
                        String[] lines = line.split(",");
                        //存入到对于的对象中
                        StockDay6012 stockDay6012 = new StockDay6012();
                        stockDay6012.setDate(parseDate(lines[0]));
                        stockDay6012.setCodeId(stockCode.getId());
                        stockDay6012.setCodeEx(stockCode.getEx());
                        stockDay6012.setOpeningPrice(getBigDecimal(lines[6]));
                        stockDay6012.setClosingPrice(getBigDecimal(lines[3]));
                        stockDay6012.setFoot(getBigDecimal(lines[5]));
                        stockDay6012.setTopside(getBigDecimal(lines[4]));
                        stockDay6012.setChangePoints(getBigDecimal(lines[8]));
                        stockDay6012.setRateOfChange(getBigDecimal(lines[9]));
                        stockDay6012.setMakeQuantity(getBigDecimal(lines[11]));
                        stockDay6012.setMakePrice(getBigDecimal(lines[12]));
                        stockDay6012.setTurnoverRate(getBigDecimal(lines[10]));
                        stockDay6012.setTcap(getBigDecimal(lines[13]));
                        stockDay6012.setMcap(getBigDecimal(lines[14]));
                        stockDay6012.setLclosePrice(getBigDecimal(lines[7]));
                        dayScience6012FunctionToday.dayScience6012Function(stockDay6012);
                        stockDay6012Service.save(stockDay6012);
//                        stockDay6012List.add(stockDay6012);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    //存入数据库
//                    stockDay6012Service.saveBatch(stockDay6012List);
                    continue;
                case "6013":
                    List<StockDay6013> stockDay6013List = new ArrayList<>();
                    count=1;
                    while ((line = reader.readLine()) != null) {
                        if (count==1){
                            count++;
                            continue;
                        }
                        //获取每一行数据
                        String[] lines = line.split(",");
                        //存入到对于的对象中
                        StockDay6013 stockDay6013 = new StockDay6013();
                        stockDay6013.setDate(parseDate(lines[0]));
                        stockDay6013.setCodeId(stockCode.getId());
                        stockDay6013.setCodeEx(stockCode.getEx());
                        stockDay6013.setOpeningPrice(getBigDecimal(lines[6]));
                        stockDay6013.setClosingPrice(getBigDecimal(lines[3]));
                        stockDay6013.setFoot(getBigDecimal(lines[5]));
                        stockDay6013.setTopside(getBigDecimal(lines[4]));
                        stockDay6013.setChangePoints(getBigDecimal(lines[8]));
                        stockDay6013.setRateOfChange(getBigDecimal(lines[9]));
                        stockDay6013.setMakeQuantity(getBigDecimal(lines[11]));
                        stockDay6013.setMakePrice(getBigDecimal(lines[12]));
                        stockDay6013.setTurnoverRate(getBigDecimal(lines[10]));
                        stockDay6013.setTcap(getBigDecimal(lines[13]));
                        stockDay6013.setMcap(getBigDecimal(lines[14]));
                        stockDay6013.setLclosePrice(getBigDecimal(lines[7]));
                        dayScience6013FunctionToday.dayScience6013Function(stockDay6013);
                        stockDay6013Service.save(stockDay6013);
//                        stockDay6013List.add(stockDay6013);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    //存入数据库
//                    stockDay6013Service.saveBatch(stockDay6013List);
                    continue;
                case "6014":
                    List<StockDay6014> stockDay6014List = new ArrayList<>();
                    count=1;
                    while ((line = reader.readLine()) != null) {
                        if (count==1){
                            count++;
                            continue;
                        }
                        //获取每一行数据
                        String[] lines = line.split(",");
                        //存入到对于的对象中
                        StockDay6014 stockDay6014 = new StockDay6014();
                        stockDay6014.setDate(parseDate(lines[0]));
                        stockDay6014.setCodeId(stockCode.getId());
                        stockDay6014.setCodeEx(stockCode.getEx());
                        stockDay6014.setOpeningPrice(getBigDecimal(lines[6]));
                        stockDay6014.setClosingPrice(getBigDecimal(lines[3]));
                        stockDay6014.setFoot(getBigDecimal(lines[5]));
                        stockDay6014.setTopside(getBigDecimal(lines[4]));
                        stockDay6014.setChangePoints(getBigDecimal(lines[8]));
                        stockDay6014.setRateOfChange(getBigDecimal(lines[9]));
                        stockDay6014.setMakeQuantity(getBigDecimal(lines[11]));
                        stockDay6014.setMakePrice(getBigDecimal(lines[12]));
                        stockDay6014.setTurnoverRate(getBigDecimal(lines[10]));
                        stockDay6014.setTcap(getBigDecimal(lines[13]));
                        stockDay6014.setMcap(getBigDecimal(lines[14]));
                        stockDay6014.setLclosePrice(getBigDecimal(lines[7]));
                        dayScience6014FunctionToday.dayScience6014Function(stockDay6014);
                        stockDay6014Service.save(stockDay6014);
//                        stockDay6014List.add(stockDay6014);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    //存入数据库
//                    stockDay6014Service.saveBatch(stockDay6014List);
                    continue;
                case "6015":
                    List<StockDay6015> stockDay6015List = new ArrayList<>();
                    count=1;
                    while ((line = reader.readLine()) != null) {
                        if (count==1){
                            count++;
                            continue;
                        }
                        //获取每一行数据
                        String[] lines = line.split(",");
                        //存入到对于的对象中
                        StockDay6015 stockDay6015 = new StockDay6015();
                        stockDay6015.setDate(parseDate(lines[0]));
                        stockDay6015.setCodeId(stockCode.getId());
                        stockDay6015.setCodeEx(stockCode.getEx());
                        stockDay6015.setOpeningPrice(getBigDecimal(lines[6]));
                        stockDay6015.setClosingPrice(getBigDecimal(lines[3]));
                        stockDay6015.setFoot(getBigDecimal(lines[5]));
                        stockDay6015.setTopside(getBigDecimal(lines[4]));
                        stockDay6015.setChangePoints(getBigDecimal(lines[8]));
                        stockDay6015.setRateOfChange(getBigDecimal(lines[9]));
                        stockDay6015.setMakeQuantity(getBigDecimal(lines[11]));
                        stockDay6015.setMakePrice(getBigDecimal(lines[12]));
                        stockDay6015.setTurnoverRate(getBigDecimal(lines[10]));
                        stockDay6015.setTcap(getBigDecimal(lines[13]));
                        stockDay6015.setMcap(getBigDecimal(lines[14]));
                        stockDay6015.setLclosePrice(getBigDecimal(lines[7]));
                        dayScience6015FunctionToday.dayScience6015Function(stockDay6015);
                        stockDay6015Service.save(stockDay6015);
//                        stockDay6015List.add(stockDay6015);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    //存入数据库
//                    stockDay6015Service.saveBatch(stockDay6015List);
                    continue;
                case "6016":
                    List<StockDay6016> stockDay6016List = new ArrayList<>();
                    count=1;
                    while ((line = reader.readLine()) != null) {
                        if (count==1){
                            count++;
                            continue;
                        }
                        //获取每一行数据
                        String[] lines = line.split(",");
                        //存入到对于的对象中
                        StockDay6016 stockDay6016 = new StockDay6016();
                        stockDay6016.setDate(parseDate(lines[0]));
                        stockDay6016.setCodeId(stockCode.getId());
                        stockDay6016.setCodeEx(stockCode.getEx());
                        stockDay6016.setOpeningPrice(getBigDecimal(lines[6]));
                        stockDay6016.setClosingPrice(getBigDecimal(lines[3]));
                        stockDay6016.setFoot(getBigDecimal(lines[5]));
                        stockDay6016.setTopside(getBigDecimal(lines[4]));
                        stockDay6016.setChangePoints(getBigDecimal(lines[8]));
                        stockDay6016.setRateOfChange(getBigDecimal(lines[9]));
                        stockDay6016.setMakeQuantity(getBigDecimal(lines[11]));
                        stockDay6016.setMakePrice(getBigDecimal(lines[12]));
                        stockDay6016.setTurnoverRate(getBigDecimal(lines[10]));
                        stockDay6016.setTcap(getBigDecimal(lines[13]));
                        stockDay6016.setMcap(getBigDecimal(lines[14]));
                        stockDay6016.setLclosePrice(getBigDecimal(lines[7]));
                        dayScience6016FunctionToday.dayScience6016Function(stockDay6016);
                        stockDay6016Service.save(stockDay6016);
//                        stockDay6016List.add(stockDay6016);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    //存入数据库
//                    stockDay6016Service.saveBatch(stockDay6016List);
                    continue;
                case "6017":
                    List<StockDay6017> stockDay6017List = new ArrayList<>();
                    count=1;
                    while ((line = reader.readLine()) != null) {
                        if (count==1){
                            count++;
                            continue;
                        }
                        //获取每一行数据
                        String[] lines = line.split(",");
                        //存入到对于的对象中
                        StockDay6017 stockDay6017 = new StockDay6017();
                        stockDay6017.setDate(parseDate(lines[0]));
                        stockDay6017.setCodeId(stockCode.getId());
                        stockDay6017.setCodeEx(stockCode.getEx());
                        stockDay6017.setOpeningPrice(getBigDecimal(lines[6]));
                        stockDay6017.setClosingPrice(getBigDecimal(lines[3]));
                        stockDay6017.setFoot(getBigDecimal(lines[5]));
                        stockDay6017.setTopside(getBigDecimal(lines[4]));
                        stockDay6017.setChangePoints(getBigDecimal(lines[8]));
                        stockDay6017.setRateOfChange(getBigDecimal(lines[9]));
                        stockDay6017.setMakeQuantity(getBigDecimal(lines[11]));
                        stockDay6017.setMakePrice(getBigDecimal(lines[12]));
                        stockDay6017.setTurnoverRate(getBigDecimal(lines[10]));
                        stockDay6017.setTcap(getBigDecimal(lines[13]));
                        stockDay6017.setMcap(getBigDecimal(lines[14]));
                        stockDay6017.setLclosePrice(getBigDecimal(lines[7]));
                        dayScience6017FunctionToday.dayScience6017Function(stockDay6017);
                        stockDay6017Service.save(stockDay6017);
//                        stockDay6017List.add(stockDay6017);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    //存入数据库
//                    stockDay6017Service.saveBatch(stockDay6017List);
                    continue;
                case "6018":
                    List<StockDay6018> stockDay6018List = new ArrayList<>();
                    count=1;
                    while ((line = reader.readLine()) != null) {
                        if (count==1){
                            count++;
                            continue;
                        }
                        //获取每一行数据
                        String[] lines = line.split(",");
                        //存入到对于的对象中
                        StockDay6018 stockDay6018 = new StockDay6018();
                        stockDay6018.setDate(parseDate(lines[0]));
                        stockDay6018.setCodeId(stockCode.getId());
                        stockDay6018.setCodeEx(stockCode.getEx());
                        stockDay6018.setOpeningPrice(getBigDecimal(lines[6]));
                        stockDay6018.setClosingPrice(getBigDecimal(lines[3]));
                        stockDay6018.setFoot(getBigDecimal(lines[5]));
                        stockDay6018.setTopside(getBigDecimal(lines[4]));
                        stockDay6018.setChangePoints(getBigDecimal(lines[8]));
                        stockDay6018.setRateOfChange(getBigDecimal(lines[9]));
                        stockDay6018.setMakeQuantity(getBigDecimal(lines[11]));
                        stockDay6018.setMakePrice(getBigDecimal(lines[12]));
                        stockDay6018.setTurnoverRate(getBigDecimal(lines[10]));
                        stockDay6018.setTcap(getBigDecimal(lines[13]));
                        stockDay6018.setMcap(getBigDecimal(lines[14]));
                        stockDay6018.setLclosePrice(getBigDecimal(lines[7]));
                        dayScience6018FunctionToday.dayScience6018Function(stockDay6018);
                        stockDay6018Service.save(stockDay6018);
//                        stockDay6018List.add(stockDay6018);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    //存入数据库
//                    stockDay6018Service.saveBatch(stockDay6018List);
                    continue;
                case "6019":
                    List<StockDay6019> stockDay6019List = new ArrayList<>();
                    count=1;
                    while ((line = reader.readLine()) != null) {
                        if (count==1){
                            count++;
                            continue;
                        }
                        //获取每一行数据
                        String[] lines = line.split(",");
                        //存入到对于的对象中
                        StockDay6019 stockDay6019 = new StockDay6019();
                        stockDay6019.setDate(parseDate(lines[0]));
                        stockDay6019.setCodeId(stockCode.getId());
                        stockDay6019.setCodeEx(stockCode.getEx());
                        stockDay6019.setOpeningPrice(getBigDecimal(lines[6]));
                        stockDay6019.setClosingPrice(getBigDecimal(lines[3]));
                        stockDay6019.setFoot(getBigDecimal(lines[5]));
                        stockDay6019.setTopside(getBigDecimal(lines[4]));
                        stockDay6019.setChangePoints(getBigDecimal(lines[8]));
                        stockDay6019.setRateOfChange(getBigDecimal(lines[9]));
                        stockDay6019.setMakeQuantity(getBigDecimal(lines[11]));
                        stockDay6019.setMakePrice(getBigDecimal(lines[12]));
                        stockDay6019.setTurnoverRate(getBigDecimal(lines[10]));
                        stockDay6019.setTcap(getBigDecimal(lines[13]));
                        stockDay6019.setMcap(getBigDecimal(lines[14]));
                        stockDay6019.setLclosePrice(getBigDecimal(lines[7]));
                        dayScience6019FunctionToday.dayScience6019Function(stockDay6019);
                        stockDay6019Service.save(stockDay6019);
//                        stockDay6019List.add(stockDay6019);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    //存入数据库
//                    stockDay6019Service.saveBatch(stockDay6019List);
                    continue;
                default:
                    switch (stockCode.getId().substring(0, 3)) {
                        case "001":
                            List<StockDay001> stockDay001List = new ArrayList<>();
                            count=1;
                            while ((line = reader.readLine()) != null) {
                                if (count==1){
                                    count++;
                                    continue;
                                }
                                //获取每一行数据
                                String[] lines = line.split(",");
                                //存入到对于的对象中
                                StockDay001 stockDay001 = new StockDay001();
                                stockDay001.setDate(parseDate(lines[0]));
                                stockDay001.setCodeId(stockCode.getId());
                                stockDay001.setCodeEx(stockCode.getEx());
                                stockDay001.setOpeningPrice(getBigDecimal(lines[6]));
                                stockDay001.setClosingPrice(getBigDecimal(lines[3]));
                                stockDay001.setFoot(getBigDecimal(lines[5]));
                                stockDay001.setTopside(getBigDecimal(lines[4]));
                                stockDay001.setChangePoints(getBigDecimal(lines[8]));
                                stockDay001.setRateOfChange(getBigDecimal(lines[9]));
                                stockDay001.setMakeQuantity(getBigDecimal(lines[11]));
                                stockDay001.setMakePrice(getBigDecimal(lines[12]));
                                stockDay001.setTurnoverRate(getBigDecimal(lines[10]));
                                stockDay001.setTcap(getBigDecimal(lines[13]));
                                stockDay001.setMcap(getBigDecimal(lines[14]));
                                stockDay001.setLclosePrice(getBigDecimal(lines[7]));
                                dayScience001FunctionToday.dayScience001Function(stockDay001);
                                stockDay001Service.save(stockDay001);
//                                stockDay001List.add(stockDay001);
                            }
                            reader.close();
                            // 断开连接
                            connection.disconnect();
                            //存入数据库
//                            stockDay001Service.saveBatch(stockDay001List);
                            continue;
                        case "399":
                            List<StockDay399> stockDay399List = new ArrayList<>();
                            count=1;
                            while ((line = reader.readLine()) != null) {
                                if (count==1){
                                    count++;
                                    continue;
                                }
                                //获取每一行数据
                                String[] lines = line.split(",");
                                //存入到对于的对象中
                                StockDay399 stockDay399 = new StockDay399();
                                stockDay399.setDate(parseDate(lines[0]));
                                stockDay399.setCodeId(stockCode.getId());
                                stockDay399.setCodeEx(stockCode.getEx());
                                stockDay399.setOpeningPrice(getBigDecimal(lines[6]));
                                stockDay399.setClosingPrice(getBigDecimal(lines[3]));
                                stockDay399.setFoot(getBigDecimal(lines[5]));
                                stockDay399.setTopside(getBigDecimal(lines[4]));
                                stockDay399.setChangePoints(getBigDecimal(lines[8]));
                                stockDay399.setRateOfChange(getBigDecimal(lines[9]));
                                stockDay399.setMakeQuantity(getBigDecimal(lines[11]));
                                stockDay399.setMakePrice(getBigDecimal(lines[12]));
                                stockDay399.setTurnoverRate(getBigDecimal(lines[10]));
                                stockDay399.setLclosePrice(getBigDecimal(lines[7]));
                                dayScience399FunctionToday.dayScience399Function(stockDay399);
                                stockDay399Service.save(stockDay399);
//                                stockDay399List.add(stockDay399);
                            }
                            reader.close();
                            // 断开连接
                            connection.disconnect();
                            //存入数据库
//                            stockDay399Service.saveBatch(stockDay399List);
                            continue;
                        case "603":
                            List<StockDay603> stockDay603List = new ArrayList<>();
                            count=1;
                            while ((line = reader.readLine()) != null) {
                                if (count==1){
                                    count++;
                                    continue;
                                }
                                //获取每一行数据
                                String[] lines = line.split(",");
                                //存入到对于的对象中
                                StockDay603 stockDay603 = new StockDay603();
                                stockDay603.setDate(parseDate(lines[0]));
                                stockDay603.setCodeId(stockCode.getId());
                                stockDay603.setCodeEx(stockCode.getEx());
                                stockDay603.setOpeningPrice(getBigDecimal(lines[6]));
                                stockDay603.setClosingPrice(getBigDecimal(lines[3]));
                                stockDay603.setFoot(getBigDecimal(lines[5]));
                                stockDay603.setTopside(getBigDecimal(lines[4]));
                                stockDay603.setChangePoints(getBigDecimal(lines[8]));
                                stockDay603.setRateOfChange(getBigDecimal(lines[9]));
                                stockDay603.setMakeQuantity(getBigDecimal(lines[11]));
                                stockDay603.setMakePrice(getBigDecimal(lines[12]));
                                stockDay603.setTurnoverRate(getBigDecimal(lines[10]));
                                stockDay603.setTcap(getBigDecimal(lines[13]));
                                stockDay603.setMcap(getBigDecimal(lines[14]));
                                stockDay603.setLclosePrice(getBigDecimal(lines[7]));
                                dayScience603FunctionToday.dayScience603Function(stockDay603);
                                stockDay603Service.save(stockDay603);
//                                stockDay603List.add(stockDay603);
                            }
                            reader.close();
                            // 断开连接
                            connection.disconnect();
                            //存入数据库
//                            stockDay603Service.saveBatch(stockDay603List);
                            continue;
                        default:
                            continue;
                    }
            }

        }

//        for (StockCode stockCode : stockCodeList) {
//            String url = urlConfig.getStockUrl2();
//            //获取时间和编码
//            String code = getEncoding2(stockCode);
//            //替换
//            url = url.replace("#code#", code);
//            //请求和处理数据
//            //生成URL的
//            URL getUrl = new URL(url);
//            //HTTP通讯连接打开
//            HttpURLConnection connection = (HttpURLConnection) getUrl.openConnection();
//            //建立连接
//            connection.connect();
//            //获取连接流
//            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//            String line;
//            int count = 1;
//            switch (stockCode.getId().substring(0, 4)) {
//                case "0000":
//                    while ((line = reader.readLine()) != null) {
//                        //获取每一行数据
//                        String[] lines = line.split(",");
//                        //存入到对于的对象中
//                        StockDay0000 stockDay0000 = new StockDay0000();
//                        stockDay0000.setDate(parseDate(lines[30]));
//                        stockDay0000.setCodeId(stockCode.getId());
//                        stockDay0000.setCodeEx(stockCode.getEx());
//                        stockDay0000.setOpeningPrice(getBigDecimal(lines[1]));
//                        stockDay0000.setClosingPrice(getBigDecimal(lines[3]));
//                        stockDay0000.setFoot(getBigDecimal(lines[5]));
//                        stockDay0000.setTopside(getBigDecimal(lines[4]));
//                        BigDecimal i=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2]))).divide(getBigDecimal(lines[2]),4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
//                        BigDecimal k=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2])));
//                        stockDay0000.setChangePoints(k);
//                        stockDay0000.setRateOfChange(i);
//                        stockDay0000.setMakeQuantity(getBigDecimal(lines[8]));
//                        stockDay0000.setLclosePrice(getBigDecimal(lines[2]));
//                        //调用技术解析
//                        dayScience0000FunctionToday.dayScience0000Function(stockDay0000);
//                        //保存
//                        stockDay0000Service.save(stockDay0000);
////                        stockDay0000List.add(stockDay0000);
//
//                    }
//                    reader.close();
//                    // 断开连接
//                    connection.disconnect();
//                    //存入数据库
////                    stockDay0000Service.saveBatch(stockDay0000List);
//                    continue;
//                case "0001":
//                    while ((line = reader.readLine()) != null) {
//                        //获取每一行数据
//                        String[] lines = line.split(",");
//                        //存入到对于的对象中
//                        StockDay0001 stockDay0001 = new StockDay0001();
//                        stockDay0001.setDate(parseDate(lines[30]));
//                        stockDay0001.setCodeId(stockCode.getId());
//                        stockDay0001.setCodeEx(stockCode.getEx());
//                        stockDay0001.setOpeningPrice(getBigDecimal(lines[1]));
//                        stockDay0001.setClosingPrice(getBigDecimal(lines[3]));
//                        stockDay0001.setFoot(getBigDecimal(lines[5]));
//                        stockDay0001.setTopside(getBigDecimal(lines[4]));
//                        BigDecimal i=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2]))).divide(getBigDecimal(lines[2]),4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
//                        BigDecimal k=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2])));
//                        stockDay0001.setChangePoints(k);
//                        stockDay0001.setRateOfChange(i);
//                        stockDay0001.setMakeQuantity(getBigDecimal(lines[8]));
//                        stockDay0001.setLclosePrice(getBigDecimal(lines[2]));
//                        dayScience0001FunctionToday.dayScience0001Function(stockDay0001);
//                        stockDay0001Service.save(stockDay0001);
//                    }
//                    reader.close();
//                    // 断开连接
//                    connection.disconnect();
//                    //存入数据库
////                    stockDay0001Service.saveBatch(stockDay0001List);
//                    continue;
//                case "0002":
//                    while ((line = reader.readLine()) != null) {
//                        //获取每一行数据
//                        String[] lines = line.split(",");
//                        //存入到对于的对象中
//                        StockDay0002 stockDay0002 = new StockDay0002();
//                        stockDay0002.setDate(parseDate(lines[30]));
//                        stockDay0002.setCodeId(stockCode.getId());
//                        stockDay0002.setCodeEx(stockCode.getEx());
//                        stockDay0002.setOpeningPrice(getBigDecimal(lines[1]));
//                        stockDay0002.setClosingPrice(getBigDecimal(lines[3]));
//                        stockDay0002.setFoot(getBigDecimal(lines[5]));
//                        stockDay0002.setTopside(getBigDecimal(lines[4]));
//                        BigDecimal i=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2]))).divide(getBigDecimal(lines[2]),4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
//                        BigDecimal k=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2])));
//                        stockDay0002.setChangePoints(k);
//                        stockDay0002.setRateOfChange(i);
//                        stockDay0002.setMakeQuantity(getBigDecimal(lines[8]));
//                        stockDay0002.setLclosePrice(getBigDecimal(lines[2]));
//                        dayScience0002FunctionToday.dayScience0002Function(stockDay0002);
//                        stockDay0002Service.save(stockDay0002);
//                    }
//                    reader.close();
//                    // 断开连接
//                    connection.disconnect();
//                    //存入数据库
//                    continue;
//                case "0003":
//                    while ((line = reader.readLine()) != null) {
//                        //获取每一行数据
//                        String[] lines = line.split(",");
//                        //存入到对于的对象中
//                        StockDay0003 stockDay0003 = new StockDay0003();
//                        stockDay0003.setDate(parseDate(lines[30]));
//                        stockDay0003.setCodeId(stockCode.getId());
//                        stockDay0003.setCodeEx(stockCode.getEx());
//                        stockDay0003.setOpeningPrice(getBigDecimal(lines[1]));
//                        stockDay0003.setClosingPrice(getBigDecimal(lines[3]));
//                        stockDay0003.setFoot(getBigDecimal(lines[5]));
//                        stockDay0003.setTopside(getBigDecimal(lines[4]));
//                        BigDecimal i=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2]))).divide(getBigDecimal(lines[2]),4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
//                        BigDecimal k=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2])));
//                        stockDay0003.setChangePoints(k);
//                        stockDay0003.setRateOfChange(i);
//                        stockDay0003.setMakeQuantity(getBigDecimal(lines[8]));
//                        stockDay0003.setLclosePrice(getBigDecimal(lines[2]));
//                        dayScience0003FunctionToday.dayScience0003Function(stockDay0003);
//                        stockDay0003Service.save(stockDay0003);
//                    }
//                    reader.close();
//                    // 断开连接
//                    connection.disconnect();
//                    //存入数据库
//                    continue;
//                case "0004":
//                    while ((line = reader.readLine()) != null) {
//                        //获取每一行数据
//                        String[] lines = line.split(",");
//                        //存入到对于的对象中
//                        StockDay0004 stockDay0004 = new StockDay0004();
//                        stockDay0004.setDate(parseDate(lines[30]));
//                        stockDay0004.setCodeId(stockCode.getId());
//                        stockDay0004.setCodeEx(stockCode.getEx());
//                        stockDay0004.setOpeningPrice(getBigDecimal(lines[1]));
//                        stockDay0004.setClosingPrice(getBigDecimal(lines[3]));
//                        stockDay0004.setFoot(getBigDecimal(lines[5]));
//                        stockDay0004.setTopside(getBigDecimal(lines[4]));
//                        BigDecimal i=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2]))).divide(getBigDecimal(lines[2]),4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
//                        BigDecimal k=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2])));
//                        stockDay0004.setChangePoints(k);
//                        stockDay0004.setRateOfChange(i);
//                        stockDay0004.setMakeQuantity(getBigDecimal(lines[8]));
//                        stockDay0004.setLclosePrice(getBigDecimal(lines[2]));
//                        dayScience0004FunctionToday.dayScience0004Function(stockDay0004);
//                        stockDay0004Service.save(stockDay0004);
//                    }
//                    reader.close();
//                    // 断开连接
//                    connection.disconnect();
//                    //存入数据库
//                    continue;
//                case "0005":
//                    while ((line = reader.readLine()) != null) {
//                        //获取每一行数据
//                        String[] lines = line.split(",");
//                        //存入到对于的对象中
//                        StockDay0005 stockDay0005 = new StockDay0005();
//                        stockDay0005.setDate(parseDate(lines[30]));
//                        stockDay0005.setCodeId(stockCode.getId());
//                        stockDay0005.setCodeEx(stockCode.getEx());
//                        stockDay0005.setOpeningPrice(getBigDecimal(lines[1]));
//                        stockDay0005.setClosingPrice(getBigDecimal(lines[3]));
//                        stockDay0005.setFoot(getBigDecimal(lines[5]));
//                        stockDay0005.setTopside(getBigDecimal(lines[4]));
//                        BigDecimal i=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2]))).divide(getBigDecimal(lines[2]),4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
//                        BigDecimal k=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2])));
//                        stockDay0005.setChangePoints(k);
//                        stockDay0005.setRateOfChange(i);
//                        stockDay0005.setMakeQuantity(getBigDecimal(lines[8]));
//                        stockDay0005.setLclosePrice(getBigDecimal(lines[2]));
//                        dayScience0005FunctionToday.dayScience0005Function(stockDay0005);
//                        stockDay0005Service.save(stockDay0005);
//                    }
//                    reader.close();
//                    // 断开连接
//                    connection.disconnect();
//                    //存入数据库
//                    continue;
//                case "0006":
//
//                    while ((line = reader.readLine()) != null) {
//                        //获取每一行数据
//                        String[] lines = line.split(",");
//                        //存入到对于的对象中
//                        StockDay0006 stockDay0006 = new StockDay0006();
//                        stockDay0006.setDate(parseDate(lines[30]));
//                        stockDay0006.setCodeId(stockCode.getId());
//                        stockDay0006.setCodeEx(stockCode.getEx());
//                        stockDay0006.setOpeningPrice(getBigDecimal(lines[1]));
//                        stockDay0006.setClosingPrice(getBigDecimal(lines[3]));
//                        stockDay0006.setFoot(getBigDecimal(lines[5]));
//                        stockDay0006.setTopside(getBigDecimal(lines[4]));
//                        BigDecimal i=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2]))).divide(getBigDecimal(lines[2]),4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
//                        BigDecimal k=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2])));
//                        stockDay0006.setChangePoints(k);
//                        stockDay0006.setRateOfChange(i);
//                        stockDay0006.setMakeQuantity(getBigDecimal(lines[8]));
//                        stockDay0006.setLclosePrice(getBigDecimal(lines[2]));
//                        dayScience0006FunctionToday.dayScience0006Function(stockDay0006);
//                        stockDay0006Service.save(stockDay0006);
//                    }
//                    reader.close();
//                    // 断开连接
//                    connection.disconnect();
//                    //存入数据库
//                    continue;
//                case "0007":
//                    while ((line = reader.readLine()) != null) {
//                        //获取每一行数据
//                        String[] lines = line.split(",");
//                        //存入到对于的对象中
//                        StockDay0007 stockDay0007 = new StockDay0007();
//                        stockDay0007.setDate(parseDate(lines[30]));
//                        stockDay0007.setCodeId(stockCode.getId());
//                        stockDay0007.setCodeEx(stockCode.getEx());
//                        stockDay0007.setOpeningPrice(getBigDecimal(lines[1]));
//                        stockDay0007.setClosingPrice(getBigDecimal(lines[3]));
//                        stockDay0007.setFoot(getBigDecimal(lines[5]));
//                        stockDay0007.setTopside(getBigDecimal(lines[4]));
//                        BigDecimal i=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2]))).divide(getBigDecimal(lines[2]),4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
//                        BigDecimal k=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2])));
//                        stockDay0007.setChangePoints(k);
//                        stockDay0007.setRateOfChange(i);
//                        stockDay0007.setMakeQuantity(getBigDecimal(lines[8]));
//                        stockDay0007.setLclosePrice(getBigDecimal(lines[2]));
//                        dayScience0007FunctionToday.dayScience0007Function(stockDay0007);
//                        stockDay0007Service.save(stockDay0007);
//                    }
//                    reader.close();
//                    // 断开连接
//                    connection.disconnect();
//                    //存入数据库
//                    continue;
//                case "0008":
//                    while ((line = reader.readLine()) != null) {
//                        //获取每一行数据
//                        String[] lines = line.split(",");
//                        //存入到对于的对象中
//                        StockDay0008 stockDay0008 = new StockDay0008();
//                        stockDay0008.setDate(parseDate(lines[30]));
//                        stockDay0008.setCodeId(stockCode.getId());
//                        stockDay0008.setCodeEx(stockCode.getEx());
//                        stockDay0008.setOpeningPrice(getBigDecimal(lines[1]));
//                        stockDay0008.setClosingPrice(getBigDecimal(lines[3]));
//                        stockDay0008.setFoot(getBigDecimal(lines[5]));
//                        stockDay0008.setTopside(getBigDecimal(lines[4]));
//                        BigDecimal i=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2]))).divide(getBigDecimal(lines[2]),4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
//                        BigDecimal k=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2])));
//                        stockDay0008.setChangePoints(k);
//                        stockDay0008.setRateOfChange(i);
//                        stockDay0008.setMakeQuantity(getBigDecimal(lines[8]));
//                        stockDay0008.setLclosePrice(getBigDecimal(lines[2]));
//                        dayScience0008FunctionToday.dayScience0008Function(stockDay0008);
//                        stockDay0008Service.save(stockDay0008);
//                    }
//                    reader.close();
//                    // 断开连接
//                    connection.disconnect();
//                    //存入数据库
//                    continue;
//                case "0009":
//                    while ((line = reader.readLine()) != null) {
//                        //获取每一行数据
//                        String[] lines = line.split(",");
//                        //存入到对于的对象中
//                        StockDay0009 stockDay0009 = new StockDay0009();
//                        stockDay0009.setDate(parseDate(lines[30]));
//                        stockDay0009.setCodeId(stockCode.getId());
//                        stockDay0009.setCodeEx(stockCode.getEx());
//                        stockDay0009.setOpeningPrice(getBigDecimal(lines[1]));
//                        stockDay0009.setClosingPrice(getBigDecimal(lines[3]));
//                        stockDay0009.setFoot(getBigDecimal(lines[5]));
//                        stockDay0009.setTopside(getBigDecimal(lines[4]));
//                        BigDecimal i=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2]))).divide(getBigDecimal(lines[2]),4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
//                        BigDecimal k=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2])));
//                        stockDay0009.setChangePoints(k);
//                        stockDay0009.setRateOfChange(i);
//                        stockDay0009.setMakeQuantity(getBigDecimal(lines[8]));
//                        stockDay0009.setLclosePrice(getBigDecimal(lines[2]));
//                        dayScience0009FunctionToday.dayScience0009Function(stockDay0009);
//                        stockDay0009Service.save(stockDay0009);
//                    }
//                    reader.close();
//                    // 断开连接
//                    connection.disconnect();
//                    //存入数据库
//                    continue;
//                case "0020":
//                    while ((line = reader.readLine()) != null) {
//                        //获取每一行数据
//                        String[] lines = line.split(",");
//                        //存入到对于的对象中
//                        StockDay0020 stockDay0020 = new StockDay0020();
//                        stockDay0020.setDate(parseDate(lines[30]));
//                        stockDay0020.setCodeId(stockCode.getId());
//                        stockDay0020.setCodeEx(stockCode.getEx());
//                        stockDay0020.setOpeningPrice(getBigDecimal(lines[1]));
//                        stockDay0020.setClosingPrice(getBigDecimal(lines[3]));
//                        stockDay0020.setFoot(getBigDecimal(lines[5]));
//                        stockDay0020.setTopside(getBigDecimal(lines[4]));
//                        BigDecimal i=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2]))).divide(getBigDecimal(lines[2]),4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
//                        BigDecimal k=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2])));
//                        stockDay0020.setChangePoints(k);
//                        stockDay0020.setRateOfChange(i);
//                        stockDay0020.setMakeQuantity(getBigDecimal(lines[8]));
//                        stockDay0020.setLclosePrice(getBigDecimal(lines[2]));
//                        dayScience0020FunctionToday.dayScience0020Function(stockDay0020);
//                        stockDay0020Service.save(stockDay0020);
//                    }
//                    reader.close();
//                    // 断开连接
//                    connection.disconnect();
//                    //存入数据库
//                    continue;
//                case "0021":
//                    while ((line = reader.readLine()) != null) {
//                        //获取每一行数据
//                        String[] lines = line.split(",");
//                        //存入到对于的对象中
//                        StockDay0021 stockDay0021 = new StockDay0021();
//                        stockDay0021.setDate(parseDate(lines[30]));
//                        stockDay0021.setCodeId(stockCode.getId());
//                        stockDay0021.setCodeEx(stockCode.getEx());
//                        stockDay0021.setOpeningPrice(getBigDecimal(lines[1]));
//                        stockDay0021.setClosingPrice(getBigDecimal(lines[3]));
//                        stockDay0021.setFoot(getBigDecimal(lines[5]));
//                        stockDay0021.setTopside(getBigDecimal(lines[4]));
//                        BigDecimal i=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2]))).divide(getBigDecimal(lines[2]),4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
//                        BigDecimal k=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2])));
//                        stockDay0021.setChangePoints(k);
//                        stockDay0021.setRateOfChange(i);
//                        stockDay0021.setMakeQuantity(getBigDecimal(lines[8]));
//                        stockDay0021.setLclosePrice(getBigDecimal(lines[2]));
//                        dayScience0021FunctionToday.dayScience0021Function(stockDay0021);
//                        stockDay0021Service.save(stockDay0021);
//                    }
//                    reader.close();
//                    // 断开连接
//                    connection.disconnect();
//                    //存入数据库
//                    continue;
//                case "0022":
//                    while ((line = reader.readLine()) != null) {
//                        //获取每一行数据
//                        String[] lines = line.split(",");
//                        //存入到对于的对象中
//                        StockDay0022 stockDay0022 = new StockDay0022();
//                        stockDay0022.setDate(parseDate(lines[30]));
//                        stockDay0022.setCodeId(stockCode.getId());
//                        stockDay0022.setCodeEx(stockCode.getEx());
//                        stockDay0022.setOpeningPrice(getBigDecimal(lines[1]));
//                        stockDay0022.setClosingPrice(getBigDecimal(lines[3]));
//                        stockDay0022.setFoot(getBigDecimal(lines[5]));
//                        stockDay0022.setTopside(getBigDecimal(lines[4]));
//                        BigDecimal i=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2]))).divide(getBigDecimal(lines[2]),4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
//                        BigDecimal k=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2])));
//                        stockDay0022.setChangePoints(k);
//                        stockDay0022.setRateOfChange(i);
//                        stockDay0022.setMakeQuantity(getBigDecimal(lines[8]));
//                        stockDay0022.setLclosePrice(getBigDecimal(lines[2]));
//                        dayScience0022FunctionToday.dayScience0022Function(stockDay0022);
//                        stockDay0022Service.save(stockDay0022);
//                    }
//                    reader.close();
//                    // 断开连接
//                    connection.disconnect();
//                    //存入数据库
//                    continue;
//                case "0023":
//                    while ((line = reader.readLine()) != null) {
//                        //获取每一行数据
//                        String[] lines = line.split(",");
//                        //存入到对于的对象中
//                        StockDay0023 stockDay0023 = new StockDay0023();
//                        stockDay0023.setDate(parseDate(lines[30]));
//                        stockDay0023.setCodeId(stockCode.getId());
//                        stockDay0023.setCodeEx(stockCode.getEx());
//                        stockDay0023.setOpeningPrice(getBigDecimal(lines[1]));
//                        stockDay0023.setClosingPrice(getBigDecimal(lines[3]));
//                        stockDay0023.setFoot(getBigDecimal(lines[5]));
//                        stockDay0023.setTopside(getBigDecimal(lines[4]));
//                        BigDecimal i=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2]))).divide(getBigDecimal(lines[2]),4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
//                        BigDecimal k=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2])));
//                        stockDay0023.setChangePoints(k);
//                        stockDay0023.setRateOfChange(i);
//                        stockDay0023.setMakeQuantity(getBigDecimal(lines[8]));
//                        stockDay0023.setLclosePrice(getBigDecimal(lines[2]));
//                        dayScience0023FunctionToday.dayScience0023Function(stockDay0023);
//                        stockDay0023Service.save(stockDay0023);
//                    }
//                    reader.close();
//                    // 断开连接
//                    connection.disconnect();
//                    //存入数据库
//                    continue;
//                case "0024":
//                    while ((line = reader.readLine()) != null) {
//                        //获取每一行数据
//                        String[] lines = line.split(",");
//                        //存入到对于的对象中
//                        StockDay0024 stockDay0024 = new StockDay0024();
//                        stockDay0024.setDate(parseDate(lines[30]));
//                        stockDay0024.setCodeId(stockCode.getId());
//                        stockDay0024.setCodeEx(stockCode.getEx());
//                        stockDay0024.setOpeningPrice(getBigDecimal(lines[1]));
//                        stockDay0024.setClosingPrice(getBigDecimal(lines[3]));
//                        stockDay0024.setFoot(getBigDecimal(lines[5]));
//                        stockDay0024.setTopside(getBigDecimal(lines[4]));
//                        BigDecimal i=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2]))).divide(getBigDecimal(lines[2]),4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
//                        BigDecimal k=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2])));
//                        stockDay0024.setChangePoints(k);
//                        stockDay0024.setRateOfChange(i);
//                        stockDay0024.setMakeQuantity(getBigDecimal(lines[8]));
//                        stockDay0024.setLclosePrice(getBigDecimal(lines[2]));
//                        dayScience0024FunctionToday.dayScience0024Function(stockDay0024);
//                        stockDay0024Service.save(stockDay0024);
//                    }
//                    reader.close();
//                    // 断开连接
//                    connection.disconnect();
//                    //存入数据库
//                    continue;
//                case "0025":
//                    while ((line = reader.readLine()) != null) {
//                        //获取每一行数据
//                        String[] lines = line.split(",");
//                        //存入到对于的对象中
//                        StockDay0025 stockDay0025 = new StockDay0025();
//                        stockDay0025.setDate(parseDate(lines[30]));
//                        stockDay0025.setCodeId(stockCode.getId());
//                        stockDay0025.setCodeEx(stockCode.getEx());
//                        stockDay0025.setOpeningPrice(getBigDecimal(lines[1]));
//                        stockDay0025.setClosingPrice(getBigDecimal(lines[3]));
//                        stockDay0025.setFoot(getBigDecimal(lines[5]));
//                        stockDay0025.setTopside(getBigDecimal(lines[4]));
//                        BigDecimal i=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2]))).divide(getBigDecimal(lines[2]),4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
//                        BigDecimal k=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2])));
//                        stockDay0025.setChangePoints(k);
//                        stockDay0025.setRateOfChange(i);
//                        stockDay0025.setMakeQuantity(getBigDecimal(lines[8]));
//                        stockDay0025.setLclosePrice(getBigDecimal(lines[2]));
//                        dayScience0025FunctionToday.dayScience0025Function(stockDay0025);
//                        stockDay0025Service.save(stockDay0025);
//                    }
//                    reader.close();
//                    // 断开连接
//                    connection.disconnect();
//                    //存入数据库
//                    continue;
//                case "0026":
//                    while ((line = reader.readLine()) != null) {
//                        //获取每一行数据
//                        String[] lines = line.split(",");
//                        //存入到对于的对象中
//                        StockDay0026 stockDay0026 = new StockDay0026();
//                        stockDay0026.setDate(parseDate(lines[30]));
//                        stockDay0026.setCodeId(stockCode.getId());
//                        stockDay0026.setCodeEx(stockCode.getEx());
//                        stockDay0026.setOpeningPrice(getBigDecimal(lines[1]));
//                        stockDay0026.setClosingPrice(getBigDecimal(lines[3]));
//                        stockDay0026.setFoot(getBigDecimal(lines[5]));
//                        stockDay0026.setTopside(getBigDecimal(lines[4]));
//                        BigDecimal i=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2]))).divide(getBigDecimal(lines[2]),4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
//                        BigDecimal k=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2])));
//                        stockDay0026.setChangePoints(k);
//                        stockDay0026.setRateOfChange(i);
//                        stockDay0026.setMakeQuantity(getBigDecimal(lines[8]));
//                        stockDay0026.setLclosePrice(getBigDecimal(lines[2]));
//                        dayScience0026FunctionToday.dayScience0026Function(stockDay0026);
//                        stockDay0026Service.save(stockDay0026);
//                    }
//                    reader.close();
//                    // 断开连接
//                    connection.disconnect();
//                    //存入数据库
//                    continue;
//                case "0027":
//                    while ((line = reader.readLine()) != null) {
//                        //获取每一行数据
//                        String[] lines = line.split(",");
//                        //存入到对于的对象中
//                        StockDay0027 stockDay0027 = new StockDay0027();
//                        stockDay0027.setDate(parseDate(lines[30]));
//                        stockDay0027.setCodeId(stockCode.getId());
//                        stockDay0027.setCodeEx(stockCode.getEx());
//                        stockDay0027.setOpeningPrice(getBigDecimal(lines[1]));
//                        stockDay0027.setClosingPrice(getBigDecimal(lines[3]));
//                        stockDay0027.setFoot(getBigDecimal(lines[5]));
//                        stockDay0027.setTopside(getBigDecimal(lines[4]));
//                        BigDecimal i=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2]))).divide(getBigDecimal(lines[2]),4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
//                        BigDecimal k=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2])));
//                        stockDay0027.setChangePoints(k);
//                        stockDay0027.setRateOfChange(i);
//                        stockDay0027.setMakeQuantity(getBigDecimal(lines[8]));
//                        stockDay0027.setLclosePrice(getBigDecimal(lines[2]));
//                        dayScience0027FunctionToday.dayScience0027Function(stockDay0027);
//                        stockDay0027Service.save(stockDay0027);
//                    }
//                    reader.close();
//                    // 断开连接
//                    connection.disconnect();
//                    //存入数据库
//                    continue;
//                case "0028":
//                    while ((line = reader.readLine()) != null) {
//                        //获取每一行数据
//                        String[] lines = line.split(",");
//                        //存入到对于的对象中
//                        StockDay0028 stockDay0028 = new StockDay0028();
//                        stockDay0028.setDate(parseDate(lines[30]));
//                        stockDay0028.setCodeId(stockCode.getId());
//                        stockDay0028.setCodeEx(stockCode.getEx());
//                        stockDay0028.setOpeningPrice(getBigDecimal(lines[1]));
//                        stockDay0028.setClosingPrice(getBigDecimal(lines[3]));
//                        stockDay0028.setFoot(getBigDecimal(lines[5]));
//                        stockDay0028.setTopside(getBigDecimal(lines[4]));
//                        BigDecimal i=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2]))).divide(getBigDecimal(lines[2]),4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
//                        BigDecimal k=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2])));
//                        stockDay0028.setChangePoints(k);
//                        stockDay0028.setRateOfChange(i);
//                        stockDay0028.setMakeQuantity(getBigDecimal(lines[8]));
//                        stockDay0028.setLclosePrice(getBigDecimal(lines[2]));
//                        dayScience0028FunctionToday.dayScience0028Function(stockDay0028);
//                        stockDay0028Service.save(stockDay0028);
//                    }
//                    reader.close();
//                    // 断开连接
//                    connection.disconnect();
//                    //存入数据库
//                    continue;
//                case "3000":
//                    while ((line = reader.readLine()) != null) {
//                        //获取每一行数据
//                        String[] lines = line.split(",");
//                        //存入到对于的对象中
//                        StockDay3000 stockDay3000 = new StockDay3000();
//                        stockDay3000.setDate(parseDate(lines[30]));
//                        stockDay3000.setCodeId(stockCode.getId());
//                        stockDay3000.setCodeEx(stockCode.getEx());
//                        stockDay3000.setOpeningPrice(getBigDecimal(lines[1]));
//                        stockDay3000.setClosingPrice(getBigDecimal(lines[3]));
//                        stockDay3000.setFoot(getBigDecimal(lines[5]));
//                        stockDay3000.setTopside(getBigDecimal(lines[4]));
//                        BigDecimal i=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2]))).divide(getBigDecimal(lines[2]),4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
//                        BigDecimal k=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2])));
//                        stockDay3000.setChangePoints(k);
//                        stockDay3000.setRateOfChange(i);
//                        stockDay3000.setMakeQuantity(getBigDecimal(lines[8]));
//                        stockDay3000.setLclosePrice(getBigDecimal(lines[2]));
//                        dayScience3000FunctionToday.dayScience3000Function(stockDay3000);
//                        stockDay3000Service.save(stockDay3000);
//                    }
//                    reader.close();
//                    // 断开连接
//                    connection.disconnect();
//                    //存入数据库
//                    continue;
//                case "3001":
//                    while ((line = reader.readLine()) != null) {
//                        //获取每一行数据
//                        String[] lines = line.split(",");
//                        //存入到对于的对象中
//                        StockDay3001 stockDay3001 = new StockDay3001();
//                        stockDay3001.setDate(parseDate(lines[30]));
//                        stockDay3001.setCodeId(stockCode.getId());
//                        stockDay3001.setCodeEx(stockCode.getEx());
//                        stockDay3001.setOpeningPrice(getBigDecimal(lines[1]));
//                        stockDay3001.setClosingPrice(getBigDecimal(lines[3]));
//                        stockDay3001.setFoot(getBigDecimal(lines[5]));
//                        stockDay3001.setTopside(getBigDecimal(lines[4]));
//                        BigDecimal i=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2]))).divide(getBigDecimal(lines[2]),4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
//                        BigDecimal k=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2])));
//                        stockDay3001.setChangePoints(k);
//                        stockDay3001.setRateOfChange(i);
//                        stockDay3001.setMakeQuantity(getBigDecimal(lines[8]));
//                        stockDay3001.setLclosePrice(getBigDecimal(lines[2]));
//                        dayScience3001FunctionToday.dayScience3001Function(stockDay3001);
//                        stockDay3001Service.save(stockDay3001);
//                    }
//                    reader.close();
//                    // 断开连接
//                    connection.disconnect();
//                    //存入数据库
//                    continue;
//                case "3002":
//                    while ((line = reader.readLine()) != null) {
//                        //获取每一行数据
//                        String[] lines = line.split(",");
//                        //存入到对于的对象中
//                        StockDay3002 stockDay3002 = new StockDay3002();
//                        stockDay3002.setDate(parseDate(lines[30]));
//                        stockDay3002.setCodeId(stockCode.getId());
//                        stockDay3002.setCodeEx(stockCode.getEx());
//                        stockDay3002.setOpeningPrice(getBigDecimal(lines[1]));
//                        stockDay3002.setClosingPrice(getBigDecimal(lines[3]));
//                        stockDay3002.setFoot(getBigDecimal(lines[5]));
//                        stockDay3002.setTopside(getBigDecimal(lines[4]));
//                        BigDecimal i=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2]))).divide(getBigDecimal(lines[2]),4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
//                        BigDecimal k=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2])));
//                        stockDay3002.setChangePoints(k);
//                        stockDay3002.setRateOfChange(i);
//                        stockDay3002.setMakeQuantity(getBigDecimal(lines[8]));
//                        stockDay3002.setLclosePrice(getBigDecimal(lines[2]));
//                        dayScience3002FunctionToday.dayScience3002Function(stockDay3002);
//                        stockDay3002Service.save(stockDay3002);
//                    }
//                    reader.close();
//                    // 断开连接
//                    connection.disconnect();
//                    //存入数据库
//                    continue;
//                case "3003":
//                    while ((line = reader.readLine()) != null) {
//                        //获取每一行数据
//                        String[] lines = line.split(",");
//                        //存入到对于的对象中
//                        StockDay3003 stockDay3003 = new StockDay3003();
//                        stockDay3003.setDate(parseDate(lines[30]));
//                        stockDay3003.setCodeId(stockCode.getId());
//                        stockDay3003.setCodeEx(stockCode.getEx());
//                        stockDay3003.setOpeningPrice(getBigDecimal(lines[1]));
//                        stockDay3003.setClosingPrice(getBigDecimal(lines[3]));
//                        stockDay3003.setFoot(getBigDecimal(lines[5]));
//                        stockDay3003.setTopside(getBigDecimal(lines[4]));
//                        BigDecimal i=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2]))).divide(getBigDecimal(lines[2]),4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
//                        BigDecimal k=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2])));
//                        stockDay3003.setChangePoints(k);
//                        stockDay3003.setRateOfChange(i);
//                        stockDay3003.setMakeQuantity(getBigDecimal(lines[8]));
//                        stockDay3003.setLclosePrice(getBigDecimal(lines[2]));
//                        dayScience3003FunctionToday.dayScience3003Function(stockDay3003);
//                        stockDay3003Service.save(stockDay3003);
//                    }
//                    reader.close();
//                    // 断开连接
//                    connection.disconnect();
//                    //存入数据库
//                    continue;
//                case "3004":
//                    while ((line = reader.readLine()) != null) {
//                        //获取每一行数据
//                        String[] lines = line.split(",");
//                        //存入到对于的对象中
//                        StockDay3004 stockDay3004 = new StockDay3004();
//                        stockDay3004.setDate(parseDate(lines[30]));
//                        stockDay3004.setCodeId(stockCode.getId());
//                        stockDay3004.setCodeEx(stockCode.getEx());
//                        stockDay3004.setOpeningPrice(getBigDecimal(lines[1]));
//                        stockDay3004.setClosingPrice(getBigDecimal(lines[3]));
//                        stockDay3004.setFoot(getBigDecimal(lines[5]));
//                        stockDay3004.setTopside(getBigDecimal(lines[4]));
//                        BigDecimal i=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2]))).divide(getBigDecimal(lines[2]),4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
//                        BigDecimal k=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2])));
//                        stockDay3004.setChangePoints(k);
//                        stockDay3004.setRateOfChange(i);
//                        stockDay3004.setMakeQuantity(getBigDecimal(lines[8]));
//                        stockDay3004.setLclosePrice(getBigDecimal(lines[2]));
//                        dayScience3004FunctionToday.dayScience3004Function(stockDay3004);
//                        stockDay3004Service.save(stockDay3004);
//                    }
//                    reader.close();
//                    // 断开连接
//                    connection.disconnect();
//                    continue;
//                case "3005":
//                    while ((line = reader.readLine()) != null) {
//                        //获取每一行数据
//                        String[] lines = line.split(",");
//                        //存入到对于的对象中
//                        StockDay3005 stockDay3005 = new StockDay3005();
//                        stockDay3005.setDate(parseDate(lines[30]));
//                        stockDay3005.setCodeId(stockCode.getId());
//                        stockDay3005.setCodeEx(stockCode.getEx());
//                        stockDay3005.setOpeningPrice(getBigDecimal(lines[1]));
//                        stockDay3005.setClosingPrice(getBigDecimal(lines[3]));
//                        stockDay3005.setFoot(getBigDecimal(lines[5]));
//                        stockDay3005.setTopside(getBigDecimal(lines[4]));
//                        BigDecimal i=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2]))).divide(getBigDecimal(lines[2]),4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
//                        BigDecimal k=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2])));
//                        stockDay3005.setChangePoints(k);
//                        stockDay3005.setRateOfChange(i);
//                        stockDay3005.setMakeQuantity(getBigDecimal(lines[8]));
//                        stockDay3005.setLclosePrice(getBigDecimal(lines[2]));
//                        dayScience3005FunctionToday.dayScience3005Function(stockDay3005);
//                        stockDay3005Service.save(stockDay3005);
//                    }
//                    reader.close();
//                    // 断开连接
//                    connection.disconnect();
//                    continue;
//                case "6000":
//                    while ((line = reader.readLine()) != null) {
//                        //获取每一行数据
//                        String[] lines = line.split(",");
//                        //存入到对于的对象中
//                        StockDay6000 stockDay6000 = new StockDay6000();
//                        stockDay6000.setDate(parseDate(lines[30]));
//                        stockDay6000.setCodeId(stockCode.getId());
//                        stockDay6000.setCodeEx(stockCode.getEx());
//                        stockDay6000.setOpeningPrice(getBigDecimal(lines[1]));
//                        stockDay6000.setClosingPrice(getBigDecimal(lines[3]));
//                        stockDay6000.setFoot(getBigDecimal(lines[5]));
//                        stockDay6000.setTopside(getBigDecimal(lines[4]));
//                        BigDecimal i=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2]))).divide(getBigDecimal(lines[2]),4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
//                        BigDecimal k=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2])));
//                        stockDay6000.setChangePoints(k);
//                        stockDay6000.setRateOfChange(i);
//                        stockDay6000.setMakeQuantity(getBigDecimal(lines[8]));
//                        stockDay6000.setLclosePrice(getBigDecimal(lines[2]));
//                        dayScience6000FunctionToday.dayScience6000Function(stockDay6000);
//                        stockDay6000Service.save(stockDay6000);
//                    }
//                    reader.close();
//                    // 断开连接
//                    connection.disconnect();
//                    continue;
//                case "6001":
//                    while ((line = reader.readLine()) != null) {
//                        //获取每一行数据
//                        String[] lines = line.split(",");
//                        //存入到对于的对象中
//                        StockDay6001 stockDay6001 = new StockDay6001();
//                        stockDay6001.setDate(parseDate(lines[30]));
//                        stockDay6001.setCodeId(stockCode.getId());
//                        stockDay6001.setCodeEx(stockCode.getEx());
//                        stockDay6001.setOpeningPrice(getBigDecimal(lines[1]));
//                        stockDay6001.setClosingPrice(getBigDecimal(lines[3]));
//                        stockDay6001.setFoot(getBigDecimal(lines[5]));
//                        stockDay6001.setTopside(getBigDecimal(lines[4]));
//                        BigDecimal i=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2]))).divide(getBigDecimal(lines[2]),4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
//                        BigDecimal k=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2])));
//                        stockDay6001.setChangePoints(k);
//                        stockDay6001.setRateOfChange(i);
//                        stockDay6001.setMakeQuantity(getBigDecimal(lines[8]));
//                        stockDay6001.setLclosePrice(getBigDecimal(lines[2]));
//                        dayScience6001FunctionToday.dayScience6001Function(stockDay6001);
//                        stockDay6001Service.save(stockDay6001);
//                    }
//                    reader.close();
//                    // 断开连接
//                    connection.disconnect();
//                    continue;
//                case "6002":
//                    while ((line = reader.readLine()) != null) {
//                        //获取每一行数据
//                        String[] lines = line.split(",");
//                        //存入到对于的对象中
//                        StockDay6002 stockDay6002 = new StockDay6002();
//                        stockDay6002.setDate(parseDate(lines[30]));
//                        stockDay6002.setCodeId(stockCode.getId());
//                        stockDay6002.setCodeEx(stockCode.getEx());
//                        stockDay6002.setOpeningPrice(getBigDecimal(lines[1]));
//                        stockDay6002.setClosingPrice(getBigDecimal(lines[3]));
//                        stockDay6002.setFoot(getBigDecimal(lines[5]));
//                        stockDay6002.setTopside(getBigDecimal(lines[4]));
//                        BigDecimal i=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2]))).divide(getBigDecimal(lines[2]),4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
//                        BigDecimal k=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2])));
//                        stockDay6002.setChangePoints(k);
//                        stockDay6002.setRateOfChange(i);
//                        stockDay6002.setMakeQuantity(getBigDecimal(lines[8]));
//                        stockDay6002.setLclosePrice(getBigDecimal(lines[2]));
//                        dayScience6002FunctionToday.dayScience6002Function(stockDay6002);
//                        stockDay6002Service.save(stockDay6002);
//                    }
//                    reader.close();
//                    // 断开连接
//                    connection.disconnect();
//                    continue;
//                case "6003":
//                    while ((line = reader.readLine()) != null) {
//                        //获取每一行数据
//                        String[] lines = line.split(",");
//                        //存入到对于的对象中
//                        StockDay6003 stockDay6003 = new StockDay6003();
//                        stockDay6003.setDate(parseDate(lines[30]));
//                        stockDay6003.setCodeId(stockCode.getId());
//                        stockDay6003.setCodeEx(stockCode.getEx());
//                        stockDay6003.setOpeningPrice(getBigDecimal(lines[1]));
//                        stockDay6003.setClosingPrice(getBigDecimal(lines[3]));
//                        stockDay6003.setFoot(getBigDecimal(lines[5]));
//                        stockDay6003.setTopside(getBigDecimal(lines[4]));
//                        BigDecimal i=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2]))).divide(getBigDecimal(lines[2]),4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
//                        BigDecimal k=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2])));
//                        stockDay6003.setChangePoints(k);
//                        stockDay6003.setRateOfChange(i);
//                        stockDay6003.setMakeQuantity(getBigDecimal(lines[8]));
//                        stockDay6003.setLclosePrice(getBigDecimal(lines[2]));
//                        dayScience6003FunctionToday.dayScience6003Function(stockDay6003);
//                        stockDay6003Service.save(stockDay6003);
//                    }
//                    reader.close();
//                    // 断开连接
//                    connection.disconnect();
//                    continue;
//                case "6004":
//                    while ((line = reader.readLine()) != null) {
//                        //获取每一行数据
//                        String[] lines = line.split(",");
//                        //存入到对于的对象中
//                        StockDay6004 stockDay6004 = new StockDay6004();
//                        stockDay6004.setDate(parseDate(lines[30]));
//                        stockDay6004.setCodeId(stockCode.getId());
//                        stockDay6004.setCodeEx(stockCode.getEx());
//                        stockDay6004.setOpeningPrice(getBigDecimal(lines[1]));
//                        stockDay6004.setClosingPrice(getBigDecimal(lines[3]));
//                        stockDay6004.setFoot(getBigDecimal(lines[5]));
//                        stockDay6004.setTopside(getBigDecimal(lines[4]));
//                        BigDecimal i=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2]))).divide(getBigDecimal(lines[2]),4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
//                        BigDecimal k=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2])));
//                        stockDay6004.setChangePoints(k);
//                        stockDay6004.setRateOfChange(i);
//                        stockDay6004.setMakeQuantity(getBigDecimal(lines[8]));
//                        stockDay6004.setLclosePrice(getBigDecimal(lines[2]));
//                        dayScience6004FunctionToday.dayScience6004Function(stockDay6004);
//                        stockDay6004Service.save(stockDay6004);
//                    }
//                    reader.close();
//                    // 断开连接
//                    connection.disconnect();
//                    continue;
//                case "6005":
//                    while ((line = reader.readLine()) != null) {
//                        //获取每一行数据
//                        String[] lines = line.split(",");
//                        //存入到对于的对象中
//                        StockDay6005 stockDay6005 = new StockDay6005();
//                        stockDay6005.setDate(parseDate(lines[30]));
//                        stockDay6005.setCodeId(stockCode.getId());
//                        stockDay6005.setCodeEx(stockCode.getEx());
//                        stockDay6005.setOpeningPrice(getBigDecimal(lines[1]));
//                        stockDay6005.setClosingPrice(getBigDecimal(lines[3]));
//                        stockDay6005.setFoot(getBigDecimal(lines[5]));
//                        stockDay6005.setTopside(getBigDecimal(lines[4]));
//                        BigDecimal i=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2]))).divide(getBigDecimal(lines[2]),4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
//                        BigDecimal k=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2])));
//                        stockDay6005.setChangePoints(k);
//                        stockDay6005.setRateOfChange(i);
//                        stockDay6005.setMakeQuantity(getBigDecimal(lines[8]));
//                        stockDay6005.setLclosePrice(getBigDecimal(lines[2]));
//                        dayScience6005FunctionToday.dayScience6005Function(stockDay6005);
//                        stockDay6005Service.save(stockDay6005);
//                    }
//                    reader.close();
//                    // 断开连接
//                    connection.disconnect();
//                    continue;
//                case "6006":
//                    while ((line = reader.readLine()) != null) {
//                        //获取每一行数据
//                        String[] lines = line.split(",");
//                        //存入到对于的对象中
//                        StockDay6006 stockDay6006 = new StockDay6006();
//                        stockDay6006.setDate(parseDate(lines[30]));
//                        stockDay6006.setCodeId(stockCode.getId());
//                        stockDay6006.setCodeEx(stockCode.getEx());
//                        stockDay6006.setOpeningPrice(getBigDecimal(lines[1]));
//                        stockDay6006.setClosingPrice(getBigDecimal(lines[3]));
//                        stockDay6006.setFoot(getBigDecimal(lines[5]));
//                        stockDay6006.setTopside(getBigDecimal(lines[4]));
//                        BigDecimal i=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2]))).divide(getBigDecimal(lines[2]),4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
//                        BigDecimal k=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2])));
//                        stockDay6006.setChangePoints(k);
//                        stockDay6006.setRateOfChange(i);
//                        stockDay6006.setMakeQuantity(getBigDecimal(lines[8]));
//                        stockDay6006.setLclosePrice(getBigDecimal(lines[2]));
//                        dayScience6006FunctionToday.dayScience6006Function(stockDay6006);
//                        stockDay6006Service.save(stockDay6006);
//                    }
//                    reader.close();
//                    // 断开连接
//                    connection.disconnect();
//                    continue;
//                case "6007":
//                    while ((line = reader.readLine()) != null) {
//                        //获取每一行数据
//                        String[] lines = line.split(",");
//                        //存入到对于的对象中
//                        StockDay6007 stockDay6007 = new StockDay6007();
//                        stockDay6007.setDate(parseDate(lines[30]));
//                        stockDay6007.setCodeId(stockCode.getId());
//                        stockDay6007.setCodeEx(stockCode.getEx());
//                        stockDay6007.setOpeningPrice(getBigDecimal(lines[1]));
//                        stockDay6007.setClosingPrice(getBigDecimal(lines[3]));
//                        stockDay6007.setFoot(getBigDecimal(lines[5]));
//                        stockDay6007.setTopside(getBigDecimal(lines[4]));
//                        BigDecimal i=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2]))).divide(getBigDecimal(lines[2]),4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
//                        BigDecimal k=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2])));
//                        stockDay6007.setChangePoints(k);
//                        stockDay6007.setRateOfChange(i);
//                        stockDay6007.setMakeQuantity(getBigDecimal(lines[8]));
//                        stockDay6007.setLclosePrice(getBigDecimal(lines[2]));
//                        dayScience6007FunctionToday.dayScience6007Function(stockDay6007);
//                        stockDay6007Service.save(stockDay6007);
//                    }
//                    reader.close();
//                    // 断开连接
//                    connection.disconnect();
//                    continue;
//                case "6008":
//                    while ((line = reader.readLine()) != null) {
//                        //获取每一行数据
//                        String[] lines = line.split(",");
//                        //存入到对于的对象中
//                        StockDay6008 stockDay6008 = new StockDay6008();
//                        stockDay6008.setDate(parseDate(lines[30]));
//                        stockDay6008.setCodeId(stockCode.getId());
//                        stockDay6008.setCodeEx(stockCode.getEx());
//                        stockDay6008.setOpeningPrice(getBigDecimal(lines[1]));
//                        stockDay6008.setClosingPrice(getBigDecimal(lines[3]));
//                        stockDay6008.setFoot(getBigDecimal(lines[5]));
//                        stockDay6008.setTopside(getBigDecimal(lines[4]));
//                        BigDecimal i=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2]))).divide(getBigDecimal(lines[2]),4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
//                        BigDecimal k=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2])));
//                        stockDay6008.setChangePoints(k);
//                        stockDay6008.setRateOfChange(i);
//                        stockDay6008.setMakeQuantity(getBigDecimal(lines[8]));
//                        stockDay6008.setLclosePrice(getBigDecimal(lines[2]));
//                        dayScience6008FunctionToday.dayScience6008Function(stockDay6008);
//                        stockDay6008Service.save(stockDay6008);
//                    }
//                    reader.close();
//                    // 断开连接
//                    connection.disconnect();
//                    continue;
//                case "6009":
//                    while ((line = reader.readLine()) != null) {
//                        //获取每一行数据
//                        String[] lines = line.split(",");
//                        //存入到对于的对象中
//                        StockDay6009 stockDay6009 = new StockDay6009();
//                        stockDay6009.setDate(parseDate(lines[30]));
//                        stockDay6009.setCodeId(stockCode.getId());
//                        stockDay6009.setCodeEx(stockCode.getEx());
//                        stockDay6009.setOpeningPrice(getBigDecimal(lines[1]));
//                        stockDay6009.setClosingPrice(getBigDecimal(lines[3]));
//                        stockDay6009.setFoot(getBigDecimal(lines[5]));
//                        stockDay6009.setTopside(getBigDecimal(lines[4]));
//                        BigDecimal i=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2]))).divide(getBigDecimal(lines[2]),4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
//                        BigDecimal k=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2])));
//                        stockDay6009.setChangePoints(k);
//                        stockDay6009.setRateOfChange(i);
//                        stockDay6009.setMakeQuantity(getBigDecimal(lines[8]));
//                        stockDay6009.setLclosePrice(getBigDecimal(lines[2]));
//                        dayScience6009FunctionToday.dayScience6009Function(stockDay6009);
//                        stockDay6009Service.save(stockDay6009);
//                    }
//                    reader.close();
//                    // 断开连接
//                    connection.disconnect();
//                    continue;
//                case "6010":
//                    while ((line = reader.readLine()) != null) {
//                        //获取每一行数据
//                        String[] lines = line.split(",");
//                        //存入到对于的对象中
//                        StockDay6010 stockDay6010 = new StockDay6010();
//                        stockDay6010.setDate(parseDate(lines[30]));
//                        stockDay6010.setCodeId(stockCode.getId());
//                        stockDay6010.setCodeEx(stockCode.getEx());
//                        stockDay6010.setOpeningPrice(getBigDecimal(lines[1]));
//                        stockDay6010.setClosingPrice(getBigDecimal(lines[3]));
//                        stockDay6010.setFoot(getBigDecimal(lines[5]));
//                        stockDay6010.setTopside(getBigDecimal(lines[4]));
//                        BigDecimal i=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2]))).divide(getBigDecimal(lines[2]),4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
//                        BigDecimal k=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2])));
//                        stockDay6010.setChangePoints(k);
//                        stockDay6010.setRateOfChange(i);
//                        stockDay6010.setMakeQuantity(getBigDecimal(lines[8]));
//                        stockDay6010.setLclosePrice(getBigDecimal(lines[2]));
//                        dayScience6010FunctionToday.dayScience6010Function(stockDay6010);
//                        stockDay6010Service.save(stockDay6010);
//                    }
//                    reader.close();
//                    // 断开连接
//                    connection.disconnect();
//                    continue;
//                case "6011":
//                    while ((line = reader.readLine()) != null) {
//                        //获取每一行数据
//                        String[] lines = line.split(",");
//                        //存入到对于的对象中
//                        StockDay6011 stockDay6011 = new StockDay6011();
//                        stockDay6011.setDate(parseDate(lines[30]));
//                        stockDay6011.setCodeId(stockCode.getId());
//                        stockDay6011.setCodeEx(stockCode.getEx());
//                        stockDay6011.setOpeningPrice(getBigDecimal(lines[1]));
//                        stockDay6011.setClosingPrice(getBigDecimal(lines[3]));
//                        stockDay6011.setFoot(getBigDecimal(lines[5]));
//                        stockDay6011.setTopside(getBigDecimal(lines[4]));
//                        BigDecimal i=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2]))).divide(getBigDecimal(lines[2]),4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
//                        BigDecimal k=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2])));
//                        stockDay6011.setChangePoints(k);
//                        stockDay6011.setRateOfChange(i);
//                        stockDay6011.setMakeQuantity(getBigDecimal(lines[8]));
//                        stockDay6011.setLclosePrice(getBigDecimal(lines[2]));
//                        dayScience6011FunctionToday.dayScience6011Function(stockDay6011);
//                        stockDay6011Service.save(stockDay6011);
//                    }
//                    reader.close();
//                    // 断开连接
//                    connection.disconnect();
//                    continue;
//                case "6012":
//                    while ((line = reader.readLine()) != null) {
//                        //获取每一行数据
//                        String[] lines = line.split(",");
//                        //存入到对于的对象中
//                        StockDay6012 stockDay6012 = new StockDay6012();
//                        stockDay6012.setDate(parseDate(lines[30]));
//                        stockDay6012.setCodeId(stockCode.getId());
//                        stockDay6012.setCodeEx(stockCode.getEx());
//                        stockDay6012.setOpeningPrice(getBigDecimal(lines[1]));
//                        stockDay6012.setClosingPrice(getBigDecimal(lines[3]));
//                        stockDay6012.setFoot(getBigDecimal(lines[5]));
//                        stockDay6012.setTopside(getBigDecimal(lines[4]));
//                        BigDecimal i=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2]))).divide(getBigDecimal(lines[2]),4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
//                        BigDecimal k=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2])));
//                        stockDay6012.setChangePoints(k);
//                        stockDay6012.setRateOfChange(i);
//                        stockDay6012.setMakeQuantity(getBigDecimal(lines[8]));
//                        stockDay6012.setLclosePrice(getBigDecimal(lines[2]));
//                        dayScience6012FunctionToday.dayScience6012Function(stockDay6012);
//                        stockDay6012Service.save(stockDay6012);
//                    }
//                    reader.close();
//                    // 断开连接
//                    connection.disconnect();
//                    continue;
//                case "6013":
//                    while ((line = reader.readLine()) != null) {
//                        //获取每一行数据
//                        String[] lines = line.split(",");
//                        //存入到对于的对象中
//                        StockDay6013 stockDay6013 = new StockDay6013();
//                        stockDay6013.setDate(parseDate(lines[30]));
//                        stockDay6013.setCodeId(stockCode.getId());
//                        stockDay6013.setCodeEx(stockCode.getEx());
//                        stockDay6013.setOpeningPrice(getBigDecimal(lines[1]));
//                        stockDay6013.setClosingPrice(getBigDecimal(lines[3]));
//                        stockDay6013.setFoot(getBigDecimal(lines[5]));
//                        stockDay6013.setTopside(getBigDecimal(lines[4]));
//                        BigDecimal i=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2]))).divide(getBigDecimal(lines[2]),4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
//                        BigDecimal k=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2])));
//                        stockDay6013.setChangePoints(k);
//                        stockDay6013.setRateOfChange(i);
//                        stockDay6013.setMakeQuantity(getBigDecimal(lines[8]));
//                        stockDay6013.setLclosePrice(getBigDecimal(lines[2]));
//                        dayScience6013FunctionToday.dayScience6013Function(stockDay6013);
//                        stockDay6013Service.save(stockDay6013);
//                    }
//                    reader.close();
//                    // 断开连接
//                    connection.disconnect();
//                    continue;
//                case "6014":
//                    while ((line = reader.readLine()) != null) {
//                        //获取每一行数据
//                        String[] lines = line.split(",");
//                        //存入到对于的对象中
//                        StockDay6014 stockDay6014 = new StockDay6014();
//                        stockDay6014.setDate(parseDate(lines[30]));
//                        stockDay6014.setCodeId(stockCode.getId());
//                        stockDay6014.setCodeEx(stockCode.getEx());
//                        stockDay6014.setOpeningPrice(getBigDecimal(lines[1]));
//                        stockDay6014.setClosingPrice(getBigDecimal(lines[3]));
//                        stockDay6014.setFoot(getBigDecimal(lines[5]));
//                        stockDay6014.setTopside(getBigDecimal(lines[4]));
//                        BigDecimal i=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2]))).divide(getBigDecimal(lines[2]),4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
//                        BigDecimal k=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2])));
//                        stockDay6014.setChangePoints(k);
//                        stockDay6014.setRateOfChange(i);
//                        stockDay6014.setMakeQuantity(getBigDecimal(lines[8]));
//                        stockDay6014.setLclosePrice(getBigDecimal(lines[2]));
//                        dayScience6014FunctionToday.dayScience6014Function(stockDay6014);
//                        stockDay6014Service.save(stockDay6014);
//                    }
//                    reader.close();
//                    // 断开连接
//                    connection.disconnect();
//                    continue;
//                case "6015":
//                    while ((line = reader.readLine()) != null) {
//                        //获取每一行数据
//                        String[] lines = line.split(",");
//                        //存入到对于的对象中
//                        StockDay6015 stockDay6015 = new StockDay6015();
//                        stockDay6015.setDate(parseDate(lines[30]));
//                        stockDay6015.setCodeId(stockCode.getId());
//                        stockDay6015.setCodeEx(stockCode.getEx());
//                        stockDay6015.setOpeningPrice(getBigDecimal(lines[1]));
//                        stockDay6015.setClosingPrice(getBigDecimal(lines[3]));
//                        stockDay6015.setFoot(getBigDecimal(lines[5]));
//                        stockDay6015.setTopside(getBigDecimal(lines[4]));
//                        BigDecimal i=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2]))).divide(getBigDecimal(lines[2]),4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
//                        BigDecimal k=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2])));
//                        stockDay6015.setChangePoints(k);
//                        stockDay6015.setRateOfChange(i);
//                        stockDay6015.setMakeQuantity(getBigDecimal(lines[8]));
//                        stockDay6015.setLclosePrice(getBigDecimal(lines[2]));
//                        dayScience6015FunctionToday.dayScience6015Function(stockDay6015);
//                        stockDay6015Service.save(stockDay6015);
//                    }
//                    reader.close();
//                    // 断开连接
//                    connection.disconnect();
//                    continue;
//                case "6016":
//                    while ((line = reader.readLine()) != null) {
//                        //获取每一行数据
//                        String[] lines = line.split(",");
//                        //存入到对于的对象中
//                        StockDay6016 stockDay6016 = new StockDay6016();
//                        stockDay6016.setDate(parseDate(lines[30]));
//                        stockDay6016.setCodeId(stockCode.getId());
//                        stockDay6016.setCodeEx(stockCode.getEx());
//                        stockDay6016.setOpeningPrice(getBigDecimal(lines[1]));
//                        stockDay6016.setClosingPrice(getBigDecimal(lines[3]));
//                        stockDay6016.setFoot(getBigDecimal(lines[5]));
//                        stockDay6016.setTopside(getBigDecimal(lines[4]));
//                        BigDecimal i=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2]))).divide(getBigDecimal(lines[2]),4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
//                        BigDecimal k=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2])));
//                        stockDay6016.setChangePoints(k);
//                        stockDay6016.setRateOfChange(i);
//                        stockDay6016.setMakeQuantity(getBigDecimal(lines[8]));
//                        stockDay6016.setLclosePrice(getBigDecimal(lines[2]));
//                        dayScience6016FunctionToday.dayScience6016Function(stockDay6016);
//                        stockDay6016Service.save(stockDay6016);
//                    }
//                    reader.close();
//                    // 断开连接
//                    connection.disconnect();
//                    continue;
//                case "6017":
//                    while ((line = reader.readLine()) != null) {
//                        //获取每一行数据
//                        String[] lines = line.split(",");
//                        //存入到对于的对象中
//                        StockDay6017 stockDay6017 = new StockDay6017();
//                        stockDay6017.setDate(parseDate(lines[30]));
//                        stockDay6017.setCodeId(stockCode.getId());
//                        stockDay6017.setCodeEx(stockCode.getEx());
//                        stockDay6017.setOpeningPrice(getBigDecimal(lines[1]));
//                        stockDay6017.setClosingPrice(getBigDecimal(lines[3]));
//                        stockDay6017.setFoot(getBigDecimal(lines[5]));
//                        stockDay6017.setTopside(getBigDecimal(lines[4]));
//                        BigDecimal i=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2]))).divide(getBigDecimal(lines[2]),4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
//                        BigDecimal k=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2])));
//                        stockDay6017.setChangePoints(k);
//                        stockDay6017.setRateOfChange(i);
//                        stockDay6017.setMakeQuantity(getBigDecimal(lines[8]));
//                        stockDay6017.setLclosePrice(getBigDecimal(lines[2]));
//                        dayScience6017FunctionToday.dayScience6017Function(stockDay6017);
//                        stockDay6017Service.save(stockDay6017);
//                    }
//                    reader.close();
//                    // 断开连接
//                    connection.disconnect();
//                    continue;
//                case "6018":
//                    while ((line = reader.readLine()) != null) {
//                        //获取每一行数据
//                        String[] lines = line.split(",");
//                        //存入到对于的对象中
//                        StockDay6018 stockDay6018 = new StockDay6018();
//                        stockDay6018.setDate(parseDate(lines[30]));
//                        stockDay6018.setCodeId(stockCode.getId());
//                        stockDay6018.setCodeEx(stockCode.getEx());
//                        stockDay6018.setOpeningPrice(getBigDecimal(lines[1]));
//                        stockDay6018.setClosingPrice(getBigDecimal(lines[3]));
//                        stockDay6018.setFoot(getBigDecimal(lines[5]));
//                        stockDay6018.setTopside(getBigDecimal(lines[4]));
//                        BigDecimal i=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2]))).divide(getBigDecimal(lines[2]),4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
//                        BigDecimal k=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2])));
//                        stockDay6018.setChangePoints(k);
//                        stockDay6018.setRateOfChange(i);
//                        stockDay6018.setMakeQuantity(getBigDecimal(lines[8]));
//                        stockDay6018.setLclosePrice(getBigDecimal(lines[2]));
//                        dayScience6018FunctionToday.dayScience6018Function(stockDay6018);
//                        stockDay6018Service.save(stockDay6018);
//                    }
//                    reader.close();
//                    // 断开连接
//                    connection.disconnect();
//                    continue;
//                case "6019":
//                    while ((line = reader.readLine()) != null) {
//                        //获取每一行数据
//                        String[] lines = line.split(",");
//                        //存入到对于的对象中
//                        StockDay6019 stockDay6019 = new StockDay6019();
//                        stockDay6019.setDate(parseDate(lines[30]));
//                        stockDay6019.setCodeId(stockCode.getId());
//                        stockDay6019.setCodeEx(stockCode.getEx());
//                        stockDay6019.setOpeningPrice(getBigDecimal(lines[1]));
//                        stockDay6019.setClosingPrice(getBigDecimal(lines[3]));
//                        stockDay6019.setFoot(getBigDecimal(lines[5]));
//                        stockDay6019.setTopside(getBigDecimal(lines[4]));
//                        BigDecimal i=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2]))).divide(getBigDecimal(lines[2]),4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
//                        BigDecimal k=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2])));
//                        stockDay6019.setChangePoints(k);
//                        stockDay6019.setRateOfChange(i);
//                        stockDay6019.setMakeQuantity(getBigDecimal(lines[8]));
//                        stockDay6019.setLclosePrice(getBigDecimal(lines[2]));
//                        dayScience6019FunctionToday.dayScience6019Function(stockDay6019);
//                        stockDay6019Service.save(stockDay6019);
//                    }
//                    reader.close();
//                    // 断开连接
//                    connection.disconnect();
//                    continue;
//                default:
//                    switch (stockCode.getId().substring(0, 3)) {
//                        case "001":
//                            while ((line = reader.readLine()) != null) {
//                                //获取每一行数据
//                                String[] lines = line.split(",");
//                                //存入到对于的对象中
//                                StockDay001 stockDay001 = new StockDay001();
//                                stockDay001.setDate(parseDate(lines[30]));
//                                stockDay001.setCodeId(stockCode.getId());
//                                stockDay001.setCodeEx(stockCode.getEx());
//                                stockDay001.setOpeningPrice(getBigDecimal(lines[1]));
//                                stockDay001.setClosingPrice(getBigDecimal(lines[3]));
//                                stockDay001.setFoot(getBigDecimal(lines[5]));
//                                stockDay001.setTopside(getBigDecimal(lines[4]));
//                                BigDecimal i=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2]))).divide(getBigDecimal(lines[2]),4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
//                                BigDecimal k=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2])));
//                                stockDay001.setChangePoints(k);
//                                stockDay001.setRateOfChange(i);
//                                stockDay001.setMakeQuantity(getBigDecimal(lines[8]));
//                                stockDay001.setLclosePrice(getBigDecimal(lines[2]));
//                                dayScience001FunctionToday.dayScience001Function(stockDay001);
//                                stockDay001Service.save(stockDay001);
//                            }
//                            reader.close();
//                            // 断开连接
//                            connection.disconnect();
//                            continue;
//                        case "399":
//                            while ((line = reader.readLine()) != null) {
//                                //获取每一行数据
//                                String[] lines = line.split(",");
//                                //存入到对于的对象中
//                                StockDay399 stockDay399 = new StockDay399();
//                                stockDay399.setDate(parseDate(lines[30]));
//                                stockDay399.setCodeId(stockCode.getId());
//                                stockDay399.setCodeEx(stockCode.getEx());
//                                stockDay399.setOpeningPrice(getBigDecimal(lines[1]));
//                                stockDay399.setClosingPrice(getBigDecimal(lines[3]));
//                                stockDay399.setFoot(getBigDecimal(lines[5]));
//                                stockDay399.setTopside(getBigDecimal(lines[4]));
//                                BigDecimal i=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2]))).divide(getBigDecimal(lines[2]),4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
//                                BigDecimal k=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2])));
//                                stockDay399.setChangePoints(k);
//                                stockDay399.setRateOfChange(i);
//                                stockDay399.setMakeQuantity(getBigDecimal(lines[8]));
//                                stockDay399.setLclosePrice(getBigDecimal(lines[2]));
//                                dayScience399FunctionToday.dayScience399Function(stockDay399);
//                                stockDay399Service.save(stockDay399);
//                            }
//                            reader.close();
//                            // 断开连接
//                            connection.disconnect();
//                            continue;
//                        case "603":
//                            while ((line = reader.readLine()) != null) {
//                                //获取每一行数据
//                                String[] lines = line.split(",");
//                                //存入到对于的对象中
//                                StockDay603 stockDay603 = new StockDay603();
//                                stockDay603.setDate(parseDate(lines[30]));
//                                stockDay603.setCodeId(stockCode.getId());
//                                stockDay603.setCodeEx(stockCode.getEx());
//                                stockDay603.setOpeningPrice(getBigDecimal(lines[1]));
//                                stockDay603.setClosingPrice(getBigDecimal(lines[3]));
//                                stockDay603.setFoot(getBigDecimal(lines[5]));
//                                stockDay603.setTopside(getBigDecimal(lines[4]));
//                                BigDecimal i=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2]))).divide(getBigDecimal(lines[2]),4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
//                                BigDecimal k=(getBigDecimal(lines[3]).subtract(getBigDecimal(lines[2])));
//                                stockDay603.setChangePoints(k);
//                                stockDay603.setRateOfChange(i);
//                                stockDay603.setMakeQuantity(getBigDecimal(lines[8]));
//                                stockDay603.setLclosePrice(getBigDecimal(lines[2]));
//                                dayScience603FunctionToday.dayScience603Function(stockDay603);
//                                stockDay603Service.save(stockDay603);
//                            }
//                            reader.close();
//                            // 断开连接
//                            connection.disconnect();
//                            continue;
//                        default:
//                            continue;
//                    }
//            }
//
//        }



//        调用技术解析
//        获取上证
        Page<StockDay0000> page=new Page<>(1,60);
        List<StockDay0000> stockDay000001List = stockDay0000Service.selectByCodeAndExPage(page,"000001", "SH");
        //获取sz
        Page<StockDay399> page1=new Page<>(1,60);
        List<StockDay399> stockDay399001List = stockDay399Service.selectByCodeAndExPage(page1,"399001", "SZ");
        //获取中小
        List<StockDay399> stockDay399005List = stockDay399Service.selectByCodeAndExPage(page1,"399005", "SZ");
        //获取创业
        List<StockDay399> stockDay399006List = stockDay399Service.selectByCodeAndExPage(page1,"399006", "SZ");

        for (StockCode stockCode : stockCodeList) {
            boolean fage;
            switch (stockCode.getId().substring(0, 4)) {
                case "0000":
                    if (stockCode.getId().equals("000001")&&stockCode.getEx().equals("SH")) {
                        continue;
                    }else {
                        dayYuPan0000Function.dayYuPanFunction(stockCode, stockDay399001List);
                    }
                    continue;
                case "0001":
                    dayYuPan0001Function.dayYuPanFunction(stockCode, stockDay399001List);
                    continue;
                case "0002":
                    dayYuPan0002Function.dayYuPanFunction(stockCode, stockDay399001List);
                    continue;
                case "0003":
                    dayYuPan0003Function.dayYuPanFunction(stockCode, stockDay399001List);
                    continue;
                case "0004":
                    dayYuPan0004Function.dayYuPanFunction(stockCode, stockDay399001List);
                    continue;
                case "0005":
                    dayYuPan0005Function.dayYuPanFunction(stockCode, stockDay399001List);
                    continue;
                case "0006":
                    dayYuPan0006Function.dayYuPanFunction(stockCode, stockDay399001List);
                    continue;
                case "0007":
                    dayYuPan0007Function.dayYuPanFunction(stockCode, stockDay399001List);
                    continue;
                case "0008":
                    dayYuPan0008Function.dayYuPanFunction(stockCode, stockDay399001List);
                    continue;
                case "0009":
                    dayYuPan0009Function.dayYuPanFunction(stockCode, stockDay399001List);
                    continue;
                case "0020":
                    dayYuPan0020Function.dayYuPanFunction(stockCode, stockDay399005List);
                    continue;
                case "0021":
                    dayYuPan0021Function.dayYuPanFunction(stockCode, stockDay399005List);
                    continue;
                case "0022":
                    dayYuPan0022Function.dayYuPanFunction(stockCode, stockDay399005List);
                    continue;
                case "0023":
                    dayYuPan0023Function.dayYuPanFunction(stockCode, stockDay399005List);
                    continue;
                case "0024":
                    dayYuPan0024Function.dayYuPanFunction(stockCode, stockDay399005List);
                    continue;
                case "0025":
                    dayYuPan0025Function.dayYuPanFunction(stockCode, stockDay399005List);
                    continue;
                case "0026":
                    dayYuPan0026Function.dayYuPanFunction(stockCode, stockDay399005List);
                    continue;
                case "0027":
                    dayYuPan0027Function.dayYuPanFunction(stockCode, stockDay399005List);
                    continue;
                case "0028":
                    dayYuPan0028Function.dayYuPanFunction(stockCode, stockDay399005List);
                    continue;
                case "3000":
                    dayYuPan3000Function.dayYuPanFunction(stockCode, stockDay399006List);
                    continue;
                case "3001":
                    dayYuPan3001Function.dayYuPanFunction(stockCode, stockDay399006List);
                    continue;
                case "3002":
                    dayYuPan3002Function.dayYuPanFunction(stockCode, stockDay399006List);
                    continue;
                case "3003":
                    dayYuPan3003Function.dayYuPanFunction(stockCode, stockDay399006List);
                    continue;
                case "3004":
                    dayYuPan3004Function.dayYuPanFunction(stockCode, stockDay399006List);
                    continue;
                case "3005":
                    dayYuPan3005Function.dayYuPanFunction(stockCode, stockDay399006List);
                    continue;
                case "6000":
                    dayYuPan6000Function.dayYuPanFunction(stockCode, stockDay000001List);
                    continue;
                case "6001":
                    dayYuPan6001Function.dayYuPanFunction(stockCode, stockDay000001List);
                    continue;
                case "6002":
                    dayYuPan6002Function.dayYuPanFunction(stockCode, stockDay000001List);
                    continue;
                case "6003":
                    dayYuPan6003Function.dayYuPanFunction(stockCode, stockDay000001List);
                    continue;
                case "6004":
                    dayYuPan6004Function.dayYuPanFunction(stockCode, stockDay000001List);
                    continue;
                case "6005":
                    dayYuPan6005Function.dayYuPanFunction(stockCode, stockDay000001List);
                    continue;
                case "6006":
                    dayYuPan6006Function.dayYuPanFunction(stockCode, stockDay000001List);
                    continue;
                case "6007":
                    dayYuPan6007Function.dayYuPanFunction(stockCode, stockDay000001List);
                    continue;
                case "6008":
                    dayYuPan6008Function.dayYuPanFunction(stockCode, stockDay000001List);
                    continue;
                case "6009":
                    dayYuPan6009Function.dayYuPanFunction(stockCode, stockDay000001List);
                    continue;
                case "6010":
                    dayYuPan6010Function.dayYuPanFunction(stockCode, stockDay000001List);
                    continue;
                case "6011":
                    dayYuPan6011Function.dayYuPanFunction(stockCode, stockDay000001List);
                    continue;
                case "6012":
                    dayYuPan6012Function.dayYuPanFunction(stockCode, stockDay000001List);
                    continue;
                case "6013":
                    dayYuPan6013Function.dayYuPanFunction(stockCode, stockDay000001List);
                    continue;
                case "6014":
                    dayYuPan6014Function.dayYuPanFunction(stockCode, stockDay000001List);
                    continue;
                case "6015":
                    dayYuPan6015Function.dayYuPanFunction(stockCode, stockDay000001List);
                    continue;
                case "6016":
                    dayYuPan6016Function.dayYuPanFunction(stockCode, stockDay000001List);
                    continue;
                case "6017":
                    dayYuPan6017Function.dayYuPanFunction(stockCode, stockDay000001List);
                    continue;
                case "6018":
                    dayYuPan6018Function.dayYuPanFunction(stockCode, stockDay000001List);
                    continue;
                case "6019":
                    dayYuPan6019Function.dayYuPanFunction(stockCode, stockDay000001List);
                    continue;
                default:
                    switch (stockCode.getId().substring(0, 3)) {
                        case "001":
                            dayYuPan001Function.dayYuPanFunction(stockCode, stockDay399001List);
                            continue;
                        case "603":
                            dayYuPan603Function.dayYuPanFunction(stockCode, stockDay000001List);
                            continue;
                        default:
                            continue;
                    }
            }
        }
        return true;
    }


    public static BigDecimal getBigDecimal(String str) {
        if (StringUtils.isEmpty(str)||str.equals("None")){
            return null;
        }
        return new BigDecimal(str);
    }

//    public static void main(String[] argo){
//        System.out.println(getBigDecimal("-1.25"));
//    }

    //date->string
    public static String parse(Date date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        return sdf.format(date);
    }

    //string->date
    public static Date parseDate(String str) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.parse(str);
    }
    public static Date parseDate2(String str) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        return sdf.parse(str);
    }

    //获取市场编号
    public static String getEncoding(StockCode stockCode) {
        if (stockCode == null) {
            return null;
        }
        String code = null;
        switch (stockCode.getEx()) {
            case "SH":
                code = "0";
                break;
            case "SZ":
                code = "1";
                break;
        }
        return code + stockCode.getId();
    }

    //获取市场编号
    public static String getEncoding2(StockCode stockCode) {
        if (stockCode == null) {
            return null;
        }
        String code = null;
        switch (stockCode.getEx()) {
            case "SH":
                code = "sh";
                break;
            case "SZ":
                code = "sz";
                break;
        }
        return code + stockCode.getId();
    }


}
