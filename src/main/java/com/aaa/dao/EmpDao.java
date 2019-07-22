package com.aaa.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @Author: 陈建
 * @Date: 2019/7/22 0022 10:47
 * @Version 1.0
 */
@Mapper
@Component
public interface EmpDao {
    /**
     * 查询所有的emp
     * @return
     */
    List<Map<String,Object>> findAllEmp();
}
