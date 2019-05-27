package com.stock.apicommon.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class MakeQuantityEntity implements Serializable {
    private Date date;
    private BigDecimal makeQuantity;


}
