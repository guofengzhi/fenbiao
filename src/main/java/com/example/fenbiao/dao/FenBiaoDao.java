package com.example.fenbiao.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * descriptions: 分表数据访问层
 * author: guofengzhi
 * date: 2020/12/21 13:57
 * version: 1.0
 */
@Component
public interface FenBiaoDao {

    String getName(Long id);

    void save(@Param("name") String name, @Param("sex") Integer sex);
}
