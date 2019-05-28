package com.stock.stockday.service.function;

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
import com.stock.stockday.entity.StockCode;
import com.stock.stockday.entity.StockDay3002;
import com.stock.stockday.entity.StockDayScience3002;
import com.stock.stockday.service.StockDay3002Service;
import com.stock.stockday.service.StockDayScience3002Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class DayScience3002Function {
    @Autowired
    private StockDayScience3002Service stockDayScience3002Service;
    @Autowired
    private StockDay3002Service stockDay3002Service;

    public boolean dayScience3002Function(StockCode stockCode){
        List<StockDay3002> stockDay3002List = stockDay3002Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());
        List<StockDayScience3002> stockDayScience3002List = new ArrayList<>();
        if (stockDay3002List == null || stockDay3002List.size() == 0) {
            return false;
        }
        //排序
        Collections.sort(stockDay3002List, new Comparator<StockDay3002>() {
            @Override
            public int compare(StockDay3002 o1, StockDay3002 o2) {
                long i=o1.getDate().getTime() - o2.getDate().getTime();
                if (i>0){
                    return 1;
                }else if (i<0){
                    return -1;
                }
                return 0;
            }
        });

        List<MacdEntity> macdEntityList = new ArrayList<>();
        List<KDJEntity> kdjEntityList = new ArrayList<>();
        List<RSIEntity> rsiEntityList = new ArrayList<>();
        List<BIASEntity> biasEntityList = new ArrayList<>();
        List<CCIEntity> cciEntityList = new ArrayList<>();
        List<WREntity> wrEntityList = new ArrayList<>();
        List<BOLLEntity> bollEntityList = new ArrayList<>();
        List<MakeQuantityEntity> makeQuantityEntityList = new ArrayList<>();
        List<PriceEntity> priceEntityList = new ArrayList<>();

        MacdEntity macdEntity1 = new MacdEntity();
        KDJEntity kdjEntity1 = new KDJEntity();
        KDJEntity kdjEntity2 = new KDJEntity();
        for (StockDay3002 stockDay3002 : stockDay3002List) {
            if (stockDay3002.getOpeningPrice() == null || stockDay3002.getOpeningPrice().compareTo(BigDecimal.ZERO) == 0) {
                continue;
            }
            //macd
            MacdEntity macdEntity = new MacdEntity();
            StockDayScience3002 stockDayScience3002 = new StockDayScience3002();
            stockDayScience3002.setCodeId(stockDay3002.getCodeId());
            stockDayScience3002.setCodeEx(stockDay3002.getCodeEx());
            stockDayScience3002.setDate(stockDay3002.getDate());
            macdEntity.setClosingPrice(stockDay3002.getClosingPrice());
            macdEntityList.add(macdEntity);
            if (macdEntityList.size() == 26) {
                MacdVo macdVo = MACDUtil.getMacd(macdEntityList);
                if (macdVo != null) {
                    stockDayScience3002.setMacd(macdVo.getMACD());
                    stockDayScience3002.setDiff(macdVo.getDIF());
                    stockDayScience3002.setDea(macdVo.getDEA());
                    stockDayScience3002.setEma12(macdVo.getEMA12());
                    stockDayScience3002.setEma26(macdVo.getEMA26());
                    macdEntity1.setBeforeDea(macdVo.getDEA());
                    macdEntity1.setBeforeEma12(macdVo.getEMA12());
                    macdEntity1.setBeforeEma26(macdVo.getEMA26());
                }
            }
            if (macdEntityList.size() > 26) {
                macdEntity.setBeforeEma26(macdEntity1.getBeforeEma26());
                macdEntity.setBeforeDea(macdEntity1.getBeforeDea());
                macdEntity.setBeforeEma12(macdEntity1.getBeforeEma12());
                MacdVo macdVo = MACDUtil.getMacd1(macdEntity);
                if (macdVo != null) {
                    stockDayScience3002.setMacd(macdVo.getMACD());
                    stockDayScience3002.setDiff(macdVo.getDIF());
                    stockDayScience3002.setDea(macdVo.getDEA());
                    stockDayScience3002.setEma12(macdVo.getEMA12());
                    stockDayScience3002.setEma26(macdVo.getEMA26());
                    macdEntity1.setBeforeDea(macdVo.getDEA());
                    macdEntity1.setBeforeEma12(macdVo.getEMA12());
                    macdEntity1.setBeforeEma26(macdVo.getEMA26());
                }
            }
            //kdj
            KDJEntity kdjEntity = new KDJEntity();
            kdjEntity.setClosingPrice(stockDay3002.getClosingPrice());
            kdjEntity.setFoot(stockDay3002.getFoot());
            kdjEntity.setTopside(stockDay3002.getTopside());
            kdjEntity.setDate(stockDay3002.getDate());
            kdjEntityList.add(kdjEntity);
            if (kdjEntityList.size() == 9) {
                kdjEntity1 = kdjEntity2;
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
                kdjEntity2.setBeforeRSV(kdjVo.getRSV());
                kdjEntity2.setBeforeK(kdjVo.getK());
                kdjEntity2.setBeforeD(kdjVo.getD());
                Collections.sort(kdjEntityList, new Comparator<KDJEntity>() {
                    @Override
                    public int compare(KDJEntity o1, KDJEntity o2) {
                        long i = o1.getDate().getTime() - o2.getDate().getTime();
                        if (i > 0) {
                            return 1;
                        } else if (i < 0) {
                            return -1;
                        }
                        return 0;
                    }
                });
                kdjEntityList.remove(0);
            }
            //RSI

            RSIEntity rsiEntity = new RSIEntity();
            if (stockDay3002.getChangePoints() == null) {
                rsiEntity.setChangePoints(new BigDecimal(0));
            } else {
                rsiEntity.setChangePoints(stockDay3002.getChangePoints());
            }
            rsiEntity.setDate(stockDay3002.getDate());
            rsiEntityList.add(rsiEntity);
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
                rsiEntityList.remove(kdjEntityList.size() - 1);
            }
            //BIAS

            BIASEntity biasEntity = new BIASEntity();
            biasEntity.setClosingPrice(stockDay3002.getClosingPrice());
            biasEntity.setDate(stockDay3002.getDate());
            biasEntityList.add(biasEntity);
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
                biasEntityList.remove(biasEntityList.size() - 1);
            }
            //CCI

            CCIEntity cciEntity = new CCIEntity();
            cciEntity.setDate(stockDay3002.getDate());
            cciEntity.setClosingPrice(stockDay3002.getClosingPrice());
            cciEntity.setFoot(stockDay3002.getFoot());
            cciEntity.setTopside(stockDay3002.getTopside());
            cciEntityList.add(cciEntity);
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
                cciEntityList.remove(0);
            }
            //WR

            WREntity wrEntity = new WREntity();
            wrEntity.setDate(stockDay3002.getDate());
            wrEntity.setClosingPrice(stockDay3002.getClosingPrice());
            wrEntity.setFoot(stockDay3002.getFoot());
            wrEntity.setTopside(stockDay3002.getTopside());
            wrEntityList.add(wrEntity);
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
                wrEntityList.remove(wrEntityList.size() - 1);
            }
            //BOLL

            BOLLEntity bollEntity = new BOLLEntity();
            bollEntity.setDate(stockDay3002.getDate());
            bollEntity.setClosingPrice(stockDay3002.getClosingPrice());
            bollEntityList.add(bollEntity);
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
                bollEntityList.remove(bollEntityList.size() - 1);
            }
            //均量

            MakeQuantityEntity makeQuantityEntity = new MakeQuantityEntity();
            makeQuantityEntity.setDate(stockDay3002.getDate());
            makeQuantityEntity.setMakeQuantity(stockDay3002.getMakeQuantity());
            makeQuantityEntityList.add(makeQuantityEntity);
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
                makeQuantityEntityList.remove(makeQuantityEntityList.size() - 1);
            }
            //均价

            PriceEntity priceEntity = new PriceEntity();
            priceEntity.setDate(stockDay3002.getDate());
            priceEntity.setClosingPrice(stockDay3002.getClosingPrice());
            priceEntityList.add(priceEntity);
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
                priceEntityList.remove(priceEntityList.size() - 1);
            }
            //量
            stockDayScience3002.setQuantity(stockDay3002.getMakeQuantity());
            stockDayScience3002Service.save(stockDayScience3002);
        }
        return true;

    }

}
