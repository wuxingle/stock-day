package com.stock.stockday.service.find;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.stock.apicommon.entity.ScienceEntity;
import com.stock.stockday.entity.StockCode;
import com.stock.stockday.entity.StockDay6009;
import com.stock.stockday.entity.StockDay6009;
import com.stock.stockday.entity.StockDayAll;
import com.stock.stockday.entity.StockDayScience6009;
import com.stock.stockday.entity.StockDayScience6009;
import com.stock.stockday.service.StockDay6009Service;
import com.stock.stockday.service.StockDayScience6009Service;
import com.stock.stockday.util.DateUtil;
import com.stock.stockday.util.FindUtil;
import com.stock.stockday.vo.StockDayVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class FindListStock6009 {
    @Autowired
    private StockDay6009Service stockDay6009Service;
    @Autowired
    private StockDayScience6009Service stockDayScience6009Service;


    public List<StockDayVo> duoTuXiangShang(StockCode stockCode, List<StockDayVo> stockDayVoList) {
        StockDayVo stockDayVo = new StockDayVo();
        stockDayVo.setCode(stockCode.getEx() + stockCode.getId());
        stockDayVo.setName(stockCode.getName());
        //获取前60天记录，并且取前20天的有效记录
        Page<StockDay6009> page = new Page<>(1, 60);
        List<StockDay6009> stockDay6009List = stockDay6009Service.selectByCodeAndExPage(page, stockCode.getId(), stockCode.getEx());
        Collections.sort(stockDay6009List, new Comparator<StockDay6009>() {
            @Override
            public int compare(StockDay6009 o1, StockDay6009 o2) {
                long i = o2.getDate().getTime() - o1.getDate().getTime();
                if (i > 0) {
                    return 1;
                } else if (i < 0) {
                    return -1;
                }
                return 0;
            }
        });
        List<ScienceEntity> scienceEntityList = new ArrayList<>();
        Page<StockDayScience6009> page1=new Page<>(1,60);
        List<StockDayScience6009> stockDayScience6009List = stockDayScience6009Service.selectByPage(page1,stockCode.getId(), stockCode.getEx());//技术先
        List<StockDayAll> stockDayAllList1 = new ArrayList<>();
        for (StockDay6009 stockDay6009 : stockDay6009List) {
            if (stockDay6009.getOpeningPrice().compareTo(new BigDecimal(0)) != 0 && stockDay6009.getOpeningPrice() != null && stockDay6009.getLclosePrice() != null && stockDay6009.getLclosePrice().compareTo(new BigDecimal(0)) != 0 && stockDay6009.getChangePoints() != null) {
                StockDayAll stockDayAll=new StockDayAll();
                BeanUtils.copyProperties(stockDay6009,stockDayAll);
                stockDayAllList1.add(stockDayAll);
            }
            if (stockDayAllList1.size() == 20) {
                stockDayVo.setDate(DateUtil.get2String(stockDayAllList1.get(0).getDate()));
                //技术
                for (StockDayScience6009 stockDayScience6009 : stockDayScience6009List) {
                    if (stockDayAllList1.get(0).getDate().compareTo(stockDayScience6009.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6009, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(1).getDate().compareTo(stockDayScience6009.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6009, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(2).getDate().compareTo(stockDayScience6009.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6009, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(3).getDate().compareTo(stockDayScience6009.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6009, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(4).getDate().compareTo(stockDayScience6009.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6009, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(5).getDate().compareTo(stockDayScience6009.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6009, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(6).getDate().compareTo(stockDayScience6009.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6009, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(7).getDate().compareTo(stockDayScience6009.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6009, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(8).getDate().compareTo(stockDayScience6009.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6009, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(9).getDate().compareTo(stockDayScience6009.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6009, scienceEntity);
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
                boolean flag= FindUtil.duoTuXiangShang(stockDayAllList1,scienceEntityList);
                if (flag){
                    stockDayVoList.add(stockDayVo);
                }

            }
        }
        return stockDayVoList;
    }

    public List<StockDayVo> shengV(StockCode stockCode, List<StockDayVo> stockDayVoList) {
        StockDayVo stockDayVo = new StockDayVo();
        stockDayVo.setCode(stockCode.getEx() + stockCode.getId());
        stockDayVo.setName(stockCode.getName());
        //获取前60天记录，并且取前20天的有效记录
        Page<StockDay6009> page = new Page<>(1, 60);
        List<StockDay6009> stockDay6009List = stockDay6009Service.selectByCodeAndExPage(page, stockCode.getId(), stockCode.getEx());
        Collections.sort(stockDay6009List, new Comparator<StockDay6009>() {
            @Override
            public int compare(StockDay6009 o1, StockDay6009 o2) {
                long i = o2.getDate().getTime() - o1.getDate().getTime();
                if (i > 0) {
                    return 1;
                } else if (i < 0) {
                    return -1;
                }
                return 0;
            }
        });
        List<ScienceEntity> scienceEntityList = new ArrayList<>();
        Page<StockDayScience6009> page1=new Page<>(1,60);
        List<StockDayScience6009> stockDayScience6009List = stockDayScience6009Service.selectByPage(page1,stockCode.getId(), stockCode.getEx());//技术先
        List<StockDayAll> stockDayAllList1 = new ArrayList<>();
        for (StockDay6009 stockDay6009 : stockDay6009List) {
            if (stockDay6009.getOpeningPrice().compareTo(new BigDecimal(0)) != 0 && stockDay6009.getOpeningPrice() != null && stockDay6009.getLclosePrice() != null && stockDay6009.getLclosePrice().compareTo(new BigDecimal(0)) != 0 && stockDay6009.getChangePoints() != null) {
                StockDayAll stockDayAll=new StockDayAll();
                BeanUtils.copyProperties(stockDay6009,stockDayAll);
                stockDayAllList1.add(stockDayAll);
            }
            if (stockDayAllList1.size() == 20) {
                stockDayVo.setDate(DateUtil.get2String(stockDayAllList1.get(0).getDate()));
                //技术
                for (StockDayScience6009 stockDayScience6009 : stockDayScience6009List) {
                    if (stockDayAllList1.get(0).getDate().compareTo(stockDayScience6009.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6009, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(1).getDate().compareTo(stockDayScience6009.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6009, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(2).getDate().compareTo(stockDayScience6009.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6009, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(3).getDate().compareTo(stockDayScience6009.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6009, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(4).getDate().compareTo(stockDayScience6009.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6009, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(5).getDate().compareTo(stockDayScience6009.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6009, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(6).getDate().compareTo(stockDayScience6009.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6009, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(7).getDate().compareTo(stockDayScience6009.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6009, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(8).getDate().compareTo(stockDayScience6009.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6009, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(9).getDate().compareTo(stockDayScience6009.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6009, scienceEntity);
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
                boolean flag= FindUtil.shengV(stockDayAllList1,scienceEntityList);
                if (flag){
                    stockDayVoList.add(stockDayVo);
                }

            }
        }
        return stockDayVoList;
    }

    public List<StockDayVo> reset20(StockCode stockCode, List<StockDayVo> stockDayVoList) {
        StockDayVo stockDayVo = new StockDayVo();
        stockDayVo.setCode(stockCode.getEx() + stockCode.getId());
        stockDayVo.setName(stockCode.getName());
        //获取前60天记录，并且取前20天的有效记录
        Page<StockDay6009> page = new Page<>(1, 60);
        List<StockDay6009> stockDay6009List = stockDay6009Service.selectByCodeAndExPage(page, stockCode.getId(), stockCode.getEx());
        Collections.sort(stockDay6009List, new Comparator<StockDay6009>() {
            @Override
            public int compare(StockDay6009 o1, StockDay6009 o2) {
                long i = o2.getDate().getTime() - o1.getDate().getTime();
                if (i > 0) {
                    return 1;
                } else if (i < 0) {
                    return -1;
                }
                return 0;
            }
        });
        List<ScienceEntity> scienceEntityList = new ArrayList<>();
        Page<StockDayScience6009> page1=new Page<>(1,60);
        List<StockDayScience6009> stockDayScience6009List = stockDayScience6009Service.selectByPage(page1,stockCode.getId(), stockCode.getEx());//技术先
        List<StockDayAll> stockDayAllList1 = new ArrayList<>();
        for (StockDay6009 stockDay6009 : stockDay6009List) {
            if (stockDay6009.getOpeningPrice().compareTo(new BigDecimal(0)) != 0 && stockDay6009.getOpeningPrice() != null && stockDay6009.getLclosePrice() != null && stockDay6009.getLclosePrice().compareTo(new BigDecimal(0)) != 0 && stockDay6009.getChangePoints() != null) {
                StockDayAll stockDayAll=new StockDayAll();
                BeanUtils.copyProperties(stockDay6009,stockDayAll);
                stockDayAllList1.add(stockDayAll);
            }
            if (stockDayAllList1.size() == 20) {
                stockDayVo.setDate(DateUtil.get2String(stockDayAllList1.get(0).getDate()));
                //技术
                for (StockDayScience6009 stockDayScience6009 : stockDayScience6009List) {
                    if (stockDayAllList1.get(0).getDate().compareTo(stockDayScience6009.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6009, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(1).getDate().compareTo(stockDayScience6009.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6009, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(2).getDate().compareTo(stockDayScience6009.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6009, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(3).getDate().compareTo(stockDayScience6009.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6009, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(4).getDate().compareTo(stockDayScience6009.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6009, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(5).getDate().compareTo(stockDayScience6009.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6009, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(6).getDate().compareTo(stockDayScience6009.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6009, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(7).getDate().compareTo(stockDayScience6009.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6009, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(8).getDate().compareTo(stockDayScience6009.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6009, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(9).getDate().compareTo(stockDayScience6009.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6009, scienceEntity);
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
                boolean flag= FindUtil.reset20(stockDayAllList1,scienceEntityList);
                if (flag){
                    stockDayVoList.add(stockDayVo);
                }

            }
        }
        return stockDayVoList;
    }
}
