package com.zlong.entity.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/*
* 用户Po
* */
@Data
@TableName("user")
public class UserPo {
    //用户ID
    @TableId(type = IdType.AUTO)
    private Integer id;
    //用户名称
    private String name;
    //用户年龄
    private Integer age;
    //用户邮箱地址
    private String email;
    //用户电话
    private Integer phone;
}
