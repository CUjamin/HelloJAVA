package cuj.anything.lru;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by cujamin on 2017/9/22.
 */
public class LRUCacheInheritanceHM<K,V> extends LinkedHashMap<K,V>{
    private int MAX_CACHE_SIZE;
    public LRUCacheInheritanceHM(int cacheSize)
    {
        super((int) Math.ceil(cacheSize / 0.75) + 1, 0.75f, true);
        MAX_CACHE_SIZE = cacheSize;
    }

    protected boolean removeEldestEntry(Map.Entry eldest) {
        return size() > MAX_CACHE_SIZE;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<K, V> entry : entrySet()) {
            sb.append(String.format("%s:%s ", entry.getKey(), entry.getValue()));
        }
        return sb.toString();
    }

}
