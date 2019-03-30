package cuj.anything.java.lang.reflect.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Auther: cujamin
 * @Date: 2019/2/19 10:07
 * @Description:
 */
public class MyInterceptor implements MethodInterceptor{
    public Object getProxy(Class<?> clazz){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable{
        System.out.println("开始");
        Object result = methodProxy.invokeSuper(object,args);
        System.out.println("结束");
        return result;
    }
}
