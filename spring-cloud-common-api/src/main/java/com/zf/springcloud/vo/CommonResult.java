package com.zf.springcloud.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhengfan
 * @create 2020-09-23 21:18
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private Integer code;

    private  String msg;

    private  T data;

    public CommonResult(Integer code , String msg){
       this(code,msg,null);
    }

    //code  信息  数据
}
