package cuj.anything.reflect.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Auther: cujamin
 * @Date: 2019/2/18 10:50
 * @Description:
 */
public class SolutionProxyInvocationHandler implements InvocationHandler {

    private Object obj;

    public SolutionProxyInvocationHandler(Object obj) {
        this.obj = obj;
    }

    /**
     *
     * @param proxy     所代理的那个真实对象
     * @param method    所要调用真实对象的某个方法的Method对象
     * @param args      调用真实对象某个方法时接受的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable{
        System.out.println("before invoke ...");
        Object invoke = method.invoke(obj,args);
        System.out.println("after invoke ...");
        return invoke;
    }
}
