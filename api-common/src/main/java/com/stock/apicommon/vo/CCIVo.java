package com.stock.apicommon.vo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class CCIVo implements Serializable {
    private BigDecimal CCI;
    private BigDecimal BIAS10;
    private BigDecimal BIAS30;
}
