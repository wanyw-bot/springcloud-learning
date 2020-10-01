package com.wanyw.springcloud.dao;

import com.wanyw.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author wanyiwen01@corp.netease.com
 * @date 2020-09-30
 * @time 10:45
 */
@Mapper
public interface PayDao {
    Payment getById(@Param("id") Long id);
    Integer deleteById(@Param("id") Long id);
}
