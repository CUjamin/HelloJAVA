package cuj.anything.java.lang.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by cujamin on 2017/8/23.
 */
public class ClassUtil {
    public static void printClassMessage(Object object)
    {
        Class c = object.getClass();
        Method[] ms = c.getMethods();
        Field[] fd =c.getFields();
        printClassMethod(ms);

    }
    private static void printClassMethod(Method[] ms)
    {
        for(int i=0;i<ms.length;++i)
        {
            System.out.print(ms[i].getReturnType().getName()+" ");
            System.out.print(ms[i].getName()+"(");
            Class[] paraType = ms[i].getParameterTypes();
            for(Class cp:paraType)
            {
                System.out.print(cp.getClass().getName()+" ");
            }
            System.out.println(")");
        }
    }
    private static void printClassField(Field[] fd)
    {

    }
}
