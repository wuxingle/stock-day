package com.stock.stockday.util;

import com.stock.apicommon.vo.YanPanVo;
import com.stock.stockday.entity.StockDayYanPan;
import com.stock.stockday.entity.StockDayYanPan42;
import org.springframework.beans.BeanUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

import static com.stock.stockday.util.GetEntity.get42entity;
import static com.stock.stockday.util.GetFileName.getFileName42;
import static com.stock.stockday.util.GetString.get42String;

public class YanPan42SaveFileUtil {

    public static void yanPan42SaveFile(YanPanVo yanPanVo, StockDayYanPan stockDayYanPan) throws IOException {
        StringBuffer strPath = new StringBuffer();
        String strFileName;
        StockDayYanPan42 stockDayYanPan42=new StockDayYanPan42();
        BeanUtils.copyProperties(stockDayYanPan, stockDayYanPan42);
        strPath.setLength(0);
        strPath.append("D:/stock-day/day-yan-pan-42/");
        strFileName = getFileName42(stockDayYanPan42);
        File file4 = new File(strPath.toString() + strFileName + ".txt");
        if (!file4.exists()) {
            if (yanPanVo.getWeiLaiChange1().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPan42.setShangZhangCount1(new BigDecimal(1));
                stockDayYanPan42.setShangZhangMa1(yanPanVo.getWeiLaiChange1());
                stockDayYanPan42.setShangZhangSum1(yanPanVo.getWeiLaiChange1());
                stockDayYanPan42.setShangZhangRate1(new BigDecimal(50));
            } else {
                stockDayYanPan42.setXiaJiangCount1(new BigDecimal(1));
                stockDayYanPan42.setXiaJiangMa1(yanPanVo.getWeiLaiChange1());
                stockDayYanPan42.setXiaJiangSum1(yanPanVo.getWeiLaiChange1());
                stockDayYanPan42.setXiaJiangRate1(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange2().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPan42.setShangZhangCount2(new BigDecimal(1));
                stockDayYanPan42.setShangZhangMa2(yanPanVo.getWeiLaiChange2());
                stockDayYanPan42.setShangZhangSum2(yanPanVo.getWeiLaiChange2());
                stockDayYanPan42.setShangZhangRate2(new BigDecimal(50));
            } else {
                stockDayYanPan42.setXiaJiangCount2(new BigDecimal(1));
                stockDayYanPan42.setXiaJiangMa2(yanPanVo.getWeiLaiChange2());
                stockDayYanPan42.setXiaJiangSum2(yanPanVo.getWeiLaiChange2());
                stockDayYanPan42.setXiaJiangRate2(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange3().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPan42.setShangZhangCount3(new BigDecimal(1));
                stockDayYanPan42.setShangZhangMa3(yanPanVo.getWeiLaiChange3());
                stockDayYanPan42.setShangZhangSum3(yanPanVo.getWeiLaiChange3());
                stockDayYanPan42.setShangZhangRate3(new BigDecimal(50));
            } else {
                stockDayYanPan42.setXiaJiangCount3(new BigDecimal(1));
                stockDayYanPan42.setXiaJiangMa3(yanPanVo.getWeiLaiChange3());
                stockDayYanPan42.setXiaJiangSum3(yanPanVo.getWeiLaiChange3());
                stockDayYanPan42.setXiaJiangRate3(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange5().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPan42.setShangZhangCount5(new BigDecimal(1));
                stockDayYanPan42.setShangZhangMa5(yanPanVo.getWeiLaiChange5());
                stockDayYanPan42.setShangZhangSum5(yanPanVo.getWeiLaiChange5());
                stockDayYanPan42.setShangZhangRate5(new BigDecimal(50));
            } else {
                stockDayYanPan42.setXiaJiangCount5(new BigDecimal(1));
                stockDayYanPan42.setXiaJiangMa5(yanPanVo.getWeiLaiChange5());
                stockDayYanPan42.setXiaJiangSum5(yanPanVo.getWeiLaiChange5());
                stockDayYanPan42.setXiaJiangRate5(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange8().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPan42.setShangZhangCount8(new BigDecimal(1));
                stockDayYanPan42.setShangZhangMa8(yanPanVo.getWeiLaiChange8());
                stockDayYanPan42.setShangZhangSum8(yanPanVo.getWeiLaiChange8());
                stockDayYanPan42.setShangZhangRate8(new BigDecimal(50));
            } else {
                stockDayYanPan42.setXiaJiangCount8(new BigDecimal(1));
                stockDayYanPan42.setXiaJiangMa8(yanPanVo.getWeiLaiChange8());
                stockDayYanPan42.setXiaJiangSum8(yanPanVo.getWeiLaiChange8());
                stockDayYanPan42.setXiaJiangRate8(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange13().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPan42.setShangZhangCount13(new BigDecimal(1));
                stockDayYanPan42.setShangZhangMa13(yanPanVo.getWeiLaiChange13());
                stockDayYanPan42.setShangZhangSum13(yanPanVo.getWeiLaiChange8());
                stockDayYanPan42.setShangZhangRate13(new BigDecimal(50));
            } else {
                stockDayYanPan42.setXiaJiangCount13(new BigDecimal(1));
                stockDayYanPan42.setXiaJiangMa13(yanPanVo.getWeiLaiChange13());
                stockDayYanPan42.setXiaJiangSum13(yanPanVo.getWeiLaiChange13());
                stockDayYanPan42.setXiaJiangRate13(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange20().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPan42.setShangZhangCount20(new BigDecimal(1));
                stockDayYanPan42.setShangZhangMa20(yanPanVo.getWeiLaiChange20());
                stockDayYanPan42.setShangZhangSum20(yanPanVo.getWeiLaiChange20());
                stockDayYanPan42.setShangZhangRate20(new BigDecimal(100));
            } else {
                stockDayYanPan42.setXiaJiangCount20(new BigDecimal(1));
                stockDayYanPan42.setXiaJiangMa20(yanPanVo.getWeiLaiChange20());
                stockDayYanPan42.setXiaJiangSum20(yanPanVo.getWeiLaiChange20());
                stockDayYanPan42.setXiaJiangRate20(new BigDecimal(100));
            }
            String neirong = get42String(stockDayYanPan42);
            FileOutputStream fs = new FileOutputStream(strPath.toString() + strFileName + ".txt");
            byte[] buffer = neirong.getBytes();
            int byteread = buffer.length;
            //插入
            fs.write(buffer, 0, byteread);
            fs.flush();
            fs.close();
        } else {
            StockDayYanPan42 stockDayYanPan421=get42entity(strPath.toString() + strFileName);
            BeanUtils.copyProperties(stockDayYanPan421,stockDayYanPan42);
            if (yanPanVo.getWeiLaiChange1().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPan421.getShangZhangCount1().add(new BigDecimal(1));
                stockDayYanPan42.setShangZhangCount1(count);
                BigDecimal sum = stockDayYanPan421.getShangZhangSum1().add(yanPanVo.getWeiLaiChange1());
                stockDayYanPan42.setShangZhangSum1(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPan42.setShangZhangMa1(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPan421.getXiaJiangCount1())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPan42.setShangZhangRate1(rate);
            } else {
                BigDecimal count = stockDayYanPan421.getXiaJiangCount1().add(new BigDecimal(1));
                stockDayYanPan42.setXiaJiangCount1(count);
                BigDecimal sum = stockDayYanPan421.getXiaJiangSum1().add(yanPanVo.getWeiLaiChange1());
                stockDayYanPan42.setXiaJiangSum1(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPan42.setXiaJiangMa1(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPan421.getShangZhangCount1())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPan42.setXiaJiangRate1(rate);
            }
            if (yanPanVo.getWeiLaiChange2().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPan421.getShangZhangCount2().add(new BigDecimal(1));
                stockDayYanPan42.setShangZhangCount2(count);
                BigDecimal sum = stockDayYanPan421.getShangZhangSum2().add(yanPanVo.getWeiLaiChange2());
                stockDayYanPan42.setShangZhangSum2(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPan42.setShangZhangMa2(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPan421.getXiaJiangCount2())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPan42.setShangZhangRate2(rate);
            } else {
                BigDecimal count = stockDayYanPan421.getXiaJiangCount2().add(new BigDecimal(1));
                stockDayYanPan42.setXiaJiangCount2(count);
                BigDecimal sum = stockDayYanPan421.getXiaJiangSum2().add(yanPanVo.getWeiLaiChange2());
                stockDayYanPan42.setXiaJiangSum2(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPan42.setXiaJiangMa2(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPan421.getShangZhangCount2())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPan42.setXiaJiangRate2(rate);
            }
            if (yanPanVo.getWeiLaiChange3().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPan421.getShangZhangCount3().add(new BigDecimal(1));
                stockDayYanPan42.setShangZhangCount3(count);
                BigDecimal sum = stockDayYanPan421.getShangZhangSum3().add(yanPanVo.getWeiLaiChange3());
                stockDayYanPan42.setShangZhangSum3(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPan42.setShangZhangMa3(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPan421.getXiaJiangCount3())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPan42.setShangZhangRate3(rate);
            } else {
                BigDecimal count = stockDayYanPan421.getXiaJiangCount3().add(new BigDecimal(1));
                stockDayYanPan42.setXiaJiangCount3(count);
                BigDecimal sum = stockDayYanPan421.getXiaJiangSum3().add(yanPanVo.getWeiLaiChange3());
                stockDayYanPan42.setXiaJiangSum3(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPan42.setXiaJiangMa3(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPan421.getShangZhangCount3())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPan42.setXiaJiangRate3(rate);
            }
            if (yanPanVo.getWeiLaiChange5().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPan421.getShangZhangCount5().add(new BigDecimal(1));
                stockDayYanPan42.setShangZhangCount5(count);
                BigDecimal sum = stockDayYanPan421.getShangZhangSum5().add(yanPanVo.getWeiLaiChange5());
                stockDayYanPan42.setShangZhangSum5(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPan42.setShangZhangMa5(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPan421.getXiaJiangCount5())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPan42.setShangZhangRate5(rate);
            } else {
                BigDecimal count = stockDayYanPan421.getXiaJiangCount5().add(new BigDecimal(1));
                stockDayYanPan42.setXiaJiangCount5(count);
                BigDecimal sum = stockDayYanPan421.getXiaJiangSum5().add(yanPanVo.getWeiLaiChange5());
                stockDayYanPan42.setXiaJiangSum5(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPan42.setXiaJiangMa5(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPan421.getShangZhangCount5())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPan42.setXiaJiangRate5(rate);
            }
            if (yanPanVo.getWeiLaiChange8().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPan421.getShangZhangCount8().add(new BigDecimal(1));
                stockDayYanPan42.setShangZhangCount8(count);
                BigDecimal sum = stockDayYanPan421.getShangZhangSum8().add(yanPanVo.getWeiLaiChange8());
                stockDayYanPan42.setShangZhangSum8(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPan42.setShangZhangMa8(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPan421.getXiaJiangCount8())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPan42.setShangZhangRate8(rate);
            } else {
                BigDecimal count = stockDayYanPan421.getXiaJiangCount8().add(new BigDecimal(1));
                stockDayYanPan42.setXiaJiangCount8(count);
                BigDecimal sum = stockDayYanPan421.getXiaJiangSum8().add(yanPanVo.getWeiLaiChange8());
                stockDayYanPan42.setXiaJiangSum8(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPan42.setXiaJiangMa8(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPan421.getShangZhangCount8())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPan42.setXiaJiangRate8(rate);
            }
            if (yanPanVo.getWeiLaiChange13().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPan421.getShangZhangCount13().add(new BigDecimal(1));
                stockDayYanPan42.setShangZhangCount13(count);
                BigDecimal sum = stockDayYanPan421.getShangZhangSum13().add(yanPanVo.getWeiLaiChange13());
                stockDayYanPan42.setShangZhangSum13(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPan42.setShangZhangMa13(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPan421.getXiaJiangCount13())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPan42.setShangZhangRate13(rate);
            } else {
                BigDecimal count = stockDayYanPan421.getXiaJiangCount13().add(new BigDecimal(1));
                stockDayYanPan42.setXiaJiangCount13(count);
                BigDecimal sum = stockDayYanPan421.getXiaJiangSum13().add(yanPanVo.getWeiLaiChange13());
                stockDayYanPan42.setXiaJiangSum13(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPan42.setXiaJiangMa13(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPan421.getShangZhangCount13())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPan42.setXiaJiangRate13(rate);
            }
            if (yanPanVo.getWeiLaiChange20().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPan421.getShangZhangCount20().add(new BigDecimal(1));
                stockDayYanPan42.setShangZhangCount20(count);
                BigDecimal sum = stockDayYanPan421.getShangZhangSum20().add(yanPanVo.getWeiLaiChange20());
                stockDayYanPan42.setShangZhangSum20(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPan42.setShangZhangMa20(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPan421.getXiaJiangCount20())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPan42.setShangZhangRate20(rate);
            } else {
                BigDecimal count = stockDayYanPan421.getXiaJiangCount20().add(new BigDecimal(1));
                stockDayYanPan42.setXiaJiangCount20(count);
                BigDecimal sum = stockDayYanPan421.getXiaJiangSum20().add(yanPanVo.getWeiLaiChange20());
                stockDayYanPan42.setXiaJiangSum20(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPan42.setXiaJiangMa20(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPan421.getShangZhangCount20())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPan42.setXiaJiangRate20(rate);
            }
            String neirong = get42String(stockDayYanPan42);
            FileOutputStream fs = new FileOutputStream(strPath.toString() + strFileName + ".txt");
            byte[] buffer = neirong.getBytes();
            int byteread = buffer.length;
            //插入
            fs.write(buffer, 0, byteread);
            fs.flush();
            fs.close();
        }
    }
}
