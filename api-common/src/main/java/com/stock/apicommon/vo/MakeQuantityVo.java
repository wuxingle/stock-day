package com.stock.apicommon.vo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class MakeQuantityVo implements Serializable {
    private BigDecimal MakeQuantity5;
    private BigDecimal MakeQuantity10;
    private BigDecimal MakeQuantity20;
    private BigDecimal MakeQuantity30;
}
