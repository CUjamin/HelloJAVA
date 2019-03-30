package cuj.anything.redis;

/**
 * @Auther: cujamin
 * @Date: 2019/3/8 18:33
 * @Description:
 * 5.0:server.h
 * 3.2server.h
 */
public class RedisObject {
    public static final int OBJ_STRING=0;
    public static final int OBJ_LIST=1;
    public static final int OBJ_SET=2;
    public static final int OBJ_ZSET=3;
    public static final int OBJ_HASH=4;

    public static final int OBJ_ENCODING_INT=1;             //整数值               String（）
    public static final int OBJ_ENCODING_EMBSTR=8;          //EMBSTR编码的 SDS     String（<=39）
    public static final int OBJ_ENCODING_RAW=0;             //SDS                 String（>39）

    public static final int OBJ_ENCODING_ZIPLIST=5;
    public static final int OBJ_ENCODING_LINKEDLIST=4;

    public static final int OBJ_ENCODING_HT=2;              //

    public static final int OBJ_ENCODING_INTSET=6;

    public static final int OBJ_ENCODING_ZIPMAP=3;
    public static final int OBJ_ENCODING_SKIPLIST=7;


    public static final int OBJ_ENCODING_QUICKLIST=9;
    public static final int OBJ_ENCODING_STREAM=10;



    private int type=4;         //类型
    private int encoding=4;     //编码
    private int lru=24;
    private int refcount;
    private Object obj;         //指向具体的存储数据实例
}
