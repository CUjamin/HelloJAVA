package cuj.geektime.jvm;


/**
 * @Auther: cujamin
 * @Date: 2019/5/14 19:55
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        test(new Integer(1));
        test(null);
    }
    public static void test(Object obj){
        System.out.println("object:"+obj);
    }
    public static void test(String obj){
        System.out.println("string:"+obj);
    }
}
