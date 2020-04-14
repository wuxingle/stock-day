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
import com.stock.stockday.entity.StockDay399;
import com.stock.stockday.entity.StockDayScience399;
import com.stock.stockday.service.StockDay399Service;
import com.stock.stockday.service.StockDayScience399Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class DayScience399FunctionToday {
    @Autowired
    private StockDayScience399Service stockDayScience399Service;
    @Autowired
    private StockDay399Service stockDay399Service;
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    public boolean dayScience399Function(StockDay399 stockDay399) {
        Page<StockDay399> page = new Page<>(1, 60);
        List<StockDay399> stockDay399List = stockDay399Service.selectByCodeAndExPage(page, stockDay399.getCodeId(), stockDay399.getCodeEx());
        Page<StockDayScience399> page1 = new Page<>(1, 60);
        List<StockDayScience399> stockDayScience399List = stockDayScience399Service.selectByPage(page1, stockDay399.getCodeId(), stockDay399.getCodeEx());
        if (stockDay399List == null || stockDay399List.size() == 0) {
            return false;
        }
        stockDay399List.add(stockDay399);
        //排序
        Collections.sort(stockDay399List, new Comparator<StockDay399>() {
            @Override
            public int compare(StockDay399 o1, StockDay399 o2) {
                long i = o2.getDate().getTime() - o1.getDate().getTime();
                if (i > 0) {
                    return 1;
                } else if (i < 0) {
                    return -1;
                }
                return 0;
            }
        });
        Collections.sort(stockDayScience399List, new Comparator<StockDayScience399>() {
            @Override
            public int compare(StockDayScience399 o1, StockDayScience399 o2) {
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
        stockDay399List.remove(stockDay399List.size()-1);
        //保存Redis
        redisTemplate.opsForValue().set(stockDay399.getCodeEx()+stockDay399.getCodeId(), stockDay399List);
        MacdEntity macdEntity1 = new MacdEntity();
        macdEntity1.setClosingPrice(stockDay399.getClosingPrice());
        if (stockDayScience399List == null || stockDayScience399List.size() == 0) {
            macdEntity1.setBeforeEma12(new BigDecimal(50.0));
            macdEntity1.setBeforeDea(new BigDecimal(50.0));
            macdEntity1.setBeforeEma26(new BigDecimal(50.0));
        }else {
            macdEntity1.setBeforeEma12(stockDayScience399List.get(0).getEma12());
            macdEntity1.setBeforeDea(stockDayScience399List.get(0).getDea());
            macdEntity1.setBeforeEma26(stockDayScience399List.get(0).getEma26());
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

        for (int i = 0; i < stockDay399List.size(); i++) {
            if (i < 9) {
                KDJEntity kdjEntity = new KDJEntity();
                kdjEntity.setClosingPrice(stockDay399List.get(i).getClosingPrice());
                kdjEntity.setFoot(stockDay399List.get(i).getFoot());
                kdjEntity.setTopside(stockDay399List.get(i).getTopside());
                kdjEntity.setDate(stockDay399List.get(i).getDate());
                kdjEntityList.add(kdjEntity);
            }
            if (i<14){
                CCIEntity cciEntity = new CCIEntity();
                cciEntity.setDate(stockDay399List.get(i).getDate());
                cciEntity.setClosingPrice(stockDay399List.get(i).getClosingPrice());
                cciEntity.setFoot(stockDay399List.get(i).getFoot());
                cciEntity.setTopside(stockDay399List.get(i).getTopside());
                cciEntityList.add(cciEntity);
            }
            if (i<20){
                BOLLEntity bollEntity = new BOLLEntity();
                bollEntity.setDate(stockDay399List.get(i).getDate());
                bollEntity.setClosingPrice(stockDay399List.get(i).getClosingPrice());
                bollEntityList.add(bollEntity);
            }
            if (i<24){
                RSIEntity rsiEntity = new RSIEntity();
                if (stockDay399List.get(i).getChangePoints() == null) {
                    rsiEntity.setChangePoints(new BigDecimal(0));
                } else {
                    rsiEntity.setChangePoints(stockDay399List.get(i).getChangePoints());
                }
                rsiEntity.setDate(stockDay399List.get(i).getDate());
                rsiEntityList.add(rsiEntity);
            }
            if (i<30){
                BIASEntity biasEntity = new BIASEntity();
                biasEntity.setClosingPrice(stockDay399List.get(i).getClosingPrice());
                biasEntity.setDate(stockDay399List.get(i).getDate());
                biasEntityList.add(biasEntity);

                MakeQuantityEntity makeQuantityEntity = new MakeQuantityEntity();
                makeQuantityEntity.setDate(stockDay399List.get(i).getDate());
                makeQuantityEntity.setMakeQuantity(stockDay399List.get(i).getMakeQuantity());
                makeQuantityEntityList.add(makeQuantityEntity);
            }
            if (i<42){
                WREntity wrEntity = new WREntity();
                wrEntity.setDate(stockDay399List.get(i).getDate());
                wrEntity.setClosingPrice(stockDay399List.get(i).getClosingPrice());
                wrEntity.setFoot(stockDay399List.get(i).getFoot());
                wrEntity.setTopside(stockDay399List.get(i).getTopside());
                wrEntityList.add(wrEntity);
            }
            if (i<60){
                PriceEntity priceEntity = new PriceEntity();
                priceEntity.setDate(stockDay399List.get(i).getDate());
                priceEntity.setClosingPrice(stockDay399List.get(i).getClosingPrice());
                priceEntityList.add(priceEntity);
            }

        }
        StockDayScience399 stockDayScience399 = new StockDayScience399();
        stockDayScience399.setCodeId(stockDay399.getCodeId());
        stockDayScience399.setCodeEx(stockDay399.getCodeEx());
        stockDayScience399.setDate(stockDay399.getDate());
        stockDayScience399.setQuantity(stockDay399.getMakeQuantity());

        if (stockDay399.getOpeningPrice() == null || stockDay399.getOpeningPrice().compareTo(BigDecimal.ZERO) == 0) {
            return false;
        }
        //macd
        MacdVo macdVo = MACDUtil.getMacd1(macdEntity1);
        if (macdVo != null) {
            stockDayScience399.setMacd(macdVo.getMACD());
            stockDayScience399.setDiff(macdVo.getDIF());
            stockDayScience399.setDea(macdVo.getDEA());
            stockDayScience399.setEma12(macdVo.getEMA12());
            stockDayScience399.setEma26(macdVo.getEMA26());
        }
        //kdj
        if (kdjEntityList.size() == 9) {
            if (stockDayScience399List.get(0).getD()==null||stockDayScience399List.get(0).getK()==null||stockDayScience399List.get(0).getRsv()==null) {
                kdjEntity1.setBeforeD(new BigDecimal(50));
                kdjEntity1.setBeforeK(new BigDecimal(50));
                kdjEntity1.setBeforeRSV(new BigDecimal(50));
            }else {
                kdjEntity1.setBeforeD(stockDayScience399List.get(0).getD());
                kdjEntity1.setBeforeK(stockDayScience399List.get(0).getK());
                kdjEntity1.setBeforeRSV(stockDayScience399List.get(0).getRsv());
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
            kdjEntity1.setClosingPrice(stockDay399.getClosingPrice());

            KDJVo kdjVo = KDJUtil.getKDJ(kdjEntity1);
            stockDayScience399.setK(kdjVo.getK());
            stockDayScience399.setD(kdjVo.getD());
            stockDayScience399.setJ(kdjVo.getJ());
            stockDayScience399.setRsv(kdjVo.getRSV());
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
            stockDayScience399.setRsi1(rsiVo.getRSI6());
            stockDayScience399.setRsi2(rsiVo.getRSI12());
            stockDayScience399.setRsi3(rsiVo.getRSI24());
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
            stockDayScience399.setBias1(biasVo.getBIAS5());
            stockDayScience399.setBias2(biasVo.getBIAS10());
            stockDayScience399.setBias3(biasVo.getBIAS30());
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
            stockDayScience399.setCci(cciVo.getCCI());
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
            stockDayScience399.setWr1(wrVo.getWR21());
            stockDayScience399.setWr2(wrVo.getWR42());
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
            stockDayScience399.setUpp(bollVo.getUP());
            stockDayScience399.setMid(bollVo.getMB());
            stockDayScience399.setLow(bollVo.getDN());
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
            stockDayScience399.setMakeQuantityMa5(makeQuantityVo.getMakeQuantity5());
            stockDayScience399.setMakeQuantityMa10(makeQuantityVo.getMakeQuantity10());
            stockDayScience399.setMakeQuantityMa20(makeQuantityVo.getMakeQuantity20());
            stockDayScience399.setMakeQuantityMa30(makeQuantityVo.getMakeQuantity30());
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
            stockDayScience399.setPriceMa5(priceVo.getPriceMa5());
            stockDayScience399.setPriceMa10(priceVo.getPriceMa10());
            stockDayScience399.setPriceMa20(priceVo.getPriceMa20());
            stockDayScience399.setPriceMa30(priceVo.getPriceMa30());
            stockDayScience399.setPriceMa60(priceVo.getPriceMa60());
        }
        //保存Redis
        stockDayScience399List.add(stockDayScience399);
        Collections.sort(stockDayScience399List, new Comparator<StockDayScience399>() {
            @Override
            public int compare(StockDayScience399 o1, StockDayScience399 o2) {
                long i = o2.getDate().getTime() - o1.getDate().getTime();
                if (i > 0) {
                    return 1;
                } else if (i < 0) {
                    return -1;
                }
                return 0;
            }
        });
        stockDayScience399List.remove(stockDayScience399List.size()-1);
        redisTemplate.opsForValue().set(Constants.SCIENCE+stockDay399.getCodeEx()+stockDay399.getCodeId(), stockDayScience399List);
        stockDayScience399Service.save(stockDayScience399);
        return true;

    }

}
