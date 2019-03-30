package cuj.anything.redis.skiplist;

/**
 * @Auther: cujamin
 * @Date: 2019/3/7 18:05
 * @Description:
 */
public class ZSet {


    private ZSkiplist zSkiplist;


    private static final double ZSKIPLIST_P = 0.25;

    private static final int ZSKIPLIST_MAXLEVEL=32;

    public static int zslRandomLevel(){
        int level=1;
        while((int)(100*Math.random())<ZSKIPLIST_P*100){
            ++level;
        }
        return (level<ZSKIPLIST_MAXLEVEL) ? level : ZSKIPLIST_MAXLEVEL;
    }

}
