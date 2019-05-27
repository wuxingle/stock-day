package com.stock.stockday.util;

import com.stock.stockday.model.StockDayYanPanKMAQ20;
import com.stock.stockday.model.StockDayYanPanKMPTD;
import com.stock.stockday.model.StockDayYanPanKTu20L;
import com.stock.stockday.model.StockDayYanPanKTu20LS;
import com.stock.stockday.model.StockDayYanPanKTu20S;
import com.stock.stockday.model.StockDayYanPanKmQR;
import com.stock.stockday.model.StockDayYanPanQTuXing;

public class NewGetFileName {
    public static String getFileNameKMPTD(StockDayYanPanKMPTD stockDayYanPanKMPTD) {
        StringBuffer strFileName = new StringBuffer();
        if (stockDayYanPanKMPTD.getPriceAndMaRelation() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPanKMPTD.getPriceAndMaRelation() + "-");
        }
        if (stockDayYanPanKMPTD.getQian20TuXing() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPanKMPTD.getQian20TuXing() + "-");
        }
        if (stockDayYanPanKMPTD.getKdj() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPanKMPTD.getKdj() + "-");
        }
        if (stockDayYanPanKMPTD.getPriceMa() == null) {
            strFileName.append("0");
        } else {
            strFileName.append(stockDayYanPanKMPTD.getPriceMa());
        }
        return strFileName.toString();
    }

    public static String getFileNameKTu20LS(StockDayYanPanKTu20LS stockDayYanPanKTu20LS) {
        StringBuffer strFileName = new StringBuffer();
        if (stockDayYanPanKTu20LS.getLiangXian() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPanKTu20LS.getLiangXian() + "-");
        }
        if (stockDayYanPanKTu20LS.getSanXian() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPanKTu20LS.getSanXian() + "-");
        }
        if (stockDayYanPanKTu20LS.getQian20TuXing() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPanKTu20LS.getQian20TuXing() + "-");
        }
        if (stockDayYanPanKTu20LS.getKdj() == null) {
            strFileName.append("0");
        } else {
            strFileName.append(stockDayYanPanKTu20LS.getKdj());
        }
        return strFileName.toString();
    }

    public static String getFileNameKTu20S(StockDayYanPanKTu20S stockDayYanPanKTu20S) {
        StringBuffer strFileName = new StringBuffer();
        if (stockDayYanPanKTu20S.getSanXian() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPanKTu20S.getSanXian() + "-");
        }
        if (stockDayYanPanKTu20S.getQian20TuXing() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPanKTu20S.getQian20TuXing() + "-");
        }
        if (stockDayYanPanKTu20S.getKdj() == null) {
            strFileName.append("0");
        } else {
            strFileName.append(stockDayYanPanKTu20S.getKdj());
        }
        return strFileName.toString();
    }

    public static String getFileNameKTu20L(StockDayYanPanKTu20L stockDayYanPanKTu20L) {
        StringBuffer strFileName = new StringBuffer();
        if (stockDayYanPanKTu20L.getLiangXian() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPanKTu20L.getLiangXian() + "-");
        }
        if (stockDayYanPanKTu20L.getQian20TuXing() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPanKTu20L.getQian20TuXing() + "-");
        }
        if (stockDayYanPanKTu20L.getKdj() == null) {
            strFileName.append("0");
        } else {
            strFileName.append(stockDayYanPanKTu20L.getKdj());
        }
        return strFileName.toString();
    }

    public static String getFileNameKMAQ20(StockDayYanPanKMAQ20 stockDayYanPanKMAQ20) {
        StringBuffer strFileName = new StringBuffer();
        if (stockDayYanPanKMAQ20.getQian20TuXing() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPanKMAQ20.getQian20TuXing() + "-");
        }
        if (stockDayYanPanKMAQ20.getKdj() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPanKMAQ20.getKdj()+ "-");
        }
        if (stockDayYanPanKMAQ20.getPriceMa() == null) {
            strFileName.append("0");
        } else {
            strFileName.append(stockDayYanPanKMAQ20.getPriceMa());
        }
        return strFileName.toString();
    }


    public static String getFileNameKmQR(StockDayYanPanKmQR stockDayYanPanKmQR) {
        StringBuffer strFileName = new StringBuffer();
        if (stockDayYanPanKmQR.getKdj() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPanKmQR.getKdj() + "-");
        }
        if (stockDayYanPanKmQR.getMacd() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPanKmQR.getMacd() + "-");
        }
        if (stockDayYanPanKmQR.getQuantityMa() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPanKmQR.getQuantityMa() + "-");
        }
        if (stockDayYanPanKmQR.getRsi() == null) {
            strFileName.append("0");
        } else {
            strFileName.append(stockDayYanPanKmQR.getRsi());
        }
        return strFileName.toString();
    }

    public static String getFileNameQTuXing(StockDayYanPanQTuXing stockDayYanPanQTuXing) {
        StringBuffer strFileName = new StringBuffer();
        if (stockDayYanPanQTuXing.getDangRi() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPanQTuXing.getDangRi() + "-");
        }
        if (stockDayYanPanQTuXing.getSanXian() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPanQTuXing.getSanXian() + "-");
        }
        if (stockDayYanPanQTuXing.getQian20TuXing() == null) {
            strFileName.append("0-");
        } else {
            strFileName.append(stockDayYanPanQTuXing.getQian20TuXing() + "-");
        }
        return strFileName.toString();
    }
}
