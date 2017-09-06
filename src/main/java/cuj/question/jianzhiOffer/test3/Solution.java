package cuj.question.jianzhiOffer.test3;

/**
 * Created by cujamin on 2017/5/24.
 * 输入一个链表，从尾到头打印链表每个节点的值。
 */

import java.util.ArrayList;
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}



public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if(listNode==null)return new ArrayList<Integer>();
        else
        {
            ArrayList<Integer> result = printListFromTailToHead(listNode.next);
            result.add(listNode.val);
            return result;
        }
    }
}
