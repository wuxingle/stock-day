package com.stock.stockday.service.function;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.stock.apicommon.Constants;
import com.stock.apicommon.entity.BIASEntity;
import com.stock.apicommon.entity.BOLLEntity;
import com.stock.apicommon.entity.CCIEntity;
import com.stock.apicommon.entity.KDJEntity;
import com.stock.apicommon.entity.MacdEntity;
import com.stock.apicommon.entity.MakeQuantityEntity;
import com.stock.apicommon.entity.PriceEntity;
import com.stock.apicommon.entity.RSIEntity;
import com.stock.apicommon.entity.WREntity;
import com.stock.apicommon.utils.BIASUtil;
import com.stock.apicommon.utils.BOLLUtil;
import com.stock.apicommon.utils.CCIUtil;
import com.stock.apicommon.utils.KDJUtil;
import com.stock.apicommon.utils.MACDUtil;
import com.stock.apicommon.utils.MakeQuantityMAUtil;
import com.stock.apicommon.utils.PriceMAUtil;
import com.stock.apicommon.utils.RSIUtil;
import com.stock.apicommon.utils.WRUtil;
import com.stock.apicommon.vo.BIASVo;
import com.stock.apicommon.vo.BOLLVo;
import com.stock.apicommon.vo.CCIVo;
import com.stock.apicommon.vo.KDJVo;
import com.stock.apicommon.vo.MacdVo;
import com.stock.apicommon.vo.MakeQuantityVo;
import com.stock.apicommon.vo.PriceVo;
import com.stock.apicommon.vo.RSIVo;
import com.stock.apicommon.vo.WRVo;
import com.stock.stockday.entity.StockDay6004;
import com.stock.stockday.entity.StockDayScience6004;
import com.stock.stockday.service.StockDay6004Service;
import com.stock.stockday.service.StockDayScience6004Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class DayScience6004FunctionToday {
    @Autowired
    private StockDayScience6004Service stockDayScience6004Service;
    @Autowired
    private StockDay6004Service stockDay6004Service;
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    public boolean dayScience6004Function(StockDay6004 stockDay6004) {
        Page<StockDay6004> page = new Page<>(1, 60);
        List<StockDay6004> stockDay6004List = stockDay6004Service.selectByCodeAndExPage(page, stockDay6004.getCodeId(), stockDay6004.getCodeEx());
        Page<StockDayScience6004> page1 = new Page<>(1, 60);
        List<StockDayScience6004> stockDayScience6004List = stockDayScience6004Service.selectByPage(page1, stockDay6004.getCodeId(), stockDay6004.getCodeEx());
        if (stockDay6004List == null || stockDay6004List.size() == 0) {
            return false;
        }
        stockDay6004List.add(stockDay6004);
        //排序
        Collections.sort(stockDay6004List, new Comparator<StockDay6004>() {
            @Override
            public int compare(StockDay6004 o1, StockDay6004 o2) {
                long i = o2.getDate().getTime() - o1.getDate().getTime();
                if (i > 0) {
                    return 1;
                } else if (i < 0) {
                    return -1;
                }
                return 0;
            }
        });
        Collections.sort(stockDayScience6004List, new Comparator<StockDayScience6004>() {
            @Override
            public int compare(StockDayScience6004 o1, StockDayScience6004 o2) {
                long i = o2.getDate().getTime() - o1.getDate().getTime();
                if (i > 0) {
                    return 1;
                } else if (i < 0) {
                    return -1;
                }
                return 0;
            }
        });
        //去掉最后一个
        stockDay6004List.remove(stockDay6004List.size()-1);
        //保存Redis
        redisTemplate.opsForValue().set(stockDay6004.getCodeEx()+stockDay6004.getCodeId(), stockDay6004List);
        MacdEntity macdEntity1 = new MacdEntity();
        macdEntity1.setClosingPrice(stockDay6004.getClosingPrice());
        if (stockDayScience6004List == null || stockDayScience6004List.size() == 0) {
            macdEntity1.setBeforeEma12(new BigDecimal(50.0));
            macdEntity1.setBeforeDea(new BigDecimal(50.0));
            macdEntity1.setBeforeEma26(new BigDecimal(50.0));
        }else {
            macdEntity1.setBeforeEma12(stockDayScience6004List.get(0).getEma12());
            macdEntity1.setBeforeDea(stockDayScience6004List.get(0).getDea());
            macdEntity1.setBeforeEma26(stockDayScience6004List.get(0).getEma26());
        }
        List<KDJEntity> kdjEntityList = new ArrayList<>();
        KDJEntity kdjEntity1 = new KDJEntity();
        KDJEntity kdjEntity2 = new KDJEntity();
        List<RSIEntity> rsiEntityList = new ArrayList<>();
        List<BIASEntity> biasEntityList = new ArrayList<>();
        List<CCIEntity> cciEntityList = new ArrayList<>();
        List<WREntity> wrEntityList = new ArrayList<>();
        List<BOLLEntity> bollEntityList = new ArrayList<>();
        List<MakeQuantityEntity> makeQuantityEntityList = new ArrayList<>();
        List<PriceEntity> priceEntityList = new ArrayList<>();

        for (int i = 0; i < stockDay6004List.size(); i++) {
            if (i < 9) {
                KDJEntity kdjEntity = new KDJEntity();
                kdjEntity.setClosingPrice(stockDay6004List.get(i).getClosingPrice());
                kdjEntity.setFoot(stockDay6004List.get(i).getFoot());
                kdjEntity.setTopside(stockDay6004List.get(i).getTopside());
                kdjEntity.setDate(stockDay6004List.get(i).getDate());
                kdjEntityList.add(kdjEntity);
            }
            if (i<14){
                CCIEntity cciEntity = new CCIEntity();
                cciEntity.setDate(stockDay6004List.get(i).getDate());
                cciEntity.setClosingPrice(stockDay6004List.get(i).getClosingPrice());
                cciEntity.setFoot(stockDay6004List.get(i).getFoot());
                cciEntity.setTopside(stockDay6004List.get(i).getTopside());
                cciEntityList.add(cciEntity);
            }
            if (i<20){
                BOLLEntity bollEntity = new BOLLEntity();
                bollEntity.setDate(stockDay6004List.get(i).getDate());
                bollEntity.setClosingPrice(stockDay6004List.get(i).getClosingPrice());
                bollEntityList.add(bollEntity);
            }
            if (i<24){
                RSIEntity rsiEntity = new RSIEntity();
                if (stockDay6004List.get(i).getChangePoints() == null) {
                    rsiEntity.setChangePoints(new BigDecimal(0));
                } else {
                    rsiEntity.setChangePoints(stockDay6004List.get(i).getChangePoints());
                }
                rsiEntity.setDate(stockDay6004List.get(i).getDate());
                rsiEntityList.add(rsiEntity);
            }
            if (i<30){
                BIASEntity biasEntity = new BIASEntity();
                biasEntity.setClosingPrice(stockDay6004List.get(i).getClosingPrice());
                biasEntity.setDate(stockDay6004List.get(i).getDate());
                biasEntityList.add(biasEntity);

                MakeQuantityEntity makeQuantityEntity = new MakeQuantityEntity();
                makeQuantityEntity.setDate(stockDay6004List.get(i).getDate());
                makeQuantityEntity.setMakeQuantity(stockDay6004List.get(i).getMakeQuantity());
                makeQuantityEntityList.add(makeQuantityEntity);
            }
            if (i<42){
                WREntity wrEntity = new WREntity();
                wrEntity.setDate(stockDay6004List.get(i).getDate());
                wrEntity.setClosingPrice(stockDay6004List.get(i).getClosingPrice());
                wrEntity.setFoot(stockDay6004List.get(i).getFoot());
                wrEntity.setTopside(stockDay6004List.get(i).getTopside());
                wrEntityList.add(wrEntity);
            }
            if (i<60){
                PriceEntity priceEntity = new PriceEntity();
                priceEntity.setDate(stockDay6004List.get(i).getDate());
                priceEntity.setClosingPrice(stockDay6004List.get(i).getClosingPrice());
                priceEntityList.add(priceEntity);
            }

        }
        StockDayScience6004 stockDayScience6004 = new StockDayScience6004();
        stockDayScience6004.setCodeId(stockDay6004.getCodeId());
        stockDayScience6004.setCodeEx(stockDay6004.getCodeEx());
        stockDayScience6004.setDate(stockDay6004.getDate());
        stockDayScience6004.setQuantity(stockDay6004.getMakeQuantity());

        if (stockDay6004.getOpeningPrice() == null || stockDay6004.getOpeningPrice().compareTo(BigDecimal.ZERO) == 0) {
            return false;
        }
        //macd
        MacdVo macdVo = MACDUtil.getMacd1(macdEntity1);
        if (macdVo != null) {
            stockDayScience6004.setMacd(macdVo.getMACD());
            stockDayScience6004.setDiff(macdVo.getDIF());
            stockDayScience6004.setDea(macdVo.getDEA());
            stockDayScience6004.setEma12(macdVo.getEMA12());
            stockDayScience6004.setEma26(macdVo.getEMA26());
        }
        //kdj
        if (kdjEntityList.size() == 9) {
            if (stockDayScience6004List.get(0).getD()==null||stockDayScience6004List.get(0).getK()==null||stockDayScience6004List.get(0).getRsv()==null) {
                kdjEntity1.setBeforeD(new BigDecimal(50));
                kdjEntity1.setBeforeK(new BigDecimal(50));
                kdjEntity1.setBeforeRSV(new BigDecimal(50));
            }else {
                kdjEntity1.setBeforeD(stockDayScience6004List.get(0).getD());
                kdjEntity1.setBeforeK(stockDayScience6004List.get(0).getK());
                kdjEntity1.setBeforeRSV(stockDayScience6004List.get(0).getRsv());
            }
            Collections.sort(kdjEntityList, new Comparator<KDJEntity>() {
                @Override
                public int compare(KDJEntity o1, KDJEntity o2) {
                    return o1.getFoot().compareTo(o2.getFoot());
                }
            });
            kdjEntity1.setFoot(kdjEntityList.get(0).getFoot());
            Collections.sort(kdjEntityList, new Comparator<KDJEntity>() {
                @Override
                public int compare(KDJEntity o1, KDJEntity o2) {
                    return o2.getTopside().compareTo(o1.getTopside());
                }
            });
            kdjEntity1.setTopside(kdjEntityList.get(0).getTopside());
            kdjEntity1.setClosingPrice(stockDay6004.getClosingPrice());

            KDJVo kdjVo = KDJUtil.getKDJ(kdjEntity1);
            stockDayScience6004.setK(kdjVo.getK());
            stockDayScience6004.setD(kdjVo.getD());
            stockDayScience6004.setJ(kdjVo.getJ());
            stockDayScience6004.setRsv(kdjVo.getRSV());
        }
        //RSI
        if (rsiEntityList.size() == 24) {
            Collections.sort(rsiEntityList, new Comparator<RSIEntity>() {
                @Override
                public int compare(RSIEntity o1, RSIEntity o2) {
                    long i = o2.getDate().getTime() - o1.getDate().getTime();
                    if (i > 0) {
                        return 1;
                    } else if (i < 0) {
                        return -1;
                    }
                    return 0;
                }
            });
            RSIVo rsiVo = RSIUtil.getRSI(rsiEntityList);
            stockDayScience6004.setRsi1(rsiVo.getRSI6());
            stockDayScience6004.setRsi2(rsiVo.getRSI12());
            stockDayScience6004.setRsi3(rsiVo.getRSI24());
        }
        //BIAS
        if (biasEntityList.size() == 30) {
            Collections.sort(biasEntityList, new Comparator<BIASEntity>() {
                @Override
                public int compare(BIASEntity o1, BIASEntity o2) {
                    long i = o2.getDate().getTime() - o1.getDate().getTime();
                    if (i > 0) {
                        return 1;
                    } else if (i < 0) {
                        return -1;
                    }
                    return 0;
                }
            });
            BIASVo biasVo = BIASUtil.getBIAS(biasEntityList);
            stockDayScience6004.setBias1(biasVo.getBIAS5());
            stockDayScience6004.setBias2(biasVo.getBIAS10());
            stockDayScience6004.setBias3(biasVo.getBIAS30());
        }
        //CCI
        if (cciEntityList.size() == 14) {
            Collections.sort(cciEntityList, new Comparator<CCIEntity>() {
                @Override
                public int compare(CCIEntity o1, CCIEntity o2) {
                    long i = o1.getDate().getTime() - o2.getDate().getTime();
                    if (i > 0) {
                        return 1;
                    } else if (i < 0) {
                        return -1;
                    }
                    return 0;
                }
            });
            CCIVo cciVo = CCIUtil.getCCI(cciEntityList);
            stockDayScience6004.setCci(cciVo.getCCI());
        }
        //WR
        if (wrEntityList.size() == 42) {
            Collections.sort(wrEntityList, new Comparator<WREntity>() {
                @Override
                public int compare(WREntity o1, WREntity o2) {
                    long i = o2.getDate().getTime() - o1.getDate().getTime();
                    if (i > 0) {
                        return 1;
                    } else if (i < 0) {
                        return -1;
                    }
                    return 0;
                }
            });
            WRVo wrVo = WRUtil.getWR(wrEntityList);
            stockDayScience6004.setWr1(wrVo.getWR21());
            stockDayScience6004.setWr2(wrVo.getWR42());
        }
        //BOLL
        if (bollEntityList.size() == 20) {
            Collections.sort(bollEntityList, new Comparator<BOLLEntity>() {
                @Override
                public int compare(BOLLEntity o1, BOLLEntity o2) {
                    long i = o2.getDate().getTime() - o1.getDate().getTime();
                    if (i > 0) {
                        return 1;
                    } else if (i < 0) {
                        return -1;
                    }
                    return 0;
                }
            });
            BOLLVo bollVo = BOLLUtil.getBOLL(bollEntityList);
            stockDayScience6004.setUpp(bollVo.getUP());
            stockDayScience6004.setMid(bollVo.getMB());
            stockDayScience6004.setLow(bollVo.getDN());
        }
        //均量
        if (makeQuantityEntityList.size() == 30) {
            Collections.sort(makeQuantityEntityList, new Comparator<MakeQuantityEntity>() {
                @Override
                public int compare(MakeQuantityEntity o1, MakeQuantityEntity o2) {
                    long i = o2.getDate().getTime() - o1.getDate().getTime();
                    if (i > 0) {
                        return 1;
                    } else if (i < 0) {
                        return -1;
                    }
                    return 0;
                }
            });
            MakeQuantityVo makeQuantityVo = MakeQuantityMAUtil.getMakeQuantity(makeQuantityEntityList);
            stockDayScience6004.setMakeQuantityMa5(makeQuantityVo.getMakeQuantity5());
            stockDayScience6004.setMakeQuantityMa10(makeQuantityVo.getMakeQuantity10());
            stockDayScience6004.setMakeQuantityMa20(makeQuantityVo.getMakeQuantity20());
            stockDayScience6004.setMakeQuantityMa30(makeQuantityVo.getMakeQuantity30());
        }
        //均价
        if (priceEntityList.size() == 60) {
            Collections.sort(priceEntityList, new Comparator<PriceEntity>() {
                @Override
                public int compare(PriceEntity o1, PriceEntity o2) {
                    long i = o2.getDate().getTime() - o1.getDate().getTime();
                    if (i > 0) {
                        return 1;
                    } else if (i < 0) {
                        return -1;
                    }
                    return 0;
                }
            });
            PriceVo priceVo = PriceMAUtil.getPriceMA(priceEntityList);
            stockDayScience6004.setPriceMa5(priceVo.getPriceMa5());
            stockDayScience6004.setPriceMa10(priceVo.getPriceMa10());
            stockDayScience6004.setPriceMa20(priceVo.getPriceMa20());
            stockDayScience6004.setPriceMa30(priceVo.getPriceMa30());
            stockDayScience6004.setPriceMa60(priceVo.getPriceMa60());
        }
        //保存Redis
        stockDayScience6004List.add(stockDayScience6004);
        Collections.sort(stockDayScience6004List, new Comparator<StockDayScience6004>() {
            @Override
            public int compare(StockDayScience6004 o1, StockDayScience6004 o2) {
                long i = o2.getDate().getTime() - o1.getDate().getTime();
                if (i > 0) {
                    return 1;
                } else if (i < 0) {
                    return -1;
                }
                return 0;
            }
        });
        stockDayScience6004List.remove(stockDayScience6004List.size()-1);
        redisTemplate.opsForValue().set(Constants.SCIENCE+stockDay6004.getCodeEx()+stockDay6004.getCodeId(), stockDayScience6004List);
        stockDayScience6004Service.save(stockDayScience6004);
        return true;

    }

}
