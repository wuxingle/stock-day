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
import com.stock.stockday.entity.StockDay6000;
import com.stock.stockday.entity.StockDayScience6000;
import com.stock.stockday.service.StockDay6000Service;
import com.stock.stockday.service.StockDayScience6000Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class DayScience6000Function {
    @Autowired
    private StockDayScience6000Service stockDayScience6000Service;
    @Autowired
    private StockDay6000Service stockDay6000Service;

    public boolean dayScience6000Function(StockCode stockCode){
        List<StockDay6000> stockDay6000List = stockDay6000Service.selectByCodeAndEx(stockCode.getId(), stockCode.getEx());
        List<StockDayScience6000> stockDayScience6000List = new ArrayList<>();
        if (stockDay6000List == null || stockDay6000List.size() == 0) {
            return false;
        }
        //排序
        Collections.sort(stockDay6000List, new Comparator<StockDay6000>() {
            @Override
            public int compare(StockDay6000 o1, StockDay6000 o2) {
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
        for (StockDay6000 stockDay6000 : stockDay6000List) {
            if (stockDay6000.getOpeningPrice() == null || stockDay6000.getOpeningPrice().compareTo(BigDecimal.ZERO) == 0) {
                continue;
            }
            //macd
            MacdEntity macdEntity = new MacdEntity();
            StockDayScience6000 stockDayScience6000 = new StockDayScience6000();
            stockDayScience6000.setCodeId(stockDay6000.getCodeId());
            stockDayScience6000.setCodeEx(stockDay6000.getCodeEx());
            stockDayScience6000.setDate(stockDay6000.getDate());
            macdEntity.setClosingPrice(stockDay6000.getClosingPrice());
            macdEntityList.add(macdEntity);
            if (macdEntityList.size() == 26) {
                MacdVo macdVo = MACDUtil.getMacd(macdEntityList);
                if (macdVo != null) {
                    stockDayScience6000.setMacd(macdVo.getMACD());
                    stockDayScience6000.setDiff(macdVo.getDIF());
                    stockDayScience6000.setDea(macdVo.getDEA());
                    stockDayScience6000.setEma12(macdVo.getEMA12());
                    stockDayScience6000.setEma26(macdVo.getEMA26());
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
                    stockDayScience6000.setMacd(macdVo.getMACD());
                    stockDayScience6000.setDiff(macdVo.getDIF());
                    stockDayScience6000.setDea(macdVo.getDEA());
                    stockDayScience6000.setEma12(macdVo.getEMA12());
                    stockDayScience6000.setEma26(macdVo.getEMA26());
                    macdEntity1.setBeforeDea(macdVo.getDEA());
                    macdEntity1.setBeforeEma12(macdVo.getEMA12());
                    macdEntity1.setBeforeEma26(macdVo.getEMA26());
                }
            }
            //kdj
            KDJEntity kdjEntity = new KDJEntity();
            kdjEntity.setClosingPrice(stockDay6000.getClosingPrice());
            kdjEntity.setFoot(stockDay6000.getFoot());
            kdjEntity.setTopside(stockDay6000.getTopside());
            kdjEntity.setDate(stockDay6000.getDate());
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
                kdjEntity1.setClosingPrice(stockDay6000.getClosingPrice());

                KDJVo kdjVo = KDJUtil.getKDJ(kdjEntity1);
                stockDayScience6000.setK(kdjVo.getK());
                stockDayScience6000.setD(kdjVo.getD());
                stockDayScience6000.setJ(kdjVo.getJ());
                stockDayScience6000.setRsv(kdjVo.getRSV());
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
            if (stockDay6000.getChangePoints() == null) {
                rsiEntity.setChangePoints(new BigDecimal(0));
            } else {
                rsiEntity.setChangePoints(stockDay6000.getChangePoints());
            }
            rsiEntity.setDate(stockDay6000.getDate());
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
                stockDayScience6000.setRsi1(rsiVo.getRSI6());
                stockDayScience6000.setRsi2(rsiVo.getRSI12());
                stockDayScience6000.setRsi3(rsiVo.getRSI24());
                rsiEntityList.remove(kdjEntityList.size() - 1);
            }
            //BIAS

            BIASEntity biasEntity = new BIASEntity();
            biasEntity.setClosingPrice(stockDay6000.getClosingPrice());
            biasEntity.setDate(stockDay6000.getDate());
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
                stockDayScience6000.setBias1(biasVo.getBIAS5());
                stockDayScience6000.setBias2(biasVo.getBIAS10());
                stockDayScience6000.setBias3(biasVo.getBIAS30());
                biasEntityList.remove(biasEntityList.size() - 1);
            }
            //CCI

            CCIEntity cciEntity = new CCIEntity();
            cciEntity.setDate(stockDay6000.getDate());
            cciEntity.setClosingPrice(stockDay6000.getClosingPrice());
            cciEntity.setFoot(stockDay6000.getFoot());
            cciEntity.setTopside(stockDay6000.getTopside());
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
                stockDayScience6000.setCci(cciVo.getCCI());
                cciEntityList.remove(0);
            }
            //WR

            WREntity wrEntity = new WREntity();
            wrEntity.setDate(stockDay6000.getDate());
            wrEntity.setClosingPrice(stockDay6000.getClosingPrice());
            wrEntity.setFoot(stockDay6000.getFoot());
            wrEntity.setTopside(stockDay6000.getTopside());
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
                stockDayScience6000.setWr1(wrVo.getWR21());
                stockDayScience6000.setWr2(wrVo.getWR42());
                wrEntityList.remove(wrEntityList.size() - 1);
            }
            //BOLL

            BOLLEntity bollEntity = new BOLLEntity();
            bollEntity.setDate(stockDay6000.getDate());
            bollEntity.setClosingPrice(stockDay6000.getClosingPrice());
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
                stockDayScience6000.setUpp(bollVo.getUP());
                stockDayScience6000.setMid(bollVo.getMB());
                stockDayScience6000.setLow(bollVo.getDN());
                bollEntityList.remove(bollEntityList.size() - 1);
            }
            //均量

            MakeQuantityEntity makeQuantityEntity = new MakeQuantityEntity();
            makeQuantityEntity.setDate(stockDay6000.getDate());
            makeQuantityEntity.setMakeQuantity(stockDay6000.getMakeQuantity());
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
                stockDayScience6000.setMakeQuantityMa5(makeQuantityVo.getMakeQuantity5());
                stockDayScience6000.setMakeQuantityMa10(makeQuantityVo.getMakeQuantity10());
                stockDayScience6000.setMakeQuantityMa20(makeQuantityVo.getMakeQuantity20());
                stockDayScience6000.setMakeQuantityMa30(makeQuantityVo.getMakeQuantity30());
                makeQuantityEntityList.remove(makeQuantityEntityList.size() - 1);
            }
            //均价

            PriceEntity priceEntity = new PriceEntity();
            priceEntity.setDate(stockDay6000.getDate());
            priceEntity.setClosingPrice(stockDay6000.getClosingPrice());
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
                stockDayScience6000.setPriceMa5(priceVo.getPriceMa5());
                stockDayScience6000.setPriceMa10(priceVo.getPriceMa10());
                stockDayScience6000.setPriceMa20(priceVo.getPriceMa20());
                stockDayScience6000.setPriceMa30(priceVo.getPriceMa30());
                stockDayScience6000.setPriceMa60(priceVo.getPriceMa60());
                priceEntityList.remove(priceEntityList.size() - 1);
            }
            //量
            stockDayScience6000.setQuantity(stockDay6000.getMakeQuantity());
            stockDayScience6000Service.save(stockDayScience6000);
        }
        return true;

    }

}
