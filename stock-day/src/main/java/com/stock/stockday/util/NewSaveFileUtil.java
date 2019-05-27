package com.stock.stockday.util;

import com.stock.apicommon.vo.YanPanVo;
import com.stock.stockday.entity.StockDayYanPan;
import com.stock.stockday.entity.StockDayYanPanBenpan;
import com.stock.stockday.entity.StockDayYanPanUpUp;
import com.stock.stockday.model.StockDayYanPanKMAQ20;
import com.stock.stockday.model.StockDayYanPanKMPTD;
import com.stock.stockday.model.StockDayYanPanKTu20L;
import com.stock.stockday.model.StockDayYanPanKTu20LS;
import com.stock.stockday.model.StockDayYanPanKTu20S;
import com.stock.stockday.model.StockDayYanPanKmQR;
import com.stock.stockday.model.StockDayYanPanQTuXing;
import com.stock.stockday.vo.StockDayVo;
import org.springframework.beans.BeanUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import static com.stock.stockday.util.GetEntity.getBenpanentity;
import static com.stock.stockday.util.GetEntity.getUpUpentity;
import static com.stock.stockday.util.GetFileName.getFileNameBp;
import static com.stock.stockday.util.GetString.getBenpanString;

public class NewSaveFileUtil {

    public static void KmpTD(YanPanVo yanPanVo, StockDayYanPan stockDayYanPan, StringBuffer strPath) throws IOException {
        StockDayYanPanKMPTD stockDayYanPanKMPTD=new StockDayYanPanKMPTD();
        BeanUtils.copyProperties(stockDayYanPan,stockDayYanPanKMPTD);
        String strFileName;
        strFileName = NewGetFileName.getFileNameKMPTD(stockDayYanPanKMPTD);
        File file = new File(strPath.toString() + strFileName + ".txt");
        if (!file.exists()) {
            if (yanPanVo.getWeiLaiChange1().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanKMPTD.setShangZhangCount1(new BigDecimal(1));
                stockDayYanPanKMPTD.setShangZhangMa1(yanPanVo.getWeiLaiChange1());
                stockDayYanPanKMPTD.setShangZhangSum1(yanPanVo.getWeiLaiChange1());
                stockDayYanPanKMPTD.setShangZhangRate1(new BigDecimal(50));
            } else {
                stockDayYanPanKMPTD.setXiaJiangCount1(new BigDecimal(1));
                stockDayYanPanKMPTD.setXiaJiangMa1(yanPanVo.getWeiLaiChange1());
                stockDayYanPanKMPTD.setXiaJiangSum1(yanPanVo.getWeiLaiChange1());
                stockDayYanPanKMPTD.setXiaJiangRate1(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange2().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanKMPTD.setShangZhangCount2(new BigDecimal(1));
                stockDayYanPanKMPTD.setShangZhangMa2(yanPanVo.getWeiLaiChange2());
                stockDayYanPanKMPTD.setShangZhangSum2(yanPanVo.getWeiLaiChange2());
                stockDayYanPanKMPTD.setShangZhangRate2(new BigDecimal(50));
            } else {
                stockDayYanPanKMPTD.setXiaJiangCount2(new BigDecimal(1));
                stockDayYanPanKMPTD.setXiaJiangMa2(yanPanVo.getWeiLaiChange2());
                stockDayYanPanKMPTD.setXiaJiangSum2(yanPanVo.getWeiLaiChange2());
                stockDayYanPanKMPTD.setXiaJiangRate2(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange3().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanKMPTD.setShangZhangCount3(new BigDecimal(1));
                stockDayYanPanKMPTD.setShangZhangMa3(yanPanVo.getWeiLaiChange3());
                stockDayYanPanKMPTD.setShangZhangSum3(yanPanVo.getWeiLaiChange3());
                stockDayYanPanKMPTD.setShangZhangRate3(new BigDecimal(50));
            } else {
                stockDayYanPanKMPTD.setXiaJiangCount3(new BigDecimal(1));
                stockDayYanPanKMPTD.setXiaJiangMa3(yanPanVo.getWeiLaiChange3());
                stockDayYanPanKMPTD.setXiaJiangSum3(yanPanVo.getWeiLaiChange3());
                stockDayYanPanKMPTD.setXiaJiangRate3(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange5().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanKMPTD.setShangZhangCount5(new BigDecimal(1));
                stockDayYanPanKMPTD.setShangZhangMa5(yanPanVo.getWeiLaiChange5());
                stockDayYanPanKMPTD.setShangZhangSum5(yanPanVo.getWeiLaiChange5());
                stockDayYanPanKMPTD.setShangZhangRate5(new BigDecimal(50));
            } else {
                stockDayYanPanKMPTD.setXiaJiangCount5(new BigDecimal(1));
                stockDayYanPanKMPTD.setXiaJiangMa5(yanPanVo.getWeiLaiChange5());
                stockDayYanPanKMPTD.setXiaJiangSum5(yanPanVo.getWeiLaiChange5());
                stockDayYanPanKMPTD.setXiaJiangRate5(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange8().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanKMPTD.setShangZhangCount8(new BigDecimal(1));
                stockDayYanPanKMPTD.setShangZhangMa8(yanPanVo.getWeiLaiChange8());
                stockDayYanPanKMPTD.setShangZhangSum8(yanPanVo.getWeiLaiChange8());
                stockDayYanPanKMPTD.setShangZhangRate8(new BigDecimal(50));
            } else {
                stockDayYanPanKMPTD.setXiaJiangCount8(new BigDecimal(1));
                stockDayYanPanKMPTD.setXiaJiangMa8(yanPanVo.getWeiLaiChange8());
                stockDayYanPanKMPTD.setXiaJiangSum8(yanPanVo.getWeiLaiChange8());
                stockDayYanPanKMPTD.setXiaJiangRate8(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange13().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanKMPTD.setShangZhangCount13(new BigDecimal(1));
                stockDayYanPanKMPTD.setShangZhangMa13(yanPanVo.getWeiLaiChange13());
                stockDayYanPanKMPTD.setShangZhangSum13(yanPanVo.getWeiLaiChange8());
                stockDayYanPanKMPTD.setShangZhangRate13(new BigDecimal(50));
            } else {
                stockDayYanPanKMPTD.setXiaJiangCount13(new BigDecimal(1));
                stockDayYanPanKMPTD.setXiaJiangMa13(yanPanVo.getWeiLaiChange13());
                stockDayYanPanKMPTD.setXiaJiangSum13(yanPanVo.getWeiLaiChange13());
                stockDayYanPanKMPTD.setXiaJiangRate13(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange20().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanKMPTD.setShangZhangCount20(new BigDecimal(1));
                stockDayYanPanKMPTD.setShangZhangMa20(yanPanVo.getWeiLaiChange20());
                stockDayYanPanKMPTD.setShangZhangSum20(yanPanVo.getWeiLaiChange20());
                stockDayYanPanKMPTD.setShangZhangRate20(new BigDecimal(50));
            } else {
                stockDayYanPanKMPTD.setXiaJiangCount20(new BigDecimal(1));
                stockDayYanPanKMPTD.setXiaJiangMa20(yanPanVo.getWeiLaiChange20());
                stockDayYanPanKMPTD.setXiaJiangSum20(yanPanVo.getWeiLaiChange20());
                stockDayYanPanKMPTD.setXiaJiangRate20(new BigDecimal(50));
            }
            String neirong =  NEWGetString.getkmptdString(stockDayYanPanKMPTD);
            FileOutputStream fs = new FileOutputStream(strPath.toString() + strFileName + ".txt");
            byte[] buffer = neirong.getBytes();
            int byteread = buffer.length;
            //插入
            fs.write(buffer, 0, byteread);
            fs.flush();
            fs.close();
        } else {
            StockDayYanPanKMPTD stockDayYanPanKMPTD1= NewGetEntity.getKMPTDentity(strPath.toString() + strFileName);
            BeanUtils.copyProperties(stockDayYanPanKMPTD1,stockDayYanPanKMPTD);
            if (yanPanVo.getWeiLaiChange1().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanKMPTD1.getShangZhangCount1().add(new BigDecimal(1));
                stockDayYanPanKMPTD.setShangZhangCount1(count);
                BigDecimal sum = stockDayYanPanKMPTD1.getShangZhangSum1().add(yanPanVo.getWeiLaiChange1());
                stockDayYanPanKMPTD.setShangZhangSum1(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKMPTD.setShangZhangMa1(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKMPTD1.getXiaJiangCount1())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKMPTD.setShangZhangRate1(rate);
            } else {
                BigDecimal count = stockDayYanPanKMPTD1.getXiaJiangCount1().add(new BigDecimal(1));
                stockDayYanPanKMPTD.setXiaJiangCount1(count);
                BigDecimal sum = stockDayYanPanKMPTD1.getXiaJiangSum1().add(yanPanVo.getWeiLaiChange1());
                stockDayYanPanKMPTD.setXiaJiangSum1(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKMPTD.setXiaJiangMa1(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKMPTD1.getShangZhangCount1())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKMPTD.setXiaJiangRate1(rate);
            }
            if (yanPanVo.getWeiLaiChange2().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanKMPTD1.getShangZhangCount2().add(new BigDecimal(1));
                stockDayYanPanKMPTD.setShangZhangCount2(count);
                BigDecimal sum = stockDayYanPanKMPTD1.getShangZhangSum2().add(yanPanVo.getWeiLaiChange2());
                stockDayYanPanKMPTD.setShangZhangSum2(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKMPTD.setShangZhangMa2(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKMPTD1.getXiaJiangCount2())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKMPTD.setShangZhangRate2(rate);
            } else {
                BigDecimal count = stockDayYanPanKMPTD1.getXiaJiangCount2().add(new BigDecimal(1));
                stockDayYanPanKMPTD.setXiaJiangCount2(count);
                BigDecimal sum = stockDayYanPanKMPTD1.getXiaJiangSum2().add(yanPanVo.getWeiLaiChange2());
                stockDayYanPanKMPTD.setXiaJiangSum2(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKMPTD.setXiaJiangMa2(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKMPTD1.getShangZhangCount2())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKMPTD.setXiaJiangRate2(rate);
            }
            if (yanPanVo.getWeiLaiChange3().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanKMPTD1.getShangZhangCount3().add(new BigDecimal(1));
                stockDayYanPanKMPTD.setShangZhangCount3(count);
                BigDecimal sum = stockDayYanPanKMPTD1.getShangZhangSum3().add(yanPanVo.getWeiLaiChange3());
                stockDayYanPanKMPTD.setShangZhangSum3(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKMPTD.setShangZhangMa3(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKMPTD1.getXiaJiangCount3())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKMPTD.setShangZhangRate3(rate);
            } else {
                BigDecimal count = stockDayYanPanKMPTD1.getXiaJiangCount3().add(new BigDecimal(1));
                stockDayYanPanKMPTD.setXiaJiangCount3(count);
                BigDecimal sum = stockDayYanPanKMPTD1.getXiaJiangSum3().add(yanPanVo.getWeiLaiChange3());
                stockDayYanPanKMPTD.setXiaJiangSum3(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKMPTD.setXiaJiangMa3(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKMPTD1.getShangZhangCount3())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKMPTD.setXiaJiangRate3(rate);
            }
            if (yanPanVo.getWeiLaiChange5().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanKMPTD1.getShangZhangCount5().add(new BigDecimal(1));
                stockDayYanPanKMPTD.setShangZhangCount5(count);
                BigDecimal sum = stockDayYanPanKMPTD1.getShangZhangSum5().add(yanPanVo.getWeiLaiChange5());
                stockDayYanPanKMPTD.setShangZhangSum5(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKMPTD.setShangZhangMa5(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKMPTD1.getXiaJiangCount5())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKMPTD.setShangZhangRate5(rate);
            } else {
                BigDecimal count = stockDayYanPanKMPTD1.getXiaJiangCount5().add(new BigDecimal(1));
                stockDayYanPanKMPTD.setXiaJiangCount5(count);
                BigDecimal sum = stockDayYanPanKMPTD1.getXiaJiangSum5().add(yanPanVo.getWeiLaiChange5());
                stockDayYanPanKMPTD.setXiaJiangSum5(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKMPTD.setXiaJiangMa5(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKMPTD1.getShangZhangCount5())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKMPTD.setXiaJiangRate5(rate);
            }
            if (yanPanVo.getWeiLaiChange8().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanKMPTD1.getShangZhangCount8().add(new BigDecimal(1));
                stockDayYanPanKMPTD.setShangZhangCount8(count);
                BigDecimal sum = stockDayYanPanKMPTD1.getShangZhangSum8().add(yanPanVo.getWeiLaiChange8());
                stockDayYanPanKMPTD.setShangZhangSum8(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKMPTD.setShangZhangMa8(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKMPTD1.getXiaJiangCount8())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKMPTD.setShangZhangRate8(rate);
            } else {
                BigDecimal count = stockDayYanPanKMPTD1.getXiaJiangCount8().add(new BigDecimal(1));
                stockDayYanPanKMPTD.setXiaJiangCount8(count);
                BigDecimal sum = stockDayYanPanKMPTD1.getXiaJiangSum8().add(yanPanVo.getWeiLaiChange8());
                stockDayYanPanKMPTD.setXiaJiangSum8(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKMPTD.setXiaJiangMa8(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKMPTD1.getShangZhangCount8())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKMPTD.setXiaJiangRate8(rate);
            }
            if (yanPanVo.getWeiLaiChange13().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanKMPTD1.getShangZhangCount13().add(new BigDecimal(1));
                stockDayYanPanKMPTD.setShangZhangCount13(count);
                BigDecimal sum = stockDayYanPanKMPTD1.getShangZhangSum13().add(yanPanVo.getWeiLaiChange13());
                stockDayYanPanKMPTD.setShangZhangSum13(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKMPTD.setShangZhangMa13(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKMPTD1.getXiaJiangCount13())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKMPTD.setShangZhangRate13(rate);
            } else {
                BigDecimal count = stockDayYanPanKMPTD1.getXiaJiangCount13().add(new BigDecimal(1));
                stockDayYanPanKMPTD.setXiaJiangCount13(count);
                BigDecimal sum = stockDayYanPanKMPTD1.getXiaJiangSum13().add(yanPanVo.getWeiLaiChange13());
                stockDayYanPanKMPTD.setXiaJiangSum13(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKMPTD.setXiaJiangMa13(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKMPTD1.getShangZhangCount13())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKMPTD.setXiaJiangRate13(rate);
            }
            if (yanPanVo.getWeiLaiChange20().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanKMPTD1.getShangZhangCount20().add(new BigDecimal(1));
                stockDayYanPanKMPTD.setShangZhangCount20(count);
                BigDecimal sum = stockDayYanPanKMPTD1.getShangZhangSum20().add(yanPanVo.getWeiLaiChange20());
                stockDayYanPanKMPTD.setShangZhangSum20(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKMPTD.setShangZhangMa20(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKMPTD1.getXiaJiangCount20())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKMPTD.setShangZhangRate20(rate);
            } else {
                BigDecimal count = stockDayYanPanKMPTD1.getXiaJiangCount20().add(new BigDecimal(1));
                stockDayYanPanKMPTD.setXiaJiangCount20(count);
                BigDecimal sum = stockDayYanPanKMPTD1.getXiaJiangSum20().add(yanPanVo.getWeiLaiChange20());
                stockDayYanPanKMPTD.setXiaJiangSum20(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKMPTD.setXiaJiangMa20(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKMPTD1.getShangZhangCount20())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKMPTD.setXiaJiangRate20(rate);
            }
            String neirong = NEWGetString.getkmptdString(stockDayYanPanKMPTD);
            FileOutputStream fs = new FileOutputStream(strPath.toString() + strFileName + ".txt");
            byte[] buffer = neirong.getBytes();
            int byteread = buffer.length;
            //插入
            fs.write(buffer, 0, byteread);
            fs.flush();
            fs.close();
        }
    }

    public static void KTu20LS(YanPanVo yanPanVo, StockDayYanPan stockDayYanPan, StringBuffer strPath) throws IOException {
        StockDayYanPanKTu20LS stockDayYanPanKTu20LS=new StockDayYanPanKTu20LS();
        BeanUtils.copyProperties(stockDayYanPan,stockDayYanPanKTu20LS);
        String strFileName;
        strFileName = NewGetFileName.getFileNameKTu20LS(stockDayYanPanKTu20LS);
        File file = new File(strPath.toString() + strFileName + ".txt");
        if (!file.exists()) {
            if (yanPanVo.getWeiLaiChange1().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanKTu20LS.setShangZhangCount1(new BigDecimal(1));
                stockDayYanPanKTu20LS.setShangZhangMa1(yanPanVo.getWeiLaiChange1());
                stockDayYanPanKTu20LS.setShangZhangSum1(yanPanVo.getWeiLaiChange1());
                stockDayYanPanKTu20LS.setShangZhangRate1(new BigDecimal(50));
            } else {
                stockDayYanPanKTu20LS.setXiaJiangCount1(new BigDecimal(1));
                stockDayYanPanKTu20LS.setXiaJiangMa1(yanPanVo.getWeiLaiChange1());
                stockDayYanPanKTu20LS.setXiaJiangSum1(yanPanVo.getWeiLaiChange1());
                stockDayYanPanKTu20LS.setXiaJiangRate1(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange2().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanKTu20LS.setShangZhangCount2(new BigDecimal(1));
                stockDayYanPanKTu20LS.setShangZhangMa2(yanPanVo.getWeiLaiChange2());
                stockDayYanPanKTu20LS.setShangZhangSum2(yanPanVo.getWeiLaiChange2());
                stockDayYanPanKTu20LS.setShangZhangRate2(new BigDecimal(50));
            } else {
                stockDayYanPanKTu20LS.setXiaJiangCount2(new BigDecimal(1));
                stockDayYanPanKTu20LS.setXiaJiangMa2(yanPanVo.getWeiLaiChange2());
                stockDayYanPanKTu20LS.setXiaJiangSum2(yanPanVo.getWeiLaiChange2());
                stockDayYanPanKTu20LS.setXiaJiangRate2(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange3().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanKTu20LS.setShangZhangCount3(new BigDecimal(1));
                stockDayYanPanKTu20LS.setShangZhangMa3(yanPanVo.getWeiLaiChange3());
                stockDayYanPanKTu20LS.setShangZhangSum3(yanPanVo.getWeiLaiChange3());
                stockDayYanPanKTu20LS.setShangZhangRate3(new BigDecimal(50));
            } else {
                stockDayYanPanKTu20LS.setXiaJiangCount3(new BigDecimal(1));
                stockDayYanPanKTu20LS.setXiaJiangMa3(yanPanVo.getWeiLaiChange3());
                stockDayYanPanKTu20LS.setXiaJiangSum3(yanPanVo.getWeiLaiChange3());
                stockDayYanPanKTu20LS.setXiaJiangRate3(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange5().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanKTu20LS.setShangZhangCount5(new BigDecimal(1));
                stockDayYanPanKTu20LS.setShangZhangMa5(yanPanVo.getWeiLaiChange5());
                stockDayYanPanKTu20LS.setShangZhangSum5(yanPanVo.getWeiLaiChange5());
                stockDayYanPanKTu20LS.setShangZhangRate5(new BigDecimal(50));
            } else {
                stockDayYanPanKTu20LS.setXiaJiangCount5(new BigDecimal(1));
                stockDayYanPanKTu20LS.setXiaJiangMa5(yanPanVo.getWeiLaiChange5());
                stockDayYanPanKTu20LS.setXiaJiangSum5(yanPanVo.getWeiLaiChange5());
                stockDayYanPanKTu20LS.setXiaJiangRate5(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange8().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanKTu20LS.setShangZhangCount8(new BigDecimal(1));
                stockDayYanPanKTu20LS.setShangZhangMa8(yanPanVo.getWeiLaiChange8());
                stockDayYanPanKTu20LS.setShangZhangSum8(yanPanVo.getWeiLaiChange8());
                stockDayYanPanKTu20LS.setShangZhangRate8(new BigDecimal(50));
            } else {
                stockDayYanPanKTu20LS.setXiaJiangCount8(new BigDecimal(1));
                stockDayYanPanKTu20LS.setXiaJiangMa8(yanPanVo.getWeiLaiChange8());
                stockDayYanPanKTu20LS.setXiaJiangSum8(yanPanVo.getWeiLaiChange8());
                stockDayYanPanKTu20LS.setXiaJiangRate8(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange13().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanKTu20LS.setShangZhangCount13(new BigDecimal(1));
                stockDayYanPanKTu20LS.setShangZhangMa13(yanPanVo.getWeiLaiChange13());
                stockDayYanPanKTu20LS.setShangZhangSum13(yanPanVo.getWeiLaiChange8());
                stockDayYanPanKTu20LS.setShangZhangRate13(new BigDecimal(50));
            } else {
                stockDayYanPanKTu20LS.setXiaJiangCount13(new BigDecimal(1));
                stockDayYanPanKTu20LS.setXiaJiangMa13(yanPanVo.getWeiLaiChange13());
                stockDayYanPanKTu20LS.setXiaJiangSum13(yanPanVo.getWeiLaiChange13());
                stockDayYanPanKTu20LS.setXiaJiangRate13(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange20().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanKTu20LS.setShangZhangCount20(new BigDecimal(1));
                stockDayYanPanKTu20LS.setShangZhangMa20(yanPanVo.getWeiLaiChange20());
                stockDayYanPanKTu20LS.setShangZhangSum20(yanPanVo.getWeiLaiChange20());
                stockDayYanPanKTu20LS.setShangZhangRate20(new BigDecimal(50));
            } else {
                stockDayYanPanKTu20LS.setXiaJiangCount20(new BigDecimal(1));
                stockDayYanPanKTu20LS.setXiaJiangMa20(yanPanVo.getWeiLaiChange20());
                stockDayYanPanKTu20LS.setXiaJiangSum20(yanPanVo.getWeiLaiChange20());
                stockDayYanPanKTu20LS.setXiaJiangRate20(new BigDecimal(50));
            }
            String neirong =  NEWGetString.getKTu20LSString(stockDayYanPanKTu20LS);
            FileOutputStream fs = new FileOutputStream(strPath.toString() + strFileName + ".txt");
            byte[] buffer = neirong.getBytes();
            int byteread = buffer.length;
            //插入
            fs.write(buffer, 0, byteread);
            fs.flush();
            fs.close();
        } else {
            StockDayYanPanKTu20LS stockDayYanPanKTu20LS1= NewGetEntity.getKTu20LSentity(strPath.toString() + strFileName);
            BeanUtils.copyProperties(stockDayYanPanKTu20LS1,stockDayYanPanKTu20LS);
            if (yanPanVo.getWeiLaiChange1().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanKTu20LS1.getShangZhangCount1().add(new BigDecimal(1));
                stockDayYanPanKTu20LS.setShangZhangCount1(count);
                BigDecimal sum = stockDayYanPanKTu20LS1.getShangZhangSum1().add(yanPanVo.getWeiLaiChange1());
                stockDayYanPanKTu20LS.setShangZhangSum1(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKTu20LS.setShangZhangMa1(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKTu20LS1.getXiaJiangCount1())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKTu20LS.setShangZhangRate1(rate);
            } else {
                BigDecimal count = stockDayYanPanKTu20LS1.getXiaJiangCount1().add(new BigDecimal(1));
                stockDayYanPanKTu20LS.setXiaJiangCount1(count);
                BigDecimal sum = stockDayYanPanKTu20LS1.getXiaJiangSum1().add(yanPanVo.getWeiLaiChange1());
                stockDayYanPanKTu20LS.setXiaJiangSum1(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKTu20LS.setXiaJiangMa1(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKTu20LS1.getShangZhangCount1())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKTu20LS.setXiaJiangRate1(rate);
            }
            if (yanPanVo.getWeiLaiChange2().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanKTu20LS1.getShangZhangCount2().add(new BigDecimal(1));
                stockDayYanPanKTu20LS.setShangZhangCount2(count);
                BigDecimal sum = stockDayYanPanKTu20LS1.getShangZhangSum2().add(yanPanVo.getWeiLaiChange2());
                stockDayYanPanKTu20LS.setShangZhangSum2(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKTu20LS.setShangZhangMa2(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKTu20LS1.getXiaJiangCount2())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKTu20LS.setShangZhangRate2(rate);
            } else {
                BigDecimal count = stockDayYanPanKTu20LS1.getXiaJiangCount2().add(new BigDecimal(1));
                stockDayYanPanKTu20LS.setXiaJiangCount2(count);
                BigDecimal sum = stockDayYanPanKTu20LS1.getXiaJiangSum2().add(yanPanVo.getWeiLaiChange2());
                stockDayYanPanKTu20LS.setXiaJiangSum2(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKTu20LS.setXiaJiangMa2(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKTu20LS1.getShangZhangCount2())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKTu20LS.setXiaJiangRate2(rate);
            }
            if (yanPanVo.getWeiLaiChange3().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanKTu20LS1.getShangZhangCount3().add(new BigDecimal(1));
                stockDayYanPanKTu20LS.setShangZhangCount3(count);
                BigDecimal sum = stockDayYanPanKTu20LS1.getShangZhangSum3().add(yanPanVo.getWeiLaiChange3());
                stockDayYanPanKTu20LS.setShangZhangSum3(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKTu20LS.setShangZhangMa3(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKTu20LS1.getXiaJiangCount3())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKTu20LS.setShangZhangRate3(rate);
            } else {
                BigDecimal count = stockDayYanPanKTu20LS1.getXiaJiangCount3().add(new BigDecimal(1));
                stockDayYanPanKTu20LS.setXiaJiangCount3(count);
                BigDecimal sum = stockDayYanPanKTu20LS1.getXiaJiangSum3().add(yanPanVo.getWeiLaiChange3());
                stockDayYanPanKTu20LS.setXiaJiangSum3(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKTu20LS.setXiaJiangMa3(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKTu20LS1.getShangZhangCount3())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKTu20LS.setXiaJiangRate3(rate);
            }
            if (yanPanVo.getWeiLaiChange5().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanKTu20LS1.getShangZhangCount5().add(new BigDecimal(1));
                stockDayYanPanKTu20LS.setShangZhangCount5(count);
                BigDecimal sum = stockDayYanPanKTu20LS1.getShangZhangSum5().add(yanPanVo.getWeiLaiChange5());
                stockDayYanPanKTu20LS.setShangZhangSum5(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKTu20LS.setShangZhangMa5(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKTu20LS1.getXiaJiangCount5())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKTu20LS.setShangZhangRate5(rate);
            } else {
                BigDecimal count = stockDayYanPanKTu20LS1.getXiaJiangCount5().add(new BigDecimal(1));
                stockDayYanPanKTu20LS.setXiaJiangCount5(count);
                BigDecimal sum = stockDayYanPanKTu20LS1.getXiaJiangSum5().add(yanPanVo.getWeiLaiChange5());
                stockDayYanPanKTu20LS.setXiaJiangSum5(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKTu20LS.setXiaJiangMa5(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKTu20LS1.getShangZhangCount5())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKTu20LS.setXiaJiangRate5(rate);
            }
            if (yanPanVo.getWeiLaiChange8().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanKTu20LS1.getShangZhangCount8().add(new BigDecimal(1));
                stockDayYanPanKTu20LS.setShangZhangCount8(count);
                BigDecimal sum = stockDayYanPanKTu20LS1.getShangZhangSum8().add(yanPanVo.getWeiLaiChange8());
                stockDayYanPanKTu20LS.setShangZhangSum8(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKTu20LS.setShangZhangMa8(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKTu20LS1.getXiaJiangCount8())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKTu20LS.setShangZhangRate8(rate);
            } else {
                BigDecimal count = stockDayYanPanKTu20LS1.getXiaJiangCount8().add(new BigDecimal(1));
                stockDayYanPanKTu20LS.setXiaJiangCount8(count);
                BigDecimal sum = stockDayYanPanKTu20LS1.getXiaJiangSum8().add(yanPanVo.getWeiLaiChange8());
                stockDayYanPanKTu20LS.setXiaJiangSum8(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKTu20LS.setXiaJiangMa8(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKTu20LS1.getShangZhangCount8())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKTu20LS.setXiaJiangRate8(rate);
            }
            if (yanPanVo.getWeiLaiChange13().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanKTu20LS1.getShangZhangCount13().add(new BigDecimal(1));
                stockDayYanPanKTu20LS.setShangZhangCount13(count);
                BigDecimal sum = stockDayYanPanKTu20LS1.getShangZhangSum13().add(yanPanVo.getWeiLaiChange13());
                stockDayYanPanKTu20LS.setShangZhangSum13(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKTu20LS.setShangZhangMa13(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKTu20LS1.getXiaJiangCount13())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKTu20LS.setShangZhangRate13(rate);
            } else {
                BigDecimal count = stockDayYanPanKTu20LS1.getXiaJiangCount13().add(new BigDecimal(1));
                stockDayYanPanKTu20LS.setXiaJiangCount13(count);
                BigDecimal sum = stockDayYanPanKTu20LS1.getXiaJiangSum13().add(yanPanVo.getWeiLaiChange13());
                stockDayYanPanKTu20LS.setXiaJiangSum13(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKTu20LS.setXiaJiangMa13(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKTu20LS1.getShangZhangCount13())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKTu20LS.setXiaJiangRate13(rate);
            }
            if (yanPanVo.getWeiLaiChange20().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanKTu20LS1.getShangZhangCount20().add(new BigDecimal(1));
                stockDayYanPanKTu20LS.setShangZhangCount20(count);
                BigDecimal sum = stockDayYanPanKTu20LS1.getShangZhangSum20().add(yanPanVo.getWeiLaiChange20());
                stockDayYanPanKTu20LS.setShangZhangSum20(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKTu20LS.setShangZhangMa20(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKTu20LS1.getXiaJiangCount20())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKTu20LS.setShangZhangRate20(rate);
            } else {
                BigDecimal count = stockDayYanPanKTu20LS1.getXiaJiangCount20().add(new BigDecimal(1));
                stockDayYanPanKTu20LS.setXiaJiangCount20(count);
                BigDecimal sum = stockDayYanPanKTu20LS1.getXiaJiangSum20().add(yanPanVo.getWeiLaiChange20());
                stockDayYanPanKTu20LS.setXiaJiangSum20(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKTu20LS.setXiaJiangMa20(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKTu20LS1.getShangZhangCount20())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKTu20LS.setXiaJiangRate20(rate);
            }
            String neirong = NEWGetString.getKTu20LSString(stockDayYanPanKTu20LS);
            FileOutputStream fs = new FileOutputStream(strPath.toString() + strFileName + ".txt");
            byte[] buffer = neirong.getBytes();
            int byteread = buffer.length;
            //插入
            fs.write(buffer, 0, byteread);
            fs.flush();
            fs.close();
        }
    }

    public static void KTu20S(YanPanVo yanPanVo, StockDayYanPan stockDayYanPan, StringBuffer strPath) throws IOException {
        StockDayYanPanKTu20S stockDayYanPanKTu20S=new StockDayYanPanKTu20S();
        BeanUtils.copyProperties(stockDayYanPan,stockDayYanPanKTu20S);
        String strFileName;
        strFileName = NewGetFileName.getFileNameKTu20S(stockDayYanPanKTu20S);
        File file = new File(strPath.toString() + strFileName + ".txt");
        if (!file.exists()) {
            if (yanPanVo.getWeiLaiChange1().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanKTu20S.setShangZhangCount1(new BigDecimal(1));
                stockDayYanPanKTu20S.setShangZhangMa1(yanPanVo.getWeiLaiChange1());
                stockDayYanPanKTu20S.setShangZhangSum1(yanPanVo.getWeiLaiChange1());
                stockDayYanPanKTu20S.setShangZhangRate1(new BigDecimal(50));
            } else {
                stockDayYanPanKTu20S.setXiaJiangCount1(new BigDecimal(1));
                stockDayYanPanKTu20S.setXiaJiangMa1(yanPanVo.getWeiLaiChange1());
                stockDayYanPanKTu20S.setXiaJiangSum1(yanPanVo.getWeiLaiChange1());
                stockDayYanPanKTu20S.setXiaJiangRate1(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange2().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanKTu20S.setShangZhangCount2(new BigDecimal(1));
                stockDayYanPanKTu20S.setShangZhangMa2(yanPanVo.getWeiLaiChange2());
                stockDayYanPanKTu20S.setShangZhangSum2(yanPanVo.getWeiLaiChange2());
                stockDayYanPanKTu20S.setShangZhangRate2(new BigDecimal(50));
            } else {
                stockDayYanPanKTu20S.setXiaJiangCount2(new BigDecimal(1));
                stockDayYanPanKTu20S.setXiaJiangMa2(yanPanVo.getWeiLaiChange2());
                stockDayYanPanKTu20S.setXiaJiangSum2(yanPanVo.getWeiLaiChange2());
                stockDayYanPanKTu20S.setXiaJiangRate2(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange3().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanKTu20S.setShangZhangCount3(new BigDecimal(1));
                stockDayYanPanKTu20S.setShangZhangMa3(yanPanVo.getWeiLaiChange3());
                stockDayYanPanKTu20S.setShangZhangSum3(yanPanVo.getWeiLaiChange3());
                stockDayYanPanKTu20S.setShangZhangRate3(new BigDecimal(50));
            } else {
                stockDayYanPanKTu20S.setXiaJiangCount3(new BigDecimal(1));
                stockDayYanPanKTu20S.setXiaJiangMa3(yanPanVo.getWeiLaiChange3());
                stockDayYanPanKTu20S.setXiaJiangSum3(yanPanVo.getWeiLaiChange3());
                stockDayYanPanKTu20S.setXiaJiangRate3(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange5().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanKTu20S.setShangZhangCount5(new BigDecimal(1));
                stockDayYanPanKTu20S.setShangZhangMa5(yanPanVo.getWeiLaiChange5());
                stockDayYanPanKTu20S.setShangZhangSum5(yanPanVo.getWeiLaiChange5());
                stockDayYanPanKTu20S.setShangZhangRate5(new BigDecimal(50));
            } else {
                stockDayYanPanKTu20S.setXiaJiangCount5(new BigDecimal(1));
                stockDayYanPanKTu20S.setXiaJiangMa5(yanPanVo.getWeiLaiChange5());
                stockDayYanPanKTu20S.setXiaJiangSum5(yanPanVo.getWeiLaiChange5());
                stockDayYanPanKTu20S.setXiaJiangRate5(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange8().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanKTu20S.setShangZhangCount8(new BigDecimal(1));
                stockDayYanPanKTu20S.setShangZhangMa8(yanPanVo.getWeiLaiChange8());
                stockDayYanPanKTu20S.setShangZhangSum8(yanPanVo.getWeiLaiChange8());
                stockDayYanPanKTu20S.setShangZhangRate8(new BigDecimal(50));
            } else {
                stockDayYanPanKTu20S.setXiaJiangCount8(new BigDecimal(1));
                stockDayYanPanKTu20S.setXiaJiangMa8(yanPanVo.getWeiLaiChange8());
                stockDayYanPanKTu20S.setXiaJiangSum8(yanPanVo.getWeiLaiChange8());
                stockDayYanPanKTu20S.setXiaJiangRate8(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange13().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanKTu20S.setShangZhangCount13(new BigDecimal(1));
                stockDayYanPanKTu20S.setShangZhangMa13(yanPanVo.getWeiLaiChange13());
                stockDayYanPanKTu20S.setShangZhangSum13(yanPanVo.getWeiLaiChange8());
                stockDayYanPanKTu20S.setShangZhangRate13(new BigDecimal(50));
            } else {
                stockDayYanPanKTu20S.setXiaJiangCount13(new BigDecimal(1));
                stockDayYanPanKTu20S.setXiaJiangMa13(yanPanVo.getWeiLaiChange13());
                stockDayYanPanKTu20S.setXiaJiangSum13(yanPanVo.getWeiLaiChange13());
                stockDayYanPanKTu20S.setXiaJiangRate13(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange20().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanKTu20S.setShangZhangCount20(new BigDecimal(1));
                stockDayYanPanKTu20S.setShangZhangMa20(yanPanVo.getWeiLaiChange20());
                stockDayYanPanKTu20S.setShangZhangSum20(yanPanVo.getWeiLaiChange20());
                stockDayYanPanKTu20S.setShangZhangRate20(new BigDecimal(50));
            } else {
                stockDayYanPanKTu20S.setXiaJiangCount20(new BigDecimal(1));
                stockDayYanPanKTu20S.setXiaJiangMa20(yanPanVo.getWeiLaiChange20());
                stockDayYanPanKTu20S.setXiaJiangSum20(yanPanVo.getWeiLaiChange20());
                stockDayYanPanKTu20S.setXiaJiangRate20(new BigDecimal(50));
            }
            String neirong =  NEWGetString.getKTu20SString(stockDayYanPanKTu20S);
            FileOutputStream fs = new FileOutputStream(strPath.toString() + strFileName + ".txt");
            byte[] buffer = neirong.getBytes();
            int byteread = buffer.length;
            //插入
            fs.write(buffer, 0, byteread);
            fs.flush();
            fs.close();
        } else {
            StockDayYanPanKTu20S stockDayYanPanKTu20S1= NewGetEntity.getKTu20Sentity(strPath.toString() + strFileName);
            BeanUtils.copyProperties(stockDayYanPanKTu20S1,stockDayYanPanKTu20S);
            if (yanPanVo.getWeiLaiChange1().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanKTu20S1.getShangZhangCount1().add(new BigDecimal(1));
                stockDayYanPanKTu20S.setShangZhangCount1(count);
                BigDecimal sum = stockDayYanPanKTu20S1.getShangZhangSum1().add(yanPanVo.getWeiLaiChange1());
                stockDayYanPanKTu20S.setShangZhangSum1(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKTu20S.setShangZhangMa1(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKTu20S1.getXiaJiangCount1())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKTu20S.setShangZhangRate1(rate);
            } else {
                BigDecimal count = stockDayYanPanKTu20S1.getXiaJiangCount1().add(new BigDecimal(1));
                stockDayYanPanKTu20S.setXiaJiangCount1(count);
                BigDecimal sum = stockDayYanPanKTu20S1.getXiaJiangSum1().add(yanPanVo.getWeiLaiChange1());
                stockDayYanPanKTu20S.setXiaJiangSum1(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKTu20S.setXiaJiangMa1(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKTu20S1.getShangZhangCount1())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKTu20S.setXiaJiangRate1(rate);
            }
            if (yanPanVo.getWeiLaiChange2().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanKTu20S1.getShangZhangCount2().add(new BigDecimal(1));
                stockDayYanPanKTu20S.setShangZhangCount2(count);
                BigDecimal sum = stockDayYanPanKTu20S1.getShangZhangSum2().add(yanPanVo.getWeiLaiChange2());
                stockDayYanPanKTu20S.setShangZhangSum2(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKTu20S.setShangZhangMa2(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKTu20S1.getXiaJiangCount2())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKTu20S.setShangZhangRate2(rate);
            } else {
                BigDecimal count = stockDayYanPanKTu20S1.getXiaJiangCount2().add(new BigDecimal(1));
                stockDayYanPanKTu20S.setXiaJiangCount2(count);
                BigDecimal sum = stockDayYanPanKTu20S1.getXiaJiangSum2().add(yanPanVo.getWeiLaiChange2());
                stockDayYanPanKTu20S.setXiaJiangSum2(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKTu20S.setXiaJiangMa2(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKTu20S1.getShangZhangCount2())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKTu20S.setXiaJiangRate2(rate);
            }
            if (yanPanVo.getWeiLaiChange3().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanKTu20S1.getShangZhangCount3().add(new BigDecimal(1));
                stockDayYanPanKTu20S.setShangZhangCount3(count);
                BigDecimal sum = stockDayYanPanKTu20S1.getShangZhangSum3().add(yanPanVo.getWeiLaiChange3());
                stockDayYanPanKTu20S.setShangZhangSum3(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKTu20S.setShangZhangMa3(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKTu20S1.getXiaJiangCount3())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKTu20S.setShangZhangRate3(rate);
            } else {
                BigDecimal count = stockDayYanPanKTu20S1.getXiaJiangCount3().add(new BigDecimal(1));
                stockDayYanPanKTu20S.setXiaJiangCount3(count);
                BigDecimal sum = stockDayYanPanKTu20S1.getXiaJiangSum3().add(yanPanVo.getWeiLaiChange3());
                stockDayYanPanKTu20S.setXiaJiangSum3(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKTu20S.setXiaJiangMa3(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKTu20S1.getShangZhangCount3())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKTu20S.setXiaJiangRate3(rate);
            }
            if (yanPanVo.getWeiLaiChange5().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanKTu20S1.getShangZhangCount5().add(new BigDecimal(1));
                stockDayYanPanKTu20S.setShangZhangCount5(count);
                BigDecimal sum = stockDayYanPanKTu20S1.getShangZhangSum5().add(yanPanVo.getWeiLaiChange5());
                stockDayYanPanKTu20S.setShangZhangSum5(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKTu20S.setShangZhangMa5(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKTu20S1.getXiaJiangCount5())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKTu20S.setShangZhangRate5(rate);
            } else {
                BigDecimal count = stockDayYanPanKTu20S1.getXiaJiangCount5().add(new BigDecimal(1));
                stockDayYanPanKTu20S.setXiaJiangCount5(count);
                BigDecimal sum = stockDayYanPanKTu20S1.getXiaJiangSum5().add(yanPanVo.getWeiLaiChange5());
                stockDayYanPanKTu20S.setXiaJiangSum5(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKTu20S.setXiaJiangMa5(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKTu20S1.getShangZhangCount5())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKTu20S.setXiaJiangRate5(rate);
            }
            if (yanPanVo.getWeiLaiChange8().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanKTu20S1.getShangZhangCount8().add(new BigDecimal(1));
                stockDayYanPanKTu20S.setShangZhangCount8(count);
                BigDecimal sum = stockDayYanPanKTu20S1.getShangZhangSum8().add(yanPanVo.getWeiLaiChange8());
                stockDayYanPanKTu20S.setShangZhangSum8(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKTu20S.setShangZhangMa8(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKTu20S1.getXiaJiangCount8())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKTu20S.setShangZhangRate8(rate);
            } else {
                BigDecimal count = stockDayYanPanKTu20S1.getXiaJiangCount8().add(new BigDecimal(1));
                stockDayYanPanKTu20S.setXiaJiangCount8(count);
                BigDecimal sum = stockDayYanPanKTu20S1.getXiaJiangSum8().add(yanPanVo.getWeiLaiChange8());
                stockDayYanPanKTu20S.setXiaJiangSum8(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKTu20S.setXiaJiangMa8(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKTu20S1.getShangZhangCount8())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKTu20S.setXiaJiangRate8(rate);
            }
            if (yanPanVo.getWeiLaiChange13().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanKTu20S1.getShangZhangCount13().add(new BigDecimal(1));
                stockDayYanPanKTu20S.setShangZhangCount13(count);
                BigDecimal sum = stockDayYanPanKTu20S1.getShangZhangSum13().add(yanPanVo.getWeiLaiChange13());
                stockDayYanPanKTu20S.setShangZhangSum13(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKTu20S.setShangZhangMa13(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKTu20S1.getXiaJiangCount13())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKTu20S.setShangZhangRate13(rate);
            } else {
                BigDecimal count = stockDayYanPanKTu20S1.getXiaJiangCount13().add(new BigDecimal(1));
                stockDayYanPanKTu20S.setXiaJiangCount13(count);
                BigDecimal sum = stockDayYanPanKTu20S1.getXiaJiangSum13().add(yanPanVo.getWeiLaiChange13());
                stockDayYanPanKTu20S.setXiaJiangSum13(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKTu20S.setXiaJiangMa13(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKTu20S1.getShangZhangCount13())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKTu20S.setXiaJiangRate13(rate);
            }
            if (yanPanVo.getWeiLaiChange20().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanKTu20S1.getShangZhangCount20().add(new BigDecimal(1));
                stockDayYanPanKTu20S.setShangZhangCount20(count);
                BigDecimal sum = stockDayYanPanKTu20S1.getShangZhangSum20().add(yanPanVo.getWeiLaiChange20());
                stockDayYanPanKTu20S.setShangZhangSum20(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKTu20S.setShangZhangMa20(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKTu20S1.getXiaJiangCount20())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKTu20S.setShangZhangRate20(rate);
            } else {
                BigDecimal count = stockDayYanPanKTu20S1.getXiaJiangCount20().add(new BigDecimal(1));
                stockDayYanPanKTu20S.setXiaJiangCount20(count);
                BigDecimal sum = stockDayYanPanKTu20S1.getXiaJiangSum20().add(yanPanVo.getWeiLaiChange20());
                stockDayYanPanKTu20S.setXiaJiangSum20(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKTu20S.setXiaJiangMa20(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKTu20S1.getShangZhangCount20())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKTu20S.setXiaJiangRate20(rate);
            }
            String neirong = NEWGetString.getKTu20SString(stockDayYanPanKTu20S1);
            FileOutputStream fs = new FileOutputStream(strPath.toString() + strFileName + ".txt");
            byte[] buffer = neirong.getBytes();
            int byteread = buffer.length;
            //插入
            fs.write(buffer, 0, byteread);
            fs.flush();
            fs.close();
        }
    }

    public static void KTu20L(YanPanVo yanPanVo, StockDayYanPan stockDayYanPan, StringBuffer strPath) throws IOException {
        StockDayYanPanKTu20L stockDayYanPanKTu20L=new StockDayYanPanKTu20L();
        BeanUtils.copyProperties(stockDayYanPan,stockDayYanPanKTu20L);
        String strFileName;
        strFileName = NewGetFileName.getFileNameKTu20L(stockDayYanPanKTu20L);
        File file = new File(strPath.toString() + strFileName + ".txt");
        if (!file.exists()) {
            if (yanPanVo.getWeiLaiChange1().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanKTu20L.setShangZhangCount1(new BigDecimal(1));
                stockDayYanPanKTu20L.setShangZhangMa1(yanPanVo.getWeiLaiChange1());
                stockDayYanPanKTu20L.setShangZhangSum1(yanPanVo.getWeiLaiChange1());
                stockDayYanPanKTu20L.setShangZhangRate1(new BigDecimal(50));
            } else {
                stockDayYanPanKTu20L.setXiaJiangCount1(new BigDecimal(1));
                stockDayYanPanKTu20L.setXiaJiangMa1(yanPanVo.getWeiLaiChange1());
                stockDayYanPanKTu20L.setXiaJiangSum1(yanPanVo.getWeiLaiChange1());
                stockDayYanPanKTu20L.setXiaJiangRate1(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange2().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanKTu20L.setShangZhangCount2(new BigDecimal(1));
                stockDayYanPanKTu20L.setShangZhangMa2(yanPanVo.getWeiLaiChange2());
                stockDayYanPanKTu20L.setShangZhangSum2(yanPanVo.getWeiLaiChange2());
                stockDayYanPanKTu20L.setShangZhangRate2(new BigDecimal(50));
            } else {
                stockDayYanPanKTu20L.setXiaJiangCount2(new BigDecimal(1));
                stockDayYanPanKTu20L.setXiaJiangMa2(yanPanVo.getWeiLaiChange2());
                stockDayYanPanKTu20L.setXiaJiangSum2(yanPanVo.getWeiLaiChange2());
                stockDayYanPanKTu20L.setXiaJiangRate2(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange3().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanKTu20L.setShangZhangCount3(new BigDecimal(1));
                stockDayYanPanKTu20L.setShangZhangMa3(yanPanVo.getWeiLaiChange3());
                stockDayYanPanKTu20L.setShangZhangSum3(yanPanVo.getWeiLaiChange3());
                stockDayYanPanKTu20L.setShangZhangRate3(new BigDecimal(50));
            } else {
                stockDayYanPanKTu20L.setXiaJiangCount3(new BigDecimal(1));
                stockDayYanPanKTu20L.setXiaJiangMa3(yanPanVo.getWeiLaiChange3());
                stockDayYanPanKTu20L.setXiaJiangSum3(yanPanVo.getWeiLaiChange3());
                stockDayYanPanKTu20L.setXiaJiangRate3(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange5().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanKTu20L.setShangZhangCount5(new BigDecimal(1));
                stockDayYanPanKTu20L.setShangZhangMa5(yanPanVo.getWeiLaiChange5());
                stockDayYanPanKTu20L.setShangZhangSum5(yanPanVo.getWeiLaiChange5());
                stockDayYanPanKTu20L.setShangZhangRate5(new BigDecimal(50));
            } else {
                stockDayYanPanKTu20L.setXiaJiangCount5(new BigDecimal(1));
                stockDayYanPanKTu20L.setXiaJiangMa5(yanPanVo.getWeiLaiChange5());
                stockDayYanPanKTu20L.setXiaJiangSum5(yanPanVo.getWeiLaiChange5());
                stockDayYanPanKTu20L.setXiaJiangRate5(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange8().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanKTu20L.setShangZhangCount8(new BigDecimal(1));
                stockDayYanPanKTu20L.setShangZhangMa8(yanPanVo.getWeiLaiChange8());
                stockDayYanPanKTu20L.setShangZhangSum8(yanPanVo.getWeiLaiChange8());
                stockDayYanPanKTu20L.setShangZhangRate8(new BigDecimal(50));
            } else {
                stockDayYanPanKTu20L.setXiaJiangCount8(new BigDecimal(1));
                stockDayYanPanKTu20L.setXiaJiangMa8(yanPanVo.getWeiLaiChange8());
                stockDayYanPanKTu20L.setXiaJiangSum8(yanPanVo.getWeiLaiChange8());
                stockDayYanPanKTu20L.setXiaJiangRate8(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange13().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanKTu20L.setShangZhangCount13(new BigDecimal(1));
                stockDayYanPanKTu20L.setShangZhangMa13(yanPanVo.getWeiLaiChange13());
                stockDayYanPanKTu20L.setShangZhangSum13(yanPanVo.getWeiLaiChange8());
                stockDayYanPanKTu20L.setShangZhangRate13(new BigDecimal(50));
            } else {
                stockDayYanPanKTu20L.setXiaJiangCount13(new BigDecimal(1));
                stockDayYanPanKTu20L.setXiaJiangMa13(yanPanVo.getWeiLaiChange13());
                stockDayYanPanKTu20L.setXiaJiangSum13(yanPanVo.getWeiLaiChange13());
                stockDayYanPanKTu20L.setXiaJiangRate13(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange20().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanKTu20L.setShangZhangCount20(new BigDecimal(1));
                stockDayYanPanKTu20L.setShangZhangMa20(yanPanVo.getWeiLaiChange20());
                stockDayYanPanKTu20L.setShangZhangSum20(yanPanVo.getWeiLaiChange20());
                stockDayYanPanKTu20L.setShangZhangRate20(new BigDecimal(50));
            } else {
                stockDayYanPanKTu20L.setXiaJiangCount20(new BigDecimal(1));
                stockDayYanPanKTu20L.setXiaJiangMa20(yanPanVo.getWeiLaiChange20());
                stockDayYanPanKTu20L.setXiaJiangSum20(yanPanVo.getWeiLaiChange20());
                stockDayYanPanKTu20L.setXiaJiangRate20(new BigDecimal(50));
            }
            String neirong =  NEWGetString.getKTu20LString(stockDayYanPanKTu20L);
            FileOutputStream fs = new FileOutputStream(strPath.toString() + strFileName + ".txt");
            byte[] buffer = neirong.getBytes();
            int byteread = buffer.length;
            //插入
            fs.write(buffer, 0, byteread);
            fs.flush();
            fs.close();
        } else {
            StockDayYanPanKTu20L stockDayYanPanKTu20L1= NewGetEntity.getKTu20Lentity(strPath.toString() + strFileName);
            BeanUtils.copyProperties(stockDayYanPanKTu20L1,stockDayYanPanKTu20L);
            if (yanPanVo.getWeiLaiChange1().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanKTu20L1.getShangZhangCount1().add(new BigDecimal(1));
                stockDayYanPanKTu20L.setShangZhangCount1(count);
                BigDecimal sum = stockDayYanPanKTu20L1.getShangZhangSum1().add(yanPanVo.getWeiLaiChange1());
                stockDayYanPanKTu20L.setShangZhangSum1(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKTu20L.setShangZhangMa1(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKTu20L1.getXiaJiangCount1())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKTu20L.setShangZhangRate1(rate);
            } else {
                BigDecimal count = stockDayYanPanKTu20L1.getXiaJiangCount1().add(new BigDecimal(1));
                stockDayYanPanKTu20L.setXiaJiangCount1(count);
                BigDecimal sum = stockDayYanPanKTu20L1.getXiaJiangSum1().add(yanPanVo.getWeiLaiChange1());
                stockDayYanPanKTu20L.setXiaJiangSum1(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKTu20L.setXiaJiangMa1(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKTu20L1.getShangZhangCount1())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKTu20L.setXiaJiangRate1(rate);
            }
            if (yanPanVo.getWeiLaiChange2().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanKTu20L1.getShangZhangCount2().add(new BigDecimal(1));
                stockDayYanPanKTu20L.setShangZhangCount2(count);
                BigDecimal sum = stockDayYanPanKTu20L1.getShangZhangSum2().add(yanPanVo.getWeiLaiChange2());
                stockDayYanPanKTu20L.setShangZhangSum2(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKTu20L.setShangZhangMa2(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKTu20L1.getXiaJiangCount2())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKTu20L.setShangZhangRate2(rate);
            } else {
                BigDecimal count = stockDayYanPanKTu20L1.getXiaJiangCount2().add(new BigDecimal(1));
                stockDayYanPanKTu20L.setXiaJiangCount2(count);
                BigDecimal sum = stockDayYanPanKTu20L1.getXiaJiangSum2().add(yanPanVo.getWeiLaiChange2());
                stockDayYanPanKTu20L.setXiaJiangSum2(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKTu20L.setXiaJiangMa2(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKTu20L1.getShangZhangCount2())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKTu20L.setXiaJiangRate2(rate);
            }
            if (yanPanVo.getWeiLaiChange3().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanKTu20L1.getShangZhangCount3().add(new BigDecimal(1));
                stockDayYanPanKTu20L.setShangZhangCount3(count);
                BigDecimal sum = stockDayYanPanKTu20L1.getShangZhangSum3().add(yanPanVo.getWeiLaiChange3());
                stockDayYanPanKTu20L.setShangZhangSum3(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKTu20L.setShangZhangMa3(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKTu20L1.getXiaJiangCount3())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKTu20L.setShangZhangRate3(rate);
            } else {
                BigDecimal count = stockDayYanPanKTu20L1.getXiaJiangCount3().add(new BigDecimal(1));
                stockDayYanPanKTu20L.setXiaJiangCount3(count);
                BigDecimal sum = stockDayYanPanKTu20L1.getXiaJiangSum3().add(yanPanVo.getWeiLaiChange3());
                stockDayYanPanKTu20L.setXiaJiangSum3(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKTu20L.setXiaJiangMa3(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKTu20L1.getShangZhangCount3())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKTu20L.setXiaJiangRate3(rate);
            }
            if (yanPanVo.getWeiLaiChange5().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanKTu20L1.getShangZhangCount5().add(new BigDecimal(1));
                stockDayYanPanKTu20L.setShangZhangCount5(count);
                BigDecimal sum = stockDayYanPanKTu20L1.getShangZhangSum5().add(yanPanVo.getWeiLaiChange5());
                stockDayYanPanKTu20L.setShangZhangSum5(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKTu20L.setShangZhangMa5(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKTu20L1.getXiaJiangCount5())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKTu20L.setShangZhangRate5(rate);
            } else {
                BigDecimal count = stockDayYanPanKTu20L1.getXiaJiangCount5().add(new BigDecimal(1));
                stockDayYanPanKTu20L.setXiaJiangCount5(count);
                BigDecimal sum = stockDayYanPanKTu20L1.getXiaJiangSum5().add(yanPanVo.getWeiLaiChange5());
                stockDayYanPanKTu20L.setXiaJiangSum5(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKTu20L.setXiaJiangMa5(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKTu20L1.getShangZhangCount5())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKTu20L.setXiaJiangRate5(rate);
            }
            if (yanPanVo.getWeiLaiChange8().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanKTu20L1.getShangZhangCount8().add(new BigDecimal(1));
                stockDayYanPanKTu20L.setShangZhangCount8(count);
                BigDecimal sum = stockDayYanPanKTu20L1.getShangZhangSum8().add(yanPanVo.getWeiLaiChange8());
                stockDayYanPanKTu20L.setShangZhangSum8(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKTu20L.setShangZhangMa8(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKTu20L1.getXiaJiangCount8())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKTu20L.setShangZhangRate8(rate);
            } else {
                BigDecimal count = stockDayYanPanKTu20L1.getXiaJiangCount8().add(new BigDecimal(1));
                stockDayYanPanKTu20L.setXiaJiangCount8(count);
                BigDecimal sum = stockDayYanPanKTu20L1.getXiaJiangSum8().add(yanPanVo.getWeiLaiChange8());
                stockDayYanPanKTu20L.setXiaJiangSum8(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKTu20L.setXiaJiangMa8(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKTu20L1.getShangZhangCount8())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKTu20L.setXiaJiangRate8(rate);
            }
            if (yanPanVo.getWeiLaiChange13().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanKTu20L1.getShangZhangCount13().add(new BigDecimal(1));
                stockDayYanPanKTu20L.setShangZhangCount13(count);
                BigDecimal sum = stockDayYanPanKTu20L1.getShangZhangSum13().add(yanPanVo.getWeiLaiChange13());
                stockDayYanPanKTu20L.setShangZhangSum13(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKTu20L.setShangZhangMa13(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKTu20L1.getXiaJiangCount13())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKTu20L.setShangZhangRate13(rate);
            } else {
                BigDecimal count = stockDayYanPanKTu20L1.getXiaJiangCount13().add(new BigDecimal(1));
                stockDayYanPanKTu20L.setXiaJiangCount13(count);
                BigDecimal sum = stockDayYanPanKTu20L1.getXiaJiangSum13().add(yanPanVo.getWeiLaiChange13());
                stockDayYanPanKTu20L.setXiaJiangSum13(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKTu20L.setXiaJiangMa13(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKTu20L1.getShangZhangCount13())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKTu20L.setXiaJiangRate13(rate);
            }
            if (yanPanVo.getWeiLaiChange20().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanKTu20L1.getShangZhangCount20().add(new BigDecimal(1));
                stockDayYanPanKTu20L.setShangZhangCount20(count);
                BigDecimal sum = stockDayYanPanKTu20L1.getShangZhangSum20().add(yanPanVo.getWeiLaiChange20());
                stockDayYanPanKTu20L.setShangZhangSum20(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKTu20L.setShangZhangMa20(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKTu20L1.getXiaJiangCount20())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKTu20L.setShangZhangRate20(rate);
            } else {
                BigDecimal count = stockDayYanPanKTu20L1.getXiaJiangCount20().add(new BigDecimal(1));
                stockDayYanPanKTu20L.setXiaJiangCount20(count);
                BigDecimal sum = stockDayYanPanKTu20L1.getXiaJiangSum20().add(yanPanVo.getWeiLaiChange20());
                stockDayYanPanKTu20L.setXiaJiangSum20(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKTu20L.setXiaJiangMa20(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKTu20L1.getShangZhangCount20())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKTu20L.setXiaJiangRate20(rate);
            }
            String neirong = NEWGetString.getKTu20LString(stockDayYanPanKTu20L);
            FileOutputStream fs = new FileOutputStream(strPath.toString() + strFileName + ".txt");
            byte[] buffer = neirong.getBytes();
            int byteread = buffer.length;
            //插入
            fs.write(buffer, 0, byteread);
            fs.flush();
            fs.close();
        }
    }

    public static void KMAQ20(YanPanVo yanPanVo, StockDayYanPan stockDayYanPan, StringBuffer strPath) throws IOException {
        StockDayYanPanKMAQ20 stockDayYanPanKMAQ20=new StockDayYanPanKMAQ20();
        BeanUtils.copyProperties(stockDayYanPan,stockDayYanPanKMAQ20);
        String strFileName;
        strFileName = NewGetFileName.getFileNameKMAQ20(stockDayYanPanKMAQ20);
        File file = new File(strPath.toString() + strFileName + ".txt");
        if (!file.exists()) {
            if (yanPanVo.getWeiLaiChange1().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanKMAQ20.setShangZhangCount1(new BigDecimal(1));
                stockDayYanPanKMAQ20.setShangZhangMa1(yanPanVo.getWeiLaiChange1());
                stockDayYanPanKMAQ20.setShangZhangSum1(yanPanVo.getWeiLaiChange1());
                stockDayYanPanKMAQ20.setShangZhangRate1(new BigDecimal(50));
            } else {
                stockDayYanPanKMAQ20.setXiaJiangCount1(new BigDecimal(1));
                stockDayYanPanKMAQ20.setXiaJiangMa1(yanPanVo.getWeiLaiChange1());
                stockDayYanPanKMAQ20.setXiaJiangSum1(yanPanVo.getWeiLaiChange1());
                stockDayYanPanKMAQ20.setXiaJiangRate1(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange2().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanKMAQ20.setShangZhangCount2(new BigDecimal(1));
                stockDayYanPanKMAQ20.setShangZhangMa2(yanPanVo.getWeiLaiChange2());
                stockDayYanPanKMAQ20.setShangZhangSum2(yanPanVo.getWeiLaiChange2());
                stockDayYanPanKMAQ20.setShangZhangRate2(new BigDecimal(50));
            } else {
                stockDayYanPanKMAQ20.setXiaJiangCount2(new BigDecimal(1));
                stockDayYanPanKMAQ20.setXiaJiangMa2(yanPanVo.getWeiLaiChange2());
                stockDayYanPanKMAQ20.setXiaJiangSum2(yanPanVo.getWeiLaiChange2());
                stockDayYanPanKMAQ20.setXiaJiangRate2(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange3().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanKMAQ20.setShangZhangCount3(new BigDecimal(1));
                stockDayYanPanKMAQ20.setShangZhangMa3(yanPanVo.getWeiLaiChange3());
                stockDayYanPanKMAQ20.setShangZhangSum3(yanPanVo.getWeiLaiChange3());
                stockDayYanPanKMAQ20.setShangZhangRate3(new BigDecimal(50));
            } else {
                stockDayYanPanKMAQ20.setXiaJiangCount3(new BigDecimal(1));
                stockDayYanPanKMAQ20.setXiaJiangMa3(yanPanVo.getWeiLaiChange3());
                stockDayYanPanKMAQ20.setXiaJiangSum3(yanPanVo.getWeiLaiChange3());
                stockDayYanPanKMAQ20.setXiaJiangRate3(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange5().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanKMAQ20.setShangZhangCount5(new BigDecimal(1));
                stockDayYanPanKMAQ20.setShangZhangMa5(yanPanVo.getWeiLaiChange5());
                stockDayYanPanKMAQ20.setShangZhangSum5(yanPanVo.getWeiLaiChange5());
                stockDayYanPanKMAQ20.setShangZhangRate5(new BigDecimal(50));
            } else {
                stockDayYanPanKMAQ20.setXiaJiangCount5(new BigDecimal(1));
                stockDayYanPanKMAQ20.setXiaJiangMa5(yanPanVo.getWeiLaiChange5());
                stockDayYanPanKMAQ20.setXiaJiangSum5(yanPanVo.getWeiLaiChange5());
                stockDayYanPanKMAQ20.setXiaJiangRate5(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange8().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanKMAQ20.setShangZhangCount8(new BigDecimal(1));
                stockDayYanPanKMAQ20.setShangZhangMa8(yanPanVo.getWeiLaiChange8());
                stockDayYanPanKMAQ20.setShangZhangSum8(yanPanVo.getWeiLaiChange8());
                stockDayYanPanKMAQ20.setShangZhangRate8(new BigDecimal(50));
            } else {
                stockDayYanPanKMAQ20.setXiaJiangCount8(new BigDecimal(1));
                stockDayYanPanKMAQ20.setXiaJiangMa8(yanPanVo.getWeiLaiChange8());
                stockDayYanPanKMAQ20.setXiaJiangSum8(yanPanVo.getWeiLaiChange8());
                stockDayYanPanKMAQ20.setXiaJiangRate8(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange13().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanKMAQ20.setShangZhangCount13(new BigDecimal(1));
                stockDayYanPanKMAQ20.setShangZhangMa13(yanPanVo.getWeiLaiChange13());
                stockDayYanPanKMAQ20.setShangZhangSum13(yanPanVo.getWeiLaiChange8());
                stockDayYanPanKMAQ20.setShangZhangRate13(new BigDecimal(50));
            } else {
                stockDayYanPanKMAQ20.setXiaJiangCount13(new BigDecimal(1));
                stockDayYanPanKMAQ20.setXiaJiangMa13(yanPanVo.getWeiLaiChange13());
                stockDayYanPanKMAQ20.setXiaJiangSum13(yanPanVo.getWeiLaiChange13());
                stockDayYanPanKMAQ20.setXiaJiangRate13(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange20().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanKMAQ20.setShangZhangCount20(new BigDecimal(1));
                stockDayYanPanKMAQ20.setShangZhangMa20(yanPanVo.getWeiLaiChange20());
                stockDayYanPanKMAQ20.setShangZhangSum20(yanPanVo.getWeiLaiChange20());
                stockDayYanPanKMAQ20.setShangZhangRate20(new BigDecimal(50));
            } else {
                stockDayYanPanKMAQ20.setXiaJiangCount20(new BigDecimal(1));
                stockDayYanPanKMAQ20.setXiaJiangMa20(yanPanVo.getWeiLaiChange20());
                stockDayYanPanKMAQ20.setXiaJiangSum20(yanPanVo.getWeiLaiChange20());
                stockDayYanPanKMAQ20.setXiaJiangRate20(new BigDecimal(50));
            }
            String neirong =  NEWGetString.getKMAQ20String(stockDayYanPanKMAQ20);
            FileOutputStream fs = new FileOutputStream(strPath.toString() + strFileName + ".txt");
            byte[] buffer = neirong.getBytes();
            int byteread = buffer.length;
            //插入
            fs.write(buffer, 0, byteread);
            fs.flush();
            fs.close();
        } else {
            StockDayYanPanKMAQ20 stockDayYanPanKMAQ201= NewGetEntity.getKMAQ20entity(strPath.toString() + strFileName);
            BeanUtils.copyProperties(stockDayYanPanKMAQ201,stockDayYanPanKMAQ20);
            if (yanPanVo.getWeiLaiChange1().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanKMAQ201.getShangZhangCount1().add(new BigDecimal(1));
                stockDayYanPanKMAQ20.setShangZhangCount1(count);
                BigDecimal sum = stockDayYanPanKMAQ201.getShangZhangSum1().add(yanPanVo.getWeiLaiChange1());
                stockDayYanPanKMAQ20.setShangZhangSum1(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKMAQ20.setShangZhangMa1(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKMAQ201.getXiaJiangCount1())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKMAQ20.setShangZhangRate1(rate);
            } else {
                BigDecimal count = stockDayYanPanKMAQ201.getXiaJiangCount1().add(new BigDecimal(1));
                stockDayYanPanKMAQ20.setXiaJiangCount1(count);
                BigDecimal sum = stockDayYanPanKMAQ201.getXiaJiangSum1().add(yanPanVo.getWeiLaiChange1());
                stockDayYanPanKMAQ20.setXiaJiangSum1(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKMAQ20.setXiaJiangMa1(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKMAQ201.getShangZhangCount1())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKMAQ20.setXiaJiangRate1(rate);
            }
            if (yanPanVo.getWeiLaiChange2().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanKMAQ201.getShangZhangCount2().add(new BigDecimal(1));
                stockDayYanPanKMAQ20.setShangZhangCount2(count);
                BigDecimal sum = stockDayYanPanKMAQ201.getShangZhangSum2().add(yanPanVo.getWeiLaiChange2());
                stockDayYanPanKMAQ20.setShangZhangSum2(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKMAQ20.setShangZhangMa2(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKMAQ201.getXiaJiangCount2())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKMAQ20.setShangZhangRate2(rate);
            } else {
                BigDecimal count = stockDayYanPanKMAQ201.getXiaJiangCount2().add(new BigDecimal(1));
                stockDayYanPanKMAQ20.setXiaJiangCount2(count);
                BigDecimal sum = stockDayYanPanKMAQ201.getXiaJiangSum2().add(yanPanVo.getWeiLaiChange2());
                stockDayYanPanKMAQ20.setXiaJiangSum2(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKMAQ20.setXiaJiangMa2(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKMAQ201.getShangZhangCount2())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKMAQ20.setXiaJiangRate2(rate);
            }
            if (yanPanVo.getWeiLaiChange3().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanKMAQ201.getShangZhangCount3().add(new BigDecimal(1));
                stockDayYanPanKMAQ20.setShangZhangCount3(count);
                BigDecimal sum = stockDayYanPanKMAQ201.getShangZhangSum3().add(yanPanVo.getWeiLaiChange3());
                stockDayYanPanKMAQ20.setShangZhangSum3(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKMAQ20.setShangZhangMa3(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKMAQ201.getXiaJiangCount3())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKMAQ20.setShangZhangRate3(rate);
            } else {
                BigDecimal count = stockDayYanPanKMAQ201.getXiaJiangCount3().add(new BigDecimal(1));
                stockDayYanPanKMAQ20.setXiaJiangCount3(count);
                BigDecimal sum = stockDayYanPanKMAQ201.getXiaJiangSum3().add(yanPanVo.getWeiLaiChange3());
                stockDayYanPanKMAQ20.setXiaJiangSum3(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKMAQ20.setXiaJiangMa3(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKMAQ201.getShangZhangCount3())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKMAQ20.setXiaJiangRate3(rate);
            }
            if (yanPanVo.getWeiLaiChange5().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanKMAQ201.getShangZhangCount5().add(new BigDecimal(1));
                stockDayYanPanKMAQ20.setShangZhangCount5(count);
                BigDecimal sum = stockDayYanPanKMAQ201.getShangZhangSum5().add(yanPanVo.getWeiLaiChange5());
                stockDayYanPanKMAQ20.setShangZhangSum5(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKMAQ20.setShangZhangMa5(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKMAQ201.getXiaJiangCount5())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKMAQ20.setShangZhangRate5(rate);
            } else {
                BigDecimal count = stockDayYanPanKMAQ201.getXiaJiangCount5().add(new BigDecimal(1));
                stockDayYanPanKMAQ20.setXiaJiangCount5(count);
                BigDecimal sum = stockDayYanPanKMAQ201.getXiaJiangSum5().add(yanPanVo.getWeiLaiChange5());
                stockDayYanPanKMAQ20.setXiaJiangSum5(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKMAQ20.setXiaJiangMa5(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKMAQ201.getShangZhangCount5())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKMAQ20.setXiaJiangRate5(rate);
            }
            if (yanPanVo.getWeiLaiChange8().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanKMAQ201.getShangZhangCount8().add(new BigDecimal(1));
                stockDayYanPanKMAQ20.setShangZhangCount8(count);
                BigDecimal sum = stockDayYanPanKMAQ201.getShangZhangSum8().add(yanPanVo.getWeiLaiChange8());
                stockDayYanPanKMAQ20.setShangZhangSum8(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKMAQ20.setShangZhangMa8(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKMAQ201.getXiaJiangCount8())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKMAQ20.setShangZhangRate8(rate);
            } else {
                BigDecimal count = stockDayYanPanKMAQ201.getXiaJiangCount8().add(new BigDecimal(1));
                stockDayYanPanKMAQ20.setXiaJiangCount8(count);
                BigDecimal sum = stockDayYanPanKMAQ201.getXiaJiangSum8().add(yanPanVo.getWeiLaiChange8());
                stockDayYanPanKMAQ20.setXiaJiangSum8(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKMAQ20.setXiaJiangMa8(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKMAQ201.getShangZhangCount8())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKMAQ20.setXiaJiangRate8(rate);
            }
            if (yanPanVo.getWeiLaiChange13().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanKMAQ201.getShangZhangCount13().add(new BigDecimal(1));
                stockDayYanPanKMAQ20.setShangZhangCount13(count);
                BigDecimal sum = stockDayYanPanKMAQ201.getShangZhangSum13().add(yanPanVo.getWeiLaiChange13());
                stockDayYanPanKMAQ20.setShangZhangSum13(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKMAQ20.setShangZhangMa13(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKMAQ201.getXiaJiangCount13())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKMAQ20.setShangZhangRate13(rate);
            } else {
                BigDecimal count = stockDayYanPanKMAQ201.getXiaJiangCount13().add(new BigDecimal(1));
                stockDayYanPanKMAQ20.setXiaJiangCount13(count);
                BigDecimal sum = stockDayYanPanKMAQ201.getXiaJiangSum13().add(yanPanVo.getWeiLaiChange13());
                stockDayYanPanKMAQ20.setXiaJiangSum13(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKMAQ20.setXiaJiangMa13(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKMAQ201.getShangZhangCount13())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKMAQ20.setXiaJiangRate13(rate);
            }
            if (yanPanVo.getWeiLaiChange20().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanKMAQ201.getShangZhangCount20().add(new BigDecimal(1));
                stockDayYanPanKMAQ20.setShangZhangCount20(count);
                BigDecimal sum = stockDayYanPanKMAQ201.getShangZhangSum20().add(yanPanVo.getWeiLaiChange20());
                stockDayYanPanKMAQ20.setShangZhangSum20(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKMAQ20.setShangZhangMa20(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKMAQ201.getXiaJiangCount20())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKMAQ20.setShangZhangRate20(rate);
            } else {
                BigDecimal count = stockDayYanPanKMAQ201.getXiaJiangCount20().add(new BigDecimal(1));
                stockDayYanPanKMAQ20.setXiaJiangCount20(count);
                BigDecimal sum = stockDayYanPanKMAQ201.getXiaJiangSum20().add(yanPanVo.getWeiLaiChange20());
                stockDayYanPanKMAQ20.setXiaJiangSum20(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKMAQ20.setXiaJiangMa20(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKMAQ201.getShangZhangCount20())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKMAQ20.setXiaJiangRate20(rate);
            }
            String neirong = NEWGetString.getKMAQ20String(stockDayYanPanKMAQ20);
            FileOutputStream fs = new FileOutputStream(strPath.toString() + strFileName + ".txt");
            byte[] buffer = neirong.getBytes();
            int byteread = buffer.length;
            //插入
            fs.write(buffer, 0, byteread);
            fs.flush();
            fs.close();
        }
    }

    public static void KmQR(YanPanVo yanPanVo, StockDayYanPan stockDayYanPan, StringBuffer strPath) throws IOException {
        StockDayYanPanKmQR stockDayYanPanKmQR=new StockDayYanPanKmQR();
        BeanUtils.copyProperties(stockDayYanPan,stockDayYanPanKmQR);
        String strFileName;
        strFileName = NewGetFileName.getFileNameKmQR(stockDayYanPanKmQR);
        File file = new File(strPath.toString() + strFileName + ".txt");
        if (!file.exists()) {
            if (yanPanVo.getWeiLaiChange1().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanKmQR.setShangZhangCount1(new BigDecimal(1));
                stockDayYanPanKmQR.setShangZhangMa1(yanPanVo.getWeiLaiChange1());
                stockDayYanPanKmQR.setShangZhangSum1(yanPanVo.getWeiLaiChange1());
                stockDayYanPanKmQR.setShangZhangRate1(new BigDecimal(50));
            } else {
                stockDayYanPanKmQR.setXiaJiangCount1(new BigDecimal(1));
                stockDayYanPanKmQR.setXiaJiangMa1(yanPanVo.getWeiLaiChange1());
                stockDayYanPanKmQR.setXiaJiangSum1(yanPanVo.getWeiLaiChange1());
                stockDayYanPanKmQR.setXiaJiangRate1(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange2().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanKmQR.setShangZhangCount2(new BigDecimal(1));
                stockDayYanPanKmQR.setShangZhangMa2(yanPanVo.getWeiLaiChange2());
                stockDayYanPanKmQR.setShangZhangSum2(yanPanVo.getWeiLaiChange2());
                stockDayYanPanKmQR.setShangZhangRate2(new BigDecimal(50));
            } else {
                stockDayYanPanKmQR.setXiaJiangCount2(new BigDecimal(1));
                stockDayYanPanKmQR.setXiaJiangMa2(yanPanVo.getWeiLaiChange2());
                stockDayYanPanKmQR.setXiaJiangSum2(yanPanVo.getWeiLaiChange2());
                stockDayYanPanKmQR.setXiaJiangRate2(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange3().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanKmQR.setShangZhangCount3(new BigDecimal(1));
                stockDayYanPanKmQR.setShangZhangMa3(yanPanVo.getWeiLaiChange3());
                stockDayYanPanKmQR.setShangZhangSum3(yanPanVo.getWeiLaiChange3());
                stockDayYanPanKmQR.setShangZhangRate3(new BigDecimal(50));
            } else {
                stockDayYanPanKmQR.setXiaJiangCount3(new BigDecimal(1));
                stockDayYanPanKmQR.setXiaJiangMa3(yanPanVo.getWeiLaiChange3());
                stockDayYanPanKmQR.setXiaJiangSum3(yanPanVo.getWeiLaiChange3());
                stockDayYanPanKmQR.setXiaJiangRate3(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange5().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanKmQR.setShangZhangCount5(new BigDecimal(1));
                stockDayYanPanKmQR.setShangZhangMa5(yanPanVo.getWeiLaiChange5());
                stockDayYanPanKmQR.setShangZhangSum5(yanPanVo.getWeiLaiChange5());
                stockDayYanPanKmQR.setShangZhangRate5(new BigDecimal(50));
            } else {
                stockDayYanPanKmQR.setXiaJiangCount5(new BigDecimal(1));
                stockDayYanPanKmQR.setXiaJiangMa5(yanPanVo.getWeiLaiChange5());
                stockDayYanPanKmQR.setXiaJiangSum5(yanPanVo.getWeiLaiChange5());
                stockDayYanPanKmQR.setXiaJiangRate5(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange8().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanKmQR.setShangZhangCount8(new BigDecimal(1));
                stockDayYanPanKmQR.setShangZhangMa8(yanPanVo.getWeiLaiChange8());
                stockDayYanPanKmQR.setShangZhangSum8(yanPanVo.getWeiLaiChange8());
                stockDayYanPanKmQR.setShangZhangRate8(new BigDecimal(50));
            } else {
                stockDayYanPanKmQR.setXiaJiangCount8(new BigDecimal(1));
                stockDayYanPanKmQR.setXiaJiangMa8(yanPanVo.getWeiLaiChange8());
                stockDayYanPanKmQR.setXiaJiangSum8(yanPanVo.getWeiLaiChange8());
                stockDayYanPanKmQR.setXiaJiangRate8(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange13().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanKmQR.setShangZhangCount13(new BigDecimal(1));
                stockDayYanPanKmQR.setShangZhangMa13(yanPanVo.getWeiLaiChange13());
                stockDayYanPanKmQR.setShangZhangSum13(yanPanVo.getWeiLaiChange8());
                stockDayYanPanKmQR.setShangZhangRate13(new BigDecimal(50));
            } else {
                stockDayYanPanKmQR.setXiaJiangCount13(new BigDecimal(1));
                stockDayYanPanKmQR.setXiaJiangMa13(yanPanVo.getWeiLaiChange13());
                stockDayYanPanKmQR.setXiaJiangSum13(yanPanVo.getWeiLaiChange13());
                stockDayYanPanKmQR.setXiaJiangRate13(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange20().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanKmQR.setShangZhangCount20(new BigDecimal(1));
                stockDayYanPanKmQR.setShangZhangMa20(yanPanVo.getWeiLaiChange20());
                stockDayYanPanKmQR.setShangZhangSum20(yanPanVo.getWeiLaiChange20());
                stockDayYanPanKmQR.setShangZhangRate20(new BigDecimal(50));
            } else {
                stockDayYanPanKmQR.setXiaJiangCount20(new BigDecimal(1));
                stockDayYanPanKmQR.setXiaJiangMa20(yanPanVo.getWeiLaiChange20());
                stockDayYanPanKmQR.setXiaJiangSum20(yanPanVo.getWeiLaiChange20());
                stockDayYanPanKmQR.setXiaJiangRate20(new BigDecimal(50));
            }
            String neirong =  NEWGetString.getKmQRString(stockDayYanPanKmQR);
            FileOutputStream fs = new FileOutputStream(strPath.toString() + strFileName + ".txt");
            byte[] buffer = neirong.getBytes();
            int byteread = buffer.length;
            //插入
            fs.write(buffer, 0, byteread);
            fs.flush();
            fs.close();
        } else {
            StockDayYanPanKmQR stockDayYanPanKmQR1= NewGetEntity.getKmQRentity(strPath.toString() + strFileName);
            BeanUtils.copyProperties(stockDayYanPanKmQR1,stockDayYanPanKmQR);
            if (yanPanVo.getWeiLaiChange1().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanKmQR1.getShangZhangCount1().add(new BigDecimal(1));
                stockDayYanPanKmQR.setShangZhangCount1(count);
                BigDecimal sum = stockDayYanPanKmQR1.getShangZhangSum1().add(yanPanVo.getWeiLaiChange1());
                stockDayYanPanKmQR.setShangZhangSum1(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKmQR.setShangZhangMa1(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKmQR1.getXiaJiangCount1())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKmQR.setShangZhangRate1(rate);
            } else {
                BigDecimal count = stockDayYanPanKmQR1.getXiaJiangCount1().add(new BigDecimal(1));
                stockDayYanPanKmQR.setXiaJiangCount1(count);
                BigDecimal sum = stockDayYanPanKmQR1.getXiaJiangSum1().add(yanPanVo.getWeiLaiChange1());
                stockDayYanPanKmQR.setXiaJiangSum1(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKmQR.setXiaJiangMa1(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKmQR1.getShangZhangCount1())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKmQR.setXiaJiangRate1(rate);
            }
            if (yanPanVo.getWeiLaiChange2().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanKmQR1.getShangZhangCount2().add(new BigDecimal(1));
                stockDayYanPanKmQR.setShangZhangCount2(count);
                BigDecimal sum = stockDayYanPanKmQR1.getShangZhangSum2().add(yanPanVo.getWeiLaiChange2());
                stockDayYanPanKmQR.setShangZhangSum2(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKmQR.setShangZhangMa2(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKmQR1.getXiaJiangCount2())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKmQR.setShangZhangRate2(rate);
            } else {
                BigDecimal count = stockDayYanPanKmQR1.getXiaJiangCount2().add(new BigDecimal(1));
                stockDayYanPanKmQR.setXiaJiangCount2(count);
                BigDecimal sum = stockDayYanPanKmQR1.getXiaJiangSum2().add(yanPanVo.getWeiLaiChange2());
                stockDayYanPanKmQR.setXiaJiangSum2(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKmQR.setXiaJiangMa2(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKmQR1.getShangZhangCount2())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKmQR.setXiaJiangRate2(rate);
            }
            if (yanPanVo.getWeiLaiChange3().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanKmQR1.getShangZhangCount3().add(new BigDecimal(1));
                stockDayYanPanKmQR.setShangZhangCount3(count);
                BigDecimal sum = stockDayYanPanKmQR1.getShangZhangSum3().add(yanPanVo.getWeiLaiChange3());
                stockDayYanPanKmQR.setShangZhangSum3(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKmQR.setShangZhangMa3(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKmQR1.getXiaJiangCount3())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKmQR.setShangZhangRate3(rate);
            } else {
                BigDecimal count = stockDayYanPanKmQR1.getXiaJiangCount3().add(new BigDecimal(1));
                stockDayYanPanKmQR.setXiaJiangCount3(count);
                BigDecimal sum = stockDayYanPanKmQR1.getXiaJiangSum3().add(yanPanVo.getWeiLaiChange3());
                stockDayYanPanKmQR.setXiaJiangSum3(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKmQR.setXiaJiangMa3(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKmQR1.getShangZhangCount3())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKmQR.setXiaJiangRate3(rate);
            }
            if (yanPanVo.getWeiLaiChange5().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanKmQR1.getShangZhangCount5().add(new BigDecimal(1));
                stockDayYanPanKmQR.setShangZhangCount5(count);
                BigDecimal sum = stockDayYanPanKmQR1.getShangZhangSum5().add(yanPanVo.getWeiLaiChange5());
                stockDayYanPanKmQR.setShangZhangSum5(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKmQR.setShangZhangMa5(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKmQR1.getXiaJiangCount5())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKmQR.setShangZhangRate5(rate);
            } else {
                BigDecimal count = stockDayYanPanKmQR1.getXiaJiangCount5().add(new BigDecimal(1));
                stockDayYanPanKmQR.setXiaJiangCount5(count);
                BigDecimal sum = stockDayYanPanKmQR1.getXiaJiangSum5().add(yanPanVo.getWeiLaiChange5());
                stockDayYanPanKmQR.setXiaJiangSum5(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKmQR.setXiaJiangMa5(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKmQR1.getShangZhangCount5())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKmQR.setXiaJiangRate5(rate);
            }
            if (yanPanVo.getWeiLaiChange8().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanKmQR1.getShangZhangCount8().add(new BigDecimal(1));
                stockDayYanPanKmQR.setShangZhangCount8(count);
                BigDecimal sum = stockDayYanPanKmQR1.getShangZhangSum8().add(yanPanVo.getWeiLaiChange8());
                stockDayYanPanKmQR.setShangZhangSum8(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKmQR.setShangZhangMa8(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKmQR1.getXiaJiangCount8())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKmQR.setShangZhangRate8(rate);
            } else {
                BigDecimal count = stockDayYanPanKmQR1.getXiaJiangCount8().add(new BigDecimal(1));
                stockDayYanPanKmQR.setXiaJiangCount8(count);
                BigDecimal sum = stockDayYanPanKmQR1.getXiaJiangSum8().add(yanPanVo.getWeiLaiChange8());
                stockDayYanPanKmQR.setXiaJiangSum8(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKmQR.setXiaJiangMa8(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKmQR1.getShangZhangCount8())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKmQR.setXiaJiangRate8(rate);
            }
            if (yanPanVo.getWeiLaiChange13().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanKmQR1.getShangZhangCount13().add(new BigDecimal(1));
                stockDayYanPanKmQR.setShangZhangCount13(count);
                BigDecimal sum = stockDayYanPanKmQR1.getShangZhangSum13().add(yanPanVo.getWeiLaiChange13());
                stockDayYanPanKmQR.setShangZhangSum13(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKmQR.setShangZhangMa13(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKmQR1.getXiaJiangCount13())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKmQR.setShangZhangRate13(rate);
            } else {
                BigDecimal count = stockDayYanPanKmQR1.getXiaJiangCount13().add(new BigDecimal(1));
                stockDayYanPanKmQR.setXiaJiangCount13(count);
                BigDecimal sum = stockDayYanPanKmQR1.getXiaJiangSum13().add(yanPanVo.getWeiLaiChange13());
                stockDayYanPanKmQR.setXiaJiangSum13(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKmQR.setXiaJiangMa13(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKmQR1.getShangZhangCount13())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKmQR.setXiaJiangRate13(rate);
            }
            if (yanPanVo.getWeiLaiChange20().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanKmQR1.getShangZhangCount20().add(new BigDecimal(1));
                stockDayYanPanKmQR.setShangZhangCount20(count);
                BigDecimal sum = stockDayYanPanKmQR1.getShangZhangSum20().add(yanPanVo.getWeiLaiChange20());
                stockDayYanPanKmQR.setShangZhangSum20(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKmQR.setShangZhangMa20(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKmQR1.getXiaJiangCount20())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKmQR.setShangZhangRate20(rate);
            } else {
                BigDecimal count = stockDayYanPanKmQR1.getXiaJiangCount20().add(new BigDecimal(1));
                stockDayYanPanKmQR.setXiaJiangCount20(count);
                BigDecimal sum = stockDayYanPanKmQR1.getXiaJiangSum20().add(yanPanVo.getWeiLaiChange20());
                stockDayYanPanKmQR.setXiaJiangSum20(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanKmQR.setXiaJiangMa20(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanKmQR1.getShangZhangCount20())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanKmQR.setXiaJiangRate20(rate);
            }
            String neirong = NEWGetString.getKmQRString(stockDayYanPanKmQR);
            FileOutputStream fs = new FileOutputStream(strPath.toString() + strFileName + ".txt");
            byte[] buffer = neirong.getBytes();
            int byteread = buffer.length;
            //插入
            fs.write(buffer, 0, byteread);
            fs.flush();
            fs.close();
        }
    }

    public static void QTuXing(YanPanVo yanPanVo, StockDayYanPan stockDayYanPan, StringBuffer strPath) throws IOException {
        StockDayYanPanQTuXing stockDayYanPanQTuXing=new StockDayYanPanQTuXing();
        BeanUtils.copyProperties(stockDayYanPan,stockDayYanPanQTuXing);
        String strFileName;
        strFileName = NewGetFileName.getFileNameQTuXing(stockDayYanPanQTuXing);
        File file = new File(strPath.toString() + strFileName + ".txt");
        if (!file.exists()) {
            if (yanPanVo.getWeiLaiChange1().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanQTuXing.setShangZhangCount1(new BigDecimal(1));
                stockDayYanPanQTuXing.setShangZhangMa1(yanPanVo.getWeiLaiChange1());
                stockDayYanPanQTuXing.setShangZhangSum1(yanPanVo.getWeiLaiChange1());
                stockDayYanPanQTuXing.setShangZhangRate1(new BigDecimal(50));
            } else {
                stockDayYanPanQTuXing.setXiaJiangCount1(new BigDecimal(1));
                stockDayYanPanQTuXing.setXiaJiangMa1(yanPanVo.getWeiLaiChange1());
                stockDayYanPanQTuXing.setXiaJiangSum1(yanPanVo.getWeiLaiChange1());
                stockDayYanPanQTuXing.setXiaJiangRate1(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange2().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanQTuXing.setShangZhangCount2(new BigDecimal(1));
                stockDayYanPanQTuXing.setShangZhangMa2(yanPanVo.getWeiLaiChange2());
                stockDayYanPanQTuXing.setShangZhangSum2(yanPanVo.getWeiLaiChange2());
                stockDayYanPanQTuXing.setShangZhangRate2(new BigDecimal(50));
            } else {
                stockDayYanPanQTuXing.setXiaJiangCount2(new BigDecimal(1));
                stockDayYanPanQTuXing.setXiaJiangMa2(yanPanVo.getWeiLaiChange2());
                stockDayYanPanQTuXing.setXiaJiangSum2(yanPanVo.getWeiLaiChange2());
                stockDayYanPanQTuXing.setXiaJiangRate2(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange3().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanQTuXing.setShangZhangCount3(new BigDecimal(1));
                stockDayYanPanQTuXing.setShangZhangMa3(yanPanVo.getWeiLaiChange3());
                stockDayYanPanQTuXing.setShangZhangSum3(yanPanVo.getWeiLaiChange3());
                stockDayYanPanQTuXing.setShangZhangRate3(new BigDecimal(50));
            } else {
                stockDayYanPanQTuXing.setXiaJiangCount3(new BigDecimal(1));
                stockDayYanPanQTuXing.setXiaJiangMa3(yanPanVo.getWeiLaiChange3());
                stockDayYanPanQTuXing.setXiaJiangSum3(yanPanVo.getWeiLaiChange3());
                stockDayYanPanQTuXing.setXiaJiangRate3(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange5().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanQTuXing.setShangZhangCount5(new BigDecimal(1));
                stockDayYanPanQTuXing.setShangZhangMa5(yanPanVo.getWeiLaiChange5());
                stockDayYanPanQTuXing.setShangZhangSum5(yanPanVo.getWeiLaiChange5());
                stockDayYanPanQTuXing.setShangZhangRate5(new BigDecimal(50));
            } else {
                stockDayYanPanQTuXing.setXiaJiangCount5(new BigDecimal(1));
                stockDayYanPanQTuXing.setXiaJiangMa5(yanPanVo.getWeiLaiChange5());
                stockDayYanPanQTuXing.setXiaJiangSum5(yanPanVo.getWeiLaiChange5());
                stockDayYanPanQTuXing.setXiaJiangRate5(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange8().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanQTuXing.setShangZhangCount8(new BigDecimal(1));
                stockDayYanPanQTuXing.setShangZhangMa8(yanPanVo.getWeiLaiChange8());
                stockDayYanPanQTuXing.setShangZhangSum8(yanPanVo.getWeiLaiChange8());
                stockDayYanPanQTuXing.setShangZhangRate8(new BigDecimal(50));
            } else {
                stockDayYanPanQTuXing.setXiaJiangCount8(new BigDecimal(1));
                stockDayYanPanQTuXing.setXiaJiangMa8(yanPanVo.getWeiLaiChange8());
                stockDayYanPanQTuXing.setXiaJiangSum8(yanPanVo.getWeiLaiChange8());
                stockDayYanPanQTuXing.setXiaJiangRate8(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange13().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanQTuXing.setShangZhangCount13(new BigDecimal(1));
                stockDayYanPanQTuXing.setShangZhangMa13(yanPanVo.getWeiLaiChange13());
                stockDayYanPanQTuXing.setShangZhangSum13(yanPanVo.getWeiLaiChange8());
                stockDayYanPanQTuXing.setShangZhangRate13(new BigDecimal(50));
            } else {
                stockDayYanPanQTuXing.setXiaJiangCount13(new BigDecimal(1));
                stockDayYanPanQTuXing.setXiaJiangMa13(yanPanVo.getWeiLaiChange13());
                stockDayYanPanQTuXing.setXiaJiangSum13(yanPanVo.getWeiLaiChange13());
                stockDayYanPanQTuXing.setXiaJiangRate13(new BigDecimal(50));
            }
            if (yanPanVo.getWeiLaiChange20().compareTo(new BigDecimal(0)) > 0) {
                stockDayYanPanQTuXing.setShangZhangCount20(new BigDecimal(1));
                stockDayYanPanQTuXing.setShangZhangMa20(yanPanVo.getWeiLaiChange20());
                stockDayYanPanQTuXing.setShangZhangSum20(yanPanVo.getWeiLaiChange20());
                stockDayYanPanQTuXing.setShangZhangRate20(new BigDecimal(50));
            } else {
                stockDayYanPanQTuXing.setXiaJiangCount20(new BigDecimal(1));
                stockDayYanPanQTuXing.setXiaJiangMa20(yanPanVo.getWeiLaiChange20());
                stockDayYanPanQTuXing.setXiaJiangSum20(yanPanVo.getWeiLaiChange20());
                stockDayYanPanQTuXing.setXiaJiangRate20(new BigDecimal(50));
            }
            String neirong =  NEWGetString.getQTuXingString(stockDayYanPanQTuXing);
            FileOutputStream fs = new FileOutputStream(strPath.toString() + strFileName + ".txt");
            byte[] buffer = neirong.getBytes();
            int byteread = buffer.length;
            //插入
            fs.write(buffer, 0, byteread);
            fs.flush();
            fs.close();
        } else {
            StockDayYanPanQTuXing stockDayYanPanQTuXing1= NewGetEntity.getQTuXingentity(strPath.toString() + strFileName);
            BeanUtils.copyProperties(stockDayYanPanQTuXing1,stockDayYanPanQTuXing);
            if (yanPanVo.getWeiLaiChange1().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanQTuXing1.getShangZhangCount1().add(new BigDecimal(1));
                stockDayYanPanQTuXing.setShangZhangCount1(count);
                BigDecimal sum = stockDayYanPanQTuXing1.getShangZhangSum1().add(yanPanVo.getWeiLaiChange1());
                stockDayYanPanQTuXing.setShangZhangSum1(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanQTuXing.setShangZhangMa1(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanQTuXing1.getXiaJiangCount1())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanQTuXing.setShangZhangRate1(rate);
            } else {
                BigDecimal count = stockDayYanPanQTuXing1.getXiaJiangCount1().add(new BigDecimal(1));
                stockDayYanPanQTuXing.setXiaJiangCount1(count);
                BigDecimal sum = stockDayYanPanQTuXing1.getXiaJiangSum1().add(yanPanVo.getWeiLaiChange1());
                stockDayYanPanQTuXing.setXiaJiangSum1(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanQTuXing.setXiaJiangMa1(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanQTuXing1.getShangZhangCount1())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanQTuXing.setXiaJiangRate1(rate);
            }
            if (yanPanVo.getWeiLaiChange2().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanQTuXing1.getShangZhangCount2().add(new BigDecimal(1));
                stockDayYanPanQTuXing.setShangZhangCount2(count);
                BigDecimal sum = stockDayYanPanQTuXing1.getShangZhangSum2().add(yanPanVo.getWeiLaiChange2());
                stockDayYanPanQTuXing.setShangZhangSum2(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanQTuXing.setShangZhangMa2(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanQTuXing1.getXiaJiangCount2())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanQTuXing.setShangZhangRate2(rate);
            } else {
                BigDecimal count = stockDayYanPanQTuXing1.getXiaJiangCount2().add(new BigDecimal(1));
                stockDayYanPanQTuXing.setXiaJiangCount2(count);
                BigDecimal sum = stockDayYanPanQTuXing1.getXiaJiangSum2().add(yanPanVo.getWeiLaiChange2());
                stockDayYanPanQTuXing.setXiaJiangSum2(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanQTuXing.setXiaJiangMa2(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanQTuXing1.getShangZhangCount2())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanQTuXing.setXiaJiangRate2(rate);
            }
            if (yanPanVo.getWeiLaiChange3().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanQTuXing1.getShangZhangCount3().add(new BigDecimal(1));
                stockDayYanPanQTuXing.setShangZhangCount3(count);
                BigDecimal sum = stockDayYanPanQTuXing1.getShangZhangSum3().add(yanPanVo.getWeiLaiChange3());
                stockDayYanPanQTuXing.setShangZhangSum3(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanQTuXing.setShangZhangMa3(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanQTuXing1.getXiaJiangCount3())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanQTuXing.setShangZhangRate3(rate);
            } else {
                BigDecimal count = stockDayYanPanQTuXing1.getXiaJiangCount3().add(new BigDecimal(1));
                stockDayYanPanQTuXing.setXiaJiangCount3(count);
                BigDecimal sum = stockDayYanPanQTuXing1.getXiaJiangSum3().add(yanPanVo.getWeiLaiChange3());
                stockDayYanPanQTuXing.setXiaJiangSum3(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanQTuXing.setXiaJiangMa3(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanQTuXing1.getShangZhangCount3())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanQTuXing.setXiaJiangRate3(rate);
            }
            if (yanPanVo.getWeiLaiChange5().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanQTuXing1.getShangZhangCount5().add(new BigDecimal(1));
                stockDayYanPanQTuXing.setShangZhangCount5(count);
                BigDecimal sum = stockDayYanPanQTuXing1.getShangZhangSum5().add(yanPanVo.getWeiLaiChange5());
                stockDayYanPanQTuXing.setShangZhangSum5(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanQTuXing.setShangZhangMa5(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanQTuXing1.getXiaJiangCount5())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanQTuXing.setShangZhangRate5(rate);
            } else {
                BigDecimal count = stockDayYanPanQTuXing1.getXiaJiangCount5().add(new BigDecimal(1));
                stockDayYanPanQTuXing.setXiaJiangCount5(count);
                BigDecimal sum = stockDayYanPanQTuXing1.getXiaJiangSum5().add(yanPanVo.getWeiLaiChange5());
                stockDayYanPanQTuXing.setXiaJiangSum5(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanQTuXing.setXiaJiangMa5(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanQTuXing1.getShangZhangCount5())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanQTuXing.setXiaJiangRate5(rate);
            }
            if (yanPanVo.getWeiLaiChange8().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanQTuXing1.getShangZhangCount8().add(new BigDecimal(1));
                stockDayYanPanQTuXing.setShangZhangCount8(count);
                BigDecimal sum = stockDayYanPanQTuXing1.getShangZhangSum8().add(yanPanVo.getWeiLaiChange8());
                stockDayYanPanQTuXing.setShangZhangSum8(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanQTuXing.setShangZhangMa8(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanQTuXing1.getXiaJiangCount8())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanQTuXing.setShangZhangRate8(rate);
            } else {
                BigDecimal count = stockDayYanPanQTuXing1.getXiaJiangCount8().add(new BigDecimal(1));
                stockDayYanPanQTuXing.setXiaJiangCount8(count);
                BigDecimal sum = stockDayYanPanQTuXing1.getXiaJiangSum8().add(yanPanVo.getWeiLaiChange8());
                stockDayYanPanQTuXing.setXiaJiangSum8(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanQTuXing.setXiaJiangMa8(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanQTuXing1.getShangZhangCount8())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanQTuXing.setXiaJiangRate8(rate);
            }
            if (yanPanVo.getWeiLaiChange13().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanQTuXing1.getShangZhangCount13().add(new BigDecimal(1));
                stockDayYanPanQTuXing.setShangZhangCount13(count);
                BigDecimal sum = stockDayYanPanQTuXing1.getShangZhangSum13().add(yanPanVo.getWeiLaiChange13());
                stockDayYanPanQTuXing.setShangZhangSum13(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanQTuXing.setShangZhangMa13(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanQTuXing1.getXiaJiangCount13())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanQTuXing.setShangZhangRate13(rate);
            } else {
                BigDecimal count = stockDayYanPanQTuXing1.getXiaJiangCount13().add(new BigDecimal(1));
                stockDayYanPanQTuXing.setXiaJiangCount13(count);
                BigDecimal sum = stockDayYanPanQTuXing1.getXiaJiangSum13().add(yanPanVo.getWeiLaiChange13());
                stockDayYanPanQTuXing.setXiaJiangSum13(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanQTuXing.setXiaJiangMa13(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanQTuXing1.getShangZhangCount13())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanQTuXing.setXiaJiangRate13(rate);
            }
            if (yanPanVo.getWeiLaiChange20().compareTo(new BigDecimal(0)) > 0) {
                BigDecimal count = stockDayYanPanQTuXing1.getShangZhangCount20().add(new BigDecimal(1));
                stockDayYanPanQTuXing.setShangZhangCount20(count);
                BigDecimal sum = stockDayYanPanQTuXing1.getShangZhangSum20().add(yanPanVo.getWeiLaiChange20());
                stockDayYanPanQTuXing.setShangZhangSum20(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanQTuXing.setShangZhangMa20(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanQTuXing1.getXiaJiangCount20())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanQTuXing.setShangZhangRate20(rate);
            } else {
                BigDecimal count = stockDayYanPanQTuXing1.getXiaJiangCount20().add(new BigDecimal(1));
                stockDayYanPanQTuXing.setXiaJiangCount20(count);
                BigDecimal sum = stockDayYanPanQTuXing1.getXiaJiangSum20().add(yanPanVo.getWeiLaiChange20());
                stockDayYanPanQTuXing.setXiaJiangSum20(sum);
                BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                stockDayYanPanQTuXing.setXiaJiangMa20(ma);
                BigDecimal rate = count.divide((count.add(stockDayYanPanQTuXing1.getShangZhangCount20())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                stockDayYanPanQTuXing.setXiaJiangRate20(rate);
            }
            String neirong = NEWGetString.getQTuXingString(stockDayYanPanQTuXing);
            FileOutputStream fs = new FileOutputStream(strPath.toString() + strFileName + ".txt");
            byte[] buffer = neirong.getBytes();
            int byteread = buffer.length;
            //插入
            fs.write(buffer, 0, byteread);
            fs.flush();
            fs.close();
        }
    }

    public static List<StockDayVo> KmpTDList(StockDayYanPan stockDayYanPan, StringBuffer strPath, StockDayVo stockDayVo, List<StockDayVo> stockDayVoList) throws IOException {
        StockDayYanPanKMPTD stockDayYanPanKMPTD=new StockDayYanPanKMPTD();
        BeanUtils.copyProperties(stockDayYanPan,stockDayYanPanKMPTD);
        String strFileName;
        strFileName = NewGetFileName.getFileNameKMPTD(stockDayYanPanKMPTD);
        File file = new File(strPath.toString() + strFileName + ".txt");
        if (!file.exists()) {

        } else {
            StockDayYanPanKMPTD stockDayYanPanKMPTD1= NewGetEntity.getKMPTDentity(strPath.toString() + strFileName);
            if ((stockDayYanPanKMPTD1.getShangZhangCount2().compareTo(new BigDecimal(100)) > 0 && stockDayYanPanKMPTD1.getShangZhangMa2().compareTo(new BigDecimal(2)) > 0 && stockDayYanPanKMPTD1.getShangZhangRate2().compareTo(new BigDecimal(67)) >= 0 &&
                    stockDayYanPanKMPTD1.getShangZhangMa3().compareTo(stockDayYanPanKMPTD1.getShangZhangMa2()) > 0 && stockDayYanPanKMPTD1.getShangZhangRate3().compareTo(new BigDecimal(58)) > 0 &&
                    stockDayYanPanKMPTD1.getShangZhangMa2().compareTo(stockDayYanPanKMPTD1.getShangZhangMa1()) > 0 ) ||
                    (stockDayYanPanKMPTD1.getShangZhangRate2().compareTo(new BigDecimal(62)) >= 0 &&stockDayYanPanKMPTD1.getShangZhangCount2().compareTo(new BigDecimal(100)) > 0 && stockDayYanPanKMPTD1.getShangZhangMa3().compareTo(stockDayYanPanKMPTD1.getShangZhangMa2()) > 0 && (stockDayYanPanKMPTD1.getShangZhangMa2().multiply(stockDayYanPanKMPTD1.getShangZhangRate2()).subtract(stockDayYanPanKMPTD1.getXiaJiangMa2().multiply(stockDayYanPanKMPTD1.getXiaJiangRate2()))).compareTo(new BigDecimal(200)) >= 0)) {
                stockDayVo.setShangZhangMa1(stockDayYanPanKMPTD1.getShangZhangMa1().toString());
                stockDayVo.setShangZhangRate1(stockDayYanPanKMPTD1.getShangZhangRate1().toString());
                stockDayVo.setShangZhangMa2(stockDayYanPanKMPTD1.getShangZhangMa2().toString());
                stockDayVo.setShangZhangRate2(stockDayYanPanKMPTD1.getShangZhangRate2().toString());
                stockDayVo.setShangZhangMa3(stockDayYanPanKMPTD1.getShangZhangMa3().toString());
                stockDayVo.setShangZhangRate3(stockDayYanPanKMPTD1.getShangZhangRate3().toString());
                stockDayVo.setShangZhangMa5(stockDayYanPanKMPTD1.getShangZhangMa5().toString());
                stockDayVo.setShangZhangRate5(stockDayYanPanKMPTD1.getShangZhangRate5().toString());
                stockDayVo.setShangZhangMa8(stockDayYanPanKMPTD1.getShangZhangMa8().toString());
                stockDayVo.setShangZhangRate8(stockDayYanPanKMPTD1.getShangZhangRate8().toString());
                stockDayVo.setShangZhangMa13(stockDayYanPanKMPTD1.getShangZhangMa13().toString());
                stockDayVo.setShangZhangRate13(stockDayYanPanKMPTD1.getShangZhangRate13().toString());
                stockDayVo.setShangZhangMa20(stockDayYanPanKMPTD1.getShangZhangMa20().toString());
                stockDayVo.setShangZhangRate20(stockDayYanPanKMPTD1.getShangZhangRate20().toString());
                stockDayVo.setChangeOf2((stockDayYanPanKMPTD1.getShangZhangMa2().multiply(stockDayYanPanKMPTD1.getShangZhangRate2()).subtract(stockDayYanPanKMPTD1.getXiaJiangMa2().multiply(stockDayYanPanKMPTD1.getXiaJiangRate2()))).toString());
                stockDayVoList.add(stockDayVo);
            }
        }
       return stockDayVoList;
    }

    public static List<StockDayVo> KmQRList(StockDayYanPan stockDayYanPan, StringBuffer strPath, StockDayVo stockDayVo, List<StockDayVo> stockDayVoList) throws IOException {
        StockDayYanPanKmQR stockDayYanPanKmQR=new StockDayYanPanKmQR();
        BeanUtils.copyProperties(stockDayYanPan,stockDayYanPanKmQR);
        String strFileName;
        strFileName = NewGetFileName.getFileNameKmQR(stockDayYanPanKmQR);
        File file = new File(strPath.toString() + strFileName + ".txt");
        if (!file.exists()) {

        } else {
            StockDayYanPanKmQR stockDayYanPanKmQR1= NewGetEntity.getKmQRentity(strPath.toString() + strFileName);
            if ((stockDayYanPanKmQR1.getShangZhangCount2().compareTo(new BigDecimal(100)) > 0 && stockDayYanPanKmQR1.getShangZhangMa2().compareTo(new BigDecimal(2)) > 0 && stockDayYanPanKmQR1.getShangZhangRate2().compareTo(new BigDecimal(69)) >= 0 &&
                    stockDayYanPanKmQR1.getShangZhangMa3().compareTo(stockDayYanPanKmQR1.getShangZhangMa2()) > 0 && stockDayYanPanKmQR1.getShangZhangRate3().compareTo(new BigDecimal(60)) > 0 &&
                    stockDayYanPanKmQR1.getShangZhangMa2().compareTo(stockDayYanPanKmQR1.getShangZhangMa1()) > 0 ) ||
                    (stockDayYanPanKmQR1.getShangZhangRate2().compareTo(new BigDecimal(64)) >= 0 &&stockDayYanPanKmQR1.getShangZhangCount2().compareTo(new BigDecimal(100)) > 0 && stockDayYanPanKmQR1.getShangZhangMa3().compareTo(stockDayYanPanKmQR1.getShangZhangMa2()) > 0 && (stockDayYanPanKmQR1.getShangZhangMa2().multiply(stockDayYanPanKmQR1.getShangZhangRate2()).subtract(stockDayYanPanKmQR1.getXiaJiangMa2().multiply(stockDayYanPanKmQR1.getXiaJiangRate2()))).compareTo(new BigDecimal(200)) >= 0)) {
                stockDayVo.setShangZhangMa1(stockDayYanPanKmQR1.getShangZhangMa1().toString());
                stockDayVo.setShangZhangRate1(stockDayYanPanKmQR1.getShangZhangRate1().toString());
                stockDayVo.setShangZhangMa2(stockDayYanPanKmQR1.getShangZhangMa2().toString());
                stockDayVo.setShangZhangRate2(stockDayYanPanKmQR1.getShangZhangRate2().toString());
                stockDayVo.setShangZhangMa3(stockDayYanPanKmQR1.getShangZhangMa3().toString());
                stockDayVo.setShangZhangRate3(stockDayYanPanKmQR1.getShangZhangRate3().toString());
                stockDayVo.setShangZhangMa5(stockDayYanPanKmQR1.getShangZhangMa5().toString());
                stockDayVo.setShangZhangRate5(stockDayYanPanKmQR1.getShangZhangRate5().toString());
                stockDayVo.setShangZhangMa8(stockDayYanPanKmQR1.getShangZhangMa8().toString());
                stockDayVo.setShangZhangRate8(stockDayYanPanKmQR1.getShangZhangRate8().toString());
                stockDayVo.setShangZhangMa13(stockDayYanPanKmQR1.getShangZhangMa13().toString());
                stockDayVo.setShangZhangRate13(stockDayYanPanKmQR1.getShangZhangRate13().toString());
                stockDayVo.setShangZhangMa20(stockDayYanPanKmQR1.getShangZhangMa20().toString());
                stockDayVo.setShangZhangRate20(stockDayYanPanKmQR1.getShangZhangRate20().toString());
                stockDayVo.setChangeOf2((stockDayYanPanKmQR1.getShangZhangMa2().multiply(stockDayYanPanKmQR1.getShangZhangRate2()).subtract(stockDayYanPanKmQR1.getXiaJiangMa2().multiply(stockDayYanPanKmQR1.getXiaJiangRate2()))).toString());
                stockDayVoList.add(stockDayVo);
            }
        }
        return stockDayVoList;
    }

    public static List<StockDayVo> QTuXingList(StockDayYanPan stockDayYanPan, StringBuffer strPath, StockDayVo stockDayVo, List<StockDayVo> stockDayVoList) throws IOException {
        StockDayYanPanQTuXing stockDayYanPanQTuXing=new StockDayYanPanQTuXing();
        BeanUtils.copyProperties(stockDayYanPan,stockDayYanPanQTuXing);
        String strFileName;
        strFileName = NewGetFileName.getFileNameQTuXing(stockDayYanPanQTuXing);
        File file = new File(strPath.toString() + strFileName + ".txt");
        if (!file.exists()) {

        } else {
            StockDayYanPanQTuXing stockDayYanPanQTuXing1= NewGetEntity.getQTuXingentity(strPath.toString() + strFileName);
            if ((stockDayYanPanQTuXing1.getShangZhangCount2().compareTo(new BigDecimal(100)) > 0 && stockDayYanPanQTuXing1.getShangZhangMa2().compareTo(new BigDecimal(2)) > 0 && stockDayYanPanQTuXing1.getShangZhangRate2().compareTo(new BigDecimal(70)) >= 0 &&
                    stockDayYanPanQTuXing1.getShangZhangMa3().compareTo(stockDayYanPanQTuXing1.getShangZhangMa2()) > 0 && stockDayYanPanQTuXing1.getShangZhangRate3().compareTo(new BigDecimal(60)) > 0 &&
                    stockDayYanPanQTuXing1.getShangZhangMa2().compareTo(stockDayYanPanQTuXing1.getShangZhangMa1()) > 0 ) ||
                    (stockDayYanPanQTuXing1.getShangZhangRate2().compareTo(new BigDecimal(65)) >= 0 &&stockDayYanPanQTuXing1.getShangZhangCount2().compareTo(new BigDecimal(100)) > 0 && stockDayYanPanQTuXing1.getShangZhangMa3().compareTo(stockDayYanPanQTuXing1.getShangZhangMa2()) > 0 && (stockDayYanPanQTuXing1.getShangZhangMa2().multiply(stockDayYanPanQTuXing1.getShangZhangRate2()).subtract(stockDayYanPanQTuXing1.getXiaJiangMa2().multiply(stockDayYanPanQTuXing1.getXiaJiangRate2()))).compareTo(new BigDecimal(200)) >= 0)) {
                stockDayVo.setShangZhangMa1(stockDayYanPanQTuXing1.getShangZhangMa1().toString());
                stockDayVo.setShangZhangRate1(stockDayYanPanQTuXing1.getShangZhangRate1().toString());
                stockDayVo.setShangZhangMa2(stockDayYanPanQTuXing1.getShangZhangMa2().toString());
                stockDayVo.setShangZhangRate2(stockDayYanPanQTuXing1.getShangZhangRate2().toString());
                stockDayVo.setShangZhangMa3(stockDayYanPanQTuXing1.getShangZhangMa3().toString());
                stockDayVo.setShangZhangRate3(stockDayYanPanQTuXing1.getShangZhangRate3().toString());
                stockDayVo.setShangZhangMa5(stockDayYanPanQTuXing1.getShangZhangMa5().toString());
                stockDayVo.setShangZhangRate5(stockDayYanPanQTuXing1.getShangZhangRate5().toString());
                stockDayVo.setShangZhangMa8(stockDayYanPanQTuXing1.getShangZhangMa8().toString());
                stockDayVo.setShangZhangRate8(stockDayYanPanQTuXing1.getShangZhangRate8().toString());
                stockDayVo.setShangZhangMa13(stockDayYanPanQTuXing1.getShangZhangMa13().toString());
                stockDayVo.setShangZhangRate13(stockDayYanPanQTuXing1.getShangZhangRate13().toString());
                stockDayVo.setShangZhangMa20(stockDayYanPanQTuXing1.getShangZhangMa20().toString());
                stockDayVo.setShangZhangRate20(stockDayYanPanQTuXing1.getShangZhangRate20().toString());
                stockDayVo.setChangeOf2((stockDayYanPanQTuXing1.getShangZhangMa2().multiply(stockDayYanPanQTuXing1.getShangZhangRate2()).subtract(stockDayYanPanQTuXing1.getXiaJiangMa2().multiply(stockDayYanPanQTuXing1.getXiaJiangRate2()))).toString());
                stockDayVoList.add(stockDayVo);
            }
        }
        return stockDayVoList;
    }

    public static List<StockDayVo> KTu20LSList(StockDayYanPan stockDayYanPan, StringBuffer strPath, StockDayVo stockDayVo, List<StockDayVo> stockDayVoList) throws IOException {
        StockDayYanPanKTu20LS stockDayYanPanKTu20LS=new StockDayYanPanKTu20LS();
        BeanUtils.copyProperties(stockDayYanPan,stockDayYanPanKTu20LS);
        String strFileName;
        strFileName = NewGetFileName.getFileNameKTu20LS(stockDayYanPanKTu20LS);
        File file = new File(strPath.toString() + strFileName + ".txt");
        if (!file.exists()) {

        } else {
            StockDayYanPanKTu20LS stockDayYanPanKTu20LS1= NewGetEntity.getKTu20LSentity(strPath.toString() + strFileName);
            if ((stockDayYanPanKTu20LS1.getShangZhangCount2().compareTo(new BigDecimal(100)) > 0 && stockDayYanPanKTu20LS1.getShangZhangMa2().compareTo(new BigDecimal(2)) > 0 && stockDayYanPanKTu20LS1.getShangZhangRate2().compareTo(new BigDecimal(68)) >= 0 &&
                    stockDayYanPanKTu20LS1.getShangZhangMa3().compareTo(stockDayYanPanKTu20LS1.getShangZhangMa2()) > 0 && stockDayYanPanKTu20LS1.getShangZhangRate3().compareTo(new BigDecimal(60)) > 0 &&
                    stockDayYanPanKTu20LS1.getShangZhangMa2().compareTo(stockDayYanPanKTu20LS1.getShangZhangMa1()) > 0 ) ||
                    (stockDayYanPanKTu20LS1.getShangZhangRate2().compareTo(new BigDecimal(62)) >= 0 &&stockDayYanPanKTu20LS1.getShangZhangCount2().compareTo(new BigDecimal(100)) > 0 && stockDayYanPanKTu20LS1.getShangZhangMa3().compareTo(stockDayYanPanKTu20LS1.getShangZhangMa2()) > 0 && (stockDayYanPanKTu20LS1.getShangZhangMa2().multiply(stockDayYanPanKTu20LS1.getShangZhangRate2()).subtract(stockDayYanPanKTu20LS1.getXiaJiangMa2().multiply(stockDayYanPanKTu20LS1.getXiaJiangRate2()))).compareTo(new BigDecimal(200)) >= 0)) {
                stockDayVo.setShangZhangMa1(stockDayYanPanKTu20LS1.getShangZhangMa1().toString());
                stockDayVo.setShangZhangRate1(stockDayYanPanKTu20LS1.getShangZhangRate1().toString());
                stockDayVo.setShangZhangMa2(stockDayYanPanKTu20LS1.getShangZhangMa2().toString());
                stockDayVo.setShangZhangRate2(stockDayYanPanKTu20LS1.getShangZhangRate2().toString());
                stockDayVo.setShangZhangMa3(stockDayYanPanKTu20LS1.getShangZhangMa3().toString());
                stockDayVo.setShangZhangRate3(stockDayYanPanKTu20LS1.getShangZhangRate3().toString());
                stockDayVo.setShangZhangMa5(stockDayYanPanKTu20LS1.getShangZhangMa5().toString());
                stockDayVo.setShangZhangRate5(stockDayYanPanKTu20LS1.getShangZhangRate5().toString());
                stockDayVo.setShangZhangMa8(stockDayYanPanKTu20LS1.getShangZhangMa8().toString());
                stockDayVo.setShangZhangRate8(stockDayYanPanKTu20LS1.getShangZhangRate8().toString());
                stockDayVo.setShangZhangMa13(stockDayYanPanKTu20LS1.getShangZhangMa13().toString());
                stockDayVo.setShangZhangRate13(stockDayYanPanKTu20LS1.getShangZhangRate13().toString());
                stockDayVo.setShangZhangMa20(stockDayYanPanKTu20LS1.getShangZhangMa20().toString());
                stockDayVo.setShangZhangRate20(stockDayYanPanKTu20LS1.getShangZhangRate20().toString());
                stockDayVo.setChangeOf2((stockDayYanPanKTu20LS1.getShangZhangMa2().multiply(stockDayYanPanKTu20LS1.getShangZhangRate2()).subtract(stockDayYanPanKTu20LS1.getXiaJiangMa2().multiply(stockDayYanPanKTu20LS1.getXiaJiangRate2()))).toString());
                stockDayVoList.add(stockDayVo);
            }
        }
        return stockDayVoList;
    }


}
