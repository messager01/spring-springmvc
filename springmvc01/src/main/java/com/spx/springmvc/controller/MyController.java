package com.spx.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * create by Shipeixin on 2020/4/17 11:39
 */

@Controller
public class MyController {

    @RequestMapping("/first.action")
    public ModelAndView show(){
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("name","spx");

        modelAndView.setViewName("result");

        return modelAndView;

    }

    @RequestMapping("/second.action")
    public String show2(){

        /*
        *  在自定义配置了视图解析器（即配置了前缀和后缀）后
        *   请求转发时即可不写前后缀，重定向不能省略
        * */
        return "redirect:/result2.jsp";
    }
}
