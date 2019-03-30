package cuj.anything.java.util.collection.mapandset;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by cujamin on 2017/9/6.
 */
public class EmpleOfTreeMap {
    public static void main(String[]args)
    {
        Map<String,String> tm = new TreeMap<String,String>();
        for(int i=0;i<1000;++i)
        {
            int key = (int)(1000*Math.random());
            tm.put(key+"",key+"");
        }

        for(String key:tm.keySet())
        {
            System.out.println(key);
        }

    }
}
