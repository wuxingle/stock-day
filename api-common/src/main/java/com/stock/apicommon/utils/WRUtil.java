package com.stock.apicommon.utils;

import com.stock.apicommon.Constants;
import com.stock.apicommon.entity.ScienceEntity;
import com.stock.apicommon.entity.WREntity;
import com.stock.apicommon.vo.KDJScienceVo;
import com.stock.apicommon.vo.WRScienceVo;
import com.stock.apicommon.vo.WRVo;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WRUtil {
    public static WRVo getWR(List<WREntity> wrEntityList){
        if (wrEntityList==null||wrEntityList.size()!=42){
            return null;
        }
        WRVo wrVo=new WRVo();
        List<WREntity> wrEntityList12=new ArrayList<>();
        List<WREntity> wrEntityList21=new ArrayList<>();
        List<WREntity> wrEntityList28=new ArrayList<>();
        List<WREntity> wrEntityList42=new ArrayList<>();
        BigDecimal WMS12=new BigDecimal(0);
        BigDecimal WMS21=new BigDecimal(0);
        BigDecimal WMS28=new BigDecimal(0);
        BigDecimal WMS42=new BigDecimal(0);
        for (int i=0;i<wrEntityList.size();i++){
            wrEntityList12.add(wrEntityList.get(i));
            wrEntityList21.add(wrEntityList.get(i));
            wrEntityList28.add(wrEntityList.get(i));
            wrEntityList42.add(wrEntityList.get(i));
            if (wrEntityList12.size()==12){
                Collections.sort(wrEntityList12, new Comparator<WREntity>() {
                    @Override
                    public int compare(WREntity o1, WREntity o2) {
                        return o1.getFoot().compareTo(o2.getFoot());
                    }
                });
                BigDecimal L12=wrEntityList12.get(0).getFoot();
                Collections.sort(wrEntityList12, new Comparator<WREntity>() {
                    @Override
                    public int compare(WREntity o1, WREntity o2) {
                        return o2.getTopside().compareTo(o1.getTopside());
                    }
                });
                BigDecimal H12=wrEntityList12.get(0).getTopside();
                BigDecimal WMS_1=H12.subtract(wrEntityList.get(0).getClosingPrice());
                BigDecimal WMS_2=H12.subtract(L12);
                if (WMS_2.compareTo(new BigDecimal(0))==0){
                    WMS_2=WMS_2.add(new BigDecimal(0.01));
                }
                WMS12=(WMS_1.divide(WMS_2,4, RoundingMode.HALF_UP)).multiply(new BigDecimal(100));
            }
            if (wrEntityList21.size()==21){
                Collections.sort(wrEntityList21, new Comparator<WREntity>() {
                    @Override
                    public int compare(WREntity o1, WREntity o2) {
                        return o1.getFoot().compareTo(o2.getFoot());
                    }
                });
                BigDecimal L21=wrEntityList21.get(0).getFoot();
                Collections.sort(wrEntityList21, new Comparator<WREntity>() {
                    @Override
                    public int compare(WREntity o1, WREntity o2) {
                        return o2.getTopside().compareTo(o1.getTopside());
                    }
                });
                BigDecimal H21=wrEntityList21.get(0).getTopside();
                BigDecimal WMS_1=H21.subtract(wrEntityList.get(0).getClosingPrice());
                BigDecimal WMS_2=H21.subtract(L21);
                if (WMS_2.compareTo(new BigDecimal(0))==0){
                    WMS_2=WMS_2.add(new BigDecimal(0.01));
                }
                WMS21=(WMS_1.divide(WMS_2,4, RoundingMode.HALF_UP)).multiply(new BigDecimal(100));
            }
            if (wrEntityList28.size()==28){
                Collections.sort(wrEntityList28, new Comparator<WREntity>() {
                    @Override
                    public int compare(WREntity o1, WREntity o2) {
                        return o1.getFoot().compareTo(o2.getFoot());
                    }
                });
                BigDecimal L28=wrEntityList28.get(0).getFoot();
                Collections.sort(wrEntityList28, new Comparator<WREntity>() {
                    @Override
                    public int compare(WREntity o1, WREntity o2) {
                        return o2.getTopside().compareTo(o1.getTopside());
                    }
                });
                BigDecimal H28=wrEntityList28.get(0).getTopside();
                BigDecimal WMS_1=H28.subtract(wrEntityList.get(0).getClosingPrice());
                BigDecimal WMS_2=H28.subtract(L28);
                if (WMS_2.compareTo(new BigDecimal(0))==0){
                    WMS_2=WMS_2.add(new BigDecimal(0.01));
                }
                WMS28=(WMS_1.divide(WMS_2,4, RoundingMode.HALF_UP)).multiply(new BigDecimal(100));
            }
            if (wrEntityList42.size()==42){
                Collections.sort(wrEntityList42, new Comparator<WREntity>() {
                    @Override
                    public int compare(WREntity o1, WREntity o2) {
                        return o1.getFoot().compareTo(o2.getFoot());
                    }
                });
                BigDecimal L42=wrEntityList42.get(0).getFoot();
                Collections.sort(wrEntityList42, new Comparator<WREntity>() {
                    @Override
                    public int compare(WREntity o1, WREntity o2) {
                        return o2.getTopside().compareTo(o1.getTopside());
                    }
                });
                BigDecimal H42=wrEntityList42.get(0).getTopside();
                BigDecimal WMS_1=H42.subtract(wrEntityList.get(0).getClosingPrice());
                BigDecimal WMS_2=H42.subtract(L42);
                if (WMS_2.compareTo(new BigDecimal(0))==0){
                    WMS_2=WMS_2.add(new BigDecimal(0.01));
                }
                WMS42=(WMS_1.divide(WMS_2,4, RoundingMode.HALF_UP)).multiply(new BigDecimal(100));
            }
        }
        wrVo.setWR12(WMS12);
        wrVo.setWR21(WMS21);
        wrVo.setWR28(WMS28);
        wrVo.setWR42(WMS42);
        return wrVo;
    }

    //求平方根
    public static BigDecimal sqrt(BigDecimal value, int scale){
        BigDecimal num2 = BigDecimal.valueOf(2);
        int precision = 100;
        MathContext mc = new MathContext(precision, RoundingMode.HALF_UP);
        BigDecimal deviation = value;
        int cnt = 0;
        while (cnt < precision) {
            deviation = (deviation.add(value.divide(deviation, mc))).divide(num2, mc);
            cnt++;
        }
        deviation = deviation.setScale(scale, BigDecimal.ROUND_HALF_UP);
        return deviation;
    }
     //越接近最高值 值越接近0，下降的越块越接近100
     public static WRScienceVo getWRScience(List<ScienceEntity> scienceEntityList){
        if (scienceEntityList.get(1).getWr1()==null){
            return null;
        }
         WRScienceVo wrScienceVo=new WRScienceVo();
         if (scienceEntityList.get(1).getWr1().compareTo(new BigDecimal(20))<=0){
             if (scienceEntityList.get(0).getWr1().compareTo(scienceEntityList.get(1).getWr1())<0) {
                 //20一下向下
                 wrScienceVo.setXiangxia20(Constants.XIANGXIA20);
             }
             if (scienceEntityList.get(0).getWr1().compareTo(scienceEntityList.get(1).getWr1())>=0) {
                 //20一下向上
                 wrScienceVo.setXiangshang20(Constants.XIANGSHANG20);
             }
             if (scienceEntityList.get(0).getWr1().compareTo(scienceEntityList.get(0).getWr2())>=0&&scienceEntityList.get(1).getWr1().compareTo(scienceEntityList.get(1).getWr2())<0) {
                 //20一下金叉
                 wrScienceVo.setJincha20(Constants.JINCHA20);
             }
             if (scienceEntityList.get(0).getWr1().compareTo(scienceEntityList.get(0).getWr2())<=0&&scienceEntityList.get(1).getWr1().compareTo(scienceEntityList.get(1).getWr2())>0) {
                 //20一下死叉
                 wrScienceVo.setSicha20(Constants.SICHA20);
             }
         }else if (scienceEntityList.get(1).getWr1().compareTo(new BigDecimal(80))>=0){
             if (scienceEntityList.get(0).getWr1().compareTo(scienceEntityList.get(1).getWr1())<0) {
                 //80一下向下
                 wrScienceVo.setXiangxia80(Constants.XIANGXIA80);
             }
             if (scienceEntityList.get(0).getWr1().compareTo(scienceEntityList.get(1).getWr1())>=0) {
                 //80一下向上
                 wrScienceVo.setXiangshang80(Constants.XIANGSHANG80);
             }
             if (scienceEntityList.get(0).getWr1().compareTo(scienceEntityList.get(0).getWr2())>=0&&scienceEntityList.get(1).getWr1().compareTo(scienceEntityList.get(1).getWr2())<0) {
                 //80一下金叉
                 wrScienceVo.setJincha80(Constants.JINCHA80);
             }
             if (scienceEntityList.get(0).getWr1().compareTo(scienceEntityList.get(0).getWr2())<=0&&scienceEntityList.get(1).getWr1().compareTo(scienceEntityList.get(1).getWr2())>0) {
                 //80一下死叉
                 wrScienceVo.setSicha80(Constants.SICHA80);
             }
         }else {
             if (scienceEntityList.get(0).getWr1().compareTo(scienceEntityList.get(1).getWr1())<0) {
                 //向下
                 wrScienceVo.setXiangxia(Constants.XIANGXIA);
             }
             if (scienceEntityList.get(0).getWr1().compareTo(scienceEntityList.get(1).getWr1())>=0) {
                 //向上
                 wrScienceVo.setXiangshang(Constants.XIANGSHANG);
             }
             if (scienceEntityList.get(0).getWr1().compareTo(scienceEntityList.get(0).getWr2())>=0&&scienceEntityList.get(1).getWr1().compareTo(scienceEntityList.get(1).getWr2())<0) {
                 //金叉
                 wrScienceVo.setJincha(Constants.JINCHA);
             }
             if (scienceEntityList.get(0).getWr1().compareTo(scienceEntityList.get(0).getWr2())<=0&&scienceEntityList.get(1).getWr1().compareTo(scienceEntityList.get(1).getWr2())>0) {
                 //死叉
                 wrScienceVo.setSicha(Constants.SICHA);
             }
         }


         return wrScienceVo;
     }


}
