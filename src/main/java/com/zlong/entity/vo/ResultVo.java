package com.zlong.entity.vo;

import lombok.Data;

/*
* 用来返回vo
* */
@Data
public class ResultVo {
    //结果状态码 1:成功 2:失败
    private Integer ResultNum;
    //结果备注信息
    private String resultMessage;
    //结果集
    private Object resultObject;
}
