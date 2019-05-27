package com.stock.apicommon.vo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class DaPanRateOfChangeVo implements Serializable {
    private BigDecimal beforeDPChange1;
    private BigDecimal beforeDPChange2;
    private BigDecimal beforeDPChange3;
    private BigDecimal beforeDPChange5;
    private BigDecimal beforeDPChange8;
    private BigDecimal beforeDPChange13;
    private BigDecimal beforeDPChange20;
}
