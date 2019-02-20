package cuj.anything.lru;

import org.junit.Test;

/**
 * Created by cujamin on 2017/9/22.
 */
public class TestLRUCache {
    @Test
    public void testLRU()
    {
        LRUCacheInheritanceHM<Integer,Integer> lru = new LRUCacheInheritanceHM<Integer, Integer>(5);
        for(int i=0;i<10;i++)
        {
            lru.put(i,i);
        }
        System.out.println(lru.toString());
    }
}
