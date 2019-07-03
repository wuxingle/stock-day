package com.stock.stockday.service.find2.yanpan;


import com.stock.apicommon.entity.ScienceEntity;
import com.stock.apicommon.entity.YanPanEntity;
import com.stock.apicommon.utils.patterning.YanPanUtil;
import com.stock.apicommon.vo.YanPanVo;
import com.stock.stockday.entity.StockDayAll;
import com.stock.stockday.entity.StockDayScience;
import com.stock.stockday.entity.StockDayYanPan1;
import com.stock.stockday.service.find2.StockDayYanPan1Service;
import com.stock.stockday.util.FindUtil17;
import com.stock.stockday.util.FindUtil18;
import com.stock.stockday.util.FindUtil19;
import com.stock.stockday.util.FindUtil2;
import com.stock.stockday.util.FindUtil20;
import com.stock.stockday.util.FindUtil21;
import com.stock.stockday.util.FindUtil22;
import com.stock.stockday.util.FindUtil23;
import com.stock.stockday.util.FindUtil24;
import com.stock.stockday.util.FindUtil25;
import com.stock.stockday.util.FindUtil26;
import com.stock.stockday.util.FindUtil27;
import com.stock.stockday.util.FindUtil28;
import com.stock.stockday.util.FindUtil29;
import com.stock.stockday.util.FindUtil3;
import com.stock.stockday.util.FindUtil4;
import com.stock.stockday.util.FindUtil43;
import com.stock.stockday.util.FindUtil44;
import com.stock.stockday.util.FindUtil45;
import com.stock.stockday.util.FindUtil46;
import com.stock.stockday.util.FindUtil47;
import com.stock.stockday.util.FindUtil48;
import com.stock.stockday.util.FindUtil49;
import com.stock.stockday.util.FindUtil5;
import com.stock.stockday.util.FindUtil50;
import com.stock.stockday.util.FindUtil51;
import com.stock.stockday.util.FindUtil52;
import com.stock.stockday.util.FindUtil53;
import com.stock.stockday.util.FindUtil54;
import com.stock.stockday.util.FindUtil55;
import com.stock.stockday.util.FindUtil56;
import com.stock.stockday.util.FindUtil57;
import com.stock.stockday.util.FindUtil58;
import com.stock.stockday.util.FindUtil59;
import com.stock.stockday.util.FindUtil6;
import com.stock.stockday.util.FindUtil60;
import com.stock.stockday.util.FindUtil61;
import com.stock.stockday.util.FindUtil62;
import com.stock.stockday.util.FindUtil63;
import com.stock.stockday.util.FindUtil64;
import com.stock.stockday.util.FindUtil65;
import com.stock.stockday.util.FindUtil66;
import com.stock.stockday.util.FindUtil67;
import com.stock.stockday.util.FindUtil68;
import com.stock.stockday.util.FindUtil69;
import com.stock.stockday.util.FindUtil70;
import com.stock.stockday.util.FindUtil71;
import com.stock.stockday.util.FindUtil72;
import com.stock.stockday.util.FindUtil73;
import com.stock.stockday.util.FindUtil74;
import com.stock.stockday.util.FindUtil75;
import com.stock.stockday.util.FindUtil76;
import com.stock.stockday.util.FindUtil77;
import com.stock.stockday.util.FindUtil78;
import com.stock.stockday.util.FindUtil79;
import com.stock.stockday.util.FindUtil80;
import com.stock.stockday.util.FindUtil81;
import com.stock.stockday.util.FindUtil82;
import com.stock.stockday.util.FindUtil83;
import com.stock.stockday.util.FindUtil84;
import com.stock.stockday.util.FindUtil85;
import com.stock.stockday.util.FindUtil86;
import com.stock.stockday.util.FindUtil87;
import com.stock.stockday.util.FindUtil88;
import com.stock.stockday.util.FindUtil89;
import com.stock.stockday.util.FindUtil90;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class YanPanDayServiceImpl3 {
    @Autowired
    private StockDayYanPan1Service stockDayYanPan1Service;

    public boolean dayYanPanFunction(List<StockDayAll> stockDayAllList, List<StockDayScience> stockDayScienceList,List<StockDayScience> stockDayScienceListDaPan) throws IOException {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return false;
        }
        //排序
        Collections.sort(stockDayAllList, new Comparator<StockDayAll>() {
            @Override
            public int compare(StockDayAll o1, StockDayAll o2) {
                long i = o1.getDate().getTime() - o2.getDate().getTime();
                if (i > 0) {
                    return 1;
                } else if (i < 0) {
                    return -1;
                }
                return 0;
            }
        });
        List<StockDayAll> stockDayAllList1 = new ArrayList<>();
        for (StockDayAll stockDayAll : stockDayAllList) {
            if (stockDayAll.getOpeningPrice().compareTo(new BigDecimal(0))!=0&&stockDayAll.getOpeningPrice() != null && stockDayAll.getLclosePrice() != null&&stockDayAll.getLclosePrice().compareTo(new BigDecimal(0))!=0&&stockDayAll.getChangePoints()!=null) {
                stockDayAllList1.add(stockDayAll);
            }
            if (stockDayAllList1.size() == 80) {
                List<StockDayAll> stockDayAllList2 = new ArrayList<>();
                List<YanPanEntity> yanPanEntityList = new ArrayList<>();
                List<ScienceEntity> scienceEntityList = new ArrayList<>();
                List<ScienceEntity> scienceEntityListDaPan = new ArrayList<>();
                for (int i=0;i<stockDayAllList1.size();i++){
                    if (i<60){
                        stockDayAllList2.add(stockDayAllList1.get(i));
                    }else {
                        YanPanEntity yanPanEntity=new YanPanEntity();
                        BeanUtils.copyProperties(stockDayAllList1.get(i),yanPanEntity);
                        yanPanEntityList.add(yanPanEntity);
                    }

                }
                if (stockDayAllList2==null||stockDayAllList2.size()<60){
                    continue;
                }
                for (StockDayScience stockDayScience : stockDayScienceListDaPan) {
                    if (stockDayAllList2.get(59).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityListDaPan.add(scienceEntity);
                    }
                    if (stockDayAllList2.get(58).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityListDaPan.add(scienceEntity);
                    }
                    if (stockDayAllList2.get(57).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityListDaPan.add(scienceEntity);
                    }
                    if (stockDayAllList2.get(56).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityListDaPan.add(scienceEntity);
                    }
                    if (stockDayAllList2.get(55).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityListDaPan.add(scienceEntity);
                    }
                    if (stockDayAllList2.get(54).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityListDaPan.add(scienceEntity);
                    }
                    if (stockDayAllList2.get(53).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityListDaPan.add(scienceEntity);
                    }
                    if (stockDayAllList2.get(52).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityListDaPan.add(scienceEntity);
                    }
                    if (stockDayAllList2.get(51).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityListDaPan.add(scienceEntity);
                    }
                    if (stockDayAllList2.get(50).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityListDaPan.add(scienceEntity);
                    }
                }
                Collections.sort(scienceEntityListDaPan, new Comparator<ScienceEntity>() {
                    @Override
                    public int compare(ScienceEntity o1, ScienceEntity o2) {
                        long i = o2.getDate().getTime() - o1.getDate().getTime();
                        if (i > 0) {
                            return 1;
                        } else if (i < 0) {
                            return -1;
                        }
                        return 0;
                    }
                });
                if (stockDayAllList1==null||stockDayAllList1.size()<60){
                    continue;
                }
                //技术
                for (StockDayScience stockDayScience : stockDayScienceList) {
                    if (stockDayAllList1.get(59).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(58).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(57).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(56).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(55).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(54).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(53).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(52).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(51).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(50).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                }
                Collections.sort(scienceEntityList, new Comparator<ScienceEntity>() {
                    @Override
                    public int compare(ScienceEntity o1, ScienceEntity o2) {
                        long i = o2.getDate().getTime() - o1.getDate().getTime();
                        if (i > 0) {
                            return 1;
                        } else if (i < 0) {
                            return -1;
                        }
                        return 0;
                    }
                });
                Collections.sort(stockDayAllList2, new Comparator<StockDayAll>() {
                    @Override
                    public int compare(StockDayAll o1, StockDayAll o2) {
                        long i = o2.getDate().getTime() - o1.getDate().getTime();
                        if (i > 0) {
                            return 1;
                        } else if (i < 0) {
                            return -1;
                        }
                        return 0;
                    }
                });
                Collections.sort(yanPanEntityList, new Comparator<YanPanEntity>() {
                    @Override
                    public int compare(YanPanEntity o1, YanPanEntity o2) {
                        long i = o2.getDate().getTime() - o1.getDate().getTime();
                        if (i > 0) {
                            return 1;
                        } else if (i < 0) {
                            return -1;
                        }
                        return 0;
                    }
                });
                //研判
                YanPanVo yanPanVo = YanPanUtil.getYanPanRateOfChange(yanPanEntityList);

//                boolean flag413= FindUtil17.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag414= FindUtil17.shengVDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag415= FindUtil17.reset20Dapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag416= FindUtil17.jieQiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag417= FindUtil17.jishujieqiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag418= FindUtil17.jishujieqiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag419= FindUtil17.jieQiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag420= FindUtil17.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag421= FindUtil17.shengVDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag422= FindUtil17.reset20Dapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag423= FindUtil17.jieQiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag424= FindUtil17.jishujieqiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag425= FindUtil17.jishujieqiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag426= FindUtil17.jishujieqiDapan7(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag427= FindUtil17.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag428= FindUtil17.shengVDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag429= FindUtil17.reset20Dapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag430= FindUtil17.jieQiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag431= FindUtil17.jishujieqiDapan8(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag432= FindUtil17.jishujieqiDapan9(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag433= FindUtil17.jieQiDapan7(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag434= FindUtil17.jieQiDapan8(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag435= FindUtil17.jieQiDapan9(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag436= FindUtil17.jieQiDapan10(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag437= FindUtil17.jieQiDapan11(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag438= FindUtil17.jieQiDapan12(stockDayAllList2,scienceEntityListDaPan);
//
//                boolean flag439= FindUtil18.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag440= FindUtil18.shengVDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag441= FindUtil18.reset20Dapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag442= FindUtil18.jieQiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag443= FindUtil18.jishujieqiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag444= FindUtil18.jishujieqiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag445= FindUtil18.jieQiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag446= FindUtil18.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag447= FindUtil18.shengVDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag448= FindUtil18.reset20Dapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag449= FindUtil18.jieQiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag450= FindUtil18.jishujieqiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag451= FindUtil18.jishujieqiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag452= FindUtil18.jishujieqiDapan7(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag453= FindUtil18.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag454= FindUtil18.shengVDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag455= FindUtil18.reset20Dapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag456= FindUtil18.jieQiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag457= FindUtil18.jishujieqiDapan8(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag458= FindUtil18.jishujieqiDapan9(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag459= FindUtil18.jieQiDapan7(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag460= FindUtil18.jieQiDapan8(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag461= FindUtil18.jieQiDapan9(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag462= FindUtil18.jieQiDapan10(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag463= FindUtil18.jieQiDapan11(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag464= FindUtil18.jieQiDapan12(stockDayAllList2,scienceEntityListDaPan);
//
//                boolean flag465= FindUtil19.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag466= FindUtil19.shengVDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag467= FindUtil19.reset20Dapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag468= FindUtil19.jieQiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag469= FindUtil19.jishujieqiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag470= FindUtil19.jishujieqiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag471= FindUtil19.jieQiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag472= FindUtil19.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag473= FindUtil19.shengVDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag474= FindUtil19.reset20Dapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag475= FindUtil19.jieQiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag476= FindUtil19.jishujieqiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag477= FindUtil19.jishujieqiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag478= FindUtil19.jishujieqiDapan7(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag479= FindUtil19.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag480= FindUtil19.shengVDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag481= FindUtil19.reset20Dapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag482= FindUtil19.jieQiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag483= FindUtil19.jishujieqiDapan8(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag484= FindUtil19.jishujieqiDapan9(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag485= FindUtil19.jieQiDapan7(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag486= FindUtil19.jieQiDapan8(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag487= FindUtil19.jieQiDapan9(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag488= FindUtil19.jieQiDapan10(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag489= FindUtil19.jieQiDapan11(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag490= FindUtil19.jieQiDapan12(stockDayAllList2,scienceEntityListDaPan);
//
//                boolean flag491= FindUtil20.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag492= FindUtil20.shengVDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag493= FindUtil20.reset20Dapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag494= FindUtil20.jieQiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag495= FindUtil20.jishujieqiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag496= FindUtil20.jishujieqiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag497= FindUtil20.jieQiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag498= FindUtil20.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag499= FindUtil20.shengVDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag500= FindUtil20.reset20Dapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag501= FindUtil20.jieQiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag502= FindUtil20.jishujieqiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag503= FindUtil20.jishujieqiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag504= FindUtil20.jishujieqiDapan7(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag505= FindUtil20.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag506= FindUtil20.shengVDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag507= FindUtil20.reset20Dapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag508= FindUtil20.jieQiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag509= FindUtil20.jishujieqiDapan8(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag510= FindUtil20.jishujieqiDapan9(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag511= FindUtil20.jieQiDapan7(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag512= FindUtil20.jieQiDapan8(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag513= FindUtil20.jieQiDapan9(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag514= FindUtil20.jieQiDapan10(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag515= FindUtil20.jieQiDapan11(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag516= FindUtil20.jieQiDapan12(stockDayAllList2,scienceEntityListDaPan);
//
//                boolean flag517= FindUtil21.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag518= FindUtil21.shengVDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag519= FindUtil21.reset20Dapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag520= FindUtil21.jieQiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag521= FindUtil21.jishujieqiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag522= FindUtil21.jishujieqiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag523= FindUtil21.jieQiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag524= FindUtil21.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag525= FindUtil21.shengVDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag526= FindUtil21.reset20Dapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag527= FindUtil21.jieQiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag528= FindUtil21.jishujieqiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag529= FindUtil21.jishujieqiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag530= FindUtil21.jishujieqiDapan7(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag531= FindUtil21.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag532= FindUtil21.shengVDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag533= FindUtil21.reset20Dapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag534= FindUtil21.jieQiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag535= FindUtil21.jishujieqiDapan8(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag536= FindUtil21.jishujieqiDapan9(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag537= FindUtil21.jieQiDapan7(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag538= FindUtil21.jieQiDapan8(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag539= FindUtil21.jieQiDapan9(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag540= FindUtil21.jieQiDapan10(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag541= FindUtil21.jieQiDapan11(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag542= FindUtil21.jieQiDapan12(stockDayAllList2,scienceEntityListDaPan);
//
//                boolean flag543= FindUtil22.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag544= FindUtil22.shengVDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag545= FindUtil22.reset20Dapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag546= FindUtil22.jieQiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag547= FindUtil22.jishujieqiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag548= FindUtil22.jishujieqiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag549= FindUtil22.jieQiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag550= FindUtil22.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag551= FindUtil22.shengVDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag552= FindUtil22.reset20Dapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag553= FindUtil22.jieQiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag554= FindUtil22.jishujieqiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag555= FindUtil22.jishujieqiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag556= FindUtil22.jishujieqiDapan7(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag557= FindUtil22.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag558= FindUtil22.shengVDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag559= FindUtil22.reset20Dapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag560= FindUtil22.jieQiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag561= FindUtil22.jishujieqiDapan8(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag562= FindUtil22.jishujieqiDapan9(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag563= FindUtil22.jieQiDapan7(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag564= FindUtil22.jieQiDapan8(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag565= FindUtil22.jieQiDapan9(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag566= FindUtil22.jieQiDapan10(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag567= FindUtil22.jieQiDapan11(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag568= FindUtil22.jieQiDapan12(stockDayAllList2,scienceEntityListDaPan);
//
//                boolean flag569= FindUtil23.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag570= FindUtil23.shengVDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag571= FindUtil23.reset20Dapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag572= FindUtil23.jieQiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag573= FindUtil23.jishujieqiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag574= FindUtil23.jishujieqiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag575= FindUtil23.jieQiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag576= FindUtil23.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag577= FindUtil23.shengVDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag578= FindUtil23.reset20Dapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag579= FindUtil23.jieQiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag580= FindUtil23.jishujieqiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag581= FindUtil23.jishujieqiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag582= FindUtil23.jishujieqiDapan7(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag583= FindUtil23.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag584= FindUtil23.shengVDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag585= FindUtil23.reset20Dapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag586= FindUtil23.jieQiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag587= FindUtil23.jishujieqiDapan8(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag588= FindUtil23.jishujieqiDapan9(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag589= FindUtil23.jieQiDapan7(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag590= FindUtil23.jieQiDapan8(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag591= FindUtil23.jieQiDapan9(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag592= FindUtil23.jieQiDapan10(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag593= FindUtil23.jieQiDapan11(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag594= FindUtil23.jieQiDapan12(stockDayAllList2,scienceEntityListDaPan);
//
//                boolean flag595= FindUtil24.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag596= FindUtil24.shengVDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag597= FindUtil24.reset20Dapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag598= FindUtil24.jieQiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag599= FindUtil24.jishujieqiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag600= FindUtil24.jishujieqiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag601= FindUtil24.jieQiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag602= FindUtil24.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag603= FindUtil24.shengVDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag604= FindUtil24.reset20Dapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag605= FindUtil24.jieQiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag606= FindUtil24.jishujieqiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag607= FindUtil24.jishujieqiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag610= FindUtil24.jishujieqiDapan7(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag612= FindUtil24.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag613= FindUtil24.shengVDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag614= FindUtil24.reset20Dapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag615= FindUtil24.jieQiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag616= FindUtil24.jishujieqiDapan8(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag617= FindUtil24.jishujieqiDapan9(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag618= FindUtil24.jieQiDapan7(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag619= FindUtil24.jieQiDapan8(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag620= FindUtil24.jieQiDapan9(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag621= FindUtil24.jieQiDapan10(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag622= FindUtil24.jieQiDapan11(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag623= FindUtil24.jieQiDapan12(stockDayAllList2,scienceEntityListDaPan);
//
//                boolean flag624= FindUtil25.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag625= FindUtil25.shengVDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag626= FindUtil25.reset20Dapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag627= FindUtil25.jieQiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag628= FindUtil25.jishujieqiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag629= FindUtil25.jishujieqiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag630= FindUtil25.jieQiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag631= FindUtil25.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag632= FindUtil25.shengVDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag633= FindUtil25.reset20Dapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag634= FindUtil25.jieQiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag635= FindUtil25.jishujieqiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag636= FindUtil25.jishujieqiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag637= FindUtil25.jishujieqiDapan7(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag638= FindUtil25.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag639= FindUtil25.shengVDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag640= FindUtil25.reset20Dapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag641= FindUtil25.jieQiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag642= FindUtil25.jishujieqiDapan8(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag643= FindUtil25.jishujieqiDapan9(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag644= FindUtil25.jieQiDapan7(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag645= FindUtil25.jieQiDapan8(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag646= FindUtil25.jieQiDapan9(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag647= FindUtil25.jieQiDapan10(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag648= FindUtil25.jieQiDapan11(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag649= FindUtil25.jieQiDapan12(stockDayAllList2,scienceEntityListDaPan);
//
//                boolean flag650= FindUtil26.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag651= FindUtil26.shengVDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag652= FindUtil26.reset20Dapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag653= FindUtil26.jieQiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag654= FindUtil26.jishujieqiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag655= FindUtil26.jishujieqiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag656= FindUtil26.jieQiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag657= FindUtil26.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag658= FindUtil26.shengVDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag659= FindUtil26.reset20Dapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag660= FindUtil26.jieQiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag661= FindUtil26.jishujieqiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag662= FindUtil26.jishujieqiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag663= FindUtil26.jishujieqiDapan7(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag664= FindUtil26.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag665= FindUtil26.shengVDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag666= FindUtil26.reset20Dapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag667= FindUtil26.jieQiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag668= FindUtil26.jishujieqiDapan8(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag669= FindUtil26.jishujieqiDapan9(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag670= FindUtil26.jieQiDapan7(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag671= FindUtil26.jieQiDapan8(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag672= FindUtil26.jieQiDapan9(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag673= FindUtil26.jieQiDapan10(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag674= FindUtil26.jieQiDapan11(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag675= FindUtil26.jieQiDapan12(stockDayAllList2,scienceEntityListDaPan);
//
//                boolean flag676= FindUtil27.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag677= FindUtil27.shengVDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag678= FindUtil27.reset20Dapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag679= FindUtil27.jieQiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag680= FindUtil27.jishujieqiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag681= FindUtil27.jishujieqiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag682= FindUtil27.jieQiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag683= FindUtil27.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag684= FindUtil27.shengVDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag685= FindUtil27.reset20Dapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag686= FindUtil27.jieQiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag687= FindUtil27.jishujieqiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag688= FindUtil27.jishujieqiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag689= FindUtil27.jishujieqiDapan7(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag690= FindUtil27.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag691= FindUtil27.shengVDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag692= FindUtil27.reset20Dapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag693= FindUtil27.jieQiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag694= FindUtil27.jishujieqiDapan8(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag695= FindUtil27.jishujieqiDapan9(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag696= FindUtil27.jieQiDapan7(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag697= FindUtil27.jieQiDapan8(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag698= FindUtil27.jieQiDapan9(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag699= FindUtil27.jieQiDapan10(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag700= FindUtil27.jieQiDapan11(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag701= FindUtil27.jieQiDapan12(stockDayAllList2,scienceEntityListDaPan);
//
//                boolean flag702= FindUtil28.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag703= FindUtil28.shengVDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag704= FindUtil28.reset20Dapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag705= FindUtil28.jieQiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag706= FindUtil28.jishujieqiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag707= FindUtil28.jishujieqiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag708= FindUtil28.jieQiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag709= FindUtil28.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag710= FindUtil28.shengVDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag711= FindUtil28.reset20Dapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag712= FindUtil28.jieQiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag713= FindUtil28.jishujieqiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag714= FindUtil28.jishujieqiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag715= FindUtil28.jishujieqiDapan7(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag716= FindUtil28.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag717= FindUtil28.shengVDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag718= FindUtil28.reset20Dapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag719= FindUtil28.jieQiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag720= FindUtil28.jishujieqiDapan8(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag721= FindUtil28.jishujieqiDapan9(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag722= FindUtil28.jieQiDapan7(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag723= FindUtil28.jieQiDapan8(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag724= FindUtil28.jieQiDapan9(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag725= FindUtil28.jieQiDapan10(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag726= FindUtil28.jieQiDapan11(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag727= FindUtil28.jieQiDapan12(stockDayAllList2,scienceEntityListDaPan);
//
//                boolean flag728= FindUtil29.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag729= FindUtil29.shengVDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag730= FindUtil29.reset20Dapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag731= FindUtil29.jieQiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag732= FindUtil29.jishujieqiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag733= FindUtil29.jishujieqiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag734= FindUtil29.jieQiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag735= FindUtil29.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag736= FindUtil29.shengVDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag737= FindUtil29.reset20Dapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag738= FindUtil29.jieQiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag739= FindUtil29.jishujieqiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag740= FindUtil29.jishujieqiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag741= FindUtil29.jishujieqiDapan7(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag742= FindUtil29.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag743= FindUtil29.shengVDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag744= FindUtil29.reset20Dapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag745= FindUtil29.jieQiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag746= FindUtil29.jishujieqiDapan8(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag747= FindUtil29.jishujieqiDapan9(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag748= FindUtil29.jieQiDapan7(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag749= FindUtil29.jieQiDapan8(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag750= FindUtil29.jieQiDapan9(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag751= FindUtil29.jieQiDapan10(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag752= FindUtil29.jieQiDapan11(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag753= FindUtil29.jieQiDapan12(stockDayAllList2,scienceEntityListDaPan);

//                boolean flag1010= FindUtil43.duoTuXiangShangDapan2(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1011= FindUtil43.shengVDapan2(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1012= FindUtil43.reset20Dapan2(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1013= FindUtil43.jieQiDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1014= FindUtil43.jishujieqiDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1015= FindUtil43.jishujieqiDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1016= FindUtil43.jieQiDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1017= FindUtil43.duoTuXiangShangDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1018= FindUtil43.shengVDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1019= FindUtil43.reset20Dapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1020= FindUtil43.jieQiDapan5(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1021= FindUtil43.jishujieqiDapan5(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1022= FindUtil43.jishujieqiDapan6(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1023= FindUtil43.jishujieqiDapan7(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1024= FindUtil43.duoTuXiangShangDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1025= FindUtil43.shengVDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1026= FindUtil43.reset20Dapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1027= FindUtil43.jieQiDapan6(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1028= FindUtil43.jishujieqiDapan8(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1029= FindUtil43.jishujieqiDapan9(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1030= FindUtil43.jieQiDapan7(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1031= FindUtil43.jieQiDapan8(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1032= FindUtil43.jieQiDapan9(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1033= FindUtil43.jieQiDapan10(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1034= FindUtil43.jieQiDapan11(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1035= FindUtil43.jieQiDapan12(scienceEntityList,scienceEntityListDaPan);
//
//                boolean flag1036= FindUtil44.duoTuXiangShangDapan2(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1037= FindUtil44.shengVDapan2(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1040= FindUtil44.jishujieqiDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1041= FindUtil44.jishujieqiDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1042= FindUtil44.jieQiDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1043= FindUtil44.duoTuXiangShangDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1044= FindUtil44.shengVDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1045= FindUtil44.reset20Dapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1046= FindUtil44.jieQiDapan5(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1047= FindUtil44.jishujieqiDapan5(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1048= FindUtil44.jishujieqiDapan6(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1049= FindUtil44.jishujieqiDapan7(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1050= FindUtil44.duoTuXiangShangDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1051= FindUtil44.shengVDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1052= FindUtil44.reset20Dapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1053= FindUtil44.jieQiDapan6(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1054= FindUtil44.jishujieqiDapan8(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1055= FindUtil44.jishujieqiDapan9(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1056= FindUtil44.jieQiDapan7(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1057= FindUtil44.jieQiDapan8(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1058= FindUtil44.jieQiDapan9(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1059= FindUtil44.jieQiDapan10(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1060= FindUtil44.jieQiDapan11(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1061= FindUtil44.jieQiDapan12(scienceEntityList,scienceEntityListDaPan);
//
//                boolean flag1062= FindUtil45.duoTuXiangShangDapan2(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1063= FindUtil45.shengVDapan2(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1064= FindUtil45.reset20Dapan2(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1065= FindUtil45.jieQiDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1066= FindUtil45.jishujieqiDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1067= FindUtil45.jishujieqiDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1068= FindUtil45.jieQiDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1069= FindUtil45.duoTuXiangShangDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1070= FindUtil45.shengVDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1071= FindUtil45.reset20Dapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1072= FindUtil45.jieQiDapan5(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1073= FindUtil45.jishujieqiDapan5(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1074= FindUtil45.jishujieqiDapan6(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1075= FindUtil45.jishujieqiDapan7(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1076= FindUtil45.duoTuXiangShangDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1077= FindUtil45.shengVDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1078= FindUtil45.reset20Dapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1079= FindUtil45.jieQiDapan6(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1080= FindUtil45.jishujieqiDapan8(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1081= FindUtil45.jishujieqiDapan9(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1082= FindUtil45.jieQiDapan7(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1083= FindUtil45.jieQiDapan8(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1084= FindUtil45.jieQiDapan9(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1085= FindUtil45.jieQiDapan10(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1086= FindUtil45.jieQiDapan11(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1087= FindUtil45.jieQiDapan12(scienceEntityList,scienceEntityListDaPan);
//
//                boolean flag1088= FindUtil46.duoTuXiangShangDapan2(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1089= FindUtil46.shengVDapan2(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1090= FindUtil46.reset20Dapan2(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1091= FindUtil46.jieQiDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1092= FindUtil46.jishujieqiDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1093= FindUtil46.jishujieqiDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1094= FindUtil46.jieQiDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1095= FindUtil46.duoTuXiangShangDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1096= FindUtil46.shengVDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1097= FindUtil46.reset20Dapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1098= FindUtil46.jieQiDapan5(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1099= FindUtil46.jishujieqiDapan5(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1100= FindUtil46.jishujieqiDapan6(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1101= FindUtil46.jishujieqiDapan7(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1102= FindUtil46.duoTuXiangShangDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1103= FindUtil46.shengVDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1104= FindUtil46.reset20Dapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1105= FindUtil46.jieQiDapan6(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1106= FindUtil46.jishujieqiDapan8(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1107= FindUtil46.jishujieqiDapan9(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1108= FindUtil46.jieQiDapan7(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1109= FindUtil46.jieQiDapan8(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1110= FindUtil46.jieQiDapan9(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1111= FindUtil46.jieQiDapan10(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1112= FindUtil46.jieQiDapan11(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1113= FindUtil46.jieQiDapan12(scienceEntityList,scienceEntityListDaPan);
//
//                boolean flag1114= FindUtil47.duoTuXiangShangDapan2(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1115= FindUtil47.shengVDapan2(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1116= FindUtil47.reset20Dapan2(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1117= FindUtil47.jieQiDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1118= FindUtil47.jishujieqiDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1119= FindUtil47.jishujieqiDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1120= FindUtil47.jieQiDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1121= FindUtil47.duoTuXiangShangDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1122= FindUtil47.shengVDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1123= FindUtil47.reset20Dapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1124= FindUtil47.jieQiDapan5(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1125= FindUtil47.jishujieqiDapan5(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1126= FindUtil47.jishujieqiDapan6(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1127= FindUtil47.jishujieqiDapan7(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1128= FindUtil47.duoTuXiangShangDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1129= FindUtil47.shengVDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1130= FindUtil47.reset20Dapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1131= FindUtil47.jieQiDapan6(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1132= FindUtil47.jishujieqiDapan8(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1133= FindUtil47.jishujieqiDapan9(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1134= FindUtil47.jieQiDapan7(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1135= FindUtil47.jieQiDapan8(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1136= FindUtil47.jieQiDapan9(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1137= FindUtil47.jieQiDapan10(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1138= FindUtil47.jieQiDapan11(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1139= FindUtil47.jieQiDapan12(scienceEntityList,scienceEntityListDaPan);
//
//                boolean flag1140= FindUtil48.duoTuXiangShangDapan2(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1141= FindUtil48.shengVDapan2(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1142= FindUtil48.reset20Dapan2(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1143= FindUtil48.jieQiDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1144= FindUtil48.jishujieqiDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1145= FindUtil48.jishujieqiDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1146= FindUtil48.jieQiDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1147= FindUtil48.duoTuXiangShangDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1148= FindUtil48.shengVDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1149= FindUtil48.reset20Dapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1150= FindUtil48.jieQiDapan5(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1151= FindUtil48.jishujieqiDapan5(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1152= FindUtil48.jishujieqiDapan6(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1153= FindUtil48.jishujieqiDapan7(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1154= FindUtil48.duoTuXiangShangDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1155= FindUtil48.shengVDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1156= FindUtil48.reset20Dapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1157= FindUtil48.jieQiDapan6(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1158= FindUtil48.jishujieqiDapan8(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1159= FindUtil48.jishujieqiDapan9(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1160= FindUtil48.jieQiDapan7(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1161= FindUtil48.jieQiDapan8(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1162= FindUtil48.jieQiDapan9(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1163= FindUtil48.jieQiDapan10(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1164= FindUtil48.jieQiDapan11(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1165= FindUtil48.jieQiDapan12(scienceEntityList,scienceEntityListDaPan);
//
//                boolean flag1166= FindUtil49.duoTuXiangShangDapan2(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1167= FindUtil49.shengVDapan2(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1168= FindUtil49.reset20Dapan2(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1169= FindUtil49.jieQiDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1170= FindUtil49.jishujieqiDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1171= FindUtil49.jishujieqiDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1172= FindUtil49.jieQiDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1173= FindUtil49.duoTuXiangShangDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1174= FindUtil49.shengVDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1175= FindUtil49.reset20Dapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1176= FindUtil49.jieQiDapan5(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1177= FindUtil49.jishujieqiDapan5(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1178= FindUtil49.jishujieqiDapan6(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1179= FindUtil49.jishujieqiDapan7(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1180= FindUtil49.duoTuXiangShangDapan4(scienceEntityList,scienceEntityListDaPan);
//
//                boolean flag1181= FindUtil50.duoTuXiangShangDapan2(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1182= FindUtil50.shengVDapan2(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1183= FindUtil50.reset20Dapan2(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1184= FindUtil50.jieQiDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1185= FindUtil50.jishujieqiDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1186= FindUtil50.jishujieqiDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1187= FindUtil50.jieQiDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1188= FindUtil50.duoTuXiangShangDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1189= FindUtil50.shengVDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1190= FindUtil50.reset20Dapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1191= FindUtil50.jieQiDapan5(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1192= FindUtil50.jishujieqiDapan5(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1193= FindUtil50.jishujieqiDapan6(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1194= FindUtil50.jishujieqiDapan7(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1195= FindUtil50.duoTuXiangShangDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1196= FindUtil50.shengVDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1197= FindUtil50.reset20Dapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1198= FindUtil50.jieQiDapan6(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1199= FindUtil50.jishujieqiDapan8(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1200= FindUtil50.jishujieqiDapan9(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1201= FindUtil50.jieQiDapan7(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1202= FindUtil50.jieQiDapan8(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1203= FindUtil50.jieQiDapan9(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1204= FindUtil50.jieQiDapan10(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1205= FindUtil50.jieQiDapan11(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1206= FindUtil50.jieQiDapan12(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1207= FindUtil50.jieQiDapan13(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1208= FindUtil50.jieQiDapan14(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1209= FindUtil50.jieQiDapan15(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1210= FindUtil50.jieQiDapan16(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1211= FindUtil50.jieQiDapan17(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1212= FindUtil50.jieQiDapan18(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1213= FindUtil50.jieQiDapan19(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1214= FindUtil50.jieQiDapan20(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1215= FindUtil50.jieQiDapan21(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1216= FindUtil50.jieQiDapan22(scienceEntityList,scienceEntityListDaPan);
//
//                boolean flag1217= FindUtil51.duoTuXiangShangDapan2(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1218= FindUtil51.shengVDapan2(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1219= FindUtil51.reset20Dapan2(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1220= FindUtil51.jieQiDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1221= FindUtil51.jishujieqiDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1222= FindUtil51.jishujieqiDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1223= FindUtil51.jieQiDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1224= FindUtil51.duoTuXiangShangDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1225= FindUtil51.shengVDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1226= FindUtil51.reset20Dapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1227= FindUtil51.jieQiDapan5(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1228= FindUtil51.jishujieqiDapan5(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1229= FindUtil51.jishujieqiDapan6(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1230= FindUtil51.jishujieqiDapan7(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1231= FindUtil51.duoTuXiangShangDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1232= FindUtil51.shengVDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1233= FindUtil51.reset20Dapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1234= FindUtil51.jieQiDapan6(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1235= FindUtil51.jishujieqiDapan8(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1236= FindUtil51.jishujieqiDapan9(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1237= FindUtil51.jieQiDapan7(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1238= FindUtil51.jieQiDapan8(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1239= FindUtil51.jieQiDapan9(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1240= FindUtil51.jieQiDapan10(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1241= FindUtil51.jieQiDapan11(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1242= FindUtil51.jieQiDapan12(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1243= FindUtil51.jieQiDapan13(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1244= FindUtil51.jieQiDapan14(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1245= FindUtil51.jieQiDapan15(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1246= FindUtil51.jieQiDapan16(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1247= FindUtil51.jieQiDapan17(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1248= FindUtil51.jieQiDapan18(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1249= FindUtil51.jieQiDapan19(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1250= FindUtil51.jieQiDapan20(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1251= FindUtil51.jieQiDapan21(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1252= FindUtil51.jieQiDapan22(scienceEntityList,scienceEntityListDaPan);
//
//                boolean flag1253= FindUtil52.duoTuXiangShangDapan2(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1254= FindUtil52.shengVDapan2(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1255= FindUtil52.reset20Dapan2(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1256= FindUtil52.jieQiDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1257= FindUtil52.jishujieqiDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1258= FindUtil52.jishujieqiDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1259= FindUtil52.jieQiDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1260= FindUtil52.duoTuXiangShangDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1261= FindUtil52.shengVDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1262= FindUtil52.reset20Dapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1263= FindUtil52.jieQiDapan5(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1264= FindUtil52.jishujieqiDapan5(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1265= FindUtil52.jishujieqiDapan6(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1266= FindUtil52.jishujieqiDapan7(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1267= FindUtil52.duoTuXiangShangDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1268= FindUtil52.shengVDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1269= FindUtil52.reset20Dapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1270= FindUtil52.jieQiDapan6(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1271= FindUtil52.jishujieqiDapan8(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1272= FindUtil52.jishujieqiDapan9(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1273= FindUtil52.jieQiDapan7(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1274= FindUtil52.jieQiDapan8(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1275= FindUtil52.jieQiDapan9(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1276= FindUtil52.jieQiDapan10(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1277= FindUtil52.jieQiDapan11(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1278= FindUtil52.jieQiDapan12(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1279= FindUtil52.jieQiDapan13(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1280= FindUtil52.jieQiDapan14(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1281= FindUtil52.jieQiDapan15(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1282= FindUtil52.jieQiDapan16(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1283= FindUtil52.jieQiDapan17(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1284= FindUtil52.jieQiDapan18(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1285= FindUtil52.jieQiDapan19(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1286= FindUtil52.jieQiDapan20(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1287= FindUtil52.jieQiDapan21(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1288= FindUtil52.jieQiDapan22(scienceEntityList,scienceEntityListDaPan);
//
//                boolean flag1289= FindUtil53.duoTuXiangShangDapan2(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1290= FindUtil53.shengVDapan2(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1291= FindUtil53.reset20Dapan2(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1292= FindUtil53.jieQiDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1293= FindUtil53.jishujieqiDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1294= FindUtil53.jishujieqiDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1295= FindUtil53.jieQiDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1296= FindUtil53.duoTuXiangShangDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1297= FindUtil53.shengVDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1298= FindUtil53.reset20Dapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1299= FindUtil53.jieQiDapan5(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1300= FindUtil53.jishujieqiDapan5(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1301= FindUtil53.jishujieqiDapan6(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1302= FindUtil53.jishujieqiDapan7(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1303= FindUtil53.duoTuXiangShangDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1304= FindUtil53.shengVDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1305= FindUtil53.reset20Dapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1306= FindUtil53.jieQiDapan6(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1307= FindUtil53.jishujieqiDapan8(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1308= FindUtil53.jishujieqiDapan9(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1309= FindUtil53.jieQiDapan7(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1310= FindUtil53.jieQiDapan8(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1311= FindUtil53.jieQiDapan9(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1312= FindUtil53.jieQiDapan10(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1313= FindUtil53.jieQiDapan11(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1314= FindUtil53.jieQiDapan12(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1315= FindUtil53.jieQiDapan13(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1316= FindUtil53.jieQiDapan14(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1317= FindUtil53.jieQiDapan15(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1318= FindUtil53.jieQiDapan16(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1319= FindUtil53.jieQiDapan17(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1320= FindUtil53.jieQiDapan18(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1321= FindUtil53.jieQiDapan19(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1322= FindUtil53.jieQiDapan20(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1323= FindUtil53.jieQiDapan21(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1324= FindUtil53.jieQiDapan22(scienceEntityList,scienceEntityListDaPan);
//
//                boolean flag1325= FindUtil54.duoTuXiangShangDapan2(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1326= FindUtil54.shengVDapan2(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1327= FindUtil54.reset20Dapan2(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1328= FindUtil54.jieQiDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1329= FindUtil54.jishujieqiDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1330= FindUtil54.jishujieqiDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1331= FindUtil54.jieQiDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1332= FindUtil54.duoTuXiangShangDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1333= FindUtil54.shengVDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1334= FindUtil54.reset20Dapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1335= FindUtil54.jieQiDapan5(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1336= FindUtil54.jishujieqiDapan5(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1337= FindUtil54.jishujieqiDapan6(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1338= FindUtil54.jishujieqiDapan7(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1339= FindUtil54.duoTuXiangShangDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1340= FindUtil54.shengVDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1341= FindUtil54.reset20Dapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1342= FindUtil54.jieQiDapan6(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1343= FindUtil54.jishujieqiDapan8(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1344= FindUtil54.jishujieqiDapan9(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1345= FindUtil54.jieQiDapan7(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1346= FindUtil54.jieQiDapan8(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1347= FindUtil54.jieQiDapan9(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1348= FindUtil54.jieQiDapan10(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1349= FindUtil54.jieQiDapan11(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1350= FindUtil54.jieQiDapan12(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1351= FindUtil54.jieQiDapan13(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1352= FindUtil54.jieQiDapan14(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1353= FindUtil54.jieQiDapan15(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1354= FindUtil54.jieQiDapan16(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1355= FindUtil54.jieQiDapan17(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1356= FindUtil54.jieQiDapan18(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1357= FindUtil54.jieQiDapan19(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1358= FindUtil54.jieQiDapan20(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1359= FindUtil54.jieQiDapan21(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1360= FindUtil54.jieQiDapan22(scienceEntityList,scienceEntityListDaPan);
//
//                boolean flag1361= FindUtil55.duoTuXiangShangDapan2(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1362= FindUtil55.shengVDapan2(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1363= FindUtil55.reset20Dapan2(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1364= FindUtil55.jieQiDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1365= FindUtil55.jishujieqiDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1366= FindUtil55.jishujieqiDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1367= FindUtil55.jieQiDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1368= FindUtil55.duoTuXiangShangDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1369= FindUtil55.shengVDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1370= FindUtil55.reset20Dapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1371= FindUtil55.jieQiDapan5(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1372= FindUtil55.jishujieqiDapan5(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1373= FindUtil55.jishujieqiDapan6(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1374= FindUtil55.jishujieqiDapan7(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1375= FindUtil55.duoTuXiangShangDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1376= FindUtil55.shengVDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1377= FindUtil55.reset20Dapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1378= FindUtil55.jieQiDapan6(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1379= FindUtil55.jishujieqiDapan8(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1380= FindUtil55.jishujieqiDapan9(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1381= FindUtil55.jieQiDapan7(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1382= FindUtil55.jieQiDapan8(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1383= FindUtil55.jieQiDapan9(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1384= FindUtil55.jieQiDapan10(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1385= FindUtil55.jieQiDapan11(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1386= FindUtil55.jieQiDapan12(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1387= FindUtil55.jieQiDapan13(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1388= FindUtil55.jieQiDapan14(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1389= FindUtil55.jieQiDapan15(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1390= FindUtil55.jieQiDapan16(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1391= FindUtil55.jieQiDapan17(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1392= FindUtil55.jieQiDapan18(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1393= FindUtil55.jieQiDapan19(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1394= FindUtil55.jieQiDapan20(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1395= FindUtil55.jieQiDapan21(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1396= FindUtil55.jieQiDapan22(scienceEntityList,scienceEntityListDaPan);
//
//                boolean flag1397= FindUtil56.duoTuXiangShangDapan2(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1398= FindUtil56.shengVDapan2(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1399= FindUtil56.reset20Dapan2(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1400= FindUtil56.jieQiDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1401= FindUtil56.jishujieqiDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1402= FindUtil56.jishujieqiDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1403= FindUtil56.jieQiDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1404= FindUtil56.duoTuXiangShangDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1405= FindUtil56.shengVDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1406= FindUtil56.reset20Dapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1407= FindUtil56.jieQiDapan5(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1408= FindUtil56.jishujieqiDapan5(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1409= FindUtil56.jishujieqiDapan6(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1410= FindUtil56.jishujieqiDapan7(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1411= FindUtil56.duoTuXiangShangDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1412= FindUtil56.shengVDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1413= FindUtil56.reset20Dapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1414= FindUtil56.jieQiDapan6(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1415= FindUtil56.jishujieqiDapan8(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1416= FindUtil56.jishujieqiDapan9(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1417= FindUtil56.jieQiDapan7(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1418= FindUtil56.jieQiDapan8(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1419= FindUtil56.jieQiDapan9(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1420= FindUtil56.jieQiDapan10(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1421= FindUtil56.jieQiDapan11(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1422= FindUtil56.jieQiDapan12(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1423= FindUtil56.jieQiDapan13(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1424= FindUtil56.jieQiDapan14(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1425= FindUtil56.jieQiDapan15(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1426= FindUtil56.jieQiDapan16(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1427= FindUtil56.jieQiDapan17(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1428= FindUtil56.jieQiDapan18(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1429= FindUtil56.jieQiDapan19(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1430= FindUtil56.jieQiDapan20(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1431= FindUtil56.jieQiDapan21(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1432= FindUtil56.jieQiDapan22(scienceEntityList,scienceEntityListDaPan);
//
//                boolean flag1433= FindUtil57.duoTuXiangShangDapan2(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1434= FindUtil57.shengVDapan2(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1435= FindUtil57.reset20Dapan2(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1436= FindUtil57.jieQiDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1437= FindUtil57.jishujieqiDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1438= FindUtil57.jishujieqiDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1439= FindUtil57.jieQiDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1440= FindUtil57.duoTuXiangShangDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1441= FindUtil57.shengVDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1442= FindUtil57.reset20Dapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1443= FindUtil57.jieQiDapan5(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1444= FindUtil57.jishujieqiDapan5(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1445= FindUtil57.jishujieqiDapan6(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1446= FindUtil57.jishujieqiDapan7(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1447= FindUtil57.duoTuXiangShangDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1448= FindUtil57.shengVDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1449= FindUtil57.reset20Dapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1450= FindUtil57.jieQiDapan6(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1451= FindUtil57.jishujieqiDapan8(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1452= FindUtil57.jishujieqiDapan9(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1453= FindUtil57.jieQiDapan7(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1454= FindUtil57.jieQiDapan8(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1455= FindUtil57.jieQiDapan9(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1456= FindUtil57.jieQiDapan10(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1457= FindUtil57.jieQiDapan11(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1458= FindUtil57.jieQiDapan12(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1459= FindUtil57.jieQiDapan13(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1460= FindUtil57.jieQiDapan14(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1461= FindUtil57.jieQiDapan15(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1462= FindUtil57.jieQiDapan16(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1463= FindUtil57.jieQiDapan17(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1464= FindUtil57.jieQiDapan18(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1465= FindUtil57.jieQiDapan19(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1466= FindUtil57.jieQiDapan20(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1467= FindUtil57.jieQiDapan21(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1468= FindUtil57.jieQiDapan22(scienceEntityList,scienceEntityListDaPan);
//
//                boolean flag1469= FindUtil58.duoTuXiangShangDapan2(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1470= FindUtil58.shengVDapan2(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1471= FindUtil58.reset20Dapan2(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1472= FindUtil58.jieQiDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1473= FindUtil58.jishujieqiDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1474= FindUtil58.jishujieqiDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1475= FindUtil58.jieQiDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1476= FindUtil58.duoTuXiangShangDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1477= FindUtil58.shengVDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1478= FindUtil58.reset20Dapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1479= FindUtil58.jieQiDapan5(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1480= FindUtil58.jishujieqiDapan5(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1482= FindUtil58.jishujieqiDapan6(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1483= FindUtil58.jishujieqiDapan7(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1484= FindUtil58.duoTuXiangShangDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1485= FindUtil58.shengVDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1486= FindUtil58.reset20Dapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1487= FindUtil58.jieQiDapan6(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1488= FindUtil58.jishujieqiDapan8(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1489= FindUtil58.jishujieqiDapan9(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1490= FindUtil58.jieQiDapan7(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1491= FindUtil58.jieQiDapan8(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1492= FindUtil58.jieQiDapan9(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1493= FindUtil58.jieQiDapan10(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1494= FindUtil58.jieQiDapan11(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1495= FindUtil58.jieQiDapan12(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1496= FindUtil58.jieQiDapan13(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1497= FindUtil58.jieQiDapan14(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1498= FindUtil58.jieQiDapan15(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1499= FindUtil58.jieQiDapan16(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1500= FindUtil58.jieQiDapan17(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1501= FindUtil58.jieQiDapan18(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1502= FindUtil58.jieQiDapan19(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1503= FindUtil58.jieQiDapan20(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1504= FindUtil58.jieQiDapan21(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1505= FindUtil58.jieQiDapan22(scienceEntityList,scienceEntityListDaPan);
//
//                boolean flag1506= FindUtil59.duoTuXiangShangDapan2(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1507= FindUtil59.shengVDapan2(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1508= FindUtil59.reset20Dapan2(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1509= FindUtil59.jieQiDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1510= FindUtil59.jishujieqiDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1511= FindUtil59.jishujieqiDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1512= FindUtil59.jieQiDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1513= FindUtil59.duoTuXiangShangDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1514= FindUtil59.shengVDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1515= FindUtil59.reset20Dapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1516= FindUtil59.jieQiDapan5(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1517= FindUtil59.jishujieqiDapan5(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1518= FindUtil59.jishujieqiDapan6(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1519= FindUtil59.jishujieqiDapan7(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1520= FindUtil59.duoTuXiangShangDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1521= FindUtil59.shengVDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1522= FindUtil59.reset20Dapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1523= FindUtil59.jieQiDapan6(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1524= FindUtil59.jishujieqiDapan8(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1525= FindUtil59.jishujieqiDapan9(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1526= FindUtil59.jieQiDapan7(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1527= FindUtil59.jieQiDapan8(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1528= FindUtil59.jieQiDapan9(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1529= FindUtil59.jieQiDapan10(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1530= FindUtil59.jieQiDapan11(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1531= FindUtil59.jieQiDapan12(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1532= FindUtil59.jieQiDapan13(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1533= FindUtil59.jieQiDapan14(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1534= FindUtil59.jieQiDapan15(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1535= FindUtil59.jieQiDapan16(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1536= FindUtil59.jieQiDapan17(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1537= FindUtil59.jieQiDapan18(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1538= FindUtil59.jieQiDapan19(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1539= FindUtil59.jieQiDapan20(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1540= FindUtil59.jieQiDapan21(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1541= FindUtil59.jieQiDapan22(scienceEntityList,scienceEntityListDaPan);
//
//                boolean flag1542= FindUtil60.duoTuXiangShangDapan2(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1543= FindUtil60.shengVDapan2(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1544= FindUtil60.reset20Dapan2(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1545= FindUtil60.jieQiDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1546= FindUtil60.jishujieqiDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1547= FindUtil60.jishujieqiDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1548= FindUtil60.jieQiDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1549= FindUtil60.duoTuXiangShangDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1560= FindUtil60.shengVDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1561= FindUtil60.reset20Dapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1562= FindUtil60.jieQiDapan5(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1563= FindUtil60.jishujieqiDapan5(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1564= FindUtil60.jishujieqiDapan6(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1565= FindUtil60.jishujieqiDapan7(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1566= FindUtil60.duoTuXiangShangDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1567= FindUtil60.shengVDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1568= FindUtil60.reset20Dapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1569= FindUtil60.jieQiDapan6(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1570= FindUtil60.jishujieqiDapan8(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1571= FindUtil60.jishujieqiDapan9(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1572= FindUtil60.jieQiDapan7(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1573= FindUtil60.jieQiDapan8(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1574= FindUtil60.jieQiDapan9(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1575= FindUtil60.jieQiDapan10(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1576= FindUtil60.jieQiDapan11(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1577= FindUtil60.jieQiDapan12(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1578= FindUtil60.jieQiDapan13(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1579= FindUtil60.jieQiDapan14(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1580= FindUtil60.jieQiDapan15(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1581= FindUtil60.jieQiDapan16(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1582= FindUtil60.jieQiDapan17(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1583= FindUtil60.jieQiDapan18(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1584= FindUtil60.jieQiDapan19(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1585= FindUtil60.jieQiDapan20(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1586= FindUtil60.jieQiDapan21(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1587= FindUtil60.jieQiDapan22(scienceEntityList,scienceEntityListDaPan);
//
//                boolean flag1588= FindUtil61.duoTuXiangShangDapan2(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1589= FindUtil61.shengVDapan2(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1590= FindUtil61.reset20Dapan2(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1591= FindUtil61.jieQiDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1592= FindUtil61.jishujieqiDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1593= FindUtil61.jishujieqiDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1594= FindUtil61.jieQiDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1595= FindUtil61.duoTuXiangShangDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1596= FindUtil61.shengVDapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1597= FindUtil61.reset20Dapan3(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1598= FindUtil61.jieQiDapan5(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1599= FindUtil61.jishujieqiDapan5(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1600= FindUtil61.jishujieqiDapan6(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1601= FindUtil61.jishujieqiDapan7(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1602= FindUtil61.duoTuXiangShangDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1603= FindUtil61.shengVDapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1604= FindUtil61.reset20Dapan4(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1605= FindUtil61.jieQiDapan6(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1606= FindUtil61.jishujieqiDapan8(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1607= FindUtil61.jishujieqiDapan9(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1608= FindUtil61.jieQiDapan7(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1609= FindUtil61.jieQiDapan8(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1610= FindUtil61.jieQiDapan9(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1611= FindUtil61.jieQiDapan10(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1612= FindUtil61.jieQiDapan11(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1613= FindUtil61.jieQiDapan12(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1614= FindUtil61.jieQiDapan13(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1615= FindUtil61.jieQiDapan14(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1616= FindUtil61.jieQiDapan15(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1617= FindUtil61.jieQiDapan16(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1618= FindUtil61.jieQiDapan17(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1619= FindUtil61.jieQiDapan18(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1620= FindUtil61.jieQiDapan19(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1621= FindUtil61.jieQiDapan20(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1622= FindUtil61.jieQiDapan21(scienceEntityList,scienceEntityListDaPan);
//                boolean flag1623= FindUtil61.jieQiDapan22(scienceEntityList,scienceEntityListDaPan);


//                boolean flag1681= FindUtil62.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1682= FindUtil62.shengVDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1683= FindUtil62.reset20Dapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1684= FindUtil62.jieQiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1685= FindUtil62.jishujieqiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1686= FindUtil62.jishujieqiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1687= FindUtil62.jieQiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1688= FindUtil62.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1689= FindUtil62.shengVDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1690= FindUtil62.reset20Dapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1691= FindUtil62.jieQiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1692= FindUtil62.jishujieqiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1693= FindUtil62.jishujieqiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1694= FindUtil62.jishujieqiDapan7(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1695= FindUtil62.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1696= FindUtil62.shengVDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1697= FindUtil62.reset20Dapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1698= FindUtil62.jieQiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1699= FindUtil62.jishujieqiDapan8(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1700= FindUtil62.jishujieqiDapan9(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1701= FindUtil62.jieQiDapan7(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1702= FindUtil62.jieQiDapan8(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1703= FindUtil62.jieQiDapan9(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1704= FindUtil62.jieQiDapan10(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1705= FindUtil62.jieQiDapan11(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1706= FindUtil62.jieQiDapan12(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1707= FindUtil62.jieQiDapan13(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1708= FindUtil62.jieQiDapan14(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1709= FindUtil62.jieQiDapan15(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1710= FindUtil62.jieQiDapan16(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1711= FindUtil62.jieQiDapan17(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1712= FindUtil62.jieQiDapan18(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1713= FindUtil62.jieQiDapan19(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1714= FindUtil62.jieQiDapan20(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1715= FindUtil62.jieQiDapan21(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1716= FindUtil62.jieQiDapan22(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//
//                boolean flag1717= FindUtil63.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1718= FindUtil63.shengVDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1719= FindUtil63.reset20Dapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1720= FindUtil63.jieQiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1721= FindUtil63.jishujieqiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1722= FindUtil63.jishujieqiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1723= FindUtil63.jieQiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1724= FindUtil63.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1725= FindUtil63.shengVDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1726= FindUtil63.reset20Dapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1727= FindUtil63.jieQiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1728= FindUtil63.jishujieqiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1729= FindUtil63.jishujieqiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1730= FindUtil63.jishujieqiDapan7(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1731= FindUtil63.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1732= FindUtil63.shengVDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1733= FindUtil63.reset20Dapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1734= FindUtil63.jieQiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1735= FindUtil63.jishujieqiDapan8(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1736= FindUtil63.jishujieqiDapan9(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1737= FindUtil63.jieQiDapan7(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1738= FindUtil63.jieQiDapan8(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1739= FindUtil63.jieQiDapan9(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1740= FindUtil63.jieQiDapan10(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1741= FindUtil63.jieQiDapan11(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1742= FindUtil63.jieQiDapan12(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1743= FindUtil63.jieQiDapan13(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1744= FindUtil63.jieQiDapan14(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1745= FindUtil63.jieQiDapan15(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1746= FindUtil63.jieQiDapan16(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1747= FindUtil63.jieQiDapan17(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1748= FindUtil63.jieQiDapan18(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1749= FindUtil63.jieQiDapan19(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1750= FindUtil63.jieQiDapan20(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1751= FindUtil63.jieQiDapan21(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1752= FindUtil63.jieQiDapan22(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//
//                boolean flag1753= FindUtil64.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1754= FindUtil64.shengVDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1755= FindUtil64.reset20Dapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1756= FindUtil64.jieQiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1757= FindUtil64.jishujieqiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1758= FindUtil64.jishujieqiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1759= FindUtil64.jieQiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1760= FindUtil64.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1761= FindUtil64.shengVDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1762= FindUtil64.reset20Dapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1763= FindUtil64.jieQiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1764= FindUtil64.jishujieqiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1765= FindUtil64.jishujieqiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1766= FindUtil64.jishujieqiDapan7(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1767= FindUtil64.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1768= FindUtil64.shengVDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1769= FindUtil64.reset20Dapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1770= FindUtil64.jieQiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1771= FindUtil64.jishujieqiDapan8(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1772= FindUtil64.jishujieqiDapan9(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1773= FindUtil64.jieQiDapan7(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1774= FindUtil64.jieQiDapan8(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1775= FindUtil64.jieQiDapan9(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1776= FindUtil64.jieQiDapan10(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1777= FindUtil64.jieQiDapan11(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1778= FindUtil64.jieQiDapan12(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1779= FindUtil64.jieQiDapan13(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1780= FindUtil64.jieQiDapan14(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1781= FindUtil64.jieQiDapan15(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1782= FindUtil64.jieQiDapan16(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1783= FindUtil64.jieQiDapan17(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1784= FindUtil64.jieQiDapan18(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1785= FindUtil64.jieQiDapan19(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1786= FindUtil64.jieQiDapan20(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1787= FindUtil64.jieQiDapan21(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1788= FindUtil64.jieQiDapan22(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//
//                boolean flag1789= FindUtil65.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1790= FindUtil65.shengVDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1791= FindUtil65.reset20Dapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1792= FindUtil65.jieQiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1793= FindUtil65.jishujieqiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1794= FindUtil65.jishujieqiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1795= FindUtil65.jieQiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1796= FindUtil65.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1797= FindUtil65.shengVDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1798= FindUtil65.reset20Dapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1799= FindUtil65.jieQiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1800= FindUtil65.jishujieqiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1801= FindUtil65.jishujieqiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1802= FindUtil65.jishujieqiDapan7(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1803= FindUtil65.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1804= FindUtil65.shengVDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1805= FindUtil65.reset20Dapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1806= FindUtil65.jieQiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1807= FindUtil65.jishujieqiDapan8(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1808= FindUtil65.jishujieqiDapan9(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1809= FindUtil65.jieQiDapan7(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1810= FindUtil65.jieQiDapan8(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1811= FindUtil65.jieQiDapan9(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1812= FindUtil65.jieQiDapan10(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1813= FindUtil65.jieQiDapan11(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1814= FindUtil65.jieQiDapan12(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1815= FindUtil65.jieQiDapan13(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1816= FindUtil65.jieQiDapan14(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1817= FindUtil65.jieQiDapan15(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1818= FindUtil65.jieQiDapan16(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1819= FindUtil65.jieQiDapan17(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1820= FindUtil65.jieQiDapan18(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1821= FindUtil65.jieQiDapan19(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1822= FindUtil65.jieQiDapan20(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1823= FindUtil65.jieQiDapan21(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1824= FindUtil65.jieQiDapan22(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//
//                boolean flag1825= FindUtil66.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1826= FindUtil66.shengVDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1827= FindUtil66.reset20Dapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1828= FindUtil66.jieQiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1829= FindUtil66.jishujieqiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1830= FindUtil66.jishujieqiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1831= FindUtil66.jieQiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1832= FindUtil66.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1833= FindUtil66.shengVDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1834= FindUtil66.reset20Dapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1835= FindUtil66.jieQiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1836= FindUtil66.jishujieqiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1837= FindUtil66.jishujieqiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1838= FindUtil66.jishujieqiDapan7(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1839= FindUtil66.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1840= FindUtil66.shengVDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1841= FindUtil66.reset20Dapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1842= FindUtil66.jieQiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1843= FindUtil66.jishujieqiDapan8(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1844= FindUtil66.jishujieqiDapan9(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1845= FindUtil66.jieQiDapan7(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1846= FindUtil66.jieQiDapan8(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1847= FindUtil66.jieQiDapan9(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1848= FindUtil66.jieQiDapan10(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1849= FindUtil66.jieQiDapan11(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1850= FindUtil66.jieQiDapan12(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1851= FindUtil66.jieQiDapan13(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1852= FindUtil66.jieQiDapan14(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1853= FindUtil66.jieQiDapan15(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1854= FindUtil66.jieQiDapan16(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1855= FindUtil66.jieQiDapan17(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1856= FindUtil66.jieQiDapan18(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1857= FindUtil66.jieQiDapan19(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1858= FindUtil66.jieQiDapan20(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1859= FindUtil66.jieQiDapan21(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1860= FindUtil66.jieQiDapan22(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//
//                boolean flag1861= FindUtil67.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1862= FindUtil67.shengVDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1863= FindUtil67.reset20Dapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1864= FindUtil67.jieQiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1865= FindUtil67.jishujieqiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1866= FindUtil67.jishujieqiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1867= FindUtil67.jieQiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1868= FindUtil67.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1869= FindUtil67.shengVDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1870= FindUtil67.reset20Dapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1871= FindUtil67.jieQiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1872= FindUtil67.jishujieqiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1873= FindUtil67.jishujieqiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1874= FindUtil67.jishujieqiDapan7(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1875= FindUtil67.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1876= FindUtil67.shengVDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1877= FindUtil67.reset20Dapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1878= FindUtil67.jieQiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1879= FindUtil67.jishujieqiDapan8(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1880= FindUtil67.jishujieqiDapan9(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1881= FindUtil67.jieQiDapan7(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1882= FindUtil67.jieQiDapan8(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1883= FindUtil67.jieQiDapan9(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1884= FindUtil67.jieQiDapan10(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1885= FindUtil67.jieQiDapan11(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1886= FindUtil67.jieQiDapan12(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1887= FindUtil67.jieQiDapan13(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1888= FindUtil67.jieQiDapan14(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1889= FindUtil67.jieQiDapan15(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1890= FindUtil67.jieQiDapan16(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1891= FindUtil67.jieQiDapan17(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1892= FindUtil67.jieQiDapan18(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1893= FindUtil67.jieQiDapan19(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1894= FindUtil67.jieQiDapan20(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1895= FindUtil67.jieQiDapan21(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1896= FindUtil67.jieQiDapan22(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//
//                boolean flag1897= FindUtil68.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1898= FindUtil68.shengVDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1899= FindUtil68.reset20Dapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1900= FindUtil68.jieQiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1901= FindUtil68.jishujieqiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1902= FindUtil68.jishujieqiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1903= FindUtil68.jieQiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1904= FindUtil68.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1905= FindUtil68.shengVDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1906= FindUtil68.reset20Dapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1907= FindUtil68.jieQiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1908= FindUtil68.jishujieqiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1909= FindUtil68.jishujieqiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1910= FindUtil68.jishujieqiDapan7(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1911= FindUtil68.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1912= FindUtil68.shengVDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1913= FindUtil68.reset20Dapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1914= FindUtil68.jieQiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1915= FindUtil68.jishujieqiDapan8(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1916= FindUtil68.jishujieqiDapan9(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1917= FindUtil68.jieQiDapan7(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1918= FindUtil68.jieQiDapan8(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1919= FindUtil68.jieQiDapan9(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1920= FindUtil68.jieQiDapan10(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1921= FindUtil68.jieQiDapan11(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1922= FindUtil68.jieQiDapan12(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1923= FindUtil68.jieQiDapan13(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1924= FindUtil68.jieQiDapan14(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1925= FindUtil68.jieQiDapan15(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1926= FindUtil68.jieQiDapan16(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1927= FindUtil68.jieQiDapan17(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1928= FindUtil68.jieQiDapan18(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1929= FindUtil68.jieQiDapan19(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1930= FindUtil68.jieQiDapan20(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1931= FindUtil68.jieQiDapan21(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1932= FindUtil68.jieQiDapan22(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//
//                boolean flag1933= FindUtil69.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1934= FindUtil69.shengVDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1935= FindUtil69.reset20Dapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1936= FindUtil69.jieQiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1937= FindUtil69.jishujieqiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1938= FindUtil69.jishujieqiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1939= FindUtil69.jieQiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1940= FindUtil69.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1941= FindUtil69.shengVDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1942= FindUtil69.reset20Dapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1943= FindUtil69.jieQiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1944= FindUtil69.jishujieqiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1945= FindUtil69.jishujieqiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1946= FindUtil69.jishujieqiDapan7(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1947= FindUtil69.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1948= FindUtil69.shengVDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1949= FindUtil69.reset20Dapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1950= FindUtil69.jieQiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1951= FindUtil69.jishujieqiDapan8(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1952= FindUtil69.jishujieqiDapan9(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1953= FindUtil69.jieQiDapan7(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1954= FindUtil69.jieQiDapan8(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1955= FindUtil69.jieQiDapan9(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1956= FindUtil69.jieQiDapan10(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1957= FindUtil69.jieQiDapan11(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1958= FindUtil69.jieQiDapan12(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1959= FindUtil69.jieQiDapan13(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1960= FindUtil69.jieQiDapan14(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1961= FindUtil69.jieQiDapan15(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1962= FindUtil69.jieQiDapan16(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1963= FindUtil69.jieQiDapan17(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1964= FindUtil69.jieQiDapan18(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1965= FindUtil69.jieQiDapan19(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1966= FindUtil69.jieQiDapan20(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1967= FindUtil69.jieQiDapan21(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1968= FindUtil69.jieQiDapan22(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//
//                boolean flag1969= FindUtil70.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1970= FindUtil70.shengVDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1971= FindUtil70.reset20Dapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1972= FindUtil70.jieQiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1973= FindUtil70.jishujieqiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1974= FindUtil70.jishujieqiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1975= FindUtil70.jieQiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1976= FindUtil70.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1977= FindUtil70.shengVDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1978= FindUtil70.reset20Dapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1979= FindUtil70.jieQiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1980= FindUtil70.jishujieqiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1982= FindUtil70.jishujieqiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1983= FindUtil70.jishujieqiDapan7(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1984= FindUtil70.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1985= FindUtil70.shengVDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1986= FindUtil70.reset20Dapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1987= FindUtil70.jieQiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1988= FindUtil70.jishujieqiDapan8(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1989= FindUtil70.jishujieqiDapan9(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1990= FindUtil70.jieQiDapan7(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1991= FindUtil70.jieQiDapan8(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1992= FindUtil70.jieQiDapan9(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1993= FindUtil70.jieQiDapan10(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1994= FindUtil70.jieQiDapan11(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1995= FindUtil70.jieQiDapan12(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1996= FindUtil70.jieQiDapan13(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1997= FindUtil70.jieQiDapan14(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1998= FindUtil70.jieQiDapan15(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag1999= FindUtil70.jieQiDapan16(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2000= FindUtil70.jieQiDapan17(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2001= FindUtil70.jieQiDapan18(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2002= FindUtil70.jieQiDapan19(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2003= FindUtil70.jieQiDapan20(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2004= FindUtil70.jieQiDapan21(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2005= FindUtil70.jieQiDapan22(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//
//                boolean flag2006= FindUtil71.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2007= FindUtil71.shengVDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2008= FindUtil71.reset20Dapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2009= FindUtil71.jieQiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2010= FindUtil71.jishujieqiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2011= FindUtil71.jishujieqiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2012= FindUtil71.jieQiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2013= FindUtil71.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2014= FindUtil71.shengVDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2015= FindUtil71.reset20Dapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2016= FindUtil71.jieQiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2017= FindUtil71.jishujieqiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2018= FindUtil71.jishujieqiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2019= FindUtil71.jishujieqiDapan7(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2020= FindUtil71.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2021= FindUtil71.shengVDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2022= FindUtil71.reset20Dapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2023= FindUtil71.jieQiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2024= FindUtil71.jishujieqiDapan8(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2025= FindUtil71.jishujieqiDapan9(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2026= FindUtil71.jieQiDapan7(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2027= FindUtil71.jieQiDapan8(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2028= FindUtil71.jieQiDapan9(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2029= FindUtil71.jieQiDapan10(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2030= FindUtil71.jieQiDapan11(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2031= FindUtil71.jieQiDapan12(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2032= FindUtil71.jieQiDapan13(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2033= FindUtil71.jieQiDapan14(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2034= FindUtil71.jieQiDapan15(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2035= FindUtil71.jieQiDapan16(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2036= FindUtil71.jieQiDapan17(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2037= FindUtil71.jieQiDapan18(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2038= FindUtil71.jieQiDapan19(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2039= FindUtil71.jieQiDapan20(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2040= FindUtil71.jieQiDapan21(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2041= FindUtil71.jieQiDapan22(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//
//                boolean flag2042= FindUtil72.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2043= FindUtil72.shengVDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2044= FindUtil72.reset20Dapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2045= FindUtil72.jieQiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2046= FindUtil72.jishujieqiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2047= FindUtil72.jishujieqiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2048= FindUtil72.jieQiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2049= FindUtil72.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2060= FindUtil72.shengVDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2061= FindUtil72.reset20Dapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2062= FindUtil72.jieQiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2063= FindUtil72.jishujieqiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2064= FindUtil72.jishujieqiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2065= FindUtil72.jishujieqiDapan7(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2066= FindUtil72.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2067= FindUtil72.shengVDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2068= FindUtil72.reset20Dapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2069= FindUtil72.jieQiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2070= FindUtil72.jishujieqiDapan8(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2071= FindUtil72.jishujieqiDapan9(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2072= FindUtil72.jieQiDapan7(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2073= FindUtil72.jieQiDapan8(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2074= FindUtil72.jieQiDapan9(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2075= FindUtil72.jieQiDapan10(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2076= FindUtil72.jieQiDapan11(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2077= FindUtil72.jieQiDapan12(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2078= FindUtil72.jieQiDapan13(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2079= FindUtil72.jieQiDapan14(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2080= FindUtil72.jieQiDapan15(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2081= FindUtil72.jieQiDapan16(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2082= FindUtil72.jieQiDapan17(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2083= FindUtil72.jieQiDapan18(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2084= FindUtil72.jieQiDapan19(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2085= FindUtil72.jieQiDapan20(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2086= FindUtil72.jieQiDapan21(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2087= FindUtil72.jieQiDapan22(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//
//                boolean flag2088= FindUtil73.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2089= FindUtil73.shengVDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2090= FindUtil73.reset20Dapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2091= FindUtil73.jieQiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2092= FindUtil73.jishujieqiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2093= FindUtil73.jishujieqiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2094= FindUtil73.jieQiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2095= FindUtil73.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2096= FindUtil73.shengVDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2097= FindUtil73.reset20Dapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2098= FindUtil73.jieQiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2099= FindUtil73.jishujieqiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2100= FindUtil73.jishujieqiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2101= FindUtil73.jishujieqiDapan7(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2102= FindUtil73.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2103= FindUtil73.shengVDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2104= FindUtil73.reset20Dapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2105= FindUtil73.jieQiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2106= FindUtil73.jishujieqiDapan8(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2107= FindUtil73.jishujieqiDapan9(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2108= FindUtil73.jieQiDapan7(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2109= FindUtil73.jieQiDapan8(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2110= FindUtil73.jieQiDapan9(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2111= FindUtil73.jieQiDapan10(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2112= FindUtil73.jieQiDapan11(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2113= FindUtil73.jieQiDapan12(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2114= FindUtil73.jieQiDapan13(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2115= FindUtil73.jieQiDapan14(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2116= FindUtil73.jieQiDapan15(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2117= FindUtil73.jieQiDapan16(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2118= FindUtil73.jieQiDapan17(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2119= FindUtil73.jieQiDapan18(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2120= FindUtil73.jieQiDapan19(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2121= FindUtil73.jieQiDapan20(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2122= FindUtil73.jieQiDapan21(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2123= FindUtil73.jieQiDapan22(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);

                boolean flag2124= FindUtil74.duoTuXiangShangDapan2(scienceEntityListDaPan);
                boolean flag2125= FindUtil74.shengVDapan2(scienceEntityListDaPan);
                boolean flag2126= FindUtil74.reset20Dapan2(scienceEntityListDaPan);
                boolean flag2127= FindUtil74.jieQiDapan3(scienceEntityListDaPan);
                boolean flag2128= FindUtil74.jishujieqiDapan3(scienceEntityListDaPan);
                boolean flag2129= FindUtil74.jishujieqiDapan4(scienceEntityListDaPan);
                boolean flag2130= FindUtil74.jieQiDapan4(scienceEntityListDaPan);
                boolean flag2131= FindUtil74.duoTuXiangShangDapan3(scienceEntityListDaPan);
                boolean flag2132= FindUtil74.shengVDapan3(scienceEntityListDaPan);
                boolean flag2133= FindUtil74.reset20Dapan3(scienceEntityListDaPan);
                boolean flag2134= FindUtil74.jieQiDapan5(scienceEntityListDaPan);
                boolean flag2135= FindUtil74.jishujieqiDapan5(scienceEntityListDaPan);
                boolean flag2136= FindUtil74.jishujieqiDapan6(scienceEntityListDaPan);
                boolean flag2137= FindUtil74.jishujieqiDapan7(scienceEntityListDaPan);
                boolean flag2138= FindUtil74.duoTuXiangShangDapan4(scienceEntityList);
                boolean flag2139= FindUtil74.shengVDapan4(scienceEntityList);
                boolean flag2140= FindUtil74.reset20Dapan4(scienceEntityList);
                boolean flag2141= FindUtil74.jieQiDapan6(scienceEntityList);
                boolean flag2142= FindUtil74.jishujieqiDapan8(scienceEntityList);
                boolean flag2143= FindUtil74.jishujieqiDapan9(scienceEntityList);
                boolean flag2144= FindUtil74.jieQiDapan7(scienceEntityList);
                boolean flag2145= FindUtil74.jieQiDapan8(scienceEntityList);
                boolean flag2146= FindUtil74.jieQiDapan9(scienceEntityList);
                boolean flag2147= FindUtil74.jieQiDapan10(scienceEntityListDaPan);
                boolean flag2148= FindUtil74.jieQiDapan11(scienceEntityList);
                boolean flag2149= FindUtil74.jieQiDapan12(scienceEntityList);
                boolean flag2150= FindUtil74.jieQiDapan13(scienceEntityList);
                boolean flag2151= FindUtil74.jieQiDapan14(scienceEntityList);
                boolean flag2152= FindUtil74.jieQiDapan15(scienceEntityList);
                boolean flag2153= FindUtil74.jieQiDapan16(scienceEntityList);

                boolean flag2154= FindUtil75.duoTuXiangShangDapan2(scienceEntityList,scienceEntityListDaPan);
                boolean flag2155= FindUtil75.shengVDapan2(scienceEntityList,scienceEntityListDaPan);
                boolean flag2156= FindUtil75.reset20Dapan2(scienceEntityList,scienceEntityListDaPan);
                boolean flag2157= FindUtil75.jieQiDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2158= FindUtil75.jishujieqiDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2159= FindUtil75.jishujieqiDapan4(scienceEntityList,scienceEntityListDaPan);
                boolean flag2160= FindUtil75.jieQiDapan4(scienceEntityList,scienceEntityListDaPan);
                boolean flag2161= FindUtil75.duoTuXiangShangDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2162= FindUtil75.shengVDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2163= FindUtil75.reset20Dapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2164= FindUtil75.jieQiDapan5(scienceEntityList,scienceEntityListDaPan);
                boolean flag2165= FindUtil75.jishujieqiDapan5(scienceEntityList,scienceEntityListDaPan);
                boolean flag2166= FindUtil75.jishujieqiDapan6(scienceEntityList,scienceEntityListDaPan);
                boolean flag2167= FindUtil75.jishujieqiDapan7(scienceEntityList,scienceEntityListDaPan);
                boolean flag2168= FindUtil75.jieQiDapan10(scienceEntityList,scienceEntityListDaPan);

                boolean flag2169= FindUtil76.duoTuXiangShangDapan2(scienceEntityList,scienceEntityListDaPan);
                boolean flag2170= FindUtil76.shengVDapan2(scienceEntityList,scienceEntityListDaPan);
                boolean flag2171= FindUtil76.reset20Dapan2(scienceEntityList,scienceEntityListDaPan);
                boolean flag2172= FindUtil76.jieQiDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2173= FindUtil76.jishujieqiDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2174= FindUtil76.jishujieqiDapan4(scienceEntityList,scienceEntityListDaPan);
                boolean flag2175= FindUtil76.jieQiDapan4(scienceEntityList,scienceEntityListDaPan);
                boolean flag2176= FindUtil76.duoTuXiangShangDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2177= FindUtil76.shengVDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2178= FindUtil76.reset20Dapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2179= FindUtil76.jieQiDapan5(scienceEntityList,scienceEntityListDaPan);
                boolean flag2180= FindUtil76.jishujieqiDapan5(scienceEntityList,scienceEntityListDaPan);
                boolean flag2181= FindUtil76.jishujieqiDapan6(scienceEntityList,scienceEntityListDaPan);
                boolean flag2182= FindUtil76.jishujieqiDapan7(scienceEntityList,scienceEntityListDaPan);
                boolean flag2183= FindUtil76.jieQiDapan10(scienceEntityList,scienceEntityListDaPan);

                boolean flag2184= FindUtil77.duoTuXiangShangDapan2(scienceEntityList,scienceEntityListDaPan);
                boolean flag2185= FindUtil77.shengVDapan2(scienceEntityList,scienceEntityListDaPan);
                boolean flag2186= FindUtil77.reset20Dapan2(scienceEntityList,scienceEntityListDaPan);
                boolean flag2187= FindUtil77.jieQiDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2188= FindUtil77.jishujieqiDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2189= FindUtil77.jishujieqiDapan4(scienceEntityList,scienceEntityListDaPan);
                boolean flag2190= FindUtil77.jieQiDapan4(scienceEntityList,scienceEntityListDaPan);
                boolean flag2191= FindUtil77.duoTuXiangShangDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2192= FindUtil77.shengVDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2193= FindUtil77.reset20Dapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2194= FindUtil77.jieQiDapan5(scienceEntityList,scienceEntityListDaPan);
                boolean flag2195= FindUtil77.jishujieqiDapan5(scienceEntityList,scienceEntityListDaPan);
                boolean flag2196= FindUtil77.jishujieqiDapan6(scienceEntityList,scienceEntityListDaPan);
                boolean flag2197= FindUtil77.jishujieqiDapan7(scienceEntityList,scienceEntityListDaPan);
                boolean flag2198= FindUtil77.jieQiDapan10(scienceEntityList,scienceEntityListDaPan);

                boolean flag2199= FindUtil78.duoTuXiangShangDapan2(scienceEntityList,scienceEntityListDaPan);
                boolean flag2200= FindUtil78.shengVDapan2(scienceEntityList,scienceEntityListDaPan);
                boolean flag2201= FindUtil78.reset20Dapan2(scienceEntityList,scienceEntityListDaPan);
                boolean flag2202= FindUtil78.jieQiDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2203= FindUtil78.jishujieqiDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2204= FindUtil78.jishujieqiDapan4(scienceEntityList,scienceEntityListDaPan);
                boolean flag2205= FindUtil78.jieQiDapan4(scienceEntityList,scienceEntityListDaPan);
                boolean flag2206= FindUtil78.duoTuXiangShangDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2207= FindUtil78.shengVDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2208= FindUtil78.reset20Dapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2209= FindUtil78.jieQiDapan5(scienceEntityList,scienceEntityListDaPan);
                boolean flag2210= FindUtil78.jishujieqiDapan5(scienceEntityList,scienceEntityListDaPan);
                boolean flag2211= FindUtil78.jishujieqiDapan6(scienceEntityList,scienceEntityListDaPan);
                boolean flag2212= FindUtil78.jishujieqiDapan7(scienceEntityList,scienceEntityListDaPan);
                boolean flag2213= FindUtil78.jieQiDapan10(scienceEntityList,scienceEntityListDaPan);

                boolean flag2214= FindUtil79.duoTuXiangShangDapan2(scienceEntityList,scienceEntityListDaPan);
                boolean flag2215= FindUtil79.shengVDapan2(scienceEntityList,scienceEntityListDaPan);
                boolean flag2216= FindUtil79.reset20Dapan2(scienceEntityList,scienceEntityListDaPan);
                boolean flag2217= FindUtil79.jieQiDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2218= FindUtil79.jishujieqiDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2219= FindUtil79.jishujieqiDapan4(scienceEntityList,scienceEntityListDaPan);
                boolean flag2220= FindUtil79.jieQiDapan4(scienceEntityList,scienceEntityListDaPan);
                boolean flag2221= FindUtil79.duoTuXiangShangDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2222= FindUtil79.shengVDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2223= FindUtil79.reset20Dapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2224= FindUtil79.jieQiDapan5(scienceEntityList,scienceEntityListDaPan);
                boolean flag2225= FindUtil79.jishujieqiDapan5(scienceEntityList,scienceEntityListDaPan);
                boolean flag2226= FindUtil79.jishujieqiDapan6(scienceEntityList,scienceEntityListDaPan);
                boolean flag2227= FindUtil79.jishujieqiDapan7(scienceEntityList,scienceEntityListDaPan);
                boolean flag2228= FindUtil79.jieQiDapan10(scienceEntityList,scienceEntityListDaPan);

                boolean flag2229= FindUtil80.duoTuXiangShangDapan2(scienceEntityList,scienceEntityListDaPan);
                boolean flag2230= FindUtil80.shengVDapan2(scienceEntityList,scienceEntityListDaPan);
                boolean flag2231= FindUtil80.reset20Dapan2(scienceEntityList,scienceEntityListDaPan);
                boolean flag2232= FindUtil80.jieQiDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2233= FindUtil80.jishujieqiDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2234= FindUtil80.jishujieqiDapan4(scienceEntityList,scienceEntityListDaPan);
                boolean flag2235= FindUtil80.jieQiDapan4(scienceEntityList,scienceEntityListDaPan);
                boolean flag2236= FindUtil80.duoTuXiangShangDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2237= FindUtil80.shengVDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2238= FindUtil80.reset20Dapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2239= FindUtil80.jieQiDapan5(scienceEntityList,scienceEntityListDaPan);
                boolean flag2240= FindUtil80.jishujieqiDapan5(scienceEntityList,scienceEntityListDaPan);
                boolean flag2241= FindUtil80.jishujieqiDapan6(scienceEntityList,scienceEntityListDaPan);
                boolean flag2242= FindUtil80.jishujieqiDapan7(scienceEntityList,scienceEntityListDaPan);
                boolean flag2243= FindUtil80.jieQiDapan10(scienceEntityList,scienceEntityListDaPan);

                boolean flag2244= FindUtil81.duoTuXiangShangDapan2(scienceEntityList,scienceEntityListDaPan);
                boolean flag2245= FindUtil81.shengVDapan2(scienceEntityList,scienceEntityListDaPan);
                boolean flag2246= FindUtil81.reset20Dapan2(scienceEntityList,scienceEntityListDaPan);
                boolean flag2247= FindUtil81.jieQiDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2248= FindUtil81.jishujieqiDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2249= FindUtil81.jishujieqiDapan4(scienceEntityList,scienceEntityListDaPan);
                boolean flag2250= FindUtil81.jieQiDapan4(scienceEntityList,scienceEntityListDaPan);
                boolean flag2251= FindUtil81.duoTuXiangShangDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2252= FindUtil81.shengVDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2253= FindUtil81.reset20Dapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2254= FindUtil81.jieQiDapan5(scienceEntityList,scienceEntityListDaPan);
                boolean flag2255= FindUtil81.jishujieqiDapan5(scienceEntityList,scienceEntityListDaPan);
                boolean flag2256= FindUtil81.jishujieqiDapan6(scienceEntityList,scienceEntityListDaPan);
                boolean flag2257= FindUtil81.jishujieqiDapan7(scienceEntityList,scienceEntityListDaPan);
                boolean flag2258= FindUtil81.jieQiDapan10(scienceEntityList,scienceEntityListDaPan);

                boolean flag2259= FindUtil82.duoTuXiangShangDapan2(scienceEntityList,scienceEntityListDaPan);
                boolean flag2260= FindUtil82.shengVDapan2(scienceEntityList,scienceEntityListDaPan);
                boolean flag2261= FindUtil82.reset20Dapan2(scienceEntityList,scienceEntityListDaPan);
                boolean flag2262= FindUtil82.jieQiDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2263= FindUtil82.jishujieqiDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2264= FindUtil82.jishujieqiDapan4(scienceEntityList,scienceEntityListDaPan);
                boolean flag2265= FindUtil82.jieQiDapan4(scienceEntityList,scienceEntityListDaPan);
                boolean flag2266= FindUtil82.duoTuXiangShangDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2267= FindUtil82.shengVDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2268= FindUtil82.reset20Dapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2269= FindUtil82.jieQiDapan5(scienceEntityList,scienceEntityListDaPan);
                boolean flag2270= FindUtil82.jishujieqiDapan5(scienceEntityList,scienceEntityListDaPan);
                boolean flag2271= FindUtil82.jishujieqiDapan6(scienceEntityList,scienceEntityListDaPan);
                boolean flag2272= FindUtil82.jishujieqiDapan7(scienceEntityList,scienceEntityListDaPan);
                boolean flag2273= FindUtil82.jieQiDapan10(scienceEntityList,scienceEntityListDaPan);

                boolean flag2274= FindUtil83.duoTuXiangShangDapan2(scienceEntityList,scienceEntityListDaPan);
                boolean flag2275= FindUtil83.shengVDapan2(scienceEntityList,scienceEntityListDaPan);
                boolean flag2276= FindUtil83.reset20Dapan2(scienceEntityList,scienceEntityListDaPan);
                boolean flag2277= FindUtil83.jieQiDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2278= FindUtil83.jishujieqiDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2279= FindUtil83.jishujieqiDapan4(scienceEntityList,scienceEntityListDaPan);
                boolean flag2280= FindUtil83.jieQiDapan4(scienceEntityList,scienceEntityListDaPan);
                boolean flag2281= FindUtil83.duoTuXiangShangDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2282= FindUtil83.shengVDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2283= FindUtil83.reset20Dapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2284= FindUtil83.jieQiDapan5(scienceEntityList,scienceEntityListDaPan);
                boolean flag2285= FindUtil83.jishujieqiDapan5(scienceEntityList,scienceEntityListDaPan);
                boolean flag2286= FindUtil83.jishujieqiDapan6(scienceEntityList,scienceEntityListDaPan);
                boolean flag2287= FindUtil83.jishujieqiDapan7(scienceEntityList,scienceEntityListDaPan);
                boolean flag2288= FindUtil83.jieQiDapan10(scienceEntityList,scienceEntityListDaPan);

                boolean flag2289= FindUtil84.duoTuXiangShangDapan2(scienceEntityList,scienceEntityListDaPan);
                boolean flag2290= FindUtil84.shengVDapan2(scienceEntityList,scienceEntityListDaPan);
                boolean flag2291= FindUtil84.reset20Dapan2(scienceEntityList,scienceEntityListDaPan);
                boolean flag2292= FindUtil84.jieQiDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2293= FindUtil84.jishujieqiDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2294= FindUtil84.jishujieqiDapan4(scienceEntityList,scienceEntityListDaPan);
                boolean flag2295= FindUtil84.jieQiDapan4(scienceEntityList,scienceEntityListDaPan);
                boolean flag2296= FindUtil84.duoTuXiangShangDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2297= FindUtil84.shengVDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2298= FindUtil84.reset20Dapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2299= FindUtil84.jieQiDapan5(scienceEntityList,scienceEntityListDaPan);
                boolean flag2300= FindUtil84.jishujieqiDapan5(scienceEntityList,scienceEntityListDaPan);
                boolean flag2301= FindUtil84.jishujieqiDapan6(scienceEntityList,scienceEntityListDaPan);
                boolean flag2302= FindUtil84.jishujieqiDapan7(scienceEntityList,scienceEntityListDaPan);
                boolean flag2303= FindUtil84.jieQiDapan10(scienceEntityList,scienceEntityListDaPan);

                boolean flag2304= FindUtil85.duoTuXiangShangDapan2(scienceEntityList,scienceEntityListDaPan);
                boolean flag2305= FindUtil85.shengVDapan2(scienceEntityList,scienceEntityListDaPan);
                boolean flag2306= FindUtil85.reset20Dapan2(scienceEntityList,scienceEntityListDaPan);
                boolean flag2307= FindUtil85.jieQiDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2308= FindUtil85.jishujieqiDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2309= FindUtil85.jishujieqiDapan4(scienceEntityList,scienceEntityListDaPan);
                boolean flag2310= FindUtil85.jieQiDapan4(scienceEntityList,scienceEntityListDaPan);
                boolean flag2311= FindUtil85.duoTuXiangShangDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2312= FindUtil85.shengVDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2313= FindUtil85.reset20Dapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2314= FindUtil85.jieQiDapan5(scienceEntityList,scienceEntityListDaPan);
                boolean flag2315= FindUtil85.jishujieqiDapan5(scienceEntityList,scienceEntityListDaPan);
                boolean flag2316= FindUtil85.jishujieqiDapan6(scienceEntityList,scienceEntityListDaPan);
                boolean flag2317= FindUtil85.jishujieqiDapan7(scienceEntityList,scienceEntityListDaPan);
                boolean flag2318= FindUtil85.jieQiDapan10(scienceEntityList,scienceEntityListDaPan);

                boolean flag2319= FindUtil86.duoTuXiangShangDapan2(scienceEntityList,scienceEntityListDaPan);
                boolean flag2320= FindUtil86.shengVDapan2(scienceEntityList,scienceEntityListDaPan);
                boolean flag2321= FindUtil86.reset20Dapan2(scienceEntityList,scienceEntityListDaPan);
                boolean flag2322= FindUtil86.jieQiDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2323= FindUtil86.jishujieqiDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2324= FindUtil86.jishujieqiDapan4(scienceEntityList,scienceEntityListDaPan);
                boolean flag2325= FindUtil86.jieQiDapan4(scienceEntityList,scienceEntityListDaPan);
                boolean flag2326= FindUtil86.duoTuXiangShangDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2327= FindUtil86.shengVDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2328= FindUtil86.reset20Dapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2329= FindUtil86.jieQiDapan5(scienceEntityList,scienceEntityListDaPan);
                boolean flag2330= FindUtil86.jishujieqiDapan5(scienceEntityList,scienceEntityListDaPan);
                boolean flag2331= FindUtil86.jishujieqiDapan6(scienceEntityList,scienceEntityListDaPan);
                boolean flag2332= FindUtil86.jishujieqiDapan7(scienceEntityList,scienceEntityListDaPan);
                boolean flag2333= FindUtil86.jieQiDapan10(scienceEntityList,scienceEntityListDaPan);

                boolean flag2334= FindUtil87.duoTuXiangShangDapan2(scienceEntityList,scienceEntityListDaPan);
                boolean flag2335= FindUtil87.shengVDapan2(scienceEntityList,scienceEntityListDaPan);
                boolean flag2336= FindUtil87.reset20Dapan2(scienceEntityList,scienceEntityListDaPan);
                boolean flag2337= FindUtil87.jieQiDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2338= FindUtil87.jishujieqiDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2339= FindUtil87.jishujieqiDapan4(scienceEntityList,scienceEntityListDaPan);
                boolean flag2340= FindUtil87.jieQiDapan4(scienceEntityList,scienceEntityListDaPan);
                boolean flag2341= FindUtil87.duoTuXiangShangDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2342= FindUtil87.shengVDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2343= FindUtil87.reset20Dapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2344= FindUtil87.jieQiDapan5(scienceEntityList,scienceEntityListDaPan);
                boolean flag2345= FindUtil87.jishujieqiDapan5(scienceEntityList,scienceEntityListDaPan);
                boolean flag2346= FindUtil87.jishujieqiDapan6(scienceEntityList,scienceEntityListDaPan);
                boolean flag2347= FindUtil87.jishujieqiDapan7(scienceEntityList,scienceEntityListDaPan);
                boolean flag2348= FindUtil87.jieQiDapan10(scienceEntityList,scienceEntityListDaPan);

                boolean flag2349= FindUtil88.duoTuXiangShangDapan2(scienceEntityList,scienceEntityListDaPan);
                boolean flag2350= FindUtil88.shengVDapan2(scienceEntityList,scienceEntityListDaPan);
                boolean flag2351= FindUtil88.reset20Dapan2(scienceEntityList,scienceEntityListDaPan);
                boolean flag2352= FindUtil88.jieQiDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2353= FindUtil88.jishujieqiDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2354= FindUtil88.jishujieqiDapan4(scienceEntityList,scienceEntityListDaPan);
                boolean flag2355= FindUtil88.jieQiDapan4(scienceEntityList,scienceEntityListDaPan);
                boolean flag2356= FindUtil88.duoTuXiangShangDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2357= FindUtil88.shengVDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2358= FindUtil88.reset20Dapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2359= FindUtil88.jieQiDapan5(scienceEntityList,scienceEntityListDaPan);
                boolean flag2360= FindUtil88.jishujieqiDapan5(scienceEntityList,scienceEntityListDaPan);
                boolean flag2361= FindUtil88.jishujieqiDapan6(scienceEntityList,scienceEntityListDaPan);
                boolean flag2362= FindUtil88.jishujieqiDapan7(scienceEntityList,scienceEntityListDaPan);
                boolean flag2363= FindUtil88.jieQiDapan10(scienceEntityList,scienceEntityListDaPan);

                boolean flag2364= FindUtil89.duoTuXiangShangDapan2(scienceEntityList,scienceEntityListDaPan);
                boolean flag2365= FindUtil89.shengVDapan2(scienceEntityList,scienceEntityListDaPan);
                boolean flag2366= FindUtil89.reset20Dapan2(scienceEntityList,scienceEntityListDaPan);
                boolean flag2367= FindUtil89.jieQiDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2368= FindUtil89.jishujieqiDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2369= FindUtil89.jishujieqiDapan4(scienceEntityList,scienceEntityListDaPan);
                boolean flag2370= FindUtil89.jieQiDapan4(scienceEntityList,scienceEntityListDaPan);
                boolean flag2371= FindUtil89.duoTuXiangShangDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2372= FindUtil89.shengVDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2373= FindUtil89.reset20Dapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2374= FindUtil89.jieQiDapan5(scienceEntityList,scienceEntityListDaPan);
                boolean flag2375= FindUtil89.jishujieqiDapan5(scienceEntityList,scienceEntityListDaPan);
                boolean flag2376= FindUtil89.jishujieqiDapan6(scienceEntityList,scienceEntityListDaPan);
                boolean flag2377= FindUtil89.jishujieqiDapan7(scienceEntityList,scienceEntityListDaPan);
                boolean flag2378= FindUtil89.jieQiDapan10(scienceEntityList,scienceEntityListDaPan);




//                if (flag413){
//                    updateYanPan("413",yanPanVo);
//                }
//                if (flag414){
//                    updateYanPan("414",yanPanVo);
//                }
//                if (flag415){
//                    updateYanPan("415",yanPanVo);
//                }
//                if (flag416){
//                    updateYanPan("416",yanPanVo);
//                }
//                if (flag417){
//                    updateYanPan("417",yanPanVo);
//                }
//                if (flag418){
//                    updateYanPan("418",yanPanVo);
//                }
//                if (flag419){
//                    updateYanPan("419",yanPanVo);
//                }
//                if (flag420){
//                    updateYanPan("420",yanPanVo);
//                }
//                if (flag421){
//                    updateYanPan("421",yanPanVo);
//                }
//                if (flag422){
//                    updateYanPan("422",yanPanVo);
//                }
//                if (flag423){
//                    updateYanPan("423",yanPanVo);
//                }
//                if (flag424){
//                    updateYanPan("424",yanPanVo);
//                }
//                if (flag425){
//                    updateYanPan("425",yanPanVo);
//                }
//                if (flag426){
//                    updateYanPan("426",yanPanVo);
//                }
//                if (flag427){
//                    updateYanPan("427",yanPanVo);
//                }
//                if (flag428){
//                    updateYanPan("428",yanPanVo);
//                }
//                if (flag429){
//                    updateYanPan("429",yanPanVo);
//                }
//                if (flag430){
//                    updateYanPan("430",yanPanVo);
//                }
//                if (flag431){
//                    updateYanPan("431",yanPanVo);
//                }
//                if (flag432){
//                    updateYanPan("432",yanPanVo);
//                }
//                if (flag433){
//                    updateYanPan("433",yanPanVo);
//                }
//                if (flag434){
//                    updateYanPan("434",yanPanVo);
//                }
//                if (flag435){
//                    updateYanPan("435",yanPanVo);
//                }
//                if (flag436){
//                    updateYanPan("436",yanPanVo);
//                }
//                if (flag437){
//                    updateYanPan("437",yanPanVo);
//                }
//                if (flag438){
//                    updateYanPan("438",yanPanVo);
//                }
//                if (flag439){
//                    updateYanPan("439",yanPanVo);
//                }
//                if (flag440){
//                    updateYanPan("440",yanPanVo);
//                }
//                if (flag441){
//                    updateYanPan("441",yanPanVo);
//                }
//                if (flag442){
//                    updateYanPan("242",yanPanVo);
//                }
//                if (flag443){
//                    updateYanPan("443",yanPanVo);
//                }
//                if (flag444){
//                    updateYanPan("444",yanPanVo);
//                }
//                if (flag445){
//                    updateYanPan("445",yanPanVo);
//                }
//                if (flag446){
//                    updateYanPan("446",yanPanVo);
//                }
//                if (flag447){
//                    updateYanPan("447",yanPanVo);
//                }
//                if (flag448){
//                    updateYanPan("448",yanPanVo);
//                }
//                if (flag449){
//                    updateYanPan("449",yanPanVo);
//                }
//                if (flag450){
//                    updateYanPan("450",yanPanVo);
//                }
//                if (flag451){
//                    updateYanPan("451",yanPanVo);
//                }
//                if (flag452){
//                    updateYanPan("452",yanPanVo);
//                }
//                if (flag453){
//                    updateYanPan("453",yanPanVo);
//                }
//                if (flag454){
//                    updateYanPan("454",yanPanVo);
//                }
//                if (flag455){
//                    updateYanPan("455",yanPanVo);
//                }
//
//                if (flag456){
//                    updateYanPan("456",yanPanVo);
//                }
//                if (flag457){
//                    updateYanPan("457",yanPanVo);
//                }
//                if (flag458){
//                    updateYanPan("458",yanPanVo);
//                }
//                if (flag459){
//                    updateYanPan("459",yanPanVo);
//                }
//                if (flag460){
//                    updateYanPan("460",yanPanVo);
//                }
//                if (flag461){
//                    updateYanPan("461",yanPanVo);
//                }
//                if (flag462){
//                    updateYanPan("462",yanPanVo);
//                }
//                if (flag463){
//                    updateYanPan("463",yanPanVo);
//                }
//                if (flag464){
//                    updateYanPan("464",yanPanVo);
//                }
//                if (flag465){
//                    updateYanPan("465",yanPanVo);
//                }
//                if (flag466){
//                    updateYanPan("466",yanPanVo);
//                }
//                if (flag467){
//                    updateYanPan("467",yanPanVo);
//                }
//                if (flag468){
//                    updateYanPan("468",yanPanVo);
//                }
//
//                if (flag469){
//                    updateYanPan("469",yanPanVo);
//                }
//                if (flag470){
//                    updateYanPan("470",yanPanVo);
//                }
//                if (flag471){
//                    updateYanPan("471",yanPanVo);
//                }
//                if (flag472){
//                    updateYanPan("472",yanPanVo);
//                }
//                if (flag473){
//                    updateYanPan("473",yanPanVo);
//                }
//                if (flag474){
//                    updateYanPan("474",yanPanVo);
//                }
//                if (flag475){
//                    updateYanPan("475",yanPanVo);
//                }
//                if (flag476){
//                    updateYanPan("476",yanPanVo);
//                }
//                if (flag477){
//                    updateYanPan("477",yanPanVo);
//                }
//                if (flag478){
//                    updateYanPan("478",yanPanVo);
//                }
//                if (flag479){
//                    updateYanPan("479",yanPanVo);
//                }
//                if (flag480){
//                    updateYanPan("480",yanPanVo);
//                }
//                if (flag481){
//                    updateYanPan("481",yanPanVo);
//                }
//
//                if (flag482){
//                    updateYanPan("482",yanPanVo);
//                }
//                if (flag483){
//                    updateYanPan("483",yanPanVo);
//                }
//                if (flag484){
//                    updateYanPan("484",yanPanVo);
//                }
//                if (flag485){
//                    updateYanPan("485",yanPanVo);
//                }
//                if (flag486){
//                    updateYanPan("486",yanPanVo);
//                }
//                if (flag487){
//                    updateYanPan("487",yanPanVo);
//                }
//                if (flag488){
//                    updateYanPan("488",yanPanVo);
//                }
//                if (flag489){
//                    updateYanPan("489",yanPanVo);
//                }
//                if (flag490){
//                    updateYanPan("490",yanPanVo);
//                }
//                if (flag491){
//                    updateYanPan("491",yanPanVo);
//                }
//                if (flag492){
//                    updateYanPan("492",yanPanVo);
//                }
//                if (flag493){
//                    updateYanPan("493",yanPanVo);
//                }
//                if (flag494){
//                    updateYanPan("494",yanPanVo);
//                }
//
//                if (flag495){
//                    updateYanPan("495",yanPanVo);
//                }
//                if (flag496){
//                    updateYanPan("496",yanPanVo);
//                }
//                if (flag497){
//                    updateYanPan("497",yanPanVo);
//                }
//                if (flag498){
//                    updateYanPan("498",yanPanVo);
//                }
//                if (flag499){
//                    updateYanPan("499",yanPanVo);
//                }
//                if (flag500){
//                    updateYanPan("500",yanPanVo);
//                }
//                if (flag501){
//                    updateYanPan("501",yanPanVo);
//                }
//                if (flag502){
//                    updateYanPan("502",yanPanVo);
//                }
//                if (flag503){
//                    updateYanPan("503",yanPanVo);
//                }
//                if (flag504){
//                    updateYanPan("504",yanPanVo);
//                }
//                if (flag505){
//                    updateYanPan("505",yanPanVo);
//                }
//                if (flag506){
//                    updateYanPan("506",yanPanVo);
//                }
//                if (flag507){
//                    updateYanPan("507",yanPanVo);
//                }
//
//                if (flag508){
//                    updateYanPan("508",yanPanVo);
//                }
//                if (flag509){
//                    updateYanPan("509",yanPanVo);
//                }
//                if (flag510){
//                    updateYanPan("510",yanPanVo);
//                }
//                if (flag511){
//                    updateYanPan("511",yanPanVo);
//                }
//                if (flag512){
//                    updateYanPan("512",yanPanVo);
//                }
//                if (flag513){
//                    updateYanPan("513",yanPanVo);
//                }
//                if (flag514){
//                    updateYanPan("514",yanPanVo);
//                }
//                if (flag515){
//                    updateYanPan("515",yanPanVo);
//                }
//                if (flag516){
//                    updateYanPan("516",yanPanVo);
//                }
//                if (flag517){
//                    updateYanPan("517",yanPanVo);
//                }
//                if (flag518){
//                    updateYanPan("518",yanPanVo);
//                }
//                if (flag519){
//                    updateYanPan("519",yanPanVo);
//                }
//                if (flag520){
//                    updateYanPan("520",yanPanVo);
//                }
//                if (flag521){
//                    updateYanPan("521",yanPanVo);
//                }
//
//                if (flag522){
//                    updateYanPan("522",yanPanVo);
//                }
//                if (flag523){
//                    updateYanPan("523",yanPanVo);
//                }
//                if (flag524){
//                    updateYanPan("524",yanPanVo);
//                }
//                if (flag525){
//                    updateYanPan("525",yanPanVo);
//                }
//                if (flag526){
//                    updateYanPan("526",yanPanVo);
//                }
//                if (flag527){
//                    updateYanPan("527",yanPanVo);
//                }
//                if (flag528){
//                    updateYanPan("528",yanPanVo);
//                }
//                if (flag529){
//                    updateYanPan("529",yanPanVo);
//                }
//                if (flag530){
//                    updateYanPan("530",yanPanVo);
//                }
//                if (flag531){
//                    updateYanPan("531",yanPanVo);
//                }
//                if (flag532){
//                    updateYanPan("532",yanPanVo);
//                }
//                if (flag533){
//                    updateYanPan("533",yanPanVo);
//                }
//                if (flag534){
//                    updateYanPan("534",yanPanVo);
//                }
//                if (flag535){
//                    updateYanPan("535",yanPanVo);
//                }
//                if (flag536){
//                    updateYanPan("536",yanPanVo);
//                }
//                if (flag537){
//                    updateYanPan("537",yanPanVo);
//                }
//                if (flag538){
//                    updateYanPan("538",yanPanVo);
//                }
//                if (flag539){
//                    updateYanPan("539",yanPanVo);
//                }
//                if (flag540){
//                    updateYanPan("540",yanPanVo);
//                }
//                if (flag541){
//                    updateYanPan("541",yanPanVo);
//                }
//                if (flag542){
//                    updateYanPan("542",yanPanVo);
//                }
//                if (flag543){
//                    updateYanPan("543",yanPanVo);
//                }
//                if (flag544){
//                    updateYanPan("544",yanPanVo);
//                }
//                if (flag545){
//                    updateYanPan("545",yanPanVo);
//                }
//                if (flag546){
//                    updateYanPan("546",yanPanVo);
//                }
//                if (flag547){
//                    updateYanPan("547",yanPanVo);
//                }
//                if (flag548){
//                    updateYanPan("548",yanPanVo);
//                }
//                if (flag549){
//                    updateYanPan("549",yanPanVo);
//                }
//                if (flag550){
//                    updateYanPan("550",yanPanVo);
//                }
//                if (flag551){
//                    updateYanPan("551",yanPanVo);
//                }
//                if (flag552){
//                    updateYanPan("552",yanPanVo);
//                }
//                if (flag553){
//                    updateYanPan("553",yanPanVo);
//                }
//                if (flag554){
//                    updateYanPan("554",yanPanVo);
//                }
//                if (flag555){
//                    updateYanPan("555",yanPanVo);
//                }
//
//                if (flag556){
//                    updateYanPan("556",yanPanVo);
//                }
//                if (flag557){
//                    updateYanPan("557",yanPanVo);
//                }
//                if (flag558){
//                    updateYanPan("558",yanPanVo);
//                }
//                if (flag559){
//                    updateYanPan("559",yanPanVo);
//                }
//                if (flag560){
//                    updateYanPan("560",yanPanVo);
//                }
//                if (flag561){
//                    updateYanPan("561",yanPanVo);
//                }
//                if (flag562){
//                    updateYanPan("562",yanPanVo);
//                }
//                if (flag563){
//                    updateYanPan("563",yanPanVo);
//                }
//                if (flag564){
//                    updateYanPan("564",yanPanVo);
//                }
//                if (flag565){
//                    updateYanPan("565",yanPanVo);
//                }
//                if (flag566){
//                    updateYanPan("566",yanPanVo);
//                }
//                if (flag567){
//                    updateYanPan("567",yanPanVo);
//                }
//                if (flag568){
//                    updateYanPan("568",yanPanVo);
//                }
//
//                if (flag569){
//                    updateYanPan("569",yanPanVo);
//                }
//                if (flag570){
//                    updateYanPan("570",yanPanVo);
//                }
//                if (flag571){
//                    updateYanPan("571",yanPanVo);
//                }
//                if (flag572){
//                    updateYanPan("572",yanPanVo);
//                }
//                if (flag573){
//                    updateYanPan("573",yanPanVo);
//                }
//                if (flag574){
//                    updateYanPan("574",yanPanVo);
//                }
//                if (flag575){
//                    updateYanPan("575",yanPanVo);
//                }
//                if (flag576){
//                    updateYanPan("576",yanPanVo);
//                }
//                if (flag577){
//                    updateYanPan("577",yanPanVo);
//                }
//                if (flag578){
//                    updateYanPan("578",yanPanVo);
//                }
//                if (flag579){
//                    updateYanPan("579",yanPanVo);
//                }
//                if (flag580){
//                    updateYanPan("580",yanPanVo);
//                }
//                if (flag581){
//                    updateYanPan("581",yanPanVo);
//                }
//
//                if (flag582){
//                    updateYanPan("582",yanPanVo);
//                }
//                if (flag583){
//                    updateYanPan("583",yanPanVo);
//                }
//                if (flag584){
//                    updateYanPan("584",yanPanVo);
//                }
//                if (flag585){
//                    updateYanPan("585",yanPanVo);
//                }
//                if (flag586){
//                    updateYanPan("586",yanPanVo);
//                }
//                if (flag587){
//                    updateYanPan("587",yanPanVo);
//                }
//                if (flag588){
//                    updateYanPan("588",yanPanVo);
//                }
//                if (flag589){
//                    updateYanPan("589",yanPanVo);
//                }
//                if (flag590){
//                    updateYanPan("590",yanPanVo);
//                }
//                if (flag591){
//                    updateYanPan("591",yanPanVo);
//                }
//                if (flag592){
//                    updateYanPan("592",yanPanVo);
//                }
//                if (flag593){
//                    updateYanPan("593",yanPanVo);
//                }
//                if (flag594){
//                    updateYanPan("594",yanPanVo);
//                }
//
//                if (flag595){
//                    updateYanPan("595",yanPanVo);
//                }
//                if (flag596){
//                    updateYanPan("596",yanPanVo);
//                }
//                if (flag597){
//                    updateYanPan("597",yanPanVo);
//                }
//                if (flag598){
//                    updateYanPan("598",yanPanVo);
//                }
//                if (flag599){
//                    updateYanPan("599",yanPanVo);
//                }
//                if (flag600){
//                    updateYanPan("600",yanPanVo);
//                }
//                if (flag601){
//                    updateYanPan("601",yanPanVo);
//                }
//                if (flag602){
//                    updateYanPan("602",yanPanVo);
//                }
//                if (flag603){
//                    updateYanPan("603",yanPanVo);
//                }
//                if (flag604){
//                    updateYanPan("604",yanPanVo);
//                }
//                if (flag605){
//                    updateYanPan("605",yanPanVo);
//                }
//                if (flag606){
//                    updateYanPan("606",yanPanVo);
//                }
//                if (flag607){
//                    updateYanPan("607",yanPanVo);
//                }
//                if (flag610){
//                    updateYanPan("610",yanPanVo);
//                }
//
//                if (flag612){
//                    updateYanPan("612",yanPanVo);
//                }
//                if (flag613){
//                    updateYanPan("613",yanPanVo);
//                }
//                if (flag614){
//                    updateYanPan("614",yanPanVo);
//                }
//
//                if (flag615){
//                    updateYanPan("615",yanPanVo);
//                }
//                if (flag616){
//                    updateYanPan("616",yanPanVo);
//                }
//                if (flag617){
//                    updateYanPan("617",yanPanVo);
//                }
//                if (flag618){
//                    updateYanPan("618",yanPanVo);
//                }
//                if (flag619){
//                    updateYanPan("619",yanPanVo);
//                }
//                if (flag620){
//                    updateYanPan("620",yanPanVo);
//                }
//                if (flag621){
//                    updateYanPan("621",yanPanVo);
//                }
//
//                if (flag622){
//                    updateYanPan("622",yanPanVo);
//                }
//                if (flag623){
//                    updateYanPan("623",yanPanVo);
//                }
//                if (flag624){
//                    updateYanPan("624",yanPanVo);
//                }
//                if (flag625){
//                    updateYanPan("625",yanPanVo);
//                }
//                if (flag626){
//                    updateYanPan("626",yanPanVo);
//                }
//                if (flag627){
//                    updateYanPan("627",yanPanVo);
//                }
//                if (flag628){
//                    updateYanPan("628",yanPanVo);
//                }
//                if (flag629){
//                    updateYanPan("629",yanPanVo);
//                }
//                if (flag630){
//                    updateYanPan("630",yanPanVo);
//                }
//                if (flag631){
//                    updateYanPan("631",yanPanVo);
//                }
//                if (flag632){
//                    updateYanPan("632",yanPanVo);
//                }
//                if (flag633){
//                    updateYanPan("633",yanPanVo);
//                }
//                if (flag634){
//                    updateYanPan("634",yanPanVo);
//                }
//                if (flag635){
//                    updateYanPan("635",yanPanVo);
//                }
//                if (flag636){
//                    updateYanPan("636",yanPanVo);
//                }
//                if (flag637){
//                    updateYanPan("637",yanPanVo);
//                }
//                if (flag638){
//                    updateYanPan("638",yanPanVo);
//                }
//                if (flag639){
//                    updateYanPan("639",yanPanVo);
//                }
//                if (flag640){
//                    updateYanPan("640",yanPanVo);
//                }
//                if (flag641){
//                    updateYanPan("641",yanPanVo);
//                }
//                if (flag642){
//                    updateYanPan("642",yanPanVo);
//                }
//                if (flag643){
//                    updateYanPan("643",yanPanVo);
//                }
//                if (flag644){
//                    updateYanPan("644",yanPanVo);
//                }
//                if (flag645){
//                    updateYanPan("645",yanPanVo);
//                }
//                if (flag646){
//                    updateYanPan("646",yanPanVo);
//                }
//                if (flag647){
//                    updateYanPan("647",yanPanVo);
//                }
//                if (flag648){
//                    updateYanPan("648",yanPanVo);
//                }
//                if (flag649){
//                    updateYanPan("649",yanPanVo);
//                }
//                if (flag650){
//                    updateYanPan("650",yanPanVo);
//                }
//                if (flag651){
//                    updateYanPan("651",yanPanVo);
//                }
//                if (flag652){
//                    updateYanPan("652",yanPanVo);
//                }
//                if (flag653){
//                    updateYanPan("653",yanPanVo);
//                }
//                if (flag654){
//                    updateYanPan("654",yanPanVo);
//                }
//                if (flag655){
//                    updateYanPan("655",yanPanVo);
//                }
//
//                if (flag656){
//                    updateYanPan("656",yanPanVo);
//                }
//                if (flag657){
//                    updateYanPan("657",yanPanVo);
//                }
//                if (flag658){
//                    updateYanPan("658",yanPanVo);
//                }
//                if (flag659){
//                    updateYanPan("659",yanPanVo);
//                }
//                if (flag660){
//                    updateYanPan("660",yanPanVo);
//                }
//                if (flag661){
//                    updateYanPan("661",yanPanVo);
//                }
//                if (flag662){
//                    updateYanPan("662",yanPanVo);
//                }
//                if (flag663){
//                    updateYanPan("663",yanPanVo);
//                }
//                if (flag664){
//                    updateYanPan("664",yanPanVo);
//                }
//                if (flag665){
//                    updateYanPan("665",yanPanVo);
//                }
//                if (flag666){
//                    updateYanPan("666",yanPanVo);
//                }
//                if (flag667){
//                    updateYanPan("667",yanPanVo);
//                }
//                if (flag668){
//                    updateYanPan("668",yanPanVo);
//                }
//
//                if (flag669){
//                    updateYanPan("669",yanPanVo);
//                }
//                if (flag670){
//                    updateYanPan("670",yanPanVo);
//                }
//                if (flag671){
//                    updateYanPan("671",yanPanVo);
//                }
//                if (flag672){
//                    updateYanPan("672",yanPanVo);
//                }
//                if (flag673){
//                    updateYanPan("673",yanPanVo);
//                }
//                if (flag674){
//                    updateYanPan("674",yanPanVo);
//                }
//                if (flag675){
//                    updateYanPan("675",yanPanVo);
//                }
//                if (flag676){
//                    updateYanPan("676",yanPanVo);
//                }
//                if (flag677){
//                    updateYanPan("677",yanPanVo);
//                }
//                if (flag678){
//                    updateYanPan("678",yanPanVo);
//                }
//                if (flag679){
//                    updateYanPan("679",yanPanVo);
//                }
//                if (flag680){
//                    updateYanPan("680",yanPanVo);
//                }
//                if (flag681){
//                    updateYanPan("681",yanPanVo);
//                }
//
//                if (flag682){
//                    updateYanPan("682",yanPanVo);
//                }
//                if (flag683){
//                    updateYanPan("683",yanPanVo);
//                }
//                if (flag684){
//                    updateYanPan("684",yanPanVo);
//                }
//                if (flag685){
//                    updateYanPan("685",yanPanVo);
//                }
//                if (flag686){
//                    updateYanPan("686",yanPanVo);
//                }
//                if (flag687){
//                    updateYanPan("687",yanPanVo);
//                }
//                if (flag688){
//                    updateYanPan("688",yanPanVo);
//                }
//                if (flag689){
//                    updateYanPan("689",yanPanVo);
//                }
//                if (flag690){
//                    updateYanPan("690",yanPanVo);
//                }
//                if (flag691){
//                    updateYanPan("691",yanPanVo);
//                }
//                if (flag692){
//                    updateYanPan("692",yanPanVo);
//                }
//                if (flag693){
//                    updateYanPan("693",yanPanVo);
//                }
//                if (flag694){
//                    updateYanPan("694",yanPanVo);
//                }
//
//                if (flag695){
//                    updateYanPan("695",yanPanVo);
//                }
//                if (flag696){
//                    updateYanPan("696",yanPanVo);
//                }
//                if (flag697){
//                    updateYanPan("697",yanPanVo);
//                }
//                if (flag698){
//                    updateYanPan("698",yanPanVo);
//                }
//                if (flag699){
//                    updateYanPan("699",yanPanVo);
//                }
//                if (flag700){
//                    updateYanPan("700",yanPanVo);
//                }
//                if (flag701){
//                    updateYanPan("701",yanPanVo);
//                }
//                if (flag702){
//                    updateYanPan("702",yanPanVo);
//                }
//                if (flag703){
//                    updateYanPan("703",yanPanVo);
//                }
//                if (flag704){
//                    updateYanPan("704",yanPanVo);
//                }
//                if (flag705){
//                    updateYanPan("705",yanPanVo);
//                }
//                if (flag706){
//                    updateYanPan("706",yanPanVo);
//                }
//                if (flag707){
//                    updateYanPan("707",yanPanVo);
//                }
//                if (flag708){
//                    updateYanPan("708",yanPanVo);
//                }
//
//                if (flag709){
//                    updateYanPan("709",yanPanVo);
//                }
//                if (flag710){
//                    updateYanPan("710",yanPanVo);
//                }
//                if (flag711){
//                    updateYanPan("711",yanPanVo);
//                }
//                if (flag712){
//                    updateYanPan("712",yanPanVo);
//                }
//                if (flag713){
//                    updateYanPan("713",yanPanVo);
//                }
//                if (flag714){
//                    updateYanPan("714",yanPanVo);
//                }
//                if (flag715){
//                    updateYanPan("715",yanPanVo);
//                }
//                if (flag716){
//                    updateYanPan("716",yanPanVo);
//                }
//                if (flag717){
//                    updateYanPan("717",yanPanVo);
//                }
//                if (flag718){
//                    updateYanPan("718",yanPanVo);
//                }
//                if (flag719){
//                    updateYanPan("719",yanPanVo);
//                }
//                if (flag720){
//                    updateYanPan("720",yanPanVo);
//                }
//                if (flag721){
//                    updateYanPan("721",yanPanVo);
//                }
//
//                if (flag722){
//                    updateYanPan("722",yanPanVo);
//                }
//                if (flag723){
//                    updateYanPan("723",yanPanVo);
//                }
//                if (flag724){
//                    updateYanPan("724",yanPanVo);
//                }
//                if (flag725){
//                    updateYanPan("725",yanPanVo);
//                }
//                if (flag726){
//                    updateYanPan("726",yanPanVo);
//                }
//                if (flag727){
//                    updateYanPan("727",yanPanVo);
//                }
//                if (flag728){
//                    updateYanPan("728",yanPanVo);
//                }
//                if (flag729){
//                    updateYanPan("729",yanPanVo);
//                }
//                if (flag730){
//                    updateYanPan("730",yanPanVo);
//                }
//                if (flag731){
//                    updateYanPan("731",yanPanVo);
//                }
//                if (flag732){
//                    updateYanPan("732",yanPanVo);
//                }
//                if (flag733){
//                    updateYanPan("733",yanPanVo);
//                }
//                if (flag734){
//                    updateYanPan("734",yanPanVo);
//                }
//                if (flag735){
//                    updateYanPan("735",yanPanVo);
//                }
//                if (flag736){
//                    updateYanPan("736",yanPanVo);
//                }
//                if (flag737){
//                    updateYanPan("737",yanPanVo);
//                }
//                if (flag738){
//                    updateYanPan("738",yanPanVo);
//                }
//                if (flag739){
//                    updateYanPan("739",yanPanVo);
//                }
//                if (flag740){
//                    updateYanPan("740",yanPanVo);
//                }
//                if (flag741){
//                    updateYanPan("741",yanPanVo);
//                }
//                if (flag742){
//                    updateYanPan("742",yanPanVo);
//                }
//                if (flag743){
//                    updateYanPan("743",yanPanVo);
//                }
//                if (flag744){
//                    updateYanPan("744",yanPanVo);
//                }
//                if (flag745){
//                    updateYanPan("745",yanPanVo);
//                }
//                if (flag746){
//                    updateYanPan("746",yanPanVo);
//                }
//                if (flag747){
//                    updateYanPan("747",yanPanVo);
//                }
//                if (flag748){
//                    updateYanPan("748",yanPanVo);
//                }
//                if (flag749){
//                    updateYanPan("749",yanPanVo);
//                }
//                if (flag750){
//                    updateYanPan("750",yanPanVo);
//                }
//                if (flag751){
//                    updateYanPan("751",yanPanVo);
//                }
//                if (flag752){
//                    updateYanPan("752",yanPanVo);
//                }
//                if (flag753){
//                    updateYanPan("753",yanPanVo);
//                }

//                if (flag1010){
//                    updateYanPan("1010",yanPanVo);
//                }
//                if (flag1011){
//                    updateYanPan("1011",yanPanVo);
//                }
//                if (flag1012){
//                    updateYanPan("1012",yanPanVo);
//                }
//                if (flag1013){
//                    updateYanPan("1013",yanPanVo);
//                }
//                if (flag1014){
//                    updateYanPan("1014",yanPanVo);
//                }
//                if (flag1015){
//                    updateYanPan("1015",yanPanVo);
//                }
//                if (flag1016){
//                    updateYanPan("1016",yanPanVo);
//                }
//                if (flag1017){
//                    updateYanPan("1017",yanPanVo);
//                }
//                if (flag1018){
//                    updateYanPan("1018",yanPanVo);
//                }
//                if (flag1019){
//                    updateYanPan("1019",yanPanVo);
//                }
//                if (flag1020){
//                    updateYanPan("1020",yanPanVo);
//                }
//                if (flag1021){
//                    updateYanPan("1021",yanPanVo);
//                }
//                if (flag1022){
//                    updateYanPan("1022",yanPanVo);
//                }
//                if (flag1023){
//                    updateYanPan("1023",yanPanVo);
//                }
//                if (flag1024){
//                    updateYanPan("1024",yanPanVo);
//                }
//                if (flag1025){
//                    updateYanPan("1025",yanPanVo);
//                }
//                if (flag1026){
//                    updateYanPan("1026",yanPanVo);
//                }
//                if (flag1027){
//                    updateYanPan("1027",yanPanVo);
//                }
//                if (flag1028){
//                    updateYanPan("1028",yanPanVo);
//                }
//                if (flag1029){
//                    updateYanPan("1029",yanPanVo);
//                }
//                if (flag1030){
//                    updateYanPan("1030",yanPanVo);
//                }
//                if (flag1031){
//                    updateYanPan("1031",yanPanVo);
//                }
//                if (flag1032){
//                    updateYanPan("1032",yanPanVo);
//                }
//                if (flag1033){
//                    updateYanPan("1033",yanPanVo);
//                }
//                if (flag1034){
//                    updateYanPan("1034",yanPanVo);
//                }
//                if (flag1035){
//                    updateYanPan("1035",yanPanVo);
//                }
//                if (flag1036){
//                    updateYanPan("1036",yanPanVo);
//                }
//                if (flag1037){
//                    updateYanPan("1037",yanPanVo);
//                }
//                if (flag1040){
//                    updateYanPan("1040",yanPanVo);
//                }
//                if (flag1041){
//                    updateYanPan("1041",yanPanVo);
//                }
//                if (flag1042){
//                    updateYanPan("1042",yanPanVo);
//                }
//                if (flag1043){
//                    updateYanPan("1043",yanPanVo);
//                }
//                if (flag1044){
//                    updateYanPan("1044",yanPanVo);
//                }
//                if (flag1045){
//                    updateYanPan("1045",yanPanVo);
//                }
//                if (flag1046){
//                    updateYanPan("1046",yanPanVo);
//                }
//                if (flag1047){
//                    updateYanPan("1047",yanPanVo);
//                }
//                if (flag1048){
//                    updateYanPan("1048",yanPanVo);
//                }
//                if (flag1049){
//                    updateYanPan("1049",yanPanVo);
//                }
//                if (flag1050){
//                    updateYanPan("1050",yanPanVo);
//                }
//                if (flag1051){
//                    updateYanPan("1051",yanPanVo);
//                }
//                if (flag1052){
//                    updateYanPan("1052",yanPanVo);
//                }
//                if (flag1053){
//                    updateYanPan("1053",yanPanVo);
//                }
//                if (flag1054){
//                    updateYanPan("1054",yanPanVo);
//                }
//                if (flag1055){
//                    updateYanPan("1055",yanPanVo);
//                }
//                if (flag1056){
//                    updateYanPan("1056",yanPanVo);
//                }
//                if (flag1057){
//                    updateYanPan("1057",yanPanVo);
//                }
//                if (flag1058){
//                    updateYanPan("1058",yanPanVo);
//                }
//                if (flag1059){
//                    updateYanPan("1059",yanPanVo);
//                }
//                if (flag1060){
//                    updateYanPan("1060",yanPanVo);
//                }
//                if (flag1061){
//                    updateYanPan("1061",yanPanVo);
//                }
//                if (flag1062){
//                    updateYanPan("1062",yanPanVo);
//                }
//                if (flag1063){
//                    updateYanPan("1063",yanPanVo);
//                }
//                if (flag1064){
//                    updateYanPan("1064",yanPanVo);
//                }
//                if (flag1065){
//                    updateYanPan("1065",yanPanVo);
//                }
//                if (flag1066){
//                    updateYanPan("1066",yanPanVo);
//                }
//                if (flag1067){
//                    updateYanPan("1067",yanPanVo);
//                }
//                if (flag1068){
//                    updateYanPan("1068",yanPanVo);
//                }
//
//                if (flag1069){
//                    updateYanPan("1069",yanPanVo);
//                }
//                if (flag1070){
//                    updateYanPan("1070",yanPanVo);
//                }
//                if (flag1071){
//                    updateYanPan("1071",yanPanVo);
//                }
//                if (flag1072){
//                    updateYanPan("1072",yanPanVo);
//                }
//                if (flag1073){
//                    updateYanPan("1073",yanPanVo);
//                }
//                if (flag1074){
//                    updateYanPan("1074",yanPanVo);
//                }
//                if (flag1075){
//                    updateYanPan("1075",yanPanVo);
//                }
//                if (flag1076){
//                    updateYanPan("1076",yanPanVo);
//                }
//                if (flag1077){
//                    updateYanPan("1077",yanPanVo);
//                }
//                if (flag1078){
//                    updateYanPan("1078",yanPanVo);
//                }
//                if (flag1079){
//                    updateYanPan("1079",yanPanVo);
//                }
//                if (flag1080){
//                    updateYanPan("1080",yanPanVo);
//                }
//                if (flag1081){
//                    updateYanPan("1081",yanPanVo);
//                }
//
//                if (flag1082){
//                    updateYanPan("1082",yanPanVo);
//                }
//                if (flag1083){
//                    updateYanPan("1083",yanPanVo);
//                }
//                if (flag1084){
//                    updateYanPan("1084",yanPanVo);
//                }
//                if (flag1085){
//                    updateYanPan("1085",yanPanVo);
//                }
//                if (flag1086){
//                    updateYanPan("1086",yanPanVo);
//                }
//                if (flag1087){
//                    updateYanPan("1087",yanPanVo);
//                }
//                if (flag1088){
//                    updateYanPan("1088",yanPanVo);
//                }
//                if (flag1089){
//                    updateYanPan("1089",yanPanVo);
//                }
//                if (flag1090){
//                    updateYanPan("1090",yanPanVo);
//                }
//                if (flag1091){
//                    updateYanPan("1091",yanPanVo);
//                }
//                if (flag1092){
//                    updateYanPan("1092",yanPanVo);
//                }
//                if (flag1093){
//                    updateYanPan("1093",yanPanVo);
//                }
//                if (flag1094){
//                    updateYanPan("1094",yanPanVo);
//                }
//                if (flag1095){
//                    updateYanPan("1095",yanPanVo);
//                }
//                if (flag1096){
//                    updateYanPan("1096",yanPanVo);
//                }
//                if (flag1097){
//                    updateYanPan("1097",yanPanVo);
//                }
//                if (flag1098){
//                    updateYanPan("1098",yanPanVo);
//                }
//                if (flag1099){
//                    updateYanPan("1099",yanPanVo);
//                }
//                if (flag1100){
//                    updateYanPan("1100",yanPanVo);
//                }
//                if (flag1101){
//                    updateYanPan("1101",yanPanVo);
//                }
//                if (flag1102){
//                    updateYanPan("1102",yanPanVo);
//                }
//                if (flag1103){
//                    updateYanPan("1103",yanPanVo);
//                }
//                if (flag1104){
//                    updateYanPan("1104",yanPanVo);
//                }
//                if (flag1105){
//                    updateYanPan("1105",yanPanVo);
//                }
//                if (flag1106){
//                    updateYanPan("1106",yanPanVo);
//                }
//                if (flag1107){
//                    updateYanPan("1107",yanPanVo);
//                }
//
//                if (flag1108){
//                    updateYanPan("1108",yanPanVo);
//                }
//                if (flag1109){
//                    updateYanPan("1109",yanPanVo);
//                }
//                if (flag1110){
//                    updateYanPan("1110",yanPanVo);
//                }
//                if (flag1111){
//                    updateYanPan("1111",yanPanVo);
//                }
//                if (flag1112){
//                    updateYanPan("1112",yanPanVo);
//                }
//                if (flag1113){
//                    updateYanPan("1113",yanPanVo);
//                }
//                if (flag1114){
//                    updateYanPan("1114",yanPanVo);
//                }
//                if (flag1115){
//                    updateYanPan("1115",yanPanVo);
//                }
//                if (flag1116){
//                    updateYanPan("1116",yanPanVo);
//                }
//                if (flag1117){
//                    updateYanPan("1117",yanPanVo);
//                }
//                if (flag1118){
//                    updateYanPan("1118",yanPanVo);
//                }
//                if (flag1119){
//                    updateYanPan("1119",yanPanVo);
//                }
//                if (flag1120){
//                    updateYanPan("1120",yanPanVo);
//                }
//                if (flag1121){
//                    updateYanPan("1121",yanPanVo);
//                }
//                if (flag1122){
//                    updateYanPan("1122",yanPanVo);
//                }
//                if (flag1123){
//                    updateYanPan("1123",yanPanVo);
//                }
//                if (flag1124){
//                    updateYanPan("1124",yanPanVo);
//                }
//                if (flag1125){
//                    updateYanPan("1125",yanPanVo);
//                }
//                if (flag1126){
//                    updateYanPan("1126",yanPanVo);
//                }
//                if (flag1127){
//                    updateYanPan("1127",yanPanVo);
//                }
//                if (flag1128){
//                    updateYanPan("1128",yanPanVo);
//                }
//                if (flag1129){
//                    updateYanPan("1129",yanPanVo);
//                }
//                if (flag1130){
//                    updateYanPan("1130",yanPanVo);
//                }
//                if (flag1131){
//                    updateYanPan("1131",yanPanVo);
//                }
//                if (flag1132){
//                    updateYanPan("1132",yanPanVo);
//                }
//                if (flag1133){
//                    updateYanPan("1133",yanPanVo);
//                }
//                if (flag1134){
//                    updateYanPan("1134",yanPanVo);
//                }
//                if (flag1135){
//                    updateYanPan("1135",yanPanVo);
//                }
//                if (flag1136){
//                    updateYanPan("1136",yanPanVo);
//                }
//                if (flag1137){
//                    updateYanPan("1137",yanPanVo);
//                }
//                if (flag1138){
//                    updateYanPan("1138",yanPanVo);
//                }
//                if (flag1139){
//                    updateYanPan("1139",yanPanVo);
//                }
//                if (flag1140){
//                    updateYanPan("1140",yanPanVo);
//                }
//                if (flag1141){
//                    updateYanPan("1141",yanPanVo);
//                }
//                if (flag1142){
//                    updateYanPan("1142",yanPanVo);
//                }
//                if (flag1143){
//                    updateYanPan("1143",yanPanVo);
//                }
//                if (flag1144){
//                    updateYanPan("1144",yanPanVo);
//                }
//                if (flag1145){
//                    updateYanPan("1145",yanPanVo);
//                }
//                if (flag1146){
//                    updateYanPan("1146",yanPanVo);
//                }
//                if (flag1147){
//                    updateYanPan("1147",yanPanVo);
//                }
//                if (flag1148){
//                    updateYanPan("1148",yanPanVo);
//                }
//                if (flag1149){
//                    updateYanPan("1149",yanPanVo);
//                }
//                if (flag1150){
//                    updateYanPan("1150",yanPanVo);
//                }
//                if (flag1151){
//                    updateYanPan("1151",yanPanVo);
//                }
//                if (flag1152){
//                    updateYanPan("1152",yanPanVo);
//                }
//                if (flag1153){
//                    updateYanPan("1153",yanPanVo);
//                }
//                if (flag1154){
//                    updateYanPan("1154",yanPanVo);
//                }
//                if (flag1155){
//                    updateYanPan("1155",yanPanVo);
//                }
//                if (flag1156){
//                    updateYanPan("1156",yanPanVo);
//                }
//                if (flag1157){
//                    updateYanPan("1157",yanPanVo);
//                }
//                if (flag1158){
//                    updateYanPan("1158",yanPanVo);
//                }
//                if (flag1159){
//                    updateYanPan("1159",yanPanVo);
//                }
//                if (flag1160){
//                    updateYanPan("1160",yanPanVo);
//                }
//                if (flag1161){
//                    updateYanPan("1161",yanPanVo);
//                }
//                if (flag1162){
//                    updateYanPan("1162",yanPanVo);
//                }
//                if (flag1163){
//                    updateYanPan("1163",yanPanVo);
//                }
//                if (flag1164){
//                    updateYanPan("1164",yanPanVo);
//                }
//                if (flag1165){
//                    updateYanPan("1165",yanPanVo);
//                }
//                if (flag1166){
//                    updateYanPan("1166",yanPanVo);
//                }
//                if (flag1167){
//                    updateYanPan("1167",yanPanVo);
//                }
//                if (flag1168){
//                    updateYanPan("1168",yanPanVo);
//                }
//                if (flag1169){
//                    updateYanPan("1169",yanPanVo);
//                }
//                if (flag1170){
//                    updateYanPan("1170",yanPanVo);
//                }
//                if (flag1171){
//                    updateYanPan("1171",yanPanVo);
//                }
//                if (flag1172){
//                    updateYanPan("1172",yanPanVo);
//                }
//                if (flag1173){
//                    updateYanPan("1173",yanPanVo);
//                }
//                if (flag1174){
//                    updateYanPan("1174",yanPanVo);
//                }
//                if (flag1175){
//                    updateYanPan("1175",yanPanVo);
//                }
//                if (flag1176){
//                    updateYanPan("1176",yanPanVo);
//                }
//                if (flag1177){
//                    updateYanPan("1177",yanPanVo);
//                }
//                if (flag1178){
//                    updateYanPan("1178",yanPanVo);
//                }
//                if (flag1179){
//                    updateYanPan("1179",yanPanVo);
//                }
//                if (flag1180){
//                    updateYanPan("1180",yanPanVo);
//                }
//                if (flag1181){
//                    updateYanPan("1181",yanPanVo);
//                }
//                if (flag1182){
//                    updateYanPan("1182",yanPanVo);
//                }
//                if (flag1183){
//                    updateYanPan("1183",yanPanVo);
//                }
//                if (flag1184){
//                    updateYanPan("1184",yanPanVo);
//                }
//                if (flag1185){
//                    updateYanPan("1185",yanPanVo);
//                }
//                if (flag1186){
//                    updateYanPan("1186",yanPanVo);
//                }
//                if (flag1187){
//                    updateYanPan("1187",yanPanVo);
//                }
//                if (flag1188){
//                    updateYanPan("1188",yanPanVo);
//                }
//                if (flag1189){
//                    updateYanPan("1189",yanPanVo);
//                }
//                if (flag1190){
//                    updateYanPan("1190",yanPanVo);
//                }
//                if (flag1191){
//                    updateYanPan("1191",yanPanVo);
//                }
//                if (flag1192){
//                    updateYanPan("1192",yanPanVo);
//                }
//                if (flag1193){
//                    updateYanPan("1193",yanPanVo);
//                }
//                if (flag1194){
//                    updateYanPan("1194",yanPanVo);
//                }
//                if (flag1195){
//                    updateYanPan("1195",yanPanVo);
//                }
//                if (flag1196){
//                    updateYanPan("1196",yanPanVo);
//                }
//                if (flag1197){
//                    updateYanPan("1197",yanPanVo);
//                }
//                if (flag1198){
//                    updateYanPan("1198",yanPanVo);
//                }
//                if (flag1199){
//                    updateYanPan("1199",yanPanVo);
//                }
//                if (flag1200){
//                    updateYanPan("1200",yanPanVo);
//                }
//                if (flag1201){
//                    updateYanPan("1201",yanPanVo);
//                }
//                if (flag1202){
//                    updateYanPan("1202",yanPanVo);
//                }
//                if (flag1203){
//                    updateYanPan("1203",yanPanVo);
//                }
//                if (flag1204){
//                    updateYanPan("1204",yanPanVo);
//                }
//                if (flag1205){
//                    updateYanPan("1205",yanPanVo);
//                }
//                if (flag1206){
//                    updateYanPan("1206",yanPanVo);
//                }
//                if (flag1207){
//                    updateYanPan("1207",yanPanVo);
//                }
//                if (flag1208){
//                    updateYanPan("1208",yanPanVo);
//                }
//                if (flag1209){
//                    updateYanPan("1209",yanPanVo);
//                }
//                if (flag1210){
//                    updateYanPan("1210",yanPanVo);
//                }
//                if (flag1211){
//                    updateYanPan("1211",yanPanVo);
//                }
//
//                if (flag1212){
//                    updateYanPan("1212",yanPanVo);
//                }
//                if (flag1213){
//                    updateYanPan("1213",yanPanVo);
//                }
//                if (flag1214){
//                    updateYanPan("1214",yanPanVo);
//                }
//                if (flag1215){
//                    updateYanPan("1215",yanPanVo);
//                }
//                if (flag1216){
//                    updateYanPan("1216",yanPanVo);
//                }
//                if (flag1217){
//                    updateYanPan("1217",yanPanVo);
//                }
//                if (flag1218){
//                    updateYanPan("1218",yanPanVo);
//                }
//                if (flag1219){
//                    updateYanPan("1219",yanPanVo);
//                }
//                if (flag1220){
//                    updateYanPan("1220",yanPanVo);
//                }
//                if (flag1221){
//                    updateYanPan("1221",yanPanVo);
//                }
//                if (flag1222){
//                    updateYanPan("1222",yanPanVo);
//                }
//                if (flag1223){
//                    updateYanPan("1223",yanPanVo);
//                }
//                if (flag1224){
//                    updateYanPan("1224",yanPanVo);
//                }
//                if (flag1225){
//                    updateYanPan("1225",yanPanVo);
//                }
//                if (flag1226){
//                    updateYanPan("1226",yanPanVo);
//                }
//                if (flag1227){
//                    updateYanPan("1227",yanPanVo);
//                }
//                if (flag1228){
//                    updateYanPan("1228",yanPanVo);
//                }
//                if (flag1229){
//                    updateYanPan("1229",yanPanVo);
//                }
//                if (flag1230){
//                    updateYanPan("1230",yanPanVo);
//                }
//                if (flag1231){
//                    updateYanPan("1231",yanPanVo);
//                }
//                if (flag1232){
//                    updateYanPan("1232",yanPanVo);
//                }
//                if (flag1233){
//                    updateYanPan("1233",yanPanVo);
//                }
//                if (flag1234){
//                    updateYanPan("1234",yanPanVo);
//                }
//                if (flag1235){
//                    updateYanPan("1235",yanPanVo);
//                }
//                if (flag1236){
//                    updateYanPan("1236",yanPanVo);
//                }
//                if (flag1237){
//                    updateYanPan("1237",yanPanVo);
//                }
//                if (flag1238){
//                    updateYanPan("1238",yanPanVo);
//                }
//                if (flag1239){
//                    updateYanPan("1239",yanPanVo);
//                }
//                if (flag1240){
//                    updateYanPan("1240",yanPanVo);
//                }
//                if (flag1241){
//                    updateYanPan("1241",yanPanVo);
//                }
//                if (flag1242){
//                    updateYanPan("1242",yanPanVo);
//                }
//                if (flag1243){
//                    updateYanPan("1243",yanPanVo);
//                }
//                if (flag1244){
//                    updateYanPan("1244",yanPanVo);
//                }
//                if (flag1245){
//                    updateYanPan("1245",yanPanVo);
//                }
//                if (flag1246){
//                    updateYanPan("1246",yanPanVo);
//                }
//                if (flag1247){
//                    updateYanPan("1247",yanPanVo);
//                }
//                if (flag1248){
//                    updateYanPan("1248",yanPanVo);
//                }
//                if (flag1249){
//                    updateYanPan("1249",yanPanVo);
//                }
//                if (flag1250){
//                    updateYanPan("1250",yanPanVo);
//                }
//                if (flag1251){
//                    updateYanPan("1251",yanPanVo);
//                }
//                if (flag1252){
//                    updateYanPan("1252",yanPanVo);
//                }
//                if (flag1253){
//                    updateYanPan("1253",yanPanVo);
//                }
//                if (flag1254){
//                    updateYanPan("1254",yanPanVo);
//                }
//                if (flag1255){
//                    updateYanPan("1255",yanPanVo);
//                }
//                if (flag1256){
//                    updateYanPan("1256",yanPanVo);
//                }
//                if (flag1257){
//                    updateYanPan("1257",yanPanVo);
//                }
//                if (flag1258){
//                    updateYanPan("1258",yanPanVo);
//                }
//                if (flag1259){
//                    updateYanPan("1259",yanPanVo);
//                }
//                if (flag1260){
//                    updateYanPan("1260",yanPanVo);
//                }
//                if (flag1261){
//                    updateYanPan("1261",yanPanVo);
//                }
//                if (flag1262){
//                    updateYanPan("1262",yanPanVo);
//                }
//                if (flag1263){
//                    updateYanPan("1263",yanPanVo);
//                }
//                if (flag1264){
//                    updateYanPan("1264",yanPanVo);
//                }
//                if (flag1265){
//                    updateYanPan("1265",yanPanVo);
//                }
//                if (flag1266){
//                    updateYanPan("1266",yanPanVo);
//                }
//                if (flag1267){
//                    updateYanPan("1267",yanPanVo);
//                }
//                if (flag1268){
//                    updateYanPan("1268",yanPanVo);
//                }
//                if (flag1269){
//                    updateYanPan("1269",yanPanVo);
//                }
//                if (flag1270){
//                    updateYanPan("1270",yanPanVo);
//                }
//                if (flag1271){
//                    updateYanPan("1271",yanPanVo);
//                }
//                if (flag1272){
//                    updateYanPan("1272",yanPanVo);
//                }
//                if (flag1273){
//                    updateYanPan("1273",yanPanVo);
//                }
//                if (flag1274){
//                    updateYanPan("1274",yanPanVo);
//                }
//                if (flag1275){
//                    updateYanPan("1275",yanPanVo);
//                }
//                if (flag1276){
//                    updateYanPan("1276",yanPanVo);
//                }
//                if (flag1277){
//                    updateYanPan("1277",yanPanVo);
//                }
//                if (flag1278){
//                    updateYanPan("1278",yanPanVo);
//                }
//                if (flag1279){
//                    updateYanPan("1279",yanPanVo);
//                }
//                if (flag1280){
//                    updateYanPan("1280",yanPanVo);
//                }
//                if (flag1281){
//                    updateYanPan("1281",yanPanVo);
//                }
//
//                if (flag1282){
//                    updateYanPan("1282",yanPanVo);
//                }
//                if (flag1283){
//                    updateYanPan("1283",yanPanVo);
//                }
//                if (flag1284){
//                    updateYanPan("1284",yanPanVo);
//                }
//                if (flag1285){
//                    updateYanPan("1285",yanPanVo);
//                }
//                if (flag1286){
//                    updateYanPan("1286",yanPanVo);
//                }
//                if (flag1287){
//                    updateYanPan("1287",yanPanVo);
//                }
//                if (flag1288){
//                    updateYanPan("1288",yanPanVo);
//                }
//                if (flag1289){
//                    updateYanPan("1289",yanPanVo);
//                }
//                if (flag1290){
//                    updateYanPan("1290",yanPanVo);
//                }
//                if (flag1291){
//                    updateYanPan("1291",yanPanVo);
//                }
//                if (flag1292){
//                    updateYanPan("1292",yanPanVo);
//                }
//                if (flag1293){
//                    updateYanPan("1293",yanPanVo);
//                }
//                if (flag1294){
//                    updateYanPan("1294",yanPanVo);
//                }
//                if (flag1295){
//                    updateYanPan("1295",yanPanVo);
//                }
//                if (flag1296){
//                    updateYanPan("1296",yanPanVo);
//                }
//                if (flag1297){
//                    updateYanPan("1297",yanPanVo);
//                }
//                if (flag1298){
//                    updateYanPan("1298",yanPanVo);
//                }
//                if (flag1299){
//                    updateYanPan("1299",yanPanVo);
//                }
//                if (flag1300){
//                    updateYanPan("1300",yanPanVo);
//                }
//                if (flag1301){
//                    updateYanPan("1301",yanPanVo);
//                }
//                if (flag1302){
//                    updateYanPan("1302",yanPanVo);
//                }
//                if (flag1303){
//                    updateYanPan("1303",yanPanVo);
//                }
//                if (flag1304){
//                    updateYanPan("1304",yanPanVo);
//                }
//                if (flag1305){
//                    updateYanPan("1305",yanPanVo);
//                }
//                if (flag1306){
//                    updateYanPan("1306",yanPanVo);
//                }
//                if (flag1307){
//                    updateYanPan("1307",yanPanVo);
//                }
//                if (flag1308){
//                    updateYanPan("1308",yanPanVo);
//                }
//                if (flag1309){
//                    updateYanPan("1309",yanPanVo);
//                }
//                if (flag1310){
//                    updateYanPan("1310",yanPanVo);
//                }
//                if (flag1311){
//                    updateYanPan("1311",yanPanVo);
//                }
//                if (flag1312){
//                    updateYanPan("1312",yanPanVo);
//                }
//                if (flag1313){
//                    updateYanPan("1313",yanPanVo);
//                }
//                if (flag1314){
//                    updateYanPan("1314",yanPanVo);
//                }
//                if (flag1315){
//                    updateYanPan("1315",yanPanVo);
//                }
//                if (flag1316){
//                    updateYanPan("1316",yanPanVo);
//                }
//                if (flag1317){
//                    updateYanPan("1317",yanPanVo);
//                }
//                if (flag1318){
//                    updateYanPan("1318",yanPanVo);
//                }
//                if (flag1319){
//                    updateYanPan("1319",yanPanVo);
//                }
//                if (flag1320){
//                    updateYanPan("1320",yanPanVo);
//                }
//                if (flag1321){
//                    updateYanPan("1321",yanPanVo);
//                }
//
//                if (flag1322){
//                    updateYanPan("1322",yanPanVo);
//                }
//                if (flag1323){
//                    updateYanPan("1323",yanPanVo);
//                }
//                if (flag1324){
//                    updateYanPan("1324",yanPanVo);
//                }
//                if (flag1325){
//                    updateYanPan("1325",yanPanVo);
//                }
//                if (flag1326){
//                    updateYanPan("1326",yanPanVo);
//                }
//                if (flag1327){
//                    updateYanPan("1327",yanPanVo);
//                }
//                if (flag1328){
//                    updateYanPan("1328",yanPanVo);
//                }
//                if (flag1329){
//                    updateYanPan("1329",yanPanVo);
//                }
//                if (flag1330){
//                    updateYanPan("1330",yanPanVo);
//                }
//                if (flag1331){
//                    updateYanPan("1331",yanPanVo);
//                }
//                if (flag1332){
//                    updateYanPan("1332",yanPanVo);
//                }
//                if (flag1333){
//                    updateYanPan("1333",yanPanVo);
//                }
//                if (flag1334){
//                    updateYanPan("1334",yanPanVo);
//                }
//                if (flag1335){
//                    updateYanPan("1335",yanPanVo);
//                }
//                if (flag1336){
//                    updateYanPan("1336",yanPanVo);
//                }
//                if (flag1337){
//                    updateYanPan("1337",yanPanVo);
//                }
//                if (flag1338){
//                    updateYanPan("1338",yanPanVo);
//                }
//                if (flag1339){
//                    updateYanPan("1339",yanPanVo);
//                }
//                if (flag1340){
//                    updateYanPan("1340",yanPanVo);
//                }
//                if (flag1341){
//                    updateYanPan("1341",yanPanVo);
//                }
//                if (flag1342){
//                    updateYanPan("1342",yanPanVo);
//                }
//                if (flag1343){
//                    updateYanPan("1343",yanPanVo);
//                }
//                if (flag1344){
//                    updateYanPan("1344",yanPanVo);
//                }
//                if (flag1345){
//                    updateYanPan("1345",yanPanVo);
//                }
//                if (flag1346){
//                    updateYanPan("1346",yanPanVo);
//                }
//                if (flag1347){
//                    updateYanPan("1347",yanPanVo);
//                }
//                if (flag1348){
//                    updateYanPan("1348",yanPanVo);
//                }
//                if (flag1349){
//                    updateYanPan("1349",yanPanVo);
//                }
//                if (flag1350){
//                    updateYanPan("1350",yanPanVo);
//                }
//                if (flag1351){
//                    updateYanPan("1351",yanPanVo);
//                }
//                if (flag1352){
//                    updateYanPan("1352",yanPanVo);
//                }
//                if (flag1353){
//                    updateYanPan("1353",yanPanVo);
//                }
//                if (flag1354){
//                    updateYanPan("1354",yanPanVo);
//                }
//                if (flag1355){
//                    updateYanPan("1355",yanPanVo);
//                }
//                if (flag1356){
//                    updateYanPan("1356",yanPanVo);
//                }
//                if (flag1357){
//                    updateYanPan("1357",yanPanVo);
//                }
//                if (flag1358){
//                    updateYanPan("1358",yanPanVo);
//                }
//                if (flag1359){
//                    updateYanPan("1359",yanPanVo);
//                }
//                if (flag1360){
//                    updateYanPan("1360",yanPanVo);
//                }
//                if (flag1361){
//                    updateYanPan("1361",yanPanVo);
//                }
//                if (flag1362){
//                    updateYanPan("1362",yanPanVo);
//                }
//                if (flag1363){
//                    updateYanPan("1363",yanPanVo);
//                }
//                if (flag1364){
//                    updateYanPan("1364",yanPanVo);
//                }
//                if (flag1365){
//                    updateYanPan("1365",yanPanVo);
//                }
//                if (flag1366){
//                    updateYanPan("1366",yanPanVo);
//                }
//                if (flag1367){
//                    updateYanPan("1367",yanPanVo);
//                }
//                if (flag1368){
//                    updateYanPan("1368",yanPanVo);
//                }
//
//                if (flag1369){
//                    updateYanPan("1369",yanPanVo);
//                }
//                if (flag1370){
//                    updateYanPan("1370",yanPanVo);
//                }
//                if (flag1371){
//                    updateYanPan("1371",yanPanVo);
//                }
//                if (flag1372){
//                    updateYanPan("1372",yanPanVo);
//                }
//                if (flag1373){
//                    updateYanPan("1373",yanPanVo);
//                }
//                if (flag1374){
//                    updateYanPan("1374",yanPanVo);
//                }
//                if (flag1375){
//                    updateYanPan("1375",yanPanVo);
//                }
//                if (flag1376){
//                    updateYanPan("1376",yanPanVo);
//                }
//                if (flag1377){
//                    updateYanPan("1377",yanPanVo);
//                }
//                if (flag1378){
//                    updateYanPan("1378",yanPanVo);
//                }
//                if (flag1379){
//                    updateYanPan("1379",yanPanVo);
//                }
//                if (flag1380){
//                    updateYanPan("1380",yanPanVo);
//                }
//                if (flag1381){
//                    updateYanPan("1381",yanPanVo);
//                }
//
//                if (flag1382){
//                    updateYanPan("1382",yanPanVo);
//                }
//                if (flag1383){
//                    updateYanPan("1383",yanPanVo);
//                }
//                if (flag1384){
//                    updateYanPan("1384",yanPanVo);
//                }
//                if (flag1385){
//                    updateYanPan("1385",yanPanVo);
//                }
//                if (flag1386){
//                    updateYanPan("1386",yanPanVo);
//                }
//                if (flag1387){
//                    updateYanPan("1387",yanPanVo);
//                }
//                if (flag1388){
//                    updateYanPan("1388",yanPanVo);
//                }
//                if (flag1389){
//                    updateYanPan("1389",yanPanVo);
//                }
//                if (flag1390){
//                    updateYanPan("1390",yanPanVo);
//                }
//                if (flag1391){
//                    updateYanPan("1391",yanPanVo);
//                }
//                if (flag1392){
//                    updateYanPan("1392",yanPanVo);
//                }
//                if (flag1393){
//                    updateYanPan("1393",yanPanVo);
//                }
//                if (flag1394){
//                    updateYanPan("1394",yanPanVo);
//                }
//                if (flag1395){
//                    updateYanPan("1395",yanPanVo);
//                }
//                if (flag1396){
//                    updateYanPan("1396",yanPanVo);
//                }
//                if (flag1397){
//                    updateYanPan("1397",yanPanVo);
//                }
//                if (flag1398){
//                    updateYanPan("1398",yanPanVo);
//                }
//                if (flag1399){
//                    updateYanPan("1399",yanPanVo);
//                }
//                if (flag1400){
//                    updateYanPan("1400",yanPanVo);
//                }
//                if (flag1401){
//                    updateYanPan("1401",yanPanVo);
//                }
//                if (flag1402){
//                    updateYanPan("1402",yanPanVo);
//                }
//                if (flag1403){
//                    updateYanPan("1403",yanPanVo);
//                }
//                if (flag1404){
//                    updateYanPan("1404",yanPanVo);
//                }
//                if (flag1405){
//                    updateYanPan("1405",yanPanVo);
//                }
//                if (flag1406){
//                    updateYanPan("1406",yanPanVo);
//                }
//                if (flag1407){
//                    updateYanPan("1407",yanPanVo);
//                }
//                if (flag1408){
//                    updateYanPan("1408",yanPanVo);
//                }
//                if (flag1409){
//                    updateYanPan("1409",yanPanVo);
//                }
//                if (flag1410){
//                    updateYanPan("1410",yanPanVo);
//                }
//                if (flag1411){
//                    updateYanPan("1411",yanPanVo);
//                }
//                if (flag1412){
//                    updateYanPan("1412",yanPanVo);
//                }
//                if (flag1413){
//                    updateYanPan("1413",yanPanVo);
//                }
//                if (flag1414){
//                    updateYanPan("1414",yanPanVo);
//                }
//                if (flag1415){
//                    updateYanPan("1415",yanPanVo);
//                }
//                if (flag1416){
//                    updateYanPan("1416",yanPanVo);
//                }
//                if (flag1417){
//                    updateYanPan("1417",yanPanVo);
//                }
//                if (flag1418){
//                    updateYanPan("1418",yanPanVo);
//                }
//                if (flag1419){
//                    updateYanPan("1419",yanPanVo);
//                }
//                if (flag1420){
//                    updateYanPan("1420",yanPanVo);
//                }
//                if (flag1421){
//                    updateYanPan("1421",yanPanVo);
//                }
//                if (flag1422){
//                    updateYanPan("1422",yanPanVo);
//                }
//                if (flag1423){
//                    updateYanPan("1423",yanPanVo);
//                }
//                if (flag1424){
//                    updateYanPan("1424",yanPanVo);
//                }
//                if (flag1425){
//                    updateYanPan("1425",yanPanVo);
//                }
//                if (flag1426){
//                    updateYanPan("1426",yanPanVo);
//                }
//                if (flag1427){
//                    updateYanPan("1427",yanPanVo);
//                }
//                if (flag1428){
//                    updateYanPan("1428",yanPanVo);
//                }
//                if (flag1429){
//                    updateYanPan("1429",yanPanVo);
//                }
//                if (flag1430){
//                    updateYanPan("1430",yanPanVo);
//                }
//                if (flag1431){
//                    updateYanPan("1431",yanPanVo);
//                }
//                if (flag1432){
//                    updateYanPan("1432",yanPanVo);
//                }
//                if (flag1433){
//                    updateYanPan("1433",yanPanVo);
//                }
//                if (flag1434){
//                    updateYanPan("1434",yanPanVo);
//                }
//                if (flag1435){
//                    updateYanPan("1435",yanPanVo);
//                }
//                if (flag1436){
//                    updateYanPan("1436",yanPanVo);
//                }
//                if (flag1437){
//                    updateYanPan("1437",yanPanVo);
//                }
//                if (flag1438){
//                    updateYanPan("1438",yanPanVo);
//                }
//                if (flag1439){
//                    updateYanPan("1439",yanPanVo);
//                }
//                if (flag1440){
//                    updateYanPan("1440",yanPanVo);
//                }
//                if (flag1441){
//                    updateYanPan("1441",yanPanVo);
//                }
//                if (flag1442){
//                    updateYanPan("1442",yanPanVo);
//                }
//                if (flag1443){
//                    updateYanPan("1443",yanPanVo);
//                }
//                if (flag1444){
//                    updateYanPan("1444",yanPanVo);
//                }
//                if (flag1445){
//                    updateYanPan("1445",yanPanVo);
//                }
//                if (flag1446){
//                    updateYanPan("1446",yanPanVo);
//                }
//                if (flag1447){
//                    updateYanPan("1447",yanPanVo);
//                }
//                if (flag1448){
//                    updateYanPan("1448",yanPanVo);
//                }
//                if (flag1449){
//                    updateYanPan("1449",yanPanVo);
//                }
//                if (flag1450){
//                    updateYanPan("1450",yanPanVo);
//                }
//                if (flag1451){
//                    updateYanPan("1451",yanPanVo);
//                }
//                if (flag1452){
//                    updateYanPan("1452",yanPanVo);
//                }
//                if (flag1453){
//                    updateYanPan("1453",yanPanVo);
//                }
//                if (flag1454){
//                    updateYanPan("1454",yanPanVo);
//                }
//                if (flag1455){
//                    updateYanPan("1455",yanPanVo);
//                }
//                if (flag1456){
//                    updateYanPan("1456",yanPanVo);
//                }
//                if (flag1457){
//                    updateYanPan("1457",yanPanVo);
//                }
//                if (flag1458){
//                    updateYanPan("1458",yanPanVo);
//                }
//                if (flag1459){
//                    updateYanPan("1459",yanPanVo);
//                }
//                if (flag1460){
//                    updateYanPan("1460",yanPanVo);
//                }
//                if (flag1461){
//                    updateYanPan("1461",yanPanVo);
//                }
//                if (flag1462){
//                    updateYanPan("1462",yanPanVo);
//                }
//                if (flag1463){
//                    updateYanPan("1463",yanPanVo);
//                }
//                if (flag1464){
//                    updateYanPan("1464",yanPanVo);
//                }
//                if (flag1465){
//                    updateYanPan("1465",yanPanVo);
//                }
//                if (flag1466){
//                    updateYanPan("1466",yanPanVo);
//                }
//                if (flag1467){
//                    updateYanPan("1467",yanPanVo);
//                }
//                if (flag1468){
//                    updateYanPan("1468",yanPanVo);
//                }
//                if (flag1469){
//                    updateYanPan("1469",yanPanVo);
//                }
//                if (flag1470){
//                    updateYanPan("1470",yanPanVo);
//                }
//                if (flag1471){
//                    updateYanPan("1471",yanPanVo);
//                }
//                if (flag1472){
//                    updateYanPan("1472",yanPanVo);
//                }
//                if (flag1473){
//                    updateYanPan("1473",yanPanVo);
//                }
//                if (flag1474){
//                    updateYanPan("1474",yanPanVo);
//                }
//                if (flag1475){
//                    updateYanPan("1475",yanPanVo);
//                }
//                if (flag1476){
//                    updateYanPan("1476",yanPanVo);
//                }
//                if (flag1477){
//                    updateYanPan("1477",yanPanVo);
//                }
//                if (flag1478){
//                    updateYanPan("1478",yanPanVo);
//                }
//                if (flag1479){
//                    updateYanPan("1479",yanPanVo);
//                }
//                if (flag1480){
//                    updateYanPan("1480",yanPanVo);
//                }
//                if (flag1482){
//                    updateYanPan("1482",yanPanVo);
//                }
//                if (flag1483){
//                    updateYanPan("1483",yanPanVo);
//                }
//                if (flag1484){
//                    updateYanPan("1484",yanPanVo);
//                }
//                if (flag1485){
//                    updateYanPan("1485",yanPanVo);
//                }
//                if (flag1486){
//                    updateYanPan("1486",yanPanVo);
//                }
//                if (flag1487){
//                    updateYanPan("1487",yanPanVo);
//                }
//                if (flag1488){
//                    updateYanPan("1488",yanPanVo);
//                }
//                if (flag1489){
//                    updateYanPan("1489",yanPanVo);
//                }
//                if (flag1490){
//                    updateYanPan("1490",yanPanVo);
//                }
//                if (flag1491){
//                    updateYanPan("1491",yanPanVo);
//                }
//                if (flag1492){
//                    updateYanPan("1492",yanPanVo);
//                }
//                if (flag1493){
//                    updateYanPan("1493",yanPanVo);
//                }
//                if (flag1494){
//                    updateYanPan("1494",yanPanVo);
//                }
//                if (flag1495){
//                    updateYanPan("1495",yanPanVo);
//                }
//                if (flag1496){
//                    updateYanPan("1496",yanPanVo);
//                }
//                if (flag1497){
//                    updateYanPan("1497",yanPanVo);
//                }
//                if (flag1498){
//                    updateYanPan("1498",yanPanVo);
//                }
//                if (flag1499){
//                    updateYanPan("1499",yanPanVo);
//                }
//                if (flag1500){
//                    updateYanPan("1500",yanPanVo);
//                }
//                if (flag1501){
//                    updateYanPan("1501",yanPanVo);
//                }
//                if (flag1502){
//                    updateYanPan("1502",yanPanVo);
//                }
//                if (flag1503){
//                    updateYanPan("1503",yanPanVo);
//                }
//                if (flag1504){
//                    updateYanPan("1504",yanPanVo);
//                }
//                if (flag1505){
//                    updateYanPan("1505",yanPanVo);
//                }
//                if (flag1506){
//                    updateYanPan("1506",yanPanVo);
//                }
//                if (flag1507){
//                    updateYanPan("1507",yanPanVo);
//                }
//                if (flag1508){
//                    updateYanPan("1508",yanPanVo);
//                }
//                if (flag1509){
//                    updateYanPan("1509",yanPanVo);
//                }
//                if (flag1510){
//                    updateYanPan("1510",yanPanVo);
//                }
//                if (flag1511){
//                    updateYanPan("1511",yanPanVo);
//                }
//
//                if (flag1512){
//                    updateYanPan("1512",yanPanVo);
//                }
//                if (flag1513){
//                    updateYanPan("1513",yanPanVo);
//                }
//                if (flag1514){
//                    updateYanPan("1514",yanPanVo);
//                }
//                if (flag1515){
//                    updateYanPan("1515",yanPanVo);
//                }
//                if (flag1516){
//                    updateYanPan("1516",yanPanVo);
//                }
//                if (flag1517){
//                    updateYanPan("1517",yanPanVo);
//                }
//                if (flag1518){
//                    updateYanPan("1518",yanPanVo);
//                }
//                if (flag1519){
//                    updateYanPan("1519",yanPanVo);
//                }
//                if (flag1520){
//                    updateYanPan("1520",yanPanVo);
//                }
//                if (flag1521){
//                    updateYanPan("1521",yanPanVo);
//                }
//                if (flag1522){
//                    updateYanPan("1522",yanPanVo);
//                }
//                if (flag1523){
//                    updateYanPan("1523",yanPanVo);
//                }
//                if (flag1524){
//                    updateYanPan("1524",yanPanVo);
//                }
//                if (flag1525){
//                    updateYanPan("1525",yanPanVo);
//                }
//                if (flag1526){
//                    updateYanPan("1526",yanPanVo);
//                }
//                if (flag1527){
//                    updateYanPan("1527",yanPanVo);
//                }
//                if (flag1528){
//                    updateYanPan("1528",yanPanVo);
//                }
//                if (flag1529){
//                    updateYanPan("1529",yanPanVo);
//                }
//                if (flag1530){
//                    updateYanPan("1530",yanPanVo);
//                }
//                if (flag1531){
//                    updateYanPan("1531",yanPanVo);
//                }
//                if (flag1532){
//                    updateYanPan("1532",yanPanVo);
//                }
//                if (flag1533){
//                    updateYanPan("1533",yanPanVo);
//                }
//                if (flag1534){
//                    updateYanPan("1534",yanPanVo);
//                }
//                if (flag1535){
//                    updateYanPan("1535",yanPanVo);
//                }
//                if (flag1536){
//                    updateYanPan("1536",yanPanVo);
//                }
//                if (flag1537){
//                    updateYanPan("1537",yanPanVo);
//                }
//                if (flag1538){
//                    updateYanPan("1538",yanPanVo);
//                }
//                if (flag1539){
//                    updateYanPan("1539",yanPanVo);
//                }
//                if (flag1540){
//                    updateYanPan("1540",yanPanVo);
//                }
//                if (flag1541){
//                    updateYanPan("1541",yanPanVo);
//                }
//                if (flag1542){
//                    updateYanPan("1542",yanPanVo);
//                }
//                if (flag1543){
//                    updateYanPan("1543",yanPanVo);
//                }
//                if (flag1544){
//                    updateYanPan("1544",yanPanVo);
//                }
//                if (flag1545){
//                    updateYanPan("1545",yanPanVo);
//                }
//                if (flag1546){
//                    updateYanPan("1546",yanPanVo);
//                }
//                if (flag1547){
//                    updateYanPan("1547",yanPanVo);
//                }
//                if (flag1548){
//                    updateYanPan("1548",yanPanVo);
//                }
//                if (flag1549){
//                    updateYanPan("1549",yanPanVo);
//                }
//                if (flag1560){
//                    updateYanPan("1560",yanPanVo);
//                }
//                if (flag1561){
//                    updateYanPan("1561",yanPanVo);
//                }
//                if (flag1562){
//                    updateYanPan("1562",yanPanVo);
//                }
//                if (flag1563){
//                    updateYanPan("1563",yanPanVo);
//                }
//                if (flag1564){
//                    updateYanPan("1564",yanPanVo);
//                }
//                if (flag1565){
//                    updateYanPan("1565",yanPanVo);
//                }
//                if (flag1566){
//                    updateYanPan("1566",yanPanVo);
//                }
//                if (flag1567){
//                    updateYanPan("1567",yanPanVo);
//                }
//                if (flag1568){
//                    updateYanPan("1568",yanPanVo);
//                }
//                if (flag1569){
//                    updateYanPan("1569",yanPanVo);
//                }
//                if (flag1570){
//                    updateYanPan("1570",yanPanVo);
//                }
//                if (flag1571){
//                    updateYanPan("1571",yanPanVo);
//                }
//                if (flag1572){
//                    updateYanPan("1572",yanPanVo);
//                }
//                if (flag1573){
//                    updateYanPan("1573",yanPanVo);
//                }
//                if (flag1574){
//                    updateYanPan("1574",yanPanVo);
//                }
//                if (flag1575){
//                    updateYanPan("1575",yanPanVo);
//                }
//                if (flag1576){
//                    updateYanPan("1576",yanPanVo);
//                }
//                if (flag1577){
//                    updateYanPan("1577",yanPanVo);
//                }
//                if (flag1578){
//                    updateYanPan("1578",yanPanVo);
//                }
//                if (flag1579){
//                    updateYanPan("1579",yanPanVo);
//                }
//                if (flag1580){
//                    updateYanPan("1580",yanPanVo);
//                }
//                if (flag1581){
//                    updateYanPan("1581",yanPanVo);
//                }
//
//                if (flag1582){
//                    updateYanPan("1582",yanPanVo);
//                }
//                if (flag1583){
//                    updateYanPan("1583",yanPanVo);
//                }
//                if (flag1584){
//                    updateYanPan("1584",yanPanVo);
//                }
//                if (flag1585){
//                    updateYanPan("1585",yanPanVo);
//                }
//                if (flag1586){
//                    updateYanPan("1586",yanPanVo);
//                }
//                if (flag1587){
//                    updateYanPan("1587",yanPanVo);
//                }
//                if (flag1588){
//                    updateYanPan("1588",yanPanVo);
//                }
//                if (flag1589){
//                    updateYanPan("1589",yanPanVo);
//                }
//                if (flag1590){
//                    updateYanPan("1590",yanPanVo);
//                }
//                if (flag1591){
//                    updateYanPan("1591",yanPanVo);
//                }
//                if (flag1592){
//                    updateYanPan("1592",yanPanVo);
//                }
//                if (flag1593){
//                    updateYanPan("1593",yanPanVo);
//                }
//                if (flag1594){
//                    updateYanPan("1594",yanPanVo);
//                }
//                if (flag1595){
//                    updateYanPan("1595",yanPanVo);
//                }
//                if (flag1596){
//                    updateYanPan("1596",yanPanVo);
//                }
//                if (flag1597){
//                    updateYanPan("1597",yanPanVo);
//                }
//                if (flag1598){
//                    updateYanPan("1598",yanPanVo);
//                }
//                if (flag1599){
//                    updateYanPan("1599",yanPanVo);
//                }
//                if (flag1600){
//                    updateYanPan("1600",yanPanVo);
//                }
//                if (flag1601){
//                    updateYanPan("1601",yanPanVo);
//                }
//                if (flag1602){
//                    updateYanPan("1602",yanPanVo);
//                }
//                if (flag1603){
//                    updateYanPan("1603",yanPanVo);
//                }
//                if (flag1604){
//                    updateYanPan("1604",yanPanVo);
//                }
//                if (flag1605){
//                    updateYanPan("1605",yanPanVo);
//                }
//                if (flag1606){
//                    updateYanPan("1606",yanPanVo);
//                }
//                if (flag1607){
//                    updateYanPan("1607",yanPanVo);
//                }
//                if (flag1608){
//                    updateYanPan("1608",yanPanVo);
//                }
//                if (flag1609){
//                    updateYanPan("1609",yanPanVo);
//                }
//                if (flag1610){
//                    updateYanPan("1610",yanPanVo);
//                }
//                if (flag1611){
//                    updateYanPan("1611",yanPanVo);
//                }
//                if (flag1612){
//                    updateYanPan("1612",yanPanVo);
//                }
//                if (flag1613){
//                    updateYanPan("1613",yanPanVo);
//                }
//                if (flag1614){
//                    updateYanPan("1614",yanPanVo);
//                }
//                if (flag1615){
//                    updateYanPan("1615",yanPanVo);
//                }
//                if (flag1616){
//                    updateYanPan("1616",yanPanVo);
//                }
//                if (flag1617){
//                    updateYanPan("1617",yanPanVo);
//                }
//                if (flag1618){
//                    updateYanPan("1618",yanPanVo);
//                }
//                if (flag1619){
//                    updateYanPan("1619",yanPanVo);
//                }
//                if (flag1620){
//                    updateYanPan("1620",yanPanVo);
//                }
//                if (flag1621){
//                    updateYanPan("1621",yanPanVo);
//                }
//
//                if (flag1622){
//                    updateYanPan("1622",yanPanVo);
//                }
//                if (flag1623){
//                    updateYanPan("1623",yanPanVo);
//                }


//                if (flag1681){
//                    updateYanPan("1681",yanPanVo);
//                }
//                if (flag1682){
//                    updateYanPan("1682",yanPanVo);
//                }
//                if (flag1683){
//                    updateYanPan("1683",yanPanVo);
//                }
//                if (flag1684){
//                    updateYanPan("1684",yanPanVo);
//                }
//                if (flag1685){
//                    updateYanPan("1685",yanPanVo);
//                }
//                if (flag1686){
//                    updateYanPan("1686",yanPanVo);
//                }
//                if (flag1687){
//                    updateYanPan("1687",yanPanVo);
//                }
//                if (flag1688){
//                    updateYanPan("1688",yanPanVo);
//                }
//                if (flag1689){
//                    updateYanPan("1689",yanPanVo);
//                }
//                if (flag1690){
//                    updateYanPan("1690",yanPanVo);
//                }
//                if (flag1691){
//                    updateYanPan("1691",yanPanVo);
//                }
//                if (flag1692){
//                    updateYanPan("1692",yanPanVo);
//                }
//                if (flag1693){
//                    updateYanPan("1693",yanPanVo);
//                }
//                if (flag1694){
//                    updateYanPan("1694",yanPanVo);
//                }
//                if (flag1695){
//                    updateYanPan("1695",yanPanVo);
//                }
//                if (flag1696){
//                    updateYanPan("1696",yanPanVo);
//                }
//                if (flag1697){
//                    updateYanPan("1697",yanPanVo);
//                }
//                if (flag1698){
//                    updateYanPan("1698",yanPanVo);
//                }
//                if (flag1699){
//                    updateYanPan("1699",yanPanVo);
//                }
//                if (flag1700){
//                    updateYanPan("1700",yanPanVo);
//                }
//                if (flag1701){
//                    updateYanPan("1701",yanPanVo);
//                }
//                if (flag1702){
//                    updateYanPan("1702",yanPanVo);
//                }
//                if (flag1703){
//                    updateYanPan("1703",yanPanVo);
//                }
//                if (flag1704){
//                    updateYanPan("1704",yanPanVo);
//                }
//                if (flag1705){
//                    updateYanPan("1705",yanPanVo);
//                }
//                if (flag1706){
//                    updateYanPan("1706",yanPanVo);
//                }
//                if (flag1707){
//                    updateYanPan("1707",yanPanVo);
//                }
//                if (flag1708){
//                    updateYanPan("1708",yanPanVo);
//                }
//                if (flag1709){
//                    updateYanPan("1709",yanPanVo);
//                }
//                if (flag1710){
//                    updateYanPan("1710",yanPanVo);
//                }
//                if (flag1711){
//                    updateYanPan("1711",yanPanVo);
//                }
//
//                if (flag1712){
//                    updateYanPan("1712",yanPanVo);
//                }
//                if (flag1713){
//                    updateYanPan("1713",yanPanVo);
//                }
//                if (flag1714){
//                    updateYanPan("1714",yanPanVo);
//                }
//                if (flag1715){
//                    updateYanPan("1715",yanPanVo);
//                }
//                if (flag1716){
//                    updateYanPan("1716",yanPanVo);
//                }
//                if (flag1717){
//                    updateYanPan("1717",yanPanVo);
//                }
//                if (flag1718){
//                    updateYanPan("1718",yanPanVo);
//                }
//                if (flag1719){
//                    updateYanPan("1719",yanPanVo);
//                }
//                if (flag1720){
//                    updateYanPan("1720",yanPanVo);
//                }
//                if (flag1721){
//                    updateYanPan("1721",yanPanVo);
//                }
//                if (flag1722){
//                    updateYanPan("1722",yanPanVo);
//                }
//                if (flag1723){
//                    updateYanPan("1723",yanPanVo);
//                }
//                if (flag1724){
//                    updateYanPan("1724",yanPanVo);
//                }
//                if (flag1725){
//                    updateYanPan("1725",yanPanVo);
//                }
//                if (flag1726){
//                    updateYanPan("1726",yanPanVo);
//                }
//                if (flag1727){
//                    updateYanPan("1727",yanPanVo);
//                }
//                if (flag1728){
//                    updateYanPan("1728",yanPanVo);
//                }
//                if (flag1729){
//                    updateYanPan("1729",yanPanVo);
//                }
//                if (flag1730){
//                    updateYanPan("1730",yanPanVo);
//                }
//                if (flag1731){
//                    updateYanPan("1731",yanPanVo);
//                }
//                if (flag1732){
//                    updateYanPan("1732",yanPanVo);
//                }
//                if (flag1733){
//                    updateYanPan("1733",yanPanVo);
//                }
//                if (flag1734){
//                    updateYanPan("1734",yanPanVo);
//                }
//                if (flag1735){
//                    updateYanPan("1735",yanPanVo);
//                }
//                if (flag1736){
//                    updateYanPan("1736",yanPanVo);
//                }
//                if (flag1737){
//                    updateYanPan("1737",yanPanVo);
//                }
//                if (flag1738){
//                    updateYanPan("1738",yanPanVo);
//                }
//                if (flag1739){
//                    updateYanPan("1739",yanPanVo);
//                }
//                if (flag1740){
//                    updateYanPan("1740",yanPanVo);
//                }
//                if (flag1741){
//                    updateYanPan("1741",yanPanVo);
//                }
//                if (flag1742){
//                    updateYanPan("1742",yanPanVo);
//                }
//                if (flag1743){
//                    updateYanPan("1743",yanPanVo);
//                }
//                if (flag1744){
//                    updateYanPan("1744",yanPanVo);
//                }
//                if (flag1745){
//                    updateYanPan("1745",yanPanVo);
//                }
//                if (flag1746){
//                    updateYanPan("1746",yanPanVo);
//                }
//                if (flag1747){
//                    updateYanPan("1747",yanPanVo);
//                }
//                if (flag1748){
//                    updateYanPan("1748",yanPanVo);
//                }
//                if (flag1749){
//                    updateYanPan("1749",yanPanVo);
//                }
//                if (flag1750){
//                    updateYanPan("1750",yanPanVo);
//                }
//                if (flag1751){
//                    updateYanPan("1751",yanPanVo);
//                }
//                if (flag1752){
//                    updateYanPan("1752",yanPanVo);
//                }
//                if (flag1753){
//                    updateYanPan("1753",yanPanVo);
//                }
//                if (flag1754){
//                    updateYanPan("1754",yanPanVo);
//                }
//                if (flag1755){
//                    updateYanPan("1755",yanPanVo);
//                }
//                if (flag1756){
//                    updateYanPan("1756",yanPanVo);
//                }
//                if (flag1757){
//                    updateYanPan("1757",yanPanVo);
//                }
//                if (flag1758){
//                    updateYanPan("1758",yanPanVo);
//                }
//                if (flag1759){
//                    updateYanPan("1759",yanPanVo);
//                }
//                if (flag1760){
//                    updateYanPan("1760",yanPanVo);
//                }
//                if (flag1761){
//                    updateYanPan("1761",yanPanVo);
//                }
//                if (flag1762){
//                    updateYanPan("1762",yanPanVo);
//                }
//                if (flag1763){
//                    updateYanPan("1763",yanPanVo);
//                }
//                if (flag1764){
//                    updateYanPan("1764",yanPanVo);
//                }
//                if (flag1765){
//                    updateYanPan("1765",yanPanVo);
//                }
//                if (flag1766){
//                    updateYanPan("1766",yanPanVo);
//                }
//                if (flag1767){
//                    updateYanPan("1767",yanPanVo);
//                }
//                if (flag1768){
//                    updateYanPan("1768",yanPanVo);
//                }
//                if (flag1769){
//                    updateYanPan("1769",yanPanVo);
//                }
//                if (flag1770){
//                    updateYanPan("1770",yanPanVo);
//                }
//                if (flag1771){
//                    updateYanPan("1771",yanPanVo);
//                }
//                if (flag1772){
//                    updateYanPan("1772",yanPanVo);
//                }
//                if (flag1773){
//                    updateYanPan("1773",yanPanVo);
//                }
//                if (flag1774){
//                    updateYanPan("1774",yanPanVo);
//                }
//                if (flag1775){
//                    updateYanPan("1775",yanPanVo);
//                }
//                if (flag1776){
//                    updateYanPan("1776",yanPanVo);
//                }
//                if (flag1777){
//                    updateYanPan("1777",yanPanVo);
//                }
//                if (flag1778){
//                    updateYanPan("1778",yanPanVo);
//                }
//                if (flag1779){
//                    updateYanPan("1779",yanPanVo);
//                }
//                if (flag1780){
//                    updateYanPan("1780",yanPanVo);
//                }
//                if (flag1781){
//                    updateYanPan("1781",yanPanVo);
//                }
//
//                if (flag1782){
//                    updateYanPan("1782",yanPanVo);
//                }
//                if (flag1783){
//                    updateYanPan("1783",yanPanVo);
//                }
//                if (flag1784){
//                    updateYanPan("1784",yanPanVo);
//                }
//                if (flag1785){
//                    updateYanPan("1785",yanPanVo);
//                }
//                if (flag1786){
//                    updateYanPan("1786",yanPanVo);
//                }
//                if (flag1787){
//                    updateYanPan("1787",yanPanVo);
//                }
//                if (flag1788){
//                    updateYanPan("1788",yanPanVo);
//                }
//                if (flag1789){
//                    updateYanPan("1789",yanPanVo);
//                }
//                if (flag1790){
//                    updateYanPan("1790",yanPanVo);
//                }
//                if (flag1791){
//                    updateYanPan("1791",yanPanVo);
//                }
//                if (flag1792){
//                    updateYanPan("1792",yanPanVo);
//                }
//                if (flag1793){
//                    updateYanPan("1793",yanPanVo);
//                }
//                if (flag1794){
//                    updateYanPan("1794",yanPanVo);
//                }
//                if (flag1795){
//                    updateYanPan("1795",yanPanVo);
//                }
//                if (flag1796){
//                    updateYanPan("1796",yanPanVo);
//                }
//                if (flag1797){
//                    updateYanPan("1797",yanPanVo);
//                }
//                if (flag1798){
//                    updateYanPan("1798",yanPanVo);
//                }
//                if (flag1799){
//                    updateYanPan("1799",yanPanVo);
//                }
//                if (flag1800){
//                    updateYanPan("1800",yanPanVo);
//                }
//                if (flag1801){
//                    updateYanPan("1801",yanPanVo);
//                }
//                if (flag1802){
//                    updateYanPan("1802",yanPanVo);
//                }
//                if (flag1803){
//                    updateYanPan("1803",yanPanVo);
//                }
//                if (flag1804){
//                    updateYanPan("1804",yanPanVo);
//                }
//                if (flag1805){
//                    updateYanPan("1805",yanPanVo);
//                }
//                if (flag1806){
//                    updateYanPan("1806",yanPanVo);
//                }
//                if (flag1807){
//                    updateYanPan("1807",yanPanVo);
//                }
//                if (flag1808){
//                    updateYanPan("1808",yanPanVo);
//                }
//                if (flag1809){
//                    updateYanPan("1809",yanPanVo);
//                }
//                if (flag1810){
//                    updateYanPan("1810",yanPanVo);
//                }
//                if (flag1811){
//                    updateYanPan("1811",yanPanVo);
//                }
//                if (flag1812){
//                    updateYanPan("1812",yanPanVo);
//                }
//                if (flag1813){
//                    updateYanPan("1813",yanPanVo);
//                }
//                if (flag1814){
//                    updateYanPan("1814",yanPanVo);
//                }
//                if (flag1815){
//                    updateYanPan("1815",yanPanVo);
//                }
//                if (flag1816){
//                    updateYanPan("1816",yanPanVo);
//                }
//                if (flag1817){
//                    updateYanPan("1817",yanPanVo);
//                }
//                if (flag1818){
//                    updateYanPan("1818",yanPanVo);
//                }
//                if (flag1819){
//                    updateYanPan("1819",yanPanVo);
//                }
//                if (flag1820){
//                    updateYanPan("1820",yanPanVo);
//                }
//                if (flag1821){
//                    updateYanPan("1821",yanPanVo);
//                }
//
//                if (flag1822){
//                    updateYanPan("1822",yanPanVo);
//                }
//                if (flag1823){
//                    updateYanPan("1823",yanPanVo);
//                }
//                if (flag1824){
//                    updateYanPan("1824",yanPanVo);
//                }
//                if (flag1825){
//                    updateYanPan("1825",yanPanVo);
//                }
//                if (flag1826){
//                    updateYanPan("1826",yanPanVo);
//                }
//                if (flag1827){
//                    updateYanPan("1827",yanPanVo);
//                }
//                if (flag1828){
//                    updateYanPan("1828",yanPanVo);
//                }
//                if (flag1829){
//                    updateYanPan("1829",yanPanVo);
//                }
//                if (flag1830){
//                    updateYanPan("1830",yanPanVo);
//                }
//                if (flag1831){
//                    updateYanPan("1831",yanPanVo);
//                }
//                if (flag1832){
//                    updateYanPan("1832",yanPanVo);
//                }
//                if (flag1833){
//                    updateYanPan("1833",yanPanVo);
//                }
//                if (flag1834){
//                    updateYanPan("1834",yanPanVo);
//                }
//                if (flag1835){
//                    updateYanPan("1835",yanPanVo);
//                }
//                if (flag1836){
//                    updateYanPan("1836",yanPanVo);
//                }
//                if (flag1837){
//                    updateYanPan("1837",yanPanVo);
//                }
//                if (flag1838){
//                    updateYanPan("1838",yanPanVo);
//                }
//                if (flag1839){
//                    updateYanPan("1839",yanPanVo);
//                }
//                if (flag1840){
//                    updateYanPan("1840",yanPanVo);
//                }
//                if (flag1841){
//                    updateYanPan("1841",yanPanVo);
//                }
//                if (flag1842){
//                    updateYanPan("1842",yanPanVo);
//                }
//                if (flag1843){
//                    updateYanPan("1843",yanPanVo);
//                }
//                if (flag1844){
//                    updateYanPan("1844",yanPanVo);
//                }
//                if (flag1845){
//                    updateYanPan("1845",yanPanVo);
//                }
//                if (flag1846){
//                    updateYanPan("1846",yanPanVo);
//                }
//                if (flag1847){
//                    updateYanPan("1847",yanPanVo);
//                }
//                if (flag1848){
//                    updateYanPan("1848",yanPanVo);
//                }
//                if (flag1849){
//                    updateYanPan("1849",yanPanVo);
//                }
//                if (flag1850){
//                    updateYanPan("1850",yanPanVo);
//                }
//                if (flag1851){
//                    updateYanPan("1851",yanPanVo);
//                }
//                if (flag1852){
//                    updateYanPan("1852",yanPanVo);
//                }
//                if (flag1853){
//                    updateYanPan("1853",yanPanVo);
//                }
//                if (flag1854){
//                    updateYanPan("1854",yanPanVo);
//                }
//                if (flag1855){
//                    updateYanPan("1855",yanPanVo);
//                }
//                if (flag1856){
//                    updateYanPan("1856",yanPanVo);
//                }
//                if (flag1857){
//                    updateYanPan("1857",yanPanVo);
//                }
//                if (flag1858){
//                    updateYanPan("1858",yanPanVo);
//                }
//                if (flag1859){
//                    updateYanPan("1859",yanPanVo);
//                }
//                if (flag1860){
//                    updateYanPan("1860",yanPanVo);
//                }
//                if (flag1861){
//                    updateYanPan("1861",yanPanVo);
//                }
//                if (flag1862){
//                    updateYanPan("1862",yanPanVo);
//                }
//                if (flag1863){
//                    updateYanPan("1863",yanPanVo);
//                }
//                if (flag1864){
//                    updateYanPan("1864",yanPanVo);
//                }
//                if (flag1865){
//                    updateYanPan("1865",yanPanVo);
//                }
//                if (flag1866){
//                    updateYanPan("1866",yanPanVo);
//                }
//                if (flag1867){
//                    updateYanPan("1867",yanPanVo);
//                }
//                if (flag1868){
//                    updateYanPan("1868",yanPanVo);
//                }
//
//                if (flag1869){
//                    updateYanPan("1869",yanPanVo);
//                }
//                if (flag1870){
//                    updateYanPan("1870",yanPanVo);
//                }
//                if (flag1871){
//                    updateYanPan("1871",yanPanVo);
//                }
//                if (flag1872){
//                    updateYanPan("1872",yanPanVo);
//                }
//                if (flag1873){
//                    updateYanPan("1873",yanPanVo);
//                }
//                if (flag1874){
//                    updateYanPan("1874",yanPanVo);
//                }
//                if (flag1875){
//                    updateYanPan("1875",yanPanVo);
//                }
//                if (flag1876){
//                    updateYanPan("1876",yanPanVo);
//                }
//                if (flag1877){
//                    updateYanPan("1877",yanPanVo);
//                }
//                if (flag1878){
//                    updateYanPan("1878",yanPanVo);
//                }
//                if (flag1879){
//                    updateYanPan("1879",yanPanVo);
//                }
//                if (flag1880){
//                    updateYanPan("1880",yanPanVo);
//                }
//                if (flag1881){
//                    updateYanPan("1881",yanPanVo);
//                }
//
//                if (flag1882){
//                    updateYanPan("1882",yanPanVo);
//                }
//                if (flag1883){
//                    updateYanPan("1883",yanPanVo);
//                }
//                if (flag1884){
//                    updateYanPan("1884",yanPanVo);
//                }
//                if (flag1885){
//                    updateYanPan("1885",yanPanVo);
//                }
//                if (flag1886){
//                    updateYanPan("1886",yanPanVo);
//                }
//                if (flag1887){
//                    updateYanPan("1887",yanPanVo);
//                }
//                if (flag1888){
//                    updateYanPan("1888",yanPanVo);
//                }
//                if (flag1889){
//                    updateYanPan("1889",yanPanVo);
//                }
//                if (flag1890){
//                    updateYanPan("1890",yanPanVo);
//                }
//                if (flag1891){
//                    updateYanPan("1891",yanPanVo);
//                }
//                if (flag1892){
//                    updateYanPan("1892",yanPanVo);
//                }
//                if (flag1893){
//                    updateYanPan("1893",yanPanVo);
//                }
//                if (flag1894){
//                    updateYanPan("1894",yanPanVo);
//                }
//                if (flag1895){
//                    updateYanPan("1895",yanPanVo);
//                }
//                if (flag1896){
//                    updateYanPan("1896",yanPanVo);
//                }
//                if (flag1897){
//                    updateYanPan("1897",yanPanVo);
//                }
//                if (flag1898){
//                    updateYanPan("1898",yanPanVo);
//                }
//                if (flag1899){
//                    updateYanPan("1899",yanPanVo);
//                }
//                if (flag1900){
//                    updateYanPan("1900",yanPanVo);
//                }
//                if (flag1901){
//                    updateYanPan("1901",yanPanVo);
//                }
//                if (flag1902){
//                    updateYanPan("1902",yanPanVo);
//                }
//                if (flag1903){
//                    updateYanPan("1903",yanPanVo);
//                }
//                if (flag1904){
//                    updateYanPan("1904",yanPanVo);
//                }
//                if (flag1905){
//                    updateYanPan("1905",yanPanVo);
//                }
//                if (flag1906){
//                    updateYanPan("1906",yanPanVo);
//                }
//                if (flag1907){
//                    updateYanPan("1907",yanPanVo);
//                }
//                if (flag1908){
//                    updateYanPan("1908",yanPanVo);
//                }
//                if (flag1909){
//                    updateYanPan("1909",yanPanVo);
//                }
//                if (flag1910){
//                    updateYanPan("1910",yanPanVo);
//                }
//                if (flag1911){
//                    updateYanPan("1911",yanPanVo);
//                }
//                if (flag1912){
//                    updateYanPan("1912",yanPanVo);
//                }
//                if (flag1913){
//                    updateYanPan("1913",yanPanVo);
//                }
//                if (flag1914){
//                    updateYanPan("1914",yanPanVo);
//                }
//                if (flag1915){
//                    updateYanPan("1915",yanPanVo);
//                }
//                if (flag1916){
//                    updateYanPan("1916",yanPanVo);
//                }
//                if (flag1917){
//                    updateYanPan("1917",yanPanVo);
//                }
//                if (flag1918){
//                    updateYanPan("1918",yanPanVo);
//                }
//                if (flag1919){
//                    updateYanPan("1919",yanPanVo);
//                }
//                if (flag1920){
//                    updateYanPan("1920",yanPanVo);
//                }
//                if (flag1921){
//                    updateYanPan("1921",yanPanVo);
//                }
//                if (flag1922){
//                    updateYanPan("1922",yanPanVo);
//                }
//                if (flag1923){
//                    updateYanPan("1923",yanPanVo);
//                }
//                if (flag1924){
//                    updateYanPan("1924",yanPanVo);
//                }
//                if (flag1925){
//                    updateYanPan("1925",yanPanVo);
//                }
//                if (flag1926){
//                    updateYanPan("1926",yanPanVo);
//                }
//                if (flag1927){
//                    updateYanPan("1927",yanPanVo);
//                }
//                if (flag1928){
//                    updateYanPan("1928",yanPanVo);
//                }
//                if (flag1929){
//                    updateYanPan("1929",yanPanVo);
//                }
//                if (flag1930){
//                    updateYanPan("1930",yanPanVo);
//                }
//                if (flag1931){
//                    updateYanPan("1931",yanPanVo);
//                }
//                if (flag1932){
//                    updateYanPan("1932",yanPanVo);
//                }
//                if (flag1933){
//                    updateYanPan("1933",yanPanVo);
//                }
//                if (flag1934){
//                    updateYanPan("1934",yanPanVo);
//                }
//                if (flag1935){
//                    updateYanPan("1935",yanPanVo);
//                }
//                if (flag1936){
//                    updateYanPan("1936",yanPanVo);
//                }
//                if (flag1937){
//                    updateYanPan("1937",yanPanVo);
//                }
//                if (flag1938){
//                    updateYanPan("1938",yanPanVo);
//                }
//                if (flag1939){
//                    updateYanPan("1939",yanPanVo);
//                }
//                if (flag1940){
//                    updateYanPan("1940",yanPanVo);
//                }
//                if (flag1941){
//                    updateYanPan("1941",yanPanVo);
//                }
//                if (flag1942){
//                    updateYanPan("1942",yanPanVo);
//                }
//                if (flag1943){
//                    updateYanPan("1943",yanPanVo);
//                }
//                if (flag1944){
//                    updateYanPan("1944",yanPanVo);
//                }
//                if (flag1945){
//                    updateYanPan("1945",yanPanVo);
//                }
//                if (flag1946){
//                    updateYanPan("1946",yanPanVo);
//                }
//                if (flag1947){
//                    updateYanPan("1947",yanPanVo);
//                }
//                if (flag1948){
//                    updateYanPan("1948",yanPanVo);
//                }
//                if (flag1949){
//                    updateYanPan("1949",yanPanVo);
//                }
//                if (flag1950){
//                    updateYanPan("1950",yanPanVo);
//                }
//                if (flag1951){
//                    updateYanPan("1951",yanPanVo);
//                }
//                if (flag1952){
//                    updateYanPan("1952",yanPanVo);
//                }
//                if (flag1953){
//                    updateYanPan("1953",yanPanVo);
//                }
//                if (flag1954){
//                    updateYanPan("1954",yanPanVo);
//                }
//                if (flag1955){
//                    updateYanPan("1955",yanPanVo);
//                }
//                if (flag1956){
//                    updateYanPan("1956",yanPanVo);
//                }
//                if (flag1957){
//                    updateYanPan("1957",yanPanVo);
//                }
//                if (flag1958){
//                    updateYanPan("1958",yanPanVo);
//                }
//                if (flag1959){
//                    updateYanPan("1959",yanPanVo);
//                }
//                if (flag1960){
//                    updateYanPan("1960",yanPanVo);
//                }
//                if (flag1961){
//                    updateYanPan("1961",yanPanVo);
//                }
//                if (flag1962){
//                    updateYanPan("1962",yanPanVo);
//                }
//                if (flag1963){
//                    updateYanPan("1963",yanPanVo);
//                }
//                if (flag1964){
//                    updateYanPan("1964",yanPanVo);
//                }
//                if (flag1965){
//                    updateYanPan("1965",yanPanVo);
//                }
//                if (flag1966){
//                    updateYanPan("1966",yanPanVo);
//                }
//                if (flag1967){
//                    updateYanPan("1967",yanPanVo);
//                }
//                if (flag1968){
//                    updateYanPan("1968",yanPanVo);
//                }
//                if (flag1969){
//                    updateYanPan("1969",yanPanVo);
//                }
//                if (flag1970){
//                    updateYanPan("1970",yanPanVo);
//                }
//                if (flag1971){
//                    updateYanPan("1971",yanPanVo);
//                }
//                if (flag1972){
//                    updateYanPan("1972",yanPanVo);
//                }
//                if (flag1973){
//                    updateYanPan("1973",yanPanVo);
//                }
//                if (flag1974){
//                    updateYanPan("1974",yanPanVo);
//                }
//                if (flag1975){
//                    updateYanPan("1975",yanPanVo);
//                }
//                if (flag1976){
//                    updateYanPan("1976",yanPanVo);
//                }
//                if (flag1977){
//                    updateYanPan("1977",yanPanVo);
//                }
//                if (flag1978){
//                    updateYanPan("1978",yanPanVo);
//                }
//                if (flag1979){
//                    updateYanPan("1979",yanPanVo);
//                }
//                if (flag1980){
//                    updateYanPan("1980",yanPanVo);
//                }
//                if (flag1982){
//                    updateYanPan("1982",yanPanVo);
//                }
//                if (flag1983){
//                    updateYanPan("1983",yanPanVo);
//                }
//                if (flag1984){
//                    updateYanPan("1984",yanPanVo);
//                }
//                if (flag1985){
//                    updateYanPan("1985",yanPanVo);
//                }
//                if (flag1986){
//                    updateYanPan("1986",yanPanVo);
//                }
//                if (flag1987){
//                    updateYanPan("1987",yanPanVo);
//                }
//                if (flag1988){
//                    updateYanPan("1988",yanPanVo);
//                }
//                if (flag1989){
//                    updateYanPan("1989",yanPanVo);
//                }
//                if (flag1990){
//                    updateYanPan("1990",yanPanVo);
//                }
//                if (flag1991){
//                    updateYanPan("1991",yanPanVo);
//                }
//                if (flag1992){
//                    updateYanPan("1992",yanPanVo);
//                }
//                if (flag1993){
//                    updateYanPan("1993",yanPanVo);
//                }
//                if (flag1994){
//                    updateYanPan("1994",yanPanVo);
//                }
//                if (flag1995){
//                    updateYanPan("1995",yanPanVo);
//                }
//                if (flag1996){
//                    updateYanPan("1996",yanPanVo);
//                }
//                if (flag1997){
//                    updateYanPan("1997",yanPanVo);
//                }
//                if (flag1998){
//                    updateYanPan("1998",yanPanVo);
//                }
//                if (flag1999){
//                    updateYanPan("1999",yanPanVo);
//                }
//                if (flag2000){
//                    updateYanPan("2000",yanPanVo);
//                }
//                if (flag2001){
//                    updateYanPan("2001",yanPanVo);
//                }
//                if (flag2002){
//                    updateYanPan("2002",yanPanVo);
//                }
//                if (flag2003){
//                    updateYanPan("2003",yanPanVo);
//                }
//                if (flag2004){
//                    updateYanPan("2004",yanPanVo);
//                }
//                if (flag2005){
//                    updateYanPan("2005",yanPanVo);
//                }
//                if (flag2006){
//                    updateYanPan("2006",yanPanVo);
//                }
//                if (flag2007){
//                    updateYanPan("2007",yanPanVo);
//                }
//                if (flag2008){
//                    updateYanPan("2008",yanPanVo);
//                }
//                if (flag2009){
//                    updateYanPan("2009",yanPanVo);
//                }
//                if (flag2010){
//                    updateYanPan("2010",yanPanVo);
//                }
//                if (flag2011){
//                    updateYanPan("2011",yanPanVo);
//                }
//
//                if (flag2012){
//                    updateYanPan("2012",yanPanVo);
//                }
//                if (flag2013){
//                    updateYanPan("2013",yanPanVo);
//                }
//                if (flag2014){
//                    updateYanPan("2014",yanPanVo);
//                }
//                if (flag2015){
//                    updateYanPan("2015",yanPanVo);
//                }
//                if (flag2016){
//                    updateYanPan("2016",yanPanVo);
//                }
//                if (flag2017){
//                    updateYanPan("2017",yanPanVo);
//                }
//                if (flag2018){
//                    updateYanPan("2018",yanPanVo);
//                }
//                if (flag2019){
//                    updateYanPan("2019",yanPanVo);
//                }
//                if (flag2020){
//                    updateYanPan("2020",yanPanVo);
//                }
//                if (flag2021){
//                    updateYanPan("2021",yanPanVo);
//                }
//                if (flag2022){
//                    updateYanPan("2022",yanPanVo);
//                }
//                if (flag2023){
//                    updateYanPan("2023",yanPanVo);
//                }
//                if (flag2024){
//                    updateYanPan("2024",yanPanVo);
//                }
//                if (flag2025){
//                    updateYanPan("2025",yanPanVo);
//                }
//                if (flag2026){
//                    updateYanPan("2026",yanPanVo);
//                }
//                if (flag2027){
//                    updateYanPan("2027",yanPanVo);
//                }
//                if (flag2028){
//                    updateYanPan("2028",yanPanVo);
//                }
//                if (flag2029){
//                    updateYanPan("2029",yanPanVo);
//                }
//                if (flag2030){
//                    updateYanPan("2030",yanPanVo);
//                }
//                if (flag2031){
//                    updateYanPan("2031",yanPanVo);
//                }
//                if (flag2032){
//                    updateYanPan("2032",yanPanVo);
//                }
//                if (flag2033){
//                    updateYanPan("2033",yanPanVo);
//                }
//                if (flag2034){
//                    updateYanPan("2034",yanPanVo);
//                }
//                if (flag2035){
//                    updateYanPan("2035",yanPanVo);
//                }
//                if (flag2036){
//                    updateYanPan("2036",yanPanVo);
//                }
//                if (flag2037){
//                    updateYanPan("2037",yanPanVo);
//                }
//                if (flag2038){
//                    updateYanPan("2038",yanPanVo);
//                }
//                if (flag2039){
//                    updateYanPan("2039",yanPanVo);
//                }
//                if (flag2040){
//                    updateYanPan("2040",yanPanVo);
//                }
//                if (flag2041){
//                    updateYanPan("2041",yanPanVo);
//                }
//                if (flag2042){
//                    updateYanPan("2042",yanPanVo);
//                }
//                if (flag2043){
//                    updateYanPan("2043",yanPanVo);
//                }
//                if (flag2044){
//                    updateYanPan("2044",yanPanVo);
//                }
//                if (flag2045){
//                    updateYanPan("2045",yanPanVo);
//                }
//                if (flag2046){
//                    updateYanPan("2046",yanPanVo);
//                }
//                if (flag2047){
//                    updateYanPan("2047",yanPanVo);
//                }
//                if (flag2048){
//                    updateYanPan("2048",yanPanVo);
//                }
//                if (flag2049){
//                    updateYanPan("2049",yanPanVo);
//                }
//                if (flag2060){
//                    updateYanPan("2060",yanPanVo);
//                }
//                if (flag2061){
//                    updateYanPan("2061",yanPanVo);
//                }
//                if (flag2062){
//                    updateYanPan("2062",yanPanVo);
//                }
//                if (flag2063){
//                    updateYanPan("2063",yanPanVo);
//                }
//                if (flag2064){
//                    updateYanPan("2064",yanPanVo);
//                }
//                if (flag2065){
//                    updateYanPan("2065",yanPanVo);
//                }
//                if (flag2066){
//                    updateYanPan("2066",yanPanVo);
//                }
//                if (flag2067){
//                    updateYanPan("2067",yanPanVo);
//                }
//                if (flag2068){
//                    updateYanPan("2068",yanPanVo);
//                }
//                if (flag2069){
//                    updateYanPan("2069",yanPanVo);
//                }
//                if (flag2070){
//                    updateYanPan("2070",yanPanVo);
//                }
//                if (flag2071){
//                    updateYanPan("2071",yanPanVo);
//                }
//                if (flag2072){
//                    updateYanPan("2072",yanPanVo);
//                }
//                if (flag2073){
//                    updateYanPan("2073",yanPanVo);
//                }
//                if (flag2074){
//                    updateYanPan("2074",yanPanVo);
//                }
//                if (flag2075){
//                    updateYanPan("2075",yanPanVo);
//                }
//                if (flag2076){
//                    updateYanPan("2076",yanPanVo);
//                }
//                if (flag2077){
//                    updateYanPan("2077",yanPanVo);
//                }
//                if (flag2078){
//                    updateYanPan("2078",yanPanVo);
//                }
//                if (flag2079){
//                    updateYanPan("2079",yanPanVo);
//                }
//                if (flag2080){
//                    updateYanPan("2080",yanPanVo);
//                }
//                if (flag2081){
//                    updateYanPan("2081",yanPanVo);
//                }
//
//                if (flag2082){
//                    updateYanPan("2082",yanPanVo);
//                }
//                if (flag2083){
//                    updateYanPan("2083",yanPanVo);
//                }
//                if (flag2084){
//                    updateYanPan("2084",yanPanVo);
//                }
//                if (flag2085){
//                    updateYanPan("2085",yanPanVo);
//                }
//                if (flag2086){
//                    updateYanPan("2086",yanPanVo);
//                }
//                if (flag2087){
//                    updateYanPan("2087",yanPanVo);
//                }
//                if (flag2088){
//                    updateYanPan("2088",yanPanVo);
//                }
//                if (flag2089){
//                    updateYanPan("2089",yanPanVo);
//                }
//                if (flag2090){
//                    updateYanPan("2090",yanPanVo);
//                }
//                if (flag2091){
//                    updateYanPan("2091",yanPanVo);
//                }
//                if (flag2092){
//                    updateYanPan("2092",yanPanVo);
//                }
//                if (flag2093){
//                    updateYanPan("2093",yanPanVo);
//                }
//                if (flag2094){
//                    updateYanPan("2094",yanPanVo);
//                }
//                if (flag2095){
//                    updateYanPan("2095",yanPanVo);
//                }
//                if (flag2096){
//                    updateYanPan("2096",yanPanVo);
//                }
//                if (flag2097){
//                    updateYanPan("2097",yanPanVo);
//                }
//                if (flag2098){
//                    updateYanPan("2098",yanPanVo);
//                }
//                if (flag2099){
//                    updateYanPan("2099",yanPanVo);
//                }
//                if (flag2100){
//                    updateYanPan("2100",yanPanVo);
//                }
//                if (flag2101){
//                    updateYanPan("2101",yanPanVo);
//                }
//                if (flag2102){
//                    updateYanPan("2102",yanPanVo);
//                }
//                if (flag2103){
//                    updateYanPan("2103",yanPanVo);
//                }
//                if (flag2104){
//                    updateYanPan("2104",yanPanVo);
//                }
//                if (flag2105){
//                    updateYanPan("2105",yanPanVo);
//                }
//                if (flag2106){
//                    updateYanPan("2106",yanPanVo);
//                }
//                if (flag2107){
//                    updateYanPan("2107",yanPanVo);
//                }
//                if (flag2108){
//                    updateYanPan("2108",yanPanVo);
//                }
//                if (flag2109){
//                    updateYanPan("2109",yanPanVo);
//                }
//                if (flag2110){
//                    updateYanPan("2110",yanPanVo);
//                }
//                if (flag2111){
//                    updateYanPan("2111",yanPanVo);
//                }
//                if (flag2112){
//                    updateYanPan("2112",yanPanVo);
//                }
//                if (flag2113){
//                    updateYanPan("2113",yanPanVo);
//                }
//                if (flag2114){
//                    updateYanPan("2114",yanPanVo);
//                }
//                if (flag2115){
//                    updateYanPan("2115",yanPanVo);
//                }
//                if (flag2116){
//                    updateYanPan("2116",yanPanVo);
//                }
//                if (flag2117){
//                    updateYanPan("2117",yanPanVo);
//                }
//                if (flag2118){
//                    updateYanPan("2118",yanPanVo);
//                }
//                if (flag2119){
//                    updateYanPan("2119",yanPanVo);
//                }
//                if (flag2120){
//                    updateYanPan("2120",yanPanVo);
//                }
//                if (flag2121){
//                    updateYanPan("2121",yanPanVo);
//                }
//
//                if (flag2122){
//                    updateYanPan("2122",yanPanVo);
//                }
//                if (flag2123){
//                    updateYanPan("2123",yanPanVo);
//                }

                if (flag2124){
                    updateYanPan("2124",yanPanVo);
                }
                if (flag2125){
                    updateYanPan("2125",yanPanVo);
                }
                if (flag2126){
                    updateYanPan("2126",yanPanVo);
                }
                if (flag2127){
                    updateYanPan("2127",yanPanVo);
                }
                if (flag2128){
                    updateYanPan("2128",yanPanVo);
                }
                if (flag2129){
                    updateYanPan("2129",yanPanVo);
                }
                if (flag2130){
                    updateYanPan("2130",yanPanVo);
                }
                if (flag2131){
                    updateYanPan("2131",yanPanVo);
                }
                if (flag2132){
                    updateYanPan("2132",yanPanVo);
                }
                if (flag2133){
                    updateYanPan("2133",yanPanVo);
                }
                if (flag2134){
                    updateYanPan("2134",yanPanVo);
                }
                if (flag2135){
                    updateYanPan("2135",yanPanVo);
                }
                if (flag2136){
                    updateYanPan("2136",yanPanVo);
                }
                if (flag2137){
                    updateYanPan("2137",yanPanVo);
                }
                if (flag2138){
                    updateYanPan("2138",yanPanVo);
                }
                if (flag2139){
                    updateYanPan("2139",yanPanVo);
                }
                if (flag2140){
                    updateYanPan("2140",yanPanVo);
                }
                if (flag2141){
                    updateYanPan("2141",yanPanVo);
                }
                if (flag2142){
                    updateYanPan("2142",yanPanVo);
                }
                if (flag2143){
                    updateYanPan("2143",yanPanVo);
                }
                if (flag2144){
                    updateYanPan("2144",yanPanVo);
                }
                if (flag2145){
                    updateYanPan("2145",yanPanVo);
                }
                if (flag2146){
                    updateYanPan("2146",yanPanVo);
                }
                if (flag2147){
                    updateYanPan("2147",yanPanVo);
                }
                if (flag2148){
                    updateYanPan("2148",yanPanVo);
                }
                if (flag2149){
                    updateYanPan("2149",yanPanVo);
                }
                if (flag2150){
                    updateYanPan("2150",yanPanVo);
                }
                if (flag2151){
                    updateYanPan("2151",yanPanVo);
                }
                if (flag2152){
                    updateYanPan("2152",yanPanVo);
                }
                if (flag2153){
                    updateYanPan("2153",yanPanVo);
                }
                if (flag2154){
                    updateYanPan("2154",yanPanVo);
                }
                if (flag2155){
                    updateYanPan("2155",yanPanVo);
                }
                if (flag2156){
                    updateYanPan("2156",yanPanVo);
                }
                if (flag2157){
                    updateYanPan("2157",yanPanVo);
                }
                if (flag2158){
                    updateYanPan("2158",yanPanVo);
                }
                if (flag2159){
                    updateYanPan("2159",yanPanVo);
                }
                if (flag2160){
                    updateYanPan("2160",yanPanVo);
                }
                if (flag2161){
                    updateYanPan("2161",yanPanVo);
                }
                if (flag2162){
                    updateYanPan("2162",yanPanVo);
                }
                if (flag2163){
                    updateYanPan("2163",yanPanVo);
                }
                if (flag2164){
                    updateYanPan("2164",yanPanVo);
                }
                if (flag2165){
                    updateYanPan("2165",yanPanVo);
                }
                if (flag2166){
                    updateYanPan("2166",yanPanVo);
                }
                if (flag2167){
                    updateYanPan("2167",yanPanVo);
                }
                if (flag2168){
                    updateYanPan("2168",yanPanVo);
                }
                if (flag2169){
                    updateYanPan("2169",yanPanVo);
                }
                if (flag2170){
                    updateYanPan("2170",yanPanVo);
                }
                if (flag2171){
                    updateYanPan("2171",yanPanVo);
                }
                if (flag2172){
                    updateYanPan("2172",yanPanVo);
                }
                if (flag2173){
                    updateYanPan("2173",yanPanVo);
                }
                if (flag2174){
                    updateYanPan("2174",yanPanVo);
                }
                if (flag2175){
                    updateYanPan("2175",yanPanVo);
                }
                if (flag2176){
                    updateYanPan("2176",yanPanVo);
                }
                if (flag2177){
                    updateYanPan("2177",yanPanVo);
                }
                if (flag2178){
                    updateYanPan("2178",yanPanVo);
                }
                if (flag2179){
                    updateYanPan("2179",yanPanVo);
                }
                if (flag2180){
                    updateYanPan("2180",yanPanVo);
                }
                if (flag2181){
                    updateYanPan("2181",yanPanVo);
                }
                if (flag2182){
                    updateYanPan("2182",yanPanVo);
                }
                if (flag2183){
                    updateYanPan("2183",yanPanVo);
                }
                if (flag2184){
                    updateYanPan("2184",yanPanVo);
                }
                if (flag2185){
                    updateYanPan("2185",yanPanVo);
                }
                if (flag2186){
                    updateYanPan("2186",yanPanVo);
                }
                if (flag2187){
                    updateYanPan("2187",yanPanVo);
                }
                if (flag2188){
                    updateYanPan("2188",yanPanVo);
                }
                if (flag2189){
                    updateYanPan("2189",yanPanVo);
                }
                if (flag2190){
                    updateYanPan("2190",yanPanVo);
                }
                if (flag2191){
                    updateYanPan("2191",yanPanVo);
                }
                if (flag2192){
                    updateYanPan("2192",yanPanVo);
                }
                if (flag2193){
                    updateYanPan("2193",yanPanVo);
                }
                if (flag2194){
                    updateYanPan("2194",yanPanVo);
                }
                if (flag2195){
                    updateYanPan("2195",yanPanVo);
                }
                if (flag2196){
                    updateYanPan("2196",yanPanVo);
                }
                if (flag2197){
                    updateYanPan("2197",yanPanVo);
                }
                if (flag2198){
                    updateYanPan("2198",yanPanVo);
                }
                if (flag2199){
                    updateYanPan("2199",yanPanVo);
                }
                if (flag2200){
                    updateYanPan("2200",yanPanVo);
                }
                if (flag2201){
                    updateYanPan("2201",yanPanVo);
                }
                if (flag2202){
                    updateYanPan("2202",yanPanVo);
                }
                if (flag2203){
                    updateYanPan("2203",yanPanVo);
                }
                if (flag2204){
                    updateYanPan("2204",yanPanVo);
                }
                if (flag2205){
                    updateYanPan("2205",yanPanVo);
                }
                if (flag2206){
                    updateYanPan("2206",yanPanVo);
                }
                if (flag2207){
                    updateYanPan("2207",yanPanVo);
                }
                if (flag2208){
                    updateYanPan("2208",yanPanVo);
                }
                if (flag2209){
                    updateYanPan("2209",yanPanVo);
                }
                if (flag2210){
                    updateYanPan("2210",yanPanVo);
                }
                if (flag2211){
                    updateYanPan("2211",yanPanVo);
                }

                if (flag2212){
                    updateYanPan("2212",yanPanVo);
                }
                if (flag2213){
                    updateYanPan("2213",yanPanVo);
                }
                if (flag2214){
                    updateYanPan("2214",yanPanVo);
                }
                if (flag2215){
                    updateYanPan("2215",yanPanVo);
                }
                if (flag2216){
                    updateYanPan("2216",yanPanVo);
                }
                if (flag2217){
                    updateYanPan("2217",yanPanVo);
                }
                if (flag2218){
                    updateYanPan("2218",yanPanVo);
                }
                if (flag2219){
                    updateYanPan("2219",yanPanVo);
                }
                if (flag2220){
                    updateYanPan("2220",yanPanVo);
                }
                if (flag2221){
                    updateYanPan("2221",yanPanVo);
                }
                if (flag2222){
                    updateYanPan("2222",yanPanVo);
                }
                if (flag2223){
                    updateYanPan("2223",yanPanVo);
                }
                if (flag2224){
                    updateYanPan("2224",yanPanVo);
                }
                if (flag2225){
                    updateYanPan("2225",yanPanVo);
                }
                if (flag2226){
                    updateYanPan("2226",yanPanVo);
                }
                if (flag2227){
                    updateYanPan("2227",yanPanVo);
                }
                if (flag2228){
                    updateYanPan("2228",yanPanVo);
                }
                if (flag2229){
                    updateYanPan("2229",yanPanVo);
                }
                if (flag2230){
                    updateYanPan("2230",yanPanVo);
                }
                if (flag2231){
                    updateYanPan("2231",yanPanVo);
                }
                if (flag2232){
                    updateYanPan("2232",yanPanVo);
                }
                if (flag2233){
                    updateYanPan("2233",yanPanVo);
                }
                if (flag2234){
                    updateYanPan("2234",yanPanVo);
                }
                if (flag2235){
                    updateYanPan("2235",yanPanVo);
                }
                if (flag2236){
                    updateYanPan("2236",yanPanVo);
                }
                if (flag2237){
                    updateYanPan("2237",yanPanVo);
                }
                if (flag2238){
                    updateYanPan("2238",yanPanVo);
                }
                if (flag2239){
                    updateYanPan("2239",yanPanVo);
                }
                if (flag2240){
                    updateYanPan("2240",yanPanVo);
                }
                if (flag2241){
                    updateYanPan("2241",yanPanVo);
                }
                if (flag2242){
                    updateYanPan("2242",yanPanVo);
                }
                if (flag2243){
                    updateYanPan("2243",yanPanVo);
                }
                if (flag2244){
                    updateYanPan("2244",yanPanVo);
                }
                if (flag2245){
                    updateYanPan("2245",yanPanVo);
                }
                if (flag2246){
                    updateYanPan("2246",yanPanVo);
                }
                if (flag2247){
                    updateYanPan("2247",yanPanVo);
                }
                if (flag2248){
                    updateYanPan("2248",yanPanVo);
                }
                if (flag2249){
                    updateYanPan("2249",yanPanVo);
                }
                if (flag2250){
                    updateYanPan("2250",yanPanVo);
                }
                if (flag2251){
                    updateYanPan("2251",yanPanVo);
                }
                if (flag2252){
                    updateYanPan("2252",yanPanVo);
                }
                if (flag2253){
                    updateYanPan("2253",yanPanVo);
                }
                if (flag2254){
                    updateYanPan("2254",yanPanVo);
                }
                if (flag2255){
                    updateYanPan("2255",yanPanVo);
                }
                if (flag2256){
                    updateYanPan("2256",yanPanVo);
                }
                if (flag2257){
                    updateYanPan("2257",yanPanVo);
                }
                if (flag2258){
                    updateYanPan("2258",yanPanVo);
                }
                if (flag2259){
                    updateYanPan("2259",yanPanVo);
                }
                if (flag2260){
                    updateYanPan("2260",yanPanVo);
                }
                if (flag2261){
                    updateYanPan("2261",yanPanVo);
                }
                if (flag2262){
                    updateYanPan("2262",yanPanVo);
                }
                if (flag2263){
                    updateYanPan("2263",yanPanVo);
                }
                if (flag2264){
                    updateYanPan("2264",yanPanVo);
                }
                if (flag2265){
                    updateYanPan("2265",yanPanVo);
                }
                if (flag2266){
                    updateYanPan("2266",yanPanVo);
                }
                if (flag2267){
                    updateYanPan("2267",yanPanVo);
                }
                if (flag2268){
                    updateYanPan("2268",yanPanVo);
                }
                if (flag2269){
                    updateYanPan("2269",yanPanVo);
                }
                if (flag2270){
                    updateYanPan("2270",yanPanVo);
                }
                if (flag2271){
                    updateYanPan("2271",yanPanVo);
                }
                if (flag2272){
                    updateYanPan("2272",yanPanVo);
                }
                if (flag2273){
                    updateYanPan("2273",yanPanVo);
                }
                if (flag2274){
                    updateYanPan("2274",yanPanVo);
                }
                if (flag2275){
                    updateYanPan("2275",yanPanVo);
                }
                if (flag2276){
                    updateYanPan("2276",yanPanVo);
                }
                if (flag2277){
                    updateYanPan("2277",yanPanVo);
                }
                if (flag2278){
                    updateYanPan("2278",yanPanVo);
                }
                if (flag2279){
                    updateYanPan("2279",yanPanVo);
                }
                if (flag2280){
                    updateYanPan("2280",yanPanVo);
                }
                if (flag2281){
                    updateYanPan("2281",yanPanVo);
                }

                if (flag2282){
                    updateYanPan("2282",yanPanVo);
                }
                if (flag2283){
                    updateYanPan("2283",yanPanVo);
                }
                if (flag2284){
                    updateYanPan("2284",yanPanVo);
                }
                if (flag2285){
                    updateYanPan("2285",yanPanVo);
                }
                if (flag2286){
                    updateYanPan("2286",yanPanVo);
                }
                if (flag2287){
                    updateYanPan("2287",yanPanVo);
                }
                if (flag2288){
                    updateYanPan("2288",yanPanVo);
                }
                if (flag2289){
                    updateYanPan("2289",yanPanVo);
                }
                if (flag2290){
                    updateYanPan("2290",yanPanVo);
                }
                if (flag2291){
                    updateYanPan("2291",yanPanVo);
                }
                if (flag2292){
                    updateYanPan("2292",yanPanVo);
                }
                if (flag2293){
                    updateYanPan("2293",yanPanVo);
                }
                if (flag2294){
                    updateYanPan("2294",yanPanVo);
                }
                if (flag2295){
                    updateYanPan("2295",yanPanVo);
                }
                if (flag2296){
                    updateYanPan("2296",yanPanVo);
                }
                if (flag2297){
                    updateYanPan("2297",yanPanVo);
                }
                if (flag2298){
                    updateYanPan("2298",yanPanVo);
                }
                if (flag2299){
                    updateYanPan("2299",yanPanVo);
                }
                if (flag2300){
                    updateYanPan("2300",yanPanVo);
                }
                if (flag2301){
                    updateYanPan("2301",yanPanVo);
                }
                if (flag2302){
                    updateYanPan("2302",yanPanVo);
                }
                if (flag2303){
                    updateYanPan("2303",yanPanVo);
                }
                if (flag2304){
                    updateYanPan("2304",yanPanVo);
                }
                if (flag2305){
                    updateYanPan("2305",yanPanVo);
                }
                if (flag2306){
                    updateYanPan("2306",yanPanVo);
                }
                if (flag2307){
                    updateYanPan("2307",yanPanVo);
                }
                if (flag2308){
                    updateYanPan("2308",yanPanVo);
                }
                if (flag2309){
                    updateYanPan("2309",yanPanVo);
                }
                if (flag2310){
                    updateYanPan("2310",yanPanVo);
                }
                if (flag2311){
                    updateYanPan("2311",yanPanVo);
                }
                if (flag2312){
                    updateYanPan("2312",yanPanVo);
                }
                if (flag2313){
                    updateYanPan("2313",yanPanVo);
                }
                if (flag2314){
                    updateYanPan("2314",yanPanVo);
                }
                if (flag2315){
                    updateYanPan("2315",yanPanVo);
                }
                if (flag2316){
                    updateYanPan("2316",yanPanVo);
                }
                if (flag2317){
                    updateYanPan("2317",yanPanVo);
                }
                if (flag2318){
                    updateYanPan("2318",yanPanVo);
                }
                if (flag2319){
                    updateYanPan("2319",yanPanVo);
                }
                if (flag2320){
                    updateYanPan("2320",yanPanVo);
                }
                if (flag2321){
                    updateYanPan("2321",yanPanVo);
                }

                if (flag2322){
                    updateYanPan("2322",yanPanVo);
                }
                if (flag2323){
                    updateYanPan("2323",yanPanVo);
                }

                if (flag2324){
                    updateYanPan("2324",yanPanVo);
                }
                if (flag2325){
                    updateYanPan("2325",yanPanVo);
                }
                if (flag2326){
                    updateYanPan("2326",yanPanVo);
                }
                if (flag2327){
                    updateYanPan("2327",yanPanVo);
                }
                if (flag2328){
                    updateYanPan("2328",yanPanVo);
                }
                if (flag2329){
                    updateYanPan("2329",yanPanVo);
                }
                if (flag2330){
                    updateYanPan("2330",yanPanVo);
                }
                if (flag2331){
                    updateYanPan("2331",yanPanVo);
                }
                if (flag2332){
                    updateYanPan("2332",yanPanVo);
                }
                if (flag2333){
                    updateYanPan("2333",yanPanVo);
                }
                if (flag2334){
                    updateYanPan("2334",yanPanVo);
                }
                if (flag2335){
                    updateYanPan("2335",yanPanVo);
                }
                if (flag2336){
                    updateYanPan("2336",yanPanVo);
                }
                if (flag2337){
                    updateYanPan("2337",yanPanVo);
                }
                if (flag2338){
                    updateYanPan("2338",yanPanVo);
                }
                if (flag2339){
                    updateYanPan("2339",yanPanVo);
                }
                if (flag2340){
                    updateYanPan("2340",yanPanVo);
                }
                if (flag2341){
                    updateYanPan("2341",yanPanVo);
                }
                if (flag2342){
                    updateYanPan("2342",yanPanVo);
                }
                if (flag2343){
                    updateYanPan("2343",yanPanVo);
                }
                if (flag2344){
                    updateYanPan("2344",yanPanVo);
                }
                if (flag2345){
                    updateYanPan("2345",yanPanVo);
                }
                if (flag2346){
                    updateYanPan("2346",yanPanVo);
                }
                if (flag2347){
                    updateYanPan("2347",yanPanVo);
                }
                if (flag2348){
                    updateYanPan("2348",yanPanVo);
                }
                if (flag2349){
                    updateYanPan("2349",yanPanVo);
                }
                if (flag2350){
                    updateYanPan("2350",yanPanVo);
                }
                if (flag2351){
                    updateYanPan("2351",yanPanVo);
                }
                if (flag2352){
                    updateYanPan("2352",yanPanVo);
                }
                if (flag2353){
                    updateYanPan("2353",yanPanVo);
                }
                if (flag2354){
                    updateYanPan("2354",yanPanVo);
                }
                if (flag2355){
                    updateYanPan("2355",yanPanVo);
                }
                if (flag2356){
                    updateYanPan("2356",yanPanVo);
                }
                if (flag2357){
                    updateYanPan("2357",yanPanVo);
                }
                if (flag2358){
                    updateYanPan("2358",yanPanVo);
                }
                if (flag2359){
                    updateYanPan("2359",yanPanVo);
                }
                if (flag2360){
                    updateYanPan("2360",yanPanVo);
                }
                if (flag2361){
                    updateYanPan("2361",yanPanVo);
                }
                if (flag2362){
                    updateYanPan("2362",yanPanVo);
                }
                if (flag2363){
                    updateYanPan("2363",yanPanVo);
                }
                if (flag2364){
                    updateYanPan("2364",yanPanVo);
                }
                if (flag2365){
                    updateYanPan("2365",yanPanVo);
                }
                if (flag2366){
                    updateYanPan("2366",yanPanVo);
                }
                if (flag2367){
                    updateYanPan("2367",yanPanVo);
                }
                if (flag2368){
                    updateYanPan("2368",yanPanVo);
                }
                if (flag2369){
                    updateYanPan("2369",yanPanVo);
                }
                if (flag2370){
                    updateYanPan("2370",yanPanVo);
                }
                if (flag2371){
                    updateYanPan("2371",yanPanVo);
                }
                if (flag2372){
                    updateYanPan("2372",yanPanVo);
                }
                if (flag2373){
                    updateYanPan("2373",yanPanVo);
                }
                if (flag2374){
                    updateYanPan("2374",yanPanVo);
                }
                if (flag2375){
                    updateYanPan("2375",yanPanVo);
                }
                if (flag2376){
                    updateYanPan("2376",yanPanVo);
                }
                if (flag2377){
                    updateYanPan("2377",yanPanVo);
                }
                if (flag2378){
                    updateYanPan("2378",yanPanVo);
                }

                stockDayAllList1.remove(0);

            }
        }
        return true;
    }
    private  boolean updateYanPan(String id,YanPanVo yanPanVo){
        StockDayYanPan1 stockDayYanPan1=new StockDayYanPan1();
        if (yanPanVo!=null) {
                StockDayYanPan1 stockDayYanPan11= stockDayYanPan1Service.getById(id);
                stockDayYanPan1.setId(stockDayYanPan11.getId());
                stockDayYanPan1.setName(stockDayYanPan11.getName());
                if (yanPanVo.getWeiLaiChange1().compareTo(new BigDecimal(0)) > 0) {
                    BigDecimal count = stockDayYanPan11.getShangZhangCount1().add(new BigDecimal(1));
                    stockDayYanPan1.setShangZhangCount1(count);
                    BigDecimal sum = stockDayYanPan11.getShangZhangSum1().add(yanPanVo.getWeiLaiChange1());
                    stockDayYanPan1.setShangZhangSum1(sum);
                    BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                    stockDayYanPan1.setShangZhangMa1(ma);
                    BigDecimal rate = count.divide((count.add(stockDayYanPan11.getXiaJiangCount1())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                    stockDayYanPan1.setShangZhangRate1(rate);
                } else {
                    BigDecimal count = stockDayYanPan11.getXiaJiangCount1().add(new BigDecimal(1));
                    stockDayYanPan1.setXiaJiangCount1(count);
                    BigDecimal sum = stockDayYanPan11.getXiaJiangSum1().add(yanPanVo.getWeiLaiChange1());
                    stockDayYanPan1.setXiaJiangSum1(sum);
                    BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                    stockDayYanPan1.setXiaJiangMa1(ma);
                    BigDecimal rate = count.divide((count.add(stockDayYanPan11.getShangZhangCount1())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                    stockDayYanPan1.setXiaJiangRate1(rate);
                }
                if (yanPanVo.getWeiLaiChange2().compareTo(new BigDecimal(0)) > 0) {
                    BigDecimal count = stockDayYanPan11.getShangZhangCount2().add(new BigDecimal(1));
                    stockDayYanPan1.setShangZhangCount2(count);
                    BigDecimal sum = stockDayYanPan11.getShangZhangSum2().add(yanPanVo.getWeiLaiChange2());
                    stockDayYanPan1.setShangZhangSum2(sum);
                    BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                    stockDayYanPan1.setShangZhangMa2(ma);
                    BigDecimal rate = count.divide((count.add(stockDayYanPan11.getXiaJiangCount2())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                    stockDayYanPan1.setShangZhangRate2(rate);
                } else {
                    BigDecimal count = stockDayYanPan11.getXiaJiangCount2().add(new BigDecimal(1));
                    stockDayYanPan1.setXiaJiangCount2(count);
                    BigDecimal sum = stockDayYanPan11.getXiaJiangSum2().add(yanPanVo.getWeiLaiChange2());
                    stockDayYanPan1.setXiaJiangSum2(sum);
                    BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                    stockDayYanPan1.setXiaJiangMa2(ma);
                    BigDecimal rate = count.divide((count.add(stockDayYanPan11.getShangZhangCount2())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                    stockDayYanPan1.setXiaJiangRate2(rate);
                }
                if (yanPanVo.getWeiLaiChange3().compareTo(new BigDecimal(0)) > 0) {
                    BigDecimal count = stockDayYanPan11.getShangZhangCount3().add(new BigDecimal(1));
                    stockDayYanPan1.setShangZhangCount3(count);
                    BigDecimal sum = stockDayYanPan11.getShangZhangSum3().add(yanPanVo.getWeiLaiChange3());
                    stockDayYanPan1.setShangZhangSum3(sum);
                    BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                    stockDayYanPan1.setShangZhangMa3(ma);
                    BigDecimal rate = count.divide((count.add(stockDayYanPan11.getXiaJiangCount3())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                    stockDayYanPan1.setShangZhangRate3(rate);
                } else {
                    BigDecimal count = stockDayYanPan11.getXiaJiangCount3().add(new BigDecimal(1));
                    stockDayYanPan1.setXiaJiangCount3(count);
                    BigDecimal sum = stockDayYanPan11.getXiaJiangSum3().add(yanPanVo.getWeiLaiChange3());
                    stockDayYanPan1.setXiaJiangSum3(sum);
                    BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                    stockDayYanPan1.setXiaJiangMa3(ma);
                    BigDecimal rate = count.divide((count.add(stockDayYanPan11.getShangZhangCount3())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                    stockDayYanPan1.setXiaJiangRate3(rate);
                }
                if (yanPanVo.getWeiLaiChange5().compareTo(new BigDecimal(0)) > 0) {
                    BigDecimal count = stockDayYanPan11.getShangZhangCount5().add(new BigDecimal(1));
                    stockDayYanPan1.setShangZhangCount5(count);
                    BigDecimal sum = stockDayYanPan11.getShangZhangSum5().add(yanPanVo.getWeiLaiChange5());
                    stockDayYanPan1.setShangZhangSum5(sum);
                    BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                    stockDayYanPan1.setShangZhangMa5(ma);
                    BigDecimal rate = count.divide((count.add(stockDayYanPan11.getXiaJiangCount5())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                    stockDayYanPan1.setShangZhangRate5(rate);
                } else {
                    BigDecimal count = stockDayYanPan11.getXiaJiangCount5().add(new BigDecimal(1));
                    stockDayYanPan1.setXiaJiangCount5(count);
                    BigDecimal sum = stockDayYanPan11.getXiaJiangSum5().add(yanPanVo.getWeiLaiChange5());
                    stockDayYanPan1.setXiaJiangSum5(sum);
                    BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                    stockDayYanPan1.setXiaJiangMa5(ma);
                    BigDecimal rate = count.divide((count.add(stockDayYanPan11.getShangZhangCount5())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                    stockDayYanPan1.setXiaJiangRate5(rate);
                }
                if (yanPanVo.getWeiLaiChange8().compareTo(new BigDecimal(0)) > 0) {
                    BigDecimal count = stockDayYanPan11.getShangZhangCount8().add(new BigDecimal(1));
                    stockDayYanPan1.setShangZhangCount8(count);
                    BigDecimal sum = stockDayYanPan11.getShangZhangSum8().add(yanPanVo.getWeiLaiChange8());
                    stockDayYanPan1.setShangZhangSum8(sum);
                    BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                    stockDayYanPan1.setShangZhangMa8(ma);
                    BigDecimal rate = count.divide((count.add(stockDayYanPan11.getXiaJiangCount8())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                    stockDayYanPan1.setShangZhangRate8(rate);
                } else {
                    BigDecimal count = stockDayYanPan11.getXiaJiangCount8().add(new BigDecimal(1));
                    stockDayYanPan1.setXiaJiangCount8(count);
                    BigDecimal sum = stockDayYanPan11.getXiaJiangSum8().add(yanPanVo.getWeiLaiChange8());
                    stockDayYanPan1.setXiaJiangSum8(sum);
                    BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                    stockDayYanPan1.setXiaJiangMa8(ma);
                    BigDecimal rate = count.divide((count.add(stockDayYanPan11.getShangZhangCount8())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                    stockDayYanPan1.setXiaJiangRate8(rate);
                }
                if (yanPanVo.getWeiLaiChange13().compareTo(new BigDecimal(0)) > 0) {
                    BigDecimal count = stockDayYanPan11.getShangZhangCount13().add(new BigDecimal(1));
                    stockDayYanPan1.setShangZhangCount13(count);
                    BigDecimal sum = stockDayYanPan11.getShangZhangSum13().add(yanPanVo.getWeiLaiChange13());
                    stockDayYanPan1.setShangZhangSum13(sum);
                    BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                    stockDayYanPan1.setShangZhangMa13(ma);
                    BigDecimal rate = count.divide((count.add(stockDayYanPan11.getXiaJiangCount13())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                    stockDayYanPan1.setShangZhangRate13(rate);
                } else {
                    BigDecimal count = stockDayYanPan11.getXiaJiangCount13().add(new BigDecimal(1));
                    stockDayYanPan1.setXiaJiangCount13(count);
                    BigDecimal sum = stockDayYanPan11.getXiaJiangSum13().add(yanPanVo.getWeiLaiChange13());
                    stockDayYanPan1.setXiaJiangSum13(sum);
                    BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                    stockDayYanPan1.setXiaJiangMa13(ma);
                    BigDecimal rate = count.divide((count.add(stockDayYanPan11.getShangZhangCount13())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                    stockDayYanPan1.setXiaJiangRate13(rate);
                }
                if (yanPanVo.getWeiLaiChange20().compareTo(new BigDecimal(0)) > 0) {
                    BigDecimal count = stockDayYanPan11.getShangZhangCount20().add(new BigDecimal(1));
                    stockDayYanPan1.setShangZhangCount20(count);
                    BigDecimal sum = stockDayYanPan11.getShangZhangSum20().add(yanPanVo.getWeiLaiChange20());
                    stockDayYanPan1.setShangZhangSum20(sum);
                    BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                    stockDayYanPan1.setShangZhangMa20(ma);
                    BigDecimal rate = count.divide((count.add(stockDayYanPan11.getXiaJiangCount20())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                    stockDayYanPan1.setShangZhangRate20(rate);
                } else {
                    BigDecimal count = stockDayYanPan11.getXiaJiangCount20().add(new BigDecimal(1));
                    stockDayYanPan1.setXiaJiangCount20(count);
                    BigDecimal sum = stockDayYanPan11.getXiaJiangSum20().add(yanPanVo.getWeiLaiChange20());
                    stockDayYanPan1.setXiaJiangSum20(sum);
                    BigDecimal ma = sum.divide(count, 2, RoundingMode.HALF_UP);
                    stockDayYanPan1.setXiaJiangMa20(ma);
                    BigDecimal rate = count.divide((count.add(stockDayYanPan11.getShangZhangCount20())), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                    stockDayYanPan1.setXiaJiangRate20(rate);
                }
                stockDayYanPan1Service.updateById(stockDayYanPan1);
        }
        return true;
    }
}
