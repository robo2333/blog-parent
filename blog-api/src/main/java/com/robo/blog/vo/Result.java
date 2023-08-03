package com.robo.blog.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @ClassName : Result  //类名
 * @Description : 返回类型  //描述
 * @Author : Rui //作者
 * @Date: 2023/8/3  10:47
 */
@Data
@AllArgsConstructor
public class Result {
    private boolean success;
    private int code;
    private String msg;
    private Object data;
    public static Result success(Object data){
        return new Result(true,200,"success",data);
    }
    public static Result fail(int code,String msg){
        return new Result(false,code,msg,null);
    }
}
