package com.stock.apicommon.vo;

import lombok.Data;

@Data
public class RSIScienceVo {
    private String jincha;
    //金叉
    private String sicha;
    //死叉
    private String xiangxia;
    //向下
    private String xiangshang;
    //向上
    private String xiangxia30;
    //30一下向下
    private String xiangshang30;
    //30一下向上
    private String jincha30;
    //30一下金叉
    private String sicha30;
    //30一下死叉
    private String xiangxia70;
    //70一上向下
    private String xiangshang70;
    //70一上向上
    private String jincha70;
    //70一上金叉
    private String sicha70;
    //70一上死叉
}
