package com.stock.apicommon.utils.patterning;

import com.stock.apicommon.entity.ChangeEntity;
import com.stock.apicommon.entity.YanPanEntity;
import com.stock.apicommon.vo.DaPanRateOfChangeVo;
import com.stock.apicommon.vo.YanPanVo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 研判系
 */
public class YanPanUtil {

    public static YanPanVo getYanPanRateOfChange(List<YanPanEntity> yanPanEntityList){
        if (yanPanEntityList==null||yanPanEntityList.size()==0){
            return null;
        }
        List<YanPanEntity> changeEntityList1=new ArrayList<>();
        List<YanPanEntity> changeEntityList2=new ArrayList<>();
        List<YanPanEntity> changeEntityList3=new ArrayList<>();
        List<YanPanEntity> changeEntityList5=new ArrayList<>();
        List<YanPanEntity> changeEntityList8=new ArrayList<>();
        List<YanPanEntity> changeEntityList13=new ArrayList<>();
        List<YanPanEntity> changeEntityList20=new ArrayList<>();
        //日期排序
        Collections.sort(yanPanEntityList, new Comparator<YanPanEntity>() {
            @Override
            public int compare(YanPanEntity o1, YanPanEntity o2) {
                long i=o1.getDate().getTime() - o2.getDate().getTime();
                if (i>0){
                    return 1;
                }else if (i<0){
                    return -1;
                }
                return 0;
            }
        });
        for (int i=0;i<yanPanEntityList.size();i++) {
            if (i<1){
                changeEntityList1.add(yanPanEntityList.get(i));
            }
            if (i<2){
                changeEntityList2.add(yanPanEntityList.get(i));
            }
            if (i<3){
                changeEntityList3.add(yanPanEntityList.get(i));
            }
            if (i<5){
                changeEntityList5.add(yanPanEntityList.get(i));
            }
            if (i<8){
                changeEntityList8.add(yanPanEntityList.get(i));
            }
            if (i<13){
                changeEntityList13.add(yanPanEntityList.get(i));
            }
            if (i<20){
                changeEntityList20.add(yanPanEntityList.get(i));
            }
        }
        YanPanVo yanPanVo=new YanPanVo();
        BigDecimal weiLaiChange1=new BigDecimal(0);
        BigDecimal weiLaiChange2=new BigDecimal(0);
        BigDecimal weiLaiChange3=new BigDecimal(0);
        BigDecimal weiLaiChange5=new BigDecimal(0);
        BigDecimal weiLaiChange8=new BigDecimal(0);
        BigDecimal weiLaiChange13=new BigDecimal(0);
        BigDecimal weiLaiChange20=new BigDecimal(0);
        //后1天
        weiLaiChange1=changeEntityList1.get(0).getRateOfChange();
        //后两天
        BigDecimal changePoints2=new BigDecimal(0);
        for (int i=0;i<changeEntityList2.size();i++){
            changePoints2=changePoints2.add(changeEntityList2.get(i).getChangePoints());
        }
        weiLaiChange2=(changePoints2.divide(changeEntityList2.get(changeEntityList2.size()-1).getLclosePrice(),4, RoundingMode.HALF_UP)).multiply(new BigDecimal(100));
        //后三天
        BigDecimal changePoints3=new BigDecimal(0);
        for (int i=0;i<changeEntityList3.size();i++){
            changePoints3=changePoints3.add(changeEntityList3.get(i).getChangePoints());
        }
        weiLaiChange3=(changePoints3.divide(changeEntityList3.get(changeEntityList3.size()-1).getLclosePrice(),4, RoundingMode.HALF_UP)).multiply(new BigDecimal(100));
        //后五天
        BigDecimal changePoints5=new BigDecimal(0);
        for (int i=0;i<changeEntityList5.size();i++){
            changePoints5=changePoints5.add(changeEntityList5.get(i).getChangePoints());
        }
        weiLaiChange5=(changePoints5.divide(changeEntityList5.get(changeEntityList5.size()-1).getLclosePrice(),4, RoundingMode.HALF_UP)).multiply(new BigDecimal(100));
        //后8天
        BigDecimal changePoints8=new BigDecimal(0);
        for (int i=0;i<changeEntityList8.size();i++){
            changePoints8=changePoints8.add(changeEntityList8.get(i).getChangePoints());
        }
        weiLaiChange8=(changePoints8.divide(changeEntityList8.get(changeEntityList8.size()-1).getLclosePrice(),4, RoundingMode.HALF_UP)).multiply(new BigDecimal(100));
        //后13天
        BigDecimal changePoints13=new BigDecimal(0);
        for (int i=0;i<changeEntityList13.size();i++){
            changePoints13=changePoints13.add(changeEntityList13.get(i).getChangePoints());
        }
        weiLaiChange13=(changePoints13.divide(changeEntityList13.get(changeEntityList13.size()-1).getLclosePrice(),4, RoundingMode.HALF_UP)).multiply(new BigDecimal(100));
        //后20天
        BigDecimal changePoints20=new BigDecimal(0);
        for (int i=0;i<changeEntityList20.size();i++){
            changePoints20=changePoints20.add(changeEntityList20.get(i).getChangePoints());
        }
        weiLaiChange20=(changePoints20.divide(changeEntityList20.get(changeEntityList20.size()-1).getLclosePrice(),4, RoundingMode.HALF_UP)).multiply(new BigDecimal(100));
        yanPanVo.setWeiLaiChange1(weiLaiChange1);
        yanPanVo.setWeiLaiChange2(weiLaiChange2);
        yanPanVo.setWeiLaiChange3(weiLaiChange3);
        yanPanVo.setWeiLaiChange5(weiLaiChange5);
        yanPanVo.setWeiLaiChange8(weiLaiChange8);
        yanPanVo.setWeiLaiChange13(weiLaiChange13);
        yanPanVo.setWeiLaiChange20(weiLaiChange20);
        return yanPanVo;
    }
}
