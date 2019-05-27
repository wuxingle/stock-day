package com.stock.apicommon.vo;

import lombok.Data;

@Data
public class MACDScienceVo {
    private String xiachuan0zhou;
    //下穿0轴
    private String shangchuan0zhou;
    //上窜0轴
    private String zhoufujinjincha;
    //0轴附近金叉
    private String zhouxiajincha;
    //0轴一下金叉
    private String zhoushangjincha;
    //0轴以上金叉
    private String zhouxiasicha;
    //0轴一下死叉
    private String zhoushangsicha;
    //0轴以上死叉
    private String zhouxiaxiangshang;
    //0轴一下向上
    private String zhoushnagxiangshang;
    //0轴以上向上
    private String zhouxiaxiangxia;
    //0轴一下向下
    private String zhoushangxiangxia;
    //0轴以上向下
}
