package com.stock.stockday.vo;


import com.stock.apicommon.entity.BaseEntity;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Data
public class StockLog extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String context;
    private String operateId;
    private String url;
    private Date startTime;
    private String result;
    private String createUser;
    private LocalDateTime createDate;
    private String updateUser;
    private LocalDateTime updateDate;

}