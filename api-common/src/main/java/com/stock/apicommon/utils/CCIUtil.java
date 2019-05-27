package com.stock.apicommon.utils;

import com.stock.apicommon.entity.CCIEntity;
import com.stock.apicommon.vo.CCIVo;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.List;

public class CCIUtil {
    public static CCIVo getCCI(List<CCIEntity> cciEntityList){
        if (cciEntityList.size()!=14||cciEntityList==null){
            return null;
        }
        CCIVo cciVo=new CCIVo();
        BigDecimal sumMA=new BigDecimal(0);
        BigDecimal MA=null;
        BigDecimal sumMD=new BigDecimal(0);
        BigDecimal MD=null;
        BigDecimal TP=null;
        BigDecimal CCI=null;
        for (int i=0;i<cciEntityList.size();i++){
            BigDecimal closingPrice=cciEntityList.get(i).getClosingPrice();
            sumMA= sumMA.add(closingPrice);
        }
        MA=sumMA.divide(new BigDecimal(14),3, RoundingMode.HALF_UP);
        for (CCIEntity cciEntity:cciEntityList) {
           sumMD= sumMD.add(MA.subtract(cciEntity.getClosingPrice()));
        }
        MD=sumMD.divide(new BigDecimal(14),3,RoundingMode.HALF_UP);
        TP=(cciEntityList.get(13).getClosingPrice().add(cciEntityList.get(13).getFoot().add(cciEntityList.get(13).getTopside()))).divide(new BigDecimal(3),3,RoundingMode.HALF_UP);
        if (MD.compareTo(new BigDecimal(0))==0){
            MD=MD.add(new BigDecimal(1));
        }
        CCI = (TP.subtract(MA)).divide(MD, 2, RoundingMode.HALF_UP).divide(new BigDecimal(0.015), 2, RoundingMode.HALF_UP);
        cciVo.setCCI(CCI);
        return cciVo;
    }
    //200以上
    //100以上
    //向上突破100
    //向下突破100
    //-200以下
    //-100以下
    //向上突破-100
    //向下突破-100
}
