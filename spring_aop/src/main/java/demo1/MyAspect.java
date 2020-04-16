package demo1;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * create by Shipeixin on 2020/4/16 11:30
 */
public class MyAspect {

    public void check(){
        System.out.println("check");
    }

    public void log(Object res){
        System.out.println("日志记录");
        System.out.println(res);
    }

    //  环绕通知的切面
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("开启事务");
        Object proceed = joinPoint.proceed();
        System.out.println("关闭事务");
        return  proceed;
    }


    public void   exceptionM(Throwable es){
        System.out.println("出现异常");
        System.out.println(es.getMessage());
        System.out.println(es.getLocalizedMessage());
    }
}
