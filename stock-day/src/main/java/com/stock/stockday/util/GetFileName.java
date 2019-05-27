package com.stock.stockday.util;

import com.stock.stockday.entity.StockDayYanPan;
import com.stock.stockday.entity.StockDayYanPan24;
import com.stock.stockday.entity.StockDayYanPan33;
import com.stock.stockday.entity.StockDayYanPan42;
import com.stock.stockday.entity.StockDayYanPanBenpan;
import com.stock.stockday.entity.StockDayYanPanChunJishu;
import com.stock.stockday.entity.StockDayYanPanChunTuxing;
import com.stock.stockday.entity.StockDayYanPanDapan;
import com.stock.stockday.entity.StockDayYanPanZhuYanJiShu;

public class GetFileName {
    public static String getFileName(StockDayYanPan stockDayYanPan) {
        StringBuffer strFileName = new StringBuffer();
        if (stockDayYanPan.getLiangXian() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPan.getLiangXian() + "-");
        }
        if (stockDayYanPan.getSanXian() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPan.getSanXian() + "-");
        }
        if (stockDayYanPan.getSiXian() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPan.getSiXian() + "-");
        }
        if (stockDayYanPan.getWuXian() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPan.getWuXian() + "-");
        }
        if (stockDayYanPan.getKdj() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPan.getKdj() + "-");
        }
        if (stockDayYanPan.getMacd() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPan.getMacd() + "-");
        }
        if (stockDayYanPan.getQuantityMa() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPan.getQuantityMa() + "-");
        }
        if (stockDayYanPan.getPriceMa() == null) {
            strFileName.append("0");
        } else {
            strFileName.append(stockDayYanPan.getPriceMa());
        }
        return strFileName.toString();
    }

    public static String getFileName24(StockDayYanPan24 stockDayYanPan24) {
        StringBuffer strFileName = new StringBuffer();
        if (stockDayYanPan24.getDangRi() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPan24.getDangRi() + "-");
        }
        if (stockDayYanPan24.getSanXian() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPan24.getSanXian() + "-");
        }
        if (stockDayYanPan24.getKdj() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPan24.getKdj() + "-");
        }
        if (stockDayYanPan24.getMacd() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPan24.getMacd() + "-");
        }
        if (stockDayYanPan24.getQuantityMa() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPan24.getQuantityMa() + "-");
        }
        if (stockDayYanPan24.getPriceMa() == null) {
            strFileName.append("0");
        } else {
            strFileName.append(stockDayYanPan24.getPriceMa());
        }
        return strFileName.toString();
    }

    public static String getFileName33(StockDayYanPan33 stockDayYanPan33) {
        StringBuffer strFileName = new StringBuffer();
        if (stockDayYanPan33.getDangRi() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPan33.getDangRi() + "-");
        }
        if (stockDayYanPan33.getLiangXian() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPan33.getLiangXian() + "-");
        }
        if (stockDayYanPan33.getSanXian() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPan33.getSanXian() + "-");
        }
        if (stockDayYanPan33.getKdj() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPan33.getKdj() + "-");
        }
        if (stockDayYanPan33.getMacd() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPan33.getMacd() + "-");
        }
        if (stockDayYanPan33.getPriceMa() == null) {
            strFileName.append("0");
        } else {
            strFileName.append(stockDayYanPan33.getPriceMa());
        }
        return strFileName.toString();
    }

    public static String getFileName42(StockDayYanPan42 stockDayYanPan42) {
        StringBuffer strFileName = new StringBuffer();
        if (stockDayYanPan42.getDangRi() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPan42.getDangRi() + "-");
        }
        if (stockDayYanPan42.getLiangXian() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPan42.getLiangXian() + "-");
        }
        if (stockDayYanPan42.getSanXian() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPan42.getSanXian() + "-");
        }
        if (stockDayYanPan42.getSiXian() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPan42.getSiXian() + "-");
        }
        if (stockDayYanPan42.getKdj() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPan42.getKdj() + "-");
        }
        if (stockDayYanPan42.getPriceMa() == null) {
            strFileName.append("0");
        } else {
            strFileName.append(stockDayYanPan42.getPriceMa());
        }
        return strFileName.toString();
    }

    public static String getFileNameBp(StockDayYanPanBenpan stockDayYanPanBenpan) {
        StringBuffer strFileName = new StringBuffer();
        if (stockDayYanPanBenpan.getBenPiao1()== null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPanBenpan.getBenPiao1() + "-");
        }
        if (stockDayYanPanBenpan.getBenPiao2() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPanBenpan.getBenPiao2() + "-");
        }
        if (stockDayYanPanBenpan.getBenPiao3() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPanBenpan.getBenPiao3() + "-");
        }
        if (stockDayYanPanBenpan.getBenPiao5() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPanBenpan.getBenPiao5() + "-");
        }
        if (stockDayYanPanBenpan.getBenPiao13() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPanBenpan.getBenPiao13() + "-");
        }
        if (stockDayYanPanBenpan.getBenPiao20() == null) {
            strFileName.append("0");
        } else {
            strFileName.append(stockDayYanPanBenpan.getBenPiao20());
        }
        return strFileName.toString();
    }

    public static String getFileNameDp(StockDayYanPanDapan stockDayYanPanDapan) {
        StringBuffer strFileName = new StringBuffer();
        if (stockDayYanPanDapan.getDaPan1() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPanDapan.getDaPan1() + "-");
        }
        if (stockDayYanPanDapan.getDaPan2() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPanDapan.getDaPan2() + "-");
        }
        if (stockDayYanPanDapan.getDaPan3() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPanDapan.getDaPan3() + "-");
        }
        if (stockDayYanPanDapan.getDaPan5() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPanDapan.getDaPan5() + "-");
        }
        if (stockDayYanPanDapan.getDaPan13() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPanDapan.getDaPan13() + "-");
        }
        if (stockDayYanPanDapan.getDaPan20() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPanDapan.getDaPan20() + "-");
        }
        return strFileName.toString();
    }

    public static String getFileNameCjs(StockDayYanPanChunJishu stockDayYanPanChunJishu) {
        StringBuffer strFileName = new StringBuffer();
        if (stockDayYanPanChunJishu.getKdj() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPanChunJishu.getKdj() + "-");
        }
        if (stockDayYanPanChunJishu.getMacd() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPanChunJishu.getMacd() + "-");
        }
        if (stockDayYanPanChunJishu.getQuantityMa() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPanChunJishu.getQuantityMa() + "-");
        }
        if (stockDayYanPanChunJishu.getPriceMa() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPanChunJishu.getPriceMa()+ "-");
        }
        if (stockDayYanPanChunJishu.getRsi() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPanChunJishu.getRsi()+ "-");
        }
        if (stockDayYanPanChunJishu.getWr() == null) {
            strFileName.append("0");
        } else {
            strFileName.append(stockDayYanPanChunJishu.getWr());
        }
        return strFileName.toString();
    }

    public static String getFileNameCtx(StockDayYanPanChunTuxing stockDayYanPanChunTuxing) {
        StringBuffer strFileName = new StringBuffer();
        if (stockDayYanPanChunTuxing.getDangRi() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPanChunTuxing.getDangRi() + "-");
        }
        if (stockDayYanPanChunTuxing.getLiangXian() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPanChunTuxing.getLiangXian() + "-");
        }
        if (stockDayYanPanChunTuxing.getSanXian() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPanChunTuxing.getSanXian() + "-");
        }

        if (stockDayYanPanChunTuxing.getSiXian()== null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPanChunTuxing.getSiXian()+ "-");
        }
        if (stockDayYanPanChunTuxing.getWuXian() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPanChunTuxing.getWuXian() + "-");
        }
        if (stockDayYanPanChunTuxing.getDuoXian() == null) {
            strFileName.append("0");
        } else {
            strFileName.append(stockDayYanPanChunTuxing.getDuoXian());
        }
        return strFileName.toString();
    }

    public static String getFileNameZhuYanJiShu(StockDayYanPanZhuYanJiShu stockDayYanPanZhuYanJiShu) {
        StringBuffer strFileName = new StringBuffer();
        if (stockDayYanPanZhuYanJiShu.getPriceAndMaRelation() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPanZhuYanJiShu.getPriceAndMaRelation() + "-");
        }
        if (stockDayYanPanZhuYanJiShu.getLiangXian() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPanZhuYanJiShu.getLiangXian() + "-");
        }
        if (stockDayYanPanZhuYanJiShu.getSanXian() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPanZhuYanJiShu.getSanXian() + "-");
        }
        if (stockDayYanPanZhuYanJiShu.getKdj() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPanZhuYanJiShu.getKdj() + "-");
        }
        if (stockDayYanPanZhuYanJiShu.getMacd() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPanZhuYanJiShu.getMacd() + "-");
        }
        if (stockDayYanPanZhuYanJiShu.getPriceMa() == null) {
            strFileName.append("0");
        } else {
            strFileName.append(stockDayYanPanZhuYanJiShu.getPriceMa());
        }
        return strFileName.toString();
    }


}
