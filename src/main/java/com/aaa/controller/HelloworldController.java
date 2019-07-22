package com.aaa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: 陈建
 * @Date: 2019/7/22 0022 15:14
 * @Version 1.0
 */
@Controller
public class HelloworldController {

    @RequestMapping("/toHelloWorldPage")
    public String toHelloWorldPage(){
        return "user/hello";

    }
}
