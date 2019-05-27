package com.stock.stockday.util;

import com.stock.apicommon.vo.YanPanVo;
import com.stock.stockday.entity.StockDayYanPan;
import com.stock.stockday.entity.StockDayYanPan24;
import com.stock.stockday.entity.StockDayYanPan33;
import org.springframework.beans.BeanUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

import static com.stock.stockday.util.GetEntity.get24entity;
import static com.stock.stockday.util.GetEntity.get33entity;
import static com.stock.stockday.util.GetFileName.getFileName24;
import static com.stock.stockday.util.GetFileName.getFileName33;
import static com.stock.stockday.util.GetString.get24String;
import static com.stock.stockday.util.GetString.get33String;

public class YanPan33SaveFileUtil {

    public static void yanPan33SaveFile(YanPanVo yanPanVo, StockDayYanPan stockDayYanPan) throws IOException {
        StringBuffer strPath = new StringBuffer();
        String strFileName;
        StockDayYanPan33 stockDayYanPan33=new StockDayYanPan33();
        BeanUtils.copyProperties(stockDayYanPan, stockDayYanPan33);
        strPath.setLength(0);
        strPath.append("D:/stock-day/day-yan-pan-33/");
        strFileName = getFileName33(stockDayYanPan33);
        File file3 = new File(strPath.toString() + strFileName + ".txt");
        if (!file3.exists()) {
            if (yanPanVo.getWeiLaiChange1().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPan33.setShangZhangCount1(new BigDecimal(1));
                stockDayYanPan33.setShangZhangMa1(yanPanVo.getWeiLaiChange1());
                stockDayYanPan33.setShangZhangSum1(yanPanVo.getWeiLaiChange1());
                stockDayYanPan33.setShangZhangRate1(new BigDecimal(50));
            } else {
                stockDayYanPan33.setXiaJiangCount1(new BigDecimal(1));
                stockDayYanPan33.setXiaJiangMa1(yanPanVo.getWeiLaiChange1());
                stockDayYanPan33.setXiaJiangSum1(yanPanVo.getWeiLaiChange1());
                stockDayYanPan33.setXiaJiangRate1(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange2().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPan33.setShangZhangCount2(new BigDecimal(1));
                stockDayYanPan33.setShangZhangMa2(yanPanVo.getWeiLaiChange2());
                stockDayYanPan33.setShangZhangSum2(yanPanVo.getWeiLaiChange2());
                stockDayYanPan33.setShangZhangRate2(new BigDecimal(50));
            } else {
                stockDayYanPan33.setXiaJiangCount2(new BigDecimal(1));
                stockDayYanPan33.setXiaJiangMa2(yanPanVo.getWeiLaiChange2());
                stockDayYanPan33.setXiaJiangSum2(yanPanVo.getWeiLaiChange2());
                stockDayYanPan33.setXiaJiangRate2(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange3().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPan33.setShangZhangCount3(new BigDecimal(1));
                stockDayYanPan33.setShangZhangMa3(yanPanVo.getWeiLaiChange3());
                stockDayYanPan33.setShangZhangSum3(yanPanVo.getWeiLaiChange3());
                stockDayYanPan33.setShangZhangRate3(new BigDecimal(50));
            } else {
                stockDayYanPan33.setXiaJiangCount3(new BigDecimal(1));
                stockDayYanPan33.setXiaJiangMa3(yanPanVo.getWeiLaiChange3());
                stockDayYanPan33.setXiaJiangSum3(yanPanVo.getWeiLaiChange3());
                stockDayYanPan33.setXiaJiangRate3(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange5().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPan33.setShangZhangCount5(new BigDecimal(1));
                stockDayYanPan33.setShangZhangMa5(yanPanVo.getWeiLaiChange5());
                stockDayYanPan33.setShangZhangSum5(yanPanVo.getWeiLaiChange5());
                stockDayYanPan33.setShangZhangRate5(new BigDecimal(50));
            } else {
                stockDayYanPan33.setXiaJiangCount5(new BigDecimal(1));
                stockDayYanPan33.setXiaJiangMa5(yanPanVo.getWeiLaiChange5());
                stockDayYanPan33.setXiaJiangSum5(yanPanVo.getWeiLaiChange5());
                stockDayYanPan33.setXiaJiangRate5(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange8().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPan33.setShangZhangCount8(new BigDecimal(1));
                stockDayYanPan33.setShangZhangMa8(yanPanVo.getWeiLaiChange8());
                stockDayYanPan33.setShangZhangSum8(yanPanVo.getWeiLaiChange8());
                stockDayYanPan33.setShangZhangRate8(new BigDecimal(50));
            } else {
                stockDayYanPan33.setXiaJiangCount8(new BigDecimal(1));
                stockDayYanPan33.setXiaJiangMa8(yanPanVo.getWeiLaiChange8());
                stockDayYanPan33.setXiaJiangSum8(yanPanVo.getWeiLaiChange8());
                stockDayYanPan33.setXiaJiangRate8(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange13().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPan33.setShangZhangCount13(new BigDecimal(1));
                stockDayYanPan33.setShangZhangMa13(yanPanVo.getWeiLaiChange13());
                stockDayYanPan33.setShangZhangSum13(yanPanVo.getWeiLaiChange8());
                stockDayYanPan33.setShangZhangRate13(new BigDecimal(50));
            } else {
                stockDayYanPan33.setXiaJiangCount13(new BigDecimal(1));
                stockDayYanPan33.setXiaJiangMa13(yanPanVo.getWeiLaiChange13());
                stockDayYanPan33.setXiaJiangSum13(yanPanVo.getWeiLaiChange13());
                stockDayYanPan33.setXiaJiangRate13(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange20().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPan33.setShangZhangCount20(new BigDecimal(1));
                stockDayYanPan33.setShangZhangMa20(yanPanVo.getWeiLaiChange20());
                stockDayYanPan33.setShangZhangSum20(yanPanVo.getWeiLaiChange20());
                stockDayYanPan33.setShangZhangRate20(new BigDecimal(50));
            } else {
                stockDayYanPan33.setXiaJiangCount20(new BigDecimal(1));
                stockDayYanPan33.setXiaJiangMa20(yanPanVo.getWeiLaiChange20());
                stockDayYanPan33.setXiaJiangSum20(yanPanVo.getWeiLaiChange20());
                stockDayYanPan33.setXiaJiangRate20(new BigDecimal(50));
            }
            String neirong = get33String(stockDayYanPan33);
            FileOutputStream fs = new FileOutputStream(strPath.toString() + strFileName + ".txt");
            byte[] buffer = neirong.getBytes();
            int byteread = buffer.length;
            //插入
            fs.write(buffer, 0, byteread);
            fs.flush();
            fs.close();
        } else {
            StockDayYanPan33 stockDayYanPan331=get33entity(strPath.toString() + strFileName);
            BeanUtils.copyProperties(stockDayYanPan331,stockDayYanPan33);
            if (yanPanVo.getWeiLaiChange1().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPan331.getShangZhangCount1().add(new BigDecimal(1));
                stockDayYanPan33.setShangZhangCount1(count);
                BigDecimal sum = stockDayYanPan331.getShangZhangSum1().add(yanPanVo.getWeiLaiChange1());
                stockDayYanPan33.setShangZhangSum1(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPan33.setShangZhangMa1(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPan331.getXiaJiangCount1())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPan33.setShangZhangRate1(rate);
            } else {
                BigDecimal count = stockDayYanPan331.getXiaJiangCount1().add(new BigDecimal(1));
                stockDayYanPan33.setXiaJiangCount1(count);
                BigDecimal sum = stockDayYanPan331.getXiaJiangSum1().add(yanPanVo.getWeiLaiChange1());
                stockDayYanPan33.setXiaJiangSum1(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPan33.setXiaJiangMa1(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPan331.getShangZhangCount1())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPan33.setXiaJiangRate1(rate);
            }
            if (yanPanVo.getWeiLaiChange2().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPan331.getShangZhangCount2().add(new BigDecimal(1));
                stockDayYanPan33.setShangZhangCount2(count);
                BigDecimal sum = stockDayYanPan331.getShangZhangSum2().add(yanPanVo.getWeiLaiChange2());
                stockDayYanPan33.setShangZhangSum2(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPan33.setShangZhangMa2(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPan331.getXiaJiangCount2())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPan33.setShangZhangRate2(rate);
            } else {
                BigDecimal count = stockDayYanPan331.getXiaJiangCount2().add(new BigDecimal(1));
                stockDayYanPan33.setXiaJiangCount2(count);
                BigDecimal sum = stockDayYanPan331.getXiaJiangSum2().add(yanPanVo.getWeiLaiChange2());
                stockDayYanPan33.setXiaJiangSum2(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPan33.setXiaJiangMa2(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPan331.getShangZhangCount2())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPan33.setXiaJiangRate2(rate);
            }
            if (yanPanVo.getWeiLaiChange3().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPan331.getShangZhangCount3().add(new BigDecimal(1));
                stockDayYanPan33.setShangZhangCount3(count);
                BigDecimal sum = stockDayYanPan331.getShangZhangSum3().add(yanPanVo.getWeiLaiChange3());
                stockDayYanPan33.setShangZhangSum3(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPan33.setShangZhangMa3(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPan331.getXiaJiangCount3())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPan33.setShangZhangRate3(rate);
            } else {
                BigDecimal count = stockDayYanPan331.getXiaJiangCount3().add(new BigDecimal(1));
                stockDayYanPan33.setXiaJiangCount3(count);
                BigDecimal sum = stockDayYanPan331.getXiaJiangSum3().add(yanPanVo.getWeiLaiChange3());
                stockDayYanPan33.setXiaJiangSum3(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPan33.setXiaJiangMa3(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPan331.getShangZhangCount3())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPan33.setXiaJiangRate3(rate);
            }
            if (yanPanVo.getWeiLaiChange5().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPan331.getShangZhangCount5().add(new BigDecimal(1));
                stockDayYanPan33.setShangZhangCount5(count);
                BigDecimal sum = stockDayYanPan331.getShangZhangSum5().add(yanPanVo.getWeiLaiChange5());
                stockDayYanPan33.setShangZhangSum5(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPan33.setShangZhangMa5(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPan331.getXiaJiangCount5())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPan33.setShangZhangRate5(rate);
            } else {
                BigDecimal count = stockDayYanPan331.getXiaJiangCount5().add(new BigDecimal(1));
                stockDayYanPan33.setXiaJiangCount5(count);
                BigDecimal sum = stockDayYanPan331.getXiaJiangSum5().add(yanPanVo.getWeiLaiChange5());
                stockDayYanPan33.setXiaJiangSum5(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPan33.setXiaJiangMa5(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPan331.getShangZhangCount5())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPan33.setXiaJiangRate5(rate);
            }
            if (yanPanVo.getWeiLaiChange8().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPan331.getShangZhangCount8().add(new BigDecimal(1));
                stockDayYanPan33.setShangZhangCount8(count);
                BigDecimal sum = stockDayYanPan331.getShangZhangSum8().add(yanPanVo.getWeiLaiChange8());
                stockDayYanPan33.setShangZhangSum8(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPan33.setShangZhangMa8(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPan331.getXiaJiangCount8())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPan33.setShangZhangRate8(rate);
            } else {
                BigDecimal count = stockDayYanPan331.getXiaJiangCount8().add(new BigDecimal(1));
                stockDayYanPan33.setXiaJiangCount8(count);
                BigDecimal sum = stockDayYanPan331.getXiaJiangSum8().add(yanPanVo.getWeiLaiChange8());
                stockDayYanPan33.setXiaJiangSum8(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPan33.setXiaJiangMa8(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPan331.getShangZhangCount8())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPan33.setXiaJiangRate8(rate);
            }
            if (yanPanVo.getWeiLaiChange13().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPan331.getShangZhangCount13().add(new BigDecimal(1));
                stockDayYanPan33.setShangZhangCount13(count);
                BigDecimal sum = stockDayYanPan331.getShangZhangSum13().add(yanPanVo.getWeiLaiChange13());
                stockDayYanPan33.setShangZhangSum13(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPan33.setShangZhangMa13(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPan331.getXiaJiangCount13())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPan33.setShangZhangRate13(rate);
            } else {
                BigDecimal count = stockDayYanPan331.getXiaJiangCount13().add(new BigDecimal(1));
                stockDayYanPan33.setXiaJiangCount13(count);
                BigDecimal sum = stockDayYanPan331.getXiaJiangSum13().add(yanPanVo.getWeiLaiChange13());
                stockDayYanPan33.setXiaJiangSum13(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPan33.setXiaJiangMa13(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPan331.getShangZhangCount13())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPan33.setXiaJiangRate13(rate);
            }
            if (yanPanVo.getWeiLaiChange20().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPan331.getShangZhangCount20().add(new BigDecimal(1));
                stockDayYanPan33.setShangZhangCount20(count);
                BigDecimal sum = stockDayYanPan331.getShangZhangSum20().add(yanPanVo.getWeiLaiChange20());
                stockDayYanPan33.setShangZhangSum20(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPan33.setShangZhangMa20(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPan331.getXiaJiangCount20())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPan33.setShangZhangRate20(rate);
            } else {
                BigDecimal count = stockDayYanPan331.getXiaJiangCount20().add(new BigDecimal(1));
                stockDayYanPan33.setXiaJiangCount20(count);
                BigDecimal sum = stockDayYanPan331.getXiaJiangSum20().add(yanPanVo.getWeiLaiChange20());
                stockDayYanPan33.setXiaJiangSum20(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPan33.setXiaJiangMa20(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPan331.getShangZhangCount20())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPan33.setXiaJiangRate20(rate);
            }
            String neirong = get33String(stockDayYanPan33);
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
