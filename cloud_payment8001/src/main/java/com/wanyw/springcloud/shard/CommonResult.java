package com.wanyw.springcloud.shard;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author wanyiwen01@corp.netease.com
 * @date 2020-09-30
 * @time 10:37
 */
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> implements Serializable {
    private Integer code;
    private String message;
    private T data;
    public CommonResult(Integer code,String message){
        this(code,message,null);
    }
}
