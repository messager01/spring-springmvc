package com.spx;

import javafx.scene.shape.VLineTo;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * create by Shipeixin on 2020/4/16 12:06
 */

@Component
@Aspect
public class GoodsDaoAspect {

    //  前置通知
    @Before(value = "execution(* com.spx.GoodsDaoImpl.save(..))")
    public void log(){
        System.out.println("日志");
    }



    //  后置通知
    @AfterReturning(value = "execution(* com.spx.GoodsDaoImpl.update(..))",returning = "res")
    public void check(Object res){
        System.out.println(res);
    }


    @Around(value = "execution(* com.spx.GoodsDaoImpl.delete(..))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("开启事务");
        Object proceed = joinPoint.proceed();
        System.out.println("提交事务");
        return proceed;
    }
}
