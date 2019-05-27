package com.stock.stockday.util;

import com.stock.apicommon.Constants;

import java.math.BigDecimal;

public class GetRate {
    public static String getRate(BigDecimal bigDecimal) {
        if (bigDecimal.compareTo(new BigDecimal(0)) > 0) {
            if (bigDecimal.compareTo(new BigDecimal(20)) > 0) {
                return Constants.shangzhangdayu20;
            } else if (bigDecimal.compareTo(new BigDecimal(10)) > 0) {
                return Constants.shangzhangdayu10;
            } else if (bigDecimal.compareTo(new BigDecimal(5)) > 0) {
                return Constants.shangzhangdayu5;
            } else if (bigDecimal.compareTo(new BigDecimal(2)) > 0) {
                return Constants.shangzhangdayu2;
            } else {
                return Constants.shangzhangdayu0;
            }
        } else {
            if (bigDecimal.compareTo(new BigDecimal(-20)) < 0) {
                return Constants.xiajiangdayu20;
            } else if (bigDecimal.compareTo(new BigDecimal(-10)) < 0) {
                return Constants.xiajiangdayu10;
            } else if (bigDecimal.compareTo(new BigDecimal(-5)) < 0) {
                return Constants.xiajiangdayu5;
            } else if (bigDecimal.compareTo(new BigDecimal(-2)) < 0) {
                return Constants.xiajiangdayu2;
            } else {
                return Constants.xiajiangdayu0;
            }
        }
    }
}
