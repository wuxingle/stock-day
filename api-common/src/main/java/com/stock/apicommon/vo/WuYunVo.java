package com.stock.apicommon.vo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class WuYunVo implements Serializable {
    private String wuYunGaiDing;
    private String tanYouFanGong;
    private String qingPengDaYu;
    private String chuangTouPoJiao;
    private String suangFeiWuYa;
    private String shanFeiWuYa;
    private String jiuYingBaiGu;
    private String xiaDieShanLianYing;
    private String heiShanBing;
    private String liangYangJiaYin;
    private String binPaiLv;
}
