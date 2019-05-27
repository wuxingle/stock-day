package com.stock.stockday.util;

import com.stock.apicommon.vo.DaPanRateOfChangeVo;
import com.stock.apicommon.vo.RateOfChangeVo;
import com.stock.apicommon.vo.YanPanVo;
import com.stock.stockday.entity.StockDayYanPan;
import com.stock.stockday.entity.StockDayYanPanChunTuxing;
import com.stock.stockday.entity.StockDayYanPanLowLow;
import com.stock.stockday.entity.StockDayYanPanLowUp;
import com.stock.stockday.entity.StockDayYanPanUpLow;
import com.stock.stockday.entity.StockDayYanPanUpUp;
import org.springframework.beans.BeanUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

import static com.stock.stockday.util.GetEntity.getChunTuxingentity;
import static com.stock.stockday.util.GetEntity.getUpUpentity;
import static com.stock.stockday.util.GetFileName.getFileName;
import static com.stock.stockday.util.GetFileName.getFileNameCtx;
import static com.stock.stockday.util.GetString.getChunTuxingString;
import static com.stock.stockday.util.GetString.getUpUpString;

public class ChunTuXingSaveFileUtil {

    public static void chunTuXing(YanPanVo yanPanVo, StockDayYanPan stockDayYanPan) throws IOException {
        StringBuffer strPath = new StringBuffer();
        String strFileName;
        StockDayYanPanChunTuxing stockDayYanPanChunTuxing=new StockDayYanPanChunTuxing();
        BeanUtils.copyProperties(stockDayYanPan, stockDayYanPanChunTuxing);
        strPath.setLength(0);
        strPath.append("D:/stock-day/day-yan-pan-ChunTuxing/");
        strFileName = getFileNameCtx(stockDayYanPanChunTuxing);
        File file = new File(strPath.toString() + strFileName + ".txt");
        if (!file.exists()) {
            if (yanPanVo.getWeiLaiChange1().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanChunTuxing.setShangZhangCount1(new BigDecimal(1));
                stockDayYanPanChunTuxing.setShangZhangMa1(yanPanVo.getWeiLaiChange1());
                stockDayYanPanChunTuxing.setShangZhangSum1(yanPanVo.getWeiLaiChange1());
                stockDayYanPanChunTuxing.setShangZhangRate1(new BigDecimal(100));
            } else {
                stockDayYanPanChunTuxing.setXiaJiangCount1(new BigDecimal(1));
                stockDayYanPanChunTuxing.setXiaJiangMa1(yanPanVo.getWeiLaiChange1());
                stockDayYanPanChunTuxing.setXiaJiangSum1(yanPanVo.getWeiLaiChange1());
                stockDayYanPanChunTuxing.setXiaJiangRate1(new BigDecimal(100));
            }
            if (yanPanVo.getWeiLaiChange2().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanChunTuxing.setShangZhangCount2(new BigDecimal(1));
                stockDayYanPanChunTuxing.setShangZhangMa2(yanPanVo.getWeiLaiChange2());
                stockDayYanPanChunTuxing.setShangZhangSum2(yanPanVo.getWeiLaiChange2());
                stockDayYanPanChunTuxing.setShangZhangRate2(new BigDecimal(100));
            } else {
                stockDayYanPanChunTuxing.setXiaJiangCount2(new BigDecimal(1));
                stockDayYanPanChunTuxing.setXiaJiangMa2(yanPanVo.getWeiLaiChange2());
                stockDayYanPanChunTuxing.setXiaJiangSum2(yanPanVo.getWeiLaiChange2());
                stockDayYanPanChunTuxing.setXiaJiangRate2(new BigDecimal(100));
            }
            if (yanPanVo.getWeiLaiChange3().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanChunTuxing.setShangZhangCount3(new BigDecimal(1));
                stockDayYanPanChunTuxing.setShangZhangMa3(yanPanVo.getWeiLaiChange3());
                stockDayYanPanChunTuxing.setShangZhangSum3(yanPanVo.getWeiLaiChange3());
                stockDayYanPanChunTuxing.setShangZhangRate3(new BigDecimal(100));
            } else {
                stockDayYanPanChunTuxing.setXiaJiangCount3(new BigDecimal(1));
                stockDayYanPanChunTuxing.setXiaJiangMa3(yanPanVo.getWeiLaiChange3());
                stockDayYanPanChunTuxing.setXiaJiangSum3(yanPanVo.getWeiLaiChange3());
                stockDayYanPanChunTuxing.setXiaJiangRate3(new BigDecimal(100));
            }
            if (yanPanVo.getWeiLaiChange5().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanChunTuxing.setShangZhangCount5(new BigDecimal(1));
                stockDayYanPanChunTuxing.setShangZhangMa5(yanPanVo.getWeiLaiChange5());
                stockDayYanPanChunTuxing.setShangZhangSum5(yanPanVo.getWeiLaiChange5());
                stockDayYanPanChunTuxing.setShangZhangRate5(new BigDecimal(100));
            } else {
                stockDayYanPanChunTuxing.setXiaJiangCount5(new BigDecimal(1));
                stockDayYanPanChunTuxing.setXiaJiangMa5(yanPanVo.getWeiLaiChange5());
                stockDayYanPanChunTuxing.setXiaJiangSum5(yanPanVo.getWeiLaiChange5());
                stockDayYanPanChunTuxing.setXiaJiangRate5(new BigDecimal(100));
            }
            if (yanPanVo.getWeiLaiChange8().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanChunTuxing.setShangZhangCount8(new BigDecimal(1));
                stockDayYanPanChunTuxing.setShangZhangMa8(yanPanVo.getWeiLaiChange8());
                stockDayYanPanChunTuxing.setShangZhangSum8(yanPanVo.getWeiLaiChange8());
                stockDayYanPanChunTuxing.setShangZhangRate8(new BigDecimal(100));
            } else {
                stockDayYanPanChunTuxing.setXiaJiangCount8(new BigDecimal(1));
                stockDayYanPanChunTuxing.setXiaJiangMa8(yanPanVo.getWeiLaiChange8());
                stockDayYanPanChunTuxing.setXiaJiangSum8(yanPanVo.getWeiLaiChange8());
                stockDayYanPanChunTuxing.setXiaJiangRate8(new BigDecimal(100));
            }
            if (yanPanVo.getWeiLaiChange13().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanChunTuxing.setShangZhangCount13(new BigDecimal(1));
                stockDayYanPanChunTuxing.setShangZhangMa13(yanPanVo.getWeiLaiChange13());
                stockDayYanPanChunTuxing.setShangZhangSum13(yanPanVo.getWeiLaiChange8());
                stockDayYanPanChunTuxing.setShangZhangRate13(new BigDecimal(100));
            } else {
                stockDayYanPanChunTuxing.setXiaJiangCount13(new BigDecimal(1));
                stockDayYanPanChunTuxing.setXiaJiangMa13(yanPanVo.getWeiLaiChange13());
                stockDayYanPanChunTuxing.setXiaJiangSum13(yanPanVo.getWeiLaiChange13());
                stockDayYanPanChunTuxing.setXiaJiangRate13(new BigDecimal(100));
            }
            if (yanPanVo.getWeiLaiChange20().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanChunTuxing.setShangZhangCount20(new BigDecimal(1));
                stockDayYanPanChunTuxing.setShangZhangMa20(yanPanVo.getWeiLaiChange20());
                stockDayYanPanChunTuxing.setShangZhangSum20(yanPanVo.getWeiLaiChange20());
                stockDayYanPanChunTuxing.setShangZhangRate20(new BigDecimal(100));
            } else {
                stockDayYanPanChunTuxing.setXiaJiangCount20(new BigDecimal(1));
                stockDayYanPanChunTuxing.setXiaJiangMa20(yanPanVo.getWeiLaiChange20());
                stockDayYanPanChunTuxing.setXiaJiangSum20(yanPanVo.getWeiLaiChange20());
                stockDayYanPanChunTuxing.setXiaJiangRate20(new BigDecimal(100));
            }
            String neirong = getChunTuxingString(stockDayYanPanChunTuxing);
            FileOutputStream fs = new FileOutputStream(strPath.toString() + strFileName + ".txt");
            byte[] buffer = neirong.getBytes();
            int byteread = buffer.length;
            //插入
            fs.write(buffer, 0, byteread);
            fs.flush();
            fs.close();
        } else {
            StockDayYanPanChunTuxing stockDayYanPanChunTuxing1=getChunTuxingentity(strPath.toString() + strFileName);
            BeanUtils.copyProperties(stockDayYanPanChunTuxing1,stockDayYanPanChunTuxing);
            if (yanPanVo.getWeiLaiChange1().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanChunTuxing1.getShangZhangCount1().add(new BigDecimal(1));
                stockDayYanPanChunTuxing.setShangZhangCount1(count);
                BigDecimal sum = stockDayYanPanChunTuxing1.getShangZhangSum1().add(yanPanVo.getWeiLaiChange1());
                stockDayYanPanChunTuxing.setShangZhangSum1(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanChunTuxing.setShangZhangMa1(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanChunTuxing1.getXiaJiangCount1())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanChunTuxing.setShangZhangRate1(rate);
            } else {
                BigDecimal count = stockDayYanPanChunTuxing1.getXiaJiangCount1().add(new BigDecimal(1));
                stockDayYanPanChunTuxing.setXiaJiangCount1(count);
                BigDecimal sum = stockDayYanPanChunTuxing1.getXiaJiangSum1().add(yanPanVo.getWeiLaiChange1());
                stockDayYanPanChunTuxing.setXiaJiangSum1(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanChunTuxing.setXiaJiangMa1(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanChunTuxing1.getShangZhangCount1())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanChunTuxing.setXiaJiangRate1(rate);
            }
            if (yanPanVo.getWeiLaiChange2().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanChunTuxing1.getShangZhangCount2().add(new BigDecimal(1));
                stockDayYanPanChunTuxing.setShangZhangCount2(count);
                BigDecimal sum = stockDayYanPanChunTuxing1.getShangZhangSum2().add(yanPanVo.getWeiLaiChange2());
                stockDayYanPanChunTuxing.setShangZhangSum2(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanChunTuxing.setShangZhangMa2(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanChunTuxing1.getXiaJiangCount2())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanChunTuxing.setShangZhangRate2(rate);
            } else {
                BigDecimal count = stockDayYanPanChunTuxing1.getXiaJiangCount2().add(new BigDecimal(1));
                stockDayYanPanChunTuxing.setXiaJiangCount2(count);
                BigDecimal sum = stockDayYanPanChunTuxing1.getXiaJiangSum2().add(yanPanVo.getWeiLaiChange2());
                stockDayYanPanChunTuxing.setXiaJiangSum2(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanChunTuxing.setXiaJiangMa2(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanChunTuxing1.getShangZhangCount2())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanChunTuxing.setXiaJiangRate2(rate);
            }
            if (yanPanVo.getWeiLaiChange3().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanChunTuxing1.getShangZhangCount3().add(new BigDecimal(1));
                stockDayYanPanChunTuxing.setShangZhangCount3(count);
                BigDecimal sum = stockDayYanPanChunTuxing1.getShangZhangSum3().add(yanPanVo.getWeiLaiChange3());
                stockDayYanPanChunTuxing.setShangZhangSum3(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanChunTuxing.setShangZhangMa3(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanChunTuxing1.getXiaJiangCount3())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanChunTuxing.setShangZhangRate3(rate);
            } else {
                BigDecimal count = stockDayYanPanChunTuxing1.getXiaJiangCount3().add(new BigDecimal(1));
                stockDayYanPanChunTuxing.setXiaJiangCount3(count);
                BigDecimal sum = stockDayYanPanChunTuxing1.getXiaJiangSum3().add(yanPanVo.getWeiLaiChange3());
                stockDayYanPanChunTuxing.setXiaJiangSum3(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanChunTuxing.setXiaJiangMa3(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanChunTuxing1.getShangZhangCount3())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanChunTuxing.setXiaJiangRate3(rate);
            }
            if (yanPanVo.getWeiLaiChange5().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanChunTuxing1.getShangZhangCount5().add(new BigDecimal(1));
                stockDayYanPanChunTuxing.setShangZhangCount5(count);
                BigDecimal sum = stockDayYanPanChunTuxing1.getShangZhangSum5().add(yanPanVo.getWeiLaiChange5());
                stockDayYanPanChunTuxing.setShangZhangSum5(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanChunTuxing.setShangZhangMa5(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanChunTuxing1.getXiaJiangCount5())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanChunTuxing.setShangZhangRate5(rate);
            } else {
                BigDecimal count = stockDayYanPanChunTuxing1.getXiaJiangCount5().add(new BigDecimal(1));
                stockDayYanPanChunTuxing.setXiaJiangCount5(count);
                BigDecimal sum = stockDayYanPanChunTuxing1.getXiaJiangSum5().add(yanPanVo.getWeiLaiChange5());
                stockDayYanPanChunTuxing.setXiaJiangSum5(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanChunTuxing.setXiaJiangMa5(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanChunTuxing1.getShangZhangCount5())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanChunTuxing.setXiaJiangRate5(rate);
            }
            if (yanPanVo.getWeiLaiChange8().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanChunTuxing1.getShangZhangCount8().add(new BigDecimal(1));
                stockDayYanPanChunTuxing.setShangZhangCount8(count);
                BigDecimal sum = stockDayYanPanChunTuxing1.getShangZhangSum8().add(yanPanVo.getWeiLaiChange8());
                stockDayYanPanChunTuxing.setShangZhangSum8(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanChunTuxing.setShangZhangMa8(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanChunTuxing1.getXiaJiangCount8())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanChunTuxing.setShangZhangRate8(rate);
            } else {
                BigDecimal count = stockDayYanPanChunTuxing1.getXiaJiangCount8().add(new BigDecimal(1));
                stockDayYanPanChunTuxing.setXiaJiangCount8(count);
                BigDecimal sum = stockDayYanPanChunTuxing1.getXiaJiangSum8().add(yanPanVo.getWeiLaiChange8());
                stockDayYanPanChunTuxing.setXiaJiangSum8(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanChunTuxing.setXiaJiangMa8(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanChunTuxing1.getShangZhangCount8())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanChunTuxing.setXiaJiangRate8(rate);
            }
            if (yanPanVo.getWeiLaiChange13().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanChunTuxing1.getShangZhangCount13().add(new BigDecimal(1));
                stockDayYanPanChunTuxing.setShangZhangCount13(count);
                BigDecimal sum = stockDayYanPanChunTuxing1.getShangZhangSum13().add(yanPanVo.getWeiLaiChange13());
                stockDayYanPanChunTuxing.setShangZhangSum13(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanChunTuxing.setShangZhangMa13(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanChunTuxing1.getXiaJiangCount13())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanChunTuxing.setShangZhangRate13(rate);
            } else {
                BigDecimal count = stockDayYanPanChunTuxing1.getXiaJiangCount13().add(new BigDecimal(1));
                stockDayYanPanChunTuxing.setXiaJiangCount13(count);
                BigDecimal sum = stockDayYanPanChunTuxing1.getXiaJiangSum13().add(yanPanVo.getWeiLaiChange13());
                stockDayYanPanChunTuxing.setXiaJiangSum13(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanChunTuxing.setXiaJiangMa13(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanChunTuxing1.getShangZhangCount13())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanChunTuxing.setXiaJiangRate13(rate);
            }
            if (yanPanVo.getWeiLaiChange20().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanChunTuxing1.getShangZhangCount20().add(new BigDecimal(1));
                stockDayYanPanChunTuxing.setShangZhangCount20(count);
                BigDecimal sum = stockDayYanPanChunTuxing1.getShangZhangSum20().add(yanPanVo.getWeiLaiChange20());
                stockDayYanPanChunTuxing.setShangZhangSum20(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanChunTuxing.setShangZhangMa20(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanChunTuxing1.getXiaJiangCount20())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanChunTuxing.setShangZhangRate20(rate);
            } else {
                BigDecimal count = stockDayYanPanChunTuxing1.getXiaJiangCount20().add(new BigDecimal(1));
                stockDayYanPanChunTuxing.setXiaJiangCount20(count);
                BigDecimal sum = stockDayYanPanChunTuxing1.getXiaJiangSum20().add(yanPanVo.getWeiLaiChange20());
                stockDayYanPanChunTuxing.setXiaJiangSum20(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanChunTuxing.setXiaJiangMa20(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanChunTuxing1.getShangZhangCount20())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanChunTuxing.setXiaJiangRate20(rate);
            }
            String neirong = getChunTuxingString(stockDayYanPanChunTuxing);
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
