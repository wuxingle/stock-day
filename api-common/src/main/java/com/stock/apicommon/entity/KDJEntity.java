package com.stock.apicommon.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class KDJEntity implements Serializable {
    private Date date;
    private BigDecimal beforeRSV;
    private BigDecimal beforeK;
    private BigDecimal beforeD;
    private BigDecimal foot;
    private BigDecimal topside;
    private BigDecimal closingPrice;

}
