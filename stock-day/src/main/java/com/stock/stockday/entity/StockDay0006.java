package com.stock.stockday.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@TableName("stock_day_0006")
public class StockDay0006 implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId
    private String id;
    private String codeId;
    private String codeEx;
    private Date date;
    private BigDecimal openingPrice;
    private BigDecimal closingPrice;
    private BigDecimal changePoints;
    private BigDecimal rateOfChange;
    private BigDecimal foot;
    private BigDecimal topside;
    private BigDecimal makeQuantity;
    private BigDecimal makePrice;
    private BigDecimal turnoverRate;
    private BigDecimal tcap;
    private BigDecimal mcap;
    private BigDecimal lclosePrice;
}