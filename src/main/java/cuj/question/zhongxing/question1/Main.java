package cuj.question.zhongxing.question1;

import java.util.Scanner;

/**
 * Created by cujamin on 2017/8/28.
 * 第一道(简述)：输入一个long型数，输出由该数中各数字组成的最小数字
 long minNumber(long num){

 }
 输入：760
 输出：607
 */
public class Main {
    public static void main(String[]args)
    {
        Scanner in =  new Scanner(System.in);
        String oldNumStr = in.nextLine();
        long oldNum = Long.parseLong(oldNumStr);
        int flag = 1;
        long result=0;
        if(oldNum>0)flag=1;
        else if(oldNum==0)flag=0;
        else
        {
            flag=-1;
            oldNum*=-1;
        }

        int n = (""+oldNum).split("").length;
        int[] oldNums = new int[n];
        for(int i=0;i<n;++i)
        {
            oldNums[i] = (int)oldNum%10;
            oldNum/=10;
        }
        int[] newNums = sort(oldNums);

        if(flag>0)
        {
            result = handleNumsA(newNums);
        }else
        {
            result = handldNumB(newNums);
        }
        System.out.println(flag*result);
    }
    public static long handleNumsA(int[]nums)
    {
        int result = 0;
        int j=0;
        while(nums[j]==0)j++;
        int temp = nums[j];
        nums[j]=nums[0];
        nums[0]=temp;
        for(int i=0;i<nums.length;++i)
        {
            result*=10;
            result+=nums[i];
        }
        return result;
    }
    public static long handldNumB(int[]nums)
    {
        long result = 0;
        for(int i=nums.length-1;i>=0;--i)
        {
            result*=10;
            result+=nums[i];
        }
        return result;
    }
    public static int[] sort(int[] nums)
    {
        int[] result = nums;
        for(int i=0;i<nums.length;++i)
        {
            for(int j = i+1;j<nums.length;++j)
            {
                if(result[i]>result[j])
                {
                    int temp = result[i];
                    result[i]=result[j];
                    result[j] =temp;
                }
            }
        }
        return result;
    }
}
