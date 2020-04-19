package com.spx.intercrptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * create by Shipeixin on 2020/4/19 14:05
 */
public class MySecondInterceptor implements HandlerInterceptor {
    // 处理器执行方法之前调用
    //  返回值为true  放行   false  不放行  就执行不了处理器方法
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle处理器方法执行之前进行调用2");

        return true;
    }

    //  当处理器方法执行之后自动调用
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle当处理器方法执行之后自动调用2");
    }


    // 请求处理完毕后调用
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion请求处理完毕后调用2");
    }
}
