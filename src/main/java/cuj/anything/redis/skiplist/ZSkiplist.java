package cuj.anything.redis.skiplist;

/**
 * @Auther: cujamin
 * @Date: 2019/3/7 17:18
 * @Description:
 * server.h
 */
public class ZSkiplist {


    private ZSkipListNode header;
    private ZSkipListNode tail;
    private long length;
    private int level;







    public ZSkipListNode getHeader() {
        return header;
    }

    public void setHeader(ZSkipListNode header) {
        this.header = header;
    }

    public ZSkipListNode getTail() {
        return tail;
    }

    public void setTail(ZSkipListNode tail) {
        this.tail = tail;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
