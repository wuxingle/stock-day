package com.stock.apicommon.vo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class RateOfChangeVo implements Serializable {
    private BigDecimal beforeChange1;
    private BigDecimal beforeChange2;
    private BigDecimal beforeChange3;
    private BigDecimal beforeChange5;
    private BigDecimal beforeChange8;
    private BigDecimal beforeChange13;
    private BigDecimal beforeChange20;
}
