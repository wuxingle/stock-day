package com.stock.stockday.util;

import com.stock.apicommon.vo.KDJScienceVo;
import com.stock.apicommon.vo.RSIScienceVo;

public class GetRSIString {
    public static String getRSIString(RSIScienceVo rsiScienceVo){
        if (rsiScienceVo.getJincha()!=null){
            return rsiScienceVo.getJincha();
        }
        if (rsiScienceVo.getSicha()!=null){
            return rsiScienceVo.getSicha();
        }
        if (rsiScienceVo.getXiangshang()!=null){
            return rsiScienceVo.getXiangshang();
        }
        if (rsiScienceVo.getXiangxia()!=null){
            return rsiScienceVo.getXiangxia();
        }
        if (rsiScienceVo.getJincha30()!=null){
            return rsiScienceVo.getJincha30();
        }
        if (rsiScienceVo.getSicha30()!=null){
            return rsiScienceVo.getSicha30();
        }
        if (rsiScienceVo.getXiangshang30()!=null){
            return rsiScienceVo.getXiangshang30();
        }
        if (rsiScienceVo.getXiangxia30()!=null){
            return rsiScienceVo.getXiangxia30();
        }
        if (rsiScienceVo.getJincha70()!=null){
            return rsiScienceVo.getJincha70();
        }
        if (rsiScienceVo.getSicha70()!=null){
            return rsiScienceVo.getSicha70();
        }
        if (rsiScienceVo.getXiangshang70()!=null){
            return rsiScienceVo.getXiangshang70();
        }
        if (rsiScienceVo.getXiangxia70()!=null){
            return rsiScienceVo.getXiangxia70();
        }
        return null;
    }
}
