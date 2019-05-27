package com.stock.stockday.util;

import com.stock.apicommon.Constants;
import com.stock.apicommon.vo.DaPanRateOfChangeVo;
import com.stock.apicommon.vo.DangRiVo;
import com.stock.apicommon.vo.YanPanVo;
import com.stock.stockday.entity.StockDayYanPan;
import com.stock.stockday.vo.StockDayVo;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

public class NewCommonSaveFile {

    public static void newCommonSaveFile(DaPanRateOfChangeVo daPanRateOfChangeVo, DangRiVo dangRiVo, YanPanVo yanPanVo, StockDayYanPan stockDayYanPan) throws IOException {
        if (daPanRateOfChangeVo != null && daPanRateOfChangeVo.getBeforeDPChange3() != null) {
            StringBuffer strPath = new StringBuffer();
            strPath.append("D:/stock-day1/");
            if (daPanRateOfChangeVo.getBeforeDPChange3().compareTo(new BigDecimal(3)) > 0) {
                strPath.append("dapandayu3/");
                if (dangRiVo.getXianXing().equals(Constants.DAYANG)){
                    strPath.append("dayang/");
                    NewSaveFileUtil.KmpTD(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.ZHONGYANG)){
                    strPath.append("zhongyang/");
                    NewSaveFileUtil.KmpTD(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.XIAOYANG)){
                    strPath.append("xiaoyang/");
                    NewSaveFileUtil.KmpTD(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.XIAOYIN)){
                    strPath.append("xiaoyin/");
                    NewSaveFileUtil.KmpTD(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.ZHONGYIN)){
                    strPath.append("zhongyin/");
                    NewSaveFileUtil.KmpTD(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.DAYIN)){
                    strPath.append("dayin/");
                    NewSaveFileUtil.KmpTD(yanPanVo,stockDayYanPan,strPath);
                }
            }else if (daPanRateOfChangeVo.getBeforeDPChange3().compareTo(new BigDecimal(0)) > 0){
                strPath.append("dapandayu0/");
                if (dangRiVo.getXianXing().equals(Constants.DAYANG)){
                    strPath.append("dayang/");
                    NewSaveFileUtil.KmpTD(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.ZHONGYANG)){
                    strPath.append("zhongyang/");
                    NewSaveFileUtil.KmpTD(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.XIAOYANG)){
                    strPath.append("xiaoyang/");
                    NewSaveFileUtil.KmpTD(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.XIAOYIN)){
                    strPath.append("xiaoyin/");
                    NewSaveFileUtil.KmpTD(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.ZHONGYIN)){
                    strPath.append("zhongyin/");
                    NewSaveFileUtil.KmpTD(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.DAYIN)){
                    strPath.append("dayin/");
                    NewSaveFileUtil.KmpTD(yanPanVo,stockDayYanPan,strPath);
                }
            }else if (daPanRateOfChangeVo.getBeforeDPChange3().compareTo(new BigDecimal(-3)) > 0){
                strPath.append("dapanxiaoyu0/");
                if (dangRiVo.getXianXing().equals(Constants.DAYANG)){
                    strPath.append("dayang/");
                    NewSaveFileUtil.KmpTD(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.ZHONGYANG)){
                    strPath.append("zhongyang/");
                    NewSaveFileUtil.KmpTD(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.XIAOYANG)){
                    strPath.append("xiaoyang/");
                    NewSaveFileUtil.KmpTD(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.XIAOYIN)){
                    strPath.append("xiaoyin/");
                    NewSaveFileUtil.KmpTD(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.ZHONGYIN)){
                    strPath.append("zhongyin/");
                    NewSaveFileUtil.KmpTD(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.DAYIN)){
                    strPath.append("dayin/");
                    NewSaveFileUtil.KmpTD(yanPanVo,stockDayYanPan,strPath);
                }
            }else {
                strPath.append("dapanxiaoyu-3/");
                if (dangRiVo.getXianXing().equals(Constants.DAYANG)){
                    strPath.append("dayang/");
                    NewSaveFileUtil.KmpTD(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.ZHONGYANG)){
                    strPath.append("zhongyang/");
                    NewSaveFileUtil.KmpTD(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.XIAOYANG)){
                    strPath.append("xiaoyang/");
                    NewSaveFileUtil.KmpTD(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.XIAOYIN)){
                    strPath.append("xiaoyin/");
                    NewSaveFileUtil.KmpTD(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.ZHONGYIN)){
                    strPath.append("zhongyin/");
                    NewSaveFileUtil.KmpTD(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.DAYIN)){
                    strPath.append("dayin/");
                    NewSaveFileUtil.KmpTD(yanPanVo,stockDayYanPan,strPath);
                }
            }
        }

        if (daPanRateOfChangeVo != null && daPanRateOfChangeVo.getBeforeDPChange3() != null) {
            StringBuffer strPath = new StringBuffer();
            strPath.append("D:/stock-day1/");
            if (daPanRateOfChangeVo.getBeforeDPChange3().compareTo(new BigDecimal(3)) > 0) {
                strPath.append("dapandayu3/");
                strPath.append("KmQR/");
                NewSaveFileUtil.KmQR(yanPanVo,stockDayYanPan,strPath);

            }else if (daPanRateOfChangeVo.getBeforeDPChange3().compareTo(new BigDecimal(0)) > 0){
                strPath.append("dapandayu0/");
                strPath.append("KmQR/");
                NewSaveFileUtil.KmQR(yanPanVo,stockDayYanPan,strPath);

            }else if (daPanRateOfChangeVo.getBeforeDPChange3().compareTo(new BigDecimal(-3)) > 0){
                strPath.append("dapanxiaoyu0/");
                strPath.append("KmQR/");
                NewSaveFileUtil.KmQR(yanPanVo,stockDayYanPan,strPath);

            }else {
                strPath.append("dapanxiaoyu-3/");
                strPath.append("KmQR/");
                NewSaveFileUtil.KmQR(yanPanVo,stockDayYanPan,strPath);

            }
        }

        if (daPanRateOfChangeVo != null && daPanRateOfChangeVo.getBeforeDPChange3() != null) {
            StringBuffer strPath = new StringBuffer();
            strPath.append("D:/stock-day1/");
            if (daPanRateOfChangeVo.getBeforeDPChange3().compareTo(new BigDecimal(3)) > 0) {
                strPath.append("dapandayu3/");
                strPath.append("QTuXing/");
                NewSaveFileUtil.QTuXing(yanPanVo,stockDayYanPan,strPath);

            }else if (daPanRateOfChangeVo.getBeforeDPChange3().compareTo(new BigDecimal(0)) > 0){
                strPath.append("dapandayu0/");
                strPath.append("QTuXing/");
                NewSaveFileUtil.QTuXing(yanPanVo,stockDayYanPan,strPath);

            }else if (daPanRateOfChangeVo.getBeforeDPChange3().compareTo(new BigDecimal(-3)) > 0){
                strPath.append("dapanxiaoyu0/");
                strPath.append("QTuXing/");
                NewSaveFileUtil.QTuXing(yanPanVo,stockDayYanPan,strPath);

            }else {
                strPath.append("dapanxiaoyu-3/");
                strPath.append("QTuXing/");
                NewSaveFileUtil.QTuXing(yanPanVo,stockDayYanPan,strPath);

            }
        }
    }

    public static void newKTu20LSSaveFile(DaPanRateOfChangeVo daPanRateOfChangeVo, DangRiVo dangRiVo, YanPanVo yanPanVo, StockDayYanPan stockDayYanPan) throws IOException {
        if (daPanRateOfChangeVo != null && daPanRateOfChangeVo.getBeforeDPChange3() != null) {
            StringBuffer strPath = new StringBuffer();
            strPath.append("G:/stock-day2/");
            if (daPanRateOfChangeVo.getBeforeDPChange3().compareTo(new BigDecimal(3)) > 0) {
                strPath.append("dapandayu3/");
                if (dangRiVo.getXianXing().equals(Constants.DAYANG)){
                    strPath.append("dayang/");
                    NewSaveFileUtil.KTu20LS(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.ZHONGYANG)){
                    strPath.append("zhongyang/");
                    NewSaveFileUtil.KTu20LS(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.XIAOYANG)){
                    strPath.append("xiaoyang/");
                    NewSaveFileUtil.KTu20LS(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.XIAOYIN)){
                    strPath.append("xiaoyin/");
                    NewSaveFileUtil.KTu20LS(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.ZHONGYIN)){
                    strPath.append("zhongyin/");
                    NewSaveFileUtil.KTu20LS(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.DAYIN)){
                    strPath.append("dayin/");
                    NewSaveFileUtil.KTu20LS(yanPanVo,stockDayYanPan,strPath);
                }
            }else if (daPanRateOfChangeVo.getBeforeDPChange3().compareTo(new BigDecimal(0)) > 0){
                strPath.append("dapandayu0/");
                if (dangRiVo.getXianXing().equals(Constants.DAYANG)){
                    strPath.append("dayang/");
                    NewSaveFileUtil.KTu20LS(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.ZHONGYANG)){
                    strPath.append("zhongyang/");
                    NewSaveFileUtil.KTu20LS(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.XIAOYANG)){
                    strPath.append("xiaoyang/");
                    NewSaveFileUtil.KTu20LS(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.XIAOYIN)){
                    strPath.append("xiaoyin/");
                    NewSaveFileUtil.KTu20LS(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.ZHONGYIN)){
                    strPath.append("zhongyin/");
                    NewSaveFileUtil.KTu20LS(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.DAYIN)){
                    strPath.append("dayin/");
                    NewSaveFileUtil.KTu20LS(yanPanVo,stockDayYanPan,strPath);
                }
            }else if (daPanRateOfChangeVo.getBeforeDPChange3().compareTo(new BigDecimal(-3)) > 0){
                strPath.append("dapanxiaoyu0/");
                if (dangRiVo.getXianXing().equals(Constants.DAYANG)){
                    strPath.append("dayang/");
                    NewSaveFileUtil.KTu20LS(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.ZHONGYANG)){
                    strPath.append("zhongyang/");
                    NewSaveFileUtil.KTu20LS(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.XIAOYANG)){
                    strPath.append("xiaoyang/");
                    NewSaveFileUtil.KTu20LS(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.XIAOYIN)){
                    strPath.append("xiaoyin/");
                    NewSaveFileUtil.KTu20LS(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.ZHONGYIN)){
                    strPath.append("zhongyin/");
                    NewSaveFileUtil.KTu20LS(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.DAYIN)){
                    strPath.append("dayin/");
                    NewSaveFileUtil.KTu20LS(yanPanVo,stockDayYanPan,strPath);
                }
            }else {
                strPath.append("dapanxiaoyu-3/");
                if (dangRiVo.getXianXing().equals(Constants.DAYANG)){
                    strPath.append("dayang/");
                    NewSaveFileUtil.KTu20LS(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.ZHONGYANG)){
                    strPath.append("zhongyang/");
                    NewSaveFileUtil.KTu20LS(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.XIAOYANG)){
                    strPath.append("xiaoyang/");
                    NewSaveFileUtil.KTu20LS(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.XIAOYIN)){
                    strPath.append("xiaoyin/");
                    NewSaveFileUtil.KTu20LS(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.ZHONGYIN)){
                    strPath.append("zhongyin/");
                    NewSaveFileUtil.KTu20LS(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.DAYIN)){
                    strPath.append("dayin/");
                    NewSaveFileUtil.KTu20LS(yanPanVo,stockDayYanPan,strPath);
                }
            }
        }

    }

    public static void newKTu20SSaveFile(DaPanRateOfChangeVo daPanRateOfChangeVo, DangRiVo dangRiVo, YanPanVo yanPanVo, StockDayYanPan stockDayYanPan) throws IOException {
        if (daPanRateOfChangeVo != null && daPanRateOfChangeVo.getBeforeDPChange3() != null) {
            StringBuffer strPath = new StringBuffer();
            strPath.append("G:/stock-day3/");
            if (daPanRateOfChangeVo.getBeforeDPChange3().compareTo(new BigDecimal(3)) > 0) {
                strPath.append("dapandayu3/");
                if (dangRiVo.getXianXing().equals(Constants.DAYANG)){
                    strPath.append("dayang/");
                    NewSaveFileUtil.KTu20S(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.ZHONGYANG)){
                    strPath.append("zhongyang/");
                    NewSaveFileUtil.KTu20S(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.XIAOYANG)){
                    strPath.append("xiaoyang/");
                    NewSaveFileUtil.KTu20S(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.XIAOYIN)){
                    strPath.append("xiaoyin/");
                    NewSaveFileUtil.KTu20S(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.ZHONGYIN)){
                    strPath.append("zhongyin/");
                    NewSaveFileUtil.KTu20S(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.DAYIN)){
                    strPath.append("dayin/");
                    NewSaveFileUtil.KTu20S(yanPanVo,stockDayYanPan,strPath);
                }
            }else if (daPanRateOfChangeVo.getBeforeDPChange3().compareTo(new BigDecimal(0)) > 0){
                strPath.append("dapandayu0/");
                if (dangRiVo.getXianXing().equals(Constants.DAYANG)){
                    strPath.append("dayang/");
                    NewSaveFileUtil.KTu20S(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.ZHONGYANG)){
                    strPath.append("zhongyang/");
                    NewSaveFileUtil.KTu20S(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.XIAOYANG)){
                    strPath.append("xiaoyang/");
                    NewSaveFileUtil.KTu20S(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.XIAOYIN)){
                    strPath.append("xiaoyin/");
                    NewSaveFileUtil.KTu20S(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.ZHONGYIN)){
                    strPath.append("zhongyin/");
                    NewSaveFileUtil.KTu20S(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.DAYIN)){
                    strPath.append("dayin/");
                    NewSaveFileUtil.KTu20S(yanPanVo,stockDayYanPan,strPath);
                }
            }else if (daPanRateOfChangeVo.getBeforeDPChange3().compareTo(new BigDecimal(-3)) > 0){
                strPath.append("dapanxiaoyu0/");
                if (dangRiVo.getXianXing().equals(Constants.DAYANG)){
                    strPath.append("dayang/");
                    NewSaveFileUtil.KTu20S(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.ZHONGYANG)){
                    strPath.append("zhongyang/");
                    NewSaveFileUtil.KTu20S(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.XIAOYANG)){
                    strPath.append("xiaoyang/");
                    NewSaveFileUtil.KTu20S(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.XIAOYIN)){
                    strPath.append("xiaoyin/");
                    NewSaveFileUtil.KTu20S(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.ZHONGYIN)){
                    strPath.append("zhongyin/");
                    NewSaveFileUtil.KTu20S(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.DAYIN)){
                    strPath.append("dayin/");
                    NewSaveFileUtil.KTu20S(yanPanVo,stockDayYanPan,strPath);
                }
            }else {
                strPath.append("dapanxiaoyu-3/");
                if (dangRiVo.getXianXing().equals(Constants.DAYANG)){
                    strPath.append("dayang/");
                    NewSaveFileUtil.KTu20S(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.ZHONGYANG)){
                    strPath.append("zhongyang/");
                    NewSaveFileUtil.KTu20S(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.XIAOYANG)){
                    strPath.append("xiaoyang/");
                    NewSaveFileUtil.KTu20S(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.XIAOYIN)){
                    strPath.append("xiaoyin/");
                    NewSaveFileUtil.KTu20S(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.ZHONGYIN)){
                    strPath.append("zhongyin/");
                    NewSaveFileUtil.KTu20S(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.DAYIN)){
                    strPath.append("dayin/");
                    NewSaveFileUtil.KTu20S(yanPanVo,stockDayYanPan,strPath);
                }
            }
        }

    }

    public static void newKTu20LSaveFile(DaPanRateOfChangeVo daPanRateOfChangeVo, DangRiVo dangRiVo, YanPanVo yanPanVo, StockDayYanPan stockDayYanPan) throws IOException {
        if (daPanRateOfChangeVo != null && daPanRateOfChangeVo.getBeforeDPChange3() != null) {
            StringBuffer strPath = new StringBuffer();
            strPath.append("G:/stock-day4/");
            if (daPanRateOfChangeVo.getBeforeDPChange3().compareTo(new BigDecimal(3)) > 0) {
                strPath.append("dapandayu3/");
                if (dangRiVo.getXianXing().equals(Constants.DAYANG)){
                    strPath.append("dayang/");
                    NewSaveFileUtil.KTu20L(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.ZHONGYANG)){
                    strPath.append("zhongyang/");
                    NewSaveFileUtil.KTu20L(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.XIAOYANG)){
                    strPath.append("xiaoyang/");
                    NewSaveFileUtil.KTu20L(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.XIAOYIN)){
                    strPath.append("xiaoyin/");
                    NewSaveFileUtil.KTu20L(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.ZHONGYIN)){
                    strPath.append("zhongyin/");
                    NewSaveFileUtil.KTu20L(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.DAYIN)){
                    strPath.append("dayin/");
                    NewSaveFileUtil.KTu20L(yanPanVo,stockDayYanPan,strPath);
                }
            }else if (daPanRateOfChangeVo.getBeforeDPChange3().compareTo(new BigDecimal(0)) > 0){
                strPath.append("dapandayu0/");
                if (dangRiVo.getXianXing().equals(Constants.DAYANG)){
                    strPath.append("dayang/");
                    NewSaveFileUtil.KTu20L(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.ZHONGYANG)){
                    strPath.append("zhongyang/");
                    NewSaveFileUtil.KTu20L(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.XIAOYANG)){
                    strPath.append("xiaoyang/");
                    NewSaveFileUtil.KTu20L(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.XIAOYIN)){
                    strPath.append("xiaoyin/");
                    NewSaveFileUtil.KTu20L(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.ZHONGYIN)){
                    strPath.append("zhongyin/");
                    NewSaveFileUtil.KTu20L(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.DAYIN)){
                    strPath.append("dayin/");
                    NewSaveFileUtil.KTu20L(yanPanVo,stockDayYanPan,strPath);
                }
            }else if (daPanRateOfChangeVo.getBeforeDPChange3().compareTo(new BigDecimal(-3)) > 0){
                strPath.append("dapanxiaoyu0/");
                if (dangRiVo.getXianXing().equals(Constants.DAYANG)){
                    strPath.append("dayang/");
                    NewSaveFileUtil.KTu20L(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.ZHONGYANG)){
                    strPath.append("zhongyang/");
                    NewSaveFileUtil.KTu20L(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.XIAOYANG)){
                    strPath.append("xiaoyang/");
                    NewSaveFileUtil.KTu20L(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.XIAOYIN)){
                    strPath.append("xiaoyin/");
                    NewSaveFileUtil.KTu20L(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.ZHONGYIN)){
                    strPath.append("zhongyin/");
                    NewSaveFileUtil.KTu20L(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.DAYIN)){
                    strPath.append("dayin/");
                    NewSaveFileUtil.KTu20L(yanPanVo,stockDayYanPan,strPath);
                }
            }else {
                strPath.append("dapanxiaoyu-3/");
                if (dangRiVo.getXianXing().equals(Constants.DAYANG)){
                    strPath.append("dayang/");
                    NewSaveFileUtil.KTu20L(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.ZHONGYANG)){
                    strPath.append("zhongyang/");
                    NewSaveFileUtil.KTu20L(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.XIAOYANG)){
                    strPath.append("xiaoyang/");
                    NewSaveFileUtil.KTu20L(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.XIAOYIN)){
                    strPath.append("xiaoyin/");
                    NewSaveFileUtil.KTu20L(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.ZHONGYIN)){
                    strPath.append("zhongyin/");
                    NewSaveFileUtil.KTu20L(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.DAYIN)){
                    strPath.append("dayin/");
                    NewSaveFileUtil.KTu20L(yanPanVo,stockDayYanPan,strPath);
                }
            }
        }

    }

    public static void newKMAQ20SaveFile(DaPanRateOfChangeVo daPanRateOfChangeVo, DangRiVo dangRiVo, YanPanVo yanPanVo, StockDayYanPan stockDayYanPan) throws IOException {
        if (daPanRateOfChangeVo != null && daPanRateOfChangeVo.getBeforeDPChange3() != null) {
            StringBuffer strPath = new StringBuffer();
            strPath.append("G:/stock-day5/");
            if (daPanRateOfChangeVo.getBeforeDPChange3().compareTo(new BigDecimal(3)) > 0) {
                strPath.append("dapandayu3/");
                if (dangRiVo.getXianXing().equals(Constants.DAYANG)){
                    strPath.append("dayang/");
                    NewSaveFileUtil.KMAQ20(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.ZHONGYANG)){
                    strPath.append("zhongyang/");
                    NewSaveFileUtil.KMAQ20(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.XIAOYANG)){
                    strPath.append("xiaoyang/");
                    NewSaveFileUtil.KMAQ20(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.XIAOYIN)){
                    strPath.append("xiaoyin/");
                    NewSaveFileUtil.KMAQ20(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.ZHONGYIN)){
                    strPath.append("zhongyin/");
                    NewSaveFileUtil.KMAQ20(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.DAYIN)){
                    strPath.append("dayin/");
                    NewSaveFileUtil.KMAQ20(yanPanVo,stockDayYanPan,strPath);
                }
            }else if (daPanRateOfChangeVo.getBeforeDPChange3().compareTo(new BigDecimal(0)) > 0){
                strPath.append("dapandayu0/");
                if (dangRiVo.getXianXing().equals(Constants.DAYANG)){
                    strPath.append("dayang/");
                    NewSaveFileUtil.KMAQ20(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.ZHONGYANG)){
                    strPath.append("zhongyang/");
                    NewSaveFileUtil.KMAQ20(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.XIAOYANG)){
                    strPath.append("xiaoyang/");
                    NewSaveFileUtil.KMAQ20(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.XIAOYIN)){
                    strPath.append("xiaoyin/");
                    NewSaveFileUtil.KMAQ20(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.ZHONGYIN)){
                    strPath.append("zhongyin/");
                    NewSaveFileUtil.KMAQ20(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.DAYIN)){
                    strPath.append("dayin/");
                    NewSaveFileUtil.KMAQ20(yanPanVo,stockDayYanPan,strPath);
                }
            }else if (daPanRateOfChangeVo.getBeforeDPChange3().compareTo(new BigDecimal(-3)) > 0){
                strPath.append("dapanxiaoyu0/");
                if (dangRiVo.getXianXing().equals(Constants.DAYANG)){
                    strPath.append("dayang/");
                    NewSaveFileUtil.KMAQ20(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.ZHONGYANG)){
                    strPath.append("zhongyang/");
                    NewSaveFileUtil.KMAQ20(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.XIAOYANG)){
                    strPath.append("xiaoyang/");
                    NewSaveFileUtil.KMAQ20(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.XIAOYIN)){
                    strPath.append("xiaoyin/");
                    NewSaveFileUtil.KMAQ20(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.ZHONGYIN)){
                    strPath.append("zhongyin/");
                    NewSaveFileUtil.KMAQ20(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.DAYIN)){
                    strPath.append("dayin/");
                    NewSaveFileUtil.KMAQ20(yanPanVo,stockDayYanPan,strPath);
                }
            }else {
                strPath.append("dapanxiaoyu-3/");
                if (dangRiVo.getXianXing().equals(Constants.DAYANG)){
                    strPath.append("dayang/");
                    NewSaveFileUtil.KMAQ20(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.ZHONGYANG)){
                    strPath.append("zhongyang/");
                    NewSaveFileUtil.KMAQ20(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.XIAOYANG)){
                    strPath.append("xiaoyang/");
                    NewSaveFileUtil.KMAQ20(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.XIAOYIN)){
                    strPath.append("xiaoyin/");
                    NewSaveFileUtil.KMAQ20(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.ZHONGYIN)){
                    strPath.append("zhongyin/");
                    NewSaveFileUtil.KMAQ20(yanPanVo,stockDayYanPan,strPath);
                }else if (dangRiVo.getXianXing().equals(Constants.DAYIN)){
                    strPath.append("dayin/");
                    NewSaveFileUtil.KMAQ20(yanPanVo,stockDayYanPan,strPath);
                }
            }
        }

    }

    public static List<StockDayVo> newCommonKMPTDList(DaPanRateOfChangeVo daPanRateOfChangeVo, DangRiVo dangRiVo, StockDayYanPan stockDayYanPan,StockDayVo stockDayVo, List<StockDayVo> stockDayVoList) throws IOException {
        if (daPanRateOfChangeVo != null && daPanRateOfChangeVo.getBeforeDPChange3() != null) {
            StringBuffer strPath = new StringBuffer();
            strPath.append("D:/stock-day1/");
            if (daPanRateOfChangeVo.getBeforeDPChange3().compareTo(new BigDecimal(3)) > 0) {
                strPath.append("dapandayu3/");
                if (dangRiVo.getXianXing().equals(Constants.DAYANG)){
                    strPath.append("dayang/");
                    stockDayVoList= NewSaveFileUtil.KmpTDList(stockDayYanPan,strPath,stockDayVo,stockDayVoList);
                }else if (dangRiVo.getXianXing().equals(Constants.ZHONGYANG)){
                    strPath.append("zhongyang/");
                   stockDayVoList= NewSaveFileUtil.KmpTDList(stockDayYanPan,strPath,stockDayVo,stockDayVoList);
                }else if (dangRiVo.getXianXing().equals(Constants.XIAOYANG)){
                    strPath.append("xiaoyang/");
                    stockDayVoList= NewSaveFileUtil.KmpTDList(stockDayYanPan,strPath,stockDayVo,stockDayVoList);
                }else if (dangRiVo.getXianXing().equals(Constants.XIAOYIN)){
                    strPath.append("xiaoyin/");
                    stockDayVoList= NewSaveFileUtil.KmpTDList(stockDayYanPan,strPath,stockDayVo,stockDayVoList);
                }else if (dangRiVo.getXianXing().equals(Constants.ZHONGYIN)){
                    strPath.append("zhongyin/");
                    stockDayVoList= NewSaveFileUtil.KmpTDList(stockDayYanPan,strPath,stockDayVo,stockDayVoList);
                }else if (dangRiVo.getXianXing().equals(Constants.DAYIN)){
                    strPath.append("dayin/");
                    stockDayVoList= NewSaveFileUtil.KmpTDList(stockDayYanPan,strPath,stockDayVo,stockDayVoList);
                }
            }else if (daPanRateOfChangeVo.getBeforeDPChange3().compareTo(new BigDecimal(0)) > 0){
                strPath.append("dapandayu0/");
                if (dangRiVo.getXianXing().equals(Constants.DAYANG)){
                    strPath.append("dayang/");
                    stockDayVoList= NewSaveFileUtil.KmpTDList(stockDayYanPan,strPath,stockDayVo,stockDayVoList);
                }else if (dangRiVo.getXianXing().equals(Constants.ZHONGYANG)){
                    strPath.append("zhongyang/");
                    stockDayVoList= NewSaveFileUtil.KmpTDList(stockDayYanPan,strPath,stockDayVo,stockDayVoList);
                }else if (dangRiVo.getXianXing().equals(Constants.XIAOYANG)){
                    strPath.append("xiaoyang/");
                    stockDayVoList= NewSaveFileUtil.KmpTDList(stockDayYanPan,strPath,stockDayVo,stockDayVoList);
                }else if (dangRiVo.getXianXing().equals(Constants.XIAOYIN)){
                    strPath.append("xiaoyin/");
                    stockDayVoList= NewSaveFileUtil.KmpTDList(stockDayYanPan,strPath,stockDayVo,stockDayVoList);
                }else if (dangRiVo.getXianXing().equals(Constants.ZHONGYIN)){
                    strPath.append("zhongyin/");
                    stockDayVoList= NewSaveFileUtil.KmpTDList(stockDayYanPan,strPath,stockDayVo,stockDayVoList);
                }else if (dangRiVo.getXianXing().equals(Constants.DAYIN)){
                    strPath.append("dayin/");
                    stockDayVoList= NewSaveFileUtil.KmpTDList(stockDayYanPan,strPath,stockDayVo,stockDayVoList);
                }
            }else if (daPanRateOfChangeVo.getBeforeDPChange3().compareTo(new BigDecimal(-3)) > 0){
                strPath.append("dapanxiaoyu0/");
                if (dangRiVo.getXianXing().equals(Constants.DAYANG)){
                    strPath.append("dayang/");
                    stockDayVoList= NewSaveFileUtil.KmpTDList(stockDayYanPan,strPath,stockDayVo,stockDayVoList);
                }else if (dangRiVo.getXianXing().equals(Constants.ZHONGYANG)){
                    strPath.append("zhongyang/");
                    stockDayVoList= NewSaveFileUtil.KmpTDList(stockDayYanPan,strPath,stockDayVo,stockDayVoList);
                }else if (dangRiVo.getXianXing().equals(Constants.XIAOYANG)){
                    strPath.append("xiaoyang/");
                    stockDayVoList= NewSaveFileUtil.KmpTDList(stockDayYanPan,strPath,stockDayVo,stockDayVoList);
                }else if (dangRiVo.getXianXing().equals(Constants.XIAOYIN)){
                    strPath.append("xiaoyin/");
                    stockDayVoList= NewSaveFileUtil.KmpTDList(stockDayYanPan,strPath,stockDayVo,stockDayVoList);
                }else if (dangRiVo.getXianXing().equals(Constants.ZHONGYIN)){
                    strPath.append("zhongyin/");
                    stockDayVoList= NewSaveFileUtil.KmpTDList(stockDayYanPan,strPath,stockDayVo,stockDayVoList);
                }else if (dangRiVo.getXianXing().equals(Constants.DAYIN)){
                    strPath.append("dayin/");
                    stockDayVoList= NewSaveFileUtil.KmpTDList(stockDayYanPan,strPath,stockDayVo,stockDayVoList);
                }
            }else {
                strPath.append("dapanxiaoyu-3/");
                if (dangRiVo.getXianXing().equals(Constants.DAYANG)){
                    strPath.append("dayang/");
                    stockDayVoList= NewSaveFileUtil.KmpTDList(stockDayYanPan,strPath,stockDayVo,stockDayVoList);
                }else if (dangRiVo.getXianXing().equals(Constants.ZHONGYANG)){
                    strPath.append("zhongyang/");
                    stockDayVoList= NewSaveFileUtil.KmpTDList(stockDayYanPan,strPath,stockDayVo,stockDayVoList);
                }else if (dangRiVo.getXianXing().equals(Constants.XIAOYANG)){
                    strPath.append("xiaoyang/");
                    stockDayVoList= NewSaveFileUtil.KmpTDList(stockDayYanPan,strPath,stockDayVo,stockDayVoList);
                }else if (dangRiVo.getXianXing().equals(Constants.XIAOYIN)){
                    strPath.append("xiaoyin/");
                    stockDayVoList= NewSaveFileUtil.KmpTDList(stockDayYanPan,strPath,stockDayVo,stockDayVoList);
                }else if (dangRiVo.getXianXing().equals(Constants.ZHONGYIN)){
                    strPath.append("zhongyin/");
                    stockDayVoList= NewSaveFileUtil.KmpTDList(stockDayYanPan,strPath,stockDayVo,stockDayVoList);
                }else if (dangRiVo.getXianXing().equals(Constants.DAYIN)){
                    strPath.append("dayin/");
                    stockDayVoList= NewSaveFileUtil.KmpTDList(stockDayYanPan,strPath,stockDayVo,stockDayVoList);
                }
            }
        }
      return stockDayVoList;
    }

    public static  List<StockDayVo> newCommonKmQRList(DaPanRateOfChangeVo daPanRateOfChangeVo, StockDayYanPan stockDayYanPan,StockDayVo stockDayVo, List<StockDayVo> stockDayVoList) throws IOException {
        if (daPanRateOfChangeVo != null && daPanRateOfChangeVo.getBeforeDPChange3() != null) {
            StringBuffer strPath = new StringBuffer();
            strPath.append("D:/stock-day1/");
            if (daPanRateOfChangeVo.getBeforeDPChange3().compareTo(new BigDecimal(3)) > 0) {
                strPath.append("dapandayu3/");
                strPath.append("KmQR/");
               stockDayVoList= NewSaveFileUtil.KmQRList(stockDayYanPan,strPath,stockDayVo,stockDayVoList);

            }else if (daPanRateOfChangeVo.getBeforeDPChange3().compareTo(new BigDecimal(0)) > 0){
                strPath.append("dapandayu0/");
                strPath.append("KmQR/");
                stockDayVoList= NewSaveFileUtil.KmQRList(stockDayYanPan,strPath,stockDayVo,stockDayVoList);

            }else if (daPanRateOfChangeVo.getBeforeDPChange3().compareTo(new BigDecimal(-3)) > 0){
                strPath.append("dapanxiaoyu0/");
                strPath.append("KmQR/");
                stockDayVoList= NewSaveFileUtil.KmQRList(stockDayYanPan,strPath,stockDayVo,stockDayVoList);

            }else {
                strPath.append("dapanxiaoyu-3/");
                strPath.append("KmQR/");
                stockDayVoList= NewSaveFileUtil.KmQRList(stockDayYanPan,strPath,stockDayVo,stockDayVoList);

            }
        }

      return stockDayVoList;
    }

    public static  List<StockDayVo> newCommonQTuXingList(DaPanRateOfChangeVo daPanRateOfChangeVo, StockDayYanPan stockDayYanPan,StockDayVo stockDayVo, List<StockDayVo> stockDayVoList) throws IOException {

        if (daPanRateOfChangeVo != null && daPanRateOfChangeVo.getBeforeDPChange3() != null) {
            StringBuffer strPath = new StringBuffer();
            strPath.append("D:/stock-day1/");
            if (daPanRateOfChangeVo.getBeforeDPChange3().compareTo(new BigDecimal(3)) > 0) {
                strPath.append("dapandayu3/");
                strPath.append("QTuXing/");
               stockDayVoList= NewSaveFileUtil.QTuXingList(stockDayYanPan,strPath,stockDayVo,stockDayVoList);

            }else if (daPanRateOfChangeVo.getBeforeDPChange3().compareTo(new BigDecimal(0)) > 0){
                strPath.append("dapandayu0/");
                strPath.append("QTuXing/");
                stockDayVoList= NewSaveFileUtil.QTuXingList(stockDayYanPan,strPath,stockDayVo,stockDayVoList);

            }else if (daPanRateOfChangeVo.getBeforeDPChange3().compareTo(new BigDecimal(-3)) > 0){
                strPath.append("dapanxiaoyu0/");
                strPath.append("QTuXing/");
                stockDayVoList= NewSaveFileUtil.QTuXingList(stockDayYanPan,strPath,stockDayVo,stockDayVoList);

            }else {
                strPath.append("dapanxiaoyu-3/");
                strPath.append("QTuXing/");
                stockDayVoList= NewSaveFileUtil.QTuXingList(stockDayYanPan,strPath,stockDayVo,stockDayVoList);

            }
        }

        return stockDayVoList;
    }

    public static List<StockDayVo> newCommonKTu20LSList(DaPanRateOfChangeVo daPanRateOfChangeVo, DangRiVo dangRiVo, StockDayYanPan stockDayYanPan,StockDayVo stockDayVo, List<StockDayVo> stockDayVoList) throws IOException {
        if (daPanRateOfChangeVo != null && daPanRateOfChangeVo.getBeforeDPChange3() != null) {
            StringBuffer strPath = new StringBuffer();
            strPath.append("G:/stock-day2/");
            if (daPanRateOfChangeVo.getBeforeDPChange3().compareTo(new BigDecimal(3)) > 0) {
                strPath.append("dapandayu3/");
                if (dangRiVo.getXianXing().equals(Constants.DAYANG)){
                    strPath.append("dayang/");
                    stockDayVoList= NewSaveFileUtil.KTu20LSList(stockDayYanPan,strPath,stockDayVo,stockDayVoList);
                }else if (dangRiVo.getXianXing().equals(Constants.ZHONGYANG)){
                    strPath.append("zhongyang/");
                    stockDayVoList= NewSaveFileUtil.KTu20LSList(stockDayYanPan,strPath,stockDayVo,stockDayVoList);
                }else if (dangRiVo.getXianXing().equals(Constants.XIAOYANG)){
                    strPath.append("xiaoyang/");
                    stockDayVoList= NewSaveFileUtil.KTu20LSList(stockDayYanPan,strPath,stockDayVo,stockDayVoList);
                }else if (dangRiVo.getXianXing().equals(Constants.XIAOYIN)){
                    strPath.append("xiaoyin/");
                    stockDayVoList= NewSaveFileUtil.KTu20LSList(stockDayYanPan,strPath,stockDayVo,stockDayVoList);
                }else if (dangRiVo.getXianXing().equals(Constants.ZHONGYIN)){
                    strPath.append("zhongyin/");
                    stockDayVoList= NewSaveFileUtil.KTu20LSList(stockDayYanPan,strPath,stockDayVo,stockDayVoList);
                }else if (dangRiVo.getXianXing().equals(Constants.DAYIN)){
                    strPath.append("dayin/");
                    stockDayVoList= NewSaveFileUtil.KTu20LSList(stockDayYanPan,strPath,stockDayVo,stockDayVoList);
                }
            }else if (daPanRateOfChangeVo.getBeforeDPChange3().compareTo(new BigDecimal(0)) > 0){
                strPath.append("dapandayu0/");
                if (dangRiVo.getXianXing().equals(Constants.DAYANG)){
                    strPath.append("dayang/");
                    stockDayVoList= NewSaveFileUtil.KTu20LSList(stockDayYanPan,strPath,stockDayVo,stockDayVoList);
                }else if (dangRiVo.getXianXing().equals(Constants.ZHONGYANG)){
                    strPath.append("zhongyang/");
                    stockDayVoList= NewSaveFileUtil.KTu20LSList(stockDayYanPan,strPath,stockDayVo,stockDayVoList);
                }else if (dangRiVo.getXianXing().equals(Constants.XIAOYANG)){
                    strPath.append("xiaoyang/");
                    stockDayVoList= NewSaveFileUtil.KTu20LSList(stockDayYanPan,strPath,stockDayVo,stockDayVoList);
                }else if (dangRiVo.getXianXing().equals(Constants.XIAOYIN)){
                    strPath.append("xiaoyin/");
                    stockDayVoList= NewSaveFileUtil.KTu20LSList(stockDayYanPan,strPath,stockDayVo,stockDayVoList);
                }else if (dangRiVo.getXianXing().equals(Constants.ZHONGYIN)){
                    strPath.append("zhongyin/");
                    stockDayVoList= NewSaveFileUtil.KTu20LSList(stockDayYanPan,strPath,stockDayVo,stockDayVoList);
                }else if (dangRiVo.getXianXing().equals(Constants.DAYIN)){
                    strPath.append("dayin/");
                    stockDayVoList= NewSaveFileUtil.KTu20LSList(stockDayYanPan,strPath,stockDayVo,stockDayVoList);
                }
            }else if (daPanRateOfChangeVo.getBeforeDPChange3().compareTo(new BigDecimal(-3)) > 0){
                strPath.append("dapanxiaoyu0/");
                if (dangRiVo.getXianXing().equals(Constants.DAYANG)){
                    strPath.append("dayang/");
                    stockDayVoList= NewSaveFileUtil.KTu20LSList(stockDayYanPan,strPath,stockDayVo,stockDayVoList);
                }else if (dangRiVo.getXianXing().equals(Constants.ZHONGYANG)){
                    strPath.append("zhongyang/");
                    stockDayVoList= NewSaveFileUtil.KTu20LSList(stockDayYanPan,strPath,stockDayVo,stockDayVoList);
                }else if (dangRiVo.getXianXing().equals(Constants.XIAOYANG)){
                    strPath.append("xiaoyang/");
                    stockDayVoList= NewSaveFileUtil.KTu20LSList(stockDayYanPan,strPath,stockDayVo,stockDayVoList);
                }else if (dangRiVo.getXianXing().equals(Constants.XIAOYIN)){
                    strPath.append("xiaoyin/");
                    stockDayVoList= NewSaveFileUtil.KTu20LSList(stockDayYanPan,strPath,stockDayVo,stockDayVoList);
                }else if (dangRiVo.getXianXing().equals(Constants.ZHONGYIN)){
                    strPath.append("zhongyin/");
                    stockDayVoList= NewSaveFileUtil.KTu20LSList(stockDayYanPan,strPath,stockDayVo,stockDayVoList);
                }else if (dangRiVo.getXianXing().equals(Constants.DAYIN)){
                    strPath.append("dayin/");
                    stockDayVoList= NewSaveFileUtil.KTu20LSList(stockDayYanPan,strPath,stockDayVo,stockDayVoList);
                }
            }else {
                strPath.append("dapanxiaoyu-3/");
                if (dangRiVo.getXianXing().equals(Constants.DAYANG)){
                    strPath.append("dayang/");
                    stockDayVoList= NewSaveFileUtil.KTu20LSList(stockDayYanPan,strPath,stockDayVo,stockDayVoList);
                }else if (dangRiVo.getXianXing().equals(Constants.ZHONGYANG)){
                    strPath.append("zhongyang/");
                    stockDayVoList= NewSaveFileUtil.KTu20LSList(stockDayYanPan,strPath,stockDayVo,stockDayVoList);
                }else if (dangRiVo.getXianXing().equals(Constants.XIAOYANG)){
                    strPath.append("xiaoyang/");
                    stockDayVoList= NewSaveFileUtil.KTu20LSList(stockDayYanPan,strPath,stockDayVo,stockDayVoList);
                }else if (dangRiVo.getXianXing().equals(Constants.XIAOYIN)){
                    strPath.append("xiaoyin/");
                    stockDayVoList= NewSaveFileUtil.KTu20LSList(stockDayYanPan,strPath,stockDayVo,stockDayVoList);
                }else if (dangRiVo.getXianXing().equals(Constants.ZHONGYIN)){
                    strPath.append("zhongyin/");
                    stockDayVoList= NewSaveFileUtil.KTu20LSList(stockDayYanPan,strPath,stockDayVo,stockDayVoList);
                }else if (dangRiVo.getXianXing().equals(Constants.DAYIN)){
                    strPath.append("dayin/");
                    stockDayVoList= NewSaveFileUtil.KTu20LSList(stockDayYanPan,strPath,stockDayVo,stockDayVoList);
                }
            }
        }
        return stockDayVoList;
    }

}
