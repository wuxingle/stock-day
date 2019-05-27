package com.stock.stockday.util;

import org.apache.commons.lang.StringUtils;

import java.math.BigDecimal;

public class getBigDecimalUtil {
    public static BigDecimal getBigDecimal(String str) {
        if (StringUtils.isEmpty(str) || str.equals("None")) {
            return null;
        }
        return new BigDecimal(str);
    }

}
