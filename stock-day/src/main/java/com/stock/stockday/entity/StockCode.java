package com.stock.stockday.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@TableName("stock_code")
public class StockCode implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String ex;
    private String name;
    private String industry;
    private String createUser;
    private Date createDate;

}