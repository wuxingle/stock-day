package com.stock.apicommon.vo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class WRVo implements Serializable {
    private BigDecimal WR12;
    private BigDecimal WR21;
    private BigDecimal WR28;
    private BigDecimal WR42;
}
