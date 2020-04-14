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
import com.stock.stockday.entity.StockDay3002;
import com.stock.stockday.entity.StockDayScience3002;
import com.stock.stockday.service.StockDay3002Service;
import com.stock.stockday.service.StockDayScience3002Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class DayScience3002FunctionToday {
    @Autowired
    private StockDayScience3002Service stockDayScience3002Service;
    @Autowired
    private StockDay3002Service stockDay3002Service;
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    public boolean dayScience3002Function(StockDay3002 stockDay3002) {
        Page<StockDay3002> page = new Page<>(1, 60);
        List<StockDay3002> stockDay3002List = stockDay3002Service.selectByCodeAndExPage(page, stockDay3002.getCodeId(), stockDay3002.getCodeEx());
        Page<StockDayScience3002> page1 = new Page<>(1, 60);
        List<StockDayScience3002> stockDayScience3002List = stockDayScience3002Service.selectByPage(page1, stockDay3002.getCodeId(), stockDay3002.getCodeEx());
        if (stockDay3002List == null || stockDay3002List.size() == 0) {
            return false;
        }
        stockDay3002List.add(stockDay3002);
        //排序
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
        Collections.sort(stockDayScience3002List, new Comparator<StockDayScience3002>() {
            @Override
            public int compare(StockDayScience3002 o1, StockDayScience3002 o2) {
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
        stockDay3002List.remove(stockDay3002List.size()-1);
        //保存Redis
        redisTemplate.opsForValue().set(stockDay3002.getCodeEx()+stockDay3002.getCodeId(), stockDay3002List);
        MacdEntity macdEntity1 = new MacdEntity();
        macdEntity1.setClosingPrice(stockDay3002.getClosingPrice());
        if (stockDayScience3002List == null || stockDayScience3002List.size() == 0) {
            macdEntity1.setBeforeEma12(new BigDecimal(50.0));
            macdEntity1.setBeforeDea(new BigDecimal(50.0));
            macdEntity1.setBeforeEma26(new BigDecimal(50.0));
        }else {
            macdEntity1.setBeforeEma12(stockDayScience3002List.get(0).getEma12());
            macdEntity1.setBeforeDea(stockDayScience3002List.get(0).getDea());
            macdEntity1.setBeforeEma26(stockDayScience3002List.get(0).getEma26());
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

        for (int i = 0; i < stockDay3002List.size(); i++) {
            if (i < 9) {
                KDJEntity kdjEntity = new KDJEntity();
                kdjEntity.setClosingPrice(stockDay3002List.get(i).getClosingPrice());
                kdjEntity.setFoot(stockDay3002List.get(i).getFoot());
                kdjEntity.setTopside(stockDay3002List.get(i).getTopside());
                kdjEntity.setDate(stockDay3002List.get(i).getDate());
                kdjEntityList.add(kdjEntity);
            }
            if (i<14){
                CCIEntity cciEntity = new CCIEntity();
                cciEntity.setDate(stockDay3002List.get(i).getDate());
                cciEntity.setClosingPrice(stockDay3002List.get(i).getClosingPrice());
                cciEntity.setFoot(stockDay3002List.get(i).getFoot());
                cciEntity.setTopside(stockDay3002List.get(i).getTopside());
                cciEntityList.add(cciEntity);
            }
            if (i<20){
                BOLLEntity bollEntity = new BOLLEntity();
                bollEntity.setDate(stockDay3002List.get(i).getDate());
                bollEntity.setClosingPrice(stockDay3002List.get(i).getClosingPrice());
                bollEntityList.add(bollEntity);
            }
            if (i<24){
                RSIEntity rsiEntity = new RSIEntity();
                if (stockDay3002List.get(i).getChangePoints() == null) {
                    rsiEntity.setChangePoints(new BigDecimal(0));
                } else {
                    rsiEntity.setChangePoints(stockDay3002List.get(i).getChangePoints());
                }
                rsiEntity.setDate(stockDay3002List.get(i).getDate());
                rsiEntityList.add(rsiEntity);
            }
            if (i<30){
                BIASEntity biasEntity = new BIASEntity();
                biasEntity.setClosingPrice(stockDay3002List.get(i).getClosingPrice());
                biasEntity.setDate(stockDay3002List.get(i).getDate());
                biasEntityList.add(biasEntity);

                MakeQuantityEntity makeQuantityEntity = new MakeQuantityEntity();
                makeQuantityEntity.setDate(stockDay3002List.get(i).getDate());
                makeQuantityEntity.setMakeQuantity(stockDay3002List.get(i).getMakeQuantity());
                makeQuantityEntityList.add(makeQuantityEntity);
            }
            if (i<42){
                WREntity wrEntity = new WREntity();
                wrEntity.setDate(stockDay3002List.get(i).getDate());
                wrEntity.setClosingPrice(stockDay3002List.get(i).getClosingPrice());
                wrEntity.setFoot(stockDay3002List.get(i).getFoot());
                wrEntity.setTopside(stockDay3002List.get(i).getTopside());
                wrEntityList.add(wrEntity);
            }
            if (i<60){
                PriceEntity priceEntity = new PriceEntity();
                priceEntity.setDate(stockDay3002List.get(i).getDate());
                priceEntity.setClosingPrice(stockDay3002List.get(i).getClosingPrice());
                priceEntityList.add(priceEntity);
            }

        }
        StockDayScience3002 stockDayScience3002 = new StockDayScience3002();
        stockDayScience3002.setCodeId(stockDay3002.getCodeId());
        stockDayScience3002.setCodeEx(stockDay3002.getCodeEx());
        stockDayScience3002.setDate(stockDay3002.getDate());
        stockDayScience3002.setQuantity(stockDay3002.getMakeQuantity());

        if (stockDay3002.getOpeningPrice() == null || stockDay3002.getOpeningPrice().compareTo(BigDecimal.ZERO) == 0) {
            return false;
        }
        //macd
        MacdVo macdVo = MACDUtil.getMacd1(macdEntity1);
        if (macdVo != null) {
            stockDayScience3002.setMacd(macdVo.getMACD());
            stockDayScience3002.setDiff(macdVo.getDIF());
            stockDayScience3002.setDea(macdVo.getDEA());
            stockDayScience3002.setEma12(macdVo.getEMA12());
            stockDayScience3002.setEma26(macdVo.getEMA26());
        }
        //kdj
        if (kdjEntityList.size() == 9) {
            if (stockDayScience3002List.get(0).getD()==null||stockDayScience3002List.get(0).getK()==null||stockDayScience3002List.get(0).getRsv()==null) {
                kdjEntity1.setBeforeD(new BigDecimal(50));
                kdjEntity1.setBeforeK(new BigDecimal(50));
                kdjEntity1.setBeforeRSV(new BigDecimal(50));
            }else {
                kdjEntity1.setBeforeD(stockDayScience3002List.get(0).getD());
                kdjEntity1.setBeforeK(stockDayScience3002List.get(0).getK());
                kdjEntity1.setBeforeRSV(stockDayScience3002List.get(0).getRsv());
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
            kdjEntity1.setClosingPrice(stockDay3002.getClosingPrice());

            KDJVo kdjVo = KDJUtil.getKDJ(kdjEntity1);
            stockDayScience3002.setK(kdjVo.getK());
            stockDayScience3002.setD(kdjVo.getD());
            stockDayScience3002.setJ(kdjVo.getJ());
            stockDayScience3002.setRsv(kdjVo.getRSV());
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
            stockDayScience3002.setRsi1(rsiVo.getRSI6());
            stockDayScience3002.setRsi2(rsiVo.getRSI12());
            stockDayScience3002.setRsi3(rsiVo.getRSI24());
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
            stockDayScience3002.setBias1(biasVo.getBIAS5());
            stockDayScience3002.setBias2(biasVo.getBIAS10());
            stockDayScience3002.setBias3(biasVo.getBIAS30());
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
            stockDayScience3002.setCci(cciVo.getCCI());
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
            stockDayScience3002.setWr1(wrVo.getWR21());
            stockDayScience3002.setWr2(wrVo.getWR42());
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
            stockDayScience3002.setUpp(bollVo.getUP());
            stockDayScience3002.setMid(bollVo.getMB());
            stockDayScience3002.setLow(bollVo.getDN());
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
            stockDayScience3002.setMakeQuantityMa5(makeQuantityVo.getMakeQuantity5());
            stockDayScience3002.setMakeQuantityMa10(makeQuantityVo.getMakeQuantity10());
            stockDayScience3002.setMakeQuantityMa20(makeQuantityVo.getMakeQuantity20());
            stockDayScience3002.setMakeQuantityMa30(makeQuantityVo.getMakeQuantity30());
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
            stockDayScience3002.setPriceMa5(priceVo.getPriceMa5());
            stockDayScience3002.setPriceMa10(priceVo.getPriceMa10());
            stockDayScience3002.setPriceMa20(priceVo.getPriceMa20());
            stockDayScience3002.setPriceMa30(priceVo.getPriceMa30());
            stockDayScience3002.setPriceMa60(priceVo.getPriceMa60());
        }
        //保存Redis
        stockDayScience3002List.add(stockDayScience3002);
        Collections.sort(stockDayScience3002List, new Comparator<StockDayScience3002>() {
            @Override
            public int compare(StockDayScience3002 o1, StockDayScience3002 o2) {
                long i = o2.getDate().getTime() - o1.getDate().getTime();
                if (i > 0) {
                    return 1;
                } else if (i < 0) {
                    return -1;
                }
                return 0;
            }
        });
        stockDayScience3002List.remove(stockDayScience3002List.size()-1);
        redisTemplate.opsForValue().set(Constants.SCIENCE+stockDay3002.getCodeEx()+stockDay3002.getCodeId(), stockDayScience3002List);
        stockDayScience3002Service.save(stockDayScience3002);
        return true;

    }

}
