package com.zlong.utils;

/*
* 字符串处理工具
* */
public class StringUtils {
    //判断字符串s是否为空
    public static boolean isEmpty(String s){
        return s == null;
    }
    //判断字符串s是否为空
    public static boolean isNotEmpty(String s){
        return !(s == null);
    }

    //判断字符串是否为空或者空串
    public static boolean isBlank(String s){
        return s == null || s.length() <= 0;
    }

    //判断字符串是否为空或者空串
    public static boolean isNotBlank(String s){
        return !(s == null || s.length() <= 0);
    }

}
