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
import com.stock.stockday.entity.StockDay0022;
import com.stock.stockday.entity.StockDayScience0022;
import com.stock.stockday.service.StockDay0022Service;
import com.stock.stockday.service.StockDayScience0022Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class DayScience0022FunctionToday {
    @Autowired
    private StockDayScience0022Service stockDayScience0022Service;
    @Autowired
    private StockDay0022Service stockDay0022Service;
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    public boolean dayScience0022Function(StockDay0022 stockDay0022) {
        Page<StockDay0022> page = new Page<>(1, 60);
        List<StockDay0022> stockDay0022List = stockDay0022Service.selectByCodeAndExPage(page, stockDay0022.getCodeId(), stockDay0022.getCodeEx());
        Page<StockDayScience0022> page1 = new Page<>(1, 60);
        List<StockDayScience0022> stockDayScience0022List = stockDayScience0022Service.selectByPage(page1, stockDay0022.getCodeId(), stockDay0022.getCodeEx());
        if (stockDay0022List == null || stockDay0022List.size() == 0) {
            return false;
        }
        stockDay0022List.add(stockDay0022);
        //排序
        Collections.sort(stockDay0022List, new Comparator<StockDay0022>() {
            @Override
            public int compare(StockDay0022 o1, StockDay0022 o2) {
                long i = o2.getDate().getTime() - o1.getDate().getTime();
                if (i > 0) {
                    return 1;
                } else if (i < 0) {
                    return -1;
                }
                return 0;
            }
        });
        Collections.sort(stockDayScience0022List, new Comparator<StockDayScience0022>() {
            @Override
            public int compare(StockDayScience0022 o1, StockDayScience0022 o2) {
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
        stockDay0022List.remove(stockDay0022List.size()-1);
        //保存Redis
        redisTemplate.opsForValue().set(stockDay0022.getCodeEx()+stockDay0022.getCodeId(), stockDay0022List);
        MacdEntity macdEntity1 = new MacdEntity();
        macdEntity1.setClosingPrice(stockDay0022.getClosingPrice());
        macdEntity1.setBeforeEma12(stockDayScience0022List.get(0).getEma12());
        macdEntity1.setBeforeDea(stockDayScience0022List.get(0).getDea());
        macdEntity1.setBeforeEma26(stockDayScience0022List.get(0).getEma26());
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

        for (int i = 0; i < stockDay0022List.size(); i++) {
            if (i < 9) {
                KDJEntity kdjEntity = new KDJEntity();
                kdjEntity.setClosingPrice(stockDay0022List.get(i).getClosingPrice());
                kdjEntity.setFoot(stockDay0022List.get(i).getFoot());
                kdjEntity.setTopside(stockDay0022List.get(i).getTopside());
                kdjEntity.setDate(stockDay0022List.get(i).getDate());
                kdjEntityList.add(kdjEntity);
            }
            if (i<14){
                CCIEntity cciEntity = new CCIEntity();
                cciEntity.setDate(stockDay0022List.get(i).getDate());
                cciEntity.setClosingPrice(stockDay0022List.get(i).getClosingPrice());
                cciEntity.setFoot(stockDay0022List.get(i).getFoot());
                cciEntity.setTopside(stockDay0022List.get(i).getTopside());
                cciEntityList.add(cciEntity);
            }
            if (i<20){
                BOLLEntity bollEntity = new BOLLEntity();
                bollEntity.setDate(stockDay0022List.get(i).getDate());
                bollEntity.setClosingPrice(stockDay0022List.get(i).getClosingPrice());
                bollEntityList.add(bollEntity);
            }
            if (i<24){
                RSIEntity rsiEntity = new RSIEntity();
                if (stockDay0022List.get(i).getChangePoints() == null) {
                    rsiEntity.setChangePoints(new BigDecimal(0));
                } else {
                    rsiEntity.setChangePoints(stockDay0022List.get(i).getChangePoints());
                }
                rsiEntity.setDate(stockDay0022List.get(i).getDate());
                rsiEntityList.add(rsiEntity);
            }
            if (i<30){
                BIASEntity biasEntity = new BIASEntity();
                biasEntity.setClosingPrice(stockDay0022List.get(i).getClosingPrice());
                biasEntity.setDate(stockDay0022List.get(i).getDate());
                biasEntityList.add(biasEntity);

                MakeQuantityEntity makeQuantityEntity = new MakeQuantityEntity();
                makeQuantityEntity.setDate(stockDay0022List.get(i).getDate());
                makeQuantityEntity.setMakeQuantity(stockDay0022List.get(i).getMakeQuantity());
                makeQuantityEntityList.add(makeQuantityEntity);
            }
            if (i<42){
                WREntity wrEntity = new WREntity();
                wrEntity.setDate(stockDay0022List.get(i).getDate());
                wrEntity.setClosingPrice(stockDay0022List.get(i).getClosingPrice());
                wrEntity.setFoot(stockDay0022List.get(i).getFoot());
                wrEntity.setTopside(stockDay0022List.get(i).getTopside());
                wrEntityList.add(wrEntity);
            }
            if (i<60){
                PriceEntity priceEntity = new PriceEntity();
                priceEntity.setDate(stockDay0022List.get(i).getDate());
                priceEntity.setClosingPrice(stockDay0022List.get(i).getClosingPrice());
                priceEntityList.add(priceEntity);
            }

        }
        StockDayScience0022 stockDayScience0022 = new StockDayScience0022();
        stockDayScience0022.setCodeId(stockDay0022.getCodeId());
        stockDayScience0022.setCodeEx(stockDay0022.getCodeEx());
        stockDayScience0022.setDate(stockDay0022.getDate());
        stockDayScience0022.setQuantity(stockDay0022.getMakeQuantity());

        if (stockDay0022.getOpeningPrice() == null || stockDay0022.getOpeningPrice().compareTo(BigDecimal.ZERO) == 0) {
            return false;
        }
        //macd
        MacdVo macdVo = MACDUtil.getMacd1(macdEntity1);
        if (macdVo != null) {
            stockDayScience0022.setMacd(macdVo.getMACD());
            stockDayScience0022.setDiff(macdVo.getDIF());
            stockDayScience0022.setDea(macdVo.getDEA());
            stockDayScience0022.setEma12(macdVo.getEMA12());
            stockDayScience0022.setEma26(macdVo.getEMA26());
        }
        //kdj
        if (kdjEntityList.size() == 9) {
            kdjEntity1.setBeforeD(stockDayScience0022List.get(0).getD());
            kdjEntity1.setBeforeK(stockDayScience0022List.get(0).getK());
            kdjEntity1.setBeforeRSV(stockDayScience0022List.get(0).getRsv());
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
            kdjEntity1.setClosingPrice(stockDay0022.getClosingPrice());

            KDJVo kdjVo = KDJUtil.getKDJ(kdjEntity1);
            stockDayScience0022.setK(kdjVo.getK());
            stockDayScience0022.setD(kdjVo.getD());
            stockDayScience0022.setJ(kdjVo.getJ());
            stockDayScience0022.setRsv(kdjVo.getRSV());
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
            stockDayScience0022.setRsi1(rsiVo.getRSI6());
            stockDayScience0022.setRsi2(rsiVo.getRSI12());
            stockDayScience0022.setRsi3(rsiVo.getRSI24());
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
            stockDayScience0022.setBias1(biasVo.getBIAS5());
            stockDayScience0022.setBias2(biasVo.getBIAS10());
            stockDayScience0022.setBias3(biasVo.getBIAS30());
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
            stockDayScience0022.setCci(cciVo.getCCI());
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
            stockDayScience0022.setWr1(wrVo.getWR21());
            stockDayScience0022.setWr2(wrVo.getWR42());
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
            stockDayScience0022.setUpp(bollVo.getUP());
            stockDayScience0022.setMid(bollVo.getMB());
            stockDayScience0022.setLow(bollVo.getDN());
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
            stockDayScience0022.setMakeQuantityMa5(makeQuantityVo.getMakeQuantity5());
            stockDayScience0022.setMakeQuantityMa10(makeQuantityVo.getMakeQuantity10());
            stockDayScience0022.setMakeQuantityMa20(makeQuantityVo.getMakeQuantity20());
            stockDayScience0022.setMakeQuantityMa30(makeQuantityVo.getMakeQuantity30());
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
            stockDayScience0022.setPriceMa5(priceVo.getPriceMa5());
            stockDayScience0022.setPriceMa10(priceVo.getPriceMa10());
            stockDayScience0022.setPriceMa20(priceVo.getPriceMa20());
            stockDayScience0022.setPriceMa30(priceVo.getPriceMa30());
            stockDayScience0022.setPriceMa60(priceVo.getPriceMa60());
        }
        //保存Redis
        stockDayScience0022List.add(stockDayScience0022);
        Collections.sort(stockDayScience0022List, new Comparator<StockDayScience0022>() {
            @Override
            public int compare(StockDayScience0022 o1, StockDayScience0022 o2) {
                long i = o2.getDate().getTime() - o1.getDate().getTime();
                if (i > 0) {
                    return 1;
                } else if (i < 0) {
                    return -1;
                }
                return 0;
            }
        });
        stockDayScience0022List.remove(stockDayScience0022List.size()-1);
        redisTemplate.opsForValue().set(Constants.SCIENCE+stockDay0022.getCodeEx()+stockDay0022.getCodeId(), stockDayScience0022List);
        stockDayScience0022Service.save(stockDayScience0022);
        return true;

    }

}
