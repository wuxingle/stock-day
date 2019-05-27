package com.stock.stockday.util;

import com.stock.apicommon.vo.YanPanVo;
import com.stock.stockday.entity.StockDayYanPan;
import com.stock.stockday.entity.StockDayYanPan33;
import com.stock.stockday.entity.StockDayYanPanZhuYanJiShu;
import org.springframework.beans.BeanUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

import static com.stock.stockday.util.GetEntity.get33entity;
import static com.stock.stockday.util.GetFileName.getFileName33;
import static com.stock.stockday.util.GetString.get33String;

public class YanPanZhuYanJiShuSaveFileUtil {
    public static void yanPanZhuYanJiShuSaveFile1(YanPanVo yanPanVo, StockDayYanPan stockDayYanPan) throws IOException {
        StockDayYanPanZhuYanJiShu stockDayYanPanZhuYanJiShu=new StockDayYanPanZhuYanJiShu();
        BeanUtils.copyProperties(stockDayYanPan,stockDayYanPanZhuYanJiShu);
        StringBuffer strPath = new StringBuffer();
        String strFileName;
        strPath.append("D:/stock-day/day-yan-pan-zhuyanjishu/");
        strFileName = GetFileName.getFileNameZhuYanJiShu(stockDayYanPanZhuYanJiShu);
        File file = new File(strPath.toString() + strFileName + ".txt");
        if (!file.exists()) {
            if (yanPanVo.getWeiLaiChange1().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanZhuYanJiShu.setShangZhangCount1(new BigDecimal(1));
                stockDayYanPanZhuYanJiShu.setShangZhangMa1(yanPanVo.getWeiLaiChange1());
                stockDayYanPanZhuYanJiShu.setShangZhangSum1(yanPanVo.getWeiLaiChange1());
                stockDayYanPanZhuYanJiShu.setShangZhangRate1(new BigDecimal(50));
            } else {
                stockDayYanPanZhuYanJiShu.setXiaJiangCount1(new BigDecimal(1));
                stockDayYanPanZhuYanJiShu.setXiaJiangMa1(yanPanVo.getWeiLaiChange1());
                stockDayYanPanZhuYanJiShu.setXiaJiangSum1(yanPanVo.getWeiLaiChange1());
                stockDayYanPanZhuYanJiShu.setXiaJiangRate1(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange2().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanZhuYanJiShu.setShangZhangCount2(new BigDecimal(1));
                stockDayYanPanZhuYanJiShu.setShangZhangMa2(yanPanVo.getWeiLaiChange2());
                stockDayYanPanZhuYanJiShu.setShangZhangSum2(yanPanVo.getWeiLaiChange2());
                stockDayYanPanZhuYanJiShu.setShangZhangRate2(new BigDecimal(50));
            } else {
                stockDayYanPanZhuYanJiShu.setXiaJiangCount2(new BigDecimal(1));
                stockDayYanPanZhuYanJiShu.setXiaJiangMa2(yanPanVo.getWeiLaiChange2());
                stockDayYanPanZhuYanJiShu.setXiaJiangSum2(yanPanVo.getWeiLaiChange2());
                stockDayYanPanZhuYanJiShu.setXiaJiangRate2(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange3().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanZhuYanJiShu.setShangZhangCount3(new BigDecimal(1));
                stockDayYanPanZhuYanJiShu.setShangZhangMa3(yanPanVo.getWeiLaiChange3());
                stockDayYanPanZhuYanJiShu.setShangZhangSum3(yanPanVo.getWeiLaiChange3());
                stockDayYanPanZhuYanJiShu.setShangZhangRate3(new BigDecimal(50));
            } else {
                stockDayYanPanZhuYanJiShu.setXiaJiangCount3(new BigDecimal(1));
                stockDayYanPanZhuYanJiShu.setXiaJiangMa3(yanPanVo.getWeiLaiChange3());
                stockDayYanPanZhuYanJiShu.setXiaJiangSum3(yanPanVo.getWeiLaiChange3());
                stockDayYanPanZhuYanJiShu.setXiaJiangRate3(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange5().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanZhuYanJiShu.setShangZhangCount5(new BigDecimal(1));
                stockDayYanPanZhuYanJiShu.setShangZhangMa5(yanPanVo.getWeiLaiChange5());
                stockDayYanPanZhuYanJiShu.setShangZhangSum5(yanPanVo.getWeiLaiChange5());
                stockDayYanPanZhuYanJiShu.setShangZhangRate5(new BigDecimal(50));
            } else {
                stockDayYanPanZhuYanJiShu.setXiaJiangCount5(new BigDecimal(1));
                stockDayYanPanZhuYanJiShu.setXiaJiangMa5(yanPanVo.getWeiLaiChange5());
                stockDayYanPanZhuYanJiShu.setXiaJiangSum5(yanPanVo.getWeiLaiChange5());
                stockDayYanPanZhuYanJiShu.setXiaJiangRate5(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange8().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanZhuYanJiShu.setShangZhangCount8(new BigDecimal(1));
                stockDayYanPanZhuYanJiShu.setShangZhangMa8(yanPanVo.getWeiLaiChange8());
                stockDayYanPanZhuYanJiShu.setShangZhangSum8(yanPanVo.getWeiLaiChange8());
                stockDayYanPanZhuYanJiShu.setShangZhangRate8(new BigDecimal(50));
            } else {
                stockDayYanPanZhuYanJiShu.setXiaJiangCount8(new BigDecimal(1));
                stockDayYanPanZhuYanJiShu.setXiaJiangMa8(yanPanVo.getWeiLaiChange8());
                stockDayYanPanZhuYanJiShu.setXiaJiangSum8(yanPanVo.getWeiLaiChange8());
                stockDayYanPanZhuYanJiShu.setXiaJiangRate8(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange13().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanZhuYanJiShu.setShangZhangCount13(new BigDecimal(1));
                stockDayYanPanZhuYanJiShu.setShangZhangMa13(yanPanVo.getWeiLaiChange13());
                stockDayYanPanZhuYanJiShu.setShangZhangSum13(yanPanVo.getWeiLaiChange8());
                stockDayYanPanZhuYanJiShu.setShangZhangRate13(new BigDecimal(50));
            } else {
                stockDayYanPanZhuYanJiShu.setXiaJiangCount13(new BigDecimal(1));
                stockDayYanPanZhuYanJiShu.setXiaJiangMa13(yanPanVo.getWeiLaiChange13());
                stockDayYanPanZhuYanJiShu.setXiaJiangSum13(yanPanVo.getWeiLaiChange13());
                stockDayYanPanZhuYanJiShu.setXiaJiangRate13(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange20().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanZhuYanJiShu.setShangZhangCount20(new BigDecimal(1));
                stockDayYanPanZhuYanJiShu.setShangZhangMa20(yanPanVo.getWeiLaiChange20());
                stockDayYanPanZhuYanJiShu.setShangZhangSum20(yanPanVo.getWeiLaiChange20());
                stockDayYanPanZhuYanJiShu.setShangZhangRate20(new BigDecimal(50));
            } else {
                stockDayYanPanZhuYanJiShu.setXiaJiangCount20(new BigDecimal(1));
                stockDayYanPanZhuYanJiShu.setXiaJiangMa20(yanPanVo.getWeiLaiChange20());
                stockDayYanPanZhuYanJiShu.setXiaJiangSum20(yanPanVo.getWeiLaiChange20());
                stockDayYanPanZhuYanJiShu.setXiaJiangRate20(new BigDecimal(50));
            }
            String neirong = GetString.getZhuYanJiShuString(stockDayYanPanZhuYanJiShu);
            FileOutputStream fs = new FileOutputStream(strPath.toString() + strFileName + ".txt");
            byte[] buffer = neirong.getBytes();
            int byteread = buffer.length;
            //插入
            fs.write(buffer, 0, byteread);
            fs.flush();
            fs.close();
        } else {
            StockDayYanPanZhuYanJiShu stockDayYanPanZhuYanJiShu1= GetEntity.getZhuYanJiShuentity(strPath.toString() + strFileName);
            BeanUtils.copyProperties(stockDayYanPanZhuYanJiShu1,stockDayYanPanZhuYanJiShu);
            if (yanPanVo.getWeiLaiChange1().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanZhuYanJiShu1.getShangZhangCount1().add(new BigDecimal(1));
                stockDayYanPanZhuYanJiShu.setShangZhangCount1(count);
                BigDecimal sum = stockDayYanPanZhuYanJiShu1.getShangZhangSum1().add(yanPanVo.getWeiLaiChange1());
                stockDayYanPanZhuYanJiShu.setShangZhangSum1(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanZhuYanJiShu.setShangZhangMa1(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanZhuYanJiShu1.getXiaJiangCount1())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanZhuYanJiShu.setShangZhangRate1(rate);
            } else {
                BigDecimal count = stockDayYanPanZhuYanJiShu1.getXiaJiangCount1().add(new BigDecimal(1));
                stockDayYanPanZhuYanJiShu.setXiaJiangCount1(count);
                BigDecimal sum = stockDayYanPanZhuYanJiShu1.getXiaJiangSum1().add(yanPanVo.getWeiLaiChange1());
                stockDayYanPanZhuYanJiShu.setXiaJiangSum1(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanZhuYanJiShu.setXiaJiangMa1(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanZhuYanJiShu1.getShangZhangCount1())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanZhuYanJiShu.setXiaJiangRate1(rate);
            }
            if (yanPanVo.getWeiLaiChange2().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanZhuYanJiShu1.getShangZhangCount2().add(new BigDecimal(1));
                stockDayYanPanZhuYanJiShu.setShangZhangCount2(count);
                BigDecimal sum = stockDayYanPanZhuYanJiShu1.getShangZhangSum2().add(yanPanVo.getWeiLaiChange2());
                stockDayYanPanZhuYanJiShu.setShangZhangSum2(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanZhuYanJiShu.setShangZhangMa2(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanZhuYanJiShu1.getXiaJiangCount2())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanZhuYanJiShu.setShangZhangRate2(rate);
            } else {
                BigDecimal count = stockDayYanPanZhuYanJiShu1.getXiaJiangCount2().add(new BigDecimal(1));
                stockDayYanPanZhuYanJiShu.setXiaJiangCount2(count);
                BigDecimal sum = stockDayYanPanZhuYanJiShu1.getXiaJiangSum2().add(yanPanVo.getWeiLaiChange2());
                stockDayYanPanZhuYanJiShu.setXiaJiangSum2(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanZhuYanJiShu.setXiaJiangMa2(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanZhuYanJiShu1.getShangZhangCount2())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanZhuYanJiShu.setXiaJiangRate2(rate);
            }
            if (yanPanVo.getWeiLaiChange3().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanZhuYanJiShu1.getShangZhangCount3().add(new BigDecimal(1));
                stockDayYanPanZhuYanJiShu.setShangZhangCount3(count);
                BigDecimal sum = stockDayYanPanZhuYanJiShu1.getShangZhangSum3().add(yanPanVo.getWeiLaiChange3());
                stockDayYanPanZhuYanJiShu.setShangZhangSum3(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanZhuYanJiShu.setShangZhangMa3(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanZhuYanJiShu1.getXiaJiangCount3())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanZhuYanJiShu.setShangZhangRate3(rate);
            } else {
                BigDecimal count = stockDayYanPanZhuYanJiShu1.getXiaJiangCount3().add(new BigDecimal(1));
                stockDayYanPanZhuYanJiShu.setXiaJiangCount3(count);
                BigDecimal sum = stockDayYanPanZhuYanJiShu1.getXiaJiangSum3().add(yanPanVo.getWeiLaiChange3());
                stockDayYanPanZhuYanJiShu.setXiaJiangSum3(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanZhuYanJiShu.setXiaJiangMa3(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanZhuYanJiShu1.getShangZhangCount3())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanZhuYanJiShu.setXiaJiangRate3(rate);
            }
            if (yanPanVo.getWeiLaiChange5().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanZhuYanJiShu1.getShangZhangCount5().add(new BigDecimal(1));
                stockDayYanPanZhuYanJiShu.setShangZhangCount5(count);
                BigDecimal sum = stockDayYanPanZhuYanJiShu1.getShangZhangSum5().add(yanPanVo.getWeiLaiChange5());
                stockDayYanPanZhuYanJiShu.setShangZhangSum5(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanZhuYanJiShu.setShangZhangMa5(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanZhuYanJiShu1.getXiaJiangCount5())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanZhuYanJiShu.setShangZhangRate5(rate);
            } else {
                BigDecimal count = stockDayYanPanZhuYanJiShu1.getXiaJiangCount5().add(new BigDecimal(1));
                stockDayYanPanZhuYanJiShu.setXiaJiangCount5(count);
                BigDecimal sum = stockDayYanPanZhuYanJiShu1.getXiaJiangSum5().add(yanPanVo.getWeiLaiChange5());
                stockDayYanPanZhuYanJiShu.setXiaJiangSum5(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanZhuYanJiShu.setXiaJiangMa5(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanZhuYanJiShu1.getShangZhangCount5())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanZhuYanJiShu.setXiaJiangRate5(rate);
            }
            if (yanPanVo.getWeiLaiChange8().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanZhuYanJiShu1.getShangZhangCount8().add(new BigDecimal(1));
                stockDayYanPanZhuYanJiShu.setShangZhangCount8(count);
                BigDecimal sum = stockDayYanPanZhuYanJiShu1.getShangZhangSum8().add(yanPanVo.getWeiLaiChange8());
                stockDayYanPanZhuYanJiShu.setShangZhangSum8(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanZhuYanJiShu.setShangZhangMa8(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanZhuYanJiShu1.getXiaJiangCount8())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanZhuYanJiShu.setShangZhangRate8(rate);
            } else {
                BigDecimal count = stockDayYanPanZhuYanJiShu1.getXiaJiangCount8().add(new BigDecimal(1));
                stockDayYanPanZhuYanJiShu.setXiaJiangCount8(count);
                BigDecimal sum = stockDayYanPanZhuYanJiShu1.getXiaJiangSum8().add(yanPanVo.getWeiLaiChange8());
                stockDayYanPanZhuYanJiShu.setXiaJiangSum8(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanZhuYanJiShu.setXiaJiangMa8(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanZhuYanJiShu1.getShangZhangCount8())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanZhuYanJiShu.setXiaJiangRate8(rate);
            }
            if (yanPanVo.getWeiLaiChange13().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanZhuYanJiShu1.getShangZhangCount13().add(new BigDecimal(1));
                stockDayYanPanZhuYanJiShu.setShangZhangCount13(count);
                BigDecimal sum = stockDayYanPanZhuYanJiShu1.getShangZhangSum13().add(yanPanVo.getWeiLaiChange13());
                stockDayYanPanZhuYanJiShu.setShangZhangSum13(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanZhuYanJiShu.setShangZhangMa13(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanZhuYanJiShu1.getXiaJiangCount13())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanZhuYanJiShu.setShangZhangRate13(rate);
            } else {
                BigDecimal count = stockDayYanPanZhuYanJiShu1.getXiaJiangCount13().add(new BigDecimal(1));
                stockDayYanPanZhuYanJiShu.setXiaJiangCount13(count);
                BigDecimal sum = stockDayYanPanZhuYanJiShu1.getXiaJiangSum13().add(yanPanVo.getWeiLaiChange13());
                stockDayYanPanZhuYanJiShu.setXiaJiangSum13(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanZhuYanJiShu.setXiaJiangMa13(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanZhuYanJiShu1.getShangZhangCount13())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanZhuYanJiShu.setXiaJiangRate13(rate);
            }
            if (yanPanVo.getWeiLaiChange20().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanZhuYanJiShu1.getShangZhangCount20().add(new BigDecimal(1));
                stockDayYanPanZhuYanJiShu.setShangZhangCount20(count);
                BigDecimal sum = stockDayYanPanZhuYanJiShu1.getShangZhangSum20().add(yanPanVo.getWeiLaiChange20());
                stockDayYanPanZhuYanJiShu.setShangZhangSum20(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanZhuYanJiShu.setShangZhangMa20(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanZhuYanJiShu1.getXiaJiangCount20())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanZhuYanJiShu.setShangZhangRate20(rate);
            } else {
                BigDecimal count = stockDayYanPanZhuYanJiShu1.getXiaJiangCount20().add(new BigDecimal(1));
                stockDayYanPanZhuYanJiShu.setXiaJiangCount20(count);
                BigDecimal sum = stockDayYanPanZhuYanJiShu1.getXiaJiangSum20().add(yanPanVo.getWeiLaiChange20());
                stockDayYanPanZhuYanJiShu.setXiaJiangSum20(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanZhuYanJiShu.setXiaJiangMa20(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanZhuYanJiShu1.getShangZhangCount20())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanZhuYanJiShu.setXiaJiangRate20(rate);
            }
            String neirong = GetString.getZhuYanJiShuString(stockDayYanPanZhuYanJiShu);
            FileOutputStream fs = new FileOutputStream(strPath.toString() + strFileName + ".txt");
            byte[] buffer = neirong.getBytes();
            int byteread = buffer.length;
            //插入
            fs.write(buffer, 0, byteread);
            fs.flush();
            fs.close();
        }
    }

    public static void yanPanZhuYanJiShuSaveFile(YanPanVo yanPanVo,StockDayYanPanZhuYanJiShu stockDayYanPanZhuYanJiShu) throws IOException {
        StringBuffer strPath = new StringBuffer();
        String strFileName;
        strPath.append("G:/stock-day/day-yan-pan-zhuyanjishu/");
        strFileName = GetFileName.getFileNameZhuYanJiShu(stockDayYanPanZhuYanJiShu);
        File file = new File(strPath.toString() + strFileName + ".txt");
        if (!file.exists()) {
            if (yanPanVo.getWeiLaiChange1().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanZhuYanJiShu.setShangZhangCount1(new BigDecimal(1));
                stockDayYanPanZhuYanJiShu.setShangZhangMa1(yanPanVo.getWeiLaiChange1());
                stockDayYanPanZhuYanJiShu.setShangZhangSum1(yanPanVo.getWeiLaiChange1());
                stockDayYanPanZhuYanJiShu.setShangZhangRate1(new BigDecimal(50));
            } else {
                stockDayYanPanZhuYanJiShu.setXiaJiangCount1(new BigDecimal(1));
                stockDayYanPanZhuYanJiShu.setXiaJiangMa1(yanPanVo.getWeiLaiChange1());
                stockDayYanPanZhuYanJiShu.setXiaJiangSum1(yanPanVo.getWeiLaiChange1());
                stockDayYanPanZhuYanJiShu.setXiaJiangRate1(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange2().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanZhuYanJiShu.setShangZhangCount2(new BigDecimal(1));
                stockDayYanPanZhuYanJiShu.setShangZhangMa2(yanPanVo.getWeiLaiChange2());
                stockDayYanPanZhuYanJiShu.setShangZhangSum2(yanPanVo.getWeiLaiChange2());
                stockDayYanPanZhuYanJiShu.setShangZhangRate2(new BigDecimal(50));
            } else {
                stockDayYanPanZhuYanJiShu.setXiaJiangCount2(new BigDecimal(1));
                stockDayYanPanZhuYanJiShu.setXiaJiangMa2(yanPanVo.getWeiLaiChange2());
                stockDayYanPanZhuYanJiShu.setXiaJiangSum2(yanPanVo.getWeiLaiChange2());
                stockDayYanPanZhuYanJiShu.setXiaJiangRate2(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange3().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanZhuYanJiShu.setShangZhangCount3(new BigDecimal(1));
                stockDayYanPanZhuYanJiShu.setShangZhangMa3(yanPanVo.getWeiLaiChange3());
                stockDayYanPanZhuYanJiShu.setShangZhangSum3(yanPanVo.getWeiLaiChange3());
                stockDayYanPanZhuYanJiShu.setShangZhangRate3(new BigDecimal(50));
            } else {
                stockDayYanPanZhuYanJiShu.setXiaJiangCount3(new BigDecimal(1));
                stockDayYanPanZhuYanJiShu.setXiaJiangMa3(yanPanVo.getWeiLaiChange3());
                stockDayYanPanZhuYanJiShu.setXiaJiangSum3(yanPanVo.getWeiLaiChange3());
                stockDayYanPanZhuYanJiShu.setXiaJiangRate3(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange5().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanZhuYanJiShu.setShangZhangCount5(new BigDecimal(1));
                stockDayYanPanZhuYanJiShu.setShangZhangMa5(yanPanVo.getWeiLaiChange5());
                stockDayYanPanZhuYanJiShu.setShangZhangSum5(yanPanVo.getWeiLaiChange5());
                stockDayYanPanZhuYanJiShu.setShangZhangRate5(new BigDecimal(50));
            } else {
                stockDayYanPanZhuYanJiShu.setXiaJiangCount5(new BigDecimal(1));
                stockDayYanPanZhuYanJiShu.setXiaJiangMa5(yanPanVo.getWeiLaiChange5());
                stockDayYanPanZhuYanJiShu.setXiaJiangSum5(yanPanVo.getWeiLaiChange5());
                stockDayYanPanZhuYanJiShu.setXiaJiangRate5(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange8().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanZhuYanJiShu.setShangZhangCount8(new BigDecimal(1));
                stockDayYanPanZhuYanJiShu.setShangZhangMa8(yanPanVo.getWeiLaiChange8());
                stockDayYanPanZhuYanJiShu.setShangZhangSum8(yanPanVo.getWeiLaiChange8());
                stockDayYanPanZhuYanJiShu.setShangZhangRate8(new BigDecimal(50));
            } else {
                stockDayYanPanZhuYanJiShu.setXiaJiangCount8(new BigDecimal(1));
                stockDayYanPanZhuYanJiShu.setXiaJiangMa8(yanPanVo.getWeiLaiChange8());
                stockDayYanPanZhuYanJiShu.setXiaJiangSum8(yanPanVo.getWeiLaiChange8());
                stockDayYanPanZhuYanJiShu.setXiaJiangRate8(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange13().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanZhuYanJiShu.setShangZhangCount13(new BigDecimal(1));
                stockDayYanPanZhuYanJiShu.setShangZhangMa13(yanPanVo.getWeiLaiChange13());
                stockDayYanPanZhuYanJiShu.setShangZhangSum13(yanPanVo.getWeiLaiChange8());
                stockDayYanPanZhuYanJiShu.setShangZhangRate13(new BigDecimal(50));
            } else {
                stockDayYanPanZhuYanJiShu.setXiaJiangCount13(new BigDecimal(1));
                stockDayYanPanZhuYanJiShu.setXiaJiangMa13(yanPanVo.getWeiLaiChange13());
                stockDayYanPanZhuYanJiShu.setXiaJiangSum13(yanPanVo.getWeiLaiChange13());
                stockDayYanPanZhuYanJiShu.setXiaJiangRate13(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange20().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanZhuYanJiShu.setShangZhangCount20(new BigDecimal(1));
                stockDayYanPanZhuYanJiShu.setShangZhangMa20(yanPanVo.getWeiLaiChange20());
                stockDayYanPanZhuYanJiShu.setShangZhangSum20(yanPanVo.getWeiLaiChange20());
                stockDayYanPanZhuYanJiShu.setShangZhangRate20(new BigDecimal(50));
            } else {
                stockDayYanPanZhuYanJiShu.setXiaJiangCount20(new BigDecimal(1));
                stockDayYanPanZhuYanJiShu.setXiaJiangMa20(yanPanVo.getWeiLaiChange20());
                stockDayYanPanZhuYanJiShu.setXiaJiangSum20(yanPanVo.getWeiLaiChange20());
                stockDayYanPanZhuYanJiShu.setXiaJiangRate20(new BigDecimal(50));
            }
            String neirong = GetString.getZhuYanJiShuString(stockDayYanPanZhuYanJiShu);
            FileOutputStream fs = new FileOutputStream(strPath.toString() + strFileName + ".txt");
            byte[] buffer = neirong.getBytes();
            int byteread = buffer.length;
            //插入
            fs.write(buffer, 0, byteread);
            fs.flush();
            fs.close();
        } else {
            StockDayYanPanZhuYanJiShu stockDayYanPanZhuYanJiShu1= GetEntity.getZhuYanJiShuentity(strPath.toString() + strFileName);
            BeanUtils.copyProperties(stockDayYanPanZhuYanJiShu1,stockDayYanPanZhuYanJiShu);
            if (yanPanVo.getWeiLaiChange1().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanZhuYanJiShu1.getShangZhangCount1().add(new BigDecimal(1));
                stockDayYanPanZhuYanJiShu.setShangZhangCount1(count);
                BigDecimal sum = stockDayYanPanZhuYanJiShu1.getShangZhangSum1().add(yanPanVo.getWeiLaiChange1());
                stockDayYanPanZhuYanJiShu.setShangZhangSum1(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanZhuYanJiShu.setShangZhangMa1(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanZhuYanJiShu1.getXiaJiangCount1())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanZhuYanJiShu.setShangZhangRate1(rate);
            } else {
                BigDecimal count = stockDayYanPanZhuYanJiShu1.getXiaJiangCount1().add(new BigDecimal(1));
                stockDayYanPanZhuYanJiShu.setXiaJiangCount1(count);
                BigDecimal sum = stockDayYanPanZhuYanJiShu1.getXiaJiangSum1().add(yanPanVo.getWeiLaiChange1());
                stockDayYanPanZhuYanJiShu.setXiaJiangSum1(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanZhuYanJiShu.setXiaJiangMa1(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanZhuYanJiShu1.getShangZhangCount1())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanZhuYanJiShu.setXiaJiangRate1(rate);
            }
            if (yanPanVo.getWeiLaiChange2().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanZhuYanJiShu1.getShangZhangCount2().add(new BigDecimal(1));
                stockDayYanPanZhuYanJiShu.setShangZhangCount2(count);
                BigDecimal sum = stockDayYanPanZhuYanJiShu1.getShangZhangSum2().add(yanPanVo.getWeiLaiChange2());
                stockDayYanPanZhuYanJiShu.setShangZhangSum2(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanZhuYanJiShu.setShangZhangMa2(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanZhuYanJiShu1.getXiaJiangCount2())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanZhuYanJiShu.setShangZhangRate2(rate);
            } else {
                BigDecimal count = stockDayYanPanZhuYanJiShu1.getXiaJiangCount2().add(new BigDecimal(1));
                stockDayYanPanZhuYanJiShu.setXiaJiangCount2(count);
                BigDecimal sum = stockDayYanPanZhuYanJiShu1.getXiaJiangSum2().add(yanPanVo.getWeiLaiChange2());
                stockDayYanPanZhuYanJiShu.setXiaJiangSum2(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanZhuYanJiShu.setXiaJiangMa2(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanZhuYanJiShu1.getShangZhangCount2())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanZhuYanJiShu.setXiaJiangRate2(rate);
            }
            if (yanPanVo.getWeiLaiChange3().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanZhuYanJiShu1.getShangZhangCount3().add(new BigDecimal(1));
                stockDayYanPanZhuYanJiShu.setShangZhangCount3(count);
                BigDecimal sum = stockDayYanPanZhuYanJiShu1.getShangZhangSum3().add(yanPanVo.getWeiLaiChange3());
                stockDayYanPanZhuYanJiShu.setShangZhangSum3(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanZhuYanJiShu.setShangZhangMa3(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanZhuYanJiShu1.getXiaJiangCount3())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanZhuYanJiShu.setShangZhangRate3(rate);
            } else {
                BigDecimal count = stockDayYanPanZhuYanJiShu1.getXiaJiangCount3().add(new BigDecimal(1));
                stockDayYanPanZhuYanJiShu.setXiaJiangCount3(count);
                BigDecimal sum = stockDayYanPanZhuYanJiShu1.getXiaJiangSum3().add(yanPanVo.getWeiLaiChange3());
                stockDayYanPanZhuYanJiShu.setXiaJiangSum3(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanZhuYanJiShu.setXiaJiangMa3(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanZhuYanJiShu1.getShangZhangCount3())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanZhuYanJiShu.setXiaJiangRate3(rate);
            }
            if (yanPanVo.getWeiLaiChange5().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanZhuYanJiShu1.getShangZhangCount5().add(new BigDecimal(1));
                stockDayYanPanZhuYanJiShu.setShangZhangCount5(count);
                BigDecimal sum = stockDayYanPanZhuYanJiShu1.getShangZhangSum5().add(yanPanVo.getWeiLaiChange5());
                stockDayYanPanZhuYanJiShu.setShangZhangSum5(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanZhuYanJiShu.setShangZhangMa5(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanZhuYanJiShu1.getXiaJiangCount5())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanZhuYanJiShu.setShangZhangRate5(rate);
            } else {
                BigDecimal count = stockDayYanPanZhuYanJiShu1.getXiaJiangCount5().add(new BigDecimal(1));
                stockDayYanPanZhuYanJiShu.setXiaJiangCount5(count);
                BigDecimal sum = stockDayYanPanZhuYanJiShu1.getXiaJiangSum5().add(yanPanVo.getWeiLaiChange5());
                stockDayYanPanZhuYanJiShu.setXiaJiangSum5(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanZhuYanJiShu.setXiaJiangMa5(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanZhuYanJiShu1.getShangZhangCount5())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanZhuYanJiShu.setXiaJiangRate5(rate);
            }
            if (yanPanVo.getWeiLaiChange8().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanZhuYanJiShu1.getShangZhangCount8().add(new BigDecimal(1));
                stockDayYanPanZhuYanJiShu.setShangZhangCount8(count);
                BigDecimal sum = stockDayYanPanZhuYanJiShu1.getShangZhangSum8().add(yanPanVo.getWeiLaiChange8());
                stockDayYanPanZhuYanJiShu.setShangZhangSum8(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanZhuYanJiShu.setShangZhangMa8(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanZhuYanJiShu1.getXiaJiangCount8())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanZhuYanJiShu.setShangZhangRate8(rate);
            } else {
                BigDecimal count = stockDayYanPanZhuYanJiShu1.getXiaJiangCount8().add(new BigDecimal(1));
                stockDayYanPanZhuYanJiShu.setXiaJiangCount8(count);
                BigDecimal sum = stockDayYanPanZhuYanJiShu1.getXiaJiangSum8().add(yanPanVo.getWeiLaiChange8());
                stockDayYanPanZhuYanJiShu.setXiaJiangSum8(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanZhuYanJiShu.setXiaJiangMa8(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanZhuYanJiShu1.getShangZhangCount8())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanZhuYanJiShu.setXiaJiangRate8(rate);
            }
            if (yanPanVo.getWeiLaiChange13().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanZhuYanJiShu1.getShangZhangCount13().add(new BigDecimal(1));
                stockDayYanPanZhuYanJiShu.setShangZhangCount13(count);
                BigDecimal sum = stockDayYanPanZhuYanJiShu1.getShangZhangSum13().add(yanPanVo.getWeiLaiChange13());
                stockDayYanPanZhuYanJiShu.setShangZhangSum13(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanZhuYanJiShu.setShangZhangMa13(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanZhuYanJiShu1.getXiaJiangCount13())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanZhuYanJiShu.setShangZhangRate13(rate);
            } else {
                BigDecimal count = stockDayYanPanZhuYanJiShu1.getXiaJiangCount13().add(new BigDecimal(1));
                stockDayYanPanZhuYanJiShu.setXiaJiangCount13(count);
                BigDecimal sum = stockDayYanPanZhuYanJiShu1.getXiaJiangSum13().add(yanPanVo.getWeiLaiChange13());
                stockDayYanPanZhuYanJiShu.setXiaJiangSum13(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanZhuYanJiShu.setXiaJiangMa13(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanZhuYanJiShu1.getShangZhangCount13())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanZhuYanJiShu.setXiaJiangRate13(rate);
            }
            if (yanPanVo.getWeiLaiChange20().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanZhuYanJiShu1.getShangZhangCount20().add(new BigDecimal(1));
                stockDayYanPanZhuYanJiShu.setShangZhangCount20(count);
                BigDecimal sum = stockDayYanPanZhuYanJiShu1.getShangZhangSum20().add(yanPanVo.getWeiLaiChange20());
                stockDayYanPanZhuYanJiShu.setShangZhangSum20(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanZhuYanJiShu.setShangZhangMa20(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanZhuYanJiShu1.getXiaJiangCount20())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanZhuYanJiShu.setShangZhangRate20(rate);
            } else {
                BigDecimal count = stockDayYanPanZhuYanJiShu1.getXiaJiangCount20().add(new BigDecimal(1));
                stockDayYanPanZhuYanJiShu.setXiaJiangCount20(count);
                BigDecimal sum = stockDayYanPanZhuYanJiShu1.getXiaJiangSum20().add(yanPanVo.getWeiLaiChange20());
                stockDayYanPanZhuYanJiShu.setXiaJiangSum20(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanZhuYanJiShu.setXiaJiangMa20(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanZhuYanJiShu1.getShangZhangCount20())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanZhuYanJiShu.setXiaJiangRate20(rate);
            }
            String neirong = GetString.getZhuYanJiShuString(stockDayYanPanZhuYanJiShu);
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
