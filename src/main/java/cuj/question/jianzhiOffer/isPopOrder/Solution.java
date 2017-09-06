package cuj.question.jianzhiOffer.isPopOrder;

/**
 * Created by cujamin on 2017/9/4.
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。
 * 例如序列1,2,3,4,5是某栈的压入顺序，序列4，5,3,2,1是该压栈序列对应的一个弹出序列，
 * 但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
 */
public class Solution {
    public static void main(String[]args)
    {
        int[] pushA = {1,2,3,4,5};
        int[] popA = {4,3,5,1,2};
        System.out.println(IsPopOrder(pushA,popA));
    }
    public static boolean IsPopOrder(int [] pushA,int [] popA) {
        boolean result = true;
        int next = 0;
        int top = 0;
        int[] temp = new int[pushA.length];
        for(int i=0;i<popA.length;++i)
        {
            if(top==0)temp[top]=pushA[next++];
            while(next<pushA.length&&temp[top]!=popA[i]){
                ++top;
                ++next;
                if(next>=pushA.length)
                {
                    result = false;
                    break;
                }
                temp[top]=pushA[next];
            }
            --top;
        }
        return result;
    }
}
