package cuj.anything.reflect.proxy;

import cuj.anything.reflect.proxy.SolutionProxyInvocationHandler;
import cuj.anything.reflect.proxy.SolutionService;
import cuj.anything.reflect.proxy.SolutionServiceImpl;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;

/**
 * @Auther: cujamin
 * @Date: 2019/2/18 10:03
 * @Description:
 */
public class Main {

    public static void main(String[] args) {
        try{
            detailedProxy();
        }catch (NoSuchMethodException nse){
            System.out.println("NoSuchMethodException");
        }catch (SecurityException se){
            System.out.println("SecurityException");
        }catch (IllegalAccessException ie){
            System.out.println("IllegalAccessException");
        }catch (InvocationTargetException ite){
            System.out.println("InvocationTargetException");
        }catch (InstantiationException inse){
            System.out.println("InstantiationException");
        }

    }

    public static void testStaticProxy() throws
            NoSuchMethodException, SecurityException, IllegalAccessException, InvocationTargetException, InstantiationException{

        Class[] classes = new Class[]{String.class,int.class};
        String hello = String.class.getConstructor(classes).newInstance("hello");

        System.out.println("hello:"+hello);
    }

    public static void detailedProxy()throws
            NoSuchMethodException, SecurityException, IllegalAccessException, InvocationTargetException, InstantiationException{

        SolutionService solutionService = new SolutionServiceImpl();

        //1.0 获取代理类的类对象，主要设置相同的 ClassLoader 去加载目标类实现的接口 SolutionService 类
        // solutionService 的 类对象 proxyClass
        Class<?> proxyClass = Proxy.getProxyClass(SolutionService.class.getClassLoader(), new Class[]{SolutionService.class});

        //2.0 得到代理类后，就可以通过代理类的处理器句柄来得到构造器
        // solutionService类对象 的 构造器 con
        final Constructor<?> solutionServiceConstructor = proxyClass.getConstructor(InvocationHandler.class);

        //3.0 获取具体执行方法的句柄处理器，目的通过构造器传入被代理目标类对象，注入到代理类处理器句柄中进行代理调用
        // solutionService的代理类的具体处理的InvocationHandler
        final InvocationHandler solutionProxyInvocationHandler = new SolutionProxyInvocationHandler(solutionService);

        //4.0 通过构造器创建代理类对象
        // 虽然是SolutionService ，实际上是SolutionService的代理类
        SolutionService solutionServiceProxy = (SolutionService)solutionServiceConstructor.newInstance(solutionProxyInvocationHandler);

        //5.0 最后调用方法
        solutionServiceProxy.sayHello("proxy");
    }

    public static void simpleProxy() throws
            NoSuchMethodException, SecurityException, IllegalAccessException, InvocationTargetException, InstantiationException{
        //原solutionService
        SolutionService solutionService = new SolutionServiceImpl();
        //代理solutionService，依赖“原solutionService”和“new SolutionProxyInvocationHandler(solutionService)”生成
        //代理solutionService的方法均需要通过SolutionProxyInvocationHandler的invoke来执行
        SolutionService solutionServiceProxy = (SolutionService)Proxy.newProxyInstance(
                // loader：一个classloader对象，定义了由哪个classloader对象对生成的代理类进行加载
                //----------------加载代理类的对象ClassLoader----------------------
                solutionService.getClass().getClassLoader(),
                // interfaces：一个interface对象数组，
                // 表示我们将要给我们的代理对象提供一组什么样的接口，
                // 如果我们提供了这样一个接口对象数组，那么也就是声明了代理类实现了这些接口，代理类就可以调用接口中声明的所有方法。
                //----------------代理类可调用的方法----------------------
                solutionService.getClass().getInterfaces(),
                // 一个InvocationHandler对象，表示的是当动态代理对象调用方法的时候会关联到哪一个InvocationHandler对象上，并最终由其调用。
                new SolutionProxyInvocationHandler(solutionService));

        solutionServiceProxy.sayHello("123");
    }

    /**
     * 子类代理
     * @throws NoSuchMethodException
     * @throws SecurityException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws InstantiationException
     */
    public static void testCgilb()throws
            NoSuchMethodException, SecurityException, IllegalAccessException, InvocationTargetException, InstantiationException{

    }
}
