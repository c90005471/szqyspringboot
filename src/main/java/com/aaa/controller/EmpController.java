package com.aaa.controller;

import com.aaa.dao.EmpDao;
import com.aaa.entity.LayUiData;
import com.aaa.service.EmpBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @Author: 陈建
 * @Date: 2019/7/22 0022 10:51
 * @Version 1.0
 */
@Controller
public class EmpController {
    @Autowired
    private EmpBiz empBizImpl;
    @Autowired
    private EmpDao empDao;

    @RequestMapping("/findAllEmp")
    @ResponseBody
    public LayUiData findAllEmp(){
        System.out.println(empDao.toString());
        LayUiData layUiData = new LayUiData();
        List<Map<String, Object>> mapList = empBizImpl.findAllEmp();
        layUiData.setData(mapList);
        layUiData.setCode(0);
        return layUiData;
    }
}
