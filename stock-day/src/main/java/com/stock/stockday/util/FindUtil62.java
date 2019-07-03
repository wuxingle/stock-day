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

public class FindUtil62 {

    public static boolean duoTuXiangShangDapan2(List<StockDayAll> stockDayAllList,List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try {
            if (sunUtil(stockDayAllList)) {
                boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
                boolean result2 = FindUtil50.kdj20xiashang(scienceEntityListDaPan);
                if (result && result2) {
                    boolean result1 = FindUtil50.kdj20xiashang(scienceEntityList);
                    if (result1) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean shengVDapan2(List<StockDayAll> stockDayAllList,List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try {
            if (sunUtil(stockDayAllList)) {
                boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
                boolean result2 = FindUtil50.kdj20xiashang(scienceEntityListDaPan);
                if (result && result2) {
                    boolean result1 = FindUtil50.kdj20xiajc(scienceEntityList);
                    if (result1) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean reset20Dapan2(List<StockDayAll> stockDayAllList,List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try {
            if (sunUtil(stockDayAllList)) {
                boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
                boolean result2 = FindUtil50.kdj20xiashang(scienceEntityListDaPan);
                if (result && result2) {
                    boolean result1 = FindUtil50.kdj50xiashang(scienceEntityList);
                    if (result1) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jieQiDapan3(List<StockDayAll> stockDayAllList,List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {

        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try {
            if (sunUtil(stockDayAllList)) {
                boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
                boolean result2 = FindUtil50.kdj20xiashang(scienceEntityListDaPan);
                if (result && result2) {
                    boolean result1 = FindUtil50.kdj50xiajc(scienceEntityList);
                    if (result1) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jishujieqiDapan3(List<StockDayAll> stockDayAllList,List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try {
            if (sunUtil(stockDayAllList)) {
                boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
                boolean result2 = FindUtil50.kdj20xiashang(scienceEntityListDaPan);
                if (result && result2) {
                    boolean result1 = FindUtil50.kdj50shangshang(scienceEntityList);
                    if (result1) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jieQiDapan10(List<StockDayAll> stockDayAllList,List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {

        try {
            if (sunUtil(stockDayAllList)) {
                boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
                boolean result2 = FindUtil50.kdj20xiashang(scienceEntityListDaPan);
                if (result && result2) {
                    boolean result1 = FindUtil50.kdj50shangjc(scienceEntityList);
                    if (result1) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jishujieqiDapan4(List<StockDayAll> stockDayAllList,List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try {
            if (sunUtil(stockDayAllList)) {
                boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
                boolean result2 = FindUtil50.kdj20xiajc(scienceEntityListDaPan);
                if (result && result2) {
                    boolean result1 = FindUtil50.kdj20xiashang(scienceEntityList);
                    if (result1) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jieQiDapan4(List<StockDayAll> stockDayAllList,List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try {
            if (sunUtil(stockDayAllList)) {
                boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
                boolean result2 = FindUtil50.kdj20xiajc(scienceEntityListDaPan);
                if (result && result2) {
                    boolean result1 = FindUtil50.kdj20xiajc(scienceEntityList);
                    if (result1) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean duoTuXiangShangDapan3(List<StockDayAll> stockDayAllList,List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try {
            if (sunUtil(stockDayAllList)) {
                boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
                boolean result2 = FindUtil50.kdj20xiajc(scienceEntityListDaPan);
                if (result && result2) {
                    boolean result1 = FindUtil50.kdj50xiashang(scienceEntityList);
                    if (result1) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean shengVDapan3(List<StockDayAll> stockDayAllList,List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try {
            if (sunUtil(stockDayAllList)) {
                boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
                boolean result2 = FindUtil50.kdj20xiajc(scienceEntityListDaPan);
                if (result && result2) {
                    boolean result1 = FindUtil50.kdj50xiajc(scienceEntityList);
                    if (result1) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean reset20Dapan3(List<StockDayAll> stockDayAllList,List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try {
            if (sunUtil(stockDayAllList)) {
                boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
                boolean result2 = FindUtil50.kdj20xiajc(scienceEntityListDaPan);
                if (result && result2) {
                    boolean result1 = FindUtil50.kdj50shangshang(scienceEntityList);
                    if (result1) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jieQiDapan5(List<StockDayAll> stockDayAllList,List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try {
            if (sunUtil(stockDayAllList)) {
                boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
                boolean result2 = FindUtil50.kdj20xiajc(scienceEntityListDaPan);
                if (result && result2) {
                    boolean result1 = FindUtil50.kdj50shangjc(scienceEntityList);
                    if (result1) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jishujieqiDapan5(List<StockDayAll> stockDayAllList,List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try {
            if (sunUtil(stockDayAllList)) {
                boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
                boolean result2 = FindUtil50.kdj50xiashang(scienceEntityListDaPan);
                if (result && result2) {
                    boolean result1 = FindUtil50.kdj20xiashang(scienceEntityList);
                    if (result1) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jishujieqiDapan6(List<StockDayAll> stockDayAllList,List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try {
            if (sunUtil(stockDayAllList)) {
                boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
                boolean result2 = FindUtil50.kdj50xiashang(scienceEntityListDaPan);
                if (result && result2) {
                    boolean result1 = FindUtil50.kdj20xiajc(scienceEntityList);
                    if (result1) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jishujieqiDapan7(List<StockDayAll> stockDayAllList,List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try {
            if (sunUtil(stockDayAllList)) {
                boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
                boolean result2 = FindUtil50.kdj50xiashang(scienceEntityListDaPan);
                if (result && result2) {
                    boolean result1 = FindUtil50.kdj50xiashang(scienceEntityList);
                    if (result1) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean duoTuXiangShangDapan4(List<StockDayAll> stockDayAllList,List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try {
            if (sunUtil(stockDayAllList)) {
                boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
                boolean result2 = FindUtil50.kdj50xiashang(scienceEntityListDaPan);
                if (result && result2) {
                    boolean result1 = FindUtil50.kdj50xiajc(scienceEntityList);
                    if (result1) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean shengVDapan4(List<StockDayAll> stockDayAllList,List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try {
            if (sunUtil(stockDayAllList)) {
                boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
                boolean result2 = FindUtil50.kdj50xiashang(scienceEntityListDaPan);
                if (result && result2) {
                    boolean result1 = FindUtil50.kdj50shangshang(scienceEntityList);
                    if (result1) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean reset20Dapan4(List<StockDayAll> stockDayAllList,List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try {
            if (sunUtil(stockDayAllList)) {
                boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
                boolean result2 = FindUtil50.kdj50xiashang(scienceEntityListDaPan);
                if (result && result2) {
                    boolean result1 = FindUtil50.kdj50shangjc(scienceEntityList);
                    if (result1) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jieQiDapan6(List<StockDayAll> stockDayAllList,List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try {
            if (sunUtil(stockDayAllList)) {
                boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
                boolean result2 = FindUtil50.kdj50xiajc(scienceEntityListDaPan);
                if (result && result2) {
                    boolean result1 = FindUtil50.kdj20xiashang(scienceEntityList);
                    if (result1) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jishujieqiDapan8(List<StockDayAll> stockDayAllList,List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try {
            if (sunUtil(stockDayAllList)) {
                boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
                boolean result2 = FindUtil50.kdj50xiajc(scienceEntityListDaPan);
                if (result && result2) {
                    boolean result1 = FindUtil50.kdj20xiajc(scienceEntityList);
                    if (result1) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jishujieqiDapan9(List<StockDayAll> stockDayAllList,List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try {
            if (sunUtil(stockDayAllList)) {
                boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
                boolean result2 = FindUtil50.kdj50xiajc(scienceEntityListDaPan);
                if (result && result2) {
                    boolean result1 = FindUtil50.kdj50xiashang(scienceEntityList);
                    if (result1) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jieQiDapan7(List<StockDayAll> stockDayAllList,List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        try {
            if (sunUtil(stockDayAllList)) {
                boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
                boolean result2 = FindUtil50.kdj50xiajc(scienceEntityListDaPan);
                if (result && result2) {
                    boolean result1 = FindUtil50.kdj50xiajc(scienceEntityList);
                    if (result1) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jieQiDapan8(List<StockDayAll> stockDayAllList,List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {

        try {
            if (sunUtil(stockDayAllList)) {
                boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
                boolean result2 = FindUtil50.kdj50xiajc(scienceEntityListDaPan);
                if (result && result2) {
                    boolean result1 = FindUtil50.kdj50shangshang(scienceEntityList);
                    if (result1) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jieQiDapan9(List<StockDayAll> stockDayAllList,List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        try {
            if (sunUtil(stockDayAllList)) {
                boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
                boolean result2 = FindUtil50.kdj50xiajc(scienceEntityListDaPan);
                if (result && result2) {
                    boolean result1 = FindUtil50.kdj50shangjc(scienceEntityList);
                    if (result1) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jieQiDapan11(List<StockDayAll> stockDayAllList,List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        try {
            if (sunUtil(stockDayAllList)) {
                boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
                boolean result2 = FindUtil50.kdj50shangshang(scienceEntityListDaPan);
                if (result && result2) {
                    boolean result1 = FindUtil50.kdj20xiashang(scienceEntityList);
                    if (result1) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jieQiDapan12(List<StockDayAll> stockDayAllList,List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {

        try {
            if (sunUtil(stockDayAllList)) {
                boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
                boolean result2 = FindUtil50.kdj50shangshang(scienceEntityListDaPan);
                if (result && result2) {
                    boolean result1 = FindUtil50.kdj20xiajc(scienceEntityList);
                    if (result1) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jieQiDapan13(List<StockDayAll> stockDayAllList,List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        try {
            if (sunUtil(stockDayAllList)) {
                boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
                boolean result2 = FindUtil50.kdj50shangshang(scienceEntityListDaPan);
                if (result && result2) {
                    boolean result1 = FindUtil50.kdj50xiashang(scienceEntityList);
                    if (result1) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jieQiDapan14(List<StockDayAll> stockDayAllList,List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        try {
            if (sunUtil(stockDayAllList)) {
                boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
                boolean result2 = FindUtil50.kdj50shangshang(scienceEntityListDaPan);
                if (result && result2) {
                    boolean result1 = FindUtil50.kdj50xiajc(scienceEntityList);
                    if (result1) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jieQiDapan15(List<StockDayAll> stockDayAllList,List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {

        try {
            if (sunUtil(stockDayAllList)) {
                boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
                boolean result2 = FindUtil50.kdj50shangshang(scienceEntityListDaPan);
                if (result && result2) {
                    boolean result1 = FindUtil50.kdj50shangshang(scienceEntityList);
                    if (result1) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jieQiDapan16(List<StockDayAll> stockDayAllList,List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        try {
            if (sunUtil(stockDayAllList)) {
                boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
                boolean result2 = FindUtil50.kdj50shangshang(scienceEntityListDaPan);
                if (result && result2) {
                    boolean result1 = FindUtil50.kdj50shangjc(scienceEntityList);
                    if (result1) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jieQiDapan17(List<StockDayAll> stockDayAllList,List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        try {
            if (sunUtil(stockDayAllList)) {
                boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
                boolean result2 = FindUtil50.kdj50shangjc(scienceEntityListDaPan);
                if (result && result2) {
                    boolean result1 = FindUtil50.kdj20xiashang(scienceEntityList);
                    if (result1) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jieQiDapan18(List<StockDayAll> stockDayAllList,List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {

        try {
            if (sunUtil(stockDayAllList)) {
                boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
                boolean result2 = FindUtil50.kdj50shangjc(scienceEntityListDaPan);
                if (result && result2) {
                    boolean result1 = FindUtil50.kdj20xiajc(scienceEntityList);
                    if (result1) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jieQiDapan19(List<StockDayAll> stockDayAllList,List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        try {
            if (sunUtil(stockDayAllList)) {
                boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
                boolean result2 = FindUtil50.kdj50shangjc(scienceEntityListDaPan);
                if (result && result2) {
                    boolean result1 = FindUtil50.kdj50xiashang(scienceEntityList);
                    if (result1) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jieQiDapan20(List<StockDayAll> stockDayAllList,List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        try {
            if (sunUtil(stockDayAllList)) {
                boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
                boolean result2 = FindUtil50.kdj50shangjc(scienceEntityListDaPan);
                if (result && result2) {
                    boolean result1 = FindUtil50.kdj50xiajc(scienceEntityList);
                    if (result1) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jieQiDapan21(List<StockDayAll> stockDayAllList,List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {

        try {
            if (sunUtil(stockDayAllList)) {
                boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
                boolean result2 = FindUtil50.kdj50shangjc(scienceEntityListDaPan);
                if (result && result2) {
                    boolean result1 = FindUtil50.kdj50shangshang(scienceEntityList);
                    if (result1) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jieQiDapan22(List<StockDayAll> stockDayAllList,List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        try {
            if (sunUtil(stockDayAllList)) {
                boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
                boolean result2 = FindUtil50.kdj50shangjc(scienceEntityListDaPan);
                if (result && result2) {
                    boolean result1 = FindUtil50.kdj50shangjc(scienceEntityList);
                    if (result1) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean sunUtil(List<StockDayAll> stockDayAllList) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        try {
            List<SunEntity> sunEntityList = new ArrayList<>();
            for (StockDayAll stockDayAll : stockDayAllList) {
                SunEntity sunEntity = new SunEntity();
                BeanUtils.copyProperties(stockDayAll, sunEntity);
                sunEntityList.add(sunEntity);
            }
            SunVo sunVo = SunUtil.getSun(sunEntityList);
            if ((sunVo != null && (sunVo.getLiangGeTaiYang()!=null||sunVo.getGuangTouChuanYun()!=null||sunVo.getYangGuangPuZhao()!=null||sunVo.getShuGuangChuXian()!=null||sunVo.getQingKongWanLi()!=null||sunVo.getShangShenSanLieYang() != null || sunVo.getHongSanBing() != null || sunVo.getSanGeTaiYang() != null || sunVo.getBinPaiHong() != null))) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }


}
