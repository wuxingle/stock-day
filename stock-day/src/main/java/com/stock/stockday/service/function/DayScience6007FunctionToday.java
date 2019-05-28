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
import com.stock.stockday.entity.StockDay6007;
import com.stock.stockday.entity.StockDayScience6007;
import com.stock.stockday.service.StockDay6007Service;
import com.stock.stockday.service.StockDayScience6007Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class DayScience6007FunctionToday {
    @Autowired
    private StockDayScience6007Service stockDayScience6007Service;
    @Autowired
    private StockDay6007Service stockDay6007Service;
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    public boolean dayScience6007Function(StockDay6007 stockDay6007) {
        Page<StockDay6007> page = new Page<>(1, 60);
        List<StockDay6007> stockDay6007List = stockDay6007Service.selectByCodeAndExPage(page, stockDay6007.getCodeId(), stockDay6007.getCodeEx());
        Page<StockDayScience6007> page1 = new Page<>(1, 60);
        List<StockDayScience6007> stockDayScience6007List = stockDayScience6007Service.selectByPage(page1, stockDay6007.getCodeId(), stockDay6007.getCodeEx());
        if (stockDay6007List == null || stockDay6007List.size() == 0) {
            return false;
        }
        stockDay6007List.add(stockDay6007);
        //排序
        Collections.sort(stockDay6007List, new Comparator<StockDay6007>() {
            @Override
            public int compare(StockDay6007 o1, StockDay6007 o2) {
                long i = o2.getDate().getTime() - o1.getDate().getTime();
                if (i > 0) {
                    return 1;
                } else if (i < 0) {
                    return -1;
                }
                return 0;
            }
        });
        Collections.sort(stockDayScience6007List, new Comparator<StockDayScience6007>() {
            @Override
            public int compare(StockDayScience6007 o1, StockDayScience6007 o2) {
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
        stockDay6007List.remove(stockDay6007List.size()-1);
        //保存Redis
        redisTemplate.opsForValue().set(stockDay6007.getCodeEx()+stockDay6007.getCodeId(), stockDay6007List);
        MacdEntity macdEntity1 = new MacdEntity();
        macdEntity1.setClosingPrice(stockDay6007.getClosingPrice());
        macdEntity1.setBeforeEma12(stockDayScience6007List.get(0).getEma12());
        macdEntity1.setBeforeDea(stockDayScience6007List.get(0).getDea());
        macdEntity1.setBeforeEma26(stockDayScience6007List.get(0).getEma26());
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

        for (int i = 0; i < stockDay6007List.size(); i++) {
            if (i < 9) {
                KDJEntity kdjEntity = new KDJEntity();
                kdjEntity.setClosingPrice(stockDay6007List.get(i).getClosingPrice());
                kdjEntity.setFoot(stockDay6007List.get(i).getFoot());
                kdjEntity.setTopside(stockDay6007List.get(i).getTopside());
                kdjEntity.setDate(stockDay6007List.get(i).getDate());
                kdjEntityList.add(kdjEntity);
            }
            if (i<14){
                CCIEntity cciEntity = new CCIEntity();
                cciEntity.setDate(stockDay6007List.get(i).getDate());
                cciEntity.setClosingPrice(stockDay6007List.get(i).getClosingPrice());
                cciEntity.setFoot(stockDay6007List.get(i).getFoot());
                cciEntity.setTopside(stockDay6007List.get(i).getTopside());
                cciEntityList.add(cciEntity);
            }
            if (i<20){
                BOLLEntity bollEntity = new BOLLEntity();
                bollEntity.setDate(stockDay6007List.get(i).getDate());
                bollEntity.setClosingPrice(stockDay6007List.get(i).getClosingPrice());
                bollEntityList.add(bollEntity);
            }
            if (i<24){
                RSIEntity rsiEntity = new RSIEntity();
                if (stockDay6007List.get(i).getChangePoints() == null) {
                    rsiEntity.setChangePoints(new BigDecimal(0));
                } else {
                    rsiEntity.setChangePoints(stockDay6007List.get(i).getChangePoints());
                }
                rsiEntity.setDate(stockDay6007List.get(i).getDate());
                rsiEntityList.add(rsiEntity);
            }
            if (i<30){
                BIASEntity biasEntity = new BIASEntity();
                biasEntity.setClosingPrice(stockDay6007List.get(i).getClosingPrice());
                biasEntity.setDate(stockDay6007List.get(i).getDate());
                biasEntityList.add(biasEntity);

                MakeQuantityEntity makeQuantityEntity = new MakeQuantityEntity();
                makeQuantityEntity.setDate(stockDay6007List.get(i).getDate());
                makeQuantityEntity.setMakeQuantity(stockDay6007List.get(i).getMakeQuantity());
                makeQuantityEntityList.add(makeQuantityEntity);
            }
            if (i<42){
                WREntity wrEntity = new WREntity();
                wrEntity.setDate(stockDay6007List.get(i).getDate());
                wrEntity.setClosingPrice(stockDay6007List.get(i).getClosingPrice());
                wrEntity.setFoot(stockDay6007List.get(i).getFoot());
                wrEntity.setTopside(stockDay6007List.get(i).getTopside());
                wrEntityList.add(wrEntity);
            }
            if (i<60){
                PriceEntity priceEntity = new PriceEntity();
                priceEntity.setDate(stockDay6007List.get(i).getDate());
                priceEntity.setClosingPrice(stockDay6007List.get(i).getClosingPrice());
                priceEntityList.add(priceEntity);
            }

        }
        StockDayScience6007 stockDayScience6007 = new StockDayScience6007();
        stockDayScience6007.setCodeId(stockDay6007.getCodeId());
        stockDayScience6007.setCodeEx(stockDay6007.getCodeEx());
        stockDayScience6007.setDate(stockDay6007.getDate());
        stockDayScience6007.setQuantity(stockDay6007.getMakeQuantity());

        if (stockDay6007.getOpeningPrice() == null || stockDay6007.getOpeningPrice().compareTo(BigDecimal.ZERO) == 0) {
            return false;
        }
        //macd
        MacdVo macdVo = MACDUtil.getMacd1(macdEntity1);
        if (macdVo != null) {
            stockDayScience6007.setMacd(macdVo.getMACD());
            stockDayScience6007.setDiff(macdVo.getDIF());
            stockDayScience6007.setDea(macdVo.getDEA());
            stockDayScience6007.setEma12(macdVo.getEMA12());
            stockDayScience6007.setEma26(macdVo.getEMA26());
        }
        //kdj
        if (kdjEntityList.size() == 9) {
            kdjEntity1.setBeforeD(stockDayScience6007List.get(0).getD());
            kdjEntity1.setBeforeK(stockDayScience6007List.get(0).getK());
            kdjEntity1.setBeforeRSV(stockDayScience6007List.get(0).getRsv());
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
            kdjEntity1.setClosingPrice(stockDay6007.getClosingPrice());

            KDJVo kdjVo = KDJUtil.getKDJ(kdjEntity1);
            stockDayScience6007.setK(kdjVo.getK());
            stockDayScience6007.setD(kdjVo.getD());
            stockDayScience6007.setJ(kdjVo.getJ());
            stockDayScience6007.setRsv(kdjVo.getRSV());
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
            stockDayScience6007.setRsi1(rsiVo.getRSI6());
            stockDayScience6007.setRsi2(rsiVo.getRSI12());
            stockDayScience6007.setRsi3(rsiVo.getRSI24());
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
            stockDayScience6007.setBias1(biasVo.getBIAS5());
            stockDayScience6007.setBias2(biasVo.getBIAS10());
            stockDayScience6007.setBias3(biasVo.getBIAS30());
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
            stockDayScience6007.setCci(cciVo.getCCI());
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
            stockDayScience6007.setWr1(wrVo.getWR21());
            stockDayScience6007.setWr2(wrVo.getWR42());
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
            stockDayScience6007.setUpp(bollVo.getUP());
            stockDayScience6007.setMid(bollVo.getMB());
            stockDayScience6007.setLow(bollVo.getDN());
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
            stockDayScience6007.setMakeQuantityMa5(makeQuantityVo.getMakeQuantity5());
            stockDayScience6007.setMakeQuantityMa10(makeQuantityVo.getMakeQuantity10());
            stockDayScience6007.setMakeQuantityMa20(makeQuantityVo.getMakeQuantity20());
            stockDayScience6007.setMakeQuantityMa30(makeQuantityVo.getMakeQuantity30());
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
            stockDayScience6007.setPriceMa5(priceVo.getPriceMa5());
            stockDayScience6007.setPriceMa10(priceVo.getPriceMa10());
            stockDayScience6007.setPriceMa20(priceVo.getPriceMa20());
            stockDayScience6007.setPriceMa30(priceVo.getPriceMa30());
            stockDayScience6007.setPriceMa60(priceVo.getPriceMa60());
        }
        //保存Redis
        stockDayScience6007List.add(stockDayScience6007);
        Collections.sort(stockDayScience6007List, new Comparator<StockDayScience6007>() {
            @Override
            public int compare(StockDayScience6007 o1, StockDayScience6007 o2) {
                long i = o2.getDate().getTime() - o1.getDate().getTime();
                if (i > 0) {
                    return 1;
                } else if (i < 0) {
                    return -1;
                }
                return 0;
            }
        });
        stockDayScience6007List.remove(stockDayScience6007List.size()-1);
        redisTemplate.opsForValue().set(Constants.SCIENCE+stockDay6007.getCodeEx()+stockDay6007.getCodeId(), stockDayScience6007List);
        stockDayScience6007Service.save(stockDayScience6007);
        return true;

    }

}
