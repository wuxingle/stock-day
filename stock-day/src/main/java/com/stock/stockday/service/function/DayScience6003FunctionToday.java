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
import com.stock.stockday.entity.StockDay6003;
import com.stock.stockday.entity.StockDayScience6003;
import com.stock.stockday.service.StockDay6003Service;
import com.stock.stockday.service.StockDayScience6003Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class DayScience6003FunctionToday {
    @Autowired
    private StockDayScience6003Service stockDayScience6003Service;
    @Autowired
    private StockDay6003Service stockDay6003Service;
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    public boolean dayScience6003Function(StockDay6003 stockDay6003) {
        Page<StockDay6003> page = new Page<>(1, 60);
        List<StockDay6003> stockDay6003List = stockDay6003Service.selectByCodeAndExPage(page, stockDay6003.getCodeId(), stockDay6003.getCodeEx());
        Page<StockDayScience6003> page1 = new Page<>(1, 60);
        List<StockDayScience6003> stockDayScience6003List = stockDayScience6003Service.selectByPage(page1, stockDay6003.getCodeId(), stockDay6003.getCodeEx());
        if (stockDay6003List == null || stockDay6003List.size() == 0) {
            return false;
        }
        stockDay6003List.add(stockDay6003);
        //排序
        Collections.sort(stockDay6003List, new Comparator<StockDay6003>() {
            @Override
            public int compare(StockDay6003 o1, StockDay6003 o2) {
                long i = o2.getDate().getTime() - o1.getDate().getTime();
                if (i > 0) {
                    return 1;
                } else if (i < 0) {
                    return -1;
                }
                return 0;
            }
        });
        Collections.sort(stockDayScience6003List, new Comparator<StockDayScience6003>() {
            @Override
            public int compare(StockDayScience6003 o1, StockDayScience6003 o2) {
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
        stockDay6003List.remove(stockDay6003List.size()-1);
        //保存Redis
        redisTemplate.opsForValue().set(stockDay6003.getCodeEx()+stockDay6003.getCodeId(), stockDay6003List);
        MacdEntity macdEntity1 = new MacdEntity();
        macdEntity1.setClosingPrice(stockDay6003.getClosingPrice());
        macdEntity1.setBeforeEma12(stockDayScience6003List.get(0).getEma12());
        macdEntity1.setBeforeDea(stockDayScience6003List.get(0).getDea());
        macdEntity1.setBeforeEma26(stockDayScience6003List.get(0).getEma26());
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

        for (int i = 0; i < stockDay6003List.size(); i++) {
            if (i < 9) {
                KDJEntity kdjEntity = new KDJEntity();
                kdjEntity.setClosingPrice(stockDay6003List.get(i).getClosingPrice());
                kdjEntity.setFoot(stockDay6003List.get(i).getFoot());
                kdjEntity.setTopside(stockDay6003List.get(i).getTopside());
                kdjEntity.setDate(stockDay6003List.get(i).getDate());
                kdjEntityList.add(kdjEntity);
            }
            if (i<14){
                CCIEntity cciEntity = new CCIEntity();
                cciEntity.setDate(stockDay6003List.get(i).getDate());
                cciEntity.setClosingPrice(stockDay6003List.get(i).getClosingPrice());
                cciEntity.setFoot(stockDay6003List.get(i).getFoot());
                cciEntity.setTopside(stockDay6003List.get(i).getTopside());
                cciEntityList.add(cciEntity);
            }
            if (i<20){
                BOLLEntity bollEntity = new BOLLEntity();
                bollEntity.setDate(stockDay6003List.get(i).getDate());
                bollEntity.setClosingPrice(stockDay6003List.get(i).getClosingPrice());
                bollEntityList.add(bollEntity);
            }
            if (i<24){
                RSIEntity rsiEntity = new RSIEntity();
                if (stockDay6003List.get(i).getChangePoints() == null) {
                    rsiEntity.setChangePoints(new BigDecimal(0));
                } else {
                    rsiEntity.setChangePoints(stockDay6003List.get(i).getChangePoints());
                }
                rsiEntity.setDate(stockDay6003List.get(i).getDate());
                rsiEntityList.add(rsiEntity);
            }
            if (i<30){
                BIASEntity biasEntity = new BIASEntity();
                biasEntity.setClosingPrice(stockDay6003List.get(i).getClosingPrice());
                biasEntity.setDate(stockDay6003List.get(i).getDate());
                biasEntityList.add(biasEntity);

                MakeQuantityEntity makeQuantityEntity = new MakeQuantityEntity();
                makeQuantityEntity.setDate(stockDay6003List.get(i).getDate());
                makeQuantityEntity.setMakeQuantity(stockDay6003List.get(i).getMakeQuantity());
                makeQuantityEntityList.add(makeQuantityEntity);
            }
            if (i<42){
                WREntity wrEntity = new WREntity();
                wrEntity.setDate(stockDay6003List.get(i).getDate());
                wrEntity.setClosingPrice(stockDay6003List.get(i).getClosingPrice());
                wrEntity.setFoot(stockDay6003List.get(i).getFoot());
                wrEntity.setTopside(stockDay6003List.get(i).getTopside());
                wrEntityList.add(wrEntity);
            }
            if (i<60){
                PriceEntity priceEntity = new PriceEntity();
                priceEntity.setDate(stockDay6003List.get(i).getDate());
                priceEntity.setClosingPrice(stockDay6003List.get(i).getClosingPrice());
                priceEntityList.add(priceEntity);
            }

        }
        StockDayScience6003 stockDayScience6003 = new StockDayScience6003();
        stockDayScience6003.setCodeId(stockDay6003.getCodeId());
        stockDayScience6003.setCodeEx(stockDay6003.getCodeEx());
        stockDayScience6003.setDate(stockDay6003.getDate());
        stockDayScience6003.setQuantity(stockDay6003.getMakeQuantity());

        if (stockDay6003.getOpeningPrice() == null || stockDay6003.getOpeningPrice().compareTo(BigDecimal.ZERO) == 0) {
            return false;
        }
        //macd
        MacdVo macdVo = MACDUtil.getMacd1(macdEntity1);
        if (macdVo != null) {
            stockDayScience6003.setMacd(macdVo.getMACD());
            stockDayScience6003.setDiff(macdVo.getDIF());
            stockDayScience6003.setDea(macdVo.getDEA());
            stockDayScience6003.setEma12(macdVo.getEMA12());
            stockDayScience6003.setEma26(macdVo.getEMA26());
        }
        //kdj
        if (kdjEntityList.size() == 9) {
            kdjEntity1.setBeforeD(stockDayScience6003List.get(0).getD());
            kdjEntity1.setBeforeK(stockDayScience6003List.get(0).getK());
            kdjEntity1.setBeforeRSV(stockDayScience6003List.get(0).getRsv());
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
            kdjEntity1.setClosingPrice(stockDay6003.getClosingPrice());

            KDJVo kdjVo = KDJUtil.getKDJ(kdjEntity1);
            stockDayScience6003.setK(kdjVo.getK());
            stockDayScience6003.setD(kdjVo.getD());
            stockDayScience6003.setJ(kdjVo.getJ());
            stockDayScience6003.setRsv(kdjVo.getRSV());
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
            stockDayScience6003.setRsi1(rsiVo.getRSI6());
            stockDayScience6003.setRsi2(rsiVo.getRSI12());
            stockDayScience6003.setRsi3(rsiVo.getRSI24());
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
            stockDayScience6003.setBias1(biasVo.getBIAS5());
            stockDayScience6003.setBias2(biasVo.getBIAS10());
            stockDayScience6003.setBias3(biasVo.getBIAS30());
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
            stockDayScience6003.setCci(cciVo.getCCI());
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
            stockDayScience6003.setWr1(wrVo.getWR21());
            stockDayScience6003.setWr2(wrVo.getWR42());
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
            stockDayScience6003.setUpp(bollVo.getUP());
            stockDayScience6003.setMid(bollVo.getMB());
            stockDayScience6003.setLow(bollVo.getDN());
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
            stockDayScience6003.setMakeQuantityMa5(makeQuantityVo.getMakeQuantity5());
            stockDayScience6003.setMakeQuantityMa10(makeQuantityVo.getMakeQuantity10());
            stockDayScience6003.setMakeQuantityMa20(makeQuantityVo.getMakeQuantity20());
            stockDayScience6003.setMakeQuantityMa30(makeQuantityVo.getMakeQuantity30());
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
            stockDayScience6003.setPriceMa5(priceVo.getPriceMa5());
            stockDayScience6003.setPriceMa10(priceVo.getPriceMa10());
            stockDayScience6003.setPriceMa20(priceVo.getPriceMa20());
            stockDayScience6003.setPriceMa30(priceVo.getPriceMa30());
            stockDayScience6003.setPriceMa60(priceVo.getPriceMa60());
        }
        //保存Redis
        stockDayScience6003List.add(stockDayScience6003);
        Collections.sort(stockDayScience6003List, new Comparator<StockDayScience6003>() {
            @Override
            public int compare(StockDayScience6003 o1, StockDayScience6003 o2) {
                long i = o2.getDate().getTime() - o1.getDate().getTime();
                if (i > 0) {
                    return 1;
                } else if (i < 0) {
                    return -1;
                }
                return 0;
            }
        });
        stockDayScience6003List.remove(stockDayScience6003List.size()-1);
        redisTemplate.opsForValue().set(Constants.SCIENCE+stockDay6003.getCodeEx()+stockDay6003.getCodeId(), stockDayScience6003List);
        stockDayScience6003Service.save(stockDayScience6003);
        return true;

    }

}
