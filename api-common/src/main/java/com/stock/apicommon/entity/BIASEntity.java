package com.stock.apicommon.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class BIASEntity implements Serializable {
    private Date date;
    private BigDecimal closingPrice;


}
