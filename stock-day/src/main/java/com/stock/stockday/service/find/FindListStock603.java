package com.stock.stockday.service.find;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.stock.apicommon.entity.ScienceEntity;
import com.stock.stockday.entity.StockCode;
import com.stock.stockday.entity.StockDay603;
import com.stock.stockday.entity.StockDay603;
import com.stock.stockday.entity.StockDay603;
import com.stock.stockday.entity.StockDayAll;
import com.stock.stockday.entity.StockDayScience603;
import com.stock.stockday.entity.StockDayScience603;
import com.stock.stockday.entity.StockDayScience603;
import com.stock.stockday.service.StockDay603Service;
import com.stock.stockday.service.StockDayScience603Service;
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
public class FindListStock603 {
    @Autowired
    private StockDay603Service stockDay603Service;
    @Autowired
    private StockDayScience603Service stockDayScience603Service;


    public List<StockDayVo> duoTuXiangShang(StockCode stockCode, List<StockDayVo> stockDayVoList) {
        StockDayVo stockDayVo = new StockDayVo();
        stockDayVo.setCode(stockCode.getEx() + stockCode.getId());
        stockDayVo.setName(stockCode.getName());
        //获取前60天记录，并且取前20天的有效记录
        Page<StockDay603> page = new Page<>(1, 60);
        List<StockDay603> stockDay603List = stockDay603Service.selectByCodeAndExPage(page, stockCode.getId(), stockCode.getEx());
        Collections.sort(stockDay603List, new Comparator<StockDay603>() {
            @Override
            public int compare(StockDay603 o1, StockDay603 o2) {
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
        Page<StockDayScience603> page1=new Page<>(1,60);
        List<StockDayScience603> stockDayScience603List = stockDayScience603Service.selectByPage(page1,stockCode.getId(), stockCode.getEx());//技术先
        List<StockDayAll> stockDayAllList1 = new ArrayList<>();
        for (StockDay603 stockDay603 : stockDay603List) {
            if (stockDay603.getOpeningPrice().compareTo(new BigDecimal(0)) != 0 && stockDay603.getOpeningPrice() != null && stockDay603.getLclosePrice() != null && stockDay603.getLclosePrice().compareTo(new BigDecimal(0)) != 0 && stockDay603.getChangePoints() != null) {
                StockDayAll stockDayAll=new StockDayAll();
                BeanUtils.copyProperties(stockDay603,stockDayAll);
                stockDayAllList1.add(stockDayAll);
            }
            if (stockDayAllList1.size() == 20) {
                stockDayVo.setDate(DateUtil.get2String(stockDayAllList1.get(0).getDate()));
                //技术
                for (StockDayScience603 stockDayScience603 : stockDayScience603List) {
                    if (stockDayAllList1.get(0).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(1).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(2).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(3).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(4).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(5).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(6).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(7).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(8).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(9).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
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
        Page<StockDay603> page = new Page<>(1, 60);
        List<StockDay603> stockDay603List = stockDay603Service.selectByCodeAndExPage(page, stockCode.getId(), stockCode.getEx());
        Collections.sort(stockDay603List, new Comparator<StockDay603>() {
            @Override
            public int compare(StockDay603 o1, StockDay603 o2) {
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
        Page<StockDayScience603> page1=new Page<>(1,60);
        List<StockDayScience603> stockDayScience603List = stockDayScience603Service.selectByPage(page1,stockCode.getId(), stockCode.getEx());//技术先
        List<StockDayAll> stockDayAllList1 = new ArrayList<>();
        for (StockDay603 stockDay603 : stockDay603List) {
            if (stockDay603.getOpeningPrice().compareTo(new BigDecimal(0)) != 0 && stockDay603.getOpeningPrice() != null && stockDay603.getLclosePrice() != null && stockDay603.getLclosePrice().compareTo(new BigDecimal(0)) != 0 && stockDay603.getChangePoints() != null) {
                StockDayAll stockDayAll=new StockDayAll();
                BeanUtils.copyProperties(stockDay603,stockDayAll);
                stockDayAllList1.add(stockDayAll);
            }
            if (stockDayAllList1.size() == 20) {
                stockDayVo.setDate(DateUtil.get2String(stockDayAllList1.get(0).getDate()));
                //技术
                for (StockDayScience603 stockDayScience603 : stockDayScience603List) {
                    if (stockDayAllList1.get(0).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(1).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(2).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(3).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(4).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(5).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(6).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(7).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(8).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(9).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
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
        Page<StockDay603> page = new Page<>(1, 60);
        List<StockDay603> stockDay603List = stockDay603Service.selectByCodeAndExPage(page, stockCode.getId(), stockCode.getEx());
        Collections.sort(stockDay603List, new Comparator<StockDay603>() {
            @Override
            public int compare(StockDay603 o1, StockDay603 o2) {
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
        Page<StockDayScience603> page1=new Page<>(1,60);
        List<StockDayScience603> stockDayScience603List = stockDayScience603Service.selectByPage(page1,stockCode.getId(), stockCode.getEx());//技术先
        List<StockDayAll> stockDayAllList1 = new ArrayList<>();
        for (StockDay603 stockDay603 : stockDay603List) {
            if (stockDay603.getOpeningPrice().compareTo(new BigDecimal(0)) != 0 && stockDay603.getOpeningPrice() != null && stockDay603.getLclosePrice() != null && stockDay603.getLclosePrice().compareTo(new BigDecimal(0)) != 0 && stockDay603.getChangePoints() != null) {
                StockDayAll stockDayAll=new StockDayAll();
                BeanUtils.copyProperties(stockDay603,stockDayAll);
                stockDayAllList1.add(stockDayAll);
            }
            if (stockDayAllList1.size() == 20) {
                stockDayVo.setDate(DateUtil.get2String(stockDayAllList1.get(0).getDate()));
                //技术
                for (StockDayScience603 stockDayScience603 : stockDayScience603List) {
                    if (stockDayAllList1.get(0).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(1).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(2).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(3).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(4).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(5).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(6).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(7).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(8).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(9).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
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
        Page<StockDay603> page = new Page<>(1, 60);
        List<StockDay603> stockDay603List = stockDay603Service.selectByCodeAndExPage(page, stockCode.getId(), stockCode.getEx());
        Collections.sort(stockDay603List, new Comparator<StockDay603>() {
            @Override
            public int compare(StockDay603 o1, StockDay603 o2) {
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
        Page<StockDayScience603> page1=new Page<>(1,60);
        List<StockDayScience603> stockDayScience603List = stockDayScience603Service.selectByPage(page1,stockCode.getId(), stockCode.getEx());//技术先
        List<StockDayAll> stockDayAllList1 = new ArrayList<>();
        for (StockDay603 stockDay603 : stockDay603List) {
            if (stockDay603.getOpeningPrice().compareTo(new BigDecimal(0)) != 0 && stockDay603.getOpeningPrice() != null && stockDay603.getLclosePrice() != null && stockDay603.getLclosePrice().compareTo(new BigDecimal(0)) != 0 && stockDay603.getChangePoints() != null) {
                StockDayAll stockDayAll=new StockDayAll();
                BeanUtils.copyProperties(stockDay603,stockDayAll);
                stockDayAllList1.add(stockDayAll);
            }
            if (stockDayAllList1.size() == 55) {
                stockDayVo.setDate(DateUtil.get2String(stockDayAllList1.get(0).getDate()));
                //技术
                for (StockDayScience603 stockDayScience603 : stockDayScience603List) {
                    if (stockDayAllList1.get(0).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(1).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(2).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(3).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(4).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(5).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(6).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(7).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(8).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(9).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
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
        Page<StockDay603> page = new Page<>(1, 60);
        List<StockDay603> stockDay603List = stockDay603Service.selectByCodeAndExPage(page, stockCode.getId(), stockCode.getEx());
        Collections.sort(stockDay603List, new Comparator<StockDay603>() {
            @Override
            public int compare(StockDay603 o1, StockDay603 o2) {
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
        Page<StockDayScience603> page1=new Page<>(1,60);
        List<StockDayScience603> stockDayScience603List = stockDayScience603Service.selectByPage(page1,stockCode.getId(), stockCode.getEx());//技术先
        List<StockDayAll> stockDayAllList1 = new ArrayList<>();
        for (StockDay603 stockDay603 : stockDay603List) {
            if (stockDay603.getOpeningPrice().compareTo(new BigDecimal(0)) != 0 && stockDay603.getOpeningPrice() != null && stockDay603.getLclosePrice() != null && stockDay603.getLclosePrice().compareTo(new BigDecimal(0)) != 0 && stockDay603.getChangePoints() != null) {
                StockDayAll stockDayAll=new StockDayAll();
                BeanUtils.copyProperties(stockDay603,stockDayAll);
                stockDayAllList1.add(stockDayAll);
            }
            if (stockDayAllList1.size() == 20) {
                stockDayVo.setDate(DateUtil.get2String(stockDayAllList1.get(0).getDate()));
                //技术
                for (StockDayScience603 stockDayScience603 : stockDayScience603List) {
                    if (stockDayAllList1.get(0).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(1).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(2).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(3).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(4).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(5).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(6).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(7).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(8).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(9).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
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
        Page<StockDay603> page = new Page<>(1, 60);
        List<StockDay603> stockDay603List = stockDay603Service.selectByCodeAndExPage(page, stockCode.getId(), stockCode.getEx());
        Collections.sort(stockDay603List, new Comparator<StockDay603>() {
            @Override
            public int compare(StockDay603 o1, StockDay603 o2) {
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
        Page<StockDayScience603> page1=new Page<>(1,60);
        List<StockDayScience603> stockDayScience603List = stockDayScience603Service.selectByPage(page1,stockCode.getId(), stockCode.getEx());//技术先
        List<StockDayAll> stockDayAllList1 = new ArrayList<>();
        for (StockDay603 stockDay603 : stockDay603List) {
            if (stockDay603.getOpeningPrice().compareTo(new BigDecimal(0)) != 0 && stockDay603.getOpeningPrice() != null && stockDay603.getLclosePrice() != null && stockDay603.getLclosePrice().compareTo(new BigDecimal(0)) != 0 && stockDay603.getChangePoints() != null) {
                StockDayAll stockDayAll=new StockDayAll();
                BeanUtils.copyProperties(stockDay603,stockDayAll);
                stockDayAllList1.add(stockDayAll);
            }
            if (stockDayAllList1.size() == 20) {
                stockDayVo.setDate(DateUtil.get2String(stockDayAllList1.get(0).getDate()));
                //技术
                for (StockDayScience603 stockDayScience603 : stockDayScience603List) {
                    if (stockDayAllList1.get(0).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(1).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(2).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(3).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(4).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(5).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(6).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(7).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(8).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(9).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
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
        Page<StockDay603> page = new Page<>(1, 60);
        List<StockDay603> stockDay603List = stockDay603Service.selectByCodeAndExPage(page, stockCode.getId(), stockCode.getEx());
        Collections.sort(stockDay603List, new Comparator<StockDay603>() {
            @Override
            public int compare(StockDay603 o1, StockDay603 o2) {
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
        Page<StockDayScience603> page1=new Page<>(1,60);
        List<StockDayScience603> stockDayScience603List = stockDayScience603Service.selectByPage(page1,stockCode.getId(), stockCode.getEx());//技术先
        List<StockDayAll> stockDayAllList1 = new ArrayList<>();
        for (StockDay603 stockDay603 : stockDay603List) {
            if (stockDay603.getOpeningPrice().compareTo(new BigDecimal(0)) != 0 && stockDay603.getOpeningPrice() != null && stockDay603.getLclosePrice() != null && stockDay603.getLclosePrice().compareTo(new BigDecimal(0)) != 0 && stockDay603.getChangePoints() != null) {
                StockDayAll stockDayAll=new StockDayAll();
                BeanUtils.copyProperties(stockDay603,stockDayAll);
                stockDayAllList1.add(stockDayAll);
            }
            if (stockDayAllList1.size() == 55) {
                stockDayVo.setDate(DateUtil.get2String(stockDayAllList1.get(0).getDate()));
                //技术
                for (StockDayScience603 stockDayScience603 : stockDayScience603List) {
                    if (stockDayAllList1.get(0).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(1).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(2).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(3).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(4).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(5).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(6).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(7).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(8).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
                        scienceEntityList.add(scienceEntity);
                    }
                    if (stockDayAllList1.get(9).getDate().compareTo(stockDayScience603.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience603, scienceEntity);
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
