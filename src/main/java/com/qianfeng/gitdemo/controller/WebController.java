package com.qianfeng.gitdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author HuangGuiZhao
 * @Date 2019/1/20
 */
@Controller
@RequestMapping("web")
public class WebController {

    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        System.out.println("hello");
        System.out.println("wolrd");
        return "hello,git";
    }
}
