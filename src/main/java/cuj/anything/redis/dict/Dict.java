package cuj.anything.redis.dict;

/**
 * @Auther: cujamin
 * @Date: 2019/3/11 15:52
 * @Description:字典
 */
public class Dict {
    private DictType type;
    private Object privdata;
    private Dictht[] ht = new Dictht[2];
    private int trehashidx;
}
