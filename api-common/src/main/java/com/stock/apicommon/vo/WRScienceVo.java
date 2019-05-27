package com.stock.apicommon.vo;

import lombok.Data;

@Data
public class WRScienceVo {
    private String jincha;
    //金叉
    private String sicha;
    //死叉
    private String xiangxia;
    //向下
    private String xiangshang;
    //向上
    private String xiangxia20;
    //20一下向下
    private String xiangshang20;
    //20一下向上
    private String jincha20;
    //20一下金叉
    private String sicha20;
    //20一下死叉
    private String xiangxia80;
    //80一上向下
    private String xiangshang80;
    //80一上向上
    private String jincha80;
    //80一上金叉
    private String sicha80;
    //80一上死叉
}
