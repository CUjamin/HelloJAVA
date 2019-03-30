package cuj.anything.redis.dict;

/**
 * @Auther: cujamin
 * @Date: 2019/3/11 15:47
 * @Description: 哈希表，每个字段有两个哈希表
 */
public class Dictht {
    private DictEntry[] table;

    private long size;
    private long sizemask;
    private long used;
}
