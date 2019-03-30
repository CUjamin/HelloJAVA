package cuj.anything.java.lang.reflect.itp;

import cuj.anything.java.lang.reflect.itp.intercept.MyIntercaptor;
import cuj.anything.java.lang.reflect.itp.service.HelloService;
import cuj.anything.java.lang.reflect.itp.service.HelloServiceImpl;

/**
 * @Auther: cujamin
 * @Date: 2019/2/15 16:46
 * @Description:
 */
public class ItpMain {
    public static void main(String[] args) {
        testProxy();
    }
    private static void testProxy(){
        HelloService helloService =new HelloServiceImpl();

        HelloService proxy = (HelloService) ProxyBean.getProxyBean(helloService,new MyIntercaptor());
        proxy.sayHello("123");
        System.out.println("**************************");
        proxy.sayHello2(null);

//        HelloServiceImpl helloService =new HelloServiceImpl();
//
//        HelloServiceImpl proxy = (HelloServiceImpl) ProxyBean.getProxyBean(helloService,new MyIntercaptor());
//        proxy.sayHello("123");
//        System.out.println("**************************");
//        proxy.sayHello2(null);
//        System.out.println("**************************");
//        proxy.sayHello3("test");
    }
}
