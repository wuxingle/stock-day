package com.stock.stockday.util;

import com.stock.apicommon.vo.DangRiVo;
import com.stock.apicommon.vo.YirichuanVo;

public class GetYiRiXian {
    public static String getYiRiXian(DangRiVo dangRiVo, YirichuanVo yirichuanVo) {
        if (dangRiVo==null&&yirichuanVo==null){
            return null;
        }
        StringBuffer str=new StringBuffer();
        if (dangRiVo.getShangyingxian100() != null) {
            str.append(dangRiVo.getShangyingxian100());
        }
        if (dangRiVo.getShangyingxian20() != null) {
            str.append(dangRiVo.getShangyingxian20());
        }
        if (dangRiVo.getShangyingxian10() != null) {
            str.append(dangRiVo.getShangyingxian10());
        }
        if (dangRiVo.getShangyingxian3() != null) {
            str.append(dangRiVo.getShangyingxian3());
        }
        if (dangRiVo.getShangyingxian1() != null) {
            str.append(dangRiVo.getShangyingxian1());
        }
        if (dangRiVo.getShangyingxian0_5() != null) {
            str.append(dangRiVo.getShangyingxian0_5());
        }
        if (dangRiVo.getShangyingxian0() != null) {
            str.append(dangRiVo.getShangyingxian0());
        }
        if (dangRiVo.getXiayingxian100() != null) {
            str.append(dangRiVo.getXiayingxian100());
        }
        if (dangRiVo.getXiayingxian20() != null) {
            str.append(dangRiVo.getXiayingxian20());
        }
        if (dangRiVo.getXiayingxian10() != null) {
            str.append(dangRiVo.getXiayingxian10());
        }
        if (dangRiVo.getXiayingxian3() != null) {
            str.append(dangRiVo.getXiayingxian3());
        }
        if (dangRiVo.getXiayingxian1() != null) {
            str.append(dangRiVo.getXiayingxian1());
        }
        if (dangRiVo.getXiayingxian0_5() != null) {
            str.append(dangRiVo.getXiayingxian0_5());
        }
        if (dangRiVo.getXiayingxian0() != null) {
            str.append(dangRiVo.getXiayingxian0());
        }
        if (dangRiVo.getShizixing50() != null) {
            str.append(dangRiVo.getShizixing50());
        }
        if (dangRiVo.getShizixing10() != null) {
            str.append(dangRiVo.getShizixing10());
        }
        if (dangRiVo.getShizixing3() != null) {
            str.append(dangRiVo.getShizixing3());
        }
        if (dangRiVo.getShizixing1() != null) {
            str.append(dangRiVo.getShizixing1());
        }
        if (dangRiVo.getShizixing0_5() != null) {
            str.append(dangRiVo.getShizixing0_5());
        }
        if (dangRiVo.getShizixing0() != null) {
            str.append(dangRiVo.getShizixing0());
        }
        if (yirichuanVo!=null) {
            if (yirichuanVo.getChushuifurong() != null) {
                str.append(yirichuanVo.getChushuifurong());
            }
            if (yirichuanVo.getDuantoucedao() != null) {
                str.append(yirichuanVo.getDuantoucedao());
            }
        }
        return str.toString();

    }

    public static String getYiRiXian1(DangRiVo dangRiVo, YirichuanVo yirichuanVo) {
        if (dangRiVo==null&&yirichuanVo==null){
            return null;
        }
        StringBuffer str=new StringBuffer();
        if (dangRiVo.getShangyingxian100() != null) {
            str.append(dangRiVo.getShangyingxian100());
        }
        if (dangRiVo.getShangyingxian20() != null) {
            str.append(dangRiVo.getShangyingxian20());
        }
        if (dangRiVo.getShangyingxian10() != null) {
            str.append(dangRiVo.getShangyingxian10());
        }
        if (dangRiVo.getShangyingxian3() != null) {
            str.append(dangRiVo.getShangyingxian3());
        }
        if (dangRiVo.getShangyingxian1() != null) {
            str.append(dangRiVo.getShangyingxian1());
        }
        if (dangRiVo.getShangyingxian0_5() != null) {
            str.append(dangRiVo.getShangyingxian0_5());
        }
        if (dangRiVo.getShangyingxian0() != null) {
            str.append(dangRiVo.getShangyingxian0());
        }
        if (dangRiVo.getXiayingxian100() != null) {
            str.append(dangRiVo.getXiayingxian100());
        }
        if (dangRiVo.getXiayingxian20() != null) {
            str.append(dangRiVo.getXiayingxian20());
        }
        if (dangRiVo.getXiayingxian10() != null) {
            str.append(dangRiVo.getXiayingxian10());
        }
        if (dangRiVo.getXiayingxian3() != null) {
            str.append(dangRiVo.getXiayingxian3());
        }
        if (dangRiVo.getXiayingxian1() != null) {
            str.append(dangRiVo.getXiayingxian1());
        }
        if (dangRiVo.getXiayingxian0_5() != null) {
            str.append(dangRiVo.getXiayingxian0_5());
        }
        if (dangRiVo.getXiayingxian0() != null) {
            str.append(dangRiVo.getXiayingxian0());
        }
        if (dangRiVo.getShizixing50() != null) {
            str.append(dangRiVo.getShizixing50());
        }
        if (dangRiVo.getShizixing10() != null) {
            str.append(dangRiVo.getShizixing10());
        }
        if (dangRiVo.getShizixing3() != null) {
            str.append(dangRiVo.getShizixing3());
        }
        if (dangRiVo.getShizixing1() != null) {
            str.append(dangRiVo.getShizixing1());
        }
        if (dangRiVo.getShizixing0_5() != null) {
            str.append(dangRiVo.getShizixing0_5());
        }
        if (dangRiVo.getShizixing0() != null) {
            str.append(dangRiVo.getShizixing0());
        }
        if (dangRiVo.getXianXing() != null) {
            str.append(dangRiVo.getXianXing() );
        }
        if (yirichuanVo!=null) {
            if (yirichuanVo.getChushuifurong() != null) {
                str.append(yirichuanVo.getChushuifurong());
            }
            if (yirichuanVo.getDuantoucedao() != null) {
                str.append(yirichuanVo.getDuantoucedao());
            }
        }
        return str.toString();

    }
}
