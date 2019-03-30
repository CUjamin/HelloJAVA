package cuj.anything.java.lang.reflect.itp;


//import org.springframework.cglib.proxy.InvocationHandler;
//import org.springframework.cglib.proxy.Proxy;
import cuj.anything.java.lang.reflect.itp.intercept.Interceptor;
import cuj.anything.java.lang.reflect.itp.invoke.Invocation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Auther: cujamin
 * @Date: 2019/2/15 16:04
 * @Description: ProxyBean相当于对 InvocationHandler 进一步封装，
 * 原本InvocationHandler的代理方法，在 Interceptor 中进行封装，Interceptor为对参数的具体操作
 * 原本被代理的类，则赋给target，从而实现 InvocationHandler 对 被代理的类对象 target 的具体操作，
 * InvocationHandler中将target封装为Invocation，调用Interceptor对Invocation进行操作的逻辑安排）
 * 相比于传统的代理模式，增加了Interceptor层，InvocationHandler使用Invocation类型参数调用Interceptor
 */
public class ProxyBean implements InvocationHandler {
    private Object target = null;
    private Interceptor interceptor=null;

    /**
     *
     * @param target        服务类     new HelloServiceImpl()
     * @param interceptor   拦截器     new MyIntercaptor()
     * @return
     */
    public static Object getProxyBean(Object target, Interceptor interceptor){
        ProxyBean proxyBean = new ProxyBean();
        proxyBean.target = target;
        proxyBean.interceptor = interceptor;

        // ClassLoader loader           类加载器               target     HelloServiceImpl()的加载器
        // Class[] interfaces           绑定接口               target     HelloService()
        // InvocationHandler h          绑定代理对象实现        new ProxyBean(target+interceptor)
        Object proxy = Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),proxyBean);

        return proxy;
    }

    /**
     * 实现代理对象的逻辑，约定了拦截器处理的方式
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
        boolean exceptionFlog = false;
        //
        Invocation invocation = new Invocation(target,method,args);
        Object retObj=  null;

        try{
            if(this.interceptor.berfore()){
                retObj = this.interceptor.around(invocation);
            }else {
                //执行 method
                retObj = method.invoke(target,args);
            }
        }catch (Exception e){
            exceptionFlog = true;
        }
        this.interceptor.after();
        if(exceptionFlog){
            this.interceptor.afterThrowing();
        }else {
            this.interceptor.afterReturning();
            return retObj;
        }
        return null;
    }
}
