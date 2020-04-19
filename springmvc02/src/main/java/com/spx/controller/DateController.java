package com.spx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * create by Shipeixin on 2020/4/18 19:43
 */

@Controller
public class DateController {


    @RequestMapping("/testdate")
    public String testDate(Date date){
        System.out.println(date);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(format.format(date));
        return "second";
    }
}
