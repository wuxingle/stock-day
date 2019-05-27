package com.stock.apicommon.utils.patterning;

import com.stock.apicommon.Constants;
import com.stock.apicommon.entity.SunEntity;
import com.stock.apicommon.entity.WuYunEntity;
import com.stock.apicommon.vo.SunVo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

/**
 * 太阳系
 */
public class SunUtil {
    public static SunVo getSun(List<SunEntity> sunEntityList) {
        if (sunEntityList == null || sunEntityList.size() == 0) {
            return null;
        }
        SunVo sunVo = new SunVo();
        List<SunEntity> sunEntityListqkwl = new ArrayList<>();
        List<SunEntity> sunEntityListlgty = new ArrayList<>();
        List<SunEntity> sunEntityListsgty = new ArrayList<>();
        List<SunEntity> sunEntityListsssly = new ArrayList<>();
        List<SunEntity> sunEntityListhsb = new ArrayList<>();
        List<SunEntity> sunEntityListjdst = new ArrayList<>();
        List<SunEntity> sunEntityListjdst1 = new ArrayList<>();
        List<SunEntity> sunEntityListmuzi = new ArrayList<>();
        for (int i = 0; i < sunEntityList.size(); i++) {
            if (i < 2) {
                sunEntityListqkwl.add(sunEntityList.get(i));
                sunEntityListmuzi.add(sunEntityList.get(i));
            }
            if (i < 3) {
                sunEntityListlgty.add(sunEntityList.get(i));
            }
            if (i < 4) {
                sunEntityListsgty.add(sunEntityList.get(i));
                sunEntityListsssly.add(sunEntityList.get(i));
                sunEntityListhsb.add(sunEntityList.get(i));
            }
            if (i<7){
                sunEntityListjdst1.add(sunEntityList.get(i));
            }
            sunEntityListjdst.add(sunEntityList.get(i));

        }
        //清空万里-乌云盖顶
        if (sunEntityListqkwl.get(1).getRateOfChange().compareTo(new BigDecimal(-1)) <0 &&sunEntityListqkwl.get(1).getOpeningPrice().compareTo(sunEntityListqkwl.get(1).getClosingPrice())>0) {//阴线
            if (sunEntityListqkwl.get(0).getOpeningPrice().compareTo(sunEntityListqkwl.get(1).getClosingPrice()) < 0) {//低开
                if (sunEntityListqkwl.get(0).getClosingPrice().compareTo(sunEntityListqkwl.get(0).getOpeningPrice()) > 0) {//阳线
                    if (sunEntityListqkwl.get(0).getClosingPrice().compareTo(sunEntityListqkwl.get(1).getClosingPrice()) > 0) {//高于前天收盘
                        if (sunEntityListqkwl.get(0).getClosingPrice().compareTo(sunEntityListqkwl.get(1).getOpeningPrice()) < 0) {//在实体之内
                            sunVo.setQingKongWanLi(Constants.QKWL);
                        } else {//穿过实体//光头穿云-穿头
                            sunVo.setGuangTouChuanYun(Constants.GTCY);
                        }
                    } else {//低于前天收盘价//曙光初现-坛友
                        sunVo.setShuGuangChuXian(Constants.SGCX);
                    }
                }
            } else {//阳光普照-倾盆
                if (sunEntityListqkwl.get(0).getClosingPrice().compareTo(sunEntityListqkwl.get(0).getOpeningPrice()) > 0) {//阳线
                    if (sunEntityListqkwl.get(0).getRateOfChange().compareTo(new BigDecimal(2)) > 0) {//上涨2以上
                        sunVo.setYangGuangPuZhao(Constants.YGPZ);
                    }
                }
            }
        }
        //并排红
        if (sunEntityListqkwl.get(1).getOpeningPrice().compareTo(sunEntityListqkwl.get(1).getClosingPrice())<0){//阳线
            if (sunEntityListqkwl.get(1).getOpeningPrice().compareTo(sunEntityListqkwl.get(1).getClosingPrice())<0){
                BigDecimal opbi=(sunEntityListqkwl.get(1).getOpeningPrice().subtract(sunEntityListqkwl.get(0).getOpeningPrice())).divide(sunEntityListqkwl.get(1).getClosingPrice(),4,RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                if (opbi.compareTo(new BigDecimal(0.4))<0&&opbi.compareTo(new BigDecimal(-0.4))>0){
                    BigDecimal cobi=(sunEntityListqkwl.get(1).getClosingPrice().subtract(sunEntityListqkwl.get(0).getClosingPrice())).divide(sunEntityListqkwl.get(1).getClosingPrice(),4,RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                    if (cobi.compareTo(new BigDecimal(0.4))<0&&cobi.compareTo(new BigDecimal(-0.4))>0){
                        sunVo.setBinPaiHong(Constants.BINPAIHONG);
                    }
                }
            }
        }

        //两个太阳-双飞乌鸦
        if (sunEntityListlgty.get(2).getRateOfChange().compareTo(new BigDecimal(-1)) < 0 && sunEntityListlgty.get(2).getOpeningPrice().compareTo(sunEntityListlgty.get(2).getClosingPrice())>0) {//阴线
            if (sunEntityListlgty.get(1).getOpeningPrice().compareTo(sunEntityListlgty.get(2).getClosingPrice()) <0) {//低开
                if (sunEntityListlgty.get(1).getClosingPrice().compareTo(sunEntityListlgty.get(1).getOpeningPrice()) > 0) {//阳线
                    if (sunEntityListlgty.get(0).getClosingPrice().compareTo(sunEntityListlgty.get(0).getOpeningPrice()) > 0 && sunEntityListlgty.get(0).getRateOfChange().compareTo(new BigDecimal(0)) > 0) {//阳线
                        if (sunEntityListlgty.get(0).getClosingPrice().compareTo(sunEntityListlgty.get(1).getClosingPrice())>0) {
                            sunVo.setLiangGeTaiYang(Constants.LGTY);
                        }
                    }else {
                        if (sunEntityListlgty.get(0).getRateOfChange().compareTo(new BigDecimal(0))<=0&&sunEntityListlgty.get(0).getClosingPrice().compareTo(sunEntityListlgty.get(1).getOpeningPrice())<=0){//阴线
                            sunVo.setLiangYinJiaYang(Constants.LYinJY);
                        }
                    }
                }
            }else {
                if (sunEntityListlgty.get(1).getRateOfChange().compareTo(new BigDecimal(0))>=0){//阳线
                    if (sunEntityListlgty.get(0).getRateOfChange().compareTo(new BigDecimal(0))<=0&&sunEntityListlgty.get(0).getClosingPrice().compareTo(sunEntityListlgty.get(1).getOpeningPrice())<=0){//阴线
                        sunVo.setLiangYinJiaYang(Constants.LYinJY);
                    }
                }
            }
        }
        //并排红
        if (sunEntityListlgty.get(2).getOpeningPrice().compareTo(sunEntityListlgty.get(2).getClosingPrice())<=0) {//阳线
            if (sunEntityListlgty.get(1).getOpeningPrice().compareTo(sunEntityListlgty.get(1).getClosingPrice())<= 0) {//阳线
                if (sunEntityListlgty.get(1).getOpeningPrice().compareTo(sunEntityListlgty.get(1).getClosingPrice()) <=0) {//阳线
                    BigDecimal opbi1 = (sunEntityListlgty.get(2).getOpeningPrice().subtract(sunEntityListlgty.get(0).getOpeningPrice())).divide(sunEntityListlgty.get(0).getClosingPrice(),4,RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                    if (opbi1.compareTo(new BigDecimal(0.4)) < 0 && opbi1.compareTo(new BigDecimal(-0.4)) >= 0) {
                        BigDecimal opbi = (sunEntityListlgty.get(1).getOpeningPrice().subtract(sunEntityListlgty.get(0).getOpeningPrice())).divide(sunEntityListlgty.get(0).getClosingPrice(),4,RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                        if (opbi.compareTo(new BigDecimal(0.4)) < 0 && opbi.compareTo(new BigDecimal(-0.4)) > 0) {
                            BigDecimal cobi1 = (sunEntityListlgty.get(2).getClosingPrice().subtract(sunEntityListlgty.get(0).getClosingPrice())).divide(sunEntityListlgty.get(0).getClosingPrice(),4,RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            if (cobi1.compareTo(new BigDecimal(0.4)) < 0 && cobi1.compareTo(new BigDecimal(-0.4)) > 0) {
                                BigDecimal cobi = (sunEntityListlgty.get(1).getClosingPrice().subtract(sunEntityListlgty.get(0).getClosingPrice())).divide(sunEntityListlgty.get(0).getClosingPrice(),4,RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                                if (cobi.compareTo(new BigDecimal(0.4)) < 0 && cobi.compareTo(new BigDecimal(-0.4)) > 0) {
                                    sunVo.setBinPaiHong(Constants.BINPAIHONG);
                                }
                            }
                        }
                    }
                }
            }
        }
        //三个太阳-三飞乌鸦
        if (sunEntityListsgty.get(3).getRateOfChange().compareTo(new BigDecimal(-1)) < 0 && sunEntityListsgty.get(3).getOpeningPrice().compareTo(sunEntityListsgty.get(3).getClosingPrice())>0) {//阴线
            if (sunEntityListsgty.get(2).getOpeningPrice().compareTo(sunEntityListsgty.get(3).getClosingPrice()) < 0) {//低开
                if (sunEntityListsgty.get(2).getClosingPrice().compareTo(sunEntityListsgty.get(2).getOpeningPrice()) > 0) {//阳线
                    if (getShiTiSize(sunEntityListsgty.get(2)).compareTo(new BigDecimal(2)) > 0) {//实体大小
                        if (sunEntityListsgty.get(1).getOpeningPrice().compareTo(sunEntityListsgty.get(2).getClosingPrice()) < 0) {//低开
                            if (sunEntityListsgty.get(1).getClosingPrice().compareTo(sunEntityListsgty.get(1).getOpeningPrice()) > 0) {//阳线
                                    if (sunEntityListsgty.get(0).getOpeningPrice().compareTo(sunEntityListsgty.get(1).getClosingPrice()) < 0) {//低开
                                        if (sunEntityListsgty.get(0).getClosingPrice().compareTo(sunEntityListsgty.get(0).getOpeningPrice()) >0) {//阳线
                                            if (sunEntityListsgty.get(0).getClosingPrice().compareTo(sunEntityListsgty.get(3).getClosingPrice()) > 0&&sunEntityListsgty.get(0).getClosingPrice().compareTo(sunEntityListsgty.get(1).getClosingPrice())>0) {
                                                sunVo.setSanGeTaiYang(Constants.SGTY);
                                            }
                                        }
                                    }
                            }
                        }
                    } else { //红三冰
                        if (sunEntityListsgty.get(1).getClosingPrice().compareTo(sunEntityListsgty.get(1).getOpeningPrice()) >= 0&&sunEntityListsgty.get(1).getRateOfChange().compareTo(new BigDecimal(0))>=0) {//阳线
                            if (sunEntityListsgty.get(0).getClosingPrice().compareTo(sunEntityListsgty.get(0).getOpeningPrice()) >= 0&&sunEntityListsgty.get(0).getRateOfChange().compareTo(new BigDecimal(0))>=0) {//阳线
                               if (sunEntityListsgty.get(0).getClosingPrice().compareTo(sunEntityListsgty.get(3).getClosingPrice())>=0){
                                   sunVo.setHongSanBing(Constants.HONGSB);
                               }
                            }else {
                                if (sunEntityListsgty.get(0).getRateOfChange().compareTo(new BigDecimal(0))<=0&&sunEntityListsgty.get(0).getClosingPrice().compareTo(sunEntityListsgty.get(2).getOpeningPrice())<0){//阴线
                                    sunVo.setLiangYinJiaYang(Constants.LYinJY);
                                }
                            }
                        }
                    }
                }
            } else { //上升三烈阳-下跌三连阴
                if (sunEntityListsgty.get(2).getClosingPrice().compareTo(sunEntityListsgty.get(2).getOpeningPrice())>=0) {//阳线
                    if (sunEntityListsgty.get(1).getClosingPrice().compareTo(sunEntityListsgty.get(1).getOpeningPrice()) >= 0 && sunEntityListsgty.get(1).getRateOfChange().compareTo(new BigDecimal(0)) >= 0) {//阳线
                        if (sunEntityListsgty.get(0).getClosingPrice().compareTo(sunEntityListsgty.get(0).getOpeningPrice()) >= 0 && sunEntityListsgty.get(0).getRateOfChange().compareTo(new BigDecimal(0)) >= 0) {//阳线
                            if (sunEntityListsgty.get(0).getClosingPrice().compareTo(sunEntityListsgty.get(3).getOpeningPrice()) >= 0) {
                                sunVo.setShangShenSanLieYang(Constants.SSSLY);
                            }
                        }else {
                            if (sunEntityListsgty.get(0).getRateOfChange().compareTo(new BigDecimal(0))<=0&&sunEntityListsgty.get(0).getClosingPrice().compareTo(sunEntityListsgty.get(2).getOpeningPrice())<=0){//阴线
                                sunVo.setLiangYinJiaYang(Constants.LYinJY);
                            }
                        }
                    }
                }
            }
        }

        //九鼎升天
        int count=0;
        for (int i=0;i<sunEntityListjdst.size();i++){
            if (i!=0){
                BigDecimal changSize= sunEntityListjdst.get(i).getClosingPrice().subtract(sunEntityListjdst.get(0).getClosingPrice());
                BigDecimal changRate=changSize.divide(sunEntityListjdst.get(0).getClosingPrice(),4,RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                if (changRate.compareTo(new BigDecimal(-1.2))>0&&changRate.compareTo(new BigDecimal(1.2))<0){
                    count++;
                }
            }
        }
        int count1=0;
        for (int i=0;i<sunEntityListjdst1.size();i++){
            if (i!=0){
                BigDecimal changSize= sunEntityListjdst1.get(i).getClosingPrice().subtract(sunEntityListjdst1.get(0).getClosingPrice());
                BigDecimal changRate=changSize.divide(sunEntityListjdst1.get(0).getClosingPrice(),4,RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                if (changRate.compareTo(new BigDecimal(-1.2))>0&&changRate.compareTo(new BigDecimal(1.2))<0){
                    count1++;
                }
            }
        }
        if (count>8||count1>5){
            sunVo.setJiuDingShengTian(Constants.JDST);
        }
//        /**
//         * 子母
//         */
//        if (sunEntityListmuzi.get(1).getOpeningPrice().compareTo(sunEntityListmuzi.get(1).getClosingPrice())>=0){//阴线
//           if (sunEntityListmuzi.get(0).getOpeningPrice().compareTo(sunEntityListmuzi.get(1).getClosingPrice())>=0&&sunEntityListmuzi.get(0).getOpeningPrice().compareTo(sunEntityListmuzi.get(1).getOpeningPrice())<=0){//高开
//              if (sunEntityListmuzi.get(0).getClosingPrice().compareTo(sunEntityListmuzi.get(1).getOpeningPrice())<=0){
//                  sunVo.setMuzi(Constants.MUZI);//阴柚子
//              }
//           }else if (sunEntityListmuzi.get(0).getOpeningPrice().compareTo(sunEntityListmuzi.get(1).getClosingPrice())<=0&&sunEntityListmuzi.get(0).getOpeningPrice().compareTo(sunEntityListmuzi.get(1).getOpeningPrice())<=0){//
//               if (sunEntityListmuzi.get(0).getClosingPrice().compareTo(sunEntityListmuzi.get(1).getOpeningPrice())>=0){
//                   sunVo.setMuzi(Constants.MUZI);//阴桌子
//               }
//           }
//        }else if (sunEntityListmuzi.get(1).getOpeningPrice().compareTo(sunEntityListmuzi.get(1).getClosingPrice())<=0){//阳线
//            if (sunEntityListmuzi.get(0).getOpeningPrice().compareTo(sunEntityListmuzi.get(1).getClosingPrice())<=0&&sunEntityListmuzi.get(0).getOpeningPrice().compareTo(sunEntityListmuzi.get(1).getOpeningPrice())>=0){//低开
//                if (sunEntityListmuzi.get(0).getClosingPrice().compareTo(sunEntityListmuzi.get(1).getOpeningPrice())>=0){
//                    sunVo.setMuzi(Constants.MUZI);//阳柚子
//                }
//            }else if (sunEntityListmuzi.get(0).getOpeningPrice().compareTo(sunEntityListmuzi.get(1).getClosingPrice())>=0&&sunEntityListmuzi.get(0).getOpeningPrice().compareTo(sunEntityListmuzi.get(1).getOpeningPrice())>=0){//
//                if (sunEntityListmuzi.get(0).getClosingPrice().compareTo(sunEntityListmuzi.get(1).getOpeningPrice())<=0){
//                    sunVo.setMuzi(Constants.MUZI);//阳桌子
//                }
//            }
//        }
        return sunVo;
    }

    //计算实体大小
    public static BigDecimal getShiTiSize(SunEntity sunEntity) {
        BigDecimal changSize = sunEntity.getClosingPrice().subtract(sunEntity.getOpeningPrice());
        BigDecimal changRate = changSize.divide(sunEntity.getLclosePrice(), 2, RoundingMode.HALF_UP);
        return changRate;
    }


}
