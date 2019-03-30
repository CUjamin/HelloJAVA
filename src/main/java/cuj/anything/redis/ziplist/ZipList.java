package cuj.anything.redis.ziplist;

import java.util.List;

/**
 * @Auther: cujamin
 * @Date: 2019/3/11 10:42
 * @Description: 使用连续内存块组成的顺序型数据结构
 */
public class ZipList {
    //ziplist header
    private int zlbytes;                //整个压缩列表占用的内存字节数
    private int zltail;                 //记录表尾距离列表起始位置的字节数
    private int zllen;                  //节点数量

    //entries
    private List<Object> entry;         //节点列表

    //end
    private int zlend;                  //标记压缩列表的末端

}
