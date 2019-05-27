package com.stock.stockday.util;

import com.stock.apicommon.vo.YanPanVo;
import com.stock.stockday.entity.StockDayYanPan;
import com.stock.stockday.entity.StockDayYanPanDapan;
import org.springframework.beans.BeanUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

import static com.stock.stockday.util.GetEntity.getDaPanentity;
import static com.stock.stockday.util.GetFileName.getFileNameDp;
import static com.stock.stockday.util.GetString.getDaPanString;

public class DaPanSaveFileUtil {

    public static void DaPan(YanPanVo yanPanVo, StockDayYanPan stockDayYanPan) throws IOException {
        StringBuffer strPath = new StringBuffer();
        String strFileName;
        StockDayYanPanDapan stockDayYanPanDaPan=new StockDayYanPanDapan();
        BeanUtils.copyProperties(stockDayYanPan, stockDayYanPanDaPan);
        strPath.setLength(0);
        strPath.append("G:/stock-day/day-yan-pan-dapan/");
        strFileName = getFileNameDp(stockDayYanPanDaPan);
        File file6 = new File(strPath.toString() + strFileName + ".txt");
        if (!file6.exists()) {
            if (yanPanVo.getWeiLaiChange1().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanDaPan.setShangZhangCount1(new BigDecimal(1));
                stockDayYanPanDaPan.setShangZhangMa1(yanPanVo.getWeiLaiChange1());
                stockDayYanPanDaPan.setShangZhangSum1(yanPanVo.getWeiLaiChange1());
                stockDayYanPanDaPan.setShangZhangRate1(new BigDecimal(50));
            } else {
                stockDayYanPanDaPan.setXiaJiangCount1(new BigDecimal(1));
                stockDayYanPanDaPan.setXiaJiangMa1(yanPanVo.getWeiLaiChange1());
                stockDayYanPanDaPan.setXiaJiangSum1(yanPanVo.getWeiLaiChange1());
                stockDayYanPanDaPan.setXiaJiangRate1(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange2().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanDaPan.setShangZhangCount2(new BigDecimal(1));
                stockDayYanPanDaPan.setShangZhangMa2(yanPanVo.getWeiLaiChange2());
                stockDayYanPanDaPan.setShangZhangSum2(yanPanVo.getWeiLaiChange2());
                stockDayYanPanDaPan.setShangZhangRate2(new BigDecimal(50));
            } else {
                stockDayYanPanDaPan.setXiaJiangCount2(new BigDecimal(1));
                stockDayYanPanDaPan.setXiaJiangMa2(yanPanVo.getWeiLaiChange2());
                stockDayYanPanDaPan.setXiaJiangSum2(yanPanVo.getWeiLaiChange2());
                stockDayYanPanDaPan.setXiaJiangRate2(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange3().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanDaPan.setShangZhangCount3(new BigDecimal(1));
                stockDayYanPanDaPan.setShangZhangMa3(yanPanVo.getWeiLaiChange3());
                stockDayYanPanDaPan.setShangZhangSum3(yanPanVo.getWeiLaiChange3());
                stockDayYanPanDaPan.setShangZhangRate3(new BigDecimal(50));
            } else {
                stockDayYanPanDaPan.setXiaJiangCount3(new BigDecimal(1));
                stockDayYanPanDaPan.setXiaJiangMa3(yanPanVo.getWeiLaiChange3());
                stockDayYanPanDaPan.setXiaJiangSum3(yanPanVo.getWeiLaiChange3());
                stockDayYanPanDaPan.setXiaJiangRate3(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange5().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanDaPan.setShangZhangCount5(new BigDecimal(1));
                stockDayYanPanDaPan.setShangZhangMa5(yanPanVo.getWeiLaiChange5());
                stockDayYanPanDaPan.setShangZhangSum5(yanPanVo.getWeiLaiChange5());
                stockDayYanPanDaPan.setShangZhangRate5(new BigDecimal(50));
            } else {
                stockDayYanPanDaPan.setXiaJiangCount5(new BigDecimal(1));
                stockDayYanPanDaPan.setXiaJiangMa5(yanPanVo.getWeiLaiChange5());
                stockDayYanPanDaPan.setXiaJiangSum5(yanPanVo.getWeiLaiChange5());
                stockDayYanPanDaPan.setXiaJiangRate5(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange8().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanDaPan.setShangZhangCount8(new BigDecimal(1));
                stockDayYanPanDaPan.setShangZhangMa8(yanPanVo.getWeiLaiChange8());
                stockDayYanPanDaPan.setShangZhangSum8(yanPanVo.getWeiLaiChange8());
                stockDayYanPanDaPan.setShangZhangRate8(new BigDecimal(50));
            } else {
                stockDayYanPanDaPan.setXiaJiangCount8(new BigDecimal(1));
                stockDayYanPanDaPan.setXiaJiangMa8(yanPanVo.getWeiLaiChange8());
                stockDayYanPanDaPan.setXiaJiangSum8(yanPanVo.getWeiLaiChange8());
                stockDayYanPanDaPan.setXiaJiangRate8(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange13().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanDaPan.setShangZhangCount13(new BigDecimal(1));
                stockDayYanPanDaPan.setShangZhangMa13(yanPanVo.getWeiLaiChange13());
                stockDayYanPanDaPan.setShangZhangSum13(yanPanVo.getWeiLaiChange8());
                stockDayYanPanDaPan.setShangZhangRate13(new BigDecimal(50));
            } else {
                stockDayYanPanDaPan.setXiaJiangCount13(new BigDecimal(1));
                stockDayYanPanDaPan.setXiaJiangMa13(yanPanVo.getWeiLaiChange13());
                stockDayYanPanDaPan.setXiaJiangSum13(yanPanVo.getWeiLaiChange13());
                stockDayYanPanDaPan.setXiaJiangRate13(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange20().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanDaPan.setShangZhangCount20(new BigDecimal(1));
                stockDayYanPanDaPan.setShangZhangMa20(yanPanVo.getWeiLaiChange20());
                stockDayYanPanDaPan.setShangZhangSum20(yanPanVo.getWeiLaiChange20());
                stockDayYanPanDaPan.setShangZhangRate20(new BigDecimal(50));
            } else {
                stockDayYanPanDaPan.setXiaJiangCount20(new BigDecimal(1));
                stockDayYanPanDaPan.setXiaJiangMa20(yanPanVo.getWeiLaiChange20());
                stockDayYanPanDaPan.setXiaJiangSum20(yanPanVo.getWeiLaiChange20());
                stockDayYanPanDaPan.setXiaJiangRate20(new BigDecimal(50));
            }
            String neirong = getDaPanString(stockDayYanPanDaPan);
            FileOutputStream fs = new FileOutputStream(strPath.toString() + strFileName + ".txt");
            byte[] buffer = neirong.getBytes();
            int byteread = buffer.length;
            //插入
            fs.write(buffer, 0, byteread);
            fs.flush();
            fs.close();
        } else {
            StockDayYanPanDapan stockDayYanPanDaPan1 = getDaPanentity(strPath.toString() + strFileName);
            BeanUtils.copyProperties(stockDayYanPanDaPan1,stockDayYanPanDaPan);
            if (yanPanVo.getWeiLaiChange1().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanDaPan1.getShangZhangCount1().add(new BigDecimal(1));
                stockDayYanPanDaPan.setShangZhangCount1(count);
                BigDecimal sum = stockDayYanPanDaPan1.getShangZhangSum1().add(yanPanVo.getWeiLaiChange1());
                stockDayYanPanDaPan.setShangZhangSum1(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanDaPan.setShangZhangMa1(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanDaPan1.getXiaJiangCount1())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanDaPan.setShangZhangRate1(rate);
            } else {
                BigDecimal count = stockDayYanPanDaPan1.getXiaJiangCount1().add(new BigDecimal(1));
                stockDayYanPanDaPan.setXiaJiangCount1(count);
                BigDecimal sum = stockDayYanPanDaPan1.getXiaJiangSum1().add(yanPanVo.getWeiLaiChange1());
                stockDayYanPanDaPan.setXiaJiangSum1(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanDaPan.setXiaJiangMa1(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanDaPan1.getShangZhangCount1())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanDaPan.setXiaJiangRate1(rate);
            }
            if (yanPanVo.getWeiLaiChange2().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanDaPan1.getShangZhangCount2().add(new BigDecimal(1));
                stockDayYanPanDaPan.setShangZhangCount2(count);
                BigDecimal sum = stockDayYanPanDaPan1.getShangZhangSum2().add(yanPanVo.getWeiLaiChange2());
                stockDayYanPanDaPan.setShangZhangSum2(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanDaPan.setShangZhangMa2(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanDaPan1.getXiaJiangCount2())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanDaPan.setShangZhangRate2(rate);
            } else {
                BigDecimal count = stockDayYanPanDaPan1.getXiaJiangCount2().add(new BigDecimal(1));
                stockDayYanPanDaPan.setXiaJiangCount2(count);
                BigDecimal sum = stockDayYanPanDaPan1.getXiaJiangSum2().add(yanPanVo.getWeiLaiChange2());
                stockDayYanPanDaPan.setXiaJiangSum2(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanDaPan.setXiaJiangMa2(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanDaPan1.getShangZhangCount2())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanDaPan.setXiaJiangRate2(rate);
            }
            if (yanPanVo.getWeiLaiChange3().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanDaPan1.getShangZhangCount3().add(new BigDecimal(1));
                stockDayYanPanDaPan.setShangZhangCount3(count);
                BigDecimal sum = stockDayYanPanDaPan1.getShangZhangSum3().add(yanPanVo.getWeiLaiChange3());
                stockDayYanPanDaPan.setShangZhangSum3(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanDaPan.setShangZhangMa3(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanDaPan1.getXiaJiangCount3())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanDaPan.setShangZhangRate3(rate);
            } else {
                BigDecimal count = stockDayYanPanDaPan1.getXiaJiangCount3().add(new BigDecimal(1));
                stockDayYanPanDaPan.setXiaJiangCount3(count);
                BigDecimal sum = stockDayYanPanDaPan1.getXiaJiangSum3().add(yanPanVo.getWeiLaiChange3());
                stockDayYanPanDaPan.setXiaJiangSum3(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanDaPan.setXiaJiangMa3(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanDaPan1.getShangZhangCount3())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanDaPan.setXiaJiangRate3(rate);
            }
            if (yanPanVo.getWeiLaiChange5().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanDaPan1.getShangZhangCount5().add(new BigDecimal(1));
                stockDayYanPanDaPan.setShangZhangCount5(count);
                BigDecimal sum = stockDayYanPanDaPan1.getShangZhangSum5().add(yanPanVo.getWeiLaiChange5());
                stockDayYanPanDaPan.setShangZhangSum5(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanDaPan.setShangZhangMa5(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanDaPan1.getXiaJiangCount5())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanDaPan.setShangZhangRate5(rate);
            } else {
                BigDecimal count = stockDayYanPanDaPan1.getXiaJiangCount5().add(new BigDecimal(1));
                stockDayYanPanDaPan.setXiaJiangCount5(count);
                BigDecimal sum = stockDayYanPanDaPan1.getXiaJiangSum5().add(yanPanVo.getWeiLaiChange5());
                stockDayYanPanDaPan.setXiaJiangSum5(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanDaPan.setXiaJiangMa5(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanDaPan1.getShangZhangCount5())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanDaPan.setXiaJiangRate5(rate);
            }
            if (yanPanVo.getWeiLaiChange8().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanDaPan1.getShangZhangCount8().add(new BigDecimal(1));
                stockDayYanPanDaPan.setShangZhangCount8(count);
                BigDecimal sum = stockDayYanPanDaPan1.getShangZhangSum8().add(yanPanVo.getWeiLaiChange8());
                stockDayYanPanDaPan.setShangZhangSum8(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanDaPan.setShangZhangMa8(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanDaPan1.getXiaJiangCount8())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanDaPan.setShangZhangRate8(rate);
            } else {
                BigDecimal count = stockDayYanPanDaPan1.getXiaJiangCount8().add(new BigDecimal(1));
                stockDayYanPanDaPan.setXiaJiangCount8(count);
                BigDecimal sum = stockDayYanPanDaPan1.getXiaJiangSum8().add(yanPanVo.getWeiLaiChange8());
                stockDayYanPanDaPan.setXiaJiangSum8(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanDaPan.setXiaJiangMa8(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanDaPan1.getShangZhangCount8())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanDaPan.setXiaJiangRate8(rate);
            }
            if (yanPanVo.getWeiLaiChange13().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanDaPan1.getShangZhangCount13().add(new BigDecimal(1));
                stockDayYanPanDaPan.setShangZhangCount13(count);
                BigDecimal sum = stockDayYanPanDaPan1.getShangZhangSum13().add(yanPanVo.getWeiLaiChange13());
                stockDayYanPanDaPan.setShangZhangSum13(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanDaPan.setShangZhangMa13(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanDaPan1.getXiaJiangCount13())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanDaPan.setShangZhangRate13(rate);
            } else {
                BigDecimal count = stockDayYanPanDaPan1.getXiaJiangCount13().add(new BigDecimal(1));
                stockDayYanPanDaPan.setXiaJiangCount13(count);
                BigDecimal sum = stockDayYanPanDaPan1.getXiaJiangSum13().add(yanPanVo.getWeiLaiChange13());
                stockDayYanPanDaPan.setXiaJiangSum13(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanDaPan.setXiaJiangMa13(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanDaPan1.getShangZhangCount13())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanDaPan.setXiaJiangRate13(rate);
            }
            if (yanPanVo.getWeiLaiChange20().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanDaPan1.getShangZhangCount20().add(new BigDecimal(1));
                stockDayYanPanDaPan.setShangZhangCount20(count);
                BigDecimal sum = stockDayYanPanDaPan1.getShangZhangSum20().add(yanPanVo.getWeiLaiChange20());
                stockDayYanPanDaPan.setShangZhangSum20(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanDaPan.setShangZhangMa20(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanDaPan1.getXiaJiangCount20())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanDaPan.setShangZhangRate20(rate);
            } else {
                BigDecimal count = stockDayYanPanDaPan1.getXiaJiangCount20().add(new BigDecimal(1));
                stockDayYanPanDaPan.setXiaJiangCount20(count);
                BigDecimal sum = stockDayYanPanDaPan1.getXiaJiangSum20().add(yanPanVo.getWeiLaiChange20());
                stockDayYanPanDaPan.setXiaJiangSum20(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanDaPan.setXiaJiangMa20(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanDaPan1.getShangZhangCount20())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanDaPan.setXiaJiangRate20(rate);
            }
            String neirong = getDaPanString(stockDayYanPanDaPan);
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
