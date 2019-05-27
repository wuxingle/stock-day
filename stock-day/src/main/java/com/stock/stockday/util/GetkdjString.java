package com.stock.stockday.util;

import com.stock.apicommon.vo.KDJScienceVo;

public class GetkdjString {
    public static String getkdjString(KDJScienceVo kdjScienceVo){
        StringBuffer stringBuffer=new StringBuffer();
        if (kdjScienceVo.getJincha()!=null){
            stringBuffer.append( kdjScienceVo.getJincha());
            stringBuffer.append(",");
        }
        if (kdjScienceVo.getSicha()!=null){
            stringBuffer.append(kdjScienceVo.getSicha());
            stringBuffer.append(",");
        }
        if (kdjScienceVo.getXiangshang()!=null){
            stringBuffer.append( kdjScienceVo.getXiangshang());
            stringBuffer.append(",");
        }
        if (kdjScienceVo.getXiangxia()!=null){
            stringBuffer.append( kdjScienceVo.getXiangxia());
            stringBuffer.append(",");
        }
        if (kdjScienceVo.getJincha20()!=null){
            stringBuffer.append( kdjScienceVo.getJincha20());
            stringBuffer.append(",");
        }
        if (kdjScienceVo.getSicha20()!=null){
            stringBuffer.append(kdjScienceVo.getSicha20());
            stringBuffer.append(",");
        }
        if (kdjScienceVo.getXiangshang20()!=null){
            stringBuffer.append(kdjScienceVo.getXiangshang20());
            stringBuffer.append(",");
        }
        if (kdjScienceVo.getXiangxia20()!=null){
            stringBuffer.append(kdjScienceVo.getXiangxia20());
            stringBuffer.append(",");
        }
        if (kdjScienceVo.getJincha80()!=null){
            stringBuffer.append(kdjScienceVo.getJincha80());
            stringBuffer.append(",");
        }
        if (kdjScienceVo.getSicha80()!=null){
            stringBuffer.append(kdjScienceVo.getSicha80());
            stringBuffer.append(",");
        }
        if (kdjScienceVo.getXiangshang80()!=null){
            stringBuffer.append(kdjScienceVo.getXiangshang80());
            stringBuffer.append(",");
        }
        if (kdjScienceVo.getXiangxia80()!=null){
            stringBuffer.append(kdjScienceVo.getXiangxia80());
            stringBuffer.append(",");
        }
        if (kdjScienceVo.getKdjzhuhe()!=null){
            stringBuffer.append(kdjScienceVo.getKdjzhuhe());
        }
        return stringBuffer.toString();
    }
}
