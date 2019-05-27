package com.stock.apicommon.utils.patterning;

import com.stock.apicommon.Constants;
import com.stock.apicommon.entity.CengDieEntity;
import com.stock.apicommon.vo.CengDieVo;

import java.math.BigDecimal;
import java.util.List;

/**
 * 层叠系
 */
public class StackUtil {

    public static CengDieVo getcengdie(List<CengDieEntity> cengDieEntityList){
        if (cengDieEntityList==null||cengDieEntityList.size()==0){
            return null;
        }
        CengDieVo cengDieVo=new CengDieVo();
        if (cengDieEntityList.get(0).getClosingPrice().compareTo(cengDieEntityList.get(0).getOpeningPrice())>=0){//阳线
            if (cengDieEntityList.get(0).getTopside().compareTo(cengDieEntityList.get(1).getTopside())>0||cengDieEntityList.get(0).getClosingPrice().compareTo(cengDieEntityList.get(1).getTopside())>0){
                if (cengDieEntityList.get(0).getClosingPrice().compareTo(cengDieEntityList.get(2).getClosingPrice())>0) {
                    if (cengDieEntityList.get(1).getClosingPrice().compareTo(cengDieEntityList.get(1).getOpeningPrice()) <=0) {//阴线
                        if (cengDieEntityList.get(2).getClosingPrice().compareTo(cengDieEntityList.get(2).getOpeningPrice())>=0) {//阳线
                            if (cengDieEntityList.get(2).getTopside().compareTo(cengDieEntityList.get(3).getTopside())>0||cengDieEntityList.get(2).getClosingPrice().compareTo(cengDieEntityList.get(3).getTopside())>0){
                                if (cengDieEntityList.get(2).getClosingPrice().compareTo(cengDieEntityList.get(4).getClosingPrice())>=0) {
                                    if (cengDieEntityList.get(3).getClosingPrice().compareTo(cengDieEntityList.get(3).getOpeningPrice()) <= 0) {//阴线
                                        if (cengDieEntityList.get(4).getClosingPrice().compareTo(cengDieEntityList.get(4).getOpeningPrice())>0&&cengDieEntityList.get(4).getRateOfChange().compareTo(new BigDecimal(0))>0) {//阳线
                                            //层叠多方炮
                                            cengDieVo.setDuoFangPao(Constants.DUOFANGPAO);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        //层叠空方炮
        if (cengDieEntityList.get(0).getClosingPrice().compareTo(cengDieEntityList.get(0).getOpeningPrice())<=0){//阴线
            if (cengDieEntityList.get(0).getFoot().compareTo(cengDieEntityList.get(1).getFoot())<0||cengDieEntityList.get(0).getClosingPrice().compareTo(cengDieEntityList.get(1).getFoot())<0){
                if (cengDieEntityList.get(0).getClosingPrice().compareTo(cengDieEntityList.get(2).getClosingPrice())<=0) {
                    if (cengDieEntityList.get(1).getClosingPrice().compareTo(cengDieEntityList.get(1).getOpeningPrice()) >= 0) {//阳线
                        if (cengDieEntityList.get(2).getClosingPrice().compareTo(cengDieEntityList.get(2).getOpeningPrice())<=0) {//阴线
                            if (cengDieEntityList.get(2).getFoot().compareTo(cengDieEntityList.get(3).getFoot())<0||cengDieEntityList.get(2).getClosingPrice().compareTo(cengDieEntityList.get(3).getFoot())<0){
                                if (cengDieEntityList.get(2).getClosingPrice().compareTo(cengDieEntityList.get(4).getClosingPrice())<=0) {
                                    if (cengDieEntityList.get(3).getClosingPrice().compareTo(cengDieEntityList.get(3).getOpeningPrice()) >= 0) {//阳线
                                        if (cengDieEntityList.get(4).getClosingPrice().compareTo(cengDieEntityList.get(4).getOpeningPrice())<0&&cengDieEntityList.get(4).getRateOfChange().compareTo(new BigDecimal(0))<0) {//阴线
                                            //层叠多方炮
                                            cengDieVo.setKongFangPao(Constants.KONGFANGPAO);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return cengDieVo;
    }


}
