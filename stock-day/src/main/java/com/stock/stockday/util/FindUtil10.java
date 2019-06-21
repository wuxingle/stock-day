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

public class FindUtil10 {

    public static boolean duoTuXiangShangDapan2(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList, List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        if (scienceEntityList.get(1).getPriceMa10()==null||scienceEntityList.get(0).getPriceMa30()==null||scienceEntityList.get(0).getPriceMa20()==null||scienceEntityList.get(7).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa10() == null) {
            return false;
        }
        try{
        boolean result = shang20(stockDayAllListDaPan1,scienceEntityListDaPan);
        if (result) {
            //均线聚拢,开始多天向上
            BigDecimal li10 = (scienceEntityList.get(0).getPriceMa10().subtract(scienceEntityList.get(0).getPriceMa5())).divide(scienceEntityList.get(0).getPriceMa5(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
            BigDecimal li20 = (scienceEntityList.get(0).getPriceMa20().subtract(scienceEntityList.get(0).getPriceMa5())).divide(scienceEntityList.get(0).getPriceMa5(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
            BigDecimal li30 = (scienceEntityList.get(0).getPriceMa30().subtract(scienceEntityList.get(0).getPriceMa5())).divide(scienceEntityList.get(0).getPriceMa5(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
            if (li10.compareTo(new BigDecimal(4)) < 0 && li20.compareTo(new BigDecimal(4)) < 0 && li30.compareTo(new BigDecimal(4)) < 0 && li10.compareTo(new BigDecimal(-4)) > 0 && li20.compareTo(new BigDecimal(-4)) > 0 && li30.compareTo(new BigDecimal(-4)) > 0) {
                if (scienceEntityList.get(0).getPriceMa5().compareTo(scienceEntityList.get(1).getPriceMa5()) > 0 && scienceEntityList.get(0).getPriceMa10().compareTo(scienceEntityList.get(1).getPriceMa10()) > 0) {
                    //价格站上5天线
                    if (stockDayAllList.get(0).getClosingPrice().compareTo(scienceEntityList.get(0).getPriceMa5()) > 0 && stockDayAllList.get(0).getClosingPrice().compareTo(scienceEntityList.get(0).getPriceMa10()) > 0 && stockDayAllList.get(0).getClosingPrice().compareTo(scienceEntityList.get(0).getPriceMa20()) >= 0) {
                        //近10天有没有的涨幅
                        BigDecimal bian10 = stockDayAllList.get(0).getClosingPrice().subtract(stockDayAllList.get(10).getClosingPrice()).divide(stockDayAllList.get(10).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                        //近5天有没有的涨幅
                        BigDecimal bian5 = stockDayAllList.get(0).getClosingPrice().subtract(stockDayAllList.get(5).getClosingPrice()).divide(stockDayAllList.get(5).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                        if (bian10.compareTo(new BigDecimal(5)) < 0 && bian5.compareTo(new BigDecimal(3)) < 0) {
                            //阳线
                            if (stockDayAllList.get(0).getClosingPrice().compareTo(stockDayAllList.get(0).getOpeningPrice()) > 0) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean shengVDapan2(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList, List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        if (scienceEntityList.get(7).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa10() == null) {
            return false;
        }
        try{
        boolean result = shang20(stockDayAllListDaPan1,scienceEntityListDaPan);
        if (result) {
            //近5天大幅下降
            BigDecimal li5 = (stockDayAllList.get(0).getClosingPrice().subtract(stockDayAllList.get(5).getClosingPrice())).divide(stockDayAllList.get(5).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
            BigDecimal li10 = (stockDayAllList.get(0).getClosingPrice().subtract(stockDayAllList.get(10).getClosingPrice())).divide(stockDayAllList.get(10).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
            if (li5.compareTo(new BigDecimal(-14)) <= 0 || li10.compareTo(new BigDecimal(-20)) <= 0) {
                //昨天最低，今天出现一个阳线
                if (stockDayAllList.get(1).getClosingPrice().compareTo(stockDayAllList.get(2).getClosingPrice()) <= 0 && stockDayAllList.get(1).getClosingPrice().compareTo(stockDayAllList.get(3).getClosingPrice()) <= 0 && stockDayAllList.get(1).getClosingPrice().compareTo(stockDayAllList.get(4).getClosingPrice()) <= 0 && stockDayAllList.get(1).getClosingPrice().compareTo(stockDayAllList.get(5).getClosingPrice()) <= 0 && stockDayAllList.get(1).getClosingPrice().compareTo(stockDayAllList.get(6).getClosingPrice()) <= 0) {
                    if (stockDayAllList.get(0).getClosingPrice().compareTo(stockDayAllList.get(0).getOpeningPrice()) > 0) {
                        return true;
                    } else {
                        BigDecimal xiayin = (stockDayAllList.get(0).getClosingPrice().subtract(stockDayAllList.get(0).getFoot())).divide(stockDayAllList.get(0).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                        if (xiayin.compareTo(new BigDecimal(4)) >= 0) {
                            return true;
                        }
                    }

                }
            }
        }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean reset20Dapan2(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList, List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        if (scienceEntityList.get(1).getPriceMa30()==null||scienceEntityList.get(1).getPriceMa20()==null||scienceEntityList.get(4).getPriceMa5()==null||scienceEntityList.get(0).getPriceMa30()==null||scienceEntityList.get(0).getPriceMa20()==null||scienceEntityList.get(7).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa10() == null) {
            return false;
        }
        try{
        boolean result = shang20(stockDayAllListDaPan1,scienceEntityListDaPan);
        if (result) {
            //均线上
            BigDecimal ma30 = scienceEntityList.get(0).getPriceMa30().subtract(scienceEntityList.get(1).getPriceMa30());
            BigDecimal ma20 = scienceEntityList.get(0).getPriceMa20().subtract(scienceEntityList.get(1).getPriceMa20());
            if (ma30.compareTo(new BigDecimal(0)) >= 0 && ma20.compareTo(new BigDecimal(-0.03)) >= 0) {
                //前几天在5天线上 近5天下降
                if (stockDayAllList.get(4).getTopside().compareTo(scienceEntityList.get(4).getPriceMa5()) >= 0 || stockDayAllList.get(2).getTopside().compareTo(scienceEntityList.get(2).getPriceMa5()) >= 0) {
                    if (stockDayAllList.get(0).getClosingPrice().compareTo(stockDayAllList.get(5).getClosingPrice()) < 0) {
                        //今天接近20天线最低或者收盘
                        BigDecimal lli20 = stockDayAllList.get(0).getFoot().subtract(scienceEntityList.get(0).getPriceMa20()).divide(stockDayAllList.get(0).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                        BigDecimal cli20 = stockDayAllList.get(0).getClosingPrice().subtract(scienceEntityList.get(0).getPriceMa20()).divide(stockDayAllList.get(0).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                        BigDecimal tli20 = stockDayAllList.get(0).getTopside().subtract(scienceEntityList.get(0).getPriceMa20()).divide(stockDayAllList.get(0).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                        if ((lli20.compareTo(new BigDecimal(2.5)) < 0 && lli20.compareTo(new BigDecimal(-2.5)) > 0) || (cli20.compareTo(new BigDecimal(-4)) > 0 && cli20.compareTo(new BigDecimal(4)) < 0) || (tli20.compareTo(new BigDecimal(-2.5)) > 0 && tli20.compareTo(new BigDecimal(2.5)) < 0)) {
                            //今天阳线
                            if (stockDayAllList.get(0).getClosingPrice().compareTo(stockDayAllList.get(0).getOpeningPrice()) > 0) {
                                return true;
                            } else {
                                BigDecimal xiayin = (stockDayAllList.get(0).getClosingPrice().subtract(stockDayAllList.get(0).getFoot())).divide(stockDayAllList.get(0).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                                if (xiayin.compareTo(new BigDecimal(3)) >= 0) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jieQiDapan3(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList, List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        if (scienceEntityList.get(2).getPriceMa30()==null||scienceEntityList.get(2).getPriceMa20()==null||scienceEntityList.get(1).getPriceMa30()==null||scienceEntityList.get(1).getPriceMa20()==null||scienceEntityList.get(2).getPriceMa10()==null||scienceEntityList.get(0).getPriceMa30()==null||scienceEntityList.get(0).getPriceMa20()==null||scienceEntityList.get(7).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa10() == null) {
            return false;
        }
        try{
        boolean result = shang20(stockDayAllListDaPan1,scienceEntityListDaPan);
        if (result) {
            //获取60天最低价与最高价
            BigDecimal close = new BigDecimal(100000);
            BigDecimal top = new BigDecimal(0);
            for (StockDayAll stockDayAll : stockDayAllList) {
                if (stockDayAll.getTopside().compareTo(top) > 0) {
                    top = stockDayAll.getTopside();
                }
                if (stockDayAll.getFoot().compareTo(close) < 0) {
                    close = stockDayAll.getFoot();
                }
            }
            BigDecimal liclose = (stockDayAllList.get(0).getClosingPrice().subtract(close)).divide(stockDayAllList.get(0).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
            if (liclose.compareTo(new BigDecimal(15)) < 0) {
                //前3天均线开始聚拢
                BigDecimal li103 = (scienceEntityList.get(2).getPriceMa10().subtract(scienceEntityList.get(2).getPriceMa5())).divide(scienceEntityList.get(2).getPriceMa5(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                BigDecimal li203 = (scienceEntityList.get(2).getPriceMa20().subtract(scienceEntityList.get(2).getPriceMa5())).divide(scienceEntityList.get(2).getPriceMa5(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                BigDecimal li303 = (scienceEntityList.get(2).getPriceMa30().subtract(scienceEntityList.get(2).getPriceMa5())).divide(scienceEntityList.get(2).getPriceMa5(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                if (li103.compareTo(new BigDecimal(5)) < 0 && li203.compareTo(new BigDecimal(5)) < 0 && li303.compareTo(new BigDecimal(5)) < 0 && li103.compareTo(new BigDecimal(-5)) > 0 && li203.compareTo(new BigDecimal(-5)) > 0 && li303.compareTo(new BigDecimal(-5)) > 0) {
                    BigDecimal li100 = (scienceEntityList.get(0).getPriceMa10().subtract(scienceEntityList.get(0).getPriceMa5())).divide(scienceEntityList.get(0).getPriceMa5(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                    BigDecimal li200 = (scienceEntityList.get(0).getPriceMa20().subtract(scienceEntityList.get(0).getPriceMa5())).divide(scienceEntityList.get(0).getPriceMa5(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                    BigDecimal li300 = (scienceEntityList.get(0).getPriceMa30().subtract(scienceEntityList.get(0).getPriceMa5())).divide(scienceEntityList.get(0).getPriceMa5(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                    if (li100.compareTo(new BigDecimal(4)) < 0 && li200.compareTo(new BigDecimal(4)) < 0 && li300.compareTo(new BigDecimal(4)) < 0 && li100.compareTo(new BigDecimal(-4)) > 0 && li200.compareTo(new BigDecimal(-4)) > 0 && li300.compareTo(new BigDecimal(-4)) > 0) {
                        //今天阳线站上5天线，昨天在5天10天一下
                        if (stockDayAllList.get(1).getClosingPrice().compareTo(scienceEntityList.get(1).getPriceMa5()) < 0 || stockDayAllList.get(1).getClosingPrice().compareTo(scienceEntityList.get(1).getPriceMa10()) < 0) {
                            if (stockDayAllList.get(0).getClosingPrice().compareTo(stockDayAllList.get(0).getOpeningPrice()) >= 0) {
                                if (stockDayAllList.get(0).getClosingPrice().compareTo(scienceEntityList.get(0).getPriceMa5()) >= 0 && stockDayAllList.get(0).getClosingPrice().compareTo(scienceEntityList.get(0).getPriceMa10()) >= 0 && stockDayAllList.get(0).getClosingPrice().compareTo(scienceEntityList.get(0).getPriceMa20()) >= 0) {
                                    //均线向上
                                    if (scienceEntityList.get(0).getPriceMa5().compareTo(scienceEntityList.get(1).getPriceMa5()) > 0 && scienceEntityList.get(0).getPriceMa10().compareTo(scienceEntityList.get(1).getPriceMa10()) >= 0 && scienceEntityList.get(0).getPriceMa20().compareTo(scienceEntityList.get(1).getPriceMa20()) >= 0) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jishujieqiDapan3(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList, List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        if (scienceEntityList.get(2).getPriceMa30()==null||scienceEntityList.get(2).getPriceMa20()==null||scienceEntityList.get(1).getPriceMa30()==null||scienceEntityList.get(1).getPriceMa20()==null||scienceEntityList.get(2).getPriceMa10()==null||scienceEntityList.get(0).getPriceMa30()==null||scienceEntityList.get(0).getPriceMa20()==null||scienceEntityList.get(7).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa10() == null) {
            return false;
        }
        try{
        boolean result = shang20(stockDayAllListDaPan1,scienceEntityListDaPan);
        if (result) {
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
                    //前3天均线开始聚拢
                    BigDecimal li103 = (scienceEntityList.get(2).getPriceMa10().subtract(scienceEntityList.get(2).getPriceMa5())).divide(scienceEntityList.get(2).getPriceMa5(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                    BigDecimal li203 = (scienceEntityList.get(2).getPriceMa20().subtract(scienceEntityList.get(2).getPriceMa5())).divide(scienceEntityList.get(2).getPriceMa5(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                    BigDecimal li303 = (scienceEntityList.get(2).getPriceMa30().subtract(scienceEntityList.get(2).getPriceMa5())).divide(scienceEntityList.get(2).getPriceMa5(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                    if (li103.compareTo(new BigDecimal(5)) < 0 && li203.compareTo(new BigDecimal(5)) < 0 && li303.compareTo(new BigDecimal(5)) < 0 && li103.compareTo(new BigDecimal(-5)) > 0 && li203.compareTo(new BigDecimal(-5)) > 0 && li303.compareTo(new BigDecimal(-5)) > 0) {
                        BigDecimal li100 = (scienceEntityList.get(0).getPriceMa10().subtract(scienceEntityList.get(0).getPriceMa5())).divide(scienceEntityList.get(0).getPriceMa5(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                        BigDecimal li200 = (scienceEntityList.get(0).getPriceMa20().subtract(scienceEntityList.get(0).getPriceMa5())).divide(scienceEntityList.get(0).getPriceMa5(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                        BigDecimal li300 = (scienceEntityList.get(0).getPriceMa30().subtract(scienceEntityList.get(0).getPriceMa5())).divide(scienceEntityList.get(0).getPriceMa5(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                        if (li100.compareTo(new BigDecimal(4)) < 0 && li200.compareTo(new BigDecimal(4)) < 0 && li300.compareTo(new BigDecimal(4)) < 0 && li100.compareTo(new BigDecimal(-4)) > 0 && li200.compareTo(new BigDecimal(-4)) > 0 && li300.compareTo(new BigDecimal(-4)) > 0) {
                            //今天阳线站上5天线，昨天在5天10天一下
                            if (stockDayAllList.get(1).getClosingPrice().compareTo(scienceEntityList.get(1).getPriceMa5()) < 0 || stockDayAllList.get(1).getClosingPrice().compareTo(scienceEntityList.get(1).getPriceMa10()) < 0) {
                                if (stockDayAllList.get(0).getClosingPrice().compareTo(stockDayAllList.get(0).getOpeningPrice()) > 0) {
                                    if (stockDayAllList.get(0).getClosingPrice().compareTo(scienceEntityList.get(0).getPriceMa5()) >= 0 && stockDayAllList.get(0).getClosingPrice().compareTo(scienceEntityList.get(0).getPriceMa10()) >= 0 && stockDayAllList.get(0).getClosingPrice().compareTo(scienceEntityList.get(0).getPriceMa20()) >= 0) {
                                        //均线向上
                                        if (scienceEntityList.get(0).getPriceMa5().compareTo(scienceEntityList.get(1).getPriceMa5()) > 0 && scienceEntityList.get(0).getPriceMa10().compareTo(scienceEntityList.get(1).getPriceMa10()) >= 0 && scienceEntityList.get(0).getPriceMa20().compareTo(scienceEntityList.get(1).getPriceMa20()) >= 0) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jishujieqiDapan4(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList, List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        if (scienceEntityList.get(7).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa10() == null) {
            return false;
        }
        try{
        boolean result = shang20(stockDayAllListDaPan1,scienceEntityListDaPan);
        if (result) {
            List<ChangeEntity> changeEntityList = new ArrayList<>();
            for (StockDayAll stockDayAll : stockDayAllList) {
                ChangeEntity changeEntity = new ChangeEntity();
                BeanUtils.copyProperties(stockDayAll, changeEntity);
                changeEntityList.add(changeEntity);
            }

            KDJScienceVo kdjScienceVo = KDJUtil.getKDJScience1(scienceEntityList, changeEntityList);
            MACDScienceVo macdScienceVo = MACDUtil.getMACDScience1(scienceEntityList);
            if (kdjScienceVo.getJincha() != null || kdjScienceVo.getJincha80() != null || kdjScienceVo.getJincha20() != null) {
                if (macdScienceVo.getShangchuan0zhou() != null || macdScienceVo.getZhoufujinjincha() != null || macdScienceVo.getZhouxiajincha() != null || macdScienceVo.getZhoushangjincha() != null) {
                    //今天阳线站上5天线，昨天在5天10天一下
                    if (stockDayAllList.get(0).getClosingPrice().compareTo(stockDayAllList.get(0).getOpeningPrice()) > 0) {
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

    public static boolean jieQiDapan4(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList, List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        if (scienceEntityList.get(2).getPriceMa30()==null||scienceEntityList.get(2).getPriceMa20()==null||scienceEntityList.get(1).getPriceMa30()==null||scienceEntityList.get(1).getPriceMa20()==null||scienceEntityList.get(2).getPriceMa10()==null||scienceEntityList.get(0).getPriceMa30()==null||scienceEntityList.get(0).getPriceMa20()==null||scienceEntityList.get(7).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa10() == null) {
            return false;
        }
        try{
        boolean result = shang20(stockDayAllListDaPan1,scienceEntityListDaPan);
        if (result) {
            //获取60天最低价与最高价
            BigDecimal close = new BigDecimal(100000);
            BigDecimal top = new BigDecimal(0);
            for (StockDayAll stockDayAll : stockDayAllList) {
                if (stockDayAll.getTopside().compareTo(top) > 0) {
                    top = stockDayAll.getTopside();
                }
                if (stockDayAll.getFoot().compareTo(close) < 0) {
                    close = stockDayAll.getFoot();
                }
            }
            BigDecimal liclose = (stockDayAllList.get(0).getClosingPrice().subtract(close)).divide(stockDayAllList.get(0).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
            if (liclose.compareTo(new BigDecimal(15)) < 0) {
                //前3天均线开始聚拢
                BigDecimal li103 = (scienceEntityList.get(2).getPriceMa10().subtract(scienceEntityList.get(2).getPriceMa5())).divide(scienceEntityList.get(2).getPriceMa5(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                BigDecimal li203 = (scienceEntityList.get(2).getPriceMa20().subtract(scienceEntityList.get(2).getPriceMa5())).divide(scienceEntityList.get(2).getPriceMa5(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                BigDecimal li303 = (scienceEntityList.get(2).getPriceMa30().subtract(scienceEntityList.get(2).getPriceMa5())).divide(scienceEntityList.get(2).getPriceMa5(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                if (li103.compareTo(new BigDecimal(5)) < 0 && li203.compareTo(new BigDecimal(5)) < 0 && li303.compareTo(new BigDecimal(5)) < 0 && li103.compareTo(new BigDecimal(-5)) > 0 && li203.compareTo(new BigDecimal(-5)) > 0 && li303.compareTo(new BigDecimal(-5)) > 0) {
                    BigDecimal li100 = (scienceEntityList.get(0).getPriceMa10().subtract(scienceEntityList.get(0).getPriceMa5())).divide(scienceEntityList.get(0).getPriceMa5(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                    BigDecimal li200 = (scienceEntityList.get(0).getPriceMa20().subtract(scienceEntityList.get(0).getPriceMa5())).divide(scienceEntityList.get(0).getPriceMa5(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                    BigDecimal li300 = (scienceEntityList.get(0).getPriceMa30().subtract(scienceEntityList.get(0).getPriceMa5())).divide(scienceEntityList.get(0).getPriceMa5(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                    if (li100.compareTo(new BigDecimal(4)) < 0 && li200.compareTo(new BigDecimal(4)) < 0 && li300.compareTo(new BigDecimal(4)) < 0 && li100.compareTo(new BigDecimal(-4)) > 0 && li200.compareTo(new BigDecimal(-4)) > 0 && li300.compareTo(new BigDecimal(-4)) > 0) {
                        //今天阳线站上5天线，昨天在5天10天一下
                        if (stockDayAllList.get(1).getClosingPrice().compareTo(scienceEntityList.get(1).getPriceMa5()) < 0 || stockDayAllList.get(1).getClosingPrice().compareTo(scienceEntityList.get(1).getPriceMa10()) < 0) {
                            if (stockDayAllList.get(0).getClosingPrice().compareTo(stockDayAllList.get(0).getOpeningPrice()) >= 0) {
                                if (stockDayAllList.get(0).getClosingPrice().compareTo(scienceEntityList.get(0).getPriceMa5()) >= 0 && stockDayAllList.get(0).getClosingPrice().compareTo(scienceEntityList.get(0).getPriceMa10()) >= 0 && stockDayAllList.get(0).getClosingPrice().compareTo(scienceEntityList.get(0).getPriceMa20()) >= 0) {
                                    //均线向上
                                    if (scienceEntityList.get(0).getPriceMa5().compareTo(scienceEntityList.get(1).getPriceMa5()) > 0 && scienceEntityList.get(0).getPriceMa10().compareTo(scienceEntityList.get(1).getPriceMa10()) >= 0 && scienceEntityList.get(0).getPriceMa20().compareTo(scienceEntityList.get(1).getPriceMa20()) >= 0 && scienceEntityList.get(0).getPriceMa30().compareTo(scienceEntityList.get(1).getPriceMa30()) >= 0) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean duoTuXiangShangDapan3(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList, List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        if (scienceEntityList.get(2).getPriceMa30()==null||scienceEntityList.get(2).getPriceMa20()==null||scienceEntityList.get(1).getPriceMa30()==null||scienceEntityList.get(1).getPriceMa20()==null||scienceEntityList.get(2).getPriceMa10()==null||scienceEntityList.get(0).getPriceMa30()==null||scienceEntityList.get(0).getPriceMa20()==null||scienceEntityList.get(7).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa10() == null) {
            return false;
        }
        try{
        boolean result = shang20(stockDayAllListDaPan1,scienceEntityListDaPan);
        if (result) {
            //均线聚拢,开始多天向上
            BigDecimal li10 = (scienceEntityList.get(0).getPriceMa10().subtract(scienceEntityList.get(0).getPriceMa5())).divide(scienceEntityList.get(0).getPriceMa5(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
            BigDecimal li20 = (scienceEntityList.get(0).getPriceMa20().subtract(scienceEntityList.get(0).getPriceMa5())).divide(scienceEntityList.get(0).getPriceMa5(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
            BigDecimal li30 = (scienceEntityList.get(0).getPriceMa30().subtract(scienceEntityList.get(0).getPriceMa5())).divide(scienceEntityList.get(0).getPriceMa5(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
            BigDecimal li101 = (scienceEntityList.get(2).getPriceMa10().subtract(scienceEntityList.get(2).getPriceMa5())).divide(scienceEntityList.get(2).getPriceMa5(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
            BigDecimal li201 = (scienceEntityList.get(2).getPriceMa20().subtract(scienceEntityList.get(2).getPriceMa5())).divide(scienceEntityList.get(2).getPriceMa5(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
            BigDecimal li301 = (scienceEntityList.get(2).getPriceMa30().subtract(scienceEntityList.get(2).getPriceMa5())).divide(scienceEntityList.get(2).getPriceMa5(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
            if (li10.compareTo(new BigDecimal(3)) < 0 && li20.compareTo(new BigDecimal(3)) < 0 && li30.compareTo(new BigDecimal(3)) < 0 && li10.compareTo(new BigDecimal(-3)) > 0 && li20.compareTo(new BigDecimal(-3)) > 0 && li30.compareTo(new BigDecimal(-3)) > 0) {
                if (li101.compareTo(new BigDecimal(4)) < 0 && li201.compareTo(new BigDecimal(4)) < 0 && li301.compareTo(new BigDecimal(4)) < 0 && li101.compareTo(new BigDecimal(-4)) > 0 && li201.compareTo(new BigDecimal(-4)) > 0 && li301.compareTo(new BigDecimal(-4)) > 0) {
                    if (scienceEntityList.get(0).getPriceMa5().compareTo(scienceEntityList.get(1).getPriceMa5()) > 0 && scienceEntityList.get(0).getPriceMa10().compareTo(scienceEntityList.get(1).getPriceMa10()) > 0 && scienceEntityList.get(0).getPriceMa20().compareTo(scienceEntityList.get(1).getPriceMa20()) > 0 && scienceEntityList.get(0).getPriceMa30().compareTo(scienceEntityList.get(1).getPriceMa30()) > 0) {
                        //价格站上20天线
                        if (stockDayAllList.get(0).getClosingPrice().compareTo(scienceEntityList.get(0).getPriceMa20()) > 0 && stockDayAllList.get(0).getClosingPrice().compareTo(scienceEntityList.get(0).getPriceMa10()) > 0) {
                            //阳线
                            if (stockDayAllList.get(0).getClosingPrice().compareTo(stockDayAllList.get(0).getOpeningPrice()) > 0) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean shengVDapan3(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList, List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        if (scienceEntityList.get(7).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa10() == null) {
            return false;
        }
        try{
        boolean result = shang20(stockDayAllListDaPan1,scienceEntityListDaPan);
        if (result) {
            //获取60天最低价与最高价
            BigDecimal close = new BigDecimal(100000);
            BigDecimal top = new BigDecimal(0);
            for (StockDayAll stockDayAll : stockDayAllList) {
                if (stockDayAll.getTopside().compareTo(top) > 0) {
                    top = stockDayAll.getTopside();
                }
                if (stockDayAll.getFoot().compareTo(close) < 0) {
                    close = stockDayAll.getFoot();
                }
            }
            BigDecimal liclose = (stockDayAllList.get(0).getClosingPrice().subtract(close)).divide(stockDayAllList.get(0).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
            if (liclose.compareTo(new BigDecimal(10)) < 0) {
                //近5天大幅下降
                BigDecimal li5 = (stockDayAllList.get(0).getClosingPrice().subtract(stockDayAllList.get(5).getClosingPrice())).divide(stockDayAllList.get(5).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                BigDecimal li10 = (stockDayAllList.get(0).getClosingPrice().subtract(stockDayAllList.get(10).getClosingPrice())).divide(stockDayAllList.get(10).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                if (li5.compareTo(new BigDecimal(-14)) <= 0 || li10.compareTo(new BigDecimal(-20)) <= 0) {
                    //昨天最低，今天出现一个阳线
                    if (stockDayAllList.get(1).getClosingPrice().compareTo(stockDayAllList.get(2).getClosingPrice()) <= 0 && stockDayAllList.get(1).getClosingPrice().compareTo(stockDayAllList.get(3).getClosingPrice()) <= 0 && stockDayAllList.get(1).getClosingPrice().compareTo(stockDayAllList.get(4).getClosingPrice()) <= 0 && stockDayAllList.get(1).getClosingPrice().compareTo(stockDayAllList.get(5).getClosingPrice()) <= 0 && stockDayAllList.get(1).getClosingPrice().compareTo(stockDayAllList.get(6).getClosingPrice()) <= 0) {
                        if (stockDayAllList.get(0).getClosingPrice().compareTo(stockDayAllList.get(0).getOpeningPrice()) > 0) {
                            return true;
                        } else {
                            BigDecimal xiayin = (stockDayAllList.get(0).getClosingPrice().subtract(stockDayAllList.get(0).getFoot())).divide(stockDayAllList.get(0).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            if (xiayin.compareTo(new BigDecimal(4)) >= 0) {
                                return true;
                            }
                        }

                    }
                }
            }
        }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean reset20Dapan3(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList, List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        if (scienceEntityList.get(5).getPriceMa30()==null||scienceEntityList.get(5).getPriceMa20()==null||scienceEntityList.get(1).getPriceMa30()==null||scienceEntityList.get(1).getPriceMa20()==null||scienceEntityList.get(2).getPriceMa10()==null||scienceEntityList.get(0).getPriceMa30()==null||scienceEntityList.get(0).getPriceMa20()==null||scienceEntityList.get(2).getPriceMa5() == null || stockDayAllList.get(2).getTopside() == null || scienceEntityList.get(5).getPriceMa5() == null || stockDayAllList.get(5).getTopside() == null || scienceEntityList.get(7).getPriceMa5() == null || scienceEntityList.get(7).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa10() == null) {
            return false;
        }
        try{
        boolean result = shang20(stockDayAllListDaPan1,scienceEntityListDaPan);
        if (result) {
            //均线上
            BigDecimal ma305 = scienceEntityList.get(0).getPriceMa30().subtract(scienceEntityList.get(5).getPriceMa30());
            BigDecimal ma205 = scienceEntityList.get(0).getPriceMa20().subtract(scienceEntityList.get(5).getPriceMa20());
            BigDecimal ma30 = scienceEntityList.get(0).getPriceMa30().subtract(scienceEntityList.get(1).getPriceMa30());
            BigDecimal ma20 = scienceEntityList.get(0).getPriceMa20().subtract(scienceEntityList.get(1).getPriceMa20());
            if (ma30.compareTo(new BigDecimal(0)) >= 0 && ma20.compareTo(new BigDecimal(-0.03)) >= 0 && ma305.compareTo(new BigDecimal(0)) > 0 && ma205.compareTo(new BigDecimal(0)) > 0) {
                //前几天在5天线上 近5天下降
                if (stockDayAllList.get(5).getClosingPrice().compareTo(scienceEntityList.get(5).getPriceMa5()) > 0 || stockDayAllList.get(2).getClosingPrice().compareTo(scienceEntityList.get(2).getPriceMa5()) > 0 || stockDayAllList.get(7).getClosingPrice().compareTo(scienceEntityList.get(7).getPriceMa5()) > 0) {
                    //今天接近20天线最低或者收盘
                    BigDecimal lli20 = stockDayAllList.get(0).getFoot().subtract(scienceEntityList.get(0).getPriceMa20()).divide(stockDayAllList.get(0).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                    BigDecimal cli20 = stockDayAllList.get(0).getClosingPrice().subtract(scienceEntityList.get(0).getPriceMa20()).divide(stockDayAllList.get(0).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                    BigDecimal tli20 = stockDayAllList.get(0).getTopside().subtract(scienceEntityList.get(0).getPriceMa20()).divide(stockDayAllList.get(0).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                    if ((lli20.compareTo(new BigDecimal(2.5)) < 0 && lli20.compareTo(new BigDecimal(-2.5)) > 0) || (cli20.compareTo(new BigDecimal(-4)) > 0 && cli20.compareTo(new BigDecimal(4)) < 0) || (tli20.compareTo(new BigDecimal(-2.5)) > 0 && tli20.compareTo(new BigDecimal(2.5)) < 0)) {
                        //今天阳线
                        if (stockDayAllList.get(0).getClosingPrice().compareTo(scienceEntityList.get(0).getPriceMa20()) >= 0) {
                            if (stockDayAllList.get(0).getClosingPrice().compareTo(stockDayAllList.get(0).getOpeningPrice()) > 0) {
                                return true;
                            } else {
                                BigDecimal xiayin = (stockDayAllList.get(0).getClosingPrice().subtract(stockDayAllList.get(0).getFoot())).divide(stockDayAllList.get(0).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                                if (xiayin.compareTo(new BigDecimal(3)) >= 0) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jieQiDapan5(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList, List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        if (scienceEntityList.get(2).getPriceMa30()==null||scienceEntityList.get(2).getPriceMa20()==null||scienceEntityList.get(1).getPriceMa30()==null||scienceEntityList.get(1).getPriceMa20()==null||scienceEntityList.get(2).getPriceMa10()==null||scienceEntityList.get(0).getPriceMa30()==null||scienceEntityList.get(0).getPriceMa20()==null||scienceEntityList.get(7).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa10() == null) {
            return false;
        }
        try{
        boolean result = shang20(stockDayAllListDaPan1,scienceEntityListDaPan);
        if (result) {
            //获取60天最低价与最高价
            BigDecimal close = new BigDecimal(100000);
            BigDecimal top = new BigDecimal(0);
            for (StockDayAll stockDayAll : stockDayAllList) {
                if (stockDayAll.getTopside().compareTo(top) > 0) {
                    top = stockDayAll.getTopside();
                }
                if (stockDayAll.getFoot().compareTo(close) < 0) {
                    close = stockDayAll.getFoot();
                }
            }
            BigDecimal liclose = (stockDayAllList.get(0).getClosingPrice().subtract(close)).divide(stockDayAllList.get(0).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
            if (liclose.compareTo(new BigDecimal(12)) < 0) {
                //前3天均线开始聚拢
                BigDecimal li103 = (scienceEntityList.get(2).getPriceMa10().subtract(scienceEntityList.get(2).getPriceMa5())).divide(scienceEntityList.get(2).getPriceMa5(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                BigDecimal li203 = (scienceEntityList.get(2).getPriceMa20().subtract(scienceEntityList.get(2).getPriceMa5())).divide(scienceEntityList.get(2).getPriceMa5(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                BigDecimal li303 = (scienceEntityList.get(2).getPriceMa30().subtract(scienceEntityList.get(2).getPriceMa5())).divide(scienceEntityList.get(2).getPriceMa5(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                BigDecimal li603 = (scienceEntityList.get(2).getPriceMa60().subtract(scienceEntityList.get(2).getPriceMa5())).divide(scienceEntityList.get(2).getPriceMa5(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                if (li603.compareTo(new BigDecimal(4)) < 0 && li103.compareTo(new BigDecimal(4)) < 0 && li203.compareTo(new BigDecimal(4)) < 0 && li303.compareTo(new BigDecimal(4)) < 0 && li103.compareTo(new BigDecimal(-4)) > 0 && li203.compareTo(new BigDecimal(-4)) > 0 && li303.compareTo(new BigDecimal(-4)) > 0) {
                    BigDecimal li100 = (scienceEntityList.get(0).getPriceMa10().subtract(scienceEntityList.get(0).getPriceMa5())).divide(scienceEntityList.get(0).getPriceMa5(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                    BigDecimal li200 = (scienceEntityList.get(0).getPriceMa20().subtract(scienceEntityList.get(0).getPriceMa5())).divide(scienceEntityList.get(0).getPriceMa5(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                    BigDecimal li300 = (scienceEntityList.get(0).getPriceMa30().subtract(scienceEntityList.get(0).getPriceMa5())).divide(scienceEntityList.get(0).getPriceMa5(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                    BigDecimal li600 = (scienceEntityList.get(0).getPriceMa60().subtract(scienceEntityList.get(0).getPriceMa5())).divide(scienceEntityList.get(0).getPriceMa5(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                    if (li600.compareTo(new BigDecimal(3)) < 0 && li100.compareTo(new BigDecimal(3)) < 0 && li200.compareTo(new BigDecimal(3)) < 0 && li300.compareTo(new BigDecimal(3)) < 0 && li100.compareTo(new BigDecimal(-3)) > 0 && li200.compareTo(new BigDecimal(-3)) > 0 && li300.compareTo(new BigDecimal(-3)) > 0) {
                        //今天阳线站上5天线，昨天在5天10天一下
                        if (stockDayAllList.get(1).getClosingPrice().compareTo(scienceEntityList.get(1).getPriceMa5()) < 0 || stockDayAllList.get(1).getClosingPrice().compareTo(scienceEntityList.get(1).getPriceMa10()) < 0) {
                            if (stockDayAllList.get(0).getClosingPrice().compareTo(stockDayAllList.get(0).getOpeningPrice()) >= 0) {
                                if (stockDayAllList.get(0).getClosingPrice().compareTo(scienceEntityList.get(0).getPriceMa5()) >= 0 && stockDayAllList.get(0).getClosingPrice().compareTo(scienceEntityList.get(0).getPriceMa10()) >= 0 && stockDayAllList.get(0).getClosingPrice().compareTo(scienceEntityList.get(0).getPriceMa20()) >= 0) {
                                    //均线向上
                                    if (scienceEntityList.get(0).getPriceMa5().compareTo(scienceEntityList.get(1).getPriceMa5()) > 0 && scienceEntityList.get(0).getPriceMa10().compareTo(scienceEntityList.get(1).getPriceMa10()) >= 0 && scienceEntityList.get(0).getPriceMa20().compareTo(scienceEntityList.get(1).getPriceMa20()) >= 0 && scienceEntityList.get(0).getPriceMa30().compareTo(scienceEntityList.get(1).getPriceMa30()) >= 0) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jishujieqiDapan5(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList, List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        if (scienceEntityList.get(7).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa10() == null) {
            return false;
        }
        try{
        boolean result = shang20(stockDayAllListDaPan1,scienceEntityListDaPan);
        if (result) {
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
                    //今天阳线站上5天线，昨天在5天10天一下
                    if (stockDayAllList.get(0).getClosingPrice().compareTo(stockDayAllList.get(0).getOpeningPrice()) > 0) {
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

    public static boolean jishujieqiDapan6(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList, List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        if (scienceEntityList.get(7).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa10() == null) {
            return false;
        }
        try{
        boolean result = shang20(stockDayAllListDaPan1,scienceEntityListDaPan);
        if (result) {
            List<ChangeEntity> changeEntityList = new ArrayList<>();
            for (StockDayAll stockDayAll : stockDayAllList) {
                ChangeEntity changeEntity = new ChangeEntity();
                BeanUtils.copyProperties(stockDayAll, changeEntity);
                changeEntityList.add(changeEntity);
            }

            KDJScienceVo kdjScienceVo = KDJUtil.getKDJScience1(scienceEntityList, changeEntityList);
            MACDScienceVo macdScienceVo = MACDUtil.getMACDScience1(scienceEntityList);
            if (kdjScienceVo.getJincha() != null || kdjScienceVo.getJincha80() != null || (kdjScienceVo.getKdjzhuhe().contains("20下钝化") || kdjScienceVo.getKdjzhuhe().contains("20下背离")) || kdjScienceVo.getJincha20() != null) {
                if (macdScienceVo.getShangchuan0zhou() != null || macdScienceVo.getZhoufujinjincha() != null || macdScienceVo.getZhouxiajincha() != null || macdScienceVo.getZhoushangjincha() != null) {
                    //今天阳线站上5天线，昨天在5天10天一下
                    if (stockDayAllList.get(0).getClosingPrice().compareTo(stockDayAllList.get(0).getOpeningPrice()) > 0) {
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

    public static boolean jishujieqiDapan7(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList, List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        if (scienceEntityList.get(7).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa10() == null) {
            return false;
        }
        try{
        boolean result = shang20(stockDayAllListDaPan1,scienceEntityListDaPan);
        if (result) {
            List<ChangeEntity> changeEntityList = new ArrayList<>();
            for (StockDayAll stockDayAll : stockDayAllList) {
                ChangeEntity changeEntity = new ChangeEntity();
                BeanUtils.copyProperties(stockDayAll, changeEntity);
                changeEntityList.add(changeEntity);
            }

            KDJScienceVo kdjScienceVo = KDJUtil.getKDJScience1(scienceEntityList, changeEntityList);
            MACDScienceVo macdScienceVo = MACDUtil.getMACDScience1(scienceEntityList);
            if (kdjScienceVo.getJincha() != null) {
                if (macdScienceVo.getShangchuan0zhou() != null || macdScienceVo.getZhoufujinjincha() != null || macdScienceVo.getZhouxiajincha() != null || macdScienceVo.getZhoushangjincha() != null) {
                    //今天阳线站上5天线，昨天在5天10天一下
                    if (stockDayAllList.get(0).getClosingPrice().compareTo(stockDayAllList.get(0).getOpeningPrice()) > 0) {
                        return true;
                    }
                }
            }
            if (kdjScienceVo.getJincha80() != null) {
                if (macdScienceVo.getZhoufujinjincha() != null || macdScienceVo.getZhoushangjincha() != null) {
                    //今天阳线站上5天线，昨天在5天10天一下
                    if (stockDayAllList.get(0).getClosingPrice().compareTo(stockDayAllList.get(0).getOpeningPrice()) > 0) {
                        return true;
                    }
                }
            }
            if ((kdjScienceVo.getKdjzhuhe().contains("20下钝化") || kdjScienceVo.getKdjzhuhe().contains("20下背离"))) {
                if (macdScienceVo.getZhouxiajincha() != null) {
                    //今天阳线站上5天线，昨天在5天10天一下
                    if (stockDayAllList.get(0).getClosingPrice().compareTo(stockDayAllList.get(0).getOpeningPrice()) > 0) {
                        return true;
                    }
                }
            }
            if (kdjScienceVo.getJincha20() != null) {
                if (macdScienceVo.getShangchuan0zhou() != null || macdScienceVo.getZhoufujinjincha() != null || macdScienceVo.getZhouxiajincha() != null) {
                    //今天阳线站上5天线，昨天在5天10天一下
                    if (stockDayAllList.get(0).getClosingPrice().compareTo(stockDayAllList.get(0).getOpeningPrice()) > 0) {
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

    public static boolean duoTuXiangShangDapan4(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList, List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        if (scienceEntityList.get(2).getPriceMa30()==null||scienceEntityList.get(2).getPriceMa20()==null||scienceEntityList.get(1).getPriceMa30()==null||scienceEntityList.get(1).getPriceMa20()==null||scienceEntityList.get(2).getPriceMa10()==null||scienceEntityList.get(0).getPriceMa30()==null||scienceEntityList.get(0).getPriceMa20()==null||scienceEntityList.get(7).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa10() == null) {
            return false;
        }
        try{
        boolean result = shang20(stockDayAllListDaPan1,scienceEntityListDaPan);
        if (result) {
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
            if ((sunVo != null && (sunVo.getQingKongWanLi() != null || sunVo.getGuangTouChuanYun() != null || sunVo.getShuGuangChuXian() != null || sunVo.getYangGuangPuZhao() != null || sunVo.getLiangGeTaiYang() != null || sunVo.getShangShenSanLieYang() != null || sunVo.getHongSanBing() != null || sunVo.getSanGeTaiYang() != null || sunVo.getBinPaiHong() != null)) || (cengDieVo != null && cengDieVo.getDuoFangPao() != null)) {
                //均线聚拢,开始多天向上
                BigDecimal li10 = (scienceEntityList.get(0).getPriceMa10().subtract(scienceEntityList.get(0).getPriceMa5())).divide(scienceEntityList.get(0).getPriceMa5(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                BigDecimal li20 = (scienceEntityList.get(0).getPriceMa20().subtract(scienceEntityList.get(0).getPriceMa5())).divide(scienceEntityList.get(0).getPriceMa5(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                BigDecimal li30 = (scienceEntityList.get(0).getPriceMa30().subtract(scienceEntityList.get(0).getPriceMa5())).divide(scienceEntityList.get(0).getPriceMa5(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                if (li10.compareTo(new BigDecimal(4)) < 0 && li20.compareTo(new BigDecimal(4)) < 0 && li30.compareTo(new BigDecimal(4)) < 0 && li10.compareTo(new BigDecimal(-4)) > 0 && li20.compareTo(new BigDecimal(-4)) > 0 && li30.compareTo(new BigDecimal(-4)) > 0) {
                    if (scienceEntityList.get(0).getPriceMa5().compareTo(scienceEntityList.get(1).getPriceMa5()) > 0 && scienceEntityList.get(0).getPriceMa10().compareTo(scienceEntityList.get(1).getPriceMa10()) > 0) {
                        //价格站上5天线
                        if (stockDayAllList.get(0).getClosingPrice().compareTo(scienceEntityList.get(0).getPriceMa5()) > 0 && stockDayAllList.get(0).getClosingPrice().compareTo(scienceEntityList.get(0).getPriceMa10()) > 0 && stockDayAllList.get(0).getClosingPrice().compareTo(scienceEntityList.get(0).getPriceMa20()) >= 0) {
                            //近10天有没有的涨幅
                            BigDecimal bian10 = stockDayAllList.get(0).getClosingPrice().subtract(stockDayAllList.get(10).getClosingPrice()).divide(stockDayAllList.get(10).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            //近5天有没有的涨幅
                            BigDecimal bian5 = stockDayAllList.get(0).getClosingPrice().subtract(stockDayAllList.get(5).getClosingPrice()).divide(stockDayAllList.get(5).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            if (bian10.compareTo(new BigDecimal(5)) < 0 && bian5.compareTo(new BigDecimal(3)) < 0) {
                                //阳线
                                if (stockDayAllList.get(0).getClosingPrice().compareTo(stockDayAllList.get(0).getOpeningPrice()) > 0) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean shengVDapan4(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList, List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        if (scienceEntityList.get(7).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa10() == null) {
            return false;
        }
        try{
        boolean result = shang20(stockDayAllListDaPan1,scienceEntityListDaPan);
        if (result) {
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
            if ((sunVo != null && (sunVo.getQingKongWanLi() != null || sunVo.getGuangTouChuanYun() != null || sunVo.getShuGuangChuXian() != null || sunVo.getYangGuangPuZhao() != null || sunVo.getLiangGeTaiYang() != null || sunVo.getShangShenSanLieYang() != null || sunVo.getHongSanBing() != null || sunVo.getSanGeTaiYang() != null || sunVo.getBinPaiHong() != null)) || (cengDieVo != null && cengDieVo.getDuoFangPao() != null)) {
                //近5天大幅下降
                BigDecimal li5 = (stockDayAllList.get(0).getClosingPrice().subtract(stockDayAllList.get(5).getClosingPrice())).divide(stockDayAllList.get(5).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                BigDecimal li10 = (stockDayAllList.get(0).getClosingPrice().subtract(stockDayAllList.get(10).getClosingPrice())).divide(stockDayAllList.get(10).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                if (li5.compareTo(new BigDecimal(-14)) <= 0 || li10.compareTo(new BigDecimal(-20)) <= 0) {
                    //昨天最低，今天出现一个阳线
                    if (stockDayAllList.get(1).getClosingPrice().compareTo(stockDayAllList.get(2).getClosingPrice()) <= 0 && stockDayAllList.get(1).getClosingPrice().compareTo(stockDayAllList.get(3).getClosingPrice()) <= 0 && stockDayAllList.get(1).getClosingPrice().compareTo(stockDayAllList.get(4).getClosingPrice()) <= 0 && stockDayAllList.get(1).getClosingPrice().compareTo(stockDayAllList.get(5).getClosingPrice()) <= 0 && stockDayAllList.get(1).getClosingPrice().compareTo(stockDayAllList.get(6).getClosingPrice()) <= 0) {
                        if (stockDayAllList.get(0).getClosingPrice().compareTo(stockDayAllList.get(0).getOpeningPrice()) > 0) {
                            return true;
                        } else {
                            BigDecimal xiayin = (stockDayAllList.get(0).getClosingPrice().subtract(stockDayAllList.get(0).getFoot())).divide(stockDayAllList.get(0).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            if (xiayin.compareTo(new BigDecimal(4)) >= 0) {
                                return true;
                            }
                        }

                    }
                }
            }
        }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean reset20Dapan4(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList, List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        if (scienceEntityList.get(2).getPriceMa30()==null||scienceEntityList.get(2).getPriceMa20()==null||scienceEntityList.get(1).getPriceMa30()==null||scienceEntityList.get(1).getPriceMa20()==null||scienceEntityList.get(2).getPriceMa10()==null||scienceEntityList.get(0).getPriceMa30()==null||scienceEntityList.get(0).getPriceMa20()==null||scienceEntityList.get(2).getPriceMa5() == null || stockDayAllList.get(2).getTopside() == null || scienceEntityList.get(4).getPriceMa5() == null || stockDayAllList.get(4).getTopside() == null || scienceEntityList.get(7).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa10() == null) {
            return false;
        }
        try{
        boolean result = shang20(stockDayAllListDaPan1,scienceEntityListDaPan);
        if (result) {
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
            if ((sunVo != null && (sunVo.getQingKongWanLi() != null || sunVo.getGuangTouChuanYun() != null || sunVo.getShuGuangChuXian() != null || sunVo.getYangGuangPuZhao() != null || sunVo.getLiangGeTaiYang() != null || sunVo.getShangShenSanLieYang() != null || sunVo.getHongSanBing() != null || sunVo.getSanGeTaiYang() != null || sunVo.getBinPaiHong() != null)) || (cengDieVo != null && cengDieVo.getDuoFangPao() != null)) {
                //均线上
                BigDecimal ma30 = scienceEntityList.get(0).getPriceMa30().subtract(scienceEntityList.get(1).getPriceMa30());
                BigDecimal ma20 = scienceEntityList.get(0).getPriceMa20().subtract(scienceEntityList.get(1).getPriceMa20());
                if (ma30.compareTo(new BigDecimal(0)) >= 0 && ma20.compareTo(new BigDecimal(-0.03)) >= 0) {
                    //前几天在5天线上 近5天下降
                    if (stockDayAllList.get(4).getTopside().compareTo(scienceEntityList.get(4).getPriceMa5()) >= 0 || stockDayAllList.get(2).getTopside().compareTo(scienceEntityList.get(2).getPriceMa5()) >= 0) {
                        if (stockDayAllList.get(0).getClosingPrice().compareTo(stockDayAllList.get(5).getClosingPrice()) < 0) {
                            //今天接近20天线最低或者收盘
                            BigDecimal lli20 = stockDayAllList.get(0).getFoot().subtract(scienceEntityList.get(0).getPriceMa20()).divide(stockDayAllList.get(0).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            BigDecimal cli20 = stockDayAllList.get(0).getClosingPrice().subtract(scienceEntityList.get(0).getPriceMa20()).divide(stockDayAllList.get(0).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            BigDecimal tli20 = stockDayAllList.get(0).getTopside().subtract(scienceEntityList.get(0).getPriceMa20()).divide(stockDayAllList.get(0).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            if ((lli20.compareTo(new BigDecimal(2.5)) < 0 && lli20.compareTo(new BigDecimal(-2.5)) > 0) || (cli20.compareTo(new BigDecimal(-4)) > 0 && cli20.compareTo(new BigDecimal(4)) < 0) || (tli20.compareTo(new BigDecimal(-2.5)) > 0 && tli20.compareTo(new BigDecimal(2.5)) < 0)) {
                                //今天阳线
                                if (stockDayAllList.get(0).getClosingPrice().compareTo(stockDayAllList.get(0).getOpeningPrice()) > 0) {
                                    return true;
                                } else {
                                    BigDecimal xiayin = (stockDayAllList.get(0).getClosingPrice().subtract(stockDayAllList.get(0).getFoot())).divide(stockDayAllList.get(0).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                                    if (xiayin.compareTo(new BigDecimal(3)) >= 0) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jieQiDapan6(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList, List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        if (scienceEntityList.get(1).getPriceMa20()==null||scienceEntityList.get(0).getPriceMa20()==null||scienceEntityList.get(1).getPriceMa10()==null||scienceEntityList.get(0).getPriceMa10()==null||scienceEntityList.get(1).getPriceMa5()==null||scienceEntityList.get(0).getPriceMa5()==null||scienceEntityList.get(7).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa10() == null) {
            return false;
        }
        try{
        boolean result = shang20(stockDayAllListDaPan1,scienceEntityListDaPan);
        if (result) {
            //获取60天最低价与最高价
            BigDecimal close = new BigDecimal(100000);
            BigDecimal top = new BigDecimal(0);
            for (StockDayAll stockDayAll : stockDayAllList) {
                if (stockDayAll.getTopside().compareTo(top) > 0) {
                    top = stockDayAll.getTopside();
                }
                if (stockDayAll.getFoot().compareTo(close) < 0) {
                    close = stockDayAll.getFoot();
                }
            }
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
            if ((sunVo != null && (sunVo.getQingKongWanLi() != null || sunVo.getGuangTouChuanYun() != null || sunVo.getShuGuangChuXian() != null || sunVo.getYangGuangPuZhao() != null || sunVo.getLiangGeTaiYang() != null || sunVo.getShangShenSanLieYang() != null || sunVo.getHongSanBing() != null || sunVo.getSanGeTaiYang() != null || sunVo.getBinPaiHong() != null)) || (cengDieVo != null && cengDieVo.getDuoFangPao() != null)) {
                BigDecimal liclose = (stockDayAllList.get(0).getClosingPrice().subtract(close)).divide(stockDayAllList.get(0).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                if (liclose.compareTo(new BigDecimal(15)) < 0) {
                    //今天阳
                    if (stockDayAllList.get(0).getClosingPrice().compareTo(stockDayAllList.get(0).getOpeningPrice()) >= 0) {
                        //均线向上
                        if (scienceEntityList.get(0).getPriceMa5().compareTo(scienceEntityList.get(1).getPriceMa5()) > 0 && scienceEntityList.get(0).getPriceMa10().compareTo(scienceEntityList.get(1).getPriceMa10()) >= 0 && scienceEntityList.get(0).getPriceMa20().compareTo(scienceEntityList.get(1).getPriceMa20()) >= 0) {
                            return true;
                        }
                    }

                }
            }
        }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jishujieqiDapan8(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList, List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        if (scienceEntityList.get(2).getPriceMa30()==null||scienceEntityList.get(2).getPriceMa20()==null||scienceEntityList.get(1).getPriceMa30()==null||scienceEntityList.get(1).getPriceMa20()==null||scienceEntityList.get(2).getPriceMa10()==null||scienceEntityList.get(0).getPriceMa30()==null||scienceEntityList.get(0).getPriceMa20()==null||scienceEntityList.get(7).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa10() == null) {
            return false;
        }
        try{
        boolean result = shang20(stockDayAllListDaPan1,scienceEntityListDaPan);
        if (result) {
            List<ChangeEntity> changeEntityList = new ArrayList<>();
            for (StockDayAll stockDayAll : stockDayAllList) {
                ChangeEntity changeEntity = new ChangeEntity();
                BeanUtils.copyProperties(stockDayAll, changeEntity);
                changeEntityList.add(changeEntity);
            }
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
            if ((sunVo != null && (sunVo.getQingKongWanLi() != null || sunVo.getGuangTouChuanYun() != null || sunVo.getShuGuangChuXian() != null || sunVo.getYangGuangPuZhao() != null || sunVo.getLiangGeTaiYang() != null || sunVo.getShangShenSanLieYang() != null || sunVo.getHongSanBing() != null || sunVo.getSanGeTaiYang() != null || sunVo.getBinPaiHong() != null)) || (cengDieVo != null && cengDieVo.getDuoFangPao() != null)) {
                KDJScienceVo kdjScienceVo = KDJUtil.getKDJScience1(scienceEntityList, changeEntityList);
                MACDScienceVo macdScienceVo = MACDUtil.getMACDScience1(scienceEntityList);
                if (kdjScienceVo.getJincha() != null || kdjScienceVo.getXiangshang80() != null || kdjScienceVo.getJincha80() != null || (kdjScienceVo.getKdjzhuhe().contains("20下钝化") || kdjScienceVo.getKdjzhuhe().contains("20下背离")) || kdjScienceVo.getXiangshang20() != null || kdjScienceVo.getJincha20() != null) {
                    if (macdScienceVo.getShangchuan0zhou() != null || macdScienceVo.getZhoufujinjincha() != null || macdScienceVo.getZhouxiajincha() != null || macdScienceVo.getZhoushangjincha() != null || macdScienceVo.getZhouxiaxiangshang() != null || macdScienceVo.getZhoushnagxiangshang() != null) {
                        //前3天均线开始聚拢
                        BigDecimal li103 = (scienceEntityList.get(2).getPriceMa10().subtract(scienceEntityList.get(2).getPriceMa5())).divide(scienceEntityList.get(2).getPriceMa5(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                        BigDecimal li203 = (scienceEntityList.get(2).getPriceMa20().subtract(scienceEntityList.get(2).getPriceMa5())).divide(scienceEntityList.get(2).getPriceMa5(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                        BigDecimal li303 = (scienceEntityList.get(2).getPriceMa30().subtract(scienceEntityList.get(2).getPriceMa5())).divide(scienceEntityList.get(2).getPriceMa5(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                        if (li103.compareTo(new BigDecimal(5)) < 0 && li203.compareTo(new BigDecimal(5)) < 0 && li303.compareTo(new BigDecimal(5)) < 0 && li103.compareTo(new BigDecimal(-5)) > 0 && li203.compareTo(new BigDecimal(-5)) > 0 && li303.compareTo(new BigDecimal(-5)) > 0) {
                            BigDecimal li100 = (scienceEntityList.get(0).getPriceMa10().subtract(scienceEntityList.get(0).getPriceMa5())).divide(scienceEntityList.get(0).getPriceMa5(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            BigDecimal li200 = (scienceEntityList.get(0).getPriceMa20().subtract(scienceEntityList.get(0).getPriceMa5())).divide(scienceEntityList.get(0).getPriceMa5(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            BigDecimal li300 = (scienceEntityList.get(0).getPriceMa30().subtract(scienceEntityList.get(0).getPriceMa5())).divide(scienceEntityList.get(0).getPriceMa5(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            if (li100.compareTo(new BigDecimal(4)) < 0 && li200.compareTo(new BigDecimal(4)) < 0 && li300.compareTo(new BigDecimal(4)) < 0 && li100.compareTo(new BigDecimal(-4)) > 0 && li200.compareTo(new BigDecimal(-4)) > 0 && li300.compareTo(new BigDecimal(-4)) > 0) {
                                //今天阳线站上5天线，昨天在5天10天一下
                                if (stockDayAllList.get(1).getClosingPrice().compareTo(scienceEntityList.get(1).getPriceMa5()) < 0 || stockDayAllList.get(1).getClosingPrice().compareTo(scienceEntityList.get(1).getPriceMa10()) < 0) {
                                    if (stockDayAllList.get(0).getClosingPrice().compareTo(stockDayAllList.get(0).getOpeningPrice()) > 0) {
                                        if (stockDayAllList.get(0).getClosingPrice().compareTo(scienceEntityList.get(0).getPriceMa5()) >= 0 && stockDayAllList.get(0).getClosingPrice().compareTo(scienceEntityList.get(0).getPriceMa10()) >= 0 && stockDayAllList.get(0).getClosingPrice().compareTo(scienceEntityList.get(0).getPriceMa20()) >= 0) {
                                            //均线向上
                                            if (scienceEntityList.get(0).getPriceMa5().compareTo(scienceEntityList.get(1).getPriceMa5()) > 0 && scienceEntityList.get(0).getPriceMa10().compareTo(scienceEntityList.get(1).getPriceMa10()) >= 0 && scienceEntityList.get(0).getPriceMa20().compareTo(scienceEntityList.get(1).getPriceMa20()) >= 0) {
                                                return true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jishujieqiDapan9(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList, List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        if (scienceEntityList.get(7).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa5() == null || scienceEntityList.get(0).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa60() == null || scienceEntityList.get(2).getPriceMa10() == null || scienceEntityList.get(5).getPriceMa10() == null) {
            return false;
        }
        try{
        boolean result = shang20(stockDayAllListDaPan1,scienceEntityListDaPan);
        if (result) {
            List<ChangeEntity> changeEntityList = new ArrayList<>();
            for (StockDayAll stockDayAll : stockDayAllList) {
                ChangeEntity changeEntity = new ChangeEntity();
                BeanUtils.copyProperties(stockDayAll, changeEntity);
                changeEntityList.add(changeEntity);
            }
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
            if ((sunVo != null && (sunVo.getQingKongWanLi() != null || sunVo.getGuangTouChuanYun() != null || sunVo.getShuGuangChuXian() != null || sunVo.getYangGuangPuZhao() != null || sunVo.getLiangGeTaiYang() != null || sunVo.getShangShenSanLieYang() != null || sunVo.getHongSanBing() != null || sunVo.getSanGeTaiYang() != null || sunVo.getBinPaiHong() != null)) || (cengDieVo != null && cengDieVo.getDuoFangPao() != null)) {
                KDJScienceVo kdjScienceVo = KDJUtil.getKDJScience1(scienceEntityList, changeEntityList);
                MACDScienceVo macdScienceVo = MACDUtil.getMACDScience1(scienceEntityList);
                if (kdjScienceVo.getJincha() != null || kdjScienceVo.getJincha80() != null || kdjScienceVo.getJincha20() != null) {
                    if (macdScienceVo.getShangchuan0zhou() != null || macdScienceVo.getZhoufujinjincha() != null || macdScienceVo.getZhouxiajincha() != null || macdScienceVo.getZhoushangjincha() != null) {
                        //今天阳线站上5天线，昨天在5天10天一下
                        if (stockDayAllList.get(0).getClosingPrice().compareTo(stockDayAllList.get(0).getOpeningPrice()) > 0) {
                            return true;
                        }
                    }
                }
            }
        }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jieQiDapan7(List<StockDayAll> stockDayAllList, List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        try{
        boolean result = shang20(stockDayAllListDaPan1,scienceEntityListDaPan);
        if (result) {
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
            if ((sunVo != null && (sunVo.getQingKongWanLi() != null || sunVo.getGuangTouChuanYun() != null || sunVo.getShuGuangChuXian() != null || sunVo.getYangGuangPuZhao() != null || sunVo.getLiangGeTaiYang() != null || sunVo.getShangShenSanLieYang() != null || sunVo.getHongSanBing() != null || sunVo.getSanGeTaiYang() != null || sunVo.getBinPaiHong() != null)) || (cengDieVo != null && cengDieVo.getDuoFangPao() != null)) {
                return true;
            }
        }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jieQiDapan8(List<StockDayAll> stockDayAllList, List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        try{
        boolean result = shang20(stockDayAllListDaPan1,scienceEntityListDaPan);
        if (result) {
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
            if (sunVo != null) {
                if (sunVo.getSanGeTaiYang() != null || sunVo.getHongSanBing() != null || sunVo.getShangShenSanLieYang() != null) {
                    return true;
                }
            }
            if (cengDieVo != null) {
                if (cengDieVo.getDuoFangPao() != null) {
                    return true;
                }
            }
        }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jieQiDapan9(List<StockDayAll> stockDayAllList, List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        try{
        boolean result = shang20(stockDayAllListDaPan1,scienceEntityListDaPan);
        if (result) {
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
            if (sunVo != null) {
                if (sunVo.getLiangGeTaiYang() != null || sunVo.getYangGuangPuZhao() != null || sunVo.getShuGuangChuXian() != null || sunVo.getGuangTouChuanYun() != null || sunVo.getQingKongWanLi() != null) {
                    return true;
                }
            }
            if (cengDieVo != null) {
                if (cengDieVo.getDuoFangPao() != null) {
                    return true;
                }
            }
        }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jieQiDapan10(List<StockDayAll> stockDayAllList, List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        try{
        boolean result = shang20(stockDayAllListDaPan1,scienceEntityListDaPan);
        if (result) {
            List<SunEntity> sunEntityList = new ArrayList<>();
            for (StockDayAll stockDayAll : stockDayAllList) {
                SunEntity sunEntity = new SunEntity();
                BeanUtils.copyProperties(stockDayAll, sunEntity);
                sunEntityList.add(sunEntity);
            }
            SunVo sunVo = SunUtil.getSun(sunEntityList);
            if (sunVo != null) {
                if (sunVo.getLiangGeTaiYang() != null || sunVo.getYangGuangPuZhao() != null || sunVo.getShuGuangChuXian() != null || sunVo.getGuangTouChuanYun() != null || sunVo.getQingKongWanLi() != null) {
                    return true;
                }
            }
        }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jieQiDapan11(List<StockDayAll> stockDayAllList, List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        try{
        boolean result = shang20(stockDayAllListDaPan1,scienceEntityListDaPan);
        if (result) {
            List<CengDieEntity> cengDieEntityList = new ArrayList<>();
            for (StockDayAll stockDayAll : stockDayAllList) {
                CengDieEntity cengDieEntity = new CengDieEntity();
                BeanUtils.copyProperties(stockDayAll, cengDieEntity);
                cengDieEntityList.add(cengDieEntity);
            }
            CengDieVo cengDieVo = StackUtil.getcengdie(cengDieEntityList);
            if (cengDieVo != null) {
                if (cengDieVo.getDuoFangPao() != null) {
                    return true;
                }
            }
        }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jieQiDapan12(List<StockDayAll> stockDayAllList, List<StockDayAll> stockDayAllListDaPan1, List<ScienceEntity> scienceEntityListDaPan) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        try{
        boolean result = shang20(stockDayAllListDaPan1,scienceEntityListDaPan);
        if (result) {
            List<SunEntity> sunEntityList = new ArrayList<>();
            for (StockDayAll stockDayAll : stockDayAllList) {
                SunEntity sunEntity = new SunEntity();
                BeanUtils.copyProperties(stockDayAll, sunEntity);
                sunEntityList.add(sunEntity);
            }
            SunVo sunVo = SunUtil.getSun(sunEntityList);
            if (sunVo != null) {
                if (sunVo.getSanGeTaiYang() != null || sunVo.getHongSanBing() != null || sunVo.getShangShenSanLieYang() != null) {
                    return true;
                }
            }
        }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean shang20(List<StockDayAll> stockDayAllList, List<ScienceEntity> scienceEntityList) {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        if (scienceEntityList.get(1).getPriceMa20()==null||scienceEntityList.get(0).getPriceMa20()==null||scienceEntityList.get(0).getPriceMa30()==null||scienceEntityList.get(1).getPriceMa30()==null) {
            return false;
        }
        try{
        if (stockDayAllList.get(0).getClosingPrice()!=null&&stockDayAllList.get(1).getClosingPrice()!=null) {
            //均线上
            BigDecimal ma30 = scienceEntityList.get(0).getPriceMa30().subtract(scienceEntityList.get(1).getPriceMa30());
            BigDecimal ma20 = scienceEntityList.get(0).getPriceMa20().subtract(scienceEntityList.get(1).getPriceMa20());
            if (ma30.compareTo(new BigDecimal(0)) >= 0 && ma20.compareTo(new BigDecimal(-0.03)) >= 0) {
                if (stockDayAllList.get(0).getClosingPrice().compareTo(stockDayAllList.get(0).getOpeningPrice()) > 0) {
                    if (stockDayAllList.get(1).getClosingPrice().compareTo(scienceEntityList.get(1).getPriceMa20()) < 0) {
                        if (stockDayAllList.get(0).getClosingPrice().compareTo(scienceEntityList.get(0).getPriceMa20()) >= 0) {
                            return true;
                        }
                    }
                }

            }
        }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

}
