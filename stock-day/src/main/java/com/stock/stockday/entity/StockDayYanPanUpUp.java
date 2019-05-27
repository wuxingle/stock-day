package com.stock.stockday.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@TableName("stock_day_yan_pan_up_up")
public class StockDayYanPanUpUp implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId
    private String id;
    private String liangXian;
    private String sanXian;
    private String siXian;
    private String wuXian;
    private String kdj;
    private String macd;
    private String quantityMa;
    private String priceMa;
    private BigDecimal shangZhangSum1;
    private BigDecimal shangZhangMa1;
    private BigDecimal shangZhangCount1;
    private BigDecimal shangZhangRate1;
    private BigDecimal xiaJiangSum1;
    private BigDecimal xiaJiangMa1;
    private BigDecimal xiaJiangCount1;
    private BigDecimal xiaJiangRate1;
    private BigDecimal shangZhangSum2;
    private BigDecimal shangZhangMa2;
    private BigDecimal shangZhangCount2;
    private BigDecimal shangZhangRate2;
    private BigDecimal xiaJiangSum2;
    private BigDecimal xiaJiangMa2;
    private BigDecimal xiaJiangCount2;
    private BigDecimal xiaJiangRate2;
    private BigDecimal shangZhangSum3;
    private BigDecimal shangZhangMa3;
    private BigDecimal shangZhangCount3;
    private BigDecimal shangZhangRate3;
    private BigDecimal xiaJiangSum3;
    private BigDecimal xiaJiangMa3;
    private BigDecimal xiaJiangCount3;
    private BigDecimal xiaJiangRate3;
    private BigDecimal shangZhangSum5;
    private BigDecimal shangZhangMa5;
    private BigDecimal shangZhangCount5;
    private BigDecimal shangZhangRate5;
    private BigDecimal xiaJiangSum5;
    private BigDecimal xiaJiangMa5;
    private BigDecimal xiaJiangCount5;
    private BigDecimal xiaJiangRate5;
    private BigDecimal shangZhangSum8;
    private BigDecimal shangZhangMa8;
    private BigDecimal shangZhangCount8;
    private BigDecimal shangZhangRate8;
    private BigDecimal xiaJiangSum8;
    private BigDecimal xiaJiangMa8;
    private BigDecimal xiaJiangCount8;
    private BigDecimal xiaJiangRate8;
    private BigDecimal shangZhangSum13;
    private BigDecimal shangZhangMa13;
    private BigDecimal shangZhangCount13;
    private BigDecimal shangZhangRate13;
    private BigDecimal xiaJiangSum13;
    private BigDecimal xiaJiangMa13;
    private BigDecimal xiaJiangCount13;
    private BigDecimal xiaJiangRate13;
    private BigDecimal shangZhangSum20;
    private BigDecimal shangZhangMa20;
    private BigDecimal shangZhangCount20;
    private BigDecimal shangZhangRate20;
    private BigDecimal xiaJiangSum20;
    private BigDecimal xiaJiangMa20;
    private BigDecimal xiaJiangCount20;
    private BigDecimal xiaJiangRate20;
}