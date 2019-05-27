package com.stock.apicommon.utils.patterning;

import com.stock.apicommon.entity.ChangeEntity;
import com.stock.apicommon.entity.DaPanChangeEntity;
import com.stock.apicommon.vo.DaPanRateOfChangeVo;
import com.stock.apicommon.vo.RateOfChangeVo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

/**
 * 大盘系
 */
public class DaPanUtil {
    public static DaPanRateOfChangeVo getDaPanRateOfChange(List<DaPanChangeEntity> changeEntityList) {
        if (changeEntityList == null || changeEntityList.size() == 0||changeEntityList.size()!=20) {
            return null;
        }
        List<DaPanChangeEntity> changeEntityList1 = new ArrayList<>();
        List<DaPanChangeEntity> changeEntityList2 = new ArrayList<>();
        List<DaPanChangeEntity> changeEntityList3 = new ArrayList<>();
        List<DaPanChangeEntity> changeEntityList5 = new ArrayList<>();
        List<DaPanChangeEntity> changeEntityList8 = new ArrayList<>();
        List<DaPanChangeEntity> changeEntityList13 = new ArrayList<>();
        List<DaPanChangeEntity> changeEntityList20 = new ArrayList<>();
        for (int i = 0; i < changeEntityList.size(); i++) {
            if (i < 1) {
                changeEntityList1.add(changeEntityList.get(i));
            }
            if (i < 2) {
                changeEntityList2.add(changeEntityList.get(i));
            }
            if (i < 3) {
                changeEntityList3.add(changeEntityList.get(i));
            }
            if (i < 5) {
                changeEntityList5.add(changeEntityList.get(i));
            }
            if (i < 8) {
                changeEntityList8.add(changeEntityList.get(i));
            }
            if (i < 13) {
                changeEntityList13.add(changeEntityList.get(i));
            }
            if (i < 20) {
                changeEntityList20.add(changeEntityList.get(i));
            }
            if (changeEntityList.get(i).getChangePoints()==null){
                if (changeEntityList.get(i).getLclosePrice()!=null) {
                    changeEntityList.get(i).setChangePoints(changeEntityList.get(i).getClosingPrice().subtract(changeEntityList.get(i).getLclosePrice()));
                    changeEntityList.get(i).setRateOfChange(changeEntityList.get(i).getChangePoints().divide(changeEntityList.get(i).getLclosePrice(), 2, RoundingMode.HALF_UP));
                }else {
                    changeEntityList.get(i).setChangePoints(changeEntityList.get(i).getClosingPrice().subtract(changeEntityList.get(i).getOpeningPrice()));
                    changeEntityList.get(i).setRateOfChange(changeEntityList.get(i).getChangePoints().divide(changeEntityList.get(i).getOpeningPrice(), 2, RoundingMode.HALF_UP));
                }
            }
        }
        DaPanRateOfChangeVo daPanRateOfChangeVo = new DaPanRateOfChangeVo();
        BigDecimal beforeDPChange1 = new BigDecimal(0);
        BigDecimal beforeDPChange2 = new BigDecimal(0);
        BigDecimal beforeDPChange3 = new BigDecimal(0);
        BigDecimal beforeDPChange5 = new BigDecimal(0);
        BigDecimal beforeDPChange8 = new BigDecimal(0);
        BigDecimal beforeDPChange13 = new BigDecimal(0);
        BigDecimal beforeDPChange20 = new BigDecimal(0);
        //前1天
        beforeDPChange1 = changeEntityList1.get(0).getRateOfChange();
        //前两天
        BigDecimal changePoints2 = new BigDecimal(0);
        for (int i = 0; i < changeEntityList2.size(); i++) {
            changePoints2 = changePoints2.add(changeEntityList2.get(i).getChangePoints());
        }
        beforeDPChange2 = (changePoints2.divide(changeEntityList2.get(changeEntityList2.size() - 1).getLclosePrice(), 4, RoundingMode.HALF_UP)).multiply(new BigDecimal(100));
        //前三天
        BigDecimal changePoints3 = new BigDecimal(0);
        for (int i = 0; i < changeEntityList3.size(); i++) {
            changePoints3 = changePoints3.add(changeEntityList3.get(i).getChangePoints());
        }
        beforeDPChange3 = (changePoints3.divide(changeEntityList3.get(changeEntityList3.size() - 1).getLclosePrice(), 4, RoundingMode.HALF_UP)).multiply(new BigDecimal(100));
        //前五天
        BigDecimal changePoints5 = new BigDecimal(0);
        for (int i = 0; i < changeEntityList5.size(); i++) {
            changePoints5 = changePoints5.add(changeEntityList5.get(i).getChangePoints());
        }
        beforeDPChange5 = (changePoints5.divide(changeEntityList5.get(changeEntityList5.size() - 1).getLclosePrice(), 4, RoundingMode.HALF_UP)).multiply(new BigDecimal(100));
        //前8天
        BigDecimal changePoints8 = new BigDecimal(0);
        for (int i = 0; i < changeEntityList8.size(); i++) {
            changePoints8 = changePoints8.add(changeEntityList8.get(i).getChangePoints());
        }
        beforeDPChange8 = (changePoints8.divide(changeEntityList8.get(changeEntityList8.size() - 1).getLclosePrice(), 4, RoundingMode.HALF_UP)).multiply(new BigDecimal(100));
        //前13天
        BigDecimal changePoints13 = new BigDecimal(0);
        for (int i = 0; i < changeEntityList13.size(); i++) {
            changePoints13 = changePoints13.add(changeEntityList13.get(i).getChangePoints());
        }
        beforeDPChange13 = (changePoints13.divide(changeEntityList13.get(changeEntityList13.size() - 1).getLclosePrice(), 4, RoundingMode.HALF_UP)).multiply(new BigDecimal(100));
        //前20天
        BigDecimal changePoints20 = new BigDecimal(0);
        for (int i = 0; i < changeEntityList20.size(); i++) {
            changePoints20 = changePoints20.add(changeEntityList20.get(i).getChangePoints());
        }
        if (changeEntityList20.get(changeEntityList20.size() - 1).getLclosePrice()!=null) {
            beforeDPChange20 = (changePoints20.divide(changeEntityList20.get(changeEntityList20.size() - 1).getLclosePrice(), 4, RoundingMode.HALF_UP)).multiply(new BigDecimal(100));
        }else {
            beforeDPChange20 = (changePoints20.divide(changeEntityList20.get(changeEntityList20.size() - 1).getOpeningPrice(), 4, RoundingMode.HALF_UP)).multiply(new BigDecimal(100));
        }
        daPanRateOfChangeVo.setBeforeDPChange1(beforeDPChange1);
        daPanRateOfChangeVo.setBeforeDPChange2(beforeDPChange2);
        daPanRateOfChangeVo.setBeforeDPChange3(beforeDPChange3);
        daPanRateOfChangeVo.setBeforeDPChange5(beforeDPChange5);
        daPanRateOfChangeVo.setBeforeDPChange8(beforeDPChange8);
        daPanRateOfChangeVo.setBeforeDPChange13(beforeDPChange13);
        daPanRateOfChangeVo.setBeforeDPChange20(beforeDPChange20);
        return daPanRateOfChangeVo;
    }

}
