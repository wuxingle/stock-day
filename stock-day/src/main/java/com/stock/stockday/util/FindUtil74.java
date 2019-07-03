package com.stock.stockday.util;


import com.stock.apicommon.entity.ScienceEntity;
import com.stock.apicommon.entity.SunEntity;
import com.stock.apicommon.utils.patterning.SunUtil;
import com.stock.apicommon.vo.SunVo;
import com.stock.stockday.entity.StockDayAll;
import org.springframework.beans.BeanUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class FindUtil74 {

    public static boolean duoTuXiangShangDapan2(List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
           return jdk80shangxia(scienceEntityListDaPan);
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean shengVDapan2( List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            return jdk80shangsc(scienceEntityListDaPan);
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean reset20Dapan2(List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            return jdk80shangjc(scienceEntityListDaPan);
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan3( List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            return jdk70shangxia(scienceEntityListDaPan);
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jishujieqiDapan3( List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            return jdk70shangsc(scienceEntityListDaPan);
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan10(List<ScienceEntity> scienceEntityListDaPan) {

        try {
            return jdk70shangjc(scienceEntityListDaPan);
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jishujieqiDapan4(List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            return jdk60shangxia(scienceEntityListDaPan);
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan4(List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            return jdk60shangsc(scienceEntityListDaPan);
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean duoTuXiangShangDapan3( List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            return jdk40shangxia(scienceEntityListDaPan);
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean shengVDapan3(List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            return jdk40shangsc(scienceEntityListDaPan);
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean reset20Dapan3(List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            return jdk20shangxia(scienceEntityListDaPan);
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan5( List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            return jdk20shangsc(scienceEntityListDaPan);
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jishujieqiDapan5(List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            return jdk20xiaxia(scienceEntityListDaPan);
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jishujieqiDapan6( List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            return jdk20xiasc(scienceEntityListDaPan);
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jishujieqiDapan7(List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            return jdk20xiajc(scienceEntityListDaPan);
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean duoTuXiangShangDapan4(List<ScienceEntity> scienceEntityList) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try {
            return jdk80shangxia(scienceEntityList);
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean shengVDapan4(List<ScienceEntity> scienceEntityList) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try {
            return jdk80shangsc(scienceEntityList);
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean reset20Dapan4(List<ScienceEntity> scienceEntityList) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try {
            return jdk80shangjc(scienceEntityList);
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan6(List<ScienceEntity> scienceEntityList) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try {
            return jdk70shangxia(scienceEntityList);
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jishujieqiDapan8(List<ScienceEntity> scienceEntityList) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try {
            return jdk70shangsc(scienceEntityList);
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jishujieqiDapan9(List<ScienceEntity> scienceEntityList) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try {
            return jdk70shangjc(scienceEntityList);
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan7(List<ScienceEntity> scienceEntityList) {
        try {
            return jdk60shangxia(scienceEntityList);
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan8(List<ScienceEntity> scienceEntityList) {
        try {
            return jdk60shangsc(scienceEntityList);
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan9(List<ScienceEntity> scienceEntityList) {
        try {
            return jdk40shangxia(scienceEntityList);
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan11(List<ScienceEntity> scienceEntityList) {
        try {
            return jdk40shangsc(scienceEntityList);
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan12(List<ScienceEntity> scienceEntityList) {

        try {
            return jdk20shangxia(scienceEntityList);
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan13(List<ScienceEntity> scienceEntityList) {
        try {
            return jdk20shangsc(scienceEntityList);
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan14(List<ScienceEntity> scienceEntityList) {
        try {
            return jdk20xiaxia(scienceEntityList);
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan15(List<ScienceEntity> scienceEntityList) {
        try {
            return jdk20xiasc(scienceEntityList);
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan16(List<ScienceEntity> scienceEntityList) {
        try {
            return jdk20xiajc(scienceEntityList);
        } catch (Exception e) {
            return false;
        }
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
