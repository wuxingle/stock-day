package com.stock.stockday.newService.list1;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.stock.apicommon.entity.CengDieEntity;
import com.stock.apicommon.entity.ChangeEntity;
import com.stock.apicommon.entity.DangRiEntity;
import com.stock.apicommon.entity.PingDingEntity;
import com.stock.apicommon.entity.ScienceEntity;
import com.stock.apicommon.entity.SunEntity;
import com.stock.apicommon.entity.WuYunEntity;
import com.stock.apicommon.utils.KDJUtil;
import com.stock.apicommon.utils.MACDUtil;
import com.stock.apicommon.utils.MakeQuantityMAUtil;
import com.stock.apicommon.utils.PriceMAUtil;
import com.stock.apicommon.utils.patterning.AbreastUtil;
import com.stock.apicommon.utils.patterning.BlackCloudsUtil;
import com.stock.apicommon.utils.patterning.DangRiUtil;
import com.stock.apicommon.utils.patterning.RateOfChangeUtil;
import com.stock.apicommon.utils.patterning.StackUtil;
import com.stock.apicommon.utils.patterning.SunUtil;
import com.stock.apicommon.utils.patterning.YirichuanUtil;
import com.stock.apicommon.vo.CengDieVo;
import com.stock.apicommon.vo.DangRiVo;
import com.stock.apicommon.vo.KDJScienceVo;
import com.stock.apicommon.vo.MACDScienceVo;
import com.stock.apicommon.vo.PingQiVo;
import com.stock.apicommon.vo.PriceScienceVo;
import com.stock.apicommon.vo.QuantityScienceVo;
import com.stock.apicommon.vo.RateOfChangeVo;
import com.stock.apicommon.vo.SunVo;
import com.stock.apicommon.vo.WuYunVo;
import com.stock.apicommon.vo.XianVo;
import com.stock.apicommon.vo.YirichuanVo;
import com.stock.stockday.entity.StockCode;
import com.stock.stockday.entity.StockDay3002;
import com.stock.stockday.entity.StockDayScience3002;
import com.stock.stockday.entity.StockDayYanPan24;
import com.stock.stockday.entity.StockDayYanPan33;
import com.stock.stockday.entity.StockDayYanPan42;
import com.stock.stockday.entity.StockDayYanPanBenpan;
import com.stock.stockday.service.StockDay3002Service;
import com.stock.stockday.service.StockDayScience3002Service;
import com.stock.stockday.util.DateUtil;
import com.stock.stockday.util.GetMacdString;
import com.stock.stockday.util.GetRate;
import com.stock.stockday.util.GetXian;
import com.stock.stockday.util.GetYiRiXian;
import com.stock.stockday.util.GetYuCeZhuHeListUtil;
import com.stock.stockday.util.GetkdjString;
import com.stock.stockday.vo.StockDayVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class GetZhuHeListStock3002 {
    @Autowired
    private StockDay3002Service stockDay3002Service;
    @Autowired
    private StockDayScience3002Service stockDayScience3002Service;


    public List<StockDayVo> get24ListStock(StockCode stockCode, List<StockDayVo> stockDayVoList) throws IOException {
        StockDayVo stockDayVo = new StockDayVo();
        stockDayVo.setCode(stockCode.getEx() + stockCode.getId());
        stockDayVo.setName(stockCode.getName());
        //获取前60天记录，并且取前20天的有效记录
        Page<StockDay3002> page = new Page<>(1, 60);
        List<StockDay3002> stockDay3002List = stockDay3002Service.selectByCodeAndExPage(page, stockCode.getId(), stockCode.getEx());
        Collections.sort(stockDay3002List, new Comparator<StockDay3002>() {
            @Override
            public int compare(StockDay3002 o1, StockDay3002 o2) {
                long i = o2.getDate().getTime() - o1.getDate().getTime();
                if (i > 0) {
                    return 1;
                } else if (i < 0) {
                    return -1;
                }
                return 0;
            }
        });
        Page<StockDayScience3002> page1=new Page<>(1,60);
        List<StockDayScience3002> stockDayScience3002List = stockDayScience3002Service.selectByPage(page1,stockCode.getId(), stockCode.getEx());//技术先
        //计算指标，从数据库中获取对于的数据
        List<CengDieEntity> cengDieEntityList = new ArrayList<>();
        List<DangRiEntity> dangRiEntityList = new ArrayList<>();
        List<PingDingEntity> pingDingEntityList = new ArrayList<>();
        List<SunEntity> sunEntityList = new ArrayList<>();
        List<WuYunEntity> wuYunEntityList = new ArrayList<>();
        List<ScienceEntity> scienceEntityList = new ArrayList<>();
        List<StockDay3002> stockDay3002List1 = new ArrayList<>();
        for (StockDay3002 stockDay3002 : stockDay3002List) {
            if (stockDay3002.getOpeningPrice().compareTo(new BigDecimal(0)) != 0 && stockDay3002.getOpeningPrice() != null && stockDay3002.getLclosePrice() != null && stockDay3002.getLclosePrice().compareTo(new BigDecimal(0)) != 0 && stockDay3002.getChangePoints() != null) {
                stockDay3002List1.add(stockDay3002);
            }
            if (stockDay3002List1.size() == 20) {
                stockDayVo.setDate(DateUtil.get2String(stockDay3002List1.get(0).getDate()));
                for (int i = 0; i < stockDay3002List1.size(); i++) {
                    if (i == 0) {
                        DangRiEntity dangRiEntity = new DangRiEntity();
                        BeanUtils.copyProperties(stockDay3002List1.get(i), dangRiEntity);
                        dangRiEntityList.add(dangRiEntity);
                    }
                    if (i < 4) {
                        WuYunEntity wuYunEntity = new WuYunEntity();
                        BeanUtils.copyProperties(stockDay3002List1.get(i), wuYunEntity);
                        wuYunEntityList.add(wuYunEntity);
                    }
                    if ( i < 5) {
                        CengDieEntity cengDieEntity = new CengDieEntity();
                        BeanUtils.copyProperties(stockDay3002List1.get(i), cengDieEntity);
                        cengDieEntityList.add(cengDieEntity);
                    }
                    if (i < 10) {
                        PingDingEntity pingDingEntity = new PingDingEntity();
                        BeanUtils.copyProperties(stockDay3002List1.get(i), pingDingEntity);
                        pingDingEntityList.add(pingDingEntity);

                        SunEntity sunEntity = new SunEntity();
                        BeanUtils.copyProperties(stockDay3002List1.get(i), sunEntity);
                        sunEntityList.add(sunEntity);
                    }
                }
                Collections.sort(wuYunEntityList, new Comparator<WuYunEntity>() {
                    @Override
                    public int compare(WuYunEntity o1, WuYunEntity o2) {
                        long i = o2.getDate().getTime() - o1.getDate().getTime();
                        if (i > 0) {
                            return 1;
                        } else if (i < 0) {
                            return -1;
                        }
                        return 0;
                    }
                });
                Collections.sort(cengDieEntityList, new Comparator<CengDieEntity>() {
                    @Override
                    public int compare(CengDieEntity o1, CengDieEntity o2) {
                        long i = o2.getDate().getTime() - o1.getDate().getTime();
                        if (i > 0) {
                            return 1;
                        } else if (i < 0) {
                            return -1;
                        }
                        return 0;
                    }
                });
                Collections.sort(sunEntityList, new Comparator<SunEntity>() {
                    @Override
                    public int compare(SunEntity o1, SunEntity o2) {
                        long i = o2.getDate().getTime() - o1.getDate().getTime();
                        if (i > 0) {
                            return 1;
                        } else if (i < 0) {
                            return -1;
                        }
                        return 0;
                    }
                });
                Collections.sort(pingDingEntityList, new Comparator<PingDingEntity>() {
                    @Override
                    public int compare(PingDingEntity o1, PingDingEntity o2) {
                        long i = o2.getDate().getTime() - o1.getDate().getTime();
                        if (i > 0) {
                            return 1;
                        } else if (i < 0) {
                            return -1;
                        }
                        return 0;
                    }
                });
                //技术
                for (StockDayScience3002 stockDayScience3002 : stockDayScience3002List) {
                    if (stockDay3002List1.get(0).getDate().compareTo(stockDayScience3002.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience3002, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay3002List1.get(1).getDate().compareTo(stockDayScience3002.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience3002, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay3002List1.get(2).getDate().compareTo(stockDayScience3002.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience3002, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay3002List1.get(3).getDate().compareTo(stockDayScience3002.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience3002, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay3002List1.get(4).getDate().compareTo(stockDayScience3002.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience3002, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay3002List1.get(5).getDate().compareTo(stockDayScience3002.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience3002, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay3002List1.get(6).getDate().compareTo(stockDayScience3002.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience3002, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay3002List1.get(7).getDate().compareTo(stockDayScience3002.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience3002, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay3002List1.get(8).getDate().compareTo(stockDayScience3002.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience3002, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay3002List1.get(9).getDate().compareTo(stockDayScience3002.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience3002, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                }
                Collections.sort(scienceEntityList, new Comparator<ScienceEntity>() {
                    @Override
                    public int compare(ScienceEntity o1, ScienceEntity o2) {
                        long i = o2.getDate().getTime() - o1.getDate().getTime();
                        if (i > 0) {
                            return 1;
                        } else if (i < 0) {
                            return -1;
                        }
                        return 0;
                    }
                });
                //大盘
                StockDayYanPan24 stockDayYanPan24 = new StockDayYanPan24();
                //层叠
                CengDieVo cengDieVo = StackUtil.getcengdie(cengDieEntityList);
                //当日
                DangRiVo dangRiVo = DangRiUtil.getDangRi(dangRiEntityList.get(0));
                //平顶
                PingQiVo pingQiVo = AbreastUtil.getPingDing(pingDingEntityList);
                //阳光
                SunVo sunVo = SunUtil.getSun(sunEntityList);
                //乌云
                WuYunVo wuYunVo = BlackCloudsUtil.getWuYun(wuYunEntityList);
                //一日传
                YirichuanVo yirichuanVo = YirichuanUtil.getYiRiChuan(dangRiEntityList.get(0), scienceEntityList.get(0));

                //kdj
                KDJScienceVo kdjScienceVo = KDJUtil.getKDJScience(scienceEntityList);
                MACDScienceVo macdScienceVo = MACDUtil.getMACDScience(scienceEntityList);
                QuantityScienceVo quantityScienceVo = MakeQuantityMAUtil.getQuantityScience(scienceEntityList);
                PriceScienceVo priceScienceVo = PriceMAUtil.getPriceScience(scienceEntityList);
                String str = GetYiRiXian.getYiRiXian(dangRiVo, yirichuanVo);
                if (str != null) {
                    stockDayYanPan24.setDangRi(str);
                }
                XianVo xianVo = GetXian.getXian(pingQiVo, sunVo, wuYunVo, cengDieVo);
                if (xianVo.getSanri() != null) {
                    stockDayYanPan24.setSanXian(xianVo.getSanri());
                }

                if (kdjScienceVo != null) {
                    stockDayYanPan24.setKdj(GetkdjString.getkdjString(kdjScienceVo));
                }
                if (macdScienceVo != null) {
                    stockDayYanPan24.setMacd(GetMacdString.getMacdString(macdScienceVo));
                }

                if (quantityScienceVo != null) {
                    stockDayYanPan24.setQuantityMa(quantityScienceVo.getJunxian());
                }
                if (priceScienceVo != null) {
                    stockDayYanPan24.setPriceMa(priceScienceVo.getJunxian());
                }

                stockDayVoList= GetYuCeZhuHeListUtil.get24List(stockDayYanPan24,stockDayVo,stockDayVoList);
            }
        }
        return stockDayVoList;
    }

    public List<StockDayVo> get33ListStock(StockCode stockCode, List<StockDayVo> stockDayVoList) throws IOException {
        StockDayVo stockDayVo = new StockDayVo();
        stockDayVo.setCode(stockCode.getEx() + stockCode.getId());
        stockDayVo.setName(stockCode.getName());
        //获取前60天记录，并且取前20天的有效记录
        Page<StockDay3002> page = new Page<>(1, 60);
        List<StockDay3002> stockDay3002List = stockDay3002Service.selectByCodeAndExPage(page, stockCode.getId(), stockCode.getEx());
        Collections.sort(stockDay3002List, new Comparator<StockDay3002>() {
            @Override
            public int compare(StockDay3002 o1, StockDay3002 o2) {
                long i = o2.getDate().getTime() - o1.getDate().getTime();
                if (i > 0) {
                    return 1;
                } else if (i < 0) {
                    return -1;
                }
                return 0;
            }
        });
        Page<StockDayScience3002> page1=new Page<>(1,60);
        List<StockDayScience3002> stockDayScience3002List = stockDayScience3002Service.selectByPage(page1,stockCode.getId(), stockCode.getEx());//技术先
        //计算指标，从数据库中获取对于的数据
        List<CengDieEntity> cengDieEntityList = new ArrayList<>();
        List<DangRiEntity> dangRiEntityList = new ArrayList<>();
        List<PingDingEntity> pingDingEntityList = new ArrayList<>();
        List<SunEntity> sunEntityList = new ArrayList<>();
        List<WuYunEntity> wuYunEntityList = new ArrayList<>();
        List<ScienceEntity> scienceEntityList = new ArrayList<>();
        List<StockDay3002> stockDay3002List1 = new ArrayList<>();
        for (StockDay3002 stockDay3002 : stockDay3002List) {
            if (stockDay3002.getOpeningPrice().compareTo(new BigDecimal(0)) != 0 && stockDay3002.getOpeningPrice() != null && stockDay3002.getLclosePrice() != null && stockDay3002.getLclosePrice().compareTo(new BigDecimal(0)) != 0 && stockDay3002.getChangePoints() != null) {
                stockDay3002List1.add(stockDay3002);
            }
            if (stockDay3002List1.size() == 20) {
                stockDayVo.setDate(DateUtil.get2String(stockDay3002List1.get(0).getDate()));
                for (int i = 0; i < stockDay3002List1.size(); i++) {
                    if (i == 0) {
                        DangRiEntity dangRiEntity = new DangRiEntity();
                        BeanUtils.copyProperties(stockDay3002List1.get(i), dangRiEntity);
                        dangRiEntityList.add(dangRiEntity);
                    }
                    if (i < 4) {
                        WuYunEntity wuYunEntity = new WuYunEntity();
                        BeanUtils.copyProperties(stockDay3002List1.get(i), wuYunEntity);
                        wuYunEntityList.add(wuYunEntity);
                    }
                    if ( i < 5) {
                        CengDieEntity cengDieEntity = new CengDieEntity();
                        BeanUtils.copyProperties(stockDay3002List1.get(i), cengDieEntity);
                        cengDieEntityList.add(cengDieEntity);
                    }
                    if (i < 10) {
                        PingDingEntity pingDingEntity = new PingDingEntity();
                        BeanUtils.copyProperties(stockDay3002List1.get(i), pingDingEntity);
                        pingDingEntityList.add(pingDingEntity);

                        SunEntity sunEntity = new SunEntity();
                        BeanUtils.copyProperties(stockDay3002List1.get(i), sunEntity);
                        sunEntityList.add(sunEntity);
                    }
                }
                Collections.sort(wuYunEntityList, new Comparator<WuYunEntity>() {
                    @Override
                    public int compare(WuYunEntity o1, WuYunEntity o2) {
                        long i = o2.getDate().getTime() - o1.getDate().getTime();
                        if (i > 0) {
                            return 1;
                        } else if (i < 0) {
                            return -1;
                        }
                        return 0;
                    }
                });
                Collections.sort(cengDieEntityList, new Comparator<CengDieEntity>() {
                    @Override
                    public int compare(CengDieEntity o1, CengDieEntity o2) {
                        long i = o2.getDate().getTime() - o1.getDate().getTime();
                        if (i > 0) {
                            return 1;
                        } else if (i < 0) {
                            return -1;
                        }
                        return 0;
                    }
                });
                Collections.sort(sunEntityList, new Comparator<SunEntity>() {
                    @Override
                    public int compare(SunEntity o1, SunEntity o2) {
                        long i = o2.getDate().getTime() - o1.getDate().getTime();
                        if (i > 0) {
                            return 1;
                        } else if (i < 0) {
                            return -1;
                        }
                        return 0;
                    }
                });
                Collections.sort(pingDingEntityList, new Comparator<PingDingEntity>() {
                    @Override
                    public int compare(PingDingEntity o1, PingDingEntity o2) {
                        long i = o2.getDate().getTime() - o1.getDate().getTime();
                        if (i > 0) {
                            return 1;
                        } else if (i < 0) {
                            return -1;
                        }
                        return 0;
                    }
                });
                //技术
                for (StockDayScience3002 stockDayScience3002 : stockDayScience3002List) {
                    if (stockDay3002List1.get(0).getDate().compareTo(stockDayScience3002.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience3002, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay3002List1.get(1).getDate().compareTo(stockDayScience3002.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience3002, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay3002List1.get(2).getDate().compareTo(stockDayScience3002.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience3002, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay3002List1.get(3).getDate().compareTo(stockDayScience3002.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience3002, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay3002List1.get(4).getDate().compareTo(stockDayScience3002.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience3002, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay3002List1.get(5).getDate().compareTo(stockDayScience3002.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience3002, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay3002List1.get(6).getDate().compareTo(stockDayScience3002.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience3002, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay3002List1.get(7).getDate().compareTo(stockDayScience3002.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience3002, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay3002List1.get(8).getDate().compareTo(stockDayScience3002.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience3002, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay3002List1.get(9).getDate().compareTo(stockDayScience3002.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience3002, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                }
                Collections.sort(scienceEntityList, new Comparator<ScienceEntity>() {
                    @Override
                    public int compare(ScienceEntity o1, ScienceEntity o2) {
                        long i = o2.getDate().getTime() - o1.getDate().getTime();
                        if (i > 0) {
                            return 1;
                        } else if (i < 0) {
                            return -1;
                        }
                        return 0;
                    }
                });
                //大盘
                StockDayYanPan33 stockDayYanPan33 = new StockDayYanPan33();
                //层叠
                CengDieVo cengDieVo = StackUtil.getcengdie(cengDieEntityList);
                //本票
                //当日
                DangRiVo dangRiVo = DangRiUtil.getDangRi(dangRiEntityList.get(0));
                //平顶
                PingQiVo pingQiVo = AbreastUtil.getPingDing(pingDingEntityList);
                //阳光
                SunVo sunVo = SunUtil.getSun(sunEntityList);
                //乌云
                WuYunVo wuYunVo = BlackCloudsUtil.getWuYun(wuYunEntityList);
                //一日传
                YirichuanVo yirichuanVo = YirichuanUtil.getYiRiChuan(dangRiEntityList.get(0), scienceEntityList.get(0));
                //kdj
                KDJScienceVo kdjScienceVo = KDJUtil.getKDJScience(scienceEntityList);
                MACDScienceVo macdScienceVo = MACDUtil.getMACDScience(scienceEntityList);
                PriceScienceVo priceScienceVo = PriceMAUtil.getPriceScience(scienceEntityList);

                String str = GetYiRiXian.getYiRiXian(dangRiVo, yirichuanVo);
                if (str != null) {
                    stockDayYanPan33.setDangRi(str);
                }
                XianVo xianVo = GetXian.getXian(pingQiVo, sunVo, wuYunVo, cengDieVo);
                if (xianVo.getLiangri() != null) {
                    stockDayYanPan33.setLiangXian(xianVo.getLiangri());
                }
                if (xianVo.getSanri() != null) {
                    stockDayYanPan33.setSanXian(xianVo.getSanri());
                }
                if (kdjScienceVo != null) {
                    stockDayYanPan33.setKdj(GetkdjString.getkdjString(kdjScienceVo));
                }
                if (macdScienceVo != null) {
                    stockDayYanPan33.setMacd(GetMacdString.getMacdString(macdScienceVo));
                }
                if (priceScienceVo != null) {
                    stockDayYanPan33.setPriceMa(priceScienceVo.getJunxian());
                }

                stockDayVoList=GetYuCeZhuHeListUtil.get33List(stockDayYanPan33,stockDayVo,stockDayVoList);
            }
        }
        return stockDayVoList;
    }

    public List<StockDayVo> get42ListStock(StockCode stockCode, List<StockDayVo> stockDayVoList) throws IOException {
        StockDayVo stockDayVo = new StockDayVo();
        stockDayVo.setCode(stockCode.getEx() + stockCode.getId());
        stockDayVo.setName(stockCode.getName());
        //获取前60天记录，并且取前20天的有效记录
        Page<StockDay3002> page = new Page<>(1, 60);
        List<StockDay3002> stockDay3002List = stockDay3002Service.selectByCodeAndExPage(page, stockCode.getId(), stockCode.getEx());
        Collections.sort(stockDay3002List, new Comparator<StockDay3002>() {
            @Override
            public int compare(StockDay3002 o1, StockDay3002 o2) {
                long i = o2.getDate().getTime() - o1.getDate().getTime();
                if (i > 0) {
                    return 1;
                } else if (i < 0) {
                    return -1;
                }
                return 0;
            }
        });
        Page<StockDayScience3002> page1=new Page<>(1,60);
        List<StockDayScience3002> stockDayScience3002List = stockDayScience3002Service.selectByPage(page1,stockCode.getId(), stockCode.getEx());//技术先
        //计算指标，从数据库中获取对于的数据
        List<CengDieEntity> cengDieEntityList = new ArrayList<>();
        List<DangRiEntity> dangRiEntityList = new ArrayList<>();
        List<PingDingEntity> pingDingEntityList = new ArrayList<>();
        List<SunEntity> sunEntityList = new ArrayList<>();
        List<WuYunEntity> wuYunEntityList = new ArrayList<>();
        List<ScienceEntity> scienceEntityList = new ArrayList<>();
        List<StockDay3002> stockDay3002List1 = new ArrayList<>();
        for (StockDay3002 stockDay3002 : stockDay3002List) {
            if (stockDay3002.getOpeningPrice().compareTo(new BigDecimal(0)) != 0 && stockDay3002.getOpeningPrice() != null && stockDay3002.getLclosePrice() != null && stockDay3002.getLclosePrice().compareTo(new BigDecimal(0)) != 0 && stockDay3002.getChangePoints() != null) {
                stockDay3002List1.add(stockDay3002);
            }
            if (stockDay3002List1.size() == 20) {
                stockDayVo.setDate(DateUtil.get2String(stockDay3002List1.get(0).getDate()));
                for (int i = 0; i < stockDay3002List1.size(); i++) {
                    if (i == 0) {
                        DangRiEntity dangRiEntity = new DangRiEntity();
                        BeanUtils.copyProperties(stockDay3002List1.get(i), dangRiEntity);
                        dangRiEntityList.add(dangRiEntity);
                    }
                    if (i < 4) {
                        WuYunEntity wuYunEntity = new WuYunEntity();
                        BeanUtils.copyProperties(stockDay3002List1.get(i), wuYunEntity);
                        wuYunEntityList.add(wuYunEntity);
                    }
                    if ( i < 5) {
                        CengDieEntity cengDieEntity = new CengDieEntity();
                        BeanUtils.copyProperties(stockDay3002List1.get(i), cengDieEntity);
                        cengDieEntityList.add(cengDieEntity);
                    }
                    if (i < 10) {
                        PingDingEntity pingDingEntity = new PingDingEntity();
                        BeanUtils.copyProperties(stockDay3002List1.get(i), pingDingEntity);
                        pingDingEntityList.add(pingDingEntity);

                        SunEntity sunEntity = new SunEntity();
                        BeanUtils.copyProperties(stockDay3002List1.get(i), sunEntity);
                        sunEntityList.add(sunEntity);
                    }
                }
                Collections.sort(wuYunEntityList, new Comparator<WuYunEntity>() {
                    @Override
                    public int compare(WuYunEntity o1, WuYunEntity o2) {
                        long i = o2.getDate().getTime() - o1.getDate().getTime();
                        if (i > 0) {
                            return 1;
                        } else if (i < 0) {
                            return -1;
                        }
                        return 0;
                    }
                });
                Collections.sort(cengDieEntityList, new Comparator<CengDieEntity>() {
                    @Override
                    public int compare(CengDieEntity o1, CengDieEntity o2) {
                        long i = o2.getDate().getTime() - o1.getDate().getTime();
                        if (i > 0) {
                            return 1;
                        } else if (i < 0) {
                            return -1;
                        }
                        return 0;
                    }
                });
                Collections.sort(sunEntityList, new Comparator<SunEntity>() {
                    @Override
                    public int compare(SunEntity o1, SunEntity o2) {
                        long i = o2.getDate().getTime() - o1.getDate().getTime();
                        if (i > 0) {
                            return 1;
                        } else if (i < 0) {
                            return -1;
                        }
                        return 0;
                    }
                });
                Collections.sort(pingDingEntityList, new Comparator<PingDingEntity>() {
                    @Override
                    public int compare(PingDingEntity o1, PingDingEntity o2) {
                        long i = o2.getDate().getTime() - o1.getDate().getTime();
                        if (i > 0) {
                            return 1;
                        } else if (i < 0) {
                            return -1;
                        }
                        return 0;
                    }
                });
                //技术
                for (StockDayScience3002 stockDayScience3002 : stockDayScience3002List) {
                    if (stockDay3002List1.get(0).getDate().compareTo(stockDayScience3002.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience3002, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay3002List1.get(1).getDate().compareTo(stockDayScience3002.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience3002, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay3002List1.get(2).getDate().compareTo(stockDayScience3002.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience3002, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay3002List1.get(3).getDate().compareTo(stockDayScience3002.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience3002, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay3002List1.get(4).getDate().compareTo(stockDayScience3002.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience3002, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay3002List1.get(5).getDate().compareTo(stockDayScience3002.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience3002, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay3002List1.get(6).getDate().compareTo(stockDayScience3002.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience3002, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay3002List1.get(7).getDate().compareTo(stockDayScience3002.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience3002, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay3002List1.get(8).getDate().compareTo(stockDayScience3002.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience3002, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay3002List1.get(9).getDate().compareTo(stockDayScience3002.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience3002, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                }
                Collections.sort(scienceEntityList, new Comparator<ScienceEntity>() {
                    @Override
                    public int compare(ScienceEntity o1, ScienceEntity o2) {
                        long i = o2.getDate().getTime() - o1.getDate().getTime();
                        if (i > 0) {
                            return 1;
                        } else if (i < 0) {
                            return -1;
                        }
                        return 0;
                    }
                });

                StockDayYanPan42 stockDayYanPan42 = new StockDayYanPan42();
                //层叠
                CengDieVo cengDieVo = StackUtil.getcengdie(cengDieEntityList);
                //当日
                DangRiVo dangRiVo = DangRiUtil.getDangRi(dangRiEntityList.get(0));
                //平顶
                PingQiVo pingQiVo = AbreastUtil.getPingDing(pingDingEntityList);
                //阳光
                SunVo sunVo = SunUtil.getSun(sunEntityList);
                //乌云
                WuYunVo wuYunVo = BlackCloudsUtil.getWuYun(wuYunEntityList);
                //一日传
                YirichuanVo yirichuanVo = YirichuanUtil.getYiRiChuan(dangRiEntityList.get(0), scienceEntityList.get(0));
                //kdj
                KDJScienceVo kdjScienceVo = KDJUtil.getKDJScience(scienceEntityList);
                PriceScienceVo priceScienceVo = PriceMAUtil.getPriceScience(scienceEntityList);
                String str = GetYiRiXian.getYiRiXian(dangRiVo, yirichuanVo);
                if (str != null) {
                    stockDayYanPan42.setDangRi(str);
                }
                XianVo xianVo = GetXian.getXian(pingQiVo, sunVo, wuYunVo, cengDieVo);
                if (xianVo.getLiangri() != null) {
                    stockDayYanPan42.setLiangXian(xianVo.getLiangri());
                }
                if (xianVo.getSanri() != null) {
                    stockDayYanPan42.setSanXian(xianVo.getSanri());
                }
                if (xianVo.getSiri() != null) {
                    stockDayYanPan42.setSiXian(xianVo.getSiri());
                }
                if (kdjScienceVo != null) {
                    stockDayYanPan42.setKdj(GetkdjString.getkdjString(kdjScienceVo));
                }
                if (priceScienceVo != null) {
                    stockDayYanPan42.setPriceMa(priceScienceVo.getJunxian());
                }

                stockDayVoList= GetYuCeZhuHeListUtil.get42List(stockDayYanPan42,stockDayVo,stockDayVoList);
            }
        }
        return stockDayVoList;
    }

    public List<StockDayVo> getBenPanListStock(StockCode stockCode, List<StockDayVo> stockDayVoList) throws IOException {
        StockDayVo stockDayVo = new StockDayVo();
        stockDayVo.setCode(stockCode.getEx() + stockCode.getId());
        stockDayVo.setName(stockCode.getName());
        //获取前60天记录，并且取前20天的有效记录
        Page<StockDay3002> page = new Page<>(1, 60);
        List<StockDay3002> stockDay3002List = stockDay3002Service.selectByCodeAndExPage(page, stockCode.getId(), stockCode.getEx());
        Collections.sort(stockDay3002List, new Comparator<StockDay3002>() {
            @Override
            public int compare(StockDay3002 o1, StockDay3002 o2) {
                long i = o2.getDate().getTime() - o1.getDate().getTime();
                if (i > 0) {
                    return 1;
                } else if (i < 0) {
                    return -1;
                }
                return 0;
            }
        });
        //计算指标，从数据库中获取对于的数据
        List<ChangeEntity> changeEntityList = new ArrayList<>();
        List<StockDay3002> stockDay3002List1 = new ArrayList<>();
        for (StockDay3002 stockDay3002 : stockDay3002List) {
            if (stockDay3002.getOpeningPrice().compareTo(new BigDecimal(0)) != 0 && stockDay3002.getOpeningPrice() != null && stockDay3002.getLclosePrice() != null && stockDay3002.getLclosePrice().compareTo(new BigDecimal(0)) != 0 && stockDay3002.getChangePoints() != null) {
                stockDay3002List1.add(stockDay3002);
            }
            if (stockDay3002List1.size() == 20) {
                stockDayVo.setDate(DateUtil.get2String(stockDay3002List1.get(0).getDate()));
                for (int i = 0; i < stockDay3002List1.size(); i++) {
                    if (i < 20) {
                        ChangeEntity changeEntity = new ChangeEntity();
                        BeanUtils.copyProperties(stockDay3002List1.get(i), changeEntity);
                        changeEntityList.add(changeEntity);
                    }
                }
                Collections.sort(changeEntityList, new Comparator<ChangeEntity>() {
                    @Override
                    public int compare(ChangeEntity o1, ChangeEntity o2) {
                        long i = o2.getDate().getTime() - o1.getDate().getTime();
                        if (i > 0) {
                            return 1;
                        } else if (i < 0) {
                            return -1;
                        }
                        return 0;
                    }
                });

                StockDayYanPanBenpan stockDayYanPanBenpan = new StockDayYanPanBenpan();
                //本票
                RateOfChangeVo rateOfChangeVo = RateOfChangeUtil.getRateOfChange(changeEntityList);
                if (rateOfChangeVo != null) {
                    stockDayYanPanBenpan.setBenPiao1(GetRate.getRate(rateOfChangeVo.getBeforeChange1()));
                    stockDayYanPanBenpan.setBenPiao2(GetRate.getRate(rateOfChangeVo.getBeforeChange2()));
                    stockDayYanPanBenpan.setBenPiao3(GetRate.getRate(rateOfChangeVo.getBeforeChange3()));
                    stockDayYanPanBenpan.setBenPiao5(GetRate.getRate(rateOfChangeVo.getBeforeChange5()));
                    stockDayYanPanBenpan.setBenPiao13(GetRate.getRate(rateOfChangeVo.getBeforeChange13()));
                    stockDayYanPanBenpan.setBenPiao20(GetRate.getRate(rateOfChangeVo.getBeforeChange20()));
                }

                stockDayVoList= GetYuCeZhuHeListUtil.getBenPanList(stockDayYanPanBenpan,stockDayVo,stockDayVoList);
            }
        }
        return stockDayVoList;
    }

}
