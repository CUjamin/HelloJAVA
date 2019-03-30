package cuj.anything.redis.skiplist;

/**
 * @Auther: cujamin
 * @Date: 2019/3/7 17:13
 * @Description:
 * server.h
 */
public class ZSkipListNodeLevel {
    //forward
    private ZSkipListNode forward;
    //跨度
    private int span;

    public ZSkipListNode getForward() {
        return forward;
    }

    public void setForward(ZSkipListNode forward) {
        this.forward = forward;
    }

    public int getSpan() {
        return span;
    }

    public void setSpan(int span) {
        this.span = span;
    }
}
