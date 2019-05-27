package com.stock.stockday.util;

import com.stock.stockday.entity.StockDayYanPan24;
import com.stock.stockday.entity.StockDayYanPan33;
import com.stock.stockday.entity.StockDayYanPan42;
import com.stock.stockday.entity.StockDayYanPanBenpan;
import com.stock.stockday.entity.StockDayYanPanChunJishu;
import com.stock.stockday.entity.StockDayYanPanChunTuxing;
import com.stock.stockday.entity.StockDayYanPanDapan;
import com.stock.stockday.entity.StockDayYanPanUpUp;
import com.stock.stockday.entity.StockDayYanPanZhuYanJiShu;
import org.apache.commons.lang.StringUtils;

public class GetString {
    public static String getUpUpString(StockDayYanPanUpUp stockDayYanPanUpUp) {
        StringBuffer stringBuffer = new StringBuffer();
        if (StringUtils.isEmpty(stockDayYanPanUpUp.getLiangXian())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPanUpUp.getLiangXian() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPanUpUp.getSanXian())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPanUpUp.getSanXian() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPanUpUp.getSiXian())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPanUpUp.getSiXian() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPanUpUp.getWuXian())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPanUpUp.getWuXian() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPanUpUp.getKdj())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPanUpUp.getKdj() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPanUpUp.getMacd())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPanUpUp.getMacd() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPanUpUp.getQuantityMa())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPanUpUp.getQuantityMa() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPanUpUp.getPriceMa())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPanUpUp.getPriceMa() + "—");
        }
        if (stockDayYanPanUpUp.getShangZhangSum1() == null) {
            stringBuffer.append("上1sum,0—");
        } else {
            stringBuffer.append("上1sum," + stockDayYanPanUpUp.getShangZhangSum1() + "—");
        }
        if (stockDayYanPanUpUp.getShangZhangMa1() == null) {
            stringBuffer.append("上1ma,0—");
        } else {
            stringBuffer.append("上1ma," + stockDayYanPanUpUp.getShangZhangMa1() + "—");
        }
        if (stockDayYanPanUpUp.getShangZhangCount1() == null) {
            stringBuffer.append("上1count,0—");
        } else {
            stringBuffer.append("上1count," + stockDayYanPanUpUp.getShangZhangCount1() + "—");
        }
        if (stockDayYanPanUpUp.getShangZhangRate1() == null) {
            stringBuffer.append("上1rate,0—");
        } else {
            stringBuffer.append("上1rate," + stockDayYanPanUpUp.getShangZhangRate1() + "—");
        }
        if (stockDayYanPanUpUp.getXiaJiangSum1() == null) {
            stringBuffer.append("下1sum,0—");
        } else {
            stringBuffer.append("下1sum," + stockDayYanPanUpUp.getXiaJiangSum1() + "—");
        }
        if (stockDayYanPanUpUp.getXiaJiangMa1() == null) {
            stringBuffer.append("下1ma,0—");
        } else {
            stringBuffer.append("下1ma," + stockDayYanPanUpUp.getXiaJiangMa1() + "—");
        }
        if (stockDayYanPanUpUp.getXiaJiangCount1() == null) {
            stringBuffer.append("下1count,0—");
        } else {
            stringBuffer.append("下1count," + stockDayYanPanUpUp.getXiaJiangCount1() + "—");
        }
        if (stockDayYanPanUpUp.getXiaJiangRate1() == null) {
            stringBuffer.append("下1rate,0—");
        } else {
            stringBuffer.append("下1rate," + stockDayYanPanUpUp.getXiaJiangRate1() + "—");
        }
        if (stockDayYanPanUpUp.getShangZhangSum2() == null) {
            stringBuffer.append("上2sum,0—");
        } else {
            stringBuffer.append("上2sum," + stockDayYanPanUpUp.getShangZhangSum2() + "—");
        }
        if (stockDayYanPanUpUp.getShangZhangMa2() == null) {
            stringBuffer.append("上2ma,0—");
        } else {
            stringBuffer.append("上2ma," + stockDayYanPanUpUp.getShangZhangMa2() + "—");
        }
        if (stockDayYanPanUpUp.getShangZhangCount2() == null) {
            stringBuffer.append("上2count,0—");
        } else {
            stringBuffer.append("上2count," + stockDayYanPanUpUp.getShangZhangCount2() + "—");
        }
        if (stockDayYanPanUpUp.getShangZhangRate2() == null) {
            stringBuffer.append("上2rate,0—");
        } else {
            stringBuffer.append("上2rate," + stockDayYanPanUpUp.getShangZhangRate2() + "—");
        }
        if (stockDayYanPanUpUp.getXiaJiangSum2() == null) {
            stringBuffer.append("下2sum,0—");
        } else {
            stringBuffer.append("下2sum," + stockDayYanPanUpUp.getXiaJiangSum2() + "—");
        }
        if (stockDayYanPanUpUp.getXiaJiangMa2() == null) {
            stringBuffer.append("下2ma,0—");
        } else {
            stringBuffer.append("下2ma," + stockDayYanPanUpUp.getXiaJiangMa2() + "—");
        }
        if (stockDayYanPanUpUp.getXiaJiangCount2() == null) {
            stringBuffer.append("下2count,0—");
        } else {
            stringBuffer.append("下2count," + stockDayYanPanUpUp.getXiaJiangCount2() + "—");
        }
        if (stockDayYanPanUpUp.getXiaJiangRate2() == null) {
            stringBuffer.append("下2rate,0—");
        } else {
            stringBuffer.append("下2rate," + stockDayYanPanUpUp.getXiaJiangRate2() + "—");
        }
        if (stockDayYanPanUpUp.getShangZhangSum3() == null) {
            stringBuffer.append("上3sum,0—");
        } else {
            stringBuffer.append("上3sum," + stockDayYanPanUpUp.getShangZhangSum3() + "—");
        }
        if (stockDayYanPanUpUp.getShangZhangMa3() == null) {
            stringBuffer.append("上3ma,0—");
        } else {
            stringBuffer.append("上3ma," + stockDayYanPanUpUp.getShangZhangMa3() + "—");
        }
        if (stockDayYanPanUpUp.getShangZhangCount3() == null) {
            stringBuffer.append("上3count,0—");
        } else {
            stringBuffer.append("上3count," + stockDayYanPanUpUp.getShangZhangCount3() + "—");
        }
        if (stockDayYanPanUpUp.getShangZhangRate3() == null) {
            stringBuffer.append("上3rate,0—");
        } else {
            stringBuffer.append("上3rate," + stockDayYanPanUpUp.getShangZhangRate3() + "—");
        }
        if (stockDayYanPanUpUp.getXiaJiangSum3() == null) {
            stringBuffer.append("下3sum,0—");
        } else {
            stringBuffer.append("下3sum," + stockDayYanPanUpUp.getXiaJiangSum3() + "—");
        }
        if (stockDayYanPanUpUp.getXiaJiangMa3() == null) {
            stringBuffer.append("下3ma,0—");
        } else {
            stringBuffer.append("下3ma," + stockDayYanPanUpUp.getXiaJiangMa3() + "—");
        }
        if (stockDayYanPanUpUp.getXiaJiangCount3() == null) {
            stringBuffer.append("下3count,0—");
        } else {
            stringBuffer.append("下3count," + stockDayYanPanUpUp.getXiaJiangCount3() + "—");
        }
        if (stockDayYanPanUpUp.getXiaJiangRate3() == null) {
            stringBuffer.append("下3rate,0—");
        } else {
            stringBuffer.append("下3rate," + stockDayYanPanUpUp.getXiaJiangRate3() + "—");
        }
        if (stockDayYanPanUpUp.getShangZhangSum5() == null) {
            stringBuffer.append("上5sum,0—");
        } else {
            stringBuffer.append("上5sum," + stockDayYanPanUpUp.getShangZhangSum5() + "—");
        }
        if (stockDayYanPanUpUp.getShangZhangMa5() == null) {
            stringBuffer.append("上5ma,0—");
        } else {
            stringBuffer.append("上5ma," + stockDayYanPanUpUp.getShangZhangMa5() + "—");
        }
        if (stockDayYanPanUpUp.getShangZhangCount5() == null) {
            stringBuffer.append("上5count,0—");
        } else {
            stringBuffer.append("上5count," + stockDayYanPanUpUp.getShangZhangCount5() + "—");
        }
        if (stockDayYanPanUpUp.getShangZhangRate5() == null) {
            stringBuffer.append("上5rate,0—");
        } else {
            stringBuffer.append("上5rate," + stockDayYanPanUpUp.getShangZhangRate5() + "—");
        }
        if (stockDayYanPanUpUp.getXiaJiangSum5() == null) {
            stringBuffer.append("下5sum,0—");
        } else {
            stringBuffer.append("下5sum," + stockDayYanPanUpUp.getXiaJiangSum5() + "—");
        }
        if (stockDayYanPanUpUp.getXiaJiangMa5() == null) {
            stringBuffer.append("下5ma,0—");
        } else {
            stringBuffer.append("下5ma," + stockDayYanPanUpUp.getXiaJiangMa5() + "—");
        }
        if (stockDayYanPanUpUp.getXiaJiangCount5() == null) {
            stringBuffer.append("下5count,0—");
        } else {
            stringBuffer.append("下5count," + stockDayYanPanUpUp.getXiaJiangCount5() + "—");
        }
        if (stockDayYanPanUpUp.getXiaJiangRate5() == null) {
            stringBuffer.append("下5rate,0—");
        } else {
            stringBuffer.append("下5rate," + stockDayYanPanUpUp.getXiaJiangRate5() + "—");
        }
        if (stockDayYanPanUpUp.getShangZhangSum8() == null) {
            stringBuffer.append("上8sum,0—");
        } else {
            stringBuffer.append("上8sum," + stockDayYanPanUpUp.getShangZhangSum8() + "—");
        }
        if (stockDayYanPanUpUp.getShangZhangMa8() == null) {
            stringBuffer.append("上8ma,0—");
        } else {
            stringBuffer.append("上8ma," + stockDayYanPanUpUp.getShangZhangMa8() + "—");
        }
        if (stockDayYanPanUpUp.getShangZhangCount8() == null) {
            stringBuffer.append("上8count,0—");
        } else {
            stringBuffer.append("上8count," + stockDayYanPanUpUp.getShangZhangCount8() + "—");
        }
        if (stockDayYanPanUpUp.getShangZhangRate8() == null) {
            stringBuffer.append("上8rate,0—");
        } else {
            stringBuffer.append("上8rate," + stockDayYanPanUpUp.getShangZhangRate8() + "—");
        }
        if (stockDayYanPanUpUp.getXiaJiangSum8() == null) {
            stringBuffer.append("下8sum,0—");
        } else {
            stringBuffer.append("下8sum," + stockDayYanPanUpUp.getXiaJiangSum8() + "—");
        }
        if (stockDayYanPanUpUp.getXiaJiangMa8() == null) {
            stringBuffer.append("下8ma,0—");
        } else {
            stringBuffer.append("下8ma," + stockDayYanPanUpUp.getXiaJiangMa8() + "—");
        }
        if (stockDayYanPanUpUp.getXiaJiangCount8() == null) {
            stringBuffer.append("下8count,0—");
        } else {
            stringBuffer.append("下8count," + stockDayYanPanUpUp.getXiaJiangCount8() + "—");
        }
        if (stockDayYanPanUpUp.getXiaJiangRate8() == null) {
            stringBuffer.append("下8rate,0—");
        } else {
            stringBuffer.append("下8rate," + stockDayYanPanUpUp.getXiaJiangRate8() + "—");
        }
        if (stockDayYanPanUpUp.getShangZhangSum13() == null) {
            stringBuffer.append("上13sum,0—");
        } else {
            stringBuffer.append("上13sum," + stockDayYanPanUpUp.getShangZhangSum13() + "—");
        }
        if (stockDayYanPanUpUp.getShangZhangMa13() == null) {
            stringBuffer.append("上13ma,0—");
        } else {
            stringBuffer.append("上13ma," + stockDayYanPanUpUp.getShangZhangMa13() + "—");
        }
        if (stockDayYanPanUpUp.getShangZhangCount13() == null) {
            stringBuffer.append("上13count,0—");
        } else {
            stringBuffer.append("上13count," + stockDayYanPanUpUp.getShangZhangCount13() + "—");
        }
        if (stockDayYanPanUpUp.getShangZhangRate13() == null) {
            stringBuffer.append("上13rate,0—");
        } else {
            stringBuffer.append("上13rate," + stockDayYanPanUpUp.getShangZhangRate13() + "—");
        }
        if (stockDayYanPanUpUp.getXiaJiangSum13() == null) {
            stringBuffer.append("下13sum,0—");
        } else {
            stringBuffer.append("下13sum," + stockDayYanPanUpUp.getXiaJiangSum13() + "—");
        }
        if (stockDayYanPanUpUp.getXiaJiangMa13() == null) {
            stringBuffer.append("下13ma,0—");
        } else {
            stringBuffer.append("下13ma," + stockDayYanPanUpUp.getXiaJiangMa13() + "—");
        }
        if (stockDayYanPanUpUp.getXiaJiangCount13() == null) {
            stringBuffer.append("下13count,0—");
        } else {
            stringBuffer.append("下13count," + stockDayYanPanUpUp.getXiaJiangCount13() + "—");
        }
        if (stockDayYanPanUpUp.getXiaJiangRate13() == null) {
            stringBuffer.append("下13rate,0—");
        } else {
            stringBuffer.append("下13rate," + stockDayYanPanUpUp.getXiaJiangRate13() + "—");
        }
        if (stockDayYanPanUpUp.getShangZhangSum20() == null) {
            stringBuffer.append("上20sum,0—");
        } else {
            stringBuffer.append("上20sum," + stockDayYanPanUpUp.getShangZhangSum20() + "—");
        }
        if (stockDayYanPanUpUp.getShangZhangMa20() == null) {
            stringBuffer.append("上20ma,0—");
        } else {
            stringBuffer.append("上20ma," + stockDayYanPanUpUp.getShangZhangMa20() + "—");
        }
        if (stockDayYanPanUpUp.getShangZhangCount20() == null) {
            stringBuffer.append("上20count,0—");
        } else {
            stringBuffer.append("上20count," + stockDayYanPanUpUp.getShangZhangCount20() + "—");
        }
        if (stockDayYanPanUpUp.getShangZhangRate1() == null) {
            stringBuffer.append("上20rate,0—");
        } else {
            stringBuffer.append("上20rate," + stockDayYanPanUpUp.getShangZhangRate1() + "—");
        }
        if (stockDayYanPanUpUp.getXiaJiangSum20() == null) {
            stringBuffer.append("下20sum,0—");
        } else {
            stringBuffer.append("下20sum," + stockDayYanPanUpUp.getXiaJiangSum20() + "—");
        }
        if (stockDayYanPanUpUp.getXiaJiangMa20() == null) {
            stringBuffer.append("下20ma,0—");
        } else {
            stringBuffer.append("下20ma," + stockDayYanPanUpUp.getXiaJiangMa20() + "—");
        }
        if (stockDayYanPanUpUp.getXiaJiangCount20() == null) {
            stringBuffer.append("下20count,0—");
        } else {
            stringBuffer.append("下20count," + stockDayYanPanUpUp.getXiaJiangCount20() + "—");
        }
        if (stockDayYanPanUpUp.getXiaJiangRate20() == null) {
            stringBuffer.append("下20rate,0—");
        } else {
            stringBuffer.append("下20rate," + stockDayYanPanUpUp.getXiaJiangRate20());
        }
        return stringBuffer.toString();
    }

    public static String get24String(StockDayYanPan24 stockDayYanPan24) {
        StringBuffer stringBuffer = new StringBuffer();
        if (StringUtils.isEmpty(stockDayYanPan24.getDangRi())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPan24.getDangRi() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPan24.getSanXian())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPan24.getSanXian() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPan24.getKdj())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPan24.getKdj() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPan24.getMacd())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPan24.getMacd() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPan24.getQuantityMa())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPan24.getQuantityMa() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPan24.getPriceMa())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPan24.getPriceMa() + "—");
        }
        if (stockDayYanPan24.getShangZhangSum1() == null) {
            stringBuffer.append("上1sum,0—");
        } else {
            stringBuffer.append("上1sum," + stockDayYanPan24.getShangZhangSum1() + "—");
        }
        if (stockDayYanPan24.getShangZhangMa1() == null) {
            stringBuffer.append("上1ma,0—");
        } else {
            stringBuffer.append("上1ma," + stockDayYanPan24.getShangZhangMa1() + "—");
        }
        if (stockDayYanPan24.getShangZhangCount1() == null) {
            stringBuffer.append("上1count,0—");
        } else {
            stringBuffer.append("上1count," + stockDayYanPan24.getShangZhangCount1() + "—");
        }
        if (stockDayYanPan24.getShangZhangRate1() == null) {
            stringBuffer.append("上1rate,0—");
        } else {
            stringBuffer.append("上1rate," + stockDayYanPan24.getShangZhangRate1() + "—");
        }
        if (stockDayYanPan24.getXiaJiangSum1() == null) {
            stringBuffer.append("下1sum,0—");
        } else {
            stringBuffer.append("下1sum," + stockDayYanPan24.getXiaJiangSum1() + "—");
        }
        if (stockDayYanPan24.getXiaJiangMa1() == null) {
            stringBuffer.append("下1ma,0—");
        } else {
            stringBuffer.append("下1ma," + stockDayYanPan24.getXiaJiangMa1() + "—");
        }
        if (stockDayYanPan24.getXiaJiangCount1() == null) {
            stringBuffer.append("下1count,0—");
        } else {
            stringBuffer.append("下1count," + stockDayYanPan24.getXiaJiangCount1() + "—");
        }
        if (stockDayYanPan24.getXiaJiangRate1() == null) {
            stringBuffer.append("下1rate,0—");
        } else {
            stringBuffer.append("下1rate," + stockDayYanPan24.getXiaJiangRate1() + "—");
        }
        if (stockDayYanPan24.getShangZhangSum2() == null) {
            stringBuffer.append("上2sum,0—");
        } else {
            stringBuffer.append("上2sum," + stockDayYanPan24.getShangZhangSum2() + "—");
        }
        if (stockDayYanPan24.getShangZhangMa2() == null) {
            stringBuffer.append("上2ma,0—");
        } else {
            stringBuffer.append("上2ma," + stockDayYanPan24.getShangZhangMa2() + "—");
        }
        if (stockDayYanPan24.getShangZhangCount2() == null) {
            stringBuffer.append("上2count,0—");
        } else {
            stringBuffer.append("上2count," + stockDayYanPan24.getShangZhangCount2() + "—");
        }
        if (stockDayYanPan24.getShangZhangRate2() == null) {
            stringBuffer.append("上2rate,0—");
        } else {
            stringBuffer.append("上2rate," + stockDayYanPan24.getShangZhangRate2() + "—");
        }
        if (stockDayYanPan24.getXiaJiangSum2() == null) {
            stringBuffer.append("下2sum,0—");
        } else {
            stringBuffer.append("下2sum," + stockDayYanPan24.getXiaJiangSum2() + "—");
        }
        if (stockDayYanPan24.getXiaJiangMa2() == null) {
            stringBuffer.append("下2ma,0—");
        } else {
            stringBuffer.append("下2ma," + stockDayYanPan24.getXiaJiangMa2() + "—");
        }
        if (stockDayYanPan24.getXiaJiangCount2() == null) {
            stringBuffer.append("下2count,0—");
        } else {
            stringBuffer.append("下2count," + stockDayYanPan24.getXiaJiangCount2() + "—");
        }
        if (stockDayYanPan24.getXiaJiangRate2() == null) {
            stringBuffer.append("下2rate,0—");
        } else {
            stringBuffer.append("下2rate," + stockDayYanPan24.getXiaJiangRate2() + "—");
        }
        if (stockDayYanPan24.getShangZhangSum3() == null) {
            stringBuffer.append("上3sum,0—");
        } else {
            stringBuffer.append("上3sum," + stockDayYanPan24.getShangZhangSum3() + "—");
        }
        if (stockDayYanPan24.getShangZhangMa3() == null) {
            stringBuffer.append("上3ma,0—");
        } else {
            stringBuffer.append("上3ma," + stockDayYanPan24.getShangZhangMa3() + "—");
        }
        if (stockDayYanPan24.getShangZhangCount3() == null) {
            stringBuffer.append("上3count,0—");
        } else {
            stringBuffer.append("上3count," + stockDayYanPan24.getShangZhangCount3() + "—");
        }
        if (stockDayYanPan24.getShangZhangRate3() == null) {
            stringBuffer.append("上3rate,0—");
        } else {
            stringBuffer.append("上3rate," + stockDayYanPan24.getShangZhangRate3() + "—");
        }
        if (stockDayYanPan24.getXiaJiangSum3() == null) {
            stringBuffer.append("下3sum,0—");
        } else {
            stringBuffer.append("下3sum," + stockDayYanPan24.getXiaJiangSum3() + "—");
        }
        if (stockDayYanPan24.getXiaJiangMa3() == null) {
            stringBuffer.append("下3ma,0—");
        } else {
            stringBuffer.append("下3ma," + stockDayYanPan24.getXiaJiangMa3() + "—");
        }
        if (stockDayYanPan24.getXiaJiangCount3() == null) {
            stringBuffer.append("下3count,0—");
        } else {
            stringBuffer.append("下3count," + stockDayYanPan24.getXiaJiangCount3() + "—");
        }
        if (stockDayYanPan24.getXiaJiangRate3() == null) {
            stringBuffer.append("下3rate,0—");
        } else {
            stringBuffer.append("下3rate," + stockDayYanPan24.getXiaJiangRate3() + "—");
        }
        if (stockDayYanPan24.getShangZhangSum5() == null) {
            stringBuffer.append("上5sum,0—");
        } else {
            stringBuffer.append("上5sum," + stockDayYanPan24.getShangZhangSum5() + "—");
        }
        if (stockDayYanPan24.getShangZhangMa5() == null) {
            stringBuffer.append("上5ma,0—");
        } else {
            stringBuffer.append("上5ma," + stockDayYanPan24.getShangZhangMa5() + "—");
        }
        if (stockDayYanPan24.getShangZhangCount5() == null) {
            stringBuffer.append("上5count,0—");
        } else {
            stringBuffer.append("上5count," + stockDayYanPan24.getShangZhangCount5() + "—");
        }
        if (stockDayYanPan24.getShangZhangRate5() == null) {
            stringBuffer.append("上5rate,0—");
        } else {
            stringBuffer.append("上5rate," + stockDayYanPan24.getShangZhangRate5() + "—");
        }
        if (stockDayYanPan24.getXiaJiangSum5() == null) {
            stringBuffer.append("下5sum,0—");
        } else {
            stringBuffer.append("下5sum," + stockDayYanPan24.getXiaJiangSum5() + "—");
        }
        if (stockDayYanPan24.getXiaJiangMa5() == null) {
            stringBuffer.append("下5ma,0—");
        } else {
            stringBuffer.append("下5ma," + stockDayYanPan24.getXiaJiangMa5() + "—");
        }
        if (stockDayYanPan24.getXiaJiangCount5() == null) {
            stringBuffer.append("下5count,0—");
        } else {
            stringBuffer.append("下5count," + stockDayYanPan24.getXiaJiangCount5() + "—");
        }
        if (stockDayYanPan24.getXiaJiangRate5() == null) {
            stringBuffer.append("下5rate,0—");
        } else {
            stringBuffer.append("下5rate," + stockDayYanPan24.getXiaJiangRate5() + "—");
        }
        if (stockDayYanPan24.getShangZhangSum8() == null) {
            stringBuffer.append("上8sum,0—");
        } else {
            stringBuffer.append("上8sum," + stockDayYanPan24.getShangZhangSum8() + "—");
        }
        if (stockDayYanPan24.getShangZhangMa8() == null) {
            stringBuffer.append("上8ma,0—");
        } else {
            stringBuffer.append("上8ma," + stockDayYanPan24.getShangZhangMa8() + "—");
        }
        if (stockDayYanPan24.getShangZhangCount8() == null) {
            stringBuffer.append("上8count,0—");
        } else {
            stringBuffer.append("上8count," + stockDayYanPan24.getShangZhangCount8() + "—");
        }
        if (stockDayYanPan24.getShangZhangRate8() == null) {
            stringBuffer.append("上8rate,0—");
        } else {
            stringBuffer.append("上8rate," + stockDayYanPan24.getShangZhangRate8() + "—");
        }
        if (stockDayYanPan24.getXiaJiangSum8() == null) {
            stringBuffer.append("下8sum,0—");
        } else {
            stringBuffer.append("下8sum," + stockDayYanPan24.getXiaJiangSum8() + "—");
        }
        if (stockDayYanPan24.getXiaJiangMa8() == null) {
            stringBuffer.append("下8ma,0—");
        } else {
            stringBuffer.append("下8ma," + stockDayYanPan24.getXiaJiangMa8() + "—");
        }
        if (stockDayYanPan24.getXiaJiangCount8() == null) {
            stringBuffer.append("下8count,0—");
        } else {
            stringBuffer.append("下8count," + stockDayYanPan24.getXiaJiangCount8() + "—");
        }
        if (stockDayYanPan24.getXiaJiangRate8() == null) {
            stringBuffer.append("下8rate,0—");
        } else {
            stringBuffer.append("下8rate," + stockDayYanPan24.getXiaJiangRate8() + "—");
        }
        if (stockDayYanPan24.getShangZhangSum13() == null) {
            stringBuffer.append("上13sum,0—");
        } else {
            stringBuffer.append("上13sum," + stockDayYanPan24.getShangZhangSum13() + "—");
        }
        if (stockDayYanPan24.getShangZhangMa13() == null) {
            stringBuffer.append("上13ma,0—");
        } else {
            stringBuffer.append("上13ma," + stockDayYanPan24.getShangZhangMa13() + "—");
        }
        if (stockDayYanPan24.getShangZhangCount13() == null) {
            stringBuffer.append("上13count,0—");
        } else {
            stringBuffer.append("上13count," + stockDayYanPan24.getShangZhangCount13() + "—");
        }
        if (stockDayYanPan24.getShangZhangRate13() == null) {
            stringBuffer.append("上13rate,0—");
        } else {
            stringBuffer.append("上13rate," + stockDayYanPan24.getShangZhangRate13() + "—");
        }
        if (stockDayYanPan24.getXiaJiangSum13() == null) {
            stringBuffer.append("下13sum,0—");
        } else {
            stringBuffer.append("下13sum," + stockDayYanPan24.getXiaJiangSum13() + "—");
        }
        if (stockDayYanPan24.getXiaJiangMa13() == null) {
            stringBuffer.append("下13ma,0—");
        } else {
            stringBuffer.append("下13ma," + stockDayYanPan24.getXiaJiangMa13() + "—");
        }
        if (stockDayYanPan24.getXiaJiangCount13() == null) {
            stringBuffer.append("下13count,0—");
        } else {
            stringBuffer.append("下13count," + stockDayYanPan24.getXiaJiangCount13() + "—");
        }
        if (stockDayYanPan24.getXiaJiangRate13() == null) {
            stringBuffer.append("下13rate,0—");
        } else {
            stringBuffer.append("下13rate," + stockDayYanPan24.getXiaJiangRate13() + "—");
        }
        if (stockDayYanPan24.getShangZhangSum20() == null) {
            stringBuffer.append("上20sum,0—");
        } else {
            stringBuffer.append("上20sum," + stockDayYanPan24.getShangZhangSum20() + "—");
        }
        if (stockDayYanPan24.getShangZhangMa20() == null) {
            stringBuffer.append("上20ma,0—");
        } else {
            stringBuffer.append("上20ma," + stockDayYanPan24.getShangZhangMa20() + "—");
        }
        if (stockDayYanPan24.getShangZhangCount20() == null) {
            stringBuffer.append("上20count,0—");
        } else {
            stringBuffer.append("上20count," + stockDayYanPan24.getShangZhangCount20() + "—");
        }
        if (stockDayYanPan24.getShangZhangRate1() == null) {
            stringBuffer.append("上20rate,0—");
        } else {
            stringBuffer.append("上20rate," + stockDayYanPan24.getShangZhangRate1() + "—");
        }
        if (stockDayYanPan24.getXiaJiangSum20() == null) {
            stringBuffer.append("下20sum,0—");
        } else {
            stringBuffer.append("下20sum," + stockDayYanPan24.getXiaJiangSum20() + "—");
        }
        if (stockDayYanPan24.getXiaJiangMa20() == null) {
            stringBuffer.append("下20ma,0—");
        } else {
            stringBuffer.append("下20ma," + stockDayYanPan24.getXiaJiangMa20() + "—");
        }
        if (stockDayYanPan24.getXiaJiangCount20() == null) {
            stringBuffer.append("下20count,0—");
        } else {
            stringBuffer.append("下20count," + stockDayYanPan24.getXiaJiangCount20() + "—");
        }
        if (stockDayYanPan24.getXiaJiangRate20() == null) {
            stringBuffer.append("下20rate,0—");
        } else {
            stringBuffer.append("下20rate," + stockDayYanPan24.getXiaJiangRate20());
        }
        return stringBuffer.toString();
    }

    public static String get33String(StockDayYanPan33 stockDayYanPan33) {
        StringBuffer stringBuffer = new StringBuffer();
        if (StringUtils.isEmpty(stockDayYanPan33.getDangRi())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPan33.getDangRi() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPan33.getLiangXian())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPan33.getLiangXian() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPan33.getSanXian())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPan33.getSanXian() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPan33.getKdj())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPan33.getKdj() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPan33.getMacd())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPan33.getMacd() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPan33.getPriceMa())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPan33.getPriceMa() + "—");
        }
        if (stockDayYanPan33.getShangZhangSum1() == null) {
            stringBuffer.append("上1sum,0—");
        } else {
            stringBuffer.append("上1sum," + stockDayYanPan33.getShangZhangSum1() + "—");
        }
        if (stockDayYanPan33.getShangZhangMa1() == null) {
            stringBuffer.append("上1ma,0—");
        } else {
            stringBuffer.append("上1ma," + stockDayYanPan33.getShangZhangMa1() + "—");
        }
        if (stockDayYanPan33.getShangZhangCount1() == null) {
            stringBuffer.append("上1count,0—");
        } else {
            stringBuffer.append("上1count," + stockDayYanPan33.getShangZhangCount1() + "—");
        }
        if (stockDayYanPan33.getShangZhangRate1() == null) {
            stringBuffer.append("上1rate,0—");
        } else {
            stringBuffer.append("上1rate," + stockDayYanPan33.getShangZhangRate1() + "—");
        }
        if (stockDayYanPan33.getXiaJiangSum1() == null) {
            stringBuffer.append("下1sum,0—");
        } else {
            stringBuffer.append("下1sum," + stockDayYanPan33.getXiaJiangSum1() + "—");
        }
        if (stockDayYanPan33.getXiaJiangMa1() == null) {
            stringBuffer.append("下1ma,0—");
        } else {
            stringBuffer.append("下1ma," + stockDayYanPan33.getXiaJiangMa1() + "—");
        }
        if (stockDayYanPan33.getXiaJiangCount1() == null) {
            stringBuffer.append("下1count,0—");
        } else {
            stringBuffer.append("下1count," + stockDayYanPan33.getXiaJiangCount1() + "—");
        }
        if (stockDayYanPan33.getXiaJiangRate1() == null) {
            stringBuffer.append("下1rate,0—");
        } else {
            stringBuffer.append("下1rate," + stockDayYanPan33.getXiaJiangRate1() + "—");
        }
        if (stockDayYanPan33.getShangZhangSum2() == null) {
            stringBuffer.append("上2sum,0—");
        } else {
            stringBuffer.append("上2sum," + stockDayYanPan33.getShangZhangSum2() + "—");
        }
        if (stockDayYanPan33.getShangZhangMa2() == null) {
            stringBuffer.append("上2ma,0—");
        } else {
            stringBuffer.append("上2ma," + stockDayYanPan33.getShangZhangMa2() + "—");
        }
        if (stockDayYanPan33.getShangZhangCount2() == null) {
            stringBuffer.append("上2count,0—");
        } else {
            stringBuffer.append("上2count," + stockDayYanPan33.getShangZhangCount2() + "—");
        }
        if (stockDayYanPan33.getShangZhangRate2() == null) {
            stringBuffer.append("上2rate,0—");
        } else {
            stringBuffer.append("上2rate," + stockDayYanPan33.getShangZhangRate2() + "—");
        }
        if (stockDayYanPan33.getXiaJiangSum2() == null) {
            stringBuffer.append("下2sum,0—");
        } else {
            stringBuffer.append("下2sum," + stockDayYanPan33.getXiaJiangSum2() + "—");
        }
        if (stockDayYanPan33.getXiaJiangMa2() == null) {
            stringBuffer.append("下2ma,0—");
        } else {
            stringBuffer.append("下2ma," + stockDayYanPan33.getXiaJiangMa2() + "—");
        }
        if (stockDayYanPan33.getXiaJiangCount2() == null) {
            stringBuffer.append("下2count,0—");
        } else {
            stringBuffer.append("下2count," + stockDayYanPan33.getXiaJiangCount2() + "—");
        }
        if (stockDayYanPan33.getXiaJiangRate2() == null) {
            stringBuffer.append("下2rate,0—");
        } else {
            stringBuffer.append("下2rate," + stockDayYanPan33.getXiaJiangRate2() + "—");
        }
        if (stockDayYanPan33.getShangZhangSum3() == null) {
            stringBuffer.append("上3sum,0—");
        } else {
            stringBuffer.append("上3sum," + stockDayYanPan33.getShangZhangSum3() + "—");
        }
        if (stockDayYanPan33.getShangZhangMa3() == null) {
            stringBuffer.append("上3ma,0—");
        } else {
            stringBuffer.append("上3ma," + stockDayYanPan33.getShangZhangMa3() + "—");
        }
        if (stockDayYanPan33.getShangZhangCount3() == null) {
            stringBuffer.append("上3count,0—");
        } else {
            stringBuffer.append("上3count," + stockDayYanPan33.getShangZhangCount3() + "—");
        }
        if (stockDayYanPan33.getShangZhangRate3() == null) {
            stringBuffer.append("上3rate,0—");
        } else {
            stringBuffer.append("上3rate," + stockDayYanPan33.getShangZhangRate3() + "—");
        }
        if (stockDayYanPan33.getXiaJiangSum3() == null) {
            stringBuffer.append("下3sum,0—");
        } else {
            stringBuffer.append("下3sum," + stockDayYanPan33.getXiaJiangSum3() + "—");
        }
        if (stockDayYanPan33.getXiaJiangMa3() == null) {
            stringBuffer.append("下3ma,0—");
        } else {
            stringBuffer.append("下3ma," + stockDayYanPan33.getXiaJiangMa3() + "—");
        }
        if (stockDayYanPan33.getXiaJiangCount3() == null) {
            stringBuffer.append("下3count,0—");
        } else {
            stringBuffer.append("下3count," + stockDayYanPan33.getXiaJiangCount3() + "—");
        }
        if (stockDayYanPan33.getXiaJiangRate3() == null) {
            stringBuffer.append("下3rate,0—");
        } else {
            stringBuffer.append("下3rate," + stockDayYanPan33.getXiaJiangRate3() + "—");
        }
        if (stockDayYanPan33.getShangZhangSum5() == null) {
            stringBuffer.append("上5sum,0—");
        } else {
            stringBuffer.append("上5sum," + stockDayYanPan33.getShangZhangSum5() + "—");
        }
        if (stockDayYanPan33.getShangZhangMa5() == null) {
            stringBuffer.append("上5ma,0—");
        } else {
            stringBuffer.append("上5ma," + stockDayYanPan33.getShangZhangMa5() + "—");
        }
        if (stockDayYanPan33.getShangZhangCount5() == null) {
            stringBuffer.append("上5count,0—");
        } else {
            stringBuffer.append("上5count," + stockDayYanPan33.getShangZhangCount5() + "—");
        }
        if (stockDayYanPan33.getShangZhangRate5() == null) {
            stringBuffer.append("上5rate,0—");
        } else {
            stringBuffer.append("上5rate," + stockDayYanPan33.getShangZhangRate5() + "—");
        }
        if (stockDayYanPan33.getXiaJiangSum5() == null) {
            stringBuffer.append("下5sum,0—");
        } else {
            stringBuffer.append("下5sum," + stockDayYanPan33.getXiaJiangSum5() + "—");
        }
        if (stockDayYanPan33.getXiaJiangMa5() == null) {
            stringBuffer.append("下5ma,0—");
        } else {
            stringBuffer.append("下5ma," + stockDayYanPan33.getXiaJiangMa5() + "—");
        }
        if (stockDayYanPan33.getXiaJiangCount5() == null) {
            stringBuffer.append("下5count,0—");
        } else {
            stringBuffer.append("下5count," + stockDayYanPan33.getXiaJiangCount5() + "—");
        }
        if (stockDayYanPan33.getXiaJiangRate5() == null) {
            stringBuffer.append("下5rate,0—");
        } else {
            stringBuffer.append("下5rate," + stockDayYanPan33.getXiaJiangRate5() + "—");
        }
        if (stockDayYanPan33.getShangZhangSum8() == null) {
            stringBuffer.append("上8sum,0—");
        } else {
            stringBuffer.append("上8sum," + stockDayYanPan33.getShangZhangSum8() + "—");
        }
        if (stockDayYanPan33.getShangZhangMa8() == null) {
            stringBuffer.append("上8ma,0—");
        } else {
            stringBuffer.append("上8ma," + stockDayYanPan33.getShangZhangMa8() + "—");
        }
        if (stockDayYanPan33.getShangZhangCount8() == null) {
            stringBuffer.append("上8count,0—");
        } else {
            stringBuffer.append("上8count," + stockDayYanPan33.getShangZhangCount8() + "—");
        }
        if (stockDayYanPan33.getShangZhangRate8() == null) {
            stringBuffer.append("上8rate,0—");
        } else {
            stringBuffer.append("上8rate," + stockDayYanPan33.getShangZhangRate8() + "—");
        }
        if (stockDayYanPan33.getXiaJiangSum8() == null) {
            stringBuffer.append("下8sum,0—");
        } else {
            stringBuffer.append("下8sum," + stockDayYanPan33.getXiaJiangSum8() + "—");
        }
        if (stockDayYanPan33.getXiaJiangMa8() == null) {
            stringBuffer.append("下8ma,0—");
        } else {
            stringBuffer.append("下8ma," + stockDayYanPan33.getXiaJiangMa8() + "—");
        }
        if (stockDayYanPan33.getXiaJiangCount8() == null) {
            stringBuffer.append("下8count,0—");
        } else {
            stringBuffer.append("下8count," + stockDayYanPan33.getXiaJiangCount8() + "—");
        }
        if (stockDayYanPan33.getXiaJiangRate8() == null) {
            stringBuffer.append("下8rate,0—");
        } else {
            stringBuffer.append("下8rate," + stockDayYanPan33.getXiaJiangRate8() + "—");
        }
        if (stockDayYanPan33.getShangZhangSum13() == null) {
            stringBuffer.append("上13sum,0—");
        } else {
            stringBuffer.append("上13sum," + stockDayYanPan33.getShangZhangSum13() + "—");
        }
        if (stockDayYanPan33.getShangZhangMa13() == null) {
            stringBuffer.append("上13ma,0—");
        } else {
            stringBuffer.append("上13ma," + stockDayYanPan33.getShangZhangMa13() + "—");
        }
        if (stockDayYanPan33.getShangZhangCount13() == null) {
            stringBuffer.append("上13count,0—");
        } else {
            stringBuffer.append("上13count," + stockDayYanPan33.getShangZhangCount13() + "—");
        }
        if (stockDayYanPan33.getShangZhangRate13() == null) {
            stringBuffer.append("上13rate,0—");
        } else {
            stringBuffer.append("上13rate," + stockDayYanPan33.getShangZhangRate13() + "—");
        }
        if (stockDayYanPan33.getXiaJiangSum13() == null) {
            stringBuffer.append("下13sum,0—");
        } else {
            stringBuffer.append("下13sum," + stockDayYanPan33.getXiaJiangSum13() + "—");
        }
        if (stockDayYanPan33.getXiaJiangMa13() == null) {
            stringBuffer.append("下13ma,0—");
        } else {
            stringBuffer.append("下13ma," + stockDayYanPan33.getXiaJiangMa13() + "—");
        }
        if (stockDayYanPan33.getXiaJiangCount13() == null) {
            stringBuffer.append("下13count,0—");
        } else {
            stringBuffer.append("下13count," + stockDayYanPan33.getXiaJiangCount13() + "—");
        }
        if (stockDayYanPan33.getXiaJiangRate13() == null) {
            stringBuffer.append("下13rate,0—");
        } else {
            stringBuffer.append("下13rate," + stockDayYanPan33.getXiaJiangRate13() + "—");
        }
        if (stockDayYanPan33.getShangZhangSum20() == null) {
            stringBuffer.append("上20sum,0—");
        } else {
            stringBuffer.append("上20sum," + stockDayYanPan33.getShangZhangSum20() + "—");
        }
        if (stockDayYanPan33.getShangZhangMa20() == null) {
            stringBuffer.append("上20ma,0—");
        } else {
            stringBuffer.append("上20ma," + stockDayYanPan33.getShangZhangMa20() + "—");
        }
        if (stockDayYanPan33.getShangZhangCount20() == null) {
            stringBuffer.append("上20count,0—");
        } else {
            stringBuffer.append("上20count," + stockDayYanPan33.getShangZhangCount20() + "—");
        }
        if (stockDayYanPan33.getShangZhangRate1() == null) {
            stringBuffer.append("上20rate,0—");
        } else {
            stringBuffer.append("上20rate," + stockDayYanPan33.getShangZhangRate1() + "—");
        }
        if (stockDayYanPan33.getXiaJiangSum20() == null) {
            stringBuffer.append("下20sum,0—");
        } else {
            stringBuffer.append("下20sum," + stockDayYanPan33.getXiaJiangSum20() + "—");
        }
        if (stockDayYanPan33.getXiaJiangMa20() == null) {
            stringBuffer.append("下20ma,0—");
        } else {
            stringBuffer.append("下20ma," + stockDayYanPan33.getXiaJiangMa20() + "—");
        }
        if (stockDayYanPan33.getXiaJiangCount20() == null) {
            stringBuffer.append("下20count,0—");
        } else {
            stringBuffer.append("下20count," + stockDayYanPan33.getXiaJiangCount20() + "—");
        }
        if (stockDayYanPan33.getXiaJiangRate20() == null) {
            stringBuffer.append("下20rate,0—");
        } else {
            stringBuffer.append("下20rate," + stockDayYanPan33.getXiaJiangRate20());
        }
        return stringBuffer.toString();
    }

    public static String get42String(StockDayYanPan42 stockDayYanPan42) {
        StringBuffer stringBuffer = new StringBuffer();
        if (StringUtils.isEmpty(stockDayYanPan42.getDangRi())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPan42.getDangRi() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPan42.getLiangXian())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPan42.getLiangXian() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPan42.getSanXian())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPan42.getSanXian() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPan42.getSiXian())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPan42.getSiXian() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPan42.getKdj())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPan42.getKdj() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPan42.getPriceMa())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPan42.getPriceMa() + "—");
        }
        if (stockDayYanPan42.getShangZhangSum1() == null) {
            stringBuffer.append("上1sum,0—");
        } else {
            stringBuffer.append("上1sum," + stockDayYanPan42.getShangZhangSum1() + "—");
        }
        if (stockDayYanPan42.getShangZhangMa1() == null) {
            stringBuffer.append("上1ma,0—");
        } else {
            stringBuffer.append("上1ma," + stockDayYanPan42.getShangZhangMa1() + "—");
        }
        if (stockDayYanPan42.getShangZhangCount1() == null) {
            stringBuffer.append("上1count,0—");
        } else {
            stringBuffer.append("上1count," + stockDayYanPan42.getShangZhangCount1() + "—");
        }
        if (stockDayYanPan42.getShangZhangRate1() == null) {
            stringBuffer.append("上1rate,0—");
        } else {
            stringBuffer.append("上1rate," + stockDayYanPan42.getShangZhangRate1() + "—");
        }
        if (stockDayYanPan42.getXiaJiangSum1() == null) {
            stringBuffer.append("下1sum,0—");
        } else {
            stringBuffer.append("下1sum," + stockDayYanPan42.getXiaJiangSum1() + "—");
        }
        if (stockDayYanPan42.getXiaJiangMa1() == null) {
            stringBuffer.append("下1ma,0—");
        } else {
            stringBuffer.append("下1ma," + stockDayYanPan42.getXiaJiangMa1() + "—");
        }
        if (stockDayYanPan42.getXiaJiangCount1() == null) {
            stringBuffer.append("下1count,0—");
        } else {
            stringBuffer.append("下1count," + stockDayYanPan42.getXiaJiangCount1() + "—");
        }
        if (stockDayYanPan42.getXiaJiangRate1() == null) {
            stringBuffer.append("下1rate,0—");
        } else {
            stringBuffer.append("下1rate," + stockDayYanPan42.getXiaJiangRate1() + "—");
        }
        if (stockDayYanPan42.getShangZhangSum2() == null) {
            stringBuffer.append("上2sum,0—");
        } else {
            stringBuffer.append("上2sum," + stockDayYanPan42.getShangZhangSum2() + "—");
        }
        if (stockDayYanPan42.getShangZhangMa2() == null) {
            stringBuffer.append("上2ma,0—");
        } else {
            stringBuffer.append("上2ma," + stockDayYanPan42.getShangZhangMa2() + "—");
        }
        if (stockDayYanPan42.getShangZhangCount2() == null) {
            stringBuffer.append("上2count,0—");
        } else {
            stringBuffer.append("上2count," + stockDayYanPan42.getShangZhangCount2() + "—");
        }
        if (stockDayYanPan42.getShangZhangRate2() == null) {
            stringBuffer.append("上2rate,0—");
        } else {
            stringBuffer.append("上2rate," + stockDayYanPan42.getShangZhangRate2() + "—");
        }
        if (stockDayYanPan42.getXiaJiangSum2() == null) {
            stringBuffer.append("下2sum,0—");
        } else {
            stringBuffer.append("下2sum," + stockDayYanPan42.getXiaJiangSum2() + "—");
        }
        if (stockDayYanPan42.getXiaJiangMa2() == null) {
            stringBuffer.append("下2ma,0—");
        } else {
            stringBuffer.append("下2ma," + stockDayYanPan42.getXiaJiangMa2() + "—");
        }
        if (stockDayYanPan42.getXiaJiangCount2() == null) {
            stringBuffer.append("下2count,0—");
        } else {
            stringBuffer.append("下2count," + stockDayYanPan42.getXiaJiangCount2() + "—");
        }
        if (stockDayYanPan42.getXiaJiangRate2() == null) {
            stringBuffer.append("下2rate,0—");
        } else {
            stringBuffer.append("下2rate," + stockDayYanPan42.getXiaJiangRate2() + "—");
        }
        if (stockDayYanPan42.getShangZhangSum3() == null) {
            stringBuffer.append("上3sum,0—");
        } else {
            stringBuffer.append("上3sum," + stockDayYanPan42.getShangZhangSum3() + "—");
        }
        if (stockDayYanPan42.getShangZhangMa3() == null) {
            stringBuffer.append("上3ma,0—");
        } else {
            stringBuffer.append("上3ma," + stockDayYanPan42.getShangZhangMa3() + "—");
        }
        if (stockDayYanPan42.getShangZhangCount3() == null) {
            stringBuffer.append("上3count,0—");
        } else {
            stringBuffer.append("上3count," + stockDayYanPan42.getShangZhangCount3() + "—");
        }
        if (stockDayYanPan42.getShangZhangRate3() == null) {
            stringBuffer.append("上3rate,0—");
        } else {
            stringBuffer.append("上3rate," + stockDayYanPan42.getShangZhangRate3() + "—");
        }
        if (stockDayYanPan42.getXiaJiangSum3() == null) {
            stringBuffer.append("下3sum,0—");
        } else {
            stringBuffer.append("下3sum," + stockDayYanPan42.getXiaJiangSum3() + "—");
        }
        if (stockDayYanPan42.getXiaJiangMa3() == null) {
            stringBuffer.append("下3ma,0—");
        } else {
            stringBuffer.append("下3ma," + stockDayYanPan42.getXiaJiangMa3() + "—");
        }
        if (stockDayYanPan42.getXiaJiangCount3() == null) {
            stringBuffer.append("下3count,0—");
        } else {
            stringBuffer.append("下3count," + stockDayYanPan42.getXiaJiangCount3() + "—");
        }
        if (stockDayYanPan42.getXiaJiangRate3() == null) {
            stringBuffer.append("下3rate,0—");
        } else {
            stringBuffer.append("下3rate," + stockDayYanPan42.getXiaJiangRate3() + "—");
        }
        if (stockDayYanPan42.getShangZhangSum5() == null) {
            stringBuffer.append("上5sum,0—");
        } else {
            stringBuffer.append("上5sum," + stockDayYanPan42.getShangZhangSum5() + "—");
        }
        if (stockDayYanPan42.getShangZhangMa5() == null) {
            stringBuffer.append("上5ma,0—");
        } else {
            stringBuffer.append("上5ma," + stockDayYanPan42.getShangZhangMa5() + "—");
        }
        if (stockDayYanPan42.getShangZhangCount5() == null) {
            stringBuffer.append("上5count,0—");
        } else {
            stringBuffer.append("上5count," + stockDayYanPan42.getShangZhangCount5() + "—");
        }
        if (stockDayYanPan42.getShangZhangRate5() == null) {
            stringBuffer.append("上5rate,0—");
        } else {
            stringBuffer.append("上5rate," + stockDayYanPan42.getShangZhangRate5() + "—");
        }
        if (stockDayYanPan42.getXiaJiangSum5() == null) {
            stringBuffer.append("下5sum,0—");
        } else {
            stringBuffer.append("下5sum," + stockDayYanPan42.getXiaJiangSum5() + "—");
        }
        if (stockDayYanPan42.getXiaJiangMa5() == null) {
            stringBuffer.append("下5ma,0—");
        } else {
            stringBuffer.append("下5ma," + stockDayYanPan42.getXiaJiangMa5() + "—");
        }
        if (stockDayYanPan42.getXiaJiangCount5() == null) {
            stringBuffer.append("下5count,0—");
        } else {
            stringBuffer.append("下5count," + stockDayYanPan42.getXiaJiangCount5() + "—");
        }
        if (stockDayYanPan42.getXiaJiangRate5() == null) {
            stringBuffer.append("下5rate,0—");
        } else {
            stringBuffer.append("下5rate," + stockDayYanPan42.getXiaJiangRate5() + "—");
        }
        if (stockDayYanPan42.getShangZhangSum8() == null) {
            stringBuffer.append("上8sum,0—");
        } else {
            stringBuffer.append("上8sum," + stockDayYanPan42.getShangZhangSum8() + "—");
        }
        if (stockDayYanPan42.getShangZhangMa8() == null) {
            stringBuffer.append("上8ma,0—");
        } else {
            stringBuffer.append("上8ma," + stockDayYanPan42.getShangZhangMa8() + "—");
        }
        if (stockDayYanPan42.getShangZhangCount8() == null) {
            stringBuffer.append("上8count,0—");
        } else {
            stringBuffer.append("上8count," + stockDayYanPan42.getShangZhangCount8() + "—");
        }
        if (stockDayYanPan42.getShangZhangRate8() == null) {
            stringBuffer.append("上8rate,0—");
        } else {
            stringBuffer.append("上8rate," + stockDayYanPan42.getShangZhangRate8() + "—");
        }
        if (stockDayYanPan42.getXiaJiangSum8() == null) {
            stringBuffer.append("下8sum,0—");
        } else {
            stringBuffer.append("下8sum," + stockDayYanPan42.getXiaJiangSum8() + "—");
        }
        if (stockDayYanPan42.getXiaJiangMa8() == null) {
            stringBuffer.append("下8ma,0—");
        } else {
            stringBuffer.append("下8ma," + stockDayYanPan42.getXiaJiangMa8() + "—");
        }
        if (stockDayYanPan42.getXiaJiangCount8() == null) {
            stringBuffer.append("下8count,0—");
        } else {
            stringBuffer.append("下8count," + stockDayYanPan42.getXiaJiangCount8() + "—");
        }
        if (stockDayYanPan42.getXiaJiangRate8() == null) {
            stringBuffer.append("下8rate,0—");
        } else {
            stringBuffer.append("下8rate," + stockDayYanPan42.getXiaJiangRate8() + "—");
        }
        if (stockDayYanPan42.getShangZhangSum13() == null) {
            stringBuffer.append("上13sum,0—");
        } else {
            stringBuffer.append("上13sum," + stockDayYanPan42.getShangZhangSum13() + "—");
        }
        if (stockDayYanPan42.getShangZhangMa13() == null) {
            stringBuffer.append("上13ma,0—");
        } else {
            stringBuffer.append("上13ma," + stockDayYanPan42.getShangZhangMa13() + "—");
        }
        if (stockDayYanPan42.getShangZhangCount13() == null) {
            stringBuffer.append("上13count,0—");
        } else {
            stringBuffer.append("上13count," + stockDayYanPan42.getShangZhangCount13() + "—");
        }
        if (stockDayYanPan42.getShangZhangRate13() == null) {
            stringBuffer.append("上13rate,0—");
        } else {
            stringBuffer.append("上13rate," + stockDayYanPan42.getShangZhangRate13() + "—");
        }
        if (stockDayYanPan42.getXiaJiangSum13() == null) {
            stringBuffer.append("下13sum,0—");
        } else {
            stringBuffer.append("下13sum," + stockDayYanPan42.getXiaJiangSum13() + "—");
        }
        if (stockDayYanPan42.getXiaJiangMa13() == null) {
            stringBuffer.append("下13ma,0—");
        } else {
            stringBuffer.append("下13ma," + stockDayYanPan42.getXiaJiangMa13() + "—");
        }
        if (stockDayYanPan42.getXiaJiangCount13() == null) {
            stringBuffer.append("下13count,0—");
        } else {
            stringBuffer.append("下13count," + stockDayYanPan42.getXiaJiangCount13() + "—");
        }
        if (stockDayYanPan42.getXiaJiangRate13() == null) {
            stringBuffer.append("下13rate,0—");
        } else {
            stringBuffer.append("下13rate," + stockDayYanPan42.getXiaJiangRate13() + "—");
        }
        if (stockDayYanPan42.getShangZhangSum20() == null) {
            stringBuffer.append("上20sum,0—");
        } else {
            stringBuffer.append("上20sum," + stockDayYanPan42.getShangZhangSum20() + "—");
        }
        if (stockDayYanPan42.getShangZhangMa20() == null) {
            stringBuffer.append("上20ma,0—");
        } else {
            stringBuffer.append("上20ma," + stockDayYanPan42.getShangZhangMa20() + "—");
        }
        if (stockDayYanPan42.getShangZhangCount20() == null) {
            stringBuffer.append("上20count,0—");
        } else {
            stringBuffer.append("上20count," + stockDayYanPan42.getShangZhangCount20() + "—");
        }
        if (stockDayYanPan42.getShangZhangRate1() == null) {
            stringBuffer.append("上20rate,0—");
        } else {
            stringBuffer.append("上20rate," + stockDayYanPan42.getShangZhangRate1() + "—");
        }
        if (stockDayYanPan42.getXiaJiangSum20() == null) {
            stringBuffer.append("下20sum,0—");
        } else {
            stringBuffer.append("下20sum," + stockDayYanPan42.getXiaJiangSum20() + "—");
        }
        if (stockDayYanPan42.getXiaJiangMa20() == null) {
            stringBuffer.append("下20ma,0—");
        } else {
            stringBuffer.append("下20ma," + stockDayYanPan42.getXiaJiangMa20() + "—");
        }
        if (stockDayYanPan42.getXiaJiangCount20() == null) {
            stringBuffer.append("下20count,0—");
        } else {
            stringBuffer.append("下20count," + stockDayYanPan42.getXiaJiangCount20() + "—");
        }
        if (stockDayYanPan42.getXiaJiangRate20() == null) {
            stringBuffer.append("下20rate,0—");
        } else {
            stringBuffer.append("下20rate," + stockDayYanPan42.getXiaJiangRate20());
        }
        return stringBuffer.toString();
    }

    public static String getBenpanString(StockDayYanPanBenpan stockDayYanPanBenpan) {
        StringBuffer stringBuffer = new StringBuffer();
        if (StringUtils.isEmpty(stockDayYanPanBenpan.getBenPiao1())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPanBenpan.getBenPiao1() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPanBenpan.getBenPiao2())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPanBenpan.getBenPiao2() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPanBenpan.getBenPiao3())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPanBenpan.getBenPiao3() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPanBenpan.getBenPiao5())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPanBenpan.getBenPiao5() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPanBenpan.getBenPiao13())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPanBenpan.getBenPiao13() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPanBenpan.getBenPiao20())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPanBenpan.getBenPiao20() + "—");
        }
        if (stockDayYanPanBenpan.getShangZhangSum1() == null) {
            stringBuffer.append("上1sum,0—");
        } else {
            stringBuffer.append("上1sum," + stockDayYanPanBenpan.getShangZhangSum1() + "—");
        }
        if (stockDayYanPanBenpan.getShangZhangMa1() == null) {
            stringBuffer.append("上1ma,0—");
        } else {
            stringBuffer.append("上1ma," + stockDayYanPanBenpan.getShangZhangMa1() + "—");
        }
        if (stockDayYanPanBenpan.getShangZhangCount1() == null) {
            stringBuffer.append("上1count,0—");
        } else {
            stringBuffer.append("上1count," + stockDayYanPanBenpan.getShangZhangCount1() + "—");
        }
        if (stockDayYanPanBenpan.getShangZhangRate1() == null) {
            stringBuffer.append("上1rate,0—");
        } else {
            stringBuffer.append("上1rate," + stockDayYanPanBenpan.getShangZhangRate1() + "—");
        }
        if (stockDayYanPanBenpan.getXiaJiangSum1() == null) {
            stringBuffer.append("下1sum,0—");
        } else {
            stringBuffer.append("下1sum," + stockDayYanPanBenpan.getXiaJiangSum1() + "—");
        }
        if (stockDayYanPanBenpan.getXiaJiangMa1() == null) {
            stringBuffer.append("下1ma,0—");
        } else {
            stringBuffer.append("下1ma," + stockDayYanPanBenpan.getXiaJiangMa1() + "—");
        }
        if (stockDayYanPanBenpan.getXiaJiangCount1() == null) {
            stringBuffer.append("下1count,0—");
        } else {
            stringBuffer.append("下1count," + stockDayYanPanBenpan.getXiaJiangCount1() + "—");
        }
        if (stockDayYanPanBenpan.getXiaJiangRate1() == null) {
            stringBuffer.append("下1rate,0—");
        } else {
            stringBuffer.append("下1rate," + stockDayYanPanBenpan.getXiaJiangRate1() + "—");
        }
        if (stockDayYanPanBenpan.getShangZhangSum2() == null) {
            stringBuffer.append("上2sum,0—");
        } else {
            stringBuffer.append("上2sum," + stockDayYanPanBenpan.getShangZhangSum2() + "—");
        }
        if (stockDayYanPanBenpan.getShangZhangMa2() == null) {
            stringBuffer.append("上2ma,0—");
        } else {
            stringBuffer.append("上2ma," + stockDayYanPanBenpan.getShangZhangMa2() + "—");
        }
        if (stockDayYanPanBenpan.getShangZhangCount2() == null) {
            stringBuffer.append("上2count,0—");
        } else {
            stringBuffer.append("上2count," + stockDayYanPanBenpan.getShangZhangCount2() + "—");
        }
        if (stockDayYanPanBenpan.getShangZhangRate2() == null) {
            stringBuffer.append("上2rate,0—");
        } else {
            stringBuffer.append("上2rate," + stockDayYanPanBenpan.getShangZhangRate2() + "—");
        }
        if (stockDayYanPanBenpan.getXiaJiangSum2() == null) {
            stringBuffer.append("下2sum,0—");
        } else {
            stringBuffer.append("下2sum," + stockDayYanPanBenpan.getXiaJiangSum2() + "—");
        }
        if (stockDayYanPanBenpan.getXiaJiangMa2() == null) {
            stringBuffer.append("下2ma,0—");
        } else {
            stringBuffer.append("下2ma," + stockDayYanPanBenpan.getXiaJiangMa2() + "—");
        }
        if (stockDayYanPanBenpan.getXiaJiangCount2() == null) {
            stringBuffer.append("下2count,0—");
        } else {
            stringBuffer.append("下2count," + stockDayYanPanBenpan.getXiaJiangCount2() + "—");
        }
        if (stockDayYanPanBenpan.getXiaJiangRate2() == null) {
            stringBuffer.append("下2rate,0—");
        } else {
            stringBuffer.append("下2rate," + stockDayYanPanBenpan.getXiaJiangRate2() + "—");
        }
        if (stockDayYanPanBenpan.getShangZhangSum3() == null) {
            stringBuffer.append("上3sum,0—");
        } else {
            stringBuffer.append("上3sum," + stockDayYanPanBenpan.getShangZhangSum3() + "—");
        }
        if (stockDayYanPanBenpan.getShangZhangMa3() == null) {
            stringBuffer.append("上3ma,0—");
        } else {
            stringBuffer.append("上3ma," + stockDayYanPanBenpan.getShangZhangMa3() + "—");
        }
        if (stockDayYanPanBenpan.getShangZhangCount3() == null) {
            stringBuffer.append("上3count,0—");
        } else {
            stringBuffer.append("上3count," + stockDayYanPanBenpan.getShangZhangCount3() + "—");
        }
        if (stockDayYanPanBenpan.getShangZhangRate3() == null) {
            stringBuffer.append("上3rate,0—");
        } else {
            stringBuffer.append("上3rate," + stockDayYanPanBenpan.getShangZhangRate3() + "—");
        }
        if (stockDayYanPanBenpan.getXiaJiangSum3() == null) {
            stringBuffer.append("下3sum,0—");
        } else {
            stringBuffer.append("下3sum," + stockDayYanPanBenpan.getXiaJiangSum3() + "—");
        }
        if (stockDayYanPanBenpan.getXiaJiangMa3() == null) {
            stringBuffer.append("下3ma,0—");
        } else {
            stringBuffer.append("下3ma," + stockDayYanPanBenpan.getXiaJiangMa3() + "—");
        }
        if (stockDayYanPanBenpan.getXiaJiangCount3() == null) {
            stringBuffer.append("下3count,0—");
        } else {
            stringBuffer.append("下3count," + stockDayYanPanBenpan.getXiaJiangCount3() + "—");
        }
        if (stockDayYanPanBenpan.getXiaJiangRate3() == null) {
            stringBuffer.append("下3rate,0—");
        } else {
            stringBuffer.append("下3rate," + stockDayYanPanBenpan.getXiaJiangRate3() + "—");
        }
        if (stockDayYanPanBenpan.getShangZhangSum5() == null) {
            stringBuffer.append("上5sum,0—");
        } else {
            stringBuffer.append("上5sum," + stockDayYanPanBenpan.getShangZhangSum5() + "—");
        }
        if (stockDayYanPanBenpan.getShangZhangMa5() == null) {
            stringBuffer.append("上5ma,0—");
        } else {
            stringBuffer.append("上5ma," + stockDayYanPanBenpan.getShangZhangMa5() + "—");
        }
        if (stockDayYanPanBenpan.getShangZhangCount5() == null) {
            stringBuffer.append("上5count,0—");
        } else {
            stringBuffer.append("上5count," + stockDayYanPanBenpan.getShangZhangCount5() + "—");
        }
        if (stockDayYanPanBenpan.getShangZhangRate5() == null) {
            stringBuffer.append("上5rate,0—");
        } else {
            stringBuffer.append("上5rate," + stockDayYanPanBenpan.getShangZhangRate5() + "—");
        }
        if (stockDayYanPanBenpan.getXiaJiangSum5() == null) {
            stringBuffer.append("下5sum,0—");
        } else {
            stringBuffer.append("下5sum," + stockDayYanPanBenpan.getXiaJiangSum5() + "—");
        }
        if (stockDayYanPanBenpan.getXiaJiangMa5() == null) {
            stringBuffer.append("下5ma,0—");
        } else {
            stringBuffer.append("下5ma," + stockDayYanPanBenpan.getXiaJiangMa5() + "—");
        }
        if (stockDayYanPanBenpan.getXiaJiangCount5() == null) {
            stringBuffer.append("下5count,0—");
        } else {
            stringBuffer.append("下5count," + stockDayYanPanBenpan.getXiaJiangCount5() + "—");
        }
        if (stockDayYanPanBenpan.getXiaJiangRate5() == null) {
            stringBuffer.append("下5rate,0—");
        } else {
            stringBuffer.append("下5rate," + stockDayYanPanBenpan.getXiaJiangRate5() + "—");
        }
        if (stockDayYanPanBenpan.getShangZhangSum8() == null) {
            stringBuffer.append("上8sum,0—");
        } else {
            stringBuffer.append("上8sum," + stockDayYanPanBenpan.getShangZhangSum8() + "—");
        }
        if (stockDayYanPanBenpan.getShangZhangMa8() == null) {
            stringBuffer.append("上8ma,0—");
        } else {
            stringBuffer.append("上8ma," + stockDayYanPanBenpan.getShangZhangMa8() + "—");
        }
        if (stockDayYanPanBenpan.getShangZhangCount8() == null) {
            stringBuffer.append("上8count,0—");
        } else {
            stringBuffer.append("上8count," + stockDayYanPanBenpan.getShangZhangCount8() + "—");
        }
        if (stockDayYanPanBenpan.getShangZhangRate8() == null) {
            stringBuffer.append("上8rate,0—");
        } else {
            stringBuffer.append("上8rate," + stockDayYanPanBenpan.getShangZhangRate8() + "—");
        }
        if (stockDayYanPanBenpan.getXiaJiangSum8() == null) {
            stringBuffer.append("下8sum,0—");
        } else {
            stringBuffer.append("下8sum," + stockDayYanPanBenpan.getXiaJiangSum8() + "—");
        }
        if (stockDayYanPanBenpan.getXiaJiangMa8() == null) {
            stringBuffer.append("下8ma,0—");
        } else {
            stringBuffer.append("下8ma," + stockDayYanPanBenpan.getXiaJiangMa8() + "—");
        }
        if (stockDayYanPanBenpan.getXiaJiangCount8() == null) {
            stringBuffer.append("下8count,0—");
        } else {
            stringBuffer.append("下8count," + stockDayYanPanBenpan.getXiaJiangCount8() + "—");
        }
        if (stockDayYanPanBenpan.getXiaJiangRate8() == null) {
            stringBuffer.append("下8rate,0—");
        } else {
            stringBuffer.append("下8rate," + stockDayYanPanBenpan.getXiaJiangRate8() + "—");
        }
        if (stockDayYanPanBenpan.getShangZhangSum13() == null) {
            stringBuffer.append("上13sum,0—");
        } else {
            stringBuffer.append("上13sum," + stockDayYanPanBenpan.getShangZhangSum13() + "—");
        }
        if (stockDayYanPanBenpan.getShangZhangMa13() == null) {
            stringBuffer.append("上13ma,0—");
        } else {
            stringBuffer.append("上13ma," + stockDayYanPanBenpan.getShangZhangMa13() + "—");
        }
        if (stockDayYanPanBenpan.getShangZhangCount13() == null) {
            stringBuffer.append("上13count,0—");
        } else {
            stringBuffer.append("上13count," + stockDayYanPanBenpan.getShangZhangCount13() + "—");
        }
        if (stockDayYanPanBenpan.getShangZhangRate13() == null) {
            stringBuffer.append("上13rate,0—");
        } else {
            stringBuffer.append("上13rate," + stockDayYanPanBenpan.getShangZhangRate13() + "—");
        }
        if (stockDayYanPanBenpan.getXiaJiangSum13() == null) {
            stringBuffer.append("下13sum,0—");
        } else {
            stringBuffer.append("下13sum," + stockDayYanPanBenpan.getXiaJiangSum13() + "—");
        }
        if (stockDayYanPanBenpan.getXiaJiangMa13() == null) {
            stringBuffer.append("下13ma,0—");
        } else {
            stringBuffer.append("下13ma," + stockDayYanPanBenpan.getXiaJiangMa13() + "—");
        }
        if (stockDayYanPanBenpan.getXiaJiangCount13() == null) {
            stringBuffer.append("下13count,0—");
        } else {
            stringBuffer.append("下13count," + stockDayYanPanBenpan.getXiaJiangCount13() + "—");
        }
        if (stockDayYanPanBenpan.getXiaJiangRate13() == null) {
            stringBuffer.append("下13rate,0—");
        } else {
            stringBuffer.append("下13rate," + stockDayYanPanBenpan.getXiaJiangRate13() + "—");
        }
        if (stockDayYanPanBenpan.getShangZhangSum20() == null) {
            stringBuffer.append("上20sum,0—");
        } else {
            stringBuffer.append("上20sum," + stockDayYanPanBenpan.getShangZhangSum20() + "—");
        }
        if (stockDayYanPanBenpan.getShangZhangMa20() == null) {
            stringBuffer.append("上20ma,0—");
        } else {
            stringBuffer.append("上20ma," + stockDayYanPanBenpan.getShangZhangMa20() + "—");
        }
        if (stockDayYanPanBenpan.getShangZhangCount20() == null) {
            stringBuffer.append("上20count,0—");
        } else {
            stringBuffer.append("上20count," + stockDayYanPanBenpan.getShangZhangCount20() + "—");
        }
        if (stockDayYanPanBenpan.getShangZhangRate1() == null) {
            stringBuffer.append("上20rate,0—");
        } else {
            stringBuffer.append("上20rate," + stockDayYanPanBenpan.getShangZhangRate1() + "—");
        }
        if (stockDayYanPanBenpan.getXiaJiangSum20() == null) {
            stringBuffer.append("下20sum,0—");
        } else {
            stringBuffer.append("下20sum," + stockDayYanPanBenpan.getXiaJiangSum20() + "—");
        }
        if (stockDayYanPanBenpan.getXiaJiangMa20() == null) {
            stringBuffer.append("下20ma,0—");
        } else {
            stringBuffer.append("下20ma," + stockDayYanPanBenpan.getXiaJiangMa20() + "—");
        }
        if (stockDayYanPanBenpan.getXiaJiangCount20() == null) {
            stringBuffer.append("下20count,0—");
        } else {
            stringBuffer.append("下20count," + stockDayYanPanBenpan.getXiaJiangCount20() + "—");
        }
        if (stockDayYanPanBenpan.getXiaJiangRate20() == null) {
            stringBuffer.append("下20rate,0—");
        } else {
            stringBuffer.append("下20rate," + stockDayYanPanBenpan.getXiaJiangRate20());
        }
        return stringBuffer.toString();
    }

    public static String getDaPanString(StockDayYanPanDapan stockDayYanPanDaPan) {
        StringBuffer stringBuffer = new StringBuffer();
        if (StringUtils.isEmpty(stockDayYanPanDaPan.getDaPan1())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPanDaPan.getDaPan1() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPanDaPan.getDaPan2())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPanDaPan.getDaPan2() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPanDaPan.getDaPan3())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPanDaPan.getDaPan3() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPanDaPan.getDaPan5())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPanDaPan.getDaPan5() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPanDaPan.getDaPan13())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPanDaPan.getDaPan13() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPanDaPan.getDaPan20())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPanDaPan.getDaPan20() + "—");
        }
        if (stockDayYanPanDaPan.getShangZhangSum1() == null) {
            stringBuffer.append("上1sum,0—");
        } else {
            stringBuffer.append("上1sum," + stockDayYanPanDaPan.getShangZhangSum1() + "—");
        }
        if (stockDayYanPanDaPan.getShangZhangMa1() == null) {
            stringBuffer.append("上1ma,0—");
        } else {
            stringBuffer.append("上1ma," + stockDayYanPanDaPan.getShangZhangMa1() + "—");
        }
        if (stockDayYanPanDaPan.getShangZhangCount1() == null) {
            stringBuffer.append("上1count,0—");
        } else {
            stringBuffer.append("上1count," + stockDayYanPanDaPan.getShangZhangCount1() + "—");
        }
        if (stockDayYanPanDaPan.getShangZhangRate1() == null) {
            stringBuffer.append("上1rate,0—");
        } else {
            stringBuffer.append("上1rate," + stockDayYanPanDaPan.getShangZhangRate1() + "—");
        }
        if (stockDayYanPanDaPan.getXiaJiangSum1() == null) {
            stringBuffer.append("下1sum,0—");
        } else {
            stringBuffer.append("下1sum," + stockDayYanPanDaPan.getXiaJiangSum1() + "—");
        }
        if (stockDayYanPanDaPan.getXiaJiangMa1() == null) {
            stringBuffer.append("下1ma,0—");
        } else {
            stringBuffer.append("下1ma," + stockDayYanPanDaPan.getXiaJiangMa1() + "—");
        }
        if (stockDayYanPanDaPan.getXiaJiangCount1() == null) {
            stringBuffer.append("下1count,0—");
        } else {
            stringBuffer.append("下1count," + stockDayYanPanDaPan.getXiaJiangCount1() + "—");
        }
        if (stockDayYanPanDaPan.getXiaJiangRate1() == null) {
            stringBuffer.append("下1rate,0—");
        } else {
            stringBuffer.append("下1rate," + stockDayYanPanDaPan.getXiaJiangRate1() + "—");
        }
        if (stockDayYanPanDaPan.getShangZhangSum2() == null) {
            stringBuffer.append("上2sum,0—");
        } else {
            stringBuffer.append("上2sum," + stockDayYanPanDaPan.getShangZhangSum2() + "—");
        }
        if (stockDayYanPanDaPan.getShangZhangMa2() == null) {
            stringBuffer.append("上2ma,0—");
        } else {
            stringBuffer.append("上2ma," + stockDayYanPanDaPan.getShangZhangMa2() + "—");
        }
        if (stockDayYanPanDaPan.getShangZhangCount2() == null) {
            stringBuffer.append("上2count,0—");
        } else {
            stringBuffer.append("上2count," + stockDayYanPanDaPan.getShangZhangCount2() + "—");
        }
        if (stockDayYanPanDaPan.getShangZhangRate2() == null) {
            stringBuffer.append("上2rate,0—");
        } else {
            stringBuffer.append("上2rate," + stockDayYanPanDaPan.getShangZhangRate2() + "—");
        }
        if (stockDayYanPanDaPan.getXiaJiangSum2() == null) {
            stringBuffer.append("下2sum,0—");
        } else {
            stringBuffer.append("下2sum," + stockDayYanPanDaPan.getXiaJiangSum2() + "—");
        }
        if (stockDayYanPanDaPan.getXiaJiangMa2() == null) {
            stringBuffer.append("下2ma,0—");
        } else {
            stringBuffer.append("下2ma," + stockDayYanPanDaPan.getXiaJiangMa2() + "—");
        }
        if (stockDayYanPanDaPan.getXiaJiangCount2() == null) {
            stringBuffer.append("下2count,0—");
        } else {
            stringBuffer.append("下2count," + stockDayYanPanDaPan.getXiaJiangCount2() + "—");
        }
        if (stockDayYanPanDaPan.getXiaJiangRate2() == null) {
            stringBuffer.append("下2rate,0—");
        } else {
            stringBuffer.append("下2rate," + stockDayYanPanDaPan.getXiaJiangRate2() + "—");
        }
        if (stockDayYanPanDaPan.getShangZhangSum3() == null) {
            stringBuffer.append("上3sum,0—");
        } else {
            stringBuffer.append("上3sum," + stockDayYanPanDaPan.getShangZhangSum3() + "—");
        }
        if (stockDayYanPanDaPan.getShangZhangMa3() == null) {
            stringBuffer.append("上3ma,0—");
        } else {
            stringBuffer.append("上3ma," + stockDayYanPanDaPan.getShangZhangMa3() + "—");
        }
        if (stockDayYanPanDaPan.getShangZhangCount3() == null) {
            stringBuffer.append("上3count,0—");
        } else {
            stringBuffer.append("上3count," + stockDayYanPanDaPan.getShangZhangCount3() + "—");
        }
        if (stockDayYanPanDaPan.getShangZhangRate3() == null) {
            stringBuffer.append("上3rate,0—");
        } else {
            stringBuffer.append("上3rate," + stockDayYanPanDaPan.getShangZhangRate3() + "—");
        }
        if (stockDayYanPanDaPan.getXiaJiangSum3() == null) {
            stringBuffer.append("下3sum,0—");
        } else {
            stringBuffer.append("下3sum," + stockDayYanPanDaPan.getXiaJiangSum3() + "—");
        }
        if (stockDayYanPanDaPan.getXiaJiangMa3() == null) {
            stringBuffer.append("下3ma,0—");
        } else {
            stringBuffer.append("下3ma," + stockDayYanPanDaPan.getXiaJiangMa3() + "—");
        }
        if (stockDayYanPanDaPan.getXiaJiangCount3() == null) {
            stringBuffer.append("下3count,0—");
        } else {
            stringBuffer.append("下3count," + stockDayYanPanDaPan.getXiaJiangCount3() + "—");
        }
        if (stockDayYanPanDaPan.getXiaJiangRate3() == null) {
            stringBuffer.append("下3rate,0—");
        } else {
            stringBuffer.append("下3rate," + stockDayYanPanDaPan.getXiaJiangRate3() + "—");
        }
        if (stockDayYanPanDaPan.getShangZhangSum5() == null) {
            stringBuffer.append("上5sum,0—");
        } else {
            stringBuffer.append("上5sum," + stockDayYanPanDaPan.getShangZhangSum5() + "—");
        }
        if (stockDayYanPanDaPan.getShangZhangMa5() == null) {
            stringBuffer.append("上5ma,0—");
        } else {
            stringBuffer.append("上5ma," + stockDayYanPanDaPan.getShangZhangMa5() + "—");
        }
        if (stockDayYanPanDaPan.getShangZhangCount5() == null) {
            stringBuffer.append("上5count,0—");
        } else {
            stringBuffer.append("上5count," + stockDayYanPanDaPan.getShangZhangCount5() + "—");
        }
        if (stockDayYanPanDaPan.getShangZhangRate5() == null) {
            stringBuffer.append("上5rate,0—");
        } else {
            stringBuffer.append("上5rate," + stockDayYanPanDaPan.getShangZhangRate5() + "—");
        }
        if (stockDayYanPanDaPan.getXiaJiangSum5() == null) {
            stringBuffer.append("下5sum,0—");
        } else {
            stringBuffer.append("下5sum," + stockDayYanPanDaPan.getXiaJiangSum5() + "—");
        }
        if (stockDayYanPanDaPan.getXiaJiangMa5() == null) {
            stringBuffer.append("下5ma,0—");
        } else {
            stringBuffer.append("下5ma," + stockDayYanPanDaPan.getXiaJiangMa5() + "—");
        }
        if (stockDayYanPanDaPan.getXiaJiangCount5() == null) {
            stringBuffer.append("下5count,0—");
        } else {
            stringBuffer.append("下5count," + stockDayYanPanDaPan.getXiaJiangCount5() + "—");
        }
        if (stockDayYanPanDaPan.getXiaJiangRate5() == null) {
            stringBuffer.append("下5rate,0—");
        } else {
            stringBuffer.append("下5rate," + stockDayYanPanDaPan.getXiaJiangRate5() + "—");
        }
        if (stockDayYanPanDaPan.getShangZhangSum8() == null) {
            stringBuffer.append("上8sum,0—");
        } else {
            stringBuffer.append("上8sum," + stockDayYanPanDaPan.getShangZhangSum8() + "—");
        }
        if (stockDayYanPanDaPan.getShangZhangMa8() == null) {
            stringBuffer.append("上8ma,0—");
        } else {
            stringBuffer.append("上8ma," + stockDayYanPanDaPan.getShangZhangMa8() + "—");
        }
        if (stockDayYanPanDaPan.getShangZhangCount8() == null) {
            stringBuffer.append("上8count,0—");
        } else {
            stringBuffer.append("上8count," + stockDayYanPanDaPan.getShangZhangCount8() + "—");
        }
        if (stockDayYanPanDaPan.getShangZhangRate8() == null) {
            stringBuffer.append("上8rate,0—");
        } else {
            stringBuffer.append("上8rate," + stockDayYanPanDaPan.getShangZhangRate8() + "—");
        }
        if (stockDayYanPanDaPan.getXiaJiangSum8() == null) {
            stringBuffer.append("下8sum,0—");
        } else {
            stringBuffer.append("下8sum," + stockDayYanPanDaPan.getXiaJiangSum8() + "—");
        }
        if (stockDayYanPanDaPan.getXiaJiangMa8() == null) {
            stringBuffer.append("下8ma,0—");
        } else {
            stringBuffer.append("下8ma," + stockDayYanPanDaPan.getXiaJiangMa8() + "—");
        }
        if (stockDayYanPanDaPan.getXiaJiangCount8() == null) {
            stringBuffer.append("下8count,0—");
        } else {
            stringBuffer.append("下8count," + stockDayYanPanDaPan.getXiaJiangCount8() + "—");
        }
        if (stockDayYanPanDaPan.getXiaJiangRate8() == null) {
            stringBuffer.append("下8rate,0—");
        } else {
            stringBuffer.append("下8rate," + stockDayYanPanDaPan.getXiaJiangRate8() + "—");
        }
        if (stockDayYanPanDaPan.getShangZhangSum13() == null) {
            stringBuffer.append("上13sum,0—");
        } else {
            stringBuffer.append("上13sum," + stockDayYanPanDaPan.getShangZhangSum13() + "—");
        }
        if (stockDayYanPanDaPan.getShangZhangMa13() == null) {
            stringBuffer.append("上13ma,0—");
        } else {
            stringBuffer.append("上13ma," + stockDayYanPanDaPan.getShangZhangMa13() + "—");
        }
        if (stockDayYanPanDaPan.getShangZhangCount13() == null) {
            stringBuffer.append("上13count,0—");
        } else {
            stringBuffer.append("上13count," + stockDayYanPanDaPan.getShangZhangCount13() + "—");
        }
        if (stockDayYanPanDaPan.getShangZhangRate13() == null) {
            stringBuffer.append("上13rate,0—");
        } else {
            stringBuffer.append("上13rate," + stockDayYanPanDaPan.getShangZhangRate13() + "—");
        }
        if (stockDayYanPanDaPan.getXiaJiangSum13() == null) {
            stringBuffer.append("下13sum,0—");
        } else {
            stringBuffer.append("下13sum," + stockDayYanPanDaPan.getXiaJiangSum13() + "—");
        }
        if (stockDayYanPanDaPan.getXiaJiangMa13() == null) {
            stringBuffer.append("下13ma,0—");
        } else {
            stringBuffer.append("下13ma," + stockDayYanPanDaPan.getXiaJiangMa13() + "—");
        }
        if (stockDayYanPanDaPan.getXiaJiangCount13() == null) {
            stringBuffer.append("下13count,0—");
        } else {
            stringBuffer.append("下13count," + stockDayYanPanDaPan.getXiaJiangCount13() + "—");
        }
        if (stockDayYanPanDaPan.getXiaJiangRate13() == null) {
            stringBuffer.append("下13rate,0—");
        } else {
            stringBuffer.append("下13rate," + stockDayYanPanDaPan.getXiaJiangRate13() + "—");
        }
        if (stockDayYanPanDaPan.getShangZhangSum20() == null) {
            stringBuffer.append("上20sum,0—");
        } else {
            stringBuffer.append("上20sum," + stockDayYanPanDaPan.getShangZhangSum20() + "—");
        }
        if (stockDayYanPanDaPan.getShangZhangMa20() == null) {
            stringBuffer.append("上20ma,0—");
        } else {
            stringBuffer.append("上20ma," + stockDayYanPanDaPan.getShangZhangMa20() + "—");
        }
        if (stockDayYanPanDaPan.getShangZhangCount20() == null) {
            stringBuffer.append("上20count,0—");
        } else {
            stringBuffer.append("上20count," + stockDayYanPanDaPan.getShangZhangCount20() + "—");
        }
        if (stockDayYanPanDaPan.getShangZhangRate1() == null) {
            stringBuffer.append("上20rate,0—");
        } else {
            stringBuffer.append("上20rate," + stockDayYanPanDaPan.getShangZhangRate1() + "—");
        }
        if (stockDayYanPanDaPan.getXiaJiangSum20() == null) {
            stringBuffer.append("下20sum,0—");
        } else {
            stringBuffer.append("下20sum," + stockDayYanPanDaPan.getXiaJiangSum20() + "—");
        }
        if (stockDayYanPanDaPan.getXiaJiangMa20() == null) {
            stringBuffer.append("下20ma,0—");
        } else {
            stringBuffer.append("下20ma," + stockDayYanPanDaPan.getXiaJiangMa20() + "—");
        }
        if (stockDayYanPanDaPan.getXiaJiangCount20() == null) {
            stringBuffer.append("下20count,0—");
        } else {
            stringBuffer.append("下20count," + stockDayYanPanDaPan.getXiaJiangCount20() + "—");
        }
        if (stockDayYanPanDaPan.getXiaJiangRate20() == null) {
            stringBuffer.append("下20rate,0—");
        } else {
            stringBuffer.append("下20rate," + stockDayYanPanDaPan.getXiaJiangRate20());
        }
        return stringBuffer.toString();
    }

    public static String getChunJishuString(StockDayYanPanChunJishu stockDayYanPanChunJishu) {
        StringBuffer stringBuffer = new StringBuffer();
        if (StringUtils.isEmpty(stockDayYanPanChunJishu.getKdj())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPanChunJishu.getKdj() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPanChunJishu.getMacd())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPanChunJishu.getMacd() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPanChunJishu.getQuantityMa())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPanChunJishu.getQuantityMa() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPanChunJishu.getPriceMa())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPanChunJishu.getPriceMa() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPanChunJishu.getRsi())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPanChunJishu.getRsi() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPanChunJishu.getWr())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPanChunJishu.getWr()+ "—");
        }
        if (stockDayYanPanChunJishu.getShangZhangSum1() == null) {
            stringBuffer.append("上1sum,0—");
        } else {
            stringBuffer.append("上1sum," + stockDayYanPanChunJishu.getShangZhangSum1() + "—");
        }
        if (stockDayYanPanChunJishu.getShangZhangMa1() == null) {
            stringBuffer.append("上1ma,0—");
        } else {
            stringBuffer.append("上1ma," + stockDayYanPanChunJishu.getShangZhangMa1() + "—");
        }
        if (stockDayYanPanChunJishu.getShangZhangCount1() == null) {
            stringBuffer.append("上1count,0—");
        } else {
            stringBuffer.append("上1count," + stockDayYanPanChunJishu.getShangZhangCount1() + "—");
        }
        if (stockDayYanPanChunJishu.getShangZhangRate1() == null) {
            stringBuffer.append("上1rate,0—");
        } else {
            stringBuffer.append("上1rate," + stockDayYanPanChunJishu.getShangZhangRate1() + "—");
        }
        if (stockDayYanPanChunJishu.getXiaJiangSum1() == null) {
            stringBuffer.append("下1sum,0—");
        } else {
            stringBuffer.append("下1sum," + stockDayYanPanChunJishu.getXiaJiangSum1() + "—");
        }
        if (stockDayYanPanChunJishu.getXiaJiangMa1() == null) {
            stringBuffer.append("下1ma,0—");
        } else {
            stringBuffer.append("下1ma," + stockDayYanPanChunJishu.getXiaJiangMa1() + "—");
        }
        if (stockDayYanPanChunJishu.getXiaJiangCount1() == null) {
            stringBuffer.append("下1count,0—");
        } else {
            stringBuffer.append("下1count," + stockDayYanPanChunJishu.getXiaJiangCount1() + "—");
        }
        if (stockDayYanPanChunJishu.getXiaJiangRate1() == null) {
            stringBuffer.append("下1rate,0—");
        } else {
            stringBuffer.append("下1rate," + stockDayYanPanChunJishu.getXiaJiangRate1() + "—");
        }
        if (stockDayYanPanChunJishu.getShangZhangSum2() == null) {
            stringBuffer.append("上2sum,0—");
        } else {
            stringBuffer.append("上2sum," + stockDayYanPanChunJishu.getShangZhangSum2() + "—");
        }
        if (stockDayYanPanChunJishu.getShangZhangMa2() == null) {
            stringBuffer.append("上2ma,0—");
        } else {
            stringBuffer.append("上2ma," + stockDayYanPanChunJishu.getShangZhangMa2() + "—");
        }
        if (stockDayYanPanChunJishu.getShangZhangCount2() == null) {
            stringBuffer.append("上2count,0—");
        } else {
            stringBuffer.append("上2count," + stockDayYanPanChunJishu.getShangZhangCount2() + "—");
        }
        if (stockDayYanPanChunJishu.getShangZhangRate2() == null) {
            stringBuffer.append("上2rate,0—");
        } else {
            stringBuffer.append("上2rate," + stockDayYanPanChunJishu.getShangZhangRate2() + "—");
        }
        if (stockDayYanPanChunJishu.getXiaJiangSum2() == null) {
            stringBuffer.append("下2sum,0—");
        } else {
            stringBuffer.append("下2sum," + stockDayYanPanChunJishu.getXiaJiangSum2() + "—");
        }
        if (stockDayYanPanChunJishu.getXiaJiangMa2() == null) {
            stringBuffer.append("下2ma,0—");
        } else {
            stringBuffer.append("下2ma," + stockDayYanPanChunJishu.getXiaJiangMa2() + "—");
        }
        if (stockDayYanPanChunJishu.getXiaJiangCount2() == null) {
            stringBuffer.append("下2count,0—");
        } else {
            stringBuffer.append("下2count," + stockDayYanPanChunJishu.getXiaJiangCount2() + "—");
        }
        if (stockDayYanPanChunJishu.getXiaJiangRate2() == null) {
            stringBuffer.append("下2rate,0—");
        } else {
            stringBuffer.append("下2rate," + stockDayYanPanChunJishu.getXiaJiangRate2() + "—");
        }
        if (stockDayYanPanChunJishu.getShangZhangSum3() == null) {
            stringBuffer.append("上3sum,0—");
        } else {
            stringBuffer.append("上3sum," + stockDayYanPanChunJishu.getShangZhangSum3() + "—");
        }
        if (stockDayYanPanChunJishu.getShangZhangMa3() == null) {
            stringBuffer.append("上3ma,0—");
        } else {
            stringBuffer.append("上3ma," + stockDayYanPanChunJishu.getShangZhangMa3() + "—");
        }
        if (stockDayYanPanChunJishu.getShangZhangCount3() == null) {
            stringBuffer.append("上3count,0—");
        } else {
            stringBuffer.append("上3count," + stockDayYanPanChunJishu.getShangZhangCount3() + "—");
        }
        if (stockDayYanPanChunJishu.getShangZhangRate3() == null) {
            stringBuffer.append("上3rate,0—");
        } else {
            stringBuffer.append("上3rate," + stockDayYanPanChunJishu.getShangZhangRate3() + "—");
        }
        if (stockDayYanPanChunJishu.getXiaJiangSum3() == null) {
            stringBuffer.append("下3sum,0—");
        } else {
            stringBuffer.append("下3sum," + stockDayYanPanChunJishu.getXiaJiangSum3() + "—");
        }
        if (stockDayYanPanChunJishu.getXiaJiangMa3() == null) {
            stringBuffer.append("下3ma,0—");
        } else {
            stringBuffer.append("下3ma," + stockDayYanPanChunJishu.getXiaJiangMa3() + "—");
        }
        if (stockDayYanPanChunJishu.getXiaJiangCount3() == null) {
            stringBuffer.append("下3count,0—");
        } else {
            stringBuffer.append("下3count," + stockDayYanPanChunJishu.getXiaJiangCount3() + "—");
        }
        if (stockDayYanPanChunJishu.getXiaJiangRate3() == null) {
            stringBuffer.append("下3rate,0—");
        } else {
            stringBuffer.append("下3rate," + stockDayYanPanChunJishu.getXiaJiangRate3() + "—");
        }
        if (stockDayYanPanChunJishu.getShangZhangSum5() == null) {
            stringBuffer.append("上5sum,0—");
        } else {
            stringBuffer.append("上5sum," + stockDayYanPanChunJishu.getShangZhangSum5() + "—");
        }
        if (stockDayYanPanChunJishu.getShangZhangMa5() == null) {
            stringBuffer.append("上5ma,0—");
        } else {
            stringBuffer.append("上5ma," + stockDayYanPanChunJishu.getShangZhangMa5() + "—");
        }
        if (stockDayYanPanChunJishu.getShangZhangCount5() == null) {
            stringBuffer.append("上5count,0—");
        } else {
            stringBuffer.append("上5count," + stockDayYanPanChunJishu.getShangZhangCount5() + "—");
        }
        if (stockDayYanPanChunJishu.getShangZhangRate5() == null) {
            stringBuffer.append("上5rate,0—");
        } else {
            stringBuffer.append("上5rate," + stockDayYanPanChunJishu.getShangZhangRate5() + "—");
        }
        if (stockDayYanPanChunJishu.getXiaJiangSum5() == null) {
            stringBuffer.append("下5sum,0—");
        } else {
            stringBuffer.append("下5sum," + stockDayYanPanChunJishu.getXiaJiangSum5() + "—");
        }
        if (stockDayYanPanChunJishu.getXiaJiangMa5() == null) {
            stringBuffer.append("下5ma,0—");
        } else {
            stringBuffer.append("下5ma," + stockDayYanPanChunJishu.getXiaJiangMa5() + "—");
        }
        if (stockDayYanPanChunJishu.getXiaJiangCount5() == null) {
            stringBuffer.append("下5count,0—");
        } else {
            stringBuffer.append("下5count," + stockDayYanPanChunJishu.getXiaJiangCount5() + "—");
        }
        if (stockDayYanPanChunJishu.getXiaJiangRate5() == null) {
            stringBuffer.append("下5rate,0—");
        } else {
            stringBuffer.append("下5rate," + stockDayYanPanChunJishu.getXiaJiangRate5() + "—");
        }
        if (stockDayYanPanChunJishu.getShangZhangSum8() == null) {
            stringBuffer.append("上8sum,0—");
        } else {
            stringBuffer.append("上8sum," + stockDayYanPanChunJishu.getShangZhangSum8() + "—");
        }
        if (stockDayYanPanChunJishu.getShangZhangMa8() == null) {
            stringBuffer.append("上8ma,0—");
        } else {
            stringBuffer.append("上8ma," + stockDayYanPanChunJishu.getShangZhangMa8() + "—");
        }
        if (stockDayYanPanChunJishu.getShangZhangCount8() == null) {
            stringBuffer.append("上8count,0—");
        } else {
            stringBuffer.append("上8count," + stockDayYanPanChunJishu.getShangZhangCount8() + "—");
        }
        if (stockDayYanPanChunJishu.getShangZhangRate8() == null) {
            stringBuffer.append("上8rate,0—");
        } else {
            stringBuffer.append("上8rate," + stockDayYanPanChunJishu.getShangZhangRate8() + "—");
        }
        if (stockDayYanPanChunJishu.getXiaJiangSum8() == null) {
            stringBuffer.append("下8sum,0—");
        } else {
            stringBuffer.append("下8sum," + stockDayYanPanChunJishu.getXiaJiangSum8() + "—");
        }
        if (stockDayYanPanChunJishu.getXiaJiangMa8() == null) {
            stringBuffer.append("下8ma,0—");
        } else {
            stringBuffer.append("下8ma," + stockDayYanPanChunJishu.getXiaJiangMa8() + "—");
        }
        if (stockDayYanPanChunJishu.getXiaJiangCount8() == null) {
            stringBuffer.append("下8count,0—");
        } else {
            stringBuffer.append("下8count," + stockDayYanPanChunJishu.getXiaJiangCount8() + "—");
        }
        if (stockDayYanPanChunJishu.getXiaJiangRate8() == null) {
            stringBuffer.append("下8rate,0—");
        } else {
            stringBuffer.append("下8rate," + stockDayYanPanChunJishu.getXiaJiangRate8() + "—");
        }
        if (stockDayYanPanChunJishu.getShangZhangSum13() == null) {
            stringBuffer.append("上13sum,0—");
        } else {
            stringBuffer.append("上13sum," + stockDayYanPanChunJishu.getShangZhangSum13() + "—");
        }
        if (stockDayYanPanChunJishu.getShangZhangMa13() == null) {
            stringBuffer.append("上13ma,0—");
        } else {
            stringBuffer.append("上13ma," + stockDayYanPanChunJishu.getShangZhangMa13() + "—");
        }
        if (stockDayYanPanChunJishu.getShangZhangCount13() == null) {
            stringBuffer.append("上13count,0—");
        } else {
            stringBuffer.append("上13count," + stockDayYanPanChunJishu.getShangZhangCount13() + "—");
        }
        if (stockDayYanPanChunJishu.getShangZhangRate13() == null) {
            stringBuffer.append("上13rate,0—");
        } else {
            stringBuffer.append("上13rate," + stockDayYanPanChunJishu.getShangZhangRate13() + "—");
        }
        if (stockDayYanPanChunJishu.getXiaJiangSum13() == null) {
            stringBuffer.append("下13sum,0—");
        } else {
            stringBuffer.append("下13sum," + stockDayYanPanChunJishu.getXiaJiangSum13() + "—");
        }
        if (stockDayYanPanChunJishu.getXiaJiangMa13() == null) {
            stringBuffer.append("下13ma,0—");
        } else {
            stringBuffer.append("下13ma," + stockDayYanPanChunJishu.getXiaJiangMa13() + "—");
        }
        if (stockDayYanPanChunJishu.getXiaJiangCount13() == null) {
            stringBuffer.append("下13count,0—");
        } else {
            stringBuffer.append("下13count," + stockDayYanPanChunJishu.getXiaJiangCount13() + "—");
        }
        if (stockDayYanPanChunJishu.getXiaJiangRate13() == null) {
            stringBuffer.append("下13rate,0—");
        } else {
            stringBuffer.append("下13rate," + stockDayYanPanChunJishu.getXiaJiangRate13() + "—");
        }
        if (stockDayYanPanChunJishu.getShangZhangSum20() == null) {
            stringBuffer.append("上20sum,0—");
        } else {
            stringBuffer.append("上20sum," + stockDayYanPanChunJishu.getShangZhangSum20() + "—");
        }
        if (stockDayYanPanChunJishu.getShangZhangMa20() == null) {
            stringBuffer.append("上20ma,0—");
        } else {
            stringBuffer.append("上20ma," + stockDayYanPanChunJishu.getShangZhangMa20() + "—");
        }
        if (stockDayYanPanChunJishu.getShangZhangCount20() == null) {
            stringBuffer.append("上20count,0—");
        } else {
            stringBuffer.append("上20count," + stockDayYanPanChunJishu.getShangZhangCount20() + "—");
        }
        if (stockDayYanPanChunJishu.getShangZhangRate1() == null) {
            stringBuffer.append("上20rate,0—");
        } else {
            stringBuffer.append("上20rate," + stockDayYanPanChunJishu.getShangZhangRate1() + "—");
        }
        if (stockDayYanPanChunJishu.getXiaJiangSum20() == null) {
            stringBuffer.append("下20sum,0—");
        } else {
            stringBuffer.append("下20sum," + stockDayYanPanChunJishu.getXiaJiangSum20() + "—");
        }
        if (stockDayYanPanChunJishu.getXiaJiangMa20() == null) {
            stringBuffer.append("下20ma,0—");
        } else {
            stringBuffer.append("下20ma," + stockDayYanPanChunJishu.getXiaJiangMa20() + "—");
        }
        if (stockDayYanPanChunJishu.getXiaJiangCount20() == null) {
            stringBuffer.append("下20count,0—");
        } else {
            stringBuffer.append("下20count," + stockDayYanPanChunJishu.getXiaJiangCount20() + "—");
        }
        if (stockDayYanPanChunJishu.getXiaJiangRate20() == null) {
            stringBuffer.append("下20rate,0—");
        } else {
            stringBuffer.append("下20rate," + stockDayYanPanChunJishu.getXiaJiangRate20());
        }
        return stringBuffer.toString();
    }

    public static String getChunTuxingString(StockDayYanPanChunTuxing stockDayYanPanChunTuxing) {
        StringBuffer stringBuffer = new StringBuffer();
        if (StringUtils.isEmpty(stockDayYanPanChunTuxing.getDangRi())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPanChunTuxing.getDangRi() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPanChunTuxing.getLiangXian())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPanChunTuxing.getLiangXian() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPanChunTuxing.getSanXian())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPanChunTuxing.getSanXian() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPanChunTuxing.getSiXian())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPanChunTuxing.getSiXian() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPanChunTuxing.getWuXian())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPanChunTuxing.getWuXian() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPanChunTuxing.getDuoXian())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPanChunTuxing.getDuoXian() + "—");
        }
        if (stockDayYanPanChunTuxing.getShangZhangSum1() == null) {
            stringBuffer.append("上1sum,0—");
        } else {
            stringBuffer.append("上1sum," + stockDayYanPanChunTuxing.getShangZhangSum1() + "—");
        }
        if (stockDayYanPanChunTuxing.getShangZhangMa1() == null) {
            stringBuffer.append("上1ma,0—");
        } else {
            stringBuffer.append("上1ma," + stockDayYanPanChunTuxing.getShangZhangMa1() + "—");
        }
        if (stockDayYanPanChunTuxing.getShangZhangCount1() == null) {
            stringBuffer.append("上1count,0—");
        } else {
            stringBuffer.append("上1count," + stockDayYanPanChunTuxing.getShangZhangCount1() + "—");
        }
        if (stockDayYanPanChunTuxing.getShangZhangRate1() == null) {
            stringBuffer.append("上1rate,0—");
        } else {
            stringBuffer.append("上1rate," + stockDayYanPanChunTuxing.getShangZhangRate1() + "—");
        }
        if (stockDayYanPanChunTuxing.getXiaJiangSum1() == null) {
            stringBuffer.append("下1sum,0—");
        } else {
            stringBuffer.append("下1sum," + stockDayYanPanChunTuxing.getXiaJiangSum1() + "—");
        }
        if (stockDayYanPanChunTuxing.getXiaJiangMa1() == null) {
            stringBuffer.append("下1ma,0—");
        } else {
            stringBuffer.append("下1ma," + stockDayYanPanChunTuxing.getXiaJiangMa1() + "—");
        }
        if (stockDayYanPanChunTuxing.getXiaJiangCount1() == null) {
            stringBuffer.append("下1count,0—");
        } else {
            stringBuffer.append("下1count," + stockDayYanPanChunTuxing.getXiaJiangCount1() + "—");
        }
        if (stockDayYanPanChunTuxing.getXiaJiangRate1() == null) {
            stringBuffer.append("下1rate,0—");
        } else {
            stringBuffer.append("下1rate," + stockDayYanPanChunTuxing.getXiaJiangRate1() + "—");
        }
        if (stockDayYanPanChunTuxing.getShangZhangSum2() == null) {
            stringBuffer.append("上2sum,0—");
        } else {
            stringBuffer.append("上2sum," + stockDayYanPanChunTuxing.getShangZhangSum2() + "—");
        }
        if (stockDayYanPanChunTuxing.getShangZhangMa2() == null) {
            stringBuffer.append("上2ma,0—");
        } else {
            stringBuffer.append("上2ma," + stockDayYanPanChunTuxing.getShangZhangMa2() + "—");
        }
        if (stockDayYanPanChunTuxing.getShangZhangCount2() == null) {
            stringBuffer.append("上2count,0—");
        } else {
            stringBuffer.append("上2count," + stockDayYanPanChunTuxing.getShangZhangCount2() + "—");
        }
        if (stockDayYanPanChunTuxing.getShangZhangRate2() == null) {
            stringBuffer.append("上2rate,0—");
        } else {
            stringBuffer.append("上2rate," + stockDayYanPanChunTuxing.getShangZhangRate2() + "—");
        }
        if (stockDayYanPanChunTuxing.getXiaJiangSum2() == null) {
            stringBuffer.append("下2sum,0—");
        } else {
            stringBuffer.append("下2sum," + stockDayYanPanChunTuxing.getXiaJiangSum2() + "—");
        }
        if (stockDayYanPanChunTuxing.getXiaJiangMa2() == null) {
            stringBuffer.append("下2ma,0—");
        } else {
            stringBuffer.append("下2ma," + stockDayYanPanChunTuxing.getXiaJiangMa2() + "—");
        }
        if (stockDayYanPanChunTuxing.getXiaJiangCount2() == null) {
            stringBuffer.append("下2count,0—");
        } else {
            stringBuffer.append("下2count," + stockDayYanPanChunTuxing.getXiaJiangCount2() + "—");
        }
        if (stockDayYanPanChunTuxing.getXiaJiangRate2() == null) {
            stringBuffer.append("下2rate,0—");
        } else {
            stringBuffer.append("下2rate," + stockDayYanPanChunTuxing.getXiaJiangRate2() + "—");
        }
        if (stockDayYanPanChunTuxing.getShangZhangSum3() == null) {
            stringBuffer.append("上3sum,0—");
        } else {
            stringBuffer.append("上3sum," + stockDayYanPanChunTuxing.getShangZhangSum3() + "—");
        }
        if (stockDayYanPanChunTuxing.getShangZhangMa3() == null) {
            stringBuffer.append("上3ma,0—");
        } else {
            stringBuffer.append("上3ma," + stockDayYanPanChunTuxing.getShangZhangMa3() + "—");
        }
        if (stockDayYanPanChunTuxing.getShangZhangCount3() == null) {
            stringBuffer.append("上3count,0—");
        } else {
            stringBuffer.append("上3count," + stockDayYanPanChunTuxing.getShangZhangCount3() + "—");
        }
        if (stockDayYanPanChunTuxing.getShangZhangRate3() == null) {
            stringBuffer.append("上3rate,0—");
        } else {
            stringBuffer.append("上3rate," + stockDayYanPanChunTuxing.getShangZhangRate3() + "—");
        }
        if (stockDayYanPanChunTuxing.getXiaJiangSum3() == null) {
            stringBuffer.append("下3sum,0—");
        } else {
            stringBuffer.append("下3sum," + stockDayYanPanChunTuxing.getXiaJiangSum3() + "—");
        }
        if (stockDayYanPanChunTuxing.getXiaJiangMa3() == null) {
            stringBuffer.append("下3ma,0—");
        } else {
            stringBuffer.append("下3ma," + stockDayYanPanChunTuxing.getXiaJiangMa3() + "—");
        }
        if (stockDayYanPanChunTuxing.getXiaJiangCount3() == null) {
            stringBuffer.append("下3count,0—");
        } else {
            stringBuffer.append("下3count," + stockDayYanPanChunTuxing.getXiaJiangCount3() + "—");
        }
        if (stockDayYanPanChunTuxing.getXiaJiangRate3() == null) {
            stringBuffer.append("下3rate,0—");
        } else {
            stringBuffer.append("下3rate," + stockDayYanPanChunTuxing.getXiaJiangRate3() + "—");
        }
        if (stockDayYanPanChunTuxing.getShangZhangSum5() == null) {
            stringBuffer.append("上5sum,0—");
        } else {
            stringBuffer.append("上5sum," + stockDayYanPanChunTuxing.getShangZhangSum5() + "—");
        }
        if (stockDayYanPanChunTuxing.getShangZhangMa5() == null) {
            stringBuffer.append("上5ma,0—");
        } else {
            stringBuffer.append("上5ma," + stockDayYanPanChunTuxing.getShangZhangMa5() + "—");
        }
        if (stockDayYanPanChunTuxing.getShangZhangCount5() == null) {
            stringBuffer.append("上5count,0—");
        } else {
            stringBuffer.append("上5count," + stockDayYanPanChunTuxing.getShangZhangCount5() + "—");
        }
        if (stockDayYanPanChunTuxing.getShangZhangRate5() == null) {
            stringBuffer.append("上5rate,0—");
        } else {
            stringBuffer.append("上5rate," + stockDayYanPanChunTuxing.getShangZhangRate5() + "—");
        }
        if (stockDayYanPanChunTuxing.getXiaJiangSum5() == null) {
            stringBuffer.append("下5sum,0—");
        } else {
            stringBuffer.append("下5sum," + stockDayYanPanChunTuxing.getXiaJiangSum5() + "—");
        }
        if (stockDayYanPanChunTuxing.getXiaJiangMa5() == null) {
            stringBuffer.append("下5ma,0—");
        } else {
            stringBuffer.append("下5ma," + stockDayYanPanChunTuxing.getXiaJiangMa5() + "—");
        }
        if (stockDayYanPanChunTuxing.getXiaJiangCount5() == null) {
            stringBuffer.append("下5count,0—");
        } else {
            stringBuffer.append("下5count," + stockDayYanPanChunTuxing.getXiaJiangCount5() + "—");
        }
        if (stockDayYanPanChunTuxing.getXiaJiangRate5() == null) {
            stringBuffer.append("下5rate,0—");
        } else {
            stringBuffer.append("下5rate," + stockDayYanPanChunTuxing.getXiaJiangRate5() + "—");
        }
        if (stockDayYanPanChunTuxing.getShangZhangSum8() == null) {
            stringBuffer.append("上8sum,0—");
        } else {
            stringBuffer.append("上8sum," + stockDayYanPanChunTuxing.getShangZhangSum8() + "—");
        }
        if (stockDayYanPanChunTuxing.getShangZhangMa8() == null) {
            stringBuffer.append("上8ma,0—");
        } else {
            stringBuffer.append("上8ma," + stockDayYanPanChunTuxing.getShangZhangMa8() + "—");
        }
        if (stockDayYanPanChunTuxing.getShangZhangCount8() == null) {
            stringBuffer.append("上8count,0—");
        } else {
            stringBuffer.append("上8count," + stockDayYanPanChunTuxing.getShangZhangCount8() + "—");
        }
        if (stockDayYanPanChunTuxing.getShangZhangRate8() == null) {
            stringBuffer.append("上8rate,0—");
        } else {
            stringBuffer.append("上8rate," + stockDayYanPanChunTuxing.getShangZhangRate8() + "—");
        }
        if (stockDayYanPanChunTuxing.getXiaJiangSum8() == null) {
            stringBuffer.append("下8sum,0—");
        } else {
            stringBuffer.append("下8sum," + stockDayYanPanChunTuxing.getXiaJiangSum8() + "—");
        }
        if (stockDayYanPanChunTuxing.getXiaJiangMa8() == null) {
            stringBuffer.append("下8ma,0—");
        } else {
            stringBuffer.append("下8ma," + stockDayYanPanChunTuxing.getXiaJiangMa8() + "—");
        }
        if (stockDayYanPanChunTuxing.getXiaJiangCount8() == null) {
            stringBuffer.append("下8count,0—");
        } else {
            stringBuffer.append("下8count," + stockDayYanPanChunTuxing.getXiaJiangCount8() + "—");
        }
        if (stockDayYanPanChunTuxing.getXiaJiangRate8() == null) {
            stringBuffer.append("下8rate,0—");
        } else {
            stringBuffer.append("下8rate," + stockDayYanPanChunTuxing.getXiaJiangRate8() + "—");
        }
        if (stockDayYanPanChunTuxing.getShangZhangSum13() == null) {
            stringBuffer.append("上13sum,0—");
        } else {
            stringBuffer.append("上13sum," + stockDayYanPanChunTuxing.getShangZhangSum13() + "—");
        }
        if (stockDayYanPanChunTuxing.getShangZhangMa13() == null) {
            stringBuffer.append("上13ma,0—");
        } else {
            stringBuffer.append("上13ma," + stockDayYanPanChunTuxing.getShangZhangMa13() + "—");
        }
        if (stockDayYanPanChunTuxing.getShangZhangCount13() == null) {
            stringBuffer.append("上13count,0—");
        } else {
            stringBuffer.append("上13count," + stockDayYanPanChunTuxing.getShangZhangCount13() + "—");
        }
        if (stockDayYanPanChunTuxing.getShangZhangRate13() == null) {
            stringBuffer.append("上13rate,0—");
        } else {
            stringBuffer.append("上13rate," + stockDayYanPanChunTuxing.getShangZhangRate13() + "—");
        }
        if (stockDayYanPanChunTuxing.getXiaJiangSum13() == null) {
            stringBuffer.append("下13sum,0—");
        } else {
            stringBuffer.append("下13sum," + stockDayYanPanChunTuxing.getXiaJiangSum13() + "—");
        }
        if (stockDayYanPanChunTuxing.getXiaJiangMa13() == null) {
            stringBuffer.append("下13ma,0—");
        } else {
            stringBuffer.append("下13ma," + stockDayYanPanChunTuxing.getXiaJiangMa13() + "—");
        }
        if (stockDayYanPanChunTuxing.getXiaJiangCount13() == null) {
            stringBuffer.append("下13count,0—");
        } else {
            stringBuffer.append("下13count," + stockDayYanPanChunTuxing.getXiaJiangCount13() + "—");
        }
        if (stockDayYanPanChunTuxing.getXiaJiangRate13() == null) {
            stringBuffer.append("下13rate,0—");
        } else {
            stringBuffer.append("下13rate," + stockDayYanPanChunTuxing.getXiaJiangRate13() + "—");
        }
        if (stockDayYanPanChunTuxing.getShangZhangSum20() == null) {
            stringBuffer.append("上20sum,0—");
        } else {
            stringBuffer.append("上20sum," + stockDayYanPanChunTuxing.getShangZhangSum20() + "—");
        }
        if (stockDayYanPanChunTuxing.getShangZhangMa20() == null) {
            stringBuffer.append("上20ma,0—");
        } else {
            stringBuffer.append("上20ma," + stockDayYanPanChunTuxing.getShangZhangMa20() + "—");
        }
        if (stockDayYanPanChunTuxing.getShangZhangCount20() == null) {
            stringBuffer.append("上20count,0—");
        } else {
            stringBuffer.append("上20count," + stockDayYanPanChunTuxing.getShangZhangCount20() + "—");
        }
        if (stockDayYanPanChunTuxing.getShangZhangRate1() == null) {
            stringBuffer.append("上20rate,0—");
        } else {
            stringBuffer.append("上20rate," + stockDayYanPanChunTuxing.getShangZhangRate1() + "—");
        }
        if (stockDayYanPanChunTuxing.getXiaJiangSum20() == null) {
            stringBuffer.append("下20sum,0—");
        } else {
            stringBuffer.append("下20sum," + stockDayYanPanChunTuxing.getXiaJiangSum20() + "—");
        }
        if (stockDayYanPanChunTuxing.getXiaJiangMa20() == null) {
            stringBuffer.append("下20ma,0—");
        } else {
            stringBuffer.append("下20ma," + stockDayYanPanChunTuxing.getXiaJiangMa20() + "—");
        }
        if (stockDayYanPanChunTuxing.getXiaJiangCount20() == null) {
            stringBuffer.append("下20count,0—");
        } else {
            stringBuffer.append("下20count," + stockDayYanPanChunTuxing.getXiaJiangCount20() + "—");
        }
        if (stockDayYanPanChunTuxing.getXiaJiangRate20() == null) {
            stringBuffer.append("下20rate,0—");
        } else {
            stringBuffer.append("下20rate," + stockDayYanPanChunTuxing.getXiaJiangRate20());
        }
        return stringBuffer.toString();
    }

    public static String getZhuYanJiShuString(StockDayYanPanZhuYanJiShu stockDayYanPanZhuYanJiShu) {
        StringBuffer stringBuffer = new StringBuffer();
        if (StringUtils.isEmpty(stockDayYanPanZhuYanJiShu.getPriceAndMaRelation())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPanZhuYanJiShu.getPriceAndMaRelation() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPanZhuYanJiShu.getLiangXian())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPanZhuYanJiShu.getLiangXian() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPanZhuYanJiShu.getSanXian())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPanZhuYanJiShu.getSanXian() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPanZhuYanJiShu.getKdj())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPanZhuYanJiShu.getKdj() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPanZhuYanJiShu.getMacd())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPanZhuYanJiShu.getMacd() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPanZhuYanJiShu.getPriceMa())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPanZhuYanJiShu.getPriceMa() + "—");
        }
        if (stockDayYanPanZhuYanJiShu.getShangZhangSum1() == null) {
            stringBuffer.append("上1sum,0—");
        } else {
            stringBuffer.append("上1sum," + stockDayYanPanZhuYanJiShu.getShangZhangSum1() + "—");
        }
        if (stockDayYanPanZhuYanJiShu.getShangZhangMa1() == null) {
            stringBuffer.append("上1ma,0—");
        } else {
            stringBuffer.append("上1ma," + stockDayYanPanZhuYanJiShu.getShangZhangMa1() + "—");
        }
        if (stockDayYanPanZhuYanJiShu.getShangZhangCount1() == null) {
            stringBuffer.append("上1count,0—");
        } else {
            stringBuffer.append("上1count," + stockDayYanPanZhuYanJiShu.getShangZhangCount1() + "—");
        }
        if (stockDayYanPanZhuYanJiShu.getShangZhangRate1() == null) {
            stringBuffer.append("上1rate,0—");
        } else {
            stringBuffer.append("上1rate," + stockDayYanPanZhuYanJiShu.getShangZhangRate1() + "—");
        }
        if (stockDayYanPanZhuYanJiShu.getXiaJiangSum1() == null) {
            stringBuffer.append("下1sum,0—");
        } else {
            stringBuffer.append("下1sum," + stockDayYanPanZhuYanJiShu.getXiaJiangSum1() + "—");
        }
        if (stockDayYanPanZhuYanJiShu.getXiaJiangMa1() == null) {
            stringBuffer.append("下1ma,0—");
        } else {
            stringBuffer.append("下1ma," + stockDayYanPanZhuYanJiShu.getXiaJiangMa1() + "—");
        }
        if (stockDayYanPanZhuYanJiShu.getXiaJiangCount1() == null) {
            stringBuffer.append("下1count,0—");
        } else {
            stringBuffer.append("下1count," + stockDayYanPanZhuYanJiShu.getXiaJiangCount1() + "—");
        }
        if (stockDayYanPanZhuYanJiShu.getXiaJiangRate1() == null) {
            stringBuffer.append("下1rate,0—");
        } else {
            stringBuffer.append("下1rate," + stockDayYanPanZhuYanJiShu.getXiaJiangRate1() + "—");
        }
        if (stockDayYanPanZhuYanJiShu.getShangZhangSum2() == null) {
            stringBuffer.append("上2sum,0—");
        } else {
            stringBuffer.append("上2sum," + stockDayYanPanZhuYanJiShu.getShangZhangSum2() + "—");
        }
        if (stockDayYanPanZhuYanJiShu.getShangZhangMa2() == null) {
            stringBuffer.append("上2ma,0—");
        } else {
            stringBuffer.append("上2ma," + stockDayYanPanZhuYanJiShu.getShangZhangMa2() + "—");
        }
        if (stockDayYanPanZhuYanJiShu.getShangZhangCount2() == null) {
            stringBuffer.append("上2count,0—");
        } else {
            stringBuffer.append("上2count," + stockDayYanPanZhuYanJiShu.getShangZhangCount2() + "—");
        }
        if (stockDayYanPanZhuYanJiShu.getShangZhangRate2() == null) {
            stringBuffer.append("上2rate,0—");
        } else {
            stringBuffer.append("上2rate," + stockDayYanPanZhuYanJiShu.getShangZhangRate2() + "—");
        }
        if (stockDayYanPanZhuYanJiShu.getXiaJiangSum2() == null) {
            stringBuffer.append("下2sum,0—");
        } else {
            stringBuffer.append("下2sum," + stockDayYanPanZhuYanJiShu.getXiaJiangSum2() + "—");
        }
        if (stockDayYanPanZhuYanJiShu.getXiaJiangMa2() == null) {
            stringBuffer.append("下2ma,0—");
        } else {
            stringBuffer.append("下2ma," + stockDayYanPanZhuYanJiShu.getXiaJiangMa2() + "—");
        }
        if (stockDayYanPanZhuYanJiShu.getXiaJiangCount2() == null) {
            stringBuffer.append("下2count,0—");
        } else {
            stringBuffer.append("下2count," + stockDayYanPanZhuYanJiShu.getXiaJiangCount2() + "—");
        }
        if (stockDayYanPanZhuYanJiShu.getXiaJiangRate2() == null) {
            stringBuffer.append("下2rate,0—");
        } else {
            stringBuffer.append("下2rate," + stockDayYanPanZhuYanJiShu.getXiaJiangRate2() + "—");
        }
        if (stockDayYanPanZhuYanJiShu.getShangZhangSum3() == null) {
            stringBuffer.append("上3sum,0—");
        } else {
            stringBuffer.append("上3sum," + stockDayYanPanZhuYanJiShu.getShangZhangSum3() + "—");
        }
        if (stockDayYanPanZhuYanJiShu.getShangZhangMa3() == null) {
            stringBuffer.append("上3ma,0—");
        } else {
            stringBuffer.append("上3ma," + stockDayYanPanZhuYanJiShu.getShangZhangMa3() + "—");
        }
        if (stockDayYanPanZhuYanJiShu.getShangZhangCount3() == null) {
            stringBuffer.append("上3count,0—");
        } else {
            stringBuffer.append("上3count," + stockDayYanPanZhuYanJiShu.getShangZhangCount3() + "—");
        }
        if (stockDayYanPanZhuYanJiShu.getShangZhangRate3() == null) {
            stringBuffer.append("上3rate,0—");
        } else {
            stringBuffer.append("上3rate," + stockDayYanPanZhuYanJiShu.getShangZhangRate3() + "—");
        }
        if (stockDayYanPanZhuYanJiShu.getXiaJiangSum3() == null) {
            stringBuffer.append("下3sum,0—");
        } else {
            stringBuffer.append("下3sum," + stockDayYanPanZhuYanJiShu.getXiaJiangSum3() + "—");
        }
        if (stockDayYanPanZhuYanJiShu.getXiaJiangMa3() == null) {
            stringBuffer.append("下3ma,0—");
        } else {
            stringBuffer.append("下3ma," + stockDayYanPanZhuYanJiShu.getXiaJiangMa3() + "—");
        }
        if (stockDayYanPanZhuYanJiShu.getXiaJiangCount3() == null) {
            stringBuffer.append("下3count,0—");
        } else {
            stringBuffer.append("下3count," + stockDayYanPanZhuYanJiShu.getXiaJiangCount3() + "—");
        }
        if (stockDayYanPanZhuYanJiShu.getXiaJiangRate3() == null) {
            stringBuffer.append("下3rate,0—");
        } else {
            stringBuffer.append("下3rate," + stockDayYanPanZhuYanJiShu.getXiaJiangRate3() + "—");
        }
        if (stockDayYanPanZhuYanJiShu.getShangZhangSum5() == null) {
            stringBuffer.append("上5sum,0—");
        } else {
            stringBuffer.append("上5sum," + stockDayYanPanZhuYanJiShu.getShangZhangSum5() + "—");
        }
        if (stockDayYanPanZhuYanJiShu.getShangZhangMa5() == null) {
            stringBuffer.append("上5ma,0—");
        } else {
            stringBuffer.append("上5ma," + stockDayYanPanZhuYanJiShu.getShangZhangMa5() + "—");
        }
        if (stockDayYanPanZhuYanJiShu.getShangZhangCount5() == null) {
            stringBuffer.append("上5count,0—");
        } else {
            stringBuffer.append("上5count," + stockDayYanPanZhuYanJiShu.getShangZhangCount5() + "—");
        }
        if (stockDayYanPanZhuYanJiShu.getShangZhangRate5() == null) {
            stringBuffer.append("上5rate,0—");
        } else {
            stringBuffer.append("上5rate," + stockDayYanPanZhuYanJiShu.getShangZhangRate5() + "—");
        }
        if (stockDayYanPanZhuYanJiShu.getXiaJiangSum5() == null) {
            stringBuffer.append("下5sum,0—");
        } else {
            stringBuffer.append("下5sum," + stockDayYanPanZhuYanJiShu.getXiaJiangSum5() + "—");
        }
        if (stockDayYanPanZhuYanJiShu.getXiaJiangMa5() == null) {
            stringBuffer.append("下5ma,0—");
        } else {
            stringBuffer.append("下5ma," + stockDayYanPanZhuYanJiShu.getXiaJiangMa5() + "—");
        }
        if (stockDayYanPanZhuYanJiShu.getXiaJiangCount5() == null) {
            stringBuffer.append("下5count,0—");
        } else {
            stringBuffer.append("下5count," + stockDayYanPanZhuYanJiShu.getXiaJiangCount5() + "—");
        }
        if (stockDayYanPanZhuYanJiShu.getXiaJiangRate5() == null) {
            stringBuffer.append("下5rate,0—");
        } else {
            stringBuffer.append("下5rate," + stockDayYanPanZhuYanJiShu.getXiaJiangRate5() + "—");
        }
        if (stockDayYanPanZhuYanJiShu.getShangZhangSum8() == null) {
            stringBuffer.append("上8sum,0—");
        } else {
            stringBuffer.append("上8sum," + stockDayYanPanZhuYanJiShu.getShangZhangSum8() + "—");
        }
        if (stockDayYanPanZhuYanJiShu.getShangZhangMa8() == null) {
            stringBuffer.append("上8ma,0—");
        } else {
            stringBuffer.append("上8ma," + stockDayYanPanZhuYanJiShu.getShangZhangMa8() + "—");
        }
        if (stockDayYanPanZhuYanJiShu.getShangZhangCount8() == null) {
            stringBuffer.append("上8count,0—");
        } else {
            stringBuffer.append("上8count," + stockDayYanPanZhuYanJiShu.getShangZhangCount8() + "—");
        }
        if (stockDayYanPanZhuYanJiShu.getShangZhangRate8() == null) {
            stringBuffer.append("上8rate,0—");
        } else {
            stringBuffer.append("上8rate," + stockDayYanPanZhuYanJiShu.getShangZhangRate8() + "—");
        }
        if (stockDayYanPanZhuYanJiShu.getXiaJiangSum8() == null) {
            stringBuffer.append("下8sum,0—");
        } else {
            stringBuffer.append("下8sum," + stockDayYanPanZhuYanJiShu.getXiaJiangSum8() + "—");
        }
        if (stockDayYanPanZhuYanJiShu.getXiaJiangMa8() == null) {
            stringBuffer.append("下8ma,0—");
        } else {
            stringBuffer.append("下8ma," + stockDayYanPanZhuYanJiShu.getXiaJiangMa8() + "—");
        }
        if (stockDayYanPanZhuYanJiShu.getXiaJiangCount8() == null) {
            stringBuffer.append("下8count,0—");
        } else {
            stringBuffer.append("下8count," + stockDayYanPanZhuYanJiShu.getXiaJiangCount8() + "—");
        }
        if (stockDayYanPanZhuYanJiShu.getXiaJiangRate8() == null) {
            stringBuffer.append("下8rate,0—");
        } else {
            stringBuffer.append("下8rate," + stockDayYanPanZhuYanJiShu.getXiaJiangRate8() + "—");
        }
        if (stockDayYanPanZhuYanJiShu.getShangZhangSum13() == null) {
            stringBuffer.append("上13sum,0—");
        } else {
            stringBuffer.append("上13sum," + stockDayYanPanZhuYanJiShu.getShangZhangSum13() + "—");
        }
        if (stockDayYanPanZhuYanJiShu.getShangZhangMa13() == null) {
            stringBuffer.append("上13ma,0—");
        } else {
            stringBuffer.append("上13ma," + stockDayYanPanZhuYanJiShu.getShangZhangMa13() + "—");
        }
        if (stockDayYanPanZhuYanJiShu.getShangZhangCount13() == null) {
            stringBuffer.append("上13count,0—");
        } else {
            stringBuffer.append("上13count," + stockDayYanPanZhuYanJiShu.getShangZhangCount13() + "—");
        }
        if (stockDayYanPanZhuYanJiShu.getShangZhangRate13() == null) {
            stringBuffer.append("上13rate,0—");
        } else {
            stringBuffer.append("上13rate," + stockDayYanPanZhuYanJiShu.getShangZhangRate13() + "—");
        }
        if (stockDayYanPanZhuYanJiShu.getXiaJiangSum13() == null) {
            stringBuffer.append("下13sum,0—");
        } else {
            stringBuffer.append("下13sum," + stockDayYanPanZhuYanJiShu.getXiaJiangSum13() + "—");
        }
        if (stockDayYanPanZhuYanJiShu.getXiaJiangMa13() == null) {
            stringBuffer.append("下13ma,0—");
        } else {
            stringBuffer.append("下13ma," + stockDayYanPanZhuYanJiShu.getXiaJiangMa13() + "—");
        }
        if (stockDayYanPanZhuYanJiShu.getXiaJiangCount13() == null) {
            stringBuffer.append("下13count,0—");
        } else {
            stringBuffer.append("下13count," + stockDayYanPanZhuYanJiShu.getXiaJiangCount13() + "—");
        }
        if (stockDayYanPanZhuYanJiShu.getXiaJiangRate13() == null) {
            stringBuffer.append("下13rate,0—");
        } else {
            stringBuffer.append("下13rate," + stockDayYanPanZhuYanJiShu.getXiaJiangRate13() + "—");
        }
        if (stockDayYanPanZhuYanJiShu.getShangZhangSum20() == null) {
            stringBuffer.append("上20sum,0—");
        } else {
            stringBuffer.append("上20sum," + stockDayYanPanZhuYanJiShu.getShangZhangSum20() + "—");
        }
        if (stockDayYanPanZhuYanJiShu.getShangZhangMa20() == null) {
            stringBuffer.append("上20ma,0—");
        } else {
            stringBuffer.append("上20ma," + stockDayYanPanZhuYanJiShu.getShangZhangMa20() + "—");
        }
        if (stockDayYanPanZhuYanJiShu.getShangZhangCount20() == null) {
            stringBuffer.append("上20count,0—");
        } else {
            stringBuffer.append("上20count," + stockDayYanPanZhuYanJiShu.getShangZhangCount20() + "—");
        }
        if (stockDayYanPanZhuYanJiShu.getShangZhangRate1() == null) {
            stringBuffer.append("上20rate,0—");
        } else {
            stringBuffer.append("上20rate," + stockDayYanPanZhuYanJiShu.getShangZhangRate1() + "—");
        }
        if (stockDayYanPanZhuYanJiShu.getXiaJiangSum20() == null) {
            stringBuffer.append("下20sum,0—");
        } else {
            stringBuffer.append("下20sum," + stockDayYanPanZhuYanJiShu.getXiaJiangSum20() + "—");
        }
        if (stockDayYanPanZhuYanJiShu.getXiaJiangMa20() == null) {
            stringBuffer.append("下20ma,0—");
        } else {
            stringBuffer.append("下20ma," + stockDayYanPanZhuYanJiShu.getXiaJiangMa20() + "—");
        }
        if (stockDayYanPanZhuYanJiShu.getXiaJiangCount20() == null) {
            stringBuffer.append("下20count,0—");
        } else {
            stringBuffer.append("下20count," + stockDayYanPanZhuYanJiShu.getXiaJiangCount20() + "—");
        }
        if (stockDayYanPanZhuYanJiShu.getXiaJiangRate20() == null) {
            stringBuffer.append("下20rate,0—");
        } else {
            stringBuffer.append("下20rate," + stockDayYanPanZhuYanJiShu.getXiaJiangRate20());
        }
        return stringBuffer.toString();
    }
}
