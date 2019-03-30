package cuj.anything.redis.ziplist;

/**
 * @Auther: cujamin
 * @Date: 2019/3/11 14:01
 * @Description:
 */
public class ZLEntry {
    // 编码 prevramlen 所需要的字节大小
    private int prevrawlensize;

    // 前置节点长度
    private int prevrawlen;

    // 编码 len 所需的字节大小
    private int len;

    // 当前节点长度
    private int lensize;

    // 当前节点的 header 的大小 = prevrawlensize + lensize
    private int headersize;

    // 当前节点值所使用的编码类型
    private char encoding;

    // 指向当前节点的指针
    private char p;


}
