package com.stock.apicommon.utils.patterning;

import com.stock.apicommon.Constants;
import com.stock.apicommon.entity.DangRiEntity;
import com.stock.apicommon.vo.DangRiVo;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 当日系
 */
public class DangRiUtil {

    public static DangRiVo getDangRi(DangRiEntity dangRiEntity) {
        DangRiVo dangRiVo = new DangRiVo();
        if (dangRiEntity.getClosingPrice().compareTo(dangRiEntity.getOpeningPrice()) > 0) {//阳线
            if (dangRiEntity.getRateOfChange().compareTo(new BigDecimal(6))>0){
                dangRiVo.setXianXing(Constants.DAYANG);
            }else if (dangRiEntity.getRateOfChange().compareTo(new BigDecimal(3))>0){
                dangRiVo.setXianXing(Constants.ZHONGYANG);
            }else {
                dangRiVo.setXianXing(Constants.XIAOYANG);
            }
            //判断影线
            if (dangRiEntity.getTopside().compareTo(dangRiEntity.getClosingPrice()) == 0 && dangRiEntity.getOpeningPrice().compareTo(dangRiEntity.getFoot()) > 0) {//没有上影有下影线

                BigDecimal xianChang = dangRiEntity.getOpeningPrice().subtract(dangRiEntity.getFoot());//线长
                BigDecimal shiTiChang = dangRiEntity.getClosingPrice().subtract(dangRiEntity.getOpeningPrice());//实体长
                if (shiTiChang.compareTo(new BigDecimal(0)) == 0) {
                    shiTiChang.add(new BigDecimal(0.01));
                }
                BigDecimal biLI = xianChang.divide(shiTiChang, 1, RoundingMode.HALF_UP);
                //影线与实体大于比例100倍
                if (biLI.compareTo(new BigDecimal(100)) >= 0) {
                    dangRiVo.setXiayingxian100(Constants.XIAYINGXIAN100);
                }
                //下影线与实体大于比例20倍
                else if (biLI.compareTo(new BigDecimal(20)) > 0) {
                    dangRiVo.setXiayingxian20(Constants.XIAYINGXIAN20);
                }
                //下影线与实体大于比例10倍
                else if (biLI.compareTo(new BigDecimal(10)) > 0) {
                    dangRiVo.setXiayingxian10(Constants.XIAYINGXIAN10);
                }
                //下影线与实体大于比例3倍
                else if (biLI.compareTo(new BigDecimal(3)) > 0) {
                    dangRiVo.setXiayingxian3(Constants.XIAYINGXIAN3);
                }
                //下影线与实体大于比例1倍
                else if (biLI.compareTo(new BigDecimal(1)) > 0) {
                    dangRiVo.setXiayingxian1(Constants.XIAYINGXIAN1);
                }
                //下影线与实体大于比例50%
                else if (biLI.compareTo(new BigDecimal(0.5)) > 0) {
                    dangRiVo.setXiayingxian0_5(Constants.XIAYINGXIAN0_5);
                }
                //下影线与实体小于比例50%
                else if (biLI.compareTo(new BigDecimal(0)) > 0) {
                    dangRiVo.setXiayingxian0(Constants.XIAYINGXIAN0);
                }
            } else if (dangRiEntity.getFoot().compareTo(dangRiEntity.getOpeningPrice()) == 0 && dangRiEntity.getClosingPrice().compareTo(dangRiEntity.getTopside()) < 0) {//没有下影有上影线
                BigDecimal xianChang = dangRiEntity.getTopside().subtract(dangRiEntity.getClosingPrice());//线长
                BigDecimal shiTiChang = dangRiEntity.getClosingPrice().subtract(dangRiEntity.getOpeningPrice());//实体长
                if (shiTiChang.compareTo(new BigDecimal(0)) == 0) {
                    shiTiChang.add(new BigDecimal(0.01));
                }
                BigDecimal biLI = xianChang.divide(shiTiChang, 1, RoundingMode.HALF_UP);
                //上T型（影线与实体大于比例100倍）
                if (biLI.compareTo(new BigDecimal(100)) >= 0) {
                    dangRiVo.setShangyingxian100(Constants.SHANGYINGXIAN100);
                }
                //上影线与实体大于比例20倍
                else if (biLI.compareTo(new BigDecimal(20)) > 0) {
                    dangRiVo.setShangyingxian20(Constants.SHANGYINGXIAN20);
                }
                //上影线与实体大于比例10倍
                else if (biLI.compareTo(new BigDecimal(10)) > 0) {
                    dangRiVo.setShangyingxian10(Constants.SHANGYINGXIAN10);
                }
                //上影线与实体大于比例3倍
                else if (biLI.compareTo(new BigDecimal(3)) > 0) {
                    dangRiVo.setShangyingxian3(Constants.SHANGYINGXIAN3);
                }
                //上影线与实体大于比例1倍
                else if (biLI.compareTo(new BigDecimal(1)) > 0) {
                    dangRiVo.setShangyingxian1(Constants.SHANGYINGXIAN1);
                }
                //上影线与实体大于比例50%
                else if (biLI.compareTo(new BigDecimal(0.5)) > 0) {
                    dangRiVo.setShangyingxian0_5(Constants.SHANGYINGXIAN0_5);
                }
                //上影线与实体小于比例50%
                else if (biLI.compareTo(new BigDecimal(0)) > 0) {
                    dangRiVo.setShangyingxian0(Constants.SHANGYINGXIAN0);
                }
            } else {//都有影线或者都没有
                BigDecimal shangxianChang = dangRiEntity.getTopside().subtract(dangRiEntity.getClosingPrice());//上影线线长
                BigDecimal xiaxianChang = dangRiEntity.getOpeningPrice().subtract(dangRiEntity.getFoot());//下影线线长
                BigDecimal shiTiChang = dangRiEntity.getClosingPrice().subtract(dangRiEntity.getOpeningPrice());//实体长
                if (shangxianChang.compareTo(new BigDecimal(0)) == 0 && xiaxianChang.compareTo(new BigDecimal(0)) == 0) {

                } else {
                    BigDecimal xianBI = shangxianChang.divide(xiaxianChang, 2, RoundingMode.HALF_UP);//上下影线比
                    BigDecimal shangyingxianbi = shangxianChang.divide(dangRiEntity.getClosingPrice(), 2, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                    BigDecimal xiayingxianbi = xiaxianChang.divide(dangRiEntity.getClosingPrice(), 2, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                    if (shiTiChang.compareTo(new BigDecimal(0)) == 0) {
                        shiTiChang.add(new BigDecimal(0.01));
                    }
                    BigDecimal biLI = shangxianChang.divide(shiTiChang, 1, RoundingMode.HALF_UP);
                    BigDecimal biL2 = xiaxianChang.divide(shiTiChang, 1, RoundingMode.HALF_UP);
                    if (xianBI.compareTo(new BigDecimal(3)) > 0 || xianBI.compareTo(new BigDecimal(0.33)) < 0) {
                        if (shangyingxianbi.compareTo(new BigDecimal(2)) > 0 && xiayingxianbi.compareTo(new BigDecimal(0.5)) < 0) {//上影线
                            if (biLI.compareTo(new BigDecimal(100)) > 0) {
                                dangRiVo.setShangyingxian100(Constants.SHANGYINGXIAN100);
                            }
                            //上影线与实体大于比例20倍
                            else if (biLI.compareTo(new BigDecimal(20)) > 0) {
                                dangRiVo.setShangyingxian20(Constants.SHANGYINGXIAN20);
                            }
                            //上影线与实体大于比例10倍
                            else if (biLI.compareTo(new BigDecimal(10)) > 0) {
                                dangRiVo.setShangyingxian10(Constants.SHANGYINGXIAN10);
                            }
                            //上影线与实体大于比例3倍
                            else if (biLI.compareTo(new BigDecimal(3)) > 0) {
                                dangRiVo.setShangyingxian3(Constants.SHANGYINGXIAN3);
                            }
                        }
                        else if (shangyingxianbi.compareTo(new BigDecimal(0.5)) < 0 && xiayingxianbi.compareTo(new BigDecimal(2)) > 0) {//下影线
                            //影线与实体大于比例100倍
                            if (biL2.compareTo(new BigDecimal(100)) > 0) {
                                dangRiVo.setXiayingxian100(Constants.XIAYINGXIAN100);
                            }
                            //下影线与实体大于比例20倍
                            else if (biL2.compareTo(new BigDecimal(20)) > 0) {
                                dangRiVo.setXiayingxian20(Constants.XIAYINGXIAN20);
                            }
                            //下影线与实体大于比例10倍
                            else if (biL2.compareTo(new BigDecimal(10)) > 0) {
                                dangRiVo.setXiayingxian10(Constants.XIAYINGXIAN10);
                            }
                            //下影线与实体大于比例3倍
                            else if (biL2.compareTo(new BigDecimal(3)) > 0) {
                                dangRiVo.setXiayingxian3(Constants.XIAYINGXIAN3);
                            }
                        }
                        //+影线与实体大于比例3倍
                        else if (biLI.compareTo(new BigDecimal(3)) > 0) {
                            dangRiVo.setShizixing3(Constants.SHIZIXING3);
                        }
                        //+影线与实体大于比例1倍
                        else if (biLI.compareTo(new BigDecimal(1)) > 0) {
                            dangRiVo.setShizixing1(Constants.SHIZIXING1);
                        }
                        //+影线与实体大于比例50%
                        else if (biLI.compareTo(new BigDecimal(0.5)) > 0) {
                            dangRiVo.setShizixing0_5(Constants.SHIZIXING0_5);
                        }
                        //+影线与实体小于比例50%
                        else if (biLI.compareTo(new BigDecimal(0)) > 0) {
                            dangRiVo.setShizixing0(Constants.SHIZIXING0);
                        }

                    }

                    //+型（影线与实体大于比例50倍）
                    else if (biLI.compareTo(new BigDecimal(50)) > 0) {
                        dangRiVo.setShizixing50(Constants.SHIZIXING50);
                    }
                    //+影线与实体大于比例10倍
                    else if (biLI.compareTo(new BigDecimal(10)) > 0) {
                        dangRiVo.setShizixing10(Constants.SHIZIXING10);
                    }
                    //+影线与实体大于比例3倍
                    else if (biLI.compareTo(new BigDecimal(3)) > 0) {
                        dangRiVo.setShizixing3(Constants.SHIZIXING3);
                    }
                    //+影线与实体大于比例1倍
                    else if (biLI.compareTo(new BigDecimal(1)) > 0) {
                        dangRiVo.setShizixing1(Constants.SHIZIXING1);
                    }
                    //+影线与实体大于比例50%
                    else if (biLI.compareTo(new BigDecimal(0.5)) > 0) {
                        dangRiVo.setShizixing0_5(Constants.SHIZIXING0_5);
                    }
                    //+影线与实体小于比例50%
                    else if (biLI.compareTo(new BigDecimal(0)) > 0) {
                        dangRiVo.setShizixing0(Constants.SHIZIXING0);
                    }
                }
            }

        } else {//阴线
            if (dangRiEntity.getRateOfChange().compareTo(new BigDecimal(-6))<0){
                dangRiVo.setXianXing(Constants.DAYIN);
            }else if (dangRiEntity.getRateOfChange().compareTo(new BigDecimal(-3))<0){
                dangRiVo.setXianXing(Constants.ZHONGYIN);
            }else {
                dangRiVo.setXianXing(Constants.XIAOYIN);
            }
            //判断影线
            if (dangRiEntity.getTopside().compareTo(dangRiEntity.getOpeningPrice()) == 0 && dangRiEntity.getClosingPrice().compareTo(dangRiEntity.getFoot()) > 0) {//没有上影有下影线
                BigDecimal xianChang = dangRiEntity.getClosingPrice().subtract(dangRiEntity.getFoot());//线长
                BigDecimal shiTiChang = dangRiEntity.getOpeningPrice().subtract(dangRiEntity.getClosingPrice());//实体长
                if (shiTiChang.compareTo(new BigDecimal(0)) == 0) {
                    shiTiChang=shiTiChang.add(new BigDecimal(0.01));
                }
                BigDecimal biLI = xianChang.divide(shiTiChang, 1, RoundingMode.HALF_UP);
                //影线与实体大于比例100倍
                if (biLI.compareTo(new BigDecimal(100)) >= 0) {
                    dangRiVo.setXiayingxian100(Constants.XIAYINGXIAN100);
                }
                //下影线与实体大于比例20倍
                else if (biLI.compareTo(new BigDecimal(20)) > 0) {
                    dangRiVo.setXiayingxian20(Constants.XIAYINGXIAN20);
                }
                //下影线与实体大于比例10倍
                else if (biLI.compareTo(new BigDecimal(10)) > 0) {
                    dangRiVo.setXiayingxian10(Constants.XIAYINGXIAN10);
                }
                //下影线与实体大于比例3倍
                else if (biLI.compareTo(new BigDecimal(3)) > 0) {
                    dangRiVo.setXiayingxian3(Constants.XIAYINGXIAN3);
                }
                //下影线与实体大于比例1倍
                else if (biLI.compareTo(new BigDecimal(1)) > 0) {
                    dangRiVo.setXiayingxian1(Constants.XIAYINGXIAN1);
                }
                //下影线与实体大于比例50%
                else if (biLI.compareTo(new BigDecimal(0.5)) > 0) {
                    dangRiVo.setXiayingxian0_5(Constants.XIAYINGXIAN0_5);
                }
                //下影线与实体小于比例50%
                else if (biLI.compareTo(new BigDecimal(0)) > 0) {
                    dangRiVo.setXiayingxian0(Constants.XIAYINGXIAN0);
                }
            } else if (dangRiEntity.getFoot().compareTo(dangRiEntity.getClosingPrice()) == 0 && dangRiEntity.getOpeningPrice().compareTo(dangRiEntity.getTopside()) < 0) {//没有下影有上影线
                BigDecimal xianChang = dangRiEntity.getTopside().subtract(dangRiEntity.getOpeningPrice());//线长
                BigDecimal shiTiChang = dangRiEntity.getOpeningPrice().subtract(dangRiEntity.getClosingPrice());//实体长
                if (shiTiChang.compareTo(new BigDecimal(0)) == 0) {
                    shiTiChang=shiTiChang.add(new BigDecimal(0.01));
                }
                BigDecimal biLI = xianChang.divide(shiTiChang, 1, RoundingMode.HALF_UP);
                //上T型（影线与实体大于比例100倍）
                if (biLI.compareTo(new BigDecimal(100)) > 0) {
                    dangRiVo.setShangyingxian100(Constants.SHANGYINGXIAN100);
                }
                //上影线与实体大于比例20倍
                else if (biLI.compareTo(new BigDecimal(20)) > 0) {
                    dangRiVo.setShangyingxian20(Constants.SHANGYINGXIAN20);
                }
                //上影线与实体大于比例10倍
                else if (biLI.compareTo(new BigDecimal(10)) > 0) {
                    dangRiVo.setShangyingxian10(Constants.SHANGYINGXIAN10);
                }
                //上影线与实体大于比例3倍
                else if (biLI.compareTo(new BigDecimal(3)) > 0) {
                    dangRiVo.setShangyingxian3(Constants.SHANGYINGXIAN3);
                }
                //上影线与实体大于比例1倍
                else if (biLI.compareTo(new BigDecimal(1)) > 0) {
                    dangRiVo.setShangyingxian1(Constants.SHANGYINGXIAN1);
                }
                //上影线与实体大于比例50%
                else if (biLI.compareTo(new BigDecimal(0.5)) > 0) {
                    dangRiVo.setShangyingxian0_5(Constants.SHANGYINGXIAN0_5);
                }
                //上影线与实体小于比例50%
                else if (biLI.compareTo(new BigDecimal(0)) > 0) {
                    dangRiVo.setShangyingxian0(Constants.SHANGYINGXIAN0);
                }
            } else {//都有影线或者都没有
                BigDecimal shangxianChang = dangRiEntity.getTopside().subtract(dangRiEntity.getOpeningPrice());//上影线线长
                BigDecimal xiaxianChang = dangRiEntity.getClosingPrice().subtract(dangRiEntity.getFoot());//下影线线长
                BigDecimal shiTiChang = dangRiEntity.getOpeningPrice().subtract(dangRiEntity.getClosingPrice());//实体长
                if (shangxianChang.compareTo(new BigDecimal(0)) == 0 && xiaxianChang.compareTo(new BigDecimal(0)) == 0) {

                } else {
                    BigDecimal xianBI = shangxianChang.divide(xiaxianChang, 2, RoundingMode.HALF_UP);//上下影线比
                    BigDecimal shangyingxianbi = shangxianChang.divide(dangRiEntity.getClosingPrice(), 2, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                    BigDecimal xiayingxianbi = xiaxianChang.divide(dangRiEntity.getClosingPrice(), 2, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                    if (shiTiChang.compareTo(new BigDecimal(0)) == 0) {
                        shiTiChang= shiTiChang.add(new BigDecimal(0.01));
                    }
                    BigDecimal biLI = xiaxianChang.divide(shiTiChang, 1, RoundingMode.HALF_UP);
                    BigDecimal biL2 = shangxianChang.divide(shiTiChang, 1, RoundingMode.HALF_UP);
                    if (xianBI.compareTo(new BigDecimal(3)) > 0 || xianBI.compareTo(new BigDecimal(0.33)) < 0) {
                        if (shangyingxianbi.compareTo(new BigDecimal(2)) > 0 && xiayingxianbi.compareTo(new BigDecimal(0.5)) < 0) {//上影线
                            if (biL2.compareTo(new BigDecimal(100)) > 0) {
                                dangRiVo.setShangyingxian100(Constants.SHANGYINGXIAN100);
                            }
                            //上影线与实体大于比例20倍
                            else if (biL2.compareTo(new BigDecimal(20)) > 0) {
                                dangRiVo.setShangyingxian20(Constants.SHANGYINGXIAN20);
                            }
                            //上影线与实体大于比例10倍
                            else if (biL2.compareTo(new BigDecimal(10)) > 0) {
                                dangRiVo.setShangyingxian10(Constants.SHANGYINGXIAN10);
                            }
                            //上影线与实体大于比例3倍
                            else if (biL2.compareTo(new BigDecimal(3)) > 0) {
                                dangRiVo.setShangyingxian3(Constants.SHANGYINGXIAN3);
                            }
                        }
                        else if (shangyingxianbi.compareTo(new BigDecimal(0.5)) < 0 && xiayingxianbi.compareTo(new BigDecimal(2)) > 0) {//下影线
                            //影线与实体大于比例100倍
                            if (biLI.compareTo(new BigDecimal(100)) > 0) {
                                dangRiVo.setXiayingxian100(Constants.XIAYINGXIAN100);
                            }
                            //下影线与实体大于比例20倍
                            else if (biLI.compareTo(new BigDecimal(20)) > 0) {
                                dangRiVo.setXiayingxian20(Constants.XIAYINGXIAN20);
                            }
                            //下影线与实体大于比例10倍
                            else if (biLI.compareTo(new BigDecimal(10)) > 0) {
                                dangRiVo.setXiayingxian10(Constants.XIAYINGXIAN10);
                            }
                            //下影线与实体大于比例3倍
                            else if (biLI.compareTo(new BigDecimal(3)) > 0) {
                                dangRiVo.setXiayingxian3(Constants.XIAYINGXIAN3);
                            }
                        }
                        //+影线与实体大于比例3倍
                        else if (biLI.compareTo(new BigDecimal(3)) > 0) {
                            dangRiVo.setShizixing3(Constants.SHIZIXING3);
                        }
                        //+影线与实体大于比例1倍
                        else if (biLI.compareTo(new BigDecimal(1)) > 0) {
                            dangRiVo.setShizixing1(Constants.SHIZIXING1);
                        }
                        //+影线与实体大于比例50%
                        else if (biLI.compareTo(new BigDecimal(0.5)) > 0) {
                            dangRiVo.setShizixing0_5(Constants.SHIZIXING0_5);
                        }
                        //+影线与实体小于比例50%
                        else if (biLI.compareTo(new BigDecimal(0)) > 0) {
                            dangRiVo.setShizixing0(Constants.SHIZIXING0);
                        }

                    }

                    //+型（影线与实体大于比例50倍）
                    else if (biLI.compareTo(new BigDecimal(50)) > 0) {
                        dangRiVo.setShizixing50(Constants.SHIZIXING50);
                    }
                    //+影线与实体大于比例10倍
                    else if (biLI.compareTo(new BigDecimal(10)) > 0) {
                        dangRiVo.setShizixing10(Constants.SHIZIXING10);
                    }
                    //+影线与实体大于比例3倍
                    else if (biLI.compareTo(new BigDecimal(3)) > 0) {
                        dangRiVo.setShizixing3(Constants.SHIZIXING3);
                    }
                    //+影线与实体大于比例1倍
                    else if (biLI.compareTo(new BigDecimal(1)) > 0) {
                        dangRiVo.setShizixing1(Constants.SHIZIXING1);
                    }
                    //+影线与实体大于比例50%
                    else if (biLI.compareTo(new BigDecimal(0.5)) > 0) {
                        dangRiVo.setShizixing0_5(Constants.SHIZIXING0_5);
                    }
                    //+影线与实体小于比例50%
                    else if (biLI.compareTo(new BigDecimal(0)) > 0) {
                        dangRiVo.setShizixing0(Constants.SHIZIXING0);
                    }
                }
            }
        }

        return dangRiVo;
    }


}
