package cuj.anything.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by cujamin on 2017/8/10.
 */
public class FristLambda {
    public static void main(String[]args)
    {
//        runnableTest();
//        iterableTest();
        predicateTest();
    }
    public static void runnableTest()
    {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable : running");
            }
        }).start();
        new Thread(() -> System.out.println("Lambda : running")).start();
    }
    public static void iterableTest(){
        List features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
        for (Object feature : features) {
            System.out.println(feature);
        }
        System.out.println(" ");
        features.forEach(n -> System.out.println(n));
        System.out.println(" ");
        features.forEach(System.out::println);
    }
    public static void predicateTest()
    {
        List languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");

        System.out.println("Languages which starts with J :");
        filter(languages, (str)->(""+str).startsWith("J"));

        System.out.println("Languages which ends with a ");
        filter(languages, (str)->(""+str).endsWith("a"));

        System.out.println("Print all languages :");
        filter(languages, (str)->true);

        System.out.println("Print no language : ");
        filter(languages, (str)->false);

        System.out.println("Print language whose length greater than 4:");
        filter(languages, (str)->(""+str).length() > 4);
    }
    public static void filter(List names, Predicate condition) {
        for(Object name: names)  {
            if(condition.test(name)) {
                System.out.println(name + " ");
            }
        }
        test();
    }

    private static void test() {
    }
}
