package com.stock.stockday.service.find2.yanpan;


import com.stock.apicommon.entity.ScienceEntity;
import com.stock.apicommon.entity.YanPanEntity;
import com.stock.apicommon.utils.patterning.YanPanUtil;
import com.stock.apicommon.vo.YanPanVo;
import com.stock.stockday.entity.StockDayAll;
import com.stock.stockday.entity.StockDayScience;
import com.stock.stockday.entity.StockDayYanPan1;
import com.stock.stockday.service.find2.StockDayYanPan1Service;
import com.stock.stockday.util.FindUtil2;
import com.stock.stockday.util.FindUtil3;
import com.stock.stockday.util.FindUtil4;
import com.stock.stockday.util.FindUtil5;
import com.stock.stockday.util.FindUtil6;
import com.stock.stockday.util.FindUtil7;
import com.stock.stockday.util.FindUtil8;
import com.stock.stockday.util.FindUtil9;
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
public class YanPanDayServiceImpl2 {
    @Autowired
    private StockDayYanPan1Service stockDayYanPan1Service;

    public boolean dayYanPanFunction(List<StockDayAll> stockDayAllList, List<StockDayScience> stockDayScienceList,List<StockDayAll> stockDayAllListDaPan) throws IOException {
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

                boolean flag138= FindUtil6.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag139= FindUtil6.shengVDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag140= FindUtil6.reset20Dapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag141= FindUtil6.jieQiDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag142= FindUtil6.jishujieqiDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag143= FindUtil6.jishujieqiDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag144= FindUtil6.jieQiDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag145= FindUtil6.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag146= FindUtil6.shengVDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag147= FindUtil6.reset20Dapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag148= FindUtil6.jieQiDapan5(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag150= FindUtil6.jishujieqiDapan5(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag151= FindUtil6.jishujieqiDapan6(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag152= FindUtil6.jishujieqiDapan7(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag153= FindUtil6.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag154= FindUtil6.shengVDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag155= FindUtil6.reset20Dapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag156= FindUtil6.jieQiDapan6(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag157= FindUtil6.jishujieqiDapan8(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag158= FindUtil6.jishujieqiDapan9(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag159= FindUtil6.jieQiDapan7(stockDayAllList2,stockDayAllListDaPan1);
                boolean flag160= FindUtil6.jieQiDapan8(stockDayAllList2,stockDayAllListDaPan1);
                boolean flag161= FindUtil6.jieQiDapan9(stockDayAllList2,stockDayAllListDaPan1);
                boolean flag162= FindUtil6.jieQiDapan10(stockDayAllList2,stockDayAllListDaPan1);
                boolean flag163= FindUtil6.jieQiDapan11(stockDayAllList2,stockDayAllListDaPan1);
                boolean flag164= FindUtil6.jieQiDapan12(stockDayAllList2,stockDayAllListDaPan1);


                boolean flag165= FindUtil7.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag166= FindUtil7.shengVDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag167= FindUtil7.reset20Dapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag168= FindUtil7.jieQiDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag169= FindUtil7.jishujieqiDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag170= FindUtil7.jishujieqiDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag178= FindUtil7.jieQiDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag179= FindUtil7.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag180= FindUtil7.shengVDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag181= FindUtil7.reset20Dapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag182= FindUtil7.jieQiDapan5(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag183= FindUtil7.jishujieqiDapan5(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag184= FindUtil7.jishujieqiDapan6(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag185= FindUtil7.jishujieqiDapan7(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag186= FindUtil7.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag187= FindUtil7.shengVDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag188= FindUtil7.reset20Dapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag189= FindUtil7.jieQiDapan6(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag190= FindUtil7.jishujieqiDapan8(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag191= FindUtil7.jishujieqiDapan9(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag192= FindUtil7.jieQiDapan7(stockDayAllList2,stockDayAllListDaPan1);
                boolean flag193= FindUtil7.jieQiDapan8(stockDayAllList2,stockDayAllListDaPan1);
                boolean flag194= FindUtil7.jieQiDapan9(stockDayAllList2,stockDayAllListDaPan1);
                boolean flag195= FindUtil7.jieQiDapan10(stockDayAllList2,stockDayAllListDaPan1);
                boolean flag196= FindUtil7.jieQiDapan11(stockDayAllList2,stockDayAllListDaPan1);
                boolean flag197= FindUtil7.jieQiDapan12(stockDayAllList2,stockDayAllListDaPan1);

                boolean flag198= FindUtil8.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag199= FindUtil8.shengVDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag200= FindUtil8.reset20Dapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag201= FindUtil8.jieQiDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag202= FindUtil8.jishujieqiDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag203= FindUtil8.jishujieqiDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag204= FindUtil8.jieQiDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag205= FindUtil8.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag206= FindUtil8.shengVDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag207= FindUtil8.reset20Dapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag208= FindUtil8.jieQiDapan5(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag209= FindUtil8.jishujieqiDapan5(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag210= FindUtil8.jishujieqiDapan6(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag211= FindUtil8.jishujieqiDapan7(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag212= FindUtil8.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag213= FindUtil8.shengVDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);

                boolean flag214= FindUtil9.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag215= FindUtil9.shengVDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag216= FindUtil9.reset20Dapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag217= FindUtil9.jieQiDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag218= FindUtil9.jishujieqiDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag219= FindUtil9.jishujieqiDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag220= FindUtil9.jieQiDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag221= FindUtil9.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag222= FindUtil9.shengVDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag223= FindUtil9.reset20Dapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag224= FindUtil9.jieQiDapan5(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag225= FindUtil9.jishujieqiDapan5(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag226= FindUtil9.jishujieqiDapan6(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag227= FindUtil9.jishujieqiDapan7(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag228= FindUtil9.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag229= FindUtil9.shengVDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);

                if (flag138){
                    updateYanPan("138",yanPanVo);
                }
                if (flag139){
                    updateYanPan("139",yanPanVo);
                }
                if (flag140){
                    updateYanPan("140",yanPanVo);
                }
                if (flag141){
                    updateYanPan("141",yanPanVo);
                }
                if (flag142){
                    updateYanPan("142",yanPanVo);
                }
                if (flag143){
                    updateYanPan("143",yanPanVo);
                }
                if (flag144){
                    updateYanPan("144",yanPanVo);
                }
                if (flag145){
                    updateYanPan("145",yanPanVo);
                }
                if (flag146){
                    updateYanPan("146",yanPanVo);
                }
                if (flag147){
                    updateYanPan("147",yanPanVo);
                }
                if (flag148){
                    updateYanPan("148",yanPanVo);
                }
                if (flag150){
                    updateYanPan("150",yanPanVo);
                }
                if (flag151){
                    updateYanPan("151",yanPanVo);
                }
                if (flag152){
                    updateYanPan("152",yanPanVo);
                }
                if (flag153){
                    updateYanPan("153",yanPanVo);
                }
                if (flag154){
                    updateYanPan("154",yanPanVo);
                }
                if (flag155){
                    updateYanPan("155",yanPanVo);
                }
                if (flag156){
                    updateYanPan("156",yanPanVo);
                }
                if (flag157){
                    updateYanPan("157",yanPanVo);
                }
                if (flag158){
                    updateYanPan("158",yanPanVo);
                }
                if (flag159){
                    updateYanPan("159",yanPanVo);
                }
                if (flag160){
                    updateYanPan("160",yanPanVo);
                }
                if (flag161){
                    updateYanPan("161",yanPanVo);
                }
                if (flag162){
                    updateYanPan("162",yanPanVo);
                }
                if (flag163){
                    updateYanPan("163",yanPanVo);
                }
                if (flag164){
                    updateYanPan("164",yanPanVo);
                }
                if (flag165){
                    updateYanPan("165",yanPanVo);
                }
                if (flag166){
                    updateYanPan("166",yanPanVo);
                }
                if (flag167){
                    updateYanPan("167",yanPanVo);
                }
                if (flag168){
                    updateYanPan("168",yanPanVo);
                }
                if (flag169){
                    updateYanPan("169",yanPanVo);
                }
                if (flag170){
                    updateYanPan("170",yanPanVo);
                }
                if (flag178){
                    updateYanPan("178",yanPanVo);
                }

                if (flag179){
                    updateYanPan("179",yanPanVo);
                }
                if (flag180){
                    updateYanPan("180",yanPanVo);
                }
                if (flag181){
                    updateYanPan("181",yanPanVo);
                }
                if (flag182){
                    updateYanPan("182",yanPanVo);
                }
                if (flag183){
                    updateYanPan("183",yanPanVo);
                }
                if (flag184){
                    updateYanPan("184",yanPanVo);
                }
                if (flag185){
                    updateYanPan("185",yanPanVo);
                }
                if (flag186){
                    updateYanPan("186",yanPanVo);
                }
                if (flag187){
                    updateYanPan("187",yanPanVo);
                }
                if (flag188){
                    updateYanPan("188",yanPanVo);
                }
                if (flag189){
                    updateYanPan("189",yanPanVo);
                }
                if (flag190){
                    updateYanPan("190",yanPanVo);
                }
                if (flag191){
                    updateYanPan("191",yanPanVo);
                }
                if (flag192){
                    updateYanPan("192",yanPanVo);
                }
                if (flag193){
                    updateYanPan("193",yanPanVo);
                }
                if (flag194){
                    updateYanPan("194",yanPanVo);
                }
                if (flag195){
                    updateYanPan("195",yanPanVo);
                }
                if (flag196){
                    updateYanPan("196",yanPanVo);
                }
                if (flag197){
                    updateYanPan("197",yanPanVo);
                }
                if (flag198){
                    updateYanPan("198",yanPanVo);
                }
                if (flag199){
                    updateYanPan("199",yanPanVo);
                }
                if (flag200){
                    updateYanPan("200",yanPanVo);
                }
                if (flag201){
                    updateYanPan("201",yanPanVo);
                }
                if (flag202){
                    updateYanPan("202",yanPanVo);
                }
                if (flag203){
                    updateYanPan("203",yanPanVo);
                }
                if (flag204){
                    updateYanPan("204",yanPanVo);
                }
                if (flag205){
                    updateYanPan("205",yanPanVo);
                }
                if (flag206){
                    updateYanPan("206",yanPanVo);
                }
                if (flag207){
                    updateYanPan("207",yanPanVo);
                }
                if (flag208){
                    updateYanPan("208",yanPanVo);
                }
                if (flag209){
                    updateYanPan("209",yanPanVo);
                }
                if (flag210){
                    updateYanPan("210",yanPanVo);
                }
                if (flag211){
                    updateYanPan("211",yanPanVo);
                }
                if (flag212){
                    updateYanPan("212",yanPanVo);
                }
                if (flag213){
                    updateYanPan("213",yanPanVo);
                }
                if (flag214){
                    updateYanPan("214",yanPanVo);
                }
                if (flag215){
                    updateYanPan("215",yanPanVo);
                }
                if (flag216){
                    updateYanPan("216",yanPanVo);
                }
                if (flag217){
                    updateYanPan("217",yanPanVo);
                }
                if (flag218){
                    updateYanPan("218",yanPanVo);
                }
                if (flag219){
                    updateYanPan("219",yanPanVo);
                }
                if (flag220){
                    updateYanPan("220",yanPanVo);
                }
                if (flag221){
                    updateYanPan("221",yanPanVo);
                }
                if (flag222){
                    updateYanPan("222",yanPanVo);
                }
                if (flag223){
                    updateYanPan("223",yanPanVo);
                }
                if (flag224){
                    updateYanPan("224",yanPanVo);
                }
                if (flag225){
                    updateYanPan("225",yanPanVo);
                }
                if (flag226){
                    updateYanPan("226",yanPanVo);
                }
                if (flag227){
                    updateYanPan("227",yanPanVo);
                }
                if (flag228){
                    updateYanPan("228",yanPanVo);
                }
                if (flag229){
                    updateYanPan("229",yanPanVo);
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
