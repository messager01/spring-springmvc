package demo1;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * create by Shipeixin on 2020/4/16 10:38
 */
public class UserDaoCglibProxy {

    public UserDao cglibProxy(UserDao userDao){
        //1. 创建核心类
        Enhancer enhancer = new Enhancer();

        //  2.  设置父类   继承方式     创建一个子类   自动的继承UserDao
        enhancer.setSuperclass(userDao.getClass());

        //  3.设置回调
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

                if ("save".equals(method.getName())){
                    System.out.println("功能前加强");
                }
                 return methodProxy.invokeSuper(o,objects);
            }
        });

        //4. 创建代理对象，就是把将子类进行返回
        UserDao cglibProxy = (UserDao) enhancer.create();

        return cglibProxy;
    }
}
