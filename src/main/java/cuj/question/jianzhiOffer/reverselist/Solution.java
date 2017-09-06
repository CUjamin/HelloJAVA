package cuj.question.jianzhiOffer.reverselist;

/**
 * Created by cujamin on 2017/9/4.
 *
 * 输入一个链表，反转链表后，输出链表的所有元素
 */
public class Solution {
    public ListNode ReverseList(ListNode head) {
        ListNode result  = new ListNode(0);
        while(null!=head)
        {
            ListNode temp = head;
            head = head.next;
            temp.next =result.next;
            result.next = temp;
        }
        return  result.next;
    }
}
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
