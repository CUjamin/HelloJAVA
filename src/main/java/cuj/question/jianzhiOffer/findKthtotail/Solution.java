package cuj.question.jianzhiOffer.findKthtotail;

/**
 * Created by cujamin on 2017/6/19.
 * 输入一个链表，输出该链表中倒数第k个结点。
 */
public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        return getNode( head, k);
    }
    public ListNode getNode(ListNode node,int k) {
        ListNode result = null;
        if(null!=node&&k>0)
        {
            int i =0;
            ListNode nodeA = node;
            ListNode nodeB = node;
            boolean flag = true;
            while(i<k-1)
            {
                nodeA = nodeA.next;
                if(null==nodeA)flag = false;
                ++i;
            }
            if(flag)
            {
                while(null!=nodeA.next)
                {
                    nodeA = nodeA.next;
                    nodeB = nodeB.next;
                }
                result = nodeB;
            }
        }
        return result;
    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

