package cuj.anything.java.util.concurrent.executorservice;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by cujamin on 2017/8/26.
 */
public class Main {
    public static void main(String[]args)
    {
        ExecutorService executorService = Executors.newFixedThreadPool(16);
        Map<String,String> map = new ConcurrentHashMap<String,String>();
    }
}
