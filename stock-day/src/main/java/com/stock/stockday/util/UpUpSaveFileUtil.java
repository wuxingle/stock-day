package com.stock.stockday.util;

import com.stock.apicommon.vo.DaPanRateOfChangeVo;
import com.stock.apicommon.vo.RateOfChangeVo;
import com.stock.apicommon.vo.YanPanVo;
import com.stock.stockday.entity.StockDayYanPan;
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

import static com.stock.stockday.util.GetEntity.getUpUpentity;
import static com.stock.stockday.util.GetFileName.getFileName;
import static com.stock.stockday.util.GetString.getUpUpString;

public class UpUpSaveFileUtil {

    public static void upUpSaveFile(DaPanRateOfChangeVo daPanRateOfChangeVo, RateOfChangeVo rateOfChangeVo, YanPanVo yanPanVo, StockDayYanPan stockDayYanPan) throws IOException {
        StringBuffer strPath = new StringBuffer();
        String strFileName;
        strPath.append("D:/stock-day/");
        if(daPanRateOfChangeVo!=null&&daPanRateOfChangeVo.getBeforeDPChange3()!=null) {
            if (daPanRateOfChangeVo.getBeforeDPChange3().compareTo(new BigDecimal(0)) > 0) {
                if (rateOfChangeVo.getBeforeChange3().compareTo(new BigDecimal(0)) > 0) {
                    strPath.append("大盘3大于0/本盘3大于0/");
                    strFileName = getFileName(stockDayYanPan);
                    File file = new File(strPath.toString() + strFileName + ".txt");
                    StockDayYanPanUpUp stockDayYanPanUpUp = new StockDayYanPanUpUp();
                    BeanUtils.copyProperties(stockDayYanPan, stockDayYanPanUpUp);
                    if (!file.exists()) {
                        if (yanPanVo.getWeiLaiChange1().compareTo(new BigDecimal(0)) > 0) {
                            stockDayYanPanUpUp.setShangZhangCount1(new BigDecimal(1));
                            stockDayYanPanUpUp.setShangZhangMa1(yanPanVo.getWeiLaiChange1());
                            stockDayYanPanUpUp.setShangZhangSum1(yanPanVo.getWeiLaiChange1());
                            stockDayYanPanUpUp.setShangZhangRate1(new BigDecimal(50));
                        } else {
                            stockDayYanPanUpUp.setXiaJiangCount1(new BigDecimal(1));
                            stockDayYanPanUpUp.setXiaJiangMa1(yanPanVo.getWeiLaiChange1());
                            stockDayYanPanUpUp.setXiaJiangSum1(yanPanVo.getWeiLaiChange1());
                            stockDayYanPanUpUp.setXiaJiangRate1(new BigDecimal(50));
                        }
                        if (yanPanVo.getWeiLaiChange2().compareTo(new BigDecimal(0)) > 0) {
                            stockDayYanPanUpUp.setShangZhangCount2(new BigDecimal(1));
                            stockDayYanPanUpUp.setShangZhangMa2(yanPanVo.getWeiLaiChange2());
                            stockDayYanPanUpUp.setShangZhangSum2(yanPanVo.getWeiLaiChange2());
                            stockDayYanPanUpUp.setShangZhangRate2(new BigDecimal(50));
                        } else {
                            stockDayYanPanUpUp.setXiaJiangCount2(new BigDecimal(1));
                            stockDayYanPanUpUp.setXiaJiangMa2(yanPanVo.getWeiLaiChange2());
                            stockDayYanPanUpUp.setXiaJiangSum2(yanPanVo.getWeiLaiChange2());
                            stockDayYanPanUpUp.setXiaJiangRate2(new BigDecimal(50));
                        }
                        if (yanPanVo.getWeiLaiChange3().compareTo(new BigDecimal(0)) > 0) {
                            stockDayYanPanUpUp.setShangZhangCount3(new BigDecimal(1));
                            stockDayYanPanUpUp.setShangZhangMa3(yanPanVo.getWeiLaiChange3());
                            stockDayYanPanUpUp.setShangZhangSum3(yanPanVo.getWeiLaiChange3());
                            stockDayYanPanUpUp.setShangZhangRate3(new BigDecimal(50));
                        } else {
                            stockDayYanPanUpUp.setXiaJiangCount3(new BigDecimal(1));
                            stockDayYanPanUpUp.setXiaJiangMa3(yanPanVo.getWeiLaiChange3());
                            stockDayYanPanUpUp.setXiaJiangSum3(yanPanVo.getWeiLaiChange3());
                            stockDayYanPanUpUp.setXiaJiangRate3(new BigDecimal(50));
                        }
                        if (yanPanVo.getWeiLaiChange5().compareTo(new BigDecimal(0)) > 0) {
                            stockDayYanPanUpUp.setShangZhangCount5(new BigDecimal(1));
                            stockDayYanPanUpUp.setShangZhangMa5(yanPanVo.getWeiLaiChange5());
                            stockDayYanPanUpUp.setShangZhangSum5(yanPanVo.getWeiLaiChange5());
                            stockDayYanPanUpUp.setShangZhangRate5(new BigDecimal(50));
                        } else {
                            stockDayYanPanUpUp.setXiaJiangCount5(new BigDecimal(1));
                            stockDayYanPanUpUp.setXiaJiangMa5(yanPanVo.getWeiLaiChange5());
                            stockDayYanPanUpUp.setXiaJiangSum5(yanPanVo.getWeiLaiChange5());
                            stockDayYanPanUpUp.setXiaJiangRate5(new BigDecimal(50));
                        }
                        if (yanPanVo.getWeiLaiChange8().compareTo(new BigDecimal(0)) > 0) {
                            stockDayYanPanUpUp.setShangZhangCount8(new BigDecimal(1));
                            stockDayYanPanUpUp.setShangZhangMa8(yanPanVo.getWeiLaiChange8());
                            stockDayYanPanUpUp.setShangZhangSum8(yanPanVo.getWeiLaiChange8());
                            stockDayYanPanUpUp.setShangZhangRate8(new BigDecimal(50));
                        } else {
                            stockDayYanPanUpUp.setXiaJiangCount8(new BigDecimal(1));
                            stockDayYanPanUpUp.setXiaJiangMa8(yanPanVo.getWeiLaiChange8());
                            stockDayYanPanUpUp.setXiaJiangSum8(yanPanVo.getWeiLaiChange8());
                            stockDayYanPanUpUp.setXiaJiangRate8(new BigDecimal(50));
                        }
                        if (yanPanVo.getWeiLaiChange13().compareTo(new BigDecimal(0)) > 0) {
                            stockDayYanPanUpUp.setShangZhangCount13(new BigDecimal(1));
                            stockDayYanPanUpUp.setShangZhangMa13(yanPanVo.getWeiLaiChange13());
                            stockDayYanPanUpUp.setShangZhangSum13(yanPanVo.getWeiLaiChange8());
                            stockDayYanPanUpUp.setShangZhangRate13(new BigDecimal(50));
                        } else {
                            stockDayYanPanUpUp.setXiaJiangCount13(new BigDecimal(1));
                            stockDayYanPanUpUp.setXiaJiangMa13(yanPanVo.getWeiLaiChange13());
                            stockDayYanPanUpUp.setXiaJiangSum13(yanPanVo.getWeiLaiChange13());
                            stockDayYanPanUpUp.setXiaJiangRate13(new BigDecimal(50));
                        }
                        if (yanPanVo.getWeiLaiChange20().compareTo(new BigDecimal(0)) > 0) {
                            stockDayYanPanUpUp.setShangZhangCount20(new BigDecimal(1));
                            stockDayYanPanUpUp.setShangZhangMa20(yanPanVo.getWeiLaiChange20());
                            stockDayYanPanUpUp.setShangZhangSum20(yanPanVo.getWeiLaiChange20());
                            stockDayYanPanUpUp.setShangZhangRate20(new BigDecimal(50));
                        } else {
                            stockDayYanPanUpUp.setXiaJiangCount20(new BigDecimal(1));
                            stockDayYanPanUpUp.setXiaJiangMa20(yanPanVo.getWeiLaiChange20());
                            stockDayYanPanUpUp.setXiaJiangSum20(yanPanVo.getWeiLaiChange20());
                            stockDayYanPanUpUp.setXiaJiangRate20(new BigDecimal(50));
                        }
                        String neirong = getUpUpString(stockDayYanPanUpUp);
                        FileOutputStream fs = new FileOutputStream(strPath.toString() + strFileName + ".txt");
                        byte[] buffer = neirong.getBytes();
                        int byteread = buffer.length;
                        //插入
                        fs.write(buffer, 0, byteread);
                        fs.flush();
                        fs.close();
                    } else {
                        StockDayYanPanUpUp stockDayYanPanUpUp1 = getUpUpentity(strPath.toString() + strFileName);
                        BeanUtils.copyProperties(stockDayYanPanUpUp1,stockDayYanPanUpUp);
                        if (yanPanVo.getWeiLaiChange1().compareTo(new BigDecimal(0)) > 0) {
                            BigDecimal count = stockDayYanPanUpUp1.getShangZhangCount1().add(new BigDecimal(1));
                            stockDayYanPanUpUp.setShangZhangCount1(count);
                            BigDecimal sum = stockDayYanPanUpUp1.getShangZhangSum1().add(yanPanVo.getWeiLaiChange1());
                            stockDayYanPanUpUp.setShangZhangSum1(sum);
                            BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                            stockDayYanPanUpUp.setShangZhangMa1(ma);
                            BigDecimal rate = count.divide((count.add(stockDayYanPanUpUp1.getXiaJiangCount1())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            stockDayYanPanUpUp.setShangZhangRate1(rate);
                        } else {
                            BigDecimal count = stockDayYanPanUpUp1.getXiaJiangCount1().add(new BigDecimal(1));
                            stockDayYanPanUpUp.setXiaJiangCount1(count);
                            BigDecimal sum = stockDayYanPanUpUp1.getXiaJiangSum1().add(yanPanVo.getWeiLaiChange1());
                            stockDayYanPanUpUp.setXiaJiangSum1(sum);
                            BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                            stockDayYanPanUpUp.setXiaJiangMa1(ma);
                            BigDecimal rate = count.divide((count.add(stockDayYanPanUpUp1.getShangZhangCount1())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            stockDayYanPanUpUp.setXiaJiangRate1(rate);
                        }
                        if (yanPanVo.getWeiLaiChange2().compareTo(new BigDecimal(0)) > 0) {
                            BigDecimal count = stockDayYanPanUpUp1.getShangZhangCount2().add(new BigDecimal(1));
                            stockDayYanPanUpUp.setShangZhangCount2(count);
                            BigDecimal sum = stockDayYanPanUpUp1.getShangZhangSum2().add(yanPanVo.getWeiLaiChange2());
                            stockDayYanPanUpUp.setShangZhangSum2(sum);
                            BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                            stockDayYanPanUpUp.setShangZhangMa2(ma);
                            BigDecimal rate = count.divide((count.add(stockDayYanPanUpUp1.getXiaJiangCount2())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            stockDayYanPanUpUp.setShangZhangRate2(rate);
                        } else {
                            BigDecimal count = stockDayYanPanUpUp1.getXiaJiangCount2().add(new BigDecimal(1));
                            stockDayYanPanUpUp.setXiaJiangCount2(count);
                            BigDecimal sum = stockDayYanPanUpUp1.getXiaJiangSum2().add(yanPanVo.getWeiLaiChange2());
                            stockDayYanPanUpUp.setXiaJiangSum2(sum);
                            BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                            stockDayYanPanUpUp.setXiaJiangMa2(ma);
                            BigDecimal rate = count.divide((count.add(stockDayYanPanUpUp1.getShangZhangCount2())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            stockDayYanPanUpUp.setXiaJiangRate2(rate);
                        }
                        if (yanPanVo.getWeiLaiChange3().compareTo(new BigDecimal(0)) > 0) {
                            BigDecimal count = stockDayYanPanUpUp1.getShangZhangCount3().add(new BigDecimal(1));
                            stockDayYanPanUpUp.setShangZhangCount3(count);
                            BigDecimal sum = stockDayYanPanUpUp1.getShangZhangSum3().add(yanPanVo.getWeiLaiChange3());
                            stockDayYanPanUpUp.setShangZhangSum3(sum);
                            BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                            stockDayYanPanUpUp.setShangZhangMa3(ma);
                            BigDecimal rate = count.divide((count.add(stockDayYanPanUpUp1.getXiaJiangCount3())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            stockDayYanPanUpUp.setShangZhangRate3(rate);
                        } else {
                            BigDecimal count = stockDayYanPanUpUp1.getXiaJiangCount3().add(new BigDecimal(1));
                            stockDayYanPanUpUp.setXiaJiangCount3(count);
                            BigDecimal sum = stockDayYanPanUpUp1.getXiaJiangSum3().add(yanPanVo.getWeiLaiChange3());
                            stockDayYanPanUpUp.setXiaJiangSum3(sum);
                            BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                            stockDayYanPanUpUp.setXiaJiangMa3(ma);
                            BigDecimal rate = count.divide((count.add(stockDayYanPanUpUp1.getShangZhangCount3())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            stockDayYanPanUpUp.setXiaJiangRate3(rate);
                        }
                        if (yanPanVo.getWeiLaiChange5().compareTo(new BigDecimal(0)) > 0) {
                            BigDecimal count = stockDayYanPanUpUp1.getShangZhangCount5().add(new BigDecimal(1));
                            stockDayYanPanUpUp.setShangZhangCount5(count);
                            BigDecimal sum = stockDayYanPanUpUp1.getShangZhangSum5().add(yanPanVo.getWeiLaiChange5());
                            stockDayYanPanUpUp.setShangZhangSum5(sum);
                            BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                            stockDayYanPanUpUp.setShangZhangMa5(ma);
                            BigDecimal rate = count.divide((count.add(stockDayYanPanUpUp1.getXiaJiangCount5())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            stockDayYanPanUpUp.setShangZhangRate5(rate);
                        } else {
                            BigDecimal count = stockDayYanPanUpUp1.getXiaJiangCount5().add(new BigDecimal(1));
                            stockDayYanPanUpUp.setXiaJiangCount5(count);
                            BigDecimal sum = stockDayYanPanUpUp1.getXiaJiangSum5().add(yanPanVo.getWeiLaiChange5());
                            stockDayYanPanUpUp.setXiaJiangSum5(sum);
                            BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                            stockDayYanPanUpUp.setXiaJiangMa5(ma);
                            BigDecimal rate = count.divide((count.add(stockDayYanPanUpUp1.getShangZhangCount5())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            stockDayYanPanUpUp.setXiaJiangRate5(rate);
                        }
                        if (yanPanVo.getWeiLaiChange8().compareTo(new BigDecimal(0)) > 0) {
                            BigDecimal count = stockDayYanPanUpUp1.getShangZhangCount8().add(new BigDecimal(1));
                            stockDayYanPanUpUp.setShangZhangCount8(count);
                            BigDecimal sum = stockDayYanPanUpUp1.getShangZhangSum8().add(yanPanVo.getWeiLaiChange8());
                            stockDayYanPanUpUp.setShangZhangSum8(sum);
                            BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                            stockDayYanPanUpUp.setShangZhangMa8(ma);
                            BigDecimal rate = count.divide((count.add(stockDayYanPanUpUp1.getXiaJiangCount8())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            stockDayYanPanUpUp.setShangZhangRate8(rate);
                        } else {
                            BigDecimal count = stockDayYanPanUpUp1.getXiaJiangCount8().add(new BigDecimal(1));
                            stockDayYanPanUpUp.setXiaJiangCount8(count);
                            BigDecimal sum = stockDayYanPanUpUp1.getXiaJiangSum8().add(yanPanVo.getWeiLaiChange8());
                            stockDayYanPanUpUp.setXiaJiangSum8(sum);
                            BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                            stockDayYanPanUpUp.setXiaJiangMa8(ma);
                            BigDecimal rate = count.divide((count.add(stockDayYanPanUpUp1.getShangZhangCount8())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            stockDayYanPanUpUp.setXiaJiangRate8(rate);
                        }
                        if (yanPanVo.getWeiLaiChange13().compareTo(new BigDecimal(0)) > 0) {
                            BigDecimal count = stockDayYanPanUpUp1.getShangZhangCount13().add(new BigDecimal(1));
                            stockDayYanPanUpUp.setShangZhangCount13(count);
                            BigDecimal sum = stockDayYanPanUpUp1.getShangZhangSum13().add(yanPanVo.getWeiLaiChange13());
                            stockDayYanPanUpUp.setShangZhangSum13(sum);
                            BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                            stockDayYanPanUpUp.setShangZhangMa13(ma);
                            BigDecimal rate = count.divide((count.add(stockDayYanPanUpUp1.getXiaJiangCount13())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            stockDayYanPanUpUp.setShangZhangRate13(rate);
                        } else {
                            BigDecimal count = stockDayYanPanUpUp1.getXiaJiangCount13().add(new BigDecimal(1));
                            stockDayYanPanUpUp.setXiaJiangCount13(count);
                            BigDecimal sum = stockDayYanPanUpUp1.getXiaJiangSum13().add(yanPanVo.getWeiLaiChange13());
                            stockDayYanPanUpUp.setXiaJiangSum13(sum);
                            BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                            stockDayYanPanUpUp.setXiaJiangMa13(ma);
                            BigDecimal rate = count.divide((count.add(stockDayYanPanUpUp1.getShangZhangCount13())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            stockDayYanPanUpUp.setXiaJiangRate13(rate);
                        }
                        if (yanPanVo.getWeiLaiChange20().compareTo(new BigDecimal(0)) > 0) {
                            BigDecimal count = stockDayYanPanUpUp1.getShangZhangCount20().add(new BigDecimal(1));
                            stockDayYanPanUpUp.setShangZhangCount20(count);
                            BigDecimal sum = stockDayYanPanUpUp1.getShangZhangSum20().add(yanPanVo.getWeiLaiChange20());
                            stockDayYanPanUpUp.setShangZhangSum20(sum);
                            BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                            stockDayYanPanUpUp.setShangZhangMa20(ma);
                            BigDecimal rate = count.divide((count.add(stockDayYanPanUpUp1.getXiaJiangCount20())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            stockDayYanPanUpUp.setShangZhangRate20(rate);
                        } else {
                            BigDecimal count = stockDayYanPanUpUp1.getXiaJiangCount20().add(new BigDecimal(1));
                            stockDayYanPanUpUp.setXiaJiangCount20(count);
                            BigDecimal sum = stockDayYanPanUpUp1.getXiaJiangSum20().add(yanPanVo.getWeiLaiChange20());
                            stockDayYanPanUpUp.setXiaJiangSum20(sum);
                            BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                            stockDayYanPanUpUp.setXiaJiangMa20(ma);
                            BigDecimal rate = count.divide((count.add(stockDayYanPanUpUp1.getShangZhangCount20())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            stockDayYanPanUpUp.setXiaJiangRate20(rate);
                        }
                        String neirong = getUpUpString(stockDayYanPanUpUp);
                        FileOutputStream fs = new FileOutputStream(strPath.toString() + strFileName + ".txt");
                        byte[] buffer = neirong.getBytes();
                        int byteread = buffer.length;
                        //插入
                        fs.write(buffer, 0, byteread);
                        fs.flush();
                        fs.close();
                    }
                } else {
                    strPath.append("大盘3大于0/本盘3小于等于0/");
                    StockDayYanPanUpLow stockDayYanPanUpLow = new StockDayYanPanUpLow();
                    BeanUtils.copyProperties(stockDayYanPan, stockDayYanPanUpLow);
                    strFileName = getFileName(stockDayYanPan);
                    File file = new File(strPath.toString() + strFileName + ".txt");
                    if (!file.exists()) {
                        if (yanPanVo.getWeiLaiChange1().compareTo(new BigDecimal(0)) > 0) {
                            stockDayYanPanUpLow.setShangZhangCount1(new BigDecimal(1));
                            stockDayYanPanUpLow.setShangZhangMa1(yanPanVo.getWeiLaiChange1());
                            stockDayYanPanUpLow.setShangZhangSum1(yanPanVo.getWeiLaiChange1());
                            stockDayYanPanUpLow.setShangZhangRate1(new BigDecimal(50));
                        } else {
                            stockDayYanPanUpLow.setXiaJiangCount1(new BigDecimal(1));
                            stockDayYanPanUpLow.setXiaJiangMa1(yanPanVo.getWeiLaiChange1());
                            stockDayYanPanUpLow.setXiaJiangSum1(yanPanVo.getWeiLaiChange1());
                            stockDayYanPanUpLow.setXiaJiangRate1(new BigDecimal(50));
                        }
                        if (yanPanVo.getWeiLaiChange2().compareTo(new BigDecimal(0)) > 0) {
                            stockDayYanPanUpLow.setShangZhangCount2(new BigDecimal(1));
                            stockDayYanPanUpLow.setShangZhangMa2(yanPanVo.getWeiLaiChange2());
                            stockDayYanPanUpLow.setShangZhangSum2(yanPanVo.getWeiLaiChange2());
                            stockDayYanPanUpLow.setShangZhangRate2(new BigDecimal(50));
                        } else {
                            stockDayYanPanUpLow.setXiaJiangCount2(new BigDecimal(1));
                            stockDayYanPanUpLow.setXiaJiangMa2(yanPanVo.getWeiLaiChange2());
                            stockDayYanPanUpLow.setXiaJiangSum2(yanPanVo.getWeiLaiChange2());
                            stockDayYanPanUpLow.setXiaJiangRate2(new BigDecimal(50));
                        }
                        if (yanPanVo.getWeiLaiChange3().compareTo(new BigDecimal(0)) > 0) {
                            stockDayYanPanUpLow.setShangZhangCount3(new BigDecimal(1));
                            stockDayYanPanUpLow.setShangZhangMa3(yanPanVo.getWeiLaiChange3());
                            stockDayYanPanUpLow.setShangZhangSum3(yanPanVo.getWeiLaiChange3());
                            stockDayYanPanUpLow.setShangZhangRate3(new BigDecimal(50));
                        } else {
                            stockDayYanPanUpLow.setXiaJiangCount3(new BigDecimal(1));
                            stockDayYanPanUpLow.setXiaJiangMa3(yanPanVo.getWeiLaiChange3());
                            stockDayYanPanUpLow.setXiaJiangSum3(yanPanVo.getWeiLaiChange3());
                            stockDayYanPanUpLow.setXiaJiangRate3(new BigDecimal(50));
                        }
                        if (yanPanVo.getWeiLaiChange5().compareTo(new BigDecimal(0)) > 0) {
                            stockDayYanPanUpLow.setShangZhangCount5(new BigDecimal(1));
                            stockDayYanPanUpLow.setShangZhangMa5(yanPanVo.getWeiLaiChange5());
                            stockDayYanPanUpLow.setShangZhangSum5(yanPanVo.getWeiLaiChange5());
                            stockDayYanPanUpLow.setShangZhangRate5(new BigDecimal(50));
                        } else {
                            stockDayYanPanUpLow.setXiaJiangCount5(new BigDecimal(1));
                            stockDayYanPanUpLow.setXiaJiangMa5(yanPanVo.getWeiLaiChange5());
                            stockDayYanPanUpLow.setXiaJiangSum5(yanPanVo.getWeiLaiChange5());
                            stockDayYanPanUpLow.setXiaJiangRate5(new BigDecimal(50));
                        }
                        if (yanPanVo.getWeiLaiChange8().compareTo(new BigDecimal(0)) > 0) {
                            stockDayYanPanUpLow.setShangZhangCount8(new BigDecimal(1));
                            stockDayYanPanUpLow.setShangZhangMa8(yanPanVo.getWeiLaiChange8());
                            stockDayYanPanUpLow.setShangZhangSum8(yanPanVo.getWeiLaiChange8());
                            stockDayYanPanUpLow.setShangZhangRate8(new BigDecimal(50));
                        } else {
                            stockDayYanPanUpLow.setXiaJiangCount8(new BigDecimal(1));
                            stockDayYanPanUpLow.setXiaJiangMa8(yanPanVo.getWeiLaiChange8());
                            stockDayYanPanUpLow.setXiaJiangSum8(yanPanVo.getWeiLaiChange8());
                            stockDayYanPanUpLow.setXiaJiangRate8(new BigDecimal(50));
                        }
                        if (yanPanVo.getWeiLaiChange13().compareTo(new BigDecimal(0)) > 0) {
                            stockDayYanPanUpLow.setShangZhangCount13(new BigDecimal(1));
                            stockDayYanPanUpLow.setShangZhangMa13(yanPanVo.getWeiLaiChange13());
                            stockDayYanPanUpLow.setShangZhangSum13(yanPanVo.getWeiLaiChange8());
                            stockDayYanPanUpLow.setShangZhangRate13(new BigDecimal(50));
                        } else {
                            stockDayYanPanUpLow.setXiaJiangCount13(new BigDecimal(1));
                            stockDayYanPanUpLow.setXiaJiangMa13(yanPanVo.getWeiLaiChange13());
                            stockDayYanPanUpLow.setXiaJiangSum13(yanPanVo.getWeiLaiChange13());
                            stockDayYanPanUpLow.setXiaJiangRate13(new BigDecimal(50));
                        }
                        if (yanPanVo.getWeiLaiChange20().compareTo(new BigDecimal(0)) > 0) {
                            stockDayYanPanUpLow.setShangZhangCount20(new BigDecimal(1));
                            stockDayYanPanUpLow.setShangZhangMa20(yanPanVo.getWeiLaiChange20());
                            stockDayYanPanUpLow.setShangZhangSum20(yanPanVo.getWeiLaiChange20());
                            stockDayYanPanUpLow.setShangZhangRate20(new BigDecimal(50));
                        } else {
                            stockDayYanPanUpLow.setXiaJiangCount20(new BigDecimal(1));
                            stockDayYanPanUpLow.setXiaJiangMa20(yanPanVo.getWeiLaiChange20());
                            stockDayYanPanUpLow.setXiaJiangSum20(yanPanVo.getWeiLaiChange20());
                            stockDayYanPanUpLow.setXiaJiangRate20(new BigDecimal(50));
                        }
                        StockDayYanPanUpUp stockDayYanPanUpUp = new StockDayYanPanUpUp();
                        BeanUtils.copyProperties(stockDayYanPanUpLow, stockDayYanPanUpUp);
                        String neirong = getUpUpString(stockDayYanPanUpUp);
                        FileOutputStream fs = new FileOutputStream(strPath.toString() + strFileName + ".txt");
                        byte[] buffer = neirong.getBytes();
                        int byteread = buffer.length;
                        //插入
                        fs.write(buffer, 0, byteread);
                        fs.flush();
                        fs.close();
                    } else {
                        StockDayYanPanUpUp stockDayYanPanUpUp1 = getUpUpentity(strPath.toString() + strFileName);
                        StockDayYanPanUpLow stockDayYanPanUpLow1 = new StockDayYanPanUpLow();
                        BeanUtils.copyProperties(stockDayYanPanUpUp1, stockDayYanPanUpLow1);
                        BeanUtils.copyProperties(stockDayYanPanUpUp1,stockDayYanPanUpLow);
                        if (yanPanVo.getWeiLaiChange1().compareTo(new BigDecimal(0)) > 0) {
                            BigDecimal count = stockDayYanPanUpLow1.getShangZhangCount1().add(new BigDecimal(1));
                            stockDayYanPanUpLow.setShangZhangCount1(count);
                            BigDecimal sum = stockDayYanPanUpLow1.getShangZhangSum1().add(yanPanVo.getWeiLaiChange1());
                            stockDayYanPanUpLow.setShangZhangSum1(sum);
                            BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                            stockDayYanPanUpLow.setShangZhangMa1(ma);
                            BigDecimal rate = count.divide((count.add(stockDayYanPanUpLow1.getXiaJiangCount1())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            stockDayYanPanUpLow.setShangZhangRate1(rate);
                        } else {
                            BigDecimal count = stockDayYanPanUpLow1.getXiaJiangCount1().add(new BigDecimal(1));
                            stockDayYanPanUpLow.setXiaJiangCount1(count);
                            BigDecimal sum = stockDayYanPanUpLow1.getXiaJiangSum1().add(yanPanVo.getWeiLaiChange1());
                            stockDayYanPanUpLow.setXiaJiangSum1(sum);
                            BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                            stockDayYanPanUpLow.setXiaJiangMa1(ma);
                            BigDecimal rate = count.divide((count.add(stockDayYanPanUpLow1.getShangZhangCount1())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            stockDayYanPanUpLow.setXiaJiangRate1(rate);
                        }
                        if (yanPanVo.getWeiLaiChange2().compareTo(new BigDecimal(0)) > 0) {
                            BigDecimal count = stockDayYanPanUpLow1.getShangZhangCount2().add(new BigDecimal(1));
                            stockDayYanPanUpLow.setShangZhangCount2(count);
                            BigDecimal sum = stockDayYanPanUpLow1.getShangZhangSum2().add(yanPanVo.getWeiLaiChange2());
                            stockDayYanPanUpLow.setShangZhangSum2(sum);
                            BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                            stockDayYanPanUpLow.setShangZhangMa2(ma);
                            BigDecimal rate = count.divide((count.add(stockDayYanPanUpLow1.getXiaJiangCount2())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            stockDayYanPanUpLow.setShangZhangRate2(rate);
                        } else {
                            BigDecimal count = stockDayYanPanUpLow1.getXiaJiangCount2().add(new BigDecimal(1));
                            stockDayYanPanUpLow.setXiaJiangCount2(count);
                            BigDecimal sum = stockDayYanPanUpLow1.getXiaJiangSum2().add(yanPanVo.getWeiLaiChange2());
                            stockDayYanPanUpLow.setXiaJiangSum2(sum);
                            BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                            stockDayYanPanUpLow.setXiaJiangMa2(ma);
                            BigDecimal rate = count.divide((count.add(stockDayYanPanUpLow1.getShangZhangCount2())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            stockDayYanPanUpLow.setXiaJiangRate2(rate);
                        }
                        if (yanPanVo.getWeiLaiChange3().compareTo(new BigDecimal(0)) > 0) {
                            BigDecimal count = stockDayYanPanUpLow1.getShangZhangCount3().add(new BigDecimal(1));
                            stockDayYanPanUpLow.setShangZhangCount3(count);
                            BigDecimal sum = stockDayYanPanUpLow1.getShangZhangSum3().add(yanPanVo.getWeiLaiChange3());
                            stockDayYanPanUpLow.setShangZhangSum3(sum);
                            BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                            stockDayYanPanUpLow.setShangZhangMa3(ma);
                            BigDecimal rate = count.divide((count.add(stockDayYanPanUpLow1.getXiaJiangCount3())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            stockDayYanPanUpLow.setShangZhangRate3(rate);
                        } else {
                            BigDecimal count = stockDayYanPanUpLow1.getXiaJiangCount3().add(new BigDecimal(1));
                            stockDayYanPanUpLow.setXiaJiangCount3(count);
                            BigDecimal sum = stockDayYanPanUpLow1.getXiaJiangSum3().add(yanPanVo.getWeiLaiChange3());
                            stockDayYanPanUpLow.setXiaJiangSum3(sum);
                            BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                            stockDayYanPanUpLow.setXiaJiangMa3(ma);
                            BigDecimal rate = count.divide((count.add(stockDayYanPanUpLow1.getShangZhangCount3())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            stockDayYanPanUpLow.setXiaJiangRate3(rate);
                        }
                        if (yanPanVo.getWeiLaiChange5().compareTo(new BigDecimal(0)) > 0) {
                            BigDecimal count = stockDayYanPanUpLow1.getShangZhangCount5().add(new BigDecimal(1));
                            stockDayYanPanUpLow.setShangZhangCount5(count);
                            BigDecimal sum = stockDayYanPanUpLow1.getShangZhangSum5().add(yanPanVo.getWeiLaiChange5());
                            stockDayYanPanUpLow.setShangZhangSum5(sum);
                            BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                            stockDayYanPanUpLow.setShangZhangMa5(ma);
                            BigDecimal rate = count.divide((count.add(stockDayYanPanUpLow1.getXiaJiangCount5())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            stockDayYanPanUpLow.setShangZhangRate5(rate);
                        } else {
                            BigDecimal count = stockDayYanPanUpLow1.getXiaJiangCount5().add(new BigDecimal(1));
                            stockDayYanPanUpLow.setXiaJiangCount5(count);
                            BigDecimal sum = stockDayYanPanUpLow1.getXiaJiangSum5().add(yanPanVo.getWeiLaiChange5());
                            stockDayYanPanUpLow.setXiaJiangSum5(sum);
                            BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                            stockDayYanPanUpLow.setXiaJiangMa5(ma);
                            BigDecimal rate = count.divide((count.add(stockDayYanPanUpLow1.getShangZhangCount5())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            stockDayYanPanUpLow.setXiaJiangRate5(rate);
                        }
                        if (yanPanVo.getWeiLaiChange8().compareTo(new BigDecimal(0)) > 0) {
                            BigDecimal count = stockDayYanPanUpLow1.getShangZhangCount8().add(new BigDecimal(1));
                            stockDayYanPanUpLow.setShangZhangCount8(count);
                            BigDecimal sum = stockDayYanPanUpLow1.getShangZhangSum8().add(yanPanVo.getWeiLaiChange8());
                            stockDayYanPanUpLow.setShangZhangSum8(sum);
                            BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                            stockDayYanPanUpLow.setShangZhangMa8(ma);
                            BigDecimal rate = count.divide((count.add(stockDayYanPanUpLow1.getXiaJiangCount8())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            stockDayYanPanUpLow.setShangZhangRate8(rate);
                        } else {
                            BigDecimal count = stockDayYanPanUpLow1.getXiaJiangCount8().add(new BigDecimal(1));
                            stockDayYanPanUpLow.setXiaJiangCount8(count);
                            BigDecimal sum = stockDayYanPanUpLow1.getXiaJiangSum8().add(yanPanVo.getWeiLaiChange8());
                            stockDayYanPanUpLow.setXiaJiangSum8(sum);
                            BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                            stockDayYanPanUpLow.setXiaJiangMa8(ma);
                            BigDecimal rate = count.divide((count.add(stockDayYanPanUpLow1.getShangZhangCount8())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            stockDayYanPanUpLow.setXiaJiangRate8(rate);
                        }
                        if (yanPanVo.getWeiLaiChange13().compareTo(new BigDecimal(0)) > 0) {
                            BigDecimal count = stockDayYanPanUpLow1.getShangZhangCount13().add(new BigDecimal(1));
                            stockDayYanPanUpLow.setShangZhangCount13(count);
                            BigDecimal sum = stockDayYanPanUpLow1.getShangZhangSum13().add(yanPanVo.getWeiLaiChange13());
                            stockDayYanPanUpLow.setShangZhangSum13(sum);
                            BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                            stockDayYanPanUpLow.setShangZhangMa13(ma);
                            BigDecimal rate = count.divide((count.add(stockDayYanPanUpLow1.getXiaJiangCount13())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            stockDayYanPanUpLow.setShangZhangRate13(rate);
                        } else {
                            BigDecimal count = stockDayYanPanUpLow1.getXiaJiangCount13().add(new BigDecimal(1));
                            stockDayYanPanUpLow.setXiaJiangCount13(count);
                            BigDecimal sum = stockDayYanPanUpLow1.getXiaJiangSum13().add(yanPanVo.getWeiLaiChange13());
                            stockDayYanPanUpLow.setXiaJiangSum13(sum);
                            BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                            stockDayYanPanUpLow.setXiaJiangMa13(ma);
                            BigDecimal rate = count.divide((count.add(stockDayYanPanUpLow1.getShangZhangCount13())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            stockDayYanPanUpLow.setXiaJiangRate13(rate);
                        }
                        if (yanPanVo.getWeiLaiChange20().compareTo(new BigDecimal(0)) > 0) {
                            BigDecimal count = stockDayYanPanUpLow1.getShangZhangCount20().add(new BigDecimal(1));
                            stockDayYanPanUpLow.setShangZhangCount20(count);
                            BigDecimal sum = stockDayYanPanUpLow1.getShangZhangSum20().add(yanPanVo.getWeiLaiChange20());
                            stockDayYanPanUpLow.setShangZhangSum20(sum);
                            BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                            stockDayYanPanUpLow.setShangZhangMa20(ma);
                            BigDecimal rate = count.divide((count.add(stockDayYanPanUpLow1.getXiaJiangCount20())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            stockDayYanPanUpLow.setShangZhangRate20(rate);
                        } else {
                            BigDecimal count = stockDayYanPanUpLow1.getXiaJiangCount20().add(new BigDecimal(1));
                            stockDayYanPanUpLow.setXiaJiangCount20(count);
                            BigDecimal sum = stockDayYanPanUpLow1.getXiaJiangSum20().add(yanPanVo.getWeiLaiChange20());
                            stockDayYanPanUpLow.setXiaJiangSum20(sum);
                            BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                            stockDayYanPanUpLow.setXiaJiangMa20(ma);
                            BigDecimal rate = count.divide((count.add(stockDayYanPanUpLow1.getShangZhangCount20())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            stockDayYanPanUpLow.setXiaJiangRate20(rate);
                        }
                        StockDayYanPanUpUp stockDayYanPanUpUp = new StockDayYanPanUpUp();
                        BeanUtils.copyProperties(stockDayYanPanUpLow, stockDayYanPanUpUp);
                        String neirong = getUpUpString(stockDayYanPanUpUp);
                        FileOutputStream fs = new FileOutputStream(strPath.toString() + strFileName + ".txt");
                        byte[] buffer = neirong.getBytes();
                        int byteread = buffer.length;
                        //插入
                        fs.write(buffer, 0, byteread);
                        fs.flush();
                        fs.close();
                    }
                }
            } else {
                if (rateOfChangeVo.getBeforeChange3().compareTo(new BigDecimal(0)) > 0) {
                    strPath.append("大盘3小于等于0/本盘3大于0/");
                    StockDayYanPanLowUp stockDayYanPanLowUp = new StockDayYanPanLowUp();
                    BeanUtils.copyProperties(stockDayYanPan, stockDayYanPanLowUp);
                    strFileName = getFileName(stockDayYanPan);
                    File file = new File(strPath.toString() + strFileName + ".txt");
                    if (!file.exists()) {
                        if (yanPanVo.getWeiLaiChange1().compareTo(new BigDecimal(0)) > 0) {
                            stockDayYanPanLowUp.setShangZhangCount1(new BigDecimal(1));
                            stockDayYanPanLowUp.setShangZhangMa1(yanPanVo.getWeiLaiChange1());
                            stockDayYanPanLowUp.setShangZhangSum1(yanPanVo.getWeiLaiChange1());
                            stockDayYanPanLowUp.setShangZhangRate1(new BigDecimal(50));
                        } else {
                            stockDayYanPanLowUp.setXiaJiangCount1(new BigDecimal(1));
                            stockDayYanPanLowUp.setXiaJiangMa1(yanPanVo.getWeiLaiChange1());
                            stockDayYanPanLowUp.setXiaJiangSum1(yanPanVo.getWeiLaiChange1());
                            stockDayYanPanLowUp.setXiaJiangRate1(new BigDecimal(50));
                        }
                        if (yanPanVo.getWeiLaiChange2().compareTo(new BigDecimal(0)) > 0) {
                            stockDayYanPanLowUp.setShangZhangCount2(new BigDecimal(1));
                            stockDayYanPanLowUp.setShangZhangMa2(yanPanVo.getWeiLaiChange2());
                            stockDayYanPanLowUp.setShangZhangSum2(yanPanVo.getWeiLaiChange2());
                            stockDayYanPanLowUp.setShangZhangRate2(new BigDecimal(50));
                        } else {
                            stockDayYanPanLowUp.setXiaJiangCount2(new BigDecimal(1));
                            stockDayYanPanLowUp.setXiaJiangMa2(yanPanVo.getWeiLaiChange2());
                            stockDayYanPanLowUp.setXiaJiangSum2(yanPanVo.getWeiLaiChange2());
                            stockDayYanPanLowUp.setXiaJiangRate2(new BigDecimal(50));
                        }
                        if (yanPanVo.getWeiLaiChange3().compareTo(new BigDecimal(0)) > 0) {
                            stockDayYanPanLowUp.setShangZhangCount3(new BigDecimal(1));
                            stockDayYanPanLowUp.setShangZhangMa3(yanPanVo.getWeiLaiChange3());
                            stockDayYanPanLowUp.setShangZhangSum3(yanPanVo.getWeiLaiChange3());
                            stockDayYanPanLowUp.setShangZhangRate3(new BigDecimal(50));
                        } else {
                            stockDayYanPanLowUp.setXiaJiangCount3(new BigDecimal(1));
                            stockDayYanPanLowUp.setXiaJiangMa3(yanPanVo.getWeiLaiChange3());
                            stockDayYanPanLowUp.setXiaJiangSum3(yanPanVo.getWeiLaiChange3());
                            stockDayYanPanLowUp.setXiaJiangRate3(new BigDecimal(50));
                        }
                        if (yanPanVo.getWeiLaiChange5().compareTo(new BigDecimal(0)) > 0) {
                            stockDayYanPanLowUp.setShangZhangCount5(new BigDecimal(1));
                            stockDayYanPanLowUp.setShangZhangMa5(yanPanVo.getWeiLaiChange5());
                            stockDayYanPanLowUp.setShangZhangSum5(yanPanVo.getWeiLaiChange5());
                            stockDayYanPanLowUp.setShangZhangRate5(new BigDecimal(50));
                        } else {
                            stockDayYanPanLowUp.setXiaJiangCount5(new BigDecimal(1));
                            stockDayYanPanLowUp.setXiaJiangMa5(yanPanVo.getWeiLaiChange5());
                            stockDayYanPanLowUp.setXiaJiangSum5(yanPanVo.getWeiLaiChange5());
                            stockDayYanPanLowUp.setXiaJiangRate5(new BigDecimal(50));
                        }
                        if (yanPanVo.getWeiLaiChange8().compareTo(new BigDecimal(0)) > 0) {
                            stockDayYanPanLowUp.setShangZhangCount8(new BigDecimal(1));
                            stockDayYanPanLowUp.setShangZhangMa8(yanPanVo.getWeiLaiChange8());
                            stockDayYanPanLowUp.setShangZhangSum8(yanPanVo.getWeiLaiChange8());
                            stockDayYanPanLowUp.setShangZhangRate8(new BigDecimal(50));
                        } else {
                            stockDayYanPanLowUp.setXiaJiangCount8(new BigDecimal(1));
                            stockDayYanPanLowUp.setXiaJiangMa8(yanPanVo.getWeiLaiChange8());
                            stockDayYanPanLowUp.setXiaJiangSum8(yanPanVo.getWeiLaiChange8());
                            stockDayYanPanLowUp.setXiaJiangRate8(new BigDecimal(50));
                        }
                        if (yanPanVo.getWeiLaiChange13().compareTo(new BigDecimal(0)) > 0) {
                            stockDayYanPanLowUp.setShangZhangCount13(new BigDecimal(1));
                            stockDayYanPanLowUp.setShangZhangMa13(yanPanVo.getWeiLaiChange13());
                            stockDayYanPanLowUp.setShangZhangSum13(yanPanVo.getWeiLaiChange8());
                            stockDayYanPanLowUp.setShangZhangRate13(new BigDecimal(50));
                        } else {
                            stockDayYanPanLowUp.setXiaJiangCount13(new BigDecimal(1));
                            stockDayYanPanLowUp.setXiaJiangMa13(yanPanVo.getWeiLaiChange13());
                            stockDayYanPanLowUp.setXiaJiangSum13(yanPanVo.getWeiLaiChange13());
                            stockDayYanPanLowUp.setXiaJiangRate13(new BigDecimal(50));
                        }
                        if (yanPanVo.getWeiLaiChange20().compareTo(new BigDecimal(0)) > 0) {
                            stockDayYanPanLowUp.setShangZhangCount20(new BigDecimal(1));
                            stockDayYanPanLowUp.setShangZhangMa20(yanPanVo.getWeiLaiChange20());
                            stockDayYanPanLowUp.setShangZhangSum20(yanPanVo.getWeiLaiChange20());
                            stockDayYanPanLowUp.setShangZhangRate20(new BigDecimal(50));
                        } else {
                            stockDayYanPanLowUp.setXiaJiangCount20(new BigDecimal(1));
                            stockDayYanPanLowUp.setXiaJiangMa20(yanPanVo.getWeiLaiChange20());
                            stockDayYanPanLowUp.setXiaJiangSum20(yanPanVo.getWeiLaiChange20());
                            stockDayYanPanLowUp.setXiaJiangRate20(new BigDecimal(50));
                        }
                        StockDayYanPanUpUp stockDayYanPanUpUp = new StockDayYanPanUpUp();
                        BeanUtils.copyProperties(stockDayYanPanLowUp, stockDayYanPanUpUp);
                        String neirong = getUpUpString(stockDayYanPanUpUp);
                        FileOutputStream fs = new FileOutputStream(strPath.toString() + strFileName + ".txt");
                        byte[] buffer = neirong.getBytes();
                        int byteread = buffer.length;
                        //插入
                        fs.write(buffer, 0, byteread);
                        fs.flush();
                        fs.close();
                    } else {
                        StockDayYanPanUpUp stockDayYanPanUpUp1 = getUpUpentity(strPath.toString() + strFileName);
                        StockDayYanPanLowUp stockDayYanPanLowUp1 = new StockDayYanPanLowUp();
                        BeanUtils.copyProperties(stockDayYanPanUpUp1, stockDayYanPanLowUp1);
                        BeanUtils.copyProperties(stockDayYanPanUpUp1,stockDayYanPanLowUp);
                        if (yanPanVo.getWeiLaiChange1().compareTo(new BigDecimal(0)) > 0) {
                            BigDecimal count = stockDayYanPanLowUp1.getShangZhangCount1().add(new BigDecimal(1));
                            stockDayYanPanLowUp.setShangZhangCount1(count);
                            BigDecimal sum = stockDayYanPanLowUp1.getShangZhangSum1().add(yanPanVo.getWeiLaiChange1());
                            stockDayYanPanLowUp.setShangZhangSum1(sum);
                            BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                            stockDayYanPanLowUp.setShangZhangMa1(ma);
                            BigDecimal rate = count.divide((count.add(stockDayYanPanLowUp1.getXiaJiangCount1())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            stockDayYanPanLowUp.setShangZhangRate1(rate);
                        } else {
                            BigDecimal count = stockDayYanPanLowUp1.getXiaJiangCount1().add(new BigDecimal(1));
                            stockDayYanPanLowUp.setXiaJiangCount1(count);
                            BigDecimal sum = stockDayYanPanLowUp1.getXiaJiangSum1().add(yanPanVo.getWeiLaiChange1());
                            stockDayYanPanLowUp.setXiaJiangSum1(sum);
                            BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                            stockDayYanPanLowUp.setXiaJiangMa1(ma);
                            BigDecimal rate = count.divide((count.add(stockDayYanPanLowUp1.getShangZhangCount1())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            stockDayYanPanLowUp.setXiaJiangRate1(rate);
                        }
                        if (yanPanVo.getWeiLaiChange2().compareTo(new BigDecimal(0)) > 0) {
                            BigDecimal count = stockDayYanPanLowUp1.getShangZhangCount2().add(new BigDecimal(1));
                            stockDayYanPanLowUp.setShangZhangCount2(count);
                            BigDecimal sum = stockDayYanPanLowUp1.getShangZhangSum2().add(yanPanVo.getWeiLaiChange2());
                            stockDayYanPanLowUp.setShangZhangSum2(sum);
                            BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                            stockDayYanPanLowUp.setShangZhangMa2(ma);
                            BigDecimal rate = count.divide((count.add(stockDayYanPanLowUp1.getXiaJiangCount2())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            stockDayYanPanLowUp.setShangZhangRate2(rate);
                        } else {
                            BigDecimal count = stockDayYanPanLowUp1.getXiaJiangCount2().add(new BigDecimal(1));
                            stockDayYanPanLowUp.setXiaJiangCount2(count);
                            BigDecimal sum = stockDayYanPanLowUp1.getXiaJiangSum2().add(yanPanVo.getWeiLaiChange2());
                            stockDayYanPanLowUp.setXiaJiangSum2(sum);
                            BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                            stockDayYanPanLowUp.setXiaJiangMa2(ma);
                            BigDecimal rate = count.divide((count.add(stockDayYanPanLowUp1.getShangZhangCount2())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            stockDayYanPanLowUp.setXiaJiangRate2(rate);
                        }
                        if (yanPanVo.getWeiLaiChange3().compareTo(new BigDecimal(0)) > 0) {
                            BigDecimal count = stockDayYanPanLowUp1.getShangZhangCount3().add(new BigDecimal(1));
                            stockDayYanPanLowUp.setShangZhangCount3(count);
                            BigDecimal sum = stockDayYanPanLowUp1.getShangZhangSum3().add(yanPanVo.getWeiLaiChange3());
                            stockDayYanPanLowUp.setShangZhangSum3(sum);
                            BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                            stockDayYanPanLowUp.setShangZhangMa3(ma);
                            BigDecimal rate = count.divide((count.add(stockDayYanPanLowUp1.getXiaJiangCount3())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            stockDayYanPanLowUp.setShangZhangRate3(rate);
                        } else {
                            BigDecimal count = stockDayYanPanLowUp1.getXiaJiangCount3().add(new BigDecimal(1));
                            stockDayYanPanLowUp.setXiaJiangCount3(count);
                            BigDecimal sum = stockDayYanPanLowUp1.getXiaJiangSum3().add(yanPanVo.getWeiLaiChange3());
                            stockDayYanPanLowUp.setXiaJiangSum3(sum);
                            BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                            stockDayYanPanLowUp.setXiaJiangMa3(ma);
                            BigDecimal rate = count.divide((count.add(stockDayYanPanLowUp1.getShangZhangCount3())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            stockDayYanPanLowUp.setXiaJiangRate3(rate);
                        }
                        if (yanPanVo.getWeiLaiChange5().compareTo(new BigDecimal(0)) > 0) {
                            BigDecimal count = stockDayYanPanLowUp1.getShangZhangCount5().add(new BigDecimal(1));
                            stockDayYanPanLowUp.setShangZhangCount5(count);
                            BigDecimal sum = stockDayYanPanLowUp1.getShangZhangSum5().add(yanPanVo.getWeiLaiChange5());
                            stockDayYanPanLowUp.setShangZhangSum5(sum);
                            BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                            stockDayYanPanLowUp.setShangZhangMa5(ma);
                            BigDecimal rate = count.divide((count.add(stockDayYanPanLowUp1.getXiaJiangCount5())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            stockDayYanPanLowUp.setShangZhangRate5(rate);
                        } else {
                            BigDecimal count = stockDayYanPanLowUp1.getXiaJiangCount5().add(new BigDecimal(1));
                            stockDayYanPanLowUp.setXiaJiangCount5(count);
                            BigDecimal sum = stockDayYanPanLowUp1.getXiaJiangSum5().add(yanPanVo.getWeiLaiChange5());
                            stockDayYanPanLowUp.setXiaJiangSum5(sum);
                            BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                            stockDayYanPanLowUp.setXiaJiangMa5(ma);
                            BigDecimal rate = count.divide((count.add(stockDayYanPanLowUp1.getShangZhangCount5())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            stockDayYanPanLowUp.setXiaJiangRate5(rate);
                        }
                        if (yanPanVo.getWeiLaiChange8().compareTo(new BigDecimal(0)) > 0) {
                            BigDecimal count = stockDayYanPanLowUp1.getShangZhangCount8().add(new BigDecimal(1));
                            stockDayYanPanLowUp.setShangZhangCount8(count);
                            BigDecimal sum = stockDayYanPanLowUp1.getShangZhangSum8().add(yanPanVo.getWeiLaiChange8());
                            stockDayYanPanLowUp.setShangZhangSum8(sum);
                            BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                            stockDayYanPanLowUp.setShangZhangMa8(ma);
                            BigDecimal rate = count.divide((count.add(stockDayYanPanLowUp1.getXiaJiangCount8())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            stockDayYanPanLowUp.setShangZhangRate8(rate);
                        } else {
                            BigDecimal count = stockDayYanPanLowUp1.getXiaJiangCount8().add(new BigDecimal(1));
                            stockDayYanPanLowUp.setXiaJiangCount8(count);
                            BigDecimal sum = stockDayYanPanLowUp1.getXiaJiangSum8().add(yanPanVo.getWeiLaiChange8());
                            stockDayYanPanLowUp.setXiaJiangSum8(sum);
                            BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                            stockDayYanPanLowUp.setXiaJiangMa8(ma);
                            BigDecimal rate = count.divide((count.add(stockDayYanPanLowUp1.getShangZhangCount8())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            stockDayYanPanLowUp.setXiaJiangRate8(rate);
                        }
                        if (yanPanVo.getWeiLaiChange13().compareTo(new BigDecimal(0)) > 0) {
                            BigDecimal count = stockDayYanPanLowUp1.getShangZhangCount13().add(new BigDecimal(1));
                            stockDayYanPanLowUp.setShangZhangCount13(count);
                            BigDecimal sum = stockDayYanPanLowUp1.getShangZhangSum13().add(yanPanVo.getWeiLaiChange13());
                            stockDayYanPanLowUp.setShangZhangSum13(sum);
                            BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                            stockDayYanPanLowUp.setShangZhangMa13(ma);
                            BigDecimal rate = count.divide((count.add(stockDayYanPanLowUp1.getXiaJiangCount13())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            stockDayYanPanLowUp.setShangZhangRate13(rate);
                        } else {
                            BigDecimal count = stockDayYanPanLowUp1.getXiaJiangCount13().add(new BigDecimal(1));
                            stockDayYanPanLowUp.setXiaJiangCount13(count);
                            BigDecimal sum = stockDayYanPanLowUp1.getXiaJiangSum13().add(yanPanVo.getWeiLaiChange13());
                            stockDayYanPanLowUp.setXiaJiangSum13(sum);
                            BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                            stockDayYanPanLowUp.setXiaJiangMa13(ma);
                            BigDecimal rate = count.divide((count.add(stockDayYanPanLowUp1.getShangZhangCount13())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            stockDayYanPanLowUp.setXiaJiangRate13(rate);
                        }
                        if (yanPanVo.getWeiLaiChange20().compareTo(new BigDecimal(0)) > 0) {
                            BigDecimal count = stockDayYanPanLowUp1.getShangZhangCount20().add(new BigDecimal(1));
                            stockDayYanPanLowUp.setShangZhangCount20(count);
                            BigDecimal sum = stockDayYanPanLowUp1.getShangZhangSum20().add(yanPanVo.getWeiLaiChange20());
                            stockDayYanPanLowUp.setShangZhangSum20(sum);
                            BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                            stockDayYanPanLowUp.setShangZhangMa20(ma);
                            BigDecimal rate = count.divide((count.add(stockDayYanPanLowUp1.getXiaJiangCount20())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            stockDayYanPanLowUp.setShangZhangRate20(rate);
                        } else {
                            BigDecimal count = stockDayYanPanLowUp1.getXiaJiangCount20().add(new BigDecimal(1));
                            stockDayYanPanLowUp.setXiaJiangCount20(count);
                            BigDecimal sum = stockDayYanPanLowUp1.getXiaJiangSum20().add(yanPanVo.getWeiLaiChange20());
                            stockDayYanPanLowUp.setXiaJiangSum20(sum);
                            BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                            stockDayYanPanLowUp.setXiaJiangMa20(ma);
                            BigDecimal rate = count.divide((count.add(stockDayYanPanLowUp1.getShangZhangCount20())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            stockDayYanPanLowUp.setXiaJiangRate20(rate);
                        }
                        StockDayYanPanUpUp stockDayYanPanUpUp = new StockDayYanPanUpUp();
                        BeanUtils.copyProperties(stockDayYanPanLowUp, stockDayYanPanUpUp);
                        String neirong = getUpUpString(stockDayYanPanUpUp);
                        FileOutputStream fs = new FileOutputStream(strPath.toString() + strFileName + ".txt");
                        byte[] buffer = neirong.getBytes();
                        int byteread = buffer.length;
                        //插入
                        fs.write(buffer, 0, byteread);
                        fs.flush();
                        fs.close();
                    }
                } else {
                    strPath.append("大盘3小于等于0/本盘3小于等于0/");
                    StockDayYanPanLowLow stockDayYanPanLowLow = new StockDayYanPanLowLow();
                    BeanUtils.copyProperties(stockDayYanPan, stockDayYanPanLowLow);
                    strFileName = getFileName(stockDayYanPan);
                    File file = new File(strPath.toString() + strFileName + ".txt");
                    if (!file.exists()) {
                        if (yanPanVo.getWeiLaiChange1().compareTo(new BigDecimal(0)) > 0) {
                            stockDayYanPanLowLow.setShangZhangCount1(new BigDecimal(1));
                            stockDayYanPanLowLow.setShangZhangMa1(yanPanVo.getWeiLaiChange1());
                            stockDayYanPanLowLow.setShangZhangSum1(yanPanVo.getWeiLaiChange1());
                            stockDayYanPanLowLow.setShangZhangRate1(new BigDecimal(50));
                        } else {
                            stockDayYanPanLowLow.setXiaJiangCount1(new BigDecimal(1));
                            stockDayYanPanLowLow.setXiaJiangMa1(yanPanVo.getWeiLaiChange1());
                            stockDayYanPanLowLow.setXiaJiangSum1(yanPanVo.getWeiLaiChange1());
                            stockDayYanPanLowLow.setXiaJiangRate1(new BigDecimal(50));
                        }
                        if (yanPanVo.getWeiLaiChange2().compareTo(new BigDecimal(0)) > 0) {
                            stockDayYanPanLowLow.setShangZhangCount2(new BigDecimal(1));
                            stockDayYanPanLowLow.setShangZhangMa2(yanPanVo.getWeiLaiChange2());
                            stockDayYanPanLowLow.setShangZhangSum2(yanPanVo.getWeiLaiChange2());
                            stockDayYanPanLowLow.setShangZhangRate2(new BigDecimal(50));
                        } else {
                            stockDayYanPanLowLow.setXiaJiangCount2(new BigDecimal(1));
                            stockDayYanPanLowLow.setXiaJiangMa2(yanPanVo.getWeiLaiChange2());
                            stockDayYanPanLowLow.setXiaJiangSum2(yanPanVo.getWeiLaiChange2());
                            stockDayYanPanLowLow.setXiaJiangRate2(new BigDecimal(50));
                        }
                        if (yanPanVo.getWeiLaiChange3().compareTo(new BigDecimal(0)) > 0) {
                            stockDayYanPanLowLow.setShangZhangCount3(new BigDecimal(1));
                            stockDayYanPanLowLow.setShangZhangMa3(yanPanVo.getWeiLaiChange3());
                            stockDayYanPanLowLow.setShangZhangSum3(yanPanVo.getWeiLaiChange3());
                            stockDayYanPanLowLow.setShangZhangRate3(new BigDecimal(50));
                        } else {
                            stockDayYanPanLowLow.setXiaJiangCount3(new BigDecimal(1));
                            stockDayYanPanLowLow.setXiaJiangMa3(yanPanVo.getWeiLaiChange3());
                            stockDayYanPanLowLow.setXiaJiangSum3(yanPanVo.getWeiLaiChange3());
                            stockDayYanPanLowLow.setXiaJiangRate3(new BigDecimal(50));
                        }
                        if (yanPanVo.getWeiLaiChange5().compareTo(new BigDecimal(0)) > 0) {
                            stockDayYanPanLowLow.setShangZhangCount5(new BigDecimal(1));
                            stockDayYanPanLowLow.setShangZhangMa5(yanPanVo.getWeiLaiChange5());
                            stockDayYanPanLowLow.setShangZhangSum5(yanPanVo.getWeiLaiChange5());
                            stockDayYanPanLowLow.setShangZhangRate5(new BigDecimal(50));
                        } else {
                            stockDayYanPanLowLow.setXiaJiangCount5(new BigDecimal(1));
                            stockDayYanPanLowLow.setXiaJiangMa5(yanPanVo.getWeiLaiChange5());
                            stockDayYanPanLowLow.setXiaJiangSum5(yanPanVo.getWeiLaiChange5());
                            stockDayYanPanLowLow.setXiaJiangRate5(new BigDecimal(50));
                        }
                        if (yanPanVo.getWeiLaiChange8().compareTo(new BigDecimal(0)) > 0) {
                            stockDayYanPanLowLow.setShangZhangCount8(new BigDecimal(1));
                            stockDayYanPanLowLow.setShangZhangMa8(yanPanVo.getWeiLaiChange8());
                            stockDayYanPanLowLow.setShangZhangSum8(yanPanVo.getWeiLaiChange8());
                            stockDayYanPanLowLow.setShangZhangRate8(new BigDecimal(50));
                        } else {
                            stockDayYanPanLowLow.setXiaJiangCount8(new BigDecimal(1));
                            stockDayYanPanLowLow.setXiaJiangMa8(yanPanVo.getWeiLaiChange8());
                            stockDayYanPanLowLow.setXiaJiangSum8(yanPanVo.getWeiLaiChange8());
                            stockDayYanPanLowLow.setXiaJiangRate8(new BigDecimal(50));
                        }
                        if (yanPanVo.getWeiLaiChange13().compareTo(new BigDecimal(0)) > 0) {
                            stockDayYanPanLowLow.setShangZhangCount13(new BigDecimal(1));
                            stockDayYanPanLowLow.setShangZhangMa13(yanPanVo.getWeiLaiChange13());
                            stockDayYanPanLowLow.setShangZhangSum13(yanPanVo.getWeiLaiChange8());
                            stockDayYanPanLowLow.setShangZhangRate13(new BigDecimal(50));
                        } else {
                            stockDayYanPanLowLow.setXiaJiangCount13(new BigDecimal(1));
                            stockDayYanPanLowLow.setXiaJiangMa13(yanPanVo.getWeiLaiChange13());
                            stockDayYanPanLowLow.setXiaJiangSum13(yanPanVo.getWeiLaiChange13());
                            stockDayYanPanLowLow.setXiaJiangRate13(new BigDecimal(50));
                        }
                        if (yanPanVo.getWeiLaiChange20().compareTo(new BigDecimal(0)) > 0) {
                            stockDayYanPanLowLow.setShangZhangCount20(new BigDecimal(1));
                            stockDayYanPanLowLow.setShangZhangMa20(yanPanVo.getWeiLaiChange20());
                            stockDayYanPanLowLow.setShangZhangSum20(yanPanVo.getWeiLaiChange20());
                            stockDayYanPanLowLow.setShangZhangRate20(new BigDecimal(50));
                        } else {
                            stockDayYanPanLowLow.setXiaJiangCount20(new BigDecimal(1));
                            stockDayYanPanLowLow.setXiaJiangMa20(yanPanVo.getWeiLaiChange20());
                            stockDayYanPanLowLow.setXiaJiangSum20(yanPanVo.getWeiLaiChange20());
                            stockDayYanPanLowLow.setXiaJiangRate20(new BigDecimal(50));
                        }
                        StockDayYanPanUpUp stockDayYanPanUpUp = new StockDayYanPanUpUp();
                        BeanUtils.copyProperties(stockDayYanPanLowLow, stockDayYanPanUpUp);
                        String neirong = getUpUpString(stockDayYanPanUpUp);
                        FileOutputStream fs = new FileOutputStream(strPath.toString() + strFileName + ".txt");
                        byte[] buffer = neirong.getBytes();
                        int byteread = buffer.length;
                        //插入
                        fs.write(buffer, 0, byteread);
                        fs.flush();
                        fs.close();
                    } else {
                        StockDayYanPanUpUp stockDayYanPanUpUp1 = getUpUpentity(strPath.toString() + strFileName);
                        StockDayYanPanLowLow stockDayYanPanLowLow1 = new StockDayYanPanLowLow();
                        BeanUtils.copyProperties(stockDayYanPanUpUp1, stockDayYanPanLowLow1);
                        BeanUtils.copyProperties(stockDayYanPanUpUp1,stockDayYanPanLowLow);
                        if (yanPanVo.getWeiLaiChange1().compareTo(new BigDecimal(0)) > 0) {
                            BigDecimal count = stockDayYanPanLowLow1.getShangZhangCount1().add(new BigDecimal(1));
                            stockDayYanPanLowLow.setShangZhangCount1(count);
                            BigDecimal sum = stockDayYanPanLowLow1.getShangZhangSum1().add(yanPanVo.getWeiLaiChange1());
                            stockDayYanPanLowLow.setShangZhangSum1(sum);
                            BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                            stockDayYanPanLowLow.setShangZhangMa1(ma);
                            BigDecimal rate = count.divide((count.add(stockDayYanPanLowLow1.getXiaJiangCount1())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            stockDayYanPanLowLow.setShangZhangRate1(rate);
                        } else {
                            BigDecimal count = stockDayYanPanLowLow1.getXiaJiangCount1().add(new BigDecimal(1));
                            stockDayYanPanLowLow.setXiaJiangCount1(count);
                            BigDecimal sum = stockDayYanPanLowLow1.getXiaJiangSum1().add(yanPanVo.getWeiLaiChange1());
                            stockDayYanPanLowLow.setXiaJiangSum1(sum);
                            BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                            stockDayYanPanLowLow.setXiaJiangMa1(ma);
                            BigDecimal rate = count.divide((count.add(stockDayYanPanLowLow1.getShangZhangCount1())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            stockDayYanPanLowLow.setXiaJiangRate1(rate);
                        }
                        if (yanPanVo.getWeiLaiChange2().compareTo(new BigDecimal(0)) > 0) {
                            BigDecimal count = stockDayYanPanLowLow1.getShangZhangCount2().add(new BigDecimal(1));
                            stockDayYanPanLowLow.setShangZhangCount2(count);
                            BigDecimal sum = stockDayYanPanLowLow1.getShangZhangSum2().add(yanPanVo.getWeiLaiChange2());
                            stockDayYanPanLowLow.setShangZhangSum2(sum);
                            BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                            stockDayYanPanLowLow.setShangZhangMa2(ma);
                            BigDecimal rate = count.divide((count.add(stockDayYanPanLowLow1.getXiaJiangCount2())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            stockDayYanPanLowLow.setShangZhangRate2(rate);
                        } else {
                            BigDecimal count = stockDayYanPanLowLow1.getXiaJiangCount2().add(new BigDecimal(1));
                            stockDayYanPanLowLow.setXiaJiangCount2(count);
                            BigDecimal sum = stockDayYanPanLowLow1.getXiaJiangSum2().add(yanPanVo.getWeiLaiChange2());
                            stockDayYanPanLowLow.setXiaJiangSum2(sum);
                            BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                            stockDayYanPanLowLow.setXiaJiangMa2(ma);
                            BigDecimal rate = count.divide((count.add(stockDayYanPanLowLow1.getShangZhangCount2())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            stockDayYanPanLowLow.setXiaJiangRate2(rate);
                        }
                        if (yanPanVo.getWeiLaiChange3().compareTo(new BigDecimal(0)) > 0) {
                            BigDecimal count = stockDayYanPanLowLow1.getShangZhangCount3().add(new BigDecimal(1));
                            stockDayYanPanLowLow.setShangZhangCount3(count);
                            BigDecimal sum = stockDayYanPanLowLow1.getShangZhangSum3().add(yanPanVo.getWeiLaiChange3());
                            stockDayYanPanLowLow.setShangZhangSum3(sum);
                            BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                            stockDayYanPanLowLow.setShangZhangMa3(ma);
                            BigDecimal rate = count.divide((count.add(stockDayYanPanLowLow1.getXiaJiangCount3())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            stockDayYanPanLowLow.setShangZhangRate3(rate);
                        } else {
                            BigDecimal count = stockDayYanPanLowLow1.getXiaJiangCount3().add(new BigDecimal(1));
                            stockDayYanPanLowLow.setXiaJiangCount3(count);
                            BigDecimal sum = stockDayYanPanLowLow1.getXiaJiangSum3().add(yanPanVo.getWeiLaiChange3());
                            stockDayYanPanLowLow.setXiaJiangSum3(sum);
                            BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                            stockDayYanPanLowLow.setXiaJiangMa3(ma);
                            BigDecimal rate = count.divide((count.add(stockDayYanPanLowLow1.getShangZhangCount3())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            stockDayYanPanLowLow.setXiaJiangRate3(rate);
                        }
                        if (yanPanVo.getWeiLaiChange5().compareTo(new BigDecimal(0)) > 0) {
                            BigDecimal count = stockDayYanPanLowLow1.getShangZhangCount5().add(new BigDecimal(1));
                            stockDayYanPanLowLow.setShangZhangCount5(count);
                            BigDecimal sum = stockDayYanPanLowLow1.getShangZhangSum5().add(yanPanVo.getWeiLaiChange5());
                            stockDayYanPanLowLow.setShangZhangSum5(sum);
                            BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                            stockDayYanPanLowLow.setShangZhangMa5(ma);
                            BigDecimal rate = count.divide((count.add(stockDayYanPanLowLow1.getXiaJiangCount5())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            stockDayYanPanLowLow.setShangZhangRate5(rate);
                        } else {
                            BigDecimal count = stockDayYanPanLowLow1.getXiaJiangCount5().add(new BigDecimal(1));
                            stockDayYanPanLowLow.setXiaJiangCount5(count);
                            BigDecimal sum = stockDayYanPanLowLow1.getXiaJiangSum5().add(yanPanVo.getWeiLaiChange5());
                            stockDayYanPanLowLow.setXiaJiangSum5(sum);
                            BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                            stockDayYanPanLowLow.setXiaJiangMa5(ma);
                            BigDecimal rate = count.divide((count.add(stockDayYanPanLowLow1.getShangZhangCount5())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            stockDayYanPanLowLow.setXiaJiangRate5(rate);
                        }
                        if (yanPanVo.getWeiLaiChange8().compareTo(new BigDecimal(0)) > 0) {
                            BigDecimal count = stockDayYanPanLowLow1.getShangZhangCount8().add(new BigDecimal(1));
                            stockDayYanPanLowLow.setShangZhangCount8(count);
                            BigDecimal sum = stockDayYanPanLowLow1.getShangZhangSum8().add(yanPanVo.getWeiLaiChange8());
                            stockDayYanPanLowLow.setShangZhangSum8(sum);
                            BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                            stockDayYanPanLowLow.setShangZhangMa8(ma);
                            BigDecimal rate = count.divide((count.add(stockDayYanPanLowLow1.getXiaJiangCount8())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            stockDayYanPanLowLow.setShangZhangRate8(rate);
                        } else {
                            BigDecimal count = stockDayYanPanLowLow1.getXiaJiangCount8().add(new BigDecimal(1));
                            stockDayYanPanLowLow.setXiaJiangCount8(count);
                            BigDecimal sum = stockDayYanPanLowLow1.getXiaJiangSum8().add(yanPanVo.getWeiLaiChange8());
                            stockDayYanPanLowLow.setXiaJiangSum8(sum);
                            BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                            stockDayYanPanLowLow.setXiaJiangMa8(ma);
                            BigDecimal rate = count.divide((count.add(stockDayYanPanLowLow1.getShangZhangCount8())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            stockDayYanPanLowLow.setXiaJiangRate8(rate);
                        }
                        if (yanPanVo.getWeiLaiChange13().compareTo(new BigDecimal(0)) > 0) {
                            BigDecimal count = stockDayYanPanLowLow1.getShangZhangCount13().add(new BigDecimal(1));
                            stockDayYanPanLowLow.setShangZhangCount13(count);
                            BigDecimal sum = stockDayYanPanLowLow1.getShangZhangSum13().add(yanPanVo.getWeiLaiChange13());
                            stockDayYanPanLowLow.setShangZhangSum13(sum);
                            BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                            stockDayYanPanLowLow.setShangZhangMa13(ma);
                            BigDecimal rate = count.divide((count.add(stockDayYanPanLowLow1.getXiaJiangCount13())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            stockDayYanPanLowLow.setShangZhangRate13(rate);
                        } else {
                            BigDecimal count = stockDayYanPanLowLow1.getXiaJiangCount13().add(new BigDecimal(1));
                            stockDayYanPanLowLow.setXiaJiangCount13(count);
                            BigDecimal sum = stockDayYanPanLowLow1.getXiaJiangSum13().add(yanPanVo.getWeiLaiChange13());
                            stockDayYanPanLowLow.setXiaJiangSum13(sum);
                            BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                            stockDayYanPanLowLow.setXiaJiangMa13(ma);
                            BigDecimal rate = count.divide((count.add(stockDayYanPanLowLow1.getShangZhangCount13())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            stockDayYanPanLowLow.setXiaJiangRate13(rate);
                        }
                        if (yanPanVo.getWeiLaiChange20().compareTo(new BigDecimal(0)) > 0) {
                            BigDecimal count = stockDayYanPanLowLow1.getShangZhangCount20().add(new BigDecimal(1));
                            stockDayYanPanLowLow.setShangZhangCount20(count);
                            BigDecimal sum = stockDayYanPanLowLow1.getShangZhangSum20().add(yanPanVo.getWeiLaiChange20());
                            stockDayYanPanLowLow.setShangZhangSum20(sum);
                            BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                            stockDayYanPanLowLow.setShangZhangMa20(ma);
                            BigDecimal rate = count.divide((count.add(stockDayYanPanLowLow1.getXiaJiangCount20())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            stockDayYanPanLowLow.setShangZhangRate20(rate);
                        } else {
                            BigDecimal count = stockDayYanPanLowLow1.getXiaJiangCount20().add(new BigDecimal(1));
                            stockDayYanPanLowLow.setXiaJiangCount20(count);
                            BigDecimal sum = stockDayYanPanLowLow1.getXiaJiangSum20().add(yanPanVo.getWeiLaiChange20());
                            stockDayYanPanLowLow.setXiaJiangSum20(sum);
                            BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                            stockDayYanPanLowLow.setXiaJiangMa20(ma);
                            BigDecimal rate = count.divide((count.add(stockDayYanPanLowLow1.getShangZhangCount20())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            stockDayYanPanLowLow.setXiaJiangRate20(rate);
                        }
                        StockDayYanPanUpUp stockDayYanPanUpUp = new StockDayYanPanUpUp();
                        BeanUtils.copyProperties(stockDayYanPanLowLow, stockDayYanPanUpUp);
                        String neirong = getUpUpString(stockDayYanPanUpUp);
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
        }
    }
}
