package com.zlong.entity.vo;

import lombok.Data;

/*
 * 用户Vo
 * */
@Data
public class UserVo {
    //用户ID
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
