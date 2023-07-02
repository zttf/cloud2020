package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author dale
 * @title CommonResult
 * @date 2023/6/11 15:06
 */
@Data
@AllArgsConstructor  //全参构造
@NoArgsConstructor    //无参构造
//T是什么，就返回什么
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;


    public CommonResult(Integer code,String message){
        this(code,message,null);
    }
}
