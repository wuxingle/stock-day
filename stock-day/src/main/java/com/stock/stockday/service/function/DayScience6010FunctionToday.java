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
import com.stock.stockday.entity.StockDay6010;
import com.stock.stockday.entity.StockDayScience6010;
import com.stock.stockday.service.StockDay6010Service;
import com.stock.stockday.service.StockDayScience6010Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class DayScience6010FunctionToday {
    @Autowired
    private StockDayScience6010Service stockDayScience6010Service;
    @Autowired
    private StockDay6010Service stockDay6010Service;
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    public boolean dayScience6010Function(StockDay6010 stockDay6010) {
        Page<StockDay6010> page = new Page<>(1, 60);
        List<StockDay6010> stockDay6010List = stockDay6010Service.selectByCodeAndExPage(page, stockDay6010.getCodeId(), stockDay6010.getCodeEx());
        Page<StockDayScience6010> page1 = new Page<>(1, 60);
        List<StockDayScience6010> stockDayScience6010List = stockDayScience6010Service.selectByPage(page1, stockDay6010.getCodeId(), stockDay6010.getCodeEx());
        if (stockDay6010List == null || stockDay6010List.size() == 0) {
            return false;
        }
        stockDay6010List.add(stockDay6010);
        //排序
        Collections.sort(stockDay6010List, new Comparator<StockDay6010>() {
            @Override
            public int compare(StockDay6010 o1, StockDay6010 o2) {
                long i = o2.getDate().getTime() - o1.getDate().getTime();
                if (i > 0) {
                    return 1;
                } else if (i < 0) {
                    return -1;
                }
                return 0;
            }
        });
        Collections.sort(stockDayScience6010List, new Comparator<StockDayScience6010>() {
            @Override
            public int compare(StockDayScience6010 o1, StockDayScience6010 o2) {
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
        stockDay6010List.remove(stockDay6010List.size()-1);
        //保存Redis
        redisTemplate.opsForValue().set(stockDay6010.getCodeEx()+stockDay6010.getCodeId(), stockDay6010List);
        MacdEntity macdEntity1 = new MacdEntity();
        macdEntity1.setClosingPrice(stockDay6010.getClosingPrice());
        macdEntity1.setBeforeEma12(stockDayScience6010List.get(0).getEma12());
        macdEntity1.setBeforeDea(stockDayScience6010List.get(0).getDea());
        macdEntity1.setBeforeEma26(stockDayScience6010List.get(0).getEma26());
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

        for (int i = 0; i < stockDay6010List.size(); i++) {
            if (i < 9) {
                KDJEntity kdjEntity = new KDJEntity();
                kdjEntity.setClosingPrice(stockDay6010List.get(i).getClosingPrice());
                kdjEntity.setFoot(stockDay6010List.get(i).getFoot());
                kdjEntity.setTopside(stockDay6010List.get(i).getTopside());
                kdjEntity.setDate(stockDay6010List.get(i).getDate());
                kdjEntityList.add(kdjEntity);
            }
            if (i<14){
                CCIEntity cciEntity = new CCIEntity();
                cciEntity.setDate(stockDay6010List.get(i).getDate());
                cciEntity.setClosingPrice(stockDay6010List.get(i).getClosingPrice());
                cciEntity.setFoot(stockDay6010List.get(i).getFoot());
                cciEntity.setTopside(stockDay6010List.get(i).getTopside());
                cciEntityList.add(cciEntity);
            }
            if (i<20){
                BOLLEntity bollEntity = new BOLLEntity();
                bollEntity.setDate(stockDay6010List.get(i).getDate());
                bollEntity.setClosingPrice(stockDay6010List.get(i).getClosingPrice());
                bollEntityList.add(bollEntity);
            }
            if (i<24){
                RSIEntity rsiEntity = new RSIEntity();
                if (stockDay6010List.get(i).getChangePoints() == null) {
                    rsiEntity.setChangePoints(new BigDecimal(0));
                } else {
                    rsiEntity.setChangePoints(stockDay6010List.get(i).getChangePoints());
                }
                rsiEntity.setDate(stockDay6010List.get(i).getDate());
                rsiEntityList.add(rsiEntity);
            }
            if (i<30){
                BIASEntity biasEntity = new BIASEntity();
                biasEntity.setClosingPrice(stockDay6010List.get(i).getClosingPrice());
                biasEntity.setDate(stockDay6010List.get(i).getDate());
                biasEntityList.add(biasEntity);

                MakeQuantityEntity makeQuantityEntity = new MakeQuantityEntity();
                makeQuantityEntity.setDate(stockDay6010List.get(i).getDate());
                makeQuantityEntity.setMakeQuantity(stockDay6010List.get(i).getMakeQuantity());
                makeQuantityEntityList.add(makeQuantityEntity);
            }
            if (i<42){
                WREntity wrEntity = new WREntity();
                wrEntity.setDate(stockDay6010List.get(i).getDate());
                wrEntity.setClosingPrice(stockDay6010List.get(i).getClosingPrice());
                wrEntity.setFoot(stockDay6010List.get(i).getFoot());
                wrEntity.setTopside(stockDay6010List.get(i).getTopside());
                wrEntityList.add(wrEntity);
            }
            if (i<60){
                PriceEntity priceEntity = new PriceEntity();
                priceEntity.setDate(stockDay6010List.get(i).getDate());
                priceEntity.setClosingPrice(stockDay6010List.get(i).getClosingPrice());
                priceEntityList.add(priceEntity);
            }

        }
        StockDayScience6010 stockDayScience6010 = new StockDayScience6010();
        stockDayScience6010.setCodeId(stockDay6010.getCodeId());
        stockDayScience6010.setCodeEx(stockDay6010.getCodeEx());
        stockDayScience6010.setDate(stockDay6010.getDate());
        stockDayScience6010.setQuantity(stockDay6010.getMakeQuantity());

        if (stockDay6010.getOpeningPrice() == null || stockDay6010.getOpeningPrice().compareTo(BigDecimal.ZERO) == 0) {
            return false;
        }
        //macd
        MacdVo macdVo = MACDUtil.getMacd1(macdEntity1);
        if (macdVo != null) {
            stockDayScience6010.setMacd(macdVo.getMACD());
            stockDayScience6010.setDiff(macdVo.getDIF());
            stockDayScience6010.setDea(macdVo.getDEA());
            stockDayScience6010.setEma12(macdVo.getEMA12());
            stockDayScience6010.setEma26(macdVo.getEMA26());
        }
        //kdj
        if (kdjEntityList.size() == 9) {
            kdjEntity1.setBeforeD(stockDayScience6010List.get(0).getD());
            kdjEntity1.setBeforeK(stockDayScience6010List.get(0).getK());
            kdjEntity1.setBeforeRSV(stockDayScience6010List.get(0).getRsv());
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
            kdjEntity1.setClosingPrice(stockDay6010.getClosingPrice());

            KDJVo kdjVo = KDJUtil.getKDJ(kdjEntity1);
            stockDayScience6010.setK(kdjVo.getK());
            stockDayScience6010.setD(kdjVo.getD());
            stockDayScience6010.setJ(kdjVo.getJ());
            stockDayScience6010.setRsv(kdjVo.getRSV());
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
            stockDayScience6010.setRsi1(rsiVo.getRSI6());
            stockDayScience6010.setRsi2(rsiVo.getRSI12());
            stockDayScience6010.setRsi3(rsiVo.getRSI24());
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
            stockDayScience6010.setBias1(biasVo.getBIAS5());
            stockDayScience6010.setBias2(biasVo.getBIAS10());
            stockDayScience6010.setBias3(biasVo.getBIAS30());
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
            stockDayScience6010.setCci(cciVo.getCCI());
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
            stockDayScience6010.setWr1(wrVo.getWR21());
            stockDayScience6010.setWr2(wrVo.getWR42());
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
            stockDayScience6010.setUpp(bollVo.getUP());
            stockDayScience6010.setMid(bollVo.getMB());
            stockDayScience6010.setLow(bollVo.getDN());
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
            stockDayScience6010.setMakeQuantityMa5(makeQuantityVo.getMakeQuantity5());
            stockDayScience6010.setMakeQuantityMa10(makeQuantityVo.getMakeQuantity10());
            stockDayScience6010.setMakeQuantityMa20(makeQuantityVo.getMakeQuantity20());
            stockDayScience6010.setMakeQuantityMa30(makeQuantityVo.getMakeQuantity30());
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
            stockDayScience6010.setPriceMa5(priceVo.getPriceMa5());
            stockDayScience6010.setPriceMa10(priceVo.getPriceMa10());
            stockDayScience6010.setPriceMa20(priceVo.getPriceMa20());
            stockDayScience6010.setPriceMa30(priceVo.getPriceMa30());
            stockDayScience6010.setPriceMa60(priceVo.getPriceMa60());
        }
        //保存Redis
        stockDayScience6010List.add(stockDayScience6010);
        Collections.sort(stockDayScience6010List, new Comparator<StockDayScience6010>() {
            @Override
            public int compare(StockDayScience6010 o1, StockDayScience6010 o2) {
                long i = o2.getDate().getTime() - o1.getDate().getTime();
                if (i > 0) {
                    return 1;
                } else if (i < 0) {
                    return -1;
                }
                return 0;
            }
        });
        stockDayScience6010List.remove(stockDayScience6010List.size()-1);
        redisTemplate.opsForValue().set(Constants.SCIENCE+stockDay6010.getCodeEx()+stockDay6010.getCodeId(), stockDayScience6010List);
        stockDayScience6010Service.save(stockDayScience6010);
        return true;

    }

}
