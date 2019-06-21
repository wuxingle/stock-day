package com.stock.stockday.util;

import com.stock.apicommon.entity.CengDieEntity;
import com.stock.apicommon.entity.ChangeEntity;
import com.stock.apicommon.entity.ScienceEntity;
import com.stock.apicommon.entity.SunEntity;
import com.stock.apicommon.utils.KDJUtil;
import com.stock.apicommon.utils.MACDUtil;
import com.stock.apicommon.utils.patterning.StackUtil;
import com.stock.apicommon.utils.patterning.SunUtil;
import com.stock.apicommon.vo.CengDieVo;
import com.stock.apicommon.vo.KDJScienceVo;
import com.stock.apicommon.vo.MACDScienceVo;
import com.stock.apicommon.vo.SunVo;
import com.stock.stockday.entity.StockDayAll;
import org.springframework.beans.BeanUtils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class FindUtil9 {

    public static boolean duoTuXiangShangDapan2(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList, List<StockDayAll> stockDayAllListDaPan1) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        if (scienceEntityList.get(7).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa10() == null) {
            return false;
        }
        String result=dapanChang(stockDayAllListDaPan1);
        if (result.equals("1")) {
            String result2=listChang(stockDayAllListDaPan1);
            if (result2.equals("1")) {
                return true;
            }
        }
        return false;
    }

    public static boolean shengVDapan2(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList, List<StockDayAll> stockDayAllListDaPan1) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        if (scienceEntityList.get(7).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa10() == null) {
            return false;
        }
        String result=dapanChang(stockDayAllListDaPan1);
        if (result.equals("1")) {
            String result2=listChang(stockDayAllListDaPan1);
            if (result2.equals("2")) {
                return true;
            }
        }
        return false;
    }

    public static boolean reset20Dapan2(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList, List<StockDayAll> stockDayAllListDaPan1) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        if (scienceEntityList.get(7).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa10() == null) {
            return false;
        }
        String result=dapanChang(stockDayAllListDaPan1);
        if (result.equals("1")) {
            String result2=listChang(stockDayAllListDaPan1);
            if (result2.equals("3")) {
                return true;
            }
        }
        return false;
    }

    public static boolean jieQiDapan3(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList, List<StockDayAll> stockDayAllListDaPan1) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        if (scienceEntityList.get(7).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa10() == null) {
            return false;
        }
        String result=dapanChang(stockDayAllListDaPan1);
        if (result.equals("1")) {
            String result2=listChang(stockDayAllListDaPan1);
            if (result2.equals("4")) {
                return true;
            }
        }
        return false;
    }

    public static boolean jishujieqiDapan3(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList, List<StockDayAll> stockDayAllListDaPan1) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        if (scienceEntityList.get(7).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa10() == null) {
            return false;
        }
        String result=dapanChang(stockDayAllListDaPan1);
        if (result.equals("2")) {
            String result2=listChang(stockDayAllListDaPan1);
            if (result2.equals("1")) {
                return true;
            }
        }
        return false;
    }

    public static boolean jishujieqiDapan4(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList, List<StockDayAll> stockDayAllListDaPan1) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        if (scienceEntityList.get(7).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa10() == null) {
            return false;
        }
        String result=dapanChang(stockDayAllListDaPan1);
        if (result.equals("2")) {
            String result2=listChang(stockDayAllListDaPan1);
            if (result2.equals("2")) {
                return true;
            }
        }
        return false;
    }

    public static boolean jieQiDapan4(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList, List<StockDayAll> stockDayAllListDaPan1) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        if (scienceEntityList.get(7).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa10() == null) {
            return false;
        }
        String result=dapanChang(stockDayAllListDaPan1);
        if (result.equals("2")) {
            String result2=listChang(stockDayAllListDaPan1);
            if (result2.equals("3")) {
                return true;
            }
        }
        return false;
    }

    public static boolean duoTuXiangShangDapan3(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList, List<StockDayAll> stockDayAllListDaPan1) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        if (scienceEntityList.get(7).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa10() == null) {
            return false;
        }
        String result=dapanChang(stockDayAllListDaPan1);
        if (result.equals("2")) {
            String result2=listChang(stockDayAllListDaPan1);
            if (result2.equals("4")) {
                return true;
            }
        }
        return false;
    }

    public static boolean shengVDapan3(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList, List<StockDayAll> stockDayAllListDaPan1) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        if (scienceEntityList.get(7).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa10() == null) {
            return false;
        }
        String result=dapanChang(stockDayAllListDaPan1);
        if (result.equals("3")) {
            String result2=listChang(stockDayAllListDaPan1);
            if (result2.equals("1")) {
                return true;
            }
        }
        return false;
    }

    public static boolean reset20Dapan3(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList, List<StockDayAll> stockDayAllListDaPan1) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        if (scienceEntityList.get(7).getPriceMa5() == null || scienceEntityList.get(7).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa10() == null) {
            return false;
        }
        String result=dapanChang(stockDayAllListDaPan1);
        if (result.equals("3")) {
            String result2=listChang(stockDayAllListDaPan1);
            if (result2.equals("2")) {
                return true;
            }
        }
        return false;
    }

    public static boolean jieQiDapan5(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList, List<StockDayAll> stockDayAllListDaPan1) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        if (scienceEntityList.get(7).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa10() == null) {
            return false;
        }
        String result=dapanChang(stockDayAllListDaPan1);
        if (result.equals("3")) {
            String result2=listChang(stockDayAllListDaPan1);
            if (result2.equals("3")) {
                return true;
            }
        }
        return false;
    }

    public static boolean jishujieqiDapan5(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList, List<StockDayAll> stockDayAllListDaPan1) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        if (scienceEntityList.get(7).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa10() == null) {
            return false;
        }
        String result=dapanChang(stockDayAllListDaPan1);
        if (result.equals("3")) {
            String result2=listChang(stockDayAllListDaPan1);
            if (result2.equals("4")) {
                return true;
            }
        }
        return false;
    }

    public static boolean jishujieqiDapan6(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList, List<StockDayAll> stockDayAllListDaPan1) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        if (scienceEntityList.get(7).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa10() == null) {
            return false;
        }
        String result=dapanChang(stockDayAllListDaPan1);
        if (result.equals("4")) {
            String result2=listChang(stockDayAllListDaPan1);
            if (result2.equals("1")) {
                return true;
            }
        }
        return false;
    }

    public static boolean jishujieqiDapan7(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList, List<StockDayAll> stockDayAllListDaPan1) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        if (scienceEntityList.get(7).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa10() == null) {
            return false;
        }
        String result=dapanChang(stockDayAllListDaPan1);
        if (result.equals("4")) {
            String result2=listChang(stockDayAllListDaPan1);
            if (result2.equals("2")) {
                return true;
            }
        }
        return false;
    }

    public static boolean duoTuXiangShangDapan4(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList, List<StockDayAll> stockDayAllListDaPan1) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        if (scienceEntityList.get(7).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa10() == null) {
            return false;
        }
        String result=dapanChang(stockDayAllListDaPan1);
        if (result.equals("4")) {
            String result2=listChang(stockDayAllListDaPan1);
            if (result2.equals("3")) {
                return true;
            }
        }
        return false;
    }

    public static boolean shengVDapan4(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList, List<StockDayAll> stockDayAllListDaPan1) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        if (scienceEntityList.get(7).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa10() == null) {
            return false;
        }
        String result=dapanChang(stockDayAllListDaPan1);
        if (result.equals("4")) {
            String result2=listChang(stockDayAllListDaPan1);
            if (result2.equals("4")) {
                return true;
            }
        }
        return false;
    }


    public static String dapanChang(List<StockDayAll> stockDayAllListDaPan1) {
        if (stockDayAllListDaPan1 == null || stockDayAllListDaPan1.size() == 0) {
            return "0";
        }
        if (stockDayAllListDaPan1.get(0).getRateOfChange()!=null) {
            if (stockDayAllListDaPan1.get(0).getRateOfChange().compareTo(new BigDecimal(1.5)) > 0) {
                return "1";
            } else if (stockDayAllListDaPan1.get(0).getRateOfChange().compareTo(new BigDecimal(0)) > 0) {
                return "2";
            } else if (stockDayAllListDaPan1.get(0).getRateOfChange().compareTo(new BigDecimal(-1.5)) > 0) {
                return "3";
            } else if (stockDayAllListDaPan1.get(0).getRateOfChange().compareTo(new BigDecimal(-1.5)) <= 0) {
                return "4";
            }
        }
        return "0";
    }
    public static String listChang(List<StockDayAll> stockDayAllList) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return "0";
        }
        if (stockDayAllList.get(0).getRateOfChange()!=null) {
            if (stockDayAllList.get(0).getRateOfChange().compareTo(new BigDecimal(3)) > 0) {
                return "1";
            } else if (stockDayAllList.get(0).getRateOfChange().compareTo(new BigDecimal(0)) > 0) {
                return "2";
            } else if (stockDayAllList.get(0).getRateOfChange().compareTo(new BigDecimal(-3)) > 0) {
                return "3";
            } else if (stockDayAllList.get(0).getRateOfChange().compareTo(new BigDecimal(-3)) <= 0) {
                return "4";
            }
        }
        return "0";
    }
}
