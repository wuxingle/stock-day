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
import com.stock.stockday.entity.StockDay0008;
import com.stock.stockday.entity.StockDayScience0008;
import com.stock.stockday.service.StockDay0008Service;
import com.stock.stockday.service.StockDayScience0008Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class DayScience0008FunctionToday {
    @Autowired
    private StockDayScience0008Service stockDayScience0008Service;
    @Autowired
    private StockDay0008Service stockDay0008Service;
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    public boolean dayScience0008Function(StockDay0008 stockDay0008) {
        Page<StockDay0008> page = new Page<>(1, 60);
        List<StockDay0008> stockDay0008List = stockDay0008Service.selectByCodeAndExPage(page, stockDay0008.getCodeId(), stockDay0008.getCodeEx());
        Page<StockDayScience0008> page1 = new Page<>(1, 60);
        List<StockDayScience0008> stockDayScience0008List = stockDayScience0008Service.selectByPage(page1, stockDay0008.getCodeId(), stockDay0008.getCodeEx());
        if (stockDay0008List == null || stockDay0008List.size() == 0) {
            return false;
        }
        stockDay0008List.add(stockDay0008);
        //排序
        Collections.sort(stockDay0008List, new Comparator<StockDay0008>() {
            @Override
            public int compare(StockDay0008 o1, StockDay0008 o2) {
                long i = o2.getDate().getTime() - o1.getDate().getTime();
                if (i > 0) {
                    return 1;
                } else if (i < 0) {
                    return -1;
                }
                return 0;
            }
        });
        Collections.sort(stockDayScience0008List, new Comparator<StockDayScience0008>() {
            @Override
            public int compare(StockDayScience0008 o1, StockDayScience0008 o2) {
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
        stockDay0008List.remove(stockDay0008List.size()-1);
        //保存Redis
        redisTemplate.opsForValue().set(stockDay0008.getCodeEx()+stockDay0008.getCodeId(), stockDay0008List);
        MacdEntity macdEntity1 = new MacdEntity();
        macdEntity1.setClosingPrice(stockDay0008.getClosingPrice());
        if (stockDayScience0008List == null || stockDayScience0008List.size() == 0) {
            macdEntity1.setBeforeEma12(new BigDecimal(50.0));
            macdEntity1.setBeforeDea(new BigDecimal(50.0));
            macdEntity1.setBeforeEma26(new BigDecimal(50.0));
        }else {
            macdEntity1.setBeforeEma12(stockDayScience0008List.get(0).getEma12());
            macdEntity1.setBeforeDea(stockDayScience0008List.get(0).getDea());
            macdEntity1.setBeforeEma26(stockDayScience0008List.get(0).getEma26());
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

        for (int i = 0; i < stockDay0008List.size(); i++) {
            if (i < 9) {
                KDJEntity kdjEntity = new KDJEntity();
                kdjEntity.setClosingPrice(stockDay0008List.get(i).getClosingPrice());
                kdjEntity.setFoot(stockDay0008List.get(i).getFoot());
                kdjEntity.setTopside(stockDay0008List.get(i).getTopside());
                kdjEntity.setDate(stockDay0008List.get(i).getDate());
                kdjEntityList.add(kdjEntity);
            }
            if (i<14){
                CCIEntity cciEntity = new CCIEntity();
                cciEntity.setDate(stockDay0008List.get(i).getDate());
                cciEntity.setClosingPrice(stockDay0008List.get(i).getClosingPrice());
                cciEntity.setFoot(stockDay0008List.get(i).getFoot());
                cciEntity.setTopside(stockDay0008List.get(i).getTopside());
                cciEntityList.add(cciEntity);
            }
            if (i<20){
                BOLLEntity bollEntity = new BOLLEntity();
                bollEntity.setDate(stockDay0008List.get(i).getDate());
                bollEntity.setClosingPrice(stockDay0008List.get(i).getClosingPrice());
                bollEntityList.add(bollEntity);
            }
            if (i<24){
                RSIEntity rsiEntity = new RSIEntity();
                if (stockDay0008List.get(i).getChangePoints() == null) {
                    rsiEntity.setChangePoints(new BigDecimal(0));
                } else {
                    rsiEntity.setChangePoints(stockDay0008List.get(i).getChangePoints());
                }
                rsiEntity.setDate(stockDay0008List.get(i).getDate());
                rsiEntityList.add(rsiEntity);
            }
            if (i<30){
                BIASEntity biasEntity = new BIASEntity();
                biasEntity.setClosingPrice(stockDay0008List.get(i).getClosingPrice());
                biasEntity.setDate(stockDay0008List.get(i).getDate());
                biasEntityList.add(biasEntity);

                MakeQuantityEntity makeQuantityEntity = new MakeQuantityEntity();
                makeQuantityEntity.setDate(stockDay0008List.get(i).getDate());
                makeQuantityEntity.setMakeQuantity(stockDay0008List.get(i).getMakeQuantity());
                makeQuantityEntityList.add(makeQuantityEntity);
            }
            if (i<42){
                WREntity wrEntity = new WREntity();
                wrEntity.setDate(stockDay0008List.get(i).getDate());
                wrEntity.setClosingPrice(stockDay0008List.get(i).getClosingPrice());
                wrEntity.setFoot(stockDay0008List.get(i).getFoot());
                wrEntity.setTopside(stockDay0008List.get(i).getTopside());
                wrEntityList.add(wrEntity);
            }
            if (i<60){
                PriceEntity priceEntity = new PriceEntity();
                priceEntity.setDate(stockDay0008List.get(i).getDate());
                priceEntity.setClosingPrice(stockDay0008List.get(i).getClosingPrice());
                priceEntityList.add(priceEntity);
            }

        }
        StockDayScience0008 stockDayScience0008 = new StockDayScience0008();
        stockDayScience0008.setCodeId(stockDay0008.getCodeId());
        stockDayScience0008.setCodeEx(stockDay0008.getCodeEx());
        stockDayScience0008.setDate(stockDay0008.getDate());
        stockDayScience0008.setQuantity(stockDay0008.getMakeQuantity());

        if (stockDay0008.getOpeningPrice() == null || stockDay0008.getOpeningPrice().compareTo(BigDecimal.ZERO) == 0) {
            return false;
        }
        //macd
        MacdVo macdVo = MACDUtil.getMacd1(macdEntity1);
        if (macdVo != null) {
            stockDayScience0008.setMacd(macdVo.getMACD());
            stockDayScience0008.setDiff(macdVo.getDIF());
            stockDayScience0008.setDea(macdVo.getDEA());
            stockDayScience0008.setEma12(macdVo.getEMA12());
            stockDayScience0008.setEma26(macdVo.getEMA26());
        }
        //kdj
        if (kdjEntityList.size() == 9) {
            if (stockDayScience0008List.get(0).getD()==null||stockDayScience0008List.get(0).getK()==null||stockDayScience0008List.get(0).getRsv()==null) {
                kdjEntity1.setBeforeD(new BigDecimal(50));
                kdjEntity1.setBeforeK(new BigDecimal(50));
                kdjEntity1.setBeforeRSV(new BigDecimal(50));
            }else {
                kdjEntity1.setBeforeD(stockDayScience0008List.get(0).getD());
                kdjEntity1.setBeforeK(stockDayScience0008List.get(0).getK());
                kdjEntity1.setBeforeRSV(stockDayScience0008List.get(0).getRsv());
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
            kdjEntity1.setClosingPrice(stockDay0008.getClosingPrice());

            KDJVo kdjVo = KDJUtil.getKDJ(kdjEntity1);
            stockDayScience0008.setK(kdjVo.getK());
            stockDayScience0008.setD(kdjVo.getD());
            stockDayScience0008.setJ(kdjVo.getJ());
            stockDayScience0008.setRsv(kdjVo.getRSV());
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
            stockDayScience0008.setRsi1(rsiVo.getRSI6());
            stockDayScience0008.setRsi2(rsiVo.getRSI12());
            stockDayScience0008.setRsi3(rsiVo.getRSI24());
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
            stockDayScience0008.setBias1(biasVo.getBIAS5());
            stockDayScience0008.setBias2(biasVo.getBIAS10());
            stockDayScience0008.setBias3(biasVo.getBIAS30());
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
            stockDayScience0008.setCci(cciVo.getCCI());
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
            stockDayScience0008.setWr1(wrVo.getWR21());
            stockDayScience0008.setWr2(wrVo.getWR42());
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
            stockDayScience0008.setUpp(bollVo.getUP());
            stockDayScience0008.setMid(bollVo.getMB());
            stockDayScience0008.setLow(bollVo.getDN());
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
            stockDayScience0008.setMakeQuantityMa5(makeQuantityVo.getMakeQuantity5());
            stockDayScience0008.setMakeQuantityMa10(makeQuantityVo.getMakeQuantity10());
            stockDayScience0008.setMakeQuantityMa20(makeQuantityVo.getMakeQuantity20());
            stockDayScience0008.setMakeQuantityMa30(makeQuantityVo.getMakeQuantity30());
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
            stockDayScience0008.setPriceMa5(priceVo.getPriceMa5());
            stockDayScience0008.setPriceMa10(priceVo.getPriceMa10());
            stockDayScience0008.setPriceMa20(priceVo.getPriceMa20());
            stockDayScience0008.setPriceMa30(priceVo.getPriceMa30());
            stockDayScience0008.setPriceMa60(priceVo.getPriceMa60());
        }
        //保存Redis
        stockDayScience0008List.add(stockDayScience0008);
        Collections.sort(stockDayScience0008List, new Comparator<StockDayScience0008>() {
            @Override
            public int compare(StockDayScience0008 o1, StockDayScience0008 o2) {
                long i = o2.getDate().getTime() - o1.getDate().getTime();
                if (i > 0) {
                    return 1;
                } else if (i < 0) {
                    return -1;
                }
                return 0;
            }
        });
        stockDayScience0008List.remove(stockDayScience0008List.size()-1);
        redisTemplate.opsForValue().set(Constants.SCIENCE+stockDay0008.getCodeEx()+stockDay0008.getCodeId(), stockDayScience0008List);
        stockDayScience0008Service.save(stockDayScience0008);
        return true;

    }

}
