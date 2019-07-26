package com.stock.stockday.utils;


import com.stock.apicommon.entity.ScienceEntity;
import com.stock.stockday.entity.StockDayAll;

import java.math.BigDecimal;
import java.util.List;

public class FindUtil106 {

    public static boolean duoTuXiangShangDapan2(List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (shang5(stockDayAllListDaPan1, scienceEntityListDaPan)) {
                if (jdk80shangshang(scienceEntityListDaPan)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean shengVDapan2(List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (shang5(stockDayAllListDaPan1, scienceEntityListDaPan)) {
                if (jdk80shangjc(scienceEntityListDaPan)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean reset20Dapan2(List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (shang5(stockDayAllListDaPan1, scienceEntityListDaPan)) {
                if (jdk70shangshang(scienceEntityListDaPan)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan3(List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (shang5(stockDayAllListDaPan1, scienceEntityListDaPan)) {
                if (jdk70shangjc(scienceEntityListDaPan)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jishujieqiDapan3(List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (shang5(stockDayAllListDaPan1, scienceEntityListDaPan)) {
                if (jdk60shangshang(scienceEntityListDaPan)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan10(List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {

        try {
            if (shang5(stockDayAllListDaPan1, scienceEntityListDaPan)) {
                if (jdk60shangjc(scienceEntityListDaPan)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jishujieqiDapan4(List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (shang5(stockDayAllListDaPan1, scienceEntityListDaPan)) {
                if (jdk40shangshang(scienceEntityListDaPan)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan4(List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (shang5(stockDayAllListDaPan1, scienceEntityListDaPan)) {
                if (jdk40shangjc(scienceEntityListDaPan)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean duoTuXiangShangDapan3(List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (shang5(stockDayAllListDaPan1, scienceEntityListDaPan)) {
                if (jdk20shangshang(scienceEntityListDaPan)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean shengVDapan3(List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (shang5(stockDayAllListDaPan1, scienceEntityListDaPan)) {
                if (jdk20shangjc(scienceEntityListDaPan)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean reset20Dapan3(List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (shang5(stockDayAllListDaPan1, scienceEntityListDaPan)) {
                if (jdk20xiashang(scienceEntityListDaPan)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan5(List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (shang5(stockDayAllListDaPan1, scienceEntityListDaPan)) {
                if (jdk20xiajc(scienceEntityListDaPan)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jishujieqiDapan5(List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (shang10(stockDayAllListDaPan1, scienceEntityListDaPan)) {
                if (jdk80shangshang(scienceEntityListDaPan)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jishujieqiDapan6(List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (shang10(stockDayAllListDaPan1, scienceEntityListDaPan)) {
                if (jdk80shangjc(scienceEntityListDaPan)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jishujieqiDapan7(List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (shang10(stockDayAllListDaPan1, scienceEntityListDaPan)) {
                if (jdk70shangshang(scienceEntityListDaPan)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean duoTuXiangShangDapan4(List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (shang10(stockDayAllListDaPan1, scienceEntityListDaPan)) {
                if (jdk70shangjc(scienceEntityListDaPan)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean shengVDapan4(List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (shang10(stockDayAllListDaPan1, scienceEntityListDaPan)) {
                if (jdk60shangshang(scienceEntityListDaPan)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean reset20Dapan4(List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (shang10(stockDayAllListDaPan1, scienceEntityListDaPan)) {
                if (jdk60shangjc(scienceEntityListDaPan)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan6(List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (shang10(stockDayAllListDaPan1, scienceEntityListDaPan)) {
                if (jdk40shangshang(scienceEntityListDaPan)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jishujieqiDapan8(List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (shang10(stockDayAllListDaPan1, scienceEntityListDaPan)) {
                if (jdk40shangjc(scienceEntityListDaPan)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jishujieqiDapan9(List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (shang10(stockDayAllListDaPan1, scienceEntityListDaPan)) {
                if (jdk20shangshang(scienceEntityListDaPan)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan7(List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        try {
            if (shang10(stockDayAllListDaPan1, scienceEntityListDaPan)) {
                if (jdk20shangjc(scienceEntityListDaPan)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan8(List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        try {
            if (shang10(stockDayAllListDaPan1, scienceEntityListDaPan)) {
                if (jdk20xiashang(scienceEntityListDaPan)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan9(List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        try {
            if (shang10(stockDayAllListDaPan1, scienceEntityListDaPan)) {
                if (jdk20xiajc(scienceEntityListDaPan)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan11(List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        try {
            if (shang20(stockDayAllListDaPan1, scienceEntityListDaPan)) {
                if (jdk80shangshang(scienceEntityListDaPan)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan12(List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {

        try {
            if (shang20(stockDayAllListDaPan1, scienceEntityListDaPan)) {
                if (jdk80shangjc(scienceEntityListDaPan)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan13(List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        try {
            if (shang20(stockDayAllListDaPan1, scienceEntityListDaPan)) {
                if (jdk70shangshang(scienceEntityListDaPan)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan14(List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        try {
            if (shang20(stockDayAllListDaPan1, scienceEntityListDaPan)) {
                if (jdk70shangjc(scienceEntityListDaPan)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan15(List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        try {
            if (shang20(stockDayAllListDaPan1, scienceEntityListDaPan)) {
                if (jdk60shangshang(scienceEntityListDaPan)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan16(List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        try {
            if (shang20(stockDayAllListDaPan1, scienceEntityListDaPan)) {
                if (jdk60shangjc(scienceEntityListDaPan)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan17(List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (shang20(stockDayAllListDaPan1, scienceEntityListDaPan)) {
                if (jdk40shangshang(scienceEntityListDaPan)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan18(List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (shang20(stockDayAllListDaPan1, scienceEntityListDaPan)) {
                if (jdk40shangjc(scienceEntityListDaPan)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan19(List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (shang20(stockDayAllListDaPan1, scienceEntityListDaPan)) {
                if (jdk20shangshang(scienceEntityListDaPan)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan20(List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (shang20(stockDayAllListDaPan1, scienceEntityListDaPan)) {
                if (jdk20shangjc(scienceEntityListDaPan)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan21(List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (shang20(stockDayAllListDaPan1, scienceEntityListDaPan)) {
                if (jdk20xiashang(scienceEntityListDaPan)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan22(List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (shang20(stockDayAllListDaPan1, scienceEntityListDaPan)) {
                if (jdk20xiajc(scienceEntityListDaPan)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan23(List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        try {
            if (shang30(stockDayAllListDaPan1, scienceEntityListDaPan)) {
                if (jdk80shangshang(scienceEntityListDaPan)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan24(List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        try {
            if (shang30(stockDayAllListDaPan1, scienceEntityListDaPan)) {
                if (jdk80shangjc(scienceEntityListDaPan)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan25(List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        try {
            if (shang30(stockDayAllListDaPan1, scienceEntityListDaPan)) {
                if (jdk70shangshang(scienceEntityListDaPan)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan26(List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        try {
            if (shang30(stockDayAllListDaPan1, scienceEntityListDaPan)) {
                if (jdk70shangjc(scienceEntityListDaPan)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan27(List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {

        try {
            if (shang30(stockDayAllListDaPan1, scienceEntityListDaPan)) {
                if (jdk60shangshang(scienceEntityListDaPan)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan28(List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        try {
            if (shang30(stockDayAllListDaPan1, scienceEntityListDaPan)) {
                if (jdk60shangjc(scienceEntityListDaPan)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan29(List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        try {
            if (shang30(stockDayAllListDaPan1, scienceEntityListDaPan)) {
                if (jdk40shangshang(scienceEntityListDaPan)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan30(List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        try {
            if (shang30(stockDayAllListDaPan1, scienceEntityListDaPan)) {
                if (jdk40shangjc(scienceEntityListDaPan)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan31(List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        try {
            if (shang30(stockDayAllListDaPan1, scienceEntityListDaPan)) {
                if (jdk20shangshang(scienceEntityListDaPan)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan32(List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (shang30(stockDayAllListDaPan1, scienceEntityListDaPan)) {
                if (jdk20shangjc(scienceEntityListDaPan)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan33(List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (shang30(stockDayAllListDaPan1, scienceEntityListDaPan)) {
                if (jdk20xiashang(scienceEntityListDaPan)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan34(List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (shang30(stockDayAllListDaPan1, scienceEntityListDaPan)) {
                if (jdk20xiajc(scienceEntityListDaPan)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan35(List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
                if (jdk80shangshang(scienceEntityListDaPan)) {
                    return true;
                }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan36(List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
                if (jdk80shangjc(scienceEntityListDaPan)) {
                    return true;
                }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan37(List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
                if (FindUtil98.jdk80shangsc(scienceEntityListDaPan)) {
                    return true;
                }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan38(List<ScienceEntity> scienceEntityListDaPan) {
        try {
                if (FindUtil98.jdk80shangxia(scienceEntityListDaPan)) {
                    return true;
                }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan39(List<ScienceEntity> scienceEntityListDaPan) {
        try {
                if (jdk70shangshang(scienceEntityListDaPan)) {
                    return true;
                }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan40(List<ScienceEntity> scienceEntityListDaPan) {
        try {
                if (jdk70shangjc(scienceEntityListDaPan)) {
                    return true;
                }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan41(List<ScienceEntity> scienceEntityListDaPan) {
        try {
                if (FindUtil98.jdk70shangxia(scienceEntityListDaPan)) {
                    return true;
                }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan42(List<ScienceEntity> scienceEntityListDaPan) {

        try {
                if (FindUtil98.jdk70shangsc(scienceEntityListDaPan)) {
                    return true;
                }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan43(List<ScienceEntity> scienceEntityListDaPan) {
        try {
                if (jdk60shangshang(scienceEntityListDaPan)) {
                    return true;
                }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan44(List<ScienceEntity> scienceEntityListDaPan) {
        try {
                if (jdk60shangjc(scienceEntityListDaPan)) {
                    return true;
                }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan45(List<ScienceEntity> scienceEntityListDaPan) {
        try {
                if (FindUtil98.jdk60shangxia(scienceEntityListDaPan)) {
                    return true;
                }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean jieQiDapan46(List<ScienceEntity> scienceEntityListDaPan) {
        try {
                if (FindUtil98.jdk60shangsc(scienceEntityListDaPan)) {
                    return true;
                }
            return false;
        } catch (Exception e) {
            return false;
        }
    }


    public static boolean shang5(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        try {
            if (scienceEntityList.get(0).getPriceMa5().compareTo(scienceEntityList.get(1).getPriceMa5())>= 0&& scienceEntityList.get(0).getPriceMa10().compareTo(scienceEntityList.get(1).getPriceMa10())>= 0&& scienceEntityList.get(0).getPriceMa20().compareTo(scienceEntityList.get(1).getPriceMa20()) >= 0 ) {
                if (stockDayAllList.get(0).getClosingPrice().compareTo(scienceEntityList.get(0).getPriceMa5()) >= 0) {
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean shang10(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        try {
            if (scienceEntityList.get(0).getPriceMa10().compareTo(scienceEntityList.get(1).getPriceMa10())>= 0&& scienceEntityList.get(0).getPriceMa20().compareTo(scienceEntityList.get(1).getPriceMa20()) >= 0 ) {
                if (stockDayAllList.get(0).getClosingPrice().compareTo(scienceEntityList.get(0).getPriceMa10()) >= 0) {
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean shang20(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        try {
            if (scienceEntityList.get(0).getPriceMa20().compareTo(scienceEntityList.get(1).getPriceMa20()) >= 0) {
                if (stockDayAllList.get(0).getClosingPrice().compareTo(scienceEntityList.get(0).getPriceMa20()) >= 0) {
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean shang30(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        try {
            if (scienceEntityList.get(0).getPriceMa30().compareTo(scienceEntityList.get(1).getPriceMa30()) >= 0) {
                if (stockDayAllList.get(0).getClosingPrice().compareTo(scienceEntityList.get(0).getPriceMa30()) >= 0) {
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jdk80shangshang(List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (scienceEntityListDaPan.get(0).getK().compareTo(new BigDecimal(80)) >= 0) {
                if (scienceEntityListDaPan.get(1).getJ().compareTo(scienceEntityListDaPan.get(1).getK()) < 0) {
                    if (scienceEntityListDaPan.get(0).getJ().compareTo(scienceEntityListDaPan.get(0).getK()) <= 0) {
                        if (scienceEntityListDaPan.get(0).getJ().compareTo(scienceEntityListDaPan.get(1).getJ()) > 0) {
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
            if (scienceEntityListDaPan.get(0).getK().compareTo(new BigDecimal(80)) >= 0) {
                if (scienceEntityListDaPan.get(1).getJ().compareTo(scienceEntityListDaPan.get(1).getK()) < 0) {
                    if (scienceEntityListDaPan.get(0).getJ().compareTo(scienceEntityListDaPan.get(0).getK()) >= 0) {
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

    public static boolean jdk70shangshang(List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (scienceEntityListDaPan.get(0).getK().compareTo(new BigDecimal(80)) < 0 && scienceEntityListDaPan.get(0).getK().compareTo(new BigDecimal(70)) >= 0) {
                if (scienceEntityListDaPan.get(1).getJ().compareTo(scienceEntityListDaPan.get(1).getK()) < 0) {
                    if (scienceEntityListDaPan.get(0).getJ().compareTo(scienceEntityListDaPan.get(0).getK()) <= 0) {
                        if (scienceEntityListDaPan.get(0).getJ().compareTo(scienceEntityListDaPan.get(1).getJ()) > 0) {
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
            if (scienceEntityListDaPan.get(0).getK().compareTo(new BigDecimal(80)) < 0 && scienceEntityListDaPan.get(0).getK().compareTo(new BigDecimal(70)) >= 0) {
                if (scienceEntityListDaPan.get(1).getJ().compareTo(scienceEntityListDaPan.get(1).getK()) < 0) {
                    if (scienceEntityListDaPan.get(0).getJ().compareTo(scienceEntityListDaPan.get(0).getK()) >= 0) {
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

    public static boolean jdk60shangshang(List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (scienceEntityListDaPan.get(0).getK().compareTo(new BigDecimal(70)) < 0 && scienceEntityListDaPan.get(0).getK().compareTo(new BigDecimal(60)) >= 0) {
                if (scienceEntityListDaPan.get(1).getJ().compareTo(scienceEntityListDaPan.get(1).getK()) < 0) {
                    if (scienceEntityListDaPan.get(0).getJ().compareTo(scienceEntityListDaPan.get(0).getK()) <= 0) {
                        if (scienceEntityListDaPan.get(0).getJ().compareTo(scienceEntityListDaPan.get(1).getJ()) > 0) {
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
    public static boolean jdk60shangjc(List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (scienceEntityListDaPan.get(0).getK().compareTo(new BigDecimal(70)) < 0 && scienceEntityListDaPan.get(0).getK().compareTo(new BigDecimal(60)) >= 0) {
                if (scienceEntityListDaPan.get(1).getJ().compareTo(scienceEntityListDaPan.get(1).getK()) < 0) {
                    if (scienceEntityListDaPan.get(0).getJ().compareTo(scienceEntityListDaPan.get(0).getK()) >= 0) {
                        if (scienceEntityListDaPan.get(0).getJ().compareTo(scienceEntityListDaPan.get(1).getJ()) > 0) {
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

    public static boolean jdk40shangshang(List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (scienceEntityListDaPan.get(0).getK().compareTo(new BigDecimal(60)) < 0 && scienceEntityListDaPan.get(0).getK().compareTo(new BigDecimal(40)) >= 0) {
                if (scienceEntityListDaPan.get(1).getJ().compareTo(scienceEntityListDaPan.get(1).getK()) < 0) {
                    if (scienceEntityListDaPan.get(0).getJ().compareTo(scienceEntityListDaPan.get(0).getK()) <= 0) {
                        if (scienceEntityListDaPan.get(0).getJ().compareTo(scienceEntityListDaPan.get(1).getJ()) > 0) {
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
    public static boolean jdk40shangjc(List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (scienceEntityListDaPan.get(0).getK().compareTo(new BigDecimal(60)) < 0 && scienceEntityListDaPan.get(0).getK().compareTo(new BigDecimal(40)) >= 0) {
                if (scienceEntityListDaPan.get(1).getJ().compareTo(scienceEntityListDaPan.get(1).getK()) < 0) {
                    if (scienceEntityListDaPan.get(0).getJ().compareTo(scienceEntityListDaPan.get(0).getK()) >= 0) {
                        if (scienceEntityListDaPan.get(0).getJ().compareTo(scienceEntityListDaPan.get(1).getJ()) > 0) {
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

    public static boolean jdk20shangshang(List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (scienceEntityListDaPan.get(0).getK().compareTo(new BigDecimal(40)) < 0 && scienceEntityListDaPan.get(0).getK().compareTo(new BigDecimal(20)) >= 0) {
                if (scienceEntityListDaPan.get(1).getJ().compareTo(scienceEntityListDaPan.get(1).getK()) < 0) {
                    if (scienceEntityListDaPan.get(0).getJ().compareTo(scienceEntityListDaPan.get(0).getK()) <= 0) {
                        if (scienceEntityListDaPan.get(0).getJ().compareTo(scienceEntityListDaPan.get(1).getJ()) > 0) {
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
    public static boolean jdk20shangjc(List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (scienceEntityListDaPan.get(0).getK().compareTo(new BigDecimal(40)) < 0 && scienceEntityListDaPan.get(0).getK().compareTo(new BigDecimal(20)) >= 0) {
                if (scienceEntityListDaPan.get(1).getJ().compareTo(scienceEntityListDaPan.get(1).getK()) < 0) {
                    if (scienceEntityListDaPan.get(0).getJ().compareTo(scienceEntityListDaPan.get(0).getK()) >= 0) {
                        if (scienceEntityListDaPan.get(0).getJ().compareTo(scienceEntityListDaPan.get(1).getJ()) > 0) {
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

    public static boolean jdk20xiashang(List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityListDaPan == null || scienceEntityListDaPan.size() == 0) {
            return false;
        }
        try {
            if (scienceEntityListDaPan.get(0).getK().compareTo(new BigDecimal(20)) < 0) {
                if (scienceEntityListDaPan.get(1).getJ().compareTo(scienceEntityListDaPan.get(1).getK())< 0) {
                    if (scienceEntityListDaPan.get(0).getJ().compareTo(scienceEntityListDaPan.get(0).getK()) <= 0) {
                        if (scienceEntityListDaPan.get(0).getJ().compareTo(scienceEntityListDaPan.get(1).getJ()) > 0) {
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
            if (scienceEntityListDaPan.get(0).getK().compareTo(new BigDecimal(20)) < 0) {
                if (scienceEntityListDaPan.get(1).getJ().compareTo(scienceEntityListDaPan.get(1).getK()) < 0) {
                    if (scienceEntityListDaPan.get(0).getJ().compareTo(scienceEntityListDaPan.get(0).getK()) >= 0) {
                        if (scienceEntityListDaPan.get(0).getJ().compareTo(scienceEntityListDaPan.get(1).getJ()) > 0) {
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
