package com.stock.stockday.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    public static String get2String(Date data){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        return simpleDateFormat.format(data);
    }
}
