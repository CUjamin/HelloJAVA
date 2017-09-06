package cuj.question.jianzhiOffer.test7;

/**
 * Created by cujamin on 2017/5/25.
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。
 * n<=39
 */
public class Solution {
    public int Fibonacci(int n) {
        int[] temp = new int[40];
        temp[0]=1;
        temp[1]=1;
        for(int i = 2;i<=n;++i)
        {
            temp[i]=temp[i-1]+temp[i-2];
        }
        return temp[n];
    }
}
