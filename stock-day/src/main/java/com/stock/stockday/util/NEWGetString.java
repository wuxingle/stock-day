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
import com.stock.stockday.model.StockDayYanPanKMAQ20;
import com.stock.stockday.model.StockDayYanPanKMPTD;
import com.stock.stockday.model.StockDayYanPanKTu20L;
import com.stock.stockday.model.StockDayYanPanKTu20LS;
import com.stock.stockday.model.StockDayYanPanKTu20S;
import com.stock.stockday.model.StockDayYanPanKmQR;
import com.stock.stockday.model.StockDayYanPanQTuXing;
import org.apache.commons.lang.StringUtils;

public class NEWGetString {

    public static String getkmptdString(StockDayYanPanKMPTD stockDayYanPanKMPTD) {
        StringBuffer stringBuffer = new StringBuffer();
        if (StringUtils.isEmpty(stockDayYanPanKMPTD.getPriceAndMaRelation())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPanKMPTD.getPriceAndMaRelation() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPanKMPTD.getQian20TuXing())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPanKMPTD.getQian20TuXing() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPanKMPTD.getKdj())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPanKMPTD.getKdj() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPanKMPTD.getPriceMa())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPanKMPTD.getPriceMa() + "—");
        }
        if (stockDayYanPanKMPTD.getShangZhangSum1() == null) {
            stringBuffer.append("上1sum,0—");
        } else {
            stringBuffer.append("上1sum," + stockDayYanPanKMPTD.getShangZhangSum1() + "—");
        }
        if (stockDayYanPanKMPTD.getShangZhangMa1() == null) {
            stringBuffer.append("上1ma,0—");
        } else {
            stringBuffer.append("上1ma," + stockDayYanPanKMPTD.getShangZhangMa1() + "—");
        }
        if (stockDayYanPanKMPTD.getShangZhangCount1() == null) {
            stringBuffer.append("上1count,0—");
        } else {
            stringBuffer.append("上1count," + stockDayYanPanKMPTD.getShangZhangCount1() + "—");
        }
        if (stockDayYanPanKMPTD.getShangZhangRate1() == null) {
            stringBuffer.append("上1rate,0—");
        } else {
            stringBuffer.append("上1rate," + stockDayYanPanKMPTD.getShangZhangRate1() + "—");
        }
        if (stockDayYanPanKMPTD.getXiaJiangSum1() == null) {
            stringBuffer.append("下1sum,0—");
        } else {
            stringBuffer.append("下1sum," + stockDayYanPanKMPTD.getXiaJiangSum1() + "—");
        }
        if (stockDayYanPanKMPTD.getXiaJiangMa1() == null) {
            stringBuffer.append("下1ma,0—");
        } else {
            stringBuffer.append("下1ma," + stockDayYanPanKMPTD.getXiaJiangMa1() + "—");
        }
        if (stockDayYanPanKMPTD.getXiaJiangCount1() == null) {
            stringBuffer.append("下1count,0—");
        } else {
            stringBuffer.append("下1count," + stockDayYanPanKMPTD.getXiaJiangCount1() + "—");
        }
        if (stockDayYanPanKMPTD.getXiaJiangRate1() == null) {
            stringBuffer.append("下1rate,0—");
        } else {
            stringBuffer.append("下1rate," + stockDayYanPanKMPTD.getXiaJiangRate1() + "—");
        }
        if (stockDayYanPanKMPTD.getShangZhangSum2() == null) {
            stringBuffer.append("上2sum,0—");
        } else {
            stringBuffer.append("上2sum," + stockDayYanPanKMPTD.getShangZhangSum2() + "—");
        }
        if (stockDayYanPanKMPTD.getShangZhangMa2() == null) {
            stringBuffer.append("上2ma,0—");
        } else {
            stringBuffer.append("上2ma," + stockDayYanPanKMPTD.getShangZhangMa2() + "—");
        }
        if (stockDayYanPanKMPTD.getShangZhangCount2() == null) {
            stringBuffer.append("上2count,0—");
        } else {
            stringBuffer.append("上2count," + stockDayYanPanKMPTD.getShangZhangCount2() + "—");
        }
        if (stockDayYanPanKMPTD.getShangZhangRate2() == null) {
            stringBuffer.append("上2rate,0—");
        } else {
            stringBuffer.append("上2rate," + stockDayYanPanKMPTD.getShangZhangRate2() + "—");
        }
        if (stockDayYanPanKMPTD.getXiaJiangSum2() == null) {
            stringBuffer.append("下2sum,0—");
        } else {
            stringBuffer.append("下2sum," + stockDayYanPanKMPTD.getXiaJiangSum2() + "—");
        }
        if (stockDayYanPanKMPTD.getXiaJiangMa2() == null) {
            stringBuffer.append("下2ma,0—");
        } else {
            stringBuffer.append("下2ma," + stockDayYanPanKMPTD.getXiaJiangMa2() + "—");
        }
        if (stockDayYanPanKMPTD.getXiaJiangCount2() == null) {
            stringBuffer.append("下2count,0—");
        } else {
            stringBuffer.append("下2count," + stockDayYanPanKMPTD.getXiaJiangCount2() + "—");
        }
        if (stockDayYanPanKMPTD.getXiaJiangRate2() == null) {
            stringBuffer.append("下2rate,0—");
        } else {
            stringBuffer.append("下2rate," + stockDayYanPanKMPTD.getXiaJiangRate2() + "—");
        }
        if (stockDayYanPanKMPTD.getShangZhangSum3() == null) {
            stringBuffer.append("上3sum,0—");
        } else {
            stringBuffer.append("上3sum," + stockDayYanPanKMPTD.getShangZhangSum3() + "—");
        }
        if (stockDayYanPanKMPTD.getShangZhangMa3() == null) {
            stringBuffer.append("上3ma,0—");
        } else {
            stringBuffer.append("上3ma," + stockDayYanPanKMPTD.getShangZhangMa3() + "—");
        }
        if (stockDayYanPanKMPTD.getShangZhangCount3() == null) {
            stringBuffer.append("上3count,0—");
        } else {
            stringBuffer.append("上3count," + stockDayYanPanKMPTD.getShangZhangCount3() + "—");
        }
        if (stockDayYanPanKMPTD.getShangZhangRate3() == null) {
            stringBuffer.append("上3rate,0—");
        } else {
            stringBuffer.append("上3rate," + stockDayYanPanKMPTD.getShangZhangRate3() + "—");
        }
        if (stockDayYanPanKMPTD.getXiaJiangSum3() == null) {
            stringBuffer.append("下3sum,0—");
        } else {
            stringBuffer.append("下3sum," + stockDayYanPanKMPTD.getXiaJiangSum3() + "—");
        }
        if (stockDayYanPanKMPTD.getXiaJiangMa3() == null) {
            stringBuffer.append("下3ma,0—");
        } else {
            stringBuffer.append("下3ma," + stockDayYanPanKMPTD.getXiaJiangMa3() + "—");
        }
        if (stockDayYanPanKMPTD.getXiaJiangCount3() == null) {
            stringBuffer.append("下3count,0—");
        } else {
            stringBuffer.append("下3count," + stockDayYanPanKMPTD.getXiaJiangCount3() + "—");
        }
        if (stockDayYanPanKMPTD.getXiaJiangRate3() == null) {
            stringBuffer.append("下3rate,0—");
        } else {
            stringBuffer.append("下3rate," + stockDayYanPanKMPTD.getXiaJiangRate3() + "—");
        }
        if (stockDayYanPanKMPTD.getShangZhangSum5() == null) {
            stringBuffer.append("上5sum,0—");
        } else {
            stringBuffer.append("上5sum," + stockDayYanPanKMPTD.getShangZhangSum5() + "—");
        }
        if (stockDayYanPanKMPTD.getShangZhangMa5() == null) {
            stringBuffer.append("上5ma,0—");
        } else {
            stringBuffer.append("上5ma," + stockDayYanPanKMPTD.getShangZhangMa5() + "—");
        }
        if (stockDayYanPanKMPTD.getShangZhangCount5() == null) {
            stringBuffer.append("上5count,0—");
        } else {
            stringBuffer.append("上5count," + stockDayYanPanKMPTD.getShangZhangCount5() + "—");
        }
        if (stockDayYanPanKMPTD.getShangZhangRate5() == null) {
            stringBuffer.append("上5rate,0—");
        } else {
            stringBuffer.append("上5rate," + stockDayYanPanKMPTD.getShangZhangRate5() + "—");
        }
        if (stockDayYanPanKMPTD.getXiaJiangSum5() == null) {
            stringBuffer.append("下5sum,0—");
        } else {
            stringBuffer.append("下5sum," + stockDayYanPanKMPTD.getXiaJiangSum5() + "—");
        }
        if (stockDayYanPanKMPTD.getXiaJiangMa5() == null) {
            stringBuffer.append("下5ma,0—");
        } else {
            stringBuffer.append("下5ma," + stockDayYanPanKMPTD.getXiaJiangMa5() + "—");
        }
        if (stockDayYanPanKMPTD.getXiaJiangCount5() == null) {
            stringBuffer.append("下5count,0—");
        } else {
            stringBuffer.append("下5count," + stockDayYanPanKMPTD.getXiaJiangCount5() + "—");
        }
        if (stockDayYanPanKMPTD.getXiaJiangRate5() == null) {
            stringBuffer.append("下5rate,0—");
        } else {
            stringBuffer.append("下5rate," + stockDayYanPanKMPTD.getXiaJiangRate5() + "—");
        }
        if (stockDayYanPanKMPTD.getShangZhangSum8() == null) {
            stringBuffer.append("上8sum,0—");
        } else {
            stringBuffer.append("上8sum," + stockDayYanPanKMPTD.getShangZhangSum8() + "—");
        }
        if (stockDayYanPanKMPTD.getShangZhangMa8() == null) {
            stringBuffer.append("上8ma,0—");
        } else {
            stringBuffer.append("上8ma," + stockDayYanPanKMPTD.getShangZhangMa8() + "—");
        }
        if (stockDayYanPanKMPTD.getShangZhangCount8() == null) {
            stringBuffer.append("上8count,0—");
        } else {
            stringBuffer.append("上8count," + stockDayYanPanKMPTD.getShangZhangCount8() + "—");
        }
        if (stockDayYanPanKMPTD.getShangZhangRate8() == null) {
            stringBuffer.append("上8rate,0—");
        } else {
            stringBuffer.append("上8rate," + stockDayYanPanKMPTD.getShangZhangRate8() + "—");
        }
        if (stockDayYanPanKMPTD.getXiaJiangSum8() == null) {
            stringBuffer.append("下8sum,0—");
        } else {
            stringBuffer.append("下8sum," + stockDayYanPanKMPTD.getXiaJiangSum8() + "—");
        }
        if (stockDayYanPanKMPTD.getXiaJiangMa8() == null) {
            stringBuffer.append("下8ma,0—");
        } else {
            stringBuffer.append("下8ma," + stockDayYanPanKMPTD.getXiaJiangMa8() + "—");
        }
        if (stockDayYanPanKMPTD.getXiaJiangCount8() == null) {
            stringBuffer.append("下8count,0—");
        } else {
            stringBuffer.append("下8count," + stockDayYanPanKMPTD.getXiaJiangCount8() + "—");
        }
        if (stockDayYanPanKMPTD.getXiaJiangRate8() == null) {
            stringBuffer.append("下8rate,0—");
        } else {
            stringBuffer.append("下8rate," + stockDayYanPanKMPTD.getXiaJiangRate8() + "—");
        }
        if (stockDayYanPanKMPTD.getShangZhangSum13() == null) {
            stringBuffer.append("上13sum,0—");
        } else {
            stringBuffer.append("上13sum," + stockDayYanPanKMPTD.getShangZhangSum13() + "—");
        }
        if (stockDayYanPanKMPTD.getShangZhangMa13() == null) {
            stringBuffer.append("上13ma,0—");
        } else {
            stringBuffer.append("上13ma," + stockDayYanPanKMPTD.getShangZhangMa13() + "—");
        }
        if (stockDayYanPanKMPTD.getShangZhangCount13() == null) {
            stringBuffer.append("上13count,0—");
        } else {
            stringBuffer.append("上13count," + stockDayYanPanKMPTD.getShangZhangCount13() + "—");
        }
        if (stockDayYanPanKMPTD.getShangZhangRate13() == null) {
            stringBuffer.append("上13rate,0—");
        } else {
            stringBuffer.append("上13rate," + stockDayYanPanKMPTD.getShangZhangRate13() + "—");
        }
        if (stockDayYanPanKMPTD.getXiaJiangSum13() == null) {
            stringBuffer.append("下13sum,0—");
        } else {
            stringBuffer.append("下13sum," + stockDayYanPanKMPTD.getXiaJiangSum13() + "—");
        }
        if (stockDayYanPanKMPTD.getXiaJiangMa13() == null) {
            stringBuffer.append("下13ma,0—");
        } else {
            stringBuffer.append("下13ma," + stockDayYanPanKMPTD.getXiaJiangMa13() + "—");
        }
        if (stockDayYanPanKMPTD.getXiaJiangCount13() == null) {
            stringBuffer.append("下13count,0—");
        } else {
            stringBuffer.append("下13count," + stockDayYanPanKMPTD.getXiaJiangCount13() + "—");
        }
        if (stockDayYanPanKMPTD.getXiaJiangRate13() == null) {
            stringBuffer.append("下13rate,0—");
        } else {
            stringBuffer.append("下13rate," + stockDayYanPanKMPTD.getXiaJiangRate13() + "—");
        }
        if (stockDayYanPanKMPTD.getShangZhangSum20() == null) {
            stringBuffer.append("上20sum,0—");
        } else {
            stringBuffer.append("上20sum," + stockDayYanPanKMPTD.getShangZhangSum20() + "—");
        }
        if (stockDayYanPanKMPTD.getShangZhangMa20() == null) {
            stringBuffer.append("上20ma,0—");
        } else {
            stringBuffer.append("上20ma," + stockDayYanPanKMPTD.getShangZhangMa20() + "—");
        }
        if (stockDayYanPanKMPTD.getShangZhangCount20() == null) {
            stringBuffer.append("上20count,0—");
        } else {
            stringBuffer.append("上20count," + stockDayYanPanKMPTD.getShangZhangCount20() + "—");
        }
        if (stockDayYanPanKMPTD.getShangZhangRate20() == null) {
            stringBuffer.append("上20rate,0—");
        } else {
            stringBuffer.append("上20rate," + stockDayYanPanKMPTD.getShangZhangRate20() + "—");
        }
        if (stockDayYanPanKMPTD.getXiaJiangSum20() == null) {
            stringBuffer.append("下20sum,0—");
        } else {
            stringBuffer.append("下20sum," + stockDayYanPanKMPTD.getXiaJiangSum20() + "—");
        }
        if (stockDayYanPanKMPTD.getXiaJiangMa20() == null) {
            stringBuffer.append("下20ma,0—");
        } else {
            stringBuffer.append("下20ma," + stockDayYanPanKMPTD.getXiaJiangMa20() + "—");
        }
        if (stockDayYanPanKMPTD.getXiaJiangCount20() == null) {
            stringBuffer.append("下20count,0—");
        } else {
            stringBuffer.append("下20count," + stockDayYanPanKMPTD.getXiaJiangCount20() + "—");
        }
        if (stockDayYanPanKMPTD.getXiaJiangRate20() == null) {
            stringBuffer.append("下20rate,0—");
        } else {
            stringBuffer.append("下20rate," + stockDayYanPanKMPTD.getXiaJiangRate20());
        }
        return stringBuffer.toString();
    }

    public static String getKTu20LSString(StockDayYanPanKTu20LS stockDayYanPanKTu20LS) {
        StringBuffer stringBuffer = new StringBuffer();
        if (StringUtils.isEmpty(stockDayYanPanKTu20LS.getLiangXian())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPanKTu20LS.getLiangXian() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPanKTu20LS.getSanXian())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPanKTu20LS.getSanXian() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPanKTu20LS.getQian20TuXing())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPanKTu20LS.getQian20TuXing() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPanKTu20LS.getKdj())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPanKTu20LS.getKdj() + "—");
        }
        if (stockDayYanPanKTu20LS.getShangZhangSum1() == null) {
            stringBuffer.append("上1sum,0—");
        } else {
            stringBuffer.append("上1sum," + stockDayYanPanKTu20LS.getShangZhangSum1() + "—");
        }
        if (stockDayYanPanKTu20LS.getShangZhangMa1() == null) {
            stringBuffer.append("上1ma,0—");
        } else {
            stringBuffer.append("上1ma," + stockDayYanPanKTu20LS.getShangZhangMa1() + "—");
        }
        if (stockDayYanPanKTu20LS.getShangZhangCount1() == null) {
            stringBuffer.append("上1count,0—");
        } else {
            stringBuffer.append("上1count," + stockDayYanPanKTu20LS.getShangZhangCount1() + "—");
        }
        if (stockDayYanPanKTu20LS.getShangZhangRate1() == null) {
            stringBuffer.append("上1rate,0—");
        } else {
            stringBuffer.append("上1rate," + stockDayYanPanKTu20LS.getShangZhangRate1() + "—");
        }
        if (stockDayYanPanKTu20LS.getXiaJiangSum1() == null) {
            stringBuffer.append("下1sum,0—");
        } else {
            stringBuffer.append("下1sum," + stockDayYanPanKTu20LS.getXiaJiangSum1() + "—");
        }
        if (stockDayYanPanKTu20LS.getXiaJiangMa1() == null) {
            stringBuffer.append("下1ma,0—");
        } else {
            stringBuffer.append("下1ma," + stockDayYanPanKTu20LS.getXiaJiangMa1() + "—");
        }
        if (stockDayYanPanKTu20LS.getXiaJiangCount1() == null) {
            stringBuffer.append("下1count,0—");
        } else {
            stringBuffer.append("下1count," + stockDayYanPanKTu20LS.getXiaJiangCount1() + "—");
        }
        if (stockDayYanPanKTu20LS.getXiaJiangRate1() == null) {
            stringBuffer.append("下1rate,0—");
        } else {
            stringBuffer.append("下1rate," + stockDayYanPanKTu20LS.getXiaJiangRate1() + "—");
        }
        if (stockDayYanPanKTu20LS.getShangZhangSum2() == null) {
            stringBuffer.append("上2sum,0—");
        } else {
            stringBuffer.append("上2sum," + stockDayYanPanKTu20LS.getShangZhangSum2() + "—");
        }
        if (stockDayYanPanKTu20LS.getShangZhangMa2() == null) {
            stringBuffer.append("上2ma,0—");
        } else {
            stringBuffer.append("上2ma," + stockDayYanPanKTu20LS.getShangZhangMa2() + "—");
        }
        if (stockDayYanPanKTu20LS.getShangZhangCount2() == null) {
            stringBuffer.append("上2count,0—");
        } else {
            stringBuffer.append("上2count," + stockDayYanPanKTu20LS.getShangZhangCount2() + "—");
        }
        if (stockDayYanPanKTu20LS.getShangZhangRate2() == null) {
            stringBuffer.append("上2rate,0—");
        } else {
            stringBuffer.append("上2rate," + stockDayYanPanKTu20LS.getShangZhangRate2() + "—");
        }
        if (stockDayYanPanKTu20LS.getXiaJiangSum2() == null) {
            stringBuffer.append("下2sum,0—");
        } else {
            stringBuffer.append("下2sum," + stockDayYanPanKTu20LS.getXiaJiangSum2() + "—");
        }
        if (stockDayYanPanKTu20LS.getXiaJiangMa2() == null) {
            stringBuffer.append("下2ma,0—");
        } else {
            stringBuffer.append("下2ma," + stockDayYanPanKTu20LS.getXiaJiangMa2() + "—");
        }
        if (stockDayYanPanKTu20LS.getXiaJiangCount2() == null) {
            stringBuffer.append("下2count,0—");
        } else {
            stringBuffer.append("下2count," + stockDayYanPanKTu20LS.getXiaJiangCount2() + "—");
        }
        if (stockDayYanPanKTu20LS.getXiaJiangRate2() == null) {
            stringBuffer.append("下2rate,0—");
        } else {
            stringBuffer.append("下2rate," + stockDayYanPanKTu20LS.getXiaJiangRate2() + "—");
        }
        if (stockDayYanPanKTu20LS.getShangZhangSum3() == null) {
            stringBuffer.append("上3sum,0—");
        } else {
            stringBuffer.append("上3sum," + stockDayYanPanKTu20LS.getShangZhangSum3() + "—");
        }
        if (stockDayYanPanKTu20LS.getShangZhangMa3() == null) {
            stringBuffer.append("上3ma,0—");
        } else {
            stringBuffer.append("上3ma," + stockDayYanPanKTu20LS.getShangZhangMa3() + "—");
        }
        if (stockDayYanPanKTu20LS.getShangZhangCount3() == null) {
            stringBuffer.append("上3count,0—");
        } else {
            stringBuffer.append("上3count," + stockDayYanPanKTu20LS.getShangZhangCount3() + "—");
        }
        if (stockDayYanPanKTu20LS.getShangZhangRate3() == null) {
            stringBuffer.append("上3rate,0—");
        } else {
            stringBuffer.append("上3rate," + stockDayYanPanKTu20LS.getShangZhangRate3() + "—");
        }
        if (stockDayYanPanKTu20LS.getXiaJiangSum3() == null) {
            stringBuffer.append("下3sum,0—");
        } else {
            stringBuffer.append("下3sum," + stockDayYanPanKTu20LS.getXiaJiangSum3() + "—");
        }
        if (stockDayYanPanKTu20LS.getXiaJiangMa3() == null) {
            stringBuffer.append("下3ma,0—");
        } else {
            stringBuffer.append("下3ma," + stockDayYanPanKTu20LS.getXiaJiangMa3() + "—");
        }
        if (stockDayYanPanKTu20LS.getXiaJiangCount3() == null) {
            stringBuffer.append("下3count,0—");
        } else {
            stringBuffer.append("下3count," + stockDayYanPanKTu20LS.getXiaJiangCount3() + "—");
        }
        if (stockDayYanPanKTu20LS.getXiaJiangRate3() == null) {
            stringBuffer.append("下3rate,0—");
        } else {
            stringBuffer.append("下3rate," + stockDayYanPanKTu20LS.getXiaJiangRate3() + "—");
        }
        if (stockDayYanPanKTu20LS.getShangZhangSum5() == null) {
            stringBuffer.append("上5sum,0—");
        } else {
            stringBuffer.append("上5sum," + stockDayYanPanKTu20LS.getShangZhangSum5() + "—");
        }
        if (stockDayYanPanKTu20LS.getShangZhangMa5() == null) {
            stringBuffer.append("上5ma,0—");
        } else {
            stringBuffer.append("上5ma," + stockDayYanPanKTu20LS.getShangZhangMa5() + "—");
        }
        if (stockDayYanPanKTu20LS.getShangZhangCount5() == null) {
            stringBuffer.append("上5count,0—");
        } else {
            stringBuffer.append("上5count," + stockDayYanPanKTu20LS.getShangZhangCount5() + "—");
        }
        if (stockDayYanPanKTu20LS.getShangZhangRate5() == null) {
            stringBuffer.append("上5rate,0—");
        } else {
            stringBuffer.append("上5rate," + stockDayYanPanKTu20LS.getShangZhangRate5() + "—");
        }
        if (stockDayYanPanKTu20LS.getXiaJiangSum5() == null) {
            stringBuffer.append("下5sum,0—");
        } else {
            stringBuffer.append("下5sum," + stockDayYanPanKTu20LS.getXiaJiangSum5() + "—");
        }
        if (stockDayYanPanKTu20LS.getXiaJiangMa5() == null) {
            stringBuffer.append("下5ma,0—");
        } else {
            stringBuffer.append("下5ma," + stockDayYanPanKTu20LS.getXiaJiangMa5() + "—");
        }
        if (stockDayYanPanKTu20LS.getXiaJiangCount5() == null) {
            stringBuffer.append("下5count,0—");
        } else {
            stringBuffer.append("下5count," + stockDayYanPanKTu20LS.getXiaJiangCount5() + "—");
        }
        if (stockDayYanPanKTu20LS.getXiaJiangRate5() == null) {
            stringBuffer.append("下5rate,0—");
        } else {
            stringBuffer.append("下5rate," + stockDayYanPanKTu20LS.getXiaJiangRate5() + "—");
        }
        if (stockDayYanPanKTu20LS.getShangZhangSum8() == null) {
            stringBuffer.append("上8sum,0—");
        } else {
            stringBuffer.append("上8sum," + stockDayYanPanKTu20LS.getShangZhangSum8() + "—");
        }
        if (stockDayYanPanKTu20LS.getShangZhangMa8() == null) {
            stringBuffer.append("上8ma,0—");
        } else {
            stringBuffer.append("上8ma," + stockDayYanPanKTu20LS.getShangZhangMa8() + "—");
        }
        if (stockDayYanPanKTu20LS.getShangZhangCount8() == null) {
            stringBuffer.append("上8count,0—");
        } else {
            stringBuffer.append("上8count," + stockDayYanPanKTu20LS.getShangZhangCount8() + "—");
        }
        if (stockDayYanPanKTu20LS.getShangZhangRate8() == null) {
            stringBuffer.append("上8rate,0—");
        } else {
            stringBuffer.append("上8rate," + stockDayYanPanKTu20LS.getShangZhangRate8() + "—");
        }
        if (stockDayYanPanKTu20LS.getXiaJiangSum8() == null) {
            stringBuffer.append("下8sum,0—");
        } else {
            stringBuffer.append("下8sum," + stockDayYanPanKTu20LS.getXiaJiangSum8() + "—");
        }
        if (stockDayYanPanKTu20LS.getXiaJiangMa8() == null) {
            stringBuffer.append("下8ma,0—");
        } else {
            stringBuffer.append("下8ma," + stockDayYanPanKTu20LS.getXiaJiangMa8() + "—");
        }
        if (stockDayYanPanKTu20LS.getXiaJiangCount8() == null) {
            stringBuffer.append("下8count,0—");
        } else {
            stringBuffer.append("下8count," + stockDayYanPanKTu20LS.getXiaJiangCount8() + "—");
        }
        if (stockDayYanPanKTu20LS.getXiaJiangRate8() == null) {
            stringBuffer.append("下8rate,0—");
        } else {
            stringBuffer.append("下8rate," + stockDayYanPanKTu20LS.getXiaJiangRate8() + "—");
        }
        if (stockDayYanPanKTu20LS.getShangZhangSum13() == null) {
            stringBuffer.append("上13sum,0—");
        } else {
            stringBuffer.append("上13sum," + stockDayYanPanKTu20LS.getShangZhangSum13() + "—");
        }
        if (stockDayYanPanKTu20LS.getShangZhangMa13() == null) {
            stringBuffer.append("上13ma,0—");
        } else {
            stringBuffer.append("上13ma," + stockDayYanPanKTu20LS.getShangZhangMa13() + "—");
        }
        if (stockDayYanPanKTu20LS.getShangZhangCount13() == null) {
            stringBuffer.append("上13count,0—");
        } else {
            stringBuffer.append("上13count," + stockDayYanPanKTu20LS.getShangZhangCount13() + "—");
        }
        if (stockDayYanPanKTu20LS.getShangZhangRate13() == null) {
            stringBuffer.append("上13rate,0—");
        } else {
            stringBuffer.append("上13rate," + stockDayYanPanKTu20LS.getShangZhangRate13() + "—");
        }
        if (stockDayYanPanKTu20LS.getXiaJiangSum13() == null) {
            stringBuffer.append("下13sum,0—");
        } else {
            stringBuffer.append("下13sum," + stockDayYanPanKTu20LS.getXiaJiangSum13() + "—");
        }
        if (stockDayYanPanKTu20LS.getXiaJiangMa13() == null) {
            stringBuffer.append("下13ma,0—");
        } else {
            stringBuffer.append("下13ma," + stockDayYanPanKTu20LS.getXiaJiangMa13() + "—");
        }
        if (stockDayYanPanKTu20LS.getXiaJiangCount13() == null) {
            stringBuffer.append("下13count,0—");
        } else {
            stringBuffer.append("下13count," + stockDayYanPanKTu20LS.getXiaJiangCount13() + "—");
        }
        if (stockDayYanPanKTu20LS.getXiaJiangRate13() == null) {
            stringBuffer.append("下13rate,0—");
        } else {
            stringBuffer.append("下13rate," + stockDayYanPanKTu20LS.getXiaJiangRate13() + "—");
        }
        if (stockDayYanPanKTu20LS.getShangZhangSum20() == null) {
            stringBuffer.append("上20sum,0—");
        } else {
            stringBuffer.append("上20sum," + stockDayYanPanKTu20LS.getShangZhangSum20() + "—");
        }
        if (stockDayYanPanKTu20LS.getShangZhangMa20() == null) {
            stringBuffer.append("上20ma,0—");
        } else {
            stringBuffer.append("上20ma," + stockDayYanPanKTu20LS.getShangZhangMa20() + "—");
        }
        if (stockDayYanPanKTu20LS.getShangZhangCount20() == null) {
            stringBuffer.append("上20count,0—");
        } else {
            stringBuffer.append("上20count," + stockDayYanPanKTu20LS.getShangZhangCount20() + "—");
        }
        if (stockDayYanPanKTu20LS.getShangZhangRate20() == null) {
            stringBuffer.append("上20rate,0—");
        } else {
            stringBuffer.append("上20rate," + stockDayYanPanKTu20LS.getShangZhangRate20() + "—");
        }
        if (stockDayYanPanKTu20LS.getXiaJiangSum20() == null) {
            stringBuffer.append("下20sum,0—");
        } else {
            stringBuffer.append("下20sum," + stockDayYanPanKTu20LS.getXiaJiangSum20() + "—");
        }
        if (stockDayYanPanKTu20LS.getXiaJiangMa20() == null) {
            stringBuffer.append("下20ma,0—");
        } else {
            stringBuffer.append("下20ma," + stockDayYanPanKTu20LS.getXiaJiangMa20() + "—");
        }
        if (stockDayYanPanKTu20LS.getXiaJiangCount20() == null) {
            stringBuffer.append("下20count,0—");
        } else {
            stringBuffer.append("下20count," + stockDayYanPanKTu20LS.getXiaJiangCount20() + "—");
        }
        if (stockDayYanPanKTu20LS.getXiaJiangRate20() == null) {
            stringBuffer.append("下20rate,0—");
        } else {
            stringBuffer.append("下20rate," + stockDayYanPanKTu20LS.getXiaJiangRate20());
        }
        return stringBuffer.toString();
    }

    public static String getKTu20SString(StockDayYanPanKTu20S stockDayYanPanKTu20S) {
        StringBuffer stringBuffer = new StringBuffer();
        if (StringUtils.isEmpty(stockDayYanPanKTu20S.getSanXian())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPanKTu20S.getSanXian() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPanKTu20S.getQian20TuXing())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPanKTu20S.getQian20TuXing() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPanKTu20S.getKdj())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPanKTu20S.getKdj() + "—");
        }
        if (stockDayYanPanKTu20S.getShangZhangSum1() == null) {
            stringBuffer.append("上1sum,0—");
        } else {
            stringBuffer.append("上1sum," + stockDayYanPanKTu20S.getShangZhangSum1() + "—");
        }
        if (stockDayYanPanKTu20S.getShangZhangMa1() == null) {
            stringBuffer.append("上1ma,0—");
        } else {
            stringBuffer.append("上1ma," + stockDayYanPanKTu20S.getShangZhangMa1() + "—");
        }
        if (stockDayYanPanKTu20S.getShangZhangCount1() == null) {
            stringBuffer.append("上1count,0—");
        } else {
            stringBuffer.append("上1count," + stockDayYanPanKTu20S.getShangZhangCount1() + "—");
        }
        if (stockDayYanPanKTu20S.getShangZhangRate1() == null) {
            stringBuffer.append("上1rate,0—");
        } else {
            stringBuffer.append("上1rate," + stockDayYanPanKTu20S.getShangZhangRate1() + "—");
        }
        if (stockDayYanPanKTu20S.getXiaJiangSum1() == null) {
            stringBuffer.append("下1sum,0—");
        } else {
            stringBuffer.append("下1sum," + stockDayYanPanKTu20S.getXiaJiangSum1() + "—");
        }
        if (stockDayYanPanKTu20S.getXiaJiangMa1() == null) {
            stringBuffer.append("下1ma,0—");
        } else {
            stringBuffer.append("下1ma," + stockDayYanPanKTu20S.getXiaJiangMa1() + "—");
        }
        if (stockDayYanPanKTu20S.getXiaJiangCount1() == null) {
            stringBuffer.append("下1count,0—");
        } else {
            stringBuffer.append("下1count," + stockDayYanPanKTu20S.getXiaJiangCount1() + "—");
        }
        if (stockDayYanPanKTu20S.getXiaJiangRate1() == null) {
            stringBuffer.append("下1rate,0—");
        } else {
            stringBuffer.append("下1rate," + stockDayYanPanKTu20S.getXiaJiangRate1() + "—");
        }
        if (stockDayYanPanKTu20S.getShangZhangSum2() == null) {
            stringBuffer.append("上2sum,0—");
        } else {
            stringBuffer.append("上2sum," + stockDayYanPanKTu20S.getShangZhangSum2() + "—");
        }
        if (stockDayYanPanKTu20S.getShangZhangMa2() == null) {
            stringBuffer.append("上2ma,0—");
        } else {
            stringBuffer.append("上2ma," + stockDayYanPanKTu20S.getShangZhangMa2() + "—");
        }
        if (stockDayYanPanKTu20S.getShangZhangCount2() == null) {
            stringBuffer.append("上2count,0—");
        } else {
            stringBuffer.append("上2count," + stockDayYanPanKTu20S.getShangZhangCount2() + "—");
        }
        if (stockDayYanPanKTu20S.getShangZhangRate2() == null) {
            stringBuffer.append("上2rate,0—");
        } else {
            stringBuffer.append("上2rate," + stockDayYanPanKTu20S.getShangZhangRate2() + "—");
        }
        if (stockDayYanPanKTu20S.getXiaJiangSum2() == null) {
            stringBuffer.append("下2sum,0—");
        } else {
            stringBuffer.append("下2sum," + stockDayYanPanKTu20S.getXiaJiangSum2() + "—");
        }
        if (stockDayYanPanKTu20S.getXiaJiangMa2() == null) {
            stringBuffer.append("下2ma,0—");
        } else {
            stringBuffer.append("下2ma," + stockDayYanPanKTu20S.getXiaJiangMa2() + "—");
        }
        if (stockDayYanPanKTu20S.getXiaJiangCount2() == null) {
            stringBuffer.append("下2count,0—");
        } else {
            stringBuffer.append("下2count," + stockDayYanPanKTu20S.getXiaJiangCount2() + "—");
        }
        if (stockDayYanPanKTu20S.getXiaJiangRate2() == null) {
            stringBuffer.append("下2rate,0—");
        } else {
            stringBuffer.append("下2rate," + stockDayYanPanKTu20S.getXiaJiangRate2() + "—");
        }
        if (stockDayYanPanKTu20S.getShangZhangSum3() == null) {
            stringBuffer.append("上3sum,0—");
        } else {
            stringBuffer.append("上3sum," + stockDayYanPanKTu20S.getShangZhangSum3() + "—");
        }
        if (stockDayYanPanKTu20S.getShangZhangMa3() == null) {
            stringBuffer.append("上3ma,0—");
        } else {
            stringBuffer.append("上3ma," + stockDayYanPanKTu20S.getShangZhangMa3() + "—");
        }
        if (stockDayYanPanKTu20S.getShangZhangCount3() == null) {
            stringBuffer.append("上3count,0—");
        } else {
            stringBuffer.append("上3count," + stockDayYanPanKTu20S.getShangZhangCount3() + "—");
        }
        if (stockDayYanPanKTu20S.getShangZhangRate3() == null) {
            stringBuffer.append("上3rate,0—");
        } else {
            stringBuffer.append("上3rate," + stockDayYanPanKTu20S.getShangZhangRate3() + "—");
        }
        if (stockDayYanPanKTu20S.getXiaJiangSum3() == null) {
            stringBuffer.append("下3sum,0—");
        } else {
            stringBuffer.append("下3sum," + stockDayYanPanKTu20S.getXiaJiangSum3() + "—");
        }
        if (stockDayYanPanKTu20S.getXiaJiangMa3() == null) {
            stringBuffer.append("下3ma,0—");
        } else {
            stringBuffer.append("下3ma," + stockDayYanPanKTu20S.getXiaJiangMa3() + "—");
        }
        if (stockDayYanPanKTu20S.getXiaJiangCount3() == null) {
            stringBuffer.append("下3count,0—");
        } else {
            stringBuffer.append("下3count," + stockDayYanPanKTu20S.getXiaJiangCount3() + "—");
        }
        if (stockDayYanPanKTu20S.getXiaJiangRate3() == null) {
            stringBuffer.append("下3rate,0—");
        } else {
            stringBuffer.append("下3rate," + stockDayYanPanKTu20S.getXiaJiangRate3() + "—");
        }
        if (stockDayYanPanKTu20S.getShangZhangSum5() == null) {
            stringBuffer.append("上5sum,0—");
        } else {
            stringBuffer.append("上5sum," + stockDayYanPanKTu20S.getShangZhangSum5() + "—");
        }
        if (stockDayYanPanKTu20S.getShangZhangMa5() == null) {
            stringBuffer.append("上5ma,0—");
        } else {
            stringBuffer.append("上5ma," + stockDayYanPanKTu20S.getShangZhangMa5() + "—");
        }
        if (stockDayYanPanKTu20S.getShangZhangCount5() == null) {
            stringBuffer.append("上5count,0—");
        } else {
            stringBuffer.append("上5count," + stockDayYanPanKTu20S.getShangZhangCount5() + "—");
        }
        if (stockDayYanPanKTu20S.getShangZhangRate5() == null) {
            stringBuffer.append("上5rate,0—");
        } else {
            stringBuffer.append("上5rate," + stockDayYanPanKTu20S.getShangZhangRate5() + "—");
        }
        if (stockDayYanPanKTu20S.getXiaJiangSum5() == null) {
            stringBuffer.append("下5sum,0—");
        } else {
            stringBuffer.append("下5sum," + stockDayYanPanKTu20S.getXiaJiangSum5() + "—");
        }
        if (stockDayYanPanKTu20S.getXiaJiangMa5() == null) {
            stringBuffer.append("下5ma,0—");
        } else {
            stringBuffer.append("下5ma," + stockDayYanPanKTu20S.getXiaJiangMa5() + "—");
        }
        if (stockDayYanPanKTu20S.getXiaJiangCount5() == null) {
            stringBuffer.append("下5count,0—");
        } else {
            stringBuffer.append("下5count," + stockDayYanPanKTu20S.getXiaJiangCount5() + "—");
        }
        if (stockDayYanPanKTu20S.getXiaJiangRate5() == null) {
            stringBuffer.append("下5rate,0—");
        } else {
            stringBuffer.append("下5rate," + stockDayYanPanKTu20S.getXiaJiangRate5() + "—");
        }
        if (stockDayYanPanKTu20S.getShangZhangSum8() == null) {
            stringBuffer.append("上8sum,0—");
        } else {
            stringBuffer.append("上8sum," + stockDayYanPanKTu20S.getShangZhangSum8() + "—");
        }
        if (stockDayYanPanKTu20S.getShangZhangMa8() == null) {
            stringBuffer.append("上8ma,0—");
        } else {
            stringBuffer.append("上8ma," + stockDayYanPanKTu20S.getShangZhangMa8() + "—");
        }
        if (stockDayYanPanKTu20S.getShangZhangCount8() == null) {
            stringBuffer.append("上8count,0—");
        } else {
            stringBuffer.append("上8count," + stockDayYanPanKTu20S.getShangZhangCount8() + "—");
        }
        if (stockDayYanPanKTu20S.getShangZhangRate8() == null) {
            stringBuffer.append("上8rate,0—");
        } else {
            stringBuffer.append("上8rate," + stockDayYanPanKTu20S.getShangZhangRate8() + "—");
        }
        if (stockDayYanPanKTu20S.getXiaJiangSum8() == null) {
            stringBuffer.append("下8sum,0—");
        } else {
            stringBuffer.append("下8sum," + stockDayYanPanKTu20S.getXiaJiangSum8() + "—");
        }
        if (stockDayYanPanKTu20S.getXiaJiangMa8() == null) {
            stringBuffer.append("下8ma,0—");
        } else {
            stringBuffer.append("下8ma," + stockDayYanPanKTu20S.getXiaJiangMa8() + "—");
        }
        if (stockDayYanPanKTu20S.getXiaJiangCount8() == null) {
            stringBuffer.append("下8count,0—");
        } else {
            stringBuffer.append("下8count," + stockDayYanPanKTu20S.getXiaJiangCount8() + "—");
        }
        if (stockDayYanPanKTu20S.getXiaJiangRate8() == null) {
            stringBuffer.append("下8rate,0—");
        } else {
            stringBuffer.append("下8rate," + stockDayYanPanKTu20S.getXiaJiangRate8() + "—");
        }
        if (stockDayYanPanKTu20S.getShangZhangSum13() == null) {
            stringBuffer.append("上13sum,0—");
        } else {
            stringBuffer.append("上13sum," + stockDayYanPanKTu20S.getShangZhangSum13() + "—");
        }
        if (stockDayYanPanKTu20S.getShangZhangMa13() == null) {
            stringBuffer.append("上13ma,0—");
        } else {
            stringBuffer.append("上13ma," + stockDayYanPanKTu20S.getShangZhangMa13() + "—");
        }
        if (stockDayYanPanKTu20S.getShangZhangCount13() == null) {
            stringBuffer.append("上13count,0—");
        } else {
            stringBuffer.append("上13count," + stockDayYanPanKTu20S.getShangZhangCount13() + "—");
        }
        if (stockDayYanPanKTu20S.getShangZhangRate13() == null) {
            stringBuffer.append("上13rate,0—");
        } else {
            stringBuffer.append("上13rate," + stockDayYanPanKTu20S.getShangZhangRate13() + "—");
        }
        if (stockDayYanPanKTu20S.getXiaJiangSum13() == null) {
            stringBuffer.append("下13sum,0—");
        } else {
            stringBuffer.append("下13sum," + stockDayYanPanKTu20S.getXiaJiangSum13() + "—");
        }
        if (stockDayYanPanKTu20S.getXiaJiangMa13() == null) {
            stringBuffer.append("下13ma,0—");
        } else {
            stringBuffer.append("下13ma," + stockDayYanPanKTu20S.getXiaJiangMa13() + "—");
        }
        if (stockDayYanPanKTu20S.getXiaJiangCount13() == null) {
            stringBuffer.append("下13count,0—");
        } else {
            stringBuffer.append("下13count," + stockDayYanPanKTu20S.getXiaJiangCount13() + "—");
        }
        if (stockDayYanPanKTu20S.getXiaJiangRate13() == null) {
            stringBuffer.append("下13rate,0—");
        } else {
            stringBuffer.append("下13rate," + stockDayYanPanKTu20S.getXiaJiangRate13() + "—");
        }
        if (stockDayYanPanKTu20S.getShangZhangSum20() == null) {
            stringBuffer.append("上20sum,0—");
        } else {
            stringBuffer.append("上20sum," + stockDayYanPanKTu20S.getShangZhangSum20() + "—");
        }
        if (stockDayYanPanKTu20S.getShangZhangMa20() == null) {
            stringBuffer.append("上20ma,0—");
        } else {
            stringBuffer.append("上20ma," + stockDayYanPanKTu20S.getShangZhangMa20() + "—");
        }
        if (stockDayYanPanKTu20S.getShangZhangCount20() == null) {
            stringBuffer.append("上20count,0—");
        } else {
            stringBuffer.append("上20count," + stockDayYanPanKTu20S.getShangZhangCount20() + "—");
        }
        if (stockDayYanPanKTu20S.getShangZhangRate20() == null) {
            stringBuffer.append("上20rate,0—");
        } else {
            stringBuffer.append("上20rate," + stockDayYanPanKTu20S.getShangZhangRate20() + "—");
        }
        if (stockDayYanPanKTu20S.getXiaJiangSum20() == null) {
            stringBuffer.append("下20sum,0—");
        } else {
            stringBuffer.append("下20sum," + stockDayYanPanKTu20S.getXiaJiangSum20() + "—");
        }
        if (stockDayYanPanKTu20S.getXiaJiangMa20() == null) {
            stringBuffer.append("下20ma,0—");
        } else {
            stringBuffer.append("下20ma," + stockDayYanPanKTu20S.getXiaJiangMa20() + "—");
        }
        if (stockDayYanPanKTu20S.getXiaJiangCount20() == null) {
            stringBuffer.append("下20count,0—");
        } else {
            stringBuffer.append("下20count," + stockDayYanPanKTu20S.getXiaJiangCount20() + "—");
        }
        if (stockDayYanPanKTu20S.getXiaJiangRate20() == null) {
            stringBuffer.append("下20rate,0—");
        } else {
            stringBuffer.append("下20rate," + stockDayYanPanKTu20S.getXiaJiangRate20());
        }
        return stringBuffer.toString();
    }

    public static String getKTu20LString(StockDayYanPanKTu20L stockDayYanPanKTu20L) {
        StringBuffer stringBuffer = new StringBuffer();
        if (StringUtils.isEmpty(stockDayYanPanKTu20L.getLiangXian())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPanKTu20L.getLiangXian() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPanKTu20L.getQian20TuXing())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPanKTu20L.getQian20TuXing() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPanKTu20L.getKdj())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPanKTu20L.getKdj() + "—");
        }
        if (stockDayYanPanKTu20L.getShangZhangSum1() == null) {
            stringBuffer.append("上1sum,0—");
        } else {
            stringBuffer.append("上1sum," + stockDayYanPanKTu20L.getShangZhangSum1() + "—");
        }
        if (stockDayYanPanKTu20L.getShangZhangMa1() == null) {
            stringBuffer.append("上1ma,0—");
        } else {
            stringBuffer.append("上1ma," + stockDayYanPanKTu20L.getShangZhangMa1() + "—");
        }
        if (stockDayYanPanKTu20L.getShangZhangCount1() == null) {
            stringBuffer.append("上1count,0—");
        } else {
            stringBuffer.append("上1count," + stockDayYanPanKTu20L.getShangZhangCount1() + "—");
        }
        if (stockDayYanPanKTu20L.getShangZhangRate1() == null) {
            stringBuffer.append("上1rate,0—");
        } else {
            stringBuffer.append("上1rate," + stockDayYanPanKTu20L.getShangZhangRate1() + "—");
        }
        if (stockDayYanPanKTu20L.getXiaJiangSum1() == null) {
            stringBuffer.append("下1sum,0—");
        } else {
            stringBuffer.append("下1sum," + stockDayYanPanKTu20L.getXiaJiangSum1() + "—");
        }
        if (stockDayYanPanKTu20L.getXiaJiangMa1() == null) {
            stringBuffer.append("下1ma,0—");
        } else {
            stringBuffer.append("下1ma," + stockDayYanPanKTu20L.getXiaJiangMa1() + "—");
        }
        if (stockDayYanPanKTu20L.getXiaJiangCount1() == null) {
            stringBuffer.append("下1count,0—");
        } else {
            stringBuffer.append("下1count," + stockDayYanPanKTu20L.getXiaJiangCount1() + "—");
        }
        if (stockDayYanPanKTu20L.getXiaJiangRate1() == null) {
            stringBuffer.append("下1rate,0—");
        } else {
            stringBuffer.append("下1rate," + stockDayYanPanKTu20L.getXiaJiangRate1() + "—");
        }
        if (stockDayYanPanKTu20L.getShangZhangSum2() == null) {
            stringBuffer.append("上2sum,0—");
        } else {
            stringBuffer.append("上2sum," + stockDayYanPanKTu20L.getShangZhangSum2() + "—");
        }
        if (stockDayYanPanKTu20L.getShangZhangMa2() == null) {
            stringBuffer.append("上2ma,0—");
        } else {
            stringBuffer.append("上2ma," + stockDayYanPanKTu20L.getShangZhangMa2() + "—");
        }
        if (stockDayYanPanKTu20L.getShangZhangCount2() == null) {
            stringBuffer.append("上2count,0—");
        } else {
            stringBuffer.append("上2count," + stockDayYanPanKTu20L.getShangZhangCount2() + "—");
        }
        if (stockDayYanPanKTu20L.getShangZhangRate2() == null) {
            stringBuffer.append("上2rate,0—");
        } else {
            stringBuffer.append("上2rate," + stockDayYanPanKTu20L.getShangZhangRate2() + "—");
        }
        if (stockDayYanPanKTu20L.getXiaJiangSum2() == null) {
            stringBuffer.append("下2sum,0—");
        } else {
            stringBuffer.append("下2sum," + stockDayYanPanKTu20L.getXiaJiangSum2() + "—");
        }
        if (stockDayYanPanKTu20L.getXiaJiangMa2() == null) {
            stringBuffer.append("下2ma,0—");
        } else {
            stringBuffer.append("下2ma," + stockDayYanPanKTu20L.getXiaJiangMa2() + "—");
        }
        if (stockDayYanPanKTu20L.getXiaJiangCount2() == null) {
            stringBuffer.append("下2count,0—");
        } else {
            stringBuffer.append("下2count," + stockDayYanPanKTu20L.getXiaJiangCount2() + "—");
        }
        if (stockDayYanPanKTu20L.getXiaJiangRate2() == null) {
            stringBuffer.append("下2rate,0—");
        } else {
            stringBuffer.append("下2rate," + stockDayYanPanKTu20L.getXiaJiangRate2() + "—");
        }
        if (stockDayYanPanKTu20L.getShangZhangSum3() == null) {
            stringBuffer.append("上3sum,0—");
        } else {
            stringBuffer.append("上3sum," + stockDayYanPanKTu20L.getShangZhangSum3() + "—");
        }
        if (stockDayYanPanKTu20L.getShangZhangMa3() == null) {
            stringBuffer.append("上3ma,0—");
        } else {
            stringBuffer.append("上3ma," + stockDayYanPanKTu20L.getShangZhangMa3() + "—");
        }
        if (stockDayYanPanKTu20L.getShangZhangCount3() == null) {
            stringBuffer.append("上3count,0—");
        } else {
            stringBuffer.append("上3count," + stockDayYanPanKTu20L.getShangZhangCount3() + "—");
        }
        if (stockDayYanPanKTu20L.getShangZhangRate3() == null) {
            stringBuffer.append("上3rate,0—");
        } else {
            stringBuffer.append("上3rate," + stockDayYanPanKTu20L.getShangZhangRate3() + "—");
        }
        if (stockDayYanPanKTu20L.getXiaJiangSum3() == null) {
            stringBuffer.append("下3sum,0—");
        } else {
            stringBuffer.append("下3sum," + stockDayYanPanKTu20L.getXiaJiangSum3() + "—");
        }
        if (stockDayYanPanKTu20L.getXiaJiangMa3() == null) {
            stringBuffer.append("下3ma,0—");
        } else {
            stringBuffer.append("下3ma," + stockDayYanPanKTu20L.getXiaJiangMa3() + "—");
        }
        if (stockDayYanPanKTu20L.getXiaJiangCount3() == null) {
            stringBuffer.append("下3count,0—");
        } else {
            stringBuffer.append("下3count," + stockDayYanPanKTu20L.getXiaJiangCount3() + "—");
        }
        if (stockDayYanPanKTu20L.getXiaJiangRate3() == null) {
            stringBuffer.append("下3rate,0—");
        } else {
            stringBuffer.append("下3rate," + stockDayYanPanKTu20L.getXiaJiangRate3() + "—");
        }
        if (stockDayYanPanKTu20L.getShangZhangSum5() == null) {
            stringBuffer.append("上5sum,0—");
        } else {
            stringBuffer.append("上5sum," + stockDayYanPanKTu20L.getShangZhangSum5() + "—");
        }
        if (stockDayYanPanKTu20L.getShangZhangMa5() == null) {
            stringBuffer.append("上5ma,0—");
        } else {
            stringBuffer.append("上5ma," + stockDayYanPanKTu20L.getShangZhangMa5() + "—");
        }
        if (stockDayYanPanKTu20L.getShangZhangCount5() == null) {
            stringBuffer.append("上5count,0—");
        } else {
            stringBuffer.append("上5count," + stockDayYanPanKTu20L.getShangZhangCount5() + "—");
        }
        if (stockDayYanPanKTu20L.getShangZhangRate5() == null) {
            stringBuffer.append("上5rate,0—");
        } else {
            stringBuffer.append("上5rate," + stockDayYanPanKTu20L.getShangZhangRate5() + "—");
        }
        if (stockDayYanPanKTu20L.getXiaJiangSum5() == null) {
            stringBuffer.append("下5sum,0—");
        } else {
            stringBuffer.append("下5sum," + stockDayYanPanKTu20L.getXiaJiangSum5() + "—");
        }
        if (stockDayYanPanKTu20L.getXiaJiangMa5() == null) {
            stringBuffer.append("下5ma,0—");
        } else {
            stringBuffer.append("下5ma," + stockDayYanPanKTu20L.getXiaJiangMa5() + "—");
        }
        if (stockDayYanPanKTu20L.getXiaJiangCount5() == null) {
            stringBuffer.append("下5count,0—");
        } else {
            stringBuffer.append("下5count," + stockDayYanPanKTu20L.getXiaJiangCount5() + "—");
        }
        if (stockDayYanPanKTu20L.getXiaJiangRate5() == null) {
            stringBuffer.append("下5rate,0—");
        } else {
            stringBuffer.append("下5rate," + stockDayYanPanKTu20L.getXiaJiangRate5() + "—");
        }
        if (stockDayYanPanKTu20L.getShangZhangSum8() == null) {
            stringBuffer.append("上8sum,0—");
        } else {
            stringBuffer.append("上8sum," + stockDayYanPanKTu20L.getShangZhangSum8() + "—");
        }
        if (stockDayYanPanKTu20L.getShangZhangMa8() == null) {
            stringBuffer.append("上8ma,0—");
        } else {
            stringBuffer.append("上8ma," + stockDayYanPanKTu20L.getShangZhangMa8() + "—");
        }
        if (stockDayYanPanKTu20L.getShangZhangCount8() == null) {
            stringBuffer.append("上8count,0—");
        } else {
            stringBuffer.append("上8count," + stockDayYanPanKTu20L.getShangZhangCount8() + "—");
        }
        if (stockDayYanPanKTu20L.getShangZhangRate8() == null) {
            stringBuffer.append("上8rate,0—");
        } else {
            stringBuffer.append("上8rate," + stockDayYanPanKTu20L.getShangZhangRate8() + "—");
        }
        if (stockDayYanPanKTu20L.getXiaJiangSum8() == null) {
            stringBuffer.append("下8sum,0—");
        } else {
            stringBuffer.append("下8sum," + stockDayYanPanKTu20L.getXiaJiangSum8() + "—");
        }
        if (stockDayYanPanKTu20L.getXiaJiangMa8() == null) {
            stringBuffer.append("下8ma,0—");
        } else {
            stringBuffer.append("下8ma," + stockDayYanPanKTu20L.getXiaJiangMa8() + "—");
        }
        if (stockDayYanPanKTu20L.getXiaJiangCount8() == null) {
            stringBuffer.append("下8count,0—");
        } else {
            stringBuffer.append("下8count," + stockDayYanPanKTu20L.getXiaJiangCount8() + "—");
        }
        if (stockDayYanPanKTu20L.getXiaJiangRate8() == null) {
            stringBuffer.append("下8rate,0—");
        } else {
            stringBuffer.append("下8rate," + stockDayYanPanKTu20L.getXiaJiangRate8() + "—");
        }
        if (stockDayYanPanKTu20L.getShangZhangSum13() == null) {
            stringBuffer.append("上13sum,0—");
        } else {
            stringBuffer.append("上13sum," + stockDayYanPanKTu20L.getShangZhangSum13() + "—");
        }
        if (stockDayYanPanKTu20L.getShangZhangMa13() == null) {
            stringBuffer.append("上13ma,0—");
        } else {
            stringBuffer.append("上13ma," + stockDayYanPanKTu20L.getShangZhangMa13() + "—");
        }
        if (stockDayYanPanKTu20L.getShangZhangCount13() == null) {
            stringBuffer.append("上13count,0—");
        } else {
            stringBuffer.append("上13count," + stockDayYanPanKTu20L.getShangZhangCount13() + "—");
        }
        if (stockDayYanPanKTu20L.getShangZhangRate13() == null) {
            stringBuffer.append("上13rate,0—");
        } else {
            stringBuffer.append("上13rate," + stockDayYanPanKTu20L.getShangZhangRate13() + "—");
        }
        if (stockDayYanPanKTu20L.getXiaJiangSum13() == null) {
            stringBuffer.append("下13sum,0—");
        } else {
            stringBuffer.append("下13sum," + stockDayYanPanKTu20L.getXiaJiangSum13() + "—");
        }
        if (stockDayYanPanKTu20L.getXiaJiangMa13() == null) {
            stringBuffer.append("下13ma,0—");
        } else {
            stringBuffer.append("下13ma," + stockDayYanPanKTu20L.getXiaJiangMa13() + "—");
        }
        if (stockDayYanPanKTu20L.getXiaJiangCount13() == null) {
            stringBuffer.append("下13count,0—");
        } else {
            stringBuffer.append("下13count," + stockDayYanPanKTu20L.getXiaJiangCount13() + "—");
        }
        if (stockDayYanPanKTu20L.getXiaJiangRate13() == null) {
            stringBuffer.append("下13rate,0—");
        } else {
            stringBuffer.append("下13rate," + stockDayYanPanKTu20L.getXiaJiangRate13() + "—");
        }
        if (stockDayYanPanKTu20L.getShangZhangSum20() == null) {
            stringBuffer.append("上20sum,0—");
        } else {
            stringBuffer.append("上20sum," + stockDayYanPanKTu20L.getShangZhangSum20() + "—");
        }
        if (stockDayYanPanKTu20L.getShangZhangMa20() == null) {
            stringBuffer.append("上20ma,0—");
        } else {
            stringBuffer.append("上20ma," + stockDayYanPanKTu20L.getShangZhangMa20() + "—");
        }
        if (stockDayYanPanKTu20L.getShangZhangCount20() == null) {
            stringBuffer.append("上20count,0—");
        } else {
            stringBuffer.append("上20count," + stockDayYanPanKTu20L.getShangZhangCount20() + "—");
        }
        if (stockDayYanPanKTu20L.getShangZhangRate20() == null) {
            stringBuffer.append("上20rate,0—");
        } else {
            stringBuffer.append("上20rate," + stockDayYanPanKTu20L.getShangZhangRate20() + "—");
        }
        if (stockDayYanPanKTu20L.getXiaJiangSum20() == null) {
            stringBuffer.append("下20sum,0—");
        } else {
            stringBuffer.append("下20sum," + stockDayYanPanKTu20L.getXiaJiangSum20() + "—");
        }
        if (stockDayYanPanKTu20L.getXiaJiangMa20() == null) {
            stringBuffer.append("下20ma,0—");
        } else {
            stringBuffer.append("下20ma," + stockDayYanPanKTu20L.getXiaJiangMa20() + "—");
        }
        if (stockDayYanPanKTu20L.getXiaJiangCount20() == null) {
            stringBuffer.append("下20count,0—");
        } else {
            stringBuffer.append("下20count," + stockDayYanPanKTu20L.getXiaJiangCount20() + "—");
        }
        if (stockDayYanPanKTu20L.getXiaJiangRate20() == null) {
            stringBuffer.append("下20rate,0—");
        } else {
            stringBuffer.append("下20rate," + stockDayYanPanKTu20L.getXiaJiangRate20());
        }
        return stringBuffer.toString();
    }

    public static String getKMAQ20String(StockDayYanPanKMAQ20 stockDayYanPanKMAQ20) {
        StringBuffer stringBuffer = new StringBuffer();

        if (StringUtils.isEmpty(stockDayYanPanKMAQ20.getQian20TuXing())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPanKMAQ20.getQian20TuXing() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPanKMAQ20.getKdj())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPanKMAQ20.getKdj() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPanKMAQ20.getPriceMa())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPanKMAQ20.getPriceMa() + "—");
        }
        if (stockDayYanPanKMAQ20.getShangZhangSum1() == null) {
            stringBuffer.append("上1sum,0—");
        } else {
            stringBuffer.append("上1sum," + stockDayYanPanKMAQ20.getShangZhangSum1() + "—");
        }
        if (stockDayYanPanKMAQ20.getShangZhangMa1() == null) {
            stringBuffer.append("上1ma,0—");
        } else {
            stringBuffer.append("上1ma," + stockDayYanPanKMAQ20.getShangZhangMa1() + "—");
        }
        if (stockDayYanPanKMAQ20.getShangZhangCount1() == null) {
            stringBuffer.append("上1count,0—");
        } else {
            stringBuffer.append("上1count," + stockDayYanPanKMAQ20.getShangZhangCount1() + "—");
        }
        if (stockDayYanPanKMAQ20.getShangZhangRate1() == null) {
            stringBuffer.append("上1rate,0—");
        } else {
            stringBuffer.append("上1rate," + stockDayYanPanKMAQ20.getShangZhangRate1() + "—");
        }
        if (stockDayYanPanKMAQ20.getXiaJiangSum1() == null) {
            stringBuffer.append("下1sum,0—");
        } else {
            stringBuffer.append("下1sum," + stockDayYanPanKMAQ20.getXiaJiangSum1() + "—");
        }
        if (stockDayYanPanKMAQ20.getXiaJiangMa1() == null) {
            stringBuffer.append("下1ma,0—");
        } else {
            stringBuffer.append("下1ma," + stockDayYanPanKMAQ20.getXiaJiangMa1() + "—");
        }
        if (stockDayYanPanKMAQ20.getXiaJiangCount1() == null) {
            stringBuffer.append("下1count,0—");
        } else {
            stringBuffer.append("下1count," + stockDayYanPanKMAQ20.getXiaJiangCount1() + "—");
        }
        if (stockDayYanPanKMAQ20.getXiaJiangRate1() == null) {
            stringBuffer.append("下1rate,0—");
        } else {
            stringBuffer.append("下1rate," + stockDayYanPanKMAQ20.getXiaJiangRate1() + "—");
        }
        if (stockDayYanPanKMAQ20.getShangZhangSum2() == null) {
            stringBuffer.append("上2sum,0—");
        } else {
            stringBuffer.append("上2sum," + stockDayYanPanKMAQ20.getShangZhangSum2() + "—");
        }
        if (stockDayYanPanKMAQ20.getShangZhangMa2() == null) {
            stringBuffer.append("上2ma,0—");
        } else {
            stringBuffer.append("上2ma," + stockDayYanPanKMAQ20.getShangZhangMa2() + "—");
        }
        if (stockDayYanPanKMAQ20.getShangZhangCount2() == null) {
            stringBuffer.append("上2count,0—");
        } else {
            stringBuffer.append("上2count," + stockDayYanPanKMAQ20.getShangZhangCount2() + "—");
        }
        if (stockDayYanPanKMAQ20.getShangZhangRate2() == null) {
            stringBuffer.append("上2rate,0—");
        } else {
            stringBuffer.append("上2rate," + stockDayYanPanKMAQ20.getShangZhangRate2() + "—");
        }
        if (stockDayYanPanKMAQ20.getXiaJiangSum2() == null) {
            stringBuffer.append("下2sum,0—");
        } else {
            stringBuffer.append("下2sum," + stockDayYanPanKMAQ20.getXiaJiangSum2() + "—");
        }
        if (stockDayYanPanKMAQ20.getXiaJiangMa2() == null) {
            stringBuffer.append("下2ma,0—");
        } else {
            stringBuffer.append("下2ma," + stockDayYanPanKMAQ20.getXiaJiangMa2() + "—");
        }
        if (stockDayYanPanKMAQ20.getXiaJiangCount2() == null) {
            stringBuffer.append("下2count,0—");
        } else {
            stringBuffer.append("下2count," + stockDayYanPanKMAQ20.getXiaJiangCount2() + "—");
        }
        if (stockDayYanPanKMAQ20.getXiaJiangRate2() == null) {
            stringBuffer.append("下2rate,0—");
        } else {
            stringBuffer.append("下2rate," + stockDayYanPanKMAQ20.getXiaJiangRate2() + "—");
        }
        if (stockDayYanPanKMAQ20.getShangZhangSum3() == null) {
            stringBuffer.append("上3sum,0—");
        } else {
            stringBuffer.append("上3sum," + stockDayYanPanKMAQ20.getShangZhangSum3() + "—");
        }
        if (stockDayYanPanKMAQ20.getShangZhangMa3() == null) {
            stringBuffer.append("上3ma,0—");
        } else {
            stringBuffer.append("上3ma," + stockDayYanPanKMAQ20.getShangZhangMa3() + "—");
        }
        if (stockDayYanPanKMAQ20.getShangZhangCount3() == null) {
            stringBuffer.append("上3count,0—");
        } else {
            stringBuffer.append("上3count," + stockDayYanPanKMAQ20.getShangZhangCount3() + "—");
        }
        if (stockDayYanPanKMAQ20.getShangZhangRate3() == null) {
            stringBuffer.append("上3rate,0—");
        } else {
            stringBuffer.append("上3rate," + stockDayYanPanKMAQ20.getShangZhangRate3() + "—");
        }
        if (stockDayYanPanKMAQ20.getXiaJiangSum3() == null) {
            stringBuffer.append("下3sum,0—");
        } else {
            stringBuffer.append("下3sum," + stockDayYanPanKMAQ20.getXiaJiangSum3() + "—");
        }
        if (stockDayYanPanKMAQ20.getXiaJiangMa3() == null) {
            stringBuffer.append("下3ma,0—");
        } else {
            stringBuffer.append("下3ma," + stockDayYanPanKMAQ20.getXiaJiangMa3() + "—");
        }
        if (stockDayYanPanKMAQ20.getXiaJiangCount3() == null) {
            stringBuffer.append("下3count,0—");
        } else {
            stringBuffer.append("下3count," + stockDayYanPanKMAQ20.getXiaJiangCount3() + "—");
        }
        if (stockDayYanPanKMAQ20.getXiaJiangRate3() == null) {
            stringBuffer.append("下3rate,0—");
        } else {
            stringBuffer.append("下3rate," + stockDayYanPanKMAQ20.getXiaJiangRate3() + "—");
        }
        if (stockDayYanPanKMAQ20.getShangZhangSum5() == null) {
            stringBuffer.append("上5sum,0—");
        } else {
            stringBuffer.append("上5sum," + stockDayYanPanKMAQ20.getShangZhangSum5() + "—");
        }
        if (stockDayYanPanKMAQ20.getShangZhangMa5() == null) {
            stringBuffer.append("上5ma,0—");
        } else {
            stringBuffer.append("上5ma," + stockDayYanPanKMAQ20.getShangZhangMa5() + "—");
        }
        if (stockDayYanPanKMAQ20.getShangZhangCount5() == null) {
            stringBuffer.append("上5count,0—");
        } else {
            stringBuffer.append("上5count," + stockDayYanPanKMAQ20.getShangZhangCount5() + "—");
        }
        if (stockDayYanPanKMAQ20.getShangZhangRate5() == null) {
            stringBuffer.append("上5rate,0—");
        } else {
            stringBuffer.append("上5rate," + stockDayYanPanKMAQ20.getShangZhangRate5() + "—");
        }
        if (stockDayYanPanKMAQ20.getXiaJiangSum5() == null) {
            stringBuffer.append("下5sum,0—");
        } else {
            stringBuffer.append("下5sum," + stockDayYanPanKMAQ20.getXiaJiangSum5() + "—");
        }
        if (stockDayYanPanKMAQ20.getXiaJiangMa5() == null) {
            stringBuffer.append("下5ma,0—");
        } else {
            stringBuffer.append("下5ma," + stockDayYanPanKMAQ20.getXiaJiangMa5() + "—");
        }
        if (stockDayYanPanKMAQ20.getXiaJiangCount5() == null) {
            stringBuffer.append("下5count,0—");
        } else {
            stringBuffer.append("下5count," + stockDayYanPanKMAQ20.getXiaJiangCount5() + "—");
        }
        if (stockDayYanPanKMAQ20.getXiaJiangRate5() == null) {
            stringBuffer.append("下5rate,0—");
        } else {
            stringBuffer.append("下5rate," + stockDayYanPanKMAQ20.getXiaJiangRate5() + "—");
        }
        if (stockDayYanPanKMAQ20.getShangZhangSum8() == null) {
            stringBuffer.append("上8sum,0—");
        } else {
            stringBuffer.append("上8sum," + stockDayYanPanKMAQ20.getShangZhangSum8() + "—");
        }
        if (stockDayYanPanKMAQ20.getShangZhangMa8() == null) {
            stringBuffer.append("上8ma,0—");
        } else {
            stringBuffer.append("上8ma," + stockDayYanPanKMAQ20.getShangZhangMa8() + "—");
        }
        if (stockDayYanPanKMAQ20.getShangZhangCount8() == null) {
            stringBuffer.append("上8count,0—");
        } else {
            stringBuffer.append("上8count," + stockDayYanPanKMAQ20.getShangZhangCount8() + "—");
        }
        if (stockDayYanPanKMAQ20.getShangZhangRate8() == null) {
            stringBuffer.append("上8rate,0—");
        } else {
            stringBuffer.append("上8rate," + stockDayYanPanKMAQ20.getShangZhangRate8() + "—");
        }
        if (stockDayYanPanKMAQ20.getXiaJiangSum8() == null) {
            stringBuffer.append("下8sum,0—");
        } else {
            stringBuffer.append("下8sum," + stockDayYanPanKMAQ20.getXiaJiangSum8() + "—");
        }
        if (stockDayYanPanKMAQ20.getXiaJiangMa8() == null) {
            stringBuffer.append("下8ma,0—");
        } else {
            stringBuffer.append("下8ma," + stockDayYanPanKMAQ20.getXiaJiangMa8() + "—");
        }
        if (stockDayYanPanKMAQ20.getXiaJiangCount8() == null) {
            stringBuffer.append("下8count,0—");
        } else {
            stringBuffer.append("下8count," + stockDayYanPanKMAQ20.getXiaJiangCount8() + "—");
        }
        if (stockDayYanPanKMAQ20.getXiaJiangRate8() == null) {
            stringBuffer.append("下8rate,0—");
        } else {
            stringBuffer.append("下8rate," + stockDayYanPanKMAQ20.getXiaJiangRate8() + "—");
        }
        if (stockDayYanPanKMAQ20.getShangZhangSum13() == null) {
            stringBuffer.append("上13sum,0—");
        } else {
            stringBuffer.append("上13sum," + stockDayYanPanKMAQ20.getShangZhangSum13() + "—");
        }
        if (stockDayYanPanKMAQ20.getShangZhangMa13() == null) {
            stringBuffer.append("上13ma,0—");
        } else {
            stringBuffer.append("上13ma," + stockDayYanPanKMAQ20.getShangZhangMa13() + "—");
        }
        if (stockDayYanPanKMAQ20.getShangZhangCount13() == null) {
            stringBuffer.append("上13count,0—");
        } else {
            stringBuffer.append("上13count," + stockDayYanPanKMAQ20.getShangZhangCount13() + "—");
        }
        if (stockDayYanPanKMAQ20.getShangZhangRate13() == null) {
            stringBuffer.append("上13rate,0—");
        } else {
            stringBuffer.append("上13rate," + stockDayYanPanKMAQ20.getShangZhangRate13() + "—");
        }
        if (stockDayYanPanKMAQ20.getXiaJiangSum13() == null) {
            stringBuffer.append("下13sum,0—");
        } else {
            stringBuffer.append("下13sum," + stockDayYanPanKMAQ20.getXiaJiangSum13() + "—");
        }
        if (stockDayYanPanKMAQ20.getXiaJiangMa13() == null) {
            stringBuffer.append("下13ma,0—");
        } else {
            stringBuffer.append("下13ma," + stockDayYanPanKMAQ20.getXiaJiangMa13() + "—");
        }
        if (stockDayYanPanKMAQ20.getXiaJiangCount13() == null) {
            stringBuffer.append("下13count,0—");
        } else {
            stringBuffer.append("下13count," + stockDayYanPanKMAQ20.getXiaJiangCount13() + "—");
        }
        if (stockDayYanPanKMAQ20.getXiaJiangRate13() == null) {
            stringBuffer.append("下13rate,0—");
        } else {
            stringBuffer.append("下13rate," + stockDayYanPanKMAQ20.getXiaJiangRate13() + "—");
        }
        if (stockDayYanPanKMAQ20.getShangZhangSum20() == null) {
            stringBuffer.append("上20sum,0—");
        } else {
            stringBuffer.append("上20sum," + stockDayYanPanKMAQ20.getShangZhangSum20() + "—");
        }
        if (stockDayYanPanKMAQ20.getShangZhangMa20() == null) {
            stringBuffer.append("上20ma,0—");
        } else {
            stringBuffer.append("上20ma," + stockDayYanPanKMAQ20.getShangZhangMa20() + "—");
        }
        if (stockDayYanPanKMAQ20.getShangZhangCount20() == null) {
            stringBuffer.append("上20count,0—");
        } else {
            stringBuffer.append("上20count," + stockDayYanPanKMAQ20.getShangZhangCount20() + "—");
        }
        if (stockDayYanPanKMAQ20.getShangZhangRate20() == null) {
            stringBuffer.append("上20rate,0—");
        } else {
            stringBuffer.append("上20rate," + stockDayYanPanKMAQ20.getShangZhangRate20() + "—");
        }
        if (stockDayYanPanKMAQ20.getXiaJiangSum20() == null) {
            stringBuffer.append("下20sum,0—");
        } else {
            stringBuffer.append("下20sum," + stockDayYanPanKMAQ20.getXiaJiangSum20() + "—");
        }
        if (stockDayYanPanKMAQ20.getXiaJiangMa20() == null) {
            stringBuffer.append("下20ma,0—");
        } else {
            stringBuffer.append("下20ma," + stockDayYanPanKMAQ20.getXiaJiangMa20() + "—");
        }
        if (stockDayYanPanKMAQ20.getXiaJiangCount20() == null) {
            stringBuffer.append("下20count,0—");
        } else {
            stringBuffer.append("下20count," + stockDayYanPanKMAQ20.getXiaJiangCount20() + "—");
        }
        if (stockDayYanPanKMAQ20.getXiaJiangRate20() == null) {
            stringBuffer.append("下20rate,0—");
        } else {
            stringBuffer.append("下20rate," + stockDayYanPanKMAQ20.getXiaJiangRate20());
        }
        return stringBuffer.toString();
    }

    public static String getKmQRString(StockDayYanPanKmQR stockDayYanPanKmQR) {
        StringBuffer stringBuffer = new StringBuffer();
        if (StringUtils.isEmpty(stockDayYanPanKmQR.getKdj())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPanKmQR.getKdj() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPanKmQR.getMacd())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPanKmQR.getMacd() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPanKmQR.getQuantityMa())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPanKmQR.getQuantityMa() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPanKmQR.getRsi())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPanKmQR.getRsi() + "—");
        }
        if (stockDayYanPanKmQR.getShangZhangSum1() == null) {
            stringBuffer.append("上1sum,0—");
        } else {
            stringBuffer.append("上1sum," + stockDayYanPanKmQR.getShangZhangSum1() + "—");
        }
        if (stockDayYanPanKmQR.getShangZhangMa1() == null) {
            stringBuffer.append("上1ma,0—");
        } else {
            stringBuffer.append("上1ma," + stockDayYanPanKmQR.getShangZhangMa1() + "—");
        }
        if (stockDayYanPanKmQR.getShangZhangCount1() == null) {
            stringBuffer.append("上1count,0—");
        } else {
            stringBuffer.append("上1count," + stockDayYanPanKmQR.getShangZhangCount1() + "—");
        }
        if (stockDayYanPanKmQR.getShangZhangRate1() == null) {
            stringBuffer.append("上1rate,0—");
        } else {
            stringBuffer.append("上1rate," + stockDayYanPanKmQR.getShangZhangRate1() + "—");
        }
        if (stockDayYanPanKmQR.getXiaJiangSum1() == null) {
            stringBuffer.append("下1sum,0—");
        } else {
            stringBuffer.append("下1sum," + stockDayYanPanKmQR.getXiaJiangSum1() + "—");
        }
        if (stockDayYanPanKmQR.getXiaJiangMa1() == null) {
            stringBuffer.append("下1ma,0—");
        } else {
            stringBuffer.append("下1ma," + stockDayYanPanKmQR.getXiaJiangMa1() + "—");
        }
        if (stockDayYanPanKmQR.getXiaJiangCount1() == null) {
            stringBuffer.append("下1count,0—");
        } else {
            stringBuffer.append("下1count," + stockDayYanPanKmQR.getXiaJiangCount1() + "—");
        }
        if (stockDayYanPanKmQR.getXiaJiangRate1() == null) {
            stringBuffer.append("下1rate,0—");
        } else {
            stringBuffer.append("下1rate," + stockDayYanPanKmQR.getXiaJiangRate1() + "—");
        }
        if (stockDayYanPanKmQR.getShangZhangSum2() == null) {
            stringBuffer.append("上2sum,0—");
        } else {
            stringBuffer.append("上2sum," + stockDayYanPanKmQR.getShangZhangSum2() + "—");
        }
        if (stockDayYanPanKmQR.getShangZhangMa2() == null) {
            stringBuffer.append("上2ma,0—");
        } else {
            stringBuffer.append("上2ma," + stockDayYanPanKmQR.getShangZhangMa2() + "—");
        }
        if (stockDayYanPanKmQR.getShangZhangCount2() == null) {
            stringBuffer.append("上2count,0—");
        } else {
            stringBuffer.append("上2count," + stockDayYanPanKmQR.getShangZhangCount2() + "—");
        }
        if (stockDayYanPanKmQR.getShangZhangRate2() == null) {
            stringBuffer.append("上2rate,0—");
        } else {
            stringBuffer.append("上2rate," + stockDayYanPanKmQR.getShangZhangRate2() + "—");
        }
        if (stockDayYanPanKmQR.getXiaJiangSum2() == null) {
            stringBuffer.append("下2sum,0—");
        } else {
            stringBuffer.append("下2sum," + stockDayYanPanKmQR.getXiaJiangSum2() + "—");
        }
        if (stockDayYanPanKmQR.getXiaJiangMa2() == null) {
            stringBuffer.append("下2ma,0—");
        } else {
            stringBuffer.append("下2ma," + stockDayYanPanKmQR.getXiaJiangMa2() + "—");
        }
        if (stockDayYanPanKmQR.getXiaJiangCount2() == null) {
            stringBuffer.append("下2count,0—");
        } else {
            stringBuffer.append("下2count," + stockDayYanPanKmQR.getXiaJiangCount2() + "—");
        }
        if (stockDayYanPanKmQR.getXiaJiangRate2() == null) {
            stringBuffer.append("下2rate,0—");
        } else {
            stringBuffer.append("下2rate," + stockDayYanPanKmQR.getXiaJiangRate2() + "—");
        }
        if (stockDayYanPanKmQR.getShangZhangSum3() == null) {
            stringBuffer.append("上3sum,0—");
        } else {
            stringBuffer.append("上3sum," + stockDayYanPanKmQR.getShangZhangSum3() + "—");
        }
        if (stockDayYanPanKmQR.getShangZhangMa3() == null) {
            stringBuffer.append("上3ma,0—");
        } else {
            stringBuffer.append("上3ma," + stockDayYanPanKmQR.getShangZhangMa3() + "—");
        }
        if (stockDayYanPanKmQR.getShangZhangCount3() == null) {
            stringBuffer.append("上3count,0—");
        } else {
            stringBuffer.append("上3count," + stockDayYanPanKmQR.getShangZhangCount3() + "—");
        }
        if (stockDayYanPanKmQR.getShangZhangRate3() == null) {
            stringBuffer.append("上3rate,0—");
        } else {
            stringBuffer.append("上3rate," + stockDayYanPanKmQR.getShangZhangRate3() + "—");
        }
        if (stockDayYanPanKmQR.getXiaJiangSum3() == null) {
            stringBuffer.append("下3sum,0—");
        } else {
            stringBuffer.append("下3sum," + stockDayYanPanKmQR.getXiaJiangSum3() + "—");
        }
        if (stockDayYanPanKmQR.getXiaJiangMa3() == null) {
            stringBuffer.append("下3ma,0—");
        } else {
            stringBuffer.append("下3ma," + stockDayYanPanKmQR.getXiaJiangMa3() + "—");
        }
        if (stockDayYanPanKmQR.getXiaJiangCount3() == null) {
            stringBuffer.append("下3count,0—");
        } else {
            stringBuffer.append("下3count," + stockDayYanPanKmQR.getXiaJiangCount3() + "—");
        }
        if (stockDayYanPanKmQR.getXiaJiangRate3() == null) {
            stringBuffer.append("下3rate,0—");
        } else {
            stringBuffer.append("下3rate," + stockDayYanPanKmQR.getXiaJiangRate3() + "—");
        }
        if (stockDayYanPanKmQR.getShangZhangSum5() == null) {
            stringBuffer.append("上5sum,0—");
        } else {
            stringBuffer.append("上5sum," + stockDayYanPanKmQR.getShangZhangSum5() + "—");
        }
        if (stockDayYanPanKmQR.getShangZhangMa5() == null) {
            stringBuffer.append("上5ma,0—");
        } else {
            stringBuffer.append("上5ma," + stockDayYanPanKmQR.getShangZhangMa5() + "—");
        }
        if (stockDayYanPanKmQR.getShangZhangCount5() == null) {
            stringBuffer.append("上5count,0—");
        } else {
            stringBuffer.append("上5count," + stockDayYanPanKmQR.getShangZhangCount5() + "—");
        }
        if (stockDayYanPanKmQR.getShangZhangRate5() == null) {
            stringBuffer.append("上5rate,0—");
        } else {
            stringBuffer.append("上5rate," + stockDayYanPanKmQR.getShangZhangRate5() + "—");
        }
        if (stockDayYanPanKmQR.getXiaJiangSum5() == null) {
            stringBuffer.append("下5sum,0—");
        } else {
            stringBuffer.append("下5sum," + stockDayYanPanKmQR.getXiaJiangSum5() + "—");
        }
        if (stockDayYanPanKmQR.getXiaJiangMa5() == null) {
            stringBuffer.append("下5ma,0—");
        } else {
            stringBuffer.append("下5ma," + stockDayYanPanKmQR.getXiaJiangMa5() + "—");
        }
        if (stockDayYanPanKmQR.getXiaJiangCount5() == null) {
            stringBuffer.append("下5count,0—");
        } else {
            stringBuffer.append("下5count," + stockDayYanPanKmQR.getXiaJiangCount5() + "—");
        }
        if (stockDayYanPanKmQR.getXiaJiangRate5() == null) {
            stringBuffer.append("下5rate,0—");
        } else {
            stringBuffer.append("下5rate," + stockDayYanPanKmQR.getXiaJiangRate5() + "—");
        }
        if (stockDayYanPanKmQR.getShangZhangSum8() == null) {
            stringBuffer.append("上8sum,0—");
        } else {
            stringBuffer.append("上8sum," + stockDayYanPanKmQR.getShangZhangSum8() + "—");
        }
        if (stockDayYanPanKmQR.getShangZhangMa8() == null) {
            stringBuffer.append("上8ma,0—");
        } else {
            stringBuffer.append("上8ma," + stockDayYanPanKmQR.getShangZhangMa8() + "—");
        }
        if (stockDayYanPanKmQR.getShangZhangCount8() == null) {
            stringBuffer.append("上8count,0—");
        } else {
            stringBuffer.append("上8count," + stockDayYanPanKmQR.getShangZhangCount8() + "—");
        }
        if (stockDayYanPanKmQR.getShangZhangRate8() == null) {
            stringBuffer.append("上8rate,0—");
        } else {
            stringBuffer.append("上8rate," + stockDayYanPanKmQR.getShangZhangRate8() + "—");
        }
        if (stockDayYanPanKmQR.getXiaJiangSum8() == null) {
            stringBuffer.append("下8sum,0—");
        } else {
            stringBuffer.append("下8sum," + stockDayYanPanKmQR.getXiaJiangSum8() + "—");
        }
        if (stockDayYanPanKmQR.getXiaJiangMa8() == null) {
            stringBuffer.append("下8ma,0—");
        } else {
            stringBuffer.append("下8ma," + stockDayYanPanKmQR.getXiaJiangMa8() + "—");
        }
        if (stockDayYanPanKmQR.getXiaJiangCount8() == null) {
            stringBuffer.append("下8count,0—");
        } else {
            stringBuffer.append("下8count," + stockDayYanPanKmQR.getXiaJiangCount8() + "—");
        }
        if (stockDayYanPanKmQR.getXiaJiangRate8() == null) {
            stringBuffer.append("下8rate,0—");
        } else {
            stringBuffer.append("下8rate," + stockDayYanPanKmQR.getXiaJiangRate8() + "—");
        }
        if (stockDayYanPanKmQR.getShangZhangSum13() == null) {
            stringBuffer.append("上13sum,0—");
        } else {
            stringBuffer.append("上13sum," + stockDayYanPanKmQR.getShangZhangSum13() + "—");
        }
        if (stockDayYanPanKmQR.getShangZhangMa13() == null) {
            stringBuffer.append("上13ma,0—");
        } else {
            stringBuffer.append("上13ma," + stockDayYanPanKmQR.getShangZhangMa13() + "—");
        }
        if (stockDayYanPanKmQR.getShangZhangCount13() == null) {
            stringBuffer.append("上13count,0—");
        } else {
            stringBuffer.append("上13count," + stockDayYanPanKmQR.getShangZhangCount13() + "—");
        }
        if (stockDayYanPanKmQR.getShangZhangRate13() == null) {
            stringBuffer.append("上13rate,0—");
        } else {
            stringBuffer.append("上13rate," + stockDayYanPanKmQR.getShangZhangRate13() + "—");
        }
        if (stockDayYanPanKmQR.getXiaJiangSum13() == null) {
            stringBuffer.append("下13sum,0—");
        } else {
            stringBuffer.append("下13sum," + stockDayYanPanKmQR.getXiaJiangSum13() + "—");
        }
        if (stockDayYanPanKmQR.getXiaJiangMa13() == null) {
            stringBuffer.append("下13ma,0—");
        } else {
            stringBuffer.append("下13ma," + stockDayYanPanKmQR.getXiaJiangMa13() + "—");
        }
        if (stockDayYanPanKmQR.getXiaJiangCount13() == null) {
            stringBuffer.append("下13count,0—");
        } else {
            stringBuffer.append("下13count," + stockDayYanPanKmQR.getXiaJiangCount13() + "—");
        }
        if (stockDayYanPanKmQR.getXiaJiangRate13() == null) {
            stringBuffer.append("下13rate,0—");
        } else {
            stringBuffer.append("下13rate," + stockDayYanPanKmQR.getXiaJiangRate13() + "—");
        }
        if (stockDayYanPanKmQR.getShangZhangSum20() == null) {
            stringBuffer.append("上20sum,0—");
        } else {
            stringBuffer.append("上20sum," + stockDayYanPanKmQR.getShangZhangSum20() + "—");
        }
        if (stockDayYanPanKmQR.getShangZhangMa20() == null) {
            stringBuffer.append("上20ma,0—");
        } else {
            stringBuffer.append("上20ma," + stockDayYanPanKmQR.getShangZhangMa20() + "—");
        }
        if (stockDayYanPanKmQR.getShangZhangCount20() == null) {
            stringBuffer.append("上20count,0—");
        } else {
            stringBuffer.append("上20count," + stockDayYanPanKmQR.getShangZhangCount20() + "—");
        }
        if (stockDayYanPanKmQR.getShangZhangRate1() == null) {
            stringBuffer.append("上20rate,0—");
        } else {
            stringBuffer.append("上20rate," + stockDayYanPanKmQR.getShangZhangRate1() + "—");
        }
        if (stockDayYanPanKmQR.getXiaJiangSum20() == null) {
            stringBuffer.append("下20sum,0—");
        } else {
            stringBuffer.append("下20sum," + stockDayYanPanKmQR.getXiaJiangSum20() + "—");
        }
        if (stockDayYanPanKmQR.getXiaJiangMa20() == null) {
            stringBuffer.append("下20ma,0—");
        } else {
            stringBuffer.append("下20ma," + stockDayYanPanKmQR.getXiaJiangMa20() + "—");
        }
        if (stockDayYanPanKmQR.getXiaJiangCount20() == null) {
            stringBuffer.append("下20count,0—");
        } else {
            stringBuffer.append("下20count," + stockDayYanPanKmQR.getXiaJiangCount20() + "—");
        }
        if (stockDayYanPanKmQR.getXiaJiangRate20() == null) {
            stringBuffer.append("下20rate,0—");
        } else {
            stringBuffer.append("下20rate," + stockDayYanPanKmQR.getXiaJiangRate20());
        }
        return stringBuffer.toString();
    }

    public static String getQTuXingString(StockDayYanPanQTuXing stockDayYanPanQTuXing) {
        StringBuffer stringBuffer = new StringBuffer();
        if (StringUtils.isEmpty(stockDayYanPanQTuXing.getDangRi())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPanQTuXing.getDangRi() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPanQTuXing.getSanXian())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPanQTuXing.getSanXian() + "—");
        }
        if (StringUtils.isEmpty(stockDayYanPanQTuXing.getQian20TuXing())) {
            stringBuffer.append("0—");
        } else {
            stringBuffer.append(stockDayYanPanQTuXing.getQian20TuXing() + "—");
        }
        if (stockDayYanPanQTuXing.getShangZhangSum1() == null) {
            stringBuffer.append("上1sum,0—");
        } else {
            stringBuffer.append("上1sum," + stockDayYanPanQTuXing.getShangZhangSum1() + "—");
        }
        if (stockDayYanPanQTuXing.getShangZhangMa1() == null) {
            stringBuffer.append("上1ma,0—");
        } else {
            stringBuffer.append("上1ma," + stockDayYanPanQTuXing.getShangZhangMa1() + "—");
        }
        if (stockDayYanPanQTuXing.getShangZhangCount1() == null) {
            stringBuffer.append("上1count,0—");
        } else {
            stringBuffer.append("上1count," + stockDayYanPanQTuXing.getShangZhangCount1() + "—");
        }
        if (stockDayYanPanQTuXing.getShangZhangRate1() == null) {
            stringBuffer.append("上1rate,0—");
        } else {
            stringBuffer.append("上1rate," + stockDayYanPanQTuXing.getShangZhangRate1() + "—");
        }
        if (stockDayYanPanQTuXing.getXiaJiangSum1() == null) {
            stringBuffer.append("下1sum,0—");
        } else {
            stringBuffer.append("下1sum," + stockDayYanPanQTuXing.getXiaJiangSum1() + "—");
        }
        if (stockDayYanPanQTuXing.getXiaJiangMa1() == null) {
            stringBuffer.append("下1ma,0—");
        } else {
            stringBuffer.append("下1ma," + stockDayYanPanQTuXing.getXiaJiangMa1() + "—");
        }
        if (stockDayYanPanQTuXing.getXiaJiangCount1() == null) {
            stringBuffer.append("下1count,0—");
        } else {
            stringBuffer.append("下1count," + stockDayYanPanQTuXing.getXiaJiangCount1() + "—");
        }
        if (stockDayYanPanQTuXing.getXiaJiangRate1() == null) {
            stringBuffer.append("下1rate,0—");
        } else {
            stringBuffer.append("下1rate," + stockDayYanPanQTuXing.getXiaJiangRate1() + "—");
        }
        if (stockDayYanPanQTuXing.getShangZhangSum2() == null) {
            stringBuffer.append("上2sum,0—");
        } else {
            stringBuffer.append("上2sum," + stockDayYanPanQTuXing.getShangZhangSum2() + "—");
        }
        if (stockDayYanPanQTuXing.getShangZhangMa2() == null) {
            stringBuffer.append("上2ma,0—");
        } else {
            stringBuffer.append("上2ma," + stockDayYanPanQTuXing.getShangZhangMa2() + "—");
        }
        if (stockDayYanPanQTuXing.getShangZhangCount2() == null) {
            stringBuffer.append("上2count,0—");
        } else {
            stringBuffer.append("上2count," + stockDayYanPanQTuXing.getShangZhangCount2() + "—");
        }
        if (stockDayYanPanQTuXing.getShangZhangRate2() == null) {
            stringBuffer.append("上2rate,0—");
        } else {
            stringBuffer.append("上2rate," + stockDayYanPanQTuXing.getShangZhangRate2() + "—");
        }
        if (stockDayYanPanQTuXing.getXiaJiangSum2() == null) {
            stringBuffer.append("下2sum,0—");
        } else {
            stringBuffer.append("下2sum," + stockDayYanPanQTuXing.getXiaJiangSum2() + "—");
        }
        if (stockDayYanPanQTuXing.getXiaJiangMa2() == null) {
            stringBuffer.append("下2ma,0—");
        } else {
            stringBuffer.append("下2ma," + stockDayYanPanQTuXing.getXiaJiangMa2() + "—");
        }
        if (stockDayYanPanQTuXing.getXiaJiangCount2() == null) {
            stringBuffer.append("下2count,0—");
        } else {
            stringBuffer.append("下2count," + stockDayYanPanQTuXing.getXiaJiangCount2() + "—");
        }
        if (stockDayYanPanQTuXing.getXiaJiangRate2() == null) {
            stringBuffer.append("下2rate,0—");
        } else {
            stringBuffer.append("下2rate," + stockDayYanPanQTuXing.getXiaJiangRate2() + "—");
        }
        if (stockDayYanPanQTuXing.getShangZhangSum3() == null) {
            stringBuffer.append("上3sum,0—");
        } else {
            stringBuffer.append("上3sum," + stockDayYanPanQTuXing.getShangZhangSum3() + "—");
        }
        if (stockDayYanPanQTuXing.getShangZhangMa3() == null) {
            stringBuffer.append("上3ma,0—");
        } else {
            stringBuffer.append("上3ma," + stockDayYanPanQTuXing.getShangZhangMa3() + "—");
        }
        if (stockDayYanPanQTuXing.getShangZhangCount3() == null) {
            stringBuffer.append("上3count,0—");
        } else {
            stringBuffer.append("上3count," + stockDayYanPanQTuXing.getShangZhangCount3() + "—");
        }
        if (stockDayYanPanQTuXing.getShangZhangRate3() == null) {
            stringBuffer.append("上3rate,0—");
        } else {
            stringBuffer.append("上3rate," + stockDayYanPanQTuXing.getShangZhangRate3() + "—");
        }
        if (stockDayYanPanQTuXing.getXiaJiangSum3() == null) {
            stringBuffer.append("下3sum,0—");
        } else {
            stringBuffer.append("下3sum," + stockDayYanPanQTuXing.getXiaJiangSum3() + "—");
        }
        if (stockDayYanPanQTuXing.getXiaJiangMa3() == null) {
            stringBuffer.append("下3ma,0—");
        } else {
            stringBuffer.append("下3ma," + stockDayYanPanQTuXing.getXiaJiangMa3() + "—");
        }
        if (stockDayYanPanQTuXing.getXiaJiangCount3() == null) {
            stringBuffer.append("下3count,0—");
        } else {
            stringBuffer.append("下3count," + stockDayYanPanQTuXing.getXiaJiangCount3() + "—");
        }
        if (stockDayYanPanQTuXing.getXiaJiangRate3() == null) {
            stringBuffer.append("下3rate,0—");
        } else {
            stringBuffer.append("下3rate," + stockDayYanPanQTuXing.getXiaJiangRate3() + "—");
        }
        if (stockDayYanPanQTuXing.getShangZhangSum5() == null) {
            stringBuffer.append("上5sum,0—");
        } else {
            stringBuffer.append("上5sum," + stockDayYanPanQTuXing.getShangZhangSum5() + "—");
        }
        if (stockDayYanPanQTuXing.getShangZhangMa5() == null) {
            stringBuffer.append("上5ma,0—");
        } else {
            stringBuffer.append("上5ma," + stockDayYanPanQTuXing.getShangZhangMa5() + "—");
        }
        if (stockDayYanPanQTuXing.getShangZhangCount5() == null) {
            stringBuffer.append("上5count,0—");
        } else {
            stringBuffer.append("上5count," + stockDayYanPanQTuXing.getShangZhangCount5() + "—");
        }
        if (stockDayYanPanQTuXing.getShangZhangRate5() == null) {
            stringBuffer.append("上5rate,0—");
        } else {
            stringBuffer.append("上5rate," + stockDayYanPanQTuXing.getShangZhangRate5() + "—");
        }
        if (stockDayYanPanQTuXing.getXiaJiangSum5() == null) {
            stringBuffer.append("下5sum,0—");
        } else {
            stringBuffer.append("下5sum," + stockDayYanPanQTuXing.getXiaJiangSum5() + "—");
        }
        if (stockDayYanPanQTuXing.getXiaJiangMa5() == null) {
            stringBuffer.append("下5ma,0—");
        } else {
            stringBuffer.append("下5ma," + stockDayYanPanQTuXing.getXiaJiangMa5() + "—");
        }
        if (stockDayYanPanQTuXing.getXiaJiangCount5() == null) {
            stringBuffer.append("下5count,0—");
        } else {
            stringBuffer.append("下5count," + stockDayYanPanQTuXing.getXiaJiangCount5() + "—");
        }
        if (stockDayYanPanQTuXing.getXiaJiangRate5() == null) {
            stringBuffer.append("下5rate,0—");
        } else {
            stringBuffer.append("下5rate," + stockDayYanPanQTuXing.getXiaJiangRate5() + "—");
        }
        if (stockDayYanPanQTuXing.getShangZhangSum8() == null) {
            stringBuffer.append("上8sum,0—");
        } else {
            stringBuffer.append("上8sum," + stockDayYanPanQTuXing.getShangZhangSum8() + "—");
        }
        if (stockDayYanPanQTuXing.getShangZhangMa8() == null) {
            stringBuffer.append("上8ma,0—");
        } else {
            stringBuffer.append("上8ma," + stockDayYanPanQTuXing.getShangZhangMa8() + "—");
        }
        if (stockDayYanPanQTuXing.getShangZhangCount8() == null) {
            stringBuffer.append("上8count,0—");
        } else {
            stringBuffer.append("上8count," + stockDayYanPanQTuXing.getShangZhangCount8() + "—");
        }
        if (stockDayYanPanQTuXing.getShangZhangRate8() == null) {
            stringBuffer.append("上8rate,0—");
        } else {
            stringBuffer.append("上8rate," + stockDayYanPanQTuXing.getShangZhangRate8() + "—");
        }
        if (stockDayYanPanQTuXing.getXiaJiangSum8() == null) {
            stringBuffer.append("下8sum,0—");
        } else {
            stringBuffer.append("下8sum," + stockDayYanPanQTuXing.getXiaJiangSum8() + "—");
        }
        if (stockDayYanPanQTuXing.getXiaJiangMa8() == null) {
            stringBuffer.append("下8ma,0—");
        } else {
            stringBuffer.append("下8ma," + stockDayYanPanQTuXing.getXiaJiangMa8() + "—");
        }
        if (stockDayYanPanQTuXing.getXiaJiangCount8() == null) {
            stringBuffer.append("下8count,0—");
        } else {
            stringBuffer.append("下8count," + stockDayYanPanQTuXing.getXiaJiangCount8() + "—");
        }
        if (stockDayYanPanQTuXing.getXiaJiangRate8() == null) {
            stringBuffer.append("下8rate,0—");
        } else {
            stringBuffer.append("下8rate," + stockDayYanPanQTuXing.getXiaJiangRate8() + "—");
        }
        if (stockDayYanPanQTuXing.getShangZhangSum13() == null) {
            stringBuffer.append("上13sum,0—");
        } else {
            stringBuffer.append("上13sum," + stockDayYanPanQTuXing.getShangZhangSum13() + "—");
        }
        if (stockDayYanPanQTuXing.getShangZhangMa13() == null) {
            stringBuffer.append("上13ma,0—");
        } else {
            stringBuffer.append("上13ma," + stockDayYanPanQTuXing.getShangZhangMa13() + "—");
        }
        if (stockDayYanPanQTuXing.getShangZhangCount13() == null) {
            stringBuffer.append("上13count,0—");
        } else {
            stringBuffer.append("上13count," + stockDayYanPanQTuXing.getShangZhangCount13() + "—");
        }
        if (stockDayYanPanQTuXing.getShangZhangRate13() == null) {
            stringBuffer.append("上13rate,0—");
        } else {
            stringBuffer.append("上13rate," + stockDayYanPanQTuXing.getShangZhangRate13() + "—");
        }
        if (stockDayYanPanQTuXing.getXiaJiangSum13() == null) {
            stringBuffer.append("下13sum,0—");
        } else {
            stringBuffer.append("下13sum," + stockDayYanPanQTuXing.getXiaJiangSum13() + "—");
        }
        if (stockDayYanPanQTuXing.getXiaJiangMa13() == null) {
            stringBuffer.append("下13ma,0—");
        } else {
            stringBuffer.append("下13ma," + stockDayYanPanQTuXing.getXiaJiangMa13() + "—");
        }
        if (stockDayYanPanQTuXing.getXiaJiangCount13() == null) {
            stringBuffer.append("下13count,0—");
        } else {
            stringBuffer.append("下13count," + stockDayYanPanQTuXing.getXiaJiangCount13() + "—");
        }
        if (stockDayYanPanQTuXing.getXiaJiangRate13() == null) {
            stringBuffer.append("下13rate,0—");
        } else {
            stringBuffer.append("下13rate," + stockDayYanPanQTuXing.getXiaJiangRate13() + "—");
        }
        if (stockDayYanPanQTuXing.getShangZhangSum20() == null) {
            stringBuffer.append("上20sum,0—");
        } else {
            stringBuffer.append("上20sum," + stockDayYanPanQTuXing.getShangZhangSum20() + "—");
        }
        if (stockDayYanPanQTuXing.getShangZhangMa20() == null) {
            stringBuffer.append("上20ma,0—");
        } else {
            stringBuffer.append("上20ma," + stockDayYanPanQTuXing.getShangZhangMa20() + "—");
        }
        if (stockDayYanPanQTuXing.getShangZhangCount20() == null) {
            stringBuffer.append("上20count,0—");
        } else {
            stringBuffer.append("上20count," + stockDayYanPanQTuXing.getShangZhangCount20() + "—");
        }
        if (stockDayYanPanQTuXing.getShangZhangRate1() == null) {
            stringBuffer.append("上20rate,0—");
        } else {
            stringBuffer.append("上20rate," + stockDayYanPanQTuXing.getShangZhangRate1() + "—");
        }
        if (stockDayYanPanQTuXing.getXiaJiangSum20() == null) {
            stringBuffer.append("下20sum,0—");
        } else {
            stringBuffer.append("下20sum," + stockDayYanPanQTuXing.getXiaJiangSum20() + "—");
        }
        if (stockDayYanPanQTuXing.getXiaJiangMa20() == null) {
            stringBuffer.append("下20ma,0—");
        } else {
            stringBuffer.append("下20ma," + stockDayYanPanQTuXing.getXiaJiangMa20() + "—");
        }
        if (stockDayYanPanQTuXing.getXiaJiangCount20() == null) {
            stringBuffer.append("下20count,0—");
        } else {
            stringBuffer.append("下20count," + stockDayYanPanQTuXing.getXiaJiangCount20() + "—");
        }
        if (stockDayYanPanQTuXing.getXiaJiangRate20() == null) {
            stringBuffer.append("下20rate,0—");
        } else {
            stringBuffer.append("下20rate," + stockDayYanPanQTuXing.getXiaJiangRate20());
        }
        return stringBuffer.toString();
    }


}
