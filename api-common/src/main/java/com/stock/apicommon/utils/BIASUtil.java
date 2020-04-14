package com.stock.apicommon.utils;

import com.stock.apicommon.entity.BIASEntity;
import com.stock.apicommon.vo.BIASVo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class BIASUtil {

    public static BIASVo getBIAS(List<BIASEntity> biasEntityList){
        if (biasEntityList==null||biasEntityList.size()!=30){
            return null;
        }
        BIASVo biasVo=new BIASVo();
        BigDecimal sumPrice6=new BigDecimal(0);
        BigDecimal sumPrice12=new BigDecimal(0);
        BigDecimal sumPrice30=new BigDecimal(0);
        BigDecimal price6=null;
        BigDecimal BIAS6=new BigDecimal(0);
        BigDecimal price12=null;
        BigDecimal BIAS12=new BigDecimal(0);
        BigDecimal price30=null;
        BigDecimal BIAS30=new BigDecimal(0);


        for (int i=0;i<biasEntityList.size();i++){
            sumPrice6=sumPrice6.add(biasEntityList.get(i).getClosingPrice());
            sumPrice12=sumPrice12.add(biasEntityList.get(i).getClosingPrice());
            sumPrice30=sumPrice30.add(biasEntityList.get(i).getClosingPrice());

            if (i==5){
              price6=sumPrice6.divide(new BigDecimal(6),4, RoundingMode.HALF_UP);
              if (price6.compareTo(new BigDecimal(0))!=0) {
                  BIAS6 = ((biasEntityList.get(0).getClosingPrice().subtract(price6)).divide(price6, 4, RoundingMode.HALF_UP)).multiply(new BigDecimal(100));
              }
            }

            if (i==11){
                price12=sumPrice12.divide(new BigDecimal(12),4, RoundingMode.HALF_UP);
                if (price12.compareTo(new BigDecimal(0))!=0) {
                    BIAS12 = ((biasEntityList.get(0).getClosingPrice().subtract(price12)).divide(price12, 4, RoundingMode.HALF_UP)).multiply(new BigDecimal(100));
                }
            }

            if (i==29){
                price30=sumPrice30.divide(new BigDecimal(30),4, RoundingMode.HALF_UP);
                if (price30.compareTo(new BigDecimal(0))!=0) {
                    BIAS30 = ((biasEntityList.get(0).getClosingPrice().subtract(price30)).divide(price30, 4, RoundingMode.HALF_UP)).multiply(new BigDecimal(100));
                }
            }
        }
        biasVo.setBIAS5(BIAS6);
        biasVo.setBIAS10(BIAS12);
        biasVo.setBIAS30(BIAS30);
        return biasVo;
    }

    //向上
    //向下
    //0轴以下向下
    //0轴以下向上
    //0轴以上向下
    //0轴以上向上
    //-5轴以下向下
    //-5轴以下向上
    //6轴以上向下
    //6轴以上向上
}
