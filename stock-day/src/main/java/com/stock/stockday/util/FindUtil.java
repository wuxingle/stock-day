package com.stock.stockday.util;

import com.stock.apicommon.entity.ScienceEntity;
import com.stock.stockday.entity.StockDayAll;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class FindUtil {

    public static boolean duoTuXiangShang(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        //均线聚拢,开始多天向上
        BigDecimal li10 = (scienceEntityList.get(0).getPriceMa10().subtract(scienceEntityList.get(0).getPriceMa5())).divide(scienceEntityList.get(0).getPriceMa5(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
        BigDecimal li20 = (scienceEntityList.get(0).getPriceMa20().subtract(scienceEntityList.get(0).getPriceMa5())).divide(scienceEntityList.get(0).getPriceMa5(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
        BigDecimal li30 = (scienceEntityList.get(0).getPriceMa30().subtract(scienceEntityList.get(0).getPriceMa5())).divide(scienceEntityList.get(0).getPriceMa5(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
        if (li10.compareTo(new BigDecimal(5)) < 0 && li20.compareTo(new BigDecimal(5)) < 0 && li30.compareTo(new BigDecimal(5)) < 0 && li10.compareTo(new BigDecimal(-5)) > 0 && li20.compareTo(new BigDecimal(-5)) > 0 && li30.compareTo(new BigDecimal(-5)) > 0) {
            if (scienceEntityList.get(0).getPriceMa5().compareTo(scienceEntityList.get(1).getPriceMa5()) > 0 && scienceEntityList.get(0).getPriceMa10().compareTo(scienceEntityList.get(1).getPriceMa10()) > 0) {
                //价格站上5天线
                if (stockDayAllList.get(0).getClosingPrice().compareTo(scienceEntityList.get(0).getPriceMa5()) > 0 && stockDayAllList.get(0).getClosingPrice().compareTo(scienceEntityList.get(0).getPriceMa10()) > 0&& stockDayAllList.get(0).getClosingPrice().compareTo(scienceEntityList.get(0).getPriceMa20()) >=0) {
                    //近10天有没有的涨幅
                    BigDecimal bian10= stockDayAllList.get(0).getClosingPrice().subtract(stockDayAllList.get(10).getClosingPrice()).divide(stockDayAllList.get(10).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                   //近5天有没有的涨幅
                    BigDecimal bian5= stockDayAllList.get(0).getClosingPrice().subtract(stockDayAllList.get(5).getClosingPrice()).divide(stockDayAllList.get(5).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                    if (bian10.compareTo(new BigDecimal(5))<0&&bian5.compareTo(new BigDecimal(3))<0){
                        //阳线
                        if (stockDayAllList.get(0).getClosingPrice().compareTo(stockDayAllList.get(0).getOpeningPrice())>0){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean shengV(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        //近5天大幅下降
        BigDecimal li5 = (stockDayAllList.get(0).getClosingPrice().subtract(stockDayAllList.get(5).getClosingPrice())).divide(stockDayAllList.get(5).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
        BigDecimal li10 = (stockDayAllList.get(0).getClosingPrice().subtract(stockDayAllList.get(10).getClosingPrice())).divide(stockDayAllList.get(10).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
        if (li5.compareTo(new BigDecimal(-14)) <= 0 || li10.compareTo(new BigDecimal(-20)) <= 0) {
            //昨天最低，今天出现一个阳线
            if (stockDayAllList.get(1).getClosingPrice().compareTo(stockDayAllList.get(2).getClosingPrice()) <= 0 && stockDayAllList.get(1).getClosingPrice().compareTo(stockDayAllList.get(3).getClosingPrice()) <= 0 && stockDayAllList.get(1).getClosingPrice().compareTo(stockDayAllList.get(4).getClosingPrice()) <= 0 && stockDayAllList.get(1).getClosingPrice().compareTo(stockDayAllList.get(5).getClosingPrice()) <= 0 && stockDayAllList.get(1).getClosingPrice().compareTo(stockDayAllList.get(6).getClosingPrice()) <= 0) {
                if (stockDayAllList.get(0).getClosingPrice().compareTo(stockDayAllList.get(0).getOpeningPrice()) > 0) {
                    return true;
                } else {
                    BigDecimal xiayin = (stockDayAllList.get(0).getClosingPrice().subtract(stockDayAllList.get(0).getFoot())).divide(stockDayAllList.get(0).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                    if (xiayin.compareTo(new BigDecimal(4)) >= 0) {
                        return true;
                    }
                }

            }
        }
        return false;
    }

    public static boolean reset20(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        //均线上
        BigDecimal ma30=scienceEntityList.get(0).getPriceMa30().subtract(scienceEntityList.get(1).getPriceMa30());
        BigDecimal ma20=scienceEntityList.get(0).getPriceMa20().subtract(scienceEntityList.get(1).getPriceMa20());
        if (ma30.compareTo(new BigDecimal(0))>=0&&ma20.compareTo(new BigDecimal(-0.03))>=0){
            //前几天在5天线上 近5天下降
            if (stockDayAllList.get(4).getTopside().compareTo(scienceEntityList.get(4).getPriceMa5())>=0||stockDayAllList.get(2).getTopside().compareTo(scienceEntityList.get(2).getPriceMa5())>=0) {
                if (stockDayAllList.get(0).getClosingPrice().compareTo(stockDayAllList.get(5).getClosingPrice()) < 0) {
                    //今天接近20天线最低或者收盘
                    BigDecimal lli20=stockDayAllList.get(0).getFoot().subtract(scienceEntityList.get(0).getPriceMa20()).divide(stockDayAllList.get(0).getClosingPrice(),4,RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                    BigDecimal cli20=stockDayAllList.get(0).getClosingPrice().subtract(scienceEntityList.get(0).getPriceMa20()).divide(stockDayAllList.get(0).getClosingPrice(),4,RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                    BigDecimal tli20=stockDayAllList.get(0).getTopside().subtract(scienceEntityList.get(0).getPriceMa20()).divide(stockDayAllList.get(0).getClosingPrice(),4,RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                    if ((lli20.compareTo(new BigDecimal(2.5))<0&&lli20.compareTo(new BigDecimal(-2.5))>0)||(cli20.compareTo(new BigDecimal(-4))>0&&cli20.compareTo(new BigDecimal(4))<0)||(tli20.compareTo(new BigDecimal(-2.5))>0&&tli20.compareTo(new BigDecimal(2.5))<0)){
                       //今天阳线
                        if (stockDayAllList.get(0).getClosingPrice().compareTo(stockDayAllList.get(0).getOpeningPrice()) > 0) {
                            return true;
                        } else {
                            BigDecimal xiayin = (stockDayAllList.get(0).getClosingPrice().subtract(stockDayAllList.get(0).getFoot())).divide(stockDayAllList.get(0).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            if (xiayin.compareTo(new BigDecimal(3)) >= 0) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

}
