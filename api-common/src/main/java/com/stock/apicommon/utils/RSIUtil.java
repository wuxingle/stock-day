package com.stock.apicommon.utils;

import com.stock.apicommon.Constants;
import com.stock.apicommon.entity.RSIEntity;
import com.stock.apicommon.entity.ScienceEntity;
import com.stock.apicommon.vo.KDJScienceVo;
import com.stock.apicommon.vo.RSIScienceVo;
import com.stock.apicommon.vo.RSIVo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class RSIUtil {
    public static RSIVo getRSI(List<RSIEntity> rsiEntityList){
        if (rsiEntityList==null||rsiEntityList.size()!=24){
            return null;
        }
        RSIVo rsiVo=new RSIVo();
        BigDecimal sum=new BigDecimal(0);
        BigDecimal drop=new BigDecimal(0);
        BigDecimal up6=null;
        BigDecimal fall6=null;
        BigDecimal up12=null;
        BigDecimal fall12=null;
        BigDecimal up24=null;
        BigDecimal fall24=null;
        BigDecimal RSI6=new BigDecimal(0);
        BigDecimal RSI12=new BigDecimal(0);
        BigDecimal RSI24=new BigDecimal(0);
        for (int i=0;i<rsiEntityList.size();i++) {
            if (rsiEntityList.get(i).getChangePoints().compareTo(new BigDecimal(0))>0){
                sum=sum.add(rsiEntityList.get(i).getChangePoints());
            }else {
                drop=drop.add(rsiEntityList.get(i).getChangePoints().multiply(new BigDecimal(-1)));
            }
            if (i==5){
                BigDecimal RS=null;
                //上升
                up6=sum.divide(new BigDecimal(6),4, RoundingMode.HALF_UP);
                //下降
                fall6=drop.divide(new BigDecimal(6),4,RoundingMode.HALF_UP);
                if (fall6.compareTo(new BigDecimal(0))==0){
                  fall6=new BigDecimal(0.001);
                }
                RS = up6.divide(fall6, 4, RoundingMode.HALF_UP);
                RS=RS.add(new BigDecimal(1));
                BigDecimal RSI_1=new BigDecimal(100).divide(RS,3,RoundingMode.HALF_UP);
                RSI6=new BigDecimal(100).subtract(RSI_1);
            }
            if (i==11){
                BigDecimal RS=null;
                up12=sum.divide(new BigDecimal(12),3, RoundingMode.HALF_UP);
                fall12=drop.divide(new BigDecimal(12),3,RoundingMode.HALF_UP);
                if (fall12.compareTo(new BigDecimal(0))==0){
                   fall12=new BigDecimal(0.001);
                }
                RS = up12.divide(fall12, 3, RoundingMode.HALF_UP);
                //rs+1
                RS=RS.add(new BigDecimal(1));
                //100/rs
                BigDecimal RSI_1=new BigDecimal(100).divide(RS,3,RoundingMode.HALF_UP);
                RSI12=new BigDecimal(100).subtract(RSI_1);
            }

            if (i==23){
                BigDecimal RS=null;
                up24=sum.divide(new BigDecimal(24),3, RoundingMode.HALF_UP);
                fall24=drop.divide(new BigDecimal(24),3,RoundingMode.HALF_UP);
                if (fall24.compareTo(new BigDecimal(0))==0){
                    fall24=new BigDecimal(0.001);
                }
                RS = up24.divide(fall24, 3, RoundingMode.HALF_UP);
                RS=RS.add(new BigDecimal(1));
                BigDecimal RSI_1=new BigDecimal(100).divide(RS,3,RoundingMode.HALF_UP);
                RSI24=new BigDecimal(100).subtract(RSI_1);
            }
        }
        rsiVo.setRSI6(RSI6);
        rsiVo.setRSI12(RSI12);
        rsiVo.setRSI24(RSI24);
        return rsiVo;
    }
    public static RSIScienceVo getRSIScience(List<ScienceEntity> scienceEntityList){
        if (scienceEntityList.get(1).getRsi1()==null){
            return null;
        }
        RSIScienceVo rsiScienceVo=new RSIScienceVo();
        if (scienceEntityList.get(1).getRsi2().compareTo(new BigDecimal(30))<=0){
            if (scienceEntityList.get(0).getRsi2().compareTo(scienceEntityList.get(1).getRsi2())<0) {
                //30一下向下
                rsiScienceVo.setXiangxia30(Constants.XIANGXIA30);
            }
            if (scienceEntityList.get(0).getRsi2().compareTo(scienceEntityList.get(1).getRsi2())>=0) {
                //30一下向上
                rsiScienceVo.setXiangshang30(Constants.XIANGSHANG30);
            }
            if (scienceEntityList.get(0).getRsi1().compareTo(scienceEntityList.get(0).getRsi2())>=0&&scienceEntityList.get(0).getRsi1().compareTo(scienceEntityList.get(0).getRsi3())>=0&&scienceEntityList.get(1).getRsi1().compareTo(scienceEntityList.get(1).getRsi3())<0&&scienceEntityList.get(1).getRsi1().compareTo(scienceEntityList.get(1).getRsi2())<0) {
                //30一下金叉
                rsiScienceVo.setJincha30(Constants.JINCHA30);
            }
            if (scienceEntityList.get(0).getRsi1().compareTo(scienceEntityList.get(0).getRsi2())<=0&&scienceEntityList.get(0).getRsi1().compareTo(scienceEntityList.get(0).getRsi3())<=0&&scienceEntityList.get(1).getRsi1().compareTo(scienceEntityList.get(1).getRsi3())>0&&scienceEntityList.get(1).getRsi1().compareTo(scienceEntityList.get(1).getRsi2())>0) {
                //30一下死叉
                rsiScienceVo.setSicha30(Constants.SICHA30);
            }
        }else if (scienceEntityList.get(1).getRsi2().compareTo(new BigDecimal(70))>=0){
            if (scienceEntityList.get(0).getRsi2().compareTo(scienceEntityList.get(1).getRsi2())<0) {
                //70一下向下
                rsiScienceVo.setXiangxia70(Constants.XIANGXIA70);
            }
            if (scienceEntityList.get(0).getRsi2().compareTo(scienceEntityList.get(1).getRsi2())>=0) {
                //80一下向上
                rsiScienceVo.setXiangshang70(Constants.XIANGSHANG70);
            }
            if (scienceEntityList.get(0).getRsi1().compareTo(scienceEntityList.get(0).getRsi2())>=0&&scienceEntityList.get(0).getRsi1().compareTo(scienceEntityList.get(0).getRsi3())>=0&&scienceEntityList.get(1).getRsi1().compareTo(scienceEntityList.get(1).getRsi3())<0&&scienceEntityList.get(1).getRsi1().compareTo(scienceEntityList.get(1).getRsi2())<0) {
                //70一下金叉
                rsiScienceVo.setJincha70(Constants.JINCHA70);
            }
            if (scienceEntityList.get(0).getRsi1().compareTo(scienceEntityList.get(0).getRsi2())<=0&&scienceEntityList.get(0).getRsi1().compareTo(scienceEntityList.get(0).getRsi3())<=0&&scienceEntityList.get(1).getRsi1().compareTo(scienceEntityList.get(1).getRsi3())>0&&scienceEntityList.get(1).getRsi1().compareTo(scienceEntityList.get(1).getRsi2())>0) {
                //70一下死叉
                rsiScienceVo.setSicha70(Constants.SICHA70);
            }
        }else {
            if (scienceEntityList.get(0).getRsi2().compareTo(scienceEntityList.get(1).getRsi2())<0) {
                //向下
                rsiScienceVo.setXiangxia(Constants.XIANGXIA);
            }
            if (scienceEntityList.get(0).getRsi2().compareTo(scienceEntityList.get(1).getRsi2())>=0) {
                //向上
                rsiScienceVo.setXiangshang(Constants.XIANGSHANG);
            }
            if (scienceEntityList.get(0).getRsi1().compareTo(scienceEntityList.get(0).getRsi2())>=0&&scienceEntityList.get(0).getRsi1().compareTo(scienceEntityList.get(0).getRsi3())>=0&&scienceEntityList.get(1).getRsi1().compareTo(scienceEntityList.get(1).getRsi3())<0&&scienceEntityList.get(1).getRsi1().compareTo(scienceEntityList.get(1).getRsi2())<0) {
                //金叉
                rsiScienceVo.setJincha(Constants.JINCHA);
            }
            if (scienceEntityList.get(0).getRsi1().compareTo(scienceEntityList.get(0).getRsi2())<=0&&scienceEntityList.get(0).getRsi1().compareTo(scienceEntityList.get(0).getRsi3())<=0&&scienceEntityList.get(1).getRsi1().compareTo(scienceEntityList.get(1).getRsi3())>0&&scienceEntityList.get(1).getRsi1().compareTo(scienceEntityList.get(1).getRsi2())>0) {
                //死叉
                rsiScienceVo.setSicha(Constants.SICHA);
            }
        }

        return rsiScienceVo;
    }
}
