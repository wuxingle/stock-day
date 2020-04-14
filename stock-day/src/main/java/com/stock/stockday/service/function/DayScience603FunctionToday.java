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
import com.stock.stockday.entity.StockDay603;
import com.stock.stockday.entity.StockDayScience603;
import com.stock.stockday.service.StockDay603Service;
import com.stock.stockday.service.StockDayScience603Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class DayScience603FunctionToday {
    @Autowired
    private StockDayScience603Service stockDayScience603Service;
    @Autowired
    private StockDay603Service stockDay603Service;
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    public boolean dayScience603Function(StockDay603 stockDay603) {
        Page<StockDay603> page = new Page<>(1, 60);
        List<StockDay603> stockDay603List = stockDay603Service.selectByCodeAndExPage(page, stockDay603.getCodeId(), stockDay603.getCodeEx());
        Page<StockDayScience603> page1 = new Page<>(1, 60);
        List<StockDayScience603> stockDayScience603List = stockDayScience603Service.selectByPage(page1, stockDay603.getCodeId(), stockDay603.getCodeEx());
        if (stockDay603List == null || stockDay603List.size() == 0) {
            return false;
        }
        stockDay603List.add(stockDay603);
        //排序
        Collections.sort(stockDay603List, new Comparator<StockDay603>() {
            @Override
            public int compare(StockDay603 o1, StockDay603 o2) {
                long i = o2.getDate().getTime() - o1.getDate().getTime();
                if (i > 0) {
                    return 1;
                } else if (i < 0) {
                    return -1;
                }
                return 0;
            }
        });
        Collections.sort(stockDayScience603List, new Comparator<StockDayScience603>() {
            @Override
            public int compare(StockDayScience603 o1, StockDayScience603 o2) {
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
        stockDay603List.remove(stockDay603List.size()-1);
        //保存Redis
        redisTemplate.opsForValue().set(stockDay603.getCodeEx()+stockDay603.getCodeId(), stockDay603List);
        MacdEntity macdEntity1 = new MacdEntity();
        macdEntity1.setClosingPrice(stockDay603.getClosingPrice());
        if (stockDayScience603List == null || stockDayScience603List.size() == 0) {
            macdEntity1.setBeforeEma12(new BigDecimal(50.0));
            macdEntity1.setBeforeDea(new BigDecimal(50.0));
            macdEntity1.setBeforeEma26(new BigDecimal(50.0));
        }else {
            macdEntity1.setBeforeEma12(stockDayScience603List.get(0).getEma12());
            macdEntity1.setBeforeDea(stockDayScience603List.get(0).getDea());
            macdEntity1.setBeforeEma26(stockDayScience603List.get(0).getEma26());
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

        for (int i = 0; i < stockDay603List.size(); i++) {
            if (i < 9) {
                KDJEntity kdjEntity = new KDJEntity();
                kdjEntity.setClosingPrice(stockDay603List.get(i).getClosingPrice());
                kdjEntity.setFoot(stockDay603List.get(i).getFoot());
                kdjEntity.setTopside(stockDay603List.get(i).getTopside());
                kdjEntity.setDate(stockDay603List.get(i).getDate());
                kdjEntityList.add(kdjEntity);
            }
            if (i<14){
                CCIEntity cciEntity = new CCIEntity();
                cciEntity.setDate(stockDay603List.get(i).getDate());
                cciEntity.setClosingPrice(stockDay603List.get(i).getClosingPrice());
                cciEntity.setFoot(stockDay603List.get(i).getFoot());
                cciEntity.setTopside(stockDay603List.get(i).getTopside());
                cciEntityList.add(cciEntity);
            }
            if (i<20){
                BOLLEntity bollEntity = new BOLLEntity();
                bollEntity.setDate(stockDay603List.get(i).getDate());
                bollEntity.setClosingPrice(stockDay603List.get(i).getClosingPrice());
                bollEntityList.add(bollEntity);
            }
            if (i<24){
                RSIEntity rsiEntity = new RSIEntity();
                if (stockDay603List.get(i).getChangePoints() == null) {
                    rsiEntity.setChangePoints(new BigDecimal(0));
                } else {
                    rsiEntity.setChangePoints(stockDay603List.get(i).getChangePoints());
                }
                rsiEntity.setDate(stockDay603List.get(i).getDate());
                rsiEntityList.add(rsiEntity);
            }
            if (i<30){
                BIASEntity biasEntity = new BIASEntity();
                biasEntity.setClosingPrice(stockDay603List.get(i).getClosingPrice());
                biasEntity.setDate(stockDay603List.get(i).getDate());
                biasEntityList.add(biasEntity);

                MakeQuantityEntity makeQuantityEntity = new MakeQuantityEntity();
                makeQuantityEntity.setDate(stockDay603List.get(i).getDate());
                makeQuantityEntity.setMakeQuantity(stockDay603List.get(i).getMakeQuantity());
                makeQuantityEntityList.add(makeQuantityEntity);
            }
            if (i<42){
                WREntity wrEntity = new WREntity();
                wrEntity.setDate(stockDay603List.get(i).getDate());
                wrEntity.setClosingPrice(stockDay603List.get(i).getClosingPrice());
                wrEntity.setFoot(stockDay603List.get(i).getFoot());
                wrEntity.setTopside(stockDay603List.get(i).getTopside());
                wrEntityList.add(wrEntity);
            }
            if (i<60){
                PriceEntity priceEntity = new PriceEntity();
                priceEntity.setDate(stockDay603List.get(i).getDate());
                priceEntity.setClosingPrice(stockDay603List.get(i).getClosingPrice());
                priceEntityList.add(priceEntity);
            }

        }
        StockDayScience603 stockDayScience603 = new StockDayScience603();
        stockDayScience603.setCodeId(stockDay603.getCodeId());
        stockDayScience603.setCodeEx(stockDay603.getCodeEx());
        stockDayScience603.setDate(stockDay603.getDate());
        stockDayScience603.setQuantity(stockDay603.getMakeQuantity());

        if (stockDay603.getOpeningPrice() == null || stockDay603.getOpeningPrice().compareTo(BigDecimal.ZERO) == 0) {
            return false;
        }
        //macd
        MacdVo macdVo = MACDUtil.getMacd1(macdEntity1);
        if (macdVo != null) {
            stockDayScience603.setMacd(macdVo.getMACD());
            stockDayScience603.setDiff(macdVo.getDIF());
            stockDayScience603.setDea(macdVo.getDEA());
            stockDayScience603.setEma12(macdVo.getEMA12());
            stockDayScience603.setEma26(macdVo.getEMA26());
        }
        //kdj
        if (kdjEntityList.size() == 9) {
            if (stockDayScience603List.get(0).getD()==null||stockDayScience603List.get(0).getK()==null||stockDayScience603List.get(0).getRsv()==null) {
                kdjEntity1.setBeforeD(new BigDecimal(50));
                kdjEntity1.setBeforeK(new BigDecimal(50));
                kdjEntity1.setBeforeRSV(new BigDecimal(50));
            }else {
                kdjEntity1.setBeforeD(stockDayScience603List.get(0).getD());
                kdjEntity1.setBeforeK(stockDayScience603List.get(0).getK());
                kdjEntity1.setBeforeRSV(stockDayScience603List.get(0).getRsv());
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
            kdjEntity1.setClosingPrice(stockDay603.getClosingPrice());

            KDJVo kdjVo = KDJUtil.getKDJ(kdjEntity1);
            stockDayScience603.setK(kdjVo.getK());
            stockDayScience603.setD(kdjVo.getD());
            stockDayScience603.setJ(kdjVo.getJ());
            stockDayScience603.setRsv(kdjVo.getRSV());
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
            stockDayScience603.setRsi1(rsiVo.getRSI6());
            stockDayScience603.setRsi2(rsiVo.getRSI12());
            stockDayScience603.setRsi3(rsiVo.getRSI24());
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
            stockDayScience603.setBias1(biasVo.getBIAS5());
            stockDayScience603.setBias2(biasVo.getBIAS10());
            stockDayScience603.setBias3(biasVo.getBIAS30());
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
            stockDayScience603.setCci(cciVo.getCCI());
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
            stockDayScience603.setWr1(wrVo.getWR21());
            stockDayScience603.setWr2(wrVo.getWR42());
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
            stockDayScience603.setUpp(bollVo.getUP());
            stockDayScience603.setMid(bollVo.getMB());
            stockDayScience603.setLow(bollVo.getDN());
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
            stockDayScience603.setMakeQuantityMa5(makeQuantityVo.getMakeQuantity5());
            stockDayScience603.setMakeQuantityMa10(makeQuantityVo.getMakeQuantity10());
            stockDayScience603.setMakeQuantityMa20(makeQuantityVo.getMakeQuantity20());
            stockDayScience603.setMakeQuantityMa30(makeQuantityVo.getMakeQuantity30());
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
            stockDayScience603.setPriceMa5(priceVo.getPriceMa5());
            stockDayScience603.setPriceMa10(priceVo.getPriceMa10());
            stockDayScience603.setPriceMa20(priceVo.getPriceMa20());
            stockDayScience603.setPriceMa30(priceVo.getPriceMa30());
            stockDayScience603.setPriceMa60(priceVo.getPriceMa60());
        }
        //保存Redis
        stockDayScience603List.add(stockDayScience603);
        Collections.sort(stockDayScience603List, new Comparator<StockDayScience603>() {
            @Override
            public int compare(StockDayScience603 o1, StockDayScience603 o2) {
                long i = o2.getDate().getTime() - o1.getDate().getTime();
                if (i > 0) {
                    return 1;
                } else if (i < 0) {
                    return -1;
                }
                return 0;
            }
        });
        stockDayScience603List.remove(stockDayScience603List.size()-1);
        redisTemplate.opsForValue().set(Constants.SCIENCE+stockDay603.getCodeEx()+stockDay603.getCodeId(), stockDayScience603List);
        stockDayScience603Service.save(stockDayScience603);
        return true;

    }

}
