package cuj.question.jianzhiOffer.test9;

/**
 * Created by cujamin on 2017/5/25.
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class Solution {
    public int JumpFloorII(int target) {
        if(target==0)return 1;
        if(target==1)return 1;
        if(target==2)return 2;
        int[] temp = new int[target+1];
        temp[0]=1;
        temp[1]=1;
        temp[2]=2;
        for(int i = 3 ; i<=target ; ++i)
        {
            for(int j = 1;j<i;++j)
            {
                temp[i]+=temp[j];
            }
            temp[i]+=1;
        }
        return temp[target];
    }
}
