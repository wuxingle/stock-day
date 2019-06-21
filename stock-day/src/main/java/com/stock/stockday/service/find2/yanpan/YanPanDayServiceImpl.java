package com.stock.stockday.service.find2.yanpan;


import com.stock.apicommon.entity.ScienceEntity;
import com.stock.apicommon.entity.YanPanEntity;
import com.stock.apicommon.utils.patterning.YanPanUtil;
import com.stock.apicommon.vo.YanPanVo;
import com.stock.stockday.entity.StockDayAll;
import com.stock.stockday.entity.StockDayScience;
import com.stock.stockday.entity.StockDayYanPan1;
import com.stock.stockday.service.find2.StockDayYanPan1Service;
import com.stock.stockday.util.FindUtil10;
import com.stock.stockday.util.FindUtil11;
import com.stock.stockday.util.FindUtil12;
import com.stock.stockday.util.FindUtil13;
import com.stock.stockday.util.FindUtil14;
import com.stock.stockday.util.FindUtil15;
import com.stock.stockday.util.FindUtil16;
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
public class YanPanDayServiceImpl {
    @Autowired
    private StockDayYanPan1Service stockDayYanPan1Service;

    public boolean dayYanPanFunction(List<StockDayAll> stockDayAllList, List<StockDayScience> stockDayScienceList,List<StockDayAll> stockDayAllListDaPan,List<StockDayScience> stockDayScienceListDaPan) throws IOException {
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
                List<StockDayAll> stockDayAllListDaPan1 = new ArrayList<>();
                for (int i=0;i<stockDayAllList1.size();i++){
                    if (i<60){
                        stockDayAllList2.add(stockDayAllList1.get(i));
                    }else {
                        YanPanEntity yanPanEntity=new YanPanEntity();
                        BeanUtils.copyProperties(stockDayAllList1.get(i),yanPanEntity);
                        yanPanEntityList.add(yanPanEntity);
                    }

                }
                //大盘
                for (StockDayAll stockDayAll1:stockDayAllListDaPan){
                    for (StockDayAll stockDayAll2:stockDayAllList2){
                        if (stockDayAll1.getDate().compareTo(stockDayAll2.getDate())==0){
                            stockDayAllListDaPan1.add(stockDayAll1);
                        }
                    }
                }
                Collections.sort(stockDayAllListDaPan1, new Comparator<StockDayAll>() {
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
                if (stockDayAllListDaPan1==null||stockDayAllListDaPan1.size()<10){
                    continue;
                }
                for (StockDayScience stockDayScience : stockDayScienceListDaPan) {
                    if (stockDayAllListDaPan1.get(0).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityListDaPan.add(scienceEntity);
                    }
                    if (stockDayAllListDaPan1.get(1).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityListDaPan.add(scienceEntity);
                    }
                    if (stockDayAllListDaPan1.get(2).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityListDaPan.add(scienceEntity);
                    }
                    if (stockDayAllListDaPan1.get(3).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityListDaPan.add(scienceEntity);
                    }
                    if (stockDayAllListDaPan1.get(4).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityListDaPan.add(scienceEntity);
                    }
                    if (stockDayAllListDaPan1.get(5).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityListDaPan.add(scienceEntity);
                    }
                    if (stockDayAllListDaPan1.get(6).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityListDaPan.add(scienceEntity);
                    }
                    if (stockDayAllListDaPan1.get(7).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityListDaPan.add(scienceEntity);
                    }
                    if (stockDayAllListDaPan1.get(8).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityListDaPan.add(scienceEntity);
                    }
                    if (stockDayAllListDaPan1.get(9).getDate().compareTo(stockDayScience.getDate()) == 0) {
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
                if (stockDayAllList1==null||stockDayAllList1.size()<10){
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


//                boolean flag34= FindUtil2.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag35= FindUtil2.shengVDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag36= FindUtil2.reset20Dapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag37= FindUtil2.jieQiDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag38= FindUtil2.jishujieqiDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag39= FindUtil2.jishujieqiDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag40= FindUtil2.jieQiDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag41= FindUtil2.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag42= FindUtil2.shengVDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag43= FindUtil2.reset20Dapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag44= FindUtil2.jieQiDapan5(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag45= FindUtil2.jishujieqiDapan5(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag46= FindUtil2.jishujieqiDapan6(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag47= FindUtil2.jishujieqiDapan7(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag48= FindUtil2.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag49= FindUtil2.shengVDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag50= FindUtil2.reset20Dapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag51= FindUtil2.jieQiDapan6(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag52= FindUtil2.jishujieqiDapan8(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag53= FindUtil2.jishujieqiDapan9(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag54= FindUtil2.jieQiDapan7(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag55= FindUtil2.jieQiDapan8(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag56= FindUtil2.jieQiDapan9(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag57= FindUtil2.jieQiDapan10(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag58= FindUtil2.jieQiDapan11(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag59= FindUtil2.jieQiDapan12(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//
//                boolean flag60= FindUtil3.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag61= FindUtil3.shengVDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag62= FindUtil3.reset20Dapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag63= FindUtil3.jieQiDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag64= FindUtil3.jishujieqiDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag65= FindUtil3.jishujieqiDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag66= FindUtil3.jieQiDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag67= FindUtil3.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag68= FindUtil3.shengVDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag69= FindUtil3.reset20Dapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag70= FindUtil3.jieQiDapan5(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag71= FindUtil3.jishujieqiDapan5(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag72= FindUtil3.jishujieqiDapan6(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag73= FindUtil3.jishujieqiDapan7(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag74= FindUtil3.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag75= FindUtil3.shengVDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag76= FindUtil3.reset20Dapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag77= FindUtil3.jieQiDapan6(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag78= FindUtil3.jishujieqiDapan8(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag79= FindUtil3.jishujieqiDapan9(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag80= FindUtil3.jieQiDapan7(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag81= FindUtil3.jieQiDapan8(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag82= FindUtil3.jieQiDapan9(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag83= FindUtil3.jieQiDapan10(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag84= FindUtil3.jieQiDapan11(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag85= FindUtil3.jieQiDapan12(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//
//                boolean flag86= FindUtil4.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag87= FindUtil4.shengVDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag88= FindUtil4.reset20Dapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag89= FindUtil4.jieQiDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag90= FindUtil4.jishujieqiDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag91= FindUtil4.jishujieqiDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag92= FindUtil4.jieQiDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag93= FindUtil4.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag94= FindUtil4.shengVDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag95= FindUtil4.reset20Dapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag96= FindUtil4.jieQiDapan5(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag97= FindUtil4.jishujieqiDapan5(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag98= FindUtil4.jishujieqiDapan6(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag99= FindUtil4.jishujieqiDapan7(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag100= FindUtil4.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag101= FindUtil4.shengVDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag102= FindUtil4.reset20Dapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag103= FindUtil4.jieQiDapan6(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag104= FindUtil4.jishujieqiDapan8(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag105= FindUtil4.jishujieqiDapan9(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag106= FindUtil4.jieQiDapan7(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag107= FindUtil4.jieQiDapan8(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag108= FindUtil4.jieQiDapan9(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag109= FindUtil4.jieQiDapan10(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag110= FindUtil4.jieQiDapan11(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag111= FindUtil4.jieQiDapan12(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//
//                boolean flag112= FindUtil5.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag113= FindUtil5.shengVDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag114= FindUtil5.reset20Dapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag115= FindUtil5.jieQiDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag116= FindUtil5.jishujieqiDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag117= FindUtil5.jishujieqiDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag118= FindUtil5.jieQiDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag119= FindUtil5.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag120= FindUtil5.shengVDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag121= FindUtil5.reset20Dapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag122= FindUtil5.jieQiDapan5(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag123= FindUtil5.jishujieqiDapan5(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag124= FindUtil5.jishujieqiDapan6(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag125= FindUtil5.jishujieqiDapan7(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag126= FindUtil5.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag127= FindUtil5.shengVDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag128= FindUtil5.reset20Dapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag129= FindUtil5.jieQiDapan6(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag130= FindUtil5.jishujieqiDapan8(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag131= FindUtil5.jishujieqiDapan9(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag132= FindUtil5.jieQiDapan7(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag133= FindUtil5.jieQiDapan8(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag134= FindUtil5.jieQiDapan9(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag135= FindUtil5.jieQiDapan10(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag136= FindUtil5.jieQiDapan11(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag137= FindUtil5.jieQiDapan12(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);

                boolean flag230= FindUtil10.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag231= FindUtil10.shengVDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag232= FindUtil10.reset20Dapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag233= FindUtil10.jieQiDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag234= FindUtil10.jishujieqiDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag235= FindUtil10.jishujieqiDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag236= FindUtil10.jieQiDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag237= FindUtil10.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag238= FindUtil10.shengVDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag239= FindUtil10.reset20Dapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag240= FindUtil10.jieQiDapan5(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag241= FindUtil10.jishujieqiDapan5(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag242= FindUtil10.jishujieqiDapan6(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag243= FindUtil10.jishujieqiDapan7(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag244= FindUtil10.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag245= FindUtil10.shengVDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag246= FindUtil10.reset20Dapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag247= FindUtil10.jieQiDapan6(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag248= FindUtil10.jishujieqiDapan8(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag249= FindUtil10.jishujieqiDapan9(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag250= FindUtil10.jieQiDapan7(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag251= FindUtil10.jieQiDapan8(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag252= FindUtil10.jieQiDapan9(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag253= FindUtil10.jieQiDapan10(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag254= FindUtil10.jieQiDapan11(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag255= FindUtil10.jieQiDapan12(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);

                boolean flag256= FindUtil11.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag257= FindUtil11.shengVDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag258= FindUtil11.reset20Dapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag259= FindUtil11.jieQiDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag260= FindUtil11.jishujieqiDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag261= FindUtil11.jishujieqiDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag262= FindUtil11.jieQiDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag263= FindUtil11.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag264= FindUtil11.shengVDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag265= FindUtil11.reset20Dapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag266= FindUtil11.jieQiDapan5(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag267= FindUtil11.jishujieqiDapan5(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag268= FindUtil11.jishujieqiDapan6(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag269= FindUtil11.jishujieqiDapan7(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag270= FindUtil11.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag271= FindUtil11.shengVDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag272= FindUtil11.reset20Dapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag273= FindUtil11.jieQiDapan6(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag274= FindUtil11.jishujieqiDapan8(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag275= FindUtil11.jishujieqiDapan9(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag276= FindUtil11.jieQiDapan7(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag277= FindUtil11.jieQiDapan8(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag278= FindUtil11.jieQiDapan9(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag279= FindUtil11.jieQiDapan10(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag280= FindUtil11.jieQiDapan11(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag281= FindUtil11.jieQiDapan12(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);

                boolean flag282= FindUtil12.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag283= FindUtil12.shengVDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag284= FindUtil12.reset20Dapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag285= FindUtil12.jieQiDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag286= FindUtil12.jishujieqiDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag287= FindUtil12.jishujieqiDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag288= FindUtil12.jieQiDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag289= FindUtil12.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag290= FindUtil12.shengVDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag291= FindUtil12.reset20Dapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag292= FindUtil12.jieQiDapan5(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag293= FindUtil12.jishujieqiDapan5(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag294= FindUtil12.jishujieqiDapan6(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag295= FindUtil12.jishujieqiDapan7(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag296= FindUtil12.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag297= FindUtil12.shengVDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag298= FindUtil12.reset20Dapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag299= FindUtil12.jieQiDapan6(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag300= FindUtil12.jishujieqiDapan8(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag301= FindUtil12.jishujieqiDapan9(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag302= FindUtil12.jieQiDapan7(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag303= FindUtil12.jieQiDapan8(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag304= FindUtil12.jieQiDapan9(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag305= FindUtil12.jieQiDapan10(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag306= FindUtil12.jieQiDapan11(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag307= FindUtil12.jieQiDapan12(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);

                boolean flag308= FindUtil13.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag309= FindUtil13.shengVDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag311= FindUtil13.reset20Dapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag312= FindUtil13.jieQiDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag313= FindUtil13.jishujieqiDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag314= FindUtil13.jishujieqiDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag315= FindUtil13.jieQiDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag316= FindUtil13.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag317= FindUtil13.shengVDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag318= FindUtil13.reset20Dapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag319= FindUtil13.jieQiDapan5(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag320= FindUtil13.jishujieqiDapan5(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag321= FindUtil13.jishujieqiDapan6(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag322= FindUtil13.jishujieqiDapan7(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag323= FindUtil13.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag324= FindUtil13.shengVDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag325= FindUtil13.reset20Dapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag326= FindUtil13.jieQiDapan6(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag327= FindUtil13.jishujieqiDapan8(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag328= FindUtil13.jishujieqiDapan9(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag329= FindUtil13.jieQiDapan7(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag330= FindUtil13.jieQiDapan8(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag331= FindUtil13.jieQiDapan9(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag332= FindUtil13.jieQiDapan10(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag333= FindUtil13.jieQiDapan11(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag334= FindUtil13.jieQiDapan12(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);

                boolean flag335= FindUtil14.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag336= FindUtil14.shengVDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag337= FindUtil14.reset20Dapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag338= FindUtil14.jieQiDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag339= FindUtil14.jishujieqiDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag340= FindUtil14.jishujieqiDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag341= FindUtil14.jieQiDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag342= FindUtil14.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag343= FindUtil14.shengVDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag344= FindUtil14.reset20Dapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag345= FindUtil14.jieQiDapan5(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag346= FindUtil14.jishujieqiDapan5(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag347= FindUtil14.jishujieqiDapan6(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag348= FindUtil14.jishujieqiDapan7(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag349= FindUtil14.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag350= FindUtil14.shengVDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag351= FindUtil14.reset20Dapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag352= FindUtil14.jieQiDapan6(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag353= FindUtil14.jishujieqiDapan8(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag354= FindUtil14.jishujieqiDapan9(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag355= FindUtil14.jieQiDapan7(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag356= FindUtil14.jieQiDapan8(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag357= FindUtil14.jieQiDapan9(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag358= FindUtil14.jieQiDapan10(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag359= FindUtil14.jieQiDapan11(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag360= FindUtil14.jieQiDapan12(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);

                boolean flag361= FindUtil15.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag362= FindUtil15.shengVDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag363= FindUtil15.reset20Dapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag364= FindUtil15.jieQiDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag365= FindUtil15.jishujieqiDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag366= FindUtil15.jishujieqiDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag367= FindUtil15.jieQiDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag368= FindUtil15.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag369= FindUtil15.shengVDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag370= FindUtil15.reset20Dapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag371= FindUtil15.jieQiDapan5(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag372= FindUtil15.jishujieqiDapan5(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag373= FindUtil15.jishujieqiDapan6(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag374= FindUtil15.jishujieqiDapan7(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag375= FindUtil15.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag376= FindUtil15.shengVDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag377= FindUtil15.reset20Dapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag378= FindUtil15.jieQiDapan6(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag379= FindUtil15.jishujieqiDapan8(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag380= FindUtil15.jishujieqiDapan9(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag381= FindUtil15.jieQiDapan7(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag382= FindUtil15.jieQiDapan8(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag383= FindUtil15.jieQiDapan9(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag384= FindUtil15.jieQiDapan10(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag385= FindUtil15.jieQiDapan11(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag386= FindUtil15.jieQiDapan12(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);

                boolean flag387= FindUtil16.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag388= FindUtil16.shengVDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag389= FindUtil16.reset20Dapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag390= FindUtil16.jieQiDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag391= FindUtil16.jishujieqiDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag392= FindUtil16.jishujieqiDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag393= FindUtil16.jieQiDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag394= FindUtil16.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag395= FindUtil16.shengVDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag396= FindUtil16.reset20Dapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag397= FindUtil16.jieQiDapan5(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag398= FindUtil16.jishujieqiDapan5(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag399= FindUtil16.jishujieqiDapan6(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag400= FindUtil16.jishujieqiDapan7(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag401= FindUtil16.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag402= FindUtil16.shengVDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag403= FindUtil16.reset20Dapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag404= FindUtil16.jieQiDapan6(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag405= FindUtil16.jishujieqiDapan8(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag406= FindUtil16.jishujieqiDapan9(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag407= FindUtil16.jieQiDapan7(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag408= FindUtil16.jieQiDapan8(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag409= FindUtil16.jieQiDapan9(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag410= FindUtil16.jieQiDapan10(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag411= FindUtil16.jieQiDapan11(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag412= FindUtil16.jieQiDapan12(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);


//                if (flag34){
//                    updateYanPan("34",yanPanVo);
//                }
//                if (flag35){
//                    updateYanPan("35",yanPanVo);
//                }
//                if (flag36){
//                    updateYanPan("36",yanPanVo);
//                }
//                if (flag37){
//                    updateYanPan("37",yanPanVo);
//                }
//                if (flag38){
//                    updateYanPan("38",yanPanVo);
//                }
//                if (flag39){
//                    updateYanPan("39",yanPanVo);
//                }
//                if (flag40){
//                    updateYanPan("40",yanPanVo);
//                }
//                if (flag41){
//                    updateYanPan("41",yanPanVo);
//                }
//                if (flag42){
//                    updateYanPan("42",yanPanVo);
//                }
//                if (flag43){
//                    updateYanPan("43",yanPanVo);
//                }
//                if (flag44){
//                    updateYanPan("44",yanPanVo);
//                }
//                if (flag45){
//                    updateYanPan("45",yanPanVo);
//                }
//                if (flag46){
//                    updateYanPan("46",yanPanVo);
//                }
//                if (flag47){
//                    updateYanPan("47",yanPanVo);
//                }
//                if (flag48){
//                    updateYanPan("48",yanPanVo);
//                }
//                if (flag49){
//                    updateYanPan("49",yanPanVo);
//                }
//                if (flag50){
//                    updateYanPan("50",yanPanVo);
//                }
//                if (flag51){
//                    updateYanPan("51",yanPanVo);
//                }
//                if (flag52){
//                    updateYanPan("52",yanPanVo);
//                }
//                if (flag53){
//                    updateYanPan("53",yanPanVo);
//                }
//                if (flag54){
//                    updateYanPan("54",yanPanVo);
//                }
//                if (flag55){
//                    updateYanPan("55",yanPanVo);
//                }
//                if (flag56){
//                    updateYanPan("56",yanPanVo);
//                }
//                if (flag57){
//                    updateYanPan("57",yanPanVo);
//                }
//                if (flag58){
//                    updateYanPan("58",yanPanVo);
//                }
//                if (flag59){
//                    updateYanPan("59",yanPanVo);
//                }
//
//                if (flag60){
//                    updateYanPan("60",yanPanVo);
//                }
//                if (flag61){
//                    updateYanPan("61",yanPanVo);
//                }
//                if (flag62){
//                    updateYanPan("62",yanPanVo);
//                }
//                if (flag63){
//                    updateYanPan("63",yanPanVo);
//                }
//                if (flag64){
//                    updateYanPan("64",yanPanVo);
//                }
//                if (flag65){
//                    updateYanPan("65",yanPanVo);
//                }
//                if (flag66){
//                    updateYanPan("66",yanPanVo);
//                }
//                if (flag67){
//                    updateYanPan("67",yanPanVo);
//                }
//                if (flag68){
//                    updateYanPan("68",yanPanVo);
//                }
//                if (flag69){
//                    updateYanPan("69",yanPanVo);
//                }
//                if (flag70){
//                    updateYanPan("70",yanPanVo);
//                }
//                if (flag71){
//                    updateYanPan("71",yanPanVo);
//                }
//                if (flag72){
//                    updateYanPan("72",yanPanVo);
//                }
//
//                if (flag73){
//                    updateYanPan("73",yanPanVo);
//                }
//                if (flag74){
//                    updateYanPan("74",yanPanVo);
//                }
//                if (flag75){
//                    updateYanPan("75",yanPanVo);
//                }
//                if (flag76){
//                    updateYanPan("76",yanPanVo);
//                }
//                if (flag77){
//                    updateYanPan("77",yanPanVo);
//                }
//                if (flag78){
//                    updateYanPan("78",yanPanVo);
//                }
//                if (flag79){
//                    updateYanPan("79",yanPanVo);
//                }
//                if (flag80){
//                    updateYanPan("80",yanPanVo);
//                }
//                if (flag81){
//                    updateYanPan("81",yanPanVo);
//                }
//                if (flag82){
//                    updateYanPan("82",yanPanVo);
//                }
//                if (flag83){
//                    updateYanPan("83",yanPanVo);
//                }
//                if (flag84){
//                    updateYanPan("84",yanPanVo);
//                }
//                if (flag85){
//                    updateYanPan("85",yanPanVo);
//                }
//
//                if (flag86){
//                    updateYanPan("86",yanPanVo);
//                }
//                if (flag87){
//                    updateYanPan("87",yanPanVo);
//                }
//                if (flag88){
//                    updateYanPan("88",yanPanVo);
//                }
//                if (flag89){
//                    updateYanPan("89",yanPanVo);
//                }
//                if (flag90){
//                    updateYanPan("90",yanPanVo);
//                }
//                if (flag91){
//                    updateYanPan("91",yanPanVo);
//                }
//                if (flag92){
//                    updateYanPan("92",yanPanVo);
//                }
//                if (flag93){
//                    updateYanPan("93",yanPanVo);
//                }
//                if (flag94){
//                    updateYanPan("94",yanPanVo);
//                }
//                if (flag95){
//                    updateYanPan("95",yanPanVo);
//                }
//                if (flag96){
//                    updateYanPan("96",yanPanVo);
//                }
//                if (flag97){
//                    updateYanPan("97",yanPanVo);
//                }
//                if (flag98){
//                    updateYanPan("98",yanPanVo);
//                }
//
//                if (flag99){
//                    updateYanPan("99",yanPanVo);
//                }
//                if (flag100){
//                    updateYanPan("100",yanPanVo);
//                }
//                if (flag101){
//                    updateYanPan("101",yanPanVo);
//                }
//                if (flag102){
//                    updateYanPan("102",yanPanVo);
//                }
//                if (flag103){
//                    updateYanPan("103",yanPanVo);
//                }
//                if (flag104){
//                    updateYanPan("104",yanPanVo);
//                }
//                if (flag105){
//                    updateYanPan("105",yanPanVo);
//                }
//                if (flag106){
//                    updateYanPan("106",yanPanVo);
//                }
//                if (flag107){
//                    updateYanPan("107",yanPanVo);
//                }
//                if (flag108){
//                    updateYanPan("108",yanPanVo);
//                }
//                if (flag109){
//                    updateYanPan("109",yanPanVo);
//                }
//                if (flag110){
//                    updateYanPan("110",yanPanVo);
//                }
//                if (flag111){
//                    updateYanPan("111",yanPanVo);
//                }
//
//                if (flag112){
//                    updateYanPan("112",yanPanVo);
//                }
//                if (flag113){
//                    updateYanPan("113",yanPanVo);
//                }
//                if (flag114){
//                    updateYanPan("114",yanPanVo);
//                }
//                if (flag115){
//                    updateYanPan("115",yanPanVo);
//                }
//                if (flag116){
//                    updateYanPan("116",yanPanVo);
//                }
//                if (flag117){
//                    updateYanPan("117",yanPanVo);
//                }
//                if (flag118){
//                    updateYanPan("118",yanPanVo);
//                }
//                if (flag119){
//                    updateYanPan("119",yanPanVo);
//                }
//                if (flag120){
//                    updateYanPan("120",yanPanVo);
//                }
//                if (flag121){
//                    updateYanPan("121",yanPanVo);
//                }
//                if (flag122){
//                    updateYanPan("122",yanPanVo);
//                }
//                if (flag123){
//                    updateYanPan("123",yanPanVo);
//                }
//                if (flag124){
//                    updateYanPan("124",yanPanVo);
//                }
//
//                if (flag125){
//                    updateYanPan("125",yanPanVo);
//                }
//                if (flag126){
//                    updateYanPan("126",yanPanVo);
//                }
//                if (flag127){
//                    updateYanPan("127",yanPanVo);
//                }
//                if (flag128){
//                    updateYanPan("128",yanPanVo);
//                }
//                if (flag129){
//                    updateYanPan("129",yanPanVo);
//                }
//                if (flag130){
//                    updateYanPan("130",yanPanVo);
//                }
//                if (flag131){
//                    updateYanPan("131",yanPanVo);
//                }
//                if (flag132){
//                    updateYanPan("132",yanPanVo);
//                }
//                if (flag133){
//                    updateYanPan("133",yanPanVo);
//                }
//                if (flag134){
//                    updateYanPan("134",yanPanVo);
//                }
//                if (flag135){
//                    updateYanPan("135",yanPanVo);
//                }
//                if (flag136){
//                    updateYanPan("136",yanPanVo);
//                }
//                if (flag137){
//                    updateYanPan("137",yanPanVo);
//                }

                if (flag230){
                    updateYanPan("230",yanPanVo);
                }
                if (flag231){
                    updateYanPan("231",yanPanVo);
                }
                if (flag232){
                    updateYanPan("232",yanPanVo);
                }
                if (flag233){
                    updateYanPan("233",yanPanVo);
                }
                if (flag234){
                    updateYanPan("234",yanPanVo);
                }
                if (flag235){
                    updateYanPan("235",yanPanVo);
                }
                if (flag236){
                    updateYanPan("236",yanPanVo);
                }
                if (flag237){
                    updateYanPan("237",yanPanVo);
                }
                if (flag238){
                    updateYanPan("238",yanPanVo);
                }
                if (flag239){
                    updateYanPan("239",yanPanVo);
                }
                if (flag240){
                    updateYanPan("240",yanPanVo);
                }
                if (flag241){
                    updateYanPan("241",yanPanVo);
                }
                if (flag242){
                    updateYanPan("242",yanPanVo);
                }
                if (flag243){
                    updateYanPan("243",yanPanVo);
                }
                if (flag244){
                    updateYanPan("244",yanPanVo);
                }
                if (flag245){
                    updateYanPan("245",yanPanVo);
                }
                if (flag246){
                    updateYanPan("246",yanPanVo);
                }
                if (flag247){
                    updateYanPan("247",yanPanVo);
                }
                if (flag248){
                    updateYanPan("248",yanPanVo);
                }
                if (flag249){
                    updateYanPan("249",yanPanVo);
                }
                if (flag250){
                    updateYanPan("250",yanPanVo);
                }
                if (flag251){
                    updateYanPan("251",yanPanVo);
                }
                if (flag252){
                    updateYanPan("252",yanPanVo);
                }
                if (flag253){
                    updateYanPan("253",yanPanVo);
                }
                if (flag254){
                    updateYanPan("254",yanPanVo);
                }
                if (flag255){
                    updateYanPan("255",yanPanVo);
                }

                if (flag256){
                    updateYanPan("256",yanPanVo);
                }
                if (flag257){
                    updateYanPan("257",yanPanVo);
                }
                if (flag258){
                    updateYanPan("258",yanPanVo);
                }
                if (flag259){
                    updateYanPan("259",yanPanVo);
                }
                if (flag260){
                    updateYanPan("260",yanPanVo);
                }
                if (flag261){
                    updateYanPan("261",yanPanVo);
                }
                if (flag262){
                    updateYanPan("262",yanPanVo);
                }
                if (flag263){
                    updateYanPan("263",yanPanVo);
                }
                if (flag264){
                    updateYanPan("264",yanPanVo);
                }
                if (flag265){
                    updateYanPan("265",yanPanVo);
                }
                if (flag266){
                    updateYanPan("266",yanPanVo);
                }
                if (flag267){
                    updateYanPan("267",yanPanVo);
                }
                if (flag268){
                    updateYanPan("268",yanPanVo);
                }

                if (flag269){
                    updateYanPan("269",yanPanVo);
                }
                if (flag270){
                    updateYanPan("270",yanPanVo);
                }
                if (flag271){
                    updateYanPan("271",yanPanVo);
                }
                if (flag272){
                    updateYanPan("272",yanPanVo);
                }
                if (flag273){
                    updateYanPan("273",yanPanVo);
                }
                if (flag274){
                    updateYanPan("274",yanPanVo);
                }
                if (flag275){
                    updateYanPan("275",yanPanVo);
                }
                if (flag276){
                    updateYanPan("276",yanPanVo);
                }
                if (flag277){
                    updateYanPan("277",yanPanVo);
                }
                if (flag278){
                    updateYanPan("278",yanPanVo);
                }
                if (flag279){
                    updateYanPan("279",yanPanVo);
                }
                if (flag280){
                    updateYanPan("280",yanPanVo);
                }
                if (flag281){
                    updateYanPan("281",yanPanVo);
                }

                if (flag282){
                    updateYanPan("282",yanPanVo);
                }
                if (flag283){
                    updateYanPan("283",yanPanVo);
                }
                if (flag284){
                    updateYanPan("284",yanPanVo);
                }
                if (flag285){
                    updateYanPan("285",yanPanVo);
                }
                if (flag286){
                    updateYanPan("286",yanPanVo);
                }
                if (flag287){
                    updateYanPan("287",yanPanVo);
                }
                if (flag288){
                    updateYanPan("288",yanPanVo);
                }
                if (flag289){
                    updateYanPan("289",yanPanVo);
                }
                if (flag290){
                    updateYanPan("290",yanPanVo);
                }
                if (flag291){
                    updateYanPan("291",yanPanVo);
                }
                if (flag292){
                    updateYanPan("292",yanPanVo);
                }
                if (flag293){
                    updateYanPan("293",yanPanVo);
                }
                if (flag294){
                    updateYanPan("294",yanPanVo);
                }

                if (flag295){
                    updateYanPan("295",yanPanVo);
                }
                if (flag296){
                    updateYanPan("296",yanPanVo);
                }
                if (flag297){
                    updateYanPan("297",yanPanVo);
                }
                if (flag298){
                    updateYanPan("298",yanPanVo);
                }
                if (flag299){
                    updateYanPan("299",yanPanVo);
                }
                if (flag300){
                    updateYanPan("300",yanPanVo);
                }
                if (flag301){
                    updateYanPan("301",yanPanVo);
                }
                if (flag302){
                    updateYanPan("302",yanPanVo);
                }
                if (flag303){
                    updateYanPan("303",yanPanVo);
                }
                if (flag304){
                    updateYanPan("304",yanPanVo);
                }
                if (flag305){
                    updateYanPan("305",yanPanVo);
                }
                if (flag306){
                    updateYanPan("306",yanPanVo);
                }
                if (flag307){
                    updateYanPan("307",yanPanVo);
                }

                if (flag308){
                    updateYanPan("308",yanPanVo);
                }
                if (flag309){
                    updateYanPan("309",yanPanVo);
                }
                if (flag311){
                    updateYanPan("311",yanPanVo);
                }
                if (flag312){
                    updateYanPan("312",yanPanVo);
                }
                if (flag313){
                    updateYanPan("313",yanPanVo);
                }
                if (flag314){
                    updateYanPan("314",yanPanVo);
                }
                if (flag315){
                    updateYanPan("315",yanPanVo);
                }
                if (flag316){
                    updateYanPan("316",yanPanVo);
                }
                if (flag317){
                    updateYanPan("317",yanPanVo);
                }
                if (flag318){
                    updateYanPan("318",yanPanVo);
                }
                if (flag319){
                    updateYanPan("319",yanPanVo);
                }
                if (flag320){
                    updateYanPan("320",yanPanVo);
                }
                if (flag321){
                    updateYanPan("321",yanPanVo);
                }

                if (flag322){
                    updateYanPan("322",yanPanVo);
                }
                if (flag323){
                    updateYanPan("323",yanPanVo);
                }
                if (flag324){
                    updateYanPan("324",yanPanVo);
                }
                if (flag325){
                    updateYanPan("325",yanPanVo);
                }
                if (flag326){
                    updateYanPan("326",yanPanVo);
                }
                if (flag327){
                    updateYanPan("327",yanPanVo);
                }
                if (flag328){
                    updateYanPan("328",yanPanVo);
                }
                if (flag329){
                    updateYanPan("329",yanPanVo);
                }
                if (flag330){
                    updateYanPan("330",yanPanVo);
                }
                if (flag331){
                    updateYanPan("331",yanPanVo);
                }
                if (flag332){
                    updateYanPan("332",yanPanVo);
                }
                if (flag333){
                    updateYanPan("333",yanPanVo);
                }
                if (flag334){
                    updateYanPan("334",yanPanVo);
                }
                if (flag335){
                    updateYanPan("335",yanPanVo);
                }
                if (flag336){
                    updateYanPan("336",yanPanVo);
                }
                if (flag337){
                    updateYanPan("337",yanPanVo);
                }
                if (flag338){
                    updateYanPan("338",yanPanVo);
                }
                if (flag339){
                    updateYanPan("339",yanPanVo);
                }
                if (flag340){
                    updateYanPan("340",yanPanVo);
                }
                if (flag341){
                    updateYanPan("341",yanPanVo);
                }
                if (flag342){
                    updateYanPan("342",yanPanVo);
                }
                if (flag343){
                    updateYanPan("343",yanPanVo);
                }
                if (flag344){
                    updateYanPan("344",yanPanVo);
                }
                if (flag345){
                    updateYanPan("345",yanPanVo);
                }
                if (flag346){
                    updateYanPan("346",yanPanVo);
                }
                if (flag347){
                    updateYanPan("347",yanPanVo);
                }
                if (flag348){
                    updateYanPan("348",yanPanVo);
                }
                if (flag349){
                    updateYanPan("349",yanPanVo);
                }
                if (flag350){
                    updateYanPan("350",yanPanVo);
                }
                if (flag351){
                    updateYanPan("351",yanPanVo);
                }
                if (flag352){
                    updateYanPan("352",yanPanVo);
                }
                if (flag353){
                    updateYanPan("353",yanPanVo);
                }
                if (flag354){
                    updateYanPan("354",yanPanVo);
                }
                if (flag355){
                    updateYanPan("355",yanPanVo);
                }

                if (flag356){
                    updateYanPan("356",yanPanVo);
                }
                if (flag357){
                    updateYanPan("357",yanPanVo);
                }
                if (flag358){
                    updateYanPan("358",yanPanVo);
                }
                if (flag359){
                    updateYanPan("359",yanPanVo);
                }
                if (flag360){
                    updateYanPan("360",yanPanVo);
                }
                if (flag361){
                    updateYanPan("361",yanPanVo);
                }
                if (flag362){
                    updateYanPan("362",yanPanVo);
                }
                if (flag363){
                    updateYanPan("363",yanPanVo);
                }
                if (flag364){
                    updateYanPan("364",yanPanVo);
                }
                if (flag365){
                    updateYanPan("365",yanPanVo);
                }
                if (flag366){
                    updateYanPan("366",yanPanVo);
                }
                if (flag367){
                    updateYanPan("367",yanPanVo);
                }
                if (flag368){
                    updateYanPan("368",yanPanVo);
                }

                if (flag369){
                    updateYanPan("369",yanPanVo);
                }
                if (flag370){
                    updateYanPan("370",yanPanVo);
                }
                if (flag371){
                    updateYanPan("371",yanPanVo);
                }
                if (flag372){
                    updateYanPan("372",yanPanVo);
                }
                if (flag373){
                    updateYanPan("373",yanPanVo);
                }
                if (flag374){
                    updateYanPan("374",yanPanVo);
                }
                if (flag375){
                    updateYanPan("375",yanPanVo);
                }
                if (flag376){
                    updateYanPan("376",yanPanVo);
                }
                if (flag377){
                    updateYanPan("377",yanPanVo);
                }
                if (flag378){
                    updateYanPan("378",yanPanVo);
                }
                if (flag379){
                    updateYanPan("379",yanPanVo);
                }
                if (flag380){
                    updateYanPan("380",yanPanVo);
                }
                if (flag381){
                    updateYanPan("381",yanPanVo);
                }

                if (flag382){
                    updateYanPan("382",yanPanVo);
                }
                if (flag383){
                    updateYanPan("383",yanPanVo);
                }
                if (flag384){
                    updateYanPan("384",yanPanVo);
                }
                if (flag385){
                    updateYanPan("385",yanPanVo);
                }
                if (flag386){
                    updateYanPan("386",yanPanVo);
                }
                if (flag387){
                    updateYanPan("387",yanPanVo);
                }
                if (flag388){
                    updateYanPan("388",yanPanVo);
                }
                if (flag389){
                    updateYanPan("389",yanPanVo);
                }
                if (flag390){
                    updateYanPan("390",yanPanVo);
                }
                if (flag391){
                    updateYanPan("391",yanPanVo);
                }
                if (flag392){
                    updateYanPan("392",yanPanVo);
                }
                if (flag393){
                    updateYanPan("393",yanPanVo);
                }
                if (flag394){
                    updateYanPan("394",yanPanVo);
                }

                if (flag395){
                    updateYanPan("395",yanPanVo);
                }
                if (flag396){
                    updateYanPan("396",yanPanVo);
                }
                if (flag397){
                    updateYanPan("397",yanPanVo);
                }
                if (flag398){
                    updateYanPan("398",yanPanVo);
                }
                if (flag399){
                    updateYanPan("399",yanPanVo);
                }
                if (flag400){
                    updateYanPan("400",yanPanVo);
                }
                if (flag401){
                    updateYanPan("401",yanPanVo);
                }
                if (flag402){
                    updateYanPan("402",yanPanVo);
                }
                if (flag403){
                    updateYanPan("403",yanPanVo);
                }
                if (flag404){
                    updateYanPan("404",yanPanVo);
                }
                if (flag405){
                    updateYanPan("405",yanPanVo);
                }
                if (flag406){
                    updateYanPan("406",yanPanVo);
                }
                if (flag407){
                    updateYanPan("407",yanPanVo);
                }
                if (flag408){
                    updateYanPan("408",yanPanVo);
                }
                if (flag409){
                    updateYanPan("409",yanPanVo);
                }
                if (flag410){
                    updateYanPan("410",yanPanVo);
                }
                if (flag411){
                    updateYanPan("411",yanPanVo);
                }
                if (flag412){
                    updateYanPan("412",yanPanVo);
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
