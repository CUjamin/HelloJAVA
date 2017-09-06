package cuj.question.jianzhiOffer.merge;

/**
 * Created by cujamin on 2017/9/4.
 *
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */
public class Solution {
    public static  ListNode Merge(ListNode list1,ListNode list2) {
        ListNode result = new ListNode(0);
        ListNode tail = result;
        while(null!=list1&&null!=list2)
        {
            ListNode temp = null;
            if(list1.val<list2.val)
            {
                temp = list1;
                list1 = list1.next;
            }else
            {
                temp = list2;
                list2 = list2.next;
            }
            tail.next = temp;
            tail = tail.next;
        }
        if(null!=list1){
            tail.next = list1;
        }
        else tail.next = list2;
        return  result.next;
    }

    public static void main(String[]args)
    {

        int[] nums1 = {1,3,5};
        int[] nums2 = {2,4,6};
        ListNode list1 = createNode(nums1);
        ListNode list2 = createNode(nums2);

        ListNode list = Merge(list1,list2);
        while(null!=list.next)
        {
            System.out.println(list.next.val);
            list = list.next;
        }

    }
    public static ListNode createNode(int[] nums) {
        ListNode list = new ListNode(0);
        ListNode tail = list;

        for (int num : nums) {
            ListNode temp = new ListNode(num);
            tail.next = temp;
            tail = tail.next;
        }
        return list;
    }

}
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}