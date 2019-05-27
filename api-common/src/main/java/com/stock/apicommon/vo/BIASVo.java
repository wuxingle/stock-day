package com.stock.apicommon.vo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class BIASVo implements Serializable {
    private BigDecimal BIAS5;
    private BigDecimal BIAS10;
    private BigDecimal BIAS30;
}
