package com.stock.stockday.service.find;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.stock.apicommon.entity.ScienceEntity;
import com.stock.stockday.entity.StockCode;
import com.stock.stockday.entity.StockDay6010;
import com.stock.stockday.entity.StockDay6010;
import com.stock.stockday.entity.StockDay6010;
import com.stock.stockday.entity.StockDayAll;
import com.stock.stockday.entity.StockDayScience6010;
import com.stock.stockday.entity.StockDayScience6010;
import com.stock.stockday.entity.StockDayScience6010;
import com.stock.stockday.service.StockDay6010Service;
import com.stock.stockday.service.StockDayScience6010Service;
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
public class FindListStock6010 {
    @Autowired
    private StockDay6010Service stockDay6010Service;
    @Autowired
    private StockDayScience6010Service stockDayScience6010Service;


    public List<StockDayVo> duoTuXiangShang(StockCode stockCode, List<StockDayVo> stockDayVoList) {
        StockDayVo stockDayVo = new StockDayVo();
        stockDayVo.setCode(stockCode.getEx() + stockCode.getId());
        stockDayVo.setName(stockCode.getName());
        //获取前60天记录，并且取前20天的有效记录
        Page<StockDay6010> page = new Page<>(1, 60);
        List<StockDay6010> stockDay6010List = stockDay6010Service.selectByCodeAndExPage(page, stockCode.getId(), stockCode.getEx());
        Collections.sort(stockDay6010List, new Comparator<StockDay6010>() {
            @Override
            public int compare(StockDay6010 o1, StockDay6010 o2) {
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
        Page<StockDayScience6010> page1=new Page<>(1,60);
        List<StockDayScience6010> stockDayScience6010List = stockDayScience6010Service.selectByPage(page1,stockCode.getId(), stockCode.getEx());//技术先
        List<StockDayAll> stockDayAllList1 = new ArrayList<>();
        for (StockDay6010 stockDay6010 : stockDay6010List) {
            if (stockDay6010.getOpeningPrice().compareTo(new BigDecimal(0)) != 0 && stockDay6010.getOpeningPrice() != null && stockDay6010.getLclosePrice() != null && stockDay6010.getLclosePrice().compareTo(new BigDecimal(0)) != 0 && stockDay6010.getChangePoints() != null) {
                StockDayAll stockDayAll=new StockDayAll();
                BeanUtils.copyProperties(stockDay6010,stockDayAll);
                stockDayAllList1.add(stockDayAll);
            }
            if (stockDayAllList1.size() == 20) {
                stockDayVo.setDate(DateUtil.get2String(stockDayAllList1.get(0).getDate()));
                //技术
                for (StockDayScience6010 stockDayScience6010 : stockDayScience6010List) {
                    if (stockDayAllList1.get(0).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(1).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(2).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(3).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(4).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(5).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(6).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(7).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(8).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(9).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
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
        Page<StockDay6010> page = new Page<>(1, 60);
        List<StockDay6010> stockDay6010List = stockDay6010Service.selectByCodeAndExPage(page, stockCode.getId(), stockCode.getEx());
        Collections.sort(stockDay6010List, new Comparator<StockDay6010>() {
            @Override
            public int compare(StockDay6010 o1, StockDay6010 o2) {
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
        Page<StockDayScience6010> page1=new Page<>(1,60);
        List<StockDayScience6010> stockDayScience6010List = stockDayScience6010Service.selectByPage(page1,stockCode.getId(), stockCode.getEx());//技术先
        List<StockDayAll> stockDayAllList1 = new ArrayList<>();
        for (StockDay6010 stockDay6010 : stockDay6010List) {
            if (stockDay6010.getOpeningPrice().compareTo(new BigDecimal(0)) != 0 && stockDay6010.getOpeningPrice() != null && stockDay6010.getLclosePrice() != null && stockDay6010.getLclosePrice().compareTo(new BigDecimal(0)) != 0 && stockDay6010.getChangePoints() != null) {
                StockDayAll stockDayAll=new StockDayAll();
                BeanUtils.copyProperties(stockDay6010,stockDayAll);
                stockDayAllList1.add(stockDayAll);
            }
            if (stockDayAllList1.size() == 20) {
                stockDayVo.setDate(DateUtil.get2String(stockDayAllList1.get(0).getDate()));
                //技术
                for (StockDayScience6010 stockDayScience6010 : stockDayScience6010List) {
                    if (stockDayAllList1.get(0).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(1).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(2).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(3).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(4).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(5).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(6).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(7).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(8).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(9).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
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
        Page<StockDay6010> page = new Page<>(1, 60);
        List<StockDay6010> stockDay6010List = stockDay6010Service.selectByCodeAndExPage(page, stockCode.getId(), stockCode.getEx());
        Collections.sort(stockDay6010List, new Comparator<StockDay6010>() {
            @Override
            public int compare(StockDay6010 o1, StockDay6010 o2) {
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
        Page<StockDayScience6010> page1=new Page<>(1,60);
        List<StockDayScience6010> stockDayScience6010List = stockDayScience6010Service.selectByPage(page1,stockCode.getId(), stockCode.getEx());//技术先
        List<StockDayAll> stockDayAllList1 = new ArrayList<>();
        for (StockDay6010 stockDay6010 : stockDay6010List) {
            if (stockDay6010.getOpeningPrice().compareTo(new BigDecimal(0)) != 0 && stockDay6010.getOpeningPrice() != null && stockDay6010.getLclosePrice() != null && stockDay6010.getLclosePrice().compareTo(new BigDecimal(0)) != 0 && stockDay6010.getChangePoints() != null) {
                StockDayAll stockDayAll=new StockDayAll();
                BeanUtils.copyProperties(stockDay6010,stockDayAll);
                stockDayAllList1.add(stockDayAll);
            }
            if (stockDayAllList1.size() == 20) {
                stockDayVo.setDate(DateUtil.get2String(stockDayAllList1.get(0).getDate()));
                //技术
                for (StockDayScience6010 stockDayScience6010 : stockDayScience6010List) {
                    if (stockDayAllList1.get(0).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(1).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(2).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(3).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(4).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(5).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(6).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(7).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(8).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(9).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
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

    public List<StockDayVo> jieQi(StockCode stockCode, List<StockDayVo> stockDayVoList) {
        StockDayVo stockDayVo = new StockDayVo();
        stockDayVo.setCode(stockCode.getEx() + stockCode.getId());
        stockDayVo.setName(stockCode.getName());
        //获取前60天记录，并且取前20天的有效记录
        Page<StockDay6010> page = new Page<>(1, 60);
        List<StockDay6010> stockDay6010List = stockDay6010Service.selectByCodeAndExPage(page, stockCode.getId(), stockCode.getEx());
        Collections.sort(stockDay6010List, new Comparator<StockDay6010>() {
            @Override
            public int compare(StockDay6010 o1, StockDay6010 o2) {
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
        Page<StockDayScience6010> page1=new Page<>(1,60);
        List<StockDayScience6010> stockDayScience6010List = stockDayScience6010Service.selectByPage(page1,stockCode.getId(), stockCode.getEx());//技术先
        List<StockDayAll> stockDayAllList1 = new ArrayList<>();
        for (StockDay6010 stockDay6010 : stockDay6010List) {
            if (stockDay6010.getOpeningPrice().compareTo(new BigDecimal(0)) != 0 && stockDay6010.getOpeningPrice() != null && stockDay6010.getLclosePrice() != null && stockDay6010.getLclosePrice().compareTo(new BigDecimal(0)) != 0 && stockDay6010.getChangePoints() != null) {
                StockDayAll stockDayAll=new StockDayAll();
                BeanUtils.copyProperties(stockDay6010,stockDayAll);
                stockDayAllList1.add(stockDayAll);
            }
            if (stockDayAllList1.size() == 55) {
                stockDayVo.setDate(DateUtil.get2String(stockDayAllList1.get(0).getDate()));
                //技术
                for (StockDayScience6010 stockDayScience6010 : stockDayScience6010List) {
                    if (stockDayAllList1.get(0).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(1).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(2).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(3).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(4).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(5).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(6).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(7).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(8).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(9).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
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
                boolean flag= FindUtil.jieQi(stockDayAllList1,scienceEntityList);
                if (flag){
                    stockDayVoList.add(stockDayVo);
                }

            }
        }
        return stockDayVoList;
    }

    public List<StockDayVo> jishujieqi(StockCode stockCode, List<StockDayVo> stockDayVoList) {
        StockDayVo stockDayVo = new StockDayVo();
        stockDayVo.setCode(stockCode.getEx() + stockCode.getId());
        stockDayVo.setName(stockCode.getName());
        //获取前60天记录，并且取前20天的有效记录
        Page<StockDay6010> page = new Page<>(1, 60);
        List<StockDay6010> stockDay6010List = stockDay6010Service.selectByCodeAndExPage(page, stockCode.getId(), stockCode.getEx());
        Collections.sort(stockDay6010List, new Comparator<StockDay6010>() {
            @Override
            public int compare(StockDay6010 o1, StockDay6010 o2) {
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
        Page<StockDayScience6010> page1=new Page<>(1,60);
        List<StockDayScience6010> stockDayScience6010List = stockDayScience6010Service.selectByPage(page1,stockCode.getId(), stockCode.getEx());//技术先
        List<StockDayAll> stockDayAllList1 = new ArrayList<>();
        for (StockDay6010 stockDay6010 : stockDay6010List) {
            if (stockDay6010.getOpeningPrice().compareTo(new BigDecimal(0)) != 0 && stockDay6010.getOpeningPrice() != null && stockDay6010.getLclosePrice() != null && stockDay6010.getLclosePrice().compareTo(new BigDecimal(0)) != 0 && stockDay6010.getChangePoints() != null) {
                StockDayAll stockDayAll=new StockDayAll();
                BeanUtils.copyProperties(stockDay6010,stockDayAll);
                stockDayAllList1.add(stockDayAll);
            }
            if (stockDayAllList1.size() == 20) {
                stockDayVo.setDate(DateUtil.get2String(stockDayAllList1.get(0).getDate()));
                //技术
                for (StockDayScience6010 stockDayScience6010 : stockDayScience6010List) {
                    if (stockDayAllList1.get(0).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(1).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(2).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(3).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(4).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(5).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(6).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(7).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(8).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(9).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
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
                boolean flag= FindUtil.jishujieqi(stockDayAllList1,scienceEntityList);
                if (flag){
                    stockDayVoList.add(stockDayVo);
                }

            }
        }
        return stockDayVoList;
    }

    public List<StockDayVo> jishujieqi1(StockCode stockCode, List<StockDayVo> stockDayVoList) {
        StockDayVo stockDayVo = new StockDayVo();
        stockDayVo.setCode(stockCode.getEx() + stockCode.getId());
        stockDayVo.setName(stockCode.getName());
        //获取前60天记录，并且取前20天的有效记录
        Page<StockDay6010> page = new Page<>(1, 60);
        List<StockDay6010> stockDay6010List = stockDay6010Service.selectByCodeAndExPage(page, stockCode.getId(), stockCode.getEx());
        Collections.sort(stockDay6010List, new Comparator<StockDay6010>() {
            @Override
            public int compare(StockDay6010 o1, StockDay6010 o2) {
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
        Page<StockDayScience6010> page1=new Page<>(1,60);
        List<StockDayScience6010> stockDayScience6010List = stockDayScience6010Service.selectByPage(page1,stockCode.getId(), stockCode.getEx());//技术先
        List<StockDayAll> stockDayAllList1 = new ArrayList<>();
        for (StockDay6010 stockDay6010 : stockDay6010List) {
            if (stockDay6010.getOpeningPrice().compareTo(new BigDecimal(0)) != 0 && stockDay6010.getOpeningPrice() != null && stockDay6010.getLclosePrice() != null && stockDay6010.getLclosePrice().compareTo(new BigDecimal(0)) != 0 && stockDay6010.getChangePoints() != null) {
                StockDayAll stockDayAll=new StockDayAll();
                BeanUtils.copyProperties(stockDay6010,stockDayAll);
                stockDayAllList1.add(stockDayAll);
            }
            if (stockDayAllList1.size() == 20) {
                stockDayVo.setDate(DateUtil.get2String(stockDayAllList1.get(0).getDate()));
                //技术
                for (StockDayScience6010 stockDayScience6010 : stockDayScience6010List) {
                    if (stockDayAllList1.get(0).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(1).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(2).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(3).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(4).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(5).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(6).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(7).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(8).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(9).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
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
                boolean flag= FindUtil.jishujieqi1(stockDayAllList1,scienceEntityList);
                if (flag){
                    stockDayVoList.add(stockDayVo);
                }

            }
        }
        return stockDayVoList;
    }

    public List<StockDayVo> jieQi2(StockCode stockCode, List<StockDayVo> stockDayVoList) {
        StockDayVo stockDayVo = new StockDayVo();
        stockDayVo.setCode(stockCode.getEx() + stockCode.getId());
        stockDayVo.setName(stockCode.getName());
        //获取前60天记录，并且取前20天的有效记录
        Page<StockDay6010> page = new Page<>(1, 60);
        List<StockDay6010> stockDay6010List = stockDay6010Service.selectByCodeAndExPage(page, stockCode.getId(), stockCode.getEx());
        Collections.sort(stockDay6010List, new Comparator<StockDay6010>() {
            @Override
            public int compare(StockDay6010 o1, StockDay6010 o2) {
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
        Page<StockDayScience6010> page1=new Page<>(1,60);
        List<StockDayScience6010> stockDayScience6010List = stockDayScience6010Service.selectByPage(page1,stockCode.getId(), stockCode.getEx());//技术先
        List<StockDayAll> stockDayAllList1 = new ArrayList<>();
        for (StockDay6010 stockDay6010 : stockDay6010List) {
            if (stockDay6010.getOpeningPrice().compareTo(new BigDecimal(0)) != 0 && stockDay6010.getOpeningPrice() != null && stockDay6010.getLclosePrice() != null && stockDay6010.getLclosePrice().compareTo(new BigDecimal(0)) != 0 && stockDay6010.getChangePoints() != null) {
                StockDayAll stockDayAll=new StockDayAll();
                BeanUtils.copyProperties(stockDay6010,stockDayAll);
                stockDayAllList1.add(stockDayAll);
            }
            if (stockDayAllList1.size() == 55) {
                stockDayVo.setDate(DateUtil.get2String(stockDayAllList1.get(0).getDate()));
                //技术
                for (StockDayScience6010 stockDayScience6010 : stockDayScience6010List) {
                    if (stockDayAllList1.get(0).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(1).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(2).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(3).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(4).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(5).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(6).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(7).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(8).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(9).getDate().compareTo(stockDayScience6010.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience6010, scienceEntity);
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
                boolean flag= FindUtil.jieQi2(stockDayAllList1,scienceEntityList);
                if (flag){
                    stockDayVoList.add(stockDayVo);
                }

            }
        }
        return stockDayVoList;
    }
}
