package com.stock.socketcenter2.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author cloudtalk
 * @since 2019-01-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("on_IMTransmitFile")
public class IMTransmitFile implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("fromId")
    private Integer fromId;

    @TableField("toId")
    private Integer toId;

    @TableField("fileName")
    private String fileName;

    private Integer size;

    @TableField("taskId")
    private Integer taskId;

    private Integer status;

    private Integer created;

    private Integer updated;


}
