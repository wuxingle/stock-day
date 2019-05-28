package com.stock.stockday.service.jishuyupan;

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
import com.stock.apicommon.utils.patterning.YanPanUtil;
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
import com.stock.apicommon.vo.YanPanVo;
import com.stock.apicommon.vo.YirichuanVo;
import com.stock.stockday.entity.StockCode;
import com.stock.stockday.entity.StockDay0024;
import com.stock.stockday.entity.StockDay399;
import com.stock.stockday.entity.StockDayScience0024;
import com.stock.stockday.entity.StockDayScience0024;
import com.stock.stockday.entity.StockDayYanPan;
import com.stock.stockday.service.StockDay0024Service;
import com.stock.stockday.service.StockDayScience0024Service;
import com.stock.stockday.util.BenPanSaveFileUtil;
import com.stock.stockday.util.ChunJiShuSaveFileUtil;
import com.stock.stockday.util.ChunTuXingSaveFileUtil;
import com.stock.stockday.util.DaPanSaveFileUtil;
import com.stock.stockday.util.GetMacdString;
import com.stock.stockday.util.GetRSIString;
import com.stock.stockday.util.GetRate;
import com.stock.stockday.util.GetWRString;
import com.stock.stockday.util.GetXian;
import com.stock.stockday.util.GetYiRiXian;
import com.stock.stockday.util.GetkdjString;
import com.stock.stockday.util.NewCommonSaveFile;
import com.stock.stockday.util.UpUpSaveFileUtil;
import com.stock.stockday.util.YanPan24SaveFileUtil;
import com.stock.stockday.util.YanPan33SaveFileUtil;
import com.stock.stockday.util.YanPan42SaveFileUtil;
import com.stock.stockday.util.YanPanZhuYanJiShuSaveFileUtil;
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
public class DayYuPan0024Function {
    @Autowired
    private StockDayScience0024Service stockDayScience0024Service;
    @Autowired
    private StockDay0024Service stockDay0024Service;


    public boolean dayYuPanFunction(StockCode stockCode, List<StockDay399> stockDay399001List) throws IOException {
        Page<StockDay0024> page=new Page<>(1,60);
        List<StockDay0024> stockDay0024List = stockDay0024Service.selectByCodeAndExPage(page,stockCode.getId(), stockCode.getEx());//日线
        Page<StockDayScience0024> page1=new Page<>(1,60);
        List<StockDayScience0024> stockDayScience0024List = stockDayScience0024Service.selectByPage(page1,stockCode.getId(), stockCode.getEx());//技术先
        if (stockDay0024List == null || stockDay0024List.size() == 0) {
            return false;
        }
        if (stockDayScience0024List == null || stockDayScience0024List.size() == 0) {
            return false;
        }
        //排序
        Collections.sort(stockDay0024List, new Comparator<StockDay0024>() {
            @Override
            public int compare(StockDay0024 o1, StockDay0024 o2) {
                long i = o2.getDate().getTime() - o1.getDate().getTime();
                if (i > 0) {
                    return 1;
                } else if (i < 0) {
                    return -1;
                }
                return 0;
            }
        });
        Collections.sort(stockDayScience0024List, new Comparator<StockDayScience0024>() {
            @Override
            public int compare(StockDayScience0024 o1, StockDayScience0024 o2) {
                long i = o2.getDate().getTime() - o1.getDate().getTime();
                if (i > 0) {
                    return 1;
                } else if (i < 0) {
                    return -1;
                }
                return 0;
            }
        });

        List<CengDieEntity> cengDieEntityList = new ArrayList<>();
        List<ChangeEntity> changeEntityList = new ArrayList<>();
        List<DangRiEntity> dangRiEntityList = new ArrayList<>();
        List<DaPanChangeEntity> daPanChangeEntityList = new ArrayList<>();
        List<PingDingEntity> pingDingEntityList = new ArrayList<>();
        List<SunEntity> sunEntityList = new ArrayList<>();
        List<WuYunEntity> wuYunEntityList = new ArrayList<>();
        List<YanPanEntity> yanPanEntityList = new ArrayList<>();

        List<ScienceEntity> scienceEntityList = new ArrayList<>();

        List<StockDay0024> stockDay0024List1 = new ArrayList<>();
        for (StockDay0024 stockDay0024 : stockDay0024List) {
            if (stockDay0024.getOpeningPrice().compareTo(new BigDecimal(0))!=0&&stockDay0024.getOpeningPrice() != null && stockDay0024.getLclosePrice() != null&&stockDay0024.getLclosePrice().compareTo(new BigDecimal(0))!=0&&stockDay0024.getChangePoints()!=null) {
                stockDay0024List1.add(stockDay0024);
            }
            if (stockDay0024List1.size() == 40) {
                for (int i = 0; i < stockDay0024List1.size(); i++) {
                    if (i ==20) {
                        DangRiEntity dangRiEntity = new DangRiEntity();
                        BeanUtils.copyProperties(stockDay0024List1.get(i), dangRiEntity);
                        dangRiEntityList.add(dangRiEntity);
                    }
                    if (i<24&&i > 19) {
                        WuYunEntity wuYunEntity = new WuYunEntity();
                        BeanUtils.copyProperties(stockDay0024List1.get(i), wuYunEntity);
                        wuYunEntityList.add(wuYunEntity);
                    }
                    if (i<25&&i >=20) {
                        CengDieEntity cengDieEntity = new CengDieEntity();
                        BeanUtils.copyProperties(stockDay0024List1.get(i), cengDieEntity);
                        cengDieEntityList.add(cengDieEntity);
                    }
                    if (i<30&&i >=20) {
                        PingDingEntity pingDingEntity = new PingDingEntity();
                        BeanUtils.copyProperties(stockDay0024List1.get(i), pingDingEntity);
                        pingDingEntityList.add(pingDingEntity);

                        SunEntity sunEntity = new SunEntity();
                        BeanUtils.copyProperties(stockDay0024List1.get(i), sunEntity);
                        sunEntityList.add(sunEntity);
                    }
                    if (i>=20) {
                        ChangeEntity changeEntity = new ChangeEntity();
                        BeanUtils.copyProperties(stockDay0024List1.get(i), changeEntity);
                        changeEntityList.add(changeEntity);
                    }
                    if (i<20) {
                        YanPanEntity yanPanEntity = new YanPanEntity();
                        BeanUtils.copyProperties(stockDay0024List1.get(i), yanPanEntity);
                        yanPanEntityList.add(yanPanEntity);
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
                Collections.sort(yanPanEntityList, new Comparator<YanPanEntity>() {
                    @Override
                    public int compare(YanPanEntity o1, YanPanEntity o2) {
                        long i = o1.getDate().getTime() - o2.getDate().getTime();
                        if (i > 0) {
                            return 1;
                        } else if (i < 0) {
                            return -1;
                        }
                        return 0;
                    }
                });

                //技术
                for (StockDayScience0024 stockDayScience0024 : stockDayScience0024List) {
                    if (stockDay0024List1.get(20).getDate().compareTo(stockDayScience0024.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience0024, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay0024List1.get(21).getDate().compareTo(stockDayScience0024.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience0024, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay0024List1.get(22).getDate().compareTo(stockDayScience0024.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience0024, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay0024List1.get(23).getDate().compareTo(stockDayScience0024.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience0024, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay0024List1.get(24).getDate().compareTo(stockDayScience0024.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience0024, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay0024List1.get(25).getDate().compareTo(stockDayScience0024.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience0024, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay0024List1.get(26).getDate().compareTo(stockDayScience0024.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience0024, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay0024List1.get(27).getDate().compareTo(stockDayScience0024.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience0024, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay0024List1.get(28).getDate().compareTo(stockDayScience0024.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience0024, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay0024List1.get(29).getDate().compareTo(stockDayScience0024.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience0024, scienceEntity);
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
                for (StockDay399 stockDay399001 : stockDay399001List) {
                    if (stockDay0024List1.get(20).getDate().compareTo(stockDay399001.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay399001, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay0024List1.get(21).getDate().compareTo(stockDay399001.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay399001, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay0024List1.get(22).getDate().compareTo(stockDay399001.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay399001, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay0024List1.get(23).getDate().compareTo(stockDay399001.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay399001, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay0024List1.get(24).getDate().compareTo(stockDay399001.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay399001, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay0024List1.get(25).getDate().compareTo(stockDay399001.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay399001, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay0024List1.get(26).getDate().compareTo(stockDay399001.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay399001, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay0024List1.get(27).getDate().compareTo(stockDay399001.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay399001, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay0024List1.get(28).getDate().compareTo(stockDay399001.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay399001, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay0024List1.get(29).getDate().compareTo(stockDay399001.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay399001, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay0024List1.get(30).getDate().compareTo(stockDay399001.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay399001, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay0024List1.get(31).getDate().compareTo(stockDay399001.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay399001, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay0024List1.get(32).getDate().compareTo(stockDay399001.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay399001, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay0024List1.get(33).getDate().compareTo(stockDay399001.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay399001, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay0024List1.get(34).getDate().compareTo(stockDay399001.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay399001, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay0024List1.get(35).getDate().compareTo(stockDay399001.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay399001, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay0024List1.get(36).getDate().compareTo(stockDay399001.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay399001, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay0024List1.get(37).getDate().compareTo(stockDay399001.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay399001, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay0024List1.get(38).getDate().compareTo(stockDay399001.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay399001, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay0024List1.get(39).getDate().compareTo(stockDay399001.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay399001, daPanChangeEntity);
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
                if (priceAndMaRelationVo!=null&&priceAndMaRelationVo.getPriceAndMaRelation()!= null) {
                    stockDayYanPan.setPriceAndMaRelation(priceAndMaRelationVo.getPriceAndMaRelation());
                }
                //kdj
                KDJScienceVo kdjScienceVo = KDJUtil.getKDJScience(scienceEntityList);
                MACDScienceVo macdScienceVo = MACDUtil.getMACDScience(scienceEntityList);
                QuantityScienceVo quantityScienceVo = MakeQuantityMAUtil.getQuantityScience(scienceEntityList);
                PriceScienceVo priceScienceVo = PriceMAUtil.getPriceScience(scienceEntityList);
                RSIScienceVo rsiScienceVo = RSIUtil.getRSIScience(scienceEntityList);
                WRScienceVo wrScienceVo = WRUtil.getWRScience(scienceEntityList);
                //研判
                YanPanVo yanPanVo = YanPanUtil.getYanPanRateOfChange(yanPanEntityList);
                if(daPanRateOfChangeVo!=null) {
                    stockDayYanPan.setDaPan1(GetRate.getRate(daPanRateOfChangeVo.getBeforeDPChange1()));
                    stockDayYanPan.setDaPan2(GetRate.getRate(daPanRateOfChangeVo.getBeforeDPChange2()));
                    stockDayYanPan.setDaPan3(GetRate.getRate(daPanRateOfChangeVo.getBeforeDPChange3()));
                    stockDayYanPan.setDaPan5(GetRate.getRate(daPanRateOfChangeVo.getBeforeDPChange5()));
                    stockDayYanPan.setDaPan8(GetRate.getRate(daPanRateOfChangeVo.getBeforeDPChange8()));
                    stockDayYanPan.setDaPan13(GetRate.getRate(daPanRateOfChangeVo.getBeforeDPChange13()));
                    stockDayYanPan.setDaPan20(GetRate.getRate(daPanRateOfChangeVo.getBeforeDPChange20()));
                }
                if (rateOfChangeVo!=null) {
                    stockDayYanPan.setBenPiao1(GetRate.getRate(rateOfChangeVo.getBeforeChange1()));
                    stockDayYanPan.setBenPiao2(GetRate.getRate(rateOfChangeVo.getBeforeChange2()));
                    stockDayYanPan.setBenPiao3(GetRate.getRate(rateOfChangeVo.getBeforeChange3()));
                    stockDayYanPan.setBenPiao5(GetRate.getRate(rateOfChangeVo.getBeforeChange5()));
                    stockDayYanPan.setBenPiao8(GetRate.getRate(rateOfChangeVo.getBeforeChange8()));
                    stockDayYanPan.setBenPiao13(GetRate.getRate(rateOfChangeVo.getBeforeChange13()));
                    stockDayYanPan.setBenPiao20(GetRate.getRate(rateOfChangeVo.getBeforeChange20()));
                }
                String str=GetYiRiXian.getYiRiXian(dangRiVo, yirichuanVo);
                if (str!=null) {
                    stockDayYanPan.setDangRi(str);
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
                if (kdjScienceVo!=null) {
                    stockDayYanPan.setKdj(GetkdjString.getkdjString(kdjScienceVo));
                }
                if (macdScienceVo!=null) {
                    stockDayYanPan.setMacd(GetMacdString.getMacdString(macdScienceVo));
                }
                if (rsiScienceVo!=null) {
                    stockDayYanPan.setRsi(GetRSIString.getRSIString(rsiScienceVo));
                }
                if (quantityScienceVo!=null) {
                    stockDayYanPan.setQuantityMa(quantityScienceVo.getJunxian());
                }
                if (priceScienceVo != null) {
                    stockDayYanPan.setPriceMa(priceScienceVo.getJunxian());
                }
                if (wrScienceVo!=null) {
                    stockDayYanPan.setWr(GetWRString.getWRString(wrScienceVo));
                }

                UpUpSaveFileUtil.upUpSaveFile(daPanRateOfChangeVo,rateOfChangeVo,yanPanVo,stockDayYanPan);

                ChunTuXingSaveFileUtil.chunTuXing(yanPanVo,stockDayYanPan);

                ChunJiShuSaveFileUtil.chunJiShu(yanPanVo,stockDayYanPan);

                YanPan24SaveFileUtil.yanPan24SaveFile(yanPanVo,stockDayYanPan);

                YanPan33SaveFileUtil.yanPan33SaveFile(yanPanVo,stockDayYanPan);

                YanPan42SaveFileUtil.yanPan42SaveFile(yanPanVo,stockDayYanPan);


                BenPanSaveFileUtil.benPan(yanPanVo,stockDayYanPan);

                YanPanZhuYanJiShuSaveFileUtil.yanPanZhuYanJiShuSaveFile1(yanPanVo,stockDayYanPan);

                String change_20= Qian20Xing.getQian20Xing(changeEntityList);
                KDJScienceVo kdjScienceVo1 = KDJUtil.getKDJScience1(scienceEntityList,changeEntityList);
                if (change_20 != null) {
                    stockDayYanPan.setQian20TuXing(change_20);
                }
                if (kdjScienceVo1 != null) {
                    stockDayYanPan.setKdj(GetkdjString.getkdjString(kdjScienceVo1));
                }
                String str1=GetYiRiXian.getYiRiXian1(dangRiVo, yirichuanVo);
                if (str1!=null) {
                    stockDayYanPan.setDangRi(str1);
                }
                NewCommonSaveFile.newCommonSaveFile(daPanRateOfChangeVo,dangRiVo,yanPanVo,stockDayYanPan);
                return true;
            }
        }
        return true;
    }



}
