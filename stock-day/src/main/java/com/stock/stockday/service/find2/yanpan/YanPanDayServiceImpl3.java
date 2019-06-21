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
import com.stock.stockday.util.FindUtil5;
import com.stock.stockday.util.FindUtil6;
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

                boolean flag413= FindUtil17.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag414= FindUtil17.shengVDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag415= FindUtil17.reset20Dapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag416= FindUtil17.jieQiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag417= FindUtil17.jishujieqiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag418= FindUtil17.jishujieqiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag419= FindUtil17.jieQiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag420= FindUtil17.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag421= FindUtil17.shengVDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag422= FindUtil17.reset20Dapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag423= FindUtil17.jieQiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag424= FindUtil17.jishujieqiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag425= FindUtil17.jishujieqiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag426= FindUtil17.jishujieqiDapan7(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag427= FindUtil17.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag428= FindUtil17.shengVDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag429= FindUtil17.reset20Dapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag430= FindUtil17.jieQiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag431= FindUtil17.jishujieqiDapan8(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag432= FindUtil17.jishujieqiDapan9(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag433= FindUtil17.jieQiDapan7(stockDayAllList2,scienceEntityListDaPan);
                boolean flag434= FindUtil17.jieQiDapan8(stockDayAllList2,scienceEntityListDaPan);
                boolean flag435= FindUtil17.jieQiDapan9(stockDayAllList2,scienceEntityListDaPan);
                boolean flag436= FindUtil17.jieQiDapan10(stockDayAllList2,scienceEntityListDaPan);
                boolean flag437= FindUtil17.jieQiDapan11(stockDayAllList2,scienceEntityListDaPan);
                boolean flag438= FindUtil17.jieQiDapan12(stockDayAllList2,scienceEntityListDaPan);

                boolean flag439= FindUtil18.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag440= FindUtil18.shengVDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag441= FindUtil18.reset20Dapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag442= FindUtil18.jieQiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag443= FindUtil18.jishujieqiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag444= FindUtil18.jishujieqiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag445= FindUtil18.jieQiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag446= FindUtil18.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag447= FindUtil18.shengVDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag448= FindUtil18.reset20Dapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag449= FindUtil18.jieQiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag450= FindUtil18.jishujieqiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag451= FindUtil18.jishujieqiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag452= FindUtil18.jishujieqiDapan7(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag453= FindUtil18.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag454= FindUtil18.shengVDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag455= FindUtil18.reset20Dapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag456= FindUtil18.jieQiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag457= FindUtil18.jishujieqiDapan8(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag458= FindUtil18.jishujieqiDapan9(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag459= FindUtil18.jieQiDapan7(stockDayAllList2,scienceEntityListDaPan);
                boolean flag460= FindUtil18.jieQiDapan8(stockDayAllList2,scienceEntityListDaPan);
                boolean flag461= FindUtil18.jieQiDapan9(stockDayAllList2,scienceEntityListDaPan);
                boolean flag462= FindUtil18.jieQiDapan10(stockDayAllList2,scienceEntityListDaPan);
                boolean flag463= FindUtil18.jieQiDapan11(stockDayAllList2,scienceEntityListDaPan);
                boolean flag464= FindUtil18.jieQiDapan12(stockDayAllList2,scienceEntityListDaPan);

                boolean flag465= FindUtil19.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag466= FindUtil19.shengVDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag467= FindUtil19.reset20Dapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag468= FindUtil19.jieQiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag469= FindUtil19.jishujieqiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag470= FindUtil19.jishujieqiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag471= FindUtil19.jieQiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag472= FindUtil19.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag473= FindUtil19.shengVDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag474= FindUtil19.reset20Dapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag475= FindUtil19.jieQiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag476= FindUtil19.jishujieqiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag477= FindUtil19.jishujieqiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag478= FindUtil19.jishujieqiDapan7(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag479= FindUtil19.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag480= FindUtil19.shengVDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag481= FindUtil19.reset20Dapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag482= FindUtil19.jieQiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag483= FindUtil19.jishujieqiDapan8(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag484= FindUtil19.jishujieqiDapan9(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag485= FindUtil19.jieQiDapan7(stockDayAllList2,scienceEntityListDaPan);
                boolean flag486= FindUtil19.jieQiDapan8(stockDayAllList2,scienceEntityListDaPan);
                boolean flag487= FindUtil19.jieQiDapan9(stockDayAllList2,scienceEntityListDaPan);
                boolean flag488= FindUtil19.jieQiDapan10(stockDayAllList2,scienceEntityListDaPan);
                boolean flag489= FindUtil19.jieQiDapan11(stockDayAllList2,scienceEntityListDaPan);
                boolean flag490= FindUtil19.jieQiDapan12(stockDayAllList2,scienceEntityListDaPan);

                boolean flag491= FindUtil20.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag492= FindUtil20.shengVDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag493= FindUtil20.reset20Dapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag494= FindUtil20.jieQiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag495= FindUtil20.jishujieqiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag496= FindUtil20.jishujieqiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag497= FindUtil20.jieQiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag498= FindUtil20.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag499= FindUtil20.shengVDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag500= FindUtil20.reset20Dapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag501= FindUtil20.jieQiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag502= FindUtil20.jishujieqiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag503= FindUtil20.jishujieqiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag504= FindUtil20.jishujieqiDapan7(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag505= FindUtil20.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag506= FindUtil20.shengVDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag507= FindUtil20.reset20Dapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag508= FindUtil20.jieQiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag509= FindUtil20.jishujieqiDapan8(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag510= FindUtil20.jishujieqiDapan9(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag511= FindUtil20.jieQiDapan7(stockDayAllList2,scienceEntityListDaPan);
                boolean flag512= FindUtil20.jieQiDapan8(stockDayAllList2,scienceEntityListDaPan);
                boolean flag513= FindUtil20.jieQiDapan9(stockDayAllList2,scienceEntityListDaPan);
                boolean flag514= FindUtil20.jieQiDapan10(stockDayAllList2,scienceEntityListDaPan);
                boolean flag515= FindUtil20.jieQiDapan11(stockDayAllList2,scienceEntityListDaPan);
                boolean flag516= FindUtil20.jieQiDapan12(stockDayAllList2,scienceEntityListDaPan);

                boolean flag517= FindUtil21.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag518= FindUtil21.shengVDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag519= FindUtil21.reset20Dapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag520= FindUtil21.jieQiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag521= FindUtil21.jishujieqiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag522= FindUtil21.jishujieqiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag523= FindUtil21.jieQiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag524= FindUtil21.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag525= FindUtil21.shengVDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag526= FindUtil21.reset20Dapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag527= FindUtil21.jieQiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag528= FindUtil21.jishujieqiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag529= FindUtil21.jishujieqiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag530= FindUtil21.jishujieqiDapan7(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag531= FindUtil21.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag532= FindUtil21.shengVDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag533= FindUtil21.reset20Dapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag534= FindUtil21.jieQiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag535= FindUtil21.jishujieqiDapan8(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag536= FindUtil21.jishujieqiDapan9(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag537= FindUtil21.jieQiDapan7(stockDayAllList2,scienceEntityListDaPan);
                boolean flag538= FindUtil21.jieQiDapan8(stockDayAllList2,scienceEntityListDaPan);
                boolean flag539= FindUtil21.jieQiDapan9(stockDayAllList2,scienceEntityListDaPan);
                boolean flag540= FindUtil21.jieQiDapan10(stockDayAllList2,scienceEntityListDaPan);
                boolean flag541= FindUtil21.jieQiDapan11(stockDayAllList2,scienceEntityListDaPan);
                boolean flag542= FindUtil21.jieQiDapan12(stockDayAllList2,scienceEntityListDaPan);

                boolean flag543= FindUtil22.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag544= FindUtil22.shengVDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag545= FindUtil22.reset20Dapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag546= FindUtil22.jieQiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag547= FindUtil22.jishujieqiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag548= FindUtil22.jishujieqiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag549= FindUtil22.jieQiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag550= FindUtil22.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag551= FindUtil22.shengVDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag552= FindUtil22.reset20Dapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag553= FindUtil22.jieQiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag554= FindUtil22.jishujieqiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag555= FindUtil22.jishujieqiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag556= FindUtil22.jishujieqiDapan7(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag557= FindUtil22.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag558= FindUtil22.shengVDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag559= FindUtil22.reset20Dapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag560= FindUtil22.jieQiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag561= FindUtil22.jishujieqiDapan8(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag562= FindUtil22.jishujieqiDapan9(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag563= FindUtil22.jieQiDapan7(stockDayAllList2,scienceEntityListDaPan);
                boolean flag564= FindUtil22.jieQiDapan8(stockDayAllList2,scienceEntityListDaPan);
                boolean flag565= FindUtil22.jieQiDapan9(stockDayAllList2,scienceEntityListDaPan);
                boolean flag566= FindUtil22.jieQiDapan10(stockDayAllList2,scienceEntityListDaPan);
                boolean flag567= FindUtil22.jieQiDapan11(stockDayAllList2,scienceEntityListDaPan);
                boolean flag568= FindUtil22.jieQiDapan12(stockDayAllList2,scienceEntityListDaPan);

                boolean flag569= FindUtil23.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag570= FindUtil23.shengVDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag571= FindUtil23.reset20Dapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag572= FindUtil23.jieQiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag573= FindUtil23.jishujieqiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag574= FindUtil23.jishujieqiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag575= FindUtil23.jieQiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag576= FindUtil23.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag577= FindUtil23.shengVDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag578= FindUtil23.reset20Dapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag579= FindUtil23.jieQiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag580= FindUtil23.jishujieqiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag581= FindUtil23.jishujieqiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag582= FindUtil23.jishujieqiDapan7(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag583= FindUtil23.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag584= FindUtil23.shengVDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag585= FindUtil23.reset20Dapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag586= FindUtil23.jieQiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag587= FindUtil23.jishujieqiDapan8(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag588= FindUtil23.jishujieqiDapan9(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag589= FindUtil23.jieQiDapan7(stockDayAllList2,scienceEntityListDaPan);
                boolean flag590= FindUtil23.jieQiDapan8(stockDayAllList2,scienceEntityListDaPan);
                boolean flag591= FindUtil23.jieQiDapan9(stockDayAllList2,scienceEntityListDaPan);
                boolean flag592= FindUtil23.jieQiDapan10(stockDayAllList2,scienceEntityListDaPan);
                boolean flag593= FindUtil23.jieQiDapan11(stockDayAllList2,scienceEntityListDaPan);
                boolean flag594= FindUtil23.jieQiDapan12(stockDayAllList2,scienceEntityListDaPan);

                boolean flag595= FindUtil24.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag596= FindUtil24.shengVDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag597= FindUtil24.reset20Dapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag598= FindUtil24.jieQiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag599= FindUtil24.jishujieqiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag600= FindUtil24.jishujieqiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag601= FindUtil24.jieQiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag602= FindUtil24.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag603= FindUtil24.shengVDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag604= FindUtil24.reset20Dapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag605= FindUtil24.jieQiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag606= FindUtil24.jishujieqiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag607= FindUtil24.jishujieqiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag610= FindUtil24.jishujieqiDapan7(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag612= FindUtil24.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag613= FindUtil24.shengVDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag614= FindUtil24.reset20Dapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag615= FindUtil24.jieQiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag616= FindUtil24.jishujieqiDapan8(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag617= FindUtil24.jishujieqiDapan9(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag618= FindUtil24.jieQiDapan7(stockDayAllList2,scienceEntityListDaPan);
                boolean flag619= FindUtil24.jieQiDapan8(stockDayAllList2,scienceEntityListDaPan);
                boolean flag620= FindUtil24.jieQiDapan9(stockDayAllList2,scienceEntityListDaPan);
                boolean flag621= FindUtil24.jieQiDapan10(stockDayAllList2,scienceEntityListDaPan);
                boolean flag622= FindUtil24.jieQiDapan11(stockDayAllList2,scienceEntityListDaPan);
                boolean flag623= FindUtil24.jieQiDapan12(stockDayAllList2,scienceEntityListDaPan);

                boolean flag624= FindUtil25.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag625= FindUtil25.shengVDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag626= FindUtil25.reset20Dapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag627= FindUtil25.jieQiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag628= FindUtil25.jishujieqiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag629= FindUtil25.jishujieqiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag630= FindUtil25.jieQiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag631= FindUtil25.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag632= FindUtil25.shengVDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag633= FindUtil25.reset20Dapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag634= FindUtil25.jieQiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag635= FindUtil25.jishujieqiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag636= FindUtil25.jishujieqiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag637= FindUtil25.jishujieqiDapan7(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag638= FindUtil25.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag639= FindUtil25.shengVDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag640= FindUtil25.reset20Dapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag641= FindUtil25.jieQiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag642= FindUtil25.jishujieqiDapan8(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag643= FindUtil25.jishujieqiDapan9(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag644= FindUtil25.jieQiDapan7(stockDayAllList2,scienceEntityListDaPan);
                boolean flag645= FindUtil25.jieQiDapan8(stockDayAllList2,scienceEntityListDaPan);
                boolean flag646= FindUtil25.jieQiDapan9(stockDayAllList2,scienceEntityListDaPan);
                boolean flag647= FindUtil25.jieQiDapan10(stockDayAllList2,scienceEntityListDaPan);
                boolean flag648= FindUtil25.jieQiDapan11(stockDayAllList2,scienceEntityListDaPan);
                boolean flag649= FindUtil25.jieQiDapan12(stockDayAllList2,scienceEntityListDaPan);

                boolean flag650= FindUtil26.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag651= FindUtil26.shengVDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag652= FindUtil26.reset20Dapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag653= FindUtil26.jieQiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag654= FindUtil26.jishujieqiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag655= FindUtil26.jishujieqiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag656= FindUtil26.jieQiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag657= FindUtil26.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag658= FindUtil26.shengVDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag659= FindUtil26.reset20Dapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag660= FindUtil26.jieQiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag661= FindUtil26.jishujieqiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag662= FindUtil26.jishujieqiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag663= FindUtil26.jishujieqiDapan7(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag664= FindUtil26.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag665= FindUtil26.shengVDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag666= FindUtil26.reset20Dapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag667= FindUtil26.jieQiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag668= FindUtil26.jishujieqiDapan8(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag669= FindUtil26.jishujieqiDapan9(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag670= FindUtil26.jieQiDapan7(stockDayAllList2,scienceEntityListDaPan);
                boolean flag671= FindUtil26.jieQiDapan8(stockDayAllList2,scienceEntityListDaPan);
                boolean flag672= FindUtil26.jieQiDapan9(stockDayAllList2,scienceEntityListDaPan);
                boolean flag673= FindUtil26.jieQiDapan10(stockDayAllList2,scienceEntityListDaPan);
                boolean flag674= FindUtil26.jieQiDapan11(stockDayAllList2,scienceEntityListDaPan);
                boolean flag675= FindUtil26.jieQiDapan12(stockDayAllList2,scienceEntityListDaPan);

                boolean flag676= FindUtil27.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag677= FindUtil27.shengVDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag678= FindUtil27.reset20Dapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag679= FindUtil27.jieQiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag680= FindUtil27.jishujieqiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag681= FindUtil27.jishujieqiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag682= FindUtil27.jieQiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag683= FindUtil27.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag684= FindUtil27.shengVDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag685= FindUtil27.reset20Dapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag686= FindUtil27.jieQiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag687= FindUtil27.jishujieqiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag688= FindUtil27.jishujieqiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag689= FindUtil27.jishujieqiDapan7(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag690= FindUtil27.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag691= FindUtil27.shengVDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag692= FindUtil27.reset20Dapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag693= FindUtil27.jieQiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag694= FindUtil27.jishujieqiDapan8(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag695= FindUtil27.jishujieqiDapan9(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag696= FindUtil27.jieQiDapan7(stockDayAllList2,scienceEntityListDaPan);
                boolean flag697= FindUtil27.jieQiDapan8(stockDayAllList2,scienceEntityListDaPan);
                boolean flag698= FindUtil27.jieQiDapan9(stockDayAllList2,scienceEntityListDaPan);
                boolean flag699= FindUtil27.jieQiDapan10(stockDayAllList2,scienceEntityListDaPan);
                boolean flag700= FindUtil27.jieQiDapan11(stockDayAllList2,scienceEntityListDaPan);
                boolean flag701= FindUtil27.jieQiDapan12(stockDayAllList2,scienceEntityListDaPan);

                boolean flag702= FindUtil28.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag703= FindUtil28.shengVDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag704= FindUtil28.reset20Dapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag705= FindUtil28.jieQiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag706= FindUtil28.jishujieqiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag707= FindUtil28.jishujieqiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag708= FindUtil28.jieQiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag709= FindUtil28.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag710= FindUtil28.shengVDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag711= FindUtil28.reset20Dapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag712= FindUtil28.jieQiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag713= FindUtil28.jishujieqiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag714= FindUtil28.jishujieqiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag715= FindUtil28.jishujieqiDapan7(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag716= FindUtil28.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag717= FindUtil28.shengVDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag718= FindUtil28.reset20Dapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag719= FindUtil28.jieQiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag720= FindUtil28.jishujieqiDapan8(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag721= FindUtil28.jishujieqiDapan9(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag722= FindUtil28.jieQiDapan7(stockDayAllList2,scienceEntityListDaPan);
                boolean flag723= FindUtil28.jieQiDapan8(stockDayAllList2,scienceEntityListDaPan);
                boolean flag724= FindUtil28.jieQiDapan9(stockDayAllList2,scienceEntityListDaPan);
                boolean flag725= FindUtil28.jieQiDapan10(stockDayAllList2,scienceEntityListDaPan);
                boolean flag726= FindUtil28.jieQiDapan11(stockDayAllList2,scienceEntityListDaPan);
                boolean flag727= FindUtil28.jieQiDapan12(stockDayAllList2,scienceEntityListDaPan);

                boolean flag728= FindUtil29.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag729= FindUtil29.shengVDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag730= FindUtil29.reset20Dapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag731= FindUtil29.jieQiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag732= FindUtil29.jishujieqiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag733= FindUtil29.jishujieqiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag734= FindUtil29.jieQiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag735= FindUtil29.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag736= FindUtil29.shengVDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag737= FindUtil29.reset20Dapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag738= FindUtil29.jieQiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag739= FindUtil29.jishujieqiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag740= FindUtil29.jishujieqiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag741= FindUtil29.jishujieqiDapan7(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag742= FindUtil29.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag743= FindUtil29.shengVDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag744= FindUtil29.reset20Dapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag745= FindUtil29.jieQiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag746= FindUtil29.jishujieqiDapan8(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag747= FindUtil29.jishujieqiDapan9(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag748= FindUtil29.jieQiDapan7(stockDayAllList2,scienceEntityListDaPan);
                boolean flag749= FindUtil29.jieQiDapan8(stockDayAllList2,scienceEntityListDaPan);
                boolean flag750= FindUtil29.jieQiDapan9(stockDayAllList2,scienceEntityListDaPan);
                boolean flag751= FindUtil29.jieQiDapan10(stockDayAllList2,scienceEntityListDaPan);
                boolean flag752= FindUtil29.jieQiDapan11(stockDayAllList2,scienceEntityListDaPan);
                boolean flag753= FindUtil29.jieQiDapan12(stockDayAllList2,scienceEntityListDaPan);

                if (flag413){
                    updateYanPan("413",yanPanVo);
                }
                if (flag414){
                    updateYanPan("414",yanPanVo);
                }
                if (flag415){
                    updateYanPan("415",yanPanVo);
                }
                if (flag416){
                    updateYanPan("416",yanPanVo);
                }
                if (flag417){
                    updateYanPan("417",yanPanVo);
                }
                if (flag418){
                    updateYanPan("418",yanPanVo);
                }
                if (flag419){
                    updateYanPan("419",yanPanVo);
                }
                if (flag420){
                    updateYanPan("420",yanPanVo);
                }
                if (flag421){
                    updateYanPan("421",yanPanVo);
                }
                if (flag422){
                    updateYanPan("422",yanPanVo);
                }
                if (flag423){
                    updateYanPan("423",yanPanVo);
                }
                if (flag424){
                    updateYanPan("424",yanPanVo);
                }
                if (flag425){
                    updateYanPan("425",yanPanVo);
                }
                if (flag426){
                    updateYanPan("426",yanPanVo);
                }
                if (flag427){
                    updateYanPan("427",yanPanVo);
                }
                if (flag428){
                    updateYanPan("428",yanPanVo);
                }
                if (flag429){
                    updateYanPan("429",yanPanVo);
                }
                if (flag430){
                    updateYanPan("430",yanPanVo);
                }
                if (flag431){
                    updateYanPan("431",yanPanVo);
                }
                if (flag432){
                    updateYanPan("432",yanPanVo);
                }
                if (flag433){
                    updateYanPan("433",yanPanVo);
                }
                if (flag434){
                    updateYanPan("434",yanPanVo);
                }
                if (flag435){
                    updateYanPan("435",yanPanVo);
                }
                if (flag436){
                    updateYanPan("436",yanPanVo);
                }
                if (flag437){
                    updateYanPan("437",yanPanVo);
                }
                if (flag438){
                    updateYanPan("438",yanPanVo);
                }
                if (flag439){
                    updateYanPan("439",yanPanVo);
                }
                if (flag440){
                    updateYanPan("440",yanPanVo);
                }
                if (flag441){
                    updateYanPan("441",yanPanVo);
                }
                if (flag442){
                    updateYanPan("242",yanPanVo);
                }
                if (flag443){
                    updateYanPan("443",yanPanVo);
                }
                if (flag444){
                    updateYanPan("444",yanPanVo);
                }
                if (flag445){
                    updateYanPan("445",yanPanVo);
                }
                if (flag446){
                    updateYanPan("446",yanPanVo);
                }
                if (flag447){
                    updateYanPan("447",yanPanVo);
                }
                if (flag448){
                    updateYanPan("448",yanPanVo);
                }
                if (flag449){
                    updateYanPan("449",yanPanVo);
                }
                if (flag450){
                    updateYanPan("450",yanPanVo);
                }
                if (flag451){
                    updateYanPan("451",yanPanVo);
                }
                if (flag452){
                    updateYanPan("452",yanPanVo);
                }
                if (flag453){
                    updateYanPan("453",yanPanVo);
                }
                if (flag454){
                    updateYanPan("454",yanPanVo);
                }
                if (flag455){
                    updateYanPan("455",yanPanVo);
                }

                if (flag456){
                    updateYanPan("456",yanPanVo);
                }
                if (flag457){
                    updateYanPan("457",yanPanVo);
                }
                if (flag458){
                    updateYanPan("458",yanPanVo);
                }
                if (flag459){
                    updateYanPan("459",yanPanVo);
                }
                if (flag460){
                    updateYanPan("460",yanPanVo);
                }
                if (flag461){
                    updateYanPan("461",yanPanVo);
                }
                if (flag462){
                    updateYanPan("462",yanPanVo);
                }
                if (flag463){
                    updateYanPan("463",yanPanVo);
                }
                if (flag464){
                    updateYanPan("464",yanPanVo);
                }
                if (flag465){
                    updateYanPan("465",yanPanVo);
                }
                if (flag466){
                    updateYanPan("466",yanPanVo);
                }
                if (flag467){
                    updateYanPan("467",yanPanVo);
                }
                if (flag468){
                    updateYanPan("468",yanPanVo);
                }

                if (flag469){
                    updateYanPan("469",yanPanVo);
                }
                if (flag470){
                    updateYanPan("470",yanPanVo);
                }
                if (flag471){
                    updateYanPan("471",yanPanVo);
                }
                if (flag472){
                    updateYanPan("472",yanPanVo);
                }
                if (flag473){
                    updateYanPan("473",yanPanVo);
                }
                if (flag474){
                    updateYanPan("474",yanPanVo);
                }
                if (flag475){
                    updateYanPan("475",yanPanVo);
                }
                if (flag476){
                    updateYanPan("476",yanPanVo);
                }
                if (flag477){
                    updateYanPan("477",yanPanVo);
                }
                if (flag478){
                    updateYanPan("478",yanPanVo);
                }
                if (flag479){
                    updateYanPan("479",yanPanVo);
                }
                if (flag480){
                    updateYanPan("480",yanPanVo);
                }
                if (flag481){
                    updateYanPan("481",yanPanVo);
                }

                if (flag482){
                    updateYanPan("482",yanPanVo);
                }
                if (flag483){
                    updateYanPan("483",yanPanVo);
                }
                if (flag484){
                    updateYanPan("484",yanPanVo);
                }
                if (flag485){
                    updateYanPan("485",yanPanVo);
                }
                if (flag486){
                    updateYanPan("486",yanPanVo);
                }
                if (flag487){
                    updateYanPan("487",yanPanVo);
                }
                if (flag488){
                    updateYanPan("488",yanPanVo);
                }
                if (flag489){
                    updateYanPan("489",yanPanVo);
                }
                if (flag490){
                    updateYanPan("490",yanPanVo);
                }
                if (flag491){
                    updateYanPan("491",yanPanVo);
                }
                if (flag492){
                    updateYanPan("492",yanPanVo);
                }
                if (flag493){
                    updateYanPan("493",yanPanVo);
                }
                if (flag494){
                    updateYanPan("494",yanPanVo);
                }

                if (flag495){
                    updateYanPan("495",yanPanVo);
                }
                if (flag496){
                    updateYanPan("496",yanPanVo);
                }
                if (flag497){
                    updateYanPan("497",yanPanVo);
                }
                if (flag498){
                    updateYanPan("498",yanPanVo);
                }
                if (flag499){
                    updateYanPan("499",yanPanVo);
                }
                if (flag500){
                    updateYanPan("500",yanPanVo);
                }
                if (flag501){
                    updateYanPan("501",yanPanVo);
                }
                if (flag502){
                    updateYanPan("502",yanPanVo);
                }
                if (flag503){
                    updateYanPan("503",yanPanVo);
                }
                if (flag504){
                    updateYanPan("504",yanPanVo);
                }
                if (flag505){
                    updateYanPan("505",yanPanVo);
                }
                if (flag506){
                    updateYanPan("506",yanPanVo);
                }
                if (flag507){
                    updateYanPan("507",yanPanVo);
                }

                if (flag508){
                    updateYanPan("508",yanPanVo);
                }
                if (flag509){
                    updateYanPan("509",yanPanVo);
                }
                if (flag510){
                    updateYanPan("510",yanPanVo);
                }
                if (flag511){
                    updateYanPan("511",yanPanVo);
                }
                if (flag512){
                    updateYanPan("512",yanPanVo);
                }
                if (flag513){
                    updateYanPan("513",yanPanVo);
                }
                if (flag514){
                    updateYanPan("514",yanPanVo);
                }
                if (flag515){
                    updateYanPan("515",yanPanVo);
                }
                if (flag516){
                    updateYanPan("516",yanPanVo);
                }
                if (flag517){
                    updateYanPan("517",yanPanVo);
                }
                if (flag518){
                    updateYanPan("518",yanPanVo);
                }
                if (flag519){
                    updateYanPan("519",yanPanVo);
                }
                if (flag520){
                    updateYanPan("520",yanPanVo);
                }
                if (flag521){
                    updateYanPan("521",yanPanVo);
                }

                if (flag522){
                    updateYanPan("522",yanPanVo);
                }
                if (flag523){
                    updateYanPan("523",yanPanVo);
                }
                if (flag524){
                    updateYanPan("524",yanPanVo);
                }
                if (flag525){
                    updateYanPan("525",yanPanVo);
                }
                if (flag526){
                    updateYanPan("526",yanPanVo);
                }
                if (flag527){
                    updateYanPan("527",yanPanVo);
                }
                if (flag528){
                    updateYanPan("528",yanPanVo);
                }
                if (flag529){
                    updateYanPan("529",yanPanVo);
                }
                if (flag530){
                    updateYanPan("530",yanPanVo);
                }
                if (flag531){
                    updateYanPan("531",yanPanVo);
                }
                if (flag532){
                    updateYanPan("532",yanPanVo);
                }
                if (flag533){
                    updateYanPan("533",yanPanVo);
                }
                if (flag534){
                    updateYanPan("534",yanPanVo);
                }
                if (flag535){
                    updateYanPan("535",yanPanVo);
                }
                if (flag536){
                    updateYanPan("536",yanPanVo);
                }
                if (flag537){
                    updateYanPan("537",yanPanVo);
                }
                if (flag538){
                    updateYanPan("538",yanPanVo);
                }
                if (flag539){
                    updateYanPan("539",yanPanVo);
                }
                if (flag540){
                    updateYanPan("540",yanPanVo);
                }
                if (flag541){
                    updateYanPan("541",yanPanVo);
                }
                if (flag542){
                    updateYanPan("542",yanPanVo);
                }
                if (flag543){
                    updateYanPan("543",yanPanVo);
                }
                if (flag544){
                    updateYanPan("544",yanPanVo);
                }
                if (flag545){
                    updateYanPan("545",yanPanVo);
                }
                if (flag546){
                    updateYanPan("546",yanPanVo);
                }
                if (flag547){
                    updateYanPan("547",yanPanVo);
                }
                if (flag548){
                    updateYanPan("548",yanPanVo);
                }
                if (flag549){
                    updateYanPan("549",yanPanVo);
                }
                if (flag550){
                    updateYanPan("550",yanPanVo);
                }
                if (flag551){
                    updateYanPan("551",yanPanVo);
                }
                if (flag552){
                    updateYanPan("552",yanPanVo);
                }
                if (flag553){
                    updateYanPan("553",yanPanVo);
                }
                if (flag554){
                    updateYanPan("554",yanPanVo);
                }
                if (flag555){
                    updateYanPan("555",yanPanVo);
                }

                if (flag556){
                    updateYanPan("556",yanPanVo);
                }
                if (flag557){
                    updateYanPan("557",yanPanVo);
                }
                if (flag558){
                    updateYanPan("558",yanPanVo);
                }
                if (flag559){
                    updateYanPan("559",yanPanVo);
                }
                if (flag560){
                    updateYanPan("560",yanPanVo);
                }
                if (flag561){
                    updateYanPan("561",yanPanVo);
                }
                if (flag562){
                    updateYanPan("562",yanPanVo);
                }
                if (flag563){
                    updateYanPan("563",yanPanVo);
                }
                if (flag564){
                    updateYanPan("564",yanPanVo);
                }
                if (flag565){
                    updateYanPan("565",yanPanVo);
                }
                if (flag566){
                    updateYanPan("566",yanPanVo);
                }
                if (flag567){
                    updateYanPan("567",yanPanVo);
                }
                if (flag568){
                    updateYanPan("568",yanPanVo);
                }

                if (flag569){
                    updateYanPan("569",yanPanVo);
                }
                if (flag570){
                    updateYanPan("570",yanPanVo);
                }
                if (flag571){
                    updateYanPan("571",yanPanVo);
                }
                if (flag572){
                    updateYanPan("572",yanPanVo);
                }
                if (flag573){
                    updateYanPan("573",yanPanVo);
                }
                if (flag574){
                    updateYanPan("574",yanPanVo);
                }
                if (flag575){
                    updateYanPan("575",yanPanVo);
                }
                if (flag576){
                    updateYanPan("576",yanPanVo);
                }
                if (flag577){
                    updateYanPan("577",yanPanVo);
                }
                if (flag578){
                    updateYanPan("578",yanPanVo);
                }
                if (flag579){
                    updateYanPan("579",yanPanVo);
                }
                if (flag580){
                    updateYanPan("580",yanPanVo);
                }
                if (flag581){
                    updateYanPan("581",yanPanVo);
                }

                if (flag582){
                    updateYanPan("582",yanPanVo);
                }
                if (flag583){
                    updateYanPan("583",yanPanVo);
                }
                if (flag584){
                    updateYanPan("584",yanPanVo);
                }
                if (flag585){
                    updateYanPan("585",yanPanVo);
                }
                if (flag586){
                    updateYanPan("586",yanPanVo);
                }
                if (flag587){
                    updateYanPan("587",yanPanVo);
                }
                if (flag588){
                    updateYanPan("588",yanPanVo);
                }
                if (flag589){
                    updateYanPan("589",yanPanVo);
                }
                if (flag590){
                    updateYanPan("590",yanPanVo);
                }
                if (flag591){
                    updateYanPan("591",yanPanVo);
                }
                if (flag592){
                    updateYanPan("592",yanPanVo);
                }
                if (flag593){
                    updateYanPan("593",yanPanVo);
                }
                if (flag594){
                    updateYanPan("594",yanPanVo);
                }

                if (flag595){
                    updateYanPan("595",yanPanVo);
                }
                if (flag596){
                    updateYanPan("596",yanPanVo);
                }
                if (flag597){
                    updateYanPan("597",yanPanVo);
                }
                if (flag598){
                    updateYanPan("598",yanPanVo);
                }
                if (flag599){
                    updateYanPan("599",yanPanVo);
                }
                if (flag600){
                    updateYanPan("600",yanPanVo);
                }
                if (flag601){
                    updateYanPan("601",yanPanVo);
                }
                if (flag602){
                    updateYanPan("602",yanPanVo);
                }
                if (flag603){
                    updateYanPan("603",yanPanVo);
                }
                if (flag604){
                    updateYanPan("604",yanPanVo);
                }
                if (flag605){
                    updateYanPan("605",yanPanVo);
                }
                if (flag606){
                    updateYanPan("606",yanPanVo);
                }
                if (flag607){
                    updateYanPan("607",yanPanVo);
                }
                if (flag610){
                    updateYanPan("610",yanPanVo);
                }

                if (flag612){
                    updateYanPan("612",yanPanVo);
                }
                if (flag613){
                    updateYanPan("613",yanPanVo);
                }
                if (flag614){
                    updateYanPan("614",yanPanVo);
                }

                if (flag615){
                    updateYanPan("615",yanPanVo);
                }
                if (flag616){
                    updateYanPan("616",yanPanVo);
                }
                if (flag617){
                    updateYanPan("617",yanPanVo);
                }
                if (flag618){
                    updateYanPan("618",yanPanVo);
                }
                if (flag619){
                    updateYanPan("619",yanPanVo);
                }
                if (flag620){
                    updateYanPan("620",yanPanVo);
                }
                if (flag621){
                    updateYanPan("621",yanPanVo);
                }

                if (flag622){
                    updateYanPan("622",yanPanVo);
                }
                if (flag623){
                    updateYanPan("623",yanPanVo);
                }
                if (flag624){
                    updateYanPan("624",yanPanVo);
                }
                if (flag625){
                    updateYanPan("625",yanPanVo);
                }
                if (flag626){
                    updateYanPan("626",yanPanVo);
                }
                if (flag627){
                    updateYanPan("627",yanPanVo);
                }
                if (flag628){
                    updateYanPan("628",yanPanVo);
                }
                if (flag629){
                    updateYanPan("629",yanPanVo);
                }
                if (flag630){
                    updateYanPan("630",yanPanVo);
                }
                if (flag631){
                    updateYanPan("631",yanPanVo);
                }
                if (flag632){
                    updateYanPan("632",yanPanVo);
                }
                if (flag633){
                    updateYanPan("633",yanPanVo);
                }
                if (flag634){
                    updateYanPan("634",yanPanVo);
                }
                if (flag635){
                    updateYanPan("635",yanPanVo);
                }
                if (flag636){
                    updateYanPan("636",yanPanVo);
                }
                if (flag637){
                    updateYanPan("637",yanPanVo);
                }
                if (flag638){
                    updateYanPan("638",yanPanVo);
                }
                if (flag639){
                    updateYanPan("639",yanPanVo);
                }
                if (flag640){
                    updateYanPan("640",yanPanVo);
                }
                if (flag641){
                    updateYanPan("641",yanPanVo);
                }
                if (flag642){
                    updateYanPan("642",yanPanVo);
                }
                if (flag643){
                    updateYanPan("643",yanPanVo);
                }
                if (flag644){
                    updateYanPan("644",yanPanVo);
                }
                if (flag645){
                    updateYanPan("645",yanPanVo);
                }
                if (flag646){
                    updateYanPan("646",yanPanVo);
                }
                if (flag647){
                    updateYanPan("647",yanPanVo);
                }
                if (flag648){
                    updateYanPan("648",yanPanVo);
                }
                if (flag649){
                    updateYanPan("649",yanPanVo);
                }
                if (flag650){
                    updateYanPan("650",yanPanVo);
                }
                if (flag651){
                    updateYanPan("651",yanPanVo);
                }
                if (flag652){
                    updateYanPan("652",yanPanVo);
                }
                if (flag653){
                    updateYanPan("653",yanPanVo);
                }
                if (flag654){
                    updateYanPan("654",yanPanVo);
                }
                if (flag655){
                    updateYanPan("655",yanPanVo);
                }

                if (flag656){
                    updateYanPan("656",yanPanVo);
                }
                if (flag657){
                    updateYanPan("657",yanPanVo);
                }
                if (flag658){
                    updateYanPan("658",yanPanVo);
                }
                if (flag659){
                    updateYanPan("659",yanPanVo);
                }
                if (flag660){
                    updateYanPan("660",yanPanVo);
                }
                if (flag661){
                    updateYanPan("661",yanPanVo);
                }
                if (flag662){
                    updateYanPan("662",yanPanVo);
                }
                if (flag663){
                    updateYanPan("663",yanPanVo);
                }
                if (flag664){
                    updateYanPan("664",yanPanVo);
                }
                if (flag665){
                    updateYanPan("665",yanPanVo);
                }
                if (flag666){
                    updateYanPan("666",yanPanVo);
                }
                if (flag667){
                    updateYanPan("667",yanPanVo);
                }
                if (flag668){
                    updateYanPan("668",yanPanVo);
                }

                if (flag669){
                    updateYanPan("669",yanPanVo);
                }
                if (flag670){
                    updateYanPan("670",yanPanVo);
                }
                if (flag671){
                    updateYanPan("671",yanPanVo);
                }
                if (flag672){
                    updateYanPan("672",yanPanVo);
                }
                if (flag673){
                    updateYanPan("673",yanPanVo);
                }
                if (flag674){
                    updateYanPan("674",yanPanVo);
                }
                if (flag675){
                    updateYanPan("675",yanPanVo);
                }
                if (flag676){
                    updateYanPan("676",yanPanVo);
                }
                if (flag677){
                    updateYanPan("677",yanPanVo);
                }
                if (flag678){
                    updateYanPan("678",yanPanVo);
                }
                if (flag679){
                    updateYanPan("679",yanPanVo);
                }
                if (flag680){
                    updateYanPan("680",yanPanVo);
                }
                if (flag681){
                    updateYanPan("681",yanPanVo);
                }

                if (flag682){
                    updateYanPan("682",yanPanVo);
                }
                if (flag683){
                    updateYanPan("683",yanPanVo);
                }
                if (flag684){
                    updateYanPan("684",yanPanVo);
                }
                if (flag685){
                    updateYanPan("685",yanPanVo);
                }
                if (flag686){
                    updateYanPan("686",yanPanVo);
                }
                if (flag687){
                    updateYanPan("687",yanPanVo);
                }
                if (flag688){
                    updateYanPan("688",yanPanVo);
                }
                if (flag689){
                    updateYanPan("689",yanPanVo);
                }
                if (flag690){
                    updateYanPan("690",yanPanVo);
                }
                if (flag691){
                    updateYanPan("691",yanPanVo);
                }
                if (flag692){
                    updateYanPan("692",yanPanVo);
                }
                if (flag693){
                    updateYanPan("693",yanPanVo);
                }
                if (flag694){
                    updateYanPan("694",yanPanVo);
                }

                if (flag695){
                    updateYanPan("695",yanPanVo);
                }
                if (flag696){
                    updateYanPan("696",yanPanVo);
                }
                if (flag697){
                    updateYanPan("697",yanPanVo);
                }
                if (flag698){
                    updateYanPan("698",yanPanVo);
                }
                if (flag699){
                    updateYanPan("699",yanPanVo);
                }
                if (flag700){
                    updateYanPan("700",yanPanVo);
                }
                if (flag701){
                    updateYanPan("701",yanPanVo);
                }
                if (flag702){
                    updateYanPan("702",yanPanVo);
                }
                if (flag703){
                    updateYanPan("703",yanPanVo);
                }
                if (flag704){
                    updateYanPan("704",yanPanVo);
                }
                if (flag705){
                    updateYanPan("705",yanPanVo);
                }
                if (flag706){
                    updateYanPan("706",yanPanVo);
                }
                if (flag707){
                    updateYanPan("707",yanPanVo);
                }
                if (flag708){
                    updateYanPan("708",yanPanVo);
                }

                if (flag709){
                    updateYanPan("709",yanPanVo);
                }
                if (flag710){
                    updateYanPan("710",yanPanVo);
                }
                if (flag711){
                    updateYanPan("711",yanPanVo);
                }
                if (flag712){
                    updateYanPan("712",yanPanVo);
                }
                if (flag713){
                    updateYanPan("713",yanPanVo);
                }
                if (flag714){
                    updateYanPan("714",yanPanVo);
                }
                if (flag715){
                    updateYanPan("715",yanPanVo);
                }
                if (flag716){
                    updateYanPan("716",yanPanVo);
                }
                if (flag717){
                    updateYanPan("717",yanPanVo);
                }
                if (flag718){
                    updateYanPan("718",yanPanVo);
                }
                if (flag719){
                    updateYanPan("719",yanPanVo);
                }
                if (flag720){
                    updateYanPan("720",yanPanVo);
                }
                if (flag721){
                    updateYanPan("721",yanPanVo);
                }

                if (flag722){
                    updateYanPan("722",yanPanVo);
                }
                if (flag723){
                    updateYanPan("723",yanPanVo);
                }
                if (flag724){
                    updateYanPan("724",yanPanVo);
                }
                if (flag725){
                    updateYanPan("725",yanPanVo);
                }
                if (flag726){
                    updateYanPan("726",yanPanVo);
                }
                if (flag727){
                    updateYanPan("727",yanPanVo);
                }
                if (flag728){
                    updateYanPan("728",yanPanVo);
                }
                if (flag729){
                    updateYanPan("729",yanPanVo);
                }
                if (flag730){
                    updateYanPan("730",yanPanVo);
                }
                if (flag731){
                    updateYanPan("731",yanPanVo);
                }
                if (flag732){
                    updateYanPan("732",yanPanVo);
                }
                if (flag733){
                    updateYanPan("733",yanPanVo);
                }
                if (flag734){
                    updateYanPan("734",yanPanVo);
                }
                if (flag735){
                    updateYanPan("735",yanPanVo);
                }
                if (flag736){
                    updateYanPan("736",yanPanVo);
                }
                if (flag737){
                    updateYanPan("737",yanPanVo);
                }
                if (flag738){
                    updateYanPan("738",yanPanVo);
                }
                if (flag739){
                    updateYanPan("739",yanPanVo);
                }
                if (flag740){
                    updateYanPan("740",yanPanVo);
                }
                if (flag741){
                    updateYanPan("741",yanPanVo);
                }
                if (flag742){
                    updateYanPan("742",yanPanVo);
                }
                if (flag743){
                    updateYanPan("743",yanPanVo);
                }
                if (flag744){
                    updateYanPan("744",yanPanVo);
                }
                if (flag745){
                    updateYanPan("745",yanPanVo);
                }
                if (flag746){
                    updateYanPan("746",yanPanVo);
                }
                if (flag747){
                    updateYanPan("747",yanPanVo);
                }
                if (flag748){
                    updateYanPan("748",yanPanVo);
                }
                if (flag749){
                    updateYanPan("749",yanPanVo);
                }
                if (flag750){
                    updateYanPan("750",yanPanVo);
                }
                if (flag751){
                    updateYanPan("751",yanPanVo);
                }
                if (flag752){
                    updateYanPan("752",yanPanVo);
                }
                if (flag753){
                    updateYanPan("753",yanPanVo);
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
