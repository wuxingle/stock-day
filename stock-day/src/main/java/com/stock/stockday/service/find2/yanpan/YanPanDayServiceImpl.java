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
import com.stock.stockday.util.FindUtil2;
import com.stock.stockday.util.FindUtil3;
import com.stock.stockday.util.FindUtil4;
import com.stock.stockday.util.FindUtil5;
import com.stock.stockday.util.FindUtil90;
import com.stock.stockday.util.FindUtil91;
import com.stock.stockday.util.FindUtil92;
import com.stock.stockday.util.FindUtil93;
import com.stock.stockday.util.FindUtil94;
import com.stock.stockday.util.FindUtil95;
import com.stock.stockday.util.FindUtil96;
import com.stock.stockday.util.FindUtil97;
import com.stock.stockday.utils.FindUtil100;
import com.stock.stockday.utils.FindUtil101;
import com.stock.stockday.utils.FindUtil102;
import com.stock.stockday.utils.FindUtil103;
import com.stock.stockday.utils.FindUtil104;
import com.stock.stockday.utils.FindUtil105;
import com.stock.stockday.utils.FindUtil98;
import com.stock.stockday.utils.FindUtil99;
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
//
//                boolean flag230= FindUtil10.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag231= FindUtil10.shengVDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag232= FindUtil10.reset20Dapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag233= FindUtil10.jieQiDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag234= FindUtil10.jishujieqiDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag235= FindUtil10.jishujieqiDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag236= FindUtil10.jieQiDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag237= FindUtil10.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag238= FindUtil10.shengVDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag239= FindUtil10.reset20Dapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag240= FindUtil10.jieQiDapan5(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag241= FindUtil10.jishujieqiDapan5(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag242= FindUtil10.jishujieqiDapan6(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag243= FindUtil10.jishujieqiDapan7(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag244= FindUtil10.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag245= FindUtil10.shengVDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag246= FindUtil10.reset20Dapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag247= FindUtil10.jieQiDapan6(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag248= FindUtil10.jishujieqiDapan8(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag249= FindUtil10.jishujieqiDapan9(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag250= FindUtil10.jieQiDapan7(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag251= FindUtil10.jieQiDapan8(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag252= FindUtil10.jieQiDapan9(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag253= FindUtil10.jieQiDapan10(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag254= FindUtil10.jieQiDapan11(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag255= FindUtil10.jieQiDapan12(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//
//                boolean flag256= FindUtil11.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag257= FindUtil11.shengVDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag258= FindUtil11.reset20Dapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag259= FindUtil11.jieQiDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag260= FindUtil11.jishujieqiDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag261= FindUtil11.jishujieqiDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag262= FindUtil11.jieQiDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag263= FindUtil11.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag264= FindUtil11.shengVDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag265= FindUtil11.reset20Dapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag266= FindUtil11.jieQiDapan5(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag267= FindUtil11.jishujieqiDapan5(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag268= FindUtil11.jishujieqiDapan6(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag269= FindUtil11.jishujieqiDapan7(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag270= FindUtil11.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag271= FindUtil11.shengVDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag272= FindUtil11.reset20Dapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag273= FindUtil11.jieQiDapan6(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag274= FindUtil11.jishujieqiDapan8(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag275= FindUtil11.jishujieqiDapan9(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag276= FindUtil11.jieQiDapan7(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag277= FindUtil11.jieQiDapan8(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag278= FindUtil11.jieQiDapan9(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag279= FindUtil11.jieQiDapan10(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag280= FindUtil11.jieQiDapan11(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag281= FindUtil11.jieQiDapan12(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//
//                boolean flag282= FindUtil12.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag283= FindUtil12.shengVDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag284= FindUtil12.reset20Dapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag285= FindUtil12.jieQiDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag286= FindUtil12.jishujieqiDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag287= FindUtil12.jishujieqiDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag288= FindUtil12.jieQiDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag289= FindUtil12.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag290= FindUtil12.shengVDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag291= FindUtil12.reset20Dapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag292= FindUtil12.jieQiDapan5(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag293= FindUtil12.jishujieqiDapan5(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag294= FindUtil12.jishujieqiDapan6(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag295= FindUtil12.jishujieqiDapan7(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag296= FindUtil12.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag297= FindUtil12.shengVDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag298= FindUtil12.reset20Dapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag299= FindUtil12.jieQiDapan6(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag300= FindUtil12.jishujieqiDapan8(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag301= FindUtil12.jishujieqiDapan9(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag302= FindUtil12.jieQiDapan7(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag303= FindUtil12.jieQiDapan8(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag304= FindUtil12.jieQiDapan9(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag305= FindUtil12.jieQiDapan10(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag306= FindUtil12.jieQiDapan11(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag307= FindUtil12.jieQiDapan12(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//
//                boolean flag308= FindUtil13.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag309= FindUtil13.shengVDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag311= FindUtil13.reset20Dapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag312= FindUtil13.jieQiDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag313= FindUtil13.jishujieqiDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag314= FindUtil13.jishujieqiDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag315= FindUtil13.jieQiDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag316= FindUtil13.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag317= FindUtil13.shengVDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag318= FindUtil13.reset20Dapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag319= FindUtil13.jieQiDapan5(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag320= FindUtil13.jishujieqiDapan5(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag321= FindUtil13.jishujieqiDapan6(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag322= FindUtil13.jishujieqiDapan7(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag323= FindUtil13.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag324= FindUtil13.shengVDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag325= FindUtil13.reset20Dapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag326= FindUtil13.jieQiDapan6(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag327= FindUtil13.jishujieqiDapan8(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag328= FindUtil13.jishujieqiDapan9(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag329= FindUtil13.jieQiDapan7(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag330= FindUtil13.jieQiDapan8(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag331= FindUtil13.jieQiDapan9(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag332= FindUtil13.jieQiDapan10(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag333= FindUtil13.jieQiDapan11(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag334= FindUtil13.jieQiDapan12(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//
//                boolean flag335= FindUtil14.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag336= FindUtil14.shengVDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag337= FindUtil14.reset20Dapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag338= FindUtil14.jieQiDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag339= FindUtil14.jishujieqiDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag340= FindUtil14.jishujieqiDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag341= FindUtil14.jieQiDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag342= FindUtil14.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag343= FindUtil14.shengVDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag344= FindUtil14.reset20Dapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag345= FindUtil14.jieQiDapan5(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag346= FindUtil14.jishujieqiDapan5(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag347= FindUtil14.jishujieqiDapan6(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag348= FindUtil14.jishujieqiDapan7(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag349= FindUtil14.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag350= FindUtil14.shengVDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag351= FindUtil14.reset20Dapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag352= FindUtil14.jieQiDapan6(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag353= FindUtil14.jishujieqiDapan8(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag354= FindUtil14.jishujieqiDapan9(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag355= FindUtil14.jieQiDapan7(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag356= FindUtil14.jieQiDapan8(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag357= FindUtil14.jieQiDapan9(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag358= FindUtil14.jieQiDapan10(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag359= FindUtil14.jieQiDapan11(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag360= FindUtil14.jieQiDapan12(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//
//                boolean flag361= FindUtil15.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag362= FindUtil15.shengVDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag363= FindUtil15.reset20Dapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag364= FindUtil15.jieQiDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag365= FindUtil15.jishujieqiDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag366= FindUtil15.jishujieqiDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag367= FindUtil15.jieQiDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag368= FindUtil15.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag369= FindUtil15.shengVDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag370= FindUtil15.reset20Dapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag371= FindUtil15.jieQiDapan5(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag372= FindUtil15.jishujieqiDapan5(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag373= FindUtil15.jishujieqiDapan6(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag374= FindUtil15.jishujieqiDapan7(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag375= FindUtil15.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag376= FindUtil15.shengVDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag377= FindUtil15.reset20Dapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag378= FindUtil15.jieQiDapan6(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag379= FindUtil15.jishujieqiDapan8(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag380= FindUtil15.jishujieqiDapan9(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag381= FindUtil15.jieQiDapan7(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag382= FindUtil15.jieQiDapan8(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag383= FindUtil15.jieQiDapan9(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag384= FindUtil15.jieQiDapan10(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag385= FindUtil15.jieQiDapan11(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag386= FindUtil15.jieQiDapan12(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//
//                boolean flag387= FindUtil16.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag388= FindUtil16.shengVDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag389= FindUtil16.reset20Dapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag390= FindUtil16.jieQiDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag391= FindUtil16.jishujieqiDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag392= FindUtil16.jishujieqiDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag393= FindUtil16.jieQiDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag394= FindUtil16.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag395= FindUtil16.shengVDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag396= FindUtil16.reset20Dapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag397= FindUtil16.jieQiDapan5(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag398= FindUtil16.jishujieqiDapan5(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag399= FindUtil16.jishujieqiDapan6(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag400= FindUtil16.jishujieqiDapan7(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag401= FindUtil16.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag402= FindUtil16.shengVDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag403= FindUtil16.reset20Dapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag404= FindUtil16.jieQiDapan6(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag405= FindUtil16.jishujieqiDapan8(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag406= FindUtil16.jishujieqiDapan9(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag407= FindUtil16.jieQiDapan7(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag408= FindUtil16.jieQiDapan8(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag409= FindUtil16.jieQiDapan9(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag410= FindUtil16.jieQiDapan10(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag411= FindUtil16.jieQiDapan11(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag412= FindUtil16.jieQiDapan12(stockDayAllList2,stockDayAllListDaPan1,scienceEntityListDaPan);

//                boolean flag2380= FindUtil90.duoTuXiangShangDapan2(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2381= FindUtil90.shengVDapan2(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2382= FindUtil90.reset20Dapan2(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2383= FindUtil90.jieQiDapan3(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2384= FindUtil90.jishujieqiDapan3(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2385= FindUtil90.jishujieqiDapan4(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2386= FindUtil90.jieQiDapan4(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2387= FindUtil90.duoTuXiangShangDapan3(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2388= FindUtil90.shengVDapan3(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2389= FindUtil90.reset20Dapan3(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2390= FindUtil90.jieQiDapan5(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2391= FindUtil90.jishujieqiDapan5(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2392= FindUtil90.jishujieqiDapan6(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2393= FindUtil90.jishujieqiDapan7(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2394= FindUtil90.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList);
//                boolean flag2395= FindUtil90.shengVDapan4(stockDayAllList2,scienceEntityList);
//                boolean flag2396= FindUtil90.reset20Dapan4(stockDayAllList2,scienceEntityList);
//                boolean flag2397= FindUtil90.jieQiDapan6(stockDayAllList2,scienceEntityList);
//                boolean flag2398= FindUtil90.jishujieqiDapan8(stockDayAllList2,scienceEntityList);
//                boolean flag2399= FindUtil90.jishujieqiDapan9(stockDayAllList2,scienceEntityList);
//                boolean flag2400= FindUtil90.jieQiDapan7(stockDayAllList2,scienceEntityList);
//                boolean flag2401= FindUtil90.jieQiDapan8(stockDayAllList2,scienceEntityList);
//                boolean flag2402= FindUtil90.jieQiDapan9(stockDayAllList2,scienceEntityList);
//                boolean flag2403= FindUtil90.jieQiDapan10(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2404= FindUtil90.jieQiDapan11(stockDayAllList2,scienceEntityList);
//                boolean flag2405= FindUtil90.jieQiDapan12(stockDayAllList2,scienceEntityList);
//                boolean flag2406= FindUtil90.jieQiDapan13(stockDayAllList2,scienceEntityList);
//                boolean flag2407= FindUtil90.jieQiDapan14(stockDayAllList2,scienceEntityList);
//                boolean flag2408= FindUtil90.jieQiDapan15(stockDayAllList2,scienceEntityList);
//                boolean flag2409= FindUtil90.jieQiDapan16(stockDayAllList2,scienceEntityList);
//
//                boolean flag2410= FindUtil91.duoTuXiangShangDapan2(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2411= FindUtil91.shengVDapan2(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2412= FindUtil91.reset20Dapan2(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2413= FindUtil91.jieQiDapan3(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2414= FindUtil91.jishujieqiDapan3(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2415= FindUtil91.jishujieqiDapan4(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2416= FindUtil91.jieQiDapan4(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2417= FindUtil91.duoTuXiangShangDapan3(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2418= FindUtil91.shengVDapan3(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2419= FindUtil91.reset20Dapan3(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2420= FindUtil91.jieQiDapan5(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2421= FindUtil91.jishujieqiDapan5(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2422= FindUtil91.jishujieqiDapan6(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2423= FindUtil91.jishujieqiDapan7(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2424= FindUtil91.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList);
//                boolean flag2425= FindUtil91.shengVDapan4(stockDayAllList2,scienceEntityList);
//                boolean flag2426= FindUtil91.reset20Dapan4(stockDayAllList2,scienceEntityList);
//                boolean flag2427= FindUtil91.jieQiDapan6(stockDayAllList2,scienceEntityList);
//                boolean flag2428= FindUtil91.jishujieqiDapan8(stockDayAllList2,scienceEntityList);
//                boolean flag2429= FindUtil91.jishujieqiDapan9(stockDayAllList2,scienceEntityList);
//                boolean flag2430= FindUtil91.jieQiDapan7(stockDayAllList2,scienceEntityList);
//                boolean flag2431= FindUtil91.jieQiDapan8(stockDayAllList2,scienceEntityList);
//                boolean flag2432= FindUtil91.jieQiDapan9(stockDayAllList2,scienceEntityList);
//                boolean flag2433= FindUtil91.jieQiDapan10(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2434= FindUtil91.jieQiDapan11(stockDayAllList2,scienceEntityList);
//                boolean flag2435= FindUtil91.jieQiDapan12(stockDayAllList2,scienceEntityList);
//                boolean flag2436= FindUtil91.jieQiDapan13(stockDayAllList2,scienceEntityList);
//                boolean flag2437= FindUtil91.jieQiDapan14(stockDayAllList2,scienceEntityList);
//                boolean flag2438= FindUtil91.jieQiDapan15(stockDayAllList2,scienceEntityList);
//                boolean flag2439= FindUtil91.jieQiDapan16(stockDayAllList2,scienceEntityList);
//
//                boolean flag2440= FindUtil92.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag2441= FindUtil92.shengVDapan2(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag2442= FindUtil92.reset20Dapan2(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag2443= FindUtil92.jieQiDapan3(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag2444= FindUtil92.jishujieqiDapan3(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag2445= FindUtil92.jishujieqiDapan4(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag2446= FindUtil92.jieQiDapan4(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag2447= FindUtil92.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag2448= FindUtil92.shengVDapan3(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag2449= FindUtil92.reset20Dapan3(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag2450= FindUtil92.jieQiDapan5(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag2451= FindUtil92.jishujieqiDapan5(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag2452= FindUtil92.jishujieqiDapan6(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag2453= FindUtil92.jishujieqiDapan7(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag2454= FindUtil92.duoTuXiangShangDapan4(stockDayAllListDaPan1,scienceEntityList);
//                boolean flag2455= FindUtil92.shengVDapan4(stockDayAllListDaPan1,scienceEntityList);
//                boolean flag2456= FindUtil92.reset20Dapan4(stockDayAllListDaPan1,scienceEntityList);
//                boolean flag2457= FindUtil92.jieQiDapan6(stockDayAllListDaPan1,scienceEntityList);
//                boolean flag2458= FindUtil92.jishujieqiDapan8(stockDayAllListDaPan1,scienceEntityList);
//                boolean flag2459= FindUtil92.jishujieqiDapan9(stockDayAllListDaPan1,scienceEntityList);
//                boolean flag2460= FindUtil92.jieQiDapan7(stockDayAllListDaPan1,scienceEntityList);
//                boolean flag2461= FindUtil92.jieQiDapan8(stockDayAllListDaPan1,scienceEntityList);
//                boolean flag2462= FindUtil92.jieQiDapan9(stockDayAllListDaPan1,scienceEntityList);
//                boolean flag2463= FindUtil92.jieQiDapan10(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag2464= FindUtil92.jieQiDapan11(stockDayAllListDaPan1,scienceEntityList);
//                boolean flag2465= FindUtil92.jieQiDapan12(stockDayAllListDaPan1,scienceEntityList);
//                boolean flag2466= FindUtil92.jieQiDapan13(stockDayAllListDaPan1,scienceEntityList);
//                boolean flag2467= FindUtil92.jieQiDapan14(stockDayAllListDaPan1,scienceEntityList);
//                boolean flag2468= FindUtil92.jieQiDapan15(stockDayAllListDaPan1,scienceEntityList);
//                boolean flag2469= FindUtil92.jieQiDapan16(stockDayAllListDaPan1,scienceEntityList);
//
//                boolean flag2470= FindUtil93.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag2471= FindUtil93.shengVDapan2(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag2472= FindUtil93.reset20Dapan2(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag2473= FindUtil93.jieQiDapan3(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag2474= FindUtil93.jishujieqiDapan3(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag2475= FindUtil93.jishujieqiDapan4(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag2476= FindUtil93.jieQiDapan4(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag2477= FindUtil93.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag2478= FindUtil93.shengVDapan3(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag2479= FindUtil93.reset20Dapan3(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag2480= FindUtil93.jieQiDapan5(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag2481= FindUtil93.jishujieqiDapan5(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag2482= FindUtil93.jishujieqiDapan6(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag2483= FindUtil93.jishujieqiDapan7(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag2484= FindUtil93.duoTuXiangShangDapan4(stockDayAllListDaPan1,scienceEntityList);
//                boolean flag2485= FindUtil93.shengVDapan4(stockDayAllListDaPan1,scienceEntityList);
//                boolean flag2486= FindUtil93.reset20Dapan4(stockDayAllListDaPan1,scienceEntityList);
//                boolean flag2487= FindUtil93.jieQiDapan6(stockDayAllListDaPan1,scienceEntityList);
//                boolean flag2488= FindUtil93.jishujieqiDapan8(stockDayAllListDaPan1,scienceEntityList);
//                boolean flag2489= FindUtil93.jishujieqiDapan9(stockDayAllListDaPan1,scienceEntityList);
//                boolean flag2490= FindUtil93.jieQiDapan7(stockDayAllListDaPan1,scienceEntityList);
//                boolean flag2491= FindUtil93.jieQiDapan8(stockDayAllListDaPan1,scienceEntityList);
//                boolean flag2492= FindUtil93.jieQiDapan9(stockDayAllListDaPan1,scienceEntityList);
//                boolean flag2493= FindUtil93.jieQiDapan10(stockDayAllList2,scienceEntityListDaPan);
//                boolean flag2494= FindUtil93.jieQiDapan11(stockDayAllListDaPan1,scienceEntityList);
//                boolean flag2495= FindUtil93.jieQiDapan12(stockDayAllListDaPan1,scienceEntityList);
//                boolean flag2496= FindUtil93.jieQiDapan13(stockDayAllListDaPan1,scienceEntityList);
//                boolean flag2497= FindUtil93.jieQiDapan14(stockDayAllListDaPan1,scienceEntityList);
//                boolean flag2498= FindUtil93.jieQiDapan15(stockDayAllListDaPan1,scienceEntityList);
//                boolean flag2499= FindUtil93.jieQiDapan16(stockDayAllListDaPan1,scienceEntityList);

//                boolean flag2500= FindUtil94.duoTuXiangShangDapan2(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2501= FindUtil94.shengVDapan2(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2502= FindUtil94.reset20Dapan2(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2503= FindUtil94.jieQiDapan3(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2504= FindUtil94.jishujieqiDapan3(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2505= FindUtil94.jishujieqiDapan4(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2506= FindUtil94.jieQiDapan4(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2507= FindUtil94.duoTuXiangShangDapan3(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2508= FindUtil94.shengVDapan3(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2509= FindUtil94.reset20Dapan3(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2510= FindUtil94.jieQiDapan5(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2511= FindUtil94.jishujieqiDapan5(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2512= FindUtil94.jishujieqiDapan6(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2513= FindUtil94.jishujieqiDapan7(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2514= FindUtil94.duoTuXiangShangDapan4(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2515= FindUtil94.shengVDapan4(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2516= FindUtil94.reset20Dapan4(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2517= FindUtil94.jieQiDapan6(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2518= FindUtil94.jishujieqiDapan8(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2519= FindUtil94.jishujieqiDapan9(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2520= FindUtil94.jieQiDapan7(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2521= FindUtil94.jieQiDapan8(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2522= FindUtil94.jieQiDapan9(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2523= FindUtil94.jieQiDapan10(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2524= FindUtil94.jieQiDapan11(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2525= FindUtil94.jieQiDapan12(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2526= FindUtil94.jieQiDapan13(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2527= FindUtil94.jieQiDapan14(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2528= FindUtil94.jieQiDapan15(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2529= FindUtil94.jieQiDapan16(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2530= FindUtil94.jieQiDapan17(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2531= FindUtil94.jieQiDapan18(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2532= FindUtil94.jieQiDapan19(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2533= FindUtil94.jieQiDapan20(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2534= FindUtil94.jieQiDapan21(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2535= FindUtil94.jieQiDapan22(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2536= FindUtil94.jieQiDapan23(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2537= FindUtil94.jieQiDapan24(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2538= FindUtil94.jieQiDapan25(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2539= FindUtil94.jieQiDapan26(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2540= FindUtil94.jieQiDapan27(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2541= FindUtil94.jieQiDapan28(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2542= FindUtil94.jieQiDapan29(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2543= FindUtil94.jieQiDapan30(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2544= FindUtil94.jieQiDapan31(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2545= FindUtil94.jieQiDapan32(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2546= FindUtil94.jieQiDapan33(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2547= FindUtil94.jieQiDapan34(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2548= FindUtil94.jieQiDapan35(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2549= FindUtil94.jieQiDapan36(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2550= FindUtil94.jieQiDapan37(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2551= FindUtil94.jieQiDapan38(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2552= FindUtil94.jieQiDapan39(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2553= FindUtil94.jieQiDapan40(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2554= FindUtil94.jieQiDapan41(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2555= FindUtil94.jieQiDapan42(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2556= FindUtil94.jieQiDapan43(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2557= FindUtil94.jieQiDapan44(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2558= FindUtil94.jieQiDapan45(stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag2559= FindUtil94.jieQiDapan46(stockDayAllListDaPan1,scienceEntityListDaPan);
//
//                boolean flag2560= FindUtil95.duoTuXiangShangDapan2(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
//                boolean flag2561= FindUtil95.shengVDapan2(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
//                boolean flag2562= FindUtil95.reset20Dapan2(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
//                boolean flag2563= FindUtil95.jieQiDapan3(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
//                boolean flag2564= FindUtil95.jishujieqiDapan3(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
//                boolean flag2565= FindUtil95.jishujieqiDapan4(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
//                boolean flag2566= FindUtil95.jieQiDapan4(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
//                boolean flag2567= FindUtil95.duoTuXiangShangDapan3(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
//                boolean flag2568= FindUtil95.shengVDapan3(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
//                boolean flag2569= FindUtil95.reset20Dapan3(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
//                boolean flag2570= FindUtil95.jieQiDapan5(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
//                boolean flag2571= FindUtil95.jishujieqiDapan5(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
//                boolean flag2572= FindUtil95.jishujieqiDapan6(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
//                boolean flag2573= FindUtil95.jishujieqiDapan7(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
//                boolean flag2574= FindUtil95.duoTuXiangShangDapan4(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
//                boolean flag2575= FindUtil95.shengVDapan4(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
//                boolean flag2576= FindUtil95.reset20Dapan4(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
//                boolean flag2577= FindUtil95.jieQiDapan6(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
//                boolean flag2578= FindUtil95.jishujieqiDapan8(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
//                boolean flag2579= FindUtil95.jishujieqiDapan9(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
//                boolean flag2580= FindUtil95.jieQiDapan7(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
//                boolean flag2581= FindUtil95.jieQiDapan8(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
//                boolean flag2582= FindUtil95.jieQiDapan9(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
//                boolean flag2583= FindUtil95.jieQiDapan10(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
//                boolean flag2584= FindUtil95.jieQiDapan11(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
//                boolean flag2585= FindUtil95.jieQiDapan12(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
//                boolean flag2586= FindUtil95.jieQiDapan13(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
//                boolean flag2587= FindUtil95.jieQiDapan14(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
//                boolean flag2588= FindUtil95.jieQiDapan15(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
//                boolean flag2589= FindUtil95.jieQiDapan16(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
//                boolean flag2590= FindUtil95.jieQiDapan17(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
//                boolean flag2591= FindUtil95.jieQiDapan18(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
//                boolean flag2592= FindUtil95.jieQiDapan19(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
//                boolean flag2593= FindUtil95.jieQiDapan20(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
//                boolean flag2594= FindUtil95.jieQiDapan21(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
//                boolean flag2595= FindUtil95.jieQiDapan22(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
//                boolean flag2596= FindUtil95.jieQiDapan23(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
//                boolean flag2597= FindUtil95.jieQiDapan24(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
//                boolean flag2598= FindUtil95.jieQiDapan25(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
//                boolean flag2599= FindUtil95.jieQiDapan26(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
//                boolean flag2600= FindUtil95.jieQiDapan27(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
//                boolean flag2601= FindUtil95.jieQiDapan28(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
//                boolean flag2602= FindUtil95.jieQiDapan29(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
//                boolean flag2603= FindUtil95.jieQiDapan30(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
//                boolean flag2604= FindUtil95.jieQiDapan31(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
//                boolean flag2605= FindUtil95.jieQiDapan32(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
//                boolean flag2606= FindUtil95.jieQiDapan33(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
//                boolean flag2607= FindUtil95.jieQiDapan34(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
//                boolean flag2608= FindUtil95.jieQiDapan35(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
//                boolean flag2609= FindUtil95.jieQiDapan36(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
//                boolean flag2610= FindUtil95.jieQiDapan37(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
//                boolean flag2611= FindUtil95.jieQiDapan38(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
//                boolean flag2612= FindUtil95.jieQiDapan39(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
//                boolean flag2613= FindUtil95.jieQiDapan40(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
//                boolean flag2614= FindUtil95.jieQiDapan41(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
//                boolean flag2615= FindUtil95.jieQiDapan42(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
//                boolean flag2616= FindUtil95.jieQiDapan43(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
//                boolean flag2617= FindUtil95.jieQiDapan44(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
//                boolean flag2618= FindUtil95.jieQiDapan45(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
//                boolean flag2619= FindUtil95.jieQiDapan46(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
//
//
//                boolean flag2620= FindUtil96.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2621= FindUtil96.shengVDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2622= FindUtil96.reset20Dapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2623= FindUtil96.jieQiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2624= FindUtil96.jishujieqiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2625= FindUtil96.jishujieqiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2626= FindUtil96.jieQiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2627= FindUtil96.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2628= FindUtil96.shengVDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2629= FindUtil96.reset20Dapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2630= FindUtil96.jieQiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2631= FindUtil96.jishujieqiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2632= FindUtil96.jishujieqiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2633= FindUtil96.jishujieqiDapan7(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2634= FindUtil96.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2635= FindUtil96.shengVDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2636= FindUtil96.reset20Dapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2637= FindUtil96.jieQiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2638= FindUtil96.jishujieqiDapan8(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2639= FindUtil96.jishujieqiDapan9(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2640= FindUtil96.jieQiDapan7(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2641= FindUtil96.jieQiDapan8(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2642= FindUtil96.jieQiDapan9(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2643= FindUtil96.jieQiDapan10(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2644= FindUtil96.jieQiDapan11(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2645= FindUtil96.jieQiDapan12(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2646= FindUtil96.jieQiDapan13(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2647= FindUtil96.jieQiDapan14(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2648= FindUtil96.jieQiDapan15(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2649= FindUtil96.jieQiDapan16(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2650= FindUtil96.jieQiDapan17(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2651= FindUtil96.jieQiDapan18(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2652= FindUtil96.jieQiDapan19(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2653= FindUtil96.jieQiDapan20(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2654= FindUtil96.jieQiDapan21(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2655= FindUtil96.jieQiDapan22(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2656= FindUtil96.jieQiDapan23(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2657= FindUtil96.jieQiDapan24(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2658= FindUtil96.jieQiDapan25(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2659= FindUtil96.jieQiDapan26(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2660= FindUtil96.jieQiDapan27(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2661= FindUtil96.jieQiDapan28(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2662= FindUtil96.jieQiDapan29(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2663= FindUtil96.jieQiDapan30(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2664= FindUtil96.jieQiDapan31(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2665= FindUtil96.jieQiDapan32(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2666= FindUtil96.jieQiDapan33(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2667= FindUtil96.jieQiDapan34(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2668= FindUtil96.jieQiDapan35(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2669= FindUtil96.jieQiDapan36(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2670= FindUtil96.jieQiDapan37(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2671= FindUtil96.jieQiDapan38(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2672= FindUtil96.jieQiDapan39(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2673= FindUtil96.jieQiDapan40(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2674= FindUtil96.jieQiDapan41(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2675= FindUtil96.jieQiDapan42(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2676= FindUtil96.jieQiDapan43(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2677= FindUtil96.jieQiDapan44(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2678= FindUtil96.jieQiDapan45(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//                boolean flag2679= FindUtil96.jieQiDapan46(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
//
//                boolean flag2680= FindUtil97.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList);
//                boolean flag2681= FindUtil97.shengVDapan2(stockDayAllList2,scienceEntityList);
//                boolean flag2682= FindUtil97.reset20Dapan2(stockDayAllList2,scienceEntityList);
//                boolean flag2683= FindUtil97.jieQiDapan3(stockDayAllList2,scienceEntityList);
//                boolean flag2684= FindUtil97.jishujieqiDapan3(stockDayAllList2,scienceEntityList);
//                boolean flag2685= FindUtil97.jishujieqiDapan4(stockDayAllList2,scienceEntityList);
//                boolean flag2686= FindUtil97.jieQiDapan4(stockDayAllList2,scienceEntityList);
//                boolean flag2687= FindUtil97.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList);
//                boolean flag2688= FindUtil97.shengVDapan3(stockDayAllList2,scienceEntityList);
//                boolean flag2689= FindUtil97.reset20Dapan3(stockDayAllList2,scienceEntityList);
//                boolean flag2690= FindUtil97.jieQiDapan5(stockDayAllList2,scienceEntityList);
//                boolean flag2691= FindUtil97.jishujieqiDapan5(stockDayAllList2,scienceEntityList);
//                boolean flag2692= FindUtil97.jishujieqiDapan6(stockDayAllList2,scienceEntityList);
//                boolean flag2693= FindUtil97.jishujieqiDapan7(stockDayAllList2,scienceEntityList);
//                boolean flag2694= FindUtil97.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList);
//                boolean flag2695= FindUtil97.shengVDapan4(stockDayAllList2,scienceEntityList);
//                boolean flag2696= FindUtil97.reset20Dapan4(stockDayAllList2,scienceEntityList);
//                boolean flag2697= FindUtil97.jieQiDapan6(stockDayAllList2,scienceEntityList);
//                boolean flag2698= FindUtil97.jishujieqiDapan8(stockDayAllList2,scienceEntityList);
//                boolean flag2699= FindUtil97.jishujieqiDapan9(stockDayAllList2,scienceEntityList);
//                boolean flag2700= FindUtil97.jieQiDapan7(stockDayAllList2,scienceEntityList);
//                boolean flag2701= FindUtil97.jieQiDapan8(stockDayAllList2,scienceEntityList);
//                boolean flag2702= FindUtil97.jieQiDapan9(stockDayAllList2,scienceEntityList);
//                boolean flag2703= FindUtil97.jieQiDapan10(stockDayAllList2,scienceEntityList);
//                boolean flag2704= FindUtil97.jieQiDapan11(stockDayAllList2,scienceEntityList);
//                boolean flag2705= FindUtil97.jieQiDapan12(stockDayAllList2,scienceEntityList);
//                boolean flag2706= FindUtil97.jieQiDapan13(stockDayAllList2,scienceEntityList);
//                boolean flag2707= FindUtil97.jieQiDapan14(stockDayAllList2,scienceEntityList);
//                boolean flag2708= FindUtil97.jieQiDapan15(stockDayAllList2,scienceEntityList);
//                boolean flag2709= FindUtil97.jieQiDapan16(stockDayAllList2,scienceEntityList);
//                boolean flag2710= FindUtil97.jieQiDapan17(stockDayAllList2,scienceEntityList);
//                boolean flag2711= FindUtil97.jieQiDapan18(stockDayAllList2,scienceEntityList);
//                boolean flag2712= FindUtil97.jieQiDapan19(stockDayAllList2,scienceEntityList);
//                boolean flag2713= FindUtil97.jieQiDapan20(stockDayAllList2,scienceEntityList);
//                boolean flag2714= FindUtil97.jieQiDapan21(stockDayAllList2,scienceEntityList);
//                boolean flag2715= FindUtil97.jieQiDapan22(stockDayAllList2,scienceEntityList);
//                boolean flag2716= FindUtil97.jieQiDapan23(stockDayAllList2,scienceEntityList);
//                boolean flag2717= FindUtil97.jieQiDapan24(stockDayAllList2,scienceEntityList);
//                boolean flag2718= FindUtil97.jieQiDapan25(stockDayAllList2,scienceEntityList);
//                boolean flag2719= FindUtil97.jieQiDapan26(stockDayAllList2,scienceEntityList);
//                boolean flag2720= FindUtil97.jieQiDapan27(stockDayAllList2,scienceEntityList);
//                boolean flag2721= FindUtil97.jieQiDapan28(stockDayAllList2,scienceEntityList);
//                boolean flag2722= FindUtil97.jieQiDapan29(stockDayAllList2,scienceEntityList);
//                boolean flag2723= FindUtil97.jieQiDapan30(stockDayAllList2,scienceEntityList);
//                boolean flag2724= FindUtil97.jieQiDapan31(stockDayAllList2,scienceEntityList);
//                boolean flag2725= FindUtil97.jieQiDapan32(stockDayAllList2,scienceEntityList);
//                boolean flag2726= FindUtil97.jieQiDapan33(stockDayAllList2,scienceEntityList);
//                boolean flag2727= FindUtil97.jieQiDapan34(stockDayAllList2,scienceEntityList);
//                boolean flag2728= FindUtil97.jieQiDapan35(stockDayAllList2,scienceEntityList);
//                boolean flag2729= FindUtil97.jieQiDapan36(stockDayAllList2,scienceEntityList);
//                boolean flag2730= FindUtil97.jieQiDapan37(stockDayAllList2,scienceEntityList);
//                boolean flag2731= FindUtil97.jieQiDapan38(stockDayAllList2,scienceEntityList);
//                boolean flag2732= FindUtil97.jieQiDapan39(stockDayAllList2,scienceEntityList);
//                boolean flag2733= FindUtil97.jieQiDapan40(stockDayAllList2,scienceEntityList);
//                boolean flag2734= FindUtil97.jieQiDapan41(stockDayAllList2,scienceEntityList);
//                boolean flag2735= FindUtil97.jieQiDapan42(stockDayAllList2,scienceEntityList);
//                boolean flag2736= FindUtil97.jieQiDapan43(stockDayAllList2,scienceEntityList);
//                boolean flag2737= FindUtil97.jieQiDapan44(stockDayAllList2,scienceEntityList);
//                boolean flag2738= FindUtil97.jieQiDapan45(stockDayAllList2,scienceEntityList);
//                boolean flag2739= FindUtil97.jieQiDapan46(stockDayAllList2,scienceEntityList);


                boolean flag2740= FindUtil98.duoTuXiangShangDapan2(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2741= FindUtil98.shengVDapan2(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2742= FindUtil98.reset20Dapan2(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2743= FindUtil98.jieQiDapan3(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2744= FindUtil98.jishujieqiDapan3(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2745= FindUtil98.jishujieqiDapan4(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2746= FindUtil98.jieQiDapan4(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2747= FindUtil98.duoTuXiangShangDapan3(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2748= FindUtil98.shengVDapan3(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2749= FindUtil98.reset20Dapan3(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2750= FindUtil98.jieQiDapan5(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2751= FindUtil98.jishujieqiDapan5(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2752= FindUtil98.jishujieqiDapan6(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2753= FindUtil98.jishujieqiDapan7(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2754= FindUtil98.duoTuXiangShangDapan4(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2755= FindUtil98.shengVDapan4(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2756= FindUtil98.reset20Dapan4(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2757= FindUtil98.jieQiDapan6(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2758= FindUtil98.jishujieqiDapan8(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2759= FindUtil98.jishujieqiDapan9(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2760= FindUtil98.jieQiDapan7(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2761= FindUtil98.jieQiDapan8(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2762= FindUtil98.jieQiDapan9(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2763= FindUtil98.jieQiDapan10(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2764= FindUtil98.jieQiDapan11(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2765= FindUtil98.jieQiDapan12(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2766= FindUtil98.jieQiDapan13(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2767= FindUtil98.jieQiDapan14(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2768= FindUtil98.jieQiDapan15(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2769= FindUtil98.jieQiDapan16(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2770= FindUtil98.jieQiDapan17(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2771= FindUtil98.jieQiDapan18(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2772= FindUtil98.jieQiDapan19(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2773= FindUtil98.jieQiDapan20(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2774= FindUtil98.jieQiDapan21(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2775= FindUtil98.jieQiDapan22(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2776= FindUtil98.jieQiDapan23(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2777= FindUtil98.jieQiDapan24(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2778= FindUtil98.jieQiDapan25(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2779= FindUtil98.jieQiDapan26(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2780= FindUtil98.jieQiDapan27(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2781= FindUtil98.jieQiDapan28(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2782= FindUtil98.jieQiDapan29(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2783= FindUtil98.jieQiDapan30(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2784= FindUtil98.jieQiDapan31(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2785= FindUtil98.jieQiDapan32(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2786= FindUtil98.jieQiDapan33(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2787= FindUtil98.jieQiDapan34(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2788= FindUtil98.jieQiDapan35(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2789= FindUtil98.jieQiDapan36(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2790= FindUtil98.jieQiDapan37(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2791= FindUtil98.jieQiDapan38(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2792= FindUtil98.jieQiDapan39(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2793= FindUtil98.jieQiDapan40(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2794= FindUtil98.jieQiDapan41(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2795= FindUtil98.jieQiDapan42(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2796= FindUtil98.jieQiDapan43(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2797= FindUtil98.jieQiDapan44(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2798= FindUtil98.jieQiDapan45(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2799= FindUtil98.jieQiDapan46(stockDayAllListDaPan1,scienceEntityListDaPan);

                boolean flag2800= FindUtil99.duoTuXiangShangDapan2(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag2801= FindUtil99.shengVDapan2(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag2802= FindUtil99.reset20Dapan2(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag2803= FindUtil99.jieQiDapan3(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag2804= FindUtil99.jishujieqiDapan3(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag2805= FindUtil99.jishujieqiDapan4(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag2806= FindUtil99.jieQiDapan4(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag2807= FindUtil99.duoTuXiangShangDapan3(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag2808= FindUtil99.shengVDapan3(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag2809= FindUtil99.reset20Dapan3(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag2810= FindUtil99.jieQiDapan5(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag2811= FindUtil99.jishujieqiDapan5(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag2812= FindUtil99.jishujieqiDapan6(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag2813= FindUtil99.jishujieqiDapan7(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag2814= FindUtil99.duoTuXiangShangDapan4(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag2815= FindUtil99.shengVDapan4(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag2816= FindUtil99.reset20Dapan4(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag2817= FindUtil99.jieQiDapan6(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag2818= FindUtil99.jishujieqiDapan8(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag2819= FindUtil99.jishujieqiDapan9(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag2820= FindUtil99.jieQiDapan7(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag2821= FindUtil99.jieQiDapan8(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag2822= FindUtil99.jieQiDapan9(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag2823= FindUtil99.jieQiDapan10(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag2824= FindUtil99.jieQiDapan11(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag2825= FindUtil99.jieQiDapan12(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag2826= FindUtil99.jieQiDapan13(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag2827= FindUtil99.jieQiDapan14(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag2828= FindUtil99.jieQiDapan15(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag2829= FindUtil99.jieQiDapan16(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag2830= FindUtil99.jieQiDapan17(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag2831= FindUtil99.jieQiDapan18(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag2832= FindUtil99.jieQiDapan19(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag2833= FindUtil99.jieQiDapan20(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag2834= FindUtil99.jieQiDapan21(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag2835= FindUtil99.jieQiDapan22(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag2836= FindUtil99.jieQiDapan23(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag2837= FindUtil99.jieQiDapan24(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag2838= FindUtil99.jieQiDapan25(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag2839= FindUtil99.jieQiDapan26(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag2840= FindUtil99.jieQiDapan27(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag2841= FindUtil99.jieQiDapan28(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag2842= FindUtil99.jieQiDapan29(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag2843= FindUtil99.jieQiDapan30(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag2844= FindUtil99.jieQiDapan31(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag2845= FindUtil99.jieQiDapan32(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag2846= FindUtil99.jieQiDapan33(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag2847= FindUtil99.jieQiDapan34(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag2848= FindUtil99.jieQiDapan35(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag2849= FindUtil99.jieQiDapan36(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag2850= FindUtil99.jieQiDapan37(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag2851= FindUtil99.jieQiDapan38(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag2852= FindUtil99.jieQiDapan39(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag2853= FindUtil99.jieQiDapan40(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag2854= FindUtil99.jieQiDapan41(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag2855= FindUtil99.jieQiDapan42(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag2856= FindUtil99.jieQiDapan43(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag2857= FindUtil99.jieQiDapan44(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag2858= FindUtil99.jieQiDapan45(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag2859= FindUtil99.jieQiDapan46(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);

                boolean flag2860= FindUtil100.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag2861= FindUtil100.shengVDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag2862= FindUtil100.reset20Dapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag2863= FindUtil100.jieQiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag2864= FindUtil100.jishujieqiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag2865= FindUtil100.jishujieqiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag2866= FindUtil100.jieQiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag2867= FindUtil100.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag2868= FindUtil100.shengVDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag2869= FindUtil100.reset20Dapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag2870= FindUtil100.jieQiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag2871= FindUtil100.jishujieqiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag2872= FindUtil100.jishujieqiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag2873= FindUtil100.jishujieqiDapan7(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag2874= FindUtil100.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag2875= FindUtil100.shengVDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag2876= FindUtil100.reset20Dapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag2877= FindUtil100.jieQiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag2878= FindUtil100.jishujieqiDapan8(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag2879= FindUtil100.jishujieqiDapan9(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag2880= FindUtil100.jieQiDapan7(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag2881= FindUtil100.jieQiDapan8(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag2882= FindUtil100.jieQiDapan9(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag2883= FindUtil100.jieQiDapan10(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag2884= FindUtil100.jieQiDapan11(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag2885= FindUtil100.jieQiDapan12(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag2886= FindUtil100.jieQiDapan13(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag2887= FindUtil100.jieQiDapan14(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag2888= FindUtil100.jieQiDapan15(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag2889= FindUtil100.jieQiDapan16(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag2890= FindUtil100.jieQiDapan17(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag2891= FindUtil100.jieQiDapan18(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag2892= FindUtil100.jieQiDapan19(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag2893= FindUtil100.jieQiDapan20(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag2894= FindUtil100.jieQiDapan21(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag2895= FindUtil100.jieQiDapan22(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag2896= FindUtil100.jieQiDapan23(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag2897= FindUtil100.jieQiDapan24(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag2898= FindUtil100.jieQiDapan25(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag2899= FindUtil100.jieQiDapan26(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag2900= FindUtil100.jieQiDapan27(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag2901= FindUtil100.jieQiDapan28(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag2902= FindUtil100.jieQiDapan29(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag2903= FindUtil100.jieQiDapan30(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag2904= FindUtil100.jieQiDapan31(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag2905= FindUtil100.jieQiDapan32(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag2906= FindUtil100.jieQiDapan33(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag2907= FindUtil100.jieQiDapan34(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag2908= FindUtil100.jieQiDapan35(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag2909= FindUtil100.jieQiDapan36(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag2910= FindUtil100.jieQiDapan37(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag2911= FindUtil100.jieQiDapan38(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag2912= FindUtil100.jieQiDapan39(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag2913= FindUtil100.jieQiDapan40(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag2914= FindUtil100.jieQiDapan41(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag2915= FindUtil100.jieQiDapan42(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag2916= FindUtil100.jieQiDapan43(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag2917= FindUtil100.jieQiDapan44(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag2918= FindUtil100.jieQiDapan45(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag2919= FindUtil100.jieQiDapan46(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);

                boolean flag2920= FindUtil101.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList);
                boolean flag2921= FindUtil101.shengVDapan2(stockDayAllList2,scienceEntityList);
                boolean flag2922= FindUtil101.reset20Dapan2(stockDayAllList2,scienceEntityList);
                boolean flag2923= FindUtil101.jieQiDapan3(stockDayAllList2,scienceEntityList);
                boolean flag2924= FindUtil101.jishujieqiDapan3(stockDayAllList2,scienceEntityList);
                boolean flag2925= FindUtil101.jishujieqiDapan4(stockDayAllList2,scienceEntityList);
                boolean flag2926= FindUtil101.jieQiDapan4(stockDayAllList2,scienceEntityList);
                boolean flag2927= FindUtil101.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList);
                boolean flag2928= FindUtil101.shengVDapan3(stockDayAllList2,scienceEntityList);
                boolean flag2929= FindUtil101.reset20Dapan3(stockDayAllList2,scienceEntityList);
                boolean flag2930= FindUtil101.jieQiDapan5(stockDayAllList2,scienceEntityList);
                boolean flag2931= FindUtil101.jishujieqiDapan5(stockDayAllList2,scienceEntityList);
                boolean flag2932= FindUtil101.jishujieqiDapan6(stockDayAllList2,scienceEntityList);
                boolean flag2933= FindUtil101.jishujieqiDapan7(stockDayAllList2,scienceEntityList);
                boolean flag2934= FindUtil101.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList);
                boolean flag2935= FindUtil101.shengVDapan4(stockDayAllList2,scienceEntityList);
                boolean flag2936= FindUtil101.reset20Dapan4(stockDayAllList2,scienceEntityList);
                boolean flag2937= FindUtil101.jieQiDapan6(stockDayAllList2,scienceEntityList);
                boolean flag2938= FindUtil101.jishujieqiDapan8(stockDayAllList2,scienceEntityList);
                boolean flag2939= FindUtil101.jishujieqiDapan9(stockDayAllList2,scienceEntityList);
                boolean flag2940= FindUtil101.jieQiDapan7(stockDayAllList2,scienceEntityList);
                boolean flag2941= FindUtil101.jieQiDapan8(stockDayAllList2,scienceEntityList);
                boolean flag2942= FindUtil101.jieQiDapan9(stockDayAllList2,scienceEntityList);
                boolean flag2943= FindUtil101.jieQiDapan10(stockDayAllList2,scienceEntityList);
                boolean flag2944= FindUtil101.jieQiDapan11(stockDayAllList2,scienceEntityList);
                boolean flag2945= FindUtil101.jieQiDapan12(stockDayAllList2,scienceEntityList);
                boolean flag2946= FindUtil101.jieQiDapan13(stockDayAllList2,scienceEntityList);
                boolean flag2947= FindUtil101.jieQiDapan14(stockDayAllList2,scienceEntityList);
                boolean flag2948= FindUtil101.jieQiDapan15(stockDayAllList2,scienceEntityList);
                boolean flag2949= FindUtil101.jieQiDapan16(stockDayAllList2,scienceEntityList);
                boolean flag2950= FindUtil101.jieQiDapan17(stockDayAllList2,scienceEntityList);
                boolean flag2951= FindUtil101.jieQiDapan18(stockDayAllList2,scienceEntityList);
                boolean flag2952= FindUtil101.jieQiDapan19(stockDayAllList2,scienceEntityList);
                boolean flag2953= FindUtil101.jieQiDapan20(stockDayAllList2,scienceEntityList);
                boolean flag2954= FindUtil101.jieQiDapan21(stockDayAllList2,scienceEntityList);
                boolean flag2955= FindUtil101.jieQiDapan22(stockDayAllList2,scienceEntityList);
                boolean flag2956= FindUtil101.jieQiDapan23(stockDayAllList2,scienceEntityList);
                boolean flag2957= FindUtil101.jieQiDapan24(stockDayAllList2,scienceEntityList);
                boolean flag2958= FindUtil101.jieQiDapan25(stockDayAllList2,scienceEntityList);
                boolean flag2959= FindUtil101.jieQiDapan26(stockDayAllList2,scienceEntityList);
                boolean flag2960= FindUtil101.jieQiDapan27(stockDayAllList2,scienceEntityList);
                boolean flag2961= FindUtil101.jieQiDapan28(stockDayAllList2,scienceEntityList);
                boolean flag2962= FindUtil101.jieQiDapan29(stockDayAllList2,scienceEntityList);
                boolean flag2963= FindUtil101.jieQiDapan30(stockDayAllList2,scienceEntityList);
                boolean flag2964= FindUtil101.jieQiDapan31(stockDayAllList2,scienceEntityList);
                boolean flag2965= FindUtil101.jieQiDapan32(stockDayAllList2,scienceEntityList);
                boolean flag2966= FindUtil101.jieQiDapan33(stockDayAllList2,scienceEntityList);
                boolean flag2967= FindUtil101.jieQiDapan34(stockDayAllList2,scienceEntityList);
                boolean flag2968= FindUtil101.jieQiDapan35(stockDayAllList2,scienceEntityList);
                boolean flag2969= FindUtil101.jieQiDapan36(stockDayAllList2,scienceEntityList);
                boolean flag2970= FindUtil101.jieQiDapan37(stockDayAllList2,scienceEntityList);
                boolean flag2971= FindUtil101.jieQiDapan38(stockDayAllList2,scienceEntityList);
                boolean flag2972= FindUtil101.jieQiDapan39(stockDayAllList2,scienceEntityList);
                boolean flag2973= FindUtil101.jieQiDapan40(stockDayAllList2,scienceEntityList);
                boolean flag2974= FindUtil101.jieQiDapan41(stockDayAllList2,scienceEntityList);
                boolean flag2975= FindUtil101.jieQiDapan42(stockDayAllList2,scienceEntityList);
                boolean flag2976= FindUtil101.jieQiDapan43(stockDayAllList2,scienceEntityList);
                boolean flag2977= FindUtil101.jieQiDapan44(stockDayAllList2,scienceEntityList);
                boolean flag2978= FindUtil101.jieQiDapan45(stockDayAllList2,scienceEntityList);
                boolean flag2979= FindUtil101.jieQiDapan46(stockDayAllList2,scienceEntityList);

                boolean flag2980= FindUtil102.duoTuXiangShangDapan2(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2981= FindUtil102.shengVDapan2(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2982= FindUtil102.reset20Dapan2(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2983= FindUtil102.jieQiDapan3(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2984= FindUtil102.jishujieqiDapan3(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2985= FindUtil102.jishujieqiDapan4(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2986= FindUtil102.jieQiDapan4(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2987= FindUtil102.duoTuXiangShangDapan3(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2988= FindUtil102.shengVDapan3(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2989= FindUtil102.reset20Dapan3(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2990= FindUtil102.jieQiDapan5(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2991= FindUtil102.jishujieqiDapan5(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2992= FindUtil102.jishujieqiDapan6(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2993= FindUtil102.jishujieqiDapan7(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2994= FindUtil102.duoTuXiangShangDapan4(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2995= FindUtil102.shengVDapan4(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2996= FindUtil102.reset20Dapan4(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2997= FindUtil102.jieQiDapan6(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2998= FindUtil102.jishujieqiDapan8(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2999= FindUtil102.jishujieqiDapan9(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3000= FindUtil102.jieQiDapan7(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3001= FindUtil102.jieQiDapan8(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3002= FindUtil102.jieQiDapan9(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3003= FindUtil102.jieQiDapan10(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3004= FindUtil102.jieQiDapan11(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3005= FindUtil102.jieQiDapan12(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3006= FindUtil102.jieQiDapan13(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3007= FindUtil102.jieQiDapan14(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3008= FindUtil102.jieQiDapan15(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3009= FindUtil102.jieQiDapan16(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3010= FindUtil102.jieQiDapan17(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3011= FindUtil102.jieQiDapan18(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3012= FindUtil102.jieQiDapan19(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3013= FindUtil102.jieQiDapan20(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3014= FindUtil102.jieQiDapan21(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3015= FindUtil102.jieQiDapan22(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3016= FindUtil102.jieQiDapan23(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3017= FindUtil102.jieQiDapan24(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3018= FindUtil102.jieQiDapan25(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3019= FindUtil102.jieQiDapan26(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3020= FindUtil102.jieQiDapan27(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3021= FindUtil102.jieQiDapan28(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3022= FindUtil102.jieQiDapan29(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3023= FindUtil102.jieQiDapan30(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3024= FindUtil102.jieQiDapan31(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3025= FindUtil102.jieQiDapan32(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3026= FindUtil102.jieQiDapan33(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3027= FindUtil102.jieQiDapan34(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3028= FindUtil102.jieQiDapan35(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3029= FindUtil102.jieQiDapan36(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3030= FindUtil102.jieQiDapan37(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3031= FindUtil102.jieQiDapan38(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3032= FindUtil102.jieQiDapan39(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3033= FindUtil102.jieQiDapan40(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3034= FindUtil102.jieQiDapan41(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3035= FindUtil102.jieQiDapan42(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3036= FindUtil102.jieQiDapan43(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3037= FindUtil102.jieQiDapan44(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3038= FindUtil102.jieQiDapan45(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3039= FindUtil102.jieQiDapan46(stockDayAllListDaPan1,scienceEntityListDaPan);

                boolean flag3040= FindUtil103.duoTuXiangShangDapan2(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag3041= FindUtil103.shengVDapan2(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag3042= FindUtil103.reset20Dapan2(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag3043= FindUtil103.jieQiDapan3(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag3044= FindUtil103.jishujieqiDapan3(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag3045= FindUtil103.jishujieqiDapan4(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag3046= FindUtil103.jieQiDapan4(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag3047= FindUtil103.duoTuXiangShangDapan3(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag3048= FindUtil103.shengVDapan3(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag3049= FindUtil103.reset20Dapan3(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag3050= FindUtil103.jieQiDapan5(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag3051= FindUtil103.jishujieqiDapan5(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag3052= FindUtil103.jishujieqiDapan6(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag3053= FindUtil103.jishujieqiDapan7(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag3054= FindUtil103.duoTuXiangShangDapan4(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag3055= FindUtil103.shengVDapan4(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag3056= FindUtil103.reset20Dapan4(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag3057= FindUtil103.jieQiDapan6(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag3058= FindUtil103.jishujieqiDapan8(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag3059= FindUtil103.jishujieqiDapan9(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag3060= FindUtil103.jieQiDapan7(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag3061= FindUtil103.jieQiDapan8(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag3062= FindUtil103.jieQiDapan9(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag3063= FindUtil103.jieQiDapan10(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag3064= FindUtil103.jieQiDapan11(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag3065= FindUtil103.jieQiDapan12(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag3066= FindUtil103.jieQiDapan13(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag3067= FindUtil103.jieQiDapan14(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag3068= FindUtil103.jieQiDapan15(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag3069= FindUtil103.jieQiDapan16(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag3070= FindUtil103.jieQiDapan17(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag3071= FindUtil103.jieQiDapan18(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag3072= FindUtil103.jieQiDapan19(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag3073= FindUtil103.jieQiDapan20(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag3074= FindUtil103.jieQiDapan21(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag3075= FindUtil103.jieQiDapan22(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag3076= FindUtil103.jieQiDapan23(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag3077= FindUtil103.jieQiDapan24(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag3078= FindUtil103.jieQiDapan25(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag3079= FindUtil103.jieQiDapan26(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag3080= FindUtil103.jieQiDapan27(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag3081= FindUtil103.jieQiDapan28(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag3082= FindUtil103.jieQiDapan29(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag3083= FindUtil103.jieQiDapan30(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag3084= FindUtil103.jieQiDapan31(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag3085= FindUtil103.jieQiDapan32(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag3086= FindUtil103.jieQiDapan33(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag3087= FindUtil103.jieQiDapan34(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag3088= FindUtil103.jieQiDapan35(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag3089= FindUtil103.jieQiDapan36(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag3090= FindUtil103.jieQiDapan37(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag3091= FindUtil103.jieQiDapan38(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag3092= FindUtil103.jieQiDapan39(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag3093= FindUtil103.jieQiDapan40(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag3094= FindUtil103.jieQiDapan41(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag3095= FindUtil103.jieQiDapan42(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag3096= FindUtil103.jieQiDapan43(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag3097= FindUtil103.jieQiDapan44(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag3098= FindUtil103.jieQiDapan45(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);
                boolean flag3099= FindUtil103.jieQiDapan46(stockDayAllListDaPan1,scienceEntityListDaPan,scienceEntityList);

                boolean flag3100= FindUtil104.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag3101= FindUtil104.shengVDapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag3102= FindUtil104.reset20Dapan2(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag3103= FindUtil104.jieQiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag3104= FindUtil104.jishujieqiDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag3105= FindUtil104.jishujieqiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag3106= FindUtil104.jieQiDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag3107= FindUtil104.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag3108= FindUtil104.shengVDapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag3109= FindUtil104.reset20Dapan3(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag3110= FindUtil104.jieQiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag3111= FindUtil104.jishujieqiDapan5(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag3112= FindUtil104.jishujieqiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag3113= FindUtil104.jishujieqiDapan7(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag3114= FindUtil104.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag3115= FindUtil104.shengVDapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag3116= FindUtil104.reset20Dapan4(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag3117= FindUtil104.jieQiDapan6(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag3118= FindUtil104.jishujieqiDapan8(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag3119= FindUtil104.jishujieqiDapan9(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag3120= FindUtil104.jieQiDapan7(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag3121= FindUtil104.jieQiDapan8(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag3122= FindUtil104.jieQiDapan9(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag3123= FindUtil104.jieQiDapan10(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag3124= FindUtil104.jieQiDapan11(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag3125= FindUtil104.jieQiDapan12(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag3126= FindUtil104.jieQiDapan13(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag3127= FindUtil104.jieQiDapan14(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag3128= FindUtil104.jieQiDapan15(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag3129= FindUtil104.jieQiDapan16(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag3130= FindUtil104.jieQiDapan17(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag3131= FindUtil104.jieQiDapan18(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag3132= FindUtil104.jieQiDapan19(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag3133= FindUtil104.jieQiDapan20(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag3134= FindUtil104.jieQiDapan21(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag3135= FindUtil104.jieQiDapan22(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag3136= FindUtil104.jieQiDapan23(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag3137= FindUtil104.jieQiDapan24(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag3138= FindUtil104.jieQiDapan25(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag3139= FindUtil104.jieQiDapan26(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag3140= FindUtil104.jieQiDapan27(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag3141= FindUtil104.jieQiDapan28(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag3142= FindUtil104.jieQiDapan29(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag3143= FindUtil104.jieQiDapan30(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag3144= FindUtil104.jieQiDapan31(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag3145= FindUtil104.jieQiDapan32(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag3146= FindUtil104.jieQiDapan33(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag3147= FindUtil104.jieQiDapan34(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag3148= FindUtil104.jieQiDapan35(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag3149= FindUtil104.jieQiDapan36(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag3150= FindUtil104.jieQiDapan37(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag3151= FindUtil104.jieQiDapan38(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag3152= FindUtil104.jieQiDapan39(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag3153= FindUtil104.jieQiDapan40(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag3154= FindUtil104.jieQiDapan41(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag3155= FindUtil104.jieQiDapan42(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag3156= FindUtil104.jieQiDapan43(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag3157= FindUtil104.jieQiDapan44(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag3158= FindUtil104.jieQiDapan45(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);
                boolean flag3159= FindUtil104.jieQiDapan46(stockDayAllList2,scienceEntityList,scienceEntityListDaPan);

                boolean flag3160= FindUtil105.duoTuXiangShangDapan2(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3161= FindUtil105.shengVDapan2(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3162= FindUtil105.reset20Dapan2(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3163= FindUtil105.jieQiDapan3(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3164= FindUtil105.jishujieqiDapan3(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3165= FindUtil105.jishujieqiDapan4(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3166= FindUtil105.jieQiDapan4(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3167= FindUtil105.duoTuXiangShangDapan3(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3168= FindUtil105.shengVDapan3(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3169= FindUtil105.reset20Dapan3(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3170= FindUtil105.jieQiDapan5(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3171= FindUtil105.jishujieqiDapan5(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3172= FindUtil105.jishujieqiDapan6(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3173= FindUtil105.jishujieqiDapan7(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3174= FindUtil105.duoTuXiangShangDapan4(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3175= FindUtil105.shengVDapan4(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3176= FindUtil105.reset20Dapan4(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3177= FindUtil105.jieQiDapan6(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3178= FindUtil105.jishujieqiDapan8(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3179= FindUtil105.jishujieqiDapan9(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3180= FindUtil105.jieQiDapan7(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3181= FindUtil105.jieQiDapan8(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3182= FindUtil105.jieQiDapan9(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3183= FindUtil105.jieQiDapan10(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3184= FindUtil105.jieQiDapan11(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3185= FindUtil105.jieQiDapan12(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3186= FindUtil105.jieQiDapan13(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3187= FindUtil105.jieQiDapan14(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3188= FindUtil105.jieQiDapan15(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3189= FindUtil105.jieQiDapan16(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3190= FindUtil105.jieQiDapan17(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3191= FindUtil105.jieQiDapan18(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3192= FindUtil105.jieQiDapan19(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3193= FindUtil105.jieQiDapan20(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3194= FindUtil105.jieQiDapan21(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3195= FindUtil105.jieQiDapan22(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3196= FindUtil105.jieQiDapan23(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3197= FindUtil105.jieQiDapan24(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3198= FindUtil105.jieQiDapan25(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3199= FindUtil105.jieQiDapan26(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3200= FindUtil105.jieQiDapan27(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3201= FindUtil105.jieQiDapan28(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3202= FindUtil105.jieQiDapan29(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3203= FindUtil105.jieQiDapan30(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3204= FindUtil105.jieQiDapan31(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3205= FindUtil105.jieQiDapan32(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3206= FindUtil105.jieQiDapan33(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3207= FindUtil105.jieQiDapan34(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3208= FindUtil105.jieQiDapan35(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3209= FindUtil105.jieQiDapan36(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3210= FindUtil105.jieQiDapan37(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3211= FindUtil105.jieQiDapan38(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3212= FindUtil105.jieQiDapan39(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3213= FindUtil105.jieQiDapan40(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3214= FindUtil105.jieQiDapan41(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3215= FindUtil105.jieQiDapan42(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3216= FindUtil105.jieQiDapan43(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3217= FindUtil105.jieQiDapan44(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3218= FindUtil105.jieQiDapan45(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3219= FindUtil105.jieQiDapan46(stockDayAllListDaPan1,scienceEntityListDaPan);


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
//
//                if (flag230){
//                    updateYanPan("230",yanPanVo);
//                }
//                if (flag231){
//                    updateYanPan("231",yanPanVo);
//                }
//                if (flag232){
//                    updateYanPan("232",yanPanVo);
//                }
//                if (flag233){
//                    updateYanPan("233",yanPanVo);
//                }
//                if (flag234){
//                    updateYanPan("234",yanPanVo);
//                }
//                if (flag235){
//                    updateYanPan("235",yanPanVo);
//                }
//                if (flag236){
//                    updateYanPan("236",yanPanVo);
//                }
//                if (flag237){
//                    updateYanPan("237",yanPanVo);
//                }
//                if (flag238){
//                    updateYanPan("238",yanPanVo);
//                }
//                if (flag239){
//                    updateYanPan("239",yanPanVo);
//                }
//                if (flag240){
//                    updateYanPan("240",yanPanVo);
//                }
//                if (flag241){
//                    updateYanPan("241",yanPanVo);
//                }
//                if (flag242){
//                    updateYanPan("242",yanPanVo);
//                }
//                if (flag243){
//                    updateYanPan("243",yanPanVo);
//                }
//                if (flag244){
//                    updateYanPan("244",yanPanVo);
//                }
//                if (flag245){
//                    updateYanPan("245",yanPanVo);
//                }
//                if (flag246){
//                    updateYanPan("246",yanPanVo);
//                }
//                if (flag247){
//                    updateYanPan("247",yanPanVo);
//                }
//                if (flag248){
//                    updateYanPan("248",yanPanVo);
//                }
//                if (flag249){
//                    updateYanPan("249",yanPanVo);
//                }
//                if (flag250){
//                    updateYanPan("250",yanPanVo);
//                }
//                if (flag251){
//                    updateYanPan("251",yanPanVo);
//                }
//                if (flag252){
//                    updateYanPan("252",yanPanVo);
//                }
//                if (flag253){
//                    updateYanPan("253",yanPanVo);
//                }
//                if (flag254){
//                    updateYanPan("254",yanPanVo);
//                }
//                if (flag255){
//                    updateYanPan("255",yanPanVo);
//                }
//
//                if (flag256){
//                    updateYanPan("256",yanPanVo);
//                }
//                if (flag257){
//                    updateYanPan("257",yanPanVo);
//                }
//                if (flag258){
//                    updateYanPan("258",yanPanVo);
//                }
//                if (flag259){
//                    updateYanPan("259",yanPanVo);
//                }
//                if (flag260){
//                    updateYanPan("260",yanPanVo);
//                }
//                if (flag261){
//                    updateYanPan("261",yanPanVo);
//                }
//                if (flag262){
//                    updateYanPan("262",yanPanVo);
//                }
//                if (flag263){
//                    updateYanPan("263",yanPanVo);
//                }
//                if (flag264){
//                    updateYanPan("264",yanPanVo);
//                }
//                if (flag265){
//                    updateYanPan("265",yanPanVo);
//                }
//                if (flag266){
//                    updateYanPan("266",yanPanVo);
//                }
//                if (flag267){
//                    updateYanPan("267",yanPanVo);
//                }
//                if (flag268){
//                    updateYanPan("268",yanPanVo);
//                }
//
//                if (flag269){
//                    updateYanPan("269",yanPanVo);
//                }
//                if (flag270){
//                    updateYanPan("270",yanPanVo);
//                }
//                if (flag271){
//                    updateYanPan("271",yanPanVo);
//                }
//                if (flag272){
//                    updateYanPan("272",yanPanVo);
//                }
//                if (flag273){
//                    updateYanPan("273",yanPanVo);
//                }
//                if (flag274){
//                    updateYanPan("274",yanPanVo);
//                }
//                if (flag275){
//                    updateYanPan("275",yanPanVo);
//                }
//                if (flag276){
//                    updateYanPan("276",yanPanVo);
//                }
//                if (flag277){
//                    updateYanPan("277",yanPanVo);
//                }
//                if (flag278){
//                    updateYanPan("278",yanPanVo);
//                }
//                if (flag279){
//                    updateYanPan("279",yanPanVo);
//                }
//                if (flag280){
//                    updateYanPan("280",yanPanVo);
//                }
//                if (flag281){
//                    updateYanPan("281",yanPanVo);
//                }
//
//                if (flag282){
//                    updateYanPan("282",yanPanVo);
//                }
//                if (flag283){
//                    updateYanPan("283",yanPanVo);
//                }
//                if (flag284){
//                    updateYanPan("284",yanPanVo);
//                }
//                if (flag285){
//                    updateYanPan("285",yanPanVo);
//                }
//                if (flag286){
//                    updateYanPan("286",yanPanVo);
//                }
//                if (flag287){
//                    updateYanPan("287",yanPanVo);
//                }
//                if (flag288){
//                    updateYanPan("288",yanPanVo);
//                }
//                if (flag289){
//                    updateYanPan("289",yanPanVo);
//                }
//                if (flag290){
//                    updateYanPan("290",yanPanVo);
//                }
//                if (flag291){
//                    updateYanPan("291",yanPanVo);
//                }
//                if (flag292){
//                    updateYanPan("292",yanPanVo);
//                }
//                if (flag293){
//                    updateYanPan("293",yanPanVo);
//                }
//                if (flag294){
//                    updateYanPan("294",yanPanVo);
//                }
//
//                if (flag295){
//                    updateYanPan("295",yanPanVo);
//                }
//                if (flag296){
//                    updateYanPan("296",yanPanVo);
//                }
//                if (flag297){
//                    updateYanPan("297",yanPanVo);
//                }
//                if (flag298){
//                    updateYanPan("298",yanPanVo);
//                }
//                if (flag299){
//                    updateYanPan("299",yanPanVo);
//                }
//                if (flag300){
//                    updateYanPan("300",yanPanVo);
//                }
//                if (flag301){
//                    updateYanPan("301",yanPanVo);
//                }
//                if (flag302){
//                    updateYanPan("302",yanPanVo);
//                }
//                if (flag303){
//                    updateYanPan("303",yanPanVo);
//                }
//                if (flag304){
//                    updateYanPan("304",yanPanVo);
//                }
//                if (flag305){
//                    updateYanPan("305",yanPanVo);
//                }
//                if (flag306){
//                    updateYanPan("306",yanPanVo);
//                }
//                if (flag307){
//                    updateYanPan("307",yanPanVo);
//                }
//
//                if (flag308){
//                    updateYanPan("308",yanPanVo);
//                }
//                if (flag309){
//                    updateYanPan("309",yanPanVo);
//                }
//                if (flag311){
//                    updateYanPan("311",yanPanVo);
//                }
//                if (flag312){
//                    updateYanPan("312",yanPanVo);
//                }
//                if (flag313){
//                    updateYanPan("313",yanPanVo);
//                }
//                if (flag314){
//                    updateYanPan("314",yanPanVo);
//                }
//                if (flag315){
//                    updateYanPan("315",yanPanVo);
//                }
//                if (flag316){
//                    updateYanPan("316",yanPanVo);
//                }
//                if (flag317){
//                    updateYanPan("317",yanPanVo);
//                }
//                if (flag318){
//                    updateYanPan("318",yanPanVo);
//                }
//                if (flag319){
//                    updateYanPan("319",yanPanVo);
//                }
//                if (flag320){
//                    updateYanPan("320",yanPanVo);
//                }
//                if (flag321){
//                    updateYanPan("321",yanPanVo);
//                }
//
//                if (flag322){
//                    updateYanPan("322",yanPanVo);
//                }
//                if (flag323){
//                    updateYanPan("323",yanPanVo);
//                }
//                if (flag324){
//                    updateYanPan("324",yanPanVo);
//                }
//                if (flag325){
//                    updateYanPan("325",yanPanVo);
//                }
//                if (flag326){
//                    updateYanPan("326",yanPanVo);
//                }
//                if (flag327){
//                    updateYanPan("327",yanPanVo);
//                }
//                if (flag328){
//                    updateYanPan("328",yanPanVo);
//                }
//                if (flag329){
//                    updateYanPan("329",yanPanVo);
//                }
//                if (flag330){
//                    updateYanPan("330",yanPanVo);
//                }
//                if (flag331){
//                    updateYanPan("331",yanPanVo);
//                }
//                if (flag332){
//                    updateYanPan("332",yanPanVo);
//                }
//                if (flag333){
//                    updateYanPan("333",yanPanVo);
//                }
//                if (flag334){
//                    updateYanPan("334",yanPanVo);
//                }
//                if (flag335){
//                    updateYanPan("335",yanPanVo);
//                }
//                if (flag336){
//                    updateYanPan("336",yanPanVo);
//                }
//                if (flag337){
//                    updateYanPan("337",yanPanVo);
//                }
//                if (flag338){
//                    updateYanPan("338",yanPanVo);
//                }
//                if (flag339){
//                    updateYanPan("339",yanPanVo);
//                }
//                if (flag340){
//                    updateYanPan("340",yanPanVo);
//                }
//                if (flag341){
//                    updateYanPan("341",yanPanVo);
//                }
//                if (flag342){
//                    updateYanPan("342",yanPanVo);
//                }
//                if (flag343){
//                    updateYanPan("343",yanPanVo);
//                }
//                if (flag344){
//                    updateYanPan("344",yanPanVo);
//                }
//                if (flag345){
//                    updateYanPan("345",yanPanVo);
//                }
//                if (flag346){
//                    updateYanPan("346",yanPanVo);
//                }
//                if (flag347){
//                    updateYanPan("347",yanPanVo);
//                }
//                if (flag348){
//                    updateYanPan("348",yanPanVo);
//                }
//                if (flag349){
//                    updateYanPan("349",yanPanVo);
//                }
//                if (flag350){
//                    updateYanPan("350",yanPanVo);
//                }
//                if (flag351){
//                    updateYanPan("351",yanPanVo);
//                }
//                if (flag352){
//                    updateYanPan("352",yanPanVo);
//                }
//                if (flag353){
//                    updateYanPan("353",yanPanVo);
//                }
//                if (flag354){
//                    updateYanPan("354",yanPanVo);
//                }
//                if (flag355){
//                    updateYanPan("355",yanPanVo);
//                }
//
//                if (flag356){
//                    updateYanPan("356",yanPanVo);
//                }
//                if (flag357){
//                    updateYanPan("357",yanPanVo);
//                }
//                if (flag358){
//                    updateYanPan("358",yanPanVo);
//                }
//                if (flag359){
//                    updateYanPan("359",yanPanVo);
//                }
//                if (flag360){
//                    updateYanPan("360",yanPanVo);
//                }
//                if (flag361){
//                    updateYanPan("361",yanPanVo);
//                }
//                if (flag362){
//                    updateYanPan("362",yanPanVo);
//                }
//                if (flag363){
//                    updateYanPan("363",yanPanVo);
//                }
//                if (flag364){
//                    updateYanPan("364",yanPanVo);
//                }
//                if (flag365){
//                    updateYanPan("365",yanPanVo);
//                }
//                if (flag366){
//                    updateYanPan("366",yanPanVo);
//                }
//                if (flag367){
//                    updateYanPan("367",yanPanVo);
//                }
//                if (flag368){
//                    updateYanPan("368",yanPanVo);
//                }
//
//                if (flag369){
//                    updateYanPan("369",yanPanVo);
//                }
//                if (flag370){
//                    updateYanPan("370",yanPanVo);
//                }
//                if (flag371){
//                    updateYanPan("371",yanPanVo);
//                }
//                if (flag372){
//                    updateYanPan("372",yanPanVo);
//                }
//                if (flag373){
//                    updateYanPan("373",yanPanVo);
//                }
//                if (flag374){
//                    updateYanPan("374",yanPanVo);
//                }
//                if (flag375){
//                    updateYanPan("375",yanPanVo);
//                }
//                if (flag376){
//                    updateYanPan("376",yanPanVo);
//                }
//                if (flag377){
//                    updateYanPan("377",yanPanVo);
//                }
//                if (flag378){
//                    updateYanPan("378",yanPanVo);
//                }
//                if (flag379){
//                    updateYanPan("379",yanPanVo);
//                }
//                if (flag380){
//                    updateYanPan("380",yanPanVo);
//                }
//                if (flag381){
//                    updateYanPan("381",yanPanVo);
//                }
//
//                if (flag382){
//                    updateYanPan("382",yanPanVo);
//                }
//                if (flag383){
//                    updateYanPan("383",yanPanVo);
//                }
//                if (flag384){
//                    updateYanPan("384",yanPanVo);
//                }
//                if (flag385){
//                    updateYanPan("385",yanPanVo);
//                }
//                if (flag386){
//                    updateYanPan("386",yanPanVo);
//                }
//                if (flag387){
//                    updateYanPan("387",yanPanVo);
//                }
//                if (flag388){
//                    updateYanPan("388",yanPanVo);
//                }
//                if (flag389){
//                    updateYanPan("389",yanPanVo);
//                }
//                if (flag390){
//                    updateYanPan("390",yanPanVo);
//                }
//                if (flag391){
//                    updateYanPan("391",yanPanVo);
//                }
//                if (flag392){
//                    updateYanPan("392",yanPanVo);
//                }
//                if (flag393){
//                    updateYanPan("393",yanPanVo);
//                }
//                if (flag394){
//                    updateYanPan("394",yanPanVo);
//                }
//
//                if (flag395){
//                    updateYanPan("395",yanPanVo);
//                }
//                if (flag396){
//                    updateYanPan("396",yanPanVo);
//                }
//                if (flag397){
//                    updateYanPan("397",yanPanVo);
//                }
//                if (flag398){
//                    updateYanPan("398",yanPanVo);
//                }
//                if (flag399){
//                    updateYanPan("399",yanPanVo);
//                }
//                if (flag400){
//                    updateYanPan("400",yanPanVo);
//                }
//                if (flag401){
//                    updateYanPan("401",yanPanVo);
//                }
//                if (flag402){
//                    updateYanPan("402",yanPanVo);
//                }
//                if (flag403){
//                    updateYanPan("403",yanPanVo);
//                }
//                if (flag404){
//                    updateYanPan("404",yanPanVo);
//                }
//                if (flag405){
//                    updateYanPan("405",yanPanVo);
//                }
//                if (flag406){
//                    updateYanPan("406",yanPanVo);
//                }
//                if (flag407){
//                    updateYanPan("407",yanPanVo);
//                }
//                if (flag408){
//                    updateYanPan("408",yanPanVo);
//                }
//                if (flag409){
//                    updateYanPan("409",yanPanVo);
//                }
//                if (flag410){
//                    updateYanPan("410",yanPanVo);
//                }
//                if (flag411){
//                    updateYanPan("411",yanPanVo);
//                }
//                if (flag412){
//                    updateYanPan("412",yanPanVo);
//                }

//                if (flag2380){
//                    updateYanPan("2380",yanPanVo);
//                }
//                if (flag2381){
//                    updateYanPan("2381",yanPanVo);
//                }
//                if (flag2382){
//                    updateYanPan("2382",yanPanVo);
//                }
//                if (flag2383){
//                    updateYanPan("2383",yanPanVo);
//                }
//                if (flag2384){
//                    updateYanPan("2384",yanPanVo);
//                }
//                if (flag2385){
//                    updateYanPan("2385",yanPanVo);
//                }
//
//                if (flag2386){
//                    updateYanPan("2386",yanPanVo);
//                }
//                if (flag2387){
//                    updateYanPan("2387",yanPanVo);
//                }
//                if (flag2388){
//                    updateYanPan("2388",yanPanVo);
//                }
//                if (flag2389){
//                    updateYanPan("2389",yanPanVo);
//                }
//                if (flag2390){
//                    updateYanPan("2390",yanPanVo);
//                }
//                if (flag2391){
//                    updateYanPan("2391",yanPanVo);
//                }
//                if (flag2392){
//                    updateYanPan("2392",yanPanVo);
//                }
//                if (flag2393){
//                    updateYanPan("2393",yanPanVo);
//                }
//                if (flag2394){
//                    updateYanPan("2394",yanPanVo);
//                }
//                if (flag2395){
//                    updateYanPan("2395",yanPanVo);
//                }
//                if (flag2396){
//                    updateYanPan("2396",yanPanVo);
//                }
//                if (flag2397){
//                    updateYanPan("2397",yanPanVo);
//                }
//                if (flag2398){
//                    updateYanPan("2398",yanPanVo);
//                }
//
//                if (flag2399){
//                    updateYanPan("2399",yanPanVo);
//                }
//                if (flag2400){
//                    updateYanPan("2400",yanPanVo);
//                }
//                if (flag2401){
//                    updateYanPan("2401",yanPanVo);
//                }
//                if (flag2402){
//                    updateYanPan("2402",yanPanVo);
//                }
//                if (flag2403){
//                    updateYanPan("2403",yanPanVo);
//                }
//                if (flag2404){
//                    updateYanPan("2404",yanPanVo);
//                }
//                if (flag2405){
//                    updateYanPan("2405",yanPanVo);
//                }
//                if (flag2406){
//                    updateYanPan("2406",yanPanVo);
//                }
//                if (flag2407){
//                    updateYanPan("2407",yanPanVo);
//                }
//                if (flag2408){
//                    updateYanPan("2408",yanPanVo);
//                }
//                if (flag2409){
//                    updateYanPan("2409",yanPanVo);
//                }
//                if (flag2410){
//                    updateYanPan("2410",yanPanVo);
//                }
//                if (flag2411){
//                    updateYanPan("2411",yanPanVo);
//                }
//
//                if (flag2412){
//                    updateYanPan("2412",yanPanVo);
//                }
//                if (flag2413){
//                    updateYanPan("2413",yanPanVo);
//                }
//                if (flag2414){
//                    updateYanPan("2414",yanPanVo);
//                }
//                if (flag2415){
//                    updateYanPan("2415",yanPanVo);
//                }
//                if (flag2416){
//                    updateYanPan("2416",yanPanVo);
//                }
//                if (flag2417){
//                    updateYanPan("2417",yanPanVo);
//                }
//                if (flag2418){
//                    updateYanPan("2418",yanPanVo);
//                }
//                if (flag2419){
//                    updateYanPan("2419",yanPanVo);
//                }
//                if (flag2420){
//                    updateYanPan("2420",yanPanVo);
//                }
//                if (flag2421){
//                    updateYanPan("2421",yanPanVo);
//                }
//                if (flag2422){
//                    updateYanPan("2422",yanPanVo);
//                }
//                if (flag2423){
//                    updateYanPan("2423",yanPanVo);
//                }
//                if (flag2424){
//                    updateYanPan("2424",yanPanVo);
//                }
//
//                if (flag2425){
//                    updateYanPan("2425",yanPanVo);
//                }
//                if (flag2426){
//                    updateYanPan("2426",yanPanVo);
//                }
//                if (flag2427){
//                    updateYanPan("2427",yanPanVo);
//                }
//                if (flag2428){
//                    updateYanPan("2428",yanPanVo);
//                }
//                if (flag2429){
//                    updateYanPan("2429",yanPanVo);
//                }
//                if (flag2430){
//                    updateYanPan("2430",yanPanVo);
//                }
//                if (flag2431){
//                    updateYanPan("2431",yanPanVo);
//                }
//                if (flag2432){
//                    updateYanPan("2432",yanPanVo);
//                }
//                if (flag2433){
//                    updateYanPan("2433",yanPanVo);
//                }
//                if (flag2434){
//                    updateYanPan("2434",yanPanVo);
//                }
//                if (flag2435){
//                    updateYanPan("2435",yanPanVo);
//                }
//                if (flag2436){
//                    updateYanPan("2436",yanPanVo);
//                }
//                if (flag2437){
//                    updateYanPan("2437",yanPanVo);
//                }
//                if (flag2438){
//                    updateYanPan("2438",yanPanVo);
//                }
//                if (flag2439){
//                    updateYanPan("2439",yanPanVo);
//                }
//                if (flag2440){
//                    updateYanPan("2440",yanPanVo);
//                }
//                if (flag2441){
//                    updateYanPan("2441",yanPanVo);
//                }
//                if (flag2442){
//                    updateYanPan("2442",yanPanVo);
//                }
//                if (flag2443){
//                    updateYanPan("2443",yanPanVo);
//                }
//                if (flag2444){
//                    updateYanPan("2444",yanPanVo);
//                }
//                if (flag2445){
//                    updateYanPan("2445",yanPanVo);
//                }
//                if (flag2446){
//                    updateYanPan("2446",yanPanVo);
//                }
//                if (flag2447){
//                    updateYanPan("2447",yanPanVo);
//                }
//                if (flag2448){
//                    updateYanPan("2448",yanPanVo);
//                }
//                if (flag2449){
//                    updateYanPan("2449",yanPanVo);
//                }
//                if (flag2450){
//                    updateYanPan("2450",yanPanVo);
//                }
//                if (flag2451){
//                    updateYanPan("2451",yanPanVo);
//                }
//                if (flag2452){
//                    updateYanPan("2452",yanPanVo);
//                }
//                if (flag2453){
//                    updateYanPan("2453",yanPanVo);
//                }
//                if (flag2454){
//                    updateYanPan("2454",yanPanVo);
//                }
//                if (flag2455){
//                    updateYanPan("2455",yanPanVo);
//                }
//
//                if (flag2456){
//                    updateYanPan("2456",yanPanVo);
//                }
//                if (flag2457){
//                    updateYanPan("2457",yanPanVo);
//                }
//                if (flag2458){
//                    updateYanPan("2458",yanPanVo);
//                }
//                if (flag2459){
//                    updateYanPan("2459",yanPanVo);
//                }
//                if (flag2460){
//                    updateYanPan("2460",yanPanVo);
//                }
//                if (flag2461){
//                    updateYanPan("2461",yanPanVo);
//                }
//                if (flag2462){
//                    updateYanPan("2462",yanPanVo);
//                }
//                if (flag2463){
//                    updateYanPan("2463",yanPanVo);
//                }
//                if (flag2464){
//                    updateYanPan("2464",yanPanVo);
//                }
//                if (flag2465){
//                    updateYanPan("2465",yanPanVo);
//                }
//                if (flag2466){
//                    updateYanPan("2466",yanPanVo);
//                }
//                if (flag2467){
//                    updateYanPan("2467",yanPanVo);
//                }
//                if (flag2468){
//                    updateYanPan("2468",yanPanVo);
//                }
//
//                if (flag2469){
//                    updateYanPan("2469",yanPanVo);
//                }
//                if (flag2470){
//                    updateYanPan("2470",yanPanVo);
//                }
//                if (flag2471){
//                    updateYanPan("2471",yanPanVo);
//                }
//                if (flag2472){
//                    updateYanPan("2472",yanPanVo);
//                }
//                if (flag2473){
//                    updateYanPan("2473",yanPanVo);
//                }
//                if (flag2474){
//                    updateYanPan("2474",yanPanVo);
//                }
//                if (flag2475){
//                    updateYanPan("2475",yanPanVo);
//                }
//                if (flag2476){
//                    updateYanPan("2476",yanPanVo);
//                }
//                if (flag2477){
//                    updateYanPan("2477",yanPanVo);
//                }
//                if (flag2478){
//                    updateYanPan("2478",yanPanVo);
//                }
//                if (flag2479){
//                    updateYanPan("2479",yanPanVo);
//                }
//                if (flag2480){
//                    updateYanPan("2480",yanPanVo);
//                }
//                if (flag2481){
//                    updateYanPan("2481",yanPanVo);
//                }
//
//                if (flag2482){
//                    updateYanPan("2482",yanPanVo);
//                }
//                if (flag2483){
//                    updateYanPan("2483",yanPanVo);
//                }
//                if (flag2484){
//                    updateYanPan("2484",yanPanVo);
//                }
//                if (flag2485){
//                    updateYanPan("2485",yanPanVo);
//                }
//                if (flag2486){
//                    updateYanPan("2486",yanPanVo);
//                }
//                if (flag2487){
//                    updateYanPan("2487",yanPanVo);
//                }
//                if (flag2488){
//                    updateYanPan("2488",yanPanVo);
//                }
//                if (flag2489){
//                    updateYanPan("2489",yanPanVo);
//                }
//                if (flag2490){
//                    updateYanPan("2490",yanPanVo);
//                }
//                if (flag2491){
//                    updateYanPan("2491",yanPanVo);
//                }
//                if (flag2492){
//                    updateYanPan("2492",yanPanVo);
//                }
//                if (flag2493){
//                    updateYanPan("2493",yanPanVo);
//                }
//                if (flag2494){
//                    updateYanPan("2494",yanPanVo);
//                }
//
//                if (flag2495){
//                    updateYanPan("2495",yanPanVo);
//                }
//                if (flag2496){
//                    updateYanPan("2496",yanPanVo);
//                }
//                if (flag2497){
//                    updateYanPan("2497",yanPanVo);
//                }
//                if (flag2498){
//                    updateYanPan("2498",yanPanVo);
//                }
//                if (flag2499){
//                    updateYanPan("2499",yanPanVo);
//                }

//                if (flag2500){
//                    updateYanPan("2500",yanPanVo);
//                }
//                if (flag2501){
//                    updateYanPan("2501",yanPanVo);
//                }
//                if (flag2502){
//                    updateYanPan("2502",yanPanVo);
//                }
//                if (flag2503){
//                    updateYanPan("2503",yanPanVo);
//                }
//                if (flag2504){
//                    updateYanPan("2504",yanPanVo);
//                }
//                if (flag2505){
//                    updateYanPan("2505",yanPanVo);
//                }
//                if (flag2506){
//                    updateYanPan("2506",yanPanVo);
//                }
//                if (flag2507){
//                    updateYanPan("2507",yanPanVo);
//                }
//                if (flag2508){
//                    updateYanPan("2508",yanPanVo);
//                }
//                if (flag2509){
//                    updateYanPan("2509",yanPanVo);
//                }
//                if (flag2510){
//                    updateYanPan("2510",yanPanVo);
//                }
//                if (flag2511){
//                    updateYanPan("2511",yanPanVo);
//                }
//
//                if (flag2512){
//                    updateYanPan("2512",yanPanVo);
//                }
//                if (flag2513){
//                    updateYanPan("2513",yanPanVo);
//                }
//                if (flag2514){
//                    updateYanPan("2514",yanPanVo);
//                }
//                if (flag2515){
//                    updateYanPan("2515",yanPanVo);
//                }
//                if (flag2516){
//                    updateYanPan("2516",yanPanVo);
//                }
//                if (flag2517){
//                    updateYanPan("2517",yanPanVo);
//                }
//                if (flag2518){
//                    updateYanPan("2518",yanPanVo);
//                }
//                if (flag2519){
//                    updateYanPan("2519",yanPanVo);
//                }
//                if (flag2520){
//                    updateYanPan("2520",yanPanVo);
//                }
//                if (flag2521){
//                    updateYanPan("2521",yanPanVo);
//                }
//                if (flag2522){
//                    updateYanPan("2522",yanPanVo);
//                }
//                if (flag2523){
//                    updateYanPan("2523",yanPanVo);
//                }
//                if (flag2524){
//                    updateYanPan("2524",yanPanVo);
//                }
//
//                if (flag2525){
//                    updateYanPan("2525",yanPanVo);
//                }
//                if (flag2526){
//                    updateYanPan("2526",yanPanVo);
//                }
//                if (flag2527){
//                    updateYanPan("2527",yanPanVo);
//                }
//                if (flag2528){
//                    updateYanPan("2528",yanPanVo);
//                }
//                if (flag2529){
//                    updateYanPan("2529",yanPanVo);
//                }
//                if (flag2530){
//                    updateYanPan("2530",yanPanVo);
//                }
//                if (flag2531){
//                    updateYanPan("2531",yanPanVo);
//                }
//                if (flag2532){
//                    updateYanPan("2532",yanPanVo);
//                }
//                if (flag2533){
//                    updateYanPan("2533",yanPanVo);
//                }
//                if (flag2534){
//                    updateYanPan("2534",yanPanVo);
//                }
//                if (flag2535){
//                    updateYanPan("2535",yanPanVo);
//                }
//                if (flag2536){
//                    updateYanPan("2536",yanPanVo);
//                }
//                if (flag2537){
//                    updateYanPan("2537",yanPanVo);
//                }
//                if (flag2538){
//                    updateYanPan("2538",yanPanVo);
//                }
//                if (flag2539){
//                    updateYanPan("2539",yanPanVo);
//                }
//                if (flag2540){
//                    updateYanPan("2540",yanPanVo);
//                }
//                if (flag2541){
//                    updateYanPan("2541",yanPanVo);
//                }
//                if (flag2542){
//                    updateYanPan("2542",yanPanVo);
//                }
//                if (flag2543){
//                    updateYanPan("2543",yanPanVo);
//                }
//                if (flag2544){
//                    updateYanPan("2544",yanPanVo);
//                }
//                if (flag2545){
//                    updateYanPan("2545",yanPanVo);
//                }
//                if (flag2546){
//                    updateYanPan("2546",yanPanVo);
//                }
//                if (flag2547){
//                    updateYanPan("2547",yanPanVo);
//                }
//                if (flag2548){
//                    updateYanPan("2548",yanPanVo);
//                }
//                if (flag2549){
//                    updateYanPan("2549",yanPanVo);
//                }
//                if (flag2550){
//                    updateYanPan("2550",yanPanVo);
//                }
//                if (flag2551){
//                    updateYanPan("2551",yanPanVo);
//                }
//                if (flag2552){
//                    updateYanPan("2552",yanPanVo);
//                }
//                if (flag2553){
//                    updateYanPan("2553",yanPanVo);
//                }
//                if (flag2554){
//                    updateYanPan("2554",yanPanVo);
//                }
//                if (flag2555){
//                    updateYanPan("2555",yanPanVo);
//                }
//
//                if (flag2556){
//                    updateYanPan("2556",yanPanVo);
//                }
//                if (flag2557){
//                    updateYanPan("2557",yanPanVo);
//                }
//                if (flag2558){
//                    updateYanPan("2558",yanPanVo);
//                }
//                if (flag2559){
//                    updateYanPan("2559",yanPanVo);
//                }
//                if (flag2560){
//                    updateYanPan("2560",yanPanVo);
//                }
//                if (flag2561){
//                    updateYanPan("2561",yanPanVo);
//                }
//                if (flag2562){
//                    updateYanPan("2562",yanPanVo);
//                }
//                if (flag2563){
//                    updateYanPan("2563",yanPanVo);
//                }
//                if (flag2564){
//                    updateYanPan("2564",yanPanVo);
//                }
//                if (flag2565){
//                    updateYanPan("2565",yanPanVo);
//                }
//                if (flag2566){
//                    updateYanPan("2566",yanPanVo);
//                }
//                if (flag2567){
//                    updateYanPan("2567",yanPanVo);
//                }
//                if (flag2568){
//                    updateYanPan("2568",yanPanVo);
//                }
//
//                if (flag2569){
//                    updateYanPan("2569",yanPanVo);
//                }
//                if (flag2570){
//                    updateYanPan("2570",yanPanVo);
//                }
//                if (flag2571){
//                    updateYanPan("2571",yanPanVo);
//                }
//                if (flag2572){
//                    updateYanPan("2572",yanPanVo);
//                }
//                if (flag2573){
//                    updateYanPan("2573",yanPanVo);
//                }
//                if (flag2574){
//                    updateYanPan("2574",yanPanVo);
//                }
//                if (flag2575){
//                    updateYanPan("2575",yanPanVo);
//                }
//                if (flag2576){
//                    updateYanPan("2576",yanPanVo);
//                }
//                if (flag2577){
//                    updateYanPan("2577",yanPanVo);
//                }
//                if (flag2578){
//                    updateYanPan("2578",yanPanVo);
//                }
//                if (flag2579){
//                    updateYanPan("2579",yanPanVo);
//                }
//                if (flag2580){
//                    updateYanPan("2580",yanPanVo);
//                }
//                if (flag2581){
//                    updateYanPan("2581",yanPanVo);
//                }
//
//                if (flag2582){
//                    updateYanPan("2582",yanPanVo);
//                }
//                if (flag2583){
//                    updateYanPan("2583",yanPanVo);
//                }
//                if (flag2584){
//                    updateYanPan("2584",yanPanVo);
//                }
//                if (flag2585){
//                    updateYanPan("2585",yanPanVo);
//                }
//                if (flag2586){
//                    updateYanPan("2586",yanPanVo);
//                }
//                if (flag2587){
//                    updateYanPan("2587",yanPanVo);
//                }
//                if (flag2588){
//                    updateYanPan("2588",yanPanVo);
//                }
//                if (flag2589){
//                    updateYanPan("2589",yanPanVo);
//                }
//                if (flag2590){
//                    updateYanPan("2590",yanPanVo);
//                }
//                if (flag2591){
//                    updateYanPan("2591",yanPanVo);
//                }
//                if (flag2592){
//                    updateYanPan("2592",yanPanVo);
//                }
//                if (flag2593){
//                    updateYanPan("2593",yanPanVo);
//                }
//                if (flag2594){
//                    updateYanPan("2594",yanPanVo);
//                }
//
//                if (flag2595){
//                    updateYanPan("2595",yanPanVo);
//                }
//                if (flag2596){
//                    updateYanPan("2596",yanPanVo);
//                }
//                if (flag2597){
//                    updateYanPan("2597",yanPanVo);
//                }
//                if (flag2598){
//                    updateYanPan("2598",yanPanVo);
//                }
//                if (flag2599){
//                    updateYanPan("2599",yanPanVo);
//                }
//                if (flag2600){
//                    updateYanPan("2600",yanPanVo);
//                }
//                if (flag2601){
//                    updateYanPan("2601",yanPanVo);
//                }
//                if (flag2602){
//                    updateYanPan("2602",yanPanVo);
//                }
//                if (flag2603){
//                    updateYanPan("2603",yanPanVo);
//                }
//                if (flag2604){
//                    updateYanPan("2604",yanPanVo);
//                }
//                if (flag2605){
//                    updateYanPan("2605",yanPanVo);
//                }
//                if (flag2606){
//                    updateYanPan("2606",yanPanVo);
//                }
//                if (flag2607){
//                    updateYanPan("2607",yanPanVo);
//                }
//                if (flag2608){
//                    updateYanPan("2608",yanPanVo);
//                }
//                if (flag2609){
//                    updateYanPan("2609",yanPanVo);
//                }
//                if (flag2610){
//                    updateYanPan("2610",yanPanVo);
//                }
//                if (flag2611){
//                    updateYanPan("2611",yanPanVo);
//                }
//
//                if (flag2612){
//                    updateYanPan("2612",yanPanVo);
//                }
//                if (flag2613){
//                    updateYanPan("2613",yanPanVo);
//                }
//                if (flag2614){
//                    updateYanPan("2614",yanPanVo);
//                }
//                if (flag2615){
//                    updateYanPan("2615",yanPanVo);
//                }
//                if (flag2616){
//                    updateYanPan("2616",yanPanVo);
//                }
//                if (flag2617){
//                    updateYanPan("2617",yanPanVo);
//                }
//                if (flag2618){
//                    updateYanPan("2618",yanPanVo);
//                }
//                if (flag2619){
//                    updateYanPan("2619",yanPanVo);
//                }
//                if (flag2620){
//                    updateYanPan("2620",yanPanVo);
//                }
//                if (flag2621){
//                    updateYanPan("2621",yanPanVo);
//                }
//                if (flag2622){
//                    updateYanPan("2622",yanPanVo);
//                }
//                if (flag2623){
//                    updateYanPan("2623",yanPanVo);
//                }
//                if (flag2624){
//                    updateYanPan("2624",yanPanVo);
//                }
//
//                if (flag2625){
//                    updateYanPan("2625",yanPanVo);
//                }
//                if (flag2626){
//                    updateYanPan("2626",yanPanVo);
//                }
//                if (flag2627){
//                    updateYanPan("2627",yanPanVo);
//                }
//                if (flag2628){
//                    updateYanPan("2628",yanPanVo);
//                }
//                if (flag2629){
//                    updateYanPan("2629",yanPanVo);
//                }
//                if (flag2630){
//                    updateYanPan("2630",yanPanVo);
//                }
//                if (flag2631){
//                    updateYanPan("2631",yanPanVo);
//                }
//                if (flag2632){
//                    updateYanPan("2632",yanPanVo);
//                }
//                if (flag2633){
//                    updateYanPan("2633",yanPanVo);
//                }
//                if (flag2634){
//                    updateYanPan("2634",yanPanVo);
//                }
//                if (flag2635){
//                    updateYanPan("2635",yanPanVo);
//                }
//                if (flag2636){
//                    updateYanPan("2636",yanPanVo);
//                }
//                if (flag2637){
//                    updateYanPan("2637",yanPanVo);
//                }
//                if (flag2638){
//                    updateYanPan("2638",yanPanVo);
//                }
//                if (flag2639){
//                    updateYanPan("2639",yanPanVo);
//                }
//                if (flag2640){
//                    updateYanPan("2640",yanPanVo);
//                }
//                if (flag2641){
//                    updateYanPan("2641",yanPanVo);
//                }
//                if (flag2642){
//                    updateYanPan("2642",yanPanVo);
//                }
//                if (flag2643){
//                    updateYanPan("2643",yanPanVo);
//                }
//                if (flag2644){
//                    updateYanPan("2644",yanPanVo);
//                }
//                if (flag2645){
//                    updateYanPan("2645",yanPanVo);
//                }
//                if (flag2646){
//                    updateYanPan("2646",yanPanVo);
//                }
//                if (flag2647){
//                    updateYanPan("2647",yanPanVo);
//                }
//                if (flag2648){
//                    updateYanPan("2648",yanPanVo);
//                }
//                if (flag2649){
//                    updateYanPan("2649",yanPanVo);
//                }
//                if (flag2650){
//                    updateYanPan("2650",yanPanVo);
//                }
//                if (flag2651){
//                    updateYanPan("2651",yanPanVo);
//                }
//                if (flag2652){
//                    updateYanPan("2652",yanPanVo);
//                }
//                if (flag2653){
//                    updateYanPan("2653",yanPanVo);
//                }
//                if (flag2654){
//                    updateYanPan("2654",yanPanVo);
//                }
//                if (flag2655){
//                    updateYanPan("2655",yanPanVo);
//                }
//
//                if (flag2656){
//                    updateYanPan("2656",yanPanVo);
//                }
//                if (flag2657){
//                    updateYanPan("2657",yanPanVo);
//                }
//                if (flag2658){
//                    updateYanPan("2658",yanPanVo);
//                }
//                if (flag2659){
//                    updateYanPan("2659",yanPanVo);
//                }
//                if (flag2660){
//                    updateYanPan("2660",yanPanVo);
//                }
//                if (flag2661){
//                    updateYanPan("2661",yanPanVo);
//                }
//                if (flag2662){
//                    updateYanPan("2662",yanPanVo);
//                }
//                if (flag2663){
//                    updateYanPan("2663",yanPanVo);
//                }
//                if (flag2664){
//                    updateYanPan("2664",yanPanVo);
//                }
//                if (flag2665){
//                    updateYanPan("2665",yanPanVo);
//                }
//                if (flag2666){
//                    updateYanPan("2666",yanPanVo);
//                }
//                if (flag2667){
//                    updateYanPan("2667",yanPanVo);
//                }
//                if (flag2668){
//                    updateYanPan("2668",yanPanVo);
//                }
//
//                if (flag2669){
//                    updateYanPan("2669",yanPanVo);
//                }
//                if (flag2670){
//                    updateYanPan("2670",yanPanVo);
//                }
//                if (flag2671){
//                    updateYanPan("2671",yanPanVo);
//                }
//                if (flag2672){
//                    updateYanPan("2672",yanPanVo);
//                }
//                if (flag2673){
//                    updateYanPan("2673",yanPanVo);
//                }
//                if (flag2674){
//                    updateYanPan("2674",yanPanVo);
//                }
//                if (flag2675){
//                    updateYanPan("2675",yanPanVo);
//                }
//                if (flag2676){
//                    updateYanPan("2676",yanPanVo);
//                }
//                if (flag2677){
//                    updateYanPan("2677",yanPanVo);
//                }
//                if (flag2678){
//                    updateYanPan("2678",yanPanVo);
//                }
//                if (flag2679){
//                    updateYanPan("2679",yanPanVo);
//                }
//                if (flag2680){
//                    updateYanPan("2680",yanPanVo);
//                }
//                if (flag2681){
//                    updateYanPan("2681",yanPanVo);
//                }
//
//                if (flag2682){
//                    updateYanPan("2682",yanPanVo);
//                }
//                if (flag2683){
//                    updateYanPan("2683",yanPanVo);
//                }
//                if (flag2684){
//                    updateYanPan("2684",yanPanVo);
//                }
//                if (flag2685){
//                    updateYanPan("2685",yanPanVo);
//                }
//                if (flag2686){
//                    updateYanPan("2686",yanPanVo);
//                }
//                if (flag2687){
//                    updateYanPan("2687",yanPanVo);
//                }
//                if (flag2688){
//                    updateYanPan("2688",yanPanVo);
//                }
//                if (flag2689){
//                    updateYanPan("2689",yanPanVo);
//                }
//                if (flag2690){
//                    updateYanPan("2690",yanPanVo);
//                }
//                if (flag2691){
//                    updateYanPan("2691",yanPanVo);
//                }
//                if (flag2692){
//                    updateYanPan("2692",yanPanVo);
//                }
//                if (flag2693){
//                    updateYanPan("2693",yanPanVo);
//                }
//                if (flag2694){
//                    updateYanPan("2694",yanPanVo);
//                }
//
//                if (flag2695){
//                    updateYanPan("2695",yanPanVo);
//                }
//                if (flag2696){
//                    updateYanPan("2696",yanPanVo);
//                }
//                if (flag2697){
//                    updateYanPan("2697",yanPanVo);
//                }
//                if (flag2698){
//                    updateYanPan("2698",yanPanVo);
//                }
//                if (flag2699){
//                    updateYanPan("2699",yanPanVo);
//                }
//                if (flag2700){
//                    updateYanPan("2700",yanPanVo);
//                }
//                if (flag2701){
//                    updateYanPan("2701",yanPanVo);
//                }
//                if (flag2702){
//                    updateYanPan("2702",yanPanVo);
//                }
//                if (flag2703){
//                    updateYanPan("2703",yanPanVo);
//                }
//                if (flag2704){
//                    updateYanPan("2704",yanPanVo);
//                }
//                if (flag2705){
//                    updateYanPan("2705",yanPanVo);
//                }
//                if (flag2706){
//                    updateYanPan("2706",yanPanVo);
//                }
//                if (flag2707){
//                    updateYanPan("2707",yanPanVo);
//                }
//                if (flag2708){
//                    updateYanPan("2708",yanPanVo);
//                }
//                if (flag2709){
//                    updateYanPan("2709",yanPanVo);
//                }
//                if (flag2710){
//                    updateYanPan("2710",yanPanVo);
//                }
//                if (flag2711){
//                    updateYanPan("2711",yanPanVo);
//                }
//
//                if (flag2712){
//                    updateYanPan("2712",yanPanVo);
//                }
//                if (flag2713){
//                    updateYanPan("2713",yanPanVo);
//                }
//                if (flag2714){
//                    updateYanPan("2714",yanPanVo);
//                }
//                if (flag2715){
//                    updateYanPan("2715",yanPanVo);
//                }
//                if (flag2716){
//                    updateYanPan("2716",yanPanVo);
//                }
//                if (flag2717){
//                    updateYanPan("2717",yanPanVo);
//                }
//                if (flag2718){
//                    updateYanPan("2718",yanPanVo);
//                }
//                if (flag2719){
//                    updateYanPan("2719",yanPanVo);
//                }
//                if (flag2720){
//                    updateYanPan("2720",yanPanVo);
//                }
//                if (flag2721){
//                    updateYanPan("2721",yanPanVo);
//                }
//                if (flag2722){
//                    updateYanPan("2722",yanPanVo);
//                }
//                if (flag2723){
//                    updateYanPan("2723",yanPanVo);
//                }
//                if (flag2724){
//                    updateYanPan("2724",yanPanVo);
//                }
//
//                if (flag2725){
//                    updateYanPan("2725",yanPanVo);
//                }
//                if (flag2726){
//                    updateYanPan("2726",yanPanVo);
//                }
//                if (flag2727){
//                    updateYanPan("2727",yanPanVo);
//                }
//                if (flag2728){
//                    updateYanPan("2728",yanPanVo);
//                }
//                if (flag2729){
//                    updateYanPan("2729",yanPanVo);
//                }
//                if (flag2730){
//                    updateYanPan("2730",yanPanVo);
//                }
//                if (flag2731){
//                    updateYanPan("2731",yanPanVo);
//                }
//                if (flag2732){
//                    updateYanPan("2732",yanPanVo);
//                }
//                if (flag2733){
//                    updateYanPan("2733",yanPanVo);
//                }
//                if (flag2734){
//                    updateYanPan("2734",yanPanVo);
//                }
//                if (flag2735){
//                    updateYanPan("2735",yanPanVo);
//                }
//                if (flag2736){
//                    updateYanPan("2736",yanPanVo);
//                }
//                if (flag2737){
//                    updateYanPan("2737",yanPanVo);
//                }
//                if (flag2738){
//                    updateYanPan("2738",yanPanVo);
//                }
//                if (flag2739){
//                    updateYanPan("2739",yanPanVo);
//                }

                if (flag2740){
                    updateYanPan("2740",yanPanVo);
                }
                if (flag2741){
                    updateYanPan("2741",yanPanVo);
                }
                if (flag2742){
                    updateYanPan("2742",yanPanVo);
                }
                if (flag2743){
                    updateYanPan("2743",yanPanVo);
                }
                if (flag2744){
                    updateYanPan("2744",yanPanVo);
                }
                if (flag2745){
                    updateYanPan("2745",yanPanVo);
                }
                if (flag2746){
                    updateYanPan("2746",yanPanVo);
                }
                if (flag2747){
                    updateYanPan("2747",yanPanVo);
                }
                if (flag2748){
                    updateYanPan("2748",yanPanVo);
                }
                if (flag2749){
                    updateYanPan("2749",yanPanVo);
                }
                if (flag2750){
                    updateYanPan("2750",yanPanVo);
                }
                if (flag2751){
                    updateYanPan("2751",yanPanVo);
                }

                if (flag2752){
                    updateYanPan("2752",yanPanVo);
                }
                if (flag2753){
                    updateYanPan("2753",yanPanVo);
                }
                if (flag2754){
                    updateYanPan("2754",yanPanVo);
                }
                if (flag2755){
                    updateYanPan("2755",yanPanVo);
                }
                if (flag2756){
                    updateYanPan("2756",yanPanVo);
                }
                if (flag2757){
                    updateYanPan("2757",yanPanVo);
                }
                if (flag2758){
                    updateYanPan("2758",yanPanVo);
                }
                if (flag2759){
                    updateYanPan("2759",yanPanVo);
                }
                if (flag2760){
                    updateYanPan("2760",yanPanVo);
                }
                if (flag2761){
                    updateYanPan("2761",yanPanVo);
                }
                if (flag2762){
                    updateYanPan("2762",yanPanVo);
                }
                if (flag2763){
                    updateYanPan("2763",yanPanVo);
                }
                if (flag2764){
                    updateYanPan("2764",yanPanVo);
                }

                if (flag2765){
                    updateYanPan("2765",yanPanVo);
                }
                if (flag2766){
                    updateYanPan("2766",yanPanVo);
                }
                if (flag2767){
                    updateYanPan("2767",yanPanVo);
                }
                if (flag2768){
                    updateYanPan("2768",yanPanVo);
                }
                if (flag2769){
                    updateYanPan("2769",yanPanVo);
                }
                if (flag2770){
                    updateYanPan("2770",yanPanVo);
                }
                if (flag2771){
                    updateYanPan("2771",yanPanVo);
                }
                if (flag2772){
                    updateYanPan("2772",yanPanVo);
                }
                if (flag2773){
                    updateYanPan("2773",yanPanVo);
                }
                if (flag2774){
                    updateYanPan("2774",yanPanVo);
                }
                if (flag2775){
                    updateYanPan("2775",yanPanVo);
                }
                if (flag2776){
                    updateYanPan("2776",yanPanVo);
                }
                if (flag2777){
                    updateYanPan("2777",yanPanVo);
                }
                if (flag2778){
                    updateYanPan("2778",yanPanVo);
                }
                if (flag2779){
                    updateYanPan("2779",yanPanVo);
                }
                if (flag2780){
                    updateYanPan("2780",yanPanVo);
                }
                if (flag2781){
                    updateYanPan("2781",yanPanVo);
                }
                if (flag2782){
                    updateYanPan("2782",yanPanVo);
                }
                if (flag2783){
                    updateYanPan("2783",yanPanVo);
                }
                if (flag2784){
                    updateYanPan("2784",yanPanVo);
                }
                if (flag2785){
                    updateYanPan("2785",yanPanVo);
                }
                if (flag2786){
                    updateYanPan("2786",yanPanVo);
                }
                if (flag2787){
                    updateYanPan("2787",yanPanVo);
                }
                if (flag2788){
                    updateYanPan("2788",yanPanVo);
                }
                if (flag2789){
                    updateYanPan("2789",yanPanVo);
                }
                if (flag2790){
                    updateYanPan("2790",yanPanVo);
                }
                if (flag2791){
                    updateYanPan("2791",yanPanVo);
                }
                if (flag2792){
                    updateYanPan("2792",yanPanVo);
                }
                if (flag2793){
                    updateYanPan("2793",yanPanVo);
                }
                if (flag2794){
                    updateYanPan("2794",yanPanVo);
                }
                if (flag2795){
                    updateYanPan("2795",yanPanVo);
                }

                if (flag2796){
                    updateYanPan("2796",yanPanVo);
                }
                if (flag2797){
                    updateYanPan("2797",yanPanVo);
                }
                if (flag2798){
                    updateYanPan("2798",yanPanVo);
                }
                if (flag2799){
                    updateYanPan("2799",yanPanVo);
                }
                if (flag2800){
                    updateYanPan("2800",yanPanVo);
                }
                if (flag2801){
                    updateYanPan("2801",yanPanVo);
                }
                if (flag2802){
                    updateYanPan("2802",yanPanVo);
                }
                if (flag2803){
                    updateYanPan("2803",yanPanVo);
                }
                if (flag2804){
                    updateYanPan("2804",yanPanVo);
                }
                if (flag2805){
                    updateYanPan("2805",yanPanVo);
                }
                if (flag2806){
                    updateYanPan("2806",yanPanVo);
                }
                if (flag2807){
                    updateYanPan("2807",yanPanVo);
                }
                if (flag2808){
                    updateYanPan("2808",yanPanVo);
                }

                if (flag2809){
                    updateYanPan("2809",yanPanVo);
                }
                if (flag2810){
                    updateYanPan("2810",yanPanVo);
                }
                if (flag2811){
                    updateYanPan("2811",yanPanVo);
                }
                if (flag2812){
                    updateYanPan("2812",yanPanVo);
                }
                if (flag2813){
                    updateYanPan("2813",yanPanVo);
                }
                if (flag2814){
                    updateYanPan("2814",yanPanVo);
                }
                if (flag2815){
                    updateYanPan("2815",yanPanVo);
                }
                if (flag2816){
                    updateYanPan("2816",yanPanVo);
                }
                if (flag2817){
                    updateYanPan("2817",yanPanVo);
                }
                if (flag2818){
                    updateYanPan("2818",yanPanVo);
                }
                if (flag2819){
                    updateYanPan("2819",yanPanVo);
                }
                if (flag2820){
                    updateYanPan("2820",yanPanVo);
                }
                if (flag2821){
                    updateYanPan("2821",yanPanVo);
                }

                if (flag2822){
                    updateYanPan("2822",yanPanVo);
                }
                if (flag2823){
                    updateYanPan("2823",yanPanVo);
                }
                if (flag2824){
                    updateYanPan("2824",yanPanVo);
                }
                if (flag2825){
                    updateYanPan("2825",yanPanVo);
                }
                if (flag2826){
                    updateYanPan("2826",yanPanVo);
                }
                if (flag2827){
                    updateYanPan("2827",yanPanVo);
                }
                if (flag2828){
                    updateYanPan("2828",yanPanVo);
                }
                if (flag2829){
                    updateYanPan("2829",yanPanVo);
                }
                if (flag2830){
                    updateYanPan("2830",yanPanVo);
                }
                if (flag2831){
                    updateYanPan("2831",yanPanVo);
                }
                if (flag2832){
                    updateYanPan("2832",yanPanVo);
                }
                if (flag2833){
                    updateYanPan("2833",yanPanVo);
                }
                if (flag2834){
                    updateYanPan("2834",yanPanVo);
                }

                if (flag2835){
                    updateYanPan("2835",yanPanVo);
                }
                if (flag2836){
                    updateYanPan("2836",yanPanVo);
                }
                if (flag2837){
                    updateYanPan("2837",yanPanVo);
                }
                if (flag2838){
                    updateYanPan("2838",yanPanVo);
                }
                if (flag2839){
                    updateYanPan("2839",yanPanVo);
                }
                if (flag2840){
                    updateYanPan("2840",yanPanVo);
                }
                if (flag2841){
                    updateYanPan("2841",yanPanVo);
                }
                if (flag2842){
                    updateYanPan("2842",yanPanVo);
                }
                if (flag2843){
                    updateYanPan("2843",yanPanVo);
                }
                if (flag2844){
                    updateYanPan("2844",yanPanVo);
                }
                if (flag2845){
                    updateYanPan("2845",yanPanVo);
                }
                if (flag2846){
                    updateYanPan("2846",yanPanVo);
                }
                if (flag2847){
                    updateYanPan("2847",yanPanVo);
                }
                if (flag2848){
                    updateYanPan("2848",yanPanVo);
                }
                if (flag2849){
                    updateYanPan("2849",yanPanVo);
                }
                if (flag2850){
                    updateYanPan("2850",yanPanVo);
                }
                if (flag2851){
                    updateYanPan("2851",yanPanVo);
                }

                if (flag2852){
                    updateYanPan("2852",yanPanVo);
                }
                if (flag2853){
                    updateYanPan("2853",yanPanVo);
                }
                if (flag2854){
                    updateYanPan("2854",yanPanVo);
                }
                if (flag2855){
                    updateYanPan("2855",yanPanVo);
                }
                if (flag2856){
                    updateYanPan("2856",yanPanVo);
                }
                if (flag2857){
                    updateYanPan("2857",yanPanVo);
                }
                if (flag2858){
                    updateYanPan("2858",yanPanVo);
                }
                if (flag2859){
                    updateYanPan("2859",yanPanVo);
                }
                if (flag2860){
                    updateYanPan("2860",yanPanVo);
                }
                if (flag2861){
                    updateYanPan("2861",yanPanVo);
                }
                if (flag2862){
                    updateYanPan("2862",yanPanVo);
                }
                if (flag2863){
                    updateYanPan("2863",yanPanVo);
                }
                if (flag2864){
                    updateYanPan("2864",yanPanVo);
                }

                if (flag2865){
                    updateYanPan("2865",yanPanVo);
                }
                if (flag2866){
                    updateYanPan("2866",yanPanVo);
                }
                if (flag2867){
                    updateYanPan("2867",yanPanVo);
                }
                if (flag2868){
                    updateYanPan("2868",yanPanVo);
                }
                if (flag2869){
                    updateYanPan("2869",yanPanVo);
                }
                if (flag2870){
                    updateYanPan("2870",yanPanVo);
                }
                if (flag2871){
                    updateYanPan("2871",yanPanVo);
                }
                if (flag2872){
                    updateYanPan("2872",yanPanVo);
                }
                if (flag2873){
                    updateYanPan("2873",yanPanVo);
                }
                if (flag2874){
                    updateYanPan("2874",yanPanVo);
                }
                if (flag2875){
                    updateYanPan("2875",yanPanVo);
                }
                if (flag2876){
                    updateYanPan("2876",yanPanVo);
                }
                if (flag2877){
                    updateYanPan("2877",yanPanVo);
                }
                if (flag2878){
                    updateYanPan("2878",yanPanVo);
                }
                if (flag2879){
                    updateYanPan("2879",yanPanVo);
                }
                if (flag2880){
                    updateYanPan("2880",yanPanVo);
                }
                if (flag2881){
                    updateYanPan("2881",yanPanVo);
                }
                if (flag2882){
                    updateYanPan("2882",yanPanVo);
                }
                if (flag2883){
                    updateYanPan("2883",yanPanVo);
                }
                if (flag2884){
                    updateYanPan("2884",yanPanVo);
                }
                if (flag2885){
                    updateYanPan("2885",yanPanVo);
                }
                if (flag2886){
                    updateYanPan("2886",yanPanVo);
                }
                if (flag2887){
                    updateYanPan("2887",yanPanVo);
                }
                if (flag2888){
                    updateYanPan("2888",yanPanVo);
                }
                if (flag2889){
                    updateYanPan("2889",yanPanVo);
                }
                if (flag2890){
                    updateYanPan("2890",yanPanVo);
                }
                if (flag2891){
                    updateYanPan("2891",yanPanVo);
                }
                if (flag2892){
                    updateYanPan("2892",yanPanVo);
                }
                if (flag2893){
                    updateYanPan("2893",yanPanVo);
                }
                if (flag2894){
                    updateYanPan("2894",yanPanVo);
                }
                if (flag2895){
                    updateYanPan("2895",yanPanVo);
                }

                if (flag2896){
                    updateYanPan("2896",yanPanVo);
                }
                if (flag2897){
                    updateYanPan("2897",yanPanVo);
                }
                if (flag2898){
                    updateYanPan("2898",yanPanVo);
                }
                if (flag2899){
                    updateYanPan("2899",yanPanVo);
                }
                if (flag2900){
                    updateYanPan("2900",yanPanVo);
                }
                if (flag2901){
                    updateYanPan("2901",yanPanVo);
                }
                if (flag2902){
                    updateYanPan("2902",yanPanVo);
                }
                if (flag2903){
                    updateYanPan("2903",yanPanVo);
                }
                if (flag2904){
                    updateYanPan("2904",yanPanVo);
                }
                if (flag2905){
                    updateYanPan("2905",yanPanVo);
                }
                if (flag2906){
                    updateYanPan("2906",yanPanVo);
                }
                if (flag2907){
                    updateYanPan("2907",yanPanVo);
                }
                if (flag2908){
                    updateYanPan("2908",yanPanVo);
                }

                if (flag2909){
                    updateYanPan("2909",yanPanVo);
                }
                if (flag2910){
                    updateYanPan("2910",yanPanVo);
                }
                if (flag2911){
                    updateYanPan("2911",yanPanVo);
                }
                if (flag2912){
                    updateYanPan("2912",yanPanVo);
                }
                if (flag2913){
                    updateYanPan("2913",yanPanVo);
                }
                if (flag2914){
                    updateYanPan("2914",yanPanVo);
                }
                if (flag2915){
                    updateYanPan("2915",yanPanVo);
                }
                if (flag2916){
                    updateYanPan("2916",yanPanVo);
                }
                if (flag2917){
                    updateYanPan("2917",yanPanVo);
                }
                if (flag2918){
                    updateYanPan("2918",yanPanVo);
                }
                if (flag2919){
                    updateYanPan("2919",yanPanVo);
                }
                if (flag2920){
                    updateYanPan("2920",yanPanVo);
                }
                if (flag2921){
                    updateYanPan("2921",yanPanVo);
                }

                if (flag2922){
                    updateYanPan("2922",yanPanVo);
                }
                if (flag2923){
                    updateYanPan("2923",yanPanVo);
                }
                if (flag2924){
                    updateYanPan("2924",yanPanVo);
                }
                if (flag2925){
                    updateYanPan("2925",yanPanVo);
                }
                if (flag2926){
                    updateYanPan("2926",yanPanVo);
                }
                if (flag2927){
                    updateYanPan("2927",yanPanVo);
                }
                if (flag2928){
                    updateYanPan("2928",yanPanVo);
                }
                if (flag2929){
                    updateYanPan("2929",yanPanVo);
                }
                if (flag2930){
                    updateYanPan("2930",yanPanVo);
                }
                if (flag2931){
                    updateYanPan("2931",yanPanVo);
                }
                if (flag2932){
                    updateYanPan("2932",yanPanVo);
                }
                if (flag2933){
                    updateYanPan("2933",yanPanVo);
                }
                if (flag2934){
                    updateYanPan("2934",yanPanVo);
                }

                if (flag2935){
                    updateYanPan("2935",yanPanVo);
                }
                if (flag2936){
                    updateYanPan("2936",yanPanVo);
                }
                if (flag2937){
                    updateYanPan("2937",yanPanVo);
                }
                if (flag2938){
                    updateYanPan("2938",yanPanVo);
                }
                if (flag2939){
                    updateYanPan("2939",yanPanVo);
                }
                if (flag2940){
                    updateYanPan("2940",yanPanVo);
                }
                if (flag2941){
                    updateYanPan("2941",yanPanVo);
                }
                if (flag2942){
                    updateYanPan("2942",yanPanVo);
                }
                if (flag2943){
                    updateYanPan("2943",yanPanVo);
                }
                if (flag2944){
                    updateYanPan("2944",yanPanVo);
                }
                if (flag2945){
                    updateYanPan("2945",yanPanVo);
                }
                if (flag2946){
                    updateYanPan("2946",yanPanVo);
                }
                if (flag2947){
                    updateYanPan("2947",yanPanVo);
                }
                if (flag2948){
                    updateYanPan("2948",yanPanVo);
                }
                if (flag2949){
                    updateYanPan("2949",yanPanVo);
                }
                if (flag2950){
                    updateYanPan("2950",yanPanVo);
                }
                if (flag2951){
                    updateYanPan("2951",yanPanVo);
                }

                if (flag2952){
                    updateYanPan("2952",yanPanVo);
                }
                if (flag2953){
                    updateYanPan("2953",yanPanVo);
                }
                if (flag2954){
                    updateYanPan("2954",yanPanVo);
                }
                if (flag2955){
                    updateYanPan("2955",yanPanVo);
                }
                if (flag2956){
                    updateYanPan("2956",yanPanVo);
                }
                if (flag2957){
                    updateYanPan("2957",yanPanVo);
                }
                if (flag2958){
                    updateYanPan("2958",yanPanVo);
                }
                if (flag2959){
                    updateYanPan("2959",yanPanVo);
                }
                if (flag2960){
                    updateYanPan("2960",yanPanVo);
                }
                if (flag2961){
                    updateYanPan("2961",yanPanVo);
                }
                if (flag2962){
                    updateYanPan("2962",yanPanVo);
                }
                if (flag2963){
                    updateYanPan("2963",yanPanVo);
                }
                if (flag2964){
                    updateYanPan("2964",yanPanVo);
                }

                if (flag2965){
                    updateYanPan("2965",yanPanVo);
                }
                if (flag2966){
                    updateYanPan("2966",yanPanVo);
                }
                if (flag2967){
                    updateYanPan("2967",yanPanVo);
                }
                if (flag2968){
                    updateYanPan("2968",yanPanVo);
                }
                if (flag2969){
                    updateYanPan("2969",yanPanVo);
                }
                if (flag2970){
                    updateYanPan("2970",yanPanVo);
                }
                if (flag2971){
                    updateYanPan("2971",yanPanVo);
                }
                if (flag2972){
                    updateYanPan("2972",yanPanVo);
                }
                if (flag2973){
                    updateYanPan("2973",yanPanVo);
                }
                if (flag2974){
                    updateYanPan("2974",yanPanVo);
                }
                if (flag2975){
                    updateYanPan("2975",yanPanVo);
                }
                if (flag2976){
                    updateYanPan("2976",yanPanVo);
                }
                if (flag2977){
                    updateYanPan("2977",yanPanVo);
                }
                if (flag2978){
                    updateYanPan("2978",yanPanVo);
                }
                if (flag2979){
                    updateYanPan("2979",yanPanVo);
                }

                if (flag2980){
                    updateYanPan("2980",yanPanVo);
                }
                if (flag2981){
                    updateYanPan("2981",yanPanVo);
                }
                if (flag2982){
                    updateYanPan("2982",yanPanVo);
                }
                if (flag2983){
                    updateYanPan("2983",yanPanVo);
                }
                if (flag2984){
                    updateYanPan("2984",yanPanVo);
                }
                if (flag2985){
                    updateYanPan("2985",yanPanVo);
                }
                if (flag2986){
                    updateYanPan("2986",yanPanVo);
                }
                if (flag2987){
                    updateYanPan("2987",yanPanVo);
                }
                if (flag2988){
                    updateYanPan("2988",yanPanVo);
                }
                if (flag2989){
                    updateYanPan("2989",yanPanVo);
                }
                if (flag2990){
                    updateYanPan("2990",yanPanVo);
                }
                if (flag2991){
                    updateYanPan("2991",yanPanVo);
                }

                if (flag2992){
                    updateYanPan("2992",yanPanVo);
                }
                if (flag2993){
                    updateYanPan("2993",yanPanVo);
                }
                if (flag2994){
                    updateYanPan("2994",yanPanVo);
                }
                if (flag2995){
                    updateYanPan("2995",yanPanVo);
                }
                if (flag2996){
                    updateYanPan("2996",yanPanVo);
                }
                if (flag2997){
                    updateYanPan("2997",yanPanVo);
                }
                if (flag2998){
                    updateYanPan("2998",yanPanVo);
                }
                if (flag2999){
                    updateYanPan("2999",yanPanVo);
                }
                if (flag3000){
                    updateYanPan("3000",yanPanVo);
                }
                if (flag3001){
                    updateYanPan("3001",yanPanVo);
                }
                if (flag3002){
                    updateYanPan("3002",yanPanVo);
                }
                if (flag3003){
                    updateYanPan("3003",yanPanVo);
                }
                if (flag3004){
                    updateYanPan("3004",yanPanVo);
                }

                if (flag3005){
                    updateYanPan("3005",yanPanVo);
                }
                if (flag3006){
                    updateYanPan("3006",yanPanVo);
                }
                if (flag3007){
                    updateYanPan("3007",yanPanVo);
                }
                if (flag3008){
                    updateYanPan("3008",yanPanVo);
                }
                if (flag3009){
                    updateYanPan("3009",yanPanVo);
                }
                if (flag3010){
                    updateYanPan("3000",yanPanVo);
                }
                if (flag3011){
                    updateYanPan("3011",yanPanVo);
                }
                if (flag3012){
                    updateYanPan("3012",yanPanVo);
                }
                if (flag3013){
                    updateYanPan("3013",yanPanVo);
                }
                if (flag3014){
                    updateYanPan("3014",yanPanVo);
                }
                if (flag3015){
                    updateYanPan("3015",yanPanVo);
                }
                if (flag3016){
                    updateYanPan("3016",yanPanVo);
                }
                if (flag3017){
                    updateYanPan("3017",yanPanVo);
                }
                if (flag3018){
                    updateYanPan("3018",yanPanVo);
                }
                if (flag3019){
                    updateYanPan("3019",yanPanVo);
                }
                if (flag3020){
                    updateYanPan("3020",yanPanVo);
                }
                if (flag3021){
                    updateYanPan("3021",yanPanVo);
                }
                if (flag3022){
                    updateYanPan("3022",yanPanVo);
                }
                if (flag3023){
                    updateYanPan("3023",yanPanVo);
                }
                if (flag3024){
                    updateYanPan("3024",yanPanVo);
                }
                if (flag3025){
                    updateYanPan("3025",yanPanVo);
                }
                if (flag3026){
                    updateYanPan("3026",yanPanVo);
                }
                if (flag3027){
                    updateYanPan("3027",yanPanVo);
                }
                if (flag3028){
                    updateYanPan("3028",yanPanVo);
                }
                if (flag3029){
                    updateYanPan("3029",yanPanVo);
                }
                if (flag3030){
                    updateYanPan("3030",yanPanVo);
                }
                if (flag3031){
                    updateYanPan("3031",yanPanVo);
                }
                if (flag3032){
                    updateYanPan("3032",yanPanVo);
                }
                if (flag3033){
                    updateYanPan("3033",yanPanVo);
                }
                if (flag3034){
                    updateYanPan("3034",yanPanVo);
                }
                if (flag3035){
                    updateYanPan("3035",yanPanVo);
                }

                if (flag3036){
                    updateYanPan("3036",yanPanVo);
                }
                if (flag3037){
                    updateYanPan("3037",yanPanVo);
                }
                if (flag3038){
                    updateYanPan("3038",yanPanVo);
                }
                if (flag3039){
                    updateYanPan("3039",yanPanVo);
                }
                if (flag3040){
                    updateYanPan("3040",yanPanVo);
                }
                if (flag3041){
                    updateYanPan("3041",yanPanVo);
                }
                if (flag3042){
                    updateYanPan("3042",yanPanVo);
                }
                if (flag3043){
                    updateYanPan("3043",yanPanVo);
                }
                if (flag3044){
                    updateYanPan("3044",yanPanVo);
                }
                if (flag3045){
                    updateYanPan("3045",yanPanVo);
                }
                if (flag3046){
                    updateYanPan("3046",yanPanVo);
                }
                if (flag3047){
                    updateYanPan("3047",yanPanVo);
                }
                if (flag3048){
                    updateYanPan("3048",yanPanVo);
                }

                if (flag3049){
                    updateYanPan("3049",yanPanVo);
                }
                if (flag3050){
                    updateYanPan("3050",yanPanVo);
                }
                if (flag3051){
                    updateYanPan("3051",yanPanVo);
                }
                if (flag3052){
                    updateYanPan("3052",yanPanVo);
                }
                if (flag3053){
                    updateYanPan("3053",yanPanVo);
                }
                if (flag3054){
                    updateYanPan("3054",yanPanVo);
                }
                if (flag3055){
                    updateYanPan("3055",yanPanVo);
                }
                if (flag3056){
                    updateYanPan("3056",yanPanVo);
                }
                if (flag3057){
                    updateYanPan("3057",yanPanVo);
                }
                if (flag3058){
                    updateYanPan("3058",yanPanVo);
                }
                if (flag3059){
                    updateYanPan("3059",yanPanVo);
                }
                if (flag3060){
                    updateYanPan("3060",yanPanVo);
                }
                if (flag3061){
                    updateYanPan("3061",yanPanVo);
                }

                if (flag3062){
                    updateYanPan("3062",yanPanVo);
                }
                if (flag3063){
                    updateYanPan("3063",yanPanVo);
                }
                if (flag3064){
                    updateYanPan("3064",yanPanVo);
                }
                if (flag3065){
                    updateYanPan("3065",yanPanVo);
                }
                if (flag3066){
                    updateYanPan("3066",yanPanVo);
                }
                if (flag3067){
                    updateYanPan("3067",yanPanVo);
                }
                if (flag3068){
                    updateYanPan("3068",yanPanVo);
                }
                if (flag3069){
                    updateYanPan("3069",yanPanVo);
                }
                if (flag3070){
                    updateYanPan("3070",yanPanVo);
                }
                if (flag3071){
                    updateYanPan("3071",yanPanVo);
                }
                if (flag3072){
                    updateYanPan("3072",yanPanVo);
                }
                if (flag3073){
                    updateYanPan("3073",yanPanVo);
                }
                if (flag3074){
                    updateYanPan("3074",yanPanVo);
                }

                if (flag3075){
                    updateYanPan("3075",yanPanVo);
                }
                if (flag3076){
                    updateYanPan("3076",yanPanVo);
                }
                if (flag3077){
                    updateYanPan("3077",yanPanVo);
                }
                if (flag3078){
                    updateYanPan("3078",yanPanVo);
                }
                if (flag3079){
                    updateYanPan("3079",yanPanVo);
                }
                if (flag3080){
                    updateYanPan("3080",yanPanVo);
                }
                if (flag3081){
                    updateYanPan("3081",yanPanVo);
                }
                if (flag3082){
                    updateYanPan("3082",yanPanVo);
                }
                if (flag3083){
                    updateYanPan("3083",yanPanVo);
                }
                if (flag3084){
                    updateYanPan("3084",yanPanVo);
                }
                if (flag3085){
                    updateYanPan("3085",yanPanVo);
                }
                if (flag3086){
                    updateYanPan("3086",yanPanVo);
                }
                if (flag3087){
                    updateYanPan("3087",yanPanVo);
                }
                if (flag3088){
                    updateYanPan("3088",yanPanVo);
                }
                if (flag3089){
                    updateYanPan("3089",yanPanVo);
                }
                if (flag3090){
                    updateYanPan("3090",yanPanVo);
                }
                if (flag3091){
                    updateYanPan("3091",yanPanVo);
                }

                if (flag3092){
                    updateYanPan("3092",yanPanVo);
                }
                if (flag3093){
                    updateYanPan("3093",yanPanVo);
                }
                if (flag3094){
                    updateYanPan("3094",yanPanVo);
                }
                if (flag3095){
                    updateYanPan("3095",yanPanVo);
                }
                if (flag3096){
                    updateYanPan("3096",yanPanVo);
                }
                if (flag3097){
                    updateYanPan("3097",yanPanVo);
                }
                if (flag3098){
                    updateYanPan("3098",yanPanVo);
                }
                if (flag3099){
                    updateYanPan("3099",yanPanVo);
                }
                if (flag3100){
                    updateYanPan("3100",yanPanVo);
                }
                if (flag3101){
                    updateYanPan("3101",yanPanVo);
                }
                if (flag3102){
                    updateYanPan("3102",yanPanVo);
                }
                if (flag3103){
                    updateYanPan("3103",yanPanVo);
                }
                if (flag3104){
                    updateYanPan("3104",yanPanVo);
                }

                if (flag3105){
                    updateYanPan("3105",yanPanVo);
                }
                if (flag3106){
                    updateYanPan("3106",yanPanVo);
                }
                if (flag3107){
                    updateYanPan("3107",yanPanVo);
                }
                if (flag3108){
                    updateYanPan("3108",yanPanVo);
                }
                if (flag3109){
                    updateYanPan("3109",yanPanVo);
                }
                if (flag3110){
                    updateYanPan("3110",yanPanVo);
                }
                if (flag3111){
                    updateYanPan("3111",yanPanVo);
                }
                if (flag3112){
                    updateYanPan("3112",yanPanVo);
                }
                if (flag3113){
                    updateYanPan("3113",yanPanVo);
                }
                if (flag3114){
                    updateYanPan("3114",yanPanVo);
                }
                if (flag3115){
                    updateYanPan("3115",yanPanVo);
                }
                if (flag3116){
                    updateYanPan("3116",yanPanVo);
                }
                if (flag3117){
                    updateYanPan("3117",yanPanVo);
                }
                if (flag3118){
                    updateYanPan("3118",yanPanVo);
                }
                if (flag3119){
                    updateYanPan("3119",yanPanVo);
                }
                if (flag3120){
                    updateYanPan("3120",yanPanVo);
                }
                if (flag3121){
                    updateYanPan("3121",yanPanVo);
                }
                if (flag3122){
                    updateYanPan("3122",yanPanVo);
                }
                if (flag3123){
                    updateYanPan("3123",yanPanVo);
                }
                if (flag3124){
                    updateYanPan("3124",yanPanVo);
                }
                if (flag3125){
                    updateYanPan("3125",yanPanVo);
                }
                if (flag3126){
                    updateYanPan("3126",yanPanVo);
                }
                if (flag3127){
                    updateYanPan("3127",yanPanVo);
                }
                if (flag3128){
                    updateYanPan("3128",yanPanVo);
                }
                if (flag3129){
                    updateYanPan("3129",yanPanVo);
                }
                if (flag3130){
                    updateYanPan("3130",yanPanVo);
                }
                if (flag3131){
                    updateYanPan("3131",yanPanVo);
                }
                if (flag3132){
                    updateYanPan("3132",yanPanVo);
                }
                if (flag3133){
                    updateYanPan("3133",yanPanVo);
                }
                if (flag3134){
                    updateYanPan("3134",yanPanVo);
                }
                if (flag3135){
                    updateYanPan("3135",yanPanVo);
                }

                if (flag3136){
                    updateYanPan("3136",yanPanVo);
                }
                if (flag3137){
                    updateYanPan("3137",yanPanVo);
                }
                if (flag3138){
                    updateYanPan("3138",yanPanVo);
                }
                if (flag3139){
                    updateYanPan("3139",yanPanVo);
                }
                if (flag3140){
                    updateYanPan("3140",yanPanVo);
                }
                if (flag3141){
                    updateYanPan("3141",yanPanVo);
                }
                if (flag3142){
                    updateYanPan("3142",yanPanVo);
                }
                if (flag3143){
                    updateYanPan("3143",yanPanVo);
                }
                if (flag3144){
                    updateYanPan("3144",yanPanVo);
                }
                if (flag3145){
                    updateYanPan("3145",yanPanVo);
                }
                if (flag3146){
                    updateYanPan("3146",yanPanVo);
                }
                if (flag3147){
                    updateYanPan("3147",yanPanVo);
                }
                if (flag3148){
                    updateYanPan("3148",yanPanVo);
                }

                if (flag3149){
                    updateYanPan("3149",yanPanVo);
                }
                if (flag3150){
                    updateYanPan("3150",yanPanVo);
                }
                if (flag3151){
                    updateYanPan("3151",yanPanVo);
                }
                if (flag3152){
                    updateYanPan("3152",yanPanVo);
                }
                if (flag3153){
                    updateYanPan("3153",yanPanVo);
                }
                if (flag3154){
                    updateYanPan("3154",yanPanVo);
                }
                if (flag3155){
                    updateYanPan("3155",yanPanVo);
                }
                if (flag3156){
                    updateYanPan("3156",yanPanVo);
                }
                if (flag3157){
                    updateYanPan("3157",yanPanVo);
                }
                if (flag3158){
                    updateYanPan("3158",yanPanVo);
                }
                if (flag3159){
                    updateYanPan("3159",yanPanVo);
                }
                if (flag3160){
                    updateYanPan("3160",yanPanVo);
                }
                if (flag3161){
                    updateYanPan("3161",yanPanVo);
                }

                if (flag3162){
                    updateYanPan("3162",yanPanVo);
                }
                if (flag3163){
                    updateYanPan("3163",yanPanVo);
                }
                if (flag3164){
                    updateYanPan("3164",yanPanVo);
                }
                if (flag3165){
                    updateYanPan("3165",yanPanVo);
                }
                if (flag3166){
                    updateYanPan("3166",yanPanVo);
                }
                if (flag3167){
                    updateYanPan("3167",yanPanVo);
                }
                if (flag3168){
                    updateYanPan("3168",yanPanVo);
                }
                if (flag3169){
                    updateYanPan("3169",yanPanVo);
                }
                if (flag3170){
                    updateYanPan("3170",yanPanVo);
                }
                if (flag3171){
                    updateYanPan("3171",yanPanVo);
                }
                if (flag3172){
                    updateYanPan("3172",yanPanVo);
                }
                if (flag3173){
                    updateYanPan("3173",yanPanVo);
                }
                if (flag3174){
                    updateYanPan("3174",yanPanVo);
                }

                if (flag3175){
                    updateYanPan("3175",yanPanVo);
                }
                if (flag3176){
                    updateYanPan("3176",yanPanVo);
                }
                if (flag3177){
                    updateYanPan("3177",yanPanVo);
                }
                if (flag3178){
                    updateYanPan("3178",yanPanVo);
                }
                if (flag3179){
                    updateYanPan("3179",yanPanVo);
                }
                if (flag3180){
                    updateYanPan("3180",yanPanVo);
                }
                if (flag3181){
                    updateYanPan("3181",yanPanVo);
                }
                if (flag3182){
                    updateYanPan("3182",yanPanVo);
                }
                if (flag3183){
                    updateYanPan("3183",yanPanVo);
                }
                if (flag3184){
                    updateYanPan("3184",yanPanVo);
                }
                if (flag3185){
                    updateYanPan("3185",yanPanVo);
                }
                if (flag3186){
                    updateYanPan("3186",yanPanVo);
                }
                if (flag3187){
                    updateYanPan("3187",yanPanVo);
                }
                if (flag3188){
                    updateYanPan("3188",yanPanVo);
                }
                if (flag3189){
                    updateYanPan("3189",yanPanVo);
                }
                if (flag3190){
                    updateYanPan("3190",yanPanVo);
                }
                if (flag3191){
                    updateYanPan("3191",yanPanVo);
                }

                if (flag3192){
                    updateYanPan("3192",yanPanVo);
                }
                if (flag3193){
                    updateYanPan("3193",yanPanVo);
                }
                if (flag3194){
                    updateYanPan("3194",yanPanVo);
                }
                if (flag3195){
                    updateYanPan("3195",yanPanVo);
                }
                if (flag3196){
                    updateYanPan("3196",yanPanVo);
                }
                if (flag3197){
                    updateYanPan("3197",yanPanVo);
                }
                if (flag3198){
                    updateYanPan("3198",yanPanVo);
                }
                if (flag3199){
                    updateYanPan("3199",yanPanVo);
                }
                if (flag3200){
                    updateYanPan("3200",yanPanVo);
                }
                if (flag3201){
                    updateYanPan("3201",yanPanVo);
                }
                if (flag3202){
                    updateYanPan("3202",yanPanVo);
                }
                if (flag3203){
                    updateYanPan("3203",yanPanVo);
                }
                if (flag3204){
                    updateYanPan("3204",yanPanVo);
                }

                if (flag3205){
                    updateYanPan("3205",yanPanVo);
                }
                if (flag3206){
                    updateYanPan("3206",yanPanVo);
                }
                if (flag3207){
                    updateYanPan("3207",yanPanVo);
                }
                if (flag3208){
                    updateYanPan("3208",yanPanVo);
                }
                if (flag3209){
                    updateYanPan("3209",yanPanVo);
                }
                if (flag3210){
                    updateYanPan("3210",yanPanVo);
                }
                if (flag3211){
                    updateYanPan("3211",yanPanVo);
                }
                if (flag3212){
                    updateYanPan("3212",yanPanVo);
                }
                if (flag3213){
                    updateYanPan("3213",yanPanVo);
                }
                if (flag3214){
                    updateYanPan("3214",yanPanVo);
                }
                if (flag3215){
                    updateYanPan("3215",yanPanVo);
                }
                if (flag3216){
                    updateYanPan("3216",yanPanVo);
                }
                if (flag3217){
                    updateYanPan("3217",yanPanVo);
                }
                if (flag3218){
                    updateYanPan("3218",yanPanVo);
                }
                if (flag3219){
                    updateYanPan("3219",yanPanVo);
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
