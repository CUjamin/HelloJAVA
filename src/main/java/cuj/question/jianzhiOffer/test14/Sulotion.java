package cuj.question.jianzhiOffer.test14;

/**
 * Created by cujamin on 2017/6/19.
 * 输入一个链表，输出该链表中倒数第k个结点。
 */
public class Sulotion {
    public ListNode FindKthToTail(ListNode head,int k) {
        return getNode( head, k);
    }
    public ListNode getNode(ListNode node,int k)
    {
        ListNode tnode = node;
        while(true)
        {
            if(tnode.next!=null)
            {
                tnode = tnode.next;
            }
            else
            {

            }
        }
//        if(node.next==null)return null;
//        if(num( node, k)==0) return node;
//        else return null;
    }
    public int num(ListNode node,int k)
    {
        if(node.next==null)return 1;
        else
        {
            int num = num(node.next,k)+1;

            if(num == k)
            {
                return 0;
            }
            return num;
        }
    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

