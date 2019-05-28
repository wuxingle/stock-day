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
import com.stock.stockday.entity.StockDay0004;
import com.stock.stockday.entity.StockDayScience0004;
import com.stock.stockday.service.StockDay0004Service;
import com.stock.stockday.service.StockDayScience0004Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class DayScience0004FunctionToday {
    @Autowired
    private StockDayScience0004Service stockDayScience0004Service;
    @Autowired
    private StockDay0004Service stockDay0004Service;
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    public boolean dayScience0004Function(StockDay0004 stockDay0004) {
        Page<StockDay0004> page = new Page<>(1, 60);
        List<StockDay0004> stockDay0004List = stockDay0004Service.selectByCodeAndExPage(page, stockDay0004.getCodeId(), stockDay0004.getCodeEx());
        Page<StockDayScience0004> page1 = new Page<>(1, 60);
        List<StockDayScience0004> stockDayScience0004List = stockDayScience0004Service.selectByPage(page1, stockDay0004.getCodeId(), stockDay0004.getCodeEx());
        if (stockDay0004List == null || stockDay0004List.size() == 0) {
            return false;
        }
        stockDay0004List.add(stockDay0004);
        //排序
        Collections.sort(stockDay0004List, new Comparator<StockDay0004>() {
            @Override
            public int compare(StockDay0004 o1, StockDay0004 o2) {
                long i = o2.getDate().getTime() - o1.getDate().getTime();
                if (i > 0) {
                    return 1;
                } else if (i < 0) {
                    return -1;
                }
                return 0;
            }
        });
        Collections.sort(stockDayScience0004List, new Comparator<StockDayScience0004>() {
            @Override
            public int compare(StockDayScience0004 o1, StockDayScience0004 o2) {
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
        stockDay0004List.remove(stockDay0004List.size()-1);
        //保存Redis
        redisTemplate.opsForValue().set(stockDay0004.getCodeEx()+stockDay0004.getCodeId(), stockDay0004List);
        MacdEntity macdEntity1 = new MacdEntity();
        macdEntity1.setClosingPrice(stockDay0004.getClosingPrice());
        macdEntity1.setBeforeEma12(stockDayScience0004List.get(0).getEma12());
        macdEntity1.setBeforeDea(stockDayScience0004List.get(0).getDea());
        macdEntity1.setBeforeEma26(stockDayScience0004List.get(0).getEma26());
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

        for (int i = 0; i < stockDay0004List.size(); i++) {
            if (i < 9) {
                KDJEntity kdjEntity = new KDJEntity();
                kdjEntity.setClosingPrice(stockDay0004List.get(i).getClosingPrice());
                kdjEntity.setFoot(stockDay0004List.get(i).getFoot());
                kdjEntity.setTopside(stockDay0004List.get(i).getTopside());
                kdjEntity.setDate(stockDay0004List.get(i).getDate());
                kdjEntityList.add(kdjEntity);
            }
            if (i<14){
                CCIEntity cciEntity = new CCIEntity();
                cciEntity.setDate(stockDay0004List.get(i).getDate());
                cciEntity.setClosingPrice(stockDay0004List.get(i).getClosingPrice());
                cciEntity.setFoot(stockDay0004List.get(i).getFoot());
                cciEntity.setTopside(stockDay0004List.get(i).getTopside());
                cciEntityList.add(cciEntity);
            }
            if (i<20){
                BOLLEntity bollEntity = new BOLLEntity();
                bollEntity.setDate(stockDay0004List.get(i).getDate());
                bollEntity.setClosingPrice(stockDay0004List.get(i).getClosingPrice());
                bollEntityList.add(bollEntity);
            }
            if (i<24){
                RSIEntity rsiEntity = new RSIEntity();
                if (stockDay0004List.get(i).getChangePoints() == null) {
                    rsiEntity.setChangePoints(new BigDecimal(0));
                } else {
                    rsiEntity.setChangePoints(stockDay0004List.get(i).getChangePoints());
                }
                rsiEntity.setDate(stockDay0004List.get(i).getDate());
                rsiEntityList.add(rsiEntity);
            }
            if (i<30){
                BIASEntity biasEntity = new BIASEntity();
                biasEntity.setClosingPrice(stockDay0004List.get(i).getClosingPrice());
                biasEntity.setDate(stockDay0004List.get(i).getDate());
                biasEntityList.add(biasEntity);

                MakeQuantityEntity makeQuantityEntity = new MakeQuantityEntity();
                makeQuantityEntity.setDate(stockDay0004List.get(i).getDate());
                makeQuantityEntity.setMakeQuantity(stockDay0004List.get(i).getMakeQuantity());
                makeQuantityEntityList.add(makeQuantityEntity);
            }
            if (i<42){
                WREntity wrEntity = new WREntity();
                wrEntity.setDate(stockDay0004List.get(i).getDate());
                wrEntity.setClosingPrice(stockDay0004List.get(i).getClosingPrice());
                wrEntity.setFoot(stockDay0004List.get(i).getFoot());
                wrEntity.setTopside(stockDay0004List.get(i).getTopside());
                wrEntityList.add(wrEntity);
            }
            if (i<60){
                PriceEntity priceEntity = new PriceEntity();
                priceEntity.setDate(stockDay0004List.get(i).getDate());
                priceEntity.setClosingPrice(stockDay0004List.get(i).getClosingPrice());
                priceEntityList.add(priceEntity);
            }

        }
        StockDayScience0004 stockDayScience0004 = new StockDayScience0004();
        stockDayScience0004.setCodeId(stockDay0004.getCodeId());
        stockDayScience0004.setCodeEx(stockDay0004.getCodeEx());
        stockDayScience0004.setDate(stockDay0004.getDate());
        stockDayScience0004.setQuantity(stockDay0004.getMakeQuantity());

        if (stockDay0004.getOpeningPrice() == null || stockDay0004.getOpeningPrice().compareTo(BigDecimal.ZERO) == 0) {
            return false;
        }
        //macd
        MacdVo macdVo = MACDUtil.getMacd1(macdEntity1);
        if (macdVo != null) {
            stockDayScience0004.setMacd(macdVo.getMACD());
            stockDayScience0004.setDiff(macdVo.getDIF());
            stockDayScience0004.setDea(macdVo.getDEA());
            stockDayScience0004.setEma12(macdVo.getEMA12());
            stockDayScience0004.setEma26(macdVo.getEMA26());
        }
        //kdj
        if (kdjEntityList.size() == 9) {
            kdjEntity1.setBeforeD(stockDayScience0004List.get(0).getD());
            kdjEntity1.setBeforeK(stockDayScience0004List.get(0).getK());
            kdjEntity1.setBeforeRSV(stockDayScience0004List.get(0).getRsv());
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
            kdjEntity1.setClosingPrice(stockDay0004.getClosingPrice());

            KDJVo kdjVo = KDJUtil.getKDJ(kdjEntity1);
            stockDayScience0004.setK(kdjVo.getK());
            stockDayScience0004.setD(kdjVo.getD());
            stockDayScience0004.setJ(kdjVo.getJ());
            stockDayScience0004.setRsv(kdjVo.getRSV());
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
            stockDayScience0004.setRsi1(rsiVo.getRSI6());
            stockDayScience0004.setRsi2(rsiVo.getRSI12());
            stockDayScience0004.setRsi3(rsiVo.getRSI24());
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
            stockDayScience0004.setBias1(biasVo.getBIAS5());
            stockDayScience0004.setBias2(biasVo.getBIAS10());
            stockDayScience0004.setBias3(biasVo.getBIAS30());
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
            stockDayScience0004.setCci(cciVo.getCCI());
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
            stockDayScience0004.setWr1(wrVo.getWR21());
            stockDayScience0004.setWr2(wrVo.getWR42());
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
            stockDayScience0004.setUpp(bollVo.getUP());
            stockDayScience0004.setMid(bollVo.getMB());
            stockDayScience0004.setLow(bollVo.getDN());
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
            stockDayScience0004.setMakeQuantityMa5(makeQuantityVo.getMakeQuantity5());
            stockDayScience0004.setMakeQuantityMa10(makeQuantityVo.getMakeQuantity10());
            stockDayScience0004.setMakeQuantityMa20(makeQuantityVo.getMakeQuantity20());
            stockDayScience0004.setMakeQuantityMa30(makeQuantityVo.getMakeQuantity30());
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
            stockDayScience0004.setPriceMa5(priceVo.getPriceMa5());
            stockDayScience0004.setPriceMa10(priceVo.getPriceMa10());
            stockDayScience0004.setPriceMa20(priceVo.getPriceMa20());
            stockDayScience0004.setPriceMa30(priceVo.getPriceMa30());
            stockDayScience0004.setPriceMa60(priceVo.getPriceMa60());
        }
        //保存Redis
        stockDayScience0004List.add(stockDayScience0004);
        Collections.sort(stockDayScience0004List, new Comparator<StockDayScience0004>() {
            @Override
            public int compare(StockDayScience0004 o1, StockDayScience0004 o2) {
                long i = o2.getDate().getTime() - o1.getDate().getTime();
                if (i > 0) {
                    return 1;
                } else if (i < 0) {
                    return -1;
                }
                return 0;
            }
        });
        stockDayScience0004List.remove(stockDayScience0004List.size()-1);
        redisTemplate.opsForValue().set(Constants.SCIENCE+stockDay0004.getCodeEx()+stockDay0004.getCodeId(), stockDayScience0004List);
        stockDayScience0004Service.save(stockDayScience0004);
        return true;

    }

}
