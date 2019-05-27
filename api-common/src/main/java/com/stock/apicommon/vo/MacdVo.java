package com.stock.apicommon.vo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class MacdVo implements Serializable {
    private BigDecimal EMA12;
    private BigDecimal EMA26;
    private BigDecimal DEA;
    private BigDecimal DIF;
    private BigDecimal MACD;
}
