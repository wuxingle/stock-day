package com.stock.stockday.service.find2.yanpan;


import com.stock.apicommon.entity.ScienceEntity;
import com.stock.apicommon.entity.YanPanEntity;
import com.stock.apicommon.utils.patterning.YanPanUtil;
import com.stock.apicommon.vo.YanPanVo;
import com.stock.stockday.entity.StockDayAll;
import com.stock.stockday.entity.StockDayScience;
import com.stock.stockday.entity.StockDayYanPan1;
import com.stock.stockday.service.find2.StockDayYanPan1Service;
import com.stock.stockday.util.FindUtil38;
import com.stock.stockday.util.FindUtil39;
import com.stock.stockday.util.FindUtil40;
import com.stock.stockday.util.FindUtil41;
import com.stock.stockday.util.FindUtil42;
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
public class YanPanDayServiceImpl4 {
    @Autowired
    private StockDayYanPan1Service stockDayYanPan1Service;

    public boolean dayYanPanFunction(List<StockDayAll> stockDayAllList, List<StockDayScience> stockDayScienceList) throws IOException {
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
                for (int i=0;i<stockDayAllList1.size();i++){
                    if (i<60){
                        stockDayAllList2.add(stockDayAllList1.get(i));
                    }else {
                        YanPanEntity yanPanEntity=new YanPanEntity();
                        BeanUtils.copyProperties(stockDayAllList1.get(i),yanPanEntity);
                        yanPanEntityList.add(yanPanEntity);
                    }

                }
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

//                boolean flag= FindUtil.duoTuXiangShang(stockDayAllList2,scienceEntityList);
//                boolean flag2= FindUtil.shengV(stockDayAllList2,scienceEntityList);
//                boolean flag3= FindUtil.reset20(stockDayAllList2,scienceEntityList);
//                boolean flag4= FindUtil.jieQi(stockDayAllList2,scienceEntityList);
//                boolean flag5= FindUtil.jishujieqi(stockDayAllList2,scienceEntityList);
//                boolean flag6= FindUtil.jishujieqi1(stockDayAllList2,scienceEntityList);
//                boolean flag7= FindUtil.jieQi2(stockDayAllList2,scienceEntityList);
//                boolean flag8= FindUtil.duoTuXiangShang2(stockDayAllList2,scienceEntityList);
//                boolean flag9= FindUtil.shengV2(stockDayAllList2,scienceEntityList);
//                boolean flag10= FindUtil.reset202(stockDayAllList2,scienceEntityList);
//                boolean flag11= FindUtil.jieQi3(stockDayAllList2,scienceEntityList);
//                boolean flag12= FindUtil.jishujieqi3(stockDayAllList2,scienceEntityList);
//                boolean flag13= FindUtil.jishujieqi4(stockDayAllList2,scienceEntityList);
//                boolean flag14= FindUtil.jishujieqi5(stockDayAllList2,scienceEntityList);
//                boolean flag15= FindUtil.duoTuXiangShang3(stockDayAllList2,scienceEntityList);
//                boolean flag16= FindUtil.shengV3(stockDayAllList2,scienceEntityList);
//                boolean flag17= FindUtil.reset203(stockDayAllList2,scienceEntityList);
//                boolean flag18= FindUtil.jieQi4(stockDayAllList2,scienceEntityList);
//                boolean flag19= FindUtil.jishujieqi6(stockDayAllList2,scienceEntityList);
//                boolean flag20= FindUtil.jishujieqi7(stockDayAllList2,scienceEntityList);
//                boolean flag21= FindUtil.jieQi5(stockDayAllList2);
//                boolean flag22= FindUtil.jieQi6(stockDayAllList2);
//                boolean flag23= FindUtil.jieQi7(stockDayAllList2);
//                boolean flag24= FindUtil.jieQi8(stockDayAllList2);
//                boolean flag25= FindUtil.jieQi9(stockDayAllList2);
//                boolean flag26= FindUtil.jieQi10(stockDayAllList2);

//                boolean flag27= FindUtil.duoTuXiangShangDapan1(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag28= FindUtil.shengVDapan1(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag29= FindUtil.reset20Dapan1(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag30= FindUtil.jieQiDapan1(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag31= FindUtil.jishujieqiDapan1(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag32= FindUtil.jishujieqiDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);
//                boolean flag33= FindUtil.jieQiDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1,scienceEntityListDaPan);

                boolean flag920= FindUtil38.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList);
                boolean flag921= FindUtil38.shengVDapan2(stockDayAllList2,scienceEntityList);
                boolean flag922= FindUtil38.reset20Dapan2(stockDayAllList2,scienceEntityList);
                boolean flag923= FindUtil38.jieQiDapan3(stockDayAllList2,scienceEntityList);
                boolean flag924= FindUtil38.jishujieqiDapan3(stockDayAllList2,scienceEntityList);
                boolean flag925= FindUtil38.jishujieqiDapan4(stockDayAllList2,scienceEntityList);
                boolean flag926= FindUtil38.jieQiDapan4(stockDayAllList2,scienceEntityList);
                boolean flag927= FindUtil38.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList);
                boolean flag928= FindUtil38.shengVDapan3(stockDayAllList2,scienceEntityList);
                boolean flag930= FindUtil38.reset20Dapan3(stockDayAllList2,scienceEntityList);
                boolean flag931= FindUtil38.jieQiDapan5(stockDayAllList2,scienceEntityList);
                boolean flag932= FindUtil38.jishujieqiDapan5(stockDayAllList2,scienceEntityList);
                boolean flag933= FindUtil38.jishujieqiDapan6(stockDayAllList2,scienceEntityList);
                boolean flag934= FindUtil38.jishujieqiDapan7(stockDayAllList2,scienceEntityList);
                boolean flag935= FindUtil38.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList);
                boolean flag936= FindUtil38.shengVDapan4(stockDayAllList2,scienceEntityList);
                boolean flag937= FindUtil38.reset20Dapan4(stockDayAllList2,scienceEntityList);
                boolean flag938= FindUtil38.jieQiDapan6(stockDayAllList2,scienceEntityList);
                boolean flag940= FindUtil38.jishujieqiDapan8(stockDayAllList2,scienceEntityList);
                boolean flag941= FindUtil38.jishujieqiDapan9(stockDayAllList2,scienceEntityList);

                boolean flag942= FindUtil39.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList);
                boolean flag943= FindUtil39.shengVDapan2(stockDayAllList2,scienceEntityList);
                boolean flag944= FindUtil39.reset20Dapan2(stockDayAllList2,scienceEntityList);
                boolean flag945= FindUtil39.jieQiDapan3(stockDayAllList2,scienceEntityList);
                boolean flag946= FindUtil39.jishujieqiDapan3(stockDayAllList2,scienceEntityList);
                boolean flag947= FindUtil39.jishujieqiDapan4(stockDayAllList2,scienceEntityList);
                boolean flag948= FindUtil39.jieQiDapan4(stockDayAllList2,scienceEntityList);
                boolean flag949= FindUtil39.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList);
                boolean flag950= FindUtil39.shengVDapan3(stockDayAllList2,scienceEntityList);
                boolean flag951= FindUtil39.reset20Dapan3(stockDayAllList2,scienceEntityList);
                boolean flag952= FindUtil39.jieQiDapan5(stockDayAllList2,scienceEntityList);
                boolean flag953= FindUtil39.jishujieqiDapan5(stockDayAllList2,scienceEntityList);
                boolean flag954= FindUtil39.jishujieqiDapan6(stockDayAllList2,scienceEntityList);
                boolean flag955= FindUtil39.jishujieqiDapan7(stockDayAllList2,scienceEntityList);
                boolean flag956= FindUtil39.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList);
                boolean flag957= FindUtil39.shengVDapan4(stockDayAllList2,scienceEntityList);
                boolean flag958= FindUtil39.reset20Dapan4(stockDayAllList2,scienceEntityList);
                boolean flag959= FindUtil39.jieQiDapan6(stockDayAllList2,scienceEntityList);
                boolean flag960= FindUtil39.jishujieqiDapan8(stockDayAllList2,scienceEntityList);
                boolean flag961= FindUtil39.jishujieqiDapan9(stockDayAllList2,scienceEntityList);

                boolean flag962= FindUtil40.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList);
                boolean flag963= FindUtil40.shengVDapan2(stockDayAllList2,scienceEntityList);
                boolean flag964= FindUtil40.reset20Dapan2(stockDayAllList2,scienceEntityList);
                boolean flag965= FindUtil40.jieQiDapan3(stockDayAllList2,scienceEntityList);
                boolean flag966= FindUtil40.jishujieqiDapan3(stockDayAllList2,scienceEntityList);
                boolean flag967= FindUtil40.jishujieqiDapan4(stockDayAllList2,scienceEntityList);
                boolean flag968= FindUtil40.jieQiDapan4(stockDayAllList2,scienceEntityList);
                boolean flag969= FindUtil40.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList);
                boolean flag970= FindUtil40.shengVDapan3(stockDayAllList2,scienceEntityList);
                boolean flag971= FindUtil40.reset20Dapan3(stockDayAllList2,scienceEntityList);
                boolean flag972= FindUtil40.jieQiDapan5(stockDayAllList2,scienceEntityList);

                boolean flag973= FindUtil41.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList);
                boolean flag974= FindUtil41.shengVDapan2(stockDayAllList2,scienceEntityList);
                boolean flag975= FindUtil41.reset20Dapan2(stockDayAllList2,scienceEntityList);
                boolean flag976= FindUtil41.jieQiDapan3(stockDayAllList2,scienceEntityList);
                boolean flag977= FindUtil41.jishujieqiDapan3(stockDayAllList2,scienceEntityList);
                boolean flag978= FindUtil41.jishujieqiDapan4(stockDayAllList2,scienceEntityList);
                boolean flag979= FindUtil41.jieQiDapan4(stockDayAllList2,scienceEntityList);
                boolean flag980= FindUtil41.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList);
                boolean flag981= FindUtil41.shengVDapan3(stockDayAllList2,scienceEntityList);
                boolean flag982= FindUtil41.reset20Dapan3(stockDayAllList2,scienceEntityList);
                boolean flag983= FindUtil41.jieQiDapan5(stockDayAllList2,scienceEntityList);
                boolean flag984= FindUtil41.jishujieqiDapan5(stockDayAllList2,scienceEntityList);
                boolean flag985= FindUtil41.jishujieqiDapan6(stockDayAllList2,scienceEntityList);
                boolean flag986= FindUtil41.jishujieqiDapan7(stockDayAllList2,scienceEntityList);
                boolean flag987= FindUtil41.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList);
                boolean flag988= FindUtil41.shengVDapan4(stockDayAllList2,scienceEntityList);

                boolean flag989= FindUtil42.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList);
                boolean flag990= FindUtil42.shengVDapan2(stockDayAllList2,scienceEntityList);
                boolean flag991= FindUtil42.reset20Dapan2(stockDayAllList2,scienceEntityList);
                boolean flag992= FindUtil42.jieQiDapan3(stockDayAllList2,scienceEntityList);
                boolean flag993= FindUtil42.jishujieqiDapan3(stockDayAllList2,scienceEntityList);
                boolean flag994= FindUtil42.jishujieqiDapan4(stockDayAllList2,scienceEntityList);
                boolean flag995= FindUtil42.jieQiDapan4(stockDayAllList2,scienceEntityList);
                boolean flag996= FindUtil42.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList);
                boolean flag997= FindUtil42.shengVDapan3(stockDayAllList2,scienceEntityList);
                boolean flag998= FindUtil42.reset20Dapan3(stockDayAllList2,scienceEntityList);
                boolean flag999= FindUtil42.jieQiDapan5(stockDayAllList2,scienceEntityList);
                boolean flag1000= FindUtil42.jishujieqiDapan5(stockDayAllList2,scienceEntityList);
                boolean flag1001= FindUtil42.jishujieqiDapan6(stockDayAllList2,scienceEntityList);
                boolean flag1002= FindUtil42.jishujieqiDapan7(stockDayAllList2,scienceEntityList);
                boolean flag1003= FindUtil42.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList);
                boolean flag1004= FindUtil42.shengVDapan4(stockDayAllList2,scienceEntityList);
                boolean flag1005= FindUtil42.reset20Dapan4(stockDayAllList2,scienceEntityList);
                boolean flag1006= FindUtil42.jieQiDapan6(stockDayAllList2,scienceEntityList);
                boolean flag1007= FindUtil42.jishujieqiDapan8(stockDayAllList2,scienceEntityList);
                boolean flag1008= FindUtil42.jishujieqiDapan9(stockDayAllList2,scienceEntityList);

//                if (flag){
//                    updateYanPan("1",yanPanVo);
//                }
//                if (flag2){
//                    updateYanPan("2",yanPanVo);
//                }
//                if (flag3){
//                    updateYanPan("3",yanPanVo);
//                }
//                if (flag4){
//                    updateYanPan("4",yanPanVo);
//                }
//                if (flag5){
//                    updateYanPan("5",yanPanVo);
//                }
//                if (flag6){
//                    updateYanPan("6",yanPanVo);
//                }
//                if (flag7){
//                    updateYanPan("7",yanPanVo);
//                }
//                if (flag8){
//                    updateYanPan("8",yanPanVo);
//                }
//                if (flag9){
//                    updateYanPan("9",yanPanVo);
//                }
//                if (flag10){
//                    updateYanPan("10",yanPanVo);
//                }
//                if (flag11){
//                    updateYanPan("11",yanPanVo);
//                }
//                if (flag12){
//                    updateYanPan("12",yanPanVo);
//                }
//                if (flag13){
//                    updateYanPan("13",yanPanVo);
//                }
//
//                if (flag14){
//                    updateYanPan("14",yanPanVo);
//                }
//                if (flag15){
//                    updateYanPan("15",yanPanVo);
//                }
//                if (flag16){
//                    updateYanPan("16",yanPanVo);
//                }
//                if (flag17){
//                    updateYanPan("17",yanPanVo);
//                }
//                if (flag18){
//                    updateYanPan("18",yanPanVo);
//                }
//                if (flag19){
//                    updateYanPan("19",yanPanVo);
//                }
//                if (flag20){
//                    updateYanPan("20",yanPanVo);
//                }
//                if (flag21){
//                    updateYanPan("21",yanPanVo);
//                }
//                if (flag22){
//                    updateYanPan("22",yanPanVo);
//                }
//                if (flag23){
//                    updateYanPan("23",yanPanVo);
//                }
//                if (flag24){
//                    updateYanPan("24",yanPanVo);
//                }
//                if (flag25){
//                    updateYanPan("25",yanPanVo);
//                }
//                if (flag26){
//                    updateYanPan("26",yanPanVo);
//                }

//                if (flag27){
//                    updateYanPan("27",yanPanVo);
//                }
//                if (flag28){
//                    updateYanPan("28",yanPanVo);
//                }
//                if (flag29){
//                    updateYanPan("29",yanPanVo);
//                }
//                if (flag30){
//                    updateYanPan("30",yanPanVo);
//                }
//                if (flag31){
//                    updateYanPan("31",yanPanVo);
//                }
//                if (flag32){
//                    updateYanPan("32",yanPanVo);
//                }
//                if (flag33){
//                    updateYanPan("33",yanPanVo);
//                }

                if (flag920){
                    updateYanPan("920",yanPanVo);
                }
                if (flag921){
                    updateYanPan("921",yanPanVo);
                }
                if (flag922){
                    updateYanPan("922",yanPanVo);
                }
                if (flag923){
                    updateYanPan("923",yanPanVo);
                }
                if (flag924){
                    updateYanPan("924",yanPanVo);
                }
                if (flag925){
                    updateYanPan("925",yanPanVo);
                }
                if (flag926){
                    updateYanPan("926",yanPanVo);
                }
                if (flag927){
                    updateYanPan("927",yanPanVo);
                }
                if (flag928){
                    updateYanPan("928",yanPanVo);
                }
                if (flag930){
                    updateYanPan("930",yanPanVo);
                }
                if (flag931){
                    updateYanPan("931",yanPanVo);
                }
                if (flag932){
                    updateYanPan("932",yanPanVo);
                }
                if (flag933){
                    updateYanPan("933",yanPanVo);
                }
                if (flag934){
                    updateYanPan("934",yanPanVo);
                }
                if (flag935){
                    updateYanPan("935",yanPanVo);
                }
                if (flag936){
                    updateYanPan("936",yanPanVo);
                }
                if (flag937){
                    updateYanPan("937",yanPanVo);
                }
                if (flag938){
                    updateYanPan("938",yanPanVo);
                }
                if (flag940){
                    updateYanPan("940",yanPanVo);
                }
                if (flag941){
                    updateYanPan("941",yanPanVo);
                }
                if (flag942){
                    updateYanPan("942",yanPanVo);
                }
                if (flag943){
                    updateYanPan("943",yanPanVo);
                }
                if (flag944){
                    updateYanPan("944",yanPanVo);
                }
                if (flag945){
                    updateYanPan("945",yanPanVo);
                }
                if (flag946){
                    updateYanPan("946",yanPanVo);
                }

                if (flag947){
                    updateYanPan("947",yanPanVo);
                }
                if (flag948){
                    updateYanPan("948",yanPanVo);
                }
                if (flag949){
                    updateYanPan("949",yanPanVo);
                }
                if (flag950){
                    updateYanPan("950",yanPanVo);
                }
                if (flag951){
                    updateYanPan("951",yanPanVo);
                }
                if (flag952){
                    updateYanPan("952",yanPanVo);
                }
                if (flag953){
                    updateYanPan("953",yanPanVo);
                }
                if (flag954){
                    updateYanPan("954",yanPanVo);
                }
                if (flag955){
                    updateYanPan("955",yanPanVo);
                }
                if (flag956){
                    updateYanPan("956",yanPanVo);
                }
                if (flag957){
                    updateYanPan("957",yanPanVo);
                }
                if (flag958){
                    updateYanPan("958",yanPanVo);
                }
                if (flag959){
                    updateYanPan("959",yanPanVo);
                }
                if (flag960){
                    updateYanPan("960",yanPanVo);
                }
                if (flag961){
                    updateYanPan("961",yanPanVo);
                }
                if (flag962){
                    updateYanPan("962",yanPanVo);
                }
                if (flag963){
                    updateYanPan("963",yanPanVo);
                }
                if (flag964){
                    updateYanPan("964",yanPanVo);
                }
                if (flag965){
                    updateYanPan("965",yanPanVo);
                }
                if (flag966){
                    updateYanPan("966",yanPanVo);
                }
                if (flag967){
                    updateYanPan("967",yanPanVo);
                }
                if (flag968){
                    updateYanPan("968",yanPanVo);
                }
                if (flag969){
                    updateYanPan("969",yanPanVo);
                }
                if (flag970){
                    updateYanPan("970",yanPanVo);
                }
                if (flag971){
                    updateYanPan("971",yanPanVo);
                }
                if (flag972){
                    updateYanPan("972",yanPanVo);
                }

                if (flag973){
                    updateYanPan("973",yanPanVo);
                }
                if (flag974){
                    updateYanPan("974",yanPanVo);
                }
                if (flag975){
                    updateYanPan("975",yanPanVo);
                }
                if (flag976){
                    updateYanPan("976",yanPanVo);
                }
                if (flag977){
                    updateYanPan("977",yanPanVo);
                }
                if (flag978){
                    updateYanPan("978",yanPanVo);
                }
                if (flag979){
                    updateYanPan("979",yanPanVo);
                }
                if (flag980){
                    updateYanPan("980",yanPanVo);
                }
                if (flag981){
                    updateYanPan("981",yanPanVo);
                }
                if (flag982){
                    updateYanPan("982",yanPanVo);
                }
                if (flag983){
                    updateYanPan("983",yanPanVo);
                }
                if (flag984){
                    updateYanPan("984",yanPanVo);
                }
                if (flag985){
                    updateYanPan("985",yanPanVo);
                }
                if (flag986){
                    updateYanPan("986",yanPanVo);
                }
                if (flag987){
                    updateYanPan("987",yanPanVo);
                }
                if (flag988){
                    updateYanPan("988",yanPanVo);
                }
                if (flag989){
                    updateYanPan("989",yanPanVo);
                }
                if (flag990){
                    updateYanPan("990",yanPanVo);
                }
                if (flag991){
                    updateYanPan("991",yanPanVo);
                }
                if (flag992){
                    updateYanPan("992",yanPanVo);
                }
                if (flag993){
                    updateYanPan("993",yanPanVo);
                }
                if (flag994){
                    updateYanPan("994",yanPanVo);
                }
                if (flag995){
                    updateYanPan("995",yanPanVo);
                }
                if (flag996){
                    updateYanPan("996",yanPanVo);
                }
                if (flag997){
                    updateYanPan("997",yanPanVo);
                }
                if (flag998){
                    updateYanPan("998",yanPanVo);
                }
                if (flag999){
                    updateYanPan("999",yanPanVo);
                }
                if (flag1000){
                    updateYanPan("1000",yanPanVo);
                }
                if (flag1001){
                    updateYanPan("1001",yanPanVo);
                }
                if (flag1002){
                    updateYanPan("1002",yanPanVo);
                }
                if (flag1003){
                    updateYanPan("1003",yanPanVo);
                }
                if (flag1004){
                    updateYanPan("1004",yanPanVo);
                }
                if (flag1005){
                    updateYanPan("1005",yanPanVo);
                }
                if (flag1006){
                    updateYanPan("1006",yanPanVo);
                }
                if (flag1007){
                    updateYanPan("1007",yanPanVo);
                }
                if (flag1008){
                    updateYanPan("1008",yanPanVo);
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
