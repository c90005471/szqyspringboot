package com.aaa.service.impl;

import com.aaa.dao.EmpDao;
import com.aaa.service.EmpBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author: 陈建
 * @Date: 2019/7/22 0022 10:50
 * @Version 1.0
 */
@Service("empBizImpl")
public class EmpBizImpl implements EmpBiz {
    @Autowired
    private EmpDao empDao;
    @Override
    public List<Map<String, Object>> findAllEmp() {
        return empDao.findAllEmp();
    }
}
