package cuj.anything.java.lang.reflect.cglib;

/**
 * @Auther: cujamin
 * @Date: 2019/2/19 10:17
 * @Description:
 */
public class CglibTest {
    public static void main(String[] args) {
        interfaceTest();
        System.out.println();
        implementsTest();
    }

    public static void interfaceTest(){
        MyInterceptor myInterceptor = new MyInterceptor();
        HelloService helloService = (HelloService)myInterceptor.getProxy(HelloServiceImpl.class);
        helloService.say1("interfaceTest");
        helloService.say2("interfaceTest");
    }

    public static void implementsTest(){
        MyInterceptor myInterceptor = new MyInterceptor();
        HelloServiceImpl helloService = new HelloServiceImpl();
        HelloServiceImpl HelloServiceImplProxy = (HelloServiceImpl)myInterceptor.getProxy(helloService.getClass());
        HelloServiceImplProxy.say1("implementsTest");
        HelloServiceImplProxy.say2("implementsTest");
        HelloServiceImplProxy.say3("implementsTest");
    }
}
