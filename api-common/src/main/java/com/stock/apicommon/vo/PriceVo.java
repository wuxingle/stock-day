package com.stock.apicommon.vo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class PriceVo implements Serializable {
    private BigDecimal priceMa5;
    private BigDecimal priceMa10;
    private BigDecimal priceMa20;
    private BigDecimal priceMa30;
    private BigDecimal priceMa60;

}
