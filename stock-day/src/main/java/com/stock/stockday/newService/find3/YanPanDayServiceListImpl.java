package com.stock.stockday.newService.find3;


import com.stock.apicommon.entity.ScienceEntity;
import com.stock.stockday.entity.StockDayAll;
import com.stock.stockday.entity.StockDayScience;
import com.stock.stockday.util.DateUtil;
import com.stock.stockday.util.FindUtil15;
import com.stock.stockday.util.FindUtil3;
import com.stock.stockday.util.FindUtil35;
import com.stock.stockday.util.FindUtil38;
import com.stock.stockday.util.FindUtil39;
import com.stock.stockday.util.FindUtil4;
import com.stock.stockday.util.FindUtil40;
import com.stock.stockday.util.FindUtil41;
import com.stock.stockday.util.FindUtil42;
import com.stock.stockday.util.FindUtil44;
import com.stock.stockday.util.FindUtil45;
import com.stock.stockday.util.FindUtil46;
import com.stock.stockday.util.FindUtil47;
import com.stock.stockday.util.FindUtil49;
import com.stock.stockday.util.FindUtil5;
import com.stock.stockday.util.FindUtil50;
import com.stock.stockday.util.FindUtil51;
import com.stock.stockday.util.FindUtil53;
import com.stock.stockday.util.FindUtil54;
import com.stock.stockday.util.FindUtil55;
import com.stock.stockday.util.FindUtil56;
import com.stock.stockday.util.FindUtil57;
import com.stock.stockday.util.FindUtil59;
import com.stock.stockday.util.FindUtil6;
import com.stock.stockday.util.FindUtil60;
import com.stock.stockday.util.FindUtil61;
import com.stock.stockday.util.FindUtil62;
import com.stock.stockday.util.FindUtil63;
import com.stock.stockday.util.FindUtil65;
import com.stock.stockday.util.FindUtil66;
import com.stock.stockday.util.FindUtil67;
import com.stock.stockday.util.FindUtil68;
import com.stock.stockday.util.FindUtil69;
import com.stock.stockday.util.FindUtil7;
import com.stock.stockday.util.FindUtil71;
import com.stock.stockday.util.FindUtil72;
import com.stock.stockday.util.FindUtil73;
import com.stock.stockday.util.FindUtil74;
import com.stock.stockday.util.FindUtil76;
import com.stock.stockday.util.FindUtil78;
import com.stock.stockday.util.FindUtil80;
import com.stock.stockday.util.FindUtil87;
import com.stock.stockday.util.FindUtil88;
import com.stock.stockday.util.FindUtil10;
import com.stock.stockday.util.FindUtil13;
import com.stock.stockday.util.FindUtil14;
import com.stock.stockday.util.FindUtil16;
import com.stock.stockday.util.FindUtil18;
import com.stock.stockday.util.FindUtil19;
import com.stock.stockday.util.FindUtil20;
import com.stock.stockday.util.FindUtil21;
import com.stock.stockday.util.FindUtil22;
import com.stock.stockday.util.FindUtil23;
import com.stock.stockday.util.FindUtil24;
import com.stock.stockday.util.FindUtil25;
import com.stock.stockday.util.FindUtil27;
import com.stock.stockday.util.FindUtil28;
import com.stock.stockday.util.FindUtil29;
import com.stock.stockday.util.FindUtil32;
import com.stock.stockday.util.FindUtil90;
import com.stock.stockday.util.FindUtil91;
import com.stock.stockday.util.FindUtil92;
import com.stock.stockday.util.FindUtil93;
import com.stock.stockday.util.FindUtil94;
import com.stock.stockday.util.FindUtil96;
import com.stock.stockday.util.FindUtil97;
import com.stock.stockday.utils.FindUtil100;
import com.stock.stockday.utils.FindUtil101;
import com.stock.stockday.utils.FindUtil102;
import com.stock.stockday.utils.FindUtil105;
import com.stock.stockday.utils.FindUtil98;
import com.stock.stockday.vo.StockDayVo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class YanPanDayServiceListImpl {
    public List<StockDayVo> dayYanPanFunction57(List<StockDayAll> stockDayAllList, List<StockDayScience> stockDayScienceList,List<StockDayAll> stockDayAllListDaPan,List<StockDayScience> stockDayScienceListDaPan, List<StockDayVo> stockDayVoList) throws IOException {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return stockDayVoList;
        }
        StockDayVo stockDayVo = new StockDayVo();
        //排序
        Collections.sort(stockDayAllList, new Comparator<StockDayAll>() {
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
        List<StockDayAll> stockDayAllList1 = new ArrayList<>();
        for (StockDayAll stockDayAll : stockDayAllList) {
            if (stockDayAll.getOpeningPrice().compareTo(new BigDecimal(0))!=0&&stockDayAll.getOpeningPrice() != null && stockDayAll.getLclosePrice() != null&&stockDayAll.getLclosePrice().compareTo(new BigDecimal(0))!=0&&stockDayAll.getChangePoints()!=null) {
                stockDayAllList1.add(stockDayAll);
            }
            if (stockDayAllList1.size() == 50) {
                stockDayVo.setCode(stockDayAllList1.get(0).getCodeEx() + stockDayAllList1.get(0).getCodeId());
                stockDayVo.setDate(DateUtil.get2String(stockDayAllList1.get(0).getDate()));
                List<ScienceEntity> scienceEntityList = new ArrayList<>();
                List<ScienceEntity> scienceEntityListDaPan = new ArrayList<>();
                List<StockDayAll> stockDayAllListDaPan1 = new ArrayList<>();

                //大盘
                for (StockDayAll stockDayAll1:stockDayAllListDaPan){
                    for (StockDayAll stockDayAll2:stockDayAllList1){
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
                    return stockDayVoList;
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
                Collections.sort(stockDayAllList1, new Comparator<StockDayAll>() {
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

                //技术
                if (stockDayAllList1==null||stockDayAllList1.size()<10){
                    return stockDayVoList;
                }
                for (StockDayScience stockDayScience : stockDayScienceList) {
                    if (stockDayAllList1.get(0).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(1).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(2).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(3).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(4).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(5).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(6).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(7).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(8).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(9).getDate().compareTo(stockDayScience.getDate()) == 0) {
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
                boolean flag= FindUtil28.reset20Dapan2(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag1= FindUtil49.jieQiDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag2= FindUtil49.jieQiDapan4(scienceEntityList,scienceEntityListDaPan);
                boolean flag3= FindUtil29.jieQiDapan5(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag4= FindUtil29.jishujieqiDapan7(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag5= FindUtil61.duoTuXiangShangDapan4(scienceEntityList,scienceEntityListDaPan);
                boolean flag6= FindUtil29.jishujieqiDapan6(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag7= FindUtil3.shengVDapan3(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag8= FindUtil54.jieQiDapan20(scienceEntityList,scienceEntityListDaPan);
                boolean flag9= FindUtil51.jieQiDapan16(scienceEntityList,scienceEntityListDaPan);
                boolean flag10= FindUtil21.jishujieqiDapan5(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag11= FindUtil6.reset20Dapan3(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1);
                boolean flag12= FindUtil28.jieQiDapan12(stockDayAllList1,scienceEntityList);
                boolean flag13= FindUtil61.jieQiDapan20(scienceEntityList,scienceEntityListDaPan);
                boolean flag14= FindUtil23.duoTuXiangShangDapan2(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag15= FindUtil7.jishujieqiDapan8(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1);
                boolean flag16= FindUtil22.jishujieqiDapan3(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag17= FindUtil6.duoTuXiangShangDapan3(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1);
                boolean flag18= FindUtil62.reset20Dapan4(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag19= FindUtil59.jieQiDapan21(scienceEntityList,scienceEntityListDaPan);
                boolean flag20= FindUtil47.duoTuXiangShangDapan3( scienceEntityList, scienceEntityListDaPan);
                boolean flag21= FindUtil47.jieQiDapan4(scienceEntityList,scienceEntityListDaPan);
                boolean flag22= FindUtil72.duoTuXiangShangDapan2(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag23= FindUtil73.jieQiDapan22(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag24= FindUtil28.jieQiDapan8(stockDayAllList1,scienceEntityList);
                boolean flag25= FindUtil16.reset20Dapan3(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag26= FindUtil60.jieQiDapan18(scienceEntityList,scienceEntityListDaPan);
                boolean flag27= FindUtil4.jishujieqiDapan8(stockDayAllList1, scienceEntityList, stockDayAllListDaPan1, scienceEntityListDaPan);
                boolean flag28= FindUtil4.jishujieqiDapan3(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag29= FindUtil21.jishujieqiDapan3(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag30= FindUtil6.jieQiDapan7(stockDayAllList1,stockDayAllListDaPan1);
                boolean flag31= FindUtil29.shengVDapan4(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag32= FindUtil56.jieQiDapan22(scienceEntityList,scienceEntityListDaPan);
                boolean flag33= FindUtil50.jieQiDapan18(scienceEntityList,scienceEntityListDaPan);
                boolean flag34= FindUtil5.jishujieqiDapan4(stockDayAllList1, scienceEntityList, stockDayAllListDaPan1, scienceEntityListDaPan);
                boolean flag35= FindUtil66.jieQiDapan13(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag36= FindUtil32.duoTuXiangShangDapan3(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1);
                boolean flag37= FindUtil59.jieQiDapan22(scienceEntityList,scienceEntityListDaPan);
                boolean flag38= FindUtil27.jishujieqiDapan3(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag39= FindUtil74.jieQiDapan10(scienceEntityListDaPan);
                boolean flag40= FindUtil13.jieQiDapan4(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag41= FindUtil72.shengVDapan4(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag42= FindUtil49.shengVDapan2(scienceEntityList,scienceEntityListDaPan);
                boolean flag43= FindUtil5.jishujieqiDapan3(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag44= FindUtil49.reset20Dapan2(scienceEntityList,scienceEntityListDaPan);
                boolean flag45= FindUtil5.jishujieqiDapan6(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag46= FindUtil4.jieQiDapan3(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag47= FindUtil54.jieQiDapan16(scienceEntityList,scienceEntityListDaPan);
                boolean flag48= FindUtil5.jishujieqiDapan7(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag49= FindUtil25.jieQiDapan3(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag50= FindUtil47.jieQiDapan5(scienceEntityList,scienceEntityListDaPan);
                boolean flag51= FindUtil47.jishujieqiDapan5(scienceEntityList,scienceEntityListDaPan);
                boolean flag52= FindUtil51.jieQiDapan12(scienceEntityList,scienceEntityListDaPan);
                boolean flag53= FindUtil5.jishujieqiDapan8(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag54= FindUtil55.jieQiDapan19(scienceEntityList,scienceEntityListDaPan);
                boolean flag55= FindUtil5.jieQiDapan4(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag56= FindUtil23.reset20Dapan2(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag57= FindUtil66.reset20Dapan4(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag58= FindUtil76.duoTuXiangShangDapan2(scienceEntityList,scienceEntityListDaPan);
                boolean flag59= FindUtil19.shengVDapan2(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag60= FindUtil68.jieQiDapan12(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag61= FindUtil54.shengVDapan4(scienceEntityList,scienceEntityListDaPan);
                boolean flag62= FindUtil29.shengVDapan3(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag63= FindUtil76.jieQiDapan10(scienceEntityList,scienceEntityListDaPan);
                boolean flag64= FindUtil55.jieQiDapan12(scienceEntityList,scienceEntityListDaPan);
                boolean flag65= FindUtil68.jieQiDapan6(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag66= FindUtil74.jishujieqiDapan5(scienceEntityListDaPan);
                boolean flag67= FindUtil60.reset20Dapan4(scienceEntityList,scienceEntityListDaPan);
                boolean flag68= FindUtil67.jieQiDapan19(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag69= FindUtil41.shengVDapan3(stockDayAllList1,scienceEntityList);
                boolean flag70= FindUtil22.jishujieqiDapan4(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag71= FindUtil67.jieQiDapan13(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag72= FindUtil73.duoTuXiangShangDapan4(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag73= FindUtil80.jishujieqiDapan7(scienceEntityList,scienceEntityListDaPan);
                boolean flag74= FindUtil44.jishujieqiDapan5(scienceEntityList,scienceEntityListDaPan);
                boolean flag75= FindUtil44.jieQiDapan5(scienceEntityList,scienceEntityListDaPan);
                boolean flag76= FindUtil55.jieQiDapan22(scienceEntityList,scienceEntityListDaPan);
                boolean flag77= FindUtil22.jishujieqiDapan7(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag78= FindUtil22.jishujieqiDapan6(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag79= FindUtil6.jieQiDapan8(stockDayAllList1,stockDayAllListDaPan1);
                boolean flag80= FindUtil72.jieQiDapan16(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag81= FindUtil54.jieQiDapan19(scienceEntityList,scienceEntityListDaPan);
                boolean flag82= FindUtil29.jieQiDapan6(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag83= FindUtil60.jieQiDapan6(scienceEntityList,scienceEntityListDaPan);
                boolean flag84= FindUtil23.duoTuXiangShangDapan3(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag85= FindUtil16.reset20Dapan4(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag86= FindUtil22.jieQiDapan5(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag87= FindUtil88.jieQiDapan10(scienceEntityList,scienceEntityListDaPan);
                boolean flag88= FindUtil67.jieQiDapan16(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag89= FindUtil28.duoTuXiangShangDapan3(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag90= FindUtil7.jishujieqiDapan9(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1);

                if (flag||flag1||flag2||flag3||flag4||flag5||flag6||flag7||flag8||flag9||flag10||flag11||flag12||flag13||flag14||flag15||flag16||flag17||flag18||flag19||flag20||flag21||flag22||flag23||flag24||flag25||flag26||flag27||flag28||flag29||flag30||flag31||flag32||flag33||flag34||flag35||flag36||flag37||flag38||flag39||flag40||flag41||flag42||flag43||flag44||flag45||flag46||flag47
                        ||flag48||flag49||flag50||flag51||flag52||flag53||flag54||flag55||flag56||flag57||flag58||flag59||flag60||flag61||flag62||flag63||flag64||flag65||flag66||flag67||flag68||flag69||flag70||flag71||flag72||flag73||flag74||flag75||flag76||flag77||flag78||flag79||flag80||flag81||flag82||flag83||flag84||flag85||flag86||flag87
                ||flag88||flag89||flag90){
                    stockDayVoList.add(stockDayVo);
                }
                return stockDayVoList;
            }
        }
        return stockDayVoList;
    }

    public List<StockDayVo> dayYanPanFunction60(List<StockDayAll> stockDayAllList, List<StockDayScience> stockDayScienceList,List<StockDayAll> stockDayAllListDaPan,List<StockDayScience> stockDayScienceListDaPan, List<StockDayVo> stockDayVoList) throws IOException {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return stockDayVoList;
        }
        StockDayVo stockDayVo = new StockDayVo();
        //排序
        Collections.sort(stockDayAllList, new Comparator<StockDayAll>() {
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
        List<StockDayAll> stockDayAllList1 = new ArrayList<>();
        for (StockDayAll stockDayAll : stockDayAllList) {
            if (stockDayAll.getOpeningPrice().compareTo(new BigDecimal(0))!=0&&stockDayAll.getOpeningPrice() != null && stockDayAll.getLclosePrice() != null&&stockDayAll.getLclosePrice().compareTo(new BigDecimal(0))!=0&&stockDayAll.getChangePoints()!=null) {
                stockDayAllList1.add(stockDayAll);
            }
            if (stockDayAllList1.size() == 50) {
                stockDayVo.setCode(stockDayAllList1.get(0).getCodeEx() + stockDayAllList1.get(0).getCodeId());
                stockDayVo.setDate(DateUtil.get2String(stockDayAllList1.get(0).getDate()));
                List<ScienceEntity> scienceEntityList = new ArrayList<>();
                List<ScienceEntity> scienceEntityListDaPan = new ArrayList<>();
                List<StockDayAll> stockDayAllListDaPan1 = new ArrayList<>();

                //大盘
                for (StockDayAll stockDayAll1:stockDayAllListDaPan){
                    for (StockDayAll stockDayAll2:stockDayAllList1){
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
                    return stockDayVoList;
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
                Collections.sort(stockDayAllList1, new Comparator<StockDayAll>() {
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

                //技术
                if (stockDayAllList1==null||stockDayAllList1.size()<10){
                    return stockDayVoList;
                }
                for (StockDayScience stockDayScience : stockDayScienceList) {
                    if (stockDayAllList1.get(0).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(1).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(2).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(3).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(4).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(5).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(6).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(7).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(8).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(9).getDate().compareTo(stockDayScience.getDate()) == 0) {
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
                boolean flag= FindUtil51.duoTuXiangShangDapan4(scienceEntityList,scienceEntityListDaPan);
                boolean flag1= FindUtil25.jishujieqiDapan9(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag2= FindUtil10.duoTuXiangShangDapan4(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3= FindUtil28.duoTuXiangShangDapan4(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag4= FindUtil73.jieQiDapan21(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag5= FindUtil54.jieQiDapan22(scienceEntityList,scienceEntityListDaPan);
                boolean flag6= FindUtil72.jieQiDapan14(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag7= FindUtil10.shengVDapan3(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag8= FindUtil23.duoTuXiangShangDapan4(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag9= FindUtil24.shengVDapan3(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag10= FindUtil90.shengVDapan2(stockDayAllList1, scienceEntityList);
                boolean flag11= FindUtil55.jieQiDapan17(scienceEntityList,scienceEntityListDaPan);
                boolean flag12= FindUtil6.shengVDapan3(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1);
                boolean flag13= FindUtil23.shengVDapan4(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag14= FindUtil16.jieQiDapan9(stockDayAllList1,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag15= FindUtil63.jieQiDapan16(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag16= FindUtil72.jieQiDapan17(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag17= FindUtil16.jieQiDapan10(stockDayAllList1,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag18= FindUtil72.jieQiDapan22(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag19= FindUtil16.jieQiDapan7(stockDayAllList1,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag20= FindUtil42.reset20Dapan2(stockDayAllList1, scienceEntityList);
                boolean flag21= FindUtil23.jieQiDapan5(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag22= FindUtil72.jieQiDapan11(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag23= FindUtil29.jishujieqiDapan8(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag24= FindUtil23.reset20Dapan4(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag25= FindUtil60.jieQiDapan21(scienceEntityList,scienceEntityListDaPan);
                boolean flag26= FindUtil67.jieQiDapan21(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag27= FindUtil28.jishujieqiDapan4(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag28= FindUtil21.jishujieqiDapan9(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag29= FindUtil25.jishujieqiDapan3(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag30= FindUtil28.jishujieqiDapan6(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag31= FindUtil28.jishujieqiDapan7(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag32= FindUtil67.jieQiDapan22(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag33= FindUtil23.jieQiDapan10(stockDayAllList1,scienceEntityList);
                boolean flag34= FindUtil49.jishujieqiDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag35= FindUtil56.jishujieqiDapan6(scienceEntityList,scienceEntityListDaPan);
                boolean flag36= FindUtil23.jieQiDapan6(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag37= FindUtil21.jishujieqiDapan8(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag38= FindUtil29.jieQiDapan3(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag39= FindUtil66.jieQiDapan12(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag40= FindUtil28.jishujieqiDapan3(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag41= FindUtil23.jieQiDapan9(stockDayAllList1,scienceEntityList);
                boolean flag42= FindUtil72.jishujieqiDapan8(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag43= FindUtil10.jieQiDapan8(stockDayAllList1,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag44= FindUtil66.jishujieqiDapan9(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag45= FindUtil91.jieQiDapan10(stockDayAllList1,scienceEntityList);
                boolean flag46= FindUtil38.jishujieqiDapan9(stockDayAllList1,scienceEntityList);
                boolean flag47= FindUtil61.jieQiDapan17(scienceEntityList,scienceEntityListDaPan);
                boolean flag48= FindUtil10.jieQiDapan9(stockDayAllList1,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag49= FindUtil63.jieQiDapan6(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag50= FindUtil10.jishujieqiDapan5(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag51= FindUtil10.jieQiDapan7(stockDayAllList1,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag52= FindUtil29.jishujieqiDapan3(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag53= FindUtil10.jieQiDapan10(stockDayAllList1,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag54= FindUtil20.jishujieqiDapan9(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag55= FindUtil25.jishujieqiDapan4(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag56= FindUtil25.jishujieqiDapan8(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag57= FindUtil72.jieQiDapan12(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag58= FindUtil66.duoTuXiangShangDapan4(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag59= FindUtil29.jishujieqiDapan9(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag60= FindUtil90.jieQiDapan10(stockDayAllList1,scienceEntityList);
                boolean flag61= FindUtil25.jishujieqiDapan7(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag62= FindUtil25.jishujieqiDapan6(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag63= FindUtil50.jieQiDapan11(scienceEntityList,scienceEntityListDaPan);
                boolean flag64= FindUtil6.jishujieqiDapan3(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1);
                boolean flag65= FindUtil74.shengVDapan2(scienceEntityListDaPan);
                boolean flag66= FindUtil66.jieQiDapan14(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag67= FindUtil41.shengVDapan4(stockDayAllList1,scienceEntityList);
                boolean flag68= FindUtil67.jieQiDapan14(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag69= FindUtil66.jieQiDapan15(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag70= FindUtil38.duoTuXiangShangDapan2(stockDayAllList1,scienceEntityList);
                boolean flag71= FindUtil66.jishujieqiDapan7(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag72= FindUtil62.jieQiDapan9(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag73= FindUtil59.jieQiDapan17(scienceEntityList,scienceEntityListDaPan);
                boolean flag74= FindUtil29.jieQiDapan4(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag75= FindUtil35.shengVDapan4(stockDayAllList1, scienceEntityList, stockDayAllListDaPan1);
                boolean flag76= FindUtil23.shengVDapan2(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag77= FindUtil28.jieQiDapan3(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag78= FindUtil21.jishujieqiDapan4(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag79= FindUtil51.jishujieqiDapan7(scienceEntityList,scienceEntityListDaPan);
                boolean flag80= FindUtil4.jishujieqiDapan9(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag81= FindUtil10.duoTuXiangShangDapan3(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag82= FindUtil72.jieQiDapan15(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag83= FindUtil63.jieQiDapan11(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag84= FindUtil20.jishujieqiDapan8(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag85= FindUtil20.jishujieqiDapan3(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag86= FindUtil23.shengVDapan3(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag87= FindUtil23.jieQiDapan7(stockDayAllList1,scienceEntityList);
                boolean flag88= FindUtil22.jishujieqiDapan8(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag89= FindUtil21.jishujieqiDapan6(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag90= FindUtil21.jishujieqiDapan7(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag91= FindUtil55.jieQiDapan20(scienceEntityList,scienceEntityListDaPan);
                boolean flag92= FindUtil76.jishujieqiDapan4(scienceEntityList,scienceEntityListDaPan);
                boolean flag93= FindUtil29.reset20Dapan4(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag94= FindUtil76.jieQiDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag95= FindUtil56.jieQiDapan20(scienceEntityList,scienceEntityListDaPan);
                boolean flag96= FindUtil56.shengVDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag97= FindUtil62.jieQiDapan11(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag98= FindUtil41.reset20Dapan2(stockDayAllList1,scienceEntityList);
                boolean flag99= FindUtil91.jieQiDapan14(stockDayAllList1,scienceEntityList);
                boolean flag100= FindUtil5.jishujieqiDapan9(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag101= FindUtil46.duoTuXiangShangDapan2( scienceEntityList, scienceEntityListDaPan);
                boolean flag102= FindUtil45.jieQiDapan9(scienceEntityList, scienceEntityListDaPan);
                boolean flag103= FindUtil66.jieQiDapan7(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag104= FindUtil41.duoTuXiangShangDapan4(stockDayAllList1,scienceEntityList);
                boolean flag105= FindUtil67.jieQiDapan20(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag106= FindUtil29.jishujieqiDapan4(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag107= FindUtil10.jieQiDapan6(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag108= FindUtil22.jishujieqiDapan9(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag109= FindUtil94.shengVDapan2(stockDayAllListDaPan1,scienceEntityListDaPan);


                if (flag||flag1||flag2||flag3||flag4||flag5||flag6||flag7||flag8||flag9||flag10||flag11||flag12||flag13||flag14||flag15||flag16||flag17||flag18||flag19||flag20||flag21||flag22||flag23||flag24||flag25||flag26||flag27||flag28||flag29||flag30||flag31||flag32||flag33||flag34||flag35||flag36||flag37||flag38||flag39||flag40||flag41||flag42||flag43||
                flag44||flag45||flag46||flag47||flag48||flag49||flag50||flag51||flag52||flag53||flag54||flag55||flag56||flag57||flag58||flag59||flag60||flag61||flag62||flag63||flag64||flag65||flag66||flag67||flag68||flag69||flag70||flag71||flag72||flag73||flag74||flag75||flag76||flag77||flag78||flag79||flag80||flag81||flag82
                        ||flag83||flag84||flag85||flag86||flag87||flag88||flag89||flag90||flag91||flag92||flag93||flag94||flag95||flag96||flag97||flag98||flag99||flag100||flag101||flag102||flag103||flag104||flag105||flag106||flag107||flag108||flag109){
                    stockDayVoList.add(stockDayVo);
                }
                return stockDayVoList;
            }
        }
        return stockDayVoList;
    }

    public List<StockDayVo> dayYanPanFunction62(List<StockDayAll> stockDayAllList, List<StockDayScience> stockDayScienceList,List<StockDayAll> stockDayAllListDaPan,List<StockDayScience> stockDayScienceListDaPan, List<StockDayVo> stockDayVoList) throws IOException {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return stockDayVoList;
        }
        StockDayVo stockDayVo = new StockDayVo();
        //排序
        Collections.sort(stockDayAllList, new Comparator<StockDayAll>() {
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
        List<StockDayAll> stockDayAllList1 = new ArrayList<>();
        for (StockDayAll stockDayAll : stockDayAllList) {
            if (stockDayAll.getOpeningPrice().compareTo(new BigDecimal(0))!=0&&stockDayAll.getOpeningPrice() != null && stockDayAll.getLclosePrice() != null&&stockDayAll.getLclosePrice().compareTo(new BigDecimal(0))!=0&&stockDayAll.getChangePoints()!=null) {
                stockDayAllList1.add(stockDayAll);
            }
            if (stockDayAllList1.size() == 50) {
                stockDayVo.setCode(stockDayAllList1.get(0).getCodeEx() + stockDayAllList1.get(0).getCodeId());
                stockDayVo.setDate(DateUtil.get2String(stockDayAllList1.get(0).getDate()));
                List<ScienceEntity> scienceEntityList = new ArrayList<>();
                List<ScienceEntity> scienceEntityListDaPan = new ArrayList<>();
                List<StockDayAll> stockDayAllListDaPan1 = new ArrayList<>();

                //大盘
                for (StockDayAll stockDayAll1:stockDayAllListDaPan){
                    for (StockDayAll stockDayAll2:stockDayAllList1){
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
                    return stockDayVoList;
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
                Collections.sort(stockDayAllList1, new Comparator<StockDayAll>() {
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

                //技术
                if (stockDayAllList1==null||stockDayAllList1.size()<10){
                    return stockDayVoList;
                }
                for (StockDayScience stockDayScience : stockDayScienceList) {
                    if (stockDayAllList1.get(0).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(1).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(2).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(3).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(4).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(5).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(6).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(7).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(8).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(9).getDate().compareTo(stockDayScience.getDate()) == 0) {
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


                boolean flag= FindUtil10.reset20Dapan2(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag1= FindUtil16.jishujieqiDapan9(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2= FindUtil24.shengVDapan4(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag3= FindUtil13.reset20Dapan4(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag4= FindUtil23.jishujieqiDapan6(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag5= FindUtil23.jishujieqiDapan7(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag6= FindUtil23.jishujieqiDapan4(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag7= FindUtil28.jishujieqiDapan9(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag8= FindUtil28.jishujieqiDapan8(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag9= FindUtil18.jieQiDapan5(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag10= FindUtil27.jishujieqiDapan8(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag11= FindUtil24.shengVDapan2(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag12= FindUtil23.jieQiDapan4(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag13= FindUtil18.jieQiDapan4(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag14= FindUtil10.jishujieqiDapan7(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag15= FindUtil6.reset20Dapan2(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1);
                boolean flag16= FindUtil6.jishujieqiDapan7(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1);
                boolean flag17= FindUtil6.jishujieqiDapan6(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1);
                boolean flag18= FindUtil39.jishujieqiDapan9(stockDayAllList1,scienceEntityList);
                boolean flag19= FindUtil13.jieQiDapan3(stockDayAllList1, scienceEntityList, stockDayAllListDaPan1, scienceEntityListDaPan);
                boolean flag20= FindUtil56.jieQiDapan10(scienceEntityList,scienceEntityListDaPan);
                boolean flag21= FindUtil67.shengVDapan4(stockDayAllList1, scienceEntityList,scienceEntityListDaPan);
                boolean flag22= FindUtil53.jieQiDapan21(scienceEntityList,scienceEntityListDaPan);
                boolean flag23= FindUtil56.jieQiDapan17(scienceEntityList,scienceEntityListDaPan);
                boolean flag24= FindUtil62.jieQiDapan19(stockDayAllList1, scienceEntityList,scienceEntityListDaPan);
                boolean flag25= FindUtil69.jieQiDapan7(stockDayAllList1, scienceEntityList, scienceEntityListDaPan);
                boolean flag26= FindUtil68.duoTuXiangShangDapan4(stockDayAllList1, scienceEntityList,scienceEntityListDaPan);
                boolean flag27= FindUtil53.jieQiDapan17(scienceEntityList,scienceEntityListDaPan);
                boolean flag28= FindUtil60.jieQiDapan9(scienceEntityList,scienceEntityListDaPan);
                boolean flag29= FindUtil54.reset20Dapan4(scienceEntityList,scienceEntityListDaPan);
                boolean flag30= FindUtil53.jieQiDapan18(scienceEntityList,scienceEntityListDaPan);
                boolean flag31= FindUtil72.jieQiDapan11(stockDayAllList1, scienceEntityList,scienceEntityListDaPan);
                boolean flag32= FindUtil50.jieQiDapan12(scienceEntityList,scienceEntityListDaPan);
                boolean flag33= FindUtil65.jieQiDapan19(stockDayAllList1, scienceEntityList,scienceEntityListDaPan);
                boolean flag34= FindUtil51.jieQiDapan18(scienceEntityList,scienceEntityListDaPan);
                boolean flag35= FindUtil72.jishujieqiDapan5(stockDayAllList1, scienceEntityList, scienceEntityListDaPan);
                boolean flag36= FindUtil66.jieQiDapan16(stockDayAllList1, scienceEntityList,scienceEntityListDaPan);
                boolean flag37= FindUtil66.jieQiDapan19(stockDayAllList1, scienceEntityList, scienceEntityListDaPan);
                boolean flag38= FindUtil61.jieQiDapan18(scienceEntityList, scienceEntityListDaPan);
                boolean flag39= FindUtil54.jieQiDapan8(scienceEntityList, scienceEntityListDaPan);
                boolean flag40= FindUtil87.jieQiDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag41= FindUtil76.jieQiDapan4(scienceEntityList,scienceEntityListDaPan);
                boolean flag42= FindUtil88.shengVDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag43= FindUtil80.jieQiDapan10(scienceEntityList,scienceEntityListDaPan);
                boolean flag44= FindUtil78.shengVDapan2(scienceEntityList,scienceEntityListDaPan);
                boolean flag45= FindUtil93.jieQiDapan10(stockDayAllList1, scienceEntityList);
                boolean flag46= FindUtil41.jishujieqiDapan7(stockDayAllList1, scienceEntityList);
                boolean flag47= FindUtil92.jieQiDapan10(stockDayAllList1, scienceEntityList);
                boolean flag48= FindUtil15.duoTuXiangShangDapan4(stockDayAllList1, scienceEntityList,stockDayAllListDaPan1 ,scienceEntityListDaPan);
                boolean flag49= FindUtil66.jieQiDapan22(stockDayAllList1, scienceEntityList, scienceEntityListDaPan);
                boolean flag50= FindUtil40.jishujieqiDapan4(stockDayAllList1, scienceEntityList);
                boolean flag51= FindUtil66.jieQiDapan20(stockDayAllList1, scienceEntityList, scienceEntityListDaPan);
                boolean flag52= FindUtil42.jishujieqiDapan8(stockDayAllList1, scienceEntityList);
                boolean flag53= FindUtil40.jieQiDapan5(stockDayAllList1, scienceEntityList);
                boolean flag54= FindUtil73.jishujieqiDapan6(stockDayAllList1, scienceEntityList, scienceEntityListDaPan);
                boolean flag55= FindUtil91.shengVDapan2(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag56= FindUtil91.shengVDapan3(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag57= FindUtil98.jieQiDapan5(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag58= FindUtil101.jieQiDapan44(stockDayAllList1, scienceEntityList);
                boolean flag59= FindUtil102.jishujieqiDapan6(stockDayAllListDaPan1, scienceEntityListDaPan);
                boolean flag60= FindUtil102.duoTuXiangShangDapan4(stockDayAllListDaPan1, scienceEntityListDaPan);
                boolean flag61= FindUtil102.jishujieqiDapan9(stockDayAllListDaPan1, scienceEntityListDaPan);
                boolean flag62= FindUtil102.jieQiDapan10(stockDayAllListDaPan1, scienceEntityListDaPan);
                boolean flag63= FindUtil102.jieQiDapan15(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag64= FindUtil102.jieQiDapan30(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag65= FindUtil102.jieQiDapan45(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag66= FindUtil105.duoTuXiangShangDapan4(stockDayAllList1,scienceEntityList);
                boolean flag67= FindUtil105.shengVDapan4(stockDayAllList1,scienceEntityList);
                boolean flag68= FindUtil105.jieQiDapan15(stockDayAllList1,scienceEntityList);
                boolean flag69= FindUtil105.jieQiDapan30(stockDayAllList1,scienceEntityList);
                boolean flag70= FindUtil105.jieQiDapan45(stockDayAllList1,scienceEntityList);

                if (flag||flag1||flag2||flag3||flag4||flag5||flag6||flag7||flag8||flag9||flag10||flag11||flag12||flag13||flag14||flag15||flag16||flag17||flag18||flag19||flag20||flag21||flag22||flag23||flag24||flag25||flag26||flag27||flag28||flag29||flag30||flag31||flag32||flag33||flag34||flag35||flag36||flag37||flag38||flag39||flag40||flag41||flag42||flag43||
                flag44||flag45||flag46||flag47||flag48||flag49||flag50||flag51||flag52||flag53||flag54||flag55||flag56||flag57||flag58||flag59||flag60||flag61||flag62||flag63||flag64||flag65||flag66||flag67||flag68||flag69||flag70){
                    stockDayVoList.add(stockDayVo);
                }
                return stockDayVoList;
            }
        }
        return stockDayVoList;
    }

    public List<StockDayVo> dayYanPanFunction65(List<StockDayAll> stockDayAllList, List<StockDayScience> stockDayScienceList,List<StockDayAll> stockDayAllListDaPan,List<StockDayScience> stockDayScienceListDaPan, List<StockDayVo> stockDayVoList) throws IOException {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return stockDayVoList;
        }
        StockDayVo stockDayVo = new StockDayVo();
        //排序
        Collections.sort(stockDayAllList, new Comparator<StockDayAll>() {
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
        List<StockDayAll> stockDayAllList1 = new ArrayList<>();
        for (StockDayAll stockDayAll : stockDayAllList) {
            if (stockDayAll.getOpeningPrice().compareTo(new BigDecimal(0))!=0&&stockDayAll.getOpeningPrice() != null && stockDayAll.getLclosePrice() != null&&stockDayAll.getLclosePrice().compareTo(new BigDecimal(0))!=0&&stockDayAll.getChangePoints()!=null) {
                stockDayAllList1.add(stockDayAll);
            }
            if (stockDayAllList1.size() == 50) {
                stockDayVo.setCode(stockDayAllList1.get(0).getCodeEx() + stockDayAllList1.get(0).getCodeId());
                stockDayVo.setDate(DateUtil.get2String(stockDayAllList1.get(0).getDate()));
                List<ScienceEntity> scienceEntityList = new ArrayList<>();
                List<ScienceEntity> scienceEntityListDaPan = new ArrayList<>();
                List<StockDayAll> stockDayAllListDaPan1 = new ArrayList<>();

                //大盘
                for (StockDayAll stockDayAll1:stockDayAllListDaPan){
                    for (StockDayAll stockDayAll2:stockDayAllList1){
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
                    return stockDayVoList;
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
                Collections.sort(stockDayAllList1, new Comparator<StockDayAll>() {
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

                //技术
                if (stockDayAllList1==null||stockDayAllList1.size()<10){
                    return stockDayVoList;
                }
                for (StockDayScience stockDayScience : stockDayScienceList) {
                    if (stockDayAllList1.get(0).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(1).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(2).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(3).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(4).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(5).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(6).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(7).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(8).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(9).getDate().compareTo(stockDayScience.getDate()) == 0) {
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


                boolean flag= FindUtil69.jieQiDapan14(stockDayAllList1, scienceEntityList, scienceEntityListDaPan);
                boolean flag1= FindUtil23.jishujieqiDapan8(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag2= FindUtil10.jieQiDapan6(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3= FindUtil10.jishujieqiDapan8(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag4= FindUtil10.jishujieqiDapan3(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag5= FindUtil23.jishujieqiDapan3(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag6= FindUtil23.jishujieqiDapan9(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag7= FindUtil3.shengVDapan2(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag8= FindUtil6.jieQiDapan5(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1);
                boolean flag9= FindUtil16.jieQiDapan3(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag10= FindUtil16.jieQiDapan6(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag11= FindUtil6.duoTuXiangShangDapan2(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1);
                boolean flag12= FindUtil6.jishujieqiDapan4(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1);
                boolean flag13= FindUtil53.jieQiDapan20(scienceEntityList,scienceEntityListDaPan);
                boolean flag14= FindUtil51.jieQiDapan21(scienceEntityList,scienceEntityListDaPan);
                boolean flag15= FindUtil56.jishujieqiDapan8(scienceEntityList,scienceEntityListDaPan);
                boolean flag16= FindUtil53.jieQiDapan19(scienceEntityList,scienceEntityListDaPan);
                boolean flag17= FindUtil55.jieQiDapan18(scienceEntityList,scienceEntityListDaPan);
                boolean flag18= FindUtil51.jishujieqiDapan6(scienceEntityList,scienceEntityListDaPan);
                boolean flag19= FindUtil51.jieQiDapan20(scienceEntityList,scienceEntityListDaPan);
                boolean flag20= FindUtil72.jieQiDapan6(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag21= FindUtil51.jishujieqiDapan9(scienceEntityList,scienceEntityListDaPan);
                boolean flag22= FindUtil51.jieQiDapan17(scienceEntityList,scienceEntityListDaPan);
                boolean flag23= FindUtil54.jishujieqiDapan8(scienceEntityList,scienceEntityListDaPan);
                boolean flag24= FindUtil51.jieQiDapan7(scienceEntityList,scienceEntityListDaPan);
                boolean flag25= FindUtil59.jieQiDapan18(scienceEntityList,scienceEntityListDaPan);
                boolean flag26= FindUtil76.jishujieqiDapan3( scienceEntityList, scienceEntityListDaPan);
                boolean flag27= FindUtil63.jieQiDapan17(stockDayAllList1, scienceEntityList, scienceEntityListDaPan);
                boolean flag28= FindUtil41.jishujieqiDapan3(stockDayAllList1, scienceEntityList);
                boolean flag29= FindUtil13.duoTuXiangShangDapan2(stockDayAllList1, scienceEntityList,stockDayAllListDaPan1 ,scienceEntityListDaPan);
                boolean flag30= FindUtil66.jieQiDapan11(stockDayAllList1, scienceEntityList, scienceEntityListDaPan);
                boolean flag31= FindUtil32.jieQiDapan5(stockDayAllList1, scienceEntityList, stockDayAllListDaPan1);
                boolean flag32= FindUtil50.jieQiDapan17( scienceEntityList, scienceEntityListDaPan);
                boolean flag33= FindUtil72.jieQiDapan18(stockDayAllList1, scienceEntityList, scienceEntityListDaPan);
                boolean flag34= FindUtil93.jishujieqiDapan5(stockDayAllList1, scienceEntityList);
                boolean flag35= FindUtil51.reset20Dapan2( scienceEntityList, scienceEntityListDaPan);
                boolean flag36= FindUtil80.reset20Dapan2( scienceEntityList, scienceEntityListDaPan);
                boolean flag37= FindUtil65.shengVDapan4(stockDayAllList1, scienceEntityList, scienceEntityListDaPan);
                boolean flag38= FindUtil62.jieQiDapan22(stockDayAllList1, scienceEntityList, scienceEntityListDaPan);
                boolean flag39= FindUtil56.jieQiDapan6(scienceEntityList, scienceEntityListDaPan);
                boolean flag40= FindUtil25.shengVDapan4(stockDayAllList1, scienceEntityList, scienceEntityListDaPan);
                boolean flag41= FindUtil13.shengVDapan4(stockDayAllList1, scienceEntityList,stockDayAllListDaPan1 ,scienceEntityListDaPan);
                boolean flag42= FindUtil56.jieQiDapan21( scienceEntityList, scienceEntityListDaPan);
                boolean flag43= FindUtil66.jieQiDapan21(stockDayAllList1, scienceEntityList, scienceEntityListDaPan);
                boolean flag44= FindUtil23.jieQiDapan3(stockDayAllList1, scienceEntityList, scienceEntityListDaPan);
                boolean flag45= FindUtil90.jieQiDapan14(stockDayAllList1, scienceEntityList);
                boolean flag46= FindUtil65.jieQiDapan16(stockDayAllList1, scienceEntityList, scienceEntityListDaPan);
                boolean flag47= FindUtil76.shengVDapan2(scienceEntityList, scienceEntityListDaPan);
                boolean flag48= FindUtil53.duoTuXiangShangDapan4(scienceEntityList, scienceEntityListDaPan);
                boolean flag49= FindUtil51.jieQiDapan19(scienceEntityList, scienceEntityListDaPan);
                boolean flag50= FindUtil39.jishujieqiDapan7(stockDayAllList1, scienceEntityList);
                boolean flag51= FindUtil90.shengVDapan3(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag52= FindUtil94.shengVDapan3(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag53= FindUtil97.jishujieqiDapan6(stockDayAllList1,scienceEntityList);
                boolean flag54= FindUtil102.jieQiDapan33(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag55= FindUtil102.jieQiDapan34(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag56= FindUtil102.jishujieqiDapan6(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag57= FindUtil102.jieQiDapan15(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag58= FindUtil102.jieQiDapan30(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag59= FindUtil102.jieQiDapan45(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag60= FindUtil105.jieQiDapan33(stockDayAllList1,scienceEntityList);
                boolean flag61= FindUtil105.jieQiDapan34(stockDayAllList1,scienceEntityList);

                if (flag||flag1||flag2||flag3||flag4||flag5||flag6||flag7||flag8||flag9||flag10||flag11||flag12||flag13||flag14||flag15||flag16||flag17||flag18||flag19||flag20||flag21||flag22||flag23||flag24||flag25||flag26
                        ||flag27||flag28||flag29||flag30||flag31||flag32||flag33||flag34||flag35||flag36||flag37||flag38||flag39||flag40||flag41||flag42||flag43||flag44||flag45||flag46||flag47||flag48||flag49||flag50||flag51||
                flag52||flag53||flag54||flag55||flag56||flag57||flag58||flag59||flag60||flag61){
                    stockDayVoList.add(stockDayVo);
                }
                return stockDayVoList;
            }
        }
        return stockDayVoList;
    }

    public List<StockDayVo> dayYanPanFunction67(List<StockDayAll> stockDayAllList, List<StockDayScience> stockDayScienceList,List<StockDayAll> stockDayAllListDaPan,List<StockDayScience> stockDayScienceListDaPan, List<StockDayVo> stockDayVoList) throws IOException {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return stockDayVoList;
        }
        StockDayVo stockDayVo = new StockDayVo();
        //排序
        Collections.sort(stockDayAllList, new Comparator<StockDayAll>() {
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
        List<StockDayAll> stockDayAllList1 = new ArrayList<>();
        for (StockDayAll stockDayAll : stockDayAllList) {
            if (stockDayAll.getOpeningPrice().compareTo(new BigDecimal(0))!=0&&stockDayAll.getOpeningPrice() != null && stockDayAll.getLclosePrice() != null&&stockDayAll.getLclosePrice().compareTo(new BigDecimal(0))!=0&&stockDayAll.getChangePoints()!=null) {
                stockDayAllList1.add(stockDayAll);
            }
            if (stockDayAllList1.size() == 50) {
                stockDayVo.setCode(stockDayAllList1.get(0).getCodeEx() + stockDayAllList1.get(0).getCodeId());
                stockDayVo.setDate(DateUtil.get2String(stockDayAllList1.get(0).getDate()));
                List<ScienceEntity> scienceEntityList = new ArrayList<>();
                List<ScienceEntity> scienceEntityListDaPan = new ArrayList<>();
                List<StockDayAll> stockDayAllListDaPan1 = new ArrayList<>();

                //大盘
                for (StockDayAll stockDayAll1:stockDayAllListDaPan){
                    for (StockDayAll stockDayAll2:stockDayAllList1){
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
                    return stockDayVoList;
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
                Collections.sort(stockDayAllList1, new Comparator<StockDayAll>() {
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

                //技术
                if (stockDayAllList1==null||stockDayAllList1.size()<10){
                    return stockDayVoList;
                }
                for (StockDayScience stockDayScience : stockDayScienceList) {
                    if (stockDayAllList1.get(0).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(1).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(2).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(3).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(4).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(5).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(6).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(7).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(8).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(9).getDate().compareTo(stockDayScience.getDate()) == 0) {
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



                boolean flag= FindUtil13.shengVDapan2(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag1= FindUtil19.jieQiDapan3(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag2= FindUtil10.shengVDapan4(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3= FindUtil16.jishujieqiDapan8(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag4= FindUtil32.jieQiDapan4(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1);
                boolean flag5= FindUtil32.jishujieqiDapan4(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1);
                boolean flag6= FindUtil10.jieQiDapan3(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag7= FindUtil16.duoTuXiangShangDapan2(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag8= FindUtil10.jieQiDapan4(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag9= FindUtil16.jieQiDapan4(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag10= FindUtil10.jishujieqiDapan9(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag11= FindUtil53.jieQiDapan22(scienceEntityList,scienceEntityListDaPan);
                boolean flag12= FindUtil56.reset20Dapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag13= FindUtil41.reset20Dapan3(stockDayAllList1,scienceEntityList);
                boolean flag14= FindUtil51.jishujieqiDapan8(scienceEntityList,scienceEntityListDaPan);
                boolean flag15= FindUtil14.jieQiDapan7(stockDayAllList1,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag16= FindUtil56.jieQiDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag17= FindUtil14.jieQiDapan9(stockDayAllList1,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag18= FindUtil14.jieQiDapan10(stockDayAllList1,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag19= FindUtil51.jishujieqiDapan5(scienceEntityList,scienceEntityListDaPan);
                boolean flag20= FindUtil54.jieQiDapan9( scienceEntityList, scienceEntityListDaPan);
                boolean flag21= FindUtil50.jieQiDapan20( scienceEntityList, scienceEntityListDaPan);
                boolean flag22= FindUtil54.jieQiDapan6(scienceEntityList,scienceEntityListDaPan);
                boolean flag23= FindUtil51.jieQiDapan9(scienceEntityList,scienceEntityListDaPan);
                boolean flag24= FindUtil68.jieQiDapan22(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag25= FindUtil50.jieQiDapan19(scienceEntityList,scienceEntityListDaPan);
                boolean flag26= FindUtil80.jishujieqiDapan6(scienceEntityList,scienceEntityListDaPan);
                boolean flag27= FindUtil88.jishujieqiDapan6(scienceEntityList,scienceEntityListDaPan);
                boolean flag28= FindUtil69.jieQiDapan18(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag29= FindUtil65.jieQiDapan17(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag30= FindUtil71.shengVDapan4(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag31= FindUtil71.jieQiDapan17(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag32= FindUtil72.jieQiDapan21(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag33= FindUtil56.jieQiDapan18(scienceEntityList,scienceEntityListDaPan);
                boolean flag34= FindUtil73.jieQiDapan18(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag35= FindUtil66.jishujieqiDapan5(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag36= FindUtil90.shengVDapan2(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag37= FindUtil102.duoTuXiangShangDapan2(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag38= FindUtil102.shengVDapan4(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag39= FindUtil102.reset20Dapan4(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag40= FindUtil102.jieQiDapan19(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag41= FindUtil105.duoTuXiangShangDapan2(stockDayAllList1,scienceEntityList);
                boolean flag42= FindUtil105.shengVDapan4(stockDayAllList1,scienceEntityList);
                boolean flag43= FindUtil105.reset20Dapan4(stockDayAllList1,scienceEntityList);
                boolean flag44= FindUtil105.jieQiDapan19(stockDayAllList1,scienceEntityList);

                if (flag||flag1||flag2||flag3||flag4||flag5||flag6||flag7||flag8||flag9||flag10||flag11||flag12||flag13||flag14||flag15||flag16||flag17||flag18||flag19||flag20||flag21||flag22||flag23||flag24||flag25||flag26||flag27||flag28||flag29||flag30||flag31||flag32||flag33||flag34||flag35||flag36||flag37
                ||flag38||flag39||flag40||flag41||flag42||flag43||flag44){
                    stockDayVoList.add(stockDayVo);
                }
                return stockDayVoList;
            }
        }
        return stockDayVoList;
    }

    public List<StockDayVo> dayYanPanFunction70(List<StockDayAll> stockDayAllList, List<StockDayScience> stockDayScienceList,List<StockDayAll> stockDayAllListDaPan,List<StockDayScience> stockDayScienceListDaPan, List<StockDayVo> stockDayVoList) throws IOException {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return stockDayVoList;
        }
        StockDayVo stockDayVo = new StockDayVo();
        //排序
        Collections.sort(stockDayAllList, new Comparator<StockDayAll>() {
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
        List<StockDayAll> stockDayAllList1 = new ArrayList<>();
        for (StockDayAll stockDayAll : stockDayAllList) {
            if (stockDayAll.getOpeningPrice().compareTo(new BigDecimal(0))!=0&&stockDayAll.getOpeningPrice() != null && stockDayAll.getLclosePrice() != null&&stockDayAll.getLclosePrice().compareTo(new BigDecimal(0))!=0&&stockDayAll.getChangePoints()!=null) {
                stockDayAllList1.add(stockDayAll);
            }
            if (stockDayAllList1.size() == 50) {
                stockDayVo.setCode(stockDayAllList1.get(0).getCodeEx() + stockDayAllList1.get(0).getCodeId());
                stockDayVo.setDate(DateUtil.get2String(stockDayAllList1.get(0).getDate()));
                List<ScienceEntity> scienceEntityList = new ArrayList<>();
                List<ScienceEntity> scienceEntityListDaPan = new ArrayList<>();
                List<StockDayAll> stockDayAllListDaPan1 = new ArrayList<>();

                //大盘
                for (StockDayAll stockDayAll1:stockDayAllListDaPan){
                    for (StockDayAll stockDayAll2:stockDayAllList1){
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
                    return stockDayVoList;
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
                Collections.sort(stockDayAllList1, new Comparator<StockDayAll>() {
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

                //技术
                if (stockDayAllList1==null||stockDayAllList1.size()<10){
                    return stockDayVoList;
                }
                for (StockDayScience stockDayScience : stockDayScienceList) {
                    if (stockDayAllList1.get(0).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(1).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(2).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(3).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(4).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(5).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(6).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(7).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(8).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(9).getDate().compareTo(stockDayScience.getDate()) == 0) {
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


                boolean flag= FindUtil14.jieQiDapan6(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag1= FindUtil14.shengVDapan2(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2= FindUtil19.jieQiDapan5(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag3= FindUtil19.jishujieqiDapan8(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag4= FindUtil13.jishujieqiDapan9(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag5= FindUtil10.jishujieqiDapan9(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag6= FindUtil19.jieQiDapan4(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag7= FindUtil13.jieQiDapan3(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag8= FindUtil32.reset20Dapan2(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1);
                boolean flag9= FindUtil32.jieQiDapan3(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1);
                boolean flag10= FindUtil32.jieQiDapan4(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1);
                boolean flag11= FindUtil10.jieQiDapan4(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag12= FindUtil10.shengVDapan2(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag13= FindUtil6.duoTuXiangShangDapan2(stockDayAllList1, scienceEntityList, stockDayAllListDaPan1);
                boolean flag14= FindUtil10.jieQiDapan3(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag15= FindUtil14.jieQiDapan4(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag16= FindUtil16.jieQiDapan12(stockDayAllList1,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag17= FindUtil16.jieQiDapan8(stockDayAllList1,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag18= FindUtil16.jieQiDapan5(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag19= FindUtil16.jieQiDapan11(stockDayAllList1,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag20= FindUtil3.shengVDapan4(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag21= FindUtil32.duoTuXiangShangDapan2(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1);
                boolean flag22= FindUtil14.jishujieqiDapan4(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag23= FindUtil13.jishujieqiDapan4(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag24= FindUtil16.jishujieqiDapan7(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag25= FindUtil16.jishujieqiDapan6(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag26= FindUtil16.jishujieqiDapan4(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag27= FindUtil13.duoTuXiangShangDapan4(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag28= FindUtil16.duoTuXiangShangDapan3(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag29= FindUtil13.jishujieqiDapan6(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag30= FindUtil32.jishujieqiDapan3(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1);
                boolean flag31= FindUtil13.jishujieqiDapan7(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag32= FindUtil51.reset20Dapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag33= FindUtil72.duoTuXiangShangDapan2(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag34= FindUtil63.jieQiDapan20(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag35= FindUtil15.jishujieqiDapan9(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag36= FindUtil56.shengVDapan2(scienceEntityList,scienceEntityListDaPan);
                boolean flag37= FindUtil68.jieQiDapan18(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag38= FindUtil14.jishujieqiDapan5(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag39= FindUtil59.jieQiDapan20(scienceEntityList,scienceEntityListDaPan);
                boolean flag40= FindUtil66.jishujieqiDapan6(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag41= FindUtil73.jieQiDapan20(stockDayAllList1, scienceEntityList,  scienceEntityListDaPan);
                boolean flag42= FindUtil63.jieQiDapan19(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag43= FindUtil87.jieQiDapan10(scienceEntityList,scienceEntityListDaPan);
                boolean flag44= FindUtil88.jishujieqiDapan5(scienceEntityList,scienceEntityListDaPan);
                boolean flag45= FindUtil63.jieQiDapan21(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag46= FindUtil66.jieQiDapan6(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag47= FindUtil92.jishujieqiDapan5(stockDayAllList1,scienceEntityList);
                boolean flag48= FindUtil90.jishujieqiDapan5(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag49= FindUtil93.jishujieqiDapan5(stockDayAllList1,scienceEntityListDaPan);
                boolean flag50= FindUtil98.duoTuXiangShangDapan3(stockDayAllListDaPan1,scienceEntityListDaPan);


                if (flag||flag1||flag2||flag3||flag4||flag5||flag6||flag7||flag8||flag9||flag10||flag11||flag12||flag13||flag14||flag15||flag16||flag17||flag18||flag19||flag20||
                flag21||flag22||flag23||flag24||flag25||flag26||flag27||flag28||flag29||flag30||flag31||flag32||flag33||flag34||flag35||flag36||flag37||flag38||flag39||flag40||flag41||flag42||flag43||flag44||flag45||flag46||flag47
                ||flag48||flag49||flag50){
                    stockDayVoList.add(stockDayVo);
                }
                return stockDayVoList;
            }
        }
        return stockDayVoList;
    }

    public List<StockDayVo> dayYanPanFunction72(List<StockDayAll> stockDayAllList, List<StockDayScience> stockDayScienceList,List<StockDayAll> stockDayAllListDaPan,List<StockDayScience> stockDayScienceListDaPan, List<StockDayVo> stockDayVoList) throws IOException {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return stockDayVoList;
        }
        StockDayVo stockDayVo = new StockDayVo();
        //排序
        Collections.sort(stockDayAllList, new Comparator<StockDayAll>() {
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
        List<StockDayAll> stockDayAllList1 = new ArrayList<>();
        for (StockDayAll stockDayAll : stockDayAllList) {
            if (stockDayAll.getOpeningPrice().compareTo(new BigDecimal(0))!=0&&stockDayAll.getOpeningPrice() != null && stockDayAll.getLclosePrice() != null&&stockDayAll.getLclosePrice().compareTo(new BigDecimal(0))!=0&&stockDayAll.getChangePoints()!=null) {
                stockDayAllList1.add(stockDayAll);
            }
            if (stockDayAllList1.size() == 50) {
                stockDayVo.setCode(stockDayAllList1.get(0).getCodeEx() + stockDayAllList1.get(0).getCodeId());
                stockDayVo.setDate(DateUtil.get2String(stockDayAllList1.get(0).getDate()));
                List<ScienceEntity> scienceEntityList = new ArrayList<>();
                List<ScienceEntity> scienceEntityListDaPan = new ArrayList<>();
                List<StockDayAll> stockDayAllListDaPan1 = new ArrayList<>();

                //大盘
                for (StockDayAll stockDayAll1:stockDayAllListDaPan){
                    for (StockDayAll stockDayAll2:stockDayAllList1){
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
                    return stockDayVoList;
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
                Collections.sort(stockDayAllList1, new Comparator<StockDayAll>() {
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

                //技术
                if (stockDayAllList1==null||stockDayAllList1.size()<10){
                    return stockDayVoList;
                }
                for (StockDayScience stockDayScience : stockDayScienceList) {
                    if (stockDayAllList1.get(0).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(1).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(2).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(3).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(4).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(5).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(6).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(7).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(8).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(9).getDate().compareTo(stockDayScience.getDate()) == 0) {
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


                boolean flag= FindUtil13.jishujieqiDapan3(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag1= FindUtil3.shengVDapan4(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2= FindUtil32.duoTuXiangShangDapan2(stockDayAllList1, scienceEntityList, stockDayAllListDaPan1);
                boolean flag3= FindUtil32.jishujieqiDapan3(stockDayAllList1, scienceEntityList, stockDayAllListDaPan1);
                boolean flag4= FindUtil16.jishujieqiDapan9(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag5= FindUtil16.jishujieqiDapan3(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag6= FindUtil51.jieQiDapan6(scienceEntityList,scienceEntityListDaPan);
                boolean flag7= FindUtil69.jieQiDapan22(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag8= FindUtil16.jieQiDapan11(stockDayAllList1,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag9= FindUtil68.jieQiDapan17(stockDayAllList1, scienceEntityList,  scienceEntityListDaPan);
                boolean flag10= FindUtil14.reset20Dapan3(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag11= FindUtil63.jieQiDapan22(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag12= FindUtil68.jieQiDapan21(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag13= FindUtil51.jishujieqiDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag14= FindUtil51.jieQiDapan22(scienceEntityList,scienceEntityListDaPan);
                boolean flag15= FindUtil16.duoTuXiangShangDapan4(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag16= FindUtil14.jieQiDapan8(stockDayAllList1,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag17= FindUtil63.jieQiDapan21(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag18= FindUtil13.jishujieqiDapan9(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag19= FindUtil87.jishujieqiDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag20= FindUtil87.jishujieqiDapan7(scienceEntityList,scienceEntityListDaPan);
                boolean flag21= FindUtil88.jishujieqiDapan7(scienceEntityList,scienceEntityListDaPan);
                boolean flag22= FindUtil87.shengVDapan2(scienceEntityList,scienceEntityListDaPan);
                boolean flag23= FindUtil91.jishujieqiDapan5(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag24= FindUtil94.jieQiDapan5(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag25= FindUtil96.jieQiDapan14(stockDayAllList1, scienceEntityList, scienceEntityListDaPan);
                boolean flag26= FindUtil105.jieQiDapan18(stockDayAllList1,scienceEntityList);

                if (flag||flag1||flag2||flag3||flag4||flag5||flag6||flag7||flag8||flag9||flag10||flag11||flag12||flag13||flag14||flag15||flag16||flag17||flag18||flag19||flag20||flag21||flag22||flag23||flag24||flag25||flag26){
                    stockDayVoList.add(stockDayVo);
                }
                return stockDayVoList;
            }
        }
        return stockDayVoList;
    }

    public List<StockDayVo> dayYanPanFunction75(List<StockDayAll> stockDayAllList, List<StockDayScience> stockDayScienceList,List<StockDayAll> stockDayAllListDaPan,List<StockDayScience> stockDayScienceListDaPan, List<StockDayVo> stockDayVoList) throws IOException {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return stockDayVoList;
        }
        StockDayVo stockDayVo = new StockDayVo();
        //排序
        Collections.sort(stockDayAllList, new Comparator<StockDayAll>() {
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
        List<StockDayAll> stockDayAllList1 = new ArrayList<>();
        for (StockDayAll stockDayAll : stockDayAllList) {
            if (stockDayAll.getOpeningPrice().compareTo(new BigDecimal(0))!=0&&stockDayAll.getOpeningPrice() != null && stockDayAll.getLclosePrice() != null&&stockDayAll.getLclosePrice().compareTo(new BigDecimal(0))!=0&&stockDayAll.getChangePoints()!=null) {
                stockDayAllList1.add(stockDayAll);
            }
            if (stockDayAllList1.size() == 50) {
                stockDayVo.setCode(stockDayAllList1.get(0).getCodeEx() + stockDayAllList1.get(0).getCodeId());
                stockDayVo.setDate(DateUtil.get2String(stockDayAllList1.get(0).getDate()));
                List<ScienceEntity> scienceEntityList = new ArrayList<>();
                List<ScienceEntity> scienceEntityListDaPan = new ArrayList<>();
                List<StockDayAll> stockDayAllListDaPan1 = new ArrayList<>();

                //大盘
                for (StockDayAll stockDayAll1:stockDayAllListDaPan){
                    for (StockDayAll stockDayAll2:stockDayAllList1){
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
                    return stockDayVoList;
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
                Collections.sort(stockDayAllList1, new Comparator<StockDayAll>() {
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

                //技术
                if (stockDayAllList1==null||stockDayAllList1.size()<10){
                    return stockDayVoList;
                }
                for (StockDayScience stockDayScience : stockDayScienceList) {
                    if (stockDayAllList1.get(0).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(1).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(2).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(3).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(4).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(5).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(6).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(7).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(8).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(9).getDate().compareTo(stockDayScience.getDate()) == 0) {
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


                boolean flag= FindUtil14.shengVDapan4(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag1= FindUtil10.jieQiDapan5(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2= FindUtil15.jishujieqiDapan9(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3= FindUtil16.shengVDapan4(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag4= FindUtil14.reset20Dapan4(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag5= FindUtil14.jieQiDapan12(stockDayAllList1,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag6= FindUtil16.jishujieqiDapan3(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag7= FindUtil71.jieQiDapan20(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag8= FindUtil71.jieQiDapan22(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag9= FindUtil51.duoTuXiangShangDapan2(scienceEntityList,scienceEntityListDaPan);
                boolean flag10= FindUtil66.jishujieqiDapan8(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag11= FindUtil14.jieQiDapan6(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag12= FindUtil66.jieQiDapan6(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag13= FindUtil16.jieQiDapan12(stockDayAllList1,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag14= FindUtil16.jieQiDapan8(stockDayAllList1,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag15= FindUtil14.reset20Dapan2(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag16= FindUtil10.jieQiDapan5(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag17= FindUtil57.jieQiDapan17( scienceEntityList,  scienceEntityListDaPan);
                boolean flag18= FindUtil10.jieQiDapan11(stockDayAllList1,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag19= FindUtil96.jishujieqiDapan5(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag20= FindUtil102.jieQiDapan18(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag21= FindUtil102.jieQiDapan37(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag22= FindUtil105.jieQiDapan37(stockDayAllList1,scienceEntityList);

                if (flag||flag1||flag2||flag3||flag4||flag5||flag6||flag7||flag8||flag9||flag10||flag11||flag12||flag13||flag14||flag15||flag16||flag17||flag18||flag19||flag20||flag21||flag22){
                    stockDayVoList.add(stockDayVo);
                }
                return stockDayVoList;
            }
        }
        return stockDayVoList;
    }

    public List<StockDayVo> dayYanPanFunction77(List<StockDayAll> stockDayAllList, List<StockDayScience> stockDayScienceList,List<StockDayAll> stockDayAllListDaPan,List<StockDayScience> stockDayScienceListDaPan, List<StockDayVo> stockDayVoList) throws IOException {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return stockDayVoList;
        }
        StockDayVo stockDayVo = new StockDayVo();
        //排序
        Collections.sort(stockDayAllList, new Comparator<StockDayAll>() {
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
        List<StockDayAll> stockDayAllList1 = new ArrayList<>();
        for (StockDayAll stockDayAll : stockDayAllList) {
            if (stockDayAll.getOpeningPrice().compareTo(new BigDecimal(0))!=0&&stockDayAll.getOpeningPrice() != null && stockDayAll.getLclosePrice() != null&&stockDayAll.getLclosePrice().compareTo(new BigDecimal(0))!=0&&stockDayAll.getChangePoints()!=null) {
                stockDayAllList1.add(stockDayAll);
            }
            if (stockDayAllList1.size() == 50) {
                stockDayVo.setCode(stockDayAllList1.get(0).getCodeEx() + stockDayAllList1.get(0).getCodeId());
                stockDayVo.setDate(DateUtil.get2String(stockDayAllList1.get(0).getDate()));
                List<ScienceEntity> scienceEntityList = new ArrayList<>();
                List<ScienceEntity> scienceEntityListDaPan = new ArrayList<>();
                List<StockDayAll> stockDayAllListDaPan1 = new ArrayList<>();

                //大盘
                for (StockDayAll stockDayAll1:stockDayAllListDaPan){
                    for (StockDayAll stockDayAll2:stockDayAllList1){
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
                    return stockDayVoList;
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
                Collections.sort(stockDayAllList1, new Comparator<StockDayAll>() {
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

                //技术
                if (stockDayAllList1==null||stockDayAllList1.size()<10){
                    return stockDayVoList;
                }
                for (StockDayScience stockDayScience : stockDayScienceList) {
                    if (stockDayAllList1.get(0).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(1).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(2).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(3).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(4).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(5).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(6).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(7).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(8).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(9).getDate().compareTo(stockDayScience.getDate()) == 0) {
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


                boolean flag= FindUtil14.jishujieqiDapan8(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag1= FindUtil16.jieQiDapan11(stockDayAllList1,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2= FindUtil14.reset20Dapan2(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3= FindUtil14.reset20Dapan3(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag4= FindUtil14.jieQiDapan10(stockDayAllList1,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag5= FindUtil14.jieQiDapan9(stockDayAllList1,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag6= FindUtil14.jieQiDapan7(stockDayAllList1,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag7= FindUtil56.jieQiDapan8(scienceEntityList,scienceEntityListDaPan);
                boolean flag8= FindUtil51.shengVDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag9= FindUtil51.jieQiDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag10= FindUtil51.reset20Dapan2(scienceEntityList,scienceEntityListDaPan);
                boolean flag11= FindUtil56.duoTuXiangShangDapan2(scienceEntityList,scienceEntityListDaPan);

                if (flag||flag1||flag2||flag3||flag4||flag5||flag6||flag7||flag8||flag9||flag10||flag11){
                    stockDayVoList.add(stockDayVo);
                }
                return stockDayVoList;
            }
        }
        return stockDayVoList;
    }

    public List<StockDayVo> dayYanPanFunction80(List<StockDayAll> stockDayAllList, List<StockDayScience> stockDayScienceList,List<StockDayAll> stockDayAllListDaPan,List<StockDayScience> stockDayScienceListDaPan, List<StockDayVo> stockDayVoList) throws IOException {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return stockDayVoList;
        }
        StockDayVo stockDayVo = new StockDayVo();
        //排序
        Collections.sort(stockDayAllList, new Comparator<StockDayAll>() {
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
        List<StockDayAll> stockDayAllList1 = new ArrayList<>();
        for (StockDayAll stockDayAll : stockDayAllList) {
            if (stockDayAll.getOpeningPrice().compareTo(new BigDecimal(0))!=0&&stockDayAll.getOpeningPrice() != null && stockDayAll.getLclosePrice() != null&&stockDayAll.getLclosePrice().compareTo(new BigDecimal(0))!=0&&stockDayAll.getChangePoints()!=null) {
                stockDayAllList1.add(stockDayAll);
            }
            if (stockDayAllList1.size() == 50) {
                stockDayVo.setCode(stockDayAllList1.get(0).getCodeEx() + stockDayAllList1.get(0).getCodeId());
                stockDayVo.setDate(DateUtil.get2String(stockDayAllList1.get(0).getDate()));
                List<ScienceEntity> scienceEntityList = new ArrayList<>();
                List<ScienceEntity> scienceEntityListDaPan = new ArrayList<>();
                List<StockDayAll> stockDayAllListDaPan1 = new ArrayList<>();

                //大盘
                for (StockDayAll stockDayAll1:stockDayAllListDaPan){
                    for (StockDayAll stockDayAll2:stockDayAllList1){
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
                    return stockDayVoList;
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
                Collections.sort(stockDayAllList1, new Comparator<StockDayAll>() {
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

                //技术
                if (stockDayAllList1==null||stockDayAllList1.size()<10){
                    return stockDayVoList;
                }
                for (StockDayScience stockDayScience : stockDayScienceList) {
                    if (stockDayAllList1.get(0).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(1).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(2).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(3).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(4).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(5).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(6).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(7).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(8).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(9).getDate().compareTo(stockDayScience.getDate()) == 0) {
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


                boolean flag= FindUtil14.reset20Dapan4(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag1= FindUtil14.jieQiDapan10(stockDayAllList1,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2= FindUtil14.jieQiDapan9(stockDayAllList1,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag3= FindUtil14.jieQiDapan7(stockDayAllList1,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag4= FindUtil14.reset20Dapan2(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag5= FindUtil14.reset20Dapan3(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag6= FindUtil14.jishujieqiDapan5(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag7= FindUtil96.jieQiDapan29(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag8= FindUtil100.jishujieqiDapan5(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag9= FindUtil100.jieQiDapan14(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag10= FindUtil100.jieQiDapan29(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag11= FindUtil100.jieQiDapan44(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag12= FindUtil102.jieQiDapan3(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag13= FindUtil102.jieQiDapan22(stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag14= FindUtil105.jieQiDapan3(stockDayAllList1,scienceEntityList);
                boolean flag15= FindUtil105.jieQiDapan22(stockDayAllList1,scienceEntityList);

                if (flag||flag1||flag2||flag3||flag4||flag5||flag6||flag7||flag8||flag9||flag10||flag11||flag12||flag13||flag14||flag15){
                    stockDayVoList.add(stockDayVo);
                }
                return stockDayVoList;
            }
        }
        return stockDayVoList;
    }

    public List<StockDayVo> dayYanPanFunction85(List<StockDayAll> stockDayAllList, List<StockDayScience> stockDayScienceList,List<StockDayAll> stockDayAllListDaPan,List<StockDayScience> stockDayScienceListDaPan, List<StockDayVo> stockDayVoList) throws IOException {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return stockDayVoList;
        }
        StockDayVo stockDayVo = new StockDayVo();
        //排序
        Collections.sort(stockDayAllList, new Comparator<StockDayAll>() {
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
        List<StockDayAll> stockDayAllList1 = new ArrayList<>();
        for (StockDayAll stockDayAll : stockDayAllList) {
            if (stockDayAll.getOpeningPrice().compareTo(new BigDecimal(0))!=0&&stockDayAll.getOpeningPrice() != null && stockDayAll.getLclosePrice() != null&&stockDayAll.getLclosePrice().compareTo(new BigDecimal(0))!=0&&stockDayAll.getChangePoints()!=null) {
                stockDayAllList1.add(stockDayAll);
            }
            if (stockDayAllList1.size() == 50) {
                stockDayVo.setCode(stockDayAllList1.get(0).getCodeEx() + stockDayAllList1.get(0).getCodeId());
                stockDayVo.setDate(DateUtil.get2String(stockDayAllList1.get(0).getDate()));
                List<ScienceEntity> scienceEntityList = new ArrayList<>();
                List<ScienceEntity> scienceEntityListDaPan = new ArrayList<>();
                List<StockDayAll> stockDayAllListDaPan1 = new ArrayList<>();

                //大盘
                for (StockDayAll stockDayAll1:stockDayAllListDaPan){
                    for (StockDayAll stockDayAll2:stockDayAllList1){
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
                    return stockDayVoList;
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
                Collections.sort(stockDayAllList1, new Comparator<StockDayAll>() {
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

                //技术
                if (stockDayAllList1==null||stockDayAllList1.size()<10){
                    return stockDayVoList;
                }
                for (StockDayScience stockDayScience : stockDayScienceList) {
                    if (stockDayAllList1.get(0).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(1).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(2).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(3).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(4).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(5).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(6).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(7).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(8).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(9).getDate().compareTo(stockDayScience.getDate()) == 0) {
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


                boolean flag= FindUtil14.jieQiDapan6(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag1= FindUtil39.jishujieqiDapan5(stockDayAllList1,scienceEntityList);
                boolean flag2= FindUtil65.jieQiDapan21(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag3= FindUtil56.jishujieqiDapan4(scienceEntityList,scienceEntityListDaPan);
                boolean flag4= FindUtil71.jieQiDapan18(stockDayAllList1, scienceEntityList, scienceEntityListDaPan);
                boolean flag5= FindUtil14.shengVDapan2(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag6= FindUtil16.shengVDapan4(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag7= FindUtil16.jishujieqiDapan9(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag8= FindUtil14.duoTuXiangShangDapan4(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag9= FindUtil63.duoTuXiangShangDapan2(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag10= FindUtil62.jieQiDapan21(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag11= FindUtil69.jieQiDapan17(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag12= FindUtil66.shengVDapan2(stockDayAllList1, scienceEntityList, scienceEntityListDaPan);
                boolean flag13= FindUtil87.reset20Dapan2(scienceEntityList,scienceEntityListDaPan);
                boolean flag14= FindUtil96.jieQiDapan44(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);

                if (flag||flag1||flag2||flag3||flag4||flag5||flag6||flag7||flag8||flag9||flag10||flag11||flag12||flag13||flag14){
                    stockDayVoList.add(stockDayVo);
                }
                return stockDayVoList;
            }
        }
        return stockDayVoList;
    }

    public List<StockDayVo> dayYanPanFunction90(List<StockDayAll> stockDayAllList, List<StockDayScience> stockDayScienceList,List<StockDayAll> stockDayAllListDaPan,List<StockDayScience> stockDayScienceListDaPan, List<StockDayVo> stockDayVoList) throws IOException {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return stockDayVoList;
        }
        StockDayVo stockDayVo = new StockDayVo();
        //排序
        Collections.sort(stockDayAllList, new Comparator<StockDayAll>() {
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
        List<StockDayAll> stockDayAllList1 = new ArrayList<>();
        for (StockDayAll stockDayAll : stockDayAllList) {
            if (stockDayAll.getOpeningPrice().compareTo(new BigDecimal(0))!=0&&stockDayAll.getOpeningPrice() != null && stockDayAll.getLclosePrice() != null&&stockDayAll.getLclosePrice().compareTo(new BigDecimal(0))!=0&&stockDayAll.getChangePoints()!=null) {
                stockDayAllList1.add(stockDayAll);
            }
            if (stockDayAllList1.size() == 50) {
                stockDayVo.setCode(stockDayAllList1.get(0).getCodeEx() + stockDayAllList1.get(0).getCodeId());
                stockDayVo.setDate(DateUtil.get2String(stockDayAllList1.get(0).getDate()));
                List<ScienceEntity> scienceEntityList = new ArrayList<>();
                List<ScienceEntity> scienceEntityListDaPan = new ArrayList<>();
                List<StockDayAll> stockDayAllListDaPan1 = new ArrayList<>();

                //大盘
                for (StockDayAll stockDayAll1:stockDayAllListDaPan){
                    for (StockDayAll stockDayAll2:stockDayAllList1){
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
                    return stockDayVoList;
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
                Collections.sort(stockDayAllList1, new Comparator<StockDayAll>() {
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

                //技术
                if (stockDayAllList1==null||stockDayAllList1.size()<10){
                    return stockDayVoList;
                }
                for (StockDayScience stockDayScience : stockDayScienceList) {
                    if (stockDayAllList1.get(0).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(1).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(2).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(3).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(4).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(5).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(6).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(7).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(8).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(9).getDate().compareTo(stockDayScience.getDate()) == 0) {
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


                boolean flag= FindUtil14.shengVDapan2(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag1= FindUtil15.jishujieqiDapan8(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag2= FindUtil51.reset20Dapan2(scienceEntityList,scienceEntityListDaPan);
                boolean flag3= FindUtil53.jieQiDapan22(scienceEntityList,scienceEntityListDaPan);
                boolean flag4= FindUtil51.duoTuXiangShangDapan2(scienceEntityList,scienceEntityListDaPan);
                boolean flag5= FindUtil56.shengVDapan2(scienceEntityList,scienceEntityListDaPan);
                boolean flag6= FindUtil63.reset20Dapan2(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag7= FindUtil56.jishujieqiDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag8= FindUtil51.duoTuXiangShangDapan3(scienceEntityList,scienceEntityListDaPan);
                boolean flag9= FindUtil65.jieQiDapan22(stockDayAllList1,scienceEntityList,scienceEntityListDaPan);
                boolean flag10= FindUtil14.shengVDapan4(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag11= FindUtil51.jieQiDapan5(scienceEntityList,scienceEntityListDaPan);
                boolean flag12= FindUtil56.jieQiDapan4(scienceEntityList,scienceEntityListDaPan);
                if (flag||flag1||flag2||flag3||flag4||flag5||flag6||flag7||flag8||flag9||flag10||flag11||flag12){
                    stockDayVoList.add(stockDayVo);
                }
                return stockDayVoList;
            }
        }
        return stockDayVoList;
    }

    public List<StockDayVo> dayYanPanFunction100(List<StockDayAll> stockDayAllList, List<StockDayScience> stockDayScienceList,List<StockDayAll> stockDayAllListDaPan,List<StockDayScience> stockDayScienceListDaPan, List<StockDayVo> stockDayVoList) throws IOException {
        if (stockDayAllList == null || stockDayAllList.size() == 0) {
            return stockDayVoList;
        }
        StockDayVo stockDayVo = new StockDayVo();
        //排序
        Collections.sort(stockDayAllList, new Comparator<StockDayAll>() {
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
        List<StockDayAll> stockDayAllList1 = new ArrayList<>();
        for (StockDayAll stockDayAll : stockDayAllList) {
            if (stockDayAll.getOpeningPrice().compareTo(new BigDecimal(0))!=0&&stockDayAll.getOpeningPrice() != null && stockDayAll.getLclosePrice() != null&&stockDayAll.getLclosePrice().compareTo(new BigDecimal(0))!=0&&stockDayAll.getChangePoints()!=null) {
                stockDayAllList1.add(stockDayAll);
            }
            if (stockDayAllList1.size() == 50) {
                stockDayVo.setCode(stockDayAllList1.get(0).getCodeEx() + stockDayAllList1.get(0).getCodeId());
                stockDayVo.setDate(DateUtil.get2String(stockDayAllList1.get(0).getDate()));
                List<ScienceEntity> scienceEntityList = new ArrayList<>();
                List<ScienceEntity> scienceEntityListDaPan = new ArrayList<>();
                List<StockDayAll> stockDayAllListDaPan1 = new ArrayList<>();

                //大盘
                for (StockDayAll stockDayAll1:stockDayAllListDaPan){
                    for (StockDayAll stockDayAll2:stockDayAllList1){
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
                    return stockDayVoList;
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
                Collections.sort(stockDayAllList1, new Comparator<StockDayAll>() {
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

                //技术
                if (stockDayAllList1==null||stockDayAllList1.size()<10){
                    return stockDayVoList;
                }
                for (StockDayScience stockDayScience : stockDayScienceList) {
                    if (stockDayAllList1.get(0).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(1).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(2).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(3).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(4).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(5).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(6).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(7).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(8).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(9).getDate().compareTo(stockDayScience.getDate()) == 0) {
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
                boolean flag= FindUtil14.shengVDapan4(stockDayAllList1,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
                boolean flag1= FindUtil53.jishujieqiDapan7(scienceEntityList,scienceEntityListDaPan);
                boolean flag2= FindUtil56.duoTuXiangShangDapan2(scienceEntityList,scienceEntityListDaPan);
                boolean flag3= FindUtil51.duoTuXiangShangDapan2(scienceEntityList,scienceEntityListDaPan);
                boolean flag4= FindUtil59.reset20Dapan4(scienceEntityList, scienceEntityListDaPan);
                boolean flag5= FindUtil65.jishujieqiDapan7(stockDayAllList1,scienceEntityList, scienceEntityListDaPan);
                boolean flag6= FindUtil51.jieQiDapan4(scienceEntityList,scienceEntityListDaPan);
                boolean flag7= FindUtil51.jishujieqiDapan4(scienceEntityList,scienceEntityListDaPan);
                boolean flag8= FindUtil51.jieQiDapan10(scienceEntityList,scienceEntityListDaPan);
                boolean flag9= FindUtil98.jieQiDapan27(stockDayAllListDaPan1,scienceEntityListDaPan);
                if (flag||flag1||flag2||flag3||flag4||flag5||flag6||flag7||flag8||flag9){
                    stockDayVoList.add(stockDayVo);
                }

                return stockDayVoList;
            }
        }
        return stockDayVoList;
    }
}
