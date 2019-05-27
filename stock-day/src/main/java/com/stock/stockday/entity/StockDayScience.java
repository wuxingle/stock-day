package com.stock.stockday.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
@Data
@TableName("stock_day_science")
public class StockDayScience implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String codeId;
    private String codeEx;
    private Date date;
    private BigDecimal macd;
    private BigDecimal diff;
    private BigDecimal dea;
    private BigDecimal k;
    private BigDecimal d;
    private BigDecimal j;
    private BigDecimal rsi1;
    private BigDecimal rsi2;
    private BigDecimal rsi3;
    private BigDecimal bias1;
    private BigDecimal bias2;
    private BigDecimal bias3;
    private BigDecimal cci;
    private BigDecimal wr1;
    private BigDecimal wr2;
    private BigDecimal mid;
    private BigDecimal upp;
    private BigDecimal low;
    private BigDecimal priceMa5;
    private BigDecimal priceMa10;
    private BigDecimal priceMa20;
    private BigDecimal priceMa30;
    private BigDecimal priceMa60;
    private Integer makeQuantityMa5;
    private Integer makeQuantityMa10;
    private Integer makeQuantityMa20;
    private Integer makeQuantityMa30;

}