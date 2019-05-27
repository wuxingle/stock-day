package com.stock.apicommon.utils;

import com.stock.apicommon.Constants;
import com.stock.apicommon.entity.MakeQuantityEntity;
import com.stock.apicommon.entity.ScienceEntity;
import com.stock.apicommon.vo.MakeQuantityVo;
import com.stock.apicommon.vo.PriceScienceVo;
import com.stock.apicommon.vo.QuantityScienceVo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class MakeQuantityMAUtil {

    public static MakeQuantityVo getMakeQuantity(List<MakeQuantityEntity> makeQuantityEntityList){
        if (makeQuantityEntityList.size()!=30||makeQuantityEntityList==null){
            return null;
        }
        List<MakeQuantityEntity> makeQuantityEntityList5=new ArrayList<>();
        List<MakeQuantityEntity> makeQuantityEntityList10=new ArrayList<>();
        List<MakeQuantityEntity> makeQuantityEntityList20=new ArrayList<>();
        List<MakeQuantityEntity> makeQuantityEntityList30=new ArrayList<>();
        BigDecimal makeQuantity5=new BigDecimal(0);
        BigDecimal makeQuantity10=new BigDecimal(0);
        BigDecimal makeQuantity20=new BigDecimal(0);
        BigDecimal makeQuantity30=new BigDecimal(0);
        MakeQuantityVo makeQuantityVo=new MakeQuantityVo();
        for (int i=0;i<makeQuantityEntityList.size();i++){
            makeQuantityEntityList5.add(makeQuantityEntityList.get(i));
            makeQuantityEntityList10.add(makeQuantityEntityList.get(i));
            makeQuantityEntityList20.add(makeQuantityEntityList.get(i));
            makeQuantityEntityList30.add(makeQuantityEntityList.get(i));
            if (makeQuantityEntityList5.size()==5){
                BigDecimal sum5=new BigDecimal(0);
                for (MakeQuantityEntity makeQuantityEntity:makeQuantityEntityList5) {
                    sum5=sum5.add(makeQuantityEntity.getMakeQuantity());
                }
                makeQuantity5=sum5.divide(new BigDecimal(5),2, RoundingMode.HALF_UP);
            }
            if (makeQuantityEntityList10.size()==10){
                BigDecimal sum10=new BigDecimal(0);
                for (MakeQuantityEntity makeQuantityEntity:makeQuantityEntityList10) {
                    sum10=sum10.add(makeQuantityEntity.getMakeQuantity());
                }
                makeQuantity10=sum10.divide(new BigDecimal(10),2, RoundingMode.HALF_UP);
            }
            if (makeQuantityEntityList20.size()==20){
                BigDecimal sum20=new BigDecimal(0);
                for (MakeQuantityEntity makeQuantityEntity:makeQuantityEntityList20) {
                    sum20=sum20.add(makeQuantityEntity.getMakeQuantity());
                }
                makeQuantity20=sum20.divide(new BigDecimal(20),2, RoundingMode.HALF_UP);
            }
            if (makeQuantityEntityList30.size()==30){
                BigDecimal sum30=new BigDecimal(0);
                for (MakeQuantityEntity makeQuantityEntity:makeQuantityEntityList30) {
                    sum30=sum30.add(makeQuantityEntity.getMakeQuantity());
                }
                makeQuantity30=sum30.divide(new BigDecimal(30),2, RoundingMode.HALF_UP);
            }


        }
        makeQuantityVo.setMakeQuantity5(makeQuantity5);
        makeQuantityVo.setMakeQuantity10(makeQuantity10);
        makeQuantityVo.setMakeQuantity20(makeQuantity20);
        makeQuantityVo.setMakeQuantity30(makeQuantity30);
        return makeQuantityVo;
    }
    public static QuantityScienceVo getQuantityScience(List<ScienceEntity> scienceEntityList){
        if (scienceEntityList.get(1).getMakeQuantityMa5()==null){
            return null;
        }
        QuantityScienceVo quantityScienceVo=new QuantityScienceVo();
        StringBuffer str=new StringBuffer();
        if (scienceEntityList.get(0).getMakeQuantityMa5().compareTo(scienceEntityList.get(1).getMakeQuantityMa5())>0){
            str.append(Constants.PRICEXIANGSHANG5);
            str.append(",");
        }
        if (scienceEntityList.get(0).getMakeQuantityMa5().compareTo(scienceEntityList.get(1).getMakeQuantityMa5())<=0){
            str.append(Constants.PRICEXIANGXIA5);
            str.append(",");
        }
        if (scienceEntityList.get(0).getMakeQuantityMa10().compareTo(scienceEntityList.get(1).getMakeQuantityMa10())>0){
            str.append(Constants.PRICEXIANGSHANG10);
            str.append(",");
        }
        if (scienceEntityList.get(0).getMakeQuantityMa10().compareTo(scienceEntityList.get(1).getMakeQuantityMa10())<=0){
            str.append(Constants.PRICEXIANGXIA10);
            str.append(",");
        }
        if (scienceEntityList.get(0).getMakeQuantityMa20().compareTo(scienceEntityList.get(1).getMakeQuantityMa20())>0){
            str.append(Constants.PRICEXIANGSHANG20);
            str.append(",");
        }
        if (scienceEntityList.get(0).getMakeQuantityMa20().compareTo(scienceEntityList.get(1).getMakeQuantityMa20())<=0){
            str.append(Constants.PRICEXIANGXIA20);
            str.append(",");
        }
        if (scienceEntityList.get(0).getMakeQuantityMa30().compareTo(scienceEntityList.get(1).getMakeQuantityMa30())>0){
            str.append(Constants.PRICEXIANGSHANG30);
            str.append(",");
        }
        if (scienceEntityList.get(0).getMakeQuantityMa30().compareTo(scienceEntityList.get(1).getMakeQuantityMa30())<=0){
            str.append(Constants.PRICEXIANGXIA30);
            str.append(",");
        }
        quantityScienceVo.setJunxian(str.toString());
        return quantityScienceVo;
    }
}
