package com.stock.stockday.util;


import com.stock.apicommon.entity.ScienceEntity;

import java.util.List;

public class FindUtil49 {

    public static boolean duoTuXiangShangDapan2(List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try{
        boolean result=FindUtil43.kdj50shangshang(scienceEntityListDaPan);
        if (result){
            boolean result1=FindUtil43.kdj50shangsc(scienceEntityList);
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
            boolean result=FindUtil43.kdj50shangjc(scienceEntityListDaPan);
            if (result){
                boolean result1=FindUtil43.kdj20xiashang(scienceEntityList);
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
            boolean result=FindUtil43.kdj50shangjc(scienceEntityListDaPan);
            if (result){
                boolean result1=FindUtil43.kdj20xiajc(scienceEntityList);
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
            boolean result=FindUtil43.kdj50shangjc(scienceEntityListDaPan);
            if (result){
                boolean result1=FindUtil43.kdj50xiashang(scienceEntityList);
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
            boolean result=FindUtil43.kdj50shangjc(scienceEntityListDaPan);
            if (result){
                boolean result1=FindUtil43.kdj50xiajc(scienceEntityList);
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
            boolean result=FindUtil43.kdj50shangjc(scienceEntityListDaPan);
            if (result){
                boolean result1=FindUtil43.kdj50shangshang(scienceEntityList);
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
            boolean result=FindUtil43.kdj50shangjc(scienceEntityListDaPan);
            if (result){
                boolean result1=FindUtil43.kdj50shangjc(scienceEntityList);
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
            boolean result=FindUtil43.kdj50shangjc(scienceEntityListDaPan);
            if (result){
                boolean result1=FindUtil43.kdj50shangsc(scienceEntityList);
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
            boolean result=FindUtil43.kdj50shangsc(scienceEntityListDaPan);
            if (result){
                boolean result1=FindUtil43.kdj20xiashang(scienceEntityList);
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
            boolean result=FindUtil43.kdj50shangsc(scienceEntityListDaPan);
            if (result){
                boolean result1=FindUtil43.kdj20xiajc(scienceEntityList);
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
            boolean result=FindUtil43.kdj50shangsc(scienceEntityListDaPan);
            if (result){
                boolean result1=FindUtil43.kdj50xiashang(scienceEntityList);
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
            boolean result=FindUtil43.kdj50shangsc(scienceEntityListDaPan);
            if (result){
                boolean result1=FindUtil43.kdj50xiajc(scienceEntityList);
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
            boolean result=FindUtil43.kdj50shangsc(scienceEntityListDaPan);
            if (result){
                boolean result1=FindUtil43.kdj50shangshang(scienceEntityList);
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
            boolean result=FindUtil43.kdj50shangsc(scienceEntityListDaPan);
            if (result){
                boolean result1=FindUtil43.kdj50shangjc(scienceEntityList);
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
            boolean result=FindUtil43.kdj50shangsc(scienceEntityListDaPan);
            if (result){
                boolean result1=FindUtil43.kdj50shangsc(scienceEntityList);
                if (result1){
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }





}
