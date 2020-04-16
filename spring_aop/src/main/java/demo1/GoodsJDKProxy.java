package demo1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class GoodsJDKProxy {

    public GoodsDao createProxy(GoodsDao goodsDao) {

        //
        GoodsDao goodsDaoProxy = (GoodsDao) Proxy.newProxyInstance(
                goodsDao.getClass().getClassLoader(),
                goodsDao.getClass().getInterfaces(), new InvocationHandler() {

                    //// 当调用对象的时候，所有的方法都会来到这里
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if ("save".equals(method.getName())){
                            System.out.println("方法前增强");
                        }
                        return method.invoke(goodsDao, args);
                    }
                });

        return goodsDaoProxy;
    }

}
