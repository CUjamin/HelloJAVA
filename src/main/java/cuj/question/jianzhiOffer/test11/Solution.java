package cuj.question.jianzhiOffer.test11;

/**
 * Created by cujamin on 2017/6/19.
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 */
public class Solution {
    public int NumberOf1(int n) {
        int result= 0;
        if(n<0)
        {
            n = -1*n-1;
            while(n>0)
            {
                if(n%2!=0)result++;
                n=n>>1;
            }
            result = 32-result;
        }
        else
        {
            while(n>0)
            {
                if(n%2!=0)result++;
                n=n>>1;
            }
        }
        return result;
    }
}
