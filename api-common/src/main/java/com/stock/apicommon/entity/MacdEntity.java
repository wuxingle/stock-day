package com.stock.apicommon.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class MacdEntity implements Serializable {
    private BigDecimal beforeEma12;
    private BigDecimal beforeDea;
    private BigDecimal beforeEma26;
    private BigDecimal closingPrice;

}
