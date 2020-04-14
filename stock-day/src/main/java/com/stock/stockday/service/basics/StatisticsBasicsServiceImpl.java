package com.stock.stockday.service.basics;

import com.stock.stockday.config.UrlConfig;
import com.stock.stockday.dao.UpGoTime;
import com.stock.stockday.entity.StockCode;
import com.stock.stockday.entity.StockDay;
import com.stock.stockday.service.StockCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import static com.stock.stockday.service.impl.StockDayServiceImpl.getBigDecimal;
import static com.stock.stockday.service.impl.StockDayServiceImpl.getEncoding;
import static com.stock.stockday.service.impl.StockDayServiceImpl.parseDate;

@Service
public class StatisticsBasicsServiceImpl implements StatisticsBasicsService {
    @Autowired
    private UrlConfig urlConfig;
    @Autowired
    private StockCodeService stockCodeService;


    @Override
    public boolean getStatisticsBasics() throws IOException, ParseException {
        List<StockCode> stockCodeList = stockCodeService.getStockCodeList();
        if (stockCodeList == null || stockCodeList.isEmpty()) {
            return false;
        }
        List<UpGoTime> upGoTimeList = new ArrayList<>();
        int num9S1 = 0;
        int num9S2 = 0;
        int num9S3 = 0;
        int num9S4 = 0;
        int num9S5 = 0;
        int num9S6 = 0;
        int num9S7 = 0;
        int num9S8 = 0;
        int num9S9 = 0;
        int num9S10 = 0;
        int num9X1 = 0;
        int num9X2 = 0;
        int num9X3 = 0;
        int num9X4 = 0;
        int num9X5 = 0;
        int num9X6 = 0;
        int num9X7 = 0;
        int num9X8 = 0;
        int num9X9 = 0;
        int num9X10 = 0;
        int num8S1 = 0;
        int num8S2 = 0;
        int num8S3 = 0;
        int num8S4 = 0;
        int num8S5 = 0;
        int num8S6 = 0;
        int num8S7 = 0;
        int num8S8 = 0;
        int num8S9 = 0;
        int num8S10 = 0;
        int num8X1 = 0;
        int num8X2 = 0;
        int num8X3 = 0;
        int num8X4 = 0;
        int num8X5 = 0;
        int num8X6 = 0;
        int num8X7 = 0;
        int num8X8 = 0;
        int num8X9 = 0;
        int num8X10 = 0;
        int num7S1 = 0;
        int num7S2 = 0;
        int num7S3 = 0;
        int num7S4 = 0;
        int num7S5 = 0;
        int num7S6 = 0;
        int num7S7 = 0;
        int num7S8 = 0;
        int num7S9 = 0;
        int num7S10 = 0;
        int num7X1 = 0;
        int num7X2 = 0;
        int num7X3 = 0;
        int num7X4 = 0;
        int num7X5 = 0;
        int num7X6 = 0;
        int num7X7 = 0;
        int num7X8 = 0;
        int num7X9 = 0;
        int num7X10 = 0;
        int num6S1 = 0;
        int num6S2 = 0;
        int num6S3 = 0;
        int num6S4 = 0;
        int num6S5 = 0;
        int num6S6 = 0;
        int num6S7 = 0;
        int num6S8 = 0;
        int num6S9 = 0;
        int num6S10 = 0;
        int num6X1 = 0;
        int num6X2 = 0;
        int num6X3 = 0;
        int num6X4 = 0;
        int num6X5 = 0;
        int num6X6 = 0;
        int num6X7 = 0;
        int num6X8 = 0;
        int num6X9 = 0;
        int num6X10 = 0;
        int num5S1 = 0;
        int num5S2 = 0;
        int num5S3 = 0;
        int num5S4 = 0;
        int num5S5 = 0;
        int num5S6 = 0;
        int num5S7 = 0;
        int num5S8 = 0;
        int num5S9 = 0;
        int num5S10 = 0;
        int num5X1 = 0;
        int num5X2 = 0;
        int num5X3 = 0;
        int num5X4 = 0;
        int num5X5 = 0;
        int num5X6 = 0;
        int num5X7 = 0;
        int num5X8 = 0;
        int num5X9 = 0;
        int num5X10 = 0;
        int num4S1 = 0;
        int num4S2 = 0;
        int num4S3 = 0;
        int num4S4 = 0;
        int num4S5 = 0;
        int num4S6 = 0;
        int num4S7 = 0;
        int num4S8 = 0;
        int num4S9 = 0;
        int num4S10 = 0;
        int num4X1 = 0;
        int num4X2 = 0;
        int num4X3 = 0;
        int num4X4 = 0;
        int num4X5 = 0;
        int num4X6 = 0;
        int num4X7 = 0;
        int num4X8 = 0;
        int num4X9 = 0;
        int num4X10 = 0;
        int num3S1 = 0;
        int num3S2 = 0;
        int num3S3 = 0;
        int num3S4 = 0;
        int num3S5 = 0;
        int num3S6 = 0;
        int num3S7 = 0;
        int num3S8 = 0;
        int num3S9 = 0;
        int num3S10 = 0;
        int num3X1 = 0;
        int num3X2 = 0;
        int num3X3 = 0;
        int num3X4 = 0;
        int num3X5 = 0;
        int num3X6 = 0;
        int num3X7 = 0;
        int num3X8 = 0;
        int num3X9 = 0;
        int num3X10 = 0;
        int num2S1 = 0;
        int num2S2 = 0;
        int num2S3 = 0;
        int num2S4 = 0;
        int num2S5 = 0;
        int num2S6 = 0;
        int num2S7 = 0;
        int num2S8 = 0;
        int num2S9 = 0;
        int num2S10 = 0;
        int num2X1 = 0;
        int num2X2 = 0;
        int num2X3 = 0;
        int num2X4 = 0;
        int num2X5 = 0;
        int num2X6 = 0;
        int num2X7 = 0;
        int num2X8 = 0;
        int num2X9 = 0;
        int num2X10 = 0;
        int num1S1 = 0;
        int num1S2 = 0;
        int num1S3 = 0;
        int num1S4 = 0;
        int num1S5 = 0;
        int num1S6 = 0;
        int num1S7 = 0;
        int num1S8 = 0;
        int num1S9 = 0;
        int num1S10 = 0;
        int num1X1 = 0;
        int num1X2 = 0;
        int num1X3 = 0;
        int num1X4 = 0;
        int num1X5 = 0;
        int num1X6 = 0;
        int num1X7 = 0;
        int num1X8 = 0;
        int num1X9 = 0;
        int num1X10 = 0;
        int num0S1 = 0;
        int num0S2 = 0;
        int num0S3 = 0;
        int num0S4 = 0;
        int num0S5 = 0;
        int num0S6 = 0;
        int num0S7 = 0;
        int num0S8 = 0;
        int num0S9 = 0;
        int num0S10 = 0;
        int num0X1 = 0;
        int num0X2 = 0;
        int num0X3 = 0;
        int num0X4 = 0;
        int num0X5 = 0;
        int num0X6 = 0;
        int num0X7 = 0;
        int num0X8 = 0;
        int num0X9 = 0;
        int num0X10 = 0;
        int num_1S1 = 0;
        int num_1S2 = 0;
        int num_1S3 = 0;
        int num_1S4 = 0;
        int num_1S5 = 0;
        int num_1S6 = 0;
        int num_1S7 = 0;
        int num_1S8 = 0;
        int num_1S9 = 0;
        int num_1S10 = 0;
        int num_1X1 = 0;
        int num_1X2 = 0;
        int num_1X3 = 0;
        int num_1X4 = 0;
        int num_1X5 = 0;
        int num_1X6 = 0;
        int num_1X7 = 0;
        int num_1X8 = 0;
        int num_1X9 = 0;
        int num_1X10 = 0;
        int num_2S1 = 0;
        int num_2S2 = 0;
        int num_2S3 = 0;
        int num_2S4 = 0;
        int num_2S5 = 0;
        int num_2S6 = 0;
        int num_2S7 = 0;
        int num_2S8 = 0;
        int num_2S9 = 0;
        int num_2S10 = 0;
        int num_2X1 = 0;
        int num_2X2 = 0;
        int num_2X3 = 0;
        int num_2X4 = 0;
        int num_2X5 = 0;
        int num_2X6 = 0;
        int num_2X7 = 0;
        int num_2X8 = 0;
        int num_2X9 = 0;
        int num_2X10 = 0;
        int num_3S1 = 0;
        int num_3S2 = 0;
        int num_3S3 = 0;
        int num_3S4 = 0;
        int num_3S5 = 0;
        int num_3S6 = 0;
        int num_3S7 = 0;
        int num_3S8 = 0;
        int num_3S9 = 0;
        int num_3S10 = 0;
        int num_3X1 = 0;
        int num_3X2 = 0;
        int num_3X3 = 0;
        int num_3X4 = 0;
        int num_3X5 = 0;
        int num_3X6 = 0;
        int num_3X7 = 0;
        int num_3X8 = 0;
        int num_3X9 = 0;
        int num_3X10 = 0;
        int num_4S1 = 0;
        int num_4S2 = 0;
        int num_4S3 = 0;
        int num_4S4 = 0;
        int num_4S5 = 0;
        int num_4S6 = 0;
        int num_4S7 = 0;
        int num_4S8 = 0;
        int num_4S9 = 0;
        int num_4S10 = 0;
        int num_4X1 = 0;
        int num_4X2 = 0;
        int num_4X3 = 0;
        int num_4X4 = 0;
        int num_4X5 = 0;
        int num_4X6 = 0;
        int num_4X7 = 0;
        int num_4X8 = 0;
        int num_4X9 = 0;
        int num_4X10 = 0;
        int num_5S1 = 0;
        int num_5S2 = 0;
        int num_5S3 = 0;
        int num_5S4 = 0;
        int num_5S5 = 0;
        int num_5S6 = 0;
        int num_5S7 = 0;
        int num_5S8 = 0;
        int num_5S9 = 0;
        int num_5S10 = 0;
        int num_5X1 = 0;
        int num_5X2 = 0;
        int num_5X3 = 0;
        int num_5X4 = 0;
        int num_5X5 = 0;
        int num_5X6 = 0;
        int num_5X7 = 0;
        int num_5X8 = 0;
        int num_5X9 = 0;
        int num_5X10 = 0;
        int num_6S1 = 0;
        int num_6S2 = 0;
        int num_6S3 = 0;
        int num_6S4 = 0;
        int num_6S5 = 0;
        int num_6S6 = 0;
        int num_6S7 = 0;
        int num_6S8 = 0;
        int num_6S9 = 0;
        int num_6S10 = 0;
        int num_6X1 = 0;
        int num_6X2 = 0;
        int num_6X3 = 0;
        int num_6X4 = 0;
        int num_6X5 = 0;
        int num_6X6 = 0;
        int num_6X7 = 0;
        int num_6X8 = 0;
        int num_6X9 = 0;
        int num_6X10 = 0;
        int num_7S1 = 0;
        int num_7S2 = 0;
        int num_7S3 = 0;
        int num_7S4 = 0;
        int num_7S5 = 0;
        int num_7S6 = 0;
        int num_7S7 = 0;
        int num_7S8 = 0;
        int num_7S9 = 0;
        int num_7S10 = 0;
        int num_7X1 = 0;
        int num_7X2 = 0;
        int num_7X3 = 0;
        int num_7X4 = 0;
        int num_7X5 = 0;
        int num_7X6 = 0;
        int num_7X7 = 0;
        int num_7X8 = 0;
        int num_7X9 = 0;
        int num_7X10 = 0;
        int num_8S1 = 0;
        int num_8S2 = 0;
        int num_8S3 = 0;
        int num_8S4 = 0;
        int num_8S5 = 0;
        int num_8S6 = 0;
        int num_8S7 = 0;
        int num_8S8 = 0;
        int num_8S9 = 0;
        int num_8S10 = 0;
        int num_8X1 = 0;
        int num_8X2 = 0;
        int num_8X3 = 0;
        int num_8X4 = 0;
        int num_8X5 = 0;
        int num_8X6 = 0;
        int num_8X7 = 0;
        int num_8X8 = 0;
        int num_8X9 = 0;
        int num_8X10 = 0;
        int num_9S1 = 0;
        int num_9S2 = 0;
        int num_9S3 = 0;
        int num_9S4 = 0;
        int num_9S5 = 0;
        int num_9S6 = 0;
        int num_9S7 = 0;
        int num_9S8 = 0;
        int num_9S9 = 0;
        int num_9S10 = 0;
        int num_9X1 = 0;
        int num_9X2 = 0;
        int num_9X3 = 0;
        int num_9X4 = 0;
        int num_9X5 = 0;
        int num_9X6 = 0;
        int num_9X7 = 0;
        int num_9X8 = 0;
        int num_9X9 = 0;
        int num_9X10 = 0;
        int num_10S1 = 0;
        int num_10S2 = 0;
        int num_10S3 = 0;
        int num_10S4 = 0;
        int num_10S5 = 0;
        int num_10S6 = 0;
        int num_10S7 = 0;
        int num_10S8 = 0;
        int num_10S9 = 0;
        int num_10S10 = 0;
        int num_10X1 = 0;
        int num_10X2 = 0;
        int num_10X3 = 0;
        int num_10X4 = 0;
        int num_10X5 = 0;
        int num_10X6 = 0;
        int num_10X7 = 0;
        int num_10X8 = 0;
        int num_10X9 = 0;
        int num_10X10 = 0;
        int znum = 0;
        for (StockCode stockCode : stockCodeList) {
            String url = urlConfig.getStockUrl();
            //获取时间和编码
            String code = getEncoding(stockCode);
            String beginTime = "19900101";
            String endTime;
//            try {
            endTime = "20200413";//parse(new Date());
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
            count = 1;
            List<StockDay> stockDayList = new ArrayList<>();
            while ((line = reader.readLine()) != null) {
                if (count == 1) {
                    count++;
                    continue;
                }
                //获取每一行数据
                String[] lines = line.split(",");
                //存入到对于的对象中
                StockDay stockDay = new StockDay();
                stockDay.setDate(parseDate(lines[0]));
                stockDay.setCodeId(stockCode.getId());
                stockDay.setCodeEx(stockCode.getEx());
                stockDay.setOpeningPrice(getBigDecimal(lines[6]));
                stockDay.setClosingPrice(getBigDecimal(lines[3]));
                stockDay.setFoot(getBigDecimal(lines[5]));
                stockDay.setTopside(getBigDecimal(lines[4]));
                stockDay.setChangePoints(getBigDecimal(lines[8]));
                stockDay.setRateOfChange(getBigDecimal(lines[9]));
                stockDay.setMakeQuantity(getBigDecimal(lines[11]));
                stockDay.setMakePrice(getBigDecimal(lines[12]));
                stockDay.setTurnoverRate(getBigDecimal(lines[10]));
                stockDay.setLclosePrice(getBigDecimal(lines[7]));
                if (stockCode.getEx().equals("SH") && stockCode.getId().equals("000001")) {

                } else {
                    stockDay.setTcap(getBigDecimal(lines[13]));
                    stockDay.setMcap(getBigDecimal(lines[14]));
                }
                stockDayList.add(stockDay);
            }
            reader.close();
            // 断开连接
            connection.disconnect();
            //分析
            for (int i = 0; i < stockDayList.size(); i++) {
                znum++;
                if (stockDayList.get(i).getRateOfChange().compareTo(new BigDecimal(9)) >= 0) {
                    getNum(stockDayList.get(i + 1).getRateOfChange(), stockDayList.get(i + 2).getRateOfChange(), stockDayList.get(i + 3).getRateOfChange(), stockDayList.get(i + 4).getRateOfChange(),
                            stockDayList.get(i + 5).getRateOfChange(), stockDayList.get(i + 6).getRateOfChange(), stockDayList.get(i + 7).getRateOfChange(), stockDayList.get(i + 8).getRateOfChange(),
                            stockDayList.get(i + 9).getRateOfChange(), stockDayList.get(i + 10).getRateOfChange(),num9S1,num9S2,num9S3,
                            num9S4,num9S5,num9S6,num9S7,num9S8,num9S9,num9S10,num9X1,num9X2,num9X3,num9X4,num9X5,num9X6,num9X7,
                            num9X8,num9X9,num9X10);
                } else if (stockDayList.get(i).getRateOfChange().compareTo(new BigDecimal(8)) >= 0) {
                    getNum(stockDayList.get(i + 1).getRateOfChange(), stockDayList.get(i + 2).getRateOfChange(), stockDayList.get(i + 3).getRateOfChange(), stockDayList.get(i + 4).getRateOfChange(),
                            stockDayList.get(i + 5).getRateOfChange(), stockDayList.get(i + 6).getRateOfChange(), stockDayList.get(i + 7).getRateOfChange(), stockDayList.get(i + 8).getRateOfChange(),
                            stockDayList.get(i + 9).getRateOfChange(), stockDayList.get(i + 10).getRateOfChange(),num8S1,num8S2,num8S3,
                            num8S4,num8S5,num8S6,num8S7,num8S8,num8S9,num8S10,num8X1,num8X2,num8X3,num8X4,num8X5,num8X6,num8X7,
                            num8X8,num8X9,num8X10);
                } else if (stockDayList.get(i).getRateOfChange().compareTo(new BigDecimal(7)) >= 0) {
                    getNum(stockDayList.get(i + 1).getRateOfChange(), stockDayList.get(i + 2).getRateOfChange(), stockDayList.get(i + 3).getRateOfChange(), stockDayList.get(i + 4).getRateOfChange(),
                            stockDayList.get(i + 5).getRateOfChange(), stockDayList.get(i + 6).getRateOfChange(), stockDayList.get(i + 7).getRateOfChange(), stockDayList.get(i + 8).getRateOfChange(),
                            stockDayList.get(i + 9).getRateOfChange(), stockDayList.get(i + 10).getRateOfChange(),num7S1,num7S2,num7S3,
                            num7S4,num7S5,num7S6,num7S7,num7S8,num7S9,num7S10,num7X1,num7X2,num7X3,num7X4,num7X5,num7X6,num7X7,
                            num7X8,num7X9,num7X10);
                }else if (stockDayList.get(i).getRateOfChange().compareTo(new BigDecimal(6)) >= 0) {
                    getNum(stockDayList.get(i + 1).getRateOfChange(), stockDayList.get(i + 2).getRateOfChange(), stockDayList.get(i + 3).getRateOfChange(), stockDayList.get(i + 4).getRateOfChange(),
                            stockDayList.get(i + 5).getRateOfChange(), stockDayList.get(i + 6).getRateOfChange(), stockDayList.get(i + 7).getRateOfChange(), stockDayList.get(i + 8).getRateOfChange(),
                            stockDayList.get(i + 9).getRateOfChange(), stockDayList.get(i + 10).getRateOfChange(),num6S1,num6S2,num6S3,
                            num6S4,num6S5,num6S6,num6S7,num6S8,num6S9,num6S10,num6X1,num6X2,num6X3,num6X4,num6X5,num6X6,num6X7,
                            num6X8,num6X9,num6X10);
                } else if (stockDayList.get(i).getRateOfChange().compareTo(new BigDecimal(5)) >= 0) {
                    getNum(stockDayList.get(i + 1).getRateOfChange(), stockDayList.get(i + 2).getRateOfChange(), stockDayList.get(i + 3).getRateOfChange(), stockDayList.get(i + 4).getRateOfChange(),
                            stockDayList.get(i + 5).getRateOfChange(), stockDayList.get(i + 6).getRateOfChange(), stockDayList.get(i + 7).getRateOfChange(), stockDayList.get(i + 8).getRateOfChange(),
                            stockDayList.get(i + 9).getRateOfChange(), stockDayList.get(i + 10).getRateOfChange(),num5S1,num5S2,num5S3,
                            num5S4,num5S5,num5S6,num5S7,num5S8,num5S9,num5S10,num5X1,num5X2,num5X3,num5X4,num5X5,num5X6,num5X7,
                            num5X8,num5X9,num5X10);
                } else if (stockDayList.get(i).getRateOfChange().compareTo(new BigDecimal(4)) >= 0) {
                    getNum(stockDayList.get(i + 1).getRateOfChange(), stockDayList.get(i + 2).getRateOfChange(), stockDayList.get(i + 3).getRateOfChange(), stockDayList.get(i + 4).getRateOfChange(),
                            stockDayList.get(i + 5).getRateOfChange(), stockDayList.get(i + 6).getRateOfChange(), stockDayList.get(i + 7).getRateOfChange(), stockDayList.get(i + 8).getRateOfChange(),
                            stockDayList.get(i + 9).getRateOfChange(), stockDayList.get(i + 10).getRateOfChange(),num4S1,num4S2,num4S3,
                            num4S4,num4S5,num4S6,num4S7,num4S8,num4S9,num4S10,num4X1,num4X2,num4X3,num4X4,num4X5,num4X6,num4X7,
                            num4X8,num4X9,num4X10);
                } else if (stockDayList.get(i).getRateOfChange().compareTo(new BigDecimal(3)) >= 0) {
                    getNum(stockDayList.get(i + 1).getRateOfChange(), stockDayList.get(i + 2).getRateOfChange(), stockDayList.get(i + 3).getRateOfChange(), stockDayList.get(i + 4).getRateOfChange(),
                            stockDayList.get(i + 5).getRateOfChange(), stockDayList.get(i + 6).getRateOfChange(), stockDayList.get(i + 7).getRateOfChange(), stockDayList.get(i + 8).getRateOfChange(),
                            stockDayList.get(i + 9).getRateOfChange(), stockDayList.get(i + 10).getRateOfChange(),num3S1,num3S2,num3S3,
                            num3S4,num3S5,num3S6,num3S7,num3S8,num3S9,num3S10,num3X1,num3X2,num3X3,num3X4,num3X5,num3X6,num3X7,
                            num3X8,num3X9,num3X10);
                } else if (stockDayList.get(i).getRateOfChange().compareTo(new BigDecimal(2)) >= 0) {
                    getNum(stockDayList.get(i + 1).getRateOfChange(), stockDayList.get(i + 2).getRateOfChange(), stockDayList.get(i + 3).getRateOfChange(), stockDayList.get(i + 4).getRateOfChange(),
                            stockDayList.get(i + 5).getRateOfChange(), stockDayList.get(i + 6).getRateOfChange(), stockDayList.get(i + 7).getRateOfChange(), stockDayList.get(i + 8).getRateOfChange(),
                            stockDayList.get(i + 9).getRateOfChange(), stockDayList.get(i + 10).getRateOfChange(),num2S1,num2S2,num2S3,
                            num2S4,num2S5,num2S6,num2S7,num2S8,num2S9,num2S10,num2X1,num2X2,num2X3,num2X4,num2X5,num2X6,num2X7,
                            num2X8,num2X9,num2X10);
                } else if (stockDayList.get(i).getRateOfChange().compareTo(new BigDecimal(1)) >= 0) {
                    getNum(stockDayList.get(i + 1).getRateOfChange(), stockDayList.get(i + 2).getRateOfChange(), stockDayList.get(i + 3).getRateOfChange(), stockDayList.get(i + 4).getRateOfChange(),
                            stockDayList.get(i + 5).getRateOfChange(), stockDayList.get(i + 6).getRateOfChange(), stockDayList.get(i + 7).getRateOfChange(), stockDayList.get(i + 8).getRateOfChange(),
                            stockDayList.get(i + 9).getRateOfChange(), stockDayList.get(i + 10).getRateOfChange(),num1S1,num1S2,num1S3,
                            num1S4,num1S5,num1S6,num1S7,num1S8,num1S9,num1S10,num1X1,num1X2,num1X3,num1X4,num1X5,num1X6,num1X7,
                            num1X8,num1X9,num1X10);
                } else if (stockDayList.get(i).getRateOfChange().compareTo(new BigDecimal(0)) >= 0) {
                    getNum(stockDayList.get(i + 1).getRateOfChange(), stockDayList.get(i + 2).getRateOfChange(), stockDayList.get(i + 3).getRateOfChange(), stockDayList.get(i + 4).getRateOfChange(),
                            stockDayList.get(i + 5).getRateOfChange(), stockDayList.get(i + 6).getRateOfChange(), stockDayList.get(i + 7).getRateOfChange(), stockDayList.get(i + 8).getRateOfChange(),
                            stockDayList.get(i + 9).getRateOfChange(), stockDayList.get(i + 10).getRateOfChange(),num0S1,num0S2,num0S3,
                            num0S4,num0S5,num0S6,num0S7,num0S8,num0S9,num0S10,num0X1,num0X2,num0X3,num0X4,num0X5,num0X6,num0X7,
                            num0X8,num0X9,num0X10);
                } else if (stockDayList.get(i).getRateOfChange().compareTo(new BigDecimal(-1)) >= 0) {
                    getNum(stockDayList.get(i + 1).getRateOfChange(), stockDayList.get(i + 2).getRateOfChange(), stockDayList.get(i + 3).getRateOfChange(), stockDayList.get(i + 4).getRateOfChange(),
                            stockDayList.get(i + 5).getRateOfChange(), stockDayList.get(i + 6).getRateOfChange(), stockDayList.get(i + 7).getRateOfChange(), stockDayList.get(i + 8).getRateOfChange(),
                            stockDayList.get(i + 9).getRateOfChange(), stockDayList.get(i + 10).getRateOfChange(),num_1S1,num_1S2,num_1S3,
                            num_1S4,num_1S5,num_1S6,num_1S7,num_1S8,num_1S9,num_1S10,num_1X1,num_1X2,num_1X3,num_1X4,num_1X5,num_1X6,num_1X7,
                            num_1X8,num_1X9,num_1X10);
                } else if (stockDayList.get(i).getRateOfChange().compareTo(new BigDecimal(-2)) >= 0) {
                    getNum(stockDayList.get(i + 1).getRateOfChange(), stockDayList.get(i + 2).getRateOfChange(), stockDayList.get(i + 3).getRateOfChange(), stockDayList.get(i + 4).getRateOfChange(),
                            stockDayList.get(i + 5).getRateOfChange(), stockDayList.get(i + 6).getRateOfChange(), stockDayList.get(i + 7).getRateOfChange(), stockDayList.get(i + 8).getRateOfChange(),
                            stockDayList.get(i + 9).getRateOfChange(), stockDayList.get(i + 10).getRateOfChange(),num_2S1,num_2S2,num_2S3,
                            num_2S4,num_2S5,num_2S6,num_2S7,num_2S8,num_2S9,num_2S10,num_2X1,num_2X2,num_2X3,num_2X4,num_2X5,num_2X6,num_2X7,
                            num_2X8,num_2X9,num_2X10);
                } else if (stockDayList.get(i).getRateOfChange().compareTo(new BigDecimal(-3)) >= 0) {
                    getNum(stockDayList.get(i + 1).getRateOfChange(), stockDayList.get(i + 2).getRateOfChange(), stockDayList.get(i + 3).getRateOfChange(), stockDayList.get(i + 4).getRateOfChange(),
                            stockDayList.get(i + 5).getRateOfChange(), stockDayList.get(i + 6).getRateOfChange(), stockDayList.get(i + 7).getRateOfChange(), stockDayList.get(i + 8).getRateOfChange(),
                            stockDayList.get(i + 9).getRateOfChange(), stockDayList.get(i + 10).getRateOfChange(),num_3S1,num_3S2,num_3S3,
                            num_3S4,num_3S5,num_3S6,num_3S7,num_3S8,num_3S9,num_3S10,num_3X1,num_3X2,num_3X3,num_3X4,num_3X5,num_3X6,num_3X7,
                            num_3X8,num_3X9,num_3X10);
                } else if (stockDayList.get(i).getRateOfChange().compareTo(new BigDecimal(-4)) >= 0) {
                    getNum(stockDayList.get(i + 1).getRateOfChange(), stockDayList.get(i + 2).getRateOfChange(), stockDayList.get(i + 3).getRateOfChange(), stockDayList.get(i + 4).getRateOfChange(),
                            stockDayList.get(i + 5).getRateOfChange(), stockDayList.get(i + 6).getRateOfChange(), stockDayList.get(i + 7).getRateOfChange(), stockDayList.get(i + 8).getRateOfChange(),
                            stockDayList.get(i + 9).getRateOfChange(), stockDayList.get(i + 10).getRateOfChange(),num_4S1,num_4S2,num_4S3,
                            num_4S4,num_4S5,num_4S6,num_4S7,num_4S8,num_4S9,num_4S10,num_4X1,num_4X2,num_4X3,num_4X4,num_4X5,num_4X6,num_4X7,
                            num_4X8,num_4X9,num_4X10);
                } else if (stockDayList.get(i).getRateOfChange().compareTo(new BigDecimal(-5)) >= 0) {
                    getNum(stockDayList.get(i + 1).getRateOfChange(), stockDayList.get(i + 2).getRateOfChange(), stockDayList.get(i + 3).getRateOfChange(), stockDayList.get(i + 4).getRateOfChange(),
                            stockDayList.get(i + 5).getRateOfChange(), stockDayList.get(i + 6).getRateOfChange(), stockDayList.get(i + 7).getRateOfChange(), stockDayList.get(i + 8).getRateOfChange(),
                            stockDayList.get(i + 9).getRateOfChange(), stockDayList.get(i + 10).getRateOfChange(),num_5S1,num_5S2,num_5S3,
                            num_5S4,num_5S5,num_5S6,num_5S7,num_5S8,num_5S9,num_5S10,num_5X1,num_5X2,num_5X3,num_5X4,num_5X5,num_5X6,num_5X7,
                            num_5X8,num_5X9,num_5X10);
                } else if (stockDayList.get(i).getRateOfChange().compareTo(new BigDecimal(-6)) >= 0) {
                    getNum(stockDayList.get(i + 1).getRateOfChange(), stockDayList.get(i + 2).getRateOfChange(), stockDayList.get(i + 3).getRateOfChange(), stockDayList.get(i + 4).getRateOfChange(),
                            stockDayList.get(i + 5).getRateOfChange(), stockDayList.get(i + 6).getRateOfChange(), stockDayList.get(i + 7).getRateOfChange(), stockDayList.get(i + 8).getRateOfChange(),
                            stockDayList.get(i + 9).getRateOfChange(), stockDayList.get(i + 10).getRateOfChange(),num_6S1,num_6S2,num_6S3,
                            num_6S4,num_6S5,num_6S6,num_6S7,num_6S8,num_6S9,num_6S10,num_6X1,num_6X2,num_6X3,num_6X4,num_6X5,num_6X6,num_6X7,
                            num_6X8,num_6X9,num_6X10);
                } else if (stockDayList.get(i).getRateOfChange().compareTo(new BigDecimal(-7)) >= 0) {
                    getNum(stockDayList.get(i + 1).getRateOfChange(), stockDayList.get(i + 2).getRateOfChange(), stockDayList.get(i + 3).getRateOfChange(), stockDayList.get(i + 4).getRateOfChange(),
                            stockDayList.get(i + 5).getRateOfChange(), stockDayList.get(i + 6).getRateOfChange(), stockDayList.get(i + 7).getRateOfChange(), stockDayList.get(i + 8).getRateOfChange(),
                            stockDayList.get(i + 9).getRateOfChange(), stockDayList.get(i + 10).getRateOfChange(),num_7S1,num_7S2,num_7S3,
                            num_7S4,num_7S5,num_7S6,num_7S7,num_7S8,num_7S9,num_7S10,num_7X1,num_7X2,num_7X3,num_7X4,num_7X5,num_7X6,num_7X7,
                            num_7X8,num_7X9,num_7X10);
                } else if (stockDayList.get(i).getRateOfChange().compareTo(new BigDecimal(-8)) >= 0) {
                    getNum(stockDayList.get(i + 1).getRateOfChange(), stockDayList.get(i + 2).getRateOfChange(), stockDayList.get(i + 3).getRateOfChange(), stockDayList.get(i + 4).getRateOfChange(),
                            stockDayList.get(i + 5).getRateOfChange(), stockDayList.get(i + 6).getRateOfChange(), stockDayList.get(i + 7).getRateOfChange(), stockDayList.get(i + 8).getRateOfChange(),
                            stockDayList.get(i + 9).getRateOfChange(), stockDayList.get(i + 10).getRateOfChange(),num_8S1,num_8S2,num_8S3,
                            num_8S4,num_8S5,num_8S6,num_8S7,num_8S8,num_8S9,num_8S10,num_8X1,num_8X2,num_8X3,num_8X4,num_8X5,num_8X6,num_8X7,
                            num_8X8,num_8X9,num_8X10);
                } else if (stockDayList.get(i).getRateOfChange().compareTo(new BigDecimal(-9)) >= 0) {
                    getNum(stockDayList.get(i + 1).getRateOfChange(), stockDayList.get(i + 2).getRateOfChange(), stockDayList.get(i + 3).getRateOfChange(), stockDayList.get(i + 4).getRateOfChange(),
                            stockDayList.get(i + 5).getRateOfChange(), stockDayList.get(i + 6).getRateOfChange(), stockDayList.get(i + 7).getRateOfChange(), stockDayList.get(i + 8).getRateOfChange(),
                            stockDayList.get(i + 9).getRateOfChange(), stockDayList.get(i + 10).getRateOfChange(),num_9S1,num_9S2,num_9S3,
                            num_9S4,num_9S5,num_9S6,num_9S7,num_9S8,num_9S9,num_9S10,num_9X1,num_9X2,num_9X3,num_9X4,num_9X5,num_9X6,num_9X7,
                            num_9X8,num_9X9,num_9X10);
                } else if (stockDayList.get(i).getRateOfChange().compareTo(new BigDecimal(-10)) >= 0) {
                    getNum(stockDayList.get(i + 1).getRateOfChange(), stockDayList.get(i + 2).getRateOfChange(), stockDayList.get(i + 3).getRateOfChange(), stockDayList.get(i + 4).getRateOfChange(),
                            stockDayList.get(i + 5).getRateOfChange(), stockDayList.get(i + 6).getRateOfChange(), stockDayList.get(i + 7).getRateOfChange(), stockDayList.get(i + 8).getRateOfChange(),
                            stockDayList.get(i + 9).getRateOfChange(), stockDayList.get(i + 10).getRateOfChange(),num_10S1,num_10S2,num_10S3,
                            num_10S4,num_10S5,num_10S6,num_10S7,num_10S8,num_10S9,num_10S10,num_10X1,num_10X2,num_10X3,num_10X4,num_10X5,num_10X6,num_10X7,
                            num_10X8,num_10X9,num_10X10);
                }
            }
            getList(9,1,num9S1,znum,upGoTimeList);
            getList(9,2,num9S2,znum,upGoTimeList);
            getList(9,3,num9S3,znum,upGoTimeList);
            getList(9,4,num9S4,znum,upGoTimeList);
            getList(9,5,num9S5,znum,upGoTimeList);
            getList(9,6,num9S6,znum,upGoTimeList);
            getList(9,7,num9S7,znum,upGoTimeList);
            getList(9,8,num9S8,znum,upGoTimeList);
            getList(9,9,num9S9,znum,upGoTimeList);
            getList(9,10,num9S10,znum,upGoTimeList);
            getList(9,-1,num9X1,znum,upGoTimeList);
            getList(9,-2,num9X2,znum,upGoTimeList);
            getList(9,-3,num9X3,znum,upGoTimeList);
            getList(9,-4,num9X4,znum,upGoTimeList);
            getList(9,-5,num9X5,znum,upGoTimeList);
            getList(9,-6,num9X6,znum,upGoTimeList);
            getList(9,-7,num9X7,znum,upGoTimeList);
            getList(9,-8,num9X8,znum,upGoTimeList);
            getList(9,-9,num9X9,znum,upGoTimeList);
            getList(9,-10,num9X10,znum,upGoTimeList);

            getList(8,1,num8S1,znum,upGoTimeList);
            getList(8,2,num8S2,znum,upGoTimeList);
            getList(8,3,num8S3,znum,upGoTimeList);
            getList(8,4,num8S4,znum,upGoTimeList);
            getList(8,5,num8S5,znum,upGoTimeList);
            getList(8,6,num8S6,znum,upGoTimeList);
            getList(8,7,num8S7,znum,upGoTimeList);
            getList(8,8,num8S8,znum,upGoTimeList);
            getList(8,9,num8S9,znum,upGoTimeList);
            getList(8,10,num8S10,znum,upGoTimeList);
            getList(8,-1,num8X1,znum,upGoTimeList);
            getList(8,-2,num8X2,znum,upGoTimeList);
            getList(8,-3,num8X3,znum,upGoTimeList);
            getList(8,-4,num8X4,znum,upGoTimeList);
            getList(8,-5,num8X5,znum,upGoTimeList);
            getList(8,-6,num8X6,znum,upGoTimeList);
            getList(8,-7,num8X7,znum,upGoTimeList);
            getList(8,-8,num8X8,znum,upGoTimeList);
            getList(8,-9,num8X9,znum,upGoTimeList);
            getList(8,-10,num8X10,znum,upGoTimeList);

            getList(7,1,num7S1,znum,upGoTimeList);
            getList(7,2,num7S2,znum,upGoTimeList);
            getList(7,3,num7S3,znum,upGoTimeList);
            getList(7,4,num7S4,znum,upGoTimeList);
            getList(7,5,num7S5,znum,upGoTimeList);
            getList(7,6,num7S6,znum,upGoTimeList);
            getList(7,7,num7S7,znum,upGoTimeList);
            getList(7,8,num7S8,znum,upGoTimeList);
            getList(7,9,num7S9,znum,upGoTimeList);
            getList(7,10,num7S10,znum,upGoTimeList);
            getList(7,-1,num7X1,znum,upGoTimeList);
            getList(7,-2,num7X2,znum,upGoTimeList);
            getList(7,-3,num7X3,znum,upGoTimeList);
            getList(7,-4,num7X4,znum,upGoTimeList);
            getList(7,-5,num7X5,znum,upGoTimeList);
            getList(7,-6,num7X6,znum,upGoTimeList);
            getList(7,-7,num7X7,znum,upGoTimeList);
            getList(7,-8,num7X8,znum,upGoTimeList);
            getList(7,-9,num7X9,znum,upGoTimeList);
            getList(7,-10,num7X10,znum,upGoTimeList);

            getList(6,1,num6S1,znum,upGoTimeList);
            getList(6,2,num6S2,znum,upGoTimeList);
            getList(6,3,num6S3,znum,upGoTimeList);
            getList(6,4,num6S4,znum,upGoTimeList);
            getList(6,5,num6S5,znum,upGoTimeList);
            getList(6,6,num6S6,znum,upGoTimeList);
            getList(6,7,num6S7,znum,upGoTimeList);
            getList(6,8,num6S8,znum,upGoTimeList);
            getList(6,9,num6S9,znum,upGoTimeList);
            getList(6,10,num6S10,znum,upGoTimeList);
            getList(6,-1,num6X1,znum,upGoTimeList);
            getList(6,-2,num6X2,znum,upGoTimeList);
            getList(6,-3,num6X3,znum,upGoTimeList);
            getList(6,-4,num6X4,znum,upGoTimeList);
            getList(6,-5,num6X5,znum,upGoTimeList);
            getList(6,-6,num6X6,znum,upGoTimeList);
            getList(6,-7,num6X7,znum,upGoTimeList);
            getList(6,-8,num6X8,znum,upGoTimeList);
            getList(6,-9,num6X9,znum,upGoTimeList);
            getList(6,-10,num6X10,znum,upGoTimeList);

            getList(5,1,num5S1,znum,upGoTimeList);
            getList(5,2,num5S2,znum,upGoTimeList);
            getList(5,3,num5S3,znum,upGoTimeList);
            getList(5,4,num5S4,znum,upGoTimeList);
            getList(5,5,num5S5,znum,upGoTimeList);
            getList(5,6,num5S6,znum,upGoTimeList);
            getList(5,7,num5S7,znum,upGoTimeList);
            getList(5,8,num5S8,znum,upGoTimeList);
            getList(5,9,num5S9,znum,upGoTimeList);
            getList(5,10,num5S10,znum,upGoTimeList);
            getList(5,-1,num5X1,znum,upGoTimeList);
            getList(5,-2,num5X2,znum,upGoTimeList);
            getList(5,-3,num5X3,znum,upGoTimeList);
            getList(5,-4,num5X4,znum,upGoTimeList);
            getList(5,-5,num5X5,znum,upGoTimeList);
            getList(5,-6,num5X6,znum,upGoTimeList);
            getList(5,-7,num5X7,znum,upGoTimeList);
            getList(5,-8,num5X8,znum,upGoTimeList);
            getList(5,-9,num5X9,znum,upGoTimeList);
            getList(5,-10,num5X10,znum,upGoTimeList);

            getList(4,1,num4S1,znum,upGoTimeList);
            getList(4,2,num4S2,znum,upGoTimeList);
            getList(4,3,num4S3,znum,upGoTimeList);
            getList(4,4,num4S4,znum,upGoTimeList);
            getList(4,5,num4S5,znum,upGoTimeList);
            getList(4,6,num4S6,znum,upGoTimeList);
            getList(4,7,num4S7,znum,upGoTimeList);
            getList(4,8,num4S8,znum,upGoTimeList);
            getList(4,9,num4S9,znum,upGoTimeList);
            getList(4,10,num4S10,znum,upGoTimeList);
            getList(4,-1,num4X1,znum,upGoTimeList);
            getList(4,-2,num4X2,znum,upGoTimeList);
            getList(4,-3,num4X3,znum,upGoTimeList);
            getList(4,-4,num4X4,znum,upGoTimeList);
            getList(4,-5,num4X5,znum,upGoTimeList);
            getList(4,-6,num4X6,znum,upGoTimeList);
            getList(4,-7,num4X7,znum,upGoTimeList);
            getList(4,-8,num4X8,znum,upGoTimeList);
            getList(4,-9,num4X9,znum,upGoTimeList);
            getList(4,-10,num4X10,znum,upGoTimeList);

            getList(3,1,num3S1,znum,upGoTimeList);
            getList(3,2,num3S2,znum,upGoTimeList);
            getList(3,3,num3S3,znum,upGoTimeList);
            getList(3,4,num3S4,znum,upGoTimeList);
            getList(3,5,num3S5,znum,upGoTimeList);
            getList(3,6,num3S6,znum,upGoTimeList);
            getList(3,7,num3S7,znum,upGoTimeList);
            getList(3,8,num3S8,znum,upGoTimeList);
            getList(3,9,num3S9,znum,upGoTimeList);
            getList(3,10,num3S10,znum,upGoTimeList);
            getList(3,-1,num3X1,znum,upGoTimeList);
            getList(3,-2,num3X2,znum,upGoTimeList);
            getList(3,-3,num3X3,znum,upGoTimeList);
            getList(3,-4,num3X4,znum,upGoTimeList);
            getList(3,-5,num3X5,znum,upGoTimeList);
            getList(3,-6,num3X6,znum,upGoTimeList);
            getList(3,-7,num3X7,znum,upGoTimeList);
            getList(3,-8,num3X8,znum,upGoTimeList);
            getList(3,-9,num3X9,znum,upGoTimeList);
            getList(3,-10,num3X10,znum,upGoTimeList);

            getList(2,1,num2S1,znum,upGoTimeList);
            getList(2,2,num2S2,znum,upGoTimeList);
            getList(2,3,num2S3,znum,upGoTimeList);
            getList(2,4,num2S4,znum,upGoTimeList);
            getList(2,5,num2S5,znum,upGoTimeList);
            getList(2,6,num2S6,znum,upGoTimeList);
            getList(2,7,num2S7,znum,upGoTimeList);
            getList(2,8,num2S8,znum,upGoTimeList);
            getList(2,9,num2S9,znum,upGoTimeList);
            getList(2,10,num2S10,znum,upGoTimeList);
            getList(2,-1,num2X1,znum,upGoTimeList);
            getList(2,-2,num2X2,znum,upGoTimeList);
            getList(2,-3,num2X3,znum,upGoTimeList);
            getList(2,-4,num2X4,znum,upGoTimeList);
            getList(2,-5,num2X5,znum,upGoTimeList);
            getList(2,-6,num2X6,znum,upGoTimeList);
            getList(2,-7,num2X7,znum,upGoTimeList);
            getList(2,-8,num2X8,znum,upGoTimeList);
            getList(2,-9,num2X9,znum,upGoTimeList);
            getList(2,-10,num2X10,znum,upGoTimeList);

            getList(1,1,num1S1,znum,upGoTimeList);
            getList(1,2,num1S2,znum,upGoTimeList);
            getList(1,3,num1S3,znum,upGoTimeList);
            getList(1,4,num1S4,znum,upGoTimeList);
            getList(1,5,num1S5,znum,upGoTimeList);
            getList(1,6,num1S6,znum,upGoTimeList);
            getList(1,7,num1S7,znum,upGoTimeList);
            getList(1,8,num1S8,znum,upGoTimeList);
            getList(1,9,num1S9,znum,upGoTimeList);
            getList(1,10,num1S10,znum,upGoTimeList);
            getList(1,-1,num1X1,znum,upGoTimeList);
            getList(1,-2,num1X2,znum,upGoTimeList);
            getList(1,-3,num1X3,znum,upGoTimeList);
            getList(1,-4,num1X4,znum,upGoTimeList);
            getList(1,-5,num1X5,znum,upGoTimeList);
            getList(1,-6,num1X6,znum,upGoTimeList);
            getList(1,-7,num1X7,znum,upGoTimeList);
            getList(1,-8,num1X8,znum,upGoTimeList);
            getList(1,-9,num1X9,znum,upGoTimeList);
            getList(1,-10,num1X10,znum,upGoTimeList);

            getList(0,1,num0S1,znum,upGoTimeList);
            getList(0,2,num0S2,znum,upGoTimeList);
            getList(0,3,num0S3,znum,upGoTimeList);
            getList(0,4,num0S4,znum,upGoTimeList);
            getList(0,5,num0S5,znum,upGoTimeList);
            getList(0,6,num0S6,znum,upGoTimeList);
            getList(0,7,num0S7,znum,upGoTimeList);
            getList(0,8,num0S8,znum,upGoTimeList);
            getList(0,9,num0S9,znum,upGoTimeList);
            getList(0,10,num0S10,znum,upGoTimeList);
            getList(0,-1,num0X1,znum,upGoTimeList);
            getList(0,-2,num0X2,znum,upGoTimeList);
            getList(0,-3,num0X3,znum,upGoTimeList);
            getList(0,-4,num0X4,znum,upGoTimeList);
            getList(0,-5,num0X5,znum,upGoTimeList);
            getList(0,-6,num0X6,znum,upGoTimeList);
            getList(0,-7,num0X7,znum,upGoTimeList);
            getList(0,-8,num0X8,znum,upGoTimeList);
            getList(0,-9,num0X9,znum,upGoTimeList);
            getList(0,-10,num0X10,znum,upGoTimeList);

            getList(-1,1,num_1S1,znum,upGoTimeList);
            getList(-1,2,num_1S2,znum,upGoTimeList);
            getList(-1,3,num_1S3,znum,upGoTimeList);
            getList(-1,4,num_1S4,znum,upGoTimeList);
            getList(-1,5,num_1S5,znum,upGoTimeList);
            getList(-1,6,num_1S6,znum,upGoTimeList);
            getList(-1,7,num_1S7,znum,upGoTimeList);
            getList(-1,8,num_1S8,znum,upGoTimeList);
            getList(-1,9,num_1S9,znum,upGoTimeList);
            getList(-1,10,num_1S10,znum,upGoTimeList);
            getList(-1,-1,num_1X1,znum,upGoTimeList);
            getList(-1,-2,num_1X2,znum,upGoTimeList);
            getList(-1,-3,num_1X3,znum,upGoTimeList);
            getList(-1,-4,num_1X4,znum,upGoTimeList);
            getList(-1,-5,num_1X5,znum,upGoTimeList);
            getList(-1,-6,num_1X6,znum,upGoTimeList);
            getList(-1,-7,num_1X7,znum,upGoTimeList);
            getList(-1,-8,num_1X8,znum,upGoTimeList);
            getList(-1,-9,num_1X9,znum,upGoTimeList);
            getList(-1,-10,num_1X10,znum,upGoTimeList);

            getList(-2,1,num_2S1,znum,upGoTimeList);
            getList(-2,2,num_2S2,znum,upGoTimeList);
            getList(-2,3,num_2S3,znum,upGoTimeList);
            getList(-2,4,num_2S4,znum,upGoTimeList);
            getList(-2,5,num_2S5,znum,upGoTimeList);
            getList(-2,6,num_2S6,znum,upGoTimeList);
            getList(-2,7,num_2S7,znum,upGoTimeList);
            getList(-2,8,num_2S8,znum,upGoTimeList);
            getList(-2,9,num_2S9,znum,upGoTimeList);
            getList(-2,10,num_2S10,znum,upGoTimeList);
            getList(-2,-1,num_2X1,znum,upGoTimeList);
            getList(-2,-2,num_2X2,znum,upGoTimeList);
            getList(-2,-3,num_2X3,znum,upGoTimeList);
            getList(-2,-4,num_2X4,znum,upGoTimeList);
            getList(-2,-5,num_2X5,znum,upGoTimeList);
            getList(-2,-6,num_2X6,znum,upGoTimeList);
            getList(-2,-7,num_2X7,znum,upGoTimeList);
            getList(-2,-8,num_2X8,znum,upGoTimeList);
            getList(-2,-9,num_2X9,znum,upGoTimeList);
            getList(-2,-10,num_2X10,znum,upGoTimeList);

            getList(-3,1,num_3S1,znum,upGoTimeList);
            getList(-3,2,num_3S2,znum,upGoTimeList);
            getList(-3,3,num_3S3,znum,upGoTimeList);
            getList(-3,4,num_3S4,znum,upGoTimeList);
            getList(-3,5,num_3S5,znum,upGoTimeList);
            getList(-3,6,num_3S6,znum,upGoTimeList);
            getList(-3,7,num_3S7,znum,upGoTimeList);
            getList(-3,8,num_3S8,znum,upGoTimeList);
            getList(-3,9,num_3S9,znum,upGoTimeList);
            getList(-3,10,num_3S10,znum,upGoTimeList);
            getList(-3,-1,num_3X1,znum,upGoTimeList);
            getList(-3,-2,num_3X2,znum,upGoTimeList);
            getList(-3,-3,num_3X3,znum,upGoTimeList);
            getList(-3,-4,num_3X4,znum,upGoTimeList);
            getList(-3,-5,num_3X5,znum,upGoTimeList);
            getList(-3,-6,num_3X6,znum,upGoTimeList);
            getList(-3,-7,num_3X7,znum,upGoTimeList);
            getList(-3,-8,num_3X8,znum,upGoTimeList);
            getList(-3,-9,num_3X9,znum,upGoTimeList);
            getList(-3,-10,num_3X10,znum,upGoTimeList);

            getList(-4,1,num_4S1,znum,upGoTimeList);
            getList(-4,2,num_4S2,znum,upGoTimeList);
            getList(-4,3,num_4S3,znum,upGoTimeList);
            getList(-4,4,num_4S4,znum,upGoTimeList);
            getList(-4,5,num_4S5,znum,upGoTimeList);
            getList(-4,6,num_4S6,znum,upGoTimeList);
            getList(-4,7,num_4S7,znum,upGoTimeList);
            getList(-4,8,num_4S8,znum,upGoTimeList);
            getList(-4,9,num_4S9,znum,upGoTimeList);
            getList(-4,10,num_4S10,znum,upGoTimeList);
            getList(-4,-1,num_4X1,znum,upGoTimeList);
            getList(-4,-2,num_4X2,znum,upGoTimeList);
            getList(-4,-3,num_4X3,znum,upGoTimeList);
            getList(-4,-4,num_4X4,znum,upGoTimeList);
            getList(-4,-5,num_4X5,znum,upGoTimeList);
            getList(-4,-6,num_4X6,znum,upGoTimeList);
            getList(-4,-7,num_4X7,znum,upGoTimeList);
            getList(-4,-8,num_4X8,znum,upGoTimeList);
            getList(-4,-9,num_4X9,znum,upGoTimeList);
            getList(-4,-10,num_4X10,znum,upGoTimeList);

            getList(-5,1,num_5S1,znum,upGoTimeList);
            getList(-5,2,num_5S2,znum,upGoTimeList);
            getList(-5,3,num_5S3,znum,upGoTimeList);
            getList(-5,4,num_5S4,znum,upGoTimeList);
            getList(-5,5,num_5S5,znum,upGoTimeList);
            getList(-5,6,num_5S6,znum,upGoTimeList);
            getList(-5,7,num_5S7,znum,upGoTimeList);
            getList(-5,8,num_5S8,znum,upGoTimeList);
            getList(-5,9,num_5S9,znum,upGoTimeList);
            getList(-5,10,num_5S10,znum,upGoTimeList);
            getList(-5,-1,num_5X1,znum,upGoTimeList);
            getList(-5,-2,num_5X2,znum,upGoTimeList);
            getList(-5,-3,num_5X3,znum,upGoTimeList);
            getList(-5,-4,num_5X4,znum,upGoTimeList);
            getList(-5,-5,num_5X5,znum,upGoTimeList);
            getList(-5,-6,num_5X6,znum,upGoTimeList);
            getList(-5,-7,num_5X7,znum,upGoTimeList);
            getList(-5,-8,num_5X8,znum,upGoTimeList);
            getList(-5,-9,num_5X9,znum,upGoTimeList);
            getList(-5,-10,num_5X10,znum,upGoTimeList);

            getList(-6,1,num_6S1,znum,upGoTimeList);
            getList(-6,2,num_6S2,znum,upGoTimeList);
            getList(-6,3,num_6S3,znum,upGoTimeList);
            getList(-6,4,num_6S4,znum,upGoTimeList);
            getList(-6,5,num_6S5,znum,upGoTimeList);
            getList(-6,6,num_6S6,znum,upGoTimeList);
            getList(-6,7,num_6S7,znum,upGoTimeList);
            getList(-6,8,num_6S8,znum,upGoTimeList);
            getList(-6,9,num_6S9,znum,upGoTimeList);
            getList(-6,10,num_6S10,znum,upGoTimeList);
            getList(-6,-1,num_6X1,znum,upGoTimeList);
            getList(-6,-2,num_6X2,znum,upGoTimeList);
            getList(-6,-3,num_6X3,znum,upGoTimeList);
            getList(-6,-4,num_6X4,znum,upGoTimeList);
            getList(-6,-5,num_6X5,znum,upGoTimeList);
            getList(-6,-6,num_6X6,znum,upGoTimeList);
            getList(-6,-7,num_6X7,znum,upGoTimeList);
            getList(-6,-8,num_6X8,znum,upGoTimeList);
            getList(-6,-9,num_6X9,znum,upGoTimeList);
            getList(-6,-10,num_6X10,znum,upGoTimeList);

            getList(-7,1,num_7S1,znum,upGoTimeList);
            getList(-7,2,num_7S2,znum,upGoTimeList);
            getList(-7,3,num_7S3,znum,upGoTimeList);
            getList(-7,4,num_7S4,znum,upGoTimeList);
            getList(-7,5,num_7S5,znum,upGoTimeList);
            getList(-7,6,num_7S6,znum,upGoTimeList);
            getList(-7,7,num_7S7,znum,upGoTimeList);
            getList(-7,8,num_7S8,znum,upGoTimeList);
            getList(-7,9,num_7S9,znum,upGoTimeList);
            getList(-7,10,num_7S10,znum,upGoTimeList);
            getList(-7,-1,num_7X1,znum,upGoTimeList);
            getList(-7,-2,num_7X2,znum,upGoTimeList);
            getList(-7,-3,num_7X3,znum,upGoTimeList);
            getList(-7,-4,num_7X4,znum,upGoTimeList);
            getList(-7,-5,num_7X5,znum,upGoTimeList);
            getList(-7,-6,num_7X6,znum,upGoTimeList);
            getList(-7,-7,num_7X7,znum,upGoTimeList);
            getList(-7,-8,num_7X8,znum,upGoTimeList);
            getList(-7,-9,num_7X9,znum,upGoTimeList);
            getList(-7,-10,num_7X10,znum,upGoTimeList);

            getList(-8,1,num_8S1,znum,upGoTimeList);
            getList(-8,2,num_8S2,znum,upGoTimeList);
            getList(-8,3,num_8S3,znum,upGoTimeList);
            getList(-8,4,num_8S4,znum,upGoTimeList);
            getList(-8,5,num_8S5,znum,upGoTimeList);
            getList(-8,6,num_8S6,znum,upGoTimeList);
            getList(-8,7,num_8S7,znum,upGoTimeList);
            getList(-8,8,num_8S8,znum,upGoTimeList);
            getList(-8,9,num_8S9,znum,upGoTimeList);
            getList(-8,10,num_8S10,znum,upGoTimeList);
            getList(-8,-1,num_8X1,znum,upGoTimeList);
            getList(-8,-2,num_8X2,znum,upGoTimeList);
            getList(-8,-3,num_8X3,znum,upGoTimeList);
            getList(-8,-4,num_8X4,znum,upGoTimeList);
            getList(-8,-5,num_8X5,znum,upGoTimeList);
            getList(-8,-6,num_8X6,znum,upGoTimeList);
            getList(-8,-7,num_8X7,znum,upGoTimeList);
            getList(-8,-8,num_8X8,znum,upGoTimeList);
            getList(-8,-9,num_8X9,znum,upGoTimeList);
            getList(-8,-10,num_8X10,znum,upGoTimeList);

            getList(-9,1,num_9S1,znum,upGoTimeList);
            getList(-9,2,num_9S2,znum,upGoTimeList);
            getList(-9,3,num_9S3,znum,upGoTimeList);
            getList(-9,4,num_9S4,znum,upGoTimeList);
            getList(-9,5,num_9S5,znum,upGoTimeList);
            getList(-9,6,num_9S6,znum,upGoTimeList);
            getList(-9,7,num_9S7,znum,upGoTimeList);
            getList(-9,8,num_9S8,znum,upGoTimeList);
            getList(-9,9,num_9S9,znum,upGoTimeList);
            getList(-9,10,num_9S10,znum,upGoTimeList);
            getList(-9,-1,num_9X1,znum,upGoTimeList);
            getList(-9,-2,num_9X2,znum,upGoTimeList);
            getList(-9,-3,num_9X3,znum,upGoTimeList);
            getList(-9,-4,num_9X4,znum,upGoTimeList);
            getList(-9,-5,num_9X5,znum,upGoTimeList);
            getList(-9,-6,num_9X6,znum,upGoTimeList);
            getList(-9,-7,num_9X7,znum,upGoTimeList);
            getList(-9,-8,num_9X8,znum,upGoTimeList);
            getList(-9,-9,num_9X9,znum,upGoTimeList);
            getList(-9,-10,num_9X10,znum,upGoTimeList);

            getList(-10,1,num_10S1,znum,upGoTimeList);
            getList(-10,2,num_10S2,znum,upGoTimeList);
            getList(-10,3,num_10S3,znum,upGoTimeList);
            getList(-10,4,num_10S4,znum,upGoTimeList);
            getList(-10,5,num_10S5,znum,upGoTimeList);
            getList(-10,6,num_10S6,znum,upGoTimeList);
            getList(-10,7,num_10S7,znum,upGoTimeList);
            getList(-10,8,num_10S8,znum,upGoTimeList);
            getList(-10,9,num_10S9,znum,upGoTimeList);
            getList(-10,10,num_10S10,znum,upGoTimeList);
            getList(-10,-1,num_10X1,znum,upGoTimeList);
            getList(-10,-2,num_10X2,znum,upGoTimeList);
            getList(-10,-3,num_10X3,znum,upGoTimeList);
            getList(-10,-4,num_10X4,znum,upGoTimeList);
            getList(-10,-5,num_10X5,znum,upGoTimeList);
            getList(-10,-6,num_10X6,znum,upGoTimeList);
            getList(-10,-7,num_10X7,znum,upGoTimeList);
            getList(-10,-8,num_10X8,znum,upGoTimeList);
            getList(-10,-9,num_10X9,znum,upGoTimeList);
            getList(-10,-10,num_10X10,znum,upGoTimeList);
        }

        return false;
    }

    public boolean getList(int up,int uptime,int num,int znum,List<UpGoTime> upGoTimeList){
        UpGoTime upGoTime=new UpGoTime();
        upGoTime.setUp(up);
        upGoTime.setUpTime(uptime);
        upGoTime.setNum(num);
        double ratio=(double) num/(double)znum*100;
        ratio = (double) Math.round(ratio * 100) / 100;
        upGoTime.setRatio(ratio);
        upGoTimeList.add(upGoTime);
        return true;
    }

    public boolean getNum(BigDecimal rateOfChange1, BigDecimal rateOfChange2, BigDecimal rateOfChange3, BigDecimal rateOfChange4, BigDecimal rateOfChange5,
                          BigDecimal rateOfChange6, BigDecimal rateOfChange7, BigDecimal rateOfChange8, BigDecimal rateOfChange9, BigDecimal rateOfChange10,
                          int num1,int num2,int num3,int num4,int num5,int num6,int num7,int num8,int num9,int num10,int num_1,int num_2,int num_3,int num_4,int num_5,int num_6,int num_7,int num_8,int num_9,int num_10){
        if (get10up(rateOfChange1, rateOfChange2, rateOfChange3, rateOfChange4,
                rateOfChange5, rateOfChange6, rateOfChange7, rateOfChange8,
                rateOfChange9, rateOfChange10)) {
            num10++;
        } else if (get9up(rateOfChange1, rateOfChange2, rateOfChange3, rateOfChange4,
                rateOfChange5, rateOfChange6, rateOfChange7, rateOfChange8,
                rateOfChange9)) {
            num9++;
        } else if (get8up(rateOfChange1,rateOfChange2, rateOfChange3, rateOfChange4,
                rateOfChange5, rateOfChange6, rateOfChange7, rateOfChange8)) {
            num8++;
        } else if (get7up(rateOfChange1, rateOfChange2, rateOfChange3, rateOfChange4,
                rateOfChange5, rateOfChange6, rateOfChange7)) {
            num7++;
        } else if (get6up(rateOfChange1, rateOfChange2, rateOfChange3, rateOfChange4,
                rateOfChange5, rateOfChange6)) {
            num6++;
        } else if (get5up(rateOfChange1, rateOfChange2, rateOfChange3, rateOfChange4,
                rateOfChange5)) {
            num5++;
        } else if (get4up(rateOfChange1, rateOfChange2, rateOfChange3, rateOfChange4)) {
            num4++;
        } else if (get3up(rateOfChange1, rateOfChange2, rateOfChange3)) {
            num3++;
        } else if (get2up(rateOfChange1, rateOfChange2)) {
            num2++;
        } else if (rateOfChange1.compareTo(new BigDecimal(0)) > 0) {
            num1++;
        } else if (get10X(rateOfChange1, rateOfChange2, rateOfChange3, rateOfChange4,
                rateOfChange5, rateOfChange6, rateOfChange7, rateOfChange8,
                rateOfChange9, rateOfChange10)) {
            num_10++;
        } else if (get9X(rateOfChange1, rateOfChange2, rateOfChange3, rateOfChange4,
                rateOfChange5, rateOfChange6, rateOfChange7, rateOfChange8,
                rateOfChange9)) {
            num_9++;
        } else if (get8X(rateOfChange1, rateOfChange2, rateOfChange3, rateOfChange4,
                rateOfChange5, rateOfChange6, rateOfChange7, rateOfChange8)) {
            num_8++;
        } else if (get7X(rateOfChange1, rateOfChange2, rateOfChange3, rateOfChange4,
                rateOfChange5, rateOfChange6, rateOfChange7)) {
            num_7++;
        } else if (get6X(rateOfChange1, rateOfChange2, rateOfChange3, rateOfChange4,
                rateOfChange5, rateOfChange6)) {
            num_6++;
        } else if (get5X(rateOfChange1, rateOfChange2, rateOfChange3, rateOfChange4,
                rateOfChange5)) {
            num_5++;
        } else if (get4X(rateOfChange1, rateOfChange2, rateOfChange3, rateOfChange4)) {
            num_4++;
        } else if (get3X(rateOfChange1, rateOfChange2, rateOfChange3)) {
            num_3++;
        } else if (get2X(rateOfChange1, rateOfChange2)) {
            num_2++;
        } else if (rateOfChange1.compareTo(new BigDecimal(0)) < 0) {
            num_1++;
        }
        return true;
    }

    public boolean get10up(BigDecimal rateOfChange1, BigDecimal rateOfChange2, BigDecimal rateOfChange3, BigDecimal rateOfChange4, BigDecimal rateOfChange5, BigDecimal rateOfChange6, BigDecimal rateOfChange7, BigDecimal rateOfChange8, BigDecimal rateOfChange9, BigDecimal rateOfChange10) {
        if (rateOfChange1.compareTo(new BigDecimal(0)) > 0
                && rateOfChange2.compareTo(new BigDecimal(0)) > 0
                && rateOfChange3.compareTo(new BigDecimal(0)) > 0
                && rateOfChange4.compareTo(new BigDecimal(0)) > 0
                && rateOfChange5.compareTo(new BigDecimal(0)) > 0
                && rateOfChange6.compareTo(new BigDecimal(0)) > 0
                && rateOfChange7.compareTo(new BigDecimal(0)) > 0
                && rateOfChange8.compareTo(new BigDecimal(0)) > 0
                && rateOfChange9.compareTo(new BigDecimal(0)) > 0
                && rateOfChange10.compareTo(new BigDecimal(0)) > 0) {
            return true;
        }
        return false;
    }

    public boolean get9up(BigDecimal rateOfChange1, BigDecimal rateOfChange2, BigDecimal rateOfChange3, BigDecimal rateOfChange4, BigDecimal rateOfChange5, BigDecimal rateOfChange6, BigDecimal rateOfChange7, BigDecimal rateOfChange8, BigDecimal rateOfChange9) {
        if (rateOfChange1.compareTo(new BigDecimal(0)) > 0
                && rateOfChange2.compareTo(new BigDecimal(0)) > 0
                && rateOfChange3.compareTo(new BigDecimal(0)) > 0
                && rateOfChange4.compareTo(new BigDecimal(0)) > 0
                && rateOfChange5.compareTo(new BigDecimal(0)) > 0
                && rateOfChange6.compareTo(new BigDecimal(0)) > 0
                && rateOfChange7.compareTo(new BigDecimal(0)) > 0
                && rateOfChange8.compareTo(new BigDecimal(0)) > 0
                && rateOfChange9.compareTo(new BigDecimal(0)) > 0) {
            return true;
        }
        return false;
    }

    public boolean get8up(BigDecimal rateOfChange1, BigDecimal rateOfChange2, BigDecimal rateOfChange3, BigDecimal rateOfChange4, BigDecimal rateOfChange5, BigDecimal rateOfChange6, BigDecimal rateOfChange7, BigDecimal rateOfChange8) {
        if (rateOfChange1.compareTo(new BigDecimal(0)) > 0
                && rateOfChange2.compareTo(new BigDecimal(0)) > 0
                && rateOfChange3.compareTo(new BigDecimal(0)) > 0
                && rateOfChange4.compareTo(new BigDecimal(0)) > 0
                && rateOfChange5.compareTo(new BigDecimal(0)) > 0
                && rateOfChange6.compareTo(new BigDecimal(0)) > 0
                && rateOfChange7.compareTo(new BigDecimal(0)) > 0
                && rateOfChange8.compareTo(new BigDecimal(0)) > 0) {
            return true;
        }
        return false;
    }

    public boolean get7up(BigDecimal rateOfChange1, BigDecimal rateOfChange2, BigDecimal rateOfChange3, BigDecimal rateOfChange4, BigDecimal rateOfChange5, BigDecimal rateOfChange6, BigDecimal rateOfChange7) {
        if (rateOfChange1.compareTo(new BigDecimal(0)) > 0
                && rateOfChange2.compareTo(new BigDecimal(0)) > 0
                && rateOfChange3.compareTo(new BigDecimal(0)) > 0
                && rateOfChange4.compareTo(new BigDecimal(0)) > 0
                && rateOfChange5.compareTo(new BigDecimal(0)) > 0
                && rateOfChange6.compareTo(new BigDecimal(0)) > 0
                && rateOfChange7.compareTo(new BigDecimal(0)) > 0) {
            return true;
        }
        return false;
    }

    public boolean get6up(BigDecimal rateOfChange1, BigDecimal rateOfChange2, BigDecimal rateOfChange3, BigDecimal rateOfChange4, BigDecimal rateOfChange5, BigDecimal rateOfChange6) {
        if (rateOfChange1.compareTo(new BigDecimal(0)) > 0
                && rateOfChange2.compareTo(new BigDecimal(0)) > 0
                && rateOfChange3.compareTo(new BigDecimal(0)) > 0
                && rateOfChange4.compareTo(new BigDecimal(0)) > 0
                && rateOfChange5.compareTo(new BigDecimal(0)) > 0
                && rateOfChange6.compareTo(new BigDecimal(0)) > 0) {
            return true;
        }
        return false;
    }

    public boolean get5up(BigDecimal rateOfChange1, BigDecimal rateOfChange2, BigDecimal rateOfChange3, BigDecimal rateOfChange4, BigDecimal rateOfChange5) {
        if (rateOfChange1.compareTo(new BigDecimal(0)) > 0
                && rateOfChange2.compareTo(new BigDecimal(0)) > 0
                && rateOfChange3.compareTo(new BigDecimal(0)) > 0
                && rateOfChange4.compareTo(new BigDecimal(0)) > 0
                && rateOfChange5.compareTo(new BigDecimal(0)) > 0) {
            return true;
        }
        return false;
    }

    public boolean get4up(BigDecimal rateOfChange1, BigDecimal rateOfChange2, BigDecimal rateOfChange3, BigDecimal rateOfChange4) {
        if (rateOfChange1.compareTo(new BigDecimal(0)) > 0
                && rateOfChange2.compareTo(new BigDecimal(0)) > 0
                && rateOfChange3.compareTo(new BigDecimal(0)) > 0
                && rateOfChange4.compareTo(new BigDecimal(0)) > 0) {
            return true;
        }
        return false;
    }

    public boolean get3up(BigDecimal rateOfChange1, BigDecimal rateOfChange2, BigDecimal rateOfChange3) {
        if (rateOfChange1.compareTo(new BigDecimal(0)) > 0
                && rateOfChange2.compareTo(new BigDecimal(0)) > 0
                && rateOfChange3.compareTo(new BigDecimal(0)) > 0) {
            return true;
        }
        return false;
    }

    public boolean get2up(BigDecimal rateOfChange1, BigDecimal rateOfChange2) {
        if (rateOfChange1.compareTo(new BigDecimal(0)) > 0
                && rateOfChange2.compareTo(new BigDecimal(0)) > 0) {
            return true;
        }
        return false;
    }

    public boolean get10X(BigDecimal rateOfChange1, BigDecimal rateOfChange2, BigDecimal rateOfChange3, BigDecimal rateOfChange4, BigDecimal rateOfChange5, BigDecimal rateOfChange6, BigDecimal rateOfChange7, BigDecimal rateOfChange8, BigDecimal rateOfChange9, BigDecimal rateOfChange10) {
        if (rateOfChange1.compareTo(new BigDecimal(0)) < 0
                && rateOfChange2.compareTo(new BigDecimal(0)) < 0
                && rateOfChange3.compareTo(new BigDecimal(0)) < 0
                && rateOfChange4.compareTo(new BigDecimal(0)) < 0
                && rateOfChange5.compareTo(new BigDecimal(0)) < 0
                && rateOfChange6.compareTo(new BigDecimal(0)) < 0
                && rateOfChange7.compareTo(new BigDecimal(0)) < 0
                && rateOfChange8.compareTo(new BigDecimal(0)) < 0
                && rateOfChange9.compareTo(new BigDecimal(0)) < 0
                && rateOfChange10.compareTo(new BigDecimal(0)) < 0) {
            return true;
        }
        return false;
    }

    public boolean get9X(BigDecimal rateOfChange1, BigDecimal rateOfChange2, BigDecimal rateOfChange3, BigDecimal rateOfChange4, BigDecimal rateOfChange5, BigDecimal rateOfChange6, BigDecimal rateOfChange7, BigDecimal rateOfChange8, BigDecimal rateOfChange9) {
        if (rateOfChange1.compareTo(new BigDecimal(0)) < 0
                && rateOfChange2.compareTo(new BigDecimal(0)) < 0
                && rateOfChange3.compareTo(new BigDecimal(0)) < 0
                && rateOfChange4.compareTo(new BigDecimal(0)) < 0
                && rateOfChange5.compareTo(new BigDecimal(0)) < 0
                && rateOfChange6.compareTo(new BigDecimal(0)) < 0
                && rateOfChange7.compareTo(new BigDecimal(0)) < 0
                && rateOfChange8.compareTo(new BigDecimal(0)) < 0
                && rateOfChange9.compareTo(new BigDecimal(0)) < 0) {
            return true;
        }
        return false;
    }

    public boolean get8X(BigDecimal rateOfChange1, BigDecimal rateOfChange2, BigDecimal rateOfChange3, BigDecimal rateOfChange4, BigDecimal rateOfChange5, BigDecimal rateOfChange6, BigDecimal rateOfChange7, BigDecimal rateOfChange8) {
        if (rateOfChange1.compareTo(new BigDecimal(0)) < 0
                && rateOfChange2.compareTo(new BigDecimal(0)) < 0
                && rateOfChange3.compareTo(new BigDecimal(0)) < 0
                && rateOfChange4.compareTo(new BigDecimal(0)) < 0
                && rateOfChange5.compareTo(new BigDecimal(0)) < 0
                && rateOfChange6.compareTo(new BigDecimal(0)) < 0
                && rateOfChange7.compareTo(new BigDecimal(0)) < 0
                && rateOfChange8.compareTo(new BigDecimal(0)) < 0) {
            return true;
        }
        return false;
    }

    public boolean get7X(BigDecimal rateOfChange1, BigDecimal rateOfChange2, BigDecimal rateOfChange3, BigDecimal rateOfChange4, BigDecimal rateOfChange5, BigDecimal rateOfChange6, BigDecimal rateOfChange7) {
        if (rateOfChange1.compareTo(new BigDecimal(0)) < 0
                && rateOfChange2.compareTo(new BigDecimal(0)) < 0
                && rateOfChange3.compareTo(new BigDecimal(0)) < 0
                && rateOfChange4.compareTo(new BigDecimal(0)) < 0
                && rateOfChange5.compareTo(new BigDecimal(0)) < 0
                && rateOfChange6.compareTo(new BigDecimal(0)) < 0
                && rateOfChange7.compareTo(new BigDecimal(0)) < 0) {
            return true;
        }
        return false;
    }

    public boolean get6X(BigDecimal rateOfChange1, BigDecimal rateOfChange2, BigDecimal rateOfChange3, BigDecimal rateOfChange4, BigDecimal rateOfChange5, BigDecimal rateOfChange6) {
        if (rateOfChange1.compareTo(new BigDecimal(0)) < 0
                && rateOfChange2.compareTo(new BigDecimal(0)) < 0
                && rateOfChange3.compareTo(new BigDecimal(0)) < 0
                && rateOfChange4.compareTo(new BigDecimal(0)) < 0
                && rateOfChange5.compareTo(new BigDecimal(0)) < 0
                && rateOfChange6.compareTo(new BigDecimal(0)) < 0) {
            return true;
        }
        return false;
    }

    public boolean get5X(BigDecimal rateOfChange1, BigDecimal rateOfChange2, BigDecimal rateOfChange3, BigDecimal rateOfChange4, BigDecimal rateOfChange5) {
        if (rateOfChange1.compareTo(new BigDecimal(0)) < 0
                && rateOfChange2.compareTo(new BigDecimal(0)) < 0
                && rateOfChange3.compareTo(new BigDecimal(0)) < 0
                && rateOfChange4.compareTo(new BigDecimal(0)) < 0
                && rateOfChange5.compareTo(new BigDecimal(0)) < 0) {
            return true;
        }
        return false;
    }

    public boolean get4X(BigDecimal rateOfChange1, BigDecimal rateOfChange2, BigDecimal rateOfChange3, BigDecimal rateOfChange4) {
        if (rateOfChange1.compareTo(new BigDecimal(0)) < 0
                && rateOfChange2.compareTo(new BigDecimal(0)) < 0
                && rateOfChange3.compareTo(new BigDecimal(0)) < 0
                && rateOfChange4.compareTo(new BigDecimal(0)) < 0) {
            return true;
        }
        return false;
    }

    public boolean get3X(BigDecimal rateOfChange1, BigDecimal rateOfChange2, BigDecimal rateOfChange3) {
        if (rateOfChange1.compareTo(new BigDecimal(0)) < 0
                && rateOfChange2.compareTo(new BigDecimal(0)) < 0
                && rateOfChange3.compareTo(new BigDecimal(0)) < 0) {
            return true;
        }
        return false;
    }

    public boolean get2X(BigDecimal rateOfChange1, BigDecimal rateOfChange2) {
        if (rateOfChange1.compareTo(new BigDecimal(0)) < 0
                && rateOfChange2.compareTo(new BigDecimal(0)) < 0) {
            return true;
        }
        return false;
    }

}
