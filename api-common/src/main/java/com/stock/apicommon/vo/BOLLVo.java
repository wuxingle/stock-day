package com.stock.apicommon.vo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class BOLLVo implements Serializable {
    private BigDecimal UP;
    private BigDecimal MB;
    private BigDecimal DN;
}
