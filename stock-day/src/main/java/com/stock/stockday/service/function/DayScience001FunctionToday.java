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
import com.stock.stockday.entity.StockDay001;
import com.stock.stockday.entity.StockDayScience001;
import com.stock.stockday.service.StockDay001Service;
import com.stock.stockday.service.StockDayScience001Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class DayScience001FunctionToday {
    @Autowired
    private StockDayScience001Service stockDayScience001Service;
    @Autowired
    private StockDay001Service stockDay001Service;
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    public boolean dayScience001Function(StockDay001 stockDay001) {
        Page<StockDay001> page = new Page<>(1, 60);
        List<StockDay001> stockDay001List = stockDay001Service.selectByCodeAndExPage(page, stockDay001.getCodeId(), stockDay001.getCodeEx());
        Page<StockDayScience001> page1 = new Page<>(1, 60);
        List<StockDayScience001> stockDayScience001List = stockDayScience001Service.selectByPage(page1, stockDay001.getCodeId(), stockDay001.getCodeEx());
        if (stockDay001List == null || stockDay001List.size() == 0) {
            return false;
        }
        stockDay001List.add(stockDay001);
        //排序
        Collections.sort(stockDay001List, new Comparator<StockDay001>() {
            @Override
            public int compare(StockDay001 o1, StockDay001 o2) {
                long i = o2.getDate().getTime() - o1.getDate().getTime();
                if (i > 0) {
                    return 1;
                } else if (i < 0) {
                    return -1;
                }
                return 0;
            }
        });
        Collections.sort(stockDayScience001List, new Comparator<StockDayScience001>() {
            @Override
            public int compare(StockDayScience001 o1, StockDayScience001 o2) {
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
        stockDay001List.remove(stockDay001List.size()-1);
        //保存Redis
        redisTemplate.opsForValue().set(stockDay001.getCodeEx()+stockDay001.getCodeId(), stockDay001List);
        MacdEntity macdEntity1 = new MacdEntity();
        macdEntity1.setClosingPrice(stockDay001.getClosingPrice());
        macdEntity1.setBeforeEma12(stockDayScience001List.get(0).getEma12());
        macdEntity1.setBeforeDea(stockDayScience001List.get(0).getDea());
        macdEntity1.setBeforeEma26(stockDayScience001List.get(0).getEma26());
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

        for (int i = 0; i < stockDay001List.size(); i++) {
            if (i < 9) {
                KDJEntity kdjEntity = new KDJEntity();
                kdjEntity.setClosingPrice(stockDay001List.get(i).getClosingPrice());
                kdjEntity.setFoot(stockDay001List.get(i).getFoot());
                kdjEntity.setTopside(stockDay001List.get(i).getTopside());
                kdjEntity.setDate(stockDay001List.get(i).getDate());
                kdjEntityList.add(kdjEntity);
            }
            if (i<14){
                CCIEntity cciEntity = new CCIEntity();
                cciEntity.setDate(stockDay001List.get(i).getDate());
                cciEntity.setClosingPrice(stockDay001List.get(i).getClosingPrice());
                cciEntity.setFoot(stockDay001List.get(i).getFoot());
                cciEntity.setTopside(stockDay001List.get(i).getTopside());
                cciEntityList.add(cciEntity);
            }
            if (i<20){
                BOLLEntity bollEntity = new BOLLEntity();
                bollEntity.setDate(stockDay001List.get(i).getDate());
                bollEntity.setClosingPrice(stockDay001List.get(i).getClosingPrice());
                bollEntityList.add(bollEntity);
            }
            if (i<24){
                RSIEntity rsiEntity = new RSIEntity();
                if (stockDay001List.get(i).getChangePoints() == null) {
                    rsiEntity.setChangePoints(new BigDecimal(0));
                } else {
                    rsiEntity.setChangePoints(stockDay001List.get(i).getChangePoints());
                }
                rsiEntity.setDate(stockDay001List.get(i).getDate());
                rsiEntityList.add(rsiEntity);
            }
            if (i<30){
                BIASEntity biasEntity = new BIASEntity();
                biasEntity.setClosingPrice(stockDay001List.get(i).getClosingPrice());
                biasEntity.setDate(stockDay001List.get(i).getDate());
                biasEntityList.add(biasEntity);

                MakeQuantityEntity makeQuantityEntity = new MakeQuantityEntity();
                makeQuantityEntity.setDate(stockDay001List.get(i).getDate());
                makeQuantityEntity.setMakeQuantity(stockDay001List.get(i).getMakeQuantity());
                makeQuantityEntityList.add(makeQuantityEntity);
            }
            if (i<42){
                WREntity wrEntity = new WREntity();
                wrEntity.setDate(stockDay001List.get(i).getDate());
                wrEntity.setClosingPrice(stockDay001List.get(i).getClosingPrice());
                wrEntity.setFoot(stockDay001List.get(i).getFoot());
                wrEntity.setTopside(stockDay001List.get(i).getTopside());
                wrEntityList.add(wrEntity);
            }
            if (i<60){
                PriceEntity priceEntity = new PriceEntity();
                priceEntity.setDate(stockDay001List.get(i).getDate());
                priceEntity.setClosingPrice(stockDay001List.get(i).getClosingPrice());
                priceEntityList.add(priceEntity);
            }

        }
        StockDayScience001 stockDayScience001 = new StockDayScience001();
        stockDayScience001.setCodeId(stockDay001.getCodeId());
        stockDayScience001.setCodeEx(stockDay001.getCodeEx());
        stockDayScience001.setDate(stockDay001.getDate());
        stockDayScience001.setQuantity(stockDay001.getMakeQuantity());

        if (stockDay001.getOpeningPrice() == null || stockDay001.getOpeningPrice().compareTo(BigDecimal.ZERO) == 0) {
            return false;
        }
        //macd
        MacdVo macdVo = MACDUtil.getMacd1(macdEntity1);
        if (macdVo != null) {
            stockDayScience001.setMacd(macdVo.getMACD());
            stockDayScience001.setDiff(macdVo.getDIF());
            stockDayScience001.setDea(macdVo.getDEA());
            stockDayScience001.setEma12(macdVo.getEMA12());
            stockDayScience001.setEma26(macdVo.getEMA26());
        }
        //kdj
        if (kdjEntityList.size() == 9) {
            kdjEntity1.setBeforeD(stockDayScience001List.get(0).getD());
            kdjEntity1.setBeforeK(stockDayScience001List.get(0).getK());
            kdjEntity1.setBeforeRSV(stockDayScience001List.get(0).getRsv());
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
            kdjEntity1.setClosingPrice(stockDay001.getClosingPrice());

            KDJVo kdjVo = KDJUtil.getKDJ(kdjEntity1);
            stockDayScience001.setK(kdjVo.getK());
            stockDayScience001.setD(kdjVo.getD());
            stockDayScience001.setJ(kdjVo.getJ());
            stockDayScience001.setRsv(kdjVo.getRSV());
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
            stockDayScience001.setRsi1(rsiVo.getRSI6());
            stockDayScience001.setRsi2(rsiVo.getRSI12());
            stockDayScience001.setRsi3(rsiVo.getRSI24());
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
            stockDayScience001.setBias1(biasVo.getBIAS5());
            stockDayScience001.setBias2(biasVo.getBIAS10());
            stockDayScience001.setBias3(biasVo.getBIAS30());
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
            stockDayScience001.setCci(cciVo.getCCI());
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
            stockDayScience001.setWr1(wrVo.getWR21());
            stockDayScience001.setWr2(wrVo.getWR42());
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
            stockDayScience001.setUpp(bollVo.getUP());
            stockDayScience001.setMid(bollVo.getMB());
            stockDayScience001.setLow(bollVo.getDN());
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
            stockDayScience001.setMakeQuantityMa5(makeQuantityVo.getMakeQuantity5());
            stockDayScience001.setMakeQuantityMa10(makeQuantityVo.getMakeQuantity10());
            stockDayScience001.setMakeQuantityMa20(makeQuantityVo.getMakeQuantity20());
            stockDayScience001.setMakeQuantityMa30(makeQuantityVo.getMakeQuantity30());
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
            stockDayScience001.setPriceMa5(priceVo.getPriceMa5());
            stockDayScience001.setPriceMa10(priceVo.getPriceMa10());
            stockDayScience001.setPriceMa20(priceVo.getPriceMa20());
            stockDayScience001.setPriceMa30(priceVo.getPriceMa30());
            stockDayScience001.setPriceMa60(priceVo.getPriceMa60());
        }
        //保存Redis
        stockDayScience001List.add(stockDayScience001);
        Collections.sort(stockDayScience001List, new Comparator<StockDayScience001>() {
            @Override
            public int compare(StockDayScience001 o1, StockDayScience001 o2) {
                long i = o2.getDate().getTime() - o1.getDate().getTime();
                if (i > 0) {
                    return 1;
                } else if (i < 0) {
                    return -1;
                }
                return 0;
            }
        });
        stockDayScience001List.remove(stockDayScience001List.size()-1);
        redisTemplate.opsForValue().set(Constants.SCIENCE+stockDay001.getCodeEx()+stockDay001.getCodeId(), stockDayScience001List);
        stockDayScience001Service.save(stockDayScience001);
        return true;

    }

}
