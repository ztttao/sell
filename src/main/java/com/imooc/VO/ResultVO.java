package com.imooc.VO;

import lombok.Data;

/*
 http请求返回的最外层对象
 */
@Data
public class ResultVO<T>{
    private Integer code;  //错误码 0是成功
    private String msg;  //提示信息
    private T data;  //返回具体内容

}
