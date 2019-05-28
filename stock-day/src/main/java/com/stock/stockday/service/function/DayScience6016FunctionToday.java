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
import com.stock.stockday.entity.StockDay6016;
import com.stock.stockday.entity.StockDayScience6016;
import com.stock.stockday.service.StockDay6016Service;
import com.stock.stockday.service.StockDayScience6016Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class DayScience6016FunctionToday {
    @Autowired
    private StockDayScience6016Service stockDayScience6016Service;
    @Autowired
    private StockDay6016Service stockDay6016Service;
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    public boolean dayScience6016Function(StockDay6016 stockDay6016) {
        Page<StockDay6016> page = new Page<>(1, 60);
        List<StockDay6016> stockDay6016List = stockDay6016Service.selectByCodeAndExPage(page, stockDay6016.getCodeId(), stockDay6016.getCodeEx());
        Page<StockDayScience6016> page1 = new Page<>(1, 60);
        List<StockDayScience6016> stockDayScience6016List = stockDayScience6016Service.selectByPage(page1, stockDay6016.getCodeId(), stockDay6016.getCodeEx());
        if (stockDay6016List == null || stockDay6016List.size() == 0) {
            return false;
        }
        stockDay6016List.add(stockDay6016);
        //排序
        Collections.sort(stockDay6016List, new Comparator<StockDay6016>() {
            @Override
            public int compare(StockDay6016 o1, StockDay6016 o2) {
                long i = o2.getDate().getTime() - o1.getDate().getTime();
                if (i > 0) {
                    return 1;
                } else if (i < 0) {
                    return -1;
                }
                return 0;
            }
        });
        Collections.sort(stockDayScience6016List, new Comparator<StockDayScience6016>() {
            @Override
            public int compare(StockDayScience6016 o1, StockDayScience6016 o2) {
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
        stockDay6016List.remove(stockDay6016List.size()-1);
        //保存Redis
        redisTemplate.opsForValue().set(stockDay6016.getCodeEx()+stockDay6016.getCodeId(), stockDay6016List);
        MacdEntity macdEntity1 = new MacdEntity();
        macdEntity1.setClosingPrice(stockDay6016.getClosingPrice());
        macdEntity1.setBeforeEma12(stockDayScience6016List.get(0).getEma12());
        macdEntity1.setBeforeDea(stockDayScience6016List.get(0).getDea());
        macdEntity1.setBeforeEma26(stockDayScience6016List.get(0).getEma26());
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

        for (int i = 0; i < stockDay6016List.size(); i++) {
            if (i < 9) {
                KDJEntity kdjEntity = new KDJEntity();
                kdjEntity.setClosingPrice(stockDay6016List.get(i).getClosingPrice());
                kdjEntity.setFoot(stockDay6016List.get(i).getFoot());
                kdjEntity.setTopside(stockDay6016List.get(i).getTopside());
                kdjEntity.setDate(stockDay6016List.get(i).getDate());
                kdjEntityList.add(kdjEntity);
            }
            if (i<14){
                CCIEntity cciEntity = new CCIEntity();
                cciEntity.setDate(stockDay6016List.get(i).getDate());
                cciEntity.setClosingPrice(stockDay6016List.get(i).getClosingPrice());
                cciEntity.setFoot(stockDay6016List.get(i).getFoot());
                cciEntity.setTopside(stockDay6016List.get(i).getTopside());
                cciEntityList.add(cciEntity);
            }
            if (i<20){
                BOLLEntity bollEntity = new BOLLEntity();
                bollEntity.setDate(stockDay6016List.get(i).getDate());
                bollEntity.setClosingPrice(stockDay6016List.get(i).getClosingPrice());
                bollEntityList.add(bollEntity);
            }
            if (i<24){
                RSIEntity rsiEntity = new RSIEntity();
                if (stockDay6016List.get(i).getChangePoints() == null) {
                    rsiEntity.setChangePoints(new BigDecimal(0));
                } else {
                    rsiEntity.setChangePoints(stockDay6016List.get(i).getChangePoints());
                }
                rsiEntity.setDate(stockDay6016List.get(i).getDate());
                rsiEntityList.add(rsiEntity);
            }
            if (i<30){
                BIASEntity biasEntity = new BIASEntity();
                biasEntity.setClosingPrice(stockDay6016List.get(i).getClosingPrice());
                biasEntity.setDate(stockDay6016List.get(i).getDate());
                biasEntityList.add(biasEntity);

                MakeQuantityEntity makeQuantityEntity = new MakeQuantityEntity();
                makeQuantityEntity.setDate(stockDay6016List.get(i).getDate());
                makeQuantityEntity.setMakeQuantity(stockDay6016List.get(i).getMakeQuantity());
                makeQuantityEntityList.add(makeQuantityEntity);
            }
            if (i<42){
                WREntity wrEntity = new WREntity();
                wrEntity.setDate(stockDay6016List.get(i).getDate());
                wrEntity.setClosingPrice(stockDay6016List.get(i).getClosingPrice());
                wrEntity.setFoot(stockDay6016List.get(i).getFoot());
                wrEntity.setTopside(stockDay6016List.get(i).getTopside());
                wrEntityList.add(wrEntity);
            }
            if (i<60){
                PriceEntity priceEntity = new PriceEntity();
                priceEntity.setDate(stockDay6016List.get(i).getDate());
                priceEntity.setClosingPrice(stockDay6016List.get(i).getClosingPrice());
                priceEntityList.add(priceEntity);
            }

        }
        StockDayScience6016 stockDayScience6016 = new StockDayScience6016();
        stockDayScience6016.setCodeId(stockDay6016.getCodeId());
        stockDayScience6016.setCodeEx(stockDay6016.getCodeEx());
        stockDayScience6016.setDate(stockDay6016.getDate());
        stockDayScience6016.setQuantity(stockDay6016.getMakeQuantity());

        if (stockDay6016.getOpeningPrice() == null || stockDay6016.getOpeningPrice().compareTo(BigDecimal.ZERO) == 0) {
            return false;
        }
        //macd
        MacdVo macdVo = MACDUtil.getMacd1(macdEntity1);
        if (macdVo != null) {
            stockDayScience6016.setMacd(macdVo.getMACD());
            stockDayScience6016.setDiff(macdVo.getDIF());
            stockDayScience6016.setDea(macdVo.getDEA());
            stockDayScience6016.setEma12(macdVo.getEMA12());
            stockDayScience6016.setEma26(macdVo.getEMA26());
        }
        //kdj
        if (kdjEntityList.size() == 9) {
            kdjEntity1.setBeforeD(stockDayScience6016List.get(0).getD());
            kdjEntity1.setBeforeK(stockDayScience6016List.get(0).getK());
            kdjEntity1.setBeforeRSV(stockDayScience6016List.get(0).getRsv());
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
            kdjEntity1.setClosingPrice(stockDay6016.getClosingPrice());

            KDJVo kdjVo = KDJUtil.getKDJ(kdjEntity1);
            stockDayScience6016.setK(kdjVo.getK());
            stockDayScience6016.setD(kdjVo.getD());
            stockDayScience6016.setJ(kdjVo.getJ());
            stockDayScience6016.setRsv(kdjVo.getRSV());
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
            stockDayScience6016.setRsi1(rsiVo.getRSI6());
            stockDayScience6016.setRsi2(rsiVo.getRSI12());
            stockDayScience6016.setRsi3(rsiVo.getRSI24());
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
            stockDayScience6016.setBias1(biasVo.getBIAS5());
            stockDayScience6016.setBias2(biasVo.getBIAS10());
            stockDayScience6016.setBias3(biasVo.getBIAS30());
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
            stockDayScience6016.setCci(cciVo.getCCI());
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
            stockDayScience6016.setWr1(wrVo.getWR21());
            stockDayScience6016.setWr2(wrVo.getWR42());
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
            stockDayScience6016.setUpp(bollVo.getUP());
            stockDayScience6016.setMid(bollVo.getMB());
            stockDayScience6016.setLow(bollVo.getDN());
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
            stockDayScience6016.setMakeQuantityMa5(makeQuantityVo.getMakeQuantity5());
            stockDayScience6016.setMakeQuantityMa10(makeQuantityVo.getMakeQuantity10());
            stockDayScience6016.setMakeQuantityMa20(makeQuantityVo.getMakeQuantity20());
            stockDayScience6016.setMakeQuantityMa30(makeQuantityVo.getMakeQuantity30());
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
            stockDayScience6016.setPriceMa5(priceVo.getPriceMa5());
            stockDayScience6016.setPriceMa10(priceVo.getPriceMa10());
            stockDayScience6016.setPriceMa20(priceVo.getPriceMa20());
            stockDayScience6016.setPriceMa30(priceVo.getPriceMa30());
            stockDayScience6016.setPriceMa60(priceVo.getPriceMa60());
        }
        //保存Redis
        stockDayScience6016List.add(stockDayScience6016);
        Collections.sort(stockDayScience6016List, new Comparator<StockDayScience6016>() {
            @Override
            public int compare(StockDayScience6016 o1, StockDayScience6016 o2) {
                long i = o2.getDate().getTime() - o1.getDate().getTime();
                if (i > 0) {
                    return 1;
                } else if (i < 0) {
                    return -1;
                }
                return 0;
            }
        });
        stockDayScience6016List.remove(stockDayScience6016List.size()-1);
        redisTemplate.opsForValue().set(Constants.SCIENCE+stockDay6016.getCodeEx()+stockDay6016.getCodeId(), stockDayScience6016List);
        stockDayScience6016Service.save(stockDayScience6016);
        return true;

    }

}
