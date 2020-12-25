package com.example.fenbiao.algorithm;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.util.Collection;

/**
 * 自定义分表算法类
 *
 * @author: guofengzhi
 * @date: 2020/12/24 11:13
 * @version: 1.0
 */
public class MyAlgorithm implements PreciseShardingAlgorithm {

    @Override
    public String doSharding(Collection collection, PreciseShardingValue preciseShardingValue) {
        int sex = Integer.parseInt(preciseShardingValue.getValue().toString());
        if (sex % 2 == 0) {
            return "t_user0";
        }  else if (sex % 2 == 1) {
            return "t_user1";
        }
        return null;
    }
}
