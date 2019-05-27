package com.stock.apicommon.utils.patterning;


import com.stock.apicommon.Constants;
import com.stock.apicommon.entity.DangRiEntity;
import com.stock.apicommon.entity.ScienceEntity;
import com.stock.apicommon.vo.YirichuanVo;

import java.math.BigDecimal;

public class YirichuanUtil {

    public static YirichuanVo  getYiRiChuan(DangRiEntity dangRiEntity, ScienceEntity scienceEntity){
        if (dangRiEntity.getLclosePrice()==null||scienceEntity.getPriceMa5()==null){
            return null;
        }
        YirichuanVo yirichuanVo=new YirichuanVo();
        if (dangRiEntity.getClosingPrice().compareTo(dangRiEntity.getOpeningPrice())>0&&dangRiEntity.getRateOfChange().compareTo(new BigDecimal(0))>0){
            if (dangRiEntity.getLclosePrice().compareTo(scienceEntity.getPriceMa5())<0&&dangRiEntity.getLclosePrice().compareTo(scienceEntity.getPriceMa10())<0&&dangRiEntity.getLclosePrice().compareTo(scienceEntity.getPriceMa20())<0) {
                if (dangRiEntity.getClosingPrice().compareTo(scienceEntity.getPriceMa5()) > 0 && dangRiEntity.getClosingPrice().compareTo(scienceEntity.getPriceMa10()) > 0 && dangRiEntity.getClosingPrice().compareTo(scienceEntity.getPriceMa20()) > 0&& dangRiEntity.getClosingPrice().compareTo(scienceEntity.getPriceMa30()) > 0) {
                    //出水芙蓉
                    yirichuanVo.setChushuifurong(Constants.CHUSHUIFURONG);
                }
            }
        }
       if (dangRiEntity.getClosingPrice().compareTo(dangRiEntity.getOpeningPrice())<0&&dangRiEntity.getRateOfChange().compareTo(new BigDecimal(0))<0) {
           if (dangRiEntity.getLclosePrice().compareTo(scienceEntity.getPriceMa5()) >0 && dangRiEntity.getLclosePrice().compareTo(scienceEntity.getPriceMa10()) >0 && dangRiEntity.getLclosePrice().compareTo(scienceEntity.getPriceMa20())>0) {
               if (dangRiEntity.getClosingPrice().compareTo(scienceEntity.getPriceMa5()) < 0 && dangRiEntity.getClosingPrice().compareTo(scienceEntity.getPriceMa10())< 0 && dangRiEntity.getClosingPrice().compareTo(scienceEntity.getPriceMa20()) <0&& dangRiEntity.getClosingPrice().compareTo(scienceEntity.getPriceMa30()) <0) {
                   //断头测刀
                   yirichuanVo.setDuantoucedao(Constants.DUANTOUCHEDAO);
               }
           }
       }
       return yirichuanVo;
    }


}
