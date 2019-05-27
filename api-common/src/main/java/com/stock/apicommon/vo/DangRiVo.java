package com.stock.apicommon.vo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class DangRiVo implements Serializable {
    private String shangyingxian100;
    private String shangyingxian20;
    private String shangyingxian10;
    private String shangyingxian3;
    private String shangyingxian1;
    private String shangyingxian0_5;
    private String shangyingxian0;

    private String xiayingxian100;
    private String xiayingxian20;
    private String xiayingxian10;
    private String xiayingxian3;
    private String xiayingxian1;
    private String xiayingxian0_5;
    private String xiayingxian0;

    private String shizixing50;
    private String shizixing10;
    private String shizixing3;
    private String shizixing1;
    private String shizixing0_5;
    private String shizixing0;

    private String xianXing;




}
