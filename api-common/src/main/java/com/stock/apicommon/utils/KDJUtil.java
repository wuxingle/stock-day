package com.stock.apicommon.utils;

import com.stock.apicommon.Constants;
import com.stock.apicommon.entity.ChangeEntity;
import com.stock.apicommon.entity.KDJEntity;
import com.stock.apicommon.entity.ScienceEntity;
import com.stock.apicommon.vo.KDJScienceVo;
import com.stock.apicommon.vo.KDJVo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class KDJUtil {

    public static KDJVo getKDJ(KDJEntity kdjEntity) {
        if (kdjEntity == null) {
            return null;
        }
        KDJVo kdjVo = new KDJVo();
        BigDecimal RSV_1 = kdjEntity.getClosingPrice().subtract(kdjEntity.getFoot());
        BigDecimal RSV_2 = kdjEntity.getTopside().subtract(kdjEntity.getFoot());
        if (RSV_2.compareTo(new BigDecimal(0)) == 0) {
            RSV_2 = RSV_2.add(new BigDecimal(0.01));
        }
        BigDecimal RSV = RSV_1.divide(RSV_2, 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
        kdjVo.setRSV(RSV);
        BigDecimal K = null;
        BigDecimal D = null;
        BigDecimal J = null;
        if (kdjEntity.getBeforeK() == null) {
            kdjVo.setK(new BigDecimal(50));
            kdjVo.setD(new BigDecimal(50));
            kdjVo.setJ(new BigDecimal(50));
        } else {
            BigDecimal K_1 = kdjEntity.getBeforeK().multiply(new BigDecimal(2)).divide(new BigDecimal(3), 2, RoundingMode.HALF_UP);
            BigDecimal K_2 = RSV.divide(new BigDecimal(3), 2, RoundingMode.HALF_UP);
            K = K_1.add(K_2);
            kdjVo.setK(K);
            BigDecimal D_1 = kdjEntity.getBeforeD().multiply(new BigDecimal(2)).divide(new BigDecimal(3), 2, RoundingMode.HALF_UP);
            BigDecimal D_2 = K.divide(new BigDecimal(3), 2, RoundingMode.HALF_UP);
            D = D_1.add(D_2);
            kdjVo.setD(D);
            BigDecimal J_1 = K.multiply(new BigDecimal(3));
            BigDecimal J_2 = D.multiply(new BigDecimal(2));
            J = J_1.subtract(J_2);
            kdjVo.setJ(J);
        }
        return kdjVo;
    }

    public static KDJScienceVo getKDJScience(List<ScienceEntity> scienceEntityList) {
        if (scienceEntityList.get(1).getK() == null) {
            return null;
        }
        KDJScienceVo kdjScienceVo = new KDJScienceVo();
        StringBuffer stringBuffer = new StringBuffer();
        if (scienceEntityList.get(1).getK().compareTo(new BigDecimal(20)) <= 0) {
            if (scienceEntityList.get(0).getK().compareTo(scienceEntityList.get(1).getK()) < 0) {
                //20一下向下
                kdjScienceVo.setXiangxia20(Constants.XIANGXIA20);
                stringBuffer.append(Constants.XIANGXIA20);
            }
            if (scienceEntityList.get(0).getK().compareTo(scienceEntityList.get(1).getK()) >= 0) {
                //20一下向上
                kdjScienceVo.setXiangshang20(Constants.XIANGSHANG20);
                stringBuffer.append(Constants.XIANGSHANG20);
            }
            if (scienceEntityList.get(0).getJ().compareTo(scienceEntityList.get(0).getK()) >= 0 && scienceEntityList.get(0).getJ().compareTo(scienceEntityList.get(0).getD()) >= 0 && scienceEntityList.get(1).getJ().compareTo(scienceEntityList.get(1).getD()) < 0 && scienceEntityList.get(1).getJ().compareTo(scienceEntityList.get(1).getK()) < 0) {
                //20一下金叉
                kdjScienceVo.setJincha20(Constants.JINCHA20);
                stringBuffer.append(Constants.JINCHA20);
            }
            if (scienceEntityList.get(0).getJ().compareTo(scienceEntityList.get(0).getK()) <= 0 && scienceEntityList.get(0).getJ().compareTo(scienceEntityList.get(0).getD()) <= 0 && scienceEntityList.get(1).getJ().compareTo(scienceEntityList.get(1).getD()) > 0 && scienceEntityList.get(1).getJ().compareTo(scienceEntityList.get(1).getK()) > 0) {
                //20一下死叉
                kdjScienceVo.setSicha20(Constants.SICHA20);
                stringBuffer.append(Constants.SICHA20);
            }

        } else if (scienceEntityList.get(1).getK().compareTo(new BigDecimal(80)) >= 0) {
            if (scienceEntityList.get(0).getK().compareTo(scienceEntityList.get(1).getK()) < 0) {
                //80一下向下
                kdjScienceVo.setXiangxia80(Constants.XIANGXIA80);
            }
            if (scienceEntityList.get(0).getK().compareTo(scienceEntityList.get(1).getK()) >= 0) {
                //80一下向上
                kdjScienceVo.setXiangshang80(Constants.XIANGSHANG80);
            }
            if (scienceEntityList.get(0).getJ().compareTo(scienceEntityList.get(0).getK()) >= 0 && scienceEntityList.get(0).getJ().compareTo(scienceEntityList.get(0).getD()) >= 0 && scienceEntityList.get(1).getJ().compareTo(scienceEntityList.get(1).getD()) < 0 && scienceEntityList.get(1).getJ().compareTo(scienceEntityList.get(1).getK()) < 0) {
                //80一下金叉
                kdjScienceVo.setJincha80(Constants.JINCHA80);
            }
            if (scienceEntityList.get(0).getJ().compareTo(scienceEntityList.get(0).getK()) <= 0 && scienceEntityList.get(0).getJ().compareTo(scienceEntityList.get(0).getD()) <= 0 && scienceEntityList.get(1).getJ().compareTo(scienceEntityList.get(1).getD()) > 0 && scienceEntityList.get(1).getJ().compareTo(scienceEntityList.get(1).getK()) > 0) {
                //80一下死叉
                kdjScienceVo.setSicha80(Constants.SICHA80);
            }
        } else {
            if (scienceEntityList.get(0).getK().compareTo(scienceEntityList.get(1).getK()) < 0) {
                //向下
                kdjScienceVo.setXiangxia(Constants.XIANGXIA);
            }
            if (scienceEntityList.get(0).getK().compareTo(scienceEntityList.get(1).getK()) >= 0) {
                //向上
                kdjScienceVo.setXiangshang(Constants.XIANGSHANG);
            }
            if (scienceEntityList.get(0).getJ().compareTo(scienceEntityList.get(0).getK()) >= 0 && scienceEntityList.get(0).getJ().compareTo(scienceEntityList.get(0).getD()) >= 0 && scienceEntityList.get(1).getJ().compareTo(scienceEntityList.get(1).getD()) < 0 && scienceEntityList.get(1).getJ().compareTo(scienceEntityList.get(1).getK()) < 0) {
                //金叉
                kdjScienceVo.setJincha(Constants.JINCHA);
            }
            if (scienceEntityList.get(0).getJ().compareTo(scienceEntityList.get(0).getK()) <= 0 && scienceEntityList.get(0).getJ().compareTo(scienceEntityList.get(0).getD()) <= 0 && scienceEntityList.get(1).getJ().compareTo(scienceEntityList.get(1).getD()) > 0 && scienceEntityList.get(1).getJ().compareTo(scienceEntityList.get(1).getK()) > 0) {
                //死叉
                kdjScienceVo.setSicha(Constants.SICHA);
            }
        }

        //获取钝化
        return kdjScienceVo;
    }

    public static KDJScienceVo getKDJScience1(List<ScienceEntity> scienceEntityList, List<ChangeEntity> changeEntityList) {
        if (scienceEntityList.get(1).getK() == null) {
            return null;
        }
        KDJScienceVo kdjScienceVo = new KDJScienceVo();
        StringBuffer stringBuffer = new StringBuffer();
        if (scienceEntityList.get(1).getK().compareTo(new BigDecimal(20)) <= 0) {
            if (scienceEntityList.get(0).getK().compareTo(scienceEntityList.get(1).getK()) < 0) {
                //20一下向下
                kdjScienceVo.setXiangxia20(Constants.XIANGXIA20);
                stringBuffer.append(Constants.XIANGXIA20);
            }
            if (scienceEntityList.get(0).getK().compareTo(scienceEntityList.get(1).getK()) >= 0) {
                //20一下向上
                kdjScienceVo.setXiangshang20(Constants.XIANGSHANG20);
                stringBuffer.append(Constants.XIANGSHANG20);
            }
            if (scienceEntityList.get(0).getJ().compareTo(scienceEntityList.get(0).getK()) >= 0 && scienceEntityList.get(0).getJ().compareTo(scienceEntityList.get(0).getD()) >= 0 && scienceEntityList.get(1).getJ().compareTo(scienceEntityList.get(1).getD()) < 0 && scienceEntityList.get(1).getJ().compareTo(scienceEntityList.get(1).getK()) < 0) {
                //20一下金叉
                kdjScienceVo.setJincha20(Constants.JINCHA20);
                stringBuffer.append(Constants.JINCHA20);
            }
            if (scienceEntityList.get(0).getJ().compareTo(scienceEntityList.get(0).getK()) <= 0 && scienceEntityList.get(0).getJ().compareTo(scienceEntityList.get(0).getD()) <= 0 && scienceEntityList.get(1).getJ().compareTo(scienceEntityList.get(1).getD()) > 0 && scienceEntityList.get(1).getJ().compareTo(scienceEntityList.get(1).getK()) > 0) {
                //20一下死叉
                kdjScienceVo.setSicha20(Constants.SICHA20);
                stringBuffer.append(Constants.SICHA20);
            }
            //钝化
            if (scienceEntityList.get(0).getJ().compareTo(new BigDecimal(10)) < 0) {
                if (scienceEntityList.get(1).getJ().compareTo(new BigDecimal(10)) < 0) {
                    if (scienceEntityList.get(2).getJ().compareTo(new BigDecimal(10)) < 0) {
                        stringBuffer.append(Constants.DANGTIANZHENGZAI20DUNHUA);
                        stringBuffer.append(",");
                    }
                    if (scienceEntityList.get(2).getJ().compareTo(new BigDecimal(10)) > 0 && scienceEntityList.get(3).getJ().compareTo(new BigDecimal(10)) < 0) {
                        stringBuffer.append(Constants.DANGTIANZHENGZAI20DUNHUA);
                        stringBuffer.append(",");
                    }
                }
            }
            if (scienceEntityList.get(1).getJ().compareTo(new BigDecimal(10)) < 0) {
                if (scienceEntityList.get(2).getJ().compareTo(new BigDecimal(10)) < 0) {
                    if (scienceEntityList.get(3).getJ().compareTo(new BigDecimal(10)) < 0) {
                        stringBuffer.append(Constants.QIANYITIANZHENGZAI20BEILI);
                        stringBuffer.append(",");
                    }
                    if (scienceEntityList.get(3).getJ().compareTo(new BigDecimal(10)) > 0 && scienceEntityList.get(4).getJ().compareTo(new BigDecimal(10)) < 0) {
                        stringBuffer.append(Constants.QIANYITIANZHENGZAI20BEILI);
                        stringBuffer.append(",");
                    }
                }
            }
            if (scienceEntityList.get(2).getJ().compareTo(new BigDecimal(10)) < 0) {
                if (scienceEntityList.get(3).getJ().compareTo(new BigDecimal(10)) < 0) {
                    if (scienceEntityList.get(4).getJ().compareTo(new BigDecimal(10)) < 0) {
                        stringBuffer.append(Constants.QIANLIANGTIANZHENGZAI20DUNHUA);
                        stringBuffer.append(",");
                    }
                    if (scienceEntityList.get(4).getJ().compareTo(new BigDecimal(10)) > 0 && scienceEntityList.get(5).getJ().compareTo(new BigDecimal(10)) < 0) {
                        stringBuffer.append(Constants.QIANLIANGTIANZHENGZAI20DUNHUA);
                        stringBuffer.append(",");
                    }
                }
            }
            if (scienceEntityList.get(3).getJ().compareTo(new BigDecimal(10)) < 0) {
                if (scienceEntityList.get(4).getJ().compareTo(new BigDecimal(10)) < 0) {
                    if (scienceEntityList.get(5).getJ().compareTo(new BigDecimal(10)) < 0) {
                        stringBuffer.append(Constants.QIANSHANTIANZHENGZAI20BEILI);
                        stringBuffer.append(",");
                    }
                    if (scienceEntityList.get(5).getJ().compareTo(new BigDecimal(10)) > 0 && scienceEntityList.get(6).getJ().compareTo(new BigDecimal(10)) < 0) {
                        stringBuffer.append(Constants.QIANSHANTIANZHENGZAI20BEILI);
                        stringBuffer.append(",");
                    }
                }
            }

            //背离
            if (scienceEntityList.get(0).getK().compareTo(scienceEntityList.get(1).getK()) < 0) {
                if (changeEntityList.get(0).getClosingPrice().compareTo(changeEntityList.get(1).getClosingPrice()) > 0) {
                    stringBuffer.append(Constants.DANGTIANZHENGZAI20BEILI);
                    stringBuffer.append(",");
                }
            }
            if (scienceEntityList.get(0).getK().compareTo(scienceEntityList.get(1).getK()) > 0) {
                if (changeEntityList.get(0).getClosingPrice().compareTo(changeEntityList.get(1).getClosingPrice()) < 0) {
                    stringBuffer.append(Constants.DANGTIANZHENGZAI20BEILI);
                    stringBuffer.append(",");
                }
            }
            if (scienceEntityList.get(1).getK().compareTo(scienceEntityList.get(2).getK()) < 0) {
                if (changeEntityList.get(1).getClosingPrice().compareTo(changeEntityList.get(2).getClosingPrice()) > 0) {
                    stringBuffer.append(Constants.QIANYITIANZHENGZAI20BEILI);
                    stringBuffer.append(",");
                }
            }
            if (scienceEntityList.get(1).getK().compareTo(scienceEntityList.get(2).getK()) > 0) {
                if (changeEntityList.get(1).getClosingPrice().compareTo(changeEntityList.get(2).getClosingPrice()) < 0) {
                    stringBuffer.append(Constants.QIANYITIANZHENGZAI20BEILI);
                    stringBuffer.append(",");
                }
            }
            if (scienceEntityList.get(2).getK().compareTo(scienceEntityList.get(3).getK()) < 0) {
                if (changeEntityList.get(2).getClosingPrice().compareTo(changeEntityList.get(3).getClosingPrice()) > 0) {
                    stringBuffer.append(Constants.QIANLIANGTIANZHENGZAI20BEILI);
                    stringBuffer.append(",");
                }
            }
            if (scienceEntityList.get(2).getK().compareTo(scienceEntityList.get(3).getK()) > 0) {
                if (changeEntityList.get(2).getClosingPrice().compareTo(changeEntityList.get(3).getClosingPrice()) < 0) {
                    stringBuffer.append(Constants.QIANLIANGTIANZHENGZAI20BEILI);
                    stringBuffer.append(",");
                }
            }
            if (scienceEntityList.get(3).getK().compareTo(scienceEntityList.get(4).getK()) < 0) {
                if (changeEntityList.get(3).getClosingPrice().compareTo(changeEntityList.get(4).getClosingPrice()) > 0) {
                    stringBuffer.append(Constants.QIANSHANTIANZHENGZAI20BEILI);
                    stringBuffer.append(",");
                }
            }
            if (scienceEntityList.get(3).getK().compareTo(scienceEntityList.get(4).getK()) > 0) {
                if (changeEntityList.get(3).getClosingPrice().compareTo(changeEntityList.get(4).getClosingPrice()) < 0) {
                    stringBuffer.append(Constants.QIANSHANTIANZHENGZAI20BEILI);
                }
            }

        } else if (scienceEntityList.get(1).getK().compareTo(new BigDecimal(80)) >= 0) {
            if (scienceEntityList.get(0).getK().compareTo(scienceEntityList.get(1).getK()) < 0) {
                //80一下向下
                kdjScienceVo.setXiangxia80(Constants.XIANGXIA80);
            }
            if (scienceEntityList.get(0).getK().compareTo(scienceEntityList.get(1).getK()) >= 0) {
                //80一下向上
                kdjScienceVo.setXiangshang80(Constants.XIANGSHANG80);
            }
            if (scienceEntityList.get(0).getJ().compareTo(scienceEntityList.get(0).getK()) >= 0 && scienceEntityList.get(0).getJ().compareTo(scienceEntityList.get(0).getD()) >= 0 && scienceEntityList.get(1).getJ().compareTo(scienceEntityList.get(1).getD()) < 0 && scienceEntityList.get(1).getJ().compareTo(scienceEntityList.get(1).getK()) < 0) {
                //80一下金叉
                kdjScienceVo.setJincha80(Constants.JINCHA80);
            }
            if (scienceEntityList.get(0).getJ().compareTo(scienceEntityList.get(0).getK()) <= 0 && scienceEntityList.get(0).getJ().compareTo(scienceEntityList.get(0).getD()) <= 0 && scienceEntityList.get(1).getJ().compareTo(scienceEntityList.get(1).getD()) > 0 && scienceEntityList.get(1).getJ().compareTo(scienceEntityList.get(1).getK()) > 0) {
                //80一下死叉
                kdjScienceVo.setSicha80(Constants.SICHA80);
            }
            //钝化
            if (scienceEntityList.get(0).getJ().compareTo(new BigDecimal(90)) > 0) {
                if (scienceEntityList.get(1).getJ().compareTo(new BigDecimal(90)) > 0) {
                    if (scienceEntityList.get(2).getJ().compareTo(new BigDecimal(90)) > 0) {
                        stringBuffer.append(Constants.DANGTIANZHENGZAI80DUNHUA);
                        stringBuffer.append(",");
                    }
                    if (scienceEntityList.get(2).getJ().compareTo(new BigDecimal(90)) < 0 && scienceEntityList.get(3).getJ().compareTo(new BigDecimal(90)) > 0) {
                        stringBuffer.append(Constants.DANGTIANZHENGZAI80DUNHUA);
                        stringBuffer.append(",");
                    }
                }
            }
            if (scienceEntityList.get(1).getJ().compareTo(new BigDecimal(90)) > 0) {
                if (scienceEntityList.get(2).getJ().compareTo(new BigDecimal(90)) > 0) {
                    if (scienceEntityList.get(3).getJ().compareTo(new BigDecimal(90)) > 0) {
                        stringBuffer.append(Constants.QIANYITIANZHENGZAI80BEILI);
                        stringBuffer.append(",");
                    }
                    if (scienceEntityList.get(3).getJ().compareTo(new BigDecimal(90)) < 0 && scienceEntityList.get(4).getJ().compareTo(new BigDecimal(90)) > 0) {
                        stringBuffer.append(Constants.QIANYITIANZHENGZAI80BEILI);
                        stringBuffer.append(",");
                    }
                }
            }
            if (scienceEntityList.get(2).getJ().compareTo(new BigDecimal(90)) > 0) {
                if (scienceEntityList.get(3).getJ().compareTo(new BigDecimal(90)) > 0) {
                    if (scienceEntityList.get(4).getJ().compareTo(new BigDecimal(90)) > 0) {
                        stringBuffer.append(Constants.QIANLIANGTIANZHENGZAI80DUNHUA);
                        stringBuffer.append(",");
                    }
                    if (scienceEntityList.get(4).getJ().compareTo(new BigDecimal(90)) < 0 && scienceEntityList.get(5).getJ().compareTo(new BigDecimal(90)) > 0) {
                        stringBuffer.append(Constants.QIANLIANGTIANZHENGZAI80DUNHUA);
                        stringBuffer.append(",");
                    }
                }
            }
            if (scienceEntityList.get(3).getJ().compareTo(new BigDecimal(90)) > 0) {
                if (scienceEntityList.get(4).getJ().compareTo(new BigDecimal(90)) > 0) {
                    if (scienceEntityList.get(5).getJ().compareTo(new BigDecimal(90)) > 0) {
                        stringBuffer.append(Constants.QIANSHANTIANZHENGZAI80BEILI);
                        stringBuffer.append(",");
                    }
                    if (scienceEntityList.get(5).getJ().compareTo(new BigDecimal(90)) < 0 && scienceEntityList.get(6).getJ().compareTo(new BigDecimal(90)) > 0) {
                        stringBuffer.append(Constants.QIANSHANTIANZHENGZAI80BEILI);
                        stringBuffer.append(",");
                    }
                }
            }

            //背离
            if (scienceEntityList.get(0).getK().compareTo(scienceEntityList.get(1).getK()) < 0) {
                if (changeEntityList.get(0).getClosingPrice().compareTo(changeEntityList.get(1).getClosingPrice()) > 0) {
                    stringBuffer.append(Constants.DANGTIANZHENGZAI80BEILI);
                    stringBuffer.append(",");
                }
            }
            if (scienceEntityList.get(0).getK().compareTo(scienceEntityList.get(1).getK()) > 0) {
                if (changeEntityList.get(0).getClosingPrice().compareTo(changeEntityList.get(1).getClosingPrice()) < 0) {
                    stringBuffer.append(Constants.DANGTIANZHENGZAI80BEILI);
                    stringBuffer.append(",");
                }
            }
            if (scienceEntityList.get(1).getK().compareTo(scienceEntityList.get(2).getK()) < 0) {
                if (changeEntityList.get(1).getClosingPrice().compareTo(changeEntityList.get(2).getClosingPrice()) > 0) {
                    stringBuffer.append(Constants.QIANYITIANZHENGZAI80BEILI);
                    stringBuffer.append(",");
                }
            }
            if (scienceEntityList.get(1).getK().compareTo(scienceEntityList.get(2).getK()) > 0) {
                if (changeEntityList.get(1).getClosingPrice().compareTo(changeEntityList.get(2).getClosingPrice()) < 0) {
                    stringBuffer.append(Constants.QIANYITIANZHENGZAI80BEILI);
                    stringBuffer.append(",");
                }
            }
            if (scienceEntityList.get(2).getK().compareTo(scienceEntityList.get(3).getK()) < 0) {
                if (changeEntityList.get(2).getClosingPrice().compareTo(changeEntityList.get(3).getClosingPrice()) > 0) {
                    stringBuffer.append(Constants.QIANLIANGTIANZHENGZAI80BEILI);
                    stringBuffer.append(",");
                }
            }
            if (scienceEntityList.get(2).getK().compareTo(scienceEntityList.get(3).getK()) > 0) {
                if (changeEntityList.get(2).getClosingPrice().compareTo(changeEntityList.get(3).getClosingPrice()) < 0) {
                    stringBuffer.append(Constants.QIANLIANGTIANZHENGZAI80BEILI);
                    stringBuffer.append(",");
                }
            }
            if (scienceEntityList.get(3).getK().compareTo(scienceEntityList.get(4).getK()) < 0) {
                if (changeEntityList.get(3).getClosingPrice().compareTo(changeEntityList.get(4).getClosingPrice()) > 0) {
                    stringBuffer.append(Constants.QIANSHANTIANZHENGZAI80BEILI);
                    stringBuffer.append(",");
                }
            }
            if (scienceEntityList.get(3).getK().compareTo(scienceEntityList.get(4).getK()) > 0) {
                if (changeEntityList.get(3).getClosingPrice().compareTo(changeEntityList.get(4).getClosingPrice()) < 0) {
                    stringBuffer.append(Constants.QIANSHANTIANZHENGZAI80BEILI);
                }
            }

        } else {
            if (scienceEntityList.get(0).getK().compareTo(scienceEntityList.get(1).getK()) < 0) {
                //向下
                kdjScienceVo.setXiangxia(Constants.XIANGXIA);
            }
            if (scienceEntityList.get(0).getK().compareTo(scienceEntityList.get(1).getK()) >= 0) {
                //向上
                kdjScienceVo.setXiangshang(Constants.XIANGSHANG);
            }
            if (scienceEntityList.get(0).getJ().compareTo(scienceEntityList.get(0).getK()) >= 0 && scienceEntityList.get(0).getJ().compareTo(scienceEntityList.get(0).getD()) >= 0 && scienceEntityList.get(1).getJ().compareTo(scienceEntityList.get(1).getD()) < 0 && scienceEntityList.get(1).getJ().compareTo(scienceEntityList.get(1).getK()) < 0) {
                //金叉
                kdjScienceVo.setJincha(Constants.JINCHA);
            }
            if (scienceEntityList.get(0).getJ().compareTo(scienceEntityList.get(0).getK()) <= 0 && scienceEntityList.get(0).getJ().compareTo(scienceEntityList.get(0).getD()) <= 0 && scienceEntityList.get(1).getJ().compareTo(scienceEntityList.get(1).getD()) > 0 && scienceEntityList.get(1).getJ().compareTo(scienceEntityList.get(1).getK()) > 0) {
                //死叉
                kdjScienceVo.setSicha(Constants.SICHA);
            }
        }
        kdjScienceVo.setKdjzhuhe(stringBuffer.toString());
        return kdjScienceVo;
    }

}
