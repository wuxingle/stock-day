package com.stock.stockday.util;


import com.stock.apicommon.entity.ScienceEntity;
import java.math.BigDecimal;
import java.util.List;

public class FindUtil43 {

    public static boolean duoTuXiangShangDapan2(List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try{
        boolean result=macd0xiaxia(scienceEntityListDaPan);
        if (result){
            boolean result1=macd0xiaxia(scienceEntityList);
            if (result1){
                return true;
            }
        }

        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean shengVDapan2(List<ScienceEntity> scienceEntityList,List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try{
            boolean result=macd0xiaxia(scienceEntityListDaPan);
            if (result){
                boolean result1=macd0xiashang(scienceEntityList);
                if (result1){
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean reset20Dapan2(List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try{
            boolean result=macd0xiaxia(scienceEntityListDaPan);
            if (result){
                boolean result1=macd0zxia(scienceEntityList);
                if (result1){
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jieQiDapan3(List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {

        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try{
            boolean result=macd0xiaxia(scienceEntityListDaPan);
            if (result){
                boolean result1=macd0zshang(scienceEntityList);
                if (result1){
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jishujieqiDapan3(List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try{
            boolean result=macd0xiaxia(scienceEntityListDaPan);
            if (result){
                boolean result1=macd0shangxia(scienceEntityList);
                if (result1){
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jishujieqiDapan4(List<ScienceEntity> scienceEntityList,  List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try{
            boolean result=macd0xiaxia(scienceEntityListDaPan);
            if (result){
                boolean result1=macd0shangshang(scienceEntityList);
                if (result1){
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jieQiDapan4(List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try{
            boolean result=macd0xiashang(scienceEntityListDaPan);
            if (result){
                boolean result1=macd0xiaxia(scienceEntityList);
                if (result1){
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean duoTuXiangShangDapan3(List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try{
            boolean result=macd0xiashang(scienceEntityListDaPan);
            if (result){
                boolean result1=macd0xiashang(scienceEntityList);
                if (result1){
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean shengVDapan3(List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try{
            boolean result=macd0xiashang(scienceEntityListDaPan);
            if (result){
                boolean result1=macd0zxia(scienceEntityList);
                if (result1){
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean reset20Dapan3(List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try{
            boolean result=macd0xiashang(scienceEntityListDaPan);
            if (result){
                boolean result1=macd0zshang(scienceEntityList);
                if (result1){
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jieQiDapan5(List<ScienceEntity> scienceEntityList,  List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try{
            boolean result=macd0xiashang(scienceEntityListDaPan);
            if (result){
                boolean result1=macd0shangxia(scienceEntityList);
                if (result1){
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jishujieqiDapan5(List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try{
            boolean result=macd0xiashang(scienceEntityListDaPan);
            if (result){
                boolean result1=macd0shangshang(scienceEntityList);
                if (result1){
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jishujieqiDapan6(List<ScienceEntity> scienceEntityList,  List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try{
            boolean result=macd0zxia(scienceEntityListDaPan);
            if (result){
                boolean result1=macd0xiaxia(scienceEntityList);
                if (result1){
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jishujieqiDapan7(List<ScienceEntity> scienceEntityList,  List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try{
            boolean result=macd0zxia(scienceEntityListDaPan);
            if (result){
                boolean result1=macd0xiashang(scienceEntityList);
                if (result1){
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean duoTuXiangShangDapan4(List<ScienceEntity> scienceEntityList,List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try{
            boolean result=macd0zxia(scienceEntityListDaPan);
            if (result){
                boolean result1=macd0zxia(scienceEntityList);
                if (result1){
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean shengVDapan4(List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try{
            boolean result=macd0zxia(scienceEntityListDaPan);
            if (result){
                boolean result1=macd0zshang(scienceEntityList);
                if (result1){
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean reset20Dapan4(List<ScienceEntity> scienceEntityList,  List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try{
            boolean result=macd0zxia(scienceEntityListDaPan);
            if (result){
                boolean result1=macd0shangxia(scienceEntityList);
                if (result1){
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jieQiDapan6(List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try{
            boolean result=macd0zxia(scienceEntityListDaPan);
            if (result){
                boolean result1=macd0shangshang(scienceEntityList);
                if (result1){
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jishujieqiDapan8(List<ScienceEntity> scienceEntityList,  List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try{
            boolean result=macd0zshang(scienceEntityListDaPan);
            if (result){
                boolean result1=macd0xiaxia(scienceEntityList);
                if (result1){
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jishujieqiDapan9( List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try{
            boolean result=macd0zshang(scienceEntityListDaPan);
            if (result){
                boolean result1=macd0xiashang(scienceEntityList);
                if (result1){
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jieQiDapan7(List<ScienceEntity> scienceEntityList,  List<ScienceEntity> scienceEntityListDaPan) {
        try{
            boolean result=macd0zshang(scienceEntityListDaPan);
            if (result){
                boolean result1=macd0zxia(scienceEntityList);
                if (result1){
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jieQiDapan8(List<ScienceEntity> scienceEntityList,  List<ScienceEntity> scienceEntityListDaPan) {

        try{
            boolean result=macd0zshang(scienceEntityListDaPan);
            if (result){
                boolean result1=macd0zshang(scienceEntityList);
                if (result1){
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jieQiDapan9(List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        try{
            boolean result=macd0zshang(scienceEntityListDaPan);
            if (result){
                boolean result1=macd0shangxia(scienceEntityList);
                if (result1){
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jieQiDapan10(List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {

        try{
            boolean result=macd0zshang(scienceEntityListDaPan);
            if (result){
                boolean result1=macd0shangshang(scienceEntityList);
                if (result1){
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jieQiDapan11(List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {

        try{
            boolean result=macd0shangxia(scienceEntityListDaPan);
            if (result){
                boolean result1=macd0xiaxia(scienceEntityList);
                if (result1){
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jieQiDapan12(List<ScienceEntity> scienceEntityList,  List<ScienceEntity> scienceEntityListDaPan) {
        try{
            boolean result=macd0shangxia(scienceEntityListDaPan);
            if (result){
                boolean result1=macd0xiashang(scienceEntityList);
                if (result1){
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean macd0xiaxia(List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        if (scienceEntityListDaPan.get(1).getMacd()==null||scienceEntityListDaPan.get(0).getMacd()==null||scienceEntityListDaPan.get(0).getDea()==null||scienceEntityListDaPan.get(0).getDiff()==null) {
            return false;
        }
        if (scienceEntityListDaPan.get(0).getDiff().compareTo(new BigDecimal(0))<0&&scienceEntityListDaPan.get(0).getDea().compareTo(new BigDecimal(0))<0){
            if (scienceEntityListDaPan.get(0).getMacd().compareTo(new BigDecimal(0))<0&&scienceEntityListDaPan.get(0).getMacd().compareTo(scienceEntityListDaPan.get(1).getMacd())>0){
                return true;
            }
        }
        return false;
    }

    public static boolean macd0xiashang(List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        if (scienceEntityListDaPan.get(1).getMacd() == null || scienceEntityListDaPan.get(0).getMacd() == null || scienceEntityListDaPan.get(0).getDea() == null || scienceEntityListDaPan.get(0).getDiff() == null) {
            return false;
        }
        try {
            if (scienceEntityListDaPan.get(0).getDiff().compareTo(new BigDecimal(0)) < 0 && scienceEntityListDaPan.get(0).getDea().compareTo(new BigDecimal(0)) < 0) {
                if (scienceEntityListDaPan.get(0).getMacd().compareTo(new BigDecimal(0)) < 0 && scienceEntityListDaPan.get(0).getMacd().compareTo(scienceEntityListDaPan.get(1).getMacd()) > 0) {
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean macd0zxia(List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        if (scienceEntityListDaPan.get(1).getMacd()==null||scienceEntityListDaPan.get(0).getMacd()==null||scienceEntityListDaPan.get(0).getDea()==null||scienceEntityListDaPan.get(0).getDiff()==null) {
            return false;
        }
        if (scienceEntityListDaPan.get(0).getDiff().compareTo(new BigDecimal(0))>=0&&scienceEntityListDaPan.get(0).getDea().compareTo(new BigDecimal(0))<0){
            if (scienceEntityListDaPan.get(0).getMacd().compareTo(new BigDecimal(0))<0&&scienceEntityListDaPan.get(0).getMacd().compareTo(scienceEntityListDaPan.get(1).getMacd())>0){
                return true;
            }
        }
        return false;
    }

    public static boolean macd0zshang(List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        if (scienceEntityListDaPan.get(1).getMacd() == null || scienceEntityListDaPan.get(0).getMacd() == null || scienceEntityListDaPan.get(0).getDea() == null || scienceEntityListDaPan.get(0).getDiff() == null) {
            return false;
        }
        try {
            if (scienceEntityListDaPan.get(0).getDiff().compareTo(new BigDecimal(0)) >= 0 && scienceEntityListDaPan.get(0).getDea().compareTo(new BigDecimal(0)) < 0) {
                if (scienceEntityListDaPan.get(0).getMacd().compareTo(new BigDecimal(0)) < 0 && scienceEntityListDaPan.get(0).getMacd().compareTo(scienceEntityListDaPan.get(1).getMacd()) > 0) {
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean macd0shangxia(List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        if (scienceEntityListDaPan.get(1).getMacd()==null||scienceEntityListDaPan.get(0).getMacd()==null||scienceEntityListDaPan.get(0).getDea()==null||scienceEntityListDaPan.get(0).getDiff()==null) {
            return false;
        }
        if (scienceEntityListDaPan.get(0).getDiff().compareTo(new BigDecimal(0))>0&&scienceEntityListDaPan.get(0).getDea().compareTo(new BigDecimal(0))>=0){
            if (scienceEntityListDaPan.get(0).getMacd().compareTo(new BigDecimal(0))<0&&scienceEntityListDaPan.get(0).getMacd().compareTo(scienceEntityListDaPan.get(1).getMacd())>0){
                return true;
            }
        }
        return false;
    }

    public static boolean macd0shangshang(List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        if (scienceEntityListDaPan.get(1).getMacd() == null || scienceEntityListDaPan.get(0).getMacd() == null || scienceEntityListDaPan.get(0).getDea() == null || scienceEntityListDaPan.get(0).getDiff() == null) {
            return false;
        }
        try {
            if (scienceEntityListDaPan.get(0).getDiff().compareTo(new BigDecimal(0)) > 0 && scienceEntityListDaPan.get(0).getDea().compareTo(new BigDecimal(0)) >= 0) {
                if (scienceEntityListDaPan.get(0).getMacd().compareTo(new BigDecimal(0)) < 0 && scienceEntityListDaPan.get(0).getMacd().compareTo(scienceEntityListDaPan.get(1).getMacd()) > 0) {
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean kdj20xiajc(List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        if (scienceEntityListDaPan.get(0).getJ()==null||scienceEntityListDaPan.get(1).getJ()==null||scienceEntityListDaPan.get(2).getK()==null||scienceEntityListDaPan.get(1).getK()==null||scienceEntityListDaPan.get(0).getK()==null) {
            return false;
        }
        try{
            //金叉
            if (scienceEntityListDaPan.get(0).getK().compareTo(new BigDecimal(20))<=0){
                if (scienceEntityListDaPan.get(0).getK().compareTo(scienceEntityListDaPan.get(1).getK())>0){
                    if (scienceEntityListDaPan.get(1).getJ().compareTo(scienceEntityListDaPan.get(1).getK())<0){
                        if (scienceEntityListDaPan.get(0).getJ().compareTo(scienceEntityListDaPan.get(0).getK())>=0){
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

    public static boolean kdj20xiashang(List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        if (scienceEntityListDaPan.get(2).getK() == null || scienceEntityListDaPan.get(1).getK() == null || scienceEntityListDaPan.get(0).getK() == null) {
            return false;
        }
        try {
            //20向上
            if (scienceEntityListDaPan.get(0).getK().compareTo(new BigDecimal(20)) <= 0) {
                if (scienceEntityListDaPan.get(0).getK().compareTo(scienceEntityListDaPan.get(1).getK()) > 0) {
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean kdj50xiajc(List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        if (scienceEntityListDaPan.get(0).getJ()==null||scienceEntityListDaPan.get(1).getJ()==null||scienceEntityListDaPan.get(2).getK()==null||scienceEntityListDaPan.get(1).getK()==null||scienceEntityListDaPan.get(0).getK()==null) {
            return false;
        }
        try{
            //金叉
            if (scienceEntityListDaPan.get(0).getK().compareTo(new BigDecimal(20))>0&&scienceEntityListDaPan.get(0).getK().compareTo(new BigDecimal(50))<0){
                if (scienceEntityListDaPan.get(0).getK().compareTo(scienceEntityListDaPan.get(1).getK())>0){
                    if (scienceEntityListDaPan.get(1).getJ().compareTo(scienceEntityListDaPan.get(1).getK())<0){
                        if (scienceEntityListDaPan.get(0).getJ().compareTo(scienceEntityListDaPan.get(0).getK())>=0){
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

    public static boolean kdj50xiashang(List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        if (scienceEntityListDaPan.get(2).getK() == null || scienceEntityListDaPan.get(1).getK() == null || scienceEntityListDaPan.get(0).getK() == null) {
            return false;
        }
        try {
            //20向上
            if (scienceEntityListDaPan.get(0).getK().compareTo(new BigDecimal(20))>0&&scienceEntityListDaPan.get(0).getK().compareTo(new BigDecimal(50))<0) {
                if (scienceEntityListDaPan.get(0).getK().compareTo(scienceEntityListDaPan.get(1).getK()) > 0) {
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean kdj50shangjc(List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        if (scienceEntityListDaPan.get(0).getJ()==null||scienceEntityListDaPan.get(1).getJ()==null||scienceEntityListDaPan.get(2).getK()==null||scienceEntityListDaPan.get(1).getK()==null||scienceEntityListDaPan.get(0).getK()==null) {
            return false;
        }
        try{
            //金叉
            if (scienceEntityListDaPan.get(0).getK().compareTo(new BigDecimal(50))>=0){
                if (scienceEntityListDaPan.get(0).getK().compareTo(scienceEntityListDaPan.get(1).getK())>0){
                    if (scienceEntityListDaPan.get(1).getJ().compareTo(scienceEntityListDaPan.get(1).getK())<0){
                        if (scienceEntityListDaPan.get(0).getJ().compareTo(scienceEntityListDaPan.get(0).getK())>=0){
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
    public static boolean kdj50shangsc(List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        if (scienceEntityListDaPan.get(0).getJ()==null||scienceEntityListDaPan.get(1).getJ()==null||scienceEntityListDaPan.get(2).getK()==null||scienceEntityListDaPan.get(1).getK()==null||scienceEntityListDaPan.get(0).getK()==null) {
            return false;
        }
        try{
            //死叉
            if (scienceEntityListDaPan.get(0).getK().compareTo(new BigDecimal(50))>=0){
                if (scienceEntityListDaPan.get(0).getK().compareTo(scienceEntityListDaPan.get(1).getK())<=0){
                    if (scienceEntityListDaPan.get(1).getJ().compareTo(scienceEntityListDaPan.get(1).getK())>0){
                        if (scienceEntityListDaPan.get(0).getJ().compareTo(scienceEntityListDaPan.get(0).getK())<=0){
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

    public static boolean kdj50shangshang(List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        if (scienceEntityListDaPan.get(2).getK() == null || scienceEntityListDaPan.get(1).getK() == null || scienceEntityListDaPan.get(0).getK() == null) {
            return false;
        }
        try {
            //20向上
            if (scienceEntityListDaPan.get(0).getK().compareTo(new BigDecimal(50))>=0) {
                if (scienceEntityListDaPan.get(0).getK().compareTo(scienceEntityListDaPan.get(1).getK()) > 0) {
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }
}
