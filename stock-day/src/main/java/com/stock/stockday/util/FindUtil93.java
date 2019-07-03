package com.stock.stockday.util;


import com.stock.apicommon.entity.ScienceEntity;
import com.stock.stockday.entity.StockDayAll;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class FindUtil93 {

    public static boolean duoTuXiangShangDapan2( List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (tuxing(stockDayAllList)){
                if (jdk80shangxia(scienceEntityListDaPan)){
                    return true;
                }
            }
           return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean shengVDapan2( List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (tuxing(stockDayAllList)){
                if (jdk80shangsc(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean reset20Dapan2( List<StockDayAll> stockDayAllList,List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (tuxing(stockDayAllList)){
                if (jdk80shangjc(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan3( List<StockDayAll> stockDayAllList,List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (tuxing(stockDayAllList)){
                if (jdk70shangxia(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jishujieqiDapan3( List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (tuxing(stockDayAllList)){
                if (jdk70shangsc(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan10( List<StockDayAll> stockDayAllList,List<ScienceEntity> scienceEntityListDaPan) {

        try {
            if (tuxing(stockDayAllList)){
                if (jdk70shangjc(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jishujieqiDapan4( List<StockDayAll> stockDayAllList,List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (tuxing(stockDayAllList)){
                if (jdk60shangxia(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan4( List<StockDayAll> stockDayAllList,List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (tuxing(stockDayAllList)){
                if (jdk60shangsc(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean duoTuXiangShangDapan3( List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (tuxing(stockDayAllList)){
                if (jdk40shangxia(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean shengVDapan3( List<StockDayAll> stockDayAllList,List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (tuxing(stockDayAllList)){
                if (jdk40shangsc(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean reset20Dapan3( List<StockDayAll> stockDayAllList,List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (tuxing(stockDayAllList)){
                if (jdk20shangxia(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan5( List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (tuxing(stockDayAllList)){
                if (jdk20shangsc(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jishujieqiDapan5( List<StockDayAll> stockDayAllList,List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (tuxing(stockDayAllList)){
                if (jdk20xiaxia(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jishujieqiDapan6( List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (tuxing(stockDayAllList)){
                if (jdk20xiasc(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jishujieqiDapan7( List<StockDayAll> stockDayAllList,List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (tuxing(stockDayAllList)){
                if (jdk20xiajc(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean duoTuXiangShangDapan4(List<StockDayAll> stockDayAllListDaPan1,List<ScienceEntity> scienceEntityList) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try {
            if (dptuxing(stockDayAllListDaPan1)){
                if (jdk80shangxia(scienceEntityList)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean shengVDapan4(List<StockDayAll> stockDayAllListDaPan1,List<ScienceEntity> scienceEntityList) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try {
            if (dptuxing(stockDayAllListDaPan1)){
                if (jdk80shangsc(scienceEntityList)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean reset20Dapan4(List<StockDayAll> stockDayAllListDaPan1,List<ScienceEntity> scienceEntityList) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try {
            if (dptuxing(stockDayAllListDaPan1)){
                if (jdk80shangjc(scienceEntityList)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan6(List<StockDayAll> stockDayAllListDaPan1,List<ScienceEntity> scienceEntityList) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try {
            if (dptuxing(stockDayAllListDaPan1)){
                if (jdk70shangxia(scienceEntityList)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jishujieqiDapan8(List<StockDayAll> stockDayAllListDaPan1,List<ScienceEntity> scienceEntityList) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try {
            if (dptuxing(stockDayAllListDaPan1)){
                if (jdk70shangsc(scienceEntityList)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jishujieqiDapan9(List<StockDayAll> stockDayAllListDaPan1,List<ScienceEntity> scienceEntityList) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try {
            if (dptuxing(stockDayAllListDaPan1)){
                if (jdk70shangjc(scienceEntityList)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan7(List<StockDayAll> stockDayAllListDaPan1,List<ScienceEntity> scienceEntityList) {
        try {
            if (dptuxing(stockDayAllListDaPan1)){
                if (jdk60shangxia(scienceEntityList)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan8(List<StockDayAll> stockDayAllListDaPan1,List<ScienceEntity> scienceEntityList) {
        try {
            if (dptuxing(stockDayAllListDaPan1)){
                if (jdk60shangsc(scienceEntityList)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan9(List<StockDayAll> stockDayAllListDaPan1,List<ScienceEntity> scienceEntityList) {
        try {
            if (dptuxing(stockDayAllListDaPan1)){
                if (jdk40shangxia(scienceEntityList)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan11(List<StockDayAll> stockDayAllListDaPan1,List<ScienceEntity> scienceEntityList) {
        try {
            if (dptuxing(stockDayAllListDaPan1)){
                if (jdk40shangsc(scienceEntityList)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan12(List<StockDayAll> stockDayAllListDaPan1,List<ScienceEntity> scienceEntityList) {

        try {
            if (dptuxing(stockDayAllListDaPan1)){
                if (jdk20shangxia(scienceEntityList)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan13(List<StockDayAll> stockDayAllListDaPan1,List<ScienceEntity> scienceEntityList) {
        try {
            if (dptuxing(stockDayAllListDaPan1)){
                if (jdk20shangsc(scienceEntityList)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan14(List<StockDayAll> stockDayAllListDaPan1,List<ScienceEntity> scienceEntityList) {
        try {
            if (dptuxing(stockDayAllListDaPan1)){
                if (jdk20xiaxia(scienceEntityList)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan15(List<StockDayAll> stockDayAllListDaPan1,List<ScienceEntity> scienceEntityList) {
        try {
            if (dptuxing(stockDayAllListDaPan1)){
                if (jdk20xiasc(scienceEntityList)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan16(List<StockDayAll> stockDayAllListDaPan1,List<ScienceEntity> scienceEntityList) {
        try {
            if (dptuxing(stockDayAllListDaPan1)){
                if (jdk20xiajc(scienceEntityList)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }


    public static boolean tuxing(List<StockDayAll> stockDayAllList) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        try {
            if (stockDayAllList.get(1).getRateOfChange().compareTo(new BigDecimal(0))<0||stockDayAllList.get(2).getRateOfChange().compareTo(new BigDecimal(0))<0||stockDayAllList.get(3).getRateOfChange().compareTo(new BigDecimal(0))<0){
                if (stockDayAllList.get(0).getClosingPrice().compareTo(stockDayAllList.get(0).getOpeningPrice())>0){
                    return true;
                }else {
                    BigDecimal yinxia=(stockDayAllList.get(0).getClosingPrice().subtract(stockDayAllList.get(0).getFoot())).divide(stockDayAllList.get(0).getClosingPrice(),4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                    BigDecimal yinshang=(stockDayAllList.get(0).getTopside().subtract(stockDayAllList.get(0).getOpeningPrice())).divide(stockDayAllList.get(0).getClosingPrice(),4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                    if (stockDayAllList.get(0).getRateOfChange().compareTo(new BigDecimal(-2))<0){
                        if (yinxia.compareTo(new BigDecimal(4))>=0){
                            return true;
                        }
                        if (yinshang.compareTo(new BigDecimal(4))>=0){
                            return true;
                        }
                    }else if (stockDayAllList.get(0).getRateOfChange().compareTo(new BigDecimal(-1))<0){
                        if (yinxia.compareTo(new BigDecimal(3))>=0){
                            return true;
                        }
                        if (yinshang.compareTo(new BigDecimal(3))>=0){
                            return true;
                        }
                    }else if (stockDayAllList.get(0).getRateOfChange().compareTo(new BigDecimal(0))<0){
                        if (yinxia.compareTo(new BigDecimal(1.5))>=0){
                            return true;
                        }
                        if (yinshang.compareTo(new BigDecimal(1.5))>=0){
                            return true;
                        }
                    }else {
                        if (yinxia.compareTo(new BigDecimal(1))>=0){
                            return true;
                        }
                        if (yinshang.compareTo(new BigDecimal(1))>=0){
                            return true;
                        }
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean dptuxing(List<StockDayAll> stockDayAllList) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        try {
            if (stockDayAllList.get(1).getRateOfChange().compareTo(new BigDecimal(0))<0||stockDayAllList.get(2).getRateOfChange().compareTo(new BigDecimal(0))<0||stockDayAllList.get(3).getRateOfChange().compareTo(new BigDecimal(0))<0){
                if (stockDayAllList.get(0).getClosingPrice().compareTo(stockDayAllList.get(0).getOpeningPrice())>0){
                    return true;
                }else {
                    BigDecimal yinxia=(stockDayAllList.get(0).getClosingPrice().subtract(stockDayAllList.get(0).getFoot())).divide(stockDayAllList.get(0).getClosingPrice(),4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                    BigDecimal yinshang=(stockDayAllList.get(0).getTopside().subtract(stockDayAllList.get(0).getOpeningPrice())).divide(stockDayAllList.get(0).getClosingPrice(),4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                    if (stockDayAllList.get(0).getRateOfChange().compareTo(new BigDecimal(-2))<0){
                        if (yinxia.compareTo(new BigDecimal(4))>=0){
                            return true;
                        }
                        if (yinshang.compareTo(new BigDecimal(4))>=0){
                            return true;
                        }
                    }else if (stockDayAllList.get(0).getRateOfChange().compareTo(new BigDecimal(-1))<0){
                        if (yinxia.compareTo(new BigDecimal(2))>=0){
                            return true;
                        }
                        if (yinshang.compareTo(new BigDecimal(2))>=0){
                            return true;
                        }
                    }else if (stockDayAllList.get(0).getRateOfChange().compareTo(new BigDecimal(0))<0){
                        if (yinxia.compareTo(new BigDecimal(1.5))>=0){
                            return true;
                        }
                        if (yinshang.compareTo(new BigDecimal(1.5))>=0){
                            return true;
                        }
                    }else {
                        if (yinxia.compareTo(new BigDecimal(1))>=0){
                            return true;
                        }
                        if (yinshang.compareTo(new BigDecimal(1))>=0){
                            return true;
                        }
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jdk80shangxia(List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
           if (scienceEntityListDaPan.get(0).getK().compareTo(new BigDecimal(80))>=0){
               if (scienceEntityListDaPan.get(1).getJ().compareTo(scienceEntityListDaPan.get(1).getK())>0){
                   if (scienceEntityListDaPan.get(0).getJ().compareTo(scienceEntityListDaPan.get(0).getK())>=0) {
                       if (scienceEntityListDaPan.get(0).getJ().compareTo(scienceEntityListDaPan.get(1).getJ()) < 0) {
                         return true;
                       }
                   }
               }
           }
        } catch (Exception e) {
            return false;
        }
        return false;
    }
    public static boolean jdk80shangsc(List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (scienceEntityListDaPan.get(0).getK().compareTo(new BigDecimal(80))>=0){
                if (scienceEntityListDaPan.get(1).getJ().compareTo(scienceEntityListDaPan.get(1).getK())>0){
                    if (scienceEntityListDaPan.get(0).getJ().compareTo(scienceEntityListDaPan.get(0).getK())<=0) {
                        if (scienceEntityListDaPan.get(0).getJ().compareTo(scienceEntityListDaPan.get(1).getJ()) <= 0) {
                            return true;
                        }
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }
    public static boolean jdk80shangjc(List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (scienceEntityListDaPan.get(0).getK().compareTo(new BigDecimal(80))>=0){
                if (scienceEntityListDaPan.get(1).getJ().compareTo(scienceEntityListDaPan.get(1).getK())<0){
                    if (scienceEntityListDaPan.get(0).getJ().compareTo(scienceEntityListDaPan.get(0).getK())>=0) {
                        if (scienceEntityListDaPan.get(0).getJ().compareTo(scienceEntityListDaPan.get(1).getJ()) >= 0) {
                            return true;
                        }
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jdk70shangxia(List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (scienceEntityListDaPan.get(0).getK().compareTo(new BigDecimal(80))<0&&scienceEntityListDaPan.get(0).getK().compareTo(new BigDecimal(70))>=0){
                if (scienceEntityListDaPan.get(1).getJ().compareTo(scienceEntityListDaPan.get(1).getK())>0){
                    if (scienceEntityListDaPan.get(0).getJ().compareTo(scienceEntityListDaPan.get(0).getK())>=0) {
                        if (scienceEntityListDaPan.get(0).getJ().compareTo(scienceEntityListDaPan.get(1).getJ()) < 0) {
                            return true;
                        }
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }
    public static boolean jdk70shangsc(List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (scienceEntityListDaPan.get(0).getK().compareTo(new BigDecimal(80))<0&&scienceEntityListDaPan.get(0).getK().compareTo(new BigDecimal(70))>=0){
                if (scienceEntityListDaPan.get(1).getJ().compareTo(scienceEntityListDaPan.get(1).getK())>0){
                    if (scienceEntityListDaPan.get(0).getJ().compareTo(scienceEntityListDaPan.get(0).getK())<=0) {
                        if (scienceEntityListDaPan.get(0).getJ().compareTo(scienceEntityListDaPan.get(1).getJ()) <= 0) {
                            return true;
                        }
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }
    public static boolean jdk70shangjc(List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (scienceEntityListDaPan.get(0).getK().compareTo(new BigDecimal(80))<0&&scienceEntityListDaPan.get(0).getK().compareTo(new BigDecimal(70))>=0){
                if (scienceEntityListDaPan.get(1).getJ().compareTo(scienceEntityListDaPan.get(1).getK())<0){
                    if (scienceEntityListDaPan.get(0).getJ().compareTo(scienceEntityListDaPan.get(0).getK())>=0) {
                        if (scienceEntityListDaPan.get(0).getJ().compareTo(scienceEntityListDaPan.get(1).getJ()) >= 0) {
                            return true;
                        }
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jdk60shangxia(List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (scienceEntityListDaPan.get(0).getK().compareTo(new BigDecimal(70))<0&&scienceEntityListDaPan.get(0).getK().compareTo(new BigDecimal(60))>=0){
                if (scienceEntityListDaPan.get(1).getJ().compareTo(scienceEntityListDaPan.get(1).getK())>0){
                    if (scienceEntityListDaPan.get(0).getJ().compareTo(scienceEntityListDaPan.get(0).getK())>=0) {
                        if (scienceEntityListDaPan.get(0).getJ().compareTo(scienceEntityListDaPan.get(1).getJ()) < 0) {
                            return true;
                        }
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }
    public static boolean jdk60shangsc(List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (scienceEntityListDaPan.get(0).getK().compareTo(new BigDecimal(70))<0&&scienceEntityListDaPan.get(0).getK().compareTo(new BigDecimal(60))>=0){
                if (scienceEntityListDaPan.get(1).getJ().compareTo(scienceEntityListDaPan.get(1).getK())>0){
                    if (scienceEntityListDaPan.get(0).getJ().compareTo(scienceEntityListDaPan.get(0).getK())<=0) {
                        if (scienceEntityListDaPan.get(0).getJ().compareTo(scienceEntityListDaPan.get(1).getJ()) < 0) {
                            return true;
                        }
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jdk40shangxia(List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (scienceEntityListDaPan.get(0).getK().compareTo(new BigDecimal(60))<0&&scienceEntityListDaPan.get(0).getK().compareTo(new BigDecimal(40))>=0){
                if (scienceEntityListDaPan.get(1).getJ().compareTo(scienceEntityListDaPan.get(1).getK())>0){
                    if (scienceEntityListDaPan.get(0).getJ().compareTo(scienceEntityListDaPan.get(0).getK())>=0) {
                        if (scienceEntityListDaPan.get(0).getJ().compareTo(scienceEntityListDaPan.get(1).getJ()) < 0) {
                            return true;
                        }
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }
    public static boolean jdk40shangsc(List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (scienceEntityListDaPan.get(0).getK().compareTo(new BigDecimal(60))<0&&scienceEntityListDaPan.get(0).getK().compareTo(new BigDecimal(40))>=0){
                if (scienceEntityListDaPan.get(1).getJ().compareTo(scienceEntityListDaPan.get(1).getK())>0){
                    if (scienceEntityListDaPan.get(0).getJ().compareTo(scienceEntityListDaPan.get(0).getK())<=0) {
                        if (scienceEntityListDaPan.get(0).getJ().compareTo(scienceEntityListDaPan.get(1).getJ()) < 0) {
                            return true;
                        }
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jdk20shangxia(List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (scienceEntityListDaPan.get(0).getK().compareTo(new BigDecimal(40))<0&&scienceEntityListDaPan.get(0).getK().compareTo(new BigDecimal(20))>=0){
                if (scienceEntityListDaPan.get(1).getJ().compareTo(scienceEntityListDaPan.get(1).getK())>0){
                    if (scienceEntityListDaPan.get(0).getJ().compareTo(scienceEntityListDaPan.get(0).getK())>=0) {
                        if (scienceEntityListDaPan.get(0).getJ().compareTo(scienceEntityListDaPan.get(1).getJ()) < 0) {
                            return true;
                        }
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }
    public static boolean jdk20shangsc(List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (scienceEntityListDaPan.get(0).getK().compareTo(new BigDecimal(40))<0&&scienceEntityListDaPan.get(0).getK().compareTo(new BigDecimal(20))>=0){
                if (scienceEntityListDaPan.get(1).getJ().compareTo(scienceEntityListDaPan.get(1).getK())>0){
                    if (scienceEntityListDaPan.get(0).getJ().compareTo(scienceEntityListDaPan.get(0).getK())<=0) {
                        if (scienceEntityListDaPan.get(0).getJ().compareTo(scienceEntityListDaPan.get(1).getJ()) < 0) {
                            return true;
                        }
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jdk20xiaxia(List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (scienceEntityListDaPan.get(0).getK().compareTo(new BigDecimal(20))<0){
                if (scienceEntityListDaPan.get(1).getJ().compareTo(scienceEntityListDaPan.get(1).getK())>0){
                    if (scienceEntityListDaPan.get(0).getJ().compareTo(scienceEntityListDaPan.get(0).getK())>=0) {
                        if (scienceEntityListDaPan.get(0).getJ().compareTo(scienceEntityListDaPan.get(1).getJ()) < 0) {
                            return true;
                        }
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }
    public static boolean jdk20xiasc(List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (scienceEntityListDaPan.get(0).getK().compareTo(new BigDecimal(20))<0){
                if (scienceEntityListDaPan.get(1).getJ().compareTo(scienceEntityListDaPan.get(1).getK())>0){
                    if (scienceEntityListDaPan.get(0).getJ().compareTo(scienceEntityListDaPan.get(0).getK())<=0) {
                        if (scienceEntityListDaPan.get(0).getJ().compareTo(scienceEntityListDaPan.get(1).getJ()) < 0) {
                            return true;
                        }
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }
    public static boolean jdk20xiajc(List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (scienceEntityListDaPan.get(0).getK().compareTo(new BigDecimal(20))<0){
                if (scienceEntityListDaPan.get(1).getJ().compareTo(scienceEntityListDaPan.get(1).getK())<0){
                    if (scienceEntityListDaPan.get(0).getJ().compareTo(scienceEntityListDaPan.get(0).getK())>=0) {
                        if (scienceEntityListDaPan.get(0).getJ().compareTo(scienceEntityListDaPan.get(1).getJ()) >0) {
                            return true;
                        }
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

}
