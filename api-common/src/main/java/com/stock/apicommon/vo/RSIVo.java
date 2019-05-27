package com.stock.apicommon.vo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class RSIVo implements Serializable {
    private BigDecimal RSI6;
    private BigDecimal RSI12;
    private BigDecimal RSI24;
}
