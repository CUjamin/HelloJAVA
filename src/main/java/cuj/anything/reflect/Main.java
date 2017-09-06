package cuj.anything.reflect;

import cuj.anything.reflect.office.OfficeAble;

/**
 * Created by cujamin on 2017/8/23.
 */
public class Main {
    public static void main(String[]args)
    {
        try
        {
            OfficeAble officeAble = (OfficeAble) Class.forName("cuj.anything.reflect.office.Word").newInstance();
            officeAble.start();
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


        Class c1 = int.class;
        Class c2 = Integer.class;
        ClassUtil.printClassMessage(c2);
    }
}
