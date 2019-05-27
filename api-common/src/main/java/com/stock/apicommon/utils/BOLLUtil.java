package com.stock.apicommon.utils;

import com.stock.apicommon.entity.BOLLEntity;
import com.stock.apicommon.vo.BOLLVo;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.List;

public class BOLLUtil {
    public static BOLLVo getBOLL(List<BOLLEntity> bollEntityList) {
        if (bollEntityList.size() != 20 || bollEntityList == null) {
            return null;
        }
        BOLLVo bollVo = new BOLLVo();
        BigDecimal sumMA = new BigDecimal(0);
        BigDecimal MA = null;
        BigDecimal sumSqrt = new BigDecimal(0);
        BigDecimal sumMB = new BigDecimal(0);
        BigDecimal MB = null;
        for (BOLLEntity bollEntity : bollEntityList) {
            sumMA = sumMA.add(bollEntity.getClosingPrice());
        }
        //均价
        MA = sumMA.divide(new BigDecimal(20), 2, RoundingMode.HALF_UP);
        //n-1日的标准差
        for (int i = 0; i < bollEntityList.size(); i++) {
            if(i!=0) {
                sumMB = sumMB.add(bollEntityList.get(i).getClosingPrice());
            }
            BigDecimal pf = (bollEntityList.get(i).getClosingPrice().subtract(MA)).multiply(bollEntityList.get(i).getClosingPrice().subtract(MA));
            sumSqrt = sumSqrt.add(pf);
        }
        //平均方差
        sumSqrt = sumSqrt.divide(new BigDecimal(19),4, RoundingMode.HALF_UP);
        //标准差
        if (sumSqrt.compareTo(new BigDecimal(0))==0){
            sumSqrt=sumSqrt.add(new BigDecimal(0.001));
        }
        BigDecimal MD = sqrt(sumSqrt, 2);

        MB = sumMB.divide(new BigDecimal(19), 2, RoundingMode.HALF_UP);
        BigDecimal UP = MB.add(MD.multiply(new BigDecimal(2)));
        BigDecimal DN = MB.subtract(MD.multiply(new BigDecimal(2)));
        bollVo.setUP(UP);
        bollVo.setMB(MB);
        bollVo.setDN(DN);
        return bollVo;
    }

    //求平方根
    public static BigDecimal sqrt(BigDecimal value, int scale) {
        BigDecimal num2 = BigDecimal.valueOf(2);
        int precision = 100;
        MathContext mc = new MathContext(precision, RoundingMode.HALF_UP);
        BigDecimal deviation = value;
        int cnt = 0;
        while (cnt < precision) {
            deviation = (deviation.add(value.divide(deviation, mc))).divide(num2, mc);
            cnt++;
        }
        deviation = deviation.setScale(scale, BigDecimal.ROUND_HALF_UP);
        return deviation;
    }
    //下轨
    //中轨
    //上轨

}
