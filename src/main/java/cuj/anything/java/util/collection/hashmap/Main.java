package cuj.anything.java.util.collection.hashmap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by cujamin on 2017/8/17.
 */
public class Main {

    public static void main(String[] args)
    {
        HashMap<String,String> hashMap = new HashMap<String, String>();
        Hashtable<String,String> hashTable = new Hashtable<String,String>();
        ConcurrentHashMap<String,String> concurrentMap = new ConcurrentHashMap<String,String>();

        concurrentMap.put("111","111");
        concurrentMap.replace("111","111","222");
        hashTable.put("","");
        System.out.println(hashMap.put("111","111"));
//        concurrentMap.put(null,null);
//        concurrentMap.get(null);
//        System.out.println(hashMap.get(null));
    }
}
