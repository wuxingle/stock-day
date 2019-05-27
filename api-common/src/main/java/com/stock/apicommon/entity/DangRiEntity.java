package com.stock.apicommon.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class DangRiEntity implements Serializable {
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
