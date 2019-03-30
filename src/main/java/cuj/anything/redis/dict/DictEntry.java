package cuj.anything.redis.dict;

/**
 * @Auther: cujamin
 * @Date: 2019/3/11 15:48
 * @Description: 哈希表节点
 */
public class DictEntry {
    private Object key;
    private Union union;
    private DictEntry next;
}
class Union{
    private Object val;
    private int u64;
    private int s64;
}
