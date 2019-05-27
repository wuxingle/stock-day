package com.stock.stockday.newService.list;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.stock.apicommon.entity.CengDieEntity;
import com.stock.apicommon.entity.ChangeEntity;
import com.stock.apicommon.entity.DaPanChangeEntity;
import com.stock.apicommon.entity.DangRiEntity;
import com.stock.apicommon.entity.PingDingEntity;
import com.stock.apicommon.entity.ScienceEntity;
import com.stock.apicommon.entity.SunEntity;
import com.stock.apicommon.entity.WuYunEntity;
import com.stock.apicommon.entity.YanPanEntity;
import com.stock.apicommon.utils.KDJUtil;
import com.stock.apicommon.utils.MACDUtil;
import com.stock.apicommon.utils.MakeQuantityMAUtil;
import com.stock.apicommon.utils.PriceMAUtil;
import com.stock.apicommon.utils.RSIUtil;
import com.stock.apicommon.utils.WRUtil;
import com.stock.apicommon.utils.patterning.AbreastUtil;
import com.stock.apicommon.utils.patterning.BlackCloudsUtil;
import com.stock.apicommon.utils.patterning.DaPanUtil;
import com.stock.apicommon.utils.patterning.DangRiUtil;
import com.stock.apicommon.utils.patterning.Qian20Xing;
import com.stock.apicommon.utils.patterning.RateOfChangeUtil;
import com.stock.apicommon.utils.patterning.StackUtil;
import com.stock.apicommon.utils.patterning.SunUtil;
import com.stock.apicommon.utils.patterning.YirichuanUtil;
import com.stock.apicommon.vo.CengDieVo;
import com.stock.apicommon.vo.DaPanRateOfChangeVo;
import com.stock.apicommon.vo.DangRiVo;
import com.stock.apicommon.vo.KDJScienceVo;
import com.stock.apicommon.vo.MACDScienceVo;
import com.stock.apicommon.vo.PingQiVo;
import com.stock.apicommon.vo.PriceAndMaRelationVo;
import com.stock.apicommon.vo.PriceScienceVo;
import com.stock.apicommon.vo.QuantityScienceVo;
import com.stock.apicommon.vo.RSIScienceVo;
import com.stock.apicommon.vo.RateOfChangeVo;
import com.stock.apicommon.vo.SunVo;
import com.stock.apicommon.vo.WRScienceVo;
import com.stock.apicommon.vo.WuYunVo;
import com.stock.apicommon.vo.XianVo;
import com.stock.apicommon.vo.YirichuanVo;
import com.stock.stockday.entity.StockCode;
import com.stock.stockday.entity.StockDay0000;
import com.stock.stockday.entity.StockDay0002;
import com.stock.stockday.entity.StockDay399;
import com.stock.stockday.entity.StockDay6000;
import com.stock.stockday.entity.StockDay6000;
import com.stock.stockday.entity.StockDayScience0002;
import com.stock.stockday.entity.StockDayScience6000;
import com.stock.stockday.entity.StockDayScience6000;
import com.stock.stockday.entity.StockDayYanPan;
import com.stock.stockday.service.StockDay6000Service;
import com.stock.stockday.service.StockDayScience6000Service;
import com.stock.stockday.util.DateUtil;
import com.stock.stockday.util.GetMacdString;
import com.stock.stockday.util.GetRSIString;
import com.stock.stockday.util.GetRate;
import com.stock.stockday.util.GetWRString;
import com.stock.stockday.util.GetXian;
import com.stock.stockday.util.GetYiRiXian;
import com.stock.stockday.util.GetkdjString;
import com.stock.stockday.util.NewCommonSaveFile;
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
public class NewGetListStock6000 {
    @Autowired
    private StockDay6000Service stockDay6000Service;
    @Autowired
    private StockDayScience6000Service stockDayScience6000Service;


    public List<StockDayVo> getKMPTDListStock(StockCode stockCode, List<StockDayVo> stockDayVoList, List<StockDay0000> stockDay000001List) throws IOException {
        StockDayVo stockDayVo = new StockDayVo();
        stockDayVo.setCode(stockCode.getEx() + stockCode.getId());
        stockDayVo.setName(stockCode.getName());
        //获取前60天记录，并且取前20天的有效记录
        Page<StockDay6000> page = new Page<>(1, 60);
        List<StockDay6000> stockDay6000List = stockDay6000Service.selectByCodeAndExPage(page, stockCode.getId(), stockCode.getEx());
        Collections.sort(stockDay6000List, new Comparator<StockDay6000>() {
            @Override
            public int compare(StockDay6000 o1, StockDay6000 o2) {
                long i = o2.getDate().getTime() - o1.getDate().getTime();
                if (i > 0) {
                    return 1;
                } else if (i < 0) {
                    return -1;
                }
                return 0;
            }
        });
        stockDayVo.setDate(DateUtil.get2String(stockDay6000List.get(0).getDate()));
        Page<StockDayScience6000> page1=new Page<>(1,60);
        List<StockDayScience6000> stockDayScience6000List = stockDayScience6000Service.selectByPage(page1,stockCode.getId(), stockCode.getEx());//技术先
        //计算指标，从数据库中获取对于的数据
        List<CengDieEntity> cengDieEntityList = new ArrayList<>();
        List<DangRiEntity> dangRiEntityList = new ArrayList<>();
        List<PingDingEntity> pingDingEntityList = new ArrayList<>();
        List<SunEntity> sunEntityList = new ArrayList<>();
        List<WuYunEntity> wuYunEntityList = new ArrayList<>();
        List<YanPanEntity> yanPanEntityList = new ArrayList<>();
        List<ChangeEntity> changeEntityList = new ArrayList<>();
        List<ScienceEntity> scienceEntityList = new ArrayList<>();
        List<DaPanChangeEntity> daPanChangeEntityList = new ArrayList<>();
        List<StockDay6000> stockDay6000List1 = new ArrayList<>();
        for (StockDay6000 stockDay6000 : stockDay6000List) {
            if (stockDay6000.getOpeningPrice().compareTo(new BigDecimal(0)) != 0 && stockDay6000.getOpeningPrice() != null && stockDay6000.getLclosePrice() != null && stockDay6000.getLclosePrice().compareTo(new BigDecimal(0)) != 0 && stockDay6000.getChangePoints() != null) {
                stockDay6000List1.add(stockDay6000);
            }
            if (stockDay6000List1.size() == 20) {
                stockDayVo.setDate(DateUtil.get2String(stockDay6000List1.get(0).getDate()));
                for (int i = 0; i < stockDay6000List1.size(); i++) {
                    if (i == 0) {
                        DangRiEntity dangRiEntity = new DangRiEntity();
                        BeanUtils.copyProperties(stockDay6000List1.get(i), dangRiEntity);
                        dangRiEntityList.add(dangRiEntity);
                    }
                    if (i < 4) {
                        WuYunEntity wuYunEntity = new WuYunEntity();
                        BeanUtils.copyProperties(stockDay6000List1.get(i), wuYunEntity);
                        wuYunEntityList.add(wuYunEntity);
                    }
                    if ( i < 5) {
                        CengDieEntity cengDieEntity = new CengDieEntity();
                        BeanUtils.copyProperties(stockDay6000List1.get(i), cengDieEntity);
                        cengDieEntityList.add(cengDieEntity);
                    }
                    if (i < 10) {
                        PingDingEntity pingDingEntity = new PingDingEntity();
                        BeanUtils.copyProperties(stockDay6000List1.get(i), pingDingEntity);
                        pingDingEntityList.add(pingDingEntity);

                        SunEntity sunEntity = new SunEntity();
                        BeanUtils.copyProperties(stockDay6000List1.get(i), sunEntity);
                        sunEntityList.add(sunEntity);
                    }
                    if (i < 20) {
                        ChangeEntity changeEntity = new ChangeEntity();
                        BeanUtils.copyProperties(stockDay6000List1.get(i), changeEntity);
                        changeEntityList.add(changeEntity);
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
                for (StockDayScience6000 stockDayScience6000 : stockDayScience6000List) {
                    if (stockDay6000List1.get(0).getDate().compareTo(stockDayScience6000.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6000, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay6000List1.get(1).getDate().compareTo(stockDayScience6000.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6000, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay6000List1.get(2).getDate().compareTo(stockDayScience6000.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6000, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay6000List1.get(3).getDate().compareTo(stockDayScience6000.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6000, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay6000List1.get(4).getDate().compareTo(stockDayScience6000.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6000, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay6000List1.get(5).getDate().compareTo(stockDayScience6000.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6000, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay6000List1.get(6).getDate().compareTo(stockDayScience6000.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6000, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay6000List1.get(7).getDate().compareTo(stockDayScience6000.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6000, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay6000List1.get(8).getDate().compareTo(stockDayScience6000.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6000, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay6000List1.get(9).getDate().compareTo(stockDayScience6000.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6000, scienceEntity);
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
                for (StockDay0000 stockDay3996000 : stockDay000001List) {
                    if (stockDay6000List1.get(0).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(1).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(2).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(3).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(4).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(5).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(6).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(7).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(8).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(9).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(10).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(11).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(12).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(13).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(14).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(15).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(16).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(17).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(18).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(19).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                }
                Collections.sort(daPanChangeEntityList, new Comparator<DaPanChangeEntity>() {
                    @Override
                    public int compare(DaPanChangeEntity o1, DaPanChangeEntity o2) {
                        long i = o2.getDate().getTime() - o1.getDate().getTime();
                        if (i > 0) {
                            return 1;
                        } else if (i < 0) {
                            return -1;
                        }
                        return 0;
                    }
                });
                StockDayYanPan stockDayYanPan = new StockDayYanPan();
                //大盘
                DaPanRateOfChangeVo daPanRateOfChangeVo = DaPanUtil.getDaPanRateOfChange(daPanChangeEntityList);
                //层叠
                CengDieVo cengDieVo = StackUtil.getcengdie(cengDieEntityList);
                //本票
                RateOfChangeVo rateOfChangeVo = RateOfChangeUtil.getRateOfChange(changeEntityList);
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
                PriceAndMaRelationVo priceAndMaRelationVo=PriceMAUtil.getPriceAndMaRelation(dangRiEntityList.get(0), scienceEntityList.get(0));
                String change_20= Qian20Xing.getQian20Xing(changeEntityList);
                //kdj
                KDJScienceVo kdjScienceVo = KDJUtil.getKDJScience1(scienceEntityList,changeEntityList);
                MACDScienceVo macdScienceVo = MACDUtil.getMACDScience(scienceEntityList);
                QuantityScienceVo quantityScienceVo = MakeQuantityMAUtil.getQuantityScience(scienceEntityList);
                PriceScienceVo priceScienceVo = PriceMAUtil.getPriceScience(scienceEntityList);
                RSIScienceVo rsiScienceVo = RSIUtil.getRSIScience(scienceEntityList);
                WRScienceVo wrScienceVo = WRUtil.getWRScience(scienceEntityList);
                if (daPanRateOfChangeVo != null) {
                    stockDayYanPan.setDaPan1(GetRate.getRate(daPanRateOfChangeVo.getBeforeDPChange1()));
                    stockDayYanPan.setDaPan2(GetRate.getRate(daPanRateOfChangeVo.getBeforeDPChange2()));
                    stockDayYanPan.setDaPan3(GetRate.getRate(daPanRateOfChangeVo.getBeforeDPChange3()));
                    stockDayYanPan.setDaPan5(GetRate.getRate(daPanRateOfChangeVo.getBeforeDPChange5()));
                    stockDayYanPan.setDaPan8(GetRate.getRate(daPanRateOfChangeVo.getBeforeDPChange8()));
                    stockDayYanPan.setDaPan13(GetRate.getRate(daPanRateOfChangeVo.getBeforeDPChange13()));
                    stockDayYanPan.setDaPan20(GetRate.getRate(daPanRateOfChangeVo.getBeforeDPChange20()));
                }
                if (rateOfChangeVo != null) {
                    stockDayYanPan.setBenPiao1(GetRate.getRate(rateOfChangeVo.getBeforeChange1()));
                    stockDayYanPan.setBenPiao2(GetRate.getRate(rateOfChangeVo.getBeforeChange2()));
                    stockDayYanPan.setBenPiao3(GetRate.getRate(rateOfChangeVo.getBeforeChange3()));
                    stockDayYanPan.setBenPiao5(GetRate.getRate(rateOfChangeVo.getBeforeChange5()));
                    stockDayYanPan.setBenPiao8(GetRate.getRate(rateOfChangeVo.getBeforeChange8()));
                    stockDayYanPan.setBenPiao13(GetRate.getRate(rateOfChangeVo.getBeforeChange13()));
                    stockDayYanPan.setBenPiao20(GetRate.getRate(rateOfChangeVo.getBeforeChange20()));
                }
                String str = GetYiRiXian.getYiRiXian(dangRiVo, yirichuanVo);
                if (str != null) {
                    stockDayYanPan.setDangRi(str);
                }
                if (priceAndMaRelationVo != null) {
                    stockDayYanPan.setPriceAndMaRelation(priceAndMaRelationVo.getPriceAndMaRelation());
                }
                if (change_20 != null) {
                    stockDayYanPan.setQian20TuXing(change_20);
                }
                XianVo xianVo = GetXian.getXian(pingQiVo, sunVo, wuYunVo, cengDieVo);
                if (xianVo.getLiangri() != null) {
                    stockDayYanPan.setLiangXian(xianVo.getLiangri());
                }
                if (xianVo.getSanri() != null) {
                    stockDayYanPan.setSanXian(xianVo.getSanri());
                }
                if (xianVo.getSiri() != null) {
                    stockDayYanPan.setSiXian(xianVo.getSiri());
                }
                if (xianVo.getWuri() != null) {
                    stockDayYanPan.setWuXian(xianVo.getWuri());
                }
                if (xianVo.getDuori() != null) {
                    stockDayYanPan.setDuoXian(xianVo.getDuori());
                }
                if (kdjScienceVo != null) {
                    stockDayYanPan.setKdj(GetkdjString.getkdjString(kdjScienceVo));
                }
                if (macdScienceVo != null) {
                    stockDayYanPan.setMacd(GetMacdString.getMacdString(macdScienceVo));
                }
                if (rsiScienceVo != null) {
                    stockDayYanPan.setRsi(GetRSIString.getRSIString(rsiScienceVo));
                }
                if (quantityScienceVo != null) {
                    stockDayYanPan.setQuantityMa(quantityScienceVo.getJunxian());
                }
                if (priceScienceVo != null) {
                    stockDayYanPan.setPriceMa(priceScienceVo.getJunxian());
                }
                if (wrScienceVo != null) {
                    stockDayYanPan.setWr(GetWRString.getWRString(wrScienceVo));
                }
                stockDayVoList= NewCommonSaveFile.newCommonKMPTDList(daPanRateOfChangeVo,dangRiVo,stockDayYanPan,stockDayVo,stockDayVoList);
            }
        }
        return stockDayVoList;
    }

    public List<StockDayVo> getKmQRListStock(StockCode stockCode, List<StockDayVo> stockDayVoList, List<StockDay0000> stockDay000001List) throws IOException {
        StockDayVo stockDayVo = new StockDayVo();
        stockDayVo.setCode(stockCode.getEx() + stockCode.getId());
        stockDayVo.setName(stockCode.getName());
        //获取前60天记录，并且取前20天的有效记录
        Page<StockDay6000> page = new Page<>(1, 60);
        List<StockDay6000> stockDay6000List = stockDay6000Service.selectByCodeAndExPage(page, stockCode.getId(), stockCode.getEx());
        Collections.sort(stockDay6000List, new Comparator<StockDay6000>() {
            @Override
            public int compare(StockDay6000 o1, StockDay6000 o2) {
                long i = o2.getDate().getTime() - o1.getDate().getTime();
                if (i > 0) {
                    return 1;
                } else if (i < 0) {
                    return -1;
                }
                return 0;
            }
        });
        stockDayVo.setDate(DateUtil.get2String(stockDay6000List.get(0).getDate()));
        Page<StockDayScience6000> page1=new Page<>(1,60);
        List<StockDayScience6000> stockDayScience6000List = stockDayScience6000Service.selectByPage(page1,stockCode.getId(), stockCode.getEx());//技术先
        //计算指标，从数据库中获取对于的数据
        List<CengDieEntity> cengDieEntityList = new ArrayList<>();
        List<DangRiEntity> dangRiEntityList = new ArrayList<>();
        List<PingDingEntity> pingDingEntityList = new ArrayList<>();
        List<SunEntity> sunEntityList = new ArrayList<>();
        List<WuYunEntity> wuYunEntityList = new ArrayList<>();
        List<YanPanEntity> yanPanEntityList = new ArrayList<>();
        List<ChangeEntity> changeEntityList = new ArrayList<>();
        List<ScienceEntity> scienceEntityList = new ArrayList<>();
        List<DaPanChangeEntity> daPanChangeEntityList = new ArrayList<>();
        List<StockDay6000> stockDay6000List1 = new ArrayList<>();
        for (StockDay6000 stockDay6000 : stockDay6000List) {
            if (stockDay6000.getOpeningPrice().compareTo(new BigDecimal(0)) != 0 && stockDay6000.getOpeningPrice() != null && stockDay6000.getLclosePrice() != null && stockDay6000.getLclosePrice().compareTo(new BigDecimal(0)) != 0 && stockDay6000.getChangePoints() != null) {
                stockDay6000List1.add(stockDay6000);
            }
            if (stockDay6000List1.size() == 20) {
                stockDayVo.setDate(DateUtil.get2String(stockDay6000List1.get(0).getDate()));
                for (int i = 0; i < stockDay6000List1.size(); i++) {
                    if (i == 0) {
                        DangRiEntity dangRiEntity = new DangRiEntity();
                        BeanUtils.copyProperties(stockDay6000List1.get(i), dangRiEntity);
                        dangRiEntityList.add(dangRiEntity);
                    }
                    if (i < 4) {
                        WuYunEntity wuYunEntity = new WuYunEntity();
                        BeanUtils.copyProperties(stockDay6000List1.get(i), wuYunEntity);
                        wuYunEntityList.add(wuYunEntity);
                    }
                    if ( i < 5) {
                        CengDieEntity cengDieEntity = new CengDieEntity();
                        BeanUtils.copyProperties(stockDay6000List1.get(i), cengDieEntity);
                        cengDieEntityList.add(cengDieEntity);
                    }
                    if (i < 10) {
                        PingDingEntity pingDingEntity = new PingDingEntity();
                        BeanUtils.copyProperties(stockDay6000List1.get(i), pingDingEntity);
                        pingDingEntityList.add(pingDingEntity);

                        SunEntity sunEntity = new SunEntity();
                        BeanUtils.copyProperties(stockDay6000List1.get(i), sunEntity);
                        sunEntityList.add(sunEntity);
                    }
                    if (i < 20) {
                        ChangeEntity changeEntity = new ChangeEntity();
                        BeanUtils.copyProperties(stockDay6000List1.get(i), changeEntity);
                        changeEntityList.add(changeEntity);
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
                for (StockDayScience6000 stockDayScience6000 : stockDayScience6000List) {
                    if (stockDay6000List1.get(0).getDate().compareTo(stockDayScience6000.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6000, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay6000List1.get(1).getDate().compareTo(stockDayScience6000.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6000, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay6000List1.get(2).getDate().compareTo(stockDayScience6000.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6000, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay6000List1.get(3).getDate().compareTo(stockDayScience6000.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6000, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay6000List1.get(4).getDate().compareTo(stockDayScience6000.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6000, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay6000List1.get(5).getDate().compareTo(stockDayScience6000.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6000, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay6000List1.get(6).getDate().compareTo(stockDayScience6000.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6000, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay6000List1.get(7).getDate().compareTo(stockDayScience6000.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6000, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay6000List1.get(8).getDate().compareTo(stockDayScience6000.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6000, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay6000List1.get(9).getDate().compareTo(stockDayScience6000.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6000, scienceEntity);
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
                for (StockDay0000 stockDay3996000 : stockDay000001List) {
                    if (stockDay6000List1.get(0).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(1).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(2).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(3).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(4).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(5).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(6).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(7).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(8).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(9).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(10).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(11).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(12).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(13).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(14).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(15).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(16).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(17).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(18).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(19).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                }
                Collections.sort(daPanChangeEntityList, new Comparator<DaPanChangeEntity>() {
                    @Override
                    public int compare(DaPanChangeEntity o1, DaPanChangeEntity o2) {
                        long i = o2.getDate().getTime() - o1.getDate().getTime();
                        if (i > 0) {
                            return 1;
                        } else if (i < 0) {
                            return -1;
                        }
                        return 0;
                    }
                });
                StockDayYanPan stockDayYanPan = new StockDayYanPan();
                //大盘
                DaPanRateOfChangeVo daPanRateOfChangeVo = DaPanUtil.getDaPanRateOfChange(daPanChangeEntityList);
                //层叠
                CengDieVo cengDieVo = StackUtil.getcengdie(cengDieEntityList);
                //本票
                RateOfChangeVo rateOfChangeVo = RateOfChangeUtil.getRateOfChange(changeEntityList);
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
                PriceAndMaRelationVo priceAndMaRelationVo=PriceMAUtil.getPriceAndMaRelation(dangRiEntityList.get(0), scienceEntityList.get(0));
                String change_20= Qian20Xing.getQian20Xing(changeEntityList);
                //kdj
                KDJScienceVo kdjScienceVo = KDJUtil.getKDJScience1(scienceEntityList,changeEntityList);
                MACDScienceVo macdScienceVo = MACDUtil.getMACDScience(scienceEntityList);
                QuantityScienceVo quantityScienceVo = MakeQuantityMAUtil.getQuantityScience(scienceEntityList);
                PriceScienceVo priceScienceVo = PriceMAUtil.getPriceScience(scienceEntityList);
                RSIScienceVo rsiScienceVo = RSIUtil.getRSIScience(scienceEntityList);
                WRScienceVo wrScienceVo = WRUtil.getWRScience(scienceEntityList);
                if (daPanRateOfChangeVo != null) {
                    stockDayYanPan.setDaPan1(GetRate.getRate(daPanRateOfChangeVo.getBeforeDPChange1()));
                    stockDayYanPan.setDaPan2(GetRate.getRate(daPanRateOfChangeVo.getBeforeDPChange2()));
                    stockDayYanPan.setDaPan3(GetRate.getRate(daPanRateOfChangeVo.getBeforeDPChange3()));
                    stockDayYanPan.setDaPan5(GetRate.getRate(daPanRateOfChangeVo.getBeforeDPChange5()));
                    stockDayYanPan.setDaPan8(GetRate.getRate(daPanRateOfChangeVo.getBeforeDPChange8()));
                    stockDayYanPan.setDaPan13(GetRate.getRate(daPanRateOfChangeVo.getBeforeDPChange13()));
                    stockDayYanPan.setDaPan20(GetRate.getRate(daPanRateOfChangeVo.getBeforeDPChange20()));
                }
                if (rateOfChangeVo != null) {
                    stockDayYanPan.setBenPiao1(GetRate.getRate(rateOfChangeVo.getBeforeChange1()));
                    stockDayYanPan.setBenPiao2(GetRate.getRate(rateOfChangeVo.getBeforeChange2()));
                    stockDayYanPan.setBenPiao3(GetRate.getRate(rateOfChangeVo.getBeforeChange3()));
                    stockDayYanPan.setBenPiao5(GetRate.getRate(rateOfChangeVo.getBeforeChange5()));
                    stockDayYanPan.setBenPiao8(GetRate.getRate(rateOfChangeVo.getBeforeChange8()));
                    stockDayYanPan.setBenPiao13(GetRate.getRate(rateOfChangeVo.getBeforeChange13()));
                    stockDayYanPan.setBenPiao20(GetRate.getRate(rateOfChangeVo.getBeforeChange20()));
                }
                String str = GetYiRiXian.getYiRiXian(dangRiVo, yirichuanVo);
                if (str != null) {
                    stockDayYanPan.setDangRi(str);
                }
                if (priceAndMaRelationVo != null) {
                    stockDayYanPan.setPriceAndMaRelation(priceAndMaRelationVo.getPriceAndMaRelation());
                }
                if (change_20 != null) {
                    stockDayYanPan.setQian20TuXing(change_20);
                }
                XianVo xianVo = GetXian.getXian(pingQiVo, sunVo, wuYunVo, cengDieVo);
                if (xianVo.getLiangri() != null) {
                    stockDayYanPan.setLiangXian(xianVo.getLiangri());
                }
                if (xianVo.getSanri() != null) {
                    stockDayYanPan.setSanXian(xianVo.getSanri());
                }
                if (xianVo.getSiri() != null) {
                    stockDayYanPan.setSiXian(xianVo.getSiri());
                }
                if (xianVo.getWuri() != null) {
                    stockDayYanPan.setWuXian(xianVo.getWuri());
                }
                if (xianVo.getDuori() != null) {
                    stockDayYanPan.setDuoXian(xianVo.getDuori());
                }
                if (kdjScienceVo != null) {
                    stockDayYanPan.setKdj(GetkdjString.getkdjString(kdjScienceVo));
                }
                if (macdScienceVo != null) {
                    stockDayYanPan.setMacd(GetMacdString.getMacdString(macdScienceVo));
                }
                if (rsiScienceVo != null) {
                    stockDayYanPan.setRsi(GetRSIString.getRSIString(rsiScienceVo));
                }
                if (quantityScienceVo != null) {
                    stockDayYanPan.setQuantityMa(quantityScienceVo.getJunxian());
                }
                if (priceScienceVo != null) {
                    stockDayYanPan.setPriceMa(priceScienceVo.getJunxian());
                }
                if (wrScienceVo != null) {
                    stockDayYanPan.setWr(GetWRString.getWRString(wrScienceVo));
                }
                stockDayVoList= NewCommonSaveFile.newCommonKmQRList(daPanRateOfChangeVo,stockDayYanPan,stockDayVo,stockDayVoList);
            }
        }
        return stockDayVoList;
    }

    public List<StockDayVo> getQTuXingListStock(StockCode stockCode, List<StockDayVo> stockDayVoList, List<StockDay0000> stockDay000001List) throws IOException {
        StockDayVo stockDayVo = new StockDayVo();
        stockDayVo.setCode(stockCode.getEx() + stockCode.getId());
        stockDayVo.setName(stockCode.getName());
        //获取前60天记录，并且取前20天的有效记录
        Page<StockDay6000> page = new Page<>(1, 60);
        List<StockDay6000> stockDay6000List = stockDay6000Service.selectByCodeAndExPage(page, stockCode.getId(), stockCode.getEx());
        Collections.sort(stockDay6000List, new Comparator<StockDay6000>() {
            @Override
            public int compare(StockDay6000 o1, StockDay6000 o2) {
                long i = o2.getDate().getTime() - o1.getDate().getTime();
                if (i > 0) {
                    return 1;
                } else if (i < 0) {
                    return -1;
                }
                return 0;
            }
        });
        stockDayVo.setDate(DateUtil.get2String(stockDay6000List.get(0).getDate()));
        Page<StockDayScience6000> page1=new Page<>(1,60);
        List<StockDayScience6000> stockDayScience6000List = stockDayScience6000Service.selectByPage(page1,stockCode.getId(), stockCode.getEx());//技术先
        //计算指标，从数据库中获取对于的数据
        List<CengDieEntity> cengDieEntityList = new ArrayList<>();
        List<DangRiEntity> dangRiEntityList = new ArrayList<>();
        List<PingDingEntity> pingDingEntityList = new ArrayList<>();
        List<SunEntity> sunEntityList = new ArrayList<>();
        List<WuYunEntity> wuYunEntityList = new ArrayList<>();
        List<YanPanEntity> yanPanEntityList = new ArrayList<>();
        List<ChangeEntity> changeEntityList = new ArrayList<>();
        List<ScienceEntity> scienceEntityList = new ArrayList<>();
        List<DaPanChangeEntity> daPanChangeEntityList = new ArrayList<>();
        List<StockDay6000> stockDay6000List1 = new ArrayList<>();
        for (StockDay6000 stockDay6000 : stockDay6000List) {
            if (stockDay6000.getOpeningPrice().compareTo(new BigDecimal(0)) != 0 && stockDay6000.getOpeningPrice() != null && stockDay6000.getLclosePrice() != null && stockDay6000.getLclosePrice().compareTo(new BigDecimal(0)) != 0 && stockDay6000.getChangePoints() != null) {
                stockDay6000List1.add(stockDay6000);
            }
            if (stockDay6000List1.size() == 20) {
                stockDayVo.setDate(DateUtil.get2String(stockDay6000List1.get(0).getDate()));
                for (int i = 0; i < stockDay6000List1.size(); i++) {
                    if (i == 0) {
                        DangRiEntity dangRiEntity = new DangRiEntity();
                        BeanUtils.copyProperties(stockDay6000List1.get(i), dangRiEntity);
                        dangRiEntityList.add(dangRiEntity);
                    }
                    if (i < 4) {
                        WuYunEntity wuYunEntity = new WuYunEntity();
                        BeanUtils.copyProperties(stockDay6000List1.get(i), wuYunEntity);
                        wuYunEntityList.add(wuYunEntity);
                    }
                    if ( i < 5) {
                        CengDieEntity cengDieEntity = new CengDieEntity();
                        BeanUtils.copyProperties(stockDay6000List1.get(i), cengDieEntity);
                        cengDieEntityList.add(cengDieEntity);
                    }
                    if (i < 10) {
                        PingDingEntity pingDingEntity = new PingDingEntity();
                        BeanUtils.copyProperties(stockDay6000List1.get(i), pingDingEntity);
                        pingDingEntityList.add(pingDingEntity);

                        SunEntity sunEntity = new SunEntity();
                        BeanUtils.copyProperties(stockDay6000List1.get(i), sunEntity);
                        sunEntityList.add(sunEntity);
                    }
                    if (i < 20) {
                        ChangeEntity changeEntity = new ChangeEntity();
                        BeanUtils.copyProperties(stockDay6000List1.get(i), changeEntity);
                        changeEntityList.add(changeEntity);
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
                for (StockDayScience6000 stockDayScience6000 : stockDayScience6000List) {
                    if (stockDay6000List1.get(0).getDate().compareTo(stockDayScience6000.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6000, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay6000List1.get(1).getDate().compareTo(stockDayScience6000.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6000, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay6000List1.get(2).getDate().compareTo(stockDayScience6000.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6000, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay6000List1.get(3).getDate().compareTo(stockDayScience6000.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6000, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay6000List1.get(4).getDate().compareTo(stockDayScience6000.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6000, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay6000List1.get(5).getDate().compareTo(stockDayScience6000.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6000, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay6000List1.get(6).getDate().compareTo(stockDayScience6000.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6000, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay6000List1.get(7).getDate().compareTo(stockDayScience6000.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6000, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay6000List1.get(8).getDate().compareTo(stockDayScience6000.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6000, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay6000List1.get(9).getDate().compareTo(stockDayScience6000.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6000, scienceEntity);
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
                for (StockDay0000 stockDay3996000 : stockDay000001List) {
                    if (stockDay6000List1.get(0).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(1).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(2).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(3).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(4).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(5).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(6).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(7).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(8).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(9).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(10).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(11).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(12).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(13).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(14).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(15).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(16).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(17).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(18).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(19).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                }
                Collections.sort(daPanChangeEntityList, new Comparator<DaPanChangeEntity>() {
                    @Override
                    public int compare(DaPanChangeEntity o1, DaPanChangeEntity o2) {
                        long i = o2.getDate().getTime() - o1.getDate().getTime();
                        if (i > 0) {
                            return 1;
                        } else if (i < 0) {
                            return -1;
                        }
                        return 0;
                    }
                });
                StockDayYanPan stockDayYanPan = new StockDayYanPan();
                //大盘
                DaPanRateOfChangeVo daPanRateOfChangeVo = DaPanUtil.getDaPanRateOfChange(daPanChangeEntityList);
                //层叠
                CengDieVo cengDieVo = StackUtil.getcengdie(cengDieEntityList);
                //本票
                RateOfChangeVo rateOfChangeVo = RateOfChangeUtil.getRateOfChange(changeEntityList);
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
                PriceAndMaRelationVo priceAndMaRelationVo=PriceMAUtil.getPriceAndMaRelation(dangRiEntityList.get(0), scienceEntityList.get(0));
                String change_20= Qian20Xing.getQian20Xing(changeEntityList);
                //kdj
                KDJScienceVo kdjScienceVo = KDJUtil.getKDJScience1(scienceEntityList,changeEntityList);
                MACDScienceVo macdScienceVo = MACDUtil.getMACDScience(scienceEntityList);
                QuantityScienceVo quantityScienceVo = MakeQuantityMAUtil.getQuantityScience(scienceEntityList);
                PriceScienceVo priceScienceVo = PriceMAUtil.getPriceScience(scienceEntityList);
                RSIScienceVo rsiScienceVo = RSIUtil.getRSIScience(scienceEntityList);
                WRScienceVo wrScienceVo = WRUtil.getWRScience(scienceEntityList);
                if (daPanRateOfChangeVo != null) {
                    stockDayYanPan.setDaPan1(GetRate.getRate(daPanRateOfChangeVo.getBeforeDPChange1()));
                    stockDayYanPan.setDaPan2(GetRate.getRate(daPanRateOfChangeVo.getBeforeDPChange2()));
                    stockDayYanPan.setDaPan3(GetRate.getRate(daPanRateOfChangeVo.getBeforeDPChange3()));
                    stockDayYanPan.setDaPan5(GetRate.getRate(daPanRateOfChangeVo.getBeforeDPChange5()));
                    stockDayYanPan.setDaPan8(GetRate.getRate(daPanRateOfChangeVo.getBeforeDPChange8()));
                    stockDayYanPan.setDaPan13(GetRate.getRate(daPanRateOfChangeVo.getBeforeDPChange13()));
                    stockDayYanPan.setDaPan20(GetRate.getRate(daPanRateOfChangeVo.getBeforeDPChange20()));
                }
                if (rateOfChangeVo != null) {
                    stockDayYanPan.setBenPiao1(GetRate.getRate(rateOfChangeVo.getBeforeChange1()));
                    stockDayYanPan.setBenPiao2(GetRate.getRate(rateOfChangeVo.getBeforeChange2()));
                    stockDayYanPan.setBenPiao3(GetRate.getRate(rateOfChangeVo.getBeforeChange3()));
                    stockDayYanPan.setBenPiao5(GetRate.getRate(rateOfChangeVo.getBeforeChange5()));
                    stockDayYanPan.setBenPiao8(GetRate.getRate(rateOfChangeVo.getBeforeChange8()));
                    stockDayYanPan.setBenPiao13(GetRate.getRate(rateOfChangeVo.getBeforeChange13()));
                    stockDayYanPan.setBenPiao20(GetRate.getRate(rateOfChangeVo.getBeforeChange20()));
                }
                String str = GetYiRiXian.getYiRiXian(dangRiVo, yirichuanVo);
                if (str != null) {
                    stockDayYanPan.setDangRi(str);
                }
                if (priceAndMaRelationVo != null) {
                    stockDayYanPan.setPriceAndMaRelation(priceAndMaRelationVo.getPriceAndMaRelation());
                }
                if (change_20 != null) {
                    stockDayYanPan.setQian20TuXing(change_20);
                }
                XianVo xianVo = GetXian.getXian(pingQiVo, sunVo, wuYunVo, cengDieVo);
                if (xianVo.getLiangri() != null) {
                    stockDayYanPan.setLiangXian(xianVo.getLiangri());
                }
                if (xianVo.getSanri() != null) {
                    stockDayYanPan.setSanXian(xianVo.getSanri());
                }
                if (xianVo.getSiri() != null) {
                    stockDayYanPan.setSiXian(xianVo.getSiri());
                }
                if (xianVo.getWuri() != null) {
                    stockDayYanPan.setWuXian(xianVo.getWuri());
                }
                if (xianVo.getDuori() != null) {
                    stockDayYanPan.setDuoXian(xianVo.getDuori());
                }
                if (kdjScienceVo != null) {
                    stockDayYanPan.setKdj(GetkdjString.getkdjString(kdjScienceVo));
                }
                if (macdScienceVo != null) {
                    stockDayYanPan.setMacd(GetMacdString.getMacdString(macdScienceVo));
                }
                if (rsiScienceVo != null) {
                    stockDayYanPan.setRsi(GetRSIString.getRSIString(rsiScienceVo));
                }
                if (quantityScienceVo != null) {
                    stockDayYanPan.setQuantityMa(quantityScienceVo.getJunxian());
                }
                if (priceScienceVo != null) {
                    stockDayYanPan.setPriceMa(priceScienceVo.getJunxian());
                }
                if (wrScienceVo != null) {
                    stockDayYanPan.setWr(GetWRString.getWRString(wrScienceVo));
                }
                stockDayVoList= NewCommonSaveFile.newCommonQTuXingList(daPanRateOfChangeVo,stockDayYanPan,stockDayVo,stockDayVoList);
            }
        }
        return stockDayVoList;
    }

    public List<StockDayVo> getKTu20LSListStock(StockCode stockCode, List<StockDayVo> stockDayVoList, List<StockDay0000> stockDay000001List) throws IOException {
        StockDayVo stockDayVo = new StockDayVo();
        stockDayVo.setCode(stockCode.getEx() + stockCode.getId());
        stockDayVo.setName(stockCode.getName());
        //获取前60天记录，并且取前20天的有效记录
        Page<StockDay6000> page = new Page<>(1, 60);
        List<StockDay6000> stockDay6000List = stockDay6000Service.selectByCodeAndExPage(page, stockCode.getId(), stockCode.getEx());
        Collections.sort(stockDay6000List, new Comparator<StockDay6000>() {
            @Override
            public int compare(StockDay6000 o1, StockDay6000 o2) {
                long i = o2.getDate().getTime() - o1.getDate().getTime();
                if (i > 0) {
                    return 1;
                } else if (i < 0) {
                    return -1;
                }
                return 0;
            }
        });
        Page<StockDayScience6000> page1=new Page<>(1,60);
        List<StockDayScience6000> stockDayScience6000List = stockDayScience6000Service.selectByPage(page1,stockCode.getId(), stockCode.getEx());//技术先
        //计算指标，从数据库中获取对于的数据
        List<CengDieEntity> cengDieEntityList = new ArrayList<>();
        List<DangRiEntity> dangRiEntityList = new ArrayList<>();
        List<PingDingEntity> pingDingEntityList = new ArrayList<>();
        List<SunEntity> sunEntityList = new ArrayList<>();
        List<WuYunEntity> wuYunEntityList = new ArrayList<>();
        List<YanPanEntity> yanPanEntityList = new ArrayList<>();
        List<ChangeEntity> changeEntityList = new ArrayList<>();
        List<ScienceEntity> scienceEntityList = new ArrayList<>();
        List<DaPanChangeEntity> daPanChangeEntityList = new ArrayList<>();
        List<StockDay6000> stockDay6000List1 = new ArrayList<>();
        for (StockDay6000 stockDay6000 : stockDay6000List) {
            if (stockDay6000.getOpeningPrice().compareTo(new BigDecimal(0)) != 0 && stockDay6000.getOpeningPrice() != null && stockDay6000.getLclosePrice() != null && stockDay6000.getLclosePrice().compareTo(new BigDecimal(0)) != 0 && stockDay6000.getChangePoints() != null) {
                stockDay6000List1.add(stockDay6000);
            }
            if (stockDay6000List1.size() == 20) {
                stockDayVo.setDate(DateUtil.get2String(stockDay6000List1.get(0).getDate()));
                for (int i = 0; i < stockDay6000List1.size(); i++) {
                    if (i == 0) {
                        DangRiEntity dangRiEntity = new DangRiEntity();
                        BeanUtils.copyProperties(stockDay6000List1.get(i), dangRiEntity);
                        dangRiEntityList.add(dangRiEntity);
                    }
                    if (i < 4) {
                        WuYunEntity wuYunEntity = new WuYunEntity();
                        BeanUtils.copyProperties(stockDay6000List1.get(i), wuYunEntity);
                        wuYunEntityList.add(wuYunEntity);
                    }
                    if ( i < 5) {
                        CengDieEntity cengDieEntity = new CengDieEntity();
                        BeanUtils.copyProperties(stockDay6000List1.get(i), cengDieEntity);
                        cengDieEntityList.add(cengDieEntity);
                    }
                    if (i < 10) {
                        PingDingEntity pingDingEntity = new PingDingEntity();
                        BeanUtils.copyProperties(stockDay6000List1.get(i), pingDingEntity);
                        pingDingEntityList.add(pingDingEntity);

                        SunEntity sunEntity = new SunEntity();
                        BeanUtils.copyProperties(stockDay6000List1.get(i), sunEntity);
                        sunEntityList.add(sunEntity);
                    }
                    if (i < 20) {
                        ChangeEntity changeEntity = new ChangeEntity();
                        BeanUtils.copyProperties(stockDay6000List1.get(i), changeEntity);
                        changeEntityList.add(changeEntity);
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
                for (StockDayScience6000 stockDayScience6000 : stockDayScience6000List) {
                    if (stockDay6000List1.get(0).getDate().compareTo(stockDayScience6000.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6000, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay6000List1.get(1).getDate().compareTo(stockDayScience6000.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6000, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay6000List1.get(2).getDate().compareTo(stockDayScience6000.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6000, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay6000List1.get(3).getDate().compareTo(stockDayScience6000.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6000, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay6000List1.get(4).getDate().compareTo(stockDayScience6000.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6000, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay6000List1.get(5).getDate().compareTo(stockDayScience6000.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6000, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay6000List1.get(6).getDate().compareTo(stockDayScience6000.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6000, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay6000List1.get(7).getDate().compareTo(stockDayScience6000.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6000, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay6000List1.get(8).getDate().compareTo(stockDayScience6000.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6000, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay6000List1.get(9).getDate().compareTo(stockDayScience6000.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6000, scienceEntity);
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
                for (StockDay0000 stockDay3996000 : stockDay000001List) {
                    if (stockDay6000List1.get(0).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(1).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(2).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(3).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(4).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(5).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(6).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(7).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(8).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(9).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(10).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(11).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(12).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(13).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(14).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(15).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(16).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(17).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(18).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay6000List1.get(19).getDate().compareTo(stockDay3996000.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay3996000, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                }
                Collections.sort(daPanChangeEntityList, new Comparator<DaPanChangeEntity>() {
                    @Override
                    public int compare(DaPanChangeEntity o1, DaPanChangeEntity o2) {
                        long i = o2.getDate().getTime() - o1.getDate().getTime();
                        if (i > 0) {
                            return 1;
                        } else if (i < 0) {
                            return -1;
                        }
                        return 0;
                    }
                });
                StockDayYanPan stockDayYanPan = new StockDayYanPan();
                //大盘
                DaPanRateOfChangeVo daPanRateOfChangeVo = DaPanUtil.getDaPanRateOfChange(daPanChangeEntityList);
                //层叠
                CengDieVo cengDieVo = StackUtil.getcengdie(cengDieEntityList);
                //本票
                RateOfChangeVo rateOfChangeVo = RateOfChangeUtil.getRateOfChange(changeEntityList);
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
                PriceAndMaRelationVo priceAndMaRelationVo=PriceMAUtil.getPriceAndMaRelation(dangRiEntityList.get(0), scienceEntityList.get(0));
                String change_20= Qian20Xing.getQian20Xing(changeEntityList);
                //kdj
                KDJScienceVo kdjScienceVo = KDJUtil.getKDJScience1(scienceEntityList,changeEntityList);
                MACDScienceVo macdScienceVo = MACDUtil.getMACDScience(scienceEntityList);
                QuantityScienceVo quantityScienceVo = MakeQuantityMAUtil.getQuantityScience(scienceEntityList);
                PriceScienceVo priceScienceVo = PriceMAUtil.getPriceScience(scienceEntityList);
                RSIScienceVo rsiScienceVo = RSIUtil.getRSIScience(scienceEntityList);
                WRScienceVo wrScienceVo = WRUtil.getWRScience(scienceEntityList);
                if (daPanRateOfChangeVo != null) {
                    stockDayYanPan.setDaPan1(GetRate.getRate(daPanRateOfChangeVo.getBeforeDPChange1()));
                    stockDayYanPan.setDaPan2(GetRate.getRate(daPanRateOfChangeVo.getBeforeDPChange2()));
                    stockDayYanPan.setDaPan3(GetRate.getRate(daPanRateOfChangeVo.getBeforeDPChange3()));
                    stockDayYanPan.setDaPan5(GetRate.getRate(daPanRateOfChangeVo.getBeforeDPChange5()));
                    stockDayYanPan.setDaPan8(GetRate.getRate(daPanRateOfChangeVo.getBeforeDPChange8()));
                    stockDayYanPan.setDaPan13(GetRate.getRate(daPanRateOfChangeVo.getBeforeDPChange13()));
                    stockDayYanPan.setDaPan20(GetRate.getRate(daPanRateOfChangeVo.getBeforeDPChange20()));
                }
                if (rateOfChangeVo != null) {
                    stockDayYanPan.setBenPiao1(GetRate.getRate(rateOfChangeVo.getBeforeChange1()));
                    stockDayYanPan.setBenPiao2(GetRate.getRate(rateOfChangeVo.getBeforeChange2()));
                    stockDayYanPan.setBenPiao3(GetRate.getRate(rateOfChangeVo.getBeforeChange3()));
                    stockDayYanPan.setBenPiao5(GetRate.getRate(rateOfChangeVo.getBeforeChange5()));
                    stockDayYanPan.setBenPiao8(GetRate.getRate(rateOfChangeVo.getBeforeChange8()));
                    stockDayYanPan.setBenPiao13(GetRate.getRate(rateOfChangeVo.getBeforeChange13()));
                    stockDayYanPan.setBenPiao20(GetRate.getRate(rateOfChangeVo.getBeforeChange20()));
                }
                String str = GetYiRiXian.getYiRiXian(dangRiVo, yirichuanVo);
                if (str != null) {
                    stockDayYanPan.setDangRi(str);
                }
                if (priceAndMaRelationVo != null) {
                    stockDayYanPan.setPriceAndMaRelation(priceAndMaRelationVo.getPriceAndMaRelation());
                }
                if (change_20 != null) {
                    stockDayYanPan.setQian20TuXing(change_20);
                }
                XianVo xianVo = GetXian.getXian(pingQiVo, sunVo, wuYunVo, cengDieVo);
                if (xianVo.getLiangri() != null) {
                    stockDayYanPan.setLiangXian(xianVo.getLiangri());
                }
                if (xianVo.getSanri() != null) {
                    stockDayYanPan.setSanXian(xianVo.getSanri());
                }
                if (xianVo.getSiri() != null) {
                    stockDayYanPan.setSiXian(xianVo.getSiri());
                }
                if (xianVo.getWuri() != null) {
                    stockDayYanPan.setWuXian(xianVo.getWuri());
                }
                if (xianVo.getDuori() != null) {
                    stockDayYanPan.setDuoXian(xianVo.getDuori());
                }
                if (kdjScienceVo != null) {
                    stockDayYanPan.setKdj(GetkdjString.getkdjString(kdjScienceVo));
                }
                if (macdScienceVo != null) {
                    stockDayYanPan.setMacd(GetMacdString.getMacdString(macdScienceVo));
                }
                if (rsiScienceVo != null) {
                    stockDayYanPan.setRsi(GetRSIString.getRSIString(rsiScienceVo));
                }
                if (quantityScienceVo != null) {
                    stockDayYanPan.setQuantityMa(quantityScienceVo.getJunxian());
                }
                if (priceScienceVo != null) {
                    stockDayYanPan.setPriceMa(priceScienceVo.getJunxian());
                }
                if (wrScienceVo != null) {
                    stockDayYanPan.setWr(GetWRString.getWRString(wrScienceVo));
                }
                stockDayVoList= NewCommonSaveFile.newCommonKTu20LSList(daPanRateOfChangeVo,dangRiVo,stockDayYanPan,stockDayVo,stockDayVoList);
            }
        }
        return stockDayVoList;
    }
}
