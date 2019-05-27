package com.stock.apicommon.utils;

import com.stock.apicommon.Constants;
import com.stock.apicommon.entity.ScienceEntity;
import com.stock.apicommon.entity.MacdEntity;
import com.stock.apicommon.vo.MACDScienceVo;
import com.stock.apicommon.vo.MacdVo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class MACDUtil {

    public static MacdVo getMacd(List<MacdEntity> macdEntityList) {
        if (macdEntityList.size() != 26 || macdEntityList==null) {
            return null;
        }
        MacdVo macdVo = new MacdVo();
        BigDecimal EMA12 = new BigDecimal(0);
        BigDecimal EMA26 = new BigDecimal(0);
        BigDecimal DIF = new BigDecimal(0);
        BigDecimal DEA = new BigDecimal(0);
        BigDecimal MACD = new BigDecimal(0);
        BigDecimal sum = new BigDecimal(0);
        for (int i = 0; i < macdEntityList.size(); i++) {
            sum=sum.add(macdEntityList.get(i).getClosingPrice());
            if (i == 11) {
                EMA12 = sum.divide(new BigDecimal(12), 2, RoundingMode.HALF_UP);
            }
            if (i == 25) {
                EMA26 = sum.divide(new BigDecimal(26), 2, RoundingMode.HALF_UP);
                DIF = EMA12.subtract(EMA26);
                DEA = DIF;
                MACD = DIF.subtract(DEA).multiply(new BigDecimal(2));
            }
            macdVo.setEMA12(EMA12);
            macdVo.setEMA26(EMA26);
            macdVo.setDEA(DEA);
            macdVo.setDIF(DIF);
            macdVo.setMACD(MACD);
        }

        return macdVo;
    }

    public static MacdVo getMacd1(MacdEntity macdEntity) {
        if (macdEntity == null) {
            return null;
        }
        MacdVo macdVo = new MacdVo();
        BigDecimal EMA12 = null;
        BigDecimal EMA26 = null;
        BigDecimal DIF = null;
        BigDecimal DEA = null;
        BigDecimal MACD = null;

        BigDecimal EMA12_1=(macdEntity.getBeforeEma12().multiply(new BigDecimal(11))).divide(new BigDecimal(13), 2, RoundingMode.HALF_UP);
        BigDecimal EMA12_2=(macdEntity.getClosingPrice().multiply(new BigDecimal(2))).divide(new BigDecimal(13), 2, RoundingMode.HALF_UP);
        EMA12 = EMA12_1.add(EMA12_2);

        BigDecimal EMA26_1=(macdEntity.getBeforeEma26().multiply(new BigDecimal(25))).divide(new BigDecimal(27), 2, RoundingMode.HALF_UP);
        BigDecimal EMA26_2=(macdEntity.getClosingPrice().multiply(new BigDecimal(2))).divide(new BigDecimal(27), 2, RoundingMode.HALF_UP);
        EMA26 = EMA26_1.add(EMA26_2);

        DIF = EMA12.subtract(EMA26);

        BigDecimal DEA_1=(macdEntity.getBeforeDea().multiply(new BigDecimal(8))).divide(new BigDecimal(10),2,RoundingMode.HALF_UP);
        BigDecimal DEA_2=(DIF.multiply(new BigDecimal(2))).divide(new BigDecimal(10),2,RoundingMode.HALF_UP);
        DEA = DEA_1.add(DEA_2);

        MACD =(DIF.subtract(DEA)).multiply(new BigDecimal(2));
        macdVo.setEMA12(EMA12);
        macdVo.setEMA26(EMA26);
        macdVo.setDEA(DEA);
        macdVo.setDIF(DIF);
        macdVo.setMACD(MACD);
        return macdVo;
    }
    public static MACDScienceVo getMACDScience(List<ScienceEntity> scienceEntityList){
        if (scienceEntityList.get(0).getMacd()==null||scienceEntityList.get(1).getMacd()==null){
            return null;
        }
        MACDScienceVo macdScienceVo=new MACDScienceVo();
        if (scienceEntityList.get(0).getDiff().compareTo(new BigDecimal(0))<=0&& scienceEntityList.get(1).getDiff().compareTo(new BigDecimal(0))>0) {
            //下穿0轴
            macdScienceVo.setXiachuan0zhou(Constants.XIACHUANG0ZHOU);
        }
        if (scienceEntityList.get(0).getDiff().compareTo(new BigDecimal(0))>=0&& scienceEntityList.get(1).getDiff().compareTo(new BigDecimal(0))<0) {
            //上窜0轴
            macdScienceVo.setShangchuan0zhou(Constants.SHNAGCHUAN0ZHOU);
        }
        if (scienceEntityList.get(0).getDiff().compareTo(new BigDecimal(0))<0&& scienceEntityList.get(0).getDea().compareTo(new BigDecimal(0))<0) {//0下
           if (scienceEntityList.get(0).getDiff().compareTo(scienceEntityList.get(0).getDea())>=0&& scienceEntityList.get(1).getDiff().compareTo(scienceEntityList.get(1).getDea())<0) {//金叉
               //0轴一下金叉
               macdScienceVo.setZhouxiajincha(Constants.ZHOUXIAJINCHA);
           }
           if (scienceEntityList.get(0).getDiff().compareTo(scienceEntityList.get(0).getDea())<=0&& scienceEntityList.get(1).getDiff().compareTo(scienceEntityList.get(1).getDea())>0) {//死叉
                //0轴一下死叉
                macdScienceVo.setZhouxiasicha(Constants.ZHOUXIASICHA);
           }
            if (scienceEntityList.get(0).getDiff().compareTo(scienceEntityList.get(1).getDiff())>0&& scienceEntityList.get(0).getDea().compareTo(scienceEntityList.get(1).getDea())>0) {//向上
                //0轴一下向上
                macdScienceVo.setZhouxiaxiangshang(Constants.ZHOUXIAXIANGSHANG);
            }
            if (scienceEntityList.get(0).getDiff().compareTo(scienceEntityList.get(1).getDiff())<0&& scienceEntityList.get(0).getDea().compareTo(scienceEntityList.get(1).getDea())<0) {//向下
                //0轴一下向下
                macdScienceVo.setZhouxiaxiangxia(Constants.ZHOUXIAXIANGXIA);
            }

        }
        if (scienceEntityList.get(0).getDiff().compareTo(new BigDecimal(0))>0&& scienceEntityList.get(0).getDea().compareTo(new BigDecimal(0))>0) {//0上
            if (scienceEntityList.get(0).getDiff().compareTo(scienceEntityList.get(0).getDea())>=0&& scienceEntityList.get(1).getDiff().compareTo(scienceEntityList.get(1).getDea())<0) {//金叉
                //0轴以上金叉
                macdScienceVo.setZhoushangjincha(Constants.ZHOUSHANGJINCHA);
            }
            if (scienceEntityList.get(0).getDiff().compareTo(scienceEntityList.get(0).getDea())<=0&& scienceEntityList.get(1).getDiff().compareTo(scienceEntityList.get(1).getDea())>0) {//死叉
                //0轴以上死叉
                macdScienceVo.setZhoushangsicha(Constants.ZHOUSHANGSICHA);
            }
            if (scienceEntityList.get(0).getDiff().compareTo(scienceEntityList.get(1).getDiff())>0&& scienceEntityList.get(0).getDea().compareTo(scienceEntityList.get(1).getDea())>0) {//向上
                //0轴以上向上
                macdScienceVo.setZhoushnagxiangshang(Constants.ZHOUSHANGXIANGSHANG);
            }
            if (scienceEntityList.get(0).getDiff().compareTo(scienceEntityList.get(1).getDiff())<0&& scienceEntityList.get(0).getDea().compareTo(scienceEntityList.get(1).getDea())<0) {//向下
                //0轴以上向下
                macdScienceVo.setZhoushangxiangxia(Constants.ZHOUSHANGXIANGXIA);
            }

        }
        if (scienceEntityList.get(1).getDiff().compareTo(new BigDecimal(0.02))<0|| scienceEntityList.get(1).getDiff().compareTo(new BigDecimal(-0.02))>0){//0附近
            if (scienceEntityList.get(1).getDea().compareTo(new BigDecimal(0.02))<0|| scienceEntityList.get(1).getDea().compareTo(new BigDecimal(-0.02))>0){//0附近
                if (scienceEntityList.get(0).getDiff().compareTo(scienceEntityList.get(0).getDea())>=0&& scienceEntityList.get(1).getDiff().compareTo(scienceEntityList.get(1).getDea())<0) {//金叉
                    //0轴附近金叉
                    macdScienceVo.setZhoufujinjincha(Constants.ZHOUFUJINJINCHA);
                }
            }
        }

        return macdScienceVo;
    }

    public static MACDScienceVo getMACDScience1(List<ScienceEntity> scienceEntityList){
        if (scienceEntityList.get(0).getMacd()==null||scienceEntityList.get(1).getMacd()==null){
            return null;
        }
        MACDScienceVo macdScienceVo=new MACDScienceVo();
        if (scienceEntityList.get(0).getDiff().compareTo(new BigDecimal(0))<=0&& scienceEntityList.get(1).getDiff().compareTo(new BigDecimal(0))>0) {
            //下穿0轴
            macdScienceVo.setXiachuan0zhou(Constants.XIACHUANG0ZHOU);
        }
        if (scienceEntityList.get(0).getDiff().compareTo(new BigDecimal(0))>=0&& scienceEntityList.get(1).getDiff().compareTo(new BigDecimal(0))<0) {
            //上窜0轴
            macdScienceVo.setShangchuan0zhou(Constants.SHNAGCHUAN0ZHOU);
        }
        if (scienceEntityList.get(0).getDiff().compareTo(new BigDecimal(0))<0&& scienceEntityList.get(0).getDea().compareTo(new BigDecimal(0))<0) {//0下
            if (scienceEntityList.get(0).getDiff().compareTo(scienceEntityList.get(0).getDea())>=0&& scienceEntityList.get(1).getDiff().compareTo(scienceEntityList.get(1).getDea())<0) {//金叉
                //0轴一下金叉
                macdScienceVo.setZhouxiajincha(Constants.ZHOUXIAJINCHA);
            }
            if (scienceEntityList.get(0).getDiff().compareTo(scienceEntityList.get(0).getDea())<=0&& scienceEntityList.get(1).getDiff().compareTo(scienceEntityList.get(1).getDea())>0) {//死叉
                //0轴一下死叉
                macdScienceVo.setZhouxiasicha(Constants.ZHOUXIASICHA);
            }
            if (scienceEntityList.get(0).getDiff().compareTo(scienceEntityList.get(1).getDiff())>0&& scienceEntityList.get(0).getDea().compareTo(scienceEntityList.get(1).getDea())>0) {//向上
                //0轴一下向上
                macdScienceVo.setZhouxiaxiangshang(Constants.ZHOUXIAXIANGSHANG);
            }
            if (scienceEntityList.get(0).getDiff().compareTo(scienceEntityList.get(1).getDiff())<0&& scienceEntityList.get(0).getDea().compareTo(scienceEntityList.get(1).getDea())<0) {//向下
                //0轴一下向下
                macdScienceVo.setZhouxiaxiangxia(Constants.ZHOUXIAXIANGXIA);
            }

        }
        if (scienceEntityList.get(0).getDiff().compareTo(new BigDecimal(0))>0&& scienceEntityList.get(0).getDea().compareTo(new BigDecimal(0))>0) {//0上
            if (scienceEntityList.get(0).getDiff().compareTo(scienceEntityList.get(0).getDea())>=0&& scienceEntityList.get(1).getDiff().compareTo(scienceEntityList.get(1).getDea())<0) {//金叉
                //0轴以上金叉
                macdScienceVo.setZhoushangjincha(Constants.ZHOUSHANGJINCHA);
            }
            if (scienceEntityList.get(0).getDiff().compareTo(scienceEntityList.get(0).getDea())<=0&& scienceEntityList.get(1).getDiff().compareTo(scienceEntityList.get(1).getDea())>0) {//死叉
                //0轴以上死叉
                macdScienceVo.setZhoushangsicha(Constants.ZHOUSHANGSICHA);
            }
            if (scienceEntityList.get(0).getDiff().compareTo(scienceEntityList.get(1).getDiff())>0&& scienceEntityList.get(0).getDea().compareTo(scienceEntityList.get(1).getDea())>0) {//向上
                //0轴以上向上
                macdScienceVo.setZhoushnagxiangshang(Constants.ZHOUSHANGXIANGSHANG);
            }
            if (scienceEntityList.get(0).getDiff().compareTo(scienceEntityList.get(1).getDiff())<0&& scienceEntityList.get(0).getDea().compareTo(scienceEntityList.get(1).getDea())<0) {//向下
                //0轴以上向下
                macdScienceVo.setZhoushangxiangxia(Constants.ZHOUSHANGXIANGXIA);
            }

        }
        if (scienceEntityList.get(1).getDiff().compareTo(new BigDecimal(0.02))<0|| scienceEntityList.get(1).getDiff().compareTo(new BigDecimal(-0.02))>0){//0附近
            if (scienceEntityList.get(1).getDea().compareTo(new BigDecimal(0.02))<0|| scienceEntityList.get(1).getDea().compareTo(new BigDecimal(-0.02))>0){//0附近
                if (scienceEntityList.get(0).getDiff().compareTo(scienceEntityList.get(0).getDea())>=0&& scienceEntityList.get(1).getDiff().compareTo(scienceEntityList.get(1).getDea())<0) {//金叉
                    //0轴附近金叉
                    macdScienceVo.setZhoufujinjincha(Constants.ZHOUFUJINJINCHA);
                }
            }
        }

        return macdScienceVo;
    }


}
