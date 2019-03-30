package cuj.anything.java.lang.reflect.office;

import java.lang.reflect.Method;

/**
 * Created by cujamin on 2017/8/23.
 */
public class MethodDemo {
    public static void main(String[]args)
    {
        Class ca = A.class;
        try
        {
            Method m = ca.getMethod("print",String.class,String.class);
            A a = new A();
            m.invoke(a,new Object[]{"10","20"});
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
class A
{
    public void print(int a, int b)
    {
        System.out.println(a+b);
    }
    public void print(String a,String b)
    {
        System.out.println(a.toUpperCase()+","+b.toUpperCase());
    }
}
