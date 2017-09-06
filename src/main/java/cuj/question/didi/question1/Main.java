package cuj.question.didi.question1;

import java.util.Scanner;

/**
 * Created by cujamin on 2017/8/26.
 *
 * -23 17 -7 11 -2 1 -34
 */
public class Main {
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        String tempNum = in.nextLine();
        String[] numStrs = tempNum.split(" ");
        int[] nums = new int[numStrs.length];
        boolean start = false;
        for(int i = 0;i<numStrs.length;++i)
        {
            nums[i] = Integer.parseInt(numStrs[i]);
        }
        System.out.println(maxsum(nums));
    }
    public static int maxsum(int[] nums)
    {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;++i)
        {
            int tempMax = nums[i];
            int tempSum = nums[i];
            for(int j=i+1;j<nums.length;++j)
            {
                tempSum+=nums[j];
                if(tempSum>tempMax)
                {
                    tempMax = tempSum;
                }
            }
            if(tempMax>max)max =tempMax;
        }
        return max;
    }
}

