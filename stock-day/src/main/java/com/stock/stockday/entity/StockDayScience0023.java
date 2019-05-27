package com.stock.stockday.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@TableName("stock_day_science_0023")
public class StockDayScience0023 implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId
    private String id;
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
    private BigDecimal makeQuantityMa5;
    private BigDecimal makeQuantityMa10;
    private BigDecimal makeQuantityMa20;
    private BigDecimal makeQuantityMa30;
    private BigDecimal quantity;
    private BigDecimal ema12;
    private BigDecimal ema26;
    private BigDecimal rsv;
}