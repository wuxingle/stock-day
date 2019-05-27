package com.stock.apicommon.vo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class YanPanVo implements Serializable {
    private BigDecimal weiLaiChange1;
    private BigDecimal weiLaiChange2;
    private BigDecimal weiLaiChange3;
    private BigDecimal weiLaiChange5;
    private BigDecimal weiLaiChange8;
    private BigDecimal weiLaiChange13;
    private BigDecimal weiLaiChange20;
}
