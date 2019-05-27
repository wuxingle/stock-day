package com.stock.stockday.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@TableName("stock_day_fund_flow_3002")
public class StockDayFundFlow3002 implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId
    private String id;
    private String codeId;
    private String codeEx;
    private Date date;
    private String exCode;
    private BigDecimal mainFlowInto;
    private BigDecimal mainOutflow;
    private BigDecimal mainNetFlow;
    private BigDecimal mainInflowRate;
    private BigDecimal retailFlowInto;
    private BigDecimal retailOutflow;
    private BigDecimal retailNetFlow;
    private BigDecimal retailInflowRate;
    private BigDecimal fundSum;
    private String name;
}