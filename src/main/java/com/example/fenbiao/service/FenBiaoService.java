package com.example.fenbiao.service;

import com.example.fenbiao.dao.FenBiaoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 分表业务处理层
 *
 * @author: guofengzhi
 * @date: 2020/12/21 13:56
 * @version: 1.0
 */
@Service("fenBiaoService")
public class FenBiaoService {

    private final FenBiaoDao fenBiaoDao;

    public FenBiaoService(FenBiaoDao fenBiaoDao) {
        this.fenBiaoDao = fenBiaoDao;
    }

    public String getName(Long id) {
        return fenBiaoDao.getName(id);
    }

    public void save(String name, Integer sex) {
        fenBiaoDao.save(name, sex);
    }
}
