package com.stock.stockday.util;

import com.stock.apicommon.vo.KDJScienceVo;
import com.stock.apicommon.vo.WRScienceVo;

public class GetWRString {
    public static String getWRString(WRScienceVo wrScienceVo){
        if (wrScienceVo.getJincha()!=null){
            return wrScienceVo.getJincha();
        }
        if (wrScienceVo.getSicha()!=null){
            return wrScienceVo.getSicha();
        }
        if (wrScienceVo.getXiangshang()!=null){
            return wrScienceVo.getXiangshang();
        }
        if (wrScienceVo.getXiangxia()!=null){
            return wrScienceVo.getXiangxia();
        }
        if (wrScienceVo.getJincha20()!=null){
            return wrScienceVo.getJincha20();
        }
        if (wrScienceVo.getSicha20()!=null){
            return wrScienceVo.getSicha20();
        }
        if (wrScienceVo.getXiangshang20()!=null){
            return wrScienceVo.getXiangshang20();
        }
        if (wrScienceVo.getXiangxia20()!=null){
            return wrScienceVo.getXiangxia20();
        }
        if (wrScienceVo.getJincha80()!=null){
            return wrScienceVo.getJincha80();
        }
        if (wrScienceVo.getSicha80()!=null){
            return wrScienceVo.getSicha80();
        }
        if (wrScienceVo.getXiangshang80()!=null){
            return wrScienceVo.getXiangshang80();
        }
        if (wrScienceVo.getXiangxia80()!=null){
            return wrScienceVo.getXiangxia80();
        }
        return null;
    }
}
