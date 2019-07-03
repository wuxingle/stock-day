package com.stock.stockday.service.find2.yanpan;


import com.stock.apicommon.entity.ScienceEntity;
import com.stock.apicommon.entity.YanPanEntity;
import com.stock.apicommon.utils.patterning.YanPanUtil;
import com.stock.apicommon.vo.YanPanVo;
import com.stock.stockday.entity.StockDayAll;
import com.stock.stockday.entity.StockDayScience;
import com.stock.stockday.entity.StockDayYanPan1;
import com.stock.stockday.service.find2.StockDayYanPan1Service;
import com.stock.stockday.util.FindUtil30;
import com.stock.stockday.util.FindUtil31;
import com.stock.stockday.util.FindUtil32;
import com.stock.stockday.util.FindUtil33;
import com.stock.stockday.util.FindUtil34;
import com.stock.stockday.util.FindUtil35;
import com.stock.stockday.util.FindUtil36;
import com.stock.stockday.util.FindUtil37;
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
                boolean flag214= FindUtil8.jieQiDapan6(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag215= FindUtil8.jishujieqiDapan8(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag216= FindUtil8.jishujieqiDapan9(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag217= FindUtil8.jieQiDapan7(stockDayAllList2,stockDayAllListDaPan1);
                boolean flag218= FindUtil8.jieQiDapan8(stockDayAllList2,stockDayAllListDaPan1);
                boolean flag219= FindUtil8.jieQiDapan9(stockDayAllList2,stockDayAllListDaPan1);
                boolean flag220= FindUtil8.jieQiDapan10(stockDayAllList2,stockDayAllListDaPan1);

                boolean flag223= FindUtil9.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag224= FindUtil9.shengVDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag225= FindUtil9.reset20Dapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag226= FindUtil9.jieQiDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag227= FindUtil9.jishujieqiDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag228= FindUtil9.jishujieqiDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag229= FindUtil9.jieQiDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag754= FindUtil9.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag755= FindUtil9.shengVDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag756= FindUtil9.reset20Dapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag757= FindUtil9.jieQiDapan5(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag758= FindUtil9.jishujieqiDapan5(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag759= FindUtil9.jishujieqiDapan6(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag760= FindUtil9.jishujieqiDapan7(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag761= FindUtil9.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag762= FindUtil9.shengVDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag907= FindUtil9.reset20Dapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag763= FindUtil9.jieQiDapan6(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag764= FindUtil9.jishujieqiDapan8(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag765= FindUtil9.jishujieqiDapan9(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);

                boolean flag766= FindUtil30.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag767= FindUtil30.shengVDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag768= FindUtil30.reset20Dapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag769= FindUtil30.jieQiDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag770= FindUtil30.jishujieqiDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag771= FindUtil30.jishujieqiDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag772= FindUtil30.jieQiDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag773= FindUtil30.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag774= FindUtil30.shengVDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag775= FindUtil30.reset20Dapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag776= FindUtil30.jieQiDapan5(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag777= FindUtil30.jishujieqiDapan5(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag778= FindUtil30.jishujieqiDapan6(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag779= FindUtil30.jishujieqiDapan7(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag780= FindUtil30.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag781= FindUtil30.shengVDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag908= FindUtil30.reset20Dapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag782= FindUtil30.jieQiDapan6(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag783= FindUtil30.jishujieqiDapan8(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag784= FindUtil30.jishujieqiDapan9(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);

                boolean flag785= FindUtil31.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag786= FindUtil31.shengVDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag787= FindUtil31.reset20Dapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag788= FindUtil31.jieQiDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag789= FindUtil31.jishujieqiDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag790= FindUtil31.jishujieqiDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag791= FindUtil31.jieQiDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);


                boolean flag792= FindUtil32.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag793= FindUtil32.shengVDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag794= FindUtil32.reset20Dapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag795= FindUtil32.jieQiDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag796= FindUtil32.jishujieqiDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag797= FindUtil32.jishujieqiDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag798= FindUtil32.jieQiDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag799= FindUtil32.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag800= FindUtil32.shengVDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag801= FindUtil32.reset20Dapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag802= FindUtil32.jieQiDapan5(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag803= FindUtil32.jishujieqiDapan5(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag804= FindUtil32.jishujieqiDapan6(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag805= FindUtil32.jishujieqiDapan7(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag806= FindUtil32.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag807= FindUtil32.shengVDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag808= FindUtil32.reset20Dapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag809= FindUtil32.jieQiDapan6(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag810= FindUtil32.jishujieqiDapan8(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag811= FindUtil32.jishujieqiDapan9(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag812= FindUtil32.jieQiDapan7(stockDayAllList2,stockDayAllListDaPan1);
                boolean flag813= FindUtil32.jieQiDapan8(stockDayAllList2,stockDayAllListDaPan1);
                boolean flag814= FindUtil32.jieQiDapan9(stockDayAllList2,stockDayAllListDaPan1);
                boolean flag815= FindUtil32.jieQiDapan10(stockDayAllList2,stockDayAllListDaPan1);
                boolean flag816= FindUtil32.jieQiDapan11(stockDayAllList2,stockDayAllListDaPan1);
                boolean flag817= FindUtil32.jieQiDapan12(stockDayAllList2,stockDayAllListDaPan1);


                boolean flag818= FindUtil33.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag819= FindUtil33.shengVDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag820= FindUtil33.reset20Dapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag821= FindUtil33.jieQiDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag822= FindUtil33.jishujieqiDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag823= FindUtil33.jishujieqiDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag824= FindUtil33.jieQiDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag825= FindUtil33.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag826= FindUtil33.shengVDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag827= FindUtil33.reset20Dapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag828= FindUtil33.jieQiDapan5(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag829= FindUtil33.jishujieqiDapan5(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag830= FindUtil33.jishujieqiDapan6(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag831= FindUtil33.jishujieqiDapan7(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag832= FindUtil33.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag833= FindUtil33.shengVDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag834= FindUtil33.reset20Dapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag835= FindUtil33.jieQiDapan6(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag836= FindUtil33.jishujieqiDapan8(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag837= FindUtil33.jishujieqiDapan9(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag838= FindUtil33.jieQiDapan7(stockDayAllList2,stockDayAllListDaPan1);
                boolean flag839= FindUtil33.jieQiDapan8(stockDayAllList2,stockDayAllListDaPan1);
                boolean flag840= FindUtil33.jieQiDapan9(stockDayAllList2,stockDayAllListDaPan1);
                boolean flag841= FindUtil33.jieQiDapan10(stockDayAllList2,stockDayAllListDaPan1);

                boolean flag842= FindUtil34.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag843= FindUtil34.shengVDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag844= FindUtil34.reset20Dapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag845= FindUtil34.jieQiDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag846= FindUtil34.jishujieqiDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag847= FindUtil34.jishujieqiDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag848= FindUtil34.jieQiDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag849= FindUtil34.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag850= FindUtil34.shengVDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag851= FindUtil34.reset20Dapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag852= FindUtil34.jieQiDapan5(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag853= FindUtil34.jishujieqiDapan5(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag854= FindUtil34.jishujieqiDapan6(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag855= FindUtil34.jishujieqiDapan7(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag856= FindUtil34.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag857= FindUtil34.shengVDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag909= FindUtil34.reset20Dapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag858= FindUtil34.jieQiDapan6(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag859= FindUtil34.jishujieqiDapan8(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag860= FindUtil34.jishujieqiDapan9(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);


                boolean flag861= FindUtil35.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag862= FindUtil35.shengVDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag863= FindUtil35.reset20Dapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag864= FindUtil35.jieQiDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag865= FindUtil35.jishujieqiDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag866= FindUtil35.jishujieqiDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag867= FindUtil35.jieQiDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag868= FindUtil35.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag869= FindUtil35.shengVDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag870= FindUtil35.reset20Dapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag871= FindUtil35.jieQiDapan5(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag872= FindUtil35.jishujieqiDapan5(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag873= FindUtil35.jishujieqiDapan6(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag874= FindUtil35.jishujieqiDapan7(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag875= FindUtil35.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag876= FindUtil35.shengVDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag877= FindUtil35.reset20Dapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag878= FindUtil35.jieQiDapan6(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag879= FindUtil35.jishujieqiDapan8(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag880= FindUtil35.jishujieqiDapan9(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);

                boolean flag881= FindUtil36.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag882= FindUtil36.shengVDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag883= FindUtil36.reset20Dapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag884= FindUtil36.jieQiDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag885= FindUtil36.jishujieqiDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag886= FindUtil36.jishujieqiDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag887= FindUtil36.jieQiDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag888= FindUtil36.duoTuXiangShangDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag889= FindUtil36.shengVDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag890= FindUtil36.reset20Dapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag891= FindUtil36.jieQiDapan5(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag892= FindUtil36.jishujieqiDapan5(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag893= FindUtil36.jishujieqiDapan6(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag894= FindUtil36.jishujieqiDapan7(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag895= FindUtil36.duoTuXiangShangDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag896= FindUtil36.shengVDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag910= FindUtil36.reset20Dapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag897= FindUtil36.jieQiDapan6(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag898= FindUtil36.jishujieqiDapan8(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag899= FindUtil36.jishujieqiDapan9(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag911= FindUtil36.jieQiDapan7(stockDayAllList2,stockDayAllListDaPan1);
                boolean flag912= FindUtil36.jieQiDapan8(stockDayAllList2,stockDayAllListDaPan1);
                boolean flag913= FindUtil36.jieQiDapan9(stockDayAllList2,stockDayAllListDaPan1);
                boolean flag914= FindUtil36.jieQiDapan10(stockDayAllList2,stockDayAllListDaPan1);
                boolean flag915= FindUtil36.jieQiDapan11(stockDayAllList2,stockDayAllListDaPan1);
                boolean flag916= FindUtil36.jieQiDapan12(stockDayAllList2,stockDayAllListDaPan1);

                boolean flag900= FindUtil37.duoTuXiangShangDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag901= FindUtil37.shengVDapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag902= FindUtil37.reset20Dapan2(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag903= FindUtil37.jieQiDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag904= FindUtil37.jishujieqiDapan3(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag905= FindUtil37.jishujieqiDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);
                boolean flag906= FindUtil37.jieQiDapan4(stockDayAllList2,scienceEntityList,stockDayAllListDaPan1);


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

                if (flag754){
                    updateYanPan("754",yanPanVo);
                }
                if (flag755){
                    updateYanPan("755",yanPanVo);
                }
                if (flag756){
                    updateYanPan("756",yanPanVo);
                }
                if (flag757){
                    updateYanPan("757",yanPanVo);
                }
                if (flag758){
                    updateYanPan("758",yanPanVo);
                }
                if (flag759){
                    updateYanPan("759",yanPanVo);
                }
                if (flag760){
                    updateYanPan("760",yanPanVo);
                }
                if (flag761){
                    updateYanPan("761",yanPanVo);
                }
                if (flag762){
                    updateYanPan("762",yanPanVo);
                }
                if (flag763){
                    updateYanPan("763",yanPanVo);
                }
                if (flag764){
                    updateYanPan("764",yanPanVo);
                }
                if (flag765){
                    updateYanPan("765",yanPanVo);
                }
                if (flag766){
                    updateYanPan("766",yanPanVo);
                }
                if (flag767){
                    updateYanPan("767",yanPanVo);
                }
                if (flag768){
                    updateYanPan("768",yanPanVo);
                }
                if (flag769){
                    updateYanPan("769",yanPanVo);
                }
                if (flag770){
                    updateYanPan("770",yanPanVo);
                }
                if (flag771){
                    updateYanPan("771",yanPanVo);
                }
                if (flag772){
                    updateYanPan("772",yanPanVo);
                }
                if (flag773){
                    updateYanPan("773",yanPanVo);
                }
                if (flag774){
                    updateYanPan("774",yanPanVo);
                }
                if (flag775){
                    updateYanPan("775",yanPanVo);
                }
                if (flag776){
                    updateYanPan("776",yanPanVo);
                }
                if (flag777){
                    updateYanPan("777",yanPanVo);
                }
                if (flag778){
                    updateYanPan("778",yanPanVo);
                }

                if (flag779){
                    updateYanPan("779",yanPanVo);
                }
                if (flag780){
                    updateYanPan("780",yanPanVo);
                }
                if (flag781){
                    updateYanPan("781",yanPanVo);
                }
                if (flag782){
                    updateYanPan("782",yanPanVo);
                }
                if (flag783){
                    updateYanPan("783",yanPanVo);
                }
                if (flag784){
                    updateYanPan("784",yanPanVo);
                }
                if (flag785){
                    updateYanPan("785",yanPanVo);
                }
                if (flag786){
                    updateYanPan("786",yanPanVo);
                }
                if (flag787){
                    updateYanPan("787",yanPanVo);
                }
                if (flag788){
                    updateYanPan("788",yanPanVo);
                }
                if (flag789){
                    updateYanPan("789",yanPanVo);
                }
                if (flag790){
                    updateYanPan("790",yanPanVo);
                }
                if (flag791){
                    updateYanPan("791",yanPanVo);
                }
                if (flag792){
                    updateYanPan("792",yanPanVo);
                }
                if (flag793){
                    updateYanPan("793",yanPanVo);
                }
                if (flag794){
                    updateYanPan("794",yanPanVo);
                }
                if (flag795){
                    updateYanPan("795",yanPanVo);
                }
                if (flag796){
                    updateYanPan("796",yanPanVo);
                }
                if (flag797){
                    updateYanPan("797",yanPanVo);
                }
                if (flag798){
                    updateYanPan("798",yanPanVo);
                }
                if (flag799){
                    updateYanPan("799",yanPanVo);
                }
                if (flag800){
                    updateYanPan("800",yanPanVo);
                }
                if (flag801){
                    updateYanPan("801",yanPanVo);
                }
                if (flag802){
                    updateYanPan("802",yanPanVo);
                }
                if (flag803){
                    updateYanPan("803",yanPanVo);
                }
                if (flag804){
                    updateYanPan("804",yanPanVo);
                }
                if (flag805){
                    updateYanPan("805",yanPanVo);
                }
                if (flag806){
                    updateYanPan("806",yanPanVo);
                }
                if (flag807){
                    updateYanPan("807",yanPanVo);
                }
                if (flag808){
                    updateYanPan("808",yanPanVo);
                }
                if (flag809){
                    updateYanPan("809",yanPanVo);
                }
                if (flag810){
                    updateYanPan("810",yanPanVo);
                }
                if (flag811){
                    updateYanPan("811",yanPanVo);
                }
                if (flag812){
                    updateYanPan("812",yanPanVo);
                }
                if (flag813){
                    updateYanPan("813",yanPanVo);
                }
                if (flag814){
                    updateYanPan("814",yanPanVo);
                }
                if (flag815){
                    updateYanPan("815",yanPanVo);
                }
                if (flag816){
                    updateYanPan("816",yanPanVo);
                }
                if (flag817){
                    updateYanPan("817",yanPanVo);
                }
                if (flag818){
                    updateYanPan("818",yanPanVo);
                }
                if (flag819){
                    updateYanPan("819",yanPanVo);
                }
                if (flag820){
                    updateYanPan("820",yanPanVo);
                }
                if (flag821){
                    updateYanPan("821",yanPanVo);
                }
                if (flag822){
                    updateYanPan("822",yanPanVo);
                }
                if (flag823){
                    updateYanPan("823",yanPanVo);
                }
                if (flag824){
                    updateYanPan("824",yanPanVo);
                }
                if (flag825){
                    updateYanPan("825",yanPanVo);
                }
                if (flag826){
                    updateYanPan("826",yanPanVo);
                }
                if (flag827){
                    updateYanPan("827",yanPanVo);
                }
                if (flag828){
                    updateYanPan("828",yanPanVo);
                }
                if (flag829){
                    updateYanPan("829",yanPanVo);
                }
                if (flag830){
                    updateYanPan("830",yanPanVo);
                }
                if (flag831){
                    updateYanPan("831",yanPanVo);
                }
                if (flag832){
                    updateYanPan("832",yanPanVo);
                }
                if (flag833){
                    updateYanPan("833",yanPanVo);
                }
                if (flag834){
                    updateYanPan("834",yanPanVo);
                }
                if (flag835){
                    updateYanPan("835",yanPanVo);
                }
                if (flag836){
                    updateYanPan("836",yanPanVo);
                }
                if (flag837){
                    updateYanPan("837",yanPanVo);
                }
                if (flag838){
                    updateYanPan("838",yanPanVo);
                }
                if (flag839){
                    updateYanPan("839",yanPanVo);
                }
                if (flag840){
                    updateYanPan("840",yanPanVo);
                }
                if (flag841){
                    updateYanPan("841",yanPanVo);
                }
                if (flag842){
                    updateYanPan("842",yanPanVo);
                }
                if (flag843){
                    updateYanPan("843",yanPanVo);
                }
                if (flag844){
                    updateYanPan("844",yanPanVo);
                }
                if (flag845){
                    updateYanPan("845",yanPanVo);
                }
                if (flag846){
                    updateYanPan("846",yanPanVo);
                }
                if (flag847){
                    updateYanPan("847",yanPanVo);
                }
                if (flag848){
                    updateYanPan("848",yanPanVo);
                }
                if (flag849){
                    updateYanPan("849",yanPanVo);
                }
                if (flag850){
                    updateYanPan("850",yanPanVo);
                }
                if (flag851){
                    updateYanPan("851",yanPanVo);
                }
                if (flag852){
                    updateYanPan("852",yanPanVo);
                }
                if (flag853){
                    updateYanPan("853",yanPanVo);
                }
                if (flag854){
                    updateYanPan("854",yanPanVo);
                }
                if (flag855){
                    updateYanPan("855",yanPanVo);
                }
                if (flag856){
                    updateYanPan("856",yanPanVo);
                }
                if (flag857){
                    updateYanPan("857",yanPanVo);
                }
                if (flag858){
                    updateYanPan("858",yanPanVo);
                }
                if (flag859){
                    updateYanPan("859",yanPanVo);
                }
                if (flag860){
                    updateYanPan("860",yanPanVo);
                }
                if (flag861){
                    updateYanPan("861",yanPanVo);
                }
                if (flag862){
                    updateYanPan("862",yanPanVo);
                }
                if (flag863){
                    updateYanPan("863",yanPanVo);
                }
                if (flag864){
                    updateYanPan("864",yanPanVo);
                }
                if (flag865){
                    updateYanPan("865",yanPanVo);
                }
                if (flag866){
                    updateYanPan("866",yanPanVo);
                }
                if (flag867){
                    updateYanPan("867",yanPanVo);
                }
                if (flag868){
                    updateYanPan("868",yanPanVo);
                }
                if (flag869){
                    updateYanPan("869",yanPanVo);
                }
                if (flag870){
                    updateYanPan("870",yanPanVo);
                }
                if (flag871){
                    updateYanPan("871",yanPanVo);
                }
                if (flag872){
                    updateYanPan("872",yanPanVo);
                }
                if (flag873){
                    updateYanPan("873",yanPanVo);
                }
                if (flag874){
                    updateYanPan("874",yanPanVo);
                }
                if (flag875){
                    updateYanPan("875",yanPanVo);
                }
                if (flag876){
                    updateYanPan("876",yanPanVo);
                }
                if (flag877){
                    updateYanPan("877",yanPanVo);
                }
                if (flag878){
                    updateYanPan("878",yanPanVo);
                }

                if (flag879){
                    updateYanPan("879",yanPanVo);
                }
                if (flag880){
                    updateYanPan("880",yanPanVo);
                }
                if (flag881){
                    updateYanPan("881",yanPanVo);
                }
                if (flag882){
                    updateYanPan("882",yanPanVo);
                }
                if (flag883){
                    updateYanPan("883",yanPanVo);
                }
                if (flag884){
                    updateYanPan("884",yanPanVo);
                }
                if (flag885){
                    updateYanPan("885",yanPanVo);
                }
                if (flag886){
                    updateYanPan("886",yanPanVo);
                }
                if (flag887){
                    updateYanPan("887",yanPanVo);
                }
                if (flag888){
                    updateYanPan("888",yanPanVo);
                }
                if (flag889){
                    updateYanPan("889",yanPanVo);
                }
                if (flag890){
                    updateYanPan("890",yanPanVo);
                }
                if (flag891){
                    updateYanPan("891",yanPanVo);
                }
                if (flag892){
                    updateYanPan("892",yanPanVo);
                }
                if (flag893){
                    updateYanPan("893",yanPanVo);
                }
                if (flag894){
                    updateYanPan("894",yanPanVo);
                }
                if (flag895){
                    updateYanPan("895",yanPanVo);
                }
                if (flag896){
                    updateYanPan("896",yanPanVo);
                }
                if (flag897){
                    updateYanPan("897",yanPanVo);
                }
                if (flag898){
                    updateYanPan("898",yanPanVo);
                }
                if (flag899){
                    updateYanPan("899",yanPanVo);
                }
                if (flag900){
                    updateYanPan("900",yanPanVo);
                }
                if (flag901){
                    updateYanPan("901",yanPanVo);
                }
                if (flag902){
                    updateYanPan("902",yanPanVo);
                }
                if (flag903){
                    updateYanPan("903",yanPanVo);
                }
                if (flag904){
                    updateYanPan("904",yanPanVo);
                }
                if (flag905){
                    updateYanPan("905",yanPanVo);
                }
                if (flag906){
                    updateYanPan("906",yanPanVo);
                }
                if (flag907){
                    updateYanPan("907",yanPanVo);
                }
                if (flag908){
                    updateYanPan("908",yanPanVo);
                }
                if (flag909){
                    updateYanPan("909",yanPanVo);
                }
                if (flag910){
                    updateYanPan("910",yanPanVo);
                }
                if (flag911){
                    updateYanPan("911",yanPanVo);
                }
                if (flag912){
                    updateYanPan("912",yanPanVo);
                }
                if (flag913){
                    updateYanPan("913",yanPanVo);
                }
                if (flag914){
                    updateYanPan("914",yanPanVo);
                }
                if (flag915){
                    updateYanPan("915",yanPanVo);
                }
                if (flag916){
                    updateYanPan("916",yanPanVo);
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
