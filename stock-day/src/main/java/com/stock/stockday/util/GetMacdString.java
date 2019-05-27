package com.stock.stockday.util;

import com.stock.apicommon.vo.KDJScienceVo;
import com.stock.apicommon.vo.MACDScienceVo;

public class GetMacdString {
    public static String getMacdString(MACDScienceVo macdScienceVo){
        if (macdScienceVo.getZhoufujinjincha()!=null){
            return macdScienceVo.getZhoufujinjincha();
        }
        if (macdScienceVo.getShangchuan0zhou()!=null){
            return macdScienceVo.getShangchuan0zhou();
        }
        if (macdScienceVo.getXiachuan0zhou()!=null){
            return macdScienceVo.getXiachuan0zhou();
        }
        if (macdScienceVo.getZhoushangjincha()!=null){
            return macdScienceVo.getZhoushangjincha();
        }
        if (macdScienceVo.getZhoushangsicha()!=null){
            return macdScienceVo.getZhoushangsicha();
        }
        if (macdScienceVo.getZhoushnagxiangshang()!=null){
            return macdScienceVo.getZhoushnagxiangshang();
        }
        if (macdScienceVo.getZhoushangxiangxia()!=null){
            return macdScienceVo.getZhoushangxiangxia();
        }
        if (macdScienceVo.getZhouxiajincha()!=null){
            return macdScienceVo.getZhouxiajincha();
        }
        if (macdScienceVo.getZhouxiasicha()!=null){
            return macdScienceVo.getZhouxiasicha();
        }
        if (macdScienceVo.getZhouxiaxiangshang()!=null){
            return macdScienceVo.getZhouxiaxiangshang();
        }
        if (macdScienceVo.getZhouxiaxiangxia()!=null){
            return macdScienceVo.getZhouxiaxiangxia();
        }

        return null;
    }
}
