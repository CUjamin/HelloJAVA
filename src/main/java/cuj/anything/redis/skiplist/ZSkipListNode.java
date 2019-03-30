package cuj.anything.redis.skiplist;

import java.util.List;

/**
 * @Auther: cujamin
 * @Date: 2019/3/7 17:09
 * @Description:
 * server.h
 */
public class ZSkipListNode {

    private String obj;
    //分数
    private double score;
    //backward
    private ZSkipListNode backward;
    //层
    private List<ZSkipListNodeLevel> nextNodeLevelList;

    public String getObj() {
        return obj;
    }

    public void setObj(String obj) {
        this.obj = obj;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public ZSkipListNode getBackward() {
        return backward;
    }

    public void setBackward(ZSkipListNode backward) {
        this.backward = backward;
    }

    public List<ZSkipListNodeLevel> getNextNodeLevelList() {
        return nextNodeLevelList;
    }

    public void setNextNodeLevelList(List<ZSkipListNodeLevel> nextNodeLevelList) {
        this.nextNodeLevelList = nextNodeLevelList;
    }
}
