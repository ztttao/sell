package com.imooc.utils;

import java.util.Random;

//索引 约束
public class KeyUtil {
    /*
    生成唯一主键
    格式：时间+随机数
  synchronized 为了防止多线程  会有重复的
     */
    public static synchronized String genUniqueKey(){
        Random random=new Random();
        System.currentTimeMillis();
        Integer number = random.nextInt(900000)+100000;  //随机数为6位数
        return System.currentTimeMillis()+String.valueOf(number);
    }
}
