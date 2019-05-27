package com.stock.stockday.util;


import com.stock.stockday.entity.StockDayYanPan24;
import com.stock.stockday.entity.StockDayYanPan33;
import com.stock.stockday.entity.StockDayYanPan42;
import com.stock.stockday.entity.StockDayYanPanBenpan;
import com.stock.stockday.vo.StockDayVo;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

import static com.stock.stockday.util.GetEntity.get24entity;
import static com.stock.stockday.util.GetEntity.get33entity;
import static com.stock.stockday.util.GetEntity.get42entity;
import static com.stock.stockday.util.GetEntity.getBenpanentity;


public class GetYuCeZhuHeListUtil {

    public static List<StockDayVo> get24List(StockDayYanPan24 stockDayYanPan24, StockDayVo stockDayVo, List<StockDayVo> stockDayVoList) throws IOException {
        StringBuffer strPath = new StringBuffer();
        String strFileName;
        strPath.append("D:/stock-day/day-yan-pan-24/");
        strFileName = GetFileName.getFileName24(stockDayYanPan24);
        File file = new File(strPath.toString() + strFileName + ".txt");
        if (!file.exists()) {

        } else {
            StockDayYanPan24 stockDayYanPan241 = get24entity(strPath.toString() + strFileName);
            if ((stockDayYanPan241.getShangZhangCount2().compareTo(new BigDecimal(35)) > 0 && stockDayYanPan241.getShangZhangMa2().compareTo(new BigDecimal(2)) > 0 && stockDayYanPan241.getShangZhangRate2().compareTo(new BigDecimal(70)) >= 0 &&
                    stockDayYanPan241.getShangZhangMa3().compareTo(stockDayYanPan241.getShangZhangMa2()) > 0 && stockDayYanPan241.getShangZhangRate3().compareTo(new BigDecimal(60)) > 0 &&
                    stockDayYanPan241.getShangZhangMa2().compareTo(stockDayYanPan241.getShangZhangMa1()) > 0 ) ||
                    (stockDayYanPan241.getShangZhangRate2().compareTo(new BigDecimal(65)) >= 0 &&stockDayYanPan241.getShangZhangCount2().compareTo(new BigDecimal(35)) > 0 && stockDayYanPan241.getShangZhangMa3().compareTo(stockDayYanPan241.getShangZhangMa2()) > 0 &&
                            (stockDayYanPan241.getShangZhangMa2().multiply(stockDayYanPan241.getShangZhangRate2()).subtract(stockDayYanPan241.getXiaJiangMa2().multiply(stockDayYanPan241.getXiaJiangRate2()))).compareTo(new BigDecimal(200)) >= 0)) {
                stockDayVo.setShangZhangMa1(stockDayYanPan241.getShangZhangMa1().toString());
                stockDayVo.setShangZhangRate1(stockDayYanPan241.getShangZhangRate1().toString());
                stockDayVo.setShangZhangMa2(stockDayYanPan241.getShangZhangMa2().toString());
                stockDayVo.setShangZhangRate2(stockDayYanPan241.getShangZhangRate2().toString());
                stockDayVo.setShangZhangMa3(stockDayYanPan241.getShangZhangMa3().toString());
                stockDayVo.setShangZhangRate3(stockDayYanPan241.getShangZhangRate3().toString());
                stockDayVo.setShangZhangMa5(stockDayYanPan241.getShangZhangMa5().toString());
                stockDayVo.setShangZhangRate5(stockDayYanPan241.getShangZhangRate5().toString());
                stockDayVo.setShangZhangMa8(stockDayYanPan241.getShangZhangMa8().toString());
                stockDayVo.setShangZhangRate8(stockDayYanPan241.getShangZhangRate8().toString());
                stockDayVo.setShangZhangMa13(stockDayYanPan241.getShangZhangMa13().toString());
                stockDayVo.setShangZhangRate13(stockDayYanPan241.getShangZhangRate13().toString());
                stockDayVo.setShangZhangMa20(stockDayYanPan241.getShangZhangMa20().toString());
                stockDayVo.setShangZhangRate20(stockDayYanPan241.getShangZhangRate20().toString());
                stockDayVo.setChangeOf2((stockDayYanPan241.getShangZhangMa2().multiply(stockDayYanPan241.getShangZhangRate2()).subtract(stockDayYanPan241.getXiaJiangMa2().multiply(stockDayYanPan241.getXiaJiangRate2()))).toString());
                stockDayVoList.add(stockDayVo);
            }
        }
        return stockDayVoList;
    }

    public static List<StockDayVo> get33List(StockDayYanPan33 stockDayYanPan33, StockDayVo stockDayVo, List<StockDayVo> stockDayVoList) throws IOException {
        StringBuffer strPath = new StringBuffer();
        String strFileName;
        strPath.append("D:/stock-day/day-yan-pan-33/");
        strFileName = GetFileName.getFileName33(stockDayYanPan33);
        File file = new File(strPath.toString() + strFileName + ".txt");
        if (!file.exists()) {

        } else {
            StockDayYanPan33 stockDayYanPan331 = get33entity(strPath.toString() + strFileName);
            if ((stockDayYanPan331.getShangZhangCount2().compareTo(new BigDecimal(50)) > 0 && stockDayYanPan331.getShangZhangMa2().compareTo(new BigDecimal(2)) > 0 && stockDayYanPan331.getShangZhangRate2().compareTo(new BigDecimal(70)) >= 0 &&
                    stockDayYanPan331.getShangZhangMa3().compareTo(stockDayYanPan331.getShangZhangMa2()) > 0 && stockDayYanPan331.getShangZhangRate3().compareTo(new BigDecimal(60)) > 0 &&
                    stockDayYanPan331.getShangZhangMa2().compareTo(stockDayYanPan331.getShangZhangMa1()) > 0 ) ||
                    (stockDayYanPan331.getShangZhangRate2().compareTo(new BigDecimal(65)) >= 0 &&stockDayYanPan331.getShangZhangCount2().compareTo(new BigDecimal(50)) > 0 && stockDayYanPan331.getShangZhangMa3().compareTo(stockDayYanPan331.getShangZhangMa2()) > 0 &&
                            (stockDayYanPan331.getShangZhangMa2().multiply(stockDayYanPan331.getShangZhangRate2()).subtract(stockDayYanPan331.getXiaJiangMa2().multiply(stockDayYanPan331.getXiaJiangRate2()))).compareTo(new BigDecimal(200)) >= 0)) {
                stockDayVo.setShangZhangMa1(stockDayYanPan331.getShangZhangMa1().toString());
                stockDayVo.setShangZhangRate1(stockDayYanPan331.getShangZhangRate1().toString());
                stockDayVo.setShangZhangMa2(stockDayYanPan331.getShangZhangMa2().toString());
                stockDayVo.setShangZhangRate2(stockDayYanPan331.getShangZhangRate2().toString());
                stockDayVo.setShangZhangMa3(stockDayYanPan331.getShangZhangMa3().toString());
                stockDayVo.setShangZhangRate3(stockDayYanPan331.getShangZhangRate3().toString());
                stockDayVo.setShangZhangMa5(stockDayYanPan331.getShangZhangMa5().toString());
                stockDayVo.setShangZhangRate5(stockDayYanPan331.getShangZhangRate5().toString());
                stockDayVo.setShangZhangMa8(stockDayYanPan331.getShangZhangMa8().toString());
                stockDayVo.setShangZhangRate8(stockDayYanPan331.getShangZhangRate8().toString());
                stockDayVo.setShangZhangMa13(stockDayYanPan331.getShangZhangMa13().toString());
                stockDayVo.setShangZhangRate13(stockDayYanPan331.getShangZhangRate13().toString());
                stockDayVo.setShangZhangMa20(stockDayYanPan331.getShangZhangMa20().toString());
                stockDayVo.setShangZhangRate20(stockDayYanPan331.getShangZhangRate20().toString());
                stockDayVo.setChangeOf2((stockDayYanPan331.getShangZhangMa2().multiply(stockDayYanPan331.getShangZhangRate2()).subtract(stockDayYanPan331.getXiaJiangMa2().multiply(stockDayYanPan331.getXiaJiangRate2()))).toString());
                stockDayVoList.add(stockDayVo);
            }
        }
        return stockDayVoList;
    }

    public static List<StockDayVo> get42List(StockDayYanPan42 stockDayYanPan42, StockDayVo stockDayVo, List<StockDayVo> stockDayVoList) throws IOException {
        StringBuffer strPath = new StringBuffer();
        String strFileName;
        strPath.append("D:/stock-day/day-yan-pan-42/");
        strFileName = GetFileName.getFileName42(stockDayYanPan42);
        File file = new File(strPath.toString() + strFileName + ".txt");
        if (!file.exists()) {

        } else {
            StockDayYanPan42 stockDayYanPan421 = get42entity(strPath.toString() + strFileName);
            if ((stockDayYanPan421.getShangZhangCount2().compareTo(new BigDecimal(80)) > 0 && stockDayYanPan421.getShangZhangMa2().compareTo(new BigDecimal(2)) > 0 && stockDayYanPan421.getShangZhangRate2().compareTo(new BigDecimal(70)) >= 0 &&
                    stockDayYanPan421.getShangZhangMa3().compareTo(stockDayYanPan421.getShangZhangMa2()) > 0 && stockDayYanPan421.getShangZhangRate3().compareTo(new BigDecimal(60)) > 0 &&
                    stockDayYanPan421.getShangZhangMa2().compareTo(stockDayYanPan421.getShangZhangMa1()) > 0 ) ||
                    (stockDayYanPan421.getShangZhangRate2().compareTo(new BigDecimal(65)) >= 0 &&stockDayYanPan421.getShangZhangCount2().compareTo(new BigDecimal(80)) > 0 && stockDayYanPan421.getShangZhangMa3().compareTo(stockDayYanPan421.getShangZhangMa2()) > 0 &&
                            (stockDayYanPan421.getShangZhangMa2().multiply(stockDayYanPan421.getShangZhangRate2()).subtract(stockDayYanPan421.getXiaJiangMa2().multiply(stockDayYanPan421.getXiaJiangRate2()))).compareTo(new BigDecimal(200)) >= 0)) {
                stockDayVo.setShangZhangMa1(stockDayYanPan421.getShangZhangMa1().toString());
                stockDayVo.setShangZhangRate1(stockDayYanPan421.getShangZhangRate1().toString());
                stockDayVo.setShangZhangMa2(stockDayYanPan421.getShangZhangMa2().toString());
                stockDayVo.setShangZhangRate2(stockDayYanPan421.getShangZhangRate2().toString());
                stockDayVo.setShangZhangMa3(stockDayYanPan421.getShangZhangMa3().toString());
                stockDayVo.setShangZhangRate3(stockDayYanPan421.getShangZhangRate3().toString());
                stockDayVo.setShangZhangMa5(stockDayYanPan421.getShangZhangMa5().toString());
                stockDayVo.setShangZhangRate5(stockDayYanPan421.getShangZhangRate5().toString());
                stockDayVo.setShangZhangMa8(stockDayYanPan421.getShangZhangMa8().toString());
                stockDayVo.setShangZhangRate8(stockDayYanPan421.getShangZhangRate8().toString());
                stockDayVo.setShangZhangMa13(stockDayYanPan421.getShangZhangMa13().toString());
                stockDayVo.setShangZhangRate13(stockDayYanPan421.getShangZhangRate13().toString());
                stockDayVo.setShangZhangMa20(stockDayYanPan421.getShangZhangMa20().toString());
                stockDayVo.setShangZhangRate20(stockDayYanPan421.getShangZhangRate20().toString());
                stockDayVo.setChangeOf2((stockDayYanPan421.getShangZhangMa2().multiply(stockDayYanPan421.getShangZhangRate2()).subtract(stockDayYanPan421.getXiaJiangMa2().multiply(stockDayYanPan421.getXiaJiangRate2()))).toString());
                stockDayVoList.add(stockDayVo);
            }
        }
        return stockDayVoList;
    }

    public static List<StockDayVo> getBenPanList(StockDayYanPanBenpan stockDayYanPanBenpan, StockDayVo stockDayVo, List<StockDayVo> stockDayVoList) throws IOException {
        StringBuffer strPath = new StringBuffer();
        String strFileName;
        strPath.append("D:/stock-day/day-yan-pan-benpan/");
        strFileName = GetFileName.getFileNameBp(stockDayYanPanBenpan);
        File file = new File(strPath.toString() + strFileName + ".txt");
        if (!file.exists()) {

        } else {
            StockDayYanPanBenpan stockDayYanPanBenpan1 = getBenpanentity(strPath.toString() + strFileName);
            if ((stockDayYanPanBenpan1.getShangZhangCount2().compareTo(new BigDecimal(50)) > 0 && stockDayYanPanBenpan1.getShangZhangMa2().compareTo(new BigDecimal(2)) > 0 && stockDayYanPanBenpan1.getShangZhangRate2().compareTo(new BigDecimal(70)) >= 0 &&
                    stockDayYanPanBenpan1.getShangZhangMa3().compareTo(stockDayYanPanBenpan1.getShangZhangMa2()) > 0 && stockDayYanPanBenpan1.getShangZhangRate3().compareTo(new BigDecimal(60)) > 0 &&
                    stockDayYanPanBenpan1.getShangZhangMa2().compareTo(stockDayYanPanBenpan1.getShangZhangMa1()) > 0 ) ||
                    (stockDayYanPanBenpan1.getShangZhangRate2().compareTo(new BigDecimal(65)) >= 0 &&stockDayYanPanBenpan1.getShangZhangCount2().compareTo(new BigDecimal(50)) > 0 && stockDayYanPanBenpan1.getShangZhangMa3().compareTo(stockDayYanPanBenpan1.getShangZhangMa2()) > 0 &&
                            (stockDayYanPanBenpan1.getShangZhangMa2().multiply(stockDayYanPanBenpan1.getShangZhangRate2()).subtract(stockDayYanPanBenpan1.getXiaJiangMa2().multiply(stockDayYanPanBenpan1.getXiaJiangRate2()))).compareTo(new BigDecimal(200)) >= 0)) {
                stockDayVo.setShangZhangMa1(stockDayYanPanBenpan1.getShangZhangMa1().toString());
                stockDayVo.setShangZhangRate1(stockDayYanPanBenpan1.getShangZhangRate1().toString());
                stockDayVo.setShangZhangMa2(stockDayYanPanBenpan1.getShangZhangMa2().toString());
                stockDayVo.setShangZhangRate2(stockDayYanPanBenpan1.getShangZhangRate2().toString());
                stockDayVo.setShangZhangMa3(stockDayYanPanBenpan1.getShangZhangMa3().toString());
                stockDayVo.setShangZhangRate3(stockDayYanPanBenpan1.getShangZhangRate3().toString());
                stockDayVo.setShangZhangMa5(stockDayYanPanBenpan1.getShangZhangMa5().toString());
                stockDayVo.setShangZhangRate5(stockDayYanPanBenpan1.getShangZhangRate5().toString());
                stockDayVo.setShangZhangMa8(stockDayYanPanBenpan1.getShangZhangMa8().toString());
                stockDayVo.setShangZhangRate8(stockDayYanPanBenpan1.getShangZhangRate8().toString());
                stockDayVo.setShangZhangMa13(stockDayYanPanBenpan1.getShangZhangMa13().toString());
                stockDayVo.setShangZhangRate13(stockDayYanPanBenpan1.getShangZhangRate13().toString());
                stockDayVo.setShangZhangMa20(stockDayYanPanBenpan1.getShangZhangMa20().toString());
                stockDayVo.setShangZhangRate20(stockDayYanPanBenpan1.getShangZhangRate20().toString());
                stockDayVo.setChangeOf2((stockDayYanPanBenpan1.getShangZhangMa2().multiply(stockDayYanPanBenpan1.getShangZhangRate2()).subtract(stockDayYanPanBenpan1.getXiaJiangMa2().multiply(stockDayYanPanBenpan1.getXiaJiangRate2()))).toString());
                stockDayVoList.add(stockDayVo);
            }
        }
        return stockDayVoList;
    }

}
