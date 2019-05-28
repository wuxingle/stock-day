package com.stock.stockday.service.impl;

import com.stock.stockday.config.UrlConfig;
import com.stock.stockday.entity.StockCode;
import com.stock.stockday.entity.StockDay0001;
import com.stock.stockday.entity.StockDay0002;
import com.stock.stockday.entity.StockDay0003;
import com.stock.stockday.entity.StockDay0004;
import com.stock.stockday.entity.StockDay399;
import com.stock.stockday.entity.StockDay6000;
import com.stock.stockday.entity.StockDay6001;
import com.stock.stockday.entity.StockDay6002;
import com.stock.stockday.entity.StockDay6003;
import com.stock.stockday.entity.StockDay6004;
import com.stock.stockday.entity.StockDay6005;
import com.stock.stockday.entity.StockDay6006;
import com.stock.stockday.entity.StockDay6007;
import com.stock.stockday.entity.StockDay6008;
import com.stock.stockday.entity.StockDay6009;
import com.stock.stockday.entity.StockDay6010;
import com.stock.stockday.entity.StockDay6011;
import com.stock.stockday.entity.StockDay6012;
import com.stock.stockday.entity.StockDay6013;
import com.stock.stockday.entity.StockDay6014;
import com.stock.stockday.entity.StockDay6015;
import com.stock.stockday.entity.StockDay6016;
import com.stock.stockday.entity.StockDay6017;
import com.stock.stockday.entity.StockDay6018;
import com.stock.stockday.entity.StockDay6019;
import com.stock.stockday.entity.StockDay603;
import com.stock.stockday.entity.StockDayFundFlow0000;
import com.stock.stockday.entity.StockDayFundFlow0001;
import com.stock.stockday.entity.StockDayFundFlow0001;
import com.stock.stockday.entity.StockDayFundFlow0002;
import com.stock.stockday.entity.StockDayFundFlow0003;
import com.stock.stockday.entity.StockDayFundFlow0004;
import com.stock.stockday.entity.StockDayFundFlow0005;
import com.stock.stockday.entity.StockDayFundFlow0006;
import com.stock.stockday.entity.StockDayFundFlow0007;
import com.stock.stockday.entity.StockDayFundFlow0008;
import com.stock.stockday.entity.StockDayFundFlow0009;
import com.stock.stockday.entity.StockDayFundFlow001;
import com.stock.stockday.entity.StockDayFundFlow0020;
import com.stock.stockday.entity.StockDayFundFlow0021;
import com.stock.stockday.entity.StockDayFundFlow0022;
import com.stock.stockday.entity.StockDayFundFlow0023;
import com.stock.stockday.entity.StockDayFundFlow0024;
import com.stock.stockday.entity.StockDayFundFlow0025;
import com.stock.stockday.entity.StockDayFundFlow0026;
import com.stock.stockday.entity.StockDayFundFlow0027;
import com.stock.stockday.entity.StockDayFundFlow0028;
import com.stock.stockday.entity.StockDayFundFlow3000;
import com.stock.stockday.entity.StockDayFundFlow3001;
import com.stock.stockday.entity.StockDayFundFlow3002;
import com.stock.stockday.entity.StockDayFundFlow3003;
import com.stock.stockday.entity.StockDayFundFlow3004;
import com.stock.stockday.entity.StockDayFundFlow3005;
import com.stock.stockday.entity.StockDayFundFlow399;
import com.stock.stockday.entity.StockDayFundFlow6000;
import com.stock.stockday.entity.StockDayFundFlow6001;
import com.stock.stockday.entity.StockDayFundFlow6002;
import com.stock.stockday.entity.StockDayFundFlow6003;
import com.stock.stockday.entity.StockDayFundFlow6004;
import com.stock.stockday.entity.StockDayFundFlow6005;
import com.stock.stockday.entity.StockDayFundFlow6006;
import com.stock.stockday.entity.StockDayFundFlow6007;
import com.stock.stockday.entity.StockDayFundFlow6008;
import com.stock.stockday.entity.StockDayFundFlow6009;
import com.stock.stockday.entity.StockDayFundFlow6010;
import com.stock.stockday.entity.StockDayFundFlow6011;
import com.stock.stockday.entity.StockDayFundFlow6012;
import com.stock.stockday.entity.StockDayFundFlow6013;
import com.stock.stockday.entity.StockDayFundFlow6014;
import com.stock.stockday.entity.StockDayFundFlow6015;
import com.stock.stockday.entity.StockDayFundFlow6016;
import com.stock.stockday.entity.StockDayFundFlow6017;
import com.stock.stockday.entity.StockDayFundFlow6018;
import com.stock.stockday.entity.StockDayFundFlow6019;
import com.stock.stockday.entity.StockDayFundFlow603;
import com.stock.stockday.service.StockCodeService;
import com.stock.stockday.service.StockDayFundFlow0000Service;
import com.stock.stockday.service.StockDayFundFlow0001Service;
import com.stock.stockday.service.StockDayFundFlow0001Service;
import com.stock.stockday.service.StockDayFundFlow0002Service;
import com.stock.stockday.service.StockDayFundFlow0003Service;
import com.stock.stockday.service.StockDayFundFlow0004Service;
import com.stock.stockday.service.StockDayFundFlow0005Service;
import com.stock.stockday.service.StockDayFundFlow0006Service;
import com.stock.stockday.service.StockDayFundFlow0007Service;
import com.stock.stockday.service.StockDayFundFlow0008Service;
import com.stock.stockday.service.StockDayFundFlow0009Service;
import com.stock.stockday.service.StockDayFundFlow001Service;
import com.stock.stockday.service.StockDayFundFlow0020Service;
import com.stock.stockday.service.StockDayFundFlow0021Service;
import com.stock.stockday.service.StockDayFundFlow0022Service;
import com.stock.stockday.service.StockDayFundFlow0023Service;
import com.stock.stockday.service.StockDayFundFlow0024Service;
import com.stock.stockday.service.StockDayFundFlow0025Service;
import com.stock.stockday.service.StockDayFundFlow0026Service;
import com.stock.stockday.service.StockDayFundFlow0027Service;
import com.stock.stockday.service.StockDayFundFlow0028Service;
import com.stock.stockday.service.StockDayFundFlow3000Service;
import com.stock.stockday.service.StockDayFundFlow3001Service;
import com.stock.stockday.service.StockDayFundFlow3002Service;
import com.stock.stockday.service.StockDayFundFlow3003Service;
import com.stock.stockday.service.StockDayFundFlow3004Service;
import com.stock.stockday.service.StockDayFundFlow3005Service;
import com.stock.stockday.service.StockDayFundFlow399Service;
import com.stock.stockday.service.StockDayFundFlow6000Service;
import com.stock.stockday.service.StockDayFundFlow6001Service;
import com.stock.stockday.service.StockDayFundFlow6002Service;
import com.stock.stockday.service.StockDayFundFlow6003Service;
import com.stock.stockday.service.StockDayFundFlow6004Service;
import com.stock.stockday.service.StockDayFundFlow6005Service;
import com.stock.stockday.service.StockDayFundFlow6006Service;
import com.stock.stockday.service.StockDayFundFlow6007Service;
import com.stock.stockday.service.StockDayFundFlow6008Service;
import com.stock.stockday.service.StockDayFundFlow6009Service;
import com.stock.stockday.service.StockDayFundFlow6010Service;
import com.stock.stockday.service.StockDayFundFlow6011Service;
import com.stock.stockday.service.StockDayFundFlow6012Service;
import com.stock.stockday.service.StockDayFundFlow6013Service;
import com.stock.stockday.service.StockDayFundFlow6014Service;
import com.stock.stockday.service.StockDayFundFlow6015Service;
import com.stock.stockday.service.StockDayFundFlow6016Service;
import com.stock.stockday.service.StockDayFundFlow6017Service;
import com.stock.stockday.service.StockDayFundFlow6018Service;
import com.stock.stockday.service.StockDayFundFlow6019Service;
import com.stock.stockday.service.StockDayFundFlow603Service;
import com.stock.stockday.service.StockDayFundFlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import static com.stock.stockday.service.impl.StockDayServiceImpl.getBigDecimal;
import static com.stock.stockday.service.impl.StockDayServiceImpl.parseDate;
import static com.stock.stockday.service.impl.StockDayServiceImpl.parseDate2;

@Service
public class StockDayFundFlowServiceImpl implements StockDayFundFlowService {
    @Autowired
    private UrlConfig urlConfig;
    @Autowired
    private StockCodeService stockCodeService;
    @Autowired
    private StockDayFundFlow0000Service stockDayFundFlow0000Service;
    @Autowired
    private StockDayFundFlow0001Service stockDayFundFlow0001Service;
    @Autowired
    private StockDayFundFlow0002Service stockDayFundFlow0002Service;
    @Autowired
    private StockDayFundFlow0003Service stockDayFundFlow0003Service;
    @Autowired
    private StockDayFundFlow0004Service stockDayFundFlow0004Service;
    @Autowired
    private StockDayFundFlow0005Service stockDayFundFlow0005Service;
    @Autowired
    private StockDayFundFlow0006Service stockDayFundFlow0006Service;
    @Autowired
    private StockDayFundFlow0007Service stockDayFundFlow0007Service;
    @Autowired
    private StockDayFundFlow0008Service stockDayFundFlow0008Service;
    @Autowired
    private StockDayFundFlow0009Service stockDayFundFlow0009Service;
    @Autowired
    private StockDayFundFlow0020Service stockDayFundFlow0020Service;
    @Autowired
    private StockDayFundFlow0021Service stockDayFundFlow0021Service;
    @Autowired
    private StockDayFundFlow0022Service stockDayFundFlow0022Service;
    @Autowired
    private StockDayFundFlow0023Service stockDayFundFlow0023Service;
    @Autowired
    private StockDayFundFlow0024Service stockDayFundFlow0024Service;
    @Autowired
    private StockDayFundFlow0025Service stockDayFundFlow0025Service;
    @Autowired
    private StockDayFundFlow0026Service stockDayFundFlow0026Service;
    @Autowired
    private StockDayFundFlow0027Service stockDayFundFlow0027Service;
    @Autowired
    private StockDayFundFlow0028Service stockDayFundFlow0028Service;
    @Autowired
    private StockDayFundFlow3000Service stockDayFundFlow3000Service;
    @Autowired
    private StockDayFundFlow3001Service stockDayFundFlow3001Service;
    @Autowired
    private StockDayFundFlow3002Service stockDayFundFlow3002Service;
    @Autowired
    private StockDayFundFlow3003Service stockDayFundFlow3003Service;
    @Autowired
    private StockDayFundFlow3004Service stockDayFundFlow3004Service;
    @Autowired
    private StockDayFundFlow3005Service stockDayFundFlow3005Service;
    @Autowired
    private StockDayFundFlow6000Service stockDayFundFlow6000Service;
    @Autowired
    private StockDayFundFlow6001Service stockDayFundFlow6001Service;
    @Autowired
    private StockDayFundFlow6002Service stockDayFundFlow6002Service;
    @Autowired
    private StockDayFundFlow6003Service stockDayFundFlow6003Service;
    @Autowired
    private StockDayFundFlow6004Service stockDayFundFlow6004Service;
    @Autowired
    private StockDayFundFlow6005Service stockDayFundFlow6005Service;
    @Autowired
    private StockDayFundFlow6006Service stockDayFundFlow6006Service;
    @Autowired
    private StockDayFundFlow6007Service stockDayFundFlow6007Service;
    @Autowired
    private StockDayFundFlow6008Service stockDayFundFlow6008Service;
    @Autowired
    private StockDayFundFlow6009Service stockDayFundFlow6009Service;
    @Autowired
    private StockDayFundFlow6010Service stockDayFundFlow6010Service;
    @Autowired
    private StockDayFundFlow6011Service stockDayFundFlow6011Service;
    @Autowired
    private StockDayFundFlow6012Service stockDayFundFlow6012Service;
    @Autowired
    private StockDayFundFlow6013Service stockDayFundFlow6013Service;
    @Autowired
    private StockDayFundFlow6014Service stockDayFundFlow6014Service;
    @Autowired
    private StockDayFundFlow6015Service stockDayFundFlow6015Service;
    @Autowired
    private StockDayFundFlow6016Service stockDayFundFlow6016Service;
    @Autowired
    private StockDayFundFlow6017Service stockDayFundFlow6017Service;
    @Autowired
    private StockDayFundFlow6018Service stockDayFundFlow6018Service;
    @Autowired
    private StockDayFundFlow6019Service stockDayFundFlow6019Service;
    @Autowired
    private StockDayFundFlow001Service stockDayFundFlow001Service;
    @Autowired
    private StockDayFundFlow399Service stockDayFundFlow399Service;
    @Autowired
    private StockDayFundFlow603Service stockDayFundFlow603Service;

    @Override
    public boolean getAllFundFlow() throws IOException, ParseException {
        List<StockCode> stockCodeList = stockCodeService.getStockCodeList();
        if (stockCodeList == null || stockCodeList.isEmpty()) {
            return false;
        }
        for (StockCode stockCode : stockCodeList) {
            String url = urlConfig.getStockScienceUrl();
            String code=(stockCode.getEx()+stockCode.getId()).toLowerCase();
            url=url.replace("#code#",code);
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
            int count=1;
            switch (stockCode.getId().substring(0, 4)) {
                case "0000":
                    while ((line = reader.readLine()) != null) {
                        if (line.length()<25){
                            continue;
                        }
                        line=line.substring(line.indexOf("=")+2);
                        //获取每一行数据
                        String[] lines = line.split("~");
                        //存入到对于的对象中
                        StockDayFundFlow0000 stockDayFundFlow0000 = new StockDayFundFlow0000();
                        stockDayFundFlow0000.setCodeId(stockCode.getId());
                        stockDayFundFlow0000.setCodeEx(stockCode.getEx());
                        stockDayFundFlow0000.setDate(parseDate2(lines[13]));
                        stockDayFundFlow0000.setExCode(lines[0]);
                        stockDayFundFlow0000.setMainFlowInto(getBigDecimal(lines[1]));
                        stockDayFundFlow0000.setMainOutflow(getBigDecimal(lines[2]));
                        stockDayFundFlow0000.setMainNetFlow(getBigDecimal(lines[3]));
                        stockDayFundFlow0000.setMainInflowRate(getBigDecimal(lines[4]));
                        stockDayFundFlow0000.setRetailFlowInto(getBigDecimal(lines[5]));
                        stockDayFundFlow0000.setRetailOutflow(getBigDecimal(lines[6]));
                        stockDayFundFlow0000.setRetailNetFlow(getBigDecimal(lines[7]));
                        stockDayFundFlow0000.setRetailInflowRate(getBigDecimal(lines[8]));
                        stockDayFundFlow0000.setFundSum(getBigDecimal(lines[9]));
                        stockDayFundFlow0000Service.save(stockDayFundFlow0000);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    continue;
                case "0001":
                    while ((line = reader.readLine()) != null) {
                        line=line.substring(line.indexOf("=")+2);
                        //获取每一行数据
                        String[] lines = line.split("~");
                        //存入到对于的对象中
                        StockDayFundFlow0001 stockDayFundFlow0001 = new StockDayFundFlow0001();
                        stockDayFundFlow0001.setCodeId(stockCode.getId());
                        stockDayFundFlow0001.setCodeEx(stockCode.getEx());
                        stockDayFundFlow0001.setDate(parseDate2(lines[13]));
                        stockDayFundFlow0001.setExCode(lines[0]);
                        stockDayFundFlow0001.setMainFlowInto(getBigDecimal(lines[1]));
                        stockDayFundFlow0001.setMainOutflow(getBigDecimal(lines[2]));
                        stockDayFundFlow0001.setMainNetFlow(getBigDecimal(lines[3]));
                        stockDayFundFlow0001.setMainInflowRate(getBigDecimal(lines[4]));
                        stockDayFundFlow0001.setRetailFlowInto(getBigDecimal(lines[5]));
                        stockDayFundFlow0001.setRetailOutflow(getBigDecimal(lines[6]));
                        stockDayFundFlow0001.setRetailNetFlow(getBigDecimal(lines[7]));
                        stockDayFundFlow0001.setRetailInflowRate(getBigDecimal(lines[8]));
                        stockDayFundFlow0001.setFundSum(getBigDecimal(lines[9]));
                        stockDayFundFlow0001Service.save(stockDayFundFlow0001);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    continue;
                case "0002":
                    while ((line = reader.readLine()) != null) {
                        line=line.substring(line.indexOf("=")+2);
                        //获取每一行数据
                        String[] lines = line.split("~");
                        //存入到对于的对象中
                        StockDayFundFlow0002 stockDayFundFlow0002 = new StockDayFundFlow0002();
                        stockDayFundFlow0002.setCodeId(stockCode.getId());
                        stockDayFundFlow0002.setCodeEx(stockCode.getEx());
                        stockDayFundFlow0002.setDate(parseDate2(lines[13]));
                        stockDayFundFlow0002.setExCode(lines[0]);
                        stockDayFundFlow0002.setMainFlowInto(getBigDecimal(lines[1]));
                        stockDayFundFlow0002.setMainOutflow(getBigDecimal(lines[2]));
                        stockDayFundFlow0002.setMainNetFlow(getBigDecimal(lines[3]));
                        stockDayFundFlow0002.setMainInflowRate(getBigDecimal(lines[4]));
                        stockDayFundFlow0002.setRetailFlowInto(getBigDecimal(lines[5]));
                        stockDayFundFlow0002.setRetailOutflow(getBigDecimal(lines[6]));
                        stockDayFundFlow0002.setRetailNetFlow(getBigDecimal(lines[7]));
                        stockDayFundFlow0002.setRetailInflowRate(getBigDecimal(lines[8]));
                        stockDayFundFlow0002.setFundSum(getBigDecimal(lines[9]));
                        stockDayFundFlow0002Service.save(stockDayFundFlow0002);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    continue;
                case "0003":
                    while ((line = reader.readLine()) != null) {
                        line=line.substring(line.indexOf("=")+2);
                        //获取每一行数据
                        String[] lines = line.split("~");
                        //存入到对于的对象中
                        StockDayFundFlow0003 stockDayFundFlow0003 = new StockDayFundFlow0003();
                        stockDayFundFlow0003.setCodeId(stockCode.getId());
                        stockDayFundFlow0003.setCodeEx(stockCode.getEx());
                        stockDayFundFlow0003.setDate(parseDate2(lines[13]));
                        stockDayFundFlow0003.setExCode(lines[0]);
                        stockDayFundFlow0003.setMainFlowInto(getBigDecimal(lines[1]));
                        stockDayFundFlow0003.setMainOutflow(getBigDecimal(lines[2]));
                        stockDayFundFlow0003.setMainNetFlow(getBigDecimal(lines[3]));
                        stockDayFundFlow0003.setMainInflowRate(getBigDecimal(lines[4]));
                        stockDayFundFlow0003.setRetailFlowInto(getBigDecimal(lines[5]));
                        stockDayFundFlow0003.setRetailOutflow(getBigDecimal(lines[6]));
                        stockDayFundFlow0003.setRetailNetFlow(getBigDecimal(lines[7]));
                        stockDayFundFlow0003.setRetailInflowRate(getBigDecimal(lines[8]));
                        stockDayFundFlow0003.setFundSum(getBigDecimal(lines[9]));
                        stockDayFundFlow0003Service.save(stockDayFundFlow0003);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    continue;
                case "0004":
                    while ((line = reader.readLine()) != null) {
                        line=line.substring(line.indexOf("=")+2);
                        //获取每一行数据
                        String[] lines = line.split("~");
                        //存入到对于的对象中
                        StockDayFundFlow0004 stockDayFundFlow0004 = new StockDayFundFlow0004();
                        stockDayFundFlow0004.setCodeId(stockCode.getId());
                        stockDayFundFlow0004.setCodeEx(stockCode.getEx());
                        stockDayFundFlow0004.setDate(parseDate2(lines[13]));
                        stockDayFundFlow0004.setExCode(lines[0]);
                        stockDayFundFlow0004.setMainFlowInto(getBigDecimal(lines[1]));
                        stockDayFundFlow0004.setMainOutflow(getBigDecimal(lines[2]));
                        stockDayFundFlow0004.setMainNetFlow(getBigDecimal(lines[3]));
                        stockDayFundFlow0004.setMainInflowRate(getBigDecimal(lines[4]));
                        stockDayFundFlow0004.setRetailFlowInto(getBigDecimal(lines[5]));
                        stockDayFundFlow0004.setRetailOutflow(getBigDecimal(lines[6]));
                        stockDayFundFlow0004.setRetailNetFlow(getBigDecimal(lines[7]));
                        stockDayFundFlow0004.setRetailInflowRate(getBigDecimal(lines[8]));
                        stockDayFundFlow0004.setFundSum(getBigDecimal(lines[9]));
                        stockDayFundFlow0004Service.save(stockDayFundFlow0004);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    continue;
                case "0005":
                    while ((line = reader.readLine()) != null) {
                        line=line.substring(line.indexOf("=")+2);
                        //获取每一行数据
                        String[] lines = line.split("~");
                        //存入到对于的对象中
                        StockDayFundFlow0005 stockDayFundFlow0005 = new StockDayFundFlow0005();
                        stockDayFundFlow0005.setCodeId(stockCode.getId());
                        stockDayFundFlow0005.setCodeEx(stockCode.getEx());
                        stockDayFundFlow0005.setDate(parseDate2(lines[13]));
                        stockDayFundFlow0005.setExCode(lines[0]);
                        stockDayFundFlow0005.setMainFlowInto(getBigDecimal(lines[1]));
                        stockDayFundFlow0005.setMainOutflow(getBigDecimal(lines[2]));
                        stockDayFundFlow0005.setMainNetFlow(getBigDecimal(lines[3]));
                        stockDayFundFlow0005.setMainInflowRate(getBigDecimal(lines[4]));
                        stockDayFundFlow0005.setRetailFlowInto(getBigDecimal(lines[5]));
                        stockDayFundFlow0005.setRetailOutflow(getBigDecimal(lines[6]));
                        stockDayFundFlow0005.setRetailNetFlow(getBigDecimal(lines[7]));
                        stockDayFundFlow0005.setRetailInflowRate(getBigDecimal(lines[8]));
                        stockDayFundFlow0005.setFundSum(getBigDecimal(lines[9]));
                        stockDayFundFlow0005Service.save(stockDayFundFlow0005);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    continue;
                case "0006":
                    while ((line = reader.readLine()) != null) {
                        line=line.substring(line.indexOf("=")+2);
                        //获取每一行数据
                        String[] lines = line.split("~");
                        //存入到对于的对象中
                        StockDayFundFlow0006 stockDayFundFlow0006 = new StockDayFundFlow0006();
                        stockDayFundFlow0006.setCodeId(stockCode.getId());
                        stockDayFundFlow0006.setCodeEx(stockCode.getEx());
                        stockDayFundFlow0006.setDate(parseDate2(lines[13]));
                        stockDayFundFlow0006.setExCode(lines[0]);
                        stockDayFundFlow0006.setMainFlowInto(getBigDecimal(lines[1]));
                        stockDayFundFlow0006.setMainOutflow(getBigDecimal(lines[2]));
                        stockDayFundFlow0006.setMainNetFlow(getBigDecimal(lines[3]));
                        stockDayFundFlow0006.setMainInflowRate(getBigDecimal(lines[4]));
                        stockDayFundFlow0006.setRetailFlowInto(getBigDecimal(lines[5]));
                        stockDayFundFlow0006.setRetailOutflow(getBigDecimal(lines[6]));
                        stockDayFundFlow0006.setRetailNetFlow(getBigDecimal(lines[7]));
                        stockDayFundFlow0006.setRetailInflowRate(getBigDecimal(lines[8]));
                        stockDayFundFlow0006.setFundSum(getBigDecimal(lines[9]));
                        stockDayFundFlow0006Service.save(stockDayFundFlow0006);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    continue;
                case "0007":
                    while ((line = reader.readLine()) != null) {
                        line=line.substring(line.indexOf("=")+2);
                        //获取每一行数据
                        String[] lines = line.split("~");
                        //存入到对于的对象中
                        StockDayFundFlow0007 stockDayFundFlow0007 = new StockDayFundFlow0007();
                        stockDayFundFlow0007.setCodeId(stockCode.getId());
                        stockDayFundFlow0007.setCodeEx(stockCode.getEx());
                        stockDayFundFlow0007.setDate(parseDate2(lines[13]));
                        stockDayFundFlow0007.setExCode(lines[0]);
                        stockDayFundFlow0007.setMainFlowInto(getBigDecimal(lines[1]));
                        stockDayFundFlow0007.setMainOutflow(getBigDecimal(lines[2]));
                        stockDayFundFlow0007.setMainNetFlow(getBigDecimal(lines[3]));
                        stockDayFundFlow0007.setMainInflowRate(getBigDecimal(lines[4]));
                        stockDayFundFlow0007.setRetailFlowInto(getBigDecimal(lines[5]));
                        stockDayFundFlow0007.setRetailOutflow(getBigDecimal(lines[6]));
                        stockDayFundFlow0007.setRetailNetFlow(getBigDecimal(lines[7]));
                        stockDayFundFlow0007.setRetailInflowRate(getBigDecimal(lines[8]));
                        stockDayFundFlow0007.setFundSum(getBigDecimal(lines[9]));
                        stockDayFundFlow0007Service.save(stockDayFundFlow0007);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    continue;
                case "0008":
                    while ((line = reader.readLine()) != null) {
                        line=line.substring(line.indexOf("=")+2);
                        //获取每一行数据
                        String[] lines = line.split("~");
                        //存入到对于的对象中
                        StockDayFundFlow0008 stockDayFundFlow0008 = new StockDayFundFlow0008();
                        stockDayFundFlow0008.setCodeId(stockCode.getId());
                        stockDayFundFlow0008.setCodeEx(stockCode.getEx());
                        stockDayFundFlow0008.setDate(parseDate2(lines[13]));
                        stockDayFundFlow0008.setExCode(lines[0]);
                        stockDayFundFlow0008.setMainFlowInto(getBigDecimal(lines[1]));
                        stockDayFundFlow0008.setMainOutflow(getBigDecimal(lines[2]));
                        stockDayFundFlow0008.setMainNetFlow(getBigDecimal(lines[3]));
                        stockDayFundFlow0008.setMainInflowRate(getBigDecimal(lines[4]));
                        stockDayFundFlow0008.setRetailFlowInto(getBigDecimal(lines[5]));
                        stockDayFundFlow0008.setRetailOutflow(getBigDecimal(lines[6]));
                        stockDayFundFlow0008.setRetailNetFlow(getBigDecimal(lines[7]));
                        stockDayFundFlow0008.setRetailInflowRate(getBigDecimal(lines[8]));
                        stockDayFundFlow0008.setFundSum(getBigDecimal(lines[9]));
                        stockDayFundFlow0008Service.save(stockDayFundFlow0008);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    continue;
                case "0009":
                    while ((line = reader.readLine()) != null) {
                        line=line.substring(line.indexOf("=")+2);
                        //获取每一行数据
                        String[] lines = line.split("~");
                        //存入到对于的对象中
                        StockDayFundFlow0009 stockDayFundFlow0009 = new StockDayFundFlow0009();
                        stockDayFundFlow0009.setCodeId(stockCode.getId());
                        stockDayFundFlow0009.setCodeEx(stockCode.getEx());
                        stockDayFundFlow0009.setDate(parseDate2(lines[13]));
                        stockDayFundFlow0009.setExCode(lines[0]);
                        stockDayFundFlow0009.setMainFlowInto(getBigDecimal(lines[1]));
                        stockDayFundFlow0009.setMainOutflow(getBigDecimal(lines[2]));
                        stockDayFundFlow0009.setMainNetFlow(getBigDecimal(lines[3]));
                        stockDayFundFlow0009.setMainInflowRate(getBigDecimal(lines[4]));
                        stockDayFundFlow0009.setRetailFlowInto(getBigDecimal(lines[5]));
                        stockDayFundFlow0009.setRetailOutflow(getBigDecimal(lines[6]));
                        stockDayFundFlow0009.setRetailNetFlow(getBigDecimal(lines[7]));
                        stockDayFundFlow0009.setRetailInflowRate(getBigDecimal(lines[8]));
                        stockDayFundFlow0009.setFundSum(getBigDecimal(lines[9]));
                        stockDayFundFlow0009Service.save(stockDayFundFlow0009);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    continue;
                case "0020":
                    while ((line = reader.readLine()) != null) {
                        line=line.substring(line.indexOf("=")+2);
                        //获取每一行数据
                        String[] lines = line.split("~");
                        //存入到对于的对象中
                        StockDayFundFlow0020 stockDayFundFlow0020 = new StockDayFundFlow0020();
                        stockDayFundFlow0020.setCodeId(stockCode.getId());
                        stockDayFundFlow0020.setCodeEx(stockCode.getEx());
                        stockDayFundFlow0020.setDate(parseDate2(lines[13]));
                        stockDayFundFlow0020.setExCode(lines[0]);
                        stockDayFundFlow0020.setMainFlowInto(getBigDecimal(lines[1]));
                        stockDayFundFlow0020.setMainOutflow(getBigDecimal(lines[2]));
                        stockDayFundFlow0020.setMainNetFlow(getBigDecimal(lines[3]));
                        stockDayFundFlow0020.setMainInflowRate(getBigDecimal(lines[4]));
                        stockDayFundFlow0020.setRetailFlowInto(getBigDecimal(lines[5]));
                        stockDayFundFlow0020.setRetailOutflow(getBigDecimal(lines[6]));
                        stockDayFundFlow0020.setRetailNetFlow(getBigDecimal(lines[7]));
                        stockDayFundFlow0020.setRetailInflowRate(getBigDecimal(lines[8]));
                        stockDayFundFlow0020.setFundSum(getBigDecimal(lines[9]));
                        stockDayFundFlow0020Service.save(stockDayFundFlow0020);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    continue;
                case "0021":
                    while ((line = reader.readLine()) != null) {
                        line=line.substring(line.indexOf("=")+2);
                        //获取每一行数据
                        String[] lines = line.split("~");
                        //存入到对于的对象中
                        StockDayFundFlow0021 stockDayFundFlow0021 = new StockDayFundFlow0021();
                        stockDayFundFlow0021.setCodeId(stockCode.getId());
                        stockDayFundFlow0021.setCodeEx(stockCode.getEx());
                        stockDayFundFlow0021.setDate(parseDate2(lines[13]));
                        stockDayFundFlow0021.setExCode(lines[0]);
                        stockDayFundFlow0021.setMainFlowInto(getBigDecimal(lines[1]));
                        stockDayFundFlow0021.setMainOutflow(getBigDecimal(lines[2]));
                        stockDayFundFlow0021.setMainNetFlow(getBigDecimal(lines[3]));
                        stockDayFundFlow0021.setMainInflowRate(getBigDecimal(lines[4]));
                        stockDayFundFlow0021.setRetailFlowInto(getBigDecimal(lines[5]));
                        stockDayFundFlow0021.setRetailOutflow(getBigDecimal(lines[6]));
                        stockDayFundFlow0021.setRetailNetFlow(getBigDecimal(lines[7]));
                        stockDayFundFlow0021.setRetailInflowRate(getBigDecimal(lines[8]));
                        stockDayFundFlow0021.setFundSum(getBigDecimal(lines[9]));
                        stockDayFundFlow0021Service.save(stockDayFundFlow0021);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    continue;
                case "0022":
                    while ((line = reader.readLine()) != null) {
                        line=line.substring(line.indexOf("=")+2);
                        //获取每一行数据
                        String[] lines = line.split("~");
                        //存入到对于的对象中
                        StockDayFundFlow0022 stockDayFundFlow0022 = new StockDayFundFlow0022();
                        stockDayFundFlow0022.setCodeId(stockCode.getId());
                        stockDayFundFlow0022.setCodeEx(stockCode.getEx());
                        stockDayFundFlow0022.setDate(parseDate2(lines[13]));
                        stockDayFundFlow0022.setExCode(lines[0]);
                        stockDayFundFlow0022.setMainFlowInto(getBigDecimal(lines[1]));
                        stockDayFundFlow0022.setMainOutflow(getBigDecimal(lines[2]));
                        stockDayFundFlow0022.setMainNetFlow(getBigDecimal(lines[3]));
                        stockDayFundFlow0022.setMainInflowRate(getBigDecimal(lines[4]));
                        stockDayFundFlow0022.setRetailFlowInto(getBigDecimal(lines[5]));
                        stockDayFundFlow0022.setRetailOutflow(getBigDecimal(lines[6]));
                        stockDayFundFlow0022.setRetailNetFlow(getBigDecimal(lines[7]));
                        stockDayFundFlow0022.setRetailInflowRate(getBigDecimal(lines[8]));
                        stockDayFundFlow0022.setFundSum(getBigDecimal(lines[9]));
                        stockDayFundFlow0022Service.save(stockDayFundFlow0022);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    continue;
                case "0023":
                    while ((line = reader.readLine()) != null) {
                        line=line.substring(line.indexOf("=")+2);
                        //获取每一行数据
                        String[] lines = line.split("~");
                        //存入到对于的对象中
                        StockDayFundFlow0023 stockDayFundFlow0023 = new StockDayFundFlow0023();
                        stockDayFundFlow0023.setCodeId(stockCode.getId());
                        stockDayFundFlow0023.setCodeEx(stockCode.getEx());
                        stockDayFundFlow0023.setDate(parseDate2(lines[13]));
                        stockDayFundFlow0023.setExCode(lines[0]);
                        stockDayFundFlow0023.setMainFlowInto(getBigDecimal(lines[1]));
                        stockDayFundFlow0023.setMainOutflow(getBigDecimal(lines[2]));
                        stockDayFundFlow0023.setMainNetFlow(getBigDecimal(lines[3]));
                        stockDayFundFlow0023.setMainInflowRate(getBigDecimal(lines[4]));
                        stockDayFundFlow0023.setRetailFlowInto(getBigDecimal(lines[5]));
                        stockDayFundFlow0023.setRetailOutflow(getBigDecimal(lines[6]));
                        stockDayFundFlow0023.setRetailNetFlow(getBigDecimal(lines[7]));
                        stockDayFundFlow0023.setRetailInflowRate(getBigDecimal(lines[8]));
                        stockDayFundFlow0023.setFundSum(getBigDecimal(lines[9]));
                        stockDayFundFlow0023Service.save(stockDayFundFlow0023);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    continue;
                case "0024":
                    while ((line = reader.readLine()) != null) {
                        line=line.substring(line.indexOf("=")+2);
                        //获取每一行数据
                        String[] lines = line.split("~");
                        //存入到对于的对象中
                        StockDayFundFlow0024 stockDayFundFlow0024 = new StockDayFundFlow0024();
                        stockDayFundFlow0024.setCodeId(stockCode.getId());
                        stockDayFundFlow0024.setCodeEx(stockCode.getEx());
                        stockDayFundFlow0024.setDate(parseDate2(lines[13]));
                        stockDayFundFlow0024.setExCode(lines[0]);
                        stockDayFundFlow0024.setMainFlowInto(getBigDecimal(lines[1]));
                        stockDayFundFlow0024.setMainOutflow(getBigDecimal(lines[2]));
                        stockDayFundFlow0024.setMainNetFlow(getBigDecimal(lines[3]));
                        stockDayFundFlow0024.setMainInflowRate(getBigDecimal(lines[4]));
                        stockDayFundFlow0024.setRetailFlowInto(getBigDecimal(lines[5]));
                        stockDayFundFlow0024.setRetailOutflow(getBigDecimal(lines[6]));
                        stockDayFundFlow0024.setRetailNetFlow(getBigDecimal(lines[7]));
                        stockDayFundFlow0024.setRetailInflowRate(getBigDecimal(lines[8]));
                        stockDayFundFlow0024.setFundSum(getBigDecimal(lines[9]));
                        stockDayFundFlow0024Service.save(stockDayFundFlow0024);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    continue;
                case "0025":
                    while ((line = reader.readLine()) != null) {
                        line=line.substring(line.indexOf("=")+2);
                        //获取每一行数据
                        String[] lines = line.split("~");
                        //存入到对于的对象中
                        StockDayFundFlow0025 stockDayFundFlow0025 = new StockDayFundFlow0025();
                        stockDayFundFlow0025.setCodeId(stockCode.getId());
                        stockDayFundFlow0025.setCodeEx(stockCode.getEx());
                        stockDayFundFlow0025.setDate(parseDate2(lines[13]));
                        stockDayFundFlow0025.setExCode(lines[0]);
                        stockDayFundFlow0025.setMainFlowInto(getBigDecimal(lines[1]));
                        stockDayFundFlow0025.setMainOutflow(getBigDecimal(lines[2]));
                        stockDayFundFlow0025.setMainNetFlow(getBigDecimal(lines[3]));
                        stockDayFundFlow0025.setMainInflowRate(getBigDecimal(lines[4]));
                        stockDayFundFlow0025.setRetailFlowInto(getBigDecimal(lines[5]));
                        stockDayFundFlow0025.setRetailOutflow(getBigDecimal(lines[6]));
                        stockDayFundFlow0025.setRetailNetFlow(getBigDecimal(lines[7]));
                        stockDayFundFlow0025.setRetailInflowRate(getBigDecimal(lines[8]));
                        stockDayFundFlow0025.setFundSum(getBigDecimal(lines[9]));
                        stockDayFundFlow0025Service.save(stockDayFundFlow0025);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    continue;
                case "0026":
                    while ((line = reader.readLine()) != null) {
                        line=line.substring(line.indexOf("=")+2);
                        //获取每一行数据
                        String[] lines = line.split("~");
                        //存入到对于的对象中
                        StockDayFundFlow0026 stockDayFundFlow0026 = new StockDayFundFlow0026();
                        stockDayFundFlow0026.setCodeId(stockCode.getId());
                        stockDayFundFlow0026.setCodeEx(stockCode.getEx());
                        stockDayFundFlow0026.setDate(parseDate2(lines[13]));
                        stockDayFundFlow0026.setExCode(lines[0]);
                        stockDayFundFlow0026.setMainFlowInto(getBigDecimal(lines[1]));
                        stockDayFundFlow0026.setMainOutflow(getBigDecimal(lines[2]));
                        stockDayFundFlow0026.setMainNetFlow(getBigDecimal(lines[3]));
                        stockDayFundFlow0026.setMainInflowRate(getBigDecimal(lines[4]));
                        stockDayFundFlow0026.setRetailFlowInto(getBigDecimal(lines[5]));
                        stockDayFundFlow0026.setRetailOutflow(getBigDecimal(lines[6]));
                        stockDayFundFlow0026.setRetailNetFlow(getBigDecimal(lines[7]));
                        stockDayFundFlow0026.setRetailInflowRate(getBigDecimal(lines[8]));
                        stockDayFundFlow0026.setFundSum(getBigDecimal(lines[9]));
                        stockDayFundFlow0026Service.save(stockDayFundFlow0026);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    continue;
                case "0027":
                    while ((line = reader.readLine()) != null) {
                        line=line.substring(line.indexOf("=")+2);
                        //获取每一行数据
                        String[] lines = line.split("~");
                        //存入到对于的对象中
                        StockDayFundFlow0027 stockDayFundFlow0027 = new StockDayFundFlow0027();
                        stockDayFundFlow0027.setCodeId(stockCode.getId());
                        stockDayFundFlow0027.setCodeEx(stockCode.getEx());
                        stockDayFundFlow0027.setDate(parseDate2(lines[13]));
                        stockDayFundFlow0027.setExCode(lines[0]);
                        stockDayFundFlow0027.setMainFlowInto(getBigDecimal(lines[1]));
                        stockDayFundFlow0027.setMainOutflow(getBigDecimal(lines[2]));
                        stockDayFundFlow0027.setMainNetFlow(getBigDecimal(lines[3]));
                        stockDayFundFlow0027.setMainInflowRate(getBigDecimal(lines[4]));
                        stockDayFundFlow0027.setRetailFlowInto(getBigDecimal(lines[5]));
                        stockDayFundFlow0027.setRetailOutflow(getBigDecimal(lines[6]));
                        stockDayFundFlow0027.setRetailNetFlow(getBigDecimal(lines[7]));
                        stockDayFundFlow0027.setRetailInflowRate(getBigDecimal(lines[8]));
                        stockDayFundFlow0027.setFundSum(getBigDecimal(lines[9]));
                        stockDayFundFlow0027Service.save(stockDayFundFlow0027);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    continue;
                case "0028":
                    while ((line = reader.readLine()) != null) {
                        line=line.substring(line.indexOf("=")+2);
                        //获取每一行数据
                        String[] lines = line.split("~");
                        //存入到对于的对象中
                        StockDayFundFlow0028 stockDayFundFlow0028 = new StockDayFundFlow0028();
                        stockDayFundFlow0028.setCodeId(stockCode.getId());
                        stockDayFundFlow0028.setCodeEx(stockCode.getEx());
                        stockDayFundFlow0028.setDate(parseDate2(lines[13]));
                        stockDayFundFlow0028.setExCode(lines[0]);
                        stockDayFundFlow0028.setMainFlowInto(getBigDecimal(lines[1]));
                        stockDayFundFlow0028.setMainOutflow(getBigDecimal(lines[2]));
                        stockDayFundFlow0028.setMainNetFlow(getBigDecimal(lines[3]));
                        stockDayFundFlow0028.setMainInflowRate(getBigDecimal(lines[4]));
                        stockDayFundFlow0028.setRetailFlowInto(getBigDecimal(lines[5]));
                        stockDayFundFlow0028.setRetailOutflow(getBigDecimal(lines[6]));
                        stockDayFundFlow0028.setRetailNetFlow(getBigDecimal(lines[7]));
                        stockDayFundFlow0028.setRetailInflowRate(getBigDecimal(lines[8]));
                        stockDayFundFlow0028.setFundSum(getBigDecimal(lines[9]));
                        stockDayFundFlow0028Service.save(stockDayFundFlow0028);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    continue;
                case "3000":
                    while ((line = reader.readLine()) != null) {
                        line=line.substring(line.indexOf("=")+2);
                        //获取每一行数据
                        String[] lines = line.split("~");
                        //存入到对于的对象中
                        StockDayFundFlow3000 stockDayFundFlow3000 = new StockDayFundFlow3000();
                        stockDayFundFlow3000.setCodeId(stockCode.getId());
                        stockDayFundFlow3000.setCodeEx(stockCode.getEx());
                        stockDayFundFlow3000.setDate(parseDate2(lines[13]));
                        stockDayFundFlow3000.setExCode(lines[0]);
                        stockDayFundFlow3000.setMainFlowInto(getBigDecimal(lines[1]));
                        stockDayFundFlow3000.setMainOutflow(getBigDecimal(lines[2]));
                        stockDayFundFlow3000.setMainNetFlow(getBigDecimal(lines[3]));
                        stockDayFundFlow3000.setMainInflowRate(getBigDecimal(lines[4]));
                        stockDayFundFlow3000.setRetailFlowInto(getBigDecimal(lines[5]));
                        stockDayFundFlow3000.setRetailOutflow(getBigDecimal(lines[6]));
                        stockDayFundFlow3000.setRetailNetFlow(getBigDecimal(lines[7]));
                        stockDayFundFlow3000.setRetailInflowRate(getBigDecimal(lines[8]));
                        stockDayFundFlow3000.setFundSum(getBigDecimal(lines[9]));
                        stockDayFundFlow3000Service.save(stockDayFundFlow3000);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    continue;
                case "3001":
                    while ((line = reader.readLine()) != null) {
                        line=line.substring(line.indexOf("=")+2);
                        //获取每一行数据
                        String[] lines = line.split("~");
                        //存入到对于的对象中
                        StockDayFundFlow3001 stockDayFundFlow3001 = new StockDayFundFlow3001();
                        stockDayFundFlow3001.setCodeId(stockCode.getId());
                        stockDayFundFlow3001.setCodeEx(stockCode.getEx());
                        stockDayFundFlow3001.setDate(parseDate2(lines[13]));
                        stockDayFundFlow3001.setExCode(lines[0]);
                        stockDayFundFlow3001.setMainFlowInto(getBigDecimal(lines[1]));
                        stockDayFundFlow3001.setMainOutflow(getBigDecimal(lines[2]));
                        stockDayFundFlow3001.setMainNetFlow(getBigDecimal(lines[3]));
                        stockDayFundFlow3001.setMainInflowRate(getBigDecimal(lines[4]));
                        stockDayFundFlow3001.setRetailFlowInto(getBigDecimal(lines[5]));
                        stockDayFundFlow3001.setRetailOutflow(getBigDecimal(lines[6]));
                        stockDayFundFlow3001.setRetailNetFlow(getBigDecimal(lines[7]));
                        stockDayFundFlow3001.setRetailInflowRate(getBigDecimal(lines[8]));
                        stockDayFundFlow3001.setFundSum(getBigDecimal(lines[9]));
                        stockDayFundFlow3001Service.save(stockDayFundFlow3001);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    continue;
                case "3002":
                    while ((line = reader.readLine()) != null) {
                        line=line.substring(line.indexOf("=")+2);
                        //获取每一行数据
                        String[] lines = line.split("~");
                        //存入到对于的对象中
                        StockDayFundFlow3002 stockDayFundFlow3002 = new StockDayFundFlow3002();
                        stockDayFundFlow3002.setCodeId(stockCode.getId());
                        stockDayFundFlow3002.setCodeEx(stockCode.getEx());
                        stockDayFundFlow3002.setDate(parseDate2(lines[13]));
                        stockDayFundFlow3002.setExCode(lines[0]);
                        stockDayFundFlow3002.setMainFlowInto(getBigDecimal(lines[1]));
                        stockDayFundFlow3002.setMainOutflow(getBigDecimal(lines[2]));
                        stockDayFundFlow3002.setMainNetFlow(getBigDecimal(lines[3]));
                        stockDayFundFlow3002.setMainInflowRate(getBigDecimal(lines[4]));
                        stockDayFundFlow3002.setRetailFlowInto(getBigDecimal(lines[5]));
                        stockDayFundFlow3002.setRetailOutflow(getBigDecimal(lines[6]));
                        stockDayFundFlow3002.setRetailNetFlow(getBigDecimal(lines[7]));
                        stockDayFundFlow3002.setRetailInflowRate(getBigDecimal(lines[8]));
                        stockDayFundFlow3002.setFundSum(getBigDecimal(lines[9]));
                        stockDayFundFlow3002Service.save(stockDayFundFlow3002);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    continue;
                case "3003":
                    while ((line = reader.readLine()) != null) {
                        line=line.substring(line.indexOf("=")+2);
                        //获取每一行数据
                        String[] lines = line.split("~");
                        //存入到对于的对象中
                        StockDayFundFlow3003 stockDayFundFlow3003 = new StockDayFundFlow3003();
                        stockDayFundFlow3003.setCodeId(stockCode.getId());
                        stockDayFundFlow3003.setCodeEx(stockCode.getEx());
                        stockDayFundFlow3003.setDate(parseDate2(lines[13]));
                        stockDayFundFlow3003.setExCode(lines[0]);
                        stockDayFundFlow3003.setMainFlowInto(getBigDecimal(lines[1]));
                        stockDayFundFlow3003.setMainOutflow(getBigDecimal(lines[2]));
                        stockDayFundFlow3003.setMainNetFlow(getBigDecimal(lines[3]));
                        stockDayFundFlow3003.setMainInflowRate(getBigDecimal(lines[4]));
                        stockDayFundFlow3003.setRetailFlowInto(getBigDecimal(lines[5]));
                        stockDayFundFlow3003.setRetailOutflow(getBigDecimal(lines[6]));
                        stockDayFundFlow3003.setRetailNetFlow(getBigDecimal(lines[7]));
                        stockDayFundFlow3003.setRetailInflowRate(getBigDecimal(lines[8]));
                        stockDayFundFlow3003.setFundSum(getBigDecimal(lines[9]));
                        stockDayFundFlow3003Service.save(stockDayFundFlow3003);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    continue;
                case "3004":
                    while ((line = reader.readLine()) != null) {
                        line=line.substring(line.indexOf("=")+2);
                        //获取每一行数据
                        String[] lines = line.split("~");
                        //存入到对于的对象中
                        StockDayFundFlow3004 stockDayFundFlow3004 = new StockDayFundFlow3004();
                        stockDayFundFlow3004.setCodeId(stockCode.getId());
                        stockDayFundFlow3004.setCodeEx(stockCode.getEx());
                        stockDayFundFlow3004.setDate(parseDate2(lines[13]));
                        stockDayFundFlow3004.setExCode(lines[0]);
                        stockDayFundFlow3004.setMainFlowInto(getBigDecimal(lines[1]));
                        stockDayFundFlow3004.setMainOutflow(getBigDecimal(lines[2]));
                        stockDayFundFlow3004.setMainNetFlow(getBigDecimal(lines[3]));
                        stockDayFundFlow3004.setMainInflowRate(getBigDecimal(lines[4]));
                        stockDayFundFlow3004.setRetailFlowInto(getBigDecimal(lines[5]));
                        stockDayFundFlow3004.setRetailOutflow(getBigDecimal(lines[6]));
                        stockDayFundFlow3004.setRetailNetFlow(getBigDecimal(lines[7]));
                        stockDayFundFlow3004.setRetailInflowRate(getBigDecimal(lines[8]));
                        stockDayFundFlow3004.setFundSum(getBigDecimal(lines[9]));
                        stockDayFundFlow3004Service.save(stockDayFundFlow3004);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    continue;
                case "3005":
                    while ((line = reader.readLine()) != null) {
                        line=line.substring(line.indexOf("=")+2);
                        //获取每一行数据
                        String[] lines = line.split("~");
                        //存入到对于的对象中
                        StockDayFundFlow3005 stockDayFundFlow3005 = new StockDayFundFlow3005();
                        stockDayFundFlow3005.setCodeId(stockCode.getId());
                        stockDayFundFlow3005.setCodeEx(stockCode.getEx());
                        stockDayFundFlow3005.setDate(parseDate2(lines[13]));
                        stockDayFundFlow3005.setExCode(lines[0]);
                        stockDayFundFlow3005.setMainFlowInto(getBigDecimal(lines[1]));
                        stockDayFundFlow3005.setMainOutflow(getBigDecimal(lines[2]));
                        stockDayFundFlow3005.setMainNetFlow(getBigDecimal(lines[3]));
                        stockDayFundFlow3005.setMainInflowRate(getBigDecimal(lines[4]));
                        stockDayFundFlow3005.setRetailFlowInto(getBigDecimal(lines[5]));
                        stockDayFundFlow3005.setRetailOutflow(getBigDecimal(lines[6]));
                        stockDayFundFlow3005.setRetailNetFlow(getBigDecimal(lines[7]));
                        stockDayFundFlow3005.setRetailInflowRate(getBigDecimal(lines[8]));
                        stockDayFundFlow3005.setFundSum(getBigDecimal(lines[9]));
                        stockDayFundFlow3005Service.save(stockDayFundFlow3005);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    continue;
                case "6000":
                    while ((line = reader.readLine()) != null) {
                        line=line.substring(line.indexOf("=")+2);
                        //获取每一行数据
                        String[] lines = line.split("~");
                        //存入到对于的对象中
                        StockDayFundFlow6000 stockDayFundFlow6000 = new StockDayFundFlow6000();
                        stockDayFundFlow6000.setCodeId(stockCode.getId());
                        stockDayFundFlow6000.setCodeEx(stockCode.getEx());
                        stockDayFundFlow6000.setDate(parseDate2(lines[13]));
                        stockDayFundFlow6000.setExCode(lines[0]);
                        stockDayFundFlow6000.setMainFlowInto(getBigDecimal(lines[1]));
                        stockDayFundFlow6000.setMainOutflow(getBigDecimal(lines[2]));
                        stockDayFundFlow6000.setMainNetFlow(getBigDecimal(lines[3]));
                        stockDayFundFlow6000.setMainInflowRate(getBigDecimal(lines[4]));
                        stockDayFundFlow6000.setRetailFlowInto(getBigDecimal(lines[5]));
                        stockDayFundFlow6000.setRetailOutflow(getBigDecimal(lines[6]));
                        stockDayFundFlow6000.setRetailNetFlow(getBigDecimal(lines[7]));
                        stockDayFundFlow6000.setRetailInflowRate(getBigDecimal(lines[8]));
                        stockDayFundFlow6000.setFundSum(getBigDecimal(lines[9]));
                        stockDayFundFlow6000Service.save(stockDayFundFlow6000);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    continue;
                case "6001":
                    while ((line = reader.readLine()) != null) {
                        line=line.substring(line.indexOf("=")+2);
                        //获取每一行数据
                        String[] lines = line.split("~");
                        //存入到对于的对象中
                        StockDayFundFlow6001 stockDayFundFlow6001 = new StockDayFundFlow6001();
                        stockDayFundFlow6001.setCodeId(stockCode.getId());
                        stockDayFundFlow6001.setCodeEx(stockCode.getEx());
                        stockDayFundFlow6001.setDate(parseDate2(lines[13]));
                        stockDayFundFlow6001.setExCode(lines[0]);
                        stockDayFundFlow6001.setMainFlowInto(getBigDecimal(lines[1]));
                        stockDayFundFlow6001.setMainOutflow(getBigDecimal(lines[2]));
                        stockDayFundFlow6001.setMainNetFlow(getBigDecimal(lines[3]));
                        stockDayFundFlow6001.setMainInflowRate(getBigDecimal(lines[4]));
                        stockDayFundFlow6001.setRetailFlowInto(getBigDecimal(lines[5]));
                        stockDayFundFlow6001.setRetailOutflow(getBigDecimal(lines[6]));
                        stockDayFundFlow6001.setRetailNetFlow(getBigDecimal(lines[7]));
                        stockDayFundFlow6001.setRetailInflowRate(getBigDecimal(lines[8]));
                        stockDayFundFlow6001.setFundSum(getBigDecimal(lines[9]));
                        stockDayFundFlow6001Service.save(stockDayFundFlow6001);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    continue;
                case "6002":
                    while ((line = reader.readLine()) != null) {
                        line=line.substring(line.indexOf("=")+2);
                        //获取每一行数据
                        String[] lines = line.split("~");
                        //存入到对于的对象中
                        StockDayFundFlow6002 stockDayFundFlow6002 = new StockDayFundFlow6002();
                        stockDayFundFlow6002.setCodeId(stockCode.getId());
                        stockDayFundFlow6002.setCodeEx(stockCode.getEx());
                        stockDayFundFlow6002.setDate(parseDate2(lines[13]));
                        stockDayFundFlow6002.setExCode(lines[0]);
                        stockDayFundFlow6002.setMainFlowInto(getBigDecimal(lines[1]));
                        stockDayFundFlow6002.setMainOutflow(getBigDecimal(lines[2]));
                        stockDayFundFlow6002.setMainNetFlow(getBigDecimal(lines[3]));
                        stockDayFundFlow6002.setMainInflowRate(getBigDecimal(lines[4]));
                        stockDayFundFlow6002.setRetailFlowInto(getBigDecimal(lines[5]));
                        stockDayFundFlow6002.setRetailOutflow(getBigDecimal(lines[6]));
                        stockDayFundFlow6002.setRetailNetFlow(getBigDecimal(lines[7]));
                        stockDayFundFlow6002.setRetailInflowRate(getBigDecimal(lines[8]));
                        stockDayFundFlow6002.setFundSum(getBigDecimal(lines[9]));
                        stockDayFundFlow6002Service.save(stockDayFundFlow6002);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    continue;
                case "6003":
                    while ((line = reader.readLine()) != null) {
                        line=line.substring(line.indexOf("=")+2);
                        //获取每一行数据
                        String[] lines = line.split("~");
                        //存入到对于的对象中
                        StockDayFundFlow6003 stockDayFundFlow6003 = new StockDayFundFlow6003();
                        stockDayFundFlow6003.setCodeId(stockCode.getId());
                        stockDayFundFlow6003.setCodeEx(stockCode.getEx());
                        stockDayFundFlow6003.setDate(parseDate2(lines[13]));
                        stockDayFundFlow6003.setExCode(lines[0]);
                        stockDayFundFlow6003.setMainFlowInto(getBigDecimal(lines[1]));
                        stockDayFundFlow6003.setMainOutflow(getBigDecimal(lines[2]));
                        stockDayFundFlow6003.setMainNetFlow(getBigDecimal(lines[3]));
                        stockDayFundFlow6003.setMainInflowRate(getBigDecimal(lines[4]));
                        stockDayFundFlow6003.setRetailFlowInto(getBigDecimal(lines[5]));
                        stockDayFundFlow6003.setRetailOutflow(getBigDecimal(lines[6]));
                        stockDayFundFlow6003.setRetailNetFlow(getBigDecimal(lines[7]));
                        stockDayFundFlow6003.setRetailInflowRate(getBigDecimal(lines[8]));
                        stockDayFundFlow6003.setFundSum(getBigDecimal(lines[9]));
                        stockDayFundFlow6003Service.save(stockDayFundFlow6003);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    continue;
                case "6004":
                    while ((line = reader.readLine()) != null) {
                        line=line.substring(line.indexOf("=")+2);
                        //获取每一行数据
                        String[] lines = line.split("~");
                        //存入到对于的对象中
                        StockDayFundFlow6004 stockDayFundFlow6004 = new StockDayFundFlow6004();
                        stockDayFundFlow6004.setCodeId(stockCode.getId());
                        stockDayFundFlow6004.setCodeEx(stockCode.getEx());
                        stockDayFundFlow6004.setDate(parseDate2(lines[13]));
                        stockDayFundFlow6004.setExCode(lines[0]);
                        stockDayFundFlow6004.setMainFlowInto(getBigDecimal(lines[1]));
                        stockDayFundFlow6004.setMainOutflow(getBigDecimal(lines[2]));
                        stockDayFundFlow6004.setMainNetFlow(getBigDecimal(lines[3]));
                        stockDayFundFlow6004.setMainInflowRate(getBigDecimal(lines[4]));
                        stockDayFundFlow6004.setRetailFlowInto(getBigDecimal(lines[5]));
                        stockDayFundFlow6004.setRetailOutflow(getBigDecimal(lines[6]));
                        stockDayFundFlow6004.setRetailNetFlow(getBigDecimal(lines[7]));
                        stockDayFundFlow6004.setRetailInflowRate(getBigDecimal(lines[8]));
                        stockDayFundFlow6004.setFundSum(getBigDecimal(lines[9]));
                        stockDayFundFlow6004Service.save(stockDayFundFlow6004);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    continue;
                case "6005":
                    while ((line = reader.readLine()) != null) {
                        line=line.substring(line.indexOf("=")+2);
                        //获取每一行数据
                        String[] lines = line.split("~");
                        //存入到对于的对象中
                        StockDayFundFlow6005 stockDayFundFlow6005 = new StockDayFundFlow6005();
                        stockDayFundFlow6005.setCodeId(stockCode.getId());
                        stockDayFundFlow6005.setCodeEx(stockCode.getEx());
                        stockDayFundFlow6005.setDate(parseDate2(lines[13]));
                        stockDayFundFlow6005.setExCode(lines[0]);
                        stockDayFundFlow6005.setMainFlowInto(getBigDecimal(lines[1]));
                        stockDayFundFlow6005.setMainOutflow(getBigDecimal(lines[2]));
                        stockDayFundFlow6005.setMainNetFlow(getBigDecimal(lines[3]));
                        stockDayFundFlow6005.setMainInflowRate(getBigDecimal(lines[4]));
                        stockDayFundFlow6005.setRetailFlowInto(getBigDecimal(lines[5]));
                        stockDayFundFlow6005.setRetailOutflow(getBigDecimal(lines[6]));
                        stockDayFundFlow6005.setRetailNetFlow(getBigDecimal(lines[7]));
                        stockDayFundFlow6005.setRetailInflowRate(getBigDecimal(lines[8]));
                        stockDayFundFlow6005.setFundSum(getBigDecimal(lines[9]));
                        stockDayFundFlow6005Service.save(stockDayFundFlow6005);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    continue;
                case "6006":
                    while ((line = reader.readLine()) != null) {
                        line=line.substring(line.indexOf("=")+2);
                        //获取每一行数据
                        String[] lines = line.split("~");
                        //存入到对于的对象中
                        StockDayFundFlow6006 stockDayFundFlow6006 = new StockDayFundFlow6006();
                        stockDayFundFlow6006.setCodeId(stockCode.getId());
                        stockDayFundFlow6006.setCodeEx(stockCode.getEx());
                        stockDayFundFlow6006.setDate(parseDate2(lines[13]));
                        stockDayFundFlow6006.setExCode(lines[0]);
                        stockDayFundFlow6006.setMainFlowInto(getBigDecimal(lines[1]));
                        stockDayFundFlow6006.setMainOutflow(getBigDecimal(lines[2]));
                        stockDayFundFlow6006.setMainNetFlow(getBigDecimal(lines[3]));
                        stockDayFundFlow6006.setMainInflowRate(getBigDecimal(lines[4]));
                        stockDayFundFlow6006.setRetailFlowInto(getBigDecimal(lines[5]));
                        stockDayFundFlow6006.setRetailOutflow(getBigDecimal(lines[6]));
                        stockDayFundFlow6006.setRetailNetFlow(getBigDecimal(lines[7]));
                        stockDayFundFlow6006.setRetailInflowRate(getBigDecimal(lines[8]));
                        stockDayFundFlow6006.setFundSum(getBigDecimal(lines[9]));
                        stockDayFundFlow6006Service.save(stockDayFundFlow6006);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    continue;
                case "6007":
                    while ((line = reader.readLine()) != null) {
                        line=line.substring(line.indexOf("=")+2);
                        //获取每一行数据
                        String[] lines = line.split("~");
                        //存入到对于的对象中
                        StockDayFundFlow6007 stockDayFundFlow6007 = new StockDayFundFlow6007();
                        stockDayFundFlow6007.setCodeId(stockCode.getId());
                        stockDayFundFlow6007.setCodeEx(stockCode.getEx());
                        stockDayFundFlow6007.setDate(parseDate2(lines[13]));
                        stockDayFundFlow6007.setExCode(lines[0]);
                        stockDayFundFlow6007.setMainFlowInto(getBigDecimal(lines[1]));
                        stockDayFundFlow6007.setMainOutflow(getBigDecimal(lines[2]));
                        stockDayFundFlow6007.setMainNetFlow(getBigDecimal(lines[3]));
                        stockDayFundFlow6007.setMainInflowRate(getBigDecimal(lines[4]));
                        stockDayFundFlow6007.setRetailFlowInto(getBigDecimal(lines[5]));
                        stockDayFundFlow6007.setRetailOutflow(getBigDecimal(lines[6]));
                        stockDayFundFlow6007.setRetailNetFlow(getBigDecimal(lines[7]));
                        stockDayFundFlow6007.setRetailInflowRate(getBigDecimal(lines[8]));
                        stockDayFundFlow6007.setFundSum(getBigDecimal(lines[9]));
                        stockDayFundFlow6007Service.save(stockDayFundFlow6007);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    continue;
                case "6008":
                    while ((line = reader.readLine()) != null) {
                        line=line.substring(line.indexOf("=")+2);
                        //获取每一行数据
                        String[] lines = line.split("~");
                        //存入到对于的对象中
                        StockDayFundFlow6008 stockDayFundFlow6008 = new StockDayFundFlow6008();
                        stockDayFundFlow6008.setCodeId(stockCode.getId());
                        stockDayFundFlow6008.setCodeEx(stockCode.getEx());
                        stockDayFundFlow6008.setDate(parseDate2(lines[13]));
                        stockDayFundFlow6008.setExCode(lines[0]);
                        stockDayFundFlow6008.setMainFlowInto(getBigDecimal(lines[1]));
                        stockDayFundFlow6008.setMainOutflow(getBigDecimal(lines[2]));
                        stockDayFundFlow6008.setMainNetFlow(getBigDecimal(lines[3]));
                        stockDayFundFlow6008.setMainInflowRate(getBigDecimal(lines[4]));
                        stockDayFundFlow6008.setRetailFlowInto(getBigDecimal(lines[5]));
                        stockDayFundFlow6008.setRetailOutflow(getBigDecimal(lines[6]));
                        stockDayFundFlow6008.setRetailNetFlow(getBigDecimal(lines[7]));
                        stockDayFundFlow6008.setRetailInflowRate(getBigDecimal(lines[8]));
                        stockDayFundFlow6008.setFundSum(getBigDecimal(lines[9]));
                        stockDayFundFlow6008Service.save(stockDayFundFlow6008);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    continue;
                case "6009":
                    while ((line = reader.readLine()) != null) {
                        line=line.substring(line.indexOf("=")+2);
                        //获取每一行数据
                        String[] lines = line.split("~");
                        //存入到对于的对象中
                        StockDayFundFlow6009 stockDayFundFlow6009 = new StockDayFundFlow6009();
                        stockDayFundFlow6009.setCodeId(stockCode.getId());
                        stockDayFundFlow6009.setCodeEx(stockCode.getEx());
                        stockDayFundFlow6009.setDate(parseDate2(lines[13]));
                        stockDayFundFlow6009.setExCode(lines[0]);
                        stockDayFundFlow6009.setMainFlowInto(getBigDecimal(lines[1]));
                        stockDayFundFlow6009.setMainOutflow(getBigDecimal(lines[2]));
                        stockDayFundFlow6009.setMainNetFlow(getBigDecimal(lines[3]));
                        stockDayFundFlow6009.setMainInflowRate(getBigDecimal(lines[4]));
                        stockDayFundFlow6009.setRetailFlowInto(getBigDecimal(lines[5]));
                        stockDayFundFlow6009.setRetailOutflow(getBigDecimal(lines[6]));
                        stockDayFundFlow6009.setRetailNetFlow(getBigDecimal(lines[7]));
                        stockDayFundFlow6009.setRetailInflowRate(getBigDecimal(lines[8]));
                        stockDayFundFlow6009.setFundSum(getBigDecimal(lines[9]));
                        stockDayFundFlow6009Service.save(stockDayFundFlow6009);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    continue;
                case "6010":
                    while ((line = reader.readLine()) != null) {
                        line=line.substring(line.indexOf("=")+2);
                        //获取每一行数据
                        String[] lines = line.split("~");
                        //存入到对于的对象中
                        StockDayFundFlow6010 stockDayFundFlow6010 = new StockDayFundFlow6010();
                        stockDayFundFlow6010.setCodeId(stockCode.getId());
                        stockDayFundFlow6010.setCodeEx(stockCode.getEx());
                        stockDayFundFlow6010.setDate(parseDate2(lines[13]));
                        stockDayFundFlow6010.setExCode(lines[0]);
                        stockDayFundFlow6010.setMainFlowInto(getBigDecimal(lines[1]));
                        stockDayFundFlow6010.setMainOutflow(getBigDecimal(lines[2]));
                        stockDayFundFlow6010.setMainNetFlow(getBigDecimal(lines[3]));
                        stockDayFundFlow6010.setMainInflowRate(getBigDecimal(lines[4]));
                        stockDayFundFlow6010.setRetailFlowInto(getBigDecimal(lines[5]));
                        stockDayFundFlow6010.setRetailOutflow(getBigDecimal(lines[6]));
                        stockDayFundFlow6010.setRetailNetFlow(getBigDecimal(lines[7]));
                        stockDayFundFlow6010.setRetailInflowRate(getBigDecimal(lines[8]));
                        stockDayFundFlow6010.setFundSum(getBigDecimal(lines[9]));
                        stockDayFundFlow6010Service.save(stockDayFundFlow6010);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    continue;
                case "6011":
                    while ((line = reader.readLine()) != null) {
                        line=line.substring(line.indexOf("=")+2);
                        //获取每一行数据
                        String[] lines = line.split("~");
                        //存入到对于的对象中
                        StockDayFundFlow6011 stockDayFundFlow6011 = new StockDayFundFlow6011();
                        stockDayFundFlow6011.setCodeId(stockCode.getId());
                        stockDayFundFlow6011.setCodeEx(stockCode.getEx());
                        stockDayFundFlow6011.setDate(parseDate2(lines[13]));
                        stockDayFundFlow6011.setExCode(lines[0]);
                        stockDayFundFlow6011.setMainFlowInto(getBigDecimal(lines[1]));
                        stockDayFundFlow6011.setMainOutflow(getBigDecimal(lines[2]));
                        stockDayFundFlow6011.setMainNetFlow(getBigDecimal(lines[3]));
                        stockDayFundFlow6011.setMainInflowRate(getBigDecimal(lines[4]));
                        stockDayFundFlow6011.setRetailFlowInto(getBigDecimal(lines[5]));
                        stockDayFundFlow6011.setRetailOutflow(getBigDecimal(lines[6]));
                        stockDayFundFlow6011.setRetailNetFlow(getBigDecimal(lines[7]));
                        stockDayFundFlow6011.setRetailInflowRate(getBigDecimal(lines[8]));
                        stockDayFundFlow6011.setFundSum(getBigDecimal(lines[9]));
                        stockDayFundFlow6011Service.save(stockDayFundFlow6011);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    continue;
                case "6012":
                    while ((line = reader.readLine()) != null) {
                        line=line.substring(line.indexOf("=")+2);
                        //获取每一行数据
                        String[] lines = line.split("~");
                        //存入到对于的对象中
                        StockDayFundFlow6012 stockDayFundFlow6012 = new StockDayFundFlow6012();
                        stockDayFundFlow6012.setCodeId(stockCode.getId());
                        stockDayFundFlow6012.setCodeEx(stockCode.getEx());
                        stockDayFundFlow6012.setDate(parseDate2(lines[13]));
                        stockDayFundFlow6012.setExCode(lines[0]);
                        stockDayFundFlow6012.setMainFlowInto(getBigDecimal(lines[1]));
                        stockDayFundFlow6012.setMainOutflow(getBigDecimal(lines[2]));
                        stockDayFundFlow6012.setMainNetFlow(getBigDecimal(lines[3]));
                        stockDayFundFlow6012.setMainInflowRate(getBigDecimal(lines[4]));
                        stockDayFundFlow6012.setRetailFlowInto(getBigDecimal(lines[5]));
                        stockDayFundFlow6012.setRetailOutflow(getBigDecimal(lines[6]));
                        stockDayFundFlow6012.setRetailNetFlow(getBigDecimal(lines[7]));
                        stockDayFundFlow6012.setRetailInflowRate(getBigDecimal(lines[8]));
                        stockDayFundFlow6012.setFundSum(getBigDecimal(lines[9]));
                        stockDayFundFlow6012Service.save(stockDayFundFlow6012);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    continue;
                case "6013":
                    while ((line = reader.readLine()) != null) {
                        line=line.substring(line.indexOf("=")+2);
                        //获取每一行数据
                        String[] lines = line.split("~");
                        //存入到对于的对象中
                        StockDayFundFlow6013 stockDayFundFlow6013 = new StockDayFundFlow6013();
                        stockDayFundFlow6013.setCodeId(stockCode.getId());
                        stockDayFundFlow6013.setCodeEx(stockCode.getEx());
                        stockDayFundFlow6013.setDate(parseDate2(lines[13]));
                        stockDayFundFlow6013.setExCode(lines[0]);
                        stockDayFundFlow6013.setMainFlowInto(getBigDecimal(lines[1]));
                        stockDayFundFlow6013.setMainOutflow(getBigDecimal(lines[2]));
                        stockDayFundFlow6013.setMainNetFlow(getBigDecimal(lines[3]));
                        stockDayFundFlow6013.setMainInflowRate(getBigDecimal(lines[4]));
                        stockDayFundFlow6013.setRetailFlowInto(getBigDecimal(lines[5]));
                        stockDayFundFlow6013.setRetailOutflow(getBigDecimal(lines[6]));
                        stockDayFundFlow6013.setRetailNetFlow(getBigDecimal(lines[7]));
                        stockDayFundFlow6013.setRetailInflowRate(getBigDecimal(lines[8]));
                        stockDayFundFlow6013.setFundSum(getBigDecimal(lines[9]));
                        stockDayFundFlow6013Service.save(stockDayFundFlow6013);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    continue;
                case "6014":
                    while ((line = reader.readLine()) != null) {
                        line=line.substring(line.indexOf("=")+2);
                        //获取每一行数据
                        String[] lines = line.split("~");
                        //存入到对于的对象中
                        StockDayFundFlow6014 stockDayFundFlow6014 = new StockDayFundFlow6014();
                        stockDayFundFlow6014.setCodeId(stockCode.getId());
                        stockDayFundFlow6014.setCodeEx(stockCode.getEx());
                        stockDayFundFlow6014.setDate(parseDate2(lines[13]));
                        stockDayFundFlow6014.setExCode(lines[0]);
                        stockDayFundFlow6014.setMainFlowInto(getBigDecimal(lines[1]));
                        stockDayFundFlow6014.setMainOutflow(getBigDecimal(lines[2]));
                        stockDayFundFlow6014.setMainNetFlow(getBigDecimal(lines[3]));
                        stockDayFundFlow6014.setMainInflowRate(getBigDecimal(lines[4]));
                        stockDayFundFlow6014.setRetailFlowInto(getBigDecimal(lines[5]));
                        stockDayFundFlow6014.setRetailOutflow(getBigDecimal(lines[6]));
                        stockDayFundFlow6014.setRetailNetFlow(getBigDecimal(lines[7]));
                        stockDayFundFlow6014.setRetailInflowRate(getBigDecimal(lines[8]));
                        stockDayFundFlow6014.setFundSum(getBigDecimal(lines[9]));
                        stockDayFundFlow6014Service.save(stockDayFundFlow6014);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    continue;
                case "6015":
                    while ((line = reader.readLine()) != null) {
                        line=line.substring(line.indexOf("=")+2);
                        //获取每一行数据
                        String[] lines = line.split("~");
                        //存入到对于的对象中
                        StockDayFundFlow6015 stockDayFundFlow6015 = new StockDayFundFlow6015();
                        stockDayFundFlow6015.setCodeId(stockCode.getId());
                        stockDayFundFlow6015.setCodeEx(stockCode.getEx());
                        stockDayFundFlow6015.setDate(parseDate2(lines[13]));
                        stockDayFundFlow6015.setExCode(lines[0]);
                        stockDayFundFlow6015.setMainFlowInto(getBigDecimal(lines[1]));
                        stockDayFundFlow6015.setMainOutflow(getBigDecimal(lines[2]));
                        stockDayFundFlow6015.setMainNetFlow(getBigDecimal(lines[3]));
                        stockDayFundFlow6015.setMainInflowRate(getBigDecimal(lines[4]));
                        stockDayFundFlow6015.setRetailFlowInto(getBigDecimal(lines[5]));
                        stockDayFundFlow6015.setRetailOutflow(getBigDecimal(lines[6]));
                        stockDayFundFlow6015.setRetailNetFlow(getBigDecimal(lines[7]));
                        stockDayFundFlow6015.setRetailInflowRate(getBigDecimal(lines[8]));
                        stockDayFundFlow6015.setFundSum(getBigDecimal(lines[9]));
                        stockDayFundFlow6015Service.save(stockDayFundFlow6015);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    continue;
                case "6016":
                    while ((line = reader.readLine()) != null) {
                        line=line.substring(line.indexOf("=")+2);
                        //获取每一行数据
                        String[] lines = line.split("~");
                        //存入到对于的对象中
                        StockDayFundFlow6016 stockDayFundFlow6016 = new StockDayFundFlow6016();
                        stockDayFundFlow6016.setCodeId(stockCode.getId());
                        stockDayFundFlow6016.setCodeEx(stockCode.getEx());
                        stockDayFundFlow6016.setDate(parseDate2(lines[13]));
                        stockDayFundFlow6016.setExCode(lines[0]);
                        stockDayFundFlow6016.setMainFlowInto(getBigDecimal(lines[1]));
                        stockDayFundFlow6016.setMainOutflow(getBigDecimal(lines[2]));
                        stockDayFundFlow6016.setMainNetFlow(getBigDecimal(lines[3]));
                        stockDayFundFlow6016.setMainInflowRate(getBigDecimal(lines[4]));
                        stockDayFundFlow6016.setRetailFlowInto(getBigDecimal(lines[5]));
                        stockDayFundFlow6016.setRetailOutflow(getBigDecimal(lines[6]));
                        stockDayFundFlow6016.setRetailNetFlow(getBigDecimal(lines[7]));
                        stockDayFundFlow6016.setRetailInflowRate(getBigDecimal(lines[8]));
                        stockDayFundFlow6016.setFundSum(getBigDecimal(lines[9]));
                        stockDayFundFlow6016Service.save(stockDayFundFlow6016);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    continue;
                case "6017":
                    while ((line = reader.readLine()) != null) {
                        line=line.substring(line.indexOf("=")+2);
                        //获取每一行数据
                        String[] lines = line.split("~");
                        //存入到对于的对象中
                        StockDayFundFlow6017 stockDayFundFlow6017 = new StockDayFundFlow6017();
                        stockDayFundFlow6017.setCodeId(stockCode.getId());
                        stockDayFundFlow6017.setCodeEx(stockCode.getEx());
                        stockDayFundFlow6017.setDate(parseDate2(lines[13]));
                        stockDayFundFlow6017.setExCode(lines[0]);
                        stockDayFundFlow6017.setMainFlowInto(getBigDecimal(lines[1]));
                        stockDayFundFlow6017.setMainOutflow(getBigDecimal(lines[2]));
                        stockDayFundFlow6017.setMainNetFlow(getBigDecimal(lines[3]));
                        stockDayFundFlow6017.setMainInflowRate(getBigDecimal(lines[4]));
                        stockDayFundFlow6017.setRetailFlowInto(getBigDecimal(lines[5]));
                        stockDayFundFlow6017.setRetailOutflow(getBigDecimal(lines[6]));
                        stockDayFundFlow6017.setRetailNetFlow(getBigDecimal(lines[7]));
                        stockDayFundFlow6017.setRetailInflowRate(getBigDecimal(lines[8]));
                        stockDayFundFlow6017.setFundSum(getBigDecimal(lines[9]));
                        stockDayFundFlow6017Service.save(stockDayFundFlow6017);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    continue;
                case "6018":
                    while ((line = reader.readLine()) != null) {
                        line=line.substring(line.indexOf("=")+2);
                        //获取每一行数据
                        String[] lines = line.split("~");
                        //存入到对于的对象中
                        StockDayFundFlow6018 stockDayFundFlow6018 = new StockDayFundFlow6018();
                        stockDayFundFlow6018.setCodeId(stockCode.getId());
                        stockDayFundFlow6018.setCodeEx(stockCode.getEx());
                        stockDayFundFlow6018.setDate(parseDate2(lines[13]));
                        stockDayFundFlow6018.setExCode(lines[0]);
                        stockDayFundFlow6018.setMainFlowInto(getBigDecimal(lines[1]));
                        stockDayFundFlow6018.setMainOutflow(getBigDecimal(lines[2]));
                        stockDayFundFlow6018.setMainNetFlow(getBigDecimal(lines[3]));
                        stockDayFundFlow6018.setMainInflowRate(getBigDecimal(lines[4]));
                        stockDayFundFlow6018.setRetailFlowInto(getBigDecimal(lines[5]));
                        stockDayFundFlow6018.setRetailOutflow(getBigDecimal(lines[6]));
                        stockDayFundFlow6018.setRetailNetFlow(getBigDecimal(lines[7]));
                        stockDayFundFlow6018.setRetailInflowRate(getBigDecimal(lines[8]));
                        stockDayFundFlow6018.setFundSum(getBigDecimal(lines[9]));
                        stockDayFundFlow6018Service.save(stockDayFundFlow6018);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    continue;
                case "6019":
                    while ((line = reader.readLine()) != null) {
                        line=line.substring(line.indexOf("=")+2);
                        //获取每一行数据
                        String[] lines = line.split("~");
                        //存入到对于的对象中
                        StockDayFundFlow6019 stockDayFundFlow6019 = new StockDayFundFlow6019();
                        stockDayFundFlow6019.setCodeId(stockCode.getId());
                        stockDayFundFlow6019.setCodeEx(stockCode.getEx());
                        stockDayFundFlow6019.setDate(parseDate2(lines[13]));
                        stockDayFundFlow6019.setExCode(lines[0]);
                        stockDayFundFlow6019.setMainFlowInto(getBigDecimal(lines[1]));
                        stockDayFundFlow6019.setMainOutflow(getBigDecimal(lines[2]));
                        stockDayFundFlow6019.setMainNetFlow(getBigDecimal(lines[3]));
                        stockDayFundFlow6019.setMainInflowRate(getBigDecimal(lines[4]));
                        stockDayFundFlow6019.setRetailFlowInto(getBigDecimal(lines[5]));
                        stockDayFundFlow6019.setRetailOutflow(getBigDecimal(lines[6]));
                        stockDayFundFlow6019.setRetailNetFlow(getBigDecimal(lines[7]));
                        stockDayFundFlow6019.setRetailInflowRate(getBigDecimal(lines[8]));
                        stockDayFundFlow6019.setFundSum(getBigDecimal(lines[9]));
                        stockDayFundFlow6019Service.save(stockDayFundFlow6019);
                    }
                    reader.close();
                    // 断开连接
                    connection.disconnect();
                    continue;
                default:
                    switch (stockCode.getId().substring(0, 3)) {
                        case "001":
                            while ((line = reader.readLine()) != null) {
                                line=line.substring(line.indexOf("=")+2);
                                //获取每一行数据
                                String[] lines = line.split("~");
                                //存入到对于的对象中
                                StockDayFundFlow001 stockDayFundFlow001 = new StockDayFundFlow001();
                                stockDayFundFlow001.setCodeId(stockCode.getId());
                                stockDayFundFlow001.setCodeEx(stockCode.getEx());
                                stockDayFundFlow001.setDate(parseDate2(lines[13]));
                                stockDayFundFlow001.setExCode(lines[0]);
                                stockDayFundFlow001.setMainFlowInto(getBigDecimal(lines[1]));
                                stockDayFundFlow001.setMainOutflow(getBigDecimal(lines[2]));
                                stockDayFundFlow001.setMainNetFlow(getBigDecimal(lines[3]));
                                stockDayFundFlow001.setMainInflowRate(getBigDecimal(lines[4]));
                                stockDayFundFlow001.setRetailFlowInto(getBigDecimal(lines[5]));
                                stockDayFundFlow001.setRetailOutflow(getBigDecimal(lines[6]));
                                stockDayFundFlow001.setRetailNetFlow(getBigDecimal(lines[7]));
                                stockDayFundFlow001.setRetailInflowRate(getBigDecimal(lines[8]));
                                stockDayFundFlow001.setFundSum(getBigDecimal(lines[9]));
                                stockDayFundFlow001Service.save(stockDayFundFlow001);
                            }
                            reader.close();
                            // 断开连接
                            connection.disconnect();
                            continue;
                        case "399":
                            while ((line = reader.readLine()) != null) {
                                if (line.length()<25){
                                    continue;
                                }
                                line=line.substring(line.indexOf("=")+2);
                                //获取每一行数据
                                String[] lines = line.split("~");
                                //存入到对于的对象中
                                StockDayFundFlow399 stockDayFundFlow399 = new StockDayFundFlow399();
                                stockDayFundFlow399.setCodeId(stockCode.getId());
                                stockDayFundFlow399.setCodeEx(stockCode.getEx());
                                stockDayFundFlow399.setDate(parseDate2(lines[13]));
                                stockDayFundFlow399.setExCode(lines[0]);
                                stockDayFundFlow399.setMainFlowInto(getBigDecimal(lines[1]));
                                stockDayFundFlow399.setMainOutflow(getBigDecimal(lines[2]));
                                stockDayFundFlow399.setMainNetFlow(getBigDecimal(lines[3]));
                                stockDayFundFlow399.setMainInflowRate(getBigDecimal(lines[4]));
                                stockDayFundFlow399.setRetailFlowInto(getBigDecimal(lines[5]));
                                stockDayFundFlow399.setRetailOutflow(getBigDecimal(lines[6]));
                                stockDayFundFlow399.setRetailNetFlow(getBigDecimal(lines[7]));
                                stockDayFundFlow399.setRetailInflowRate(getBigDecimal(lines[8]));
                                stockDayFundFlow399.setFundSum(getBigDecimal(lines[9]));
                                stockDayFundFlow399Service.save(stockDayFundFlow399);
                            }
                            reader.close();
                            // 断开连接
                            connection.disconnect();
                            continue;
                        case "603":
                            while ((line = reader.readLine()) != null) {
                                line=line.substring(line.indexOf("=")+2);
                                //获取每一行数据
                                String[] lines = line.split("~");
                                //存入到对于的对象中
                                StockDayFundFlow603 stockDayFundFlow603 = new StockDayFundFlow603();
                                stockDayFundFlow603.setCodeId(stockCode.getId());
                                stockDayFundFlow603.setCodeEx(stockCode.getEx());
                                stockDayFundFlow603.setDate(parseDate2(lines[13]));
                                stockDayFundFlow603.setExCode(lines[0]);
                                stockDayFundFlow603.setMainFlowInto(getBigDecimal(lines[1]));
                                stockDayFundFlow603.setMainOutflow(getBigDecimal(lines[2]));
                                stockDayFundFlow603.setMainNetFlow(getBigDecimal(lines[3]));
                                stockDayFundFlow603.setMainInflowRate(getBigDecimal(lines[4]));
                                stockDayFundFlow603.setRetailFlowInto(getBigDecimal(lines[5]));
                                stockDayFundFlow603.setRetailOutflow(getBigDecimal(lines[6]));
                                stockDayFundFlow603.setRetailNetFlow(getBigDecimal(lines[7]));
                                stockDayFundFlow603.setRetailInflowRate(getBigDecimal(lines[8]));
                                stockDayFundFlow603.setFundSum(getBigDecimal(lines[9]));
                                stockDayFundFlow603Service.save(stockDayFundFlow603);
                            }
                            reader.close();
                            // 断开连接
                            connection.disconnect();
                            continue;
                        default:
                            continue;
                    }
            }
        }
        return false;
    }
}
