package com.wanyw.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wanyiwen01@corp.netease.com
 * @date 2020-09-30
 * @time 10:38
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
    private Integer id;
    private String serial;

}
