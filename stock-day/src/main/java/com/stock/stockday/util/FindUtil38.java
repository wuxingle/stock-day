package com.stock.stockday.util;

import com.stock.apicommon.entity.CengDieEntity;
import com.stock.apicommon.entity.ChangeEntity;
import com.stock.apicommon.entity.ScienceEntity;
import com.stock.apicommon.entity.SunEntity;
import com.stock.apicommon.utils.KDJUtil;
import com.stock.apicommon.utils.MACDUtil;
import com.stock.apicommon.utils.patterning.StackUtil;
import com.stock.apicommon.utils.patterning.SunUtil;
import com.stock.apicommon.vo.CengDieVo;
import com.stock.apicommon.vo.KDJScienceVo;
import com.stock.apicommon.vo.MACDScienceVo;
import com.stock.apicommon.vo.SunVo;
import com.stock.stockday.entity.StockDayAll;
import org.springframework.beans.BeanUtils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class FindUtil38 {

    public static boolean duoTuXiangShangDapan2(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        if (scienceEntityList.get(0).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa10() == null || scienceEntityList.get(2).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa10() == null) {
            return false;
        }
        try {
            List<SunEntity> sunEntityList = new ArrayList<>();
            for (StockDayAll stockDayAll : stockDayAllList) {
                SunEntity sunEntity = new SunEntity();
                BeanUtils.copyProperties(stockDayAll, sunEntity);
                sunEntityList.add(sunEntity);
            }
            SunVo sunVo = SunUtil.getSun(sunEntityList);
            List<CengDieEntity> cengDieEntityList = new ArrayList<>();
            for (StockDayAll stockDayAll : stockDayAllList) {
                CengDieEntity cengDieEntity = new CengDieEntity();
                BeanUtils.copyProperties(stockDayAll, cengDieEntity);
                cengDieEntityList.add(cengDieEntity);
            }
            CengDieVo cengDieVo = StackUtil.getcengdie(cengDieEntityList);
            List<ChangeEntity> changeEntityList = new ArrayList<>();
            for (StockDayAll stockDayAll : stockDayAllList) {
                ChangeEntity changeEntity = new ChangeEntity();
                BeanUtils.copyProperties(stockDayAll, changeEntity);
                changeEntityList.add(changeEntity);
            }
            KDJScienceVo kdjScienceVo = KDJUtil.getKDJScience1(scienceEntityList, changeEntityList);
            MACDScienceVo macdScienceVo = MACDUtil.getMACDScience1(scienceEntityList);
            if ((sunVo != null && (sunVo.getShangShenSanLieYang() != null || sunVo.getHongSanBing() != null || sunVo.getSanGeTaiYang() != null || sunVo.getBinPaiHong() != null))) {
                if (kdjScienceVo.getJincha() != null || kdjScienceVo.getXiangshang80() != null || kdjScienceVo.getJincha80() != null || (kdjScienceVo.getKdjzhuhe().contains("20下钝化") || kdjScienceVo.getKdjzhuhe().contains("20下背离")) || kdjScienceVo.getXiangshang20() != null || kdjScienceVo.getJincha20() != null) {
                    if (macdScienceVo.getShangchuan0zhou() != null || macdScienceVo.getZhoufujinjincha() != null || macdScienceVo.getZhouxiajincha() != null || macdScienceVo.getZhoushangjincha() != null || macdScienceVo.getZhouxiaxiangshang() != null || macdScienceVo.getZhoushnagxiangshang() != null) {
                        if (cengDieVo != null && cengDieVo.getDuoFangPao() != null) {
                            return true;
                        }
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }

        return false;
    }

    public static boolean shengVDapan2(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        if (scienceEntityList.get(0).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa10() == null || scienceEntityList.get(2).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa10() == null) {
            return false;
        }
        try {
            List<SunEntity> sunEntityList = new ArrayList<>();
            for (StockDayAll stockDayAll : stockDayAllList) {
                SunEntity sunEntity = new SunEntity();
                BeanUtils.copyProperties(stockDayAll, sunEntity);
                sunEntityList.add(sunEntity);
            }
            SunVo sunVo = SunUtil.getSun(sunEntityList);
            List<CengDieEntity> cengDieEntityList = new ArrayList<>();
            for (StockDayAll stockDayAll : stockDayAllList) {
                CengDieEntity cengDieEntity = new CengDieEntity();
                BeanUtils.copyProperties(stockDayAll, cengDieEntity);
                cengDieEntityList.add(cengDieEntity);
            }
            CengDieVo cengDieVo = StackUtil.getcengdie(cengDieEntityList);
            List<ChangeEntity> changeEntityList = new ArrayList<>();
            for (StockDayAll stockDayAll : stockDayAllList) {
                ChangeEntity changeEntity = new ChangeEntity();
                BeanUtils.copyProperties(stockDayAll, changeEntity);
                changeEntityList.add(changeEntity);
            }
            KDJScienceVo kdjScienceVo = KDJUtil.getKDJScience1(scienceEntityList, changeEntityList);
            MACDScienceVo macdScienceVo = MACDUtil.getMACDScience1(scienceEntityList);
            if ((sunVo != null && (sunVo.getQingKongWanLi() != null || sunVo.getGuangTouChuanYun() != null || sunVo.getShuGuangChuXian() != null || sunVo.getYangGuangPuZhao() != null || sunVo.getLiangGeTaiYang() != null || sunVo.getShangShenSanLieYang() != null || sunVo.getHongSanBing() != null || sunVo.getSanGeTaiYang() != null || sunVo.getBinPaiHong() != null))) {
                if (kdjScienceVo.getJincha() != null || kdjScienceVo.getXiangshang80() != null || kdjScienceVo.getJincha80() != null || (kdjScienceVo.getKdjzhuhe().contains("20下钝化") || kdjScienceVo.getKdjzhuhe().contains("20下背离")) || kdjScienceVo.getXiangshang20() != null || kdjScienceVo.getJincha20() != null) {
                    if (macdScienceVo.getShangchuan0zhou() != null || macdScienceVo.getZhoufujinjincha() != null || macdScienceVo.getZhouxiajincha() != null || macdScienceVo.getZhoushangjincha() != null || macdScienceVo.getZhouxiaxiangshang() != null || macdScienceVo.getZhoushnagxiangshang() != null) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean reset20Dapan2(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        if (scienceEntityList.get(0).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa10() == null || scienceEntityList.get(2).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa10() == null) {
            return false;
        }
        try {
            List<SunEntity> sunEntityList = new ArrayList<>();
            for (StockDayAll stockDayAll : stockDayAllList) {
                SunEntity sunEntity = new SunEntity();
                BeanUtils.copyProperties(stockDayAll, sunEntity);
                sunEntityList.add(sunEntity);
            }
            SunVo sunVo = SunUtil.getSun(sunEntityList);
            List<CengDieEntity> cengDieEntityList = new ArrayList<>();
            for (StockDayAll stockDayAll : stockDayAllList) {
                CengDieEntity cengDieEntity = new CengDieEntity();
                BeanUtils.copyProperties(stockDayAll, cengDieEntity);
                cengDieEntityList.add(cengDieEntity);
            }
            CengDieVo cengDieVo = StackUtil.getcengdie(cengDieEntityList);
            List<ChangeEntity> changeEntityList = new ArrayList<>();
            for (StockDayAll stockDayAll : stockDayAllList) {
                ChangeEntity changeEntity = new ChangeEntity();
                BeanUtils.copyProperties(stockDayAll, changeEntity);
                changeEntityList.add(changeEntity);
            }
            KDJScienceVo kdjScienceVo = KDJUtil.getKDJScience1(scienceEntityList, changeEntityList);
            if ((sunVo != null && (sunVo.getQingKongWanLi() != null || sunVo.getGuangTouChuanYun() != null || sunVo.getShuGuangChuXian() != null || sunVo.getYangGuangPuZhao() != null || sunVo.getLiangGeTaiYang() != null || sunVo.getShangShenSanLieYang() != null || sunVo.getHongSanBing() != null || sunVo.getSanGeTaiYang() != null || sunVo.getBinPaiHong() != null))) {
                if (kdjScienceVo.getJincha() != null || kdjScienceVo.getXiangshang80() != null || kdjScienceVo.getJincha80() != null || (kdjScienceVo.getKdjzhuhe().contains("20下钝化") || kdjScienceVo.getKdjzhuhe().contains("20下背离")) || kdjScienceVo.getXiangshang20() != null || kdjScienceVo.getJincha20() != null) {
                    if (cengDieVo != null && cengDieVo.getDuoFangPao() != null) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jieQiDapan3(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        if (scienceEntityList.get(0).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa10() == null || scienceEntityList.get(2).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa10() == null) {
            return false;
        }
        try {
            List<SunEntity> sunEntityList = new ArrayList<>();
            for (StockDayAll stockDayAll : stockDayAllList) {
                SunEntity sunEntity = new SunEntity();
                BeanUtils.copyProperties(stockDayAll, sunEntity);
                sunEntityList.add(sunEntity);
            }
            SunVo sunVo = SunUtil.getSun(sunEntityList);
            List<CengDieEntity> cengDieEntityList = new ArrayList<>();
            for (StockDayAll stockDayAll : stockDayAllList) {
                CengDieEntity cengDieEntity = new CengDieEntity();
                BeanUtils.copyProperties(stockDayAll, cengDieEntity);
                cengDieEntityList.add(cengDieEntity);
            }
            CengDieVo cengDieVo = StackUtil.getcengdie(cengDieEntityList);
            MACDScienceVo macdScienceVo = MACDUtil.getMACDScience1(scienceEntityList);
            if ((sunVo != null && (sunVo.getQingKongWanLi() != null || sunVo.getGuangTouChuanYun() != null || sunVo.getShuGuangChuXian() != null || sunVo.getYangGuangPuZhao() != null || sunVo.getLiangGeTaiYang() != null || sunVo.getShangShenSanLieYang() != null || sunVo.getHongSanBing() != null || sunVo.getSanGeTaiYang() != null || sunVo.getBinPaiHong() != null))) {
                if (macdScienceVo.getShangchuan0zhou() != null || macdScienceVo.getZhoufujinjincha() != null || macdScienceVo.getZhouxiajincha() != null || macdScienceVo.getZhoushangjincha() != null || macdScienceVo.getZhouxiaxiangshang() != null || macdScienceVo.getZhoushnagxiangshang() != null) {
                    if (cengDieVo != null && cengDieVo.getDuoFangPao() != null) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jishujieqiDapan3(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        if (scienceEntityList.get(0).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa10() == null || scienceEntityList.get(2).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa10() == null) {
            return false;
        }
        try {
            List<CengDieEntity> cengDieEntityList = new ArrayList<>();
            for (StockDayAll stockDayAll : stockDayAllList) {
                CengDieEntity cengDieEntity = new CengDieEntity();
                BeanUtils.copyProperties(stockDayAll, cengDieEntity);
                cengDieEntityList.add(cengDieEntity);
            }
            CengDieVo cengDieVo = StackUtil.getcengdie(cengDieEntityList);
            List<ChangeEntity> changeEntityList = new ArrayList<>();
            for (StockDayAll stockDayAll : stockDayAllList) {
                ChangeEntity changeEntity = new ChangeEntity();
                BeanUtils.copyProperties(stockDayAll, changeEntity);
                changeEntityList.add(changeEntity);
            }
            KDJScienceVo kdjScienceVo = KDJUtil.getKDJScience1(scienceEntityList, changeEntityList);
            MACDScienceVo macdScienceVo = MACDUtil.getMACDScience1(scienceEntityList);
            if (kdjScienceVo.getJincha() != null || kdjScienceVo.getXiangshang80() != null || kdjScienceVo.getJincha80() != null || (kdjScienceVo.getKdjzhuhe().contains("20下钝化") || kdjScienceVo.getKdjzhuhe().contains("20下背离")) || kdjScienceVo.getXiangshang20() != null || kdjScienceVo.getJincha20() != null) {
                if (macdScienceVo.getShangchuan0zhou() != null || macdScienceVo.getZhoufujinjincha() != null || macdScienceVo.getZhouxiajincha() != null || macdScienceVo.getZhoushangjincha() != null || macdScienceVo.getZhouxiaxiangshang() != null || macdScienceVo.getZhoushnagxiangshang() != null) {
                    if (cengDieVo != null && cengDieVo.getDuoFangPao() != null) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jishujieqiDapan4(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        if (scienceEntityList.get(0).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa10() == null || scienceEntityList.get(2).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa10() == null) {
            return false;
        }
        try {
            List<SunEntity> sunEntityList = new ArrayList<>();
            for (StockDayAll stockDayAll : stockDayAllList) {
                SunEntity sunEntity = new SunEntity();
                BeanUtils.copyProperties(stockDayAll, sunEntity);
                sunEntityList.add(sunEntity);
            }
            SunVo sunVo = SunUtil.getSun(sunEntityList);
            List<ChangeEntity> changeEntityList = new ArrayList<>();
            for (StockDayAll stockDayAll : stockDayAllList) {
                ChangeEntity changeEntity = new ChangeEntity();
                BeanUtils.copyProperties(stockDayAll, changeEntity);
                changeEntityList.add(changeEntity);
            }
            KDJScienceVo kdjScienceVo = KDJUtil.getKDJScience1(scienceEntityList, changeEntityList);
            if ((sunVo != null && (sunVo.getQingKongWanLi() != null || sunVo.getGuangTouChuanYun() != null || sunVo.getShuGuangChuXian() != null || sunVo.getYangGuangPuZhao() != null || sunVo.getLiangGeTaiYang() != null || sunVo.getShangShenSanLieYang() != null || sunVo.getHongSanBing() != null || sunVo.getSanGeTaiYang() != null || sunVo.getBinPaiHong() != null))) {
                if (kdjScienceVo.getJincha() != null || kdjScienceVo.getXiangshang80() != null || kdjScienceVo.getJincha80() != null || (kdjScienceVo.getKdjzhuhe().contains("20下钝化") || kdjScienceVo.getKdjzhuhe().contains("20下背离")) || kdjScienceVo.getXiangshang20() != null || kdjScienceVo.getJincha20() != null) {
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jieQiDapan4(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        if (scienceEntityList.get(0).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa10() == null || scienceEntityList.get(2).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa10() == null) {
            return false;
        }
        try {
            List<SunEntity> sunEntityList = new ArrayList<>();
            for (StockDayAll stockDayAll : stockDayAllList) {
                SunEntity sunEntity = new SunEntity();
                BeanUtils.copyProperties(stockDayAll, sunEntity);
                sunEntityList.add(sunEntity);
            }
            SunVo sunVo = SunUtil.getSun(sunEntityList);
            MACDScienceVo macdScienceVo = MACDUtil.getMACDScience1(scienceEntityList);
            if ((sunVo != null && (sunVo.getQingKongWanLi() != null || sunVo.getGuangTouChuanYun() != null || sunVo.getShuGuangChuXian() != null || sunVo.getYangGuangPuZhao() != null || sunVo.getLiangGeTaiYang() != null || sunVo.getShangShenSanLieYang() != null || sunVo.getHongSanBing() != null || sunVo.getSanGeTaiYang() != null || sunVo.getBinPaiHong() != null))) {
                if (macdScienceVo.getShangchuan0zhou() != null || macdScienceVo.getZhoufujinjincha() != null || macdScienceVo.getZhouxiajincha() != null || macdScienceVo.getZhoushangjincha() != null || macdScienceVo.getZhouxiaxiangshang() != null || macdScienceVo.getZhoushnagxiangshang() != null) {
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean duoTuXiangShangDapan3(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        if (scienceEntityList.get(0).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa10() == null || scienceEntityList.get(2).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa10() == null) {
            return false;
        }
        try {
            List<ChangeEntity> changeEntityList = new ArrayList<>();
            for (StockDayAll stockDayAll : stockDayAllList) {
                ChangeEntity changeEntity = new ChangeEntity();
                BeanUtils.copyProperties(stockDayAll, changeEntity);
                changeEntityList.add(changeEntity);
            }
            KDJScienceVo kdjScienceVo = KDJUtil.getKDJScience1(scienceEntityList, changeEntityList);
            MACDScienceVo macdScienceVo = MACDUtil.getMACDScience1(scienceEntityList);
            if (kdjScienceVo.getJincha() != null || kdjScienceVo.getXiangshang80() != null || kdjScienceVo.getJincha80() != null || (kdjScienceVo.getKdjzhuhe().contains("20下钝化") || kdjScienceVo.getKdjzhuhe().contains("20下背离")) || kdjScienceVo.getXiangshang20() != null || kdjScienceVo.getJincha20() != null) {
                if (macdScienceVo.getShangchuan0zhou() != null || macdScienceVo.getZhoufujinjincha() != null || macdScienceVo.getZhouxiajincha() != null || macdScienceVo.getZhoushangjincha() != null || macdScienceVo.getZhouxiaxiangshang() != null || macdScienceVo.getZhoushnagxiangshang() != null) {
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean shengVDapan3(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        if (scienceEntityList.get(0).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa10() == null || scienceEntityList.get(2).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa10() == null) {
            return false;
        }
        try {
            List<SunEntity> sunEntityList = new ArrayList<>();
            for (StockDayAll stockDayAll : stockDayAllList) {
                SunEntity sunEntity = new SunEntity();
                BeanUtils.copyProperties(stockDayAll, sunEntity);
                sunEntityList.add(sunEntity);
            }
            SunVo sunVo = SunUtil.getSun(sunEntityList);
            List<CengDieEntity> cengDieEntityList = new ArrayList<>();
            for (StockDayAll stockDayAll : stockDayAllList) {
                CengDieEntity cengDieEntity = new CengDieEntity();
                BeanUtils.copyProperties(stockDayAll, cengDieEntity);
                cengDieEntityList.add(cengDieEntity);
            }
            CengDieVo cengDieVo = StackUtil.getcengdie(cengDieEntityList);
            if ((sunVo != null && (sunVo.getQingKongWanLi() != null || sunVo.getGuangTouChuanYun() != null || sunVo.getShuGuangChuXian() != null || sunVo.getYangGuangPuZhao() != null || sunVo.getLiangGeTaiYang() != null || sunVo.getShangShenSanLieYang() != null || sunVo.getHongSanBing() != null || sunVo.getSanGeTaiYang() != null || sunVo.getBinPaiHong() != null))) {
                if (cengDieVo != null && cengDieVo.getDuoFangPao() != null) {
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean reset20Dapan3(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        if (scienceEntityList.get(0).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa10() == null || scienceEntityList.get(2).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa10() == null) {
            return false;
        }
        try {
            List<CengDieEntity> cengDieEntityList = new ArrayList<>();
            for (StockDayAll stockDayAll : stockDayAllList) {
                CengDieEntity cengDieEntity = new CengDieEntity();
                BeanUtils.copyProperties(stockDayAll, cengDieEntity);
                cengDieEntityList.add(cengDieEntity);
            }
            CengDieVo cengDieVo = StackUtil.getcengdie(cengDieEntityList);

            MACDScienceVo macdScienceVo = MACDUtil.getMACDScience1(scienceEntityList);
            if (macdScienceVo.getShangchuan0zhou() != null || macdScienceVo.getZhoufujinjincha() != null || macdScienceVo.getZhouxiajincha() != null || macdScienceVo.getZhoushangjincha() != null || macdScienceVo.getZhouxiaxiangshang() != null || macdScienceVo.getZhoushnagxiangshang() != null) {
                if (cengDieVo != null && cengDieVo.getDuoFangPao() != null) {
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jieQiDapan5(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        if (scienceEntityList.get(0).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa10() == null || scienceEntityList.get(2).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa10() == null) {
            return false;
        }
        try {
            List<SunEntity> sunEntityList = new ArrayList<>();
            for (StockDayAll stockDayAll : stockDayAllList) {
                SunEntity sunEntity = new SunEntity();
                BeanUtils.copyProperties(stockDayAll, sunEntity);
                sunEntityList.add(sunEntity);
            }
            SunVo sunVo = SunUtil.getSun(sunEntityList);
            List<CengDieEntity> cengDieEntityList = new ArrayList<>();
            for (StockDayAll stockDayAll : stockDayAllList) {
                CengDieEntity cengDieEntity = new CengDieEntity();
                BeanUtils.copyProperties(stockDayAll, cengDieEntity);
                cengDieEntityList.add(cengDieEntity);
            }
            CengDieVo cengDieVo = StackUtil.getcengdie(cengDieEntityList);
            List<ChangeEntity> changeEntityList = new ArrayList<>();
            for (StockDayAll stockDayAll : stockDayAllList) {
                ChangeEntity changeEntity = new ChangeEntity();
                BeanUtils.copyProperties(stockDayAll, changeEntity);
                changeEntityList.add(changeEntity);
            }
            KDJScienceVo kdjScienceVo = KDJUtil.getKDJScience1(scienceEntityList, changeEntityList);
            MACDScienceVo macdScienceVo = MACDUtil.getMACDScience1(scienceEntityList);
            if (kdjScienceVo.getJincha() != null || kdjScienceVo.getXiangshang80() != null || kdjScienceVo.getJincha80() != null || (kdjScienceVo.getKdjzhuhe().contains("20下钝化") || kdjScienceVo.getKdjzhuhe().contains("20下背离")) || kdjScienceVo.getXiangshang20() != null || kdjScienceVo.getJincha20() != null) {
                if (cengDieVo != null && cengDieVo.getDuoFangPao() != null) {
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jishujieqiDapan5(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        if (scienceEntityList.get(0).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa10() == null || scienceEntityList.get(2).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa10() == null) {
            return false;
        }
        try {
            List<CengDieEntity> cengDieEntityList = new ArrayList<>();
            for (StockDayAll stockDayAll : stockDayAllList) {
                CengDieEntity cengDieEntity = new CengDieEntity();
                BeanUtils.copyProperties(stockDayAll, cengDieEntity);
                cengDieEntityList.add(cengDieEntity);
            }
            CengDieVo cengDieVo = StackUtil.getcengdie(cengDieEntityList);

            if (cengDieVo != null && cengDieVo.getDuoFangPao() != null) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jishujieqiDapan6(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        if (scienceEntityList.get(0).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa10() == null || scienceEntityList.get(2).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa10() == null) {
            return false;
        }
        try {
            MACDScienceVo macdScienceVo = MACDUtil.getMACDScience1(scienceEntityList);
            if (macdScienceVo.getShangchuan0zhou() != null || macdScienceVo.getZhoufujinjincha() != null || macdScienceVo.getZhouxiajincha() != null || macdScienceVo.getZhoushangjincha() != null || macdScienceVo.getZhouxiaxiangshang() != null || macdScienceVo.getZhoushnagxiangshang() != null) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jishujieqiDapan7(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        if (scienceEntityList.get(0).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa10() == null || scienceEntityList.get(2).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa10() == null) {
            return false;
        }
        try {
            List<ChangeEntity> changeEntityList = new ArrayList<>();
            for (StockDayAll stockDayAll : stockDayAllList) {
                ChangeEntity changeEntity = new ChangeEntity();
                BeanUtils.copyProperties(stockDayAll, changeEntity);
                changeEntityList.add(changeEntity);
            }
            KDJScienceVo kdjScienceVo = KDJUtil.getKDJScience1(scienceEntityList, changeEntityList);
            if (kdjScienceVo.getJincha() != null || kdjScienceVo.getXiangshang80() != null || kdjScienceVo.getJincha80() != null || (kdjScienceVo.getKdjzhuhe().contains("20下钝化") || kdjScienceVo.getKdjzhuhe().contains("20下背离")) || kdjScienceVo.getXiangshang20() != null || kdjScienceVo.getJincha20() != null) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean duoTuXiangShangDapan4(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        if (scienceEntityList.get(0).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa10() == null || scienceEntityList.get(2).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa10() == null) {
            return false;
        }
        try {
            List<SunEntity> sunEntityList = new ArrayList<>();
            for (StockDayAll stockDayAll : stockDayAllList) {
                SunEntity sunEntity = new SunEntity();
                BeanUtils.copyProperties(stockDayAll, sunEntity);
                sunEntityList.add(sunEntity);
            }
            SunVo sunVo = SunUtil.getSun(sunEntityList);
            if ((sunVo != null && (sunVo.getQingKongWanLi() != null || sunVo.getGuangTouChuanYun() != null || sunVo.getShuGuangChuXian() != null || sunVo.getYangGuangPuZhao() != null || sunVo.getLiangGeTaiYang() != null || sunVo.getShangShenSanLieYang() != null || sunVo.getHongSanBing() != null || sunVo.getSanGeTaiYang() != null || sunVo.getBinPaiHong() != null))) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean shengVDapan4(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        if (scienceEntityList.get(0).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa10() == null || scienceEntityList.get(2).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa10() == null) {
            return false;
        }
        try {
            List<SunEntity> sunEntityList = new ArrayList<>();
            for (StockDayAll stockDayAll : stockDayAllList) {
                SunEntity sunEntity = new SunEntity();
                BeanUtils.copyProperties(stockDayAll, sunEntity);
                sunEntityList.add(sunEntity);
            }
            SunVo sunVo = SunUtil.getSun(sunEntityList);
            List<ChangeEntity> changeEntityList = new ArrayList<>();
            for (StockDayAll stockDayAll : stockDayAllList) {
                ChangeEntity changeEntity = new ChangeEntity();
                BeanUtils.copyProperties(stockDayAll, changeEntity);
                changeEntityList.add(changeEntity);
            }
            KDJScienceVo kdjScienceVo = KDJUtil.getKDJScience1(scienceEntityList, changeEntityList);
            MACDScienceVo macdScienceVo = MACDUtil.getMACDScience1(scienceEntityList);
            if ((sunVo != null && (sunVo.getQingKongWanLi() != null || sunVo.getGuangTouChuanYun() != null || sunVo.getShuGuangChuXian() != null || sunVo.getYangGuangPuZhao() != null || sunVo.getLiangGeTaiYang() != null))) {
                if (kdjScienceVo.getJincha() != null) {
                    if (macdScienceVo.getShangchuan0zhou() != null) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean reset20Dapan4(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        if (scienceEntityList.get(0).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa10() == null || scienceEntityList.get(2).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa10() == null) {
            return false;
        }
        try {
            List<SunEntity> sunEntityList = new ArrayList<>();
            for (StockDayAll stockDayAll : stockDayAllList) {
                SunEntity sunEntity = new SunEntity();
                BeanUtils.copyProperties(stockDayAll, sunEntity);
                sunEntityList.add(sunEntity);
            }
            SunVo sunVo = SunUtil.getSun(sunEntityList);
            List<ChangeEntity> changeEntityList = new ArrayList<>();
            for (StockDayAll stockDayAll : stockDayAllList) {
                ChangeEntity changeEntity = new ChangeEntity();
                BeanUtils.copyProperties(stockDayAll, changeEntity);
                changeEntityList.add(changeEntity);
            }
            KDJScienceVo kdjScienceVo = KDJUtil.getKDJScience1(scienceEntityList, changeEntityList);
            MACDScienceVo macdScienceVo = MACDUtil.getMACDScience1(scienceEntityList);
            if ((sunVo != null && (sunVo.getQingKongWanLi() != null || sunVo.getGuangTouChuanYun() != null || sunVo.getShuGuangChuXian() != null || sunVo.getYangGuangPuZhao() != null || sunVo.getLiangGeTaiYang() != null))) {
                if (kdjScienceVo.getJincha() != null) {
                    if (macdScienceVo.getZhoufujinjincha() != null) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jieQiDapan6(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        if (scienceEntityList.get(0).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa10() == null || scienceEntityList.get(2).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa10() == null) {
            return false;
        }
        try {
            List<SunEntity> sunEntityList = new ArrayList<>();
            for (StockDayAll stockDayAll : stockDayAllList) {
                SunEntity sunEntity = new SunEntity();
                BeanUtils.copyProperties(stockDayAll, sunEntity);
                sunEntityList.add(sunEntity);
            }
            SunVo sunVo = SunUtil.getSun(sunEntityList);
            List<ChangeEntity> changeEntityList = new ArrayList<>();
            for (StockDayAll stockDayAll : stockDayAllList) {
                ChangeEntity changeEntity = new ChangeEntity();
                BeanUtils.copyProperties(stockDayAll, changeEntity);
                changeEntityList.add(changeEntity);
            }
            KDJScienceVo kdjScienceVo = KDJUtil.getKDJScience1(scienceEntityList, changeEntityList);
            MACDScienceVo macdScienceVo = MACDUtil.getMACDScience1(scienceEntityList);
            if ((sunVo != null && (sunVo.getQingKongWanLi() != null || sunVo.getGuangTouChuanYun() != null || sunVo.getShuGuangChuXian() != null || sunVo.getYangGuangPuZhao() != null || sunVo.getLiangGeTaiYang() != null))) {
                if (kdjScienceVo.getJincha() != null) {
                    if (macdScienceVo.getZhouxiajincha() != null) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jishujieqiDapan8(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        if (scienceEntityList.get(0).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa10() == null || scienceEntityList.get(2).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa10() == null) {
            return false;
        }
        try {
            List<SunEntity> sunEntityList = new ArrayList<>();
            for (StockDayAll stockDayAll : stockDayAllList) {
                SunEntity sunEntity = new SunEntity();
                BeanUtils.copyProperties(stockDayAll, sunEntity);
                sunEntityList.add(sunEntity);
            }
            SunVo sunVo = SunUtil.getSun(sunEntityList);
            List<ChangeEntity> changeEntityList = new ArrayList<>();
            for (StockDayAll stockDayAll : stockDayAllList) {
                ChangeEntity changeEntity = new ChangeEntity();
                BeanUtils.copyProperties(stockDayAll, changeEntity);
                changeEntityList.add(changeEntity);
            }
            KDJScienceVo kdjScienceVo = KDJUtil.getKDJScience1(scienceEntityList, changeEntityList);
            MACDScienceVo macdScienceVo = MACDUtil.getMACDScience1(scienceEntityList);
            if ((sunVo != null && (sunVo.getQingKongWanLi() != null || sunVo.getGuangTouChuanYun() != null || sunVo.getShuGuangChuXian() != null || sunVo.getYangGuangPuZhao() != null || sunVo.getLiangGeTaiYang() != null))) {
                if (kdjScienceVo.getJincha() != null) {
                    if (macdScienceVo.getZhoushangjincha() != null) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jishujieqiDapan9(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        if (scienceEntityList.get(0).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa10() == null || scienceEntityList.get(2).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa10() == null) {
            return false;
        }
        try {
            List<SunEntity> sunEntityList = new ArrayList<>();
            for (StockDayAll stockDayAll : stockDayAllList) {
                SunEntity sunEntity = new SunEntity();
                BeanUtils.copyProperties(stockDayAll, sunEntity);
                sunEntityList.add(sunEntity);
            }
            SunVo sunVo = SunUtil.getSun(sunEntityList);
            List<ChangeEntity> changeEntityList = new ArrayList<>();
            for (StockDayAll stockDayAll : stockDayAllList) {
                ChangeEntity changeEntity = new ChangeEntity();
                BeanUtils.copyProperties(stockDayAll, changeEntity);
                changeEntityList.add(changeEntity);
            }
            KDJScienceVo kdjScienceVo = KDJUtil.getKDJScience1(scienceEntityList, changeEntityList);
            MACDScienceVo macdScienceVo = MACDUtil.getMACDScience1(scienceEntityList);
            if ((sunVo != null && (sunVo.getQingKongWanLi() != null || sunVo.getGuangTouChuanYun() != null || sunVo.getShuGuangChuXian() != null || sunVo.getYangGuangPuZhao() != null || sunVo.getLiangGeTaiYang() != null))) {
                if (kdjScienceVo.getJincha() != null) {
                    if (macdScienceVo.getZhouxiaxiangshang() != null) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }


}
