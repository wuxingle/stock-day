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
import com.stock.stockday.entity.StockDay3000;
import com.stock.stockday.entity.StockDayScience3000;
import com.stock.stockday.service.StockDay3000Service;
import com.stock.stockday.service.StockDayScience3000Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class DayScience3000FunctionToday {
    @Autowired
    private StockDayScience3000Service stockDayScience3000Service;
    @Autowired
    private StockDay3000Service stockDay3000Service;
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    public boolean dayScience3000Function(StockDay3000 stockDay3000) {
        Page<StockDay3000> page = new Page<>(1, 60);
        List<StockDay3000> stockDay3000List = stockDay3000Service.selectByCodeAndExPage(page, stockDay3000.getCodeId(), stockDay3000.getCodeEx());
        Page<StockDayScience3000> page1 = new Page<>(1, 60);
        List<StockDayScience3000> stockDayScience3000List = stockDayScience3000Service.selectByPage(page1, stockDay3000.getCodeId(), stockDay3000.getCodeEx());
        if (stockDay3000List == null || stockDay3000List.size() == 0) {
            return false;
        }
        stockDay3000List.add(stockDay3000);
        //排序
        Collections.sort(stockDay3000List, new Comparator<StockDay3000>() {
            @Override
            public int compare(StockDay3000 o1, StockDay3000 o2) {
                long i = o2.getDate().getTime() - o1.getDate().getTime();
                if (i > 0) {
                    return 1;
                } else if (i < 0) {
                    return -1;
                }
                return 0;
            }
        });
        Collections.sort(stockDayScience3000List, new Comparator<StockDayScience3000>() {
            @Override
            public int compare(StockDayScience3000 o1, StockDayScience3000 o2) {
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
        stockDay3000List.remove(stockDay3000List.size()-1);
        //保存Redis
        redisTemplate.opsForValue().set(stockDay3000.getCodeEx()+stockDay3000.getCodeId(), stockDay3000List);
        MacdEntity macdEntity1 = new MacdEntity();
        macdEntity1.setClosingPrice(stockDay3000.getClosingPrice());
        if (stockDayScience3000List == null || stockDayScience3000List.size() == 0) {
            macdEntity1.setBeforeEma12(new BigDecimal(50.0));
            macdEntity1.setBeforeDea(new BigDecimal(50.0));
            macdEntity1.setBeforeEma26(new BigDecimal(50.0));
        }else {
            macdEntity1.setBeforeEma12(stockDayScience3000List.get(0).getEma12());
            macdEntity1.setBeforeDea(stockDayScience3000List.get(0).getDea());
            macdEntity1.setBeforeEma26(stockDayScience3000List.get(0).getEma26());
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

        for (int i = 0; i < stockDay3000List.size(); i++) {
            if (i < 9) {
                KDJEntity kdjEntity = new KDJEntity();
                kdjEntity.setClosingPrice(stockDay3000List.get(i).getClosingPrice());
                kdjEntity.setFoot(stockDay3000List.get(i).getFoot());
                kdjEntity.setTopside(stockDay3000List.get(i).getTopside());
                kdjEntity.setDate(stockDay3000List.get(i).getDate());
                kdjEntityList.add(kdjEntity);
            }
            if (i<14){
                CCIEntity cciEntity = new CCIEntity();
                cciEntity.setDate(stockDay3000List.get(i).getDate());
                cciEntity.setClosingPrice(stockDay3000List.get(i).getClosingPrice());
                cciEntity.setFoot(stockDay3000List.get(i).getFoot());
                cciEntity.setTopside(stockDay3000List.get(i).getTopside());
                cciEntityList.add(cciEntity);
            }
            if (i<20){
                BOLLEntity bollEntity = new BOLLEntity();
                bollEntity.setDate(stockDay3000List.get(i).getDate());
                bollEntity.setClosingPrice(stockDay3000List.get(i).getClosingPrice());
                bollEntityList.add(bollEntity);
            }
            if (i<24){
                RSIEntity rsiEntity = new RSIEntity();
                if (stockDay3000List.get(i).getChangePoints() == null) {
                    rsiEntity.setChangePoints(new BigDecimal(0));
                } else {
                    rsiEntity.setChangePoints(stockDay3000List.get(i).getChangePoints());
                }
                rsiEntity.setDate(stockDay3000List.get(i).getDate());
                rsiEntityList.add(rsiEntity);
            }
            if (i<30){
                BIASEntity biasEntity = new BIASEntity();
                biasEntity.setClosingPrice(stockDay3000List.get(i).getClosingPrice());
                biasEntity.setDate(stockDay3000List.get(i).getDate());
                biasEntityList.add(biasEntity);

                MakeQuantityEntity makeQuantityEntity = new MakeQuantityEntity();
                makeQuantityEntity.setDate(stockDay3000List.get(i).getDate());
                makeQuantityEntity.setMakeQuantity(stockDay3000List.get(i).getMakeQuantity());
                makeQuantityEntityList.add(makeQuantityEntity);
            }
            if (i<42){
                WREntity wrEntity = new WREntity();
                wrEntity.setDate(stockDay3000List.get(i).getDate());
                wrEntity.setClosingPrice(stockDay3000List.get(i).getClosingPrice());
                wrEntity.setFoot(stockDay3000List.get(i).getFoot());
                wrEntity.setTopside(stockDay3000List.get(i).getTopside());
                wrEntityList.add(wrEntity);
            }
            if (i<60){
                PriceEntity priceEntity = new PriceEntity();
                priceEntity.setDate(stockDay3000List.get(i).getDate());
                priceEntity.setClosingPrice(stockDay3000List.get(i).getClosingPrice());
                priceEntityList.add(priceEntity);
            }

        }
        StockDayScience3000 stockDayScience3000 = new StockDayScience3000();
        stockDayScience3000.setCodeId(stockDay3000.getCodeId());
        stockDayScience3000.setCodeEx(stockDay3000.getCodeEx());
        stockDayScience3000.setDate(stockDay3000.getDate());
        stockDayScience3000.setQuantity(stockDay3000.getMakeQuantity());

        if (stockDay3000.getOpeningPrice() == null || stockDay3000.getOpeningPrice().compareTo(BigDecimal.ZERO) == 0) {
            return false;
        }
        //macd
        MacdVo macdVo = MACDUtil.getMacd1(macdEntity1);
        if (macdVo != null) {
            stockDayScience3000.setMacd(macdVo.getMACD());
            stockDayScience3000.setDiff(macdVo.getDIF());
            stockDayScience3000.setDea(macdVo.getDEA());
            stockDayScience3000.setEma12(macdVo.getEMA12());
            stockDayScience3000.setEma26(macdVo.getEMA26());
        }
        //kdj
        if (kdjEntityList.size() == 9) {
            if (stockDayScience3000List.get(0).getD()==null||stockDayScience3000List.get(0).getK()==null||stockDayScience3000List.get(0).getRsv()==null) {
                kdjEntity1.setBeforeD(new BigDecimal(50));
                kdjEntity1.setBeforeK(new BigDecimal(50));
                kdjEntity1.setBeforeRSV(new BigDecimal(50));
            }else {
                kdjEntity1.setBeforeD(stockDayScience3000List.get(0).getD());
                kdjEntity1.setBeforeK(stockDayScience3000List.get(0).getK());
                kdjEntity1.setBeforeRSV(stockDayScience3000List.get(0).getRsv());
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
            kdjEntity1.setClosingPrice(stockDay3000.getClosingPrice());

            KDJVo kdjVo = KDJUtil.getKDJ(kdjEntity1);
            stockDayScience3000.setK(kdjVo.getK());
            stockDayScience3000.setD(kdjVo.getD());
            stockDayScience3000.setJ(kdjVo.getJ());
            stockDayScience3000.setRsv(kdjVo.getRSV());
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
            stockDayScience3000.setRsi1(rsiVo.getRSI6());
            stockDayScience3000.setRsi2(rsiVo.getRSI12());
            stockDayScience3000.setRsi3(rsiVo.getRSI24());
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
            stockDayScience3000.setBias1(biasVo.getBIAS5());
            stockDayScience3000.setBias2(biasVo.getBIAS10());
            stockDayScience3000.setBias3(biasVo.getBIAS30());
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
            stockDayScience3000.setCci(cciVo.getCCI());
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
            stockDayScience3000.setWr1(wrVo.getWR21());
            stockDayScience3000.setWr2(wrVo.getWR42());
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
            stockDayScience3000.setUpp(bollVo.getUP());
            stockDayScience3000.setMid(bollVo.getMB());
            stockDayScience3000.setLow(bollVo.getDN());
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
            stockDayScience3000.setMakeQuantityMa5(makeQuantityVo.getMakeQuantity5());
            stockDayScience3000.setMakeQuantityMa10(makeQuantityVo.getMakeQuantity10());
            stockDayScience3000.setMakeQuantityMa20(makeQuantityVo.getMakeQuantity20());
            stockDayScience3000.setMakeQuantityMa30(makeQuantityVo.getMakeQuantity30());
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
            stockDayScience3000.setPriceMa5(priceVo.getPriceMa5());
            stockDayScience3000.setPriceMa10(priceVo.getPriceMa10());
            stockDayScience3000.setPriceMa20(priceVo.getPriceMa20());
            stockDayScience3000.setPriceMa30(priceVo.getPriceMa30());
            stockDayScience3000.setPriceMa60(priceVo.getPriceMa60());
        }
        //保存Redis
        stockDayScience3000List.add(stockDayScience3000);
        Collections.sort(stockDayScience3000List, new Comparator<StockDayScience3000>() {
            @Override
            public int compare(StockDayScience3000 o1, StockDayScience3000 o2) {
                long i = o2.getDate().getTime() - o1.getDate().getTime();
                if (i > 0) {
                    return 1;
                } else if (i < 0) {
                    return -1;
                }
                return 0;
            }
        });
        stockDayScience3000List.remove(stockDayScience3000List.size()-1);
        redisTemplate.opsForValue().set(Constants.SCIENCE+stockDay3000.getCodeEx()+stockDay3000.getCodeId(), stockDayScience3000List);
        stockDayScience3000Service.save(stockDayScience3000);
        return true;

    }

}
