package com.stock.stockday.dao;

import lombok.Data;

import java.io.Serializable;

@Data
public class UpGoTime implements Serializable {
    private static final long serialVersionUID = 1L;
    //幅度区间 9,8,7...-10
    private Integer up ;
    //持续时间 1,2...10
    private Integer upTime;
    //出现的次数
    private Integer num;
    //和总次数的比例
    private Double ratio;

}