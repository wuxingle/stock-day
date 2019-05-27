package com.stock.apicommon.utils.patterning;

import com.stock.apicommon.entity.ChangeEntity;
import com.stock.apicommon.vo.RateOfChangeVo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

/**
 * 本票变化率
 */
public class RateOfChangeUtil {

    public static RateOfChangeVo getRateOfChange(List<ChangeEntity> changeEntityList){
        if (changeEntityList==null||changeEntityList.size()==0){
            return null;
        }
        List<ChangeEntity> changeEntityList1=new ArrayList<>();
        List<ChangeEntity> changeEntityList2=new ArrayList<>();
        List<ChangeEntity> changeEntityList3=new ArrayList<>();
        List<ChangeEntity> changeEntityList5=new ArrayList<>();
        List<ChangeEntity> changeEntityList8=new ArrayList<>();
        List<ChangeEntity> changeEntityList13=new ArrayList<>();
        List<ChangeEntity> changeEntityList20=new ArrayList<>();
        for (int i=0;i<changeEntityList.size();i++) {
            if (i<1){
                changeEntityList1.add(changeEntityList.get(i));
            }
            if (i<2){
                changeEntityList2.add(changeEntityList.get(i));
            }
            if (i<3){
                changeEntityList3.add(changeEntityList.get(i));
            }
            if (i<5){
                changeEntityList5.add(changeEntityList.get(i));
            }
            if (i<8){
                changeEntityList8.add(changeEntityList.get(i));
            }
            if (i<13){
                changeEntityList13.add(changeEntityList.get(i));
            }
            if (i<20){
                changeEntityList20.add(changeEntityList.get(i));
            }
        }
        RateOfChangeVo rateOfChangeVo=new RateOfChangeVo();
        BigDecimal beforeChange1=new BigDecimal(0);
        BigDecimal beforeChange2=new BigDecimal(0);
        BigDecimal beforeChange3=new BigDecimal(0);
        BigDecimal beforeChange5=new BigDecimal(0);
        BigDecimal beforeChange8=new BigDecimal(0);
        BigDecimal beforeChange13=new BigDecimal(0);
        BigDecimal beforeChange20=new BigDecimal(0);
        //前1天
        beforeChange1=changeEntityList1.get(0).getRateOfChange();
        //前两天
        BigDecimal changePoints2=new BigDecimal(0);
        for (int i=0;i<changeEntityList2.size();i++){
            changePoints2=changePoints2.add(changeEntityList2.get(i).getChangePoints());
        }
        beforeChange2=(changePoints2.divide(changeEntityList2.get(changeEntityList2.size()-1).getLclosePrice(),4, RoundingMode.HALF_UP)).multiply(new BigDecimal(100));
        //前三天
        BigDecimal changePoints3=new BigDecimal(0);
        for (int i=0;i<changeEntityList3.size();i++){
            changePoints3= changePoints3.add(changeEntityList3.get(i).getChangePoints());
        }
        beforeChange3=(changePoints3.divide(changeEntityList3.get(changeEntityList3.size()-1).getLclosePrice(),4, RoundingMode.HALF_UP)).multiply(new BigDecimal(100));
        //前五天
        BigDecimal changePoints5=new BigDecimal(0);
        for (int i=0;i<changeEntityList5.size();i++){
            changePoints5=changePoints5.add(changeEntityList5.get(i).getChangePoints());
        }
        beforeChange5=(changePoints5.divide(changeEntityList5.get(changeEntityList5.size()-1).getLclosePrice(),4, RoundingMode.HALF_UP)).multiply(new BigDecimal(100));
        //前8天
        BigDecimal changePoints8=new BigDecimal(0);
        for (int i=0;i<changeEntityList8.size();i++){
            changePoints8=changePoints8.add(changeEntityList8.get(i).getChangePoints());
        }
        beforeChange8=(changePoints8.divide(changeEntityList8.get(changeEntityList8.size()-1).getLclosePrice(),4, RoundingMode.HALF_UP)).multiply(new BigDecimal(100));
        //前13天
        BigDecimal changePoints13=new BigDecimal(0);
        for (int i=0;i<changeEntityList13.size();i++){
            changePoints13=changePoints13.add(changeEntityList13.get(i).getChangePoints());
        }
        beforeChange13=(changePoints13.divide(changeEntityList13.get(changeEntityList13.size()-1).getLclosePrice(),4, RoundingMode.HALF_UP)).multiply(new BigDecimal(100));
        //前20天
        BigDecimal changePoints20=new BigDecimal(0);
        for (int i=0;i<changeEntityList20.size();i++){
            changePoints20=changePoints20.add(changeEntityList20.get(i).getChangePoints());
        }
        beforeChange20=(changePoints20.divide(changeEntityList20.get(changeEntityList20.size()-1).getLclosePrice(),4, RoundingMode.HALF_UP)).multiply(new BigDecimal(100));
        rateOfChangeVo.setBeforeChange1(beforeChange1);
        rateOfChangeVo.setBeforeChange2(beforeChange2);
        rateOfChangeVo.setBeforeChange3(beforeChange3);
        rateOfChangeVo.setBeforeChange5(beforeChange5);
        rateOfChangeVo.setBeforeChange8(beforeChange8);
        rateOfChangeVo.setBeforeChange13(beforeChange13);
        rateOfChangeVo.setBeforeChange20(beforeChange20);
        return rateOfChangeVo;
    }


}
