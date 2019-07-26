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
 * @since 2019-01-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("on_IMUserFriends")
public class IMUserFriends implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Integer uid;

    private Integer friuid;

    @TableField("friName")
    private String friName;

    @TableField("friAvatar")
    private String friAvatar;

    private String remark;

    @TableField("groupId")
    private Integer groupId;

    private String message;

    private Integer status;

    private Integer role;

    private Integer lv;

    private Integer updated;

    private Integer created;


}
