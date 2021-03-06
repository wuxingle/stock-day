package com.stock.stockday.service.list;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.stock.apicommon.entity.CengDieEntity;
import com.stock.apicommon.entity.ChangeEntity;
import com.stock.apicommon.entity.DaPanChangeEntity;
import com.stock.apicommon.entity.DangRiEntity;
import com.stock.apicommon.entity.PingDingEntity;
import com.stock.apicommon.entity.ScienceEntity;
import com.stock.apicommon.entity.SunEntity;
import com.stock.apicommon.entity.WuYunEntity;
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
import com.stock.stockday.entity.StockDay0024;
import com.stock.stockday.entity.StockDay0024;
import com.stock.stockday.entity.StockDay0024;
import com.stock.stockday.entity.StockDay0024;
import com.stock.stockday.entity.StockDay399;
import com.stock.stockday.entity.StockDayScience0024;
import com.stock.stockday.entity.StockDayScience0024;
import com.stock.stockday.entity.StockDayScience0024;
import com.stock.stockday.entity.StockDayScience0024;
import com.stock.stockday.entity.StockDayYanPan;
import com.stock.stockday.entity.StockDayYanPanChunJishu;
import com.stock.stockday.entity.StockDayYanPanChunTuxing;
import com.stock.stockday.entity.StockDayYanPanZhuYanJiShu;
import com.stock.stockday.service.StockDay0024Service;
import com.stock.stockday.service.StockDayScience0024Service;
import com.stock.stockday.util.DateUtil;
import com.stock.stockday.util.GetMacdString;
import com.stock.stockday.util.GetRSIString;
import com.stock.stockday.util.GetRate;
import com.stock.stockday.util.GetWRString;
import com.stock.stockday.util.GetXian;
import com.stock.stockday.util.GetYiRiXian;
import com.stock.stockday.util.GetYuCeListUtil;
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
public class GetListStock0024 {
    @Autowired
    private StockDay0024Service stockDay0024Service;
    @Autowired
    private StockDayScience0024Service stockDayScience0024Service;


    public List<StockDayVo> getListStock(StockCode stockCode, List<StockDayVo> stockDayVoList, List<StockDay399> stockDay399001List) throws IOException {
        StockDayVo stockDayVo = new StockDayVo();
        stockDayVo.setCode(stockCode.getEx() + stockCode.getId());
        stockDayVo.setName(stockCode.getName());
        //获取前60天记录，并且取前20天的有效记录
        Page<StockDay0024> page = new Page<>(1, 60);
        List<StockDay0024> stockDay0024List = stockDay0024Service.selectByCodeAndExPage(page, stockCode.getId(), stockCode.getEx());
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
        Page<StockDayScience0024> page1=new Page<>(1,60);
        List<StockDayScience0024> stockDayScience0024List = stockDayScience0024Service.selectByPage(page1,stockCode.getId(), stockCode.getEx());//技术先
        //计算指标，从数据库中获取对于的数据
        List<CengDieEntity> cengDieEntityList = new ArrayList<>();
        List<ChangeEntity> changeEntityList = new ArrayList<>();
        List<DangRiEntity> dangRiEntityList = new ArrayList<>();
        List<DaPanChangeEntity> daPanChangeEntityList = new ArrayList<>();
        List<PingDingEntity> pingDingEntityList = new ArrayList<>();
        List<SunEntity> sunEntityList = new ArrayList<>();
        List<WuYunEntity> wuYunEntityList = new ArrayList<>();

        List<ScienceEntity> scienceEntityList = new ArrayList<>();
        List<StockDay0024> stockDay0024List1 = new ArrayList<>();
        for (StockDay0024 stockDay0024 : stockDay0024List) {
            if (stockDay0024.getOpeningPrice().compareTo(new BigDecimal(0)) != 0 && stockDay0024.getOpeningPrice() != null && stockDay0024.getLclosePrice() != null && stockDay0024.getLclosePrice().compareTo(new BigDecimal(0)) != 0 && stockDay0024.getChangePoints() != null) {
                stockDay0024List1.add(stockDay0024);
            }
            if (stockDay0024List1.size() == 20) {
                stockDayVo.setDate(DateUtil.get2String(stockDay0024List1.get(0).getDate()));
                for (int i = 0; i < stockDay0024List1.size(); i++) {
                    if (i == 0) {
                        DangRiEntity dangRiEntity = new DangRiEntity();
                        BeanUtils.copyProperties(stockDay0024List1.get(i), dangRiEntity);
                        dangRiEntityList.add(dangRiEntity);
                    }
                    if (i < 4) {
                        WuYunEntity wuYunEntity = new WuYunEntity();
                        BeanUtils.copyProperties(stockDay0024List1.get(i), wuYunEntity);
                        wuYunEntityList.add(wuYunEntity);
                    }
                    if ( i < 5) {
                        CengDieEntity cengDieEntity = new CengDieEntity();
                        BeanUtils.copyProperties(stockDay0024List1.get(i), cengDieEntity);
                        cengDieEntityList.add(cengDieEntity);
                    }
                    if (i < 10) {
                        PingDingEntity pingDingEntity = new PingDingEntity();
                        BeanUtils.copyProperties(stockDay0024List1.get(i), pingDingEntity);
                        pingDingEntityList.add(pingDingEntity);

                        SunEntity sunEntity = new SunEntity();
                        BeanUtils.copyProperties(stockDay0024List1.get(i), sunEntity);
                        sunEntityList.add(sunEntity);
                    }
                    if (i < 20) {
                        ChangeEntity changeEntity = new ChangeEntity();
                        BeanUtils.copyProperties(stockDay0024List1.get(i), changeEntity);
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
                for (StockDayScience0024 stockDayScience0024 : stockDayScience0024List) {
                    if (stockDay0024List1.get(0).getDate().compareTo(stockDayScience0024.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience0024, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay0024List1.get(1).getDate().compareTo(stockDayScience0024.getDate()) == 0) {
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
                    if (stockDay0024List1.get(0).getDate().compareTo(stockDay399001.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay399001, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay0024List1.get(1).getDate().compareTo(stockDay399001.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay399001, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay0024List1.get(2).getDate().compareTo(stockDay399001.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay399001, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay0024List1.get(3).getDate().compareTo(stockDay399001.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay399001, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay0024List1.get(4).getDate().compareTo(stockDay399001.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay399001, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay0024List1.get(5).getDate().compareTo(stockDay399001.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay399001, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay0024List1.get(6).getDate().compareTo(stockDay399001.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay399001, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay0024List1.get(7).getDate().compareTo(stockDay399001.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay399001, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay0024List1.get(8).getDate().compareTo(stockDay399001.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay399001, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay0024List1.get(9).getDate().compareTo(stockDay399001.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay399001, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay0024List1.get(10).getDate().compareTo(stockDay399001.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay399001, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay0024List1.get(11).getDate().compareTo(stockDay399001.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay399001, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay0024List1.get(12).getDate().compareTo(stockDay399001.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay399001, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay0024List1.get(13).getDate().compareTo(stockDay399001.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay399001, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay0024List1.get(14).getDate().compareTo(stockDay399001.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay399001, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay0024List1.get(15).getDate().compareTo(stockDay399001.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay399001, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay0024List1.get(16).getDate().compareTo(stockDay399001.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay399001, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay0024List1.get(17).getDate().compareTo(stockDay399001.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay399001, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay0024List1.get(18).getDate().compareTo(stockDay399001.getDate()) == 0) {
                        DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                        BeanUtils.copyProperties(stockDay399001, daPanChangeEntity);
                        daPanChangeEntityList.add(daPanChangeEntity);
                    }
                    if (stockDay0024List1.get(19).getDate().compareTo(stockDay399001.getDate()) == 0) {
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
                //kdj
                KDJScienceVo kdjScienceVo = KDJUtil.getKDJScience(scienceEntityList);
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
                stockDayVoList= GetYuCeListUtil.getYuCeList(daPanRateOfChangeVo,rateOfChangeVo,stockDayYanPan,stockDayVo,stockDayVoList);
            }
        }
        return stockDayVoList;
    }

    public List<StockDayVo> getZhuYanJiShuList(StockCode stockCode, List<StockDayVo> stockDayVoList) throws IOException {
        StockDayVo stockDayVo = new StockDayVo();
        stockDayVo.setCode(stockCode.getEx() + stockCode.getId());
        stockDayVo.setName(stockCode.getName());
        //获取前60天记录，并且取前20天的有效记录
        Page<StockDay0024> page = new Page<>(1, 60);
        List<StockDay0024> stockDay0024List = stockDay0024Service.selectByCodeAndExPage(page, stockCode.getId(), stockCode.getEx());
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
        Page<StockDayScience0024> page1=new Page<>(1,60);
        List<StockDayScience0024> stockDayScience0024List = stockDayScience0024Service.selectByPage(page1,stockCode.getId(), stockCode.getEx());//技术先
        //计算指标，从数据库中获取对于的数据
        List<CengDieEntity> cengDieEntityList = new ArrayList<>();
        List<ChangeEntity> changeEntityList = new ArrayList<>();
        List<DangRiEntity> dangRiEntityList = new ArrayList<>();
        List<PingDingEntity> pingDingEntityList = new ArrayList<>();
        List<SunEntity> sunEntityList = new ArrayList<>();
        List<WuYunEntity> wuYunEntityList = new ArrayList<>();

        List<ScienceEntity> scienceEntityList = new ArrayList<>();
        List<StockDay0024> stockDay0024List1 = new ArrayList<>();
        for (StockDay0024 stockDay0024 : stockDay0024List) {
            if (stockDay0024.getOpeningPrice().compareTo(new BigDecimal(0)) != 0 && stockDay0024.getOpeningPrice() != null && stockDay0024.getLclosePrice() != null && stockDay0024.getLclosePrice().compareTo(new BigDecimal(0)) != 0 && stockDay0024.getChangePoints() != null) {
                stockDay0024List1.add(stockDay0024);
            }
            if (stockDay0024List1.size() == 20) {
                stockDayVo.setDate(DateUtil.get2String(stockDay0024List1.get(0).getDate()));
                for (int i = 0; i < stockDay0024List1.size(); i++) {
                    if (i == 0) {
                        DangRiEntity dangRiEntity = new DangRiEntity();
                        BeanUtils.copyProperties(stockDay0024List1.get(i), dangRiEntity);
                        dangRiEntityList.add(dangRiEntity);
                    }
                    if (i < 4) {
                        WuYunEntity wuYunEntity = new WuYunEntity();
                        BeanUtils.copyProperties(stockDay0024List1.get(i), wuYunEntity);
                        wuYunEntityList.add(wuYunEntity);
                    }
                    if ( i < 5) {
                        CengDieEntity cengDieEntity = new CengDieEntity();
                        BeanUtils.copyProperties(stockDay0024List1.get(i), cengDieEntity);
                        cengDieEntityList.add(cengDieEntity);
                    }
                    if (i < 10) {
                        PingDingEntity pingDingEntity = new PingDingEntity();
                        BeanUtils.copyProperties(stockDay0024List1.get(i), pingDingEntity);
                        pingDingEntityList.add(pingDingEntity);

                        SunEntity sunEntity = new SunEntity();
                        BeanUtils.copyProperties(stockDay0024List1.get(i), sunEntity);
                        sunEntityList.add(sunEntity);
                    }
                    if (i < 20) {
                        ChangeEntity changeEntity = new ChangeEntity();
                        BeanUtils.copyProperties(stockDay0024List1.get(i), changeEntity);
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
                for (StockDayScience0024 stockDayScience0024 : stockDayScience0024List) {
                    if (stockDay0024List1.get(0).getDate().compareTo(stockDayScience0024.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience0024, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay0024List1.get(1).getDate().compareTo(stockDayScience0024.getDate()) == 0) {
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

                StockDayYanPanZhuYanJiShu stockDayYanPanZhuYanJiShu = new StockDayYanPanZhuYanJiShu();
                //层叠
                CengDieVo cengDieVo = StackUtil.getcengdie(cengDieEntityList);
                //平顶
                PingQiVo pingQiVo = AbreastUtil.getPingDing(pingDingEntityList);
                //阳光
                SunVo sunVo = SunUtil.getSun(sunEntityList);
                //乌云
                WuYunVo wuYunVo = BlackCloudsUtil.getWuYun(wuYunEntityList);
                //一日传
                PriceAndMaRelationVo priceAndMaRelationVo=PriceMAUtil.getPriceAndMaRelation(dangRiEntityList.get(0), scienceEntityList.get(0));
                //kdj
                KDJScienceVo kdjScienceVo = KDJUtil.getKDJScience(scienceEntityList);
                MACDScienceVo macdScienceVo = MACDUtil.getMACDScience(scienceEntityList);
                PriceScienceVo priceScienceVo = PriceMAUtil.getPriceScience(scienceEntityList);
                XianVo xianVo = GetXian.getXian(pingQiVo, sunVo, wuYunVo, cengDieVo);
                if (priceAndMaRelationVo.getPriceAndMaRelation()!= null) {
                    stockDayYanPanZhuYanJiShu.setPriceAndMaRelation(priceAndMaRelationVo.getPriceAndMaRelation());
                }
                if (xianVo.getLiangri() != null) {
                    stockDayYanPanZhuYanJiShu.setLiangXian(xianVo.getLiangri());
                }
                if (xianVo.getSanri() != null) {
                    stockDayYanPanZhuYanJiShu.setSanXian(xianVo.getSanri());
                }
                if (kdjScienceVo != null) {
                    stockDayYanPanZhuYanJiShu.setKdj(GetkdjString.getkdjString(kdjScienceVo));
                }
                if (macdScienceVo != null) {
                    stockDayYanPanZhuYanJiShu.setMacd(GetMacdString.getMacdString(macdScienceVo));
                }

                if (priceScienceVo != null) {
                    stockDayYanPanZhuYanJiShu.setPriceMa(priceScienceVo.getJunxian());
                }

                stockDayVoList= GetYuCeListUtil.getZhuYanJiShuList(stockDayYanPanZhuYanJiShu,stockDayVo,stockDayVoList);
            }
        }
        return stockDayVoList;
    }

    public List<StockDayVo> getChunTuXingList(StockCode stockCode, List<StockDayVo> stockDayVoList) throws IOException {
        StockDayVo stockDayVo = new StockDayVo();
        stockDayVo.setCode(stockCode.getEx() + stockCode.getId());
        stockDayVo.setName(stockCode.getName());
        //获取前60天记录，并且取前20天的有效记录
        Page<StockDay0024> page = new Page<>(1, 60);
        List<StockDay0024> stockDay0024List = stockDay0024Service.selectByCodeAndExPage(page, stockCode.getId(), stockCode.getEx());
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
        Page<StockDayScience0024> page1=new Page<>(1,60);
        List<StockDayScience0024> stockDayScience0024List = stockDayScience0024Service.selectByPage(page1,stockCode.getId(), stockCode.getEx());//技术先
        //计算指标，从数据库中获取对于的数据
        List<CengDieEntity> cengDieEntityList = new ArrayList<>();
        List<ChangeEntity> changeEntityList = new ArrayList<>();
        List<DangRiEntity> dangRiEntityList = new ArrayList<>();
        List<PingDingEntity> pingDingEntityList = new ArrayList<>();
        List<SunEntity> sunEntityList = new ArrayList<>();
        List<WuYunEntity> wuYunEntityList = new ArrayList<>();

        List<ScienceEntity> scienceEntityList = new ArrayList<>();
        List<StockDay0024> stockDay0024List1 = new ArrayList<>();
        for (StockDay0024 stockDay0024 : stockDay0024List) {
            if (stockDay0024.getOpeningPrice().compareTo(new BigDecimal(0)) != 0 && stockDay0024.getOpeningPrice() != null && stockDay0024.getLclosePrice() != null && stockDay0024.getLclosePrice().compareTo(new BigDecimal(0)) != 0 && stockDay0024.getChangePoints() != null) {
                stockDay0024List1.add(stockDay0024);
            }
            if (stockDay0024List1.size() == 20) {
                stockDayVo.setDate(DateUtil.get2String(stockDay0024List1.get(0).getDate()));
                for (int i = 0; i < stockDay0024List1.size(); i++) {
                    if (i == 0) {
                        DangRiEntity dangRiEntity = new DangRiEntity();
                        BeanUtils.copyProperties(stockDay0024List1.get(i), dangRiEntity);
                        dangRiEntityList.add(dangRiEntity);
                    }
                    if (i < 4) {
                        WuYunEntity wuYunEntity = new WuYunEntity();
                        BeanUtils.copyProperties(stockDay0024List1.get(i), wuYunEntity);
                        wuYunEntityList.add(wuYunEntity);
                    }
                    if ( i < 5) {
                        CengDieEntity cengDieEntity = new CengDieEntity();
                        BeanUtils.copyProperties(stockDay0024List1.get(i), cengDieEntity);
                        cengDieEntityList.add(cengDieEntity);
                    }
                    if (i < 10) {
                        PingDingEntity pingDingEntity = new PingDingEntity();
                        BeanUtils.copyProperties(stockDay0024List1.get(i), pingDingEntity);
                        pingDingEntityList.add(pingDingEntity);

                        SunEntity sunEntity = new SunEntity();
                        BeanUtils.copyProperties(stockDay0024List1.get(i), sunEntity);
                        sunEntityList.add(sunEntity);
                    }
                    if (i < 20) {
                        ChangeEntity changeEntity = new ChangeEntity();
                        BeanUtils.copyProperties(stockDay0024List1.get(i), changeEntity);
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
                for (StockDayScience0024 stockDayScience0024 : stockDayScience0024List) {
                    if (stockDay0024List1.get(0).getDate().compareTo(stockDayScience0024.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience0024, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay0024List1.get(1).getDate().compareTo(stockDayScience0024.getDate()) == 0) {
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

                StockDayYanPanChunTuxing stockDayYanPanChunTuxing=new StockDayYanPanChunTuxing();
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
                XianVo xianVo = GetXian.getXian(pingQiVo, sunVo, wuYunVo, cengDieVo);
                String str=GetYiRiXian.getYiRiXian(dangRiVo, yirichuanVo);
                if (str!=null) {
                    stockDayYanPanChunTuxing.setDangRi(str);
                }
                if (xianVo.getLiangri() != null) {
                    stockDayYanPanChunTuxing.setLiangXian(xianVo.getLiangri());
                }
                if (xianVo.getSanri() != null) {
                    stockDayYanPanChunTuxing.setSanXian(xianVo.getSanri());
                }
                if (xianVo.getSiri() != null) {
                    stockDayYanPanChunTuxing.setSiXian(xianVo.getSiri());
                }
                if (xianVo.getWuri() != null) {
                    stockDayYanPanChunTuxing.setWuXian(xianVo.getWuri());
                }
                if (xianVo.getDuori() != null) {
                    stockDayYanPanChunTuxing.setDuoXian(xianVo.getDuori());
                }

                stockDayVoList= GetYuCeListUtil.getChunTuXingList(stockDayYanPanChunTuxing,stockDayVo,stockDayVoList);
            }
        }
        return stockDayVoList;
    }

    public List<StockDayVo> getChunJiShuList(StockCode stockCode, List<StockDayVo> stockDayVoList) throws IOException {
        StockDayVo stockDayVo = new StockDayVo();
        stockDayVo.setCode(stockCode.getEx() + stockCode.getId());
        stockDayVo.setName(stockCode.getName());
        //获取前60天记录，并且取前20天的有效记录
        Page<StockDay0024> page = new Page<>(1, 60);
        List<StockDay0024> stockDay0024List = stockDay0024Service.selectByCodeAndExPage(page, stockCode.getId(), stockCode.getEx());
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
        Page<StockDayScience0024> page1=new Page<>(1,60);
        List<StockDayScience0024> stockDayScience0024List = stockDayScience0024Service.selectByPage(page1,stockCode.getId(), stockCode.getEx());//技术先
        //计算指标，从数据库中获取对于的数据
        List<ScienceEntity> scienceEntityList = new ArrayList<>();
        List<StockDay0024> stockDay0024List1 = new ArrayList<>();
        for (StockDay0024 stockDay0024 : stockDay0024List) {
            if (stockDay0024.getOpeningPrice().compareTo(new BigDecimal(0)) != 0 && stockDay0024.getOpeningPrice() != null && stockDay0024.getLclosePrice() != null && stockDay0024.getLclosePrice().compareTo(new BigDecimal(0)) != 0 && stockDay0024.getChangePoints() != null) {
                stockDay0024List1.add(stockDay0024);
            }
            if (stockDay0024List1.size() == 20) {
                stockDayVo.setDate(DateUtil.get2String(stockDay0024List1.get(0).getDate()));

                //技术
                for (StockDayScience0024 stockDayScience0024 : stockDayScience0024List) {
                    if (stockDay0024List1.get(0).getDate().compareTo(stockDayScience0024.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience0024, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDay0024List1.get(1).getDate().compareTo(stockDayScience0024.getDate()) == 0) {
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

                StockDayYanPanChunJishu stockDayYanPanChunJishu=new StockDayYanPanChunJishu();

                //kdj
                KDJScienceVo kdjScienceVo = KDJUtil.getKDJScience(scienceEntityList);
                MACDScienceVo macdScienceVo = MACDUtil.getMACDScience(scienceEntityList);
                QuantityScienceVo quantityScienceVo = MakeQuantityMAUtil.getQuantityScience(scienceEntityList);
                PriceScienceVo priceScienceVo = PriceMAUtil.getPriceScience(scienceEntityList);
                RSIScienceVo rsiScienceVo = RSIUtil.getRSIScience(scienceEntityList);
                WRScienceVo wrScienceVo = WRUtil.getWRScience(scienceEntityList);

                if (kdjScienceVo!=null) {
                    stockDayYanPanChunJishu.setKdj(GetkdjString.getkdjString(kdjScienceVo));
                }
                if (macdScienceVo!= null) {
                    stockDayYanPanChunJishu.setMacd(GetMacdString.getMacdString(macdScienceVo));
                }
                if (quantityScienceVo != null) {
                    stockDayYanPanChunJishu.setQuantityMa(quantityScienceVo.getJunxian());
                }
                if (priceScienceVo!= null) {
                    stockDayYanPanChunJishu.setPriceMa(priceScienceVo.getJunxian());
                }
                if (rsiScienceVo != null) {
                    stockDayYanPanChunJishu.setRsi(GetRSIString.getRSIString(rsiScienceVo));
                }
                if (wrScienceVo != null) {
                    stockDayYanPanChunJishu.setWr(GetWRString.getWRString(wrScienceVo));
                }

                stockDayVoList= GetYuCeListUtil.getChunJiShuList(stockDayYanPanChunJishu,stockDayVo,stockDayVoList);
            }
        }
        return stockDayVoList;
    }
}
