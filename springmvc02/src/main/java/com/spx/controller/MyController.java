package com.spx.controller;

import com.spx.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.security.PublicKey;
import java.util.Arrays;

/**
 * create by Shipeixin on 2020/4/18 16:41
 */

@Controller
public class MyController {

    @RequestMapping(value = "first")
    public String myform(HttpServletRequest request){
        String id = request.getParameter("id");
        System.out.println(id);
        return "second";
    }

    // required  默认为  true
    @RequestMapping("second")
    public String myform2(@RequestParam(required = false,defaultValue = "100") Integer id, String name){
        System.out.println(id);
        System.out.println(name);
        return "second";
    }


    @RequestMapping("/myform")
    public String form3(User user){
        System.out.println(user);
        return "second";
    }

    @RequestMapping("/array")
    public String form4(String[] name){
        System.out.println(Arrays.toString(name));
        return "second";
    }



    @RequestMapping("/bzl")
    public String baozhuanglei(User user){
        System.out.println(user);
        return "second";
    }


    //  user中有一个属性为List集合   dogs[0].name   dogs[0].color
    @RequestMapping("/dogs")
    public String ListDogs(User user){
        System.out.println(user);
        return "second";
    }


    @ResponseBody
    @RequestMapping("/show")
    public String show1(){
        return "success";
    }


    @ResponseBody
    @RequestMapping("/local")
        public String local(){
        return "local";
        }
}
