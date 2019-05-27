package com.stock.apicommon.vo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class KDJVo implements Serializable {
    private BigDecimal K;
    private BigDecimal D;
    private BigDecimal J;
    private BigDecimal RSV;
    private BigDecimal MACD;
}
