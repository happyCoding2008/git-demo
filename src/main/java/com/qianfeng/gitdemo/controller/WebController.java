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
        System.out.println("2018 commit");
        System.out.println("NBA大结局2008说的");
        System.out.println("戴维斯携手字母歌底薪加盟湖人，NBA又大结局2018");
        System.out.println("这些bug级别的球员聚到了一起");
        return "hello,git";
    }
}
