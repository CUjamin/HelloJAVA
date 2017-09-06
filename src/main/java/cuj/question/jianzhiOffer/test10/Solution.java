package cuj.question.jianzhiOffer.test10;

/**
 * Created by cujamin on 2017/5/25.
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，
 * 总共有多少种方法？
 */

public class Solution {
    public int RectCover(int target) {
        if(target==0)return 0;
        if(target==1)return 1;
        if(target==2)return 2;
        int[] temp = new int[target+1];
        temp[0]=1;
        temp[1]=1;
        temp[2]=2;
        for(int i=3;i<=target;++i)
        {
            temp[i]=temp[i-1]+temp[i-2];
        }
        return temp[target];
    }
}
