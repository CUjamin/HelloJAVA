package cuj.anything.java.lang.reflect;

import cuj.anything.java.lang.reflect.office.OfficeAble;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by cujamin on 2017/8/23.
 */
public class Main {
    public static void main(String[]args)
    {
        try
        {
            OfficeAble officeAble = (OfficeAble) Class.forName("cuj.anything.java.lang.reflect.office.Word").newInstance();
            officeAble.start();
            Class cl = Class.forName("cuj.anything.java.lang.reflect.office.Word");
            cl.newInstance();
            System.out.println(cl.getClass().getName());

            Field[] fields = cl.getFields();
            System.out.println("field length:"+fields.length);
            for(Field field:fields){
                System.out.println("field:"+field);
            }

            Method[] methods = cl.getMethods();
            System.out.println("methods length:"+methods.length);
            for(Method method:methods){
                System.out.println("method:"+method);
            }

            Constructor<?>[] constructors = cl.getConstructors();
            System.out.println("constructors length:"+constructors.length);
            for(Constructor constructor:constructors){
                System.out.println("constructor:"+constructor);
            }

        }catch (ClassNotFoundException c)
        {
            c.printStackTrace();
        }catch (IllegalAccessException i)
        {
            i.printStackTrace();
        }catch (InstantiationException ie)
        {
            ie.printStackTrace();
        }


//        Class c1 = int.class;
//        Class c2 = Integer.class;
//        ClassUtil.printClassMessage(c2);
    }
}
