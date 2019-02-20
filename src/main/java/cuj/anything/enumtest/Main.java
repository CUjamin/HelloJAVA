package cuj.anything.enumtest;

/**
 * Created by cujamin on 2017/11/9.
 */
public class Main {

    public static void main(String[]args)
    {
        Singleton singleton = Singleton.SINGLETON;
        System.out.println(singleton.getClass().getName());
    }
}
