package com.zlong.entity.dto;

import lombok.Data;

/*
 * 用户Dto
 * */
@Data
public class UserDto {
    //用户ID
    private Integer id;
    //用户名称
    private String name;
    //用户电话
    private Integer phone;
    //用户年龄
    private Integer age;
    //用户邮箱地址
    private String email;
    //每页的数据量
    private Integer pageNum;
    //当前页数
    private Integer pageSize;

}
