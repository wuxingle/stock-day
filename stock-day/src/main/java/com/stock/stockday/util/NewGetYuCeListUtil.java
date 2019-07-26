package com.stock.stockday.util;

import com.stock.apicommon.vo.DaPanRateOfChangeVo;
import com.stock.apicommon.vo.DangRiVo;
import com.stock.apicommon.vo.RateOfChangeVo;
import com.stock.stockday.entity.StockDayYanPan;
import com.stock.stockday.entity.StockDayYanPan24;
import com.stock.stockday.entity.StockDayYanPan33;
import com.stock.stockday.entity.StockDayYanPan42;
import com.stock.stockday.entity.StockDayYanPanBenpan;
import com.stock.stockday.entity.StockDayYanPanChunJishu;
import com.stock.stockday.entity.StockDayYanPanChunTuxing;
import com.stock.stockday.entity.StockDayYanPanDapan;
import com.stock.stockday.entity.StockDayYanPanLowLow;
import com.stock.stockday.entity.StockDayYanPanLowUp;
import com.stock.stockday.entity.StockDayYanPanUpLow;
import com.stock.stockday.entity.StockDayYanPanUpUp;
import com.stock.stockday.entity.StockDayYanPanZhuYanJiShu;
import com.stock.stockday.vo.StockDayVo;
import org.springframework.beans.BeanUtils;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.List;

import static com.stock.stockday.util.GetEntity.get24entity;
import static com.stock.stockday.util.GetEntity.get33entity;
import static com.stock.stockday.util.GetEntity.get42entity;
import static com.stock.stockday.util.GetEntity.getBenpanentity;
import static com.stock.stockday.util.GetEntity.getChunJishuentity;
import static com.stock.stockday.util.GetEntity.getChunTuxingentity;
import static com.stock.stockday.util.GetEntity.getDaPanentity;
import static com.stock.stockday.util.GetEntity.getUpUpentity;
import static com.stock.stockday.util.GetEntity.getZhuYanJiShuentity;
import static com.stock.stockday.util.GetFileName.getFileName;
import static com.stock.stockday.util.GetFileName.getFileName24;
import static com.stock.stockday.util.GetFileName.getFileName33;
import static com.stock.stockday.util.GetFileName.getFileName42;
import static com.stock.stockday.util.GetFileName.getFileNameBp;
import static com.stock.stockday.util.GetFileName.getFileNameCjs;
import static com.stock.stockday.util.GetFileName.getFileNameCtx;
import static com.stock.stockday.util.GetFileName.getFileNameDp;

public class NewGetYuCeListUtil {

    public static List<StockDayVo> getYuCeKMPTDList(DaPanRateOfChangeVo daPanRateOfChangeVo, DangRiVo dangRiVo, RateOfChangeVo rateOfChangeVo, StockDayYanPan stockDayYanPan, StockDayVo stockDayVo, List<StockDayVo> stockDayVoList) throws IOException {
//        stockDayVoList=NewCommonSaveFile.newCommonKMPTDList(daPanRateOfChangeVo,dangRiVo,stockDayYanPan,stockDayVo,stockDayVoList);
        return stockDayVoList;
    }

    private static List<StockDayVo> getKmQRList(List<StockDayVo> stockDayVoList, StockDayYanPan stockDayYanPan, StockDayVo stockDayVo) throws IOException {
        BigDecimal zuHeMa1 = new BigDecimal(0);
        BigDecimal zuHeRate1 = new BigDecimal(0);
        BigDecimal zuHeMa2 = new BigDecimal(0);
        BigDecimal zuHeRate2 = new BigDecimal(0);
        BigDecimal zuHeMa3 = new BigDecimal(0);
        BigDecimal zuHeRate3 = new BigDecimal(0);
        BigDecimal zuHeMa5 = new BigDecimal(0);
        BigDecimal zuHeRate5 = new BigDecimal(0);
        BigDecimal zuHeMa8 = new BigDecimal(0);
        BigDecimal zuHeRate8 = new BigDecimal(0);
        BigDecimal zuHeMa20 = new BigDecimal(0);
        BigDecimal zuHeRate20 = new BigDecimal(0);
        //获取组合大盘10%，本盘10%，24 20%，33,20%，42 20%，cjs 10%,ctx 10%没有时默认50
        StockDayYanPanBenpan stockDayYanPanBenpan = new StockDayYanPanBenpan();
        BeanUtils.copyProperties(stockDayYanPan, stockDayYanPanBenpan);
        StringBuffer strPath = new StringBuffer();
        String strFileName;
        strPath.setLength(0);
        strPath.append("G:/stock-day/day-yan-pan-benpan/");
        strFileName = getFileNameBp(stockDayYanPanBenpan);
        File file5 = new File(strPath.toString() + strFileName + ".txt");
        if (file5.exists()) {
            StockDayYanPanBenpan stockDayYanPanBenpan1 = getBenpanentity(strPath.toString() + strFileName);
            zuHeMa1 = zuHeMa1.add(stockDayYanPanBenpan1.getShangZhangMa1().multiply(new BigDecimal(0.1)));
            zuHeRate1 = zuHeRate1.add(stockDayYanPanBenpan1.getShangZhangRate1().multiply(new BigDecimal(0.1)));
            zuHeMa2 = zuHeMa2.add(stockDayYanPanBenpan1.getShangZhangMa2().multiply(new BigDecimal(0.1)));
            zuHeRate2 = zuHeRate2.add(stockDayYanPanBenpan1.getShangZhangRate2().multiply(new BigDecimal(0.1)));
            zuHeMa3 = zuHeMa3.add(stockDayYanPanBenpan1.getShangZhangMa3().multiply(new BigDecimal(0.1)));
            zuHeRate3 = zuHeRate3.add(stockDayYanPanBenpan1.getShangZhangRate3().multiply(new BigDecimal(0.1)));
            zuHeMa5 = zuHeMa5.add(stockDayYanPanBenpan1.getShangZhangMa5().multiply(new BigDecimal(0.1)));
            zuHeRate5 = zuHeRate5.add(stockDayYanPanBenpan1.getShangZhangRate5().multiply(new BigDecimal(0.1)));
            zuHeMa8 = zuHeMa8.add(stockDayYanPanBenpan1.getShangZhangMa8().multiply(new BigDecimal(0.1)));
            zuHeRate8 = zuHeRate8.add(stockDayYanPanBenpan1.getShangZhangRate8().multiply(new BigDecimal(0.1)));
            zuHeMa20 = zuHeMa20.add(stockDayYanPanBenpan1.getShangZhangMa20().multiply(new BigDecimal(0.1)));
            zuHeRate20 = zuHeRate20.add(stockDayYanPanBenpan1.getShangZhangRate20().multiply(new BigDecimal(0.1)));
        } else {
            zuHeMa1 = zuHeMa1.add(new BigDecimal(50).multiply(new BigDecimal(0.1)));
            zuHeRate1 = zuHeRate1.add(new BigDecimal(50).multiply(new BigDecimal(0.1)));
            zuHeMa2 = zuHeMa2.add(new BigDecimal(50).multiply(new BigDecimal(0.1)));
            zuHeRate2 = zuHeRate2.add(new BigDecimal(50).multiply(new BigDecimal(0.1)));
            zuHeMa3 = zuHeMa3.add(new BigDecimal(50).multiply(new BigDecimal(0.1)));
            zuHeRate3 = zuHeRate3.add(new BigDecimal(50).multiply(new BigDecimal(0.1)));
            zuHeMa5 = zuHeMa5.add(new BigDecimal(50).multiply(new BigDecimal(0.1)));
            zuHeRate5 = zuHeRate5.add(new BigDecimal(50).multiply(new BigDecimal(0.1)));
            zuHeMa8 = zuHeMa8.add(new BigDecimal(50).multiply(new BigDecimal(0.1)));
            zuHeRate8 = zuHeRate8.add(new BigDecimal(50).multiply(new BigDecimal(0.1)));
            zuHeMa20 = zuHeMa20.add(new BigDecimal(50).multiply(new BigDecimal(0.1)));
            zuHeRate20 = zuHeRate20.add(new BigDecimal(50).multiply(new BigDecimal(0.1)));
        }

        StockDayYanPanDapan stockDayYanPanDaPan = new StockDayYanPanDapan();
        BeanUtils.copyProperties(stockDayYanPan, stockDayYanPanDaPan);
        strPath.setLength(0);
        strPath.append("G:/stock-day/day-yan-pan-dapan/");
        strFileName = getFileNameDp(stockDayYanPanDaPan);
        File file6 = new File(strPath.toString() + strFileName + ".txt");
        if (file6.exists()) {
            StockDayYanPanDapan stockDayYanPanDaPan1 = getDaPanentity(strPath.toString() + strFileName);
            zuHeMa1 = zuHeMa1.add(stockDayYanPanDaPan1.getShangZhangMa1().multiply(new BigDecimal(0.1)));
            zuHeRate1 = zuHeRate1.add(stockDayYanPanDaPan1.getShangZhangRate1().multiply(new BigDecimal(0.1)));
            zuHeMa2 = zuHeMa2.add(stockDayYanPanDaPan1.getShangZhangMa2().multiply(new BigDecimal(0.1)));
            zuHeRate2 = zuHeRate2.add(stockDayYanPanDaPan1.getShangZhangRate2().multiply(new BigDecimal(0.1)));
            zuHeMa3 = zuHeMa3.add(stockDayYanPanDaPan1.getShangZhangMa3().multiply(new BigDecimal(0.1)));
            zuHeRate3 = zuHeRate3.add(stockDayYanPanDaPan1.getShangZhangRate3().multiply(new BigDecimal(0.1)));
            zuHeMa5 = zuHeMa5.add(stockDayYanPanDaPan1.getShangZhangMa5().multiply(new BigDecimal(0.1)));
            zuHeRate5 = zuHeRate5.add(stockDayYanPanDaPan1.getShangZhangRate5().multiply(new BigDecimal(0.1)));
            zuHeMa8 = zuHeMa8.add(stockDayYanPanDaPan1.getShangZhangMa8().multiply(new BigDecimal(0.1)));
            zuHeRate8 = zuHeRate8.add(stockDayYanPanDaPan1.getShangZhangRate8().multiply(new BigDecimal(0.1)));
            zuHeMa20 = zuHeMa20.add(stockDayYanPanDaPan1.getShangZhangMa20().multiply(new BigDecimal(0.1)));
            zuHeRate20 = zuHeRate20.add(stockDayYanPanDaPan1.getShangZhangRate20().multiply(new BigDecimal(0.1)));
        } else {
            zuHeMa1 = zuHeMa1.add(new BigDecimal(50).multiply(new BigDecimal(0.1)));
            zuHeRate1 = zuHeRate1.add(new BigDecimal(50).multiply(new BigDecimal(0.1)));
            zuHeMa2 = zuHeMa2.add(new BigDecimal(50).multiply(new BigDecimal(0.1)));
            zuHeRate2 = zuHeRate2.add(new BigDecimal(50).multiply(new BigDecimal(0.1)));
            zuHeMa3 = zuHeMa3.add(new BigDecimal(50).multiply(new BigDecimal(0.1)));
            zuHeRate3 = zuHeRate3.add(new BigDecimal(50).multiply(new BigDecimal(0.1)));
            zuHeMa5 = zuHeMa5.add(new BigDecimal(50).multiply(new BigDecimal(0.1)));
            zuHeRate5 = zuHeRate5.add(new BigDecimal(50).multiply(new BigDecimal(0.1)));
            zuHeMa8 = zuHeMa8.add(new BigDecimal(50).multiply(new BigDecimal(0.1)));
            zuHeRate8 = zuHeRate8.add(new BigDecimal(50).multiply(new BigDecimal(0.1)));
            zuHeMa20 = zuHeMa20.add(new BigDecimal(50).multiply(new BigDecimal(0.1)));
            zuHeRate20 = zuHeRate20.add(new BigDecimal(50).multiply(new BigDecimal(0.1)));
        }


        StockDayYanPan24 stockDayYanPan24 = new StockDayYanPan24();
        BeanUtils.copyProperties(stockDayYanPan, stockDayYanPan24);
        strPath.setLength(0);
        strPath.append("G:/stock-day/day-yan-pan-24/");
        strFileName = getFileName24(stockDayYanPan24);
        File file2 = new File(strPath.toString() + strFileName + ".txt");
        if (file2.exists()) {
            StockDayYanPan24 stockDayYanPan241 = get24entity(strPath.toString() + strFileName);
            zuHeMa1 = zuHeMa1.add(stockDayYanPan241.getShangZhangMa1().multiply(new BigDecimal(0.2)));
            zuHeRate1 = zuHeRate1.add(stockDayYanPan241.getShangZhangRate1().multiply(new BigDecimal(0.2)));
            zuHeMa2 = zuHeMa2.add(stockDayYanPan241.getShangZhangMa2().multiply(new BigDecimal(0.2)));
            zuHeRate2 = zuHeRate2.add(stockDayYanPan241.getShangZhangRate2().multiply(new BigDecimal(0.2)));
            zuHeMa3 = zuHeMa3.add(stockDayYanPan241.getShangZhangMa3().multiply(new BigDecimal(0.2)));
            zuHeRate3 = zuHeRate3.add(stockDayYanPan241.getShangZhangRate3().multiply(new BigDecimal(0.2)));
            zuHeMa5 = zuHeMa5.add(stockDayYanPan241.getShangZhangMa5().multiply(new BigDecimal(0.2)));
            zuHeRate5 = zuHeRate5.add(stockDayYanPan241.getShangZhangRate5().multiply(new BigDecimal(0.2)));
            zuHeMa8 = zuHeMa8.add(stockDayYanPan241.getShangZhangMa8().multiply(new BigDecimal(0.2)));
            zuHeRate8 = zuHeRate8.add(stockDayYanPan241.getShangZhangRate8().multiply(new BigDecimal(0.2)));
            zuHeMa20 = zuHeMa20.add(stockDayYanPan241.getShangZhangMa20().multiply(new BigDecimal(0.2)));
            zuHeRate20 = zuHeRate20.add(stockDayYanPan241.getShangZhangRate20().multiply(new BigDecimal(0.2)));
        } else {
            zuHeMa1 = zuHeMa1.add(new BigDecimal(50).multiply(new BigDecimal(0.2)));
            zuHeRate1 = zuHeRate1.add(new BigDecimal(50).multiply(new BigDecimal(0.2)));
            zuHeMa2 = zuHeMa2.add(new BigDecimal(50).multiply(new BigDecimal(0.2)));
            zuHeRate2 = zuHeRate2.add(new BigDecimal(50).multiply(new BigDecimal(0.2)));
            zuHeMa3 = zuHeMa3.add(new BigDecimal(50).multiply(new BigDecimal(0.2)));
            zuHeRate3 = zuHeRate3.add(new BigDecimal(50).multiply(new BigDecimal(0.2)));
            zuHeMa5 = zuHeMa5.add(new BigDecimal(50).multiply(new BigDecimal(0.2)));
            zuHeRate5 = zuHeRate5.add(new BigDecimal(50).multiply(new BigDecimal(0.2)));
            zuHeMa8 = zuHeMa8.add(new BigDecimal(50).multiply(new BigDecimal(0.2)));
            zuHeRate8 = zuHeRate8.add(new BigDecimal(50).multiply(new BigDecimal(0.2)));
            zuHeMa20 = zuHeMa20.add(new BigDecimal(50).multiply(new BigDecimal(0.2)));
            zuHeRate20 = zuHeRate20.add(new BigDecimal(50).multiply(new BigDecimal(0.2)));
        }

        StockDayYanPan33 stockDayYanPan33 = new StockDayYanPan33();
        BeanUtils.copyProperties(stockDayYanPan, stockDayYanPan33);
        strPath.setLength(0);
        strPath.append("G:/stock-day/day-yan-pan-33/");
        strFileName = getFileName33(stockDayYanPan33);
        File file3 = new File(strPath.toString() + strFileName + ".txt");
        if (file3.exists()) {
            StockDayYanPan33 stockDayYanPan331 = get33entity(strPath.toString() + strFileName);
            zuHeMa1 = zuHeMa1.add(stockDayYanPan331.getShangZhangMa1().multiply(new BigDecimal(0.2)));
            zuHeRate1 = zuHeRate1.add(stockDayYanPan331.getShangZhangRate1().multiply(new BigDecimal(0.2)));
            zuHeMa2 = zuHeMa2.add(stockDayYanPan331.getShangZhangMa2().multiply(new BigDecimal(0.2)));
            zuHeRate2 = zuHeRate2.add(stockDayYanPan331.getShangZhangRate2().multiply(new BigDecimal(0.2)));
            zuHeMa3 = zuHeMa3.add(stockDayYanPan331.getShangZhangMa3().multiply(new BigDecimal(0.2)));
            zuHeRate3 = zuHeRate3.add(stockDayYanPan331.getShangZhangRate3().multiply(new BigDecimal(0.2)));
            zuHeMa5 = zuHeMa5.add(stockDayYanPan331.getShangZhangMa5().multiply(new BigDecimal(0.2)));
            zuHeRate5 = zuHeRate5.add(stockDayYanPan331.getShangZhangRate5().multiply(new BigDecimal(0.2)));
            zuHeMa8 = zuHeMa8.add(stockDayYanPan331.getShangZhangMa8().multiply(new BigDecimal(0.2)));
            zuHeRate8 = zuHeRate8.add(stockDayYanPan331.getShangZhangRate8().multiply(new BigDecimal(0.2)));
            zuHeMa20 = zuHeMa20.add(stockDayYanPan331.getShangZhangMa20().multiply(new BigDecimal(0.2)));
            zuHeRate20 = zuHeRate20.add(stockDayYanPan331.getShangZhangRate20().multiply(new BigDecimal(0.2)));
        } else {
            zuHeMa1 = zuHeMa1.add(new BigDecimal(50).multiply(new BigDecimal(0.2)));
            zuHeRate1 = zuHeRate1.add(new BigDecimal(50).multiply(new BigDecimal(0.2)));
            zuHeMa2 = zuHeMa2.add(new BigDecimal(50).multiply(new BigDecimal(0.2)));
            zuHeRate2 = zuHeRate2.add(new BigDecimal(50).multiply(new BigDecimal(0.2)));
            zuHeMa3 = zuHeMa3.add(new BigDecimal(50).multiply(new BigDecimal(0.2)));
            zuHeRate3 = zuHeRate3.add(new BigDecimal(50).multiply(new BigDecimal(0.2)));
            zuHeMa5 = zuHeMa5.add(new BigDecimal(50).multiply(new BigDecimal(0.2)));
            zuHeRate5 = zuHeRate5.add(new BigDecimal(50).multiply(new BigDecimal(0.2)));
            zuHeMa8 = zuHeMa8.add(new BigDecimal(50).multiply(new BigDecimal(0.2)));
            zuHeRate8 = zuHeRate8.add(new BigDecimal(50).multiply(new BigDecimal(0.2)));
            zuHeMa20 = zuHeMa20.add(new BigDecimal(50).multiply(new BigDecimal(0.2)));
            zuHeRate20 = zuHeRate20.add(new BigDecimal(50).multiply(new BigDecimal(0.2)));
        }

        StockDayYanPan42 stockDayYanPan42 = new StockDayYanPan42();
        BeanUtils.copyProperties(stockDayYanPan, stockDayYanPan42);
        strPath.setLength(0);
        strPath.append("G:/stock-day/day-yan-pan-42/");
        strFileName = getFileName42(stockDayYanPan42);
        File file4 = new File(strPath.toString() + strFileName + ".txt");
        if (file4.exists()) {
            StockDayYanPan42 stockDayYanPan421 = get42entity(strPath.toString() + strFileName);
            zuHeMa1 = zuHeMa1.add(stockDayYanPan421.getShangZhangMa1().multiply(new BigDecimal(0.2)));
            zuHeRate1 = zuHeRate1.add(stockDayYanPan421.getShangZhangRate1().multiply(new BigDecimal(0.2)));
            zuHeMa2 = zuHeMa2.add(stockDayYanPan421.getShangZhangMa2().multiply(new BigDecimal(0.2)));
            zuHeRate2 = zuHeRate2.add(stockDayYanPan421.getShangZhangRate2().multiply(new BigDecimal(0.2)));
            zuHeMa3 = zuHeMa3.add(stockDayYanPan421.getShangZhangMa3().multiply(new BigDecimal(0.2)));
            zuHeRate3 = zuHeRate3.add(stockDayYanPan421.getShangZhangRate3().multiply(new BigDecimal(0.2)));
            zuHeMa5 = zuHeMa5.add(stockDayYanPan421.getShangZhangMa5().multiply(new BigDecimal(0.2)));
            zuHeRate5 = zuHeRate5.add(stockDayYanPan421.getShangZhangRate5().multiply(new BigDecimal(0.2)));
            zuHeMa8 = zuHeMa8.add(stockDayYanPan421.getShangZhangMa8().multiply(new BigDecimal(0.2)));
            zuHeRate8 = zuHeRate8.add(stockDayYanPan421.getShangZhangRate8().multiply(new BigDecimal(0.2)));
            zuHeMa20 = zuHeMa20.add(stockDayYanPan421.getShangZhangMa20().multiply(new BigDecimal(0.2)));
            zuHeRate20 = zuHeRate20.add(stockDayYanPan421.getShangZhangRate20().multiply(new BigDecimal(0.2)));
        } else {
            zuHeMa1 = zuHeMa1.add(new BigDecimal(50).multiply(new BigDecimal(0.2)));
            zuHeRate1 = zuHeRate1.add(new BigDecimal(50).multiply(new BigDecimal(0.2)));
            zuHeMa2 = zuHeMa2.add(new BigDecimal(50).multiply(new BigDecimal(0.2)));
            zuHeRate2 = zuHeRate2.add(new BigDecimal(50).multiply(new BigDecimal(0.2)));
            zuHeMa3 = zuHeMa3.add(new BigDecimal(50).multiply(new BigDecimal(0.2)));
            zuHeRate3 = zuHeRate3.add(new BigDecimal(50).multiply(new BigDecimal(0.2)));
            zuHeMa5 = zuHeMa5.add(new BigDecimal(50).multiply(new BigDecimal(0.2)));
            zuHeRate5 = zuHeRate5.add(new BigDecimal(50).multiply(new BigDecimal(0.2)));
            zuHeMa8 = zuHeMa8.add(new BigDecimal(50).multiply(new BigDecimal(0.2)));
            zuHeRate8 = zuHeRate8.add(new BigDecimal(50).multiply(new BigDecimal(0.2)));
            zuHeMa20 = zuHeMa20.add(new BigDecimal(50).multiply(new BigDecimal(0.2)));
            zuHeRate20 = zuHeRate20.add(new BigDecimal(50).multiply(new BigDecimal(0.2)));
        }

        StockDayYanPanChunJishu stockDayYanPanChunJishu = new StockDayYanPanChunJishu();
        BeanUtils.copyProperties(stockDayYanPan, stockDayYanPanChunJishu);
        strPath.setLength(0);
        strPath.append("G:/stock-day/day-yan-pan-ChunJishu/");
        strFileName = getFileNameCjs(stockDayYanPanChunJishu);
        File file1 = new File(strPath.toString() + strFileName + ".txt");
        if (file1.exists()) {
            StockDayYanPanChunJishu stockDayYanPanChunJishu1 = getChunJishuentity(strPath.toString() + strFileName);
            zuHeMa1 = zuHeMa1.add(stockDayYanPanChunJishu1.getShangZhangMa1().multiply(new BigDecimal(0.1)));
            zuHeRate1 = zuHeRate1.add(stockDayYanPanChunJishu1.getShangZhangRate1().multiply(new BigDecimal(0.1)));
            zuHeMa2 = zuHeMa2.add(stockDayYanPanChunJishu1.getShangZhangMa2().multiply(new BigDecimal(0.1)));
            zuHeRate2 = zuHeRate2.add(stockDayYanPanChunJishu1.getShangZhangRate2().multiply(new BigDecimal(0.1)));
            zuHeMa3 = zuHeMa3.add(stockDayYanPanChunJishu1.getShangZhangMa3().multiply(new BigDecimal(0.1)));
            zuHeRate3 = zuHeRate3.add(stockDayYanPanChunJishu1.getShangZhangRate3().multiply(new BigDecimal(0.1)));
            zuHeMa5 = zuHeMa5.add(stockDayYanPanChunJishu1.getShangZhangMa5().multiply(new BigDecimal(0.1)));
            zuHeRate5 = zuHeRate5.add(stockDayYanPanChunJishu1.getShangZhangRate5().multiply(new BigDecimal(0.1)));
            zuHeMa8 = zuHeMa8.add(stockDayYanPanChunJishu1.getShangZhangMa8().multiply(new BigDecimal(0.1)));
            zuHeRate8 = zuHeRate8.add(stockDayYanPanChunJishu1.getShangZhangRate8().multiply(new BigDecimal(0.1)));
            zuHeMa20 = zuHeMa20.add(stockDayYanPanChunJishu1.getShangZhangMa20().multiply(new BigDecimal(0.1)));
            zuHeRate20 = zuHeRate20.add(stockDayYanPanChunJishu1.getShangZhangRate20().multiply(new BigDecimal(0.1)));
        } else {
            zuHeMa1 = zuHeMa1.add(new BigDecimal(50).multiply(new BigDecimal(0.1)));
            zuHeRate1 = zuHeRate1.add(new BigDecimal(50).multiply(new BigDecimal(0.1)));
            zuHeMa2 = zuHeMa2.add(new BigDecimal(50).multiply(new BigDecimal(0.1)));
            zuHeRate2 = zuHeRate2.add(new BigDecimal(50).multiply(new BigDecimal(0.1)));
            zuHeMa3 = zuHeMa3.add(new BigDecimal(50).multiply(new BigDecimal(0.1)));
            zuHeRate3 = zuHeRate3.add(new BigDecimal(50).multiply(new BigDecimal(0.1)));
            zuHeMa5 = zuHeMa5.add(new BigDecimal(50).multiply(new BigDecimal(0.1)));
            zuHeRate5 = zuHeRate5.add(new BigDecimal(50).multiply(new BigDecimal(0.1)));
            zuHeMa8 = zuHeMa8.add(new BigDecimal(50).multiply(new BigDecimal(0.1)));
            zuHeRate8 = zuHeRate8.add(new BigDecimal(50).multiply(new BigDecimal(0.1)));
            zuHeMa20 = zuHeMa20.add(new BigDecimal(50).multiply(new BigDecimal(0.1)));
            zuHeRate20 = zuHeRate20.add(new BigDecimal(50).multiply(new BigDecimal(0.1)));
        }

        StockDayYanPanChunTuxing stockDayYanPanChunTuxing = new StockDayYanPanChunTuxing();
        BeanUtils.copyProperties(stockDayYanPan, stockDayYanPanChunTuxing);
        strPath.setLength(0);
        strPath.append("G:/stock-day/day-yan-pan-ChunTuxing/");
        strFileName = getFileNameCtx(stockDayYanPanChunTuxing);
        File file = new File(strPath.toString() + strFileName + ".txt");
        if (file.exists()) {
            StockDayYanPanChunTuxing stockDayYanPanChunTuxing1 = getChunTuxingentity(strPath.toString() + strFileName);
            zuHeMa1 = zuHeMa1.add(stockDayYanPanChunTuxing1.getShangZhangMa1().multiply(new BigDecimal(0.1)));
            zuHeRate1 = zuHeRate1.add(stockDayYanPanChunTuxing1.getShangZhangRate1().multiply(new BigDecimal(0.1)));
            zuHeMa2 = zuHeMa2.add(stockDayYanPanChunTuxing1.getShangZhangMa2().multiply(new BigDecimal(0.1)));
            zuHeRate2 = zuHeRate2.add(stockDayYanPanChunTuxing1.getShangZhangRate2().multiply(new BigDecimal(0.1)));
            zuHeMa3 = zuHeMa3.add(stockDayYanPanChunTuxing1.getShangZhangMa3().multiply(new BigDecimal(0.1)));
            zuHeRate3 = zuHeRate3.add(stockDayYanPanChunTuxing1.getShangZhangRate3().multiply(new BigDecimal(0.1)));
            zuHeMa5 = zuHeMa5.add(stockDayYanPanChunTuxing1.getShangZhangMa5().multiply(new BigDecimal(0.1)));
            zuHeRate5 = zuHeRate5.add(stockDayYanPanChunTuxing1.getShangZhangRate5().multiply(new BigDecimal(0.1)));
            zuHeMa8 = zuHeMa8.add(stockDayYanPanChunTuxing1.getShangZhangMa8().multiply(new BigDecimal(0.1)));
            zuHeRate8 = zuHeRate8.add(stockDayYanPanChunTuxing1.getShangZhangRate8().multiply(new BigDecimal(0.1)));
            zuHeMa20 = zuHeMa20.add(stockDayYanPanChunTuxing1.getShangZhangMa20().multiply(new BigDecimal(0.1)));
            zuHeRate20 = zuHeRate20.add(stockDayYanPanChunTuxing1.getShangZhangRate20().multiply(new BigDecimal(0.1)));
        } else {
            zuHeMa1 = zuHeMa1.add(new BigDecimal(50).multiply(new BigDecimal(0.1)));
            zuHeRate1 = zuHeRate1.add(new BigDecimal(50).multiply(new BigDecimal(0.1)));
            zuHeMa2 = zuHeMa2.add(new BigDecimal(50).multiply(new BigDecimal(0.1)));
            zuHeRate2 = zuHeRate2.add(new BigDecimal(50).multiply(new BigDecimal(0.1)));
            zuHeMa3 = zuHeMa3.add(new BigDecimal(50).multiply(new BigDecimal(0.1)));
            zuHeRate3 = zuHeRate3.add(new BigDecimal(50).multiply(new BigDecimal(0.1)));
            zuHeMa5 = zuHeMa5.add(new BigDecimal(50).multiply(new BigDecimal(0.1)));
            zuHeRate5 = zuHeRate5.add(new BigDecimal(50).multiply(new BigDecimal(0.1)));
            zuHeMa8 = zuHeMa8.add(new BigDecimal(50).multiply(new BigDecimal(0.1)));
            zuHeRate8 = zuHeRate8.add(new BigDecimal(50).multiply(new BigDecimal(0.1)));
            zuHeMa20 = zuHeMa20.add(new BigDecimal(50).multiply(new BigDecimal(0.1)));
            zuHeRate20 = zuHeRate20.add(new BigDecimal(50).multiply(new BigDecimal(0.1)));
        }
        DecimalFormat df1 = new DecimalFormat("0.00");
        stockDayVo.setZongHeShangZhangMa1(df1.format(zuHeMa1));
        stockDayVo.setZongHeShangZhangRate1(df1.format(zuHeRate1));
        stockDayVo.setZongHeShangZhangMa2(df1.format(zuHeMa2));
        stockDayVo.setZongHeShangZhangRate2(df1.format(zuHeRate2));
        stockDayVo.setZongHeShangZhangMa3(df1.format(zuHeMa3));
        stockDayVo.setZongHeShangZhangRate3(df1.format(zuHeRate3));
        stockDayVo.setZongHeShangZhangMa5(df1.format(zuHeMa5));
        stockDayVo.setZongHeShangZhangRate5(df1.format(zuHeRate5));
        stockDayVo.setZongHeShangZhangMa8(df1.format(zuHeMa8));
        stockDayVo.setZongHeShangZhangRate8(df1.format(zuHeRate8));
        stockDayVo.setZongHeShangZhangMa20(df1.format(zuHeMa20));
        stockDayVo.setZongHeShangZhangRate20(df1.format(zuHeRate20));
        stockDayVoList.add(stockDayVo);
        return stockDayVoList;
    }

    public static List<StockDayVo> getQTuXingList(StockDayYanPanZhuYanJiShu stockDayYanPanZhuYanJiShu, StockDayVo stockDayVo, List<StockDayVo> stockDayVoList) throws IOException {
        StringBuffer strPath = new StringBuffer();
        String strFileName;
        strPath.append("G:/stock-day/day-yan-pan-zhuyanjishu/");
        strFileName = GetFileName.getFileNameZhuYanJiShu(stockDayYanPanZhuYanJiShu);
        File file = new File(strPath.toString() + strFileName + ".txt");
        if (!file.exists()) {

        } else {
            StockDayYanPanZhuYanJiShu stockDayYanPanZhuYanJiShu1 = getZhuYanJiShuentity(strPath.toString() + strFileName);
            if ((stockDayYanPanZhuYanJiShu1.getShangZhangCount2().compareTo(new BigDecimal(25)) > 0 && stockDayYanPanZhuYanJiShu1.getShangZhangMa2().compareTo(new BigDecimal(2)) > 0 && stockDayYanPanZhuYanJiShu1.getShangZhangRate2().compareTo(new BigDecimal(60)) >= 0 &&
                    stockDayYanPanZhuYanJiShu1.getShangZhangMa3().compareTo(stockDayYanPanZhuYanJiShu1.getShangZhangMa2()) > 0 && stockDayYanPanZhuYanJiShu1.getShangZhangRate3().compareTo(new BigDecimal(55)) > 0 &&
                    stockDayYanPanZhuYanJiShu1.getShangZhangMa2().compareTo(stockDayYanPanZhuYanJiShu1.getShangZhangMa1()) > 0 ) ||
                    (stockDayYanPanZhuYanJiShu1.getShangZhangRate2().compareTo(new BigDecimal(56)) >= 0 &&stockDayYanPanZhuYanJiShu1.getShangZhangCount2().compareTo(new BigDecimal(25)) > 0 && stockDayYanPanZhuYanJiShu1.getShangZhangMa3().compareTo(stockDayYanPanZhuYanJiShu1.getShangZhangMa2()) > 0 &&
                            (stockDayYanPanZhuYanJiShu1.getShangZhangMa2().multiply(stockDayYanPanZhuYanJiShu1.getShangZhangRate2()).subtract(stockDayYanPanZhuYanJiShu1.getXiaJiangMa2().multiply(stockDayYanPanZhuYanJiShu1.getXiaJiangRate2()))).compareTo(new BigDecimal(200)) >= 0)) {
                stockDayVo.setShangZhangMa1(stockDayYanPanZhuYanJiShu1.getShangZhangMa1().toString());
                stockDayVo.setShangZhangRate1(stockDayYanPanZhuYanJiShu1.getShangZhangRate1().toString());
                stockDayVo.setShangZhangMa2(stockDayYanPanZhuYanJiShu1.getShangZhangMa2().toString());
                stockDayVo.setShangZhangRate2(stockDayYanPanZhuYanJiShu1.getShangZhangRate2().toString());
                stockDayVo.setShangZhangMa3(stockDayYanPanZhuYanJiShu1.getShangZhangMa3().toString());
                stockDayVo.setShangZhangRate3(stockDayYanPanZhuYanJiShu1.getShangZhangRate3().toString());
                stockDayVo.setShangZhangMa5(stockDayYanPanZhuYanJiShu1.getShangZhangMa5().toString());
                stockDayVo.setShangZhangRate5(stockDayYanPanZhuYanJiShu1.getShangZhangRate5().toString());
                stockDayVo.setShangZhangMa8(stockDayYanPanZhuYanJiShu1.getShangZhangMa8().toString());
                stockDayVo.setShangZhangRate8(stockDayYanPanZhuYanJiShu1.getShangZhangRate8().toString());
                stockDayVo.setShangZhangMa13(stockDayYanPanZhuYanJiShu1.getShangZhangMa13().toString());
                stockDayVo.setShangZhangRate13(stockDayYanPanZhuYanJiShu1.getShangZhangRate13().toString());
                stockDayVo.setShangZhangMa20(stockDayYanPanZhuYanJiShu1.getShangZhangMa20().toString());
                stockDayVo.setShangZhangRate20(stockDayYanPanZhuYanJiShu1.getShangZhangRate20().toString());
                stockDayVo.setChangeOf2((stockDayYanPanZhuYanJiShu1.getShangZhangMa2().multiply(stockDayYanPanZhuYanJiShu1.getShangZhangRate2()).subtract(stockDayYanPanZhuYanJiShu1.getXiaJiangMa2().multiply(stockDayYanPanZhuYanJiShu1.getXiaJiangRate2()))).toString());
                stockDayVoList.add(stockDayVo);
            }
        }
        return stockDayVoList;
    }

}
