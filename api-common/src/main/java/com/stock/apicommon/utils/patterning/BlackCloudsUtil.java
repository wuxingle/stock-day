package com.stock.apicommon.utils.patterning;

import com.stock.apicommon.Constants;
import com.stock.apicommon.entity.WuYunEntity;
import com.stock.apicommon.vo.WuYunVo;
import org.codehaus.janino.IClass;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

/**
 * 乌云系
 */
public class BlackCloudsUtil {


    public static WuYunVo getWuYun(List<WuYunEntity> wuYunEntityList) {
        if (wuYunEntityList == null || wuYunEntityList.size() == 0) {
            return null;
        }
        WuYunVo wuYunVo = new WuYunVo();
        List<WuYunEntity> wuYunEntityListgd = new ArrayList<>();
        List<WuYunEntity> wuYunEntityListfg = new ArrayList<>();
        List<WuYunEntity> wuYunEntityListdy = new ArrayList<>();
        List<WuYunEntity> wuYunEntityListctpj = new ArrayList<>();
        List<WuYunEntity> wuYunEntityListsuangf = new ArrayList<>();
        List<WuYunEntity> wuYunEntityListshanf = new ArrayList<>();
        List<WuYunEntity> wuYunEntityListshanly = new ArrayList<>();
        List<WuYunEntity> wuYunEntityListheisb = new ArrayList<>();
        for (int i = 0; i < wuYunEntityList.size(); i++) {
            if (i < 2) {
                wuYunEntityListgd.add(wuYunEntityList.get(i));
                wuYunEntityListfg.add(wuYunEntityList.get(i));
                wuYunEntityListdy.add(wuYunEntityList.get(i));
                wuYunEntityListctpj.add(wuYunEntityList.get(i));
            }
            if (i < 3) {
                wuYunEntityListsuangf.add(wuYunEntityList.get(i));
            }
            if (i < 4) {
                wuYunEntityListshanf.add(wuYunEntityList.get(i));
                wuYunEntityListshanly.add(wuYunEntityList.get(i));
                wuYunEntityListheisb.add(wuYunEntityList.get(i));
            }

        }

        //乌云盖顶
        if (wuYunEntityListgd.get(1).getRateOfChange().compareTo(new BigDecimal(1)) >= 0 && wuYunEntityListgd.get(1).getClosingPrice().compareTo(wuYunEntityListgd.get(1).getOpeningPrice()) > 0) {
            if (wuYunEntityListgd.get(0).getOpeningPrice().compareTo(wuYunEntityListgd.get(0).getClosingPrice()) > 0) {//阴线
                if (wuYunEntityListgd.get(0).getOpeningPrice().compareTo(wuYunEntityListgd.get(1).getClosingPrice()) > 0) {//高开
                    if (wuYunEntityListgd.get(0).getClosingPrice().compareTo(wuYunEntityListgd.get(1).getClosingPrice()) < 0) {//进入实体
                        if (wuYunEntityListgd.get(0).getClosingPrice().compareTo(wuYunEntityListgd.get(1).getOpeningPrice()) > 0) {
                            wuYunVo.setWuYunGaiDing(Constants.WYGD);
                        }
                    }
                }
            }
        }


        //谈友反攻
        if (wuYunEntityListfg.get(1).getRateOfChange().compareTo(new BigDecimal(1)) > 0 && wuYunEntityListfg.get(1).getClosingPrice().compareTo(wuYunEntityListfg.get(1).getOpeningPrice()) > 0) {
            if (wuYunEntityListfg.get(0).getOpeningPrice().compareTo(wuYunEntityListfg.get(0).getClosingPrice()) > 0) {//阴线
                if (wuYunEntityListfg.get(0).getOpeningPrice().compareTo(wuYunEntityListfg.get(1).getClosingPrice()) > 0) {//高开
                    if (wuYunEntityListfg.get(0).getClosingPrice().compareTo(wuYunEntityListfg.get(1).getClosingPrice()) > 0) {//没有进入实体
                        wuYunVo.setTanYouFanGong(Constants.TYFG);
                    }
                }
            }
        }

        //倾盆大雨
        if (wuYunEntityListdy.get(1).getRateOfChange().compareTo(new BigDecimal(1)) > 0 && wuYunEntityListdy.get(1).getClosingPrice().compareTo(wuYunEntityListdy.get(1).getOpeningPrice()) > 0) {
            if (wuYunEntityListdy.get(0).getOpeningPrice().compareTo(wuYunEntityListdy.get(0).getClosingPrice()) > 0) {//阴线
                if (wuYunEntityListdy.get(0).getOpeningPrice().compareTo(wuYunEntityListdy.get(1).getClosingPrice()) < 0) {//dikai
                    wuYunVo.setQingPengDaYu(Constants.QPDY);
                }
            }
        }

        //穿头破脚
        if (wuYunEntityListctpj.get(1).getRateOfChange().compareTo(new BigDecimal(1)) > 0 && wuYunEntityListctpj.get(1).getClosingPrice().compareTo(wuYunEntityListctpj.get(1).getOpeningPrice()) >= 0) {
            if (wuYunEntityListctpj.get(0).getOpeningPrice().compareTo(wuYunEntityListctpj.get(0).getClosingPrice()) > 0) {//阴线
                if (wuYunEntityListctpj.get(0).getOpeningPrice().compareTo(wuYunEntityListctpj.get(1).getClosingPrice()) > 0) {//高开
                    if (wuYunEntityListctpj.get(0).getClosingPrice().compareTo(wuYunEntityListctpj.get(1).getOpeningPrice()) < 0) {//穿过
                        wuYunVo.setChuangTouPoJiao(Constants.CTPJ);
                    }
                }
            }
        }

        //并排绿
        if (wuYunEntityListctpj.get(1).getOpeningPrice().compareTo(wuYunEntityListctpj.get(1).getClosingPrice()) > 0) {//阴线
            if (wuYunEntityListctpj.get(0).getOpeningPrice().compareTo(wuYunEntityListctpj.get(0).getClosingPrice()) > 0) {
                BigDecimal opbi = (wuYunEntityListctpj.get(1).getOpeningPrice().subtract(wuYunEntityListctpj.get(0).getOpeningPrice())).divide(wuYunEntityListctpj.get(1).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                if (opbi.compareTo(new BigDecimal(0.4)) < 0 && opbi.compareTo(new BigDecimal(-0.4)) > 0) {
                    BigDecimal cobi = (wuYunEntityListctpj.get(1).getClosingPrice().subtract(wuYunEntityListctpj.get(0).getClosingPrice())).divide(wuYunEntityListctpj.get(1).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                    if (cobi.compareTo(new BigDecimal(0.4)) < 0 && cobi.compareTo(new BigDecimal(-0.4)) > 0) {
                        wuYunVo.setBinPaiLv(Constants.BINPAILV);
                    }
                }
            }
        }

        //双飞乌鸦
        if (wuYunEntityListsuangf.get(2).getRateOfChange().compareTo(new BigDecimal(1)) >= 0 && wuYunEntityListsuangf.get(2).getClosingPrice().compareTo(wuYunEntityListsuangf.get(2).getOpeningPrice()) > 0) {
            if (wuYunEntityListsuangf.get(1).getOpeningPrice().compareTo(wuYunEntityListsuangf.get(1).getClosingPrice()) > 0) {//阴线
                if (wuYunEntityListsuangf.get(1).getOpeningPrice().compareTo(wuYunEntityListsuangf.get(2).getClosingPrice()) > 0) {//gaokai
                    if (wuYunEntityListsuangf.get(0).getOpeningPrice().compareTo(wuYunEntityListsuangf.get(0).getClosingPrice()) > 0) {//阴线
                        if (wuYunEntityListsuangf.get(0).getClosingPrice().compareTo(wuYunEntityListsuangf.get(1).getClosingPrice()) < 0) {//收的越来越低
                            wuYunVo.setSuangFeiWuYa(Constants.SUANGFWY);
                        }
                    }
                }
                if (wuYunEntityListsuangf.get(0).getClosingPrice().compareTo(wuYunEntityListsuangf.get(1).getOpeningPrice()) > 0 && wuYunEntityListsuangf.get(0).getClosingPrice().compareTo(wuYunEntityListsuangf.get(2).getClosingPrice()) > 0) {//阳线
                    wuYunVo.setLiangYangJiaYin(Constants.LYangJY);
                }

            }
        }
        //并排绿
        if (wuYunEntityListsuangf.get(2).getOpeningPrice().compareTo(wuYunEntityListsuangf.get(2).getClosingPrice()) > 0) {//阴线
            if (wuYunEntityListsuangf.get(1).getOpeningPrice().compareTo(wuYunEntityListsuangf.get(1).getClosingPrice()) > 0) {//阴线
                if (wuYunEntityListsuangf.get(1).getOpeningPrice().compareTo(wuYunEntityListsuangf.get(1).getClosingPrice()) > 0) {//阴线
                    BigDecimal opbi1 = (wuYunEntityListsuangf.get(2).getOpeningPrice().subtract(wuYunEntityListsuangf.get(0).getOpeningPrice())).divide(wuYunEntityListsuangf.get(0).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                    if (opbi1.compareTo(new BigDecimal(0.4)) < 0 && opbi1.compareTo(new BigDecimal(-0.4)) > 0) {
                        BigDecimal opbi = (wuYunEntityListsuangf.get(1).getOpeningPrice().subtract(wuYunEntityListsuangf.get(0).getOpeningPrice())).divide(wuYunEntityListsuangf.get(0).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                        if (opbi.compareTo(new BigDecimal(0.4)) < 0 && opbi.compareTo(new BigDecimal(-0.4)) > 0) {
                            BigDecimal cobi1 = (wuYunEntityListsuangf.get(2).getClosingPrice().subtract(wuYunEntityListsuangf.get(0).getClosingPrice())).divide(wuYunEntityListctpj.get(0).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            if (cobi1.compareTo(new BigDecimal(0.4)) < 0 && cobi1.compareTo(new BigDecimal(-0.4)) > 0) {
                                BigDecimal cobi = (wuYunEntityListsuangf.get(1).getClosingPrice().subtract(wuYunEntityListsuangf.get(0).getClosingPrice())).divide(wuYunEntityListctpj.get(0).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                                if (cobi.compareTo(new BigDecimal(0.4)) < 0 && cobi.compareTo(new BigDecimal(-0.4)) > 0) {
                                    wuYunVo.setBinPaiLv(Constants.BINPAILV);
                                }
                            }
                        }
                    }
                }
            }
        }

        //三飞乌鸦
        if (wuYunEntityListshanf.get(3).getRateOfChange().compareTo(new BigDecimal(1)) > 0 && wuYunEntityListshanf.get(3).getClosingPrice().compareTo(wuYunEntityListshanf.get(3).getOpeningPrice()) > 0) {//阳线
            if (wuYunEntityListshanf.get(2).getOpeningPrice().compareTo(wuYunEntityListshanf.get(2).getClosingPrice()) > 0) {//阴线
                if (wuYunEntityListshanf.get(2).getOpeningPrice().compareTo(wuYunEntityListshanf.get(3).getClosingPrice()) > 0) {//高开
                    if (getShiTiSize(wuYunEntityListshanf.get(2)).compareTo(new BigDecimal(2)) <= 0) {
                        if (wuYunEntityListshanf.get(1).getOpeningPrice().compareTo(wuYunEntityListshanf.get(1).getClosingPrice()) > 0) {//阴线
                            if (wuYunEntityListshanf.get(1).getOpeningPrice().compareTo(wuYunEntityListshanf.get(2).getClosingPrice()) > 0) {//高开
                                if (wuYunEntityListshanf.get(0).getOpeningPrice().compareTo(wuYunEntityListshanf.get(0).getClosingPrice()) > 0) {//阴线
                                    if (wuYunEntityListshanf.get(0).getClosingPrice().compareTo(wuYunEntityListshanf.get(2).getClosingPrice()) < 0) {
                                        wuYunVo.setShanFeiWuYa(Constants.SHANFWY);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (wuYunEntityListshanf.get(1).getOpeningPrice().compareTo(wuYunEntityListshanf.get(1).getClosingPrice()) > 0 && wuYunEntityListshanf.get(1).getClosingPrice().compareTo(wuYunEntityListshanf.get(3).getClosingPrice()) < 0) {//阴线
                        if (wuYunEntityListshanf.get(0).getOpeningPrice().compareTo(wuYunEntityListshanf.get(0).getClosingPrice()) < 0) {//阴线
                            if (wuYunEntityListshanf.get(0).getRateOfChange().compareTo(new BigDecimal(0)) > 0 && wuYunEntityListshanf.get(0).getClosingPrice().compareTo(wuYunEntityListshanf.get(2).getOpeningPrice()) > 0) {
                                wuYunVo.setLiangYangJiaYin(Constants.LYangJY);
                            }
                        }
                    }
                }
            }
        }
        //下跌三连阴
        if (wuYunEntityListshanly.get(3).getRateOfChange().compareTo(new BigDecimal(1)) > 0 && wuYunEntityListshanly.get(3).getClosingPrice().compareTo(wuYunEntityListshanly.get(3).getOpeningPrice()) > 0) {//阳线
            if (wuYunEntityListshanly.get(2).getOpeningPrice().compareTo(wuYunEntityListshanly.get(2).getClosingPrice()) > 0) {//阴线
                if (wuYunEntityListshanly.get(2).getOpeningPrice().compareTo(wuYunEntityListshanly.get(3).getClosingPrice()) > 0) {//高开
                    if (getShiTiSize(wuYunEntityListshanly.get(2)).compareTo(new BigDecimal(2)) > 0) {
                        if (wuYunEntityListshanly.get(1).getOpeningPrice().compareTo(wuYunEntityListshanly.get(2).getClosingPrice()) < 0) {//缺口
                            if (wuYunEntityListshanly.get(1).getOpeningPrice().compareTo(wuYunEntityListshanly.get(1).getClosingPrice()) > 0) {//阴线
                                if (getShiTiSize(wuYunEntityListshanly.get(1)).compareTo(new BigDecimal(2)) > 0) {
                                    if (wuYunEntityListshanly.get(0).getOpeningPrice().compareTo(wuYunEntityListshanly.get(0).getClosingPrice()) > 0) {//阴线
                                        if (wuYunEntityListshanly.get(0).getClosingPrice().compareTo(wuYunEntityListshanly.get(2).getClosingPrice()) < 0 && wuYunEntityListshanly.get(0).getClosingPrice().compareTo(wuYunEntityListshanly.get(3).getClosingPrice()) < 0) {
                                            wuYunVo.setXiaDieShanLianYing(Constants.XDSLY);
                                        }
                                    }
                                }
                            }
                        } else if (wuYunEntityListshanly.get(1).getOpeningPrice().compareTo(wuYunEntityListshanly.get(1).getClosingPrice()) > 0) {//阴线
                            if (getShiTiSize(wuYunEntityListshanly.get(1)).compareTo(new BigDecimal(2)) > 0) {
                                if (wuYunEntityListshanly.get(0).getOpeningPrice().compareTo(wuYunEntityListshanly.get(1).getClosingPrice()) < 0) {//缺口
                                    if (wuYunEntityListshanly.get(0).getOpeningPrice().compareTo(wuYunEntityListshanly.get(0).getClosingPrice()) > 0) {//阴线
                                        if (wuYunEntityListshanly.get(0).getClosingPrice().compareTo(wuYunEntityListshanly.get(2).getClosingPrice()) < 0 && wuYunEntityListshanly.get(0).getClosingPrice().compareTo(wuYunEntityListshanly.get(3).getClosingPrice()) < 0) {
                                            wuYunVo.setXiaDieShanLianYing(Constants.XDSLY);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (wuYunEntityListshanly.get(1).getOpeningPrice().compareTo(wuYunEntityListshanly.get(1).getClosingPrice()) > 0 && wuYunEntityListshanly.get(1).getClosingPrice().compareTo(wuYunEntityListshanly.get(3).getClosingPrice()) < 0) {//阴线
                        if (wuYunEntityListshanly.get(0).getOpeningPrice().compareTo(wuYunEntityListshanly.get(0).getClosingPrice()) <= 0) {//阴线
                            if (wuYunEntityListshanly.get(0).getRateOfChange().compareTo(new BigDecimal(0)) >= 0 && wuYunEntityListshanly.get(0).getClosingPrice().compareTo(wuYunEntityListshanly.get(2).getOpeningPrice()) > 0) {
                                wuYunVo.setLiangYangJiaYin(Constants.LYangJY);
                            }
                        }
                    }
                }
            }
        }
        //黑三兵
        if (wuYunEntityListheisb.get(2).getOpeningPrice().compareTo(wuYunEntityListheisb.get(2).getClosingPrice()) > 0) {//阴线
            if (wuYunEntityListshanf.get(2).getOpeningPrice().compareTo(wuYunEntityListshanf.get(3).getClosingPrice()) > 0) {//高开
                if (wuYunEntityListshanf.get(1).getOpeningPrice().compareTo(wuYunEntityListshanf.get(1).getClosingPrice()) > 0) {//阴线
                    if (wuYunEntityListshanf.get(1).getOpeningPrice().compareTo(wuYunEntityListshanf.get(2).getClosingPrice()) > 0) {//高开
                        if (wuYunEntityListshanf.get(1).getClosingPrice().compareTo(wuYunEntityListshanf.get(2).getClosingPrice()) < 0) {//底走
                            if (wuYunEntityListshanf.get(0).getOpeningPrice().compareTo(wuYunEntityListshanf.get(0).getClosingPrice()) > 0) {//阴线
                                if (wuYunEntityListshanf.get(0).getClosingPrice().compareTo(wuYunEntityListshanf.get(1).getClosingPrice()) < 0) {//底走
                                    if (wuYunEntityListshanf.get(0).getClosingPrice().compareTo(wuYunEntityListshanf.get(2).getClosingPrice()) < 0 && wuYunEntityListshanf.get(0).getClosingPrice().compareTo(wuYunEntityListshanf.get(3).getClosingPrice()) < 0) {
                                        wuYunVo.setHeiShanBing(Constants.HSB);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
//        //九阴白骨爪
//        int count=0;
//        for (int i=0;i<wuYunEntityListjy.size();i++){
//            if (i!=0){
//               BigDecimal changSize= wuYunEntityListjy.get(i).getClosingPrice().subtract(wuYunEntityListjy.get(0).getClosingPrice());
//               BigDecimal changRate=changSize.divide(wuYunEntityListjy.get(0).getClosingPrice(),2,RoundingMode.HALF_UP);
//               if (changRate.compareTo(new BigDecimal(-2))>0||changRate.compareTo(new BigDecimal(2))<0){
//                count++;
//               }
//            }
//        }
//        if (count>5){
//            wuYunVo.setJiuYingBaiGu(Constants.JYBGZ);
//        }
        return wuYunVo;
    }

    public static WuYunVo getWuYun1(List<WuYunEntity> wuYunEntityList) {
        if (wuYunEntityList == null || wuYunEntityList.size() == 0) {
            return null;
        }
        WuYunVo wuYunVo = new WuYunVo();
        List<WuYunEntity> wuYunEntityListgd = new ArrayList<>();
        List<WuYunEntity> wuYunEntityListfg = new ArrayList<>();
        List<WuYunEntity> wuYunEntityListdy = new ArrayList<>();
        List<WuYunEntity> wuYunEntityListctpj = new ArrayList<>();
        List<WuYunEntity> wuYunEntityListsuangf = new ArrayList<>();
        List<WuYunEntity> wuYunEntityListshanf = new ArrayList<>();
        List<WuYunEntity> wuYunEntityListshanly = new ArrayList<>();
        List<WuYunEntity> wuYunEntityListheisb = new ArrayList<>();
        for (int i = 0; i < wuYunEntityList.size(); i++) {
            if (i < 3) {
                wuYunEntityListgd.add(wuYunEntityList.get(i));
                wuYunEntityListfg.add(wuYunEntityList.get(i));
                wuYunEntityListdy.add(wuYunEntityList.get(i));
                wuYunEntityListctpj.add(wuYunEntityList.get(i));
            }
            if (i < 4) {
                wuYunEntityListsuangf.add(wuYunEntityList.get(i));
            }
            if (i < 5) {
                wuYunEntityListshanf.add(wuYunEntityList.get(i));
                wuYunEntityListshanly.add(wuYunEntityList.get(i));
                wuYunEntityListheisb.add(wuYunEntityList.get(i));
            }

        }

        //乌云盖顶
        if (wuYunEntityListgd.get(1).getRateOfChange().compareTo(new BigDecimal(1)) >= 0 && wuYunEntityListgd.get(1).getClosingPrice().compareTo(wuYunEntityListgd.get(1).getOpeningPrice()) > 0) {
            if (wuYunEntityListgd.get(0).getOpeningPrice().compareTo(wuYunEntityListgd.get(0).getClosingPrice()) > 0) {//阴线
                if (wuYunEntityListgd.get(0).getOpeningPrice().compareTo(wuYunEntityListgd.get(1).getClosingPrice()) > 0) {//高开
                    if (wuYunEntityListgd.get(0).getClosingPrice().compareTo(wuYunEntityListgd.get(1).getClosingPrice()) < 0) {//进入实体
                        if (wuYunEntityListgd.get(0).getClosingPrice().compareTo(wuYunEntityListgd.get(1).getOpeningPrice()) > 0) {
                            wuYunVo.setWuYunGaiDing(Constants.WYGD);
                        }
                    }
                }
            }
        }


        //谈友反攻
        if (wuYunEntityListfg.get(1).getRateOfChange().compareTo(new BigDecimal(1)) > 0 && wuYunEntityListfg.get(1).getClosingPrice().compareTo(wuYunEntityListfg.get(1).getOpeningPrice()) > 0) {
            if (wuYunEntityListfg.get(0).getOpeningPrice().compareTo(wuYunEntityListfg.get(0).getClosingPrice()) > 0) {//阴线
                if (wuYunEntityListfg.get(0).getOpeningPrice().compareTo(wuYunEntityListfg.get(1).getClosingPrice()) > 0) {//高开
                    if (wuYunEntityListfg.get(0).getClosingPrice().compareTo(wuYunEntityListfg.get(1).getClosingPrice()) > 0) {//没有进入实体
                        wuYunVo.setTanYouFanGong(Constants.TYFG);
                    }
                }
            }
        }

        //倾盆大雨
        if (wuYunEntityListdy.get(1).getRateOfChange().compareTo(new BigDecimal(1)) > 0 && wuYunEntityListdy.get(1).getClosingPrice().compareTo(wuYunEntityListdy.get(1).getOpeningPrice()) > 0) {
            if (wuYunEntityListdy.get(0).getOpeningPrice().compareTo(wuYunEntityListdy.get(0).getClosingPrice()) > 0) {//阴线
                if (wuYunEntityListdy.get(0).getOpeningPrice().compareTo(wuYunEntityListdy.get(1).getClosingPrice()) < 0) {//dikai
                    wuYunVo.setQingPengDaYu(Constants.QPDY);
                }
            }
        }

        //穿头破脚
        if (wuYunEntityListctpj.get(1).getRateOfChange().compareTo(new BigDecimal(1)) > 0 && wuYunEntityListctpj.get(1).getClosingPrice().compareTo(wuYunEntityListctpj.get(1).getOpeningPrice()) >= 0) {
            if (wuYunEntityListctpj.get(0).getOpeningPrice().compareTo(wuYunEntityListctpj.get(0).getClosingPrice()) > 0) {//阴线
                if (wuYunEntityListctpj.get(0).getOpeningPrice().compareTo(wuYunEntityListctpj.get(1).getClosingPrice()) > 0) {//高开
                    if (wuYunEntityListctpj.get(0).getClosingPrice().compareTo(wuYunEntityListctpj.get(1).getOpeningPrice()) < 0) {//穿过
                        wuYunVo.setChuangTouPoJiao(Constants.CTPJ);
                    }
                }
            }
        }

        //并排绿
        if (wuYunEntityListctpj.get(1).getOpeningPrice().compareTo(wuYunEntityListctpj.get(1).getClosingPrice()) > 0) {//阴线
            if (wuYunEntityListctpj.get(0).getOpeningPrice().compareTo(wuYunEntityListctpj.get(0).getClosingPrice()) > 0) {
                BigDecimal opbi = (wuYunEntityListctpj.get(1).getOpeningPrice().subtract(wuYunEntityListctpj.get(0).getOpeningPrice())).divide(wuYunEntityListctpj.get(1).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                if (opbi.compareTo(new BigDecimal(0.5)) < 0 && opbi.compareTo(new BigDecimal(-0.5)) > 0) {
                    BigDecimal cobi = (wuYunEntityListctpj.get(1).getClosingPrice().subtract(wuYunEntityListctpj.get(0).getClosingPrice())).divide(wuYunEntityListctpj.get(1).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                    if (cobi.compareTo(new BigDecimal(0.5)) < 0 && cobi.compareTo(new BigDecimal(-0.5)) > 0) {
                        wuYunVo.setBinPaiLv(Constants.BINPAILV);
                    }
                }
            }
        }

        //双飞乌鸦
        if (wuYunEntityListsuangf.get(2).getRateOfChange().compareTo(new BigDecimal(1)) >= 0 && wuYunEntityListsuangf.get(2).getClosingPrice().compareTo(wuYunEntityListsuangf.get(2).getOpeningPrice()) > 0) {
            if (wuYunEntityListsuangf.get(1).getOpeningPrice().compareTo(wuYunEntityListsuangf.get(1).getClosingPrice()) > 0) {//阴线
                if (wuYunEntityListsuangf.get(0).getOpeningPrice().compareTo(wuYunEntityListsuangf.get(0).getClosingPrice()) > 0) {//阴线
                    if (wuYunEntityListsuangf.get(0).getClosingPrice().compareTo(wuYunEntityListsuangf.get(1).getClosingPrice()) < 0&&wuYunEntityListsuangf.get(0).getClosingPrice().compareTo(wuYunEntityListsuangf.get(2).getClosingPrice())<0) {//收的越来越低
                        wuYunVo.setSuangFeiWuYa(Constants.SUANGFWY);
                    }
                }
                if (wuYunEntityListsuangf.get(0).getClosingPrice().compareTo(wuYunEntityListsuangf.get(1).getOpeningPrice()) > 0 && wuYunEntityListsuangf.get(0).getClosingPrice().compareTo(wuYunEntityListsuangf.get(2).getClosingPrice()) > 0) {//阳线
                    wuYunVo.setLiangYangJiaYin(Constants.LYangJY);
                }

            }
        }
        //并排绿
        if (wuYunEntityListsuangf.get(2).getOpeningPrice().compareTo(wuYunEntityListsuangf.get(2).getClosingPrice()) > 0) {//阴线
            if (wuYunEntityListsuangf.get(1).getOpeningPrice().compareTo(wuYunEntityListsuangf.get(1).getClosingPrice()) > 0) {//阴线
                if (wuYunEntityListsuangf.get(1).getOpeningPrice().compareTo(wuYunEntityListsuangf.get(1).getClosingPrice()) > 0) {//阴线
                    BigDecimal opbi1 = (wuYunEntityListsuangf.get(2).getOpeningPrice().subtract(wuYunEntityListsuangf.get(0).getOpeningPrice())).divide(wuYunEntityListsuangf.get(0).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                    if (opbi1.compareTo(new BigDecimal(0.4)) < 0 && opbi1.compareTo(new BigDecimal(-0.4)) > 0) {
                        BigDecimal opbi = (wuYunEntityListsuangf.get(1).getOpeningPrice().subtract(wuYunEntityListsuangf.get(0).getOpeningPrice())).divide(wuYunEntityListsuangf.get(0).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                        if (opbi.compareTo(new BigDecimal(0.4)) < 0 && opbi.compareTo(new BigDecimal(-0.4)) > 0) {
                            BigDecimal cobi1 = (wuYunEntityListsuangf.get(2).getClosingPrice().subtract(wuYunEntityListsuangf.get(0).getClosingPrice())).divide(wuYunEntityListctpj.get(0).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                            if (cobi1.compareTo(new BigDecimal(0.4)) < 0 && cobi1.compareTo(new BigDecimal(-0.4)) > 0) {
                                BigDecimal cobi = (wuYunEntityListsuangf.get(1).getClosingPrice().subtract(wuYunEntityListsuangf.get(0).getClosingPrice())).divide(wuYunEntityListctpj.get(0).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                                if (cobi.compareTo(new BigDecimal(0.4)) < 0 && cobi.compareTo(new BigDecimal(-0.4)) > 0) {
                                    wuYunVo.setBinPaiLv(Constants.BINPAILV);
                                }
                            }
                        }
                    }
                }
            }
        }

        //三飞乌鸦
        if (wuYunEntityListshanf.get(3).getRateOfChange().compareTo(new BigDecimal(1)) > 0 && wuYunEntityListshanf.get(3).getClosingPrice().compareTo(wuYunEntityListshanf.get(3).getOpeningPrice()) > 0) {//阳线
            if (wuYunEntityListshanf.get(2).getOpeningPrice().compareTo(wuYunEntityListshanf.get(2).getClosingPrice()) > 0) {//阴线
                if (wuYunEntityListshanf.get(2).getOpeningPrice().compareTo(wuYunEntityListshanf.get(3).getClosingPrice()) > 0) {//高开
                    if (getShiTiSize(wuYunEntityListshanf.get(2)).compareTo(new BigDecimal(2)) <= 0) {
                        if (wuYunEntityListshanf.get(1).getOpeningPrice().compareTo(wuYunEntityListshanf.get(1).getClosingPrice()) > 0) {//阴线
                            if (wuYunEntityListshanf.get(1).getOpeningPrice().compareTo(wuYunEntityListshanf.get(2).getClosingPrice()) > 0) {//高开
                                if (wuYunEntityListshanf.get(0).getOpeningPrice().compareTo(wuYunEntityListshanf.get(0).getClosingPrice()) > 0) {//阴线
                                    if (wuYunEntityListshanf.get(0).getClosingPrice().compareTo(wuYunEntityListshanf.get(2).getClosingPrice()) < 0) {
                                        wuYunVo.setShanFeiWuYa(Constants.SHANFWY);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (wuYunEntityListshanf.get(1).getOpeningPrice().compareTo(wuYunEntityListshanf.get(1).getClosingPrice()) > 0 && wuYunEntityListshanf.get(1).getClosingPrice().compareTo(wuYunEntityListshanf.get(3).getClosingPrice()) < 0) {//阴线
                        if (wuYunEntityListshanf.get(0).getOpeningPrice().compareTo(wuYunEntityListshanf.get(0).getClosingPrice()) < 0) {//阴线
                            if (wuYunEntityListshanf.get(0).getRateOfChange().compareTo(new BigDecimal(0)) > 0 && wuYunEntityListshanf.get(0).getClosingPrice().compareTo(wuYunEntityListshanf.get(2).getOpeningPrice()) > 0) {
                                wuYunVo.setLiangYangJiaYin(Constants.LYangJY);
                            }
                        }
                    }
                }
            }
        }
        //下跌三连阴
        if (wuYunEntityListshanly.get(3).getRateOfChange().compareTo(new BigDecimal(1)) > 0 && wuYunEntityListshanly.get(3).getClosingPrice().compareTo(wuYunEntityListshanly.get(3).getOpeningPrice()) > 0) {//阳线
            if (wuYunEntityListshanly.get(2).getOpeningPrice().compareTo(wuYunEntityListshanly.get(2).getClosingPrice()) > 0) {//阴线
                if (wuYunEntityListshanly.get(2).getOpeningPrice().compareTo(wuYunEntityListshanly.get(3).getClosingPrice()) > 0) {//高开
                    if (getShiTiSize(wuYunEntityListshanly.get(2)).compareTo(new BigDecimal(2)) > 0) {
                        if (wuYunEntityListshanly.get(1).getOpeningPrice().compareTo(wuYunEntityListshanly.get(2).getClosingPrice()) < 0) {//缺口
                            if (wuYunEntityListshanly.get(1).getOpeningPrice().compareTo(wuYunEntityListshanly.get(1).getClosingPrice()) > 0) {//阴线
                                if (getShiTiSize(wuYunEntityListshanly.get(1)).compareTo(new BigDecimal(2)) > 0) {
                                    if (wuYunEntityListshanly.get(0).getOpeningPrice().compareTo(wuYunEntityListshanly.get(0).getClosingPrice()) > 0) {//阴线
                                        if (wuYunEntityListshanly.get(0).getClosingPrice().compareTo(wuYunEntityListshanly.get(2).getClosingPrice()) < 0 && wuYunEntityListshanly.get(0).getClosingPrice().compareTo(wuYunEntityListshanly.get(3).getClosingPrice()) < 0) {
                                            wuYunVo.setXiaDieShanLianYing(Constants.XDSLY);
                                        }
                                    }
                                }
                            }
                        } else if (wuYunEntityListshanly.get(1).getOpeningPrice().compareTo(wuYunEntityListshanly.get(1).getClosingPrice()) > 0) {//阴线
                            if (getShiTiSize(wuYunEntityListshanly.get(1)).compareTo(new BigDecimal(2)) > 0) {
                                if (wuYunEntityListshanly.get(0).getOpeningPrice().compareTo(wuYunEntityListshanly.get(1).getClosingPrice()) < 0) {//缺口
                                    if (wuYunEntityListshanly.get(0).getOpeningPrice().compareTo(wuYunEntityListshanly.get(0).getClosingPrice()) > 0) {//阴线
                                        if (wuYunEntityListshanly.get(0).getClosingPrice().compareTo(wuYunEntityListshanly.get(2).getClosingPrice()) < 0 && wuYunEntityListshanly.get(0).getClosingPrice().compareTo(wuYunEntityListshanly.get(3).getClosingPrice()) < 0) {
                                            wuYunVo.setXiaDieShanLianYing(Constants.XDSLY);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (wuYunEntityListshanly.get(1).getOpeningPrice().compareTo(wuYunEntityListshanly.get(1).getClosingPrice()) > 0 && wuYunEntityListshanly.get(1).getClosingPrice().compareTo(wuYunEntityListshanly.get(3).getClosingPrice()) < 0) {//阴线
                        if (wuYunEntityListshanly.get(0).getOpeningPrice().compareTo(wuYunEntityListshanly.get(0).getClosingPrice()) <= 0) {//阴线
                            if (wuYunEntityListshanly.get(0).getRateOfChange().compareTo(new BigDecimal(0)) >= 0 && wuYunEntityListshanly.get(0).getClosingPrice().compareTo(wuYunEntityListshanly.get(2).getOpeningPrice()) > 0) {
                                wuYunVo.setLiangYangJiaYin(Constants.LYangJY);
                            }
                        }
                    }
                }
            }
        }
        //黑三兵
        if (wuYunEntityListheisb.get(2).getOpeningPrice().compareTo(wuYunEntityListheisb.get(2).getClosingPrice()) > 0) {//阴线
            if (wuYunEntityListshanf.get(2).getOpeningPrice().compareTo(wuYunEntityListshanf.get(3).getClosingPrice()) > 0) {//高开
                if (wuYunEntityListshanf.get(1).getOpeningPrice().compareTo(wuYunEntityListshanf.get(1).getClosingPrice()) > 0) {//阴线
                    if (wuYunEntityListshanf.get(1).getOpeningPrice().compareTo(wuYunEntityListshanf.get(2).getClosingPrice()) > 0) {//高开
                        if (wuYunEntityListshanf.get(1).getClosingPrice().compareTo(wuYunEntityListshanf.get(2).getClosingPrice()) < 0) {//底走
                            if (wuYunEntityListshanf.get(0).getOpeningPrice().compareTo(wuYunEntityListshanf.get(0).getClosingPrice()) > 0) {//阴线
                                if (wuYunEntityListshanf.get(0).getClosingPrice().compareTo(wuYunEntityListshanf.get(1).getClosingPrice()) < 0) {//底走
                                    if (wuYunEntityListshanf.get(0).getClosingPrice().compareTo(wuYunEntityListshanf.get(2).getClosingPrice()) < 0 && wuYunEntityListshanf.get(0).getClosingPrice().compareTo(wuYunEntityListshanf.get(3).getClosingPrice()) < 0) {
                                        wuYunVo.setHeiShanBing(Constants.HSB);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
//        //九阴白骨爪
//        int count=0;
//        for (int i=0;i<wuYunEntityListjy.size();i++){
//            if (i!=0){
//               BigDecimal changSize= wuYunEntityListjy.get(i).getClosingPrice().subtract(wuYunEntityListjy.get(0).getClosingPrice());
//               BigDecimal changRate=changSize.divide(wuYunEntityListjy.get(0).getClosingPrice(),2,RoundingMode.HALF_UP);
//               if (changRate.compareTo(new BigDecimal(-2))>0||changRate.compareTo(new BigDecimal(2))<0){
//                count++;
//               }
//            }
//        }
//        if (count>5){
//            wuYunVo.setJiuYingBaiGu(Constants.JYBGZ);
//        }
        return wuYunVo;
    }

    //计算实体大小
    public static BigDecimal getShiTiSize(WuYunEntity wuYunEntity) {
        BigDecimal changSize = wuYunEntity.getClosingPrice().subtract(wuYunEntity.getOpeningPrice());
        BigDecimal changRate = changSize.divide(wuYunEntity.getLclosePrice(), 2, RoundingMode.HALF_UP);
        return changRate;
    }


}
