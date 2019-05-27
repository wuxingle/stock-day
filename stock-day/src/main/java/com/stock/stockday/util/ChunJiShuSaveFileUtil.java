package com.stock.stockday.util;

import com.stock.apicommon.vo.YanPanVo;
import com.stock.stockday.entity.StockDayYanPan;
import com.stock.stockday.entity.StockDayYanPanChunJishu;
import com.stock.stockday.entity.StockDayYanPanChunTuxing;
import org.springframework.beans.BeanUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

import static com.stock.stockday.util.GetEntity.getChunJishuentity;
import static com.stock.stockday.util.GetEntity.getChunTuxingentity;
import static com.stock.stockday.util.GetFileName.getFileNameCjs;
import static com.stock.stockday.util.GetFileName.getFileNameCtx;
import static com.stock.stockday.util.GetString.getChunJishuString;
import static com.stock.stockday.util.GetString.getChunTuxingString;

public class ChunJiShuSaveFileUtil {

    public static void chunJiShu(YanPanVo yanPanVo, StockDayYanPan stockDayYanPan) throws IOException {
        StringBuffer strPath = new StringBuffer();
        String strFileName;
        StockDayYanPanChunJishu stockDayYanPanChunJishu=new StockDayYanPanChunJishu();
        BeanUtils.copyProperties(stockDayYanPan, stockDayYanPanChunJishu);
        strPath.setLength(0);
        strPath.append("D:/stock-day/day-yan-pan-ChunJishu/");
        strFileName = getFileNameCjs(stockDayYanPanChunJishu);
        File file1 = new File(strPath.toString() + strFileName + ".txt");
        if (!file1.exists()) {
            if (yanPanVo.getWeiLaiChange1().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanChunJishu.setShangZhangCount1(new BigDecimal(1));
                stockDayYanPanChunJishu.setShangZhangMa1(yanPanVo.getWeiLaiChange1());
                stockDayYanPanChunJishu.setShangZhangSum1(yanPanVo.getWeiLaiChange1());
                stockDayYanPanChunJishu.setShangZhangRate1(new BigDecimal(50));
            } else {
                stockDayYanPanChunJishu.setXiaJiangCount1(new BigDecimal(1));
                stockDayYanPanChunJishu.setXiaJiangMa1(yanPanVo.getWeiLaiChange1());
                stockDayYanPanChunJishu.setXiaJiangSum1(yanPanVo.getWeiLaiChange1());
                stockDayYanPanChunJishu.setXiaJiangRate1(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange2().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanChunJishu.setShangZhangCount2(new BigDecimal(1));
                stockDayYanPanChunJishu.setShangZhangMa2(yanPanVo.getWeiLaiChange2());
                stockDayYanPanChunJishu.setShangZhangSum2(yanPanVo.getWeiLaiChange2());
                stockDayYanPanChunJishu.setShangZhangRate2(new BigDecimal(50));
            } else {
                stockDayYanPanChunJishu.setXiaJiangCount2(new BigDecimal(1));
                stockDayYanPanChunJishu.setXiaJiangMa2(yanPanVo.getWeiLaiChange2());
                stockDayYanPanChunJishu.setXiaJiangSum2(yanPanVo.getWeiLaiChange2());
                stockDayYanPanChunJishu.setXiaJiangRate2(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange3().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanChunJishu.setShangZhangCount3(new BigDecimal(1));
                stockDayYanPanChunJishu.setShangZhangMa3(yanPanVo.getWeiLaiChange3());
                stockDayYanPanChunJishu.setShangZhangSum3(yanPanVo.getWeiLaiChange3());
                stockDayYanPanChunJishu.setShangZhangRate3(new BigDecimal(50));
            } else {
                stockDayYanPanChunJishu.setXiaJiangCount3(new BigDecimal(1));
                stockDayYanPanChunJishu.setXiaJiangMa3(yanPanVo.getWeiLaiChange3());
                stockDayYanPanChunJishu.setXiaJiangSum3(yanPanVo.getWeiLaiChange3());
                stockDayYanPanChunJishu.setXiaJiangRate3(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange5().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanChunJishu.setShangZhangCount5(new BigDecimal(1));
                stockDayYanPanChunJishu.setShangZhangMa5(yanPanVo.getWeiLaiChange5());
                stockDayYanPanChunJishu.setShangZhangSum5(yanPanVo.getWeiLaiChange5());
                stockDayYanPanChunJishu.setShangZhangRate5(new BigDecimal(50));
            } else {
                stockDayYanPanChunJishu.setXiaJiangCount5(new BigDecimal(1));
                stockDayYanPanChunJishu.setXiaJiangMa5(yanPanVo.getWeiLaiChange5());
                stockDayYanPanChunJishu.setXiaJiangSum5(yanPanVo.getWeiLaiChange5());
                stockDayYanPanChunJishu.setXiaJiangRate5(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange8().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanChunJishu.setShangZhangCount8(new BigDecimal(1));
                stockDayYanPanChunJishu.setShangZhangMa8(yanPanVo.getWeiLaiChange8());
                stockDayYanPanChunJishu.setShangZhangSum8(yanPanVo.getWeiLaiChange8());
                stockDayYanPanChunJishu.setShangZhangRate8(new BigDecimal(50));
            } else {
                stockDayYanPanChunJishu.setXiaJiangCount8(new BigDecimal(1));
                stockDayYanPanChunJishu.setXiaJiangMa8(yanPanVo.getWeiLaiChange8());
                stockDayYanPanChunJishu.setXiaJiangSum8(yanPanVo.getWeiLaiChange8());
                stockDayYanPanChunJishu.setXiaJiangRate8(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange13().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanChunJishu.setShangZhangCount13(new BigDecimal(1));
                stockDayYanPanChunJishu.setShangZhangMa13(yanPanVo.getWeiLaiChange13());
                stockDayYanPanChunJishu.setShangZhangSum13(yanPanVo.getWeiLaiChange8());
                stockDayYanPanChunJishu.setShangZhangRate13(new BigDecimal(50));
            } else {
                stockDayYanPanChunJishu.setXiaJiangCount13(new BigDecimal(1));
                stockDayYanPanChunJishu.setXiaJiangMa13(yanPanVo.getWeiLaiChange13());
                stockDayYanPanChunJishu.setXiaJiangSum13(yanPanVo.getWeiLaiChange13());
                stockDayYanPanChunJishu.setXiaJiangRate13(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange20().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanChunJishu.setShangZhangCount20(new BigDecimal(1));
                stockDayYanPanChunJishu.setShangZhangMa20(yanPanVo.getWeiLaiChange20());
                stockDayYanPanChunJishu.setShangZhangSum20(yanPanVo.getWeiLaiChange20());
                stockDayYanPanChunJishu.setShangZhangRate20(new BigDecimal(50));
            } else {
                stockDayYanPanChunJishu.setXiaJiangCount20(new BigDecimal(1));
                stockDayYanPanChunJishu.setXiaJiangMa20(yanPanVo.getWeiLaiChange20());
                stockDayYanPanChunJishu.setXiaJiangSum20(yanPanVo.getWeiLaiChange20());
                stockDayYanPanChunJishu.setXiaJiangRate20(new BigDecimal(50));
            }
            String neirong = getChunJishuString(stockDayYanPanChunJishu);
            FileOutputStream fs = new FileOutputStream(strPath.toString() + strFileName + ".txt");
            byte[] buffer = neirong.getBytes();
            int byteread = buffer.length;
            //插入
            fs.write(buffer, 0, byteread);
            fs.flush();
            fs.close();
        } else {
            StockDayYanPanChunJishu stockDayYanPanChunJishu1=getChunJishuentity(strPath.toString() + strFileName);
            BeanUtils.copyProperties(stockDayYanPanChunJishu1,stockDayYanPanChunJishu);
            if (yanPanVo.getWeiLaiChange1().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanChunJishu1.getShangZhangCount1().add(new BigDecimal(1));
                stockDayYanPanChunJishu.setShangZhangCount1(count);
                BigDecimal sum = stockDayYanPanChunJishu1.getShangZhangSum1().add(yanPanVo.getWeiLaiChange1());
                stockDayYanPanChunJishu.setShangZhangSum1(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanChunJishu.setShangZhangMa1(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanChunJishu1.getXiaJiangCount1())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanChunJishu.setShangZhangRate1(rate);
            } else {
                BigDecimal count = stockDayYanPanChunJishu1.getXiaJiangCount1().add(new BigDecimal(1));
                stockDayYanPanChunJishu.setXiaJiangCount1(count);
                BigDecimal sum = stockDayYanPanChunJishu1.getXiaJiangSum1().add(yanPanVo.getWeiLaiChange1());
                stockDayYanPanChunJishu.setXiaJiangSum1(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanChunJishu.setXiaJiangMa1(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanChunJishu1.getShangZhangCount1())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanChunJishu.setXiaJiangRate1(rate);
            }
            if (yanPanVo.getWeiLaiChange2().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanChunJishu1.getShangZhangCount2().add(new BigDecimal(1));
                stockDayYanPanChunJishu.setShangZhangCount2(count);
                BigDecimal sum = stockDayYanPanChunJishu1.getShangZhangSum2().add(yanPanVo.getWeiLaiChange2());
                stockDayYanPanChunJishu.setShangZhangSum2(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanChunJishu.setShangZhangMa2(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanChunJishu1.getXiaJiangCount2())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanChunJishu.setShangZhangRate2(rate);
            } else {
                BigDecimal count = stockDayYanPanChunJishu1.getXiaJiangCount2().add(new BigDecimal(1));
                stockDayYanPanChunJishu.setXiaJiangCount2(count);
                BigDecimal sum = stockDayYanPanChunJishu1.getXiaJiangSum2().add(yanPanVo.getWeiLaiChange2());
                stockDayYanPanChunJishu.setXiaJiangSum2(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanChunJishu.setXiaJiangMa2(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanChunJishu1.getShangZhangCount2())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanChunJishu.setXiaJiangRate2(rate);
            }
            if (yanPanVo.getWeiLaiChange3().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanChunJishu1.getShangZhangCount3().add(new BigDecimal(1));
                stockDayYanPanChunJishu.setShangZhangCount3(count);
                BigDecimal sum = stockDayYanPanChunJishu1.getShangZhangSum3().add(yanPanVo.getWeiLaiChange3());
                stockDayYanPanChunJishu.setShangZhangSum3(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanChunJishu.setShangZhangMa3(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanChunJishu1.getXiaJiangCount3())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanChunJishu.setShangZhangRate3(rate);
            } else {
                BigDecimal count = stockDayYanPanChunJishu1.getXiaJiangCount3().add(new BigDecimal(1));
                stockDayYanPanChunJishu.setXiaJiangCount3(count);
                BigDecimal sum = stockDayYanPanChunJishu1.getXiaJiangSum3().add(yanPanVo.getWeiLaiChange3());
                stockDayYanPanChunJishu.setXiaJiangSum3(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanChunJishu.setXiaJiangMa3(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanChunJishu1.getShangZhangCount3())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanChunJishu.setXiaJiangRate3(rate);
            }
            if (yanPanVo.getWeiLaiChange5().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanChunJishu1.getShangZhangCount5().add(new BigDecimal(1));
                stockDayYanPanChunJishu.setShangZhangCount5(count);
                BigDecimal sum = stockDayYanPanChunJishu1.getShangZhangSum5().add(yanPanVo.getWeiLaiChange5());
                stockDayYanPanChunJishu.setShangZhangSum5(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanChunJishu.setShangZhangMa5(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanChunJishu1.getXiaJiangCount5())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanChunJishu.setShangZhangRate5(rate);
            } else {
                BigDecimal count = stockDayYanPanChunJishu1.getXiaJiangCount5().add(new BigDecimal(1));
                stockDayYanPanChunJishu.setXiaJiangCount5(count);
                BigDecimal sum = stockDayYanPanChunJishu1.getXiaJiangSum5().add(yanPanVo.getWeiLaiChange5());
                stockDayYanPanChunJishu.setXiaJiangSum5(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanChunJishu.setXiaJiangMa5(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanChunJishu1.getShangZhangCount5())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanChunJishu.setXiaJiangRate5(rate);
            }
            if (yanPanVo.getWeiLaiChange8().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanChunJishu1.getShangZhangCount8().add(new BigDecimal(1));
                stockDayYanPanChunJishu.setShangZhangCount8(count);
                BigDecimal sum = stockDayYanPanChunJishu1.getShangZhangSum8().add(yanPanVo.getWeiLaiChange8());
                stockDayYanPanChunJishu.setShangZhangSum8(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanChunJishu.setShangZhangMa8(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanChunJishu1.getXiaJiangCount8())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanChunJishu.setShangZhangRate8(rate);
            } else {
                BigDecimal count = stockDayYanPanChunJishu1.getXiaJiangCount8().add(new BigDecimal(1));
                stockDayYanPanChunJishu.setXiaJiangCount8(count);
                BigDecimal sum = stockDayYanPanChunJishu1.getXiaJiangSum8().add(yanPanVo.getWeiLaiChange8());
                stockDayYanPanChunJishu.setXiaJiangSum8(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanChunJishu.setXiaJiangMa8(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanChunJishu1.getShangZhangCount8())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanChunJishu.setXiaJiangRate8(rate);
            }
            if (yanPanVo.getWeiLaiChange13().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanChunJishu1.getShangZhangCount13().add(new BigDecimal(1));
                stockDayYanPanChunJishu.setShangZhangCount13(count);
                BigDecimal sum = stockDayYanPanChunJishu1.getShangZhangSum13().add(yanPanVo.getWeiLaiChange13());
                stockDayYanPanChunJishu.setShangZhangSum13(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanChunJishu.setShangZhangMa13(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanChunJishu1.getXiaJiangCount13())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanChunJishu.setShangZhangRate13(rate);
            } else {
                BigDecimal count = stockDayYanPanChunJishu1.getXiaJiangCount13().add(new BigDecimal(1));
                stockDayYanPanChunJishu.setXiaJiangCount13(count);
                BigDecimal sum = stockDayYanPanChunJishu1.getXiaJiangSum13().add(yanPanVo.getWeiLaiChange13());
                stockDayYanPanChunJishu.setXiaJiangSum13(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanChunJishu.setXiaJiangMa13(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanChunJishu1.getShangZhangCount13())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanChunJishu.setXiaJiangRate13(rate);
            }
            if (yanPanVo.getWeiLaiChange20().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanChunJishu1.getShangZhangCount20().add(new BigDecimal(1));
                stockDayYanPanChunJishu.setShangZhangCount20(count);
                BigDecimal sum = stockDayYanPanChunJishu1.getShangZhangSum20().add(yanPanVo.getWeiLaiChange20());
                stockDayYanPanChunJishu.setShangZhangSum20(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanChunJishu.setShangZhangMa20(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanChunJishu1.getXiaJiangCount20())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanChunJishu.setShangZhangRate20(rate);
            } else {
                BigDecimal count = stockDayYanPanChunJishu1.getXiaJiangCount20().add(new BigDecimal(1));
                stockDayYanPanChunJishu.setXiaJiangCount20(count);
                BigDecimal sum = stockDayYanPanChunJishu1.getXiaJiangSum20().add(yanPanVo.getWeiLaiChange20());
                stockDayYanPanChunJishu.setXiaJiangSum20(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanChunJishu.setXiaJiangMa20(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanChunJishu1.getShangZhangCount20())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanChunJishu.setXiaJiangRate20(rate);
            }
            String neirong = getChunJishuString(stockDayYanPanChunJishu);
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
