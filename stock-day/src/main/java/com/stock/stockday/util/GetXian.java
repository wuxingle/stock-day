package com.stock.stockday.util;

import com.stock.apicommon.vo.CengDieVo;
import com.stock.apicommon.vo.PingQiVo;
import com.stock.apicommon.vo.SunVo;
import com.stock.apicommon.vo.WuYunVo;
import com.stock.apicommon.vo.XianVo;

public class GetXian {
    public static XianVo getXian(PingQiVo pingQiVo, SunVo sunVo, WuYunVo wuYunVo, CengDieVo cengDieVo) {
        XianVo xianVo = new XianVo();
        StringBuffer str2 = new StringBuffer();
        StringBuffer str3 = new StringBuffer();
        StringBuffer str4 = new StringBuffer();
        StringBuffer str5 = new StringBuffer();
        StringBuffer strduo = new StringBuffer();
        if (pingQiVo.getPingDi2() != null) {
            str2.append(pingQiVo.getPingDi2());
        }
        if (pingQiVo.getPingDing2() != null) {
            str2.append(pingQiVo.getPingDing2());
        }
        if (pingQiVo.getPingDi3() != null) {
            str3.append(pingQiVo.getPingDi3());
        }
        if (pingQiVo.getPingDing3() != null) {
            str3.append(pingQiVo.getPingDing3());
        }
        if (pingQiVo.getPingDi4() != null) {
            str4.append(pingQiVo.getPingDi4());
        }
        if (pingQiVo.getPingDing4() != null) {
            str4.append(pingQiVo.getPingDing4());
        }
        if (pingQiVo.getPingDi5() != null) {
            strduo.append(pingQiVo.getPingDi5());
        }
        if (pingQiVo.getPingDing5() != null) {
            strduo.append(pingQiVo.getPingDing5());
        }
        if (sunVo.getMuzi()!=null){
            str2.append(sunVo.getMuzi());
        }
        if (sunVo.getMuzi()!=null){
            str2.append(sunVo.getMuzi());
        }
        if (sunVo.getQingKongWanLi()!=null){
            str2.append(sunVo.getQingKongWanLi());
        }
        if (sunVo.getGuangTouChuanYun()!=null){
            str2.append(sunVo.getGuangTouChuanYun());
        }
        if (sunVo.getShuGuangChuXian()!=null){
            str2.append(sunVo.getShuGuangChuXian());
        }
        if (sunVo.getYangGuangPuZhao()!=null){
            str2.append(sunVo.getYangGuangPuZhao());
        }
        if (sunVo.getBinPaiHong()!=null){
            str3.append(sunVo.getBinPaiHong());
        }
        if (sunVo.getLiangGeTaiYang()!=null){
            str3.append(sunVo.getLiangGeTaiYang());
        }
        if (sunVo.getLiangYinJiaYang()!=null){
            str3.append(sunVo.getLiangYinJiaYang());
        }
        if (sunVo.getShangShenSanLieYang()!=null){
            str4.append(sunVo.getShangShenSanLieYang());
        }
        if (sunVo.getHongSanBing()!=null){
            str4.append(sunVo.getHongSanBing());
        }
        if (sunVo.getSanGeTaiYang()!=null){
            str4.append(sunVo.getSanGeTaiYang());
        }
        if (sunVo.getJiuDingShengTian()!=null){
            strduo.append(sunVo.getJiuDingShengTian());
        }
        if (wuYunVo.getWuYunGaiDing()!=null){
            str2.append(wuYunVo.getWuYunGaiDing());
        }
        if (wuYunVo.getTanYouFanGong()!=null){
            str2.append(wuYunVo.getTanYouFanGong());
        }
        if (wuYunVo.getQingPengDaYu()!=null){
            str2.append(wuYunVo.getQingPengDaYu());
        }
        if (wuYunVo.getChuangTouPoJiao()!=null){
            str2.append(wuYunVo.getChuangTouPoJiao());
        }
        if (wuYunVo.getBinPaiLv()!=null){
            str3.append(wuYunVo.getBinPaiLv());
        }
        if (wuYunVo.getSuangFeiWuYa()!=null){
            str3.append(wuYunVo.getSuangFeiWuYa());
        }
        if (wuYunVo.getLiangYangJiaYin()!=null){
            str4.append(wuYunVo.getLiangYangJiaYin());
        }
        if (wuYunVo.getShanFeiWuYa()!=null){
            str4.append(wuYunVo.getShanFeiWuYa());
        }
        if (wuYunVo.getXiaDieShanLianYing()!=null){
            str4.append(wuYunVo.getXiaDieShanLianYing());
        }
        if (wuYunVo.getHeiShanBing()!=null){
            str4.append(wuYunVo.getHeiShanBing());
        }
        if (cengDieVo.getDuoFangPao()!=null){
            str5.append(cengDieVo.getDuoFangPao());
        }
        if (cengDieVo.getKongFangPao()!=null){
            str5.append(cengDieVo.getKongFangPao());
        }
        xianVo.setLiangri(str2.toString());
        xianVo.setSanri(str3.toString());
        xianVo.setSiri(str4.toString());
        xianVo.setWuri(str5.toString());
        xianVo.setDuori(strduo.toString());
        return xianVo;
    }
}
