package com.stock.stockday.util;

import com.stock.apicommon.vo.YanPanVo;
import com.stock.stockday.entity.StockDayYanPan;
import com.stock.stockday.entity.StockDayYanPanBenpan;
import com.stock.stockday.entity.StockDayYanPanChunJishu;
import org.springframework.beans.BeanUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

import static com.stock.stockday.util.GetEntity.getBenpanentity;
import static com.stock.stockday.util.GetEntity.getChunJishuentity;
import static com.stock.stockday.util.GetFileName.getFileNameBp;
import static com.stock.stockday.util.GetFileName.getFileNameCjs;
import static com.stock.stockday.util.GetString.getBenpanString;
import static com.stock.stockday.util.GetString.getChunJishuString;

public class BenPanSaveFileUtil {

    public static void benPan(YanPanVo yanPanVo, StockDayYanPan stockDayYanPan) throws IOException {
        StringBuffer strPath = new StringBuffer();
        String strFileName;
        StockDayYanPanBenpan stockDayYanPanBenpan=new StockDayYanPanBenpan();
        BeanUtils.copyProperties(stockDayYanPan, stockDayYanPanBenpan);
        strPath.setLength(0);
        strPath.append("D:/stock-day/day-yan-pan-benpan/");
        strFileName = getFileNameBp(stockDayYanPanBenpan);
        File file5 = new File(strPath.toString() + strFileName + ".txt");
        if (!file5.exists()) {
            if (yanPanVo.getWeiLaiChange1().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanBenpan.setShangZhangCount1(new BigDecimal(1));
                stockDayYanPanBenpan.setShangZhangMa1(yanPanVo.getWeiLaiChange1());
                stockDayYanPanBenpan.setShangZhangSum1(yanPanVo.getWeiLaiChange1());
                stockDayYanPanBenpan.setShangZhangRate1(new BigDecimal(50));
            } else {
                stockDayYanPanBenpan.setXiaJiangCount1(new BigDecimal(1));
                stockDayYanPanBenpan.setXiaJiangMa1(yanPanVo.getWeiLaiChange1());
                stockDayYanPanBenpan.setXiaJiangSum1(yanPanVo.getWeiLaiChange1());
                stockDayYanPanBenpan.setXiaJiangRate1(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange2().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanBenpan.setShangZhangCount2(new BigDecimal(1));
                stockDayYanPanBenpan.setShangZhangMa2(yanPanVo.getWeiLaiChange2());
                stockDayYanPanBenpan.setShangZhangSum2(yanPanVo.getWeiLaiChange2());
                stockDayYanPanBenpan.setShangZhangRate2(new BigDecimal(50));
            } else {
                stockDayYanPanBenpan.setXiaJiangCount2(new BigDecimal(1));
                stockDayYanPanBenpan.setXiaJiangMa2(yanPanVo.getWeiLaiChange2());
                stockDayYanPanBenpan.setXiaJiangSum2(yanPanVo.getWeiLaiChange2());
                stockDayYanPanBenpan.setXiaJiangRate2(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange3().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanBenpan.setShangZhangCount3(new BigDecimal(1));
                stockDayYanPanBenpan.setShangZhangMa3(yanPanVo.getWeiLaiChange3());
                stockDayYanPanBenpan.setShangZhangSum3(yanPanVo.getWeiLaiChange3());
                stockDayYanPanBenpan.setShangZhangRate3(new BigDecimal(50));
            } else {
                stockDayYanPanBenpan.setXiaJiangCount3(new BigDecimal(1));
                stockDayYanPanBenpan.setXiaJiangMa3(yanPanVo.getWeiLaiChange3());
                stockDayYanPanBenpan.setXiaJiangSum3(yanPanVo.getWeiLaiChange3());
                stockDayYanPanBenpan.setXiaJiangRate3(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange5().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanBenpan.setShangZhangCount5(new BigDecimal(1));
                stockDayYanPanBenpan.setShangZhangMa5(yanPanVo.getWeiLaiChange5());
                stockDayYanPanBenpan.setShangZhangSum5(yanPanVo.getWeiLaiChange5());
                stockDayYanPanBenpan.setShangZhangRate5(new BigDecimal(50));
            } else {
                stockDayYanPanBenpan.setXiaJiangCount5(new BigDecimal(1));
                stockDayYanPanBenpan.setXiaJiangMa5(yanPanVo.getWeiLaiChange5());
                stockDayYanPanBenpan.setXiaJiangSum5(yanPanVo.getWeiLaiChange5());
                stockDayYanPanBenpan.setXiaJiangRate5(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange8().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanBenpan.setShangZhangCount8(new BigDecimal(1));
                stockDayYanPanBenpan.setShangZhangMa8(yanPanVo.getWeiLaiChange8());
                stockDayYanPanBenpan.setShangZhangSum8(yanPanVo.getWeiLaiChange8());
                stockDayYanPanBenpan.setShangZhangRate8(new BigDecimal(50));
            } else {
                stockDayYanPanBenpan.setXiaJiangCount8(new BigDecimal(1));
                stockDayYanPanBenpan.setXiaJiangMa8(yanPanVo.getWeiLaiChange8());
                stockDayYanPanBenpan.setXiaJiangSum8(yanPanVo.getWeiLaiChange8());
                stockDayYanPanBenpan.setXiaJiangRate8(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange13().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanBenpan.setShangZhangCount13(new BigDecimal(1));
                stockDayYanPanBenpan.setShangZhangMa13(yanPanVo.getWeiLaiChange13());
                stockDayYanPanBenpan.setShangZhangSum13(yanPanVo.getWeiLaiChange8());
                stockDayYanPanBenpan.setShangZhangRate13(new BigDecimal(50));
            } else {
                stockDayYanPanBenpan.setXiaJiangCount13(new BigDecimal(1));
                stockDayYanPanBenpan.setXiaJiangMa13(yanPanVo.getWeiLaiChange13());
                stockDayYanPanBenpan.setXiaJiangSum13(yanPanVo.getWeiLaiChange13());
                stockDayYanPanBenpan.setXiaJiangRate13(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange20().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanBenpan.setShangZhangCount20(new BigDecimal(1));
                stockDayYanPanBenpan.setShangZhangMa20(yanPanVo.getWeiLaiChange20());
                stockDayYanPanBenpan.setShangZhangSum20(yanPanVo.getWeiLaiChange20());
                stockDayYanPanBenpan.setShangZhangRate20(new BigDecimal(50));
            } else {
                stockDayYanPanBenpan.setXiaJiangCount20(new BigDecimal(1));
                stockDayYanPanBenpan.setXiaJiangMa20(yanPanVo.getWeiLaiChange20());
                stockDayYanPanBenpan.setXiaJiangSum20(yanPanVo.getWeiLaiChange20());
                stockDayYanPanBenpan.setXiaJiangRate20(new BigDecimal(50));
            }
            String neirong = getBenpanString(stockDayYanPanBenpan);
            FileOutputStream fs = new FileOutputStream(strPath.toString() + strFileName + ".txt");
            byte[] buffer = neirong.getBytes();
            int byteread = buffer.length;
            //插入
            fs.write(buffer, 0, byteread);
            fs.flush();
            fs.close();
        } else {
            StockDayYanPanBenpan stockDayYanPanBenpan1=getBenpanentity(strPath.toString() + strFileName);
            BeanUtils.copyProperties(stockDayYanPanBenpan1,stockDayYanPanBenpan);
            if (yanPanVo.getWeiLaiChange1().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanBenpan1.getShangZhangCount1().add(new BigDecimal(1));
                stockDayYanPanBenpan.setShangZhangCount1(count);
                BigDecimal sum = stockDayYanPanBenpan1.getShangZhangSum1().add(yanPanVo.getWeiLaiChange1());
                stockDayYanPanBenpan.setShangZhangSum1(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanBenpan.setShangZhangMa1(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanBenpan1.getXiaJiangCount1())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanBenpan.setShangZhangRate1(rate);
            } else {
                BigDecimal count = stockDayYanPanBenpan1.getXiaJiangCount1().add(new BigDecimal(1));
                stockDayYanPanBenpan.setXiaJiangCount1(count);
                BigDecimal sum = stockDayYanPanBenpan1.getXiaJiangSum1().add(yanPanVo.getWeiLaiChange1());
                stockDayYanPanBenpan.setXiaJiangSum1(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanBenpan.setXiaJiangMa1(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanBenpan1.getShangZhangCount1())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanBenpan.setXiaJiangRate1(rate);
            }
            if (yanPanVo.getWeiLaiChange2().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanBenpan1.getShangZhangCount2().add(new BigDecimal(1));
                stockDayYanPanBenpan.setShangZhangCount2(count);
                BigDecimal sum = stockDayYanPanBenpan1.getShangZhangSum2().add(yanPanVo.getWeiLaiChange2());
                stockDayYanPanBenpan.setShangZhangSum2(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanBenpan.setShangZhangMa2(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanBenpan1.getXiaJiangCount2())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanBenpan.setShangZhangRate2(rate);
            } else {
                BigDecimal count = stockDayYanPanBenpan1.getXiaJiangCount2().add(new BigDecimal(1));
                stockDayYanPanBenpan.setXiaJiangCount2(count);
                BigDecimal sum = stockDayYanPanBenpan1.getXiaJiangSum2().add(yanPanVo.getWeiLaiChange2());
                stockDayYanPanBenpan.setXiaJiangSum2(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanBenpan.setXiaJiangMa2(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanBenpan1.getShangZhangCount2())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanBenpan.setXiaJiangRate2(rate);
            }
            if (yanPanVo.getWeiLaiChange3().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanBenpan1.getShangZhangCount3().add(new BigDecimal(1));
                stockDayYanPanBenpan.setShangZhangCount3(count);
                BigDecimal sum = stockDayYanPanBenpan1.getShangZhangSum3().add(yanPanVo.getWeiLaiChange3());
                stockDayYanPanBenpan.setShangZhangSum3(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanBenpan.setShangZhangMa3(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanBenpan1.getXiaJiangCount3())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanBenpan.setShangZhangRate3(rate);
            } else {
                BigDecimal count = stockDayYanPanBenpan1.getXiaJiangCount3().add(new BigDecimal(1));
                stockDayYanPanBenpan.setXiaJiangCount3(count);
                BigDecimal sum = stockDayYanPanBenpan1.getXiaJiangSum3().add(yanPanVo.getWeiLaiChange3());
                stockDayYanPanBenpan.setXiaJiangSum3(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanBenpan.setXiaJiangMa3(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanBenpan1.getShangZhangCount3())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanBenpan.setXiaJiangRate3(rate);
            }
            if (yanPanVo.getWeiLaiChange5().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanBenpan1.getShangZhangCount5().add(new BigDecimal(1));
                stockDayYanPanBenpan.setShangZhangCount5(count);
                BigDecimal sum = stockDayYanPanBenpan1.getShangZhangSum5().add(yanPanVo.getWeiLaiChange5());
                stockDayYanPanBenpan.setShangZhangSum5(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanBenpan.setShangZhangMa5(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanBenpan1.getXiaJiangCount5())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanBenpan.setShangZhangRate5(rate);
            } else {
                BigDecimal count = stockDayYanPanBenpan1.getXiaJiangCount5().add(new BigDecimal(1));
                stockDayYanPanBenpan.setXiaJiangCount5(count);
                BigDecimal sum = stockDayYanPanBenpan1.getXiaJiangSum5().add(yanPanVo.getWeiLaiChange5());
                stockDayYanPanBenpan.setXiaJiangSum5(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanBenpan.setXiaJiangMa5(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanBenpan1.getShangZhangCount5())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanBenpan.setXiaJiangRate5(rate);
            }
            if (yanPanVo.getWeiLaiChange8().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanBenpan1.getShangZhangCount8().add(new BigDecimal(1));
                stockDayYanPanBenpan.setShangZhangCount8(count);
                BigDecimal sum = stockDayYanPanBenpan1.getShangZhangSum8().add(yanPanVo.getWeiLaiChange8());
                stockDayYanPanBenpan.setShangZhangSum8(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanBenpan.setShangZhangMa8(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanBenpan1.getXiaJiangCount8())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanBenpan.setShangZhangRate8(rate);
            } else {
                BigDecimal count = stockDayYanPanBenpan1.getXiaJiangCount8().add(new BigDecimal(1));
                stockDayYanPanBenpan.setXiaJiangCount8(count);
                BigDecimal sum = stockDayYanPanBenpan1.getXiaJiangSum8().add(yanPanVo.getWeiLaiChange8());
                stockDayYanPanBenpan.setXiaJiangSum8(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanBenpan.setXiaJiangMa8(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanBenpan1.getShangZhangCount8())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanBenpan.setXiaJiangRate8(rate);
            }
            if (yanPanVo.getWeiLaiChange13().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanBenpan1.getShangZhangCount13().add(new BigDecimal(1));
                stockDayYanPanBenpan.setShangZhangCount13(count);
                BigDecimal sum = stockDayYanPanBenpan1.getShangZhangSum13().add(yanPanVo.getWeiLaiChange13());
                stockDayYanPanBenpan.setShangZhangSum13(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanBenpan.setShangZhangMa13(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanBenpan1.getXiaJiangCount13())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanBenpan.setShangZhangRate13(rate);
            } else {
                BigDecimal count = stockDayYanPanBenpan1.getXiaJiangCount13().add(new BigDecimal(1));
                stockDayYanPanBenpan.setXiaJiangCount13(count);
                BigDecimal sum = stockDayYanPanBenpan1.getXiaJiangSum13().add(yanPanVo.getWeiLaiChange13());
                stockDayYanPanBenpan.setXiaJiangSum13(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanBenpan.setXiaJiangMa13(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanBenpan1.getShangZhangCount13())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanBenpan.setXiaJiangRate13(rate);
            }
            if (yanPanVo.getWeiLaiChange20().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanBenpan1.getShangZhangCount20().add(new BigDecimal(1));
                stockDayYanPanBenpan.setShangZhangCount20(count);
                BigDecimal sum = stockDayYanPanBenpan1.getShangZhangSum20().add(yanPanVo.getWeiLaiChange20());
                stockDayYanPanBenpan.setShangZhangSum20(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanBenpan.setShangZhangMa20(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanBenpan1.getXiaJiangCount20())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanBenpan.setShangZhangRate20(rate);
            } else {
                BigDecimal count = stockDayYanPanBenpan1.getXiaJiangCount20().add(new BigDecimal(1));
                stockDayYanPanBenpan.setXiaJiangCount20(count);
                BigDecimal sum = stockDayYanPanBenpan1.getXiaJiangSum20().add(yanPanVo.getWeiLaiChange20());
                stockDayYanPanBenpan.setXiaJiangSum20(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanBenpan.setXiaJiangMa20(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanBenpan1.getShangZhangCount20())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanBenpan.setXiaJiangRate20(rate);
            }
            String neirong = getBenpanString(stockDayYanPanBenpan);
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
