package com.zlong.utils;

import com.zlong.entity.vo.ResultVo;

/*
* 处理结果工具类
* */
public class ResultUtils {
    //成功操作且没有任何附加备注信息
    public static ResultVo success(){
      ResultVo resultVo = new ResultVo();
      resultVo.setResultNum(1);
      return resultVo;
    }
    //成功操作并且附加备注信息
    public static ResultVo success(String message){
        ResultVo resultVo = new ResultVo();
        resultVo.setResultNum(1);
        resultVo.setResultMessage(message);
        return resultVo;
    }
    //成功操作并且附加备注信息和结果集
    public static ResultVo success(String message,Object o){
        ResultVo resultVo = new ResultVo();
        resultVo.setResultNum(1);
        resultVo.setResultMessage(message);
        resultVo.setResultObject(o);
        return resultVo;
    }
    //失败操作且没有任何附加备注信息
    public static ResultVo failed(){
        ResultVo resultVo = new ResultVo();
        resultVo.setResultNum(2);
        return resultVo;
    }

    //失败操作并且附加备注信息
    public static ResultVo failed(String message){
        ResultVo resultVo = new ResultVo();
        resultVo.setResultNum(2);
        resultVo.setResultMessage(message);
        return resultVo;
    }
    //失败操作并且附加备注信息
    public static ResultVo failed(String message,Object o){
        ResultVo resultVo = new ResultVo();
        resultVo.setResultNum(2);
        resultVo.setResultMessage(message);
        resultVo.setResultObject(o);
        return resultVo;
    }
}
