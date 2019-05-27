package com.stock.apicommon.utils.patterning;


import com.stock.apicommon.Constants;
import com.stock.apicommon.entity.ChangeEntity;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class Qian20Xing {

    public static String getQian20Xing(List<ChangeEntity> changeEntityList) {
        if (changeEntityList == null || changeEntityList.size() == 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        BigDecimal chang20gong = changeEntityList.get(0).getClosingPrice().subtract(changeEntityList.get(19).getClosingPrice());
        BigDecimal change20 = chang20gong.divide(changeEntityList.get(19).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
        if (change20.compareTo(new BigDecimal(50)) > 0) {
            stringBuffer.append(Constants.shangzhangdayu50);
            stringBuffer.append(",");
        } else if (change20.compareTo(new BigDecimal(20)) > 0) {
            stringBuffer.append(Constants.shangzhangdayu20);
            stringBuffer.append(",");
        } else if (change20.compareTo(new BigDecimal(10)) > 0) {
            stringBuffer.append(Constants.shangzhangdayu10);
            stringBuffer.append(",");
        } else if (change20.compareTo(new BigDecimal(5)) > 0) {
            stringBuffer.append(Constants.shangzhangdayu5);
            stringBuffer.append(",");
        } else if (change20.compareTo(new BigDecimal(0)) > 0) {
            stringBuffer.append(Constants.shangzhangdayu0);
            stringBuffer.append(",");
        } else if (change20.compareTo(new BigDecimal(-5)) > 0) {
            stringBuffer.append(Constants.xiajiangdayu0);
            stringBuffer.append(",");
        } else if (change20.compareTo(new BigDecimal(-10)) > 0) {
            stringBuffer.append(Constants.xiajiangdayu5);
            stringBuffer.append(",");
        } else if (change20.compareTo(new BigDecimal(-20)) > 0) {
            stringBuffer.append(Constants.xiajiangdayu10);
            stringBuffer.append(",");
        } else if (change20.compareTo(new BigDecimal(-50)) > 0) {
            stringBuffer.append(Constants.xiajiangdayu20);
            stringBuffer.append(",");
        } else if (change20.compareTo(new BigDecimal(-50)) < 0) {
            stringBuffer.append(Constants.xiajiangdayu50);
            stringBuffer.append(",");
        }

        BigDecimal chang5_1gong = changeEntityList.get(15).getClosingPrice().subtract(changeEntityList.get(19).getClosingPrice());
        BigDecimal change5_1 = chang5_1gong.divide(changeEntityList.get(19).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
        if (change5_1.compareTo(new BigDecimal(3)) > 0) {
            stringBuffer.append(Constants.TUXINGXIANGSHANG);
            stringBuffer.append(",");
        } else if (change5_1.compareTo(new BigDecimal(-3)) > 0) {
            stringBuffer.append(Constants.TUXINGPING);
            stringBuffer.append(",");
        } else {
            stringBuffer.append(Constants.TUXINGXIANGXIA);
            stringBuffer.append(",");
        }
        BigDecimal chang5_2gong = changeEntityList.get(11).getClosingPrice().subtract(changeEntityList.get(15).getClosingPrice());
        BigDecimal change5_2 = chang5_2gong.divide(changeEntityList.get(15).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
        if (change5_2.compareTo(new BigDecimal(3)) > 0) {
            stringBuffer.append(Constants.TUXINGXIANGSHANG);
            stringBuffer.append(",");
        } else if (change5_2.compareTo(new BigDecimal(-3)) > 0) {
            stringBuffer.append(Constants.TUXINGPING);
            stringBuffer.append(",");
        } else {
            stringBuffer.append(Constants.TUXINGXIANGXIA);
            stringBuffer.append(",");
        }
        BigDecimal chang5_3gong = changeEntityList.get(7).getClosingPrice().subtract(changeEntityList.get(11).getClosingPrice());
        BigDecimal change5_3 = chang5_3gong.divide(changeEntityList.get(11).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
        if (change5_3.compareTo(new BigDecimal(3)) > 0) {
            stringBuffer.append(Constants.TUXINGXIANGSHANG);
            stringBuffer.append(",");
        } else if (change5_3.compareTo(new BigDecimal(-3)) > 0) {
            stringBuffer.append(Constants.TUXINGPING);
            stringBuffer.append(",");
        } else {
            stringBuffer.append(Constants.TUXINGXIANGXIA);
            stringBuffer.append(",");
        }
        BigDecimal chang5_4gong = changeEntityList.get(3).getClosingPrice().subtract(changeEntityList.get(7).getClosingPrice());
        BigDecimal change5_4 = chang5_4gong.divide(changeEntityList.get(7).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
        if (change5_4.compareTo(new BigDecimal(3)) > 0) {
            stringBuffer.append(Constants.TUXINGXIANGSHANG);
            stringBuffer.append(",");
        } else if (change5_4.compareTo(new BigDecimal(-3)) > 0) {
            stringBuffer.append(Constants.TUXINGPING);
            stringBuffer.append(",");
        } else {
            stringBuffer.append(Constants.TUXINGXIANGXIA);
            stringBuffer.append(",");
        }
        BigDecimal chang5_5gong = changeEntityList.get(0).getLclosePrice().subtract(changeEntityList.get(3).getClosingPrice());
        BigDecimal change5_5 = chang5_5gong.divide(changeEntityList.get(3).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
        if (change5_5.compareTo(new BigDecimal(3)) > 0) {
            stringBuffer.append(Constants.TUXINGXIANGSHANG);
            stringBuffer.append(",");
        } else if (change5_5.compareTo(new BigDecimal(-3)) > 0) {
            stringBuffer.append(Constants.TUXINGPING);
            stringBuffer.append(",");
        } else {
            stringBuffer.append(Constants.TUXINGXIANGXIA);
            stringBuffer.append(",");
        }

        return stringBuffer.toString();
    }
}
