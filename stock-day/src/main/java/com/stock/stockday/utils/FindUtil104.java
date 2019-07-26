package com.stock.stockday.utils;


import com.stock.apicommon.entity.ScienceEntity;
import com.stock.stockday.entity.StockDayAll;

import java.math.BigDecimal;
import java.util.List;

public class FindUtil104 {

    public static boolean duoTuXiangShangDapan2( List<StockDayAll> stockDayAllList2, List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (shang5(stockDayAllList2,scienceEntityList)){
                if (jdk80shangxia(scienceEntityListDaPan)){
                    return true;
                }
            }
           return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean shengVDapan2( List<StockDayAll> stockDayAllList2, List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (shang5(stockDayAllList2,scienceEntityList)){
                if (jdk80shangsc(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean reset20Dapan2( List<StockDayAll> stockDayAllList2, List<ScienceEntity> scienceEntityList,List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (shang5(stockDayAllList2,scienceEntityList)){
                if (jdk80shangjc(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan3(List<StockDayAll> stockDayAllList2, List<ScienceEntity> scienceEntityList,List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (shang5(stockDayAllList2,scienceEntityList)){
                if (jdk70shangxia(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jishujieqiDapan3(List<StockDayAll> stockDayAllList2, List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (shang5(stockDayAllList2,scienceEntityList)){
                if (jdk70shangsc(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan10(List<StockDayAll> stockDayAllList2, List<ScienceEntity> scienceEntityList,List<ScienceEntity> scienceEntityListDaPan) {

        try {
            if (shang5(stockDayAllList2,scienceEntityList)){
                if (jdk70shangjc(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jishujieqiDapan4(List<StockDayAll> stockDayAllList2, List<ScienceEntity> scienceEntityList,List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (shang5(stockDayAllList2,scienceEntityList)){
                if (jdk60shangxia(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan4(List<StockDayAll> stockDayAllList2, List<ScienceEntity> scienceEntityList,List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (shang5(stockDayAllList2,scienceEntityList)){
                if (jdk60shangsc(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean duoTuXiangShangDapan3(List<StockDayAll> stockDayAllList2, List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (shang5(stockDayAllList2,scienceEntityList)){
                if (jdk40shangxia(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean shengVDapan3(List<StockDayAll> stockDayAllList2, List<ScienceEntity> scienceEntityList,List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (shang5(stockDayAllList2,scienceEntityList)){
                if (jdk40shangsc(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean reset20Dapan3(List<StockDayAll> stockDayAllList2, List<ScienceEntity> scienceEntityList,List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (shang5(stockDayAllList2,scienceEntityList)){
                if (jdk20shangxia(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan5(List<StockDayAll> stockDayAllList2, List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (shang5(stockDayAllList2,scienceEntityList)){
                if (jdk20shangsc(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jishujieqiDapan5(List<StockDayAll> stockDayAllList2, List<ScienceEntity> scienceEntityList,List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (shang5(stockDayAllList2,scienceEntityList)){
                if (jdk20xiaxia(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jishujieqiDapan6(List<StockDayAll> stockDayAllList2, List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (shang5(stockDayAllList2,scienceEntityList)){
                if (jdk20xiasc(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jishujieqiDapan7(List<StockDayAll> stockDayAllList2, List<ScienceEntity> scienceEntityList,List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (shang5(stockDayAllList2,scienceEntityList)){
                if (jdk20xiajc(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean duoTuXiangShangDapan4(List<StockDayAll> stockDayAllList2, List<ScienceEntity> scienceEntityList,List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (shang10(stockDayAllList2,scienceEntityList)){
                if (jdk80shangxia(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean shengVDapan4(List<StockDayAll> stockDayAllList2, List<ScienceEntity> scienceEntityList,List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (shang10(stockDayAllList2,scienceEntityList)){
                if (jdk80shangsc(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean reset20Dapan4(List<StockDayAll> stockDayAllList2, List<ScienceEntity> scienceEntityList,List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (shang10(stockDayAllList2,scienceEntityList)){
                if (jdk80shangjc(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan6(List<StockDayAll> stockDayAllList2, List<ScienceEntity> scienceEntityList,List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (shang10(stockDayAllList2,scienceEntityList)){
                if (jdk70shangxia(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jishujieqiDapan8(List<StockDayAll> stockDayAllList2, List<ScienceEntity> scienceEntityList,List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (shang10(stockDayAllList2,scienceEntityList)){
                if (jdk70shangsc(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jishujieqiDapan9(List<StockDayAll> stockDayAllList2, List<ScienceEntity> scienceEntityList,List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (shang10(stockDayAllList2,scienceEntityList)){
                if (jdk70shangjc(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan7(List<StockDayAll> stockDayAllList2, List<ScienceEntity> scienceEntityList,List<ScienceEntity> scienceEntityListDaPan) {
        try {
            if (shang10(stockDayAllList2,scienceEntityList)){
                if (jdk60shangxia(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan8(List<StockDayAll> stockDayAllList2, List<ScienceEntity> scienceEntityList,List<ScienceEntity> scienceEntityListDaPan) {
        try {
            if (shang10(stockDayAllList2,scienceEntityList)){
                if (jdk60shangsc(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan9(List<StockDayAll> stockDayAllList2, List<ScienceEntity> scienceEntityList,List<ScienceEntity> scienceEntityListDaPan) {
        try {
            if (shang10(stockDayAllList2,scienceEntityList)){
                if (jdk40shangxia(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan11(List<StockDayAll> stockDayAllList2, List<ScienceEntity> scienceEntityList,List<ScienceEntity> scienceEntityListDaPan) {
        try {
            if (shang10(stockDayAllList2,scienceEntityList)){
                if (jdk40shangsc(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan12(List<StockDayAll> stockDayAllList2, List<ScienceEntity> scienceEntityList,List<ScienceEntity> scienceEntityListDaPan) {

        try {
            if (shang10(stockDayAllList2,scienceEntityList)){
                if (jdk20shangxia(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan13(List<StockDayAll> stockDayAllList2, List<ScienceEntity> scienceEntityList,List<ScienceEntity> scienceEntityListDaPan) {
        try {
            if (shang10(stockDayAllList2,scienceEntityList)){
                if (jdk20shangsc(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan14(List<StockDayAll> stockDayAllList2, List<ScienceEntity> scienceEntityList,List<ScienceEntity> scienceEntityListDaPan) {
        try {
            if (shang10(stockDayAllList2,scienceEntityList)){
                if (jdk20xiaxia(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan15(List<StockDayAll> stockDayAllList2, List<ScienceEntity> scienceEntityList,List<ScienceEntity> scienceEntityListDaPan) {
        try {
            if (shang10(stockDayAllList2,scienceEntityList)){
                if (jdk20xiasc(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan16(List<StockDayAll> stockDayAllList2, List<ScienceEntity> scienceEntityList,List<ScienceEntity> scienceEntityListDaPan) {
        try {
            if (shang10(stockDayAllList2,scienceEntityList)){
                if (jdk20xiajc(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan17(List<StockDayAll> stockDayAllList2, List<ScienceEntity> scienceEntityList,List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (shang20(stockDayAllList2,scienceEntityList)){
                if (jdk80shangxia(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan18(List<StockDayAll> stockDayAllList2, List<ScienceEntity> scienceEntityList,List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (shang20(stockDayAllList2,scienceEntityList)){
                if (jdk80shangsc(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan19(List<StockDayAll> stockDayAllList2, List<ScienceEntity> scienceEntityList,List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (shang20(stockDayAllList2,scienceEntityList)){
                if (jdk80shangjc(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan20(List<StockDayAll> stockDayAllList2, List<ScienceEntity> scienceEntityList,List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (shang20(stockDayAllList2,scienceEntityList)){
                if (jdk70shangxia(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan21(List<StockDayAll> stockDayAllList2, List<ScienceEntity> scienceEntityList,List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (shang20(stockDayAllList2,scienceEntityList)){
                if (jdk70shangsc(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan22(List<StockDayAll> stockDayAllList2, List<ScienceEntity> scienceEntityList,List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (shang20(stockDayAllList2,scienceEntityList)){
                if (jdk70shangjc(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan23(List<StockDayAll> stockDayAllList2, List<ScienceEntity> scienceEntityList,List<ScienceEntity> scienceEntityListDaPan) {
        try {
            if (shang20(stockDayAllList2,scienceEntityList)){
                if (jdk60shangxia(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan24(List<StockDayAll> stockDayAllList2, List<ScienceEntity> scienceEntityList,List<ScienceEntity> scienceEntityListDaPan) {
        try {
            if (shang20(stockDayAllList2,scienceEntityList)){
                if (jdk60shangsc(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan25(List<StockDayAll> stockDayAllList2, List<ScienceEntity> scienceEntityList,List<ScienceEntity> scienceEntityListDaPan) {
        try {
            if (shang20(stockDayAllList2,scienceEntityList)){
                if (jdk40shangxia(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan26(List<StockDayAll> stockDayAllList2, List<ScienceEntity> scienceEntityList,List<ScienceEntity> scienceEntityListDaPan) {
        try {
            if (shang20(stockDayAllList2,scienceEntityList)){
                if (jdk40shangsc(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan27(List<StockDayAll> stockDayAllList2, List<ScienceEntity> scienceEntityList,List<ScienceEntity> scienceEntityListDaPan) {

        try {
            if (shang20(stockDayAllList2,scienceEntityList)){
                if (jdk20shangxia(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan28(List<StockDayAll> stockDayAllList2, List<ScienceEntity> scienceEntityList,List<ScienceEntity> scienceEntityListDaPan) {
        try {
            if (shang20(stockDayAllList2,scienceEntityList)){
                if (jdk20shangsc(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan29(List<StockDayAll> stockDayAllList2, List<ScienceEntity> scienceEntityList,List<ScienceEntity> scienceEntityListDaPan) {
        try {
            if (shang20(stockDayAllList2,scienceEntityList)){
                if (jdk20xiaxia(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan30(List<StockDayAll> stockDayAllList2, List<ScienceEntity> scienceEntityList,List<ScienceEntity> scienceEntityListDaPan) {
        try {
            if (shang20(stockDayAllList2,scienceEntityList)){
                if (jdk20xiasc(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan31(List<StockDayAll> stockDayAllList2, List<ScienceEntity> scienceEntityList,List<ScienceEntity> scienceEntityListDaPan) {
        try {
            if (shang20(stockDayAllList2,scienceEntityList)){
                if (jdk20xiajc(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan32(List<StockDayAll> stockDayAllList2, List<ScienceEntity> scienceEntityList,List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (shang30(stockDayAllList2,scienceEntityList)){
                if (jdk80shangxia(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan33(List<StockDayAll> stockDayAllList2, List<ScienceEntity> scienceEntityList,List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (shang30(stockDayAllList2,scienceEntityList)){
                if (jdk80shangsc(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan34(List<StockDayAll> stockDayAllList2, List<ScienceEntity> scienceEntityList,List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (shang30(stockDayAllList2,scienceEntityList)){
                if (jdk80shangjc(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan35(List<StockDayAll> stockDayAllList2, List<ScienceEntity> scienceEntityList,List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (shang30(stockDayAllList2,scienceEntityList)){
                if (jdk70shangxia(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan36(List<StockDayAll> stockDayAllList2, List<ScienceEntity> scienceEntityList,List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (shang30(stockDayAllList2,scienceEntityList)){
                if (jdk70shangsc(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan37(List<StockDayAll> stockDayAllList2, List<ScienceEntity> scienceEntityList,List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (shang30(stockDayAllList2,scienceEntityList)){
                if (jdk70shangjc(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan38(List<StockDayAll> stockDayAllList2, List<ScienceEntity> scienceEntityList,List<ScienceEntity> scienceEntityListDaPan) {
        try {
            if (shang30(stockDayAllList2,scienceEntityList)){
                if (jdk60shangxia(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan39(List<StockDayAll> stockDayAllList2, List<ScienceEntity> scienceEntityList,List<ScienceEntity> scienceEntityListDaPan) {
        try {
            if (shang30(stockDayAllList2,scienceEntityList)){
                if (jdk60shangsc(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan40(List<StockDayAll> stockDayAllList2, List<ScienceEntity> scienceEntityList,List<ScienceEntity> scienceEntityListDaPan) {
        try {
            if (shang30(stockDayAllList2,scienceEntityList)){
                if (jdk40shangxia(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan41(List<StockDayAll> stockDayAllList2, List<ScienceEntity> scienceEntityList,List<ScienceEntity> scienceEntityListDaPan) {
        try {
            if (shang30(stockDayAllList2,scienceEntityList)){
                if (jdk40shangsc(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan42(List<StockDayAll> stockDayAllList2, List<ScienceEntity> scienceEntityList,List<ScienceEntity> scienceEntityListDaPan) {

        try {
            if (shang30(stockDayAllList2,scienceEntityList)){
                if (jdk20shangxia(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan43(List<StockDayAll> stockDayAllList2, List<ScienceEntity> scienceEntityList,List<ScienceEntity> scienceEntityListDaPan) {
        try {
            if (shang30(stockDayAllList2,scienceEntityList)){
                if (jdk20shangsc(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan44(List<StockDayAll> stockDayAllList2, List<ScienceEntity> scienceEntityList,List<ScienceEntity> scienceEntityListDaPan) {
        try {
            if (shang30(stockDayAllList2,scienceEntityList)){
                if (jdk20xiaxia(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan45(List<StockDayAll> stockDayAllList2, List<ScienceEntity> scienceEntityList,List<ScienceEntity> scienceEntityListDaPan) {
        try {
            if (shang30(stockDayAllList2,scienceEntityList)){
                if (jdk20xiasc(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan46(List<StockDayAll> stockDayAllList2, List<ScienceEntity> scienceEntityList,List<ScienceEntity> scienceEntityListDaPan) {
        try {
            if (shang30(stockDayAllList2,scienceEntityList)){
                if (jdk20xiajc(scienceEntityListDaPan)){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }


    public static boolean shang5(List<StockDayAll> stockDayAllList,List<ScienceEntity> scienceEntityList) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        try {
            if (scienceEntityList.get(0).getPriceMa5().compareTo(scienceEntityList.get(1).getPriceMa5())<= 0&&scienceEntityList.get(0).getPriceMa10().compareTo(scienceEntityList.get(1).getPriceMa10())<= 0&& scienceEntityList.get(0).getPriceMa20().compareTo(scienceEntityList.get(1).getPriceMa20()) <= 0 ) {
                if (stockDayAllList.get(0).getClosingPrice().compareTo(scienceEntityList.get(0).getPriceMa5()) <= 0) {
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean shang10(List<StockDayAll> stockDayAllList,List<ScienceEntity> scienceEntityList) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        try {
            if (scienceEntityList.get(0).getPriceMa10().compareTo(scienceEntityList.get(1).getPriceMa10())<= 0&& scienceEntityList.get(0).getPriceMa20().compareTo(scienceEntityList.get(1).getPriceMa20()) <= 0 ) {
                if (stockDayAllList.get(0).getClosingPrice().compareTo(scienceEntityList.get(0).getPriceMa10())<= 0) {
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean shang20(List<StockDayAll> stockDayAllList,List<ScienceEntity> scienceEntityList) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        try {
            if (scienceEntityList.get(0).getPriceMa20().compareTo(scienceEntityList.get(1).getPriceMa20()) <= 0 ) {
                if (stockDayAllList.get(0).getClosingPrice().compareTo(scienceEntityList.get(0).getPriceMa20()) <= 0) {
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean shang30(List<StockDayAll> stockDayAllList,List<ScienceEntity> scienceEntityList) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        try {
            if (scienceEntityList.get(0).getPriceMa30().compareTo(scienceEntityList.get(1).getPriceMa30()) <= 0 ) {
                if (stockDayAllList.get(0).getClosingPrice().compareTo(scienceEntityList.get(0).getPriceMa30()) <= 0) {
                    return true;
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
